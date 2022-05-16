package dao.daoCommmande;

import java.util.List;

import dao.Dao;
import model.Client;
import model.Commande;

public interface DaoCommandes extends Dao<Commande> {

	public List<Commande> findByClient(Client client);

	public void create(Commande commande);
}
