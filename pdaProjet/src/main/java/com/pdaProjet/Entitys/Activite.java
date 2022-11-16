package com.pdaProjet.Entitys;
import jakarta.persistence.CascadeType;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;
@Entity

@Table(name="activite")

public class Activite {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name="titre")
    private String titre;
    @Column(name="description")
    private String description;
    @Column(name="date_debut")
    private Date date_debut;
    @Column(name=" date_defin")
    private Date date_defin;

    @OneToMany(cascade=CascadeType.ALL)
    private List<Participants> participants;
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="fk_etat")
    private Etat etat;

    public Activite(String titre, String description, Date date_debut, Date date_defin) {
        super();
        this.titre = titre;
        this.description = description;
        this.date_debut = date_debut;
        this.date_defin = date_defin;
    }



    public Activite() {
        super();
    }


    public String getTitre() {
        return titre;
    }
    public void setTitre(String titre) {
        this.titre = titre;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Date getDate_debut() {
        return date_debut;
    }
    public void setDate_debut(Date date_debut) {
        this.date_debut = date_debut;
    }
    public Date getDate_defin() {
        return date_defin;
    }

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public void setDate_defin(Date date_defin) {
        this.date_defin = date_defin;
    }

    public List<Participants> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Participants> participants) {
        this.participants = participants;
    }

    public Etat getEtat() {
        return etat;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }

    @Override
    public String toString() {
        return "Activite{" +
                ", titre='" + titre + '\'' +
                ", description='" + description + '\'' +
                ", date_debut='" + date_debut + '\'' +
                ", date_defin='" + date_defin + '\'' +
                ", etat=" + etat.getId() +
                '}';
    }
}
