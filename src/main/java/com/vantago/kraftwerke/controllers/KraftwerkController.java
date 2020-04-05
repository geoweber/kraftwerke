package com.vantago.kraftwerke.controllers;

import com.vantago.kraftwerke.model.Kraftwerk;
import com.vantago.kraftwerke.service.KraftwerkService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


@Controller
public class KraftwerkController {

    private final KraftwerkService kraftwerkService;

    public KraftwerkController(final KraftwerkService kraftwerkService) {
        this.kraftwerkService = kraftwerkService;
    }

    /**
     * list of kraftwerke
     *
     * @param model - a holder for model attributes.
     * @return outcome
     */
    @GetMapping("/kraftwerk")
    public String kraftwerk(Model model) {
        List<Kraftwerk> kraftwerke = kraftwerkService.findAll();
        model.addAttribute("kraftwerke", kraftwerke);
        return "kraftwerke";
    }


    /**
     * detailed view for selected cart
     *
     * @param id    - id of cart
     * @param model -a holder for model attributes.
     * @return outcome
     */
    @GetMapping("/kraftwerk/{id}")
    public String raftwerkById(@PathVariable Long id, Model model) throws ObjectNotFoundException {
        Kraftwerk object = kraftwerkService.findById(id).orElseThrow(() -> new ObjectNotFoundException("Kraftwerk [id" + id + "] not found"));

        object.setGesamtleistung(kraftwerkService.getGesamtleistungById(id));

        model.addAttribute("kraftwerk", object);
        return "kraftwerk";
    }

}
