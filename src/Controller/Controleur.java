package Controller;

import Model.Repository;
import View.Vue1;
import View.Vue2;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Controleur
{
    public void traiterRequete(Connection con) throws SQLException
    {
        Vue1 v1 = new Vue1();
        Vue2 v2 = new Vue2();

        Repository repo1 = new Repository();

        String req1 = "Select menu.nom, aliment.nom From menu INNER JOIN menu_aliment ON menu.id = menu_aliment.idMenu INNER JOIN aliment ON menu_aliment.idAlim = aliment.id ; ";
        v1.showView(repo1.execRequête(con,req1));
        String str1 = JOptionPane.showInputDialog(null, "Rentrez rentrer un client: ");
        String req2 = "Select nom_pren, idClient, idMenu, mois_annee, nbre_menu, sauce, livraison, paiement From client INNER JOIN client_menu ON client.id = client_menu.idClient where mois_annee BETWEEN '1022' AND '1222' and nom_pren ="+str1;
        v2.showView(repo1.execRequête(con,req2));
    }
}
