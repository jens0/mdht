/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ccd.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.AssignedAuthor;
import org.openhealthtools.mdht.uml.cda.Author;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.DocumentationOf;
import org.openhealthtools.mdht.uml.cda.Organization;
import org.openhealthtools.mdht.uml.cda.ServiceEvent;
import org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.ccd.AlertsSection;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument;
import org.openhealthtools.mdht.uml.cda.ccd.EncountersSection;
import org.openhealthtools.mdht.uml.cda.ccd.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.ccd.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.ccd.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.ccd.MedicalEquipmentSection;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.ccd.PayersSection;
import org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemSection;
import org.openhealthtools.mdht.uml.cda.ccd.ProceduresSection;
import org.openhealthtools.mdht.uml.cda.ccd.PurposeSection;
import org.openhealthtools.mdht.uml.cda.ccd.ResultsSection;
import org.openhealthtools.mdht.uml.cda.ccd.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.ccd.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.ccd.operations.ContinuityOfCareDocumentOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.TS;
import org.openhealthtools.mdht.uml.hl7.vocab.ActClassRoot;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Continuity Of Care Document</b></em>' model objects. <!--
 * end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument#validateContinuityOfCareDocumentServiceEventRequired(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Service Event Required</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument#validateContinuityOfCareDocumentServiceEventClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Service Event Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument#validateContinuityOfCareDocumentServiceEventEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Service Event Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument#validateContinuityOfCareDocumentLanguageCodeFormat(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Language Code Format</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument#validateContinuityOfCareDocumentNoTemplateIdExtension(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document No Template Id Extension</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument#validateContinuityOfCareDocumentHasEffectiveTimeSeconds(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Has Effective Time Seconds</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument#validateContinuityOfCareDocumentHasEffectiveTimeZone(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Has Effective Time Zone</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument#validateContinuityOfCareDocumentOneOrTwoRecordTarget(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document One Or Two Record Target</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument#validateContinuityOfCareDocumentHasAssignedAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Has Assigned Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument#validateContinuityOfCareDocumentHasAssignedAuthorNullFlavor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Has Assigned Author Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument#validateContinuityOfCareDocumentHasInformationRecipient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Has Information Recipient</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument#validateContinuityOfCareDocumentTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument#validateContinuityOfCareDocumentCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument#validateContinuityOfCareDocumentLanguageCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Language Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument#validateContinuityOfCareDocumentProblemSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Problem Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument#validateContinuityOfCareDocumentFamilyHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Family History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument#validateContinuityOfCareDocumentSocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument#validateContinuityOfCareDocumentAlertsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Alerts Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument#validateContinuityOfCareDocumentMedicationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Medications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument#validateContinuityOfCareDocumentResultsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Results Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument#validateContinuityOfCareDocumentProceduresSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Procedures Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument#validateContinuityOfCareDocumentEncountersSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Encounters Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument#validateContinuityOfCareDocumentPlanOfCareSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument#validateContinuityOfCareDocumentImmunizationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Immunizations Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument#validateContinuityOfCareDocumentVitalSignsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument#validateContinuityOfCareDocumentMedicalEquipmentSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Medical Equipment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument#validateContinuityOfCareDocumentFunctionalStatusSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Functional Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument#validateContinuityOfCareDocumentAdvanceDirectivesSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Advance Directives Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument#validateContinuityOfCareDocumentPayersSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Payers Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument#validateContinuityOfCareDocumentPurposeSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Continuity Of Care Document Purpose Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument#getProblemSection() <em>Get Problem Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument#getFamilyHistorySection() <em>Get Family History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument#getSocialHistorySection() <em>Get Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument#getAlertsSection() <em>Get Alerts Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument#getMedicationsSection() <em>Get Medications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument#getResultsSection() <em>Get Results Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument#getProceduresSection() <em>Get Procedures Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument#getEncountersSection() <em>Get Encounters Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument#getPlanOfCareSection() <em>Get Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument#getImmunizationsSection() <em>Get Immunizations Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument#getVitalSignsSection() <em>Get Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument#getMedicalEquipmentSection() <em>Get Medical Equipment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument#getFunctionalStatusSection() <em>Get Functional Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument#getAdvanceDirectivesSection() <em>Get Advance Directives Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument#getPayersSection() <em>Get Payers Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument#getPurposeSection() <em>Get Purpose Section</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ContinuityOfCareDocumentTest extends CDAValidationTest {

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateContinuityOfCareDocumentServiceEventRequired() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentServiceEventRequiredTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentServiceEventRequired",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_SERVICE_EVENT_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				dof.setServiceEvent(CDAFactory.eINSTANCE.createServiceEvent());
				target.getDocumentationOfs().add(dof);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentServiceEventRequired(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentServiceEventRequiredTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateContinuityOfCareDocumentServiceEventClassCode() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentServiceEventClassCodeTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentServiceEventClassCode",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				se.setClassCode(ActClassRoot.PCPR);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentServiceEventClassCode(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentServiceEventClassCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateContinuityOfCareDocumentServiceEventEffectiveTime() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentServiceEventEffectiveTimeTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentServiceEventEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				se.setClassCode(ActClassRoot.PCPR);
				ts.setLow(DatatypesFactory.eINSTANCE.createIVXB_TS());
				ts.setHigh(DatatypesFactory.eINSTANCE.createIVXB_TS());
				se.setEffectiveTime(ts);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentServiceEventEffectiveTime(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentServiceEventEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateContinuityOfCareDocumentLanguageCodeFormat() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentLanguageCodeFormatTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentLanguageCodeFormat",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_LANGUAGE_CODE_FORMAT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(ContinuityOfCareDocument target) {
						// Do nothing should trigger

					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(ContinuityOfCareDocument target) {
						target.setLanguageCode(DatatypesFactory.eINSTANCE.createCS("aaaa"));
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(ContinuityOfCareDocument target) {
						target.setLanguageCode(DatatypesFactory.eINSTANCE.createCS("AAAA"));
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(ContinuityOfCareDocument target) {
						target.setLanguageCode(DatatypesFactory.eINSTANCE.createCS("aa-aa"));
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(ContinuityOfCareDocument target) {
						target.setLanguageCode(DatatypesFactory.eINSTANCE.createCS("AA-AA"));
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(ContinuityOfCareDocument target) {
						target.setLanguageCode(DatatypesFactory.eINSTANCE.createCS("aaa"));
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(ContinuityOfCareDocument target) {
						target.setLanguageCode(DatatypesFactory.eINSTANCE.createCS("a"));
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(ContinuityOfCareDocument target) {
						target.setLanguageCode(DatatypesFactory.eINSTANCE.createCS("AA-aa"));
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(ContinuityOfCareDocument target) {
						target.setLanguageCode(DatatypesFactory.eINSTANCE.createCS("AA-"));
					}
				});

			}

			@Override
			public void addPassTests() {
				this.addPassTest(new PassTest() {

					@Override
					public void updateToPass(ContinuityOfCareDocument target) {
						target.setLanguageCode(DatatypesFactory.eINSTANCE.createCS("en"));

					}
				});

				this.addPassTest(new PassTest() {

					@Override
					public void updateToPass(ContinuityOfCareDocument target) {
						target.setLanguageCode(DatatypesFactory.eINSTANCE.createCS("en-US"));

					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentLanguageCodeFormat(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentLanguageCodeFormatTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateContinuityOfCareDocumentNoTemplateIdExtension() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentNoTemplateIdExtensionTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentNoTemplateIdExtension",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_NO_TEMPLATE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

				II te = DatatypesFactory.eINSTANCE.createII();
				te.setRoot("2.16.840.1.113883.10.20.1");
				te.setExtension("a");
				target.getTemplateIds().add(te);
			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.getTemplateIds().clear();
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentNoTemplateIdExtension(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentNoTemplateIdExtensionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateContinuityOfCareDocumentHasEffectiveTimeSeconds() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentHasEffectiveTimeSecondsTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentHasEffectiveTimeSeconds",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_HAS_EFFECTIVE_TIME_SECONDS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {
				target.init();
				TS ts = DatatypesFactory.eINSTANCE.createTS();
				ts.setValue("123");

				target.setEffectiveTime(ts);

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {

				TS ts = DatatypesFactory.eINSTANCE.createTS();
				ts.setValue("12345");

				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentHasEffectiveTimeSeconds(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentHasEffectiveTimeSecondsTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateContinuityOfCareDocumentHasEffectiveTimeZone() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentHasEffectiveTimeZoneTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentHasEffectiveTimeZone",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_HAS_EFFECTIVE_TIME_ZONE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {
				target.init();
				TS ts = DatatypesFactory.eINSTANCE.createTS();
				ts.setValue("20071213155200");

				target.setEffectiveTime(ts);

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {

				TS ts = DatatypesFactory.eINSTANCE.createTS();
				ts.setValue("20071213155200-0500");

				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentHasEffectiveTimeZone(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentHasEffectiveTimeZoneTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateContinuityOfCareDocumentOneOrTwoRecordTarget() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentOneOrTwoRecordTargetTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentOneOrTwoRecordTarget",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_ONE_OR_TWO_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();
				target.getRecordTargets().add(CDAFactory.eINSTANCE.createRecordTarget());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentOneOrTwoRecordTarget(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentOneOrTwoRecordTargetTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateContinuityOfCareDocumentHasAssignedAuthor() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentHasAssignedAuthorTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentHasAssignedAuthor",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_HAS_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();
				Author auth = CDAFactory.eINSTANCE.createAuthor();
				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
				aa.setAssignedPerson(CDAFactory.eINSTANCE.createPerson());
				auth.setAssignedAuthor(aa);
				target.getAuthors().add(auth);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentHasAssignedAuthor(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentHasAssignedAuthorTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateContinuityOfCareDocumentHasAssignedAuthorNullFlavor() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentHasAssignedAuthorNullFlavorTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentHasAssignedAuthorNullFlavor",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_HAS_ASSIGNED_AUTHOR_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();
				Author auth = CDAFactory.eINSTANCE.createAuthor();
				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
				Organization org = CDAFactory.eINSTANCE.createOrganization();
				aa.setRepresentedOrganization(org);
				II id = DatatypesFactory.eINSTANCE.createII();
				id.setNullFlavor(NullFlavor.NA);
				aa.getIds().add(id);
				auth.setAssignedAuthor(aa);
				target.getAuthors().add(auth);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentHasAssignedAuthorNullFlavor(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentHasAssignedAuthorNullFlavorTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateContinuityOfCareDocumentHasInformationRecipient() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentHasInformationRecipientTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentHasInformationRecipient",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_HAS_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();
				target.getInformationRecipients().add(CDAFactory.eINSTANCE.createInformationRecipient());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentHasInformationRecipient(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentHasInformationRecipientTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateContinuityOfCareDocumentTemplateId() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentTemplateIdTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentTemplateId(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentTemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateContinuityOfCareDocumentCode() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentCodeTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentCode",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentCode(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateContinuityOfCareDocumentLanguageCode() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentLanguageCodeTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentLanguageCode",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();
				target.setLanguageCode(DatatypesFactory.eINSTANCE.createCS());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentLanguageCode(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentLanguageCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateContinuityOfCareDocumentProblemSection() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentProblemSectionTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentProblemSection",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

				/* ProblemSection */
				ProblemSection section =

				CCDFactory.eINSTANCE.createProblemSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentProblemSection(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentProblemSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateContinuityOfCareDocumentFamilyHistorySection() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentFamilyHistorySectionTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentFamilyHistorySection",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

				/* FamilyHistorySection */
				FamilyHistorySection section =

				CCDFactory.eINSTANCE.createFamilyHistorySection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentFamilyHistorySection(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentFamilyHistorySectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateContinuityOfCareDocumentSocialHistorySection() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentSocialHistorySectionTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentSocialHistorySection",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

				/* SocialHistorySection */
				SocialHistorySection section =

				CCDFactory.eINSTANCE.createSocialHistorySection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentSocialHistorySection(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentSocialHistorySectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateContinuityOfCareDocumentAlertsSection() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentAlertsSectionTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentAlertsSection",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_ALERTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

				/* AlertsSection */
				AlertsSection section =

				CCDFactory.eINSTANCE.createAlertsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentAlertsSection(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentAlertsSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateContinuityOfCareDocumentMedicationsSection() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentMedicationsSectionTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentMedicationsSection",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

				/* MedicationsSection */
				MedicationsSection section =

				CCDFactory.eINSTANCE.createMedicationsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentMedicationsSection(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentMedicationsSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateContinuityOfCareDocumentResultsSection() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentResultsSectionTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentResultsSection",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

				/* ResultsSection */
				ResultsSection section =

				CCDFactory.eINSTANCE.createResultsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentResultsSection(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentResultsSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateContinuityOfCareDocumentProceduresSection() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentProceduresSectionTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentProceduresSection",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

				/* ProceduresSection */
				ProceduresSection section =

				CCDFactory.eINSTANCE.createProceduresSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentProceduresSection(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentProceduresSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateContinuityOfCareDocumentEncountersSection() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentEncountersSectionTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentEncountersSection",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_ENCOUNTERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

				/* EncountersSection */
				EncountersSection section =

				CCDFactory.eINSTANCE.createEncountersSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentEncountersSection(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentEncountersSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateContinuityOfCareDocumentPlanOfCareSection() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentPlanOfCareSectionTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentPlanOfCareSection",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

				/* PlanOfCareSection */
				PlanOfCareSection section =

				CCDFactory.eINSTANCE.createPlanOfCareSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentPlanOfCareSection(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentPlanOfCareSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateContinuityOfCareDocumentImmunizationsSection() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentImmunizationsSectionTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentImmunizationsSection",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

				/* ImmunizationsSection */
				ImmunizationsSection section =

				CCDFactory.eINSTANCE.createImmunizationsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentImmunizationsSection(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentImmunizationsSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateContinuityOfCareDocumentVitalSignsSection() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentVitalSignsSectionTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentVitalSignsSection",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

				/* VitalSignsSection */
				VitalSignsSection section =

				CCDFactory.eINSTANCE.createVitalSignsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentVitalSignsSection(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentVitalSignsSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateContinuityOfCareDocumentMedicalEquipmentSection() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentMedicalEquipmentSectionTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentMedicalEquipmentSection",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_MEDICAL_EQUIPMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

				/* MedicalEquipmentSection */
				MedicalEquipmentSection section =

				CCDFactory.eINSTANCE.createMedicalEquipmentSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentMedicalEquipmentSection(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentMedicalEquipmentSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateContinuityOfCareDocumentFunctionalStatusSection() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentFunctionalStatusSectionTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentFunctionalStatusSection",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

				/* FunctionalStatusSection */
				FunctionalStatusSection section =

				CCDFactory.eINSTANCE.createFunctionalStatusSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentFunctionalStatusSection(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentFunctionalStatusSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateContinuityOfCareDocumentAdvanceDirectivesSection() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentAdvanceDirectivesSectionTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentAdvanceDirectivesSection",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_ADVANCE_DIRECTIVES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

				/* AdvanceDirectivesSection */
				AdvanceDirectivesSection section =

				CCDFactory.eINSTANCE.createAdvanceDirectivesSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentAdvanceDirectivesSection(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentAdvanceDirectivesSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateContinuityOfCareDocumentPayersSection() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentPayersSectionTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentPayersSection",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PAYERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

				/* PayersSection */
				PayersSection section =

				CCDFactory.eINSTANCE.createPayersSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentPayersSection(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentPayersSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateContinuityOfCareDocumentPurposeSection() {
		OperationsTestCase<ContinuityOfCareDocument> validateContinuityOfCareDocumentPurposeSectionTestCase = new OperationsTestCase<ContinuityOfCareDocument>(
			"validateContinuityOfCareDocumentPurposeSection",
			operationsForOCL.getOCLValue("VALIDATE_CONTINUITY_OF_CARE_DOCUMENT_PURPOSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ContinuityOfCareDocument target) {

			}

			@Override
			protected void updateToPass(ContinuityOfCareDocument target) {
				target.init();

				/* PurposeSection */
				PurposeSection section =

				CCDFactory.eINSTANCE.createPurposeSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentPurposeSection(
					(ContinuityOfCareDocument) objectToTest, diagnostician, map);
			}

		};

		validateContinuityOfCareDocumentPurposeSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProblemSection() {

		ContinuityOfCareDocument target = objectFactory.create();
		target.getProblemSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetFamilyHistorySection() {

		ContinuityOfCareDocument target = objectFactory.create();
		target.getFamilyHistorySection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetSocialHistorySection() {

		ContinuityOfCareDocument target = objectFactory.create();
		target.getSocialHistorySection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAlertsSection() {

		ContinuityOfCareDocument target = objectFactory.create();
		target.getAlertsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicationsSection() {

		ContinuityOfCareDocument target = objectFactory.create();
		target.getMedicationsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetResultsSection() {

		ContinuityOfCareDocument target = objectFactory.create();
		target.getResultsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProceduresSection() {

		ContinuityOfCareDocument target = objectFactory.create();
		target.getProceduresSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetEncountersSection() {

		ContinuityOfCareDocument target = objectFactory.create();
		target.getEncountersSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPlanOfCareSection() {

		ContinuityOfCareDocument target = objectFactory.create();
		target.getPlanOfCareSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetImmunizationsSection() {

		ContinuityOfCareDocument target = objectFactory.create();
		target.getImmunizationsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetVitalSignsSection() {

		ContinuityOfCareDocument target = objectFactory.create();
		target.getVitalSignsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicalEquipmentSection() {

		ContinuityOfCareDocument target = objectFactory.create();
		target.getMedicalEquipmentSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetFunctionalStatusSection() {

		ContinuityOfCareDocument target = objectFactory.create();
		target.getFunctionalStatusSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAdvanceDirectivesSection() {

		ContinuityOfCareDocument target = objectFactory.create();
		target.getAdvanceDirectivesSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPayersSection() {

		ContinuityOfCareDocument target = objectFactory.create();
		target.getPayersSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPurposeSection() {

		ContinuityOfCareDocument target = objectFactory.create();
		target.getPurposeSection();

	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends ContinuityOfCareDocumentOperations {
		public String getOCLValue(String fieldName) {

			String oclValue = null;

			try {
				oclValue = (String) this.getClass().getSuperclass().getDeclaredField(fieldName).get(this);
			} catch (Exception e) {
				oclValue = "NO OCL FOUND FOR PROPERTY " + fieldName;
			}
			return oclValue;
		}
	}

	/**
	 * 
	 * @generated
	 */
	private static class ObjectFactory implements TestObjectFactory<ContinuityOfCareDocument> {
		public ContinuityOfCareDocument create() {
			return CCDFactory.eINSTANCE.createContinuityOfCareDocument();
		}
	}

	/**
	 * 
	 * @generated
	 */
	private static OperationsForOCL operationsForOCL = new OperationsForOCL();

	/**
	 * 
	 * @generated
	 */
	private static ObjectFactory objectFactory = new ObjectFactory();

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	private static class ConstructorTestClass extends ContinuityOfCareDocumentOperations {
	}

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	@Test
	public void testConstructor() {
		@SuppressWarnings("unused")
		ConstructorTestClass constructorTestClass = new ConstructorTestClass();
	} // testConstructor

	/**
	 * 
	 * @generated
	 */
	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // ContinuityOfCareDocumentOperations
