package com.sashassitters.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping({"/vets"})
@Controller
public class VetsController {

    @RequestMapping({"","/"})
    public String index() {
        return "vets/index";
    }
}
