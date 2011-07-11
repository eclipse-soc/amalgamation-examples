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
import org.eclipse.amalgam.tutorials.emf.droid.EditText;

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
 * This is the item provider adapter for a {@link org.eclipse.amalgam.tutorials.emf.droid.EditText} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EditTextItemProvider
	extends WidgetItemProvider
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
	public EditTextItemProvider(AdapterFactory adapterFactory) {
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

			addAutoLinkPropertyDescriptor(object);
			addCapitalizePropertyDescriptor(object);
			addGravityPropertyDescriptor(object);
			addTypefacePropertyDescriptor(object);
			addTextStylePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_EditText_autoLink_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EditText_autoLink_feature", "_UI_EditText_type"),
				 DroidPackage.eINSTANCE.getEditText_AutoLink(),
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
				 getString("_UI_EditText_capitalize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EditText_capitalize_feature", "_UI_EditText_type"),
				 DroidPackage.eINSTANCE.getEditText_Capitalize(),
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
				 getString("_UI_EditText_gravity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EditText_gravity_feature", "_UI_EditText_type"),
				 DroidPackage.eINSTANCE.getEditText_Gravity(),
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
				 getString("_UI_EditText_typeface_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EditText_typeface_feature", "_UI_EditText_type"),
				 DroidPackage.eINSTANCE.getEditText_Typeface(),
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
				 getString("_UI_EditText_textStyle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EditText_textStyle_feature", "_UI_EditText_type"),
				 DroidPackage.eINSTANCE.getEditText_TextStyle(),
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
			childrenFeatures.add(DroidPackage.eINSTANCE.getEditText_Text());
			childrenFeatures.add(DroidPackage.eINSTANCE.getEditText_FadeScrollBars());
			childrenFeatures.add(DroidPackage.eINSTANCE.getEditText_IsScrollContainer());
			childrenFeatures.add(DroidPackage.eINSTANCE.getEditText_AutoText());
			childrenFeatures.add(DroidPackage.eINSTANCE.getEditText_Digits());
			childrenFeatures.add(DroidPackage.eINSTANCE.getEditText_Editable());
			childrenFeatures.add(DroidPackage.eINSTANCE.getEditText_Hint());
			childrenFeatures.add(DroidPackage.eINSTANCE.getEditText_Numeric());
			childrenFeatures.add(DroidPackage.eINSTANCE.getEditText_Password());
			childrenFeatures.add(DroidPackage.eINSTANCE.getEditText_PhoneNumber());
			childrenFeatures.add(DroidPackage.eINSTANCE.getEditText_SingleLine());
			childrenFeatures.add(DroidPackage.eINSTANCE.getEditText_TextColor());
			childrenFeatures.add(DroidPackage.eINSTANCE.getEditText_TextSize());
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
	 * This returns EditText.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EditText"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((EditText)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_EditText_type") :
			getString("_UI_EditText_type") + " " + label;
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

		switch (notification.getFeatureID(EditText.class)) {
			case DroidPackage.EDIT_TEXT__AUTO_LINK:
			case DroidPackage.EDIT_TEXT__CAPITALIZE:
			case DroidPackage.EDIT_TEXT__GRAVITY:
			case DroidPackage.EDIT_TEXT__TYPEFACE:
			case DroidPackage.EDIT_TEXT__TEXT_STYLE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DroidPackage.EDIT_TEXT__TEXT:
			case DroidPackage.EDIT_TEXT__FADE_SCROLL_BARS:
			case DroidPackage.EDIT_TEXT__IS_SCROLL_CONTAINER:
			case DroidPackage.EDIT_TEXT__AUTO_TEXT:
			case DroidPackage.EDIT_TEXT__DIGITS:
			case DroidPackage.EDIT_TEXT__EDITABLE:
			case DroidPackage.EDIT_TEXT__HINT:
			case DroidPackage.EDIT_TEXT__NUMERIC:
			case DroidPackage.EDIT_TEXT__PASSWORD:
			case DroidPackage.EDIT_TEXT__PHONE_NUMBER:
			case DroidPackage.EDIT_TEXT__SINGLE_LINE:
			case DroidPackage.EDIT_TEXT__TEXT_COLOR:
			case DroidPackage.EDIT_TEXT__TEXT_SIZE:
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
				(DroidPackage.eINSTANCE.getEditText_Text(),
				 DroidFactory.eINSTANCE.createStringVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getEditText_FadeScrollBars(),
				 DroidFactory.eINSTANCE.createBooleanVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getEditText_IsScrollContainer(),
				 DroidFactory.eINSTANCE.createBooleanVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getEditText_AutoText(),
				 DroidFactory.eINSTANCE.createBooleanVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getEditText_Digits(),
				 DroidFactory.eINSTANCE.createStringVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getEditText_Editable(),
				 DroidFactory.eINSTANCE.createBooleanVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getEditText_Hint(),
				 DroidFactory.eINSTANCE.createStringVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getEditText_Numeric(),
				 DroidFactory.eINSTANCE.createBooleanVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getEditText_Password(),
				 DroidFactory.eINSTANCE.createBooleanVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getEditText_PhoneNumber(),
				 DroidFactory.eINSTANCE.createBooleanVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getEditText_SingleLine(),
				 DroidFactory.eINSTANCE.createBooleanVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getEditText_TextColor(),
				 DroidFactory.eINSTANCE.createColorVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getEditText_TextSize(),
				 DroidFactory.eINSTANCE.createDimensionVA()));
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
			childFeature == DroidPackage.eINSTANCE.getEditText_TextColor() ||
			childFeature == DroidPackage.eINSTANCE.getWidget_Top() ||
			childFeature == DroidPackage.eINSTANCE.getWidget_Left() ||
			childFeature == DroidPackage.eINSTANCE.getWidget_Width() ||
			childFeature == DroidPackage.eINSTANCE.getWidget_Height() ||
			childFeature == DroidPackage.eINSTANCE.getEditText_TextSize() ||
			childFeature == DroidPackage.eINSTANCE.getWidget_Clickable() ||
			childFeature == DroidPackage.eINSTANCE.getEditText_FadeScrollBars() ||
			childFeature == DroidPackage.eINSTANCE.getEditText_IsScrollContainer() ||
			childFeature == DroidPackage.eINSTANCE.getEditText_AutoText() ||
			childFeature == DroidPackage.eINSTANCE.getEditText_Editable() ||
			childFeature == DroidPackage.eINSTANCE.getEditText_Numeric() ||
			childFeature == DroidPackage.eINSTANCE.getEditText_Password() ||
			childFeature == DroidPackage.eINSTANCE.getEditText_PhoneNumber() ||
			childFeature == DroidPackage.eINSTANCE.getEditText_SingleLine() ||
			childFeature == DroidPackage.eINSTANCE.getEditText_Text() ||
			childFeature == DroidPackage.eINSTANCE.getEditText_Digits() ||
			childFeature == DroidPackage.eINSTANCE.getEditText_Hint();

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
