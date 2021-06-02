package com.myproject.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Optional;

public class DBUtil {
	public static Connection getConnection() throws ClassNotFoundException, SQLException {

		Class.forName("oracle.jdbc.driverOracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "username", "password");

		return connection;
	}

	public static void closeConnection(Connection con) throws SQLException {
		Optional<Connection> optionalConnection = Optional.ofNullable(con);
		if (optionalConnection.isPresent()) {
			optionalConnection.get().close();
		}
	}
}
