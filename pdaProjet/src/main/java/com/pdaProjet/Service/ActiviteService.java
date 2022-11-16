package com.pdaProjet.Service;

import com.pdaProjet.Entitys.Activite;
import com.pdaProjet.Repository.ActiviteRepo;

public class ActiviteService {
    private ActiviteRepo activiteRepo = new ActiviteRepo();

    public Activite addActivite(Activite activite){
        return activiteRepo.add(activite);
    }

}
