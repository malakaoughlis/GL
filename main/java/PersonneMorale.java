/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * author Client
 */
public class PersonneMorale extends Client {
    private String designation;
    private String activite;
    private String numeroRegistreCommerce;
    private String numeroImmatriculationFiscale;
    private String responsable;

    public PersonneMorale(String nom, String mdp,String adresse, String designation, String activite,
                          String numRegCommerce, String numImmatFiscale, String responsable) {
        super(nom, mdp, adresse);
        this.designation = designation;
        this.activite = activite;
        this.numeroRegistreCommerce = numRegCommerce;
        this.numeroImmatriculationFiscale = numImmatFiscale;
        this.responsable = responsable;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getActivite() {
        return activite;
    }

    public void setActivite(String activite) {
        this.activite = activite;
    }

    public String getNumeroRegistreCommerce() {
        return numeroRegistreCommerce;
    }

    public void setNumeroRegistreCommerce(String numeroRegistreCommerce) {
        this.numeroRegistreCommerce = numeroRegistreCommerce;
    }

    public String getNumeroImmatriculationFiscale() {
        return numeroImmatriculationFiscale;
    }

    public void setNumeroImmatriculationFiscale(String numeroImmatriculationFiscale) {
        this.numeroImmatriculationFiscale = numeroImmatriculationFiscale;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }
}
    

   

