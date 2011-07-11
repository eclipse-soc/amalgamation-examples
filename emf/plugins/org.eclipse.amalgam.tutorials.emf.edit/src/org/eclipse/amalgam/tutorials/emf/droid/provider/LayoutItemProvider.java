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
import org.eclipse.amalgam.tutorials.emf.droid.Layout;

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
 * This is the item provider adapter for a {@link org.eclipse.amalgam.tutorials.emf.droid.Layout} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LayoutItemProvider
	extends ViewItemProvider
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
	public LayoutItemProvider(AdapterFactory adapterFactory) {
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

			addAlphaPropertyDescriptor(object);
			addNextFocusDownPropertyDescriptor(object);
			addNextFocusLeftPropertyDescriptor(object);
			addNextFocusRightPropertyDescriptor(object);
			addNextFocusUpPropertyDescriptor(object);
			addVisibilityPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Alpha feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAlphaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Layout_alpha_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Layout_alpha_feature", "_UI_Layout_type"),
				 DroidPackage.eINSTANCE.getLayout_Alpha(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Next Focus Down feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNextFocusDownPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Layout_nextFocusDown_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Layout_nextFocusDown_feature", "_UI_Layout_type"),
				 DroidPackage.eINSTANCE.getLayout_NextFocusDown(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Next Focus Left feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNextFocusLeftPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Layout_nextFocusLeft_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Layout_nextFocusLeft_feature", "_UI_Layout_type"),
				 DroidPackage.eINSTANCE.getLayout_NextFocusLeft(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Next Focus Right feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNextFocusRightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Layout_nextFocusRight_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Layout_nextFocusRight_feature", "_UI_Layout_type"),
				 DroidPackage.eINSTANCE.getLayout_NextFocusRight(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Next Focus Up feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNextFocusUpPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Layout_nextFocusUp_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Layout_nextFocusUp_feature", "_UI_Layout_type"),
				 DroidPackage.eINSTANCE.getLayout_NextFocusUp(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Visibility feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVisibilityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Layout_visibility_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Layout_visibility_feature", "_UI_Layout_type"),
				 DroidPackage.eINSTANCE.getLayout_Visibility(),
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
			childrenFeatures.add(DroidPackage.eINSTANCE.getLayout_MinHeight());
			childrenFeatures.add(DroidPackage.eINSTANCE.getLayout_MinWidth());
			childrenFeatures.add(DroidPackage.eINSTANCE.getLayout_OnClick());
			childrenFeatures.add(DroidPackage.eINSTANCE.getLayout_Padding());
			childrenFeatures.add(DroidPackage.eINSTANCE.getLayout_PaddingBottom());
			childrenFeatures.add(DroidPackage.eINSTANCE.getLayout_PaddingLeft());
			childrenFeatures.add(DroidPackage.eINSTANCE.getLayout_PaddingRight());
			childrenFeatures.add(DroidPackage.eINSTANCE.getLayout_PaddingTop());
			childrenFeatures.add(DroidPackage.eINSTANCE.getLayout_Scrollbars());
			childrenFeatures.add(DroidPackage.eINSTANCE.getLayout_LayoutAnimation());
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
	 * This returns Layout.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Layout"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Layout)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Layout_type") :
			getString("_UI_Layout_type") + " " + label;
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

		switch (notification.getFeatureID(Layout.class)) {
			case DroidPackage.LAYOUT__ALPHA:
			case DroidPackage.LAYOUT__VISIBILITY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DroidPackage.LAYOUT__MIN_HEIGHT:
			case DroidPackage.LAYOUT__MIN_WIDTH:
			case DroidPackage.LAYOUT__ON_CLICK:
			case DroidPackage.LAYOUT__PADDING:
			case DroidPackage.LAYOUT__PADDING_BOTTOM:
			case DroidPackage.LAYOUT__PADDING_LEFT:
			case DroidPackage.LAYOUT__PADDING_RIGHT:
			case DroidPackage.LAYOUT__PADDING_TOP:
			case DroidPackage.LAYOUT__SCROLLBARS:
			case DroidPackage.LAYOUT__LAYOUT_ANIMATION:
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
				(DroidPackage.eINSTANCE.getLayout_MinHeight(),
				 DroidFactory.eINSTANCE.createDimensionVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getLayout_MinWidth(),
				 DroidFactory.eINSTANCE.createDimensionVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getLayout_OnClick(),
				 DroidFactory.eINSTANCE.createAction()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getLayout_OnClick(),
				 DroidFactory.eINSTANCE.createGoToURLAction()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getLayout_OnClick(),
				 DroidFactory.eINSTANCE.createShowLayoutAction()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getLayout_OnClick(),
				 DroidFactory.eINSTANCE.createInvokeActivityAction()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getLayout_Padding(),
				 DroidFactory.eINSTANCE.createDimensionVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getLayout_PaddingBottom(),
				 DroidFactory.eINSTANCE.createDimensionVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getLayout_PaddingLeft(),
				 DroidFactory.eINSTANCE.createDimensionVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getLayout_PaddingRight(),
				 DroidFactory.eINSTANCE.createDimensionVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getLayout_PaddingTop(),
				 DroidFactory.eINSTANCE.createDimensionVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getLayout_Scrollbars(),
				 DroidFactory.eINSTANCE.createBooleanVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getLayout_LayoutAnimation(),
				 DroidFactory.eINSTANCE.createAnimationVA()));
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
			childFeature == DroidPackage.eINSTANCE.getLayout_MinHeight() ||
			childFeature == DroidPackage.eINSTANCE.getLayout_MinWidth() ||
			childFeature == DroidPackage.eINSTANCE.getLayout_Padding() ||
			childFeature == DroidPackage.eINSTANCE.getLayout_PaddingBottom() ||
			childFeature == DroidPackage.eINSTANCE.getLayout_PaddingLeft() ||
			childFeature == DroidPackage.eINSTANCE.getLayout_PaddingRight() ||
			childFeature == DroidPackage.eINSTANCE.getLayout_PaddingTop();

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
