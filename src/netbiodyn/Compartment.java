package netbiodyn;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JTextArea;
import javax.swing.JTextPane;

import netbiodyn.util.RandomGen;

public class Compartment{
	private String name;
	private ArrayList<Integer> center= new ArrayList<Integer>();
	private ArrayList<Integer> radius= new ArrayList<Integer>();
	private Entity ent= new Entity();
	public Color Couleur = Color.RED;
	public boolean _visibleDansPanel = true;
	public boolean Vidable = true;
	protected JTextPane _description = new JTextPane();
	
	public Compartment(){}
	
    public Compartment clone() {
        Compartment comp = new Compartment();
        comp.setEtiquette(getEtiquette());
        comp.Couleur = Couleur;
        comp._visibleDansPanel = _visibleDansPanel;
        comp.Vidable = Vidable;
        return comp;
    }
	
	public JTextPane getDescription() {
		return _description;
	}

	public void setDescription( JTextPane _description) {
		this._description = _description;
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
     ent.Vidable = true;
     ent.DemieVie=0;
     ent._forme = 0;
     ent._taille = 0;
//     if (BackgroundImage != null) {
//         ent._str_image_deco=_str_image_deco;
//     }
//	
	return ent;
}


public String getEtiquette() {
	return name;
}

public void setEtiquette(String name) {
	this.name = name;
}

public ArrayList<Integer> getCenter() {
	return center;
}

public void setCenter(ArrayList<Integer> center) {
	this.center = center;
}

public ArrayList<Integer> getRadius() {
	return radius;
}

public void setRadius(ArrayList<Integer> radius) {
	this.radius = radius;
}

public Entity getEnt() {
	return ent;
}

public void setEnt(Entity ent) {
	this.ent = ent;
}

}