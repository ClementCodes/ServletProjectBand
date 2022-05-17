package dao.daoClient;

import java.sql.SQLException;
import java.util.List;

import dao.Dao;

public interface DaoClients extends Dao {

	@Override
	default List findAll() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	default Object findById(Object id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
