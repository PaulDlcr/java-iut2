package fr.iutlittoral;

public abstract class Volume implements VolumeCalculable{
    /** Attributs*/
    private String matiere;
    private double densite;

    /**Constructeur par paramètres*/
    public Volume(String mat, double dens){
        this.matiere = mat;
        this.densite = dens;
    }

    /**Constructeur par recopie*/
    Volume(Volume v){
        matiere = v.matiere;
        densite = v.densite;
    }

    public double poids(){
        return densite * volume();
    }

    public String toString(){
        return " en " + matiere;
    }
}