package fr.iutlittoral;
import java.util.ArrayList;
import java.util.Random;

public class EssaiVolume {
    
    public static void main(String[] args) {
        ArrayList<String> forme = new ArrayList<String>();
        Random rand = new Random();
        
        for (int i = 0; i < 10; i++) {
        	switch (rand.nextInt(4)) {
			case 0:
				Sphere s1 = new Sphere("Terre", rand.nextDouble(5), rand.nextDouble(20));
				System.out.println(s1);
				break;
				
			case 1:
				Parallelepipede p1 = new Parallelepipede("Verre", rand.nextDouble(5), rand.nextDouble(20), rand.nextDouble(20), rand.nextDouble(20));
				System.out.println(p1);
				break;
				
			case 2:
				Cylindre c1 = new Cylindre("Fer", rand.nextDouble(5), rand.nextDouble(20), rand.nextDouble(20));
				System.out.println(c1);
				break;
				
			case 3:
				CylindreCreux cc1 = new CylindreCreux("Bronze", rand.nextDouble(5), rand.nextDouble(20), rand.nextDouble(20), rand.nextDouble(20));
				System.out.println(cc1);
				break;
        	}
        }
        System.out.println(forme);
    }
}