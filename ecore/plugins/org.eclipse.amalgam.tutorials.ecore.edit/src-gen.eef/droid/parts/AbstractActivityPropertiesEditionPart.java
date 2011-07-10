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
public interface AbstractActivityPropertiesEditionPart {

	/**
	 * @return the referencedLayout
	 * 
	 */
	public EObject getReferencedLayout();

	/**
	 * Init the referencedLayout
	 * @param settings the combo setting
	 */
	public void initReferencedLayout(EObjectFlatComboSettings settings);

	/**
	 * Defines a new referencedLayout
	 * @param newValue the new referencedLayout to set
	 * 
	 */
	public void setReferencedLayout(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setReferencedLayoutButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the referencedLayout edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToReferencedLayout(ViewerFilter filter);

	/**
	 * Adds the given filter to the referencedLayout edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToReferencedLayout(ViewerFilter filter);





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
