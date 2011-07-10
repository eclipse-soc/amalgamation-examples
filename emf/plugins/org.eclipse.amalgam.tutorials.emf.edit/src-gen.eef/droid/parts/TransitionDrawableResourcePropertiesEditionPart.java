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
public interface TransitionDrawableResourcePropertiesEditionPart {

	/**
	 * @return the name
	 * 
	 */
	public String getName();

	/**
	 * Defines a new name
	 * @param newValue the new name to set
	 * 
	 */
	public void setName(String newValue);


	/**
	 * @return the from
	 * 
	 */
	public EObject getFrom();

	/**
	 * Init the from
	 * @param settings the combo setting
	 */
	public void initFrom(EObjectFlatComboSettings settings);

	/**
	 * Defines a new from
	 * @param newValue the new from to set
	 * 
	 */
	public void setFrom(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setFromButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the from edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToFrom(ViewerFilter filter);

	/**
	 * Adds the given filter to the from edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToFrom(ViewerFilter filter);


	/**
	 * @return the to
	 * 
	 */
	public EObject getTo();

	/**
	 * Init the to
	 * @param settings the combo setting
	 */
	public void initTo(EObjectFlatComboSettings settings);

	/**
	 * Defines a new to
	 * @param newValue the new to to set
	 * 
	 */
	public void setTo(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setToButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the to edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToTo(ViewerFilter filter);

	/**
	 * Adds the given filter to the to edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToTo(ViewerFilter filter);





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
