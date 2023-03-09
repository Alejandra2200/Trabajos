package Modelo;

public class Escudo {
    private String nom_escudo;
    private int protec_escudo;
    
    public Escudo (String nom_escudo, int protec_escudo){
        this.nom_escudo = nom_escudo;
        this.protec_escudo = protec_escudo;
    }

    public String getNom_escudo() {
        return nom_escudo;
    }

    public void setNom_escudo(String nom_escudo) {
        this.nom_escudo = nom_escudo;
    }

    public int getProtec_escudo() {
        return protec_escudo;
    }

    public void setProtec_escudo(int protec_escudo) {
        this.protec_escudo = protec_escudo;
    }
}
