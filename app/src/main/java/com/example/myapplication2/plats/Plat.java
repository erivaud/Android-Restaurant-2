package com.example.myapplication2.plats;

public class Plat {

    private String imageUrl;
    private String label;
    private Double prix;


    public Plat(String imgUrl, String label, Double prix) {
        this.imageUrl = imgUrl;
        this.label = label;
        this.prix = prix;
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
