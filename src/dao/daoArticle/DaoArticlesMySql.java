package dao.daoArticle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Article;
import model.ImplementArticle;

public class DaoArticlesMySql implements DaoArticles {

    @Override
    public List<Article> findAll() throws ClassNotFoundException, SQLException {
        List<Article> liste = new ArrayList<Article>();
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant-cgi", "root", "28121987");
        String sql = "select * from article";

        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            ImplementArticle ia = new ImplementArticle();
            ia.setIdArticle(rs.getInt("idarticle"));
            ia.setDescription(rs.getString("descriptions"));
            ia.setPrix(rs.getInt("prix"));
            ia.setCategorie(rs.getString("categorie"));
            liste.add(ia);

        }

        conn.close();
        return liste;
    }

    @Override
    public Article findById(Integer id) throws ClassNotFoundException, SQLException {
        Article a = null;
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant-cgi", "root", "28121987");
        String sql = "select * from article where idarticle=" + id;
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        if (rs.next())

            a = new ImplementArticle(rs.getInt("idarticle"), rs.getString("descriptions"), rs.getString("categorie"),
                    rs.getInt("prix"));

        conn.close();
        return a;
    }

}
