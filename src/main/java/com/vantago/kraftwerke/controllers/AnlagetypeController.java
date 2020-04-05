package com.vantago.kraftwerke.controllers;

import com.vantago.kraftwerke.model.Anlagetype;
import com.vantago.kraftwerke.service.AnlagetypeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AnlagetypeController {


    private final AnlagetypeService anlagetypeService;


    public AnlagetypeController(final AnlagetypeService anlagetypeService) {
        this.anlagetypeService = anlagetypeService;
    }


    /**
     * List of anlagen
     *
     * @param model - a holder for model attributes.
     * @return outcome
     */
    @GetMapping("/anlagetype")
    public String anlage(Model model) {
        List<Anlagetype> anlagetypen = anlagetypeService.findAll();
        model.addAttribute("anlagetypen", anlagetypen);
        return "anlagetypen";
    }

}
