/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;

/**
 *
 * @author Client
 */
public class CompteCheque extends CompteBancaire {
    public CompteCheque(double solde, String numero, Client titulaire) {
        super(solde, numero, titulaire);
        this.operations = new ArrayList<>();
    }

    public void effectuerPaiement(double montant) {
        // Méthode spécifique pour les comptes chèque (si nécessaire)
        if (montant > 0) {
            debiter(montant);
        } else {
            System.out.println("Le montant doit être positif");
        }
    }
    
   }
