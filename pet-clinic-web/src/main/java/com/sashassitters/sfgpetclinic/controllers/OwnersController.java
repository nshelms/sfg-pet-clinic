package com.sashassitters.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping({"/owners"})
@Controller
public class OwnersController {

    @RequestMapping({"", "/"})
    public String index() {
        return "owners/index";
    }
}
