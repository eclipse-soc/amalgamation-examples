/**
 * Generated with Acceleo
 */
package org.eclipse.amalgam.tutorials.emf.droid.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;



// End of user code

/**
 * 
 * 
 */
public interface MenuItemPropertiesEditionPart {



	/**
	 * Init the subMenus
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initSubMenus(ReferencesTableSettings settings);

	/**
	 * Update the subMenus
	 * @param newValue the subMenus to update
	 * 
	 */
	public void updateSubMenus();

	/**
	 * Adds the given filter to the subMenus edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSubMenus(ViewerFilter filter);

	/**
	 * Adds the given filter to the subMenus edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSubMenus(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the subMenus table
	 * 
	 */
	public boolean isContainedInSubMenusTable(EObject element);





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
