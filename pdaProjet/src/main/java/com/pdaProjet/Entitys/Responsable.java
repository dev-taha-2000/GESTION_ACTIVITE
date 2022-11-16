package com.pdaProjet.Entitys;

import jakarta.persistence.*;

@Entity
@Table(name="responsable")
public class Responsable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private long id;
    @Column(name="domaine")
    private String domaine;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="fk_type")
    private Type type;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="fk_etat")
    private Etat etat;

    public Responsable() {
        super();
    }

    public Responsable(long id, String domaine, Type type) {
        super();
        this.id = id;
        this.domaine = domaine;
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDomaine() {
        return domaine;
    }

    public void setDomaine(String domaine) {
        this.domaine = domaine;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Responsable [id=" + id + ", domaine=" + domaine + ", type=" + type + "]";
    }


}
