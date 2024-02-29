package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.BreadcrumbItem;

@Controller
@RequestMapping("/grupo21/despliegue")
public class despliegueController {

    @GetMapping("")
    public String paginaDespliegue(Model model){
        setBreadcrumbs(model,"Despliegue");
        return "despliegue";
    }

    private void setBreadcrumbs(Model model, String currentPage){
        List<BreadcrumbItem> breadcrumbs = new ArrayList<>();
        breadcrumbs.add(new BreadcrumbItem("Inicio", "/"));
        breadcrumbs.add(new BreadcrumbItem(currentPage, null)); // La página actual no tiene enlace

        model.addAttribute("breadcrumbs", breadcrumbs);
    }

}