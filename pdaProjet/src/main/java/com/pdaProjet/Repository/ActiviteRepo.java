package com.pdaProjet.Repository;

import com.pdaProjet.Dao.ActiviteDao;
import com.pdaProjet.Entitys.Activite;

public class ActiviteRepo {
    private ActiviteDao activiteDao = new ActiviteDao();

    public Activite add(Activite activite){
        return activiteDao.insertEntity(activite);
    }


}
