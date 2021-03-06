/*******************************************************************************
 * Copyright (c) 2010 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.core.profile.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.openhealthtools.mdht.uml.cda.core.profile.CDAPackage;
import org.openhealthtools.mdht.uml.cda.core.profile.CodeSystemConstraint;
import org.openhealthtools.mdht.uml.cda.core.profile.SeverityKind;
import org.openhealthtools.mdht.uml.cda.core.profile.Validation;
import org.openhealthtools.mdht.uml.cda.core.profile.ValidationKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Code System Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.CodeSystemConstraintImpl#getMessage <em>Message</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.CodeSystemConstraintImpl#getSeverity <em>Severity</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.CodeSystemConstraintImpl#getRuleId <em>Rule Id</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.CodeSystemConstraintImpl#isMandatory <em>Mandatory</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.CodeSystemConstraintImpl#getKind <em>Kind</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.CodeSystemConstraintImpl#isStrict <em>Strict</em>}</li>
 * <li>{@link org.openhealthtools.mdht.uml.cda.core.profile.impl.CodeSystemConstraintImpl#isNegationIndicator <em>Negation Indicator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CodeSystemConstraintImpl extends
		org.openhealthtools.mdht.uml.term.core.profile.impl.CodeSystemConstraintImpl implements CodeSystemConstraint {
	/**
	 * The default value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected String message = MESSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected static final SeverityKind SEVERITY_EDEFAULT = SeverityKind.ERROR;

	/**
	 * The cached value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected SeverityKind severity = SEVERITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRuleId() <em>Rule Id</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getRuleId()
	 * @generated
	 * @ordered
	 */
	protected EList<String> ruleId;

	/**
	 * The default value of the '{@link #isMandatory() <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isMandatory()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MANDATORY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMandatory() <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isMandatory()
	 * @generated
	 * @ordered
	 */
	protected boolean mandatory = MANDATORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final ValidationKind KIND_EDEFAULT = ValidationKind.OPEN;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected ValidationKind kind = KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #isStrict() <em>Strict</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isStrict()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STRICT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStrict() <em>Strict</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isStrict()
	 * @generated
	 * @ordered
	 */
	protected boolean strict = STRICT_EDEFAULT;

	/**
	 * The default value of the '{@link #isNegationIndicator() <em>Negation Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isNegationIndicator()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEGATION_INDICATOR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNegationIndicator() <em>Negation Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isNegationIndicator()
	 * @generated
	 * @ordered
	 */
	protected boolean negationIndicator = NEGATION_INDICATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected CodeSystemConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDAPackage.Literals.CODE_SYSTEM_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setMessage(String newMessage) {
		String oldMessage = message;
		message = newMessage;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.CODE_SYSTEM_CONSTRAINT__MESSAGE, oldMessage, message));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SeverityKind getSeverity() {
		return severity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSeverity(SeverityKind newSeverity) {
		SeverityKind oldSeverity = severity;
		severity = newSeverity == null
				? SEVERITY_EDEFAULT
				: newSeverity;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.CODE_SYSTEM_CONSTRAINT__SEVERITY, oldSeverity, severity));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<String> getRuleId() {
		if (ruleId == null) {
			ruleId = new EDataTypeUniqueEList<String>(String.class, this, CDAPackage.CODE_SYSTEM_CONSTRAINT__RULE_ID);
		}
		return ruleId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isMandatory() {
		return mandatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setMandatory(boolean newMandatory) {
		boolean oldMandatory = mandatory;
		mandatory = newMandatory;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.CODE_SYSTEM_CONSTRAINT__MANDATORY, oldMandatory, mandatory));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ValidationKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setKind(ValidationKind newKind) {
		ValidationKind oldKind = kind;
		kind = newKind == null
				? KIND_EDEFAULT
				: newKind;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.CODE_SYSTEM_CONSTRAINT__KIND, oldKind, kind));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isStrict() {
		return strict;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setStrict(boolean newStrict) {
		boolean oldStrict = strict;
		strict = newStrict;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.CODE_SYSTEM_CONSTRAINT__STRICT, oldStrict, strict));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isNegationIndicator() {
		return negationIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setNegationIndicator(boolean newNegationIndicator) {
		boolean oldNegationIndicator = negationIndicator;
		negationIndicator = newNegationIndicator;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.CODE_SYSTEM_CONSTRAINT__NEGATION_INDICATOR, oldNegationIndicator,
				negationIndicator));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CDAPackage.CODE_SYSTEM_CONSTRAINT__MESSAGE:
				return getMessage();
			case CDAPackage.CODE_SYSTEM_CONSTRAINT__SEVERITY:
				return getSeverity();
			case CDAPackage.CODE_SYSTEM_CONSTRAINT__RULE_ID:
				return getRuleId();
			case CDAPackage.CODE_SYSTEM_CONSTRAINT__MANDATORY:
				return isMandatory();
			case CDAPackage.CODE_SYSTEM_CONSTRAINT__KIND:
				return getKind();
			case CDAPackage.CODE_SYSTEM_CONSTRAINT__STRICT:
				return isStrict();
			case CDAPackage.CODE_SYSTEM_CONSTRAINT__NEGATION_INDICATOR:
				return isNegationIndicator();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CDAPackage.CODE_SYSTEM_CONSTRAINT__MESSAGE:
				setMessage((String) newValue);
				return;
			case CDAPackage.CODE_SYSTEM_CONSTRAINT__SEVERITY:
				setSeverity((SeverityKind) newValue);
				return;
			case CDAPackage.CODE_SYSTEM_CONSTRAINT__RULE_ID:
				getRuleId().clear();
				getRuleId().addAll((Collection<? extends String>) newValue);
				return;
			case CDAPackage.CODE_SYSTEM_CONSTRAINT__MANDATORY:
				setMandatory((Boolean) newValue);
				return;
			case CDAPackage.CODE_SYSTEM_CONSTRAINT__KIND:
				setKind((ValidationKind) newValue);
				return;
			case CDAPackage.CODE_SYSTEM_CONSTRAINT__STRICT:
				setStrict((Boolean) newValue);
				return;
			case CDAPackage.CODE_SYSTEM_CONSTRAINT__NEGATION_INDICATOR:
				setNegationIndicator((Boolean) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CDAPackage.CODE_SYSTEM_CONSTRAINT__MESSAGE:
				setMessage(MESSAGE_EDEFAULT);
				return;
			case CDAPackage.CODE_SYSTEM_CONSTRAINT__SEVERITY:
				setSeverity(SEVERITY_EDEFAULT);
				return;
			case CDAPackage.CODE_SYSTEM_CONSTRAINT__RULE_ID:
				getRuleId().clear();
				return;
			case CDAPackage.CODE_SYSTEM_CONSTRAINT__MANDATORY:
				setMandatory(MANDATORY_EDEFAULT);
				return;
			case CDAPackage.CODE_SYSTEM_CONSTRAINT__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case CDAPackage.CODE_SYSTEM_CONSTRAINT__STRICT:
				setStrict(STRICT_EDEFAULT);
				return;
			case CDAPackage.CODE_SYSTEM_CONSTRAINT__NEGATION_INDICATOR:
				setNegationIndicator(NEGATION_INDICATOR_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CDAPackage.CODE_SYSTEM_CONSTRAINT__MESSAGE:
				return MESSAGE_EDEFAULT == null
						? message != null
						: !MESSAGE_EDEFAULT.equals(message);
			case CDAPackage.CODE_SYSTEM_CONSTRAINT__SEVERITY:
				return severity != SEVERITY_EDEFAULT;
			case CDAPackage.CODE_SYSTEM_CONSTRAINT__RULE_ID:
				return ruleId != null && !ruleId.isEmpty();
			case CDAPackage.CODE_SYSTEM_CONSTRAINT__MANDATORY:
				return mandatory != MANDATORY_EDEFAULT;
			case CDAPackage.CODE_SYSTEM_CONSTRAINT__KIND:
				return kind != KIND_EDEFAULT;
			case CDAPackage.CODE_SYSTEM_CONSTRAINT__STRICT:
				return strict != STRICT_EDEFAULT;
			case CDAPackage.CODE_SYSTEM_CONSTRAINT__NEGATION_INDICATOR:
				return negationIndicator != NEGATION_INDICATOR_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Validation.class) {
			switch (derivedFeatureID) {
				case CDAPackage.CODE_SYSTEM_CONSTRAINT__MESSAGE:
					return CDAPackage.VALIDATION__MESSAGE;
				case CDAPackage.CODE_SYSTEM_CONSTRAINT__SEVERITY:
					return CDAPackage.VALIDATION__SEVERITY;
				case CDAPackage.CODE_SYSTEM_CONSTRAINT__RULE_ID:
					return CDAPackage.VALIDATION__RULE_ID;
				case CDAPackage.CODE_SYSTEM_CONSTRAINT__MANDATORY:
					return CDAPackage.VALIDATION__MANDATORY;
				case CDAPackage.CODE_SYSTEM_CONSTRAINT__KIND:
					return CDAPackage.VALIDATION__KIND;
				case CDAPackage.CODE_SYSTEM_CONSTRAINT__STRICT:
					return CDAPackage.VALIDATION__STRICT;
				case CDAPackage.CODE_SYSTEM_CONSTRAINT__NEGATION_INDICATOR:
					return CDAPackage.VALIDATION__NEGATION_INDICATOR;
				default:
					return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Validation.class) {
			switch (baseFeatureID) {
				case CDAPackage.VALIDATION__MESSAGE:
					return CDAPackage.CODE_SYSTEM_CONSTRAINT__MESSAGE;
				case CDAPackage.VALIDATION__SEVERITY:
					return CDAPackage.CODE_SYSTEM_CONSTRAINT__SEVERITY;
				case CDAPackage.VALIDATION__RULE_ID:
					return CDAPackage.CODE_SYSTEM_CONSTRAINT__RULE_ID;
				case CDAPackage.VALIDATION__MANDATORY:
					return CDAPackage.CODE_SYSTEM_CONSTRAINT__MANDATORY;
				case CDAPackage.VALIDATION__KIND:
					return CDAPackage.CODE_SYSTEM_CONSTRAINT__KIND;
				case CDAPackage.VALIDATION__STRICT:
					return CDAPackage.CODE_SYSTEM_CONSTRAINT__STRICT;
				case CDAPackage.VALIDATION__NEGATION_INDICATOR:
					return CDAPackage.CODE_SYSTEM_CONSTRAINT__NEGATION_INDICATOR;
				default:
					return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (message: ");
		result.append(message);
		result.append(", severity: ");
		result.append(severity);
		result.append(", ruleId: ");
		result.append(ruleId);
		result.append(", mandatory: ");
		result.append(mandatory);
		result.append(", kind: ");
		result.append(kind);
		result.append(", strict: ");
		result.append(strict);
		result.append(", negationIndicator: ");
		result.append(negationIndicator);
		result.append(')');
		return result.toString();
	}

} // CodeSystemConstraintImpl
