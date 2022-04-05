package org.zutjmx.cliente.app.ws;

import org.zutjmx.webapp.jaxws.services.Curso;
import org.zutjmx.webapp.jaxws.services.ServicioWs;
import org.zutjmx.webapp.jaxws.services.ServicioWsImplService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ServicioWs servicioWs = new ServicioWsImplService().getServicioWsImplPort();
        System.out.println("Método saludar: " + servicioWs.saludar("Jesús Zúñiga Trejo"));
        Curso curso = new Curso();
        curso.setNombre("ReactJs desde las bases");
        Curso cursoRespuesta = servicioWs.crear(curso);
        System.out.println("Nuevo curso: " + cursoRespuesta.getNombre());

        List<Curso> cursos = servicioWs.listar();
        for (Curso c : cursos) {
            System.out.println(":: " + c.getNombre() + " ::");
        }
    }
}
