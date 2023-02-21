import Database.ConnectionConfiguration;
import Entitet.Author;
import Entitet.Låner;
import Mappere.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        BogMapper.getBooks();

        // ----------           IGNORE          ---------- //

        // ConnectionConfiguration.getConnection(); // used to test connection
        // System.out.println(getString("Hvad hedder du?"));
        //  System.out.println(getInt("angiv venligt din skostørrelse"));
        // System.out.println(getInt("angiv venligt din højde"));


      /*  while (true) {
            switch (getString("Angiv dit ønske ")){
                case "lån bog":
                    System.out.println("du ønsker at låne en bog");
               // case "stop":
                 //   break;
            }
            if (getString("q for quit").equalsIgnoreCase("q")){
                break;
            }
        } */
    }
}
