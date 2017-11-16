package projetjava2017.ClasseObjets;

import java.util.Date;
import static projetjava2017.ClasseObjets.EmployeArisque.PRIME;

public class ManutentionnaireArisque extends Manutentionnaire implements EmployeArisque 
{
    public ManutentionnaireArisque(String matricule, String nom, String prenom, int age, Date dateEntreeService, int tempsPasse) 
    {
        super(matricule, nom, prenom, age, dateEntreeService, tempsPasse);
    }
 
    @Override
    public double calculerSalaire() 
    {
        return super.calculerSalaire() + PRIME;
    }

}

