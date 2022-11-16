package com.pdaProjet.Entitys;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="type")
public class Type {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    private long id;
    @Column(name="formateur")
    private String formateur;
    @Column(name="intervenant")
    private String intervenant;

    @OneToMany(cascade=CascadeType.ALL)
    private List<Responsable> responsables;

    public Type() {
        super();
    }

    public Type(long id, String formateur, String intervenant, List<Responsable> responsables) {
        super();
        this.id = id;
        this.formateur = formateur;
        this.intervenant = intervenant;
        this.responsables = responsables;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFormateur() {
        return formateur;
    }

    public void setFormateur(String formateur) {
        this.formateur = formateur;
    }

    public String getIntervenant() {
        return intervenant;
    }

    public void setIntervenant(String intervenant) {
        this.intervenant = intervenant;
    }

    public List<Responsable> getResponsables() {
        return responsables;
    }

    public void setResponsables(List<Responsable> responsables) {
        this.responsables = responsables;
    }

    @Override
    public String toString() {
        return "Type [id=" + id + ", formateur=" + formateur + ", intervenant=" + intervenant + ", responsables="
                + responsables + "]";
    }



}
