/**
 * Generated with Acceleo
 */
package org.eclipse.amalgam.tutorials.emf.droid.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;



// End of user code

/**
 * 
 * 
 */
public interface ListActivityPropertiesEditionPart {

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
	 * @return the dataSource
	 * 
	 */
	public String getDataSource();

	/**
	 * Defines a new dataSource
	 * @param newValue the new dataSource to set
	 * 
	 */
	public void setDataSource(String newValue);


	/**
	 * @return the itemLayout
	 * 
	 */
	public EObject getItemLayout();

	/**
	 * Init the itemLayout
	 * @param settings the combo setting
	 */
	public void initItemLayout(EObjectFlatComboSettings settings);

	/**
	 * Defines a new itemLayout
	 * @param newValue the new itemLayout to set
	 * 
	 */
	public void setItemLayout(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setItemLayoutButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the itemLayout edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToItemLayout(ViewerFilter filter);

	/**
	 * Adds the given filter to the itemLayout edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToItemLayout(ViewerFilter filter);




	/**
	 * Init the actions
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initActions(ReferencesTableSettings settings);

	/**
	 * Update the actions
	 * @param newValue the actions to update
	 * 
	 */
	public void updateActions();

	/**
	 * Adds the given filter to the actions edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToActions(ViewerFilter filter);

	/**
	 * Adds the given filter to the actions edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToActions(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the actions table
	 * 
	 */
	public boolean isContainedInActionsTable(EObject element);





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
