import com.pdaProjet.Dao.ActiviteDao;
import com.pdaProjet.Entitys.Activite;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ActiviteDao activiteDao = new ActiviteDao();
        Activite activite = new Activite();
        activite.setDate_debut(new Date());
        activite.setDate_defin(new Date());
        activite.setDescription("khalil o maygaad");
        activiteDao.insertEntity(activite);

    }
}
