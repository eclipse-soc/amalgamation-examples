/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.amalgam.tutorials.emf.droid.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.amalgam.tutorials.emf.droid.CheckBox;
import org.eclipse.amalgam.tutorials.emf.droid.DroidFactory;
import org.eclipse.amalgam.tutorials.emf.droid.DroidPackage;

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
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.amalgam.tutorials.emf.droid.CheckBox} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CheckBoxItemProvider
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
	public CheckBoxItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addAutoLinkPropertyDescriptor(object);
			addCapitalizePropertyDescriptor(object);
			addGravityPropertyDescriptor(object);
			addTypefacePropertyDescriptor(object);
			addTextStylePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CheckBox_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CheckBox_name_feature", "_UI_CheckBox_type"),
				 DroidPackage.eINSTANCE.getCheckBox_Name(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Auto Link feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAutoLinkPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CheckBox_autoLink_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CheckBox_autoLink_feature", "_UI_CheckBox_type"),
				 DroidPackage.eINSTANCE.getCheckBox_AutoLink(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Capitalize feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCapitalizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CheckBox_capitalize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CheckBox_capitalize_feature", "_UI_CheckBox_type"),
				 DroidPackage.eINSTANCE.getCheckBox_Capitalize(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
				 getString("_UI_CheckBox_gravity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CheckBox_gravity_feature", "_UI_CheckBox_type"),
				 DroidPackage.eINSTANCE.getCheckBox_Gravity(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Typeface feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypefacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CheckBox_typeface_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CheckBox_typeface_feature", "_UI_CheckBox_type"),
				 DroidPackage.eINSTANCE.getCheckBox_Typeface(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Text Style feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTextStylePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CheckBox_textStyle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CheckBox_textStyle_feature", "_UI_CheckBox_type"),
				 DroidPackage.eINSTANCE.getCheckBox_TextStyle(),
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
			childrenFeatures.add(DroidPackage.eINSTANCE.getCheckBox_Text());
			childrenFeatures.add(DroidPackage.eINSTANCE.getCheckBox_Top());
			childrenFeatures.add(DroidPackage.eINSTANCE.getCheckBox_Left());
			childrenFeatures.add(DroidPackage.eINSTANCE.getCheckBox_Width());
			childrenFeatures.add(DroidPackage.eINSTANCE.getCheckBox_Height());
			childrenFeatures.add(DroidPackage.eINSTANCE.getCheckBox_Background());
			childrenFeatures.add(DroidPackage.eINSTANCE.getCheckBox_Clickable());
			childrenFeatures.add(DroidPackage.eINSTANCE.getCheckBox_FadeScrollBars());
			childrenFeatures.add(DroidPackage.eINSTANCE.getCheckBox_IsScrollContainer());
			childrenFeatures.add(DroidPackage.eINSTANCE.getCheckBox_AutoText());
			childrenFeatures.add(DroidPackage.eINSTANCE.getCheckBox_Digits());
			childrenFeatures.add(DroidPackage.eINSTANCE.getCheckBox_Editable());
			childrenFeatures.add(DroidPackage.eINSTANCE.getCheckBox_Hint());
			childrenFeatures.add(DroidPackage.eINSTANCE.getCheckBox_Numeric());
			childrenFeatures.add(DroidPackage.eINSTANCE.getCheckBox_Password());
			childrenFeatures.add(DroidPackage.eINSTANCE.getCheckBox_PhoneNumber());
			childrenFeatures.add(DroidPackage.eINSTANCE.getCheckBox_SingleLine());
			childrenFeatures.add(DroidPackage.eINSTANCE.getCheckBox_TextColor());
			childrenFeatures.add(DroidPackage.eINSTANCE.getCheckBox_TextSize());
			childrenFeatures.add(DroidPackage.eINSTANCE.getCheckBox_OnCheck());
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
	 * This returns CheckBox.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CheckBox"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CheckBox)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_CheckBox_type") :
			getString("_UI_CheckBox_type") + " " + label;
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

		switch (notification.getFeatureID(CheckBox.class)) {
			case DroidPackage.CHECK_BOX__NAME:
			case DroidPackage.CHECK_BOX__AUTO_LINK:
			case DroidPackage.CHECK_BOX__CAPITALIZE:
			case DroidPackage.CHECK_BOX__GRAVITY:
			case DroidPackage.CHECK_BOX__TYPEFACE:
			case DroidPackage.CHECK_BOX__TEXT_STYLE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DroidPackage.CHECK_BOX__TEXT:
			case DroidPackage.CHECK_BOX__TOP:
			case DroidPackage.CHECK_BOX__LEFT:
			case DroidPackage.CHECK_BOX__WIDTH:
			case DroidPackage.CHECK_BOX__HEIGHT:
			case DroidPackage.CHECK_BOX__BACKGROUND:
			case DroidPackage.CHECK_BOX__CLICKABLE:
			case DroidPackage.CHECK_BOX__FADE_SCROLL_BARS:
			case DroidPackage.CHECK_BOX__IS_SCROLL_CONTAINER:
			case DroidPackage.CHECK_BOX__AUTO_TEXT:
			case DroidPackage.CHECK_BOX__DIGITS:
			case DroidPackage.CHECK_BOX__EDITABLE:
			case DroidPackage.CHECK_BOX__HINT:
			case DroidPackage.CHECK_BOX__NUMERIC:
			case DroidPackage.CHECK_BOX__PASSWORD:
			case DroidPackage.CHECK_BOX__PHONE_NUMBER:
			case DroidPackage.CHECK_BOX__SINGLE_LINE:
			case DroidPackage.CHECK_BOX__TEXT_COLOR:
			case DroidPackage.CHECK_BOX__TEXT_SIZE:
			case DroidPackage.CHECK_BOX__ON_CHECK:
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
				(DroidPackage.eINSTANCE.getCheckBox_Text(),
				 DroidFactory.eINSTANCE.createStringVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getCheckBox_Top(),
				 DroidFactory.eINSTANCE.createDimensionVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getCheckBox_Left(),
				 DroidFactory.eINSTANCE.createDimensionVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getCheckBox_Width(),
				 DroidFactory.eINSTANCE.createDimensionVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getCheckBox_Height(),
				 DroidFactory.eINSTANCE.createDimensionVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getCheckBox_Background(),
				 DroidFactory.eINSTANCE.createColorVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getCheckBox_Background(),
				 DroidFactory.eINSTANCE.createAnyDrawableVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getCheckBox_Background(),
				 DroidFactory.eINSTANCE.createDrawableVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getCheckBox_Clickable(),
				 DroidFactory.eINSTANCE.createBooleanVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getCheckBox_FadeScrollBars(),
				 DroidFactory.eINSTANCE.createBooleanVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getCheckBox_IsScrollContainer(),
				 DroidFactory.eINSTANCE.createBooleanVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getCheckBox_AutoText(),
				 DroidFactory.eINSTANCE.createBooleanVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getCheckBox_Digits(),
				 DroidFactory.eINSTANCE.createStringVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getCheckBox_Editable(),
				 DroidFactory.eINSTANCE.createBooleanVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getCheckBox_Hint(),
				 DroidFactory.eINSTANCE.createStringVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getCheckBox_Numeric(),
				 DroidFactory.eINSTANCE.createBooleanVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getCheckBox_Password(),
				 DroidFactory.eINSTANCE.createBooleanVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getCheckBox_PhoneNumber(),
				 DroidFactory.eINSTANCE.createBooleanVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getCheckBox_SingleLine(),
				 DroidFactory.eINSTANCE.createBooleanVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getCheckBox_TextColor(),
				 DroidFactory.eINSTANCE.createColorVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getCheckBox_TextSize(),
				 DroidFactory.eINSTANCE.createDimensionVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getCheckBox_OnCheck(),
				 DroidFactory.eINSTANCE.createAction()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getCheckBox_OnCheck(),
				 DroidFactory.eINSTANCE.createGoToURLAction()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getCheckBox_OnCheck(),
				 DroidFactory.eINSTANCE.createShowLayoutAction()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getCheckBox_OnCheck(),
				 DroidFactory.eINSTANCE.createInvokeActivityAction()));
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
			childFeature == DroidPackage.eINSTANCE.getCheckBox_Text() ||
			childFeature == DroidPackage.eINSTANCE.getCheckBox_Digits() ||
			childFeature == DroidPackage.eINSTANCE.getCheckBox_Hint() ||
			childFeature == DroidPackage.eINSTANCE.getCheckBox_Top() ||
			childFeature == DroidPackage.eINSTANCE.getCheckBox_Left() ||
			childFeature == DroidPackage.eINSTANCE.getCheckBox_Width() ||
			childFeature == DroidPackage.eINSTANCE.getCheckBox_Height() ||
			childFeature == DroidPackage.eINSTANCE.getCheckBox_TextSize() ||
			childFeature == DroidPackage.eINSTANCE.getCheckBox_Background() ||
			childFeature == DroidPackage.eINSTANCE.getCheckBox_TextColor() ||
			childFeature == DroidPackage.eINSTANCE.getCheckBox_Clickable() ||
			childFeature == DroidPackage.eINSTANCE.getCheckBox_FadeScrollBars() ||
			childFeature == DroidPackage.eINSTANCE.getCheckBox_IsScrollContainer() ||
			childFeature == DroidPackage.eINSTANCE.getCheckBox_AutoText() ||
			childFeature == DroidPackage.eINSTANCE.getCheckBox_Editable() ||
			childFeature == DroidPackage.eINSTANCE.getCheckBox_Numeric() ||
			childFeature == DroidPackage.eINSTANCE.getCheckBox_Password() ||
			childFeature == DroidPackage.eINSTANCE.getCheckBox_PhoneNumber() ||
			childFeature == DroidPackage.eINSTANCE.getCheckBox_SingleLine();

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
