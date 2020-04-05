package com.vantago.kraftwerke.controllers;

import com.vantago.kraftwerke.model.Hersteller;
import com.vantago.kraftwerke.service.HerstellerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HerstellerController {


    private final HerstellerService herstellerService;


    public HerstellerController(final HerstellerService herstellerService) {
        this.herstellerService = herstellerService;
    }


    /**
     * List of herstellers
     *
     * @param model - a holder for model attributes.
     * @return outcome
     */
    @GetMapping("/hersteller")
    public String hersteller(Model model) {
        List<Hersteller> herstellers = herstellerService.findAll();
        model.addAttribute("herstellers", herstellers);
        return "herstellers";
    }

}
