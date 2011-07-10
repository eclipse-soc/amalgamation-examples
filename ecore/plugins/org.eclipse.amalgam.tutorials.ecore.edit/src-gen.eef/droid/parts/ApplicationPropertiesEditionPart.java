/**
 * Generated with Acceleo
 */
package droid.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;



// End of user code

/**
 * 
 * 
 */
public interface ApplicationPropertiesEditionPart {

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
	 * @return the packageName
	 * 
	 */
	public String getPackageName();

	/**
	 * Defines a new packageName
	 * @param newValue the new packageName to set
	 * 
	 */
	public void setPackageName(String newValue);


	/**
	 * @return the versionCode
	 * 
	 */
	public String getVersionCode();

	/**
	 * Defines a new versionCode
	 * @param newValue the new versionCode to set
	 * 
	 */
	public void setVersionCode(String newValue);


	/**
	 * @return the versionName
	 * 
	 */
	public String getVersionName();

	/**
	 * Defines a new versionName
	 * @param newValue the new versionName to set
	 * 
	 */
	public void setVersionName(String newValue);




	/**
	 * Init the resources
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initResources(ReferencesTableSettings settings);

	/**
	 * Update the resources
	 * @param newValue the resources to update
	 * 
	 */
	public void updateResources();

	/**
	 * Adds the given filter to the resources edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToResources(ViewerFilter filter);

	/**
	 * Adds the given filter to the resources edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToResources(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the resources table
	 * 
	 */
	public boolean isContainedInResourcesTable(EObject element);




	/**
	 * Init the activities
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initActivities(ReferencesTableSettings settings);

	/**
	 * Update the activities
	 * @param newValue the activities to update
	 * 
	 */
	public void updateActivities();

	/**
	 * Adds the given filter to the activities edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToActivities(ViewerFilter filter);

	/**
	 * Adds the given filter to the activities edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToActivities(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the activities table
	 * 
	 */
	public boolean isContainedInActivitiesTable(EObject element);




	/**
	 * Init the layouts
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initLayouts(ReferencesTableSettings settings);

	/**
	 * Update the layouts
	 * @param newValue the layouts to update
	 * 
	 */
	public void updateLayouts();

	/**
	 * Adds the given filter to the layouts edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToLayouts(ViewerFilter filter);

	/**
	 * Adds the given filter to the layouts edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToLayouts(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the layouts table
	 * 
	 */
	public boolean isContainedInLayoutsTable(EObject element);





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
