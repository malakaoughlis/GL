/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CompteBancaire {
    protected double solde;
    private String numero;
    private Client titulaire;
    protected List<Operationn> operations; // Liste des opérations associées au compte

    public CompteBancaire(double solde, String numero, Client titulaire) {
        this.solde = solde;
        this.numero = numero;
        this.titulaire = titulaire;
        this.operations = new ArrayList<>();
    }

    // Méthode pour créditer le compte avec un montant spécifique
    public void crediter(double montant) {
        this.solde += montant;
        enregistrerOperation(Operationn.Type.CREDIT, montant);
    }

    // Méthode pour débiter le compte avec un montant spécifique
    public void debiter(double montant) {
        if (this.solde >= montant) {
            this.solde -= montant;
            enregistrerOperation(Operationn.Type.DEBIT, montant);
        } else {
            // Gérer la situation de fonds insuffisants si nécessaire
            System.out.println("Fonds insuffisants");
        }
    }

    // Méthode privée pour enregistrer une opération avec type et montant spécifiques
    private void enregistrerOperation(Operationn.Type type, double montant) {
        Operationn nouvelleOperation = new Operationn(type, montant);
        operations.add(nouvelleOperation);
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Client getTitulaire() {
        return titulaire;
    }

    public void setTitulaire(Client titulaire) {
        this.titulaire = titulaire;
    }
}
    
