package Mappere;

import Database.ConnectionConfiguration;
import Entitet.Author;
import Entitet.Bøger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AuthorMapper {

    public static void getAuthors() {

        try {
            Connection connection = ConnectionConfiguration.getConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM biblotekonsdag.author ");
            ResultSet result = statement.executeQuery();

            while (result.next()) {
                int id = result.getInt("idAuthor");
                String firstName = result.getString("firstName");
                String lastName = result.getString("lastName");

                System.out.println(id + ": " + firstName + ": " + lastName);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



