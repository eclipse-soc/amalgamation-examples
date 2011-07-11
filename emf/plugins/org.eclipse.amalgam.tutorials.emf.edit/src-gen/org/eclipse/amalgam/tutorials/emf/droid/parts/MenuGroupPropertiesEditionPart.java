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
public interface MenuGroupPropertiesEditionPart {



	/**
	 * Init the items
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initItems(ReferencesTableSettings settings);

	/**
	 * Update the items
	 * @param newValue the items to update
	 * 
	 */
	public void updateItems();

	/**
	 * Adds the given filter to the items edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToItems(ViewerFilter filter);

	/**
	 * Adds the given filter to the items edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToItems(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the items table
	 * 
	 */
	public boolean isContainedInItemsTable(EObject element);





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
