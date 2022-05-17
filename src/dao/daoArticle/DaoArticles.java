package dao.daoArticle;

import java.sql.SQLException;
import java.util.List;

import dao.Dao;
import model.Article;

public interface DaoArticles extends Dao<Article, Integer> {

    @Override
    default List<Article> findAll() throws ClassNotFoundException, SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    default Article findById(Integer id) throws ClassNotFoundException, SQLException {
        // TODO Auto-generated method stub
        return null;
    }

}
