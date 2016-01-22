import java.io.File;
import javax.swing.*;
import org.sbml.jsbml.*;

/** Displays the content of an SBML file in a {@link JTree} */

public class JSBMLvisualizer extends JFrame {
	private static final long serialVersionUID = 6864318867423022411L;
	
/** @param document The sbml root node of an SBML file */
	public JSBMLvisualizer(SBMLDocument document) {
	    super(document.getModel().getId());
	    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	    getContentPane().add(new JScrollPane(new JTree(document)));
	    pack(); // make the frame compact
	    setAlwaysOnTop(true);
	    setLocationRelativeTo(null); // Place it at the center of the screen
	    setVisible(true);
  }
  /** @param args Expects a valid path to an SBML file. */ 
	public static void main(String[] args) throws Exception {
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		SBMLReader slread = new SBMLReader();
		SBMLDocument here = slread.readSBML(new File("/net/cremi/aperdriau65n/BIOMD0000000033.xml"));
		
		/*SBMLDocument here = mainFile(args[0]);*/
		new JSBMLvisualizer(here);
  }
}
