package Mappere;

import Database.ConnectionConfiguration;
import Entitet.Bøger;
import Entitet.Postnr;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PostnrMapper {

    public static void getPostnr() {

        try {
            Connection connection = ConnectionConfiguration.getConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM biblotekonsdag.postnr ");
            ResultSet result = statement.executeQuery();

            while (result.next()) {
                int id = result.getInt("postnr");
                String bynavn = result.getString("bynavn");

                System.out.println(id + ": " + bynavn);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
