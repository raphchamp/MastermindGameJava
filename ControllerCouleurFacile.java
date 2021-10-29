package mheistermind;

import java.util.Random;
import java.util.Scanner;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class ControllerCouleurFacile {

	public int  nbcouleurs, nbessais, w, compteurmalplace,compteurvrai,compteurfaux;
	public int compteur=12;
	public int[] tablordi = new int[4];
	public int[] tabluser = new int[4];
	public boolean[] tabverif = new boolean[4];
	public String[] retour = new String[4];
	Scanner sc = new Scanner (System.in);

	@FXML
	private Circle l11 = new Circle();
	@FXML
	private Circle l12 = new Circle();
	@FXML
	private Circle l13 = new Circle();
	@FXML
	private Circle l14 = new Circle();
	@FXML
	private Circle l21 = new Circle();
	@FXML
	private Circle l22 = new Circle();
	@FXML
	private Circle l23 = new Circle();
	@FXML
	private Circle l24 = new Circle();
	@FXML
	private Circle l31 = new Circle();
	@FXML
	private Circle l32 = new Circle();
	@FXML
	private Circle l33 = new Circle();
	@FXML
	private Circle l34 = new Circle();
	@FXML
	private Circle l41 = new Circle();
	@FXML
	private Circle l42 = new Circle();
	@FXML
	private Circle l43 = new Circle();
	@FXML
	private Circle l44 = new Circle();
	@FXML
	private Circle l51 = new Circle();
	@FXML
	private Circle l52 = new Circle();
	@FXML
	private Circle l53 = new Circle();
	@FXML
	private Circle l54 = new Circle();
	@FXML
	private Circle l61 = new Circle();
	@FXML
	private Circle l62 = new Circle();
	@FXML
	private Circle l63 = new Circle();
	@FXML
	private Circle l64 = new Circle();
	@FXML
	private Circle l71 = new Circle();
	@FXML
	private Circle l72 = new Circle();
	@FXML
	private Circle l73 = new Circle();
	@FXML
	private Circle l74 = new Circle();
	@FXML
	private Circle l81 = new Circle();
	@FXML
	private Circle l82 = new Circle();
	@FXML
	private Circle l83 = new Circle();
	@FXML
	private Circle l84 = new Circle();
	@FXML
	private Circle l91 = new Circle();
	@FXML
	private Circle l92 = new Circle();
	@FXML
	private Circle l93 = new Circle();
	@FXML
	private Circle l94 = new Circle();
	@FXML
	private Circle l101 = new Circle();
	@FXML
	private Circle l102= new Circle();
	@FXML
	private Circle l103 = new Circle();
	@FXML
	private Circle l104 = new Circle();
	@FXML
	private Circle l111 = new Circle();
	@FXML
	private Circle l112 = new Circle();
	@FXML
	private Circle l113 = new Circle();
	@FXML 
	private Circle l114 = new Circle();
	@FXML
	private Circle l121 = new Circle();
	@FXML 
	private Circle l122 = new Circle();
	@FXML
	private Circle l123 = new Circle();
	@FXML
	private Circle l124 = new Circle();
	@FXML
	private Button jaune = new Button();
	@FXML
	private Button bleu = new Button();
	@FXML
	private Button rouge = new Button();
	@FXML
	private Button vert = new Button();
	@FXML
	private Button orange = new Button();
	@FXML
	private Button noir = new Button();
	@FXML
	private Circle Cercle1 = new Circle();
	@FXML
	private Circle Cercle2 = new Circle();
	@FXML
	private Circle Cercle3 = new Circle();
	@FXML 
	private Circle Cercle4 = new Circle();
	@FXML
	private Circle Cercleminus = new Circle();
	@FXML
	private Button Selection = new Button();
	@FXML
	private TextField Resultat = new TextField();
	@FXML
	private TextField rep1 = new TextField();
	@FXML
	private TextField rep2 = new TextField();
	@FXML
	private TextField rep3 = new TextField();
	@FXML
	private TextField rep4 = new TextField();
	@FXML
	private TextField rep5 = new TextField();
	@FXML
	private TextField rep6 = new TextField();
	@FXML
	private TextField rep7 = new TextField();
	@FXML
	private TextField rep8 = new TextField();
	@FXML
	private TextField rep9 = new TextField();
	@FXML
	private TextField rep10 = new TextField();
	@FXML
	private TextField rep11 = new TextField();
	@FXML
	private TextField rep12 = new TextField();

	int i=0;
	int compteurcouleur=0;

	@FXML
	private void demarrage() {
		for(int i = 0;i<4;i++) {
			tabverif[i]= true;
		}
		for(int i = 0;i<4;i++){
			System.out.print(" : ");
			Random r = new Random();
			tablordi[i] =  1 + r.nextInt(6);
		}

	}
	@FXML
	public void initialize() {
		demarrage();
	}
	@FXML 
	private void handleResultat() throws Exception {

		Cercleminus.setFill(Color.WHITE);

		if(Cercle1.getFill()==Cercleminus.getFill() || Cercle2.getFill()==Cercleminus.getFill() || Cercle3.getFill()==Cercleminus.getFill() || Cercle4.getFill()==Cercleminus.getFill()) {
			Resultat.setText("Votre combinaison n'est pas complète !");
			Cercle1.setFill(Color.WHITE);
			Cercle2.setFill(Color.WHITE);
			Cercle3.setFill(Color.WHITE);
			Cercle4.setFill(Color.WHITE);

		}else {
			w=0;
			boolean[] tabbienplace = new boolean[4];
			boolean[] tabmalplacemaiscorrecte = new boolean[4];

			for(int sd=0;sd<4;sd++){
				tabmalplacemaiscorrecte[sd]=false;
			}
			for(int i = 0;i<4;i++){
				if(tabluser[i]==tablordi[i]) {
					tabbienplace[i]= true;
					w++;
				}
				if(tabluser[i]!=tablordi[i]) {
					tabbienplace[i]= false;
				}
			}
			for(int f = 0;f<4;f++){
				for(int p = 0;p<4;p++){
					if(tabluser[f]==tablordi[p]) {
						tabmalplacemaiscorrecte[f]=true;
					}
				}
			}
			for(int i = 0;i<4;i++){
				if(tabmalplacemaiscorrecte[i]==false) {
					retour[i]="X";
				}
				if(tabmalplacemaiscorrecte[i]==true ) {
					retour[i]="O";
				}
				if(tabbienplace[i]==true) {
					retour[i]="V";
				}
			}
			for(int i = 0;i<4;i++){
				if(retour[i]=="X") {
					compteurfaux++;
				}
				if(retour[i]=="O") {
					compteurmalplace++;
				}
				if(retour[i]=="V") {
					compteurvrai++;
				}
			}
			Resultat.setText(compteurfaux+" faux "+compteurvrai+" vrais "+compteurmalplace+" mal placés ");
			compteurfaux=0;
			compteurvrai=0;
			compteurmalplace=0;
			compteur--;
			if(compteur == 0) {
				Resultat.setText("Malheureusement, vous avez perdu.");
			}
			if(w==4) {
				Resultat.setText("Bravo vous avez gagné !!");
			}
			if (l11.getFill()==Cercleminus.getFill() || l12.getFill()==Cercleminus.getFill() || l13.getFill()==Cercleminus.getFill() || l14.getFill()==Cercleminus.getFill() ) {
				l11.setFill(Cercle1.getFill());
				l12.setFill(Cercle2.getFill());
				l13.setFill(Cercle3.getFill());
				l14.setFill(Cercle4.getFill());
				Cercle1.setFill(Color.WHITE);
				Cercle2.setFill(Color.WHITE);
				Cercle3.setFill(Color.WHITE);
				Cercle4.setFill(Color.WHITE);
				rep1.setText(Resultat.getText());
				Resultat.setText("");
				compteurcouleur=compteurcouleur+1;
				i++;

			} 
			if (l21.getFill()==Cercleminus.getFill() || l22.getFill()==Cercleminus.getFill() || l23.getFill()==Cercleminus.getFill() || l24.getFill()==Cercleminus.getFill()) {
				l21.setFill(Cercle1.getFill());
				l22.setFill(Cercle2.getFill());
				l23.setFill(Cercle3.getFill());
				l24.setFill(Cercle4.getFill());
				Cercle1.setFill(Color.WHITE);
				Cercle2.setFill(Color.WHITE);
				Cercle3.setFill(Color.WHITE);
				Cercle4.setFill(Color.WHITE);
				rep2.setText(Resultat.getText());
				Resultat.setText("");
				compteurcouleur=compteurcouleur+1;
				i++;

			} 
			if(l31.getFill()==Cercleminus.getFill() || l32.getFill()==Cercleminus.getFill() || l33.getFill()==Cercleminus.getFill() || l34.getFill()==Cercleminus.getFill()) {
				l31.setFill(Cercle1.getFill());
				l32.setFill(Cercle2.getFill());
				l33.setFill(Cercle3.getFill());
				l34.setFill(Cercle4.getFill());
				Cercle1.setFill(Color.WHITE);
				Cercle2.setFill(Color.WHITE);
				Cercle3.setFill(Color.WHITE);
				Cercle4.setFill(Color.WHITE);
				rep3.setText(Resultat.getText());
				Resultat.setText("");
				compteurcouleur=compteurcouleur+1;
				i++;

			} 
			if(l41.getFill()==Cercleminus.getFill() || l42.getFill()==Cercleminus.getFill() || l43.getFill()==Cercleminus.getFill()|| l44.getFill()==Cercleminus.getFill()) {
				l41.setFill(Cercle1.getFill());
				l42.setFill(Cercle2.getFill());
				l43.setFill(Cercle3.getFill());
				l44.setFill(Cercle4.getFill());
				Cercle1.setFill(Color.WHITE);
				Cercle2.setFill(Color.WHITE);
				Cercle3.setFill(Color.WHITE);
				Cercle4.setFill(Color.WHITE);
				rep4.setText(Resultat.getText());
				Resultat.setText("");
				compteurcouleur=compteurcouleur+1;
				i++;

			}
			if (l51.getFill()==Cercleminus.getFill() || l52.getFill()==Cercleminus.getFill() || l53.getFill()==Cercleminus.getFill() || l54.getFill()==Cercleminus.getFill()) {
				l51.setFill(Cercle1.getFill());
				l52.setFill(Cercle2.getFill());
				l53.setFill(Cercle3.getFill());
				l54.setFill(Cercle4.getFill());
				Cercle1.setFill(Color.WHITE);
				Cercle2.setFill(Color.WHITE);
				Cercle3.setFill(Color.WHITE);
				Cercle4.setFill(Color.WHITE);
				rep5.setText(Resultat.getText());
				Resultat.setText("");
				compteurcouleur=compteurcouleur+1;
				i++;

			}
			if (l61.getFill()==Cercleminus.getFill() || l62.getFill()==Cercleminus.getFill() || l63.getFill()==Cercleminus.getFill() || l64.getFill()==Cercleminus.getFill()) {
				l61.setFill(Cercle1.getFill());
				l62.setFill(Cercle2.getFill());
				l63.setFill(Cercle3.getFill());
				l64.setFill(Cercle4.getFill());
				Cercle1.setFill(Color.WHITE);
				Cercle2.setFill(Color.WHITE);
				Cercle3.setFill(Color.WHITE);
				Cercle4.setFill(Color.WHITE);
				rep6.setText(Resultat.getText());
				Resultat.setText("");
				compteurcouleur=compteurcouleur+1;
				i++;

			}
			if (l71.getFill()==Cercleminus.getFill() || l72.getFill()==Cercleminus.getFill() || l73.getFill()==Cercleminus.getFill() || l74.getFill()==Cercleminus.getFill()) {
				l71.setFill(Cercle1.getFill());
				l72.setFill(Cercle2.getFill());
				l73.setFill(Cercle3.getFill());
				l74.setFill(Cercle4.getFill());
				Cercle1.setFill(Color.WHITE);
				Cercle2.setFill(Color.WHITE);
				Cercle3.setFill(Color.WHITE);
				Cercle4.setFill(Color.WHITE);
				rep7.setText(Resultat.getText());
				Resultat.setText("");
				compteurcouleur=compteurcouleur+1;
				i++;

			}
			if (l81.getFill()==Cercleminus.getFill() || l82.getFill()==Cercleminus.getFill() || l83.getFill()==Cercleminus.getFill() || l84.getFill()==Cercleminus.getFill()) {
				l81.setFill(Cercle1.getFill());
				l82.setFill(Cercle2.getFill());
				l83.setFill(Cercle3.getFill());
				l84.setFill(Cercle4.getFill());
				Cercle1.setFill(Color.WHITE);
				Cercle2.setFill(Color.WHITE);
				Cercle3.setFill(Color.WHITE);
				Cercle4.setFill(Color.WHITE);
				rep8.setText(Resultat.getText());
				Resultat.setText("");
				compteurcouleur=compteurcouleur+1;
				i++;

			}
			if (l91.getFill()==Cercleminus.getFill() || l92.getFill()==Cercleminus.getFill() || l93.getFill()==Cercleminus.getFill() || l94.getFill()==Cercleminus.getFill()) {
				l91.setFill(Cercle1.getFill());
				l92.setFill(Cercle2.getFill());
				l93.setFill(Cercle3.getFill());
				l94.setFill(Cercle4.getFill());
				Cercle1.setFill(Color.WHITE);
				Cercle2.setFill(Color.WHITE);
				Cercle3.setFill(Color.WHITE);
				Cercle4.setFill(Color.WHITE);
				rep9.setText(Resultat.getText());
				Resultat.setText("");
				compteurcouleur=compteurcouleur+1;
				i++;

			}
			if( l101.getFill()==Cercleminus.getFill() || l102.getFill()==Cercleminus.getFill() || l103.getFill()==Cercleminus.getFill() || l104.getFill()==Cercleminus.getFill()) {
				l101.setFill(Cercle1.getFill());
				l102.setFill(Cercle2.getFill());
				l103.setFill(Cercle3.getFill());
				l104.setFill(Cercle4.getFill());
				Cercle1.setFill(Color.WHITE);
				Cercle2.setFill(Color.WHITE);
				Cercle3.setFill(Color.WHITE);
				Cercle4.setFill(Color.WHITE);
				rep10.setText(Resultat.getText());
				Resultat.setText("");
				compteurcouleur=compteurcouleur+1;
				i++;

			}
			if (l111.getFill()==Cercleminus.getFill() || l112.getFill()==Cercleminus.getFill() || l113.getFill()==Cercleminus.getFill() || l114.getFill()==Cercleminus.getFill()) {
				l111.setFill(Cercle1.getFill());
				l112.setFill(Cercle2.getFill());
				l113.setFill(Cercle3.getFill());
				l114.setFill(Cercle4.getFill());
				Cercle1.setFill(Color.WHITE);
				Cercle2.setFill(Color.WHITE);
				Cercle3.setFill(Color.WHITE);
				Cercle4.setFill(Color.WHITE);
				rep11.setText(Resultat.getText());
				Resultat.setText("");
				compteurcouleur=compteurcouleur+1;
				i++;

			}
			if (l121.getFill()==Cercleminus.getFill() || l122.getFill()==Cercleminus.getFill() || l123.getFill()==Cercleminus.getFill() || l124.getFill()==Cercleminus.getFill()) {
				l121.setFill(Cercle1.getFill());
				l122.setFill(Cercle2.getFill());
				l123.setFill(Cercle3.getFill());
				l124.setFill(Cercle4.getFill());
				Cercle1.setFill(Color.WHITE);
				Cercle2.setFill(Color.WHITE);
				Cercle3.setFill(Color.WHITE);
				Cercle4.setFill(Color.WHITE);
				if(compteur == 0) {
					rep12.setText("Perdu.");
				}

				if(w==4) {
					rep12.setText("Bravo !!");
				}
			}				
			}
		}	

	//methode pour remplir la premiere ligne de la combinaison
	@FXML
	private void handleButtonJaune1() throws Exception {
		tabluser[0]=1;
		Cercle1.setFill(Color.YELLOW);

	}
	@FXML
	private void handleButtonBleu1() throws Exception {
		tabluser[0]=2;
		Cercle1.setFill(Color.BLUE);	

	}
	@FXML
	private void handleButtonRouge1() throws Exception {
		tabluser[0]=3;
		Cercle1.setFill(Color.RED);

	}
	@FXML
	private void handleButtonVert1() throws Exception {
		tabluser[0]=4;
		Cercle1.setFill(Color.GREEN);

	}
	@FXML
	private void handleButtonOrange1() throws Exception {
		tabluser[0]=5;
		Cercle1.setFill(Color.ORANGE);
	}
	@FXML
	private void handleButtonNoir1() throws Exception {
		tabluser[0]=6;
		Cercle1.setFill(Color.BLACK);	
	}

	//methode pour remplir la deuxieme ligne de la combinaison
	@FXML
	private void handleButtonJaune2() throws Exception {
		tabluser[1]=1;
		Cercle2.setFill(Color.YELLOW);

	}
	@FXML
	private void handleButtonBleu2() throws Exception {
		tabluser[1]=2;
		Cercle2.setFill(Color.BLUE);	

	}
	@FXML
	private void handleButtonRouge2() throws Exception {
		tabluser[1]=3;
		Cercle2.setFill(Color.RED);

	}
	@FXML
	private void handleButtonVert2() throws Exception {
		tabluser[1]=4;
		Cercle2.setFill(Color.GREEN);

	}
	@FXML
	private void handleButtonOrange2() throws Exception {
		tabluser[1]=5;
		Cercle2.setFill(Color.ORANGE);

	}
	@FXML
	private void handleButtonNoir2() throws Exception {
		tabluser[1]=6;
		Cercle2.setFill(Color.BLACK);	

	}

	//methode pour remplir le troisieme cercle de la combinaison
	@FXML
	private void handleButtonJaune3() throws Exception {
		tabluser[2]=1;
		Cercle3.setFill(Color.YELLOW);

	}
	@FXML
	private void handleButtonBleu3() throws Exception {
		tabluser[2]=2;	
		Cercle3.setFill(Color.BLUE);	

	}
	@FXML
	private void handleButtonRouge3() throws Exception {
		tabluser[2]=3;
		Cercle3.setFill(Color.RED);

	}
	@FXML
	private void handleButtonVert3() throws Exception {
		tabluser[2]=4;
		Cercle3.setFill(Color.GREEN);

	}
	@FXML
	private void handleButtonOrange3() throws Exception {
		tabluser[2]=5;
		Cercle3.setFill(Color.ORANGE);

	}
	@FXML
	private void handleButtonNoir3() throws Exception {
		tabluser[2]=6;
		Cercle3.setFill(Color.BLACK);	

	}

	//methode pour remplir le quatrieme cercle de la combinaison
	@FXML
	private void handleButtonJaune4() throws Exception {
		tabluser[3]=1;
		Cercle4.setFill(Color.YELLOW);

	}
	@FXML
	private void handleButtonBleu4() throws Exception {
		tabluser[3]=2;
		Cercle4.setFill(Color.BLUE);	

	}
	@FXML
	private void handleButtonRouge4() throws Exception {
		tabluser[3]=3;
		Cercle4.setFill(Color.RED);

	}
	@FXML
	private void handleButtonVert4() throws Exception {
		tabluser[3]=4;
		Cercle4.setFill(Color.GREEN);

	}
	@FXML
	private void handleButtonOrange4() throws Exception {
		tabluser[3]=5;
		Cercle4.setFill(Color.ORANGE);

	}
	@FXML
	private void handleButtonNoir4() throws Exception {
		tabluser[3]=6;
		Cercle4.setFill(Color.BLACK);	


	}
}