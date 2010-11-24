/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPlugin;
import org.openhealthtools.mdht.uml.cda.ihe.ScannedDocument;
import org.openhealthtools.mdht.uml.cda.ihe.util.IHEValidator;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalDocumentOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Scanned Document</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ScannedDocument#validateScannedDocumentTypeIdFixed(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Document Type Id Fixed</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ScannedDocument#validateScannedDocumentHasOneRecordTarget(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Document Has One Record Target</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ScannedDocument#validateScannedDocumentHasAssignedAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Document Has Assigned Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ScannedDocument#validateScannedDocumentPatientRoleId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Document Patient Role Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ScannedDocument#validateScannedDocumentHasPatientRoleAddress(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Document Has Patient Role Address</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ScannedDocument#validateScannedDocumentTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Document Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ScannedDocument#validateScannedDocumentCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Document Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ScannedDocument#validateScannedDocumentConfidentialityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Document Confidentiality Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ScannedDocument#validateScannedDocumentEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Document Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ScannedDocument#validateScannedDocumentId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Document Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ScannedDocument#validateScannedDocumentLanguageCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Document Language Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ScannedDocument#validateScannedDocumentTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Document Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ScannedDocument#validateScannedDocumentTypeId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Document Type Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScannedDocumentOperations extends ClinicalDocumentOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScannedDocumentOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateScannedDocumentTypeIdFixed(ScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Document Type Id Fixed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScannedDocumentTypeIdFixed(ScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SCANNED_DOCUMENT_TYPE_ID_FIXED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.typeId.root = '2.16.840.1.113883.1.3' and self.typeId.extension = 'POCD_HD000040'";

	/**
	 * The cached OCL invariant for the '{@link #validateScannedDocumentTypeIdFixed(ScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Document Type Id Fixed</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScannedDocumentTypeIdFixed(ScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SCANNED_DOCUMENT_TYPE_ID_FIXED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.typeId.root = '2.16.840.1.113883.1.3' and self.typeId.extension = 'POCD_HD000040'
	 * @param scannedDocument The receiving '<em><b>Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateScannedDocumentTypeIdFixed(ScannedDocument scannedDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SCANNED_DOCUMENT_TYPE_ID_FIXED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.SCANNED_DOCUMENT);
			try {
				VALIDATE_SCANNED_DOCUMENT_TYPE_ID_FIXED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SCANNED_DOCUMENT_TYPE_ID_FIXED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SCANNED_DOCUMENT_TYPE_ID_FIXED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(scannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.SCANNED_DOCUMENT__SCANNED_DOCUMENT_TYPE_ID_FIXED,
						 IHEPlugin.INSTANCE.getString("ScannedDocumentTypeIdFixed"),
						 new Object [] { scannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateScannedDocumentHasOneRecordTarget(ScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Document Has One Record Target</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScannedDocumentHasOneRecordTarget(ScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SCANNED_DOCUMENT_HAS_ONE_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->size() = 1";

	/**
	 * The cached OCL invariant for the '{@link #validateScannedDocumentHasOneRecordTarget(ScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Document Has One Record Target</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScannedDocumentHasOneRecordTarget(ScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SCANNED_DOCUMENT_HAS_ONE_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recordTarget->size() = 1
	 * @param scannedDocument The receiving '<em><b>Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateScannedDocumentHasOneRecordTarget(ScannedDocument scannedDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SCANNED_DOCUMENT_HAS_ONE_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.SCANNED_DOCUMENT);
			try {
				VALIDATE_SCANNED_DOCUMENT_HAS_ONE_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SCANNED_DOCUMENT_HAS_ONE_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SCANNED_DOCUMENT_HAS_ONE_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(scannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.SCANNED_DOCUMENT__SCANNED_DOCUMENT_HAS_ONE_RECORD_TARGET,
						 IHEPlugin.INSTANCE.getString("ScannedDocumentHasOneRecordTarget"),
						 new Object [] { scannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateScannedDocumentHasAssignedAuthor(ScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Document Has Assigned Author</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScannedDocumentHasAssignedAuthor(ScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SCANNED_DOCUMENT_HAS_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->exists(author : cda::Author | not author.assignedAuthor.assignedPerson.oclIsUndefined() "+
"   or not author.assignedAuthor.representedOrganization.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateScannedDocumentHasAssignedAuthor(ScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Document Has Assigned Author</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScannedDocumentHasAssignedAuthor(ScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SCANNED_DOCUMENT_HAS_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.author->exists(author : cda::Author | not author.assignedAuthor.assignedPerson.oclIsUndefined() 
	 *    or not author.assignedAuthor.representedOrganization.oclIsUndefined())
	 * @param scannedDocument The receiving '<em><b>Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateScannedDocumentHasAssignedAuthor(ScannedDocument scannedDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SCANNED_DOCUMENT_HAS_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.SCANNED_DOCUMENT);
			try {
				VALIDATE_SCANNED_DOCUMENT_HAS_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SCANNED_DOCUMENT_HAS_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SCANNED_DOCUMENT_HAS_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(scannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.SCANNED_DOCUMENT__SCANNED_DOCUMENT_HAS_ASSIGNED_AUTHOR,
						 IHEPlugin.INSTANCE.getString("ScannedDocumentHasAssignedAuthor"),
						 new Object [] { scannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateScannedDocumentPatientRoleId(ScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Document Patient Role Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScannedDocumentPatientRoleId(ScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SCANNED_DOCUMENT_PATIENT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->forAll(target : cda::RecordTarget | not target.patientRole.oclIsUndefined()"+
"   and target.patientRole.id->forAll(roleId : datatypes::II | not roleId.root.oclIsUndefined()"+
"   and not roleId.extension.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateScannedDocumentPatientRoleId(ScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Document Patient Role Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScannedDocumentPatientRoleId(ScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SCANNED_DOCUMENT_PATIENT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recordTarget->forAll(target : cda::RecordTarget | not target.patientRole.oclIsUndefined()
	 *    and target.patientRole.id->forAll(roleId : datatypes::II | not roleId.root.oclIsUndefined()
	 *    and not roleId.extension.oclIsUndefined()))
	 * @param scannedDocument The receiving '<em><b>Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateScannedDocumentPatientRoleId(ScannedDocument scannedDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SCANNED_DOCUMENT_PATIENT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.SCANNED_DOCUMENT);
			try {
				VALIDATE_SCANNED_DOCUMENT_PATIENT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SCANNED_DOCUMENT_PATIENT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SCANNED_DOCUMENT_PATIENT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(scannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.SCANNED_DOCUMENT__SCANNED_DOCUMENT_PATIENT_ROLE_ID,
						 IHEPlugin.INSTANCE.getString("ScannedDocumentPatientRoleId"),
						 new Object [] { scannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateScannedDocumentHasPatientRoleAddress(ScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Document Has Patient Role Address</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScannedDocumentHasPatientRoleAddress(ScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SCANNED_DOCUMENT_HAS_PATIENT_ROLE_ADDRESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->exists(target : cda::RecordTarget | not target.patientRole.oclIsUndefined()"+
"   and target.patientRole.addr->exists(address : datatypes::AD | address.country->exists(c : datatypes::ADXP |"+
"   not c.oclIsUndefined() and c.getText().size() > 0)))";

	/**
	 * The cached OCL invariant for the '{@link #validateScannedDocumentHasPatientRoleAddress(ScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Document Has Patient Role Address</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScannedDocumentHasPatientRoleAddress(ScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SCANNED_DOCUMENT_HAS_PATIENT_ROLE_ADDRESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.recordTarget->exists(target : cda::RecordTarget | not target.patientRole.oclIsUndefined()
	 *    and target.patientRole.addr->exists(address : datatypes::AD | address.country->exists(c : datatypes::ADXP |
	 *    not c.oclIsUndefined() and c.getText().size() > 0)))
	 * @param scannedDocument The receiving '<em><b>Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateScannedDocumentHasPatientRoleAddress(ScannedDocument scannedDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SCANNED_DOCUMENT_HAS_PATIENT_ROLE_ADDRESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.SCANNED_DOCUMENT);
			try {
				VALIDATE_SCANNED_DOCUMENT_HAS_PATIENT_ROLE_ADDRESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SCANNED_DOCUMENT_HAS_PATIENT_ROLE_ADDRESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SCANNED_DOCUMENT_HAS_PATIENT_ROLE_ADDRESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(scannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.SCANNED_DOCUMENT__SCANNED_DOCUMENT_HAS_PATIENT_ROLE_ADDRESS,
						 IHEPlugin.INSTANCE.getString("ScannedDocumentHasPatientRoleAddress"),
						 new Object [] { scannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateScannedDocumentTemplateId(ScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Document Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScannedDocumentTemplateId(ScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SCANNED_DOCUMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.2.20')";

	/**
	 * The cached OCL invariant for the '{@link #validateScannedDocumentTemplateId(ScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Document Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScannedDocumentTemplateId(ScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SCANNED_DOCUMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.2.20')
	 * @param scannedDocument The receiving '<em><b>Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateScannedDocumentTemplateId(ScannedDocument scannedDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SCANNED_DOCUMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.SCANNED_DOCUMENT);
			try {
				VALIDATE_SCANNED_DOCUMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SCANNED_DOCUMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SCANNED_DOCUMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(scannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.SCANNED_DOCUMENT__SCANNED_DOCUMENT_TEMPLATE_ID,
						 IHEPlugin.INSTANCE.getString("ScannedDocumentTemplateId"),
						 new Object [] { scannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateScannedDocumentCode(ScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Document Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScannedDocumentCode(ScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SCANNED_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateScannedDocumentCode(ScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Document Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScannedDocumentCode(ScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SCANNED_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.code.oclIsUndefined()
	 * @param scannedDocument The receiving '<em><b>Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateScannedDocumentCode(ScannedDocument scannedDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SCANNED_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.SCANNED_DOCUMENT);
			try {
				VALIDATE_SCANNED_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SCANNED_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SCANNED_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(scannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.SCANNED_DOCUMENT__SCANNED_DOCUMENT_CODE,
						 IHEPlugin.INSTANCE.getString("ScannedDocumentCode"),
						 new Object [] { scannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateScannedDocumentConfidentialityCode(ScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Document Confidentiality Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScannedDocumentConfidentialityCode(ScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SCANNED_DOCUMENT_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.confidentialityCode.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateScannedDocumentConfidentialityCode(ScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Document Confidentiality Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScannedDocumentConfidentialityCode(ScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SCANNED_DOCUMENT_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.confidentialityCode.oclIsUndefined()
	 * @param scannedDocument The receiving '<em><b>Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateScannedDocumentConfidentialityCode(ScannedDocument scannedDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SCANNED_DOCUMENT_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.SCANNED_DOCUMENT);
			try {
				VALIDATE_SCANNED_DOCUMENT_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SCANNED_DOCUMENT_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SCANNED_DOCUMENT_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(scannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.SCANNED_DOCUMENT__SCANNED_DOCUMENT_CONFIDENTIALITY_CODE,
						 IHEPlugin.INSTANCE.getString("ScannedDocumentConfidentialityCode"),
						 new Object [] { scannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateScannedDocumentEffectiveTime(ScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Document Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScannedDocumentEffectiveTime(ScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SCANNED_DOCUMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.effectiveTime.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateScannedDocumentEffectiveTime(ScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Document Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScannedDocumentEffectiveTime(ScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SCANNED_DOCUMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.effectiveTime.oclIsUndefined()
	 * @param scannedDocument The receiving '<em><b>Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateScannedDocumentEffectiveTime(ScannedDocument scannedDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SCANNED_DOCUMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.SCANNED_DOCUMENT);
			try {
				VALIDATE_SCANNED_DOCUMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SCANNED_DOCUMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SCANNED_DOCUMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(scannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.SCANNED_DOCUMENT__SCANNED_DOCUMENT_EFFECTIVE_TIME,
						 IHEPlugin.INSTANCE.getString("ScannedDocumentEffectiveTime"),
						 new Object [] { scannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateScannedDocumentId(ScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Document Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScannedDocumentId(ScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SCANNED_DOCUMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.id.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateScannedDocumentId(ScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Document Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScannedDocumentId(ScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SCANNED_DOCUMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.id.oclIsUndefined()
	 * @param scannedDocument The receiving '<em><b>Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateScannedDocumentId(ScannedDocument scannedDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SCANNED_DOCUMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.SCANNED_DOCUMENT);
			try {
				VALIDATE_SCANNED_DOCUMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SCANNED_DOCUMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SCANNED_DOCUMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(scannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.SCANNED_DOCUMENT__SCANNED_DOCUMENT_ID,
						 IHEPlugin.INSTANCE.getString("ScannedDocumentId"),
						 new Object [] { scannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateScannedDocumentLanguageCode(ScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Document Language Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScannedDocumentLanguageCode(ScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SCANNED_DOCUMENT_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.languageCode.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateScannedDocumentLanguageCode(ScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Document Language Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScannedDocumentLanguageCode(ScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SCANNED_DOCUMENT_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.languageCode.oclIsUndefined()
	 * @param scannedDocument The receiving '<em><b>Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateScannedDocumentLanguageCode(ScannedDocument scannedDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SCANNED_DOCUMENT_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.SCANNED_DOCUMENT);
			try {
				VALIDATE_SCANNED_DOCUMENT_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SCANNED_DOCUMENT_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SCANNED_DOCUMENT_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(scannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.SCANNED_DOCUMENT__SCANNED_DOCUMENT_LANGUAGE_CODE,
						 IHEPlugin.INSTANCE.getString("ScannedDocumentLanguageCode"),
						 new Object [] { scannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateScannedDocumentTitle(ScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Document Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScannedDocumentTitle(ScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SCANNED_DOCUMENT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.title.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateScannedDocumentTitle(ScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Document Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScannedDocumentTitle(ScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SCANNED_DOCUMENT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.title.oclIsUndefined()
	 * @param scannedDocument The receiving '<em><b>Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateScannedDocumentTitle(ScannedDocument scannedDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SCANNED_DOCUMENT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.SCANNED_DOCUMENT);
			try {
				VALIDATE_SCANNED_DOCUMENT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SCANNED_DOCUMENT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SCANNED_DOCUMENT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(scannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.SCANNED_DOCUMENT__SCANNED_DOCUMENT_TITLE,
						 IHEPlugin.INSTANCE.getString("ScannedDocumentTitle"),
						 new Object [] { scannedDocument }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateScannedDocumentTypeId(ScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Document Type Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScannedDocumentTypeId(ScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SCANNED_DOCUMENT_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.typeId.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateScannedDocumentTypeId(ScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanned Document Type Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScannedDocumentTypeId(ScannedDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SCANNED_DOCUMENT_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.typeId.oclIsUndefined()
	 * @param scannedDocument The receiving '<em><b>Scanned Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateScannedDocumentTypeId(ScannedDocument scannedDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SCANNED_DOCUMENT_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.SCANNED_DOCUMENT);
			try {
				VALIDATE_SCANNED_DOCUMENT_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SCANNED_DOCUMENT_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SCANNED_DOCUMENT_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(scannedDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.SCANNED_DOCUMENT__SCANNED_DOCUMENT_TYPE_ID,
						 IHEPlugin.INSTANCE.getString("ScannedDocumentTypeId"),
						 new Object [] { scannedDocument }));
			}
			return false;
		}
		return true;
	}

} // ScannedDocumentOperations