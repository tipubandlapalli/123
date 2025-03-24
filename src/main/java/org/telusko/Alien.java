package org.telusko;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Alien {
    @Id
    private int aid;
    private String alien_name;
    private String tech;

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", alien_name='" + alien_name + '\'' +
                ", tech='" + tech + '\'' +
                '}';
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAlien_name() {
        return alien_name;
    }

    public void setAlien_name(String alien_name) {
        this.alien_name = alien_name;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }



}
