package org.garapata.angas.tools.core.database.connection;

import java.sql.Connection;

public interface GenericConnectionFactory {
	Connection getConnectionFromContext();	
	void initDataSource(String configPath);
	void initPooledDataSource(String configPath);

}
