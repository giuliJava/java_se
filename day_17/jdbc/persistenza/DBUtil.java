package day_17.jdbc.persistenza;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtil {
	private DBUtil() {

	}

	public static void close(ResultSet rs) {
		try {
			if (rs != null) {
				rs.close();
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void close(PreparedStatement statement) {
		try {
			if (statement != null) {
				statement.close();
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void close(Connection connection) {
		try {
			if (connection != null) {
				connection.close();
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
