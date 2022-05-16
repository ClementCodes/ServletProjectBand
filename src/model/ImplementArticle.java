package model;

public class ImplementArticle {

    private int idArticle;
    private String article;
    private String description;
    private int prix;

    public ImplementArticle(int idArticle, String article, String description, int prix) {
        this.idArticle = idArticle;
        this.article = article;
        this.description = description;
        this.prix = prix;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

 

    


    

}

