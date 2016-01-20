package netbiodyn;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.HashMap;

import netbiodyn.util.RandomGen;

public class compartment{
	private String name;
	private ArrayList<Integer> center= new ArrayList();
	private ArrayList radius= new ArrayList<Integer>();
	private Entity ent= new Entity();
	public compartment(){
		
		
	}
	
	public void Addcenter(int x,int y){
		center.add(x);
		center.add(y);
		
	}
public void Addradius(int len){
	radius.add(len);
	
}
public Entity entity_property(){
	 ent.setEtiquettes(name);
     ent.Couleur = new Color(RandomGen.getInstance().nextInt(250),RandomGen.getInstance().nextInt(250), RandomGen.getInstance().nextInt(250));
     ent._visibleDansPanel=true;
     ent.Vidable=true;
     ent.DemieVie=0;
     ent._forme = 0;
     ent._taille = 0;
//     if (BackgroundImage != null) {
//         ent._str_image_deco=_str_image_deco;
//     }
//	
	return ent;
}


}