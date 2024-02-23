package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.BreadcrumbItem;

import org.springframework.web.bind.annotation.GetMapping;



@Controller
@RequestMapping("/grupo-2-1")
public class HomeController {

    @GetMapping("/")
    public String paginaDescripcion2(Model model) {
        setBreadcrumbs(model,"Inicio");
        return "index";
    }
   /* 
    @GetMapping("/descripcion")
    public String paginaDescripcion(Model model) {
        setBreadcrumbs(model,"Descripción");
        return "descripcion";
    }*/
    /*@GetMapping("/grupo-2-1")
    public String index() {
        return "index"; // Devuelve el nombre de la plantilla HTML que se cargará
    }*/

    /*@GetMapping("/descripcion")
    public String descripcion() {
        return "descripcion"; // Devuelve el nombre de la plantilla HTML que se cargará
    }*/
    
    private void setBreadcrumbs(Model model, String currentPage){
        List<BreadcrumbItem> breadcrumbs = new ArrayList<>();
        breadcrumbs.add(new BreadcrumbItem("Inicio", "/"));
        breadcrumbs.add(new BreadcrumbItem(currentPage, null)); // La página actual no tiene enlace

        model.addAttribute("breadcrumbs", breadcrumbs);
    }
}
