package com.vantago.kraftwerke.controllers;

import com.vantago.kraftwerke.model.Anlage;
import com.vantago.kraftwerke.service.AnlageService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class AnlageController {

    private final AnlageService anlageService;


    public AnlageController(final AnlageService anlageService) {
        this.anlageService = anlageService;
    }


    /**
     * List of anlagen
     *
     * @param model - a holder for model attributes.
     * @return outcome
     */
    @GetMapping("/anlage")
    public String anlage(Model model) {
        List<Anlage> anlagen = anlageService.findAll();
        model.addAttribute("anlagen", anlagen);
        return "anlagen";
    }

    /**
     * detailed view for selected Anlage
     *
     * @param id    - id of cart
     * @param model -a holder for model attributes.
     * @return outcome
     */
    @GetMapping("/anlage/{id}")
    public String anlageById(@PathVariable Long id, Model model) throws ObjectNotFoundException {
        Anlage object = anlageService.findById(id).orElseThrow(() -> new ObjectNotFoundException("Anlage [id" + id + "] not found"));
        model.addAttribute("anlage", object);
        return "anlage";
    }
}
