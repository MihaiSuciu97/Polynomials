//Suciu Mihai 30422
package backend;

public class Monom {

	private int coef;
	private int putere;

	public int getCoef() {
		return coef;
	}

	public void setCoef(int coef) {
		this.coef = coef;
	}

	public int getPutere() {
		return putere;
	}

	public void setPutere(int putere) {
		this.putere = putere;
	}
	//Fac 2 constructori , cand e gol , sa fie 1 coeficientul si 1 puterea
	//sau cand sunt alte numere sa ia acele valori
	public Monom() {
		this(1, 1);
	}

	public Monom(int coef, int putere) {
		this.coef = coef;
		this.putere = putere;
	}

	public String display() {
		//
		String mon = "";

		if (this.coef == 0) {
			return "0";
		} else if (this.coef == 1) {
			if (this.putere == 0) {
				mon = mon + "+" + String.valueOf(this.coef);
			} else {
				mon = mon + "+";
			}
		} else if (this.coef == -1) {
			if (this.putere == 0) {
				mon = mon + String.valueOf(this.coef);
			} else {
				mon = mon + "-";
			}
		} else if (this.coef < 0) {
			mon = mon + String.valueOf(this.coef);
		} else if (this.coef > 0) {
			mon = mon + "+" + String.valueOf(this.coef);
		}
		if (this.putere == 1) {
			mon = mon + "x";
		} else if (this.putere > 1) {
			mon = mon + "x^" + String.valueOf(this.putere);
		}

		return mon;
	}
	//transforma fiecare monom (string) din polinomul citit in monom (obiect)
	public Monom set(String input) {
		this.putere = 0; // pentru reset
		this.coef = 0;
		String aux[];
		if (input.contains("^")) {
			aux = input.split("x\\^");
			if (aux[0].length() == 0) {
				this.coef = 1;
			} else {
				this.coef = Integer.parseInt(aux[0]);
			}
			if (aux[1].length() == 0) {
				this.putere = 1;
			} else {
				this.putere = Integer.parseInt(aux[1]);
			}
		}else {
			if(input.contains("x")) {
				this.putere = 1;
				aux = input.split("x");
				if(aux.length == 1) {
					this.coef = Integer.parseInt(aux[0]);
				}else {
					this.coef = 1;
				}
			}else {
				this.putere = 0;
				this.coef = Integer.parseInt(input);
			}
		}

		return this;
	}
}
