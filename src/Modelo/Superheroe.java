package Modelo;

public class Superheroe {
    private String nom_heroe;
    private int salud;
    
    public Superheroe (String nom_heore, int salud){
        this.nom_heroe = nom_heroe;
        this.salud = salud;
    }
    
    public Superheroe(){}

    public String getNom_heroe() {
        return nom_heroe;
    }

    public void setNom_heroe(String nom_heroe) {
        this.nom_heroe = nom_heroe;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }
}
