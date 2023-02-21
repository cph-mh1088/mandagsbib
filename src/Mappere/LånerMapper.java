package Mappere;

import Database.ConnectionConfiguration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LånerMapper {

    public static void getLåner() {

       // List<Låner> lånerListe = new ArrayList<>(); // is this list necessary?

        try {
            Connection connection = ConnectionConfiguration.getConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM biblotekonsdag.låner ");
            ResultSet result = statement.executeQuery();

            while (result.next()) {
                int id = result.getInt("idlåner");
                String name = result.getString("navn");
                String address = result.getString("adresse");
                int postnr = result.getInt("postnr");

                System.out.println(id + ": " + name + ": " + address + ": " + postnr);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        //return lånerListe;
    }
}




