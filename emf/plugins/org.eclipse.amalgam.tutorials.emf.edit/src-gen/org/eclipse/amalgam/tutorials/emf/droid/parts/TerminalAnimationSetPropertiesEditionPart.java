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
public interface TerminalAnimationSetPropertiesEditionPart {

	/**
	 * @return the shareInterpolator
	 * 
	 */
	public Boolean getShareInterpolator();

	/**
	 * Defines a new shareInterpolator
	 * @param newValue the new shareInterpolator to set
	 * 
	 */
	public void setShareInterpolator(Boolean newValue);




	/**
	 * Init the elements
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initElements(ReferencesTableSettings settings);

	/**
	 * Update the elements
	 * @param newValue the elements to update
	 * 
	 */
	public void updateElements();

	/**
	 * Adds the given filter to the elements edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToElements(ViewerFilter filter);

	/**
	 * Adds the given filter to the elements edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToElements(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the elements table
	 * 
	 */
	public boolean isContainedInElementsTable(EObject element);





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
