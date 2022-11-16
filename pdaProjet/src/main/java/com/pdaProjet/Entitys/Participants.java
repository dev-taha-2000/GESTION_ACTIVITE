package com.pdaProjet.Entitys;

import jakarta.persistence.*;

@Entity
@Table(name="participant")
public class Participants {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int id;
    private String domaine;
    private String structure;
    public String getDomaine() {
        return domaine;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="fk_activité")
    private Activite activité;
    public Participants(String domaine, String structure) {
        super();
        this.domaine = domaine;
        this.structure = structure;

    }


    public Participants() {
        super();
    }

    public void setDomaine(String domaine) {
        this.domaine = domaine;
    }
    public String getStructure() {
        return structure;
    }
    public void setStructure(String structure) {
        this.structure = structure;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
