/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * author Client
 */

import java.util.ArrayList;
import java.util.List;

public class Client {
    protected int idc;
    protected String nom;
    private String mdp;
    private String adresse;
    private List<CompteBancaire> comptes;

    public Client(String nom, String adresse, String mdp) {
        this.nom = nom;
        this.mdp = mdp;
        this.adresse = adresse;
        this.comptes = new ArrayList<>();
    }

    public Client(){
        idc=1;
    }

    public void ajouterCompte(CompteBancaire compte) {
        comptes.add(compte);
    }

    public int getId() {
        return idc;
    }

    public void setId(int idc) {
        this.idc = idc;
    }
    

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }



    }










