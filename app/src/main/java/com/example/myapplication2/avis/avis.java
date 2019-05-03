package com.example.myapplication2.avis;

public class avis {

    private String mail;
    private Double stars;
    private String desc;
    private String title;

    public avis(String mail, Double stars, String desc, String title) {
        this.mail = mail;
        this.stars = stars;
        this.desc = desc;
        this.title = title;
    }

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
