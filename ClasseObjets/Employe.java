/*
####################################################################################
####################################################################################
                                 LA CLASSE EMPLOYE
####################################################################################
#################################################################################### 
*/
package projetjava2017.ClasseObjets;
import java.util.Date;

abstract class Employe 
{

    private String matricule;
    private String nom;
    private String prenom;
    private int age;
    private Date dateEntreeService = new Date();
 
//CONSTRUCTEUR 
    public Employe(String matricule, String nom, String prenom, int age, Date dateEntreeService) 
    {

        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.dateEntreeService = dateEntreeService;

    }
// METHODE ABSTRAITE
    public abstract double calculerSalaire();
 
//UN GETTEUR QUI RETOURNE LE TITRE D'UN EMPLOYE
   public String getDesignation()
        {
            return "L'employé " ;

        }
// GETTEUR QUI RETOURNE LE NOM ET PRENOM DE L'EMPLOYER, CONCATENE AVEC LE GETTEUR DU TITRE 
    public String getNom() 
    {
        return getDesignation() + nom + " " + prenom;
    }
}
 