/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;

/**
 *
 * @author Client
 */
public class CompteEpargne extends CompteBancaire {
    private double tauxInteret;

    public CompteEpargne(double solde, String numero, Client titulaire, double tauxInteret) {
         super(solde, numero, titulaire);
        this.operations = new ArrayList<>();
        this.tauxInteret = tauxInteret;
    }

    public void calculerInterets() {
        // Méthode pour calculer les intérêts basés sur le taux d'intérêt
        double interets = solde * tauxInteret;
        crediter(interets);
    }

    public double getTauxInteret() {
        return tauxInteret;
    }

    public void setTauxInteret(double tauxInteret) {
        this.tauxInteret = tauxInteret;
    }

    
}

