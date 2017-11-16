/* ***************************************************************************
  *************************************************************************   *
*        LA CLASSE REPRESENTANTE, heritiere de la classe commerciale            *
 *************************************************************************    *
 * ***************************************************************************/

package projetjava2017.ClasseObjets;
import java.util.Date;

public class Representant extends Commercial 
{
    private final static double TAUX_REPRESENTANT = 0.2;
    private final static int PRIME_REPRESENTANT = 200;
 
    public Representant(String matricule, String nom, String prenom, int age, Date dateEntreeService, double chiffreAff) 
    {
        super(matricule, nom, prenom, age, dateEntreeService, chiffreAff);
    }
    // toujour le polymorphisme dynamique: redefinition de la methode 
    @Override
    public double calculerSalaire() 
    {
        return (TAUX_REPRESENTANT * getchiffreAff()) + PRIME_REPRESENTANT;
    }
 
    @Override
    public String getDesignation()
        {
            return "Le représentant ";
        }
}
