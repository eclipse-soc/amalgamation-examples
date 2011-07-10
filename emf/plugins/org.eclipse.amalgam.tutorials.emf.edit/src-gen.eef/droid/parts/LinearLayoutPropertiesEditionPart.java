/**
 * Generated with Acceleo
 */
package droid.parts;

// Start of user code for imports
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.ViewerFilter;



// End of user code

/**
 * 
 * 
 */
public interface LinearLayoutPropertiesEditionPart {

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
	 * @return the alpha
	 * 
	 */
	public String getAlpha();

	/**
	 * Defines a new alpha
	 * @param newValue the new alpha to set
	 * 
	 */
	public void setAlpha(String newValue);


	/**
	 * @return the nextFocusDown
	 * 
	 */
	public EObject getNextFocusDown();

	/**
	 * Init the nextFocusDown
	 * @param settings the combo setting
	 */
	public void initNextFocusDown(EObjectFlatComboSettings settings);

	/**
	 * Defines a new nextFocusDown
	 * @param newValue the new nextFocusDown to set
	 * 
	 */
	public void setNextFocusDown(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setNextFocusDownButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the nextFocusDown edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToNextFocusDown(ViewerFilter filter);

	/**
	 * Adds the given filter to the nextFocusDown edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToNextFocusDown(ViewerFilter filter);


	/**
	 * @return the nextFocusLeft
	 * 
	 */
	public EObject getNextFocusLeft();

	/**
	 * Init the nextFocusLeft
	 * @param settings the combo setting
	 */
	public void initNextFocusLeft(EObjectFlatComboSettings settings);

	/**
	 * Defines a new nextFocusLeft
	 * @param newValue the new nextFocusLeft to set
	 * 
	 */
	public void setNextFocusLeft(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setNextFocusLeftButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the nextFocusLeft edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToNextFocusLeft(ViewerFilter filter);

	/**
	 * Adds the given filter to the nextFocusLeft edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToNextFocusLeft(ViewerFilter filter);


	/**
	 * @return the nextFocusRight
	 * 
	 */
	public EObject getNextFocusRight();

	/**
	 * Init the nextFocusRight
	 * @param settings the combo setting
	 */
	public void initNextFocusRight(EObjectFlatComboSettings settings);

	/**
	 * Defines a new nextFocusRight
	 * @param newValue the new nextFocusRight to set
	 * 
	 */
	public void setNextFocusRight(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setNextFocusRightButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the nextFocusRight edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToNextFocusRight(ViewerFilter filter);

	/**
	 * Adds the given filter to the nextFocusRight edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToNextFocusRight(ViewerFilter filter);


	/**
	 * @return the nextFocusUp
	 * 
	 */
	public EObject getNextFocusUp();

	/**
	 * Init the nextFocusUp
	 * @param settings the combo setting
	 */
	public void initNextFocusUp(EObjectFlatComboSettings settings);

	/**
	 * Defines a new nextFocusUp
	 * @param newValue the new nextFocusUp to set
	 * 
	 */
	public void setNextFocusUp(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setNextFocusUpButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the nextFocusUp edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToNextFocusUp(ViewerFilter filter);

	/**
	 * Adds the given filter to the nextFocusUp edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToNextFocusUp(ViewerFilter filter);


	/**
	 * @return the visibility
	 * 
	 */
	public Enumerator getVisibility();

	/**
	 * Init the visibility
	 * @param eenum the enum to manage
	 * @param current the current value
	 */
	public void initVisibility(EEnum eenum, Enumerator current);

	/**
	 * Defines a new visibility
	 * @param newValue the new visibility to set
	 * 
	 */
	public void setVisibility(Enumerator newValue);


	/**
	 * @return the orientation
	 * 
	 */
	public Enumerator getOrientation();

	/**
	 * Init the orientation
	 * @param eenum the enum to manage
	 * @param current the current value
	 */
	public void initOrientation(EEnum eenum, Enumerator current);

	/**
	 * Defines a new orientation
	 * @param newValue the new orientation to set
	 * 
	 */
	public void setOrientation(Enumerator newValue);





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
