package BDD;

import java.sql.*;

public class Display extends MyJDBC{
    public Display(){

    }
    public void displayHeroTable() throws ClassNotFoundException, SQLException {
            Connection connection = getConnection();
            Statement mystatement = connection.createStatement();
            ResultSet heroTable = mystatement.executeQuery("select * from hero");
            while (heroTable.next())
            {
                System.out.println(heroTable.getString("Type") + " " + heroTable.getString("Nom"));
            }


    }
}
