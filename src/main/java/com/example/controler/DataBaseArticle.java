package com.example.controler;

import com.example.model.Article;

import java.util.Date;

public class DataBaseArticle {

    private static Article art1 = new Article(11, new Date(), "Wybory samorządowe 2018", "lorem", "http://example.com/", DataBaseCategory.politics);
    private static Article biegi = new Article(12, new Date(), "Bieg gorski w Międzygórzu", "lorem", "http://example.com/", DataBaseCategory.sport);
    private static Article krokiety = new Article(13, new Date(), "Krokiety siostry Anieli", "lorem", "http://example.com/", DataBaseCategory.cooking);
    private static Article remont = new Article(14, new Date(), "Remont kuchni", "lorem", "http://example.com/", DataBaseCategory.home);
    private static Article badania = new Article(15, new Date(), "Szczepienia na grypę", "lorem", "http://example.com/", DataBaseCategory.health);
    private static Article kajak = new Article(16, new Date(), "Spływy kajakowe", "lorem", "http://example.com/", DataBaseCategory.sport);

    private static Article[] articles = new Article[]{
            art1,
            badania,
            biegi,
            kajak,
            krokiety,
            remont,
    };

public static Article[] getAllArticles(){return articles;}

public static Article getArticleById(int id) {
    for (Article article : articles) {
        if (article.getId() == id) {
            return article;
        }
    }
    return null;
}

}
