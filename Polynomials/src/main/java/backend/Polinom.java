//Suciu Mihai 30422
package backend;

import java.util.ArrayList;
import java.util.List;

public class Polinom {
	private List<Monom> list = new ArrayList<Monom>();

	public List<Monom> getList() {
		return list;
	}

	public void setList(List<Monom> list) {
		this.list = list;
	}

	public Polinom(Polinom other) {
		list = other.list;
	}

	public Polinom(String input) {
		String pmon[], nmon[]; // pozitiv monom, negativ monom
		Monom auxiliar;
		int i = 0;
		pmon = input.split("\\+");
		for (String aux : pmon) {
			nmon = aux.split("\\-");
			i = 0;
			for (String aux1 : nmon) {
				auxiliar = new Monom();
				if (aux1.length() == 0) { // sare peste element daca e gol
					i = 1;
					continue;
				}
				if (i == 0) {
					auxiliar.set(aux1);
					i = 1;
				} else {
					auxiliar.set(aux1);
					auxiliar.setCoef(auxiliar.getCoef() * -1);
				}
				this.adaugaMonom(auxiliar);
			}
		}
	}

	public String display() {
		String aux = "";
		for (Monom x : this.getList()) {
			if (!x.display().equals("0")) {
				aux = aux + x.display();
			}
		}
		if (aux.length() > 0) {
			if (aux.charAt(0) == '+') {
				aux = aux.substring(1);
			}
		} else {
			return "0";
		}
		return aux;
	}

	public void adaugaMonom(Monom in) {
		if (list.size() == 0 || in.getPutere() > list.get(0).getPutere()) {
			// daca lista ii goala sau cel mai mare monom ii mai mic decat monomu introdus
			// il pun in capu listei
			list.add(0, in);
		} else if (list.get(list.size() - 1).getPutere() > in.getPutere()) {
			// daca monomu introdus are puterea mai mica decat ultimu monom din lista
			// il pun la coada
			list.add(list.size(), in);
		} else {
			for (int i = 0, j = 1; i < list.size(); i++, j++) {
				// caut 2 puteri intre care sa pot introduce monomu meu
				if (list.get(i).getPutere() > in.getPutere() && list.get(j).getPutere() < in.getPutere()) {
					list.add(j, in); 
					i++;
				} else if (list.get(i).getPutere() == in.getPutere()) {
					 // daca au puteri egale adun doar coef
					list.get(i).setCoef(in.getCoef() + list.get(i).getCoef());
				}
			}
		}
	}
}
