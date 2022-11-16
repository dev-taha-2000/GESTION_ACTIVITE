package com.pdaProjet.Entitys;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="etat")
public class Etat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private long id;
    @Column(name="etat")
    private String etat;

    @OneToMany(cascade=CascadeType.ALL)
    private List<Activite> activites;
    @OneToMany(cascade=CascadeType.ALL)
    private List<Responsable> responsables;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Admin> admin;

    public Etat() {
        super();
    }

    public Etat(String etat, List<Activite> activites) {
        super();
        this.etat = etat;
        this.activites = activites;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public List<Activite> getactivites() {
        return activites;
    }

    public void setactivites(List<Activite> activites) {
        this.activites = activites;
    }

    @Override
    public String toString() {
        return "Etat [id=" + id + ", etat=" + etat + ", activites=" + activites + "]";
    }


}

