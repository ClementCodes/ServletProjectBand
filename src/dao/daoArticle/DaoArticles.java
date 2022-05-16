package dao.daoArticle;

import java.util.List;

import dao.Dao;
import model.Article;

public interface DaoArticles extends Dao<Article> {

    @Override
    default List<Article> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    default Article findById(Article obj_id) {
        // TODO Auto-generated method stub
        return null;
    }

}
