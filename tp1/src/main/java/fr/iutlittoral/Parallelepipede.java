package fr.iutlittoral;

public class Parallelepipede extends Volume{
	double longueur, largeur, hauteur;
	
	public Parallelepipede(String mat, double dens, double len, double larg, double haut) {
		super(mat,dens);
		this.longueur = len;
		this.largeur = larg;
		this.hauteur = haut;
	}
	
	Parallelepipede(Parallelepipede p){
		super(p);
		longueur = p.longueur;
		largeur = p.longueur;
		hauteur = p.hauteur;
	}
	
	@Override
    public double volume(){
        return largeur * longueur * hauteur;
    }
	
	@Override
    public double surface(){
        return 2 * (longueur * largeur + longueur * hauteur + hauteur * largeur);
    }
	
	public String toString(){
		return "parallelepipede de dimensions "+longueur+"x"+largeur+"x"+hauteur+ super.toString();
	}

}
