package com.controller;

import areaTrabajo.wsdl.AreaTrabajoResponse;
import com.cliente.AreaTrabajoCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;

/**
 * Created by Angel Luis on 13/05/2015.
 */
@Controller
public class Controlador {

    @Autowired
    private AreaTrabajoCliente areaTrabajoCliente;

    @RequestMapping("/index")
    public ModelAndView index() {

        AreaTrabajoResponse response = areaTrabajoCliente.getAreaTrabajo(1);
        System.out.println("----------------" + response.getAreaTrabajo().getNombre());
        return new ModelAndView("index");
    }
}
