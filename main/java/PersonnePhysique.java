/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * author Client
 */
public class PersonnePhysique extends Client {
    private String prenom;
    private String dateNaissance;
    private String profession;
    private String employeur;
    
    public PersonnePhysique(String nom,String mdp, String adresse, String prenom, String dateNaissance,
                            String profession, String employeur) {
        super(nom, mdp, adresse);
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.profession = profession;
        this.employeur = employeur;
    }
    
    public String getPrenom() {
        return prenom;
    }
    
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    
    public String getDateNaissance() {
        return dateNaissance;
    }
    
    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }
    
    public String getProfession() {
        return profession;
    }
    
    public void setProfession(String profession) {
        this.profession = profession;
    }
    
    public String getEmployeur() {
        return employeur;
    }
    
    public void setEmployeur(String employeur) {
        this.employeur = employeur;
    }
}

    


