/*
.......................................................................................................
.......................................................................................................
                 LA CLASSE EXECUTABLE,LA CLASSE EXECUTABLE
.......................................................................................................
........................................................................................................
*/
package projetjava2017;

import java.util.Date;
import projetjava2017.ClasseObjets.*;


public class Salary 
{
    private static Date dateEntreeService = new Date();
    
    public static void main(String[] args) 
    { 
        Personnel Personne = new Personnel();
        
        Personne.ajouterEmploye(new Vendeur("16B456FS", "YAGOUA", "FRANCIS", 22, dateEntreeService,11000));
        Personne.ajouterEmploye(new Representant("16A012FS", "LOUM", "EDWIGE", 33, dateEntreeService, 11000));
        Personne.ajouterEmploye(new Technicien("16B489FS", "DOUALA", "JUNIOR", 29, dateEntreeService, 11000));
        Personne.ajouterEmploye(new Manutentionnaire("16B432FS", "BEIDI", "WASSOUO EMMANUEL", 19, dateEntreeService, 11000));
        Personne.ajouterEmploye(new TechnicienArisque("16K432FS", "KOUYAKOV", "GOUZANOV", 32, dateEntreeService, 11000));
        Personne.ajouterEmploye(new ManutentionnaireArisque("16B093FS", "TCHAFROS", "DE GENEVE", 39, dateEntreeService, 11000));
        
        Personne.afficherSalaires();
        
        System.out.println("\n\t\t\t\t Le salaire moyen dans l'entreprise vaut "+ Personne.salaireMoyen() + " FCFA.");
 
    }
}
//               FIN