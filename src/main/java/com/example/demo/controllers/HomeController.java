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
@RequestMapping("/")
public class HomeController {
    @GetMapping("descripcion")
    public String paginaDescripcion(Model model) {
        setBreadcrumbs(model,"Descripción");
        return "descripcion";
    }
    
    private void setBreadcrumbs(Model model, String currentPage){
        List<BreadcrumbItem> breadcrumbs = new ArrayList<>();
        breadcrumbs.add(new BreadcrumbItem("Inicio", "/"));
        breadcrumbs.add(new BreadcrumbItem(currentPage, null)); // La página actual no tiene enlace
        
        model.addAttribute("breadcrumbs", breadcrumbs);
    }
}
