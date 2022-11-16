package com.pdaProjet.Entitys;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="status")
public class Status {
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    @Column(name="id")
    private long id;
    @Column(name="status")
    private String status;

    @OneToMany(cascade=CascadeType.ALL)
    private List<Exercices> exercices;

    public Status() {
        super();
    }

    public Status(long id, String status, List<Exercices> exercices) {
        super();
        this.id = id;
        this.status = status;
        this.exercices = exercices;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Exercices> getExercices() {
        return exercices;
    }

    public void setExercices(List<Exercices> exercices) {
        this.exercices = exercices;
    }

    @Override
    public String toString() {
        return "Status [id=" + id + ", status=" + status + ", exercices=" + exercices + "]";
    }



}
