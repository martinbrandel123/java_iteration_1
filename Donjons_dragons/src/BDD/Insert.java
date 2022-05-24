package BDD;

import java.sql.*;

public class Insert extends MyJDBC {




    public Insert(){

    }
    public void insertHeroIntoBDD(String pType, String pNom, int pNiveauVie, int pNiveauForce, String pEquipement) throws ClassNotFoundException, SQLException {

        Connection connection = getConnection();
        // crée un êtat
        Statement statement = connection.createStatement();
        // Execute une requette
        String sql =
                "insert into hero (Type, nom, NiveauVie, NiveauForce, Equipement) " +
                        "values ('" + pType + "','" + pNom + "','" + pNiveauVie + "','" + pNiveauForce + "','" + pEquipement + "')";
        statement.executeUpdate(sql);
        System.out.println("Insert complete.");
        // fermer la connection
        statement.close();
    }
}
