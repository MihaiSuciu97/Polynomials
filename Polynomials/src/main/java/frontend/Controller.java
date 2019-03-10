//Suciu Mihai 30422
package frontend;

import backend.Functii;
import backend.Polinom;

public class Controller {
	private View view;
	//X si Y folosite pentru a lua textul din TextField-uri
	public String x;
	public String y;
	//Polinoamele , luat din X si Y
	public Polinom firstone = new Polinom("");
	public Polinom secondone = new Polinom("");
	// Setter pentru result
	public void SetResult(String a) {
		view.ResultLabel.setText(a);
	}

	public Controller() {
		this.view = new View();
		//setam actionlistener-u pe butonul de save
		this.view.saveaction1(e -> {
			x = view.pol1.getText();
			firstone = new Polinom(x);
			//System.out.println(firstone.display());
			y = view.pol2.getText();
			secondone = new Polinom(y);
			//System.out.println(secondone.display());
		});
		//Setam butoanele pentru operatii
		this.view.add(e -> {
			SetResult(Functii.adunare(firstone, secondone).display());
		});
		this.view.sub(e -> {
			SetResult(Functii.scadere(firstone, secondone).display());
		});
		this.view.mul(e -> {
			SetResult(Functii.inmultire(firstone, secondone).display());
		});
		this.view.der(e -> {
			SetResult(Functii.derivare(firstone).display());
		});
	}
}
