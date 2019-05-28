package com.example.myapplication2.avis;

public class Avis {



    private String id;
    private String mail;
    private Double stars;
    private String desc;
    private String title;

    public Avis() {}

    public Avis(String id, String mail, Double stars, String desc, String title) {
        this.id = id;
        this.mail = mail;
        this.stars = stars;
        this.desc = desc;
        this.title = title;
    }

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Double getStars() {
        return stars;
    }

    public void setStars(Double stars) {
        this.stars = stars;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}


