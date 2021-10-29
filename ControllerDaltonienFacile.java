package mheistermind;

//import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;



public class ControllerDaltonienFacile {

	public int  nbcouleurs, nbessais, w, compteurmalplace,compteurvrai,compteurfaux;
	public int[] tablordi = new int[4];
	public int compteur=12;
	public int[] tabluser = new int[4];
	public boolean[] tabverif = new boolean[4];
	public String[] retour = new String[4];
	Scanner sc = new Scanner (System.in);

	@FXML
	private TextField T1 = new TextField();
	@FXML
	private TextField T2 = new TextField();
	@FXML
	private TextField T3 = new TextField();
	@FXML
	private TextField T4 = new TextField();

	@FXML
	private TextField l11 = new TextField();
	@FXML
	private TextField l12 = new TextField();
	@FXML
	private TextField l13 = new TextField();
	@FXML
	private TextField l14 = new TextField();
	@FXML
	private TextField l21 = new TextField();
	@FXML
	private TextField l22 = new TextField();
	@FXML
	private TextField l23 = new TextField();
	@FXML
	private TextField l24 = new TextField();
	@FXML
	private TextField l31 = new TextField();
	@FXML
	private TextField l32 = new TextField();
	@FXML
	private TextField l33 = new TextField();
	@FXML
	private TextField l34 = new TextField();
	@FXML
	private TextField l41 = new TextField();
	@FXML
	private TextField l42 = new TextField();
	@FXML
	private TextField l43 = new TextField();
	@FXML
	private TextField l44 = new TextField();
	@FXML
	private TextField l51 = new TextField();
	@FXML
	private TextField l52 = new TextField();
	@FXML
	private TextField l53 = new TextField();
	@FXML
	private TextField l54 = new TextField();
	@FXML
	private TextField l61 = new TextField();
	@FXML
	private TextField l62 = new TextField();
	@FXML
	private TextField l63 = new TextField();
	@FXML
	private TextField l64 = new TextField();
	@FXML
	private TextField l71 = new TextField();
	@FXML
	private TextField l72 = new TextField();
	@FXML
	private TextField l73 = new TextField();
	@FXML
	private TextField l74 = new TextField();
	@FXML
	private TextField l81 = new TextField();
	@FXML
	private TextField l82 = new TextField();
	@FXML
	private TextField l83 = new TextField();
	@FXML
	private TextField l84 = new TextField();
	@FXML
	private TextField l91 = new TextField();
	@FXML
	private TextField l92 = new TextField();
	@FXML
	private TextField l93 = new TextField();
	@FXML
	private TextField l94 = new TextField();
	@FXML
	private TextField l101 = new TextField();
	@FXML
	private TextField l102= new TextField();
	@FXML
	private TextField l103 = new TextField();
	@FXML
	private TextField l104 = new TextField();
	@FXML
	private TextField l111 = new TextField();
	@FXML
	private TextField l112= new TextField();
	@FXML
	private TextField l113 = new TextField();
	@FXML
	private TextField l114 = new TextField();
	@FXML
	private TextField l121 = new TextField();
	@FXML
	private TextField l122= new TextField();
	@FXML
	private TextField l123 = new TextField();
	@FXML
	private TextField l124 = new TextField();
	
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

	@FXML
	private TextField resultat = new TextField();

	int i=0;

	@FXML
	private void demarrage() {
		// GENERATION DU CODE PAR LA FENETRE (ou un bouton ? )
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
		/*if(compteur==0) {
			resultat.setText("Malheureusement, vous avez perdu");
		}*/
	}


