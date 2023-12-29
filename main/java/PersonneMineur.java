/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * author Client
 */
public class PersonneMineur extends PersonnePhysique {
    private Client tuteur; // Tuteur légal pour les mineurs

    public PersonneMineur(String nom, String mdp,String adresse, String prenom, String dateNaissance,
                          String profession, String employeur, Client tuteur) {
        super(nom, mdp,adresse, prenom, dateNaissance, profession, employeur);
        this.tuteur = tuteur;
    }

    public Client getTuteur() {
        return tuteur;
    }

    public void setTuteur(Client tuteur) {
        this.tuteur = tuteur;
    }

    

    }

