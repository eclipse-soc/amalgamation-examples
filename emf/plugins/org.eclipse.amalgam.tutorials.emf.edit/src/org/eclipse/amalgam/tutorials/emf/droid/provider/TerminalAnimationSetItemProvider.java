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
import org.eclipse.amalgam.tutorials.emf.droid.TerminalAnimationSet;

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
 * This is the item provider adapter for a {@link org.eclipse.amalgam.tutorials.emf.droid.TerminalAnimationSet} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TerminalAnimationSetItemProvider
	extends FrameAnimationElementItemProvider
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
	public TerminalAnimationSetItemProvider(AdapterFactory adapterFactory) {
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

			addShareInterpolatorPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Share Interpolator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShareInterpolatorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TerminalAnimationSet_shareInterpolator_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TerminalAnimationSet_shareInterpolator_feature", "_UI_TerminalAnimationSet_type"),
				 DroidPackage.eINSTANCE.getTerminalAnimationSet_ShareInterpolator(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
			childrenFeatures.add(DroidPackage.eINSTANCE.getTerminalAnimationSet_Interpolator());
			childrenFeatures.add(DroidPackage.eINSTANCE.getTerminalAnimationSet_Elements());
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
	 * This returns TerminalAnimationSet.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TerminalAnimationSet"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		TerminalAnimationSet terminalAnimationSet = (TerminalAnimationSet)object;
		return getString("_UI_TerminalAnimationSet_type") + " " + terminalAnimationSet.isShareInterpolator();
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

		switch (notification.getFeatureID(TerminalAnimationSet.class)) {
			case DroidPackage.TERMINAL_ANIMATION_SET__SHARE_INTERPOLATOR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DroidPackage.TERMINAL_ANIMATION_SET__INTERPOLATOR:
			case DroidPackage.TERMINAL_ANIMATION_SET__ELEMENTS:
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
				(DroidPackage.eINSTANCE.getTerminalAnimationSet_Interpolator(),
				 DroidFactory.eINSTANCE.createInterpolatorVA()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getTerminalAnimationSet_Elements(),
				 DroidFactory.eINSTANCE.createFrameAnimationElement()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getTerminalAnimationSet_Elements(),
				 DroidFactory.eINSTANCE.createTerminalAnimationElements()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getTerminalAnimationSet_Elements(),
				 DroidFactory.eINSTANCE.createTerminalAnimationSet()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getTerminalAnimationSet_Elements(),
				 DroidFactory.eINSTANCE.createAlphaAnimation()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getTerminalAnimationSet_Elements(),
				 DroidFactory.eINSTANCE.createScaleAnimation()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getTerminalAnimationSet_Elements(),
				 DroidFactory.eINSTANCE.createTranslateAnimation()));

		newChildDescriptors.add
			(createChildParameter
				(DroidPackage.eINSTANCE.getTerminalAnimationSet_Elements(),
				 DroidFactory.eINSTANCE.createRotateAnimation()));
	}

}
