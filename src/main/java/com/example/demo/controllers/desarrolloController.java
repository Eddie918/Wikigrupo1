package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.BreadcrumbItem;

@Controller
@RequestMapping("/grupo21/desarrollo")
public class desarrolloController {

    @GetMapping("")
    public String paginaDesarrollo(Model model){
        setBreadcrumbs(model,"Desarrollo");
        return "desarrollo";
    }

    private void setBreadcrumbs(Model model, String currentPage){
        List<BreadcrumbItem> breadcrumbs = new ArrayList<>();
        breadcrumbs.add(new BreadcrumbItem("Inicio", "/"));
        breadcrumbs.add(new BreadcrumbItem(currentPage, null)); // La página actual no tiene enlace

        model.addAttribute("breadcrumbs", breadcrumbs);
    }

}