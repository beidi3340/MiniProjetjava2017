/*
            BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB 
            B                  LA CLASSE COMMERCIALE. ELLE A DEUX CLASSES: VENDEUR ET REPRESENTANT                     B
            BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB

*/

package projetjava2017.ClasseObjets;
import java.util.Date;

abstract class Commercial extends Employe 
{

    private double chiffreAff = 11000.0;
 
    public Commercial(String matricule, String nom, String prenom, int age, Date dateEntreeService, double chiffreAff)
    {
        //Acces aux attributs de la classe mere avec le mot cle super
        super(matricule, nom, prenom, age, dateEntreeService);
        
        //nouvel attribut specifique a la classe commerciale
        this.chiffreAff = chiffreAff;

    }
 
    public double getchiffreAff()
        {
            return chiffreAff;

        }
 
}
 
