package dao;

import java.sql.SQLException;
import java.util.List;

public interface Dao<OBJ, PK> {

	public OBJ findById(PK id) throws ClassNotFoundException, SQLException;

	public List<OBJ> findAll() throws ClassNotFoundException, SQLException;

}
