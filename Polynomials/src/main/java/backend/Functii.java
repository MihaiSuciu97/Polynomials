//Suciu Mihai 30422
package backend;

public class Functii {
	
	public static Polinom adunare(Polinom x,Polinom x1) {
		//in aux iau lista de monoame din x si adaug x1 la aux, x1 fiind rezultatul
		for(Monom aux : x.getList()) {
			x1.adaugaMonom(aux);
		}
		return x1;
	}
	public static Polinom scadere(Polinom x,Polinom y) {
		for(Monom aux:y.getList()) {
			aux.setCoef(aux.getCoef()*-1);//neg coeficientii si fac adunare
			x.adaugaMonom(aux);
		}
		return x;
	}
	
	public static Polinom inmultire(Polinom x,Polinom y) {
		//creez un alt polinom care o sa fie rezultatul
		Polinom z = new Polinom("");
		//iau in aux fiecare monom din Polinomul X
		for(Monom aux:x.getList()) {
			//iau in aux1 fiecare monom din polinomul Y
			for(Monom aux1:y.getList()) {
				//imi trebuie inca un auxiliar (aux 2) unde  creez noile monoame
				Monom aux2 = new Monom();
				//inmultesc coeficientele 
				aux2.setCoef(aux.getCoef()*aux1.getCoef());
				//adun puterile
				aux2.setPutere(aux.getPutere()+aux1.getPutere());
				//adaug monomul in polinom resultat.
				z.adaugaMonom(aux2);
			}
		}
		return z;
	}
	public static Polinom impartire(Polinom x,Polinom y) {
		return x;
		
	}
	public static Polinom derivare(Polinom x) {
		//iau in aux fiecare monom din polinomul x
		for(Monom aux:x.getList()) {
			//inmultesc in coeficient , coeficientul si puterea
			aux.setCoef(aux.getCoef()*aux.getPutere());
			//scad 1 din putere
			aux.setPutere(aux.getPutere()-1);
		}
		return x;
	}
	public static Polinom integrare(Polinom x) {
		
		return x;
	}
	
}
