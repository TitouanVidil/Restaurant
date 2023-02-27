package View;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Vue1
{
    public Vue1(){}

    public void showView(ResultSet resultat) throws SQLException {
        while(resultat.next())
        {
            System.out.println("menu: "+resultat.getString("menu.nom") + " " + "aliment: "+resultat.getString("aliment.nom") + " " );
        }
    }
}
