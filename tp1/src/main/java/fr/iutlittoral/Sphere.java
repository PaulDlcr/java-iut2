package fr.iutlittoral;

public class Sphere extends Volume{

    /**Attributs */
    private double rayon;

    /**Constructeur par paramètres*/
    public Sphere(String mat, double dens,double ray){
        super(mat,dens);
        this.rayon = ray;
    }

    /**Constructeur par recopie*/
    Sphere(Sphere s){
        super(s);
        rayon = s.rayon;
    }
    @Override
    public double volume(){
        return (4/3)*Math.PI*Math.pow(rayon, 3);
    }
    
    @Override
    public double surface(){
        return 4*Math.PI*Math.pow(rayon, 2);
    }

    @Override
    public String toString(){
        return "sphere de rayon "+ rayon + super.toString();
    }
}
