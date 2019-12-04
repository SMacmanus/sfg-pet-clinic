package com.company.sfgpetclinic.controllers;

import com.company.sfgpetclinic.services.VetServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    private VetServiceInterface vetServiceInterface;

    @Autowired
    public VetController(VetServiceInterface vetServiceInterface) {
        this.vetServiceInterface = vetServiceInterface;
    }

    @RequestMapping({"/vets", "/vets/index", "/vets/index.html"})
    public String listVets(Model model) {

        model.addAttribute("vets", vetServiceInterface.findAll());

        return "vets/index";
    }
}
