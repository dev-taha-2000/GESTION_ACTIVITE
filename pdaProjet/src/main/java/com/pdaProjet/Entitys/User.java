package com.pdaProjet.Entitys;

import jakarta.persistence.*;

@Entity
@Table(name="user")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_user")
    private long id_user;
    @Column(name="name")
    private String name;
    @Column(name="email")
    private String email;
    @Column(name="password")
    private String password;
    @Column(name="telephone")
    private String telephone;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "id_role",unique = false, referencedColumnName = "id_role")
    private Role role ;



    public User() {
        super();
    }


    public User(String name, String email, String password, String telephone) {
        super();

        this.name = name;
        this.email = email;
        this.password = password;
        this.telephone = telephone;

    }


    public long getId_user() {
        return id_user;
    }


    public void setId_user(long id_user) {
        this.id_user = id_user;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }


    public String getTelephone() {
        return telephone;
    }


    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }


    public Role getRole() {
        return role;
    }


    public void setRole(Role role) {
        this.role = role;
    }


    @Override
    public String toString() {
        return "User [id_user=" + id_user + ", name=" + name + ", email=" + email + ", password=" + password
                + ", telephone=" + telephone + ", role=" + role + "]";
    }

}
