package dao;

import java.util.List;

import model.Client;
import model.Commande;

public interface DaoCommandes extends Dao<Commande> {

	public List<Commande> findByClient(Client client);
	
}
