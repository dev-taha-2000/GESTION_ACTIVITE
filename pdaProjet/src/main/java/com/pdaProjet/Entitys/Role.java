package com.pdaProjet.Entitys;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_role")
    private int id_role;
    @Column(name="name")
    private String name;


    /*@OneToMany(cascade=CascadeType.REMOVE, fetch = FetchType.LAZY)
    private List<User> users;
    */
    public Role() {
        super();
    }


    public Role(int id_role, String role, List<User> users) {
        super();
        this.id_role = id_role;
        this.name = role;
       // this.users = users;
    }


    public int getId_role() {
        return id_role;
    }

    public void setId_role(int id_role) {
        this.id_role = id_role;
    }

    public String getName() {
        return name;
    }

    public void setName(String role) {
        this.name = role;
    }


    @Override
    public String toString() {
        return "Role{" +
                "id_role=" + id_role +
                ", role='" + name + '\'' +
                '}';
    }
}
