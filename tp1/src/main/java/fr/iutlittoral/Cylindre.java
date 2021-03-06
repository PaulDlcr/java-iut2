package fr.iutlittoral;

public class Cylindre extends Volume {
	

	double hauteur, diametre;
	
	public Cylindre(String mat, double dens, double haut, double diam) {
		super(mat, dens);
		this.hauteur = haut;
		this.diametre = diam;
	}
	
	Cylindre(Cylindre c) {
		super(c);
		hauteur = c.hauteur;
		diametre =c.diametre;
	}

	@Override
	public double volume() {
		return Math.PI * Math.pow((diametre/2),2) * hauteur;
	}

	@Override
	public double surface() {
		return Math.PI * (diametre/2);
	}

	@Override
	public String toString() {
		return "cylindre de dimension " + hauteur+ "x" + diametre + super.toString();
	}
}
