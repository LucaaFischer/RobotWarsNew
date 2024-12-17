package com.btcag.bootcamp.Classes.HibernateStuff.entities;

import jakarta.persistence.*;

@Entity
@Table(name ="players")
public class PlayerEntity {
    @Column(name = "UserID", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column (name = "Username", nullable = false)
    private String username;

    @Column (name = "Password", nullable = false)
    private String password;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
