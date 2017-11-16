/*
+++++++++++++++++++++++++++++++++++++++++++++++++++
                                                    
##              CLASSE VENDEUR                   ##
     elle herite de la classe commerciale                                               
+++++++++++++++++++++++++++++++++++++++++++++++++++
*/

package projetjava2017.ClasseObjets;
import java.util.Date;

public class Vendeur extends Commercial 
{
//LES CONSTANTES
    private final static double TAUX_VENDEUR = 0.2;
    private final static int PRIME_VENDEUR = 100;

 
    public Vendeur(String matricule, String nom, String prenom, int age, Date dateEntreeService, double chiffreAff)
    {
        super(matricule, nom, prenom, age, dateEntreeService, chiffreAff);
    }

 
// ON INDIQUE QU'IL S'AGIT D'UN POLYMORPHISME DYNAMIQUE AVEC LE MOT CLE @Override    
    @Override
    public double calculerSalaire() 
    {
        return (TAUX_VENDEUR * getchiffreAff()) + PRIME_VENDEUR;
    }
 
    @Override
    public String getDesignation()
        {
            return "Le vendeur ";
        }
 
}
 


