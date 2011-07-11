/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.amalgam.tutorials.emf.droid.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.amalgam.tutorials.emf.droid.DroidFactory;
import org.eclipse.amalgam.tutorials.emf.droid.DroidPackage;
import org.eclipse.amalgam.tutorials.emf.droid.TabWidget;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.amalgam.tutorials.emf.droid.TabWidget} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TabWidgetItemProvider
	extends AbstractLinearLayoutItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TabWidgetItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addGravityPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Gravity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGravityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TabWidget_gravity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TabWidget_gravity_feature", "_UI_TabWidget_type"),
				 DroidPackage.eINSTANCE.getTabWidget_Gravity(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(DroidPackage.eINSTANCE.getTabWidget_Divider());
			childrenFeatures.add(DroidPackage.eINSTANCE.getTabWidget_TrabStripEnabled());
			childrenFeatures.add(DroidPackage.eINSTANCE.getTabWidget_TrabStripLeft());
			childrenFeatures.add(DroidPackage.eINSTANCE.getTabWidget_TabStripRight());
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns TabWidget.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TabWidget"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TabWidget)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_TabWidget_type") :
			getString("_UI_TabWidget_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(TabWidget.class)) {
			case DroidPackage.TAB_WIDGET__GRAVITY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DroidPackage.TAB_WIDGET__DIVIDER:
			case DroidPackage.TAB_WIDGET__TRAB_STRIP_ENABLED:
			case DroidPackage.TAB_WIDGET__TRAB_STRIP_LEFT:
			case DroidPackage.TAB_WIDGET__TAB_STRIP_RIGHT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getTabWidget_Divider(),
				 DroidFactory.eINSTANCE.createColorVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getTabWidget_Divider(),
				 DroidFactory.eINSTANCE.createAnyDrawableVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getTabWidget_Divider(),
				 DroidFactory.eINSTANCE.createDrawableVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getTabWidget_TrabStripEnabled(),
				 DroidFactory.eINSTANCE.createBooleanVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getTabWidget_TrabStripLeft(),
				 DroidFactory.eINSTANCE.createColorVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getTabWidget_TrabStripLeft(),
				 DroidFactory.eINSTANCE.createAnyDrawableVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getTabWidget_TrabStripLeft(),
				 DroidFactory.eINSTANCE.createDrawableVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getTabWidget_TabStripRight(),
				 DroidFactory.eINSTANCE.createColorVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getTabWidget_TabStripRight(),
				 DroidFactory.eINSTANCE.createAnyDrawableVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getTabWidget_TabStripRight(),
				 DroidFactory.eINSTANCE.createDrawableVA()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == DroidPackage.eINSTANCE.getView_Background() ||
			childFeature == DroidPackage.eINSTANCE.getTabWidget_Divider() ||
			childFeature == DroidPackage.eINSTANCE.getTabWidget_TrabStripLeft() ||
			childFeature == DroidPackage.eINSTANCE.getTabWidget_TabStripRight() ||
			childFeature == DroidPackage.eINSTANCE.getLayout_MinHeight() ||
			childFeature == DroidPackage.eINSTANCE.getLayout_MinWidth() ||
			childFeature == DroidPackage.eINSTANCE.getLayout_Padding() ||
			childFeature == DroidPackage.eINSTANCE.getLayout_PaddingBottom() ||
			childFeature == DroidPackage.eINSTANCE.getLayout_PaddingLeft() ||
			childFeature == DroidPackage.eINSTANCE.getLayout_PaddingRight() ||
			childFeature == DroidPackage.eINSTANCE.getLayout_PaddingTop() ||
			childFeature == DroidPackage.eINSTANCE.getLayout_Scrollbars() ||
			childFeature == DroidPackage.eINSTANCE.getTabWidget_TrabStripEnabled();

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
