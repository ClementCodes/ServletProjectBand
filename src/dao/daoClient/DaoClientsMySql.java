package dao.daoClient;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Adresse;
import model.Client;
import model.ImplementClient;
import model.Instructions;
import model.Telephone;

public class DaoClientsMySql implements DaoClients {

	public List<Client> findAll() throws ClassNotFoundException, SQLException {
		List<Client> listeClients = new ArrayList<Client>();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant-cgi", "root", "28121987");
		String sql = "select * from client";

		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);

		while (rs.next()) {
			ImplementClient icl = new ImplementClient(0, sql, sql, sql, null, null, null);
			icl.setIdClient(rs.getInt("idclient"));
			icl.setPassword(rs.getString("password"));
			icl.setName(rs.getString("name"));
			icl.setName(rs.getString("fname"));
			icl.setTelephone(new Telephone(rs.getString("phone")));
			icl.setAdresse(new Adresse(rs.getString("adress")));
			icl.setInstructions(new Instructions(rs.getString("instruction")));

			listeClients.add(icl);

		}

		conn.close();
		return listeClients;

	}

	@Override
	public Client findById(Integer id) {
		Client c = null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant-cgi", "root", "28121987");
		String sql = "select * from client where idclient=" + id;
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);
		if (rs.next())

			c = new ImplementClient(rs.getInt("int"), rs.getString("password"),
					rs.getString("name"),
					rs.getString("fname"),
					rs.(new Client( getString("phone")),
					rs.getString("adress"),
					rs.getString("instruction"));

		conn.close();
		return c;
	}

}
