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
import org.eclipse.amalgam.tutorials.emf.droid.TextView;

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
 * This is the item provider adapter for a {@link org.eclipse.amalgam.tutorials.emf.droid.TextView} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TextViewItemProvider
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
	public TextViewItemProvider(AdapterFactory adapterFactory) {
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
				 getString("_UI_TextView_autoLink_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TextView_autoLink_feature", "_UI_TextView_type"),
				 DroidPackage.eINSTANCE.getTextView_AutoLink(),
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
				 getString("_UI_TextView_capitalize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TextView_capitalize_feature", "_UI_TextView_type"),
				 DroidPackage.eINSTANCE.getTextView_Capitalize(),
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
				 getString("_UI_TextView_gravity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TextView_gravity_feature", "_UI_TextView_type"),
				 DroidPackage.eINSTANCE.getTextView_Gravity(),
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
				 getString("_UI_TextView_typeface_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TextView_typeface_feature", "_UI_TextView_type"),
				 DroidPackage.eINSTANCE.getTextView_Typeface(),
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
				 getString("_UI_TextView_textStyle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TextView_textStyle_feature", "_UI_TextView_type"),
				 DroidPackage.eINSTANCE.getTextView_TextStyle(),
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
			childrenFeatures.add(DroidPackage.eINSTANCE.getTextView_Text());
			childrenFeatures.add(DroidPackage.eINSTANCE.getTextView_FadeScrollBars());
			childrenFeatures.add(DroidPackage.eINSTANCE.getTextView_IsScrollContainer());
			childrenFeatures.add(DroidPackage.eINSTANCE.getTextView_AutoText());
			childrenFeatures.add(DroidPackage.eINSTANCE.getTextView_Digits());
			childrenFeatures.add(DroidPackage.eINSTANCE.getTextView_Editable());
			childrenFeatures.add(DroidPackage.eINSTANCE.getTextView_Hint());
			childrenFeatures.add(DroidPackage.eINSTANCE.getTextView_Numeric());
			childrenFeatures.add(DroidPackage.eINSTANCE.getTextView_Password());
			childrenFeatures.add(DroidPackage.eINSTANCE.getTextView_PhoneNumber());
			childrenFeatures.add(DroidPackage.eINSTANCE.getTextView_SingleLine());
			childrenFeatures.add(DroidPackage.eINSTANCE.getTextView_TextColor());
			childrenFeatures.add(DroidPackage.eINSTANCE.getTextView_TextSize());
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
	 * This returns TextView.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TextView"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TextView)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_TextView_type") :
			getString("_UI_TextView_type") + " " + label;
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

		switch (notification.getFeatureID(TextView.class)) {
			case DroidPackage.TEXT_VIEW__AUTO_LINK:
			case DroidPackage.TEXT_VIEW__CAPITALIZE:
			case DroidPackage.TEXT_VIEW__GRAVITY:
			case DroidPackage.TEXT_VIEW__TYPEFACE:
			case DroidPackage.TEXT_VIEW__TEXT_STYLE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DroidPackage.TEXT_VIEW__TEXT:
			case DroidPackage.TEXT_VIEW__FADE_SCROLL_BARS:
			case DroidPackage.TEXT_VIEW__IS_SCROLL_CONTAINER:
			case DroidPackage.TEXT_VIEW__AUTO_TEXT:
			case DroidPackage.TEXT_VIEW__DIGITS:
			case DroidPackage.TEXT_VIEW__EDITABLE:
			case DroidPackage.TEXT_VIEW__HINT:
			case DroidPackage.TEXT_VIEW__NUMERIC:
			case DroidPackage.TEXT_VIEW__PASSWORD:
			case DroidPackage.TEXT_VIEW__PHONE_NUMBER:
			case DroidPackage.TEXT_VIEW__SINGLE_LINE:
			case DroidPackage.TEXT_VIEW__TEXT_COLOR:
			case DroidPackage.TEXT_VIEW__TEXT_SIZE:
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
				(DroidPackage.eINSTANCE.getTextView_Text(),
				 DroidFactory.eINSTANCE.createStringVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getTextView_FadeScrollBars(),
				 DroidFactory.eINSTANCE.createBooleanVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getTextView_IsScrollContainer(),
				 DroidFactory.eINSTANCE.createBooleanVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getTextView_AutoText(),
				 DroidFactory.eINSTANCE.createBooleanVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getTextView_Digits(),
				 DroidFactory.eINSTANCE.createStringVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getTextView_Editable(),
				 DroidFactory.eINSTANCE.createBooleanVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getTextView_Hint(),
				 DroidFactory.eINSTANCE.createStringVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getTextView_Numeric(),
				 DroidFactory.eINSTANCE.createBooleanVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getTextView_Password(),
				 DroidFactory.eINSTANCE.createBooleanVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getTextView_PhoneNumber(),
				 DroidFactory.eINSTANCE.createBooleanVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getTextView_SingleLine(),
				 DroidFactory.eINSTANCE.createBooleanVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getTextView_TextColor(),
				 DroidFactory.eINSTANCE.createColorVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getTextView_TextSize(),
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
			childFeature == DroidPackage.eINSTANCE.getTextView_TextColor() ||
			childFeature == DroidPackage.eINSTANCE.getWidget_Top() ||
			childFeature == DroidPackage.eINSTANCE.getWidget_Left() ||
			childFeature == DroidPackage.eINSTANCE.getWidget_Width() ||
			childFeature == DroidPackage.eINSTANCE.getWidget_Height() ||
			childFeature == DroidPackage.eINSTANCE.getTextView_TextSize() ||
			childFeature == DroidPackage.eINSTANCE.getWidget_Clickable() ||
			childFeature == DroidPackage.eINSTANCE.getTextView_FadeScrollBars() ||
			childFeature == DroidPackage.eINSTANCE.getTextView_IsScrollContainer() ||
			childFeature == DroidPackage.eINSTANCE.getTextView_AutoText() ||
			childFeature == DroidPackage.eINSTANCE.getTextView_Editable() ||
			childFeature == DroidPackage.eINSTANCE.getTextView_Numeric() ||
			childFeature == DroidPackage.eINSTANCE.getTextView_Password() ||
			childFeature == DroidPackage.eINSTANCE.getTextView_PhoneNumber() ||
			childFeature == DroidPackage.eINSTANCE.getTextView_SingleLine() ||
			childFeature == DroidPackage.eINSTANCE.getTextView_Text() ||
			childFeature == DroidPackage.eINSTANCE.getTextView_Digits() ||
			childFeature == DroidPackage.eINSTANCE.getTextView_Hint();

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
