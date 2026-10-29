package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Agence;
import java.util.List;

public interface IAgenceService {
    List<Agence> retrieveAllAgence();
    Agence retrieveAgence(Long agenceId);
    Agence addAgence(Agence agence);
    void removeAgence(Long agenceId);
    Agence modifyAgence(Agence agence);
}