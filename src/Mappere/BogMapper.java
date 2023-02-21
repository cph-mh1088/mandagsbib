package Mappere;

import Database.ConnectionConfiguration;
import Entitet.Bøger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BogMapper {

    public static void getBooks() {

        try {
            Connection connection = ConnectionConfiguration.getConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM biblotekonsdag.bøger ");
            ResultSet result = statement.executeQuery();

            while (result.next()) {
                int id = result.getInt("idbog");
                String titel = result.getString("titel");
                String forfatter = result.getString("forfatter");

                System.out.println(id + ": " + titel + ": " + forfatter);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
