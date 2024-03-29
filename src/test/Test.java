package test;

import java.sql.SQLException;
import java.util.ArrayList;

import dao.Dao;

import dao.daoArticle.DaoArticlesMySql;
import dao.daoClient.DaoClientsMySql;
import dao.daoCommmande.DaoCommandesMySql;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		System.out.println("Tout va bien !!!!!!!!!!!!!");

		// testCommandeMySql();
		testArticleMySql();
		// testClientMySql();
	}

	public static void testArticleMySql() throws ClassNotFoundException, SQLException {
		DaoArticlesMySql d1 = new DaoArticlesMySql();
		testFindAllArticle(d1);
	};

	static void testFindAllArticle(Dao d) throws ClassNotFoundException, SQLException {

		System.out.println(d.findById(3));

	}

	public static void testClientMySql() throws ClassNotFoundException, SQLException {
		DaoClientsMySql ds = new DaoClientsMySql();
		testFindALlCllientMySql(ds);
	}

	static void testFindALlCllientMySql(Dao dc) throws ClassNotFoundException, SQLException {

		System.out.println(dc.findAll());
	}

	public static void testCommandeMySql() throws ClassNotFoundException, SQLException {
		DaoCommandesMySql ds = new DaoCommandesMySql();
		testFindALlCommandeMySql(ds);
	}

	static void testFindALlCommandeMySql(Dao dc) throws ClassNotFoundException, SQLException {

		System.out.println(dc.findAll());
	}

}
