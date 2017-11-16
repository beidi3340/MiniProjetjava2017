package projetjava2017.ClasseObjets;


import java.util.Date;

/* /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
@                                                    CLASSE TECHNICIEN                                                          @
@ /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
*/
public class Technicien extends Employe 
{
    
//CONSTANTES
    private final static double MULTIPLICATEUR = 5.0;
    private int nbrUniteFabrique;

//SON CONSTRUCTEUR 
    public Technicien(String matricule, String nom, String prenom, int age, Date dateEntreeService, int nbrUniteFabrique) 
    {
        super(matricule, nom, prenom, age, dateEntreeService);
        this.nbrUniteFabrique = nbrUniteFabrique;
    }
 
    @Override
    public double calculerSalaire() 
    {
        return MULTIPLICATEUR * nbrUniteFabrique;
    }
 
    @Override
    public String getDesignation()
        {
            return "Le technicien ";
        }
}