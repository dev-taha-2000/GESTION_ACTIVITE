package com.pdaProjet.Entitys;

import jakarta.persistence.*;

@Entity
@Table(name="exircices")
public class Exercices {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int id;
    @Column(name="annee")
    private String annee;
    @Column(name="date_debut")
    private String date_debut;
    @Column(name="date_fin")
    private String date_fin;

    @ManyToOne(cascade =CascadeType.ALL)
    @JoinColumn(name="fk_statu")
    private Status status;

    public Exercices(String annee, String date_debut, String date_fin) {
        super();
        this.annee = annee;
        this.date_debut = date_debut;
        this.date_fin = date_fin;
    }

    public Exercices() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAnnee() {
        return annee;
    }
    public void setAnnee(String annee) {
        this.annee = annee;
    }
    public String getDate_debut() {
        return date_debut;
    }
    public void setDate_debut(String date_debut) {
        this.date_debut = date_debut;
    }
    public String getDate_fin() {
        return date_fin;
    }
    public void setDate_fin(String date_fin) {
        this.date_fin = date_fin;
    }
}
