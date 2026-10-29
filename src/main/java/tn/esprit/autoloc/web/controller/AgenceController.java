package tn.esprit.autoloc.web.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Agence;
import tn.esprit.autoloc.service.IAgenceService;

import java.util.List;

@RestController
@RequestMapping("/api/agences")
@AllArgsConstructor
public class AgenceController {

    private final IAgenceService agenceService;

    @GetMapping
    public List<Agence> getAllAgences() {
        return agenceService.retrieveAllAgence();
    }

    @GetMapping("/{id}")
    public Agence getAgenceById(@PathVariable Long id) {
        return agenceService.retrieveAgence(id);
    }

    @PostMapping
    public Agence createAgence(@RequestBody Agence agence) {
        return agenceService.addAgence(agence);
    }

    @PutMapping("/{id}")
    public Agence updateAgence(@PathVariable Long id, @RequestBody Agence agence) {
        agence.setIdAgence(id);
        return agenceService.modifyAgence(agence);
    }

    @DeleteMapping("/{id}")
    public void deleteAgence(@PathVariable Long id) {
        agenceService.removeAgence(id);
    }
}