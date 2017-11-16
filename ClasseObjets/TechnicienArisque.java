
                                            /* **************************************************************************
                                            *               L'interface d'employés à risque                             *
                                            *                Elle contient les deux classe qui l'implement              *
                                            *               (Manutentionnaire a risque et technicien a risque)          *
                                            * ***************************************************************************/

package projetjava2017.ClasseObjets;
import java.util.Date;

 
interface EmployeArisque 
{

    public static final int PRIME = 25000;
}
 
/* ||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
 *                                          Une première sous-classe d'employé à risque
 * |||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||*/

public class TechnicienArisque extends Technicien implements EmployeArisque 
{
 
    public TechnicienArisque(String matricule, String nom, String prenom, int age, Date dateEntreeService, int nbrUniteFabrique) 
    {
        super(matricule, nom, prenom, age, dateEntreeService, nbrUniteFabrique);
    }

// polymorphisme dynamique: @override    
    @Override
    public double calculerSalaire() 
    {
        return super.calculerSalaire() + PRIME;
    }

}
 
/* 
    Une autre sous-classe d'employé à risque
*/
