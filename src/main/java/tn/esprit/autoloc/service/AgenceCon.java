package tn.esprit.autoloc.service;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.autoloc.domain.Agence;

@RestController
        @AllArgsConstructor
        public class AgenceCon {

            IAgenceService ig;
    @PostMapping("ajouteragence")

    Agence apiajouagence (@RequestBody Agence agence){
            return ig.addAgence(agence);

            }
        }


