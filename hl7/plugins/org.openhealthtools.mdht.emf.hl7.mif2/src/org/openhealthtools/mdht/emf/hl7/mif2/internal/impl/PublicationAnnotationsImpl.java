/*******************************************************************************
 * Copyright (c) 2006, 2009 David A Carlson
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.emf.hl7.mif2.internal.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package;
import org.openhealthtools.mdht.emf.hl7.mif2.PublicationAnnotations;
import org.openhealthtools.mdht.emf.hl7.mif2.PublicationAppInfo;
import org.openhealthtools.mdht.emf.hl7.mif2.PublicationDocumentation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Publication Annotations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.PublicationAnnotationsImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.internal.impl.PublicationAnnotationsImpl#getAppInfo <em>App Info</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PublicationAnnotationsImpl extends EObjectImpl implements PublicationAnnotations {
	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected PublicationDocumentation documentation;

	/**
	 * The cached value of the '{@link #getAppInfo() <em>App Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppInfo()
	 * @generated
	 * @ordered
	 */
	protected PublicationAppInfo appInfo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PublicationAnnotationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mif2Package.Literals.PUBLICATION_ANNOTATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublicationDocumentation getDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentation(PublicationDocumentation newDocumentation, NotificationChain msgs) {
		PublicationDocumentation oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.PUBLICATION_ANNOTATIONS__DOCUMENTATION, oldDocumentation,
				newDocumentation);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentation(PublicationDocumentation newDocumentation) {
		if (newDocumentation != documentation) {
			NotificationChain msgs = null;
			if (documentation != null) {
				msgs = ((InternalEObject) documentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.PUBLICATION_ANNOTATIONS__DOCUMENTATION, null, msgs);
			}
			if (newDocumentation != null) {
				msgs = ((InternalEObject) newDocumentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.PUBLICATION_ANNOTATIONS__DOCUMENTATION, null, msgs);
			}
			msgs = basicSetDocumentation(newDocumentation, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.PUBLICATION_ANNOTATIONS__DOCUMENTATION, newDocumentation,
				newDocumentation));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublicationAppInfo getAppInfo() {
		return appInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAppInfo(PublicationAppInfo newAppInfo, NotificationChain msgs) {
		PublicationAppInfo oldAppInfo = appInfo;
		appInfo = newAppInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, Mif2Package.PUBLICATION_ANNOTATIONS__APP_INFO, oldAppInfo, newAppInfo);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppInfo(PublicationAppInfo newAppInfo) {
		if (newAppInfo != appInfo) {
			NotificationChain msgs = null;
			if (appInfo != null) {
				msgs = ((InternalEObject) appInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.PUBLICATION_ANNOTATIONS__APP_INFO, null, msgs);
			}
			if (newAppInfo != null) {
				msgs = ((InternalEObject) newAppInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						Mif2Package.PUBLICATION_ANNOTATIONS__APP_INFO, null, msgs);
			}
			msgs = basicSetAppInfo(newAppInfo, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, Mif2Package.PUBLICATION_ANNOTATIONS__APP_INFO, newAppInfo, newAppInfo));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Mif2Package.PUBLICATION_ANNOTATIONS__DOCUMENTATION:
				return basicSetDocumentation(null, msgs);
			case Mif2Package.PUBLICATION_ANNOTATIONS__APP_INFO:
				return basicSetAppInfo(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Mif2Package.PUBLICATION_ANNOTATIONS__DOCUMENTATION:
				return getDocumentation();
			case Mif2Package.PUBLICATION_ANNOTATIONS__APP_INFO:
				return getAppInfo();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Mif2Package.PUBLICATION_ANNOTATIONS__DOCUMENTATION:
				setDocumentation((PublicationDocumentation) newValue);
				return;
			case Mif2Package.PUBLICATION_ANNOTATIONS__APP_INFO:
				setAppInfo((PublicationAppInfo) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Mif2Package.PUBLICATION_ANNOTATIONS__DOCUMENTATION:
				setDocumentation((PublicationDocumentation) null);
				return;
			case Mif2Package.PUBLICATION_ANNOTATIONS__APP_INFO:
				setAppInfo((PublicationAppInfo) null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Mif2Package.PUBLICATION_ANNOTATIONS__DOCUMENTATION:
				return documentation != null;
			case Mif2Package.PUBLICATION_ANNOTATIONS__APP_INFO:
				return appInfo != null;
		}
		return super.eIsSet(featureID);
	}

} // PublicationAnnotationsImpl
