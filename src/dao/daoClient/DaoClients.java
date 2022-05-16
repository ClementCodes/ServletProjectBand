package dao.daoClient;

import dao.Dao;
import model.Client;

public interface DaoClients extends Dao<Client> {

	public void create(Client client);

}
