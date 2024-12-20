package com.btcag.bootcamp.Classes.HibernateStuff.entities;

import jakarta.persistence.*;

@Entity
@Table
public class RobotEntity {
    @Column(name = "RobotID", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long robotID;

    @Column(name = "HP")
    private int hp;

    @Column(name = "AD")
    private int ad;

    @Column(name = "Range")
    private int range;

    @Column(name = "Movement")
    private int movement;


    public long getRobotID() {
        return robotID;
    }

    public void setRobotID(long robotID) {
        this.robotID = robotID;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAd() {
        return ad;
    }

    public void setAd(int ad) {
        this.ad = ad;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getMovement() {
        return movement;
    }

    public void setMovement(int movement) {
        this.movement = movement;
    }
}
