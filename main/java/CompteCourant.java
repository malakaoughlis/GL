/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;
import java.util.Date; // Add this import statement

import javax.naming.OperationNotSupportedException;



/**
 *
 * @author Client 
 */
public class CompteCourant extends CompteBancaire {
    private double decouvertAutorise;

    public CompteCourant(double solde, String numero, Client titulaire, double decouvertAutorise) {
        super(solde, numero, titulaire);
        this.operations = new ArrayList<>();
        this.decouvertAutorise = decouvertAutorise;
    }

    public boolean autoriserDecouvert(double montant) {
        // Méthode pour autoriser un découvert (si nécessaire)
        return (montant <= decouvertAutorise);
    }

    // Méthode redéfinie pour débiter avec vérification du découvert autorisé
    public void debiter(double montant) {
        if ((solde - montant) >= -decouvertAutorise) {
            solde -= montant;
            Operationn nouvelleOperation = new Operationn(Operationn.Type.DEBIT, montant); // Update the constructor call
            ajouterOperation(nouvelleOperation);
          
        } else {
        }
    }

    private void ajouterOperation(Operationn nouvelleOperation) {
        operations.add(nouvelleOperation);
    }

 
    public double getDecouvertAutorise() {
        return decouvertAutorise;
    }

    public void setDecouvertAutorise(double decouvertAutorise) {
        this.decouvertAutorise = decouvertAutorise;
    }

   
   
}
