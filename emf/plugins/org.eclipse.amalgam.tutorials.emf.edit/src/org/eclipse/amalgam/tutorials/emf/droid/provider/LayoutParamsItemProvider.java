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
import org.eclipse.amalgam.tutorials.emf.droid.LayoutParams;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.amalgam.tutorials.emf.droid.LayoutParams} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LayoutParamsItemProvider
	extends ItemProviderAdapter
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
	public LayoutParamsItemProvider(AdapterFactory adapterFactory) {
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

			addLayout_abovePropertyDescriptor(object);
			addLayout_alignBaselinePropertyDescriptor(object);
			addLayout_alignBottomPropertyDescriptor(object);
			addLayout_alignLeftPropertyDescriptor(object);
			addLayout_alignTopPropertyDescriptor(object);
			addLayout_belowPropertyDescriptor(object);
			addLayout_toLeftOfPropertyDescriptor(object);
			addLayout_toRightOfPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Layout above feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLayout_abovePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LayoutParams_layout_above_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LayoutParams_layout_above_feature", "_UI_LayoutParams_type"),
				 DroidPackage.eINSTANCE.getLayoutParams_Layout_above(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Layout align Baseline feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLayout_alignBaselinePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LayoutParams_layout_alignBaseline_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LayoutParams_layout_alignBaseline_feature", "_UI_LayoutParams_type"),
				 DroidPackage.eINSTANCE.getLayoutParams_Layout_alignBaseline(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Layout align Bottom feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLayout_alignBottomPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LayoutParams_layout_alignBottom_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LayoutParams_layout_alignBottom_feature", "_UI_LayoutParams_type"),
				 DroidPackage.eINSTANCE.getLayoutParams_Layout_alignBottom(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Layout align Left feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLayout_alignLeftPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LayoutParams_layout_alignLeft_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LayoutParams_layout_alignLeft_feature", "_UI_LayoutParams_type"),
				 DroidPackage.eINSTANCE.getLayoutParams_Layout_alignLeft(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Layout align Top feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLayout_alignTopPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LayoutParams_layout_alignTop_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LayoutParams_layout_alignTop_feature", "_UI_LayoutParams_type"),
				 DroidPackage.eINSTANCE.getLayoutParams_Layout_alignTop(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Layout below feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLayout_belowPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LayoutParams_layout_below_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LayoutParams_layout_below_feature", "_UI_LayoutParams_type"),
				 DroidPackage.eINSTANCE.getLayoutParams_Layout_below(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Layout to Left Of feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLayout_toLeftOfPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LayoutParams_layout_toLeftOf_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LayoutParams_layout_toLeftOf_feature", "_UI_LayoutParams_type"),
				 DroidPackage.eINSTANCE.getLayoutParams_Layout_toLeftOf(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Layout to Right Of feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLayout_toRightOfPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LayoutParams_layout_toRightOf_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LayoutParams_layout_toRightOf_feature", "_UI_LayoutParams_type"),
				 DroidPackage.eINSTANCE.getLayoutParams_Layout_toRightOf(),
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(DroidPackage.eINSTANCE.getLayoutParams_Layout_height());
			childrenFeatures.add(DroidPackage.eINSTANCE.getLayoutParams_Layout_width());
			childrenFeatures.add(DroidPackage.eINSTANCE.getLayoutParams_Layout_weight());
			childrenFeatures.add(DroidPackage.eINSTANCE.getLayoutParams_Layout_marginBottom());
			childrenFeatures.add(DroidPackage.eINSTANCE.getLayoutParams_Layout_marginLeft());
			childrenFeatures.add(DroidPackage.eINSTANCE.getLayoutParams_Layout_marginRight());
			childrenFeatures.add(DroidPackage.eINSTANCE.getLayoutParams_Layout_marginTop());
			childrenFeatures.add(DroidPackage.eINSTANCE.getLayoutParams_Layout_alignParentBottom());
			childrenFeatures.add(DroidPackage.eINSTANCE.getLayoutParams_Layout_alignParentLeft());
			childrenFeatures.add(DroidPackage.eINSTANCE.getLayoutParams_Layout_alignParentRight());
			childrenFeatures.add(DroidPackage.eINSTANCE.getLayoutParams_Layout_alignParentTop());
			childrenFeatures.add(DroidPackage.eINSTANCE.getLayoutParams_Layout_alignWithParentIfMissing());
			childrenFeatures.add(DroidPackage.eINSTANCE.getLayoutParams_Layout_centerHorizontal());
			childrenFeatures.add(DroidPackage.eINSTANCE.getLayoutParams_Layout_centerInParent());
			childrenFeatures.add(DroidPackage.eINSTANCE.getLayoutParams_Layout_centerVertical());
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
	 * This returns LayoutParams.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LayoutParams"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_LayoutParams_type");
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

		switch (notification.getFeatureID(LayoutParams.class)) {
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_HEIGHT:
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_WIDTH:
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_WEIGHT:
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_MARGIN_BOTTOM:
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_MARGIN_LEFT:
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_MARGIN_RIGHT:
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_MARGIN_TOP:
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_ALIGN_PARENT_BOTTOM:
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_ALIGN_PARENT_LEFT:
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_ALIGN_PARENT_RIGHT:
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_ALIGN_PARENT_TOP:
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_ALIGN_WITH_PARENT_IF_MISSING:
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_CENTER_HORIZONTAL:
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_CENTER_IN_PARENT:
			case DroidPackage.LAYOUT_PARAMS__LAYOUT_CENTER_VERTICAL:
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
				(DroidPackage.eINSTANCE.getLayoutParams_Layout_height(),
				 DroidFactory.eINSTANCE.createDimensionVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getLayoutParams_Layout_height(),
				 DroidFactory.eINSTANCE.createLayoutDimensionVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getLayoutParams_Layout_width(),
				 DroidFactory.eINSTANCE.createDimensionVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getLayoutParams_Layout_width(),
				 DroidFactory.eINSTANCE.createLayoutDimensionVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getLayoutParams_Layout_weight(),
				 DroidFactory.eINSTANCE.createIntegerVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getLayoutParams_Layout_marginBottom(),
				 DroidFactory.eINSTANCE.createDimensionVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getLayoutParams_Layout_marginLeft(),
				 DroidFactory.eINSTANCE.createDimensionVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getLayoutParams_Layout_marginRight(),
				 DroidFactory.eINSTANCE.createDimensionVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getLayoutParams_Layout_marginTop(),
				 DroidFactory.eINSTANCE.createDimensionVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getLayoutParams_Layout_alignParentBottom(),
				 DroidFactory.eINSTANCE.createBooleanVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getLayoutParams_Layout_alignParentLeft(),
				 DroidFactory.eINSTANCE.createBooleanVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getLayoutParams_Layout_alignParentRight(),
				 DroidFactory.eINSTANCE.createBooleanVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getLayoutParams_Layout_alignParentTop(),
				 DroidFactory.eINSTANCE.createBooleanVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getLayoutParams_Layout_alignWithParentIfMissing(),
				 DroidFactory.eINSTANCE.createBooleanVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getLayoutParams_Layout_centerHorizontal(),
				 DroidFactory.eINSTANCE.createBooleanVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getLayoutParams_Layout_centerInParent(),
				 DroidFactory.eINSTANCE.createBooleanVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getLayoutParams_Layout_centerVertical(),
				 DroidFactory.eINSTANCE.createBooleanVA()));
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
			childFeature == DroidPackage.eINSTANCE.getLayoutParams_Layout_height() ||
			childFeature == DroidPackage.eINSTANCE.getLayoutParams_Layout_width() ||
			childFeature == DroidPackage.eINSTANCE.getLayoutParams_Layout_marginBottom() ||
			childFeature == DroidPackage.eINSTANCE.getLayoutParams_Layout_marginLeft() ||
			childFeature == DroidPackage.eINSTANCE.getLayoutParams_Layout_marginRight() ||
			childFeature == DroidPackage.eINSTANCE.getLayoutParams_Layout_marginTop() ||
			childFeature == DroidPackage.eINSTANCE.getLayoutParams_Layout_alignParentBottom() ||
			childFeature == DroidPackage.eINSTANCE.getLayoutParams_Layout_alignParentLeft() ||
			childFeature == DroidPackage.eINSTANCE.getLayoutParams_Layout_alignParentRight() ||
			childFeature == DroidPackage.eINSTANCE.getLayoutParams_Layout_alignParentTop() ||
			childFeature == DroidPackage.eINSTANCE.getLayoutParams_Layout_alignWithParentIfMissing() ||
			childFeature == DroidPackage.eINSTANCE.getLayoutParams_Layout_centerHorizontal() ||
			childFeature == DroidPackage.eINSTANCE.getLayoutParams_Layout_centerInParent() ||
			childFeature == DroidPackage.eINSTANCE.getLayoutParams_Layout_centerVertical();

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return DroidModelEditPlugin.INSTANCE;
	}

}
