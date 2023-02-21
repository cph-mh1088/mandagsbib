package Mappere;

import Database.ConnectionConfiguration;
import Entitet.Bøger;
import Entitet.Udlån;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UdlånMapper {

    public static void getUdlån() {

        try {
            Connection connection = ConnectionConfiguration.getConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM biblotekonsdag.udlån ");
            ResultSet result = statement.executeQuery();

            while (result.next()) {
                int id = result.getInt("idudlån");
                String idbøger = result.getString("idbøger");
                String idlåner = result.getString("idlåner");

                System.out.println(id + ": " + idbøger + ": " + idlåner);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
