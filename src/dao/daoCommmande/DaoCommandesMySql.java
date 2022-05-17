package dao.daoCommmande;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Client;
import model.Commande;
import model.ImplementArticle;
import model.ImplementCommande;

public class DaoCommandesMySql implements DaoCommandes {

    @Override
    public List<Commande> findAll() throws ClassNotFoundException, SQLException {
        List<Commande> listeCommande = new ArrayList<Commande>();
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant-cgi", "root", "28121987");
        String sql = "select * from commandes";

        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql);

        while (rs.next()) {
            ImplementCommande icm = new ImplementCommande();
            icm.setIdClient(rs.getInt("idclient"));
            icm.setIdCommande(rs.getInt("idcommande"));
            icm.setTotal(rs.getInt("total"));
            icm.setInfo(rs.getString("info"));

            listeCommande.add(icm);

        }

        conn.close();
        return listeCommande;
    }

    @Override
    public Commande findById(Integer id) throws ClassNotFoundException, SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Commande> findByClient(Client client) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void create(Commande commande) {
        // TODO Auto-generated method stub

    }

}
