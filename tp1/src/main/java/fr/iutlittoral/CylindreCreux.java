package fr.iutlittoral;

public class CylindreCreux extends Cylindre {
	double diametreInterne;
	
	public CylindreCreux(String mat, double dens, double haut, double diam, double diamInt) {
		super(mat, dens, haut, diam);
		this.diametreInterne = diamInt;
	}
	
	CylindreCreux(CylindreCreux cc) {
		super(cc);
		diametreInterne = cc.diametreInterne;
	}

	@Override
	public double volume() {
		return Math.PI * (Math.pow((diametre/2),2) - Math.pow((diametreInterne/2), 2)) * hauteur;
	}

	@Override
	public double surface() {
		return 2 * Math.PI * ((diametreInterne/2)+(diametre/2))*((diametre/2)-(diametreInterne/2)+ hauteur); 
	}

	@Override
	public String toString() {
		return super.toString() + " avec un creux central de diametre " + diametreInterne;
	}
	
	
}
