/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Client
 */
import java.util.Date;

public class Operationn {
    public enum Type {
        DEBIT, CREDIT
    }

    private Type type; // Débit ou crédit
    private double montant;
    private Date date;

    public Operationn(Type type, double montant) {
        this.type = type;
        this.montant = montant;
        this.date = new Date(); // Date actuelle par défaut
    }

    // Méthodes getters et setters pour les attributs

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    // Méthode pour afficher les détails de l'opération
    public void afficherDetailsOperation() {
        System.out.println("Type d'opération : " + type);
        System.out.println("Montant : " + montant);
        System.out.println("Date : " + date);
    }

    // Méthode pour vérifier si l'opération est un crédit
    public boolean estCredit() {
        return type == Type.CREDIT;
    }

    // Méthode pour vérifier si l'opération est un débit
    public boolean estDebit() {
        return type == Type.DEBIT;
    }

    // Méthode pour convertir les détails de l'opération en chaîne de caractères
    @Override
    public String toString() {
        return "Operation{" +
                "type=" + type +
                ", montant=" + montant +
                ", date=" + date +
                '}';
    }
}
