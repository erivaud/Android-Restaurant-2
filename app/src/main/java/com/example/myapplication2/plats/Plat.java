package com.example.myapplication2.plats;

import java.io.Serializable;

public class Plat implements Serializable {

    private String imageUrl;
    private String label;
    private String description;
    private Double prix;


    public Plat(String imgUrl, String label, String description, Double prix) {
        this.imageUrl = imgUrl;
        this.label = label;
        this.description = description;
        this.prix = prix;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImgUrl() {
        return imageUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imageUrl = imgUrl;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }
}
