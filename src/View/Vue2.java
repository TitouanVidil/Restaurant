package View;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Vue2
{
    public Vue2(){}

    public void showView(ResultSet resultat) throws SQLException {
        while(resultat.next())
        {
            System.out.println("nom_prenom: "+resultat.getString("nom_pren") + " " + "idClient: "+resultat.getString("idClient") + " " + "idMenu: "+resultat.getString("idMenu") + " " + "mois_annee: "+resultat.getString("mois_annee") + " " + "nbre_menu: "+resultat.getString("nbre_menu") + " " + "sauce: "+resultat.getString("sauce") + " " + "livraison: "+resultat.getString("livraison") + " " + "paiement: "+resultat.getString("paiement") + " ");
        }
    }
}
