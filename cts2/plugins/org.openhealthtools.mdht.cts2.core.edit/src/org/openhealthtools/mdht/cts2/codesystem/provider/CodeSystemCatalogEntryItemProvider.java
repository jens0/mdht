/*******************************************************************************
 * Copyright (c) 2012 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.cts2.codesystem.provider;

import java.util.Collection;
import java.util.List;

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
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.openhealthtools.mdht.cts2.association.provider.Cts2EditPlugin;

import org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntry;
import org.openhealthtools.mdht.cts2.codesystem.CodeSystemPackage;

import org.openhealthtools.mdht.cts2.core.CoreFactory;
import org.openhealthtools.mdht.cts2.core.CorePackage;

import org.openhealthtools.mdht.cts2.core.provider.AbstractResourceDescriptionItemProvider;

/**
 * This is the item provider adapter for a {@link org.openhealthtools.mdht.cts2.codesystem.CodeSystemCatalogEntry} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class CodeSystemCatalogEntryItemProvider extends AbstractResourceDescriptionItemProvider implements
		IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CodeSystemCatalogEntryItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addVersionsPropertyDescriptor(object);
			addCodeSystemNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Versions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addVersionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_CodeSystemCatalogEntry_versions_feature"),
			getString(
				"_UI_PropertyDescriptor_description", "_UI_CodeSystemCatalogEntry_versions_feature",
				"_UI_CodeSystemCatalogEntry_type"), CodeSystemPackage.Literals.CODE_SYSTEM_CATALOG_ENTRY__VERSIONS,
			true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Code System Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addCodeSystemNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
			((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
			getResourceLocator(),
			getString("_UI_CodeSystemCatalogEntry_codeSystemName_feature"),
			getString(
				"_UI_PropertyDescriptor_description", "_UI_CodeSystemCatalogEntry_codeSystemName_feature",
				"_UI_CodeSystemCatalogEntry_type"),
			CodeSystemPackage.Literals.CODE_SYSTEM_CATALOG_ENTRY__CODE_SYSTEM_NAME, true, false, false,
			ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(CodeSystemPackage.Literals.CODE_SYSTEM_CATALOG_ENTRY__CODE_SYSTEM_CATEGORY);
			childrenFeatures.add(CodeSystemPackage.Literals.CODE_SYSTEM_CATALOG_ENTRY__ONTOLOGY_DOMAIN);
			childrenFeatures.add(CodeSystemPackage.Literals.CODE_SYSTEM_CATALOG_ENTRY__ONTOLOGY_TYPE);
			childrenFeatures.add(CodeSystemPackage.Literals.CODE_SYSTEM_CATALOG_ENTRY__DESIGNED_FOR_ONTOLOGY_TASK);
			childrenFeatures.add(CodeSystemPackage.Literals.CODE_SYSTEM_CATALOG_ENTRY__CURRENT_VERSION);
			childrenFeatures.add(CodeSystemPackage.Literals.CODE_SYSTEM_CATALOG_ENTRY__USED_ONTOLOGY_ENGINEERING_TOOL);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns CodeSystemCatalogEntry.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CodeSystemCatalogEntry"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CodeSystemCatalogEntry) object).getFormalName();
		return label == null || label.length() == 0
				? getString("_UI_CodeSystemCatalogEntry_type")
				: getString("_UI_CodeSystemCatalogEntry_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(CodeSystemCatalogEntry.class)) {
			case CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY__VERSIONS:
			case CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY__CODE_SYSTEM_NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY__CODE_SYSTEM_CATEGORY:
			case CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY__ONTOLOGY_DOMAIN:
			case CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY__ONTOLOGY_TYPE:
			case CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY__DESIGNED_FOR_ONTOLOGY_TASK:
			case CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY__CURRENT_VERSION:
			case CodeSystemPackage.CODE_SYSTEM_CATALOG_ENTRY__USED_ONTOLOGY_ENGINEERING_TOOL:
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
	 * 
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(
			CodeSystemPackage.Literals.CODE_SYSTEM_CATALOG_ENTRY__CODE_SYSTEM_CATEGORY,
			CoreFactory.eINSTANCE.createCodeSystemCategoryReference()));

		newChildDescriptors.add(createChildParameter(
			CodeSystemPackage.Literals.CODE_SYSTEM_CATALOG_ENTRY__ONTOLOGY_DOMAIN,
			CoreFactory.eINSTANCE.createOntologyDomainReference()));

		newChildDescriptors.add(createChildParameter(
			CodeSystemPackage.Literals.CODE_SYSTEM_CATALOG_ENTRY__ONTOLOGY_TYPE,
			CoreFactory.eINSTANCE.createOntologyTypeReference()));

		newChildDescriptors.add(createChildParameter(
			CodeSystemPackage.Literals.CODE_SYSTEM_CATALOG_ENTRY__DESIGNED_FOR_ONTOLOGY_TASK,
			CoreFactory.eINSTANCE.createOntologyTaskReference()));

		newChildDescriptors.add(createChildParameter(
			CodeSystemPackage.Literals.CODE_SYSTEM_CATALOG_ENTRY__CURRENT_VERSION,
			CoreFactory.eINSTANCE.createCodeSystemVersionReference()));

		newChildDescriptors.add(createChildParameter(
			CodeSystemPackage.Literals.CODE_SYSTEM_CATALOG_ENTRY__USED_ONTOLOGY_ENGINEERING_TOOL,
			CoreFactory.eINSTANCE.createOntologyEngineeringToolReference()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == CorePackage.Literals.RESOURCE_DESCRIPTION__RESOURCE_SYNOPSIS ||
				childFeature == CorePackage.Literals.RESOURCE_DESCRIPTION__RIGHTS ||
				childFeature == CorePackage.Literals.ABSTRACT_RESOURCE_DESCRIPTION__RELEASE_DOCUMENTATION ||
				childFeature == CorePackage.Literals.RESOURCE_DESCRIPTION__NOTE;

		if (qualify) {
			return getString("_UI_CreateChild_text2", new Object[] {
					getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Cts2EditPlugin.INSTANCE;
	}

}
