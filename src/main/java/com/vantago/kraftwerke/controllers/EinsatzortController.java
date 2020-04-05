package com.vantago.kraftwerke.controllers;

import com.vantago.kraftwerke.model.Einsatzort;
import com.vantago.kraftwerke.service.EinsatzortService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class EinsatzortController {


    private final EinsatzortService einsatzortService;


    public EinsatzortController(final EinsatzortService einsatzortService) {
        this.einsatzortService = einsatzortService;
    }


    /**
     * List of herstellers
     *
     * @param model - a holder for model attributes.
     * @return outcome
     */
    @GetMapping("/einsatzort")
    public String einsatzort(Model model) {
        List<Einsatzort> einsatzorte = einsatzortService.findAll();
        model.addAttribute("einsatzorte", einsatzorte);
        return "einsatzorte";
    }

}
