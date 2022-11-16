package com.pdaProjet.Entitys;

import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Column;
@Entity
@Table(name="admin")
public class Admin {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column
    private long id;
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="fk_etat")
    private Etat etat;




}
