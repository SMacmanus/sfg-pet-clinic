package com.company.sfgpetclinic.controllers;

import com.company.sfgpetclinic.services.OwnerServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerController {

    private final OwnerServiceInterface ownerServiceInterface;

    @Autowired
    public OwnerController(OwnerServiceInterface ownerServiceInterface) {
        this.ownerServiceInterface = ownerServiceInterface;
    }

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listOwners(Model model) {

        model.addAttribute("owners", ownerServiceInterface.findAll());
        return "owners/index";
    }
}
