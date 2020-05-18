import java.awt.*;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Arbre extends ArbreVariables{	

	Arbre(int x,int y, String imageURL){
		super(x,y);
		if(imageURL!="maison.gif") { 
		try {
    		imageArbre = ImageIO.read(new File("Images/Arbres/"+imageURL));
    	}
   		catch(IOException exc) {}
   		if(imageURL=="arbre3.gif") { this.type="Sapin"; }
   		if(imageURL=="arbre2.gif") { this.type="Bouleau"; }
   		if(imageURL=="arbre.gif") { this.type="Chene"; }
   		}
   		else {
   			this.type="Maison";
   			int nombreAleatoire = 1 + (int)(Math.random() * ((3 - 1) + 1));
   			if(nombreAleatoire==1) {
				try {
    				imageArbre = ImageIO.read(new File("Images/Arbres/maison1.gif"));
    			}
   				catch(IOException exc) {} 
			}
			if(nombreAleatoire==2) {
				try {
    				imageArbre = ImageIO.read(new File("Images/Arbres/maison2.gif"));
    			}
   				catch(IOException exc) {}
			}
			if(nombreAleatoire==3) {
				try {
    				imageArbre = ImageIO.read(new File("Images/Arbres/maison3.gif"));
    			}
   				catch(IOException exc) {}
			}
   		}
	}

	void paint(Graphics g){
		if(this.PV>0) {
    		g.drawImage(imageArbre,this.x,this.y,null);
		}
		else {
			if(this.type!="Maison") {
			g.drawImage(imageArbreBrule,this.x,this.y,null);
			}
		}
		if(enFeu){
		if (this.PV%4==0) {
    		g.drawImage(feu1,this.x,this.y,null);
    	}

    	if (this.PV%4==1) {
			g.drawImage(feu2,this.x,this.y,null);
    	}

    	if (this.PV%4==2) {
			g.drawImage(feu3,this.x,this.y,null);
    	}

    	if (this.PV%4==3) {
			g.drawImage(feu4,this.x,this.y,null);
    	}

		}
	}

	void paintXY(Graphics g, int x, int y) {
		if(this.PV>0) {
    		g.drawImage(imageArbre,x,y,null);
		}
		else {
			g.drawImage(imageArbreBrule,x,y,null);
		}
		if(enFeu){ 
			g.drawImage(feu1,x,y,null);
		}
	}

}