	@FXML 
	private void Handleselection() throws Exception {
		String t1 = T1.getText();
		String t2 = T2.getText();
		String t3 = T3.getText();
		String t4 = T4.getText();


		if (T1.getText().equals("") || T2.getText().equals("") || T3.getText().equals("") || T4.getText().equals("")){
			resultat.setText("Votre combinaison n'est pas complete !");
		}else {

			// VERIFICATION DU CODE ENTRE (a modifier, pas fini)

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
			resultat.setText(compteurfaux+" faux "+compteurvrai+" vrais "+compteurmalplace+" mal places ");
			compteurfaux=0;
			compteurvrai=0;
			compteurmalplace=0;
			
			/*System.out.println(Arrays.toString(retour));
			System.out.println(Arrays.toString(tablordi));
			System.out.println(Arrays.toString(tabmalplacemaiscorrecte));
			System.out.println(Arrays.toString(tabbienplace));
			System.out.println(Arrays.toString(tabverif));*/

			compteur--;
			if(compteur == 0) {
				resultat.setText("Malheureusement, vous avez perdu");
			}

			if(w==4) {
				resultat.setText("Bravo !!");
			}
			

			if ((l11.getText()).equals("") && l12.getText().equals("") && l13.getText().equals("") && l14.getText().equals("") && i==0) {
				l11.setText(t1);
				l12.setText(t2);
				l13.setText(t3);
				l14.setText(t4);
				T1.setText("");
				T2.setText("");
				T3.setText("");
				T4.setText("");
				rep1.setText(resultat.getText());
				i++;
				
			}
			else if ((l21.getText()).equals("") && l22.getText().equals("") && l23.getText().equals("") && l24.getText().equals("") && i==1) {
				l21.setText(t1);
				l22.setText(t2);
				l23.setText(t3);
				l24.setText(t4);
				T1.setText("");
				T2.setText("");
				T3.setText("");
				T4.setText("");
				rep2.setText(resultat.getText());
				i++;
			}
			else if ((l31.getText()).equals("") && l32.getText().equals("") && l33.getText().equals("") && l34.getText().equals("") && i==2) {
				l31.setText(t1);
				l32.setText(t2);
				l33.setText(t3);
				l34.setText(t4);
				T1.setText("");
				T2.setText("");
				T3.setText("");
				T4.setText("");
				rep3.setText(resultat.getText());
				i++;
			}
			else if ((l41.getText()).equals("") && l42.getText().equals("") && l43.getText().equals("") && l44.getText().equals("") && i==3) {
				l41.setText(t1);
				l42.setText(t2);
				l43.setText(t3);
				l44.setText(t4);
				T1.setText("");
				T2.setText("");
				T3.setText("");
				T4.setText("");
				rep4.setText(resultat.getText());
				i++;
			}
			else if ((l51.getText()).equals("") && l52.getText().equals("") && l53.getText().equals("") && l54.getText().equals("") && i==4) {
				l51.setText(t1);
				l52.setText(t2);
				l53.setText(t3);
				l54.setText(t4);
				T1.setText("");
				T2.setText("");
				T3.setText("");
				T4.setText("");
				rep5.setText(resultat.getText());
				i++;
			}
			else if ((l61.getText()).equals("") && l62.getText().equals("") && l63.getText().equals("") && l64.getText().equals("") && i==5) {
				l61.setText(t1);
				l62.setText(t2);
				l63.setText(t3);
				l64.setText(t4);
				T1.setText("");
				T2.setText("");
				T3.setText("");
				T4.setText("");
				rep6.setText(resultat.getText());
				i++;
			}
			else if ((l71.getText()).equals("") && l72.getText().equals("") && l73.getText().equals("") && l74.getText().equals("") && i==6) {
				l71.setText(t1);
				l72.setText(t2);
				l73.setText(t3);
				l74.setText(t4);
				T1.setText("");
				T2.setText("");
				T3.setText("");
				T4.setText("");
				rep7.setText(resultat.getText());
				i++;
			}
			else if ((l81.getText()).equals("") && l82.getText().equals("") && l83.getText().equals("") && l84.getText().equals("") && i==7) {
				l81.setText(t1);
				l82.setText(t2);
				l83.setText(t3);
				l84.setText(t4);
				T1.setText("");
				T2.setText("");
				T3.setText("");
				T4.setText("");
				rep8.setText(resultat.getText());
				i++;
			}
			else if ((l91.getText()).equals("") && l92.getText().equals("") && l93.getText().equals("") && l94.getText().equals("") && i==8) {
				l91.setText(t1);
				l92.setText(t2);
				l93.setText(t3);
				l94.setText(t4);
				T1.setText("");
				T2.setText("");
				T3.setText("");
				T4.setText("");
				rep9.setText(resultat.getText());
				i++;
			}
			else if ((l101.getText()).equals("") && l102.getText().equals("") && l103.getText().equals("") && l104.getText().equals("") && i==9) {
				l101.setText(t1);
				l102.setText(t2);
				l103.setText(t3);
				l104.setText(t4);
				T1.setText("");
				T2.setText("");
				T3.setText("");
				T4.setText("");
				rep10.setText(resultat.getText());
				i++;
			}
			else if ((l111.getText()).equals("") && l112.getText().equals("") && l113.getText().equals("") && l114.getText().equals("") && i==10) {
				l111.setText(t1);
				l112.setText(t2);
				l113.setText(t3);
				l114.setText(t4);
				T1.setText("");
				T2.setText("");
				T3.setText("");
				T4.setText("");
				rep11.setText(resultat.getText());
				i++;
			}
			else if ((l121.getText()).equals("") && l122.getText().equals("") && l123.getText().equals("") && l124.getText().equals("") && i==11) {
				l121.setText(t1);
				l122.setText(t2);
				l123.setText(t3);
				l124.setText(t4);
				T1.setText("");
				T2.setText("");
				T3.setText("");
				T4.setText("");
				if(compteur == 0) {
					rep12.setText("Perdu");
				}

				if(w==4) {
					rep12.setText("Bravo !!");
				}
			}


		}		
	}


