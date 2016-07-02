package Katalog;

import java.awt.*;
import javax.swing.*;

public class KatalogMain extends JFrame{

	public static void main(String[] args) {
		System.out.println("Hello world");

		//new KatalogMain();
		Piosenka p1 = new Piosenka("lol",1,1);
		Piosenka p2 = new Piosenka("lol",1,1);
		//test
		if(p1==p2)
			System.out.println("takie same");
		else
			System.out.println("rozne");
	}
	public KatalogMain(){
		
		this.setSize(400,400);
		this.setVisible(true);
		
	}

}
