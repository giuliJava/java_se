package day_17.jdbc.persistenza.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.time.format.DateTimeFormatter;

import day_17.jdbc.modello.Persona;
import day_17.jdbc.persistenza.DAOException;
import day_17.jdbc.persistenza.DBUtil;
import day_17.jdbc.persistenza.DataSource;
import day_17.jdbc.persistenza.PersonaDAO;
import java.sql.*;

public class PersonaDAOImpl implements PersonaDAO {
	// oggetto formattatore di date
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY-MM-DD HH:mm:ss");

	@Override
	public void save(Persona persona) throws DAOException {
		String SQL = "INSERT INTO Persona (CF, nome, cognome, data_nascita) VALUES (?, ?, ?, ?)";
		System.out.println(SQL);
		Connection connection = null;
		PreparedStatement statement = null;
		try {
			connection = DataSource.getConnection();
			statement = connection.prepareStatement(SQL, new String[] { "id" });
			statement.setString(1, persona.getCF());
			statement.setString(2, persona.getNome());
			statement.setString(3, persona.getCognome());
			statement.setTimestamp(4, Timestamp.valueOf(persona.getData_nascita()));
			statement.executeUpdate();
			ResultSet generateKeys = statement.getGeneratedKeys();

			if (generateKeys.next()) {
				persona.setId(generateKeys.getInt(1));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			throw new DAOException(e.getMessage(), e);
		} finally {
			DBUtil.close(statement);
			DBUtil.close(connection);
		}
	}

}