	//methode couleur boutons soleil
	@FXML
	private void handleButtonsoleil1() throws Exception {
		tabluser[0]=3;
		T1.setText("☼");
	}

	@FXML
	private void handleButtonsoleil2() throws Exception {
		tabluser[1]=3;
		T2.setText("☼");	
	}
	@FXML
	private void handleButtonsoleil3() throws Exception {
		tabluser[2]=3;
		T3.setText("☼");
	}
	@FXML
	private void handleButtonsoleil4() throws Exception {
		tabluser[3]=3;
		T4.setText("☼");	
	}


	// methode couleur boutons note
	@FXML
	private void handleButtonnote1() throws Exception {
		tabluser[0]=2;
		T1.setText("♫");
	}

	@FXML
	private void handleButtonnote2() throws Exception {
		tabluser[1]=2;
		T2.setText("♫");

	}
	@FXML
	private void handleButtonnote3() throws Exception {
		tabluser[2]=2;
		T3.setText("♫");	

	}
	@FXML
	private void handleButtonnote4() throws Exception {
		tabluser[3]=2;
		T4.setText("♫");

	}


	//mï¿½thode couleur boutons coeur
	@FXML
	private void handleButtoncoeur1() throws Exception {
		tabluser[0]=5;
		T1.setText("♥");

	}
	@FXML
	private void handleButtoncoeur2() throws Exception {
		tabluser[1]=5;
		T2.setText("♥");

	}
	@FXML
	private void handleButtoncoeur3() throws Exception {
		tabluser[2]=5;
		T3.setText("♥");

	}
	@FXML
	private void handleButtoncoeur4() throws Exception {
		tabluser[3]=5;
		T4.setText("♥");
	}


	//methode couleur boutons rond barrÃ©
	@FXML
	private void handleButtontrond1() throws Exception {
		tabluser[0]=4;
		T1.setText("ø");

	}
	@FXML
	private void handleButtontrond2() throws Exception {
		tabluser[1]=4;
		T2.setText("ø");

	}
	@FXML
	private void handleButtontrond3() throws Exception {
		tabluser[2]=4;
		T3.setText("ø");

	}
	@FXML
	private void handleButtontrond4() throws Exception {
		tabluser[3]=4;
		T4.setText("ø");

	}


	//methode couleur boutons dollar
	@FXML
	private void handleButtondollard1() throws Exception {
		tabluser[0]=6;
		T1.setText("$");

	}
	@FXML
	private void handleButtondollard2() throws Exception {
		tabluser[1]=6;
		T2.setText("$");

	}
	@FXML
	private void handleButtondollard3() throws Exception {
		tabluser[2]=6;
		T3.setText("$");

	}
	@FXML
	private void handleButtondollard4() throws Exception {
		tabluser[3]=6;
		T4.setText("$");
	}


	//methode couleur boutons smiley
	@FXML
	private void handleButtonsmiley1() throws Exception {
		tabluser[0]=1;
		T1.setText("☺");		
	}
	@FXML
	private void handleButtonsmiley2() throws Exception {
		tabluser[1]=1;
		T2.setText("☺");	
	}
	@FXML
	private void handleButtonsmiley3() throws Exception {
		tabluser[2]=1;
		T3.setText("☺");
	}
	@FXML
	private void handleButtonsmiley4() throws Exception {
		tabluser[3]=1;
		T4.setText("☺");
	}
}