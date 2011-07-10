/**
 * Generated with Acceleo
 */
package droid.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.ViewerFilter;



// End of user code

/**
 * 
 * 
 */
public interface ShowLayoutActionPropertiesEditionPart {

	/**
	 * @return the layout
	 * 
	 */
	public EObject getLayout();

	/**
	 * Init the layout
	 * @param settings the combo setting
	 */
	public void initLayout(EObjectFlatComboSettings settings);

	/**
	 * Defines a new layout
	 * @param newValue the new layout to set
	 * 
	 */
	public void setLayout(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setLayoutButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the layout edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToLayout(ViewerFilter filter);

	/**
	 * Adds the given filter to the layout edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToLayout(ViewerFilter filter);





	/**
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * 
	 */
	public String getTitle();

	// Start of user code for additional methods
	
	// End of user code

}
