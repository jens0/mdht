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
package org.openhealthtools.mdht.uml.cda.hitsp.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.Participant2;
import org.openhealthtools.mdht.uml.cda.ParticipantRole;
import org.openhealthtools.mdht.uml.cda.PlayingEntity;
import org.openhealthtools.mdht.uml.cda.ccd.AlertObservation;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.ReactionObservation;
import org.openhealthtools.mdht.uml.cda.ccd.SeverityObservation;
import org.openhealthtools.mdht.uml.cda.hitsp.AllergyDrugSensitivity;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPFactory;
import org.openhealthtools.mdht.uml.cda.hitsp.operations.AllergyDrugSensitivityOperations;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.PN;
import org.openhealthtools.mdht.uml.hl7.vocab.EntityClassRoot;
import org.openhealthtools.mdht.uml.hl7.vocab.ParticipationType;
import org.openhealthtools.mdht.uml.hl7.vocab.RoleClassRoot;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Allergy Drug Sensitivity</b></em>' model objects. <!--
 * end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AllergyDrugSensitivity#validateAllergyDrugSensitivityAdverseEventDate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Adverse Event Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AllergyDrugSensitivity#validateAllergyDrugSensitivityAdverseEventType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Adverse Event Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AllergyDrugSensitivity#validateAllergyDrugSensitivityAdverseEventTypeVocab(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Adverse Event Type Vocab</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AllergyDrugSensitivity#validateAllergyDrugSensitivityAllergyProduct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Allergy Product</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AllergyDrugSensitivity#validateAllergyDrugSensitivityAllergyProductTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Allergy Product Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AllergyDrugSensitivity#validateAllergyDrugSensitivityProductDetailParticipantRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Product Detail Participant Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AllergyDrugSensitivity#validateAllergyDrugSensitivityProductDetailParticipantRoleClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Product Detail Participant Role Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AllergyDrugSensitivity#validateAllergyDrugSensitivityProductDetailPlayingEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Product Detail Playing Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AllergyDrugSensitivity#validateAllergyDrugSensitivityProductDetailPlayingEntityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Product Detail Playing Entity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AllergyDrugSensitivity#validateAllergyDrugSensitivityProductDetailName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Product Detail Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AllergyDrugSensitivity#validateAllergyDrugSensitivityProductCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Product Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AllergyDrugSensitivity#validateAllergyDrugSensitivityAllergyProductFoodVocab(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Allergy Product Food Vocab</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AllergyDrugSensitivity#validateAllergyDrugSensitivityAllergyProductMedClassVocab(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Allergy Product Med Class Vocab</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AllergyDrugSensitivity#validateAllergyDrugSensitivityAllergyProductSpecificMedVocab(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Allergy Product Specific Med Vocab</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AllergyDrugSensitivity#validateAllergyDrugSensitivityReactionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Reaction Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AllergyDrugSensitivity#validateAllergyDrugSensitivityReactionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Reaction Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AllergyDrugSensitivity#validateAllergyDrugSensitivityReactionCodeVocab(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Reaction Code Vocab</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AllergyDrugSensitivity#validateAllergyDrugSensitivitySeverityText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Severity Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AllergyDrugSensitivity#validateAllergyDrugSensitivitySeverityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Severity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AllergyDrugSensitivity#validateAllergyDrugSensitivitySeverityCodeVocab(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Severity Code Vocab</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AllergyDrugSensitivity#validateAllergyDrugSensitivityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AllergyDrugSensitivityTest extends CDAValidationTest {

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateAllergyDrugSensitivityAdverseEventDate() {
		OperationsTestCase<AllergyDrugSensitivity> validateAllergyDrugSensitivityAdverseEventDateTestCase = new OperationsTestCase<AllergyDrugSensitivity>(
			"validateAllergyDrugSensitivityAdverseEventDate",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_DRUG_SENSITIVITY_Adverse_EVENT_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyDrugSensitivity target) {

			}

			@Override
			protected void updateToPass(AllergyDrugSensitivity target) {
				target.init();
				AlertObservation obs = CCDFactory.eINSTANCE.createAlertObservation();
				obs.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS());
				target.addObservation(obs);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivityAdverseEventDate(
					(AllergyDrugSensitivity) objectToTest, diagnostician, map);
			}

		};

		validateAllergyDrugSensitivityAdverseEventDateTestCase.doValidationTest();
	}

	/**
	 *  
	 * @generated NOT
	 */
	@Test
	public void testValidateAllergyDrugSensitivityAdverseEventType() {
		OperationsTestCase<AllergyDrugSensitivity> validateAllergyDrugSensitivityAdverseEventTypeTestCase = new OperationsTestCase<AllergyDrugSensitivity>(
			"validateAllergyDrugSensitivityAdverseEventType",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_DRUG_SENSITIVITY_Adverse_EVENT_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyDrugSensitivity target) {

			}

			@Override
			protected void updateToPass(AllergyDrugSensitivity target) {
				target.init();
				AlertObservation obs = CCDFactory.eINSTANCE.createAlertObservation();
				CD code = DatatypesFactory.eINSTANCE.createCD();
				obs.setCode(code);
				target.addObservation(obs);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivityAdverseEventType(
					(AllergyDrugSensitivity) objectToTest, diagnostician, map);
			}

		};

		validateAllergyDrugSensitivityAdverseEventTypeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateAllergyDrugSensitivityAdverseEventTypeVocab() {
		OperationsTestCase<AllergyDrugSensitivity> validateAllergyDrugSensitivityAdverseEventTypeVocabTestCase = new OperationsTestCase<AllergyDrugSensitivity>(
			"validateAllergyDrugSensitivityAdverseEventTypeVocab",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_DRUG_SENSITIVITY_Adverse_EVENT_TYPE_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyDrugSensitivity target) {

			}

			@Override
			protected void updateToPass(AllergyDrugSensitivity target) {
				target.init();
				AlertObservation obs = CCDFactory.eINSTANCE.createAlertObservation();
				CD code = DatatypesFactory.eINSTANCE.createCD();
				code.setCodeSystem("2.16.840.1.113883.6.96");
				code.setCode("416098002");
				obs.setCode(code);
				target.addObservation(obs);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivityAdverseEventTypeVocab(
					(AllergyDrugSensitivity) objectToTest, diagnostician, map);
			}

		};

		validateAllergyDrugSensitivityAdverseEventTypeVocabTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateAllergyDrugSensitivityAllergyProduct() {
		OperationsTestCase<AllergyDrugSensitivity> validateAllergyDrugSensitivityAllergyProductTestCase = new OperationsTestCase<AllergyDrugSensitivity>(
			"validateAllergyDrugSensitivityAllergyProduct",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyDrugSensitivity target) {

			}

			@Override
			protected void updateToPass(AllergyDrugSensitivity target) {
				target.init();
				AlertObservation obs = CCDFactory.eINSTANCE.createAlertObservation();
				obs.getParticipants().add(CDAFactory.eINSTANCE.createParticipant2());
				target.addObservation(obs);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivityAllergyProduct(
					(AllergyDrugSensitivity) objectToTest, diagnostician, map);
			}

		};

		validateAllergyDrugSensitivityAllergyProductTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateAllergyDrugSensitivityAllergyProductTypeCode() {
		OperationsTestCase<AllergyDrugSensitivity> validateAllergyDrugSensitivityAllergyProductTypeCodeTestCase = new OperationsTestCase<AllergyDrugSensitivity>(
			"validateAllergyDrugSensitivityAllergyProductTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyDrugSensitivity target) {

			}

			@Override
			protected void updateToPass(AllergyDrugSensitivity target) {
				target.init();
				AlertObservation obs = CCDFactory.eINSTANCE.createAlertObservation();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				par.setTypeCode(ParticipationType.CSM);
				obs.getParticipants().add(par);
				target.addObservation(obs);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivityAllergyProductTypeCode(
					(AllergyDrugSensitivity) objectToTest, diagnostician, map);
			}

		};

		validateAllergyDrugSensitivityAllergyProductTypeCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateAllergyDrugSensitivityProductDetailParticipantRole() {
		OperationsTestCase<AllergyDrugSensitivity> validateAllergyDrugSensitivityProductDetailParticipantRoleTestCase = new OperationsTestCase<AllergyDrugSensitivity>(
			"validateAllergyDrugSensitivityProductDetailParticipantRole",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyDrugSensitivity target) {

			}

			@Override
			protected void updateToPass(AllergyDrugSensitivity target) {
				target.init();
				AlertObservation obs = CCDFactory.eINSTANCE.createAlertObservation();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				par.setTypeCode(ParticipationType.CSM);
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				par.setParticipantRole(pr);
				obs.getParticipants().add(par);
				target.addObservation(obs);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivityProductDetailParticipantRole(
					(AllergyDrugSensitivity) objectToTest, diagnostician, map);
			}

		};

		validateAllergyDrugSensitivityProductDetailParticipantRoleTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateAllergyDrugSensitivityProductDetailParticipantRoleClassCode() {
		OperationsTestCase<AllergyDrugSensitivity> validateAllergyDrugSensitivityProductDetailParticipantRoleClassCodeTestCase = new OperationsTestCase<AllergyDrugSensitivity>(
			"validateAllergyDrugSensitivityProductDetailParticipantRoleClassCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyDrugSensitivity target) {

			}

			@Override
			protected void updateToPass(AllergyDrugSensitivity target) {
				target.init();
				AlertObservation obs = CCDFactory.eINSTANCE.createAlertObservation();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				par.setTypeCode(ParticipationType.CSM);
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				pr.setClassCode(RoleClassRoot.MANU);
				par.setParticipantRole(pr);
				obs.getParticipants().add(par);
				target.addObservation(obs);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivityProductDetailParticipantRoleClassCode(
					(AllergyDrugSensitivity) objectToTest, diagnostician, map);
			}

		};

		validateAllergyDrugSensitivityProductDetailParticipantRoleClassCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateAllergyDrugSensitivityProductDetailPlayingEntity() {
		OperationsTestCase<AllergyDrugSensitivity> validateAllergyDrugSensitivityProductDetailPlayingEntityTestCase = new OperationsTestCase<AllergyDrugSensitivity>(
			"validateAllergyDrugSensitivityProductDetailPlayingEntity",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyDrugSensitivity target) {

			}

			@Override
			protected void updateToPass(AllergyDrugSensitivity target) {
				target.init();
				AlertObservation obs = CCDFactory.eINSTANCE.createAlertObservation();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				par.setTypeCode(ParticipationType.CSM);
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				pr.setClassCode(RoleClassRoot.MANU);
				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();
				pe.setClassCode(EntityClassRoot.MMAT);
				pr.setPlayingEntity(pe);
				par.setParticipantRole(pr);
				obs.getParticipants().add(par);
				target.addObservation(obs);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivityProductDetailPlayingEntity(
					(AllergyDrugSensitivity) objectToTest, diagnostician, map);
			}

		};

		validateAllergyDrugSensitivityProductDetailPlayingEntityTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateAllergyDrugSensitivityProductDetailPlayingEntityClassCode() {
		OperationsTestCase<AllergyDrugSensitivity> validateAllergyDrugSensitivityProductDetailPlayingEntityClassCodeTestCase = new OperationsTestCase<AllergyDrugSensitivity>(
			"validateAllergyDrugSensitivityProductDetailPlayingEntityClassCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_PLAYING_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyDrugSensitivity target) {

			}

			@Override
			protected void updateToPass(AllergyDrugSensitivity target) {
				target.init();
				AlertObservation obs = CCDFactory.eINSTANCE.createAlertObservation();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				par.setTypeCode(ParticipationType.CSM);
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				pr.setClassCode(RoleClassRoot.MANU);
				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();
				pe.setClassCode(EntityClassRoot.MMAT);
				pr.setPlayingEntity(pe);
				par.setParticipantRole(pr);
				obs.getParticipants().add(par);
				target.addObservation(obs);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivityProductDetailPlayingEntityClassCode(
					(AllergyDrugSensitivity) objectToTest, diagnostician, map);
			}

		};

		validateAllergyDrugSensitivityProductDetailPlayingEntityClassCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateAllergyDrugSensitivityProductDetailName() {
		OperationsTestCase<AllergyDrugSensitivity> validateAllergyDrugSensitivityProductDetailNameTestCase = new OperationsTestCase<AllergyDrugSensitivity>(
			"validateAllergyDrugSensitivityProductDetailName",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_DETAIL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyDrugSensitivity target) {

			}

			@Override
			protected void updateToPass(AllergyDrugSensitivity target) {
				target.init();
				AlertObservation obs = CCDFactory.eINSTANCE.createAlertObservation();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				par.setTypeCode(ParticipationType.CSM);
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				pr.setClassCode(RoleClassRoot.MANU);
				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();
				pe.setClassCode(EntityClassRoot.MMAT);
				PN name = DatatypesFactory.eINSTANCE.createPN();

				pe.getNames().add(name);
				pr.setPlayingEntity(pe);
				par.setParticipantRole(pr);
				obs.getParticipants().add(par);
				target.addObservation(obs);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivityProductDetailName(
					(AllergyDrugSensitivity) objectToTest, diagnostician, map);
			}

		};

		validateAllergyDrugSensitivityProductDetailNameTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateAllergyDrugSensitivityProductCode() {
		OperationsTestCase<AllergyDrugSensitivity> validateAllergyDrugSensitivityProductCodeTestCase = new OperationsTestCase<AllergyDrugSensitivity>(
			"validateAllergyDrugSensitivityProductCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_DRUG_SENSITIVITY_PRODUCT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyDrugSensitivity target) {

			}

			@Override
			protected void updateToPass(AllergyDrugSensitivity target) {
				target.init();
				AlertObservation obs = CCDFactory.eINSTANCE.createAlertObservation();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				par.setTypeCode(ParticipationType.CSM);
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				pr.setClassCode(RoleClassRoot.MANU);
				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();
				pe.setClassCode(EntityClassRoot.MMAT);
				CE code = DatatypesFactory.eINSTANCE.createCE();
				pe.setCode(code);
				pr.setPlayingEntity(pe);
				par.setParticipantRole(pr);
				obs.getParticipants().add(par);
				target.addObservation(obs);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivityProductCode(
					(AllergyDrugSensitivity) objectToTest, diagnostician, map);
			}

		};

		validateAllergyDrugSensitivityProductCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateAllergyDrugSensitivityAllergyProductFoodVocab() {
		OperationsTestCase<AllergyDrugSensitivity> validateAllergyDrugSensitivityAllergyProductFoodVocabTestCase = new OperationsTestCase<AllergyDrugSensitivity>(
			"validateAllergyDrugSensitivityAllergyProductFoodVocab",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT_FOOD_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyDrugSensitivity target) {

			}

			@Override
			protected void updateToPass(AllergyDrugSensitivity target) {
				target.init();
				AlertObservation obs = CCDFactory.eINSTANCE.createAlertObservation();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				par.setTypeCode(ParticipationType.CSM);
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				pr.setClassCode(RoleClassRoot.MANU);
				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();
				pe.setClassCode(EntityClassRoot.MMAT);
				CE code = DatatypesFactory.eINSTANCE.createCE();
				code.setCodeSystem("2.16.840.1.113883.4.9");
				pe.setCode(code);
				pr.setPlayingEntity(pe);
				par.setParticipantRole(pr);
				obs.getParticipants().add(par);
				target.addObservation(obs);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivityAllergyProductFoodVocab(
					(AllergyDrugSensitivity) objectToTest, diagnostician, map);
			}

		};

		validateAllergyDrugSensitivityAllergyProductFoodVocabTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateAllergyDrugSensitivityAllergyProductMedClassVocab() {
		OperationsTestCase<AllergyDrugSensitivity> validateAllergyDrugSensitivityAllergyProductMedClassVocabTestCase = new OperationsTestCase<AllergyDrugSensitivity>(
			"validateAllergyDrugSensitivityAllergyProductMedClassVocab",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT_MED_CLASS_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyDrugSensitivity target) {

			}

			@Override
			protected void updateToPass(AllergyDrugSensitivity target) {
				target.init();
				Observation obs = IHEFactory.eINSTANCE.createAllergyIntolerance().init();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				par.setTypeCode(ParticipationType.CSM);
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				pr.setClassCode(RoleClassRoot.MANU);
				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();
				pe.setClassCode(EntityClassRoot.MMAT);
				CE code = DatatypesFactory.eINSTANCE.createCE();
				code.setCodeSystem("2.16.840.1.113883.6.88"); // "2.16.840.1.113883.3.26.1.5");
				// code.setCode("1191");
				// code.setDisplayName("Aspirin");
				//
				pe.setCode(code);
				pr.setPlayingEntity(pe);
				par.setParticipantRole(pr);
				obs.getParticipants().add(par);
				target.addObservation(obs);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivityAllergyProductMedClassVocab(
					(AllergyDrugSensitivity) objectToTest, diagnostician, map);
			}

		};

		validateAllergyDrugSensitivityAllergyProductMedClassVocabTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateAllergyDrugSensitivityAllergyProductSpecificMedVocab() {
		OperationsTestCase<AllergyDrugSensitivity> validateAllergyDrugSensitivityAllergyProductSpecificMedVocabTestCase = new OperationsTestCase<AllergyDrugSensitivity>(
			"validateAllergyDrugSensitivityAllergyProductSpecificMedVocab",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_DRUG_SENSITIVITY_ALLERGY_PRODUCT_SPECIFIC_MED_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyDrugSensitivity target) {

			}

			@Override
			protected void updateToPass(AllergyDrugSensitivity target) {
				target.init();
				AlertObservation obs = CCDFactory.eINSTANCE.createAlertObservation();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				par.setTypeCode(ParticipationType.CSM);
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				pr.setClassCode(RoleClassRoot.MANU);
				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();
				pe.setClassCode(EntityClassRoot.MMAT);
				CE code = DatatypesFactory.eINSTANCE.createCE();
				code.setCodeSystem("2.16.840.1.113883.6.88");
				pe.setCode(code);
				pr.setPlayingEntity(pe);
				par.setParticipantRole(pr);
				obs.getParticipants().add(par);
				target.addObservation(obs);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivityAllergyProductSpecificMedVocab(
					(AllergyDrugSensitivity) objectToTest, diagnostician, map);
			}

		};

		validateAllergyDrugSensitivityAllergyProductSpecificMedVocabTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateAllergyDrugSensitivityReactionText() {
		OperationsTestCase<AllergyDrugSensitivity> validateAllergyDrugSensitivityReactionTextTestCase = new OperationsTestCase<AllergyDrugSensitivity>(
			"validateAllergyDrugSensitivityReactionText",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_DRUG_SENSITIVITY_REACTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyDrugSensitivity target) {

				target.init();
				AlertObservation obs = CCDFactory.eINSTANCE.createAlertObservation().init();
				ReactionObservation ro = CCDFactory.eINSTANCE.createReactionObservation().init();

				// ro.setText(DatatypesFactory.eINSTANCE.createED());
				obs.addObservation(ro);
				obs.addObservation(CCDFactory.eINSTANCE.createStatusObservation().init());
				target.addObservation(obs);

			}

			@Override
			protected void updateToPass(AllergyDrugSensitivity target) {

				for (Observation observation : target.getObservations()) {
					for (Observation observation2 : observation.getObservations()) {
						observation2.setText(DatatypesFactory.eINSTANCE.createED("somecontent"));
					}

				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivityReactionText(
					(AllergyDrugSensitivity) objectToTest, diagnostician, map);
			}

		};

		validateAllergyDrugSensitivityReactionTextTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateAllergyDrugSensitivityReactionCode() {
		OperationsTestCase<AllergyDrugSensitivity> validateAllergyDrugSensitivityReactionCodeTestCase = new OperationsTestCase<AllergyDrugSensitivity>(
			"validateAllergyDrugSensitivityReactionCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_DRUG_SENSITIVITY_REACTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyDrugSensitivity target) {
				target.init();
				AlertObservation obs = CCDFactory.eINSTANCE.createAlertObservation();
				ReactionObservation ro = CCDFactory.eINSTANCE.createReactionObservation();
				// CD code = DatatypesFactory.eINSTANCE.createCD();
				// ro.setCode(code);
				obs.addObservation(ro);
				target.addObservation(obs);
			}

			@Override
			protected void updateToPass(AllergyDrugSensitivity target) {
				target.getEntryRelationships().clear();
				AlertObservation obs = CCDFactory.eINSTANCE.createAlertObservation();
				ReactionObservation ro = CCDFactory.eINSTANCE.createReactionObservation();
				CD code = DatatypesFactory.eINSTANCE.createCD();
				ro.setCode(code);
				obs.addObservation(ro);
				target.addObservation(obs);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivityReactionCode(
					(AllergyDrugSensitivity) objectToTest, diagnostician, map);
			}

		};

		validateAllergyDrugSensitivityReactionCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateAllergyDrugSensitivityReactionCodeVocab() {
		OperationsTestCase<AllergyDrugSensitivity> validateAllergyDrugSensitivityReactionCodeVocabTestCase = new OperationsTestCase<AllergyDrugSensitivity>(
			"validateAllergyDrugSensitivityReactionCodeVocab",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_DRUG_SENSITIVITY_REACTION_CODE_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyDrugSensitivity target) {
				target.init();
				AlertObservation obs = CCDFactory.eINSTANCE.createAlertObservation();
				ReactionObservation ro = CCDFactory.eINSTANCE.createReactionObservation();
				CD code = DatatypesFactory.eINSTANCE.createCD();
				// code.setCodeSystem("2.16.840.1.113883.6.96");
				// code.setCode("243796009");
				ro.setCode(code);
				obs.addObservation(ro);
				target.addObservation(obs);
			}

			@Override
			protected void updateToPass(AllergyDrugSensitivity target) {
				target.getEntryRelationships().clear();
				AlertObservation obs = CCDFactory.eINSTANCE.createAlertObservation();
				ReactionObservation ro = CCDFactory.eINSTANCE.createReactionObservation();
				CD code = DatatypesFactory.eINSTANCE.createCD();
				code.setCodeSystem("2.16.840.1.113883.6.96");
				code.setCode("243796009");
				ro.setCode(code);
				obs.addObservation(ro);
				target.addObservation(obs);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivityReactionCodeVocab(
					(AllergyDrugSensitivity) objectToTest, diagnostician, map);
			}

		};

		validateAllergyDrugSensitivityReactionCodeVocabTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateAllergyDrugSensitivitySeverityText() {
		OperationsTestCase<AllergyDrugSensitivity> validateAllergyDrugSensitivitySeverityTextTestCase = new OperationsTestCase<AllergyDrugSensitivity>(
			"validateAllergyDrugSensitivitySeverityText",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_DRUG_SENSITIVITY_SEVERITY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyDrugSensitivity target) {
				target.init();
				AlertObservation obs = CCDFactory.eINSTANCE.createAlertObservation();
				SeverityObservation so = CCDFactory.eINSTANCE.createSeverityObservation().init();
				// so.setText(DatatypesFactory.eINSTANCE.createED());
				obs.addObservation(so);
				target.addObservation(obs);
			}

			@Override
			protected void updateToPass(AllergyDrugSensitivity target) {
				target.getEntryRelationships().clear();
				AlertObservation obs = CCDFactory.eINSTANCE.createAlertObservation();
				SeverityObservation so = CCDFactory.eINSTANCE.createSeverityObservation().init();
				so.setText(DatatypesFactory.eINSTANCE.createED());
				obs.addObservation(so);
				target.addObservation(obs);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivitySeverityText(
					(AllergyDrugSensitivity) objectToTest, diagnostician, map);
			}

		};

		validateAllergyDrugSensitivitySeverityTextTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateAllergyDrugSensitivitySeverityCode() {
		OperationsTestCase<AllergyDrugSensitivity> validateAllergyDrugSensitivitySeverityCodeTestCase = new OperationsTestCase<AllergyDrugSensitivity>(
			"validateAllergyDrugSensitivitySeverityCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_DRUG_SENSITIVITY_SEVERITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyDrugSensitivity target) {
				target.init();
				AlertObservation obs = CCDFactory.eINSTANCE.createAlertObservation();
				SeverityObservation so = CCDFactory.eINSTANCE.createSeverityObservation();
				DatatypesFactory.eINSTANCE.createCD();
				// so.setCode(code);
				obs.addObservation(so);
				target.addObservation(obs);
			}

			@Override
			protected void updateToPass(AllergyDrugSensitivity target) {
				target.getEntryRelationships().clear();
				AlertObservation obs = CCDFactory.eINSTANCE.createAlertObservation();
				SeverityObservation so = CCDFactory.eINSTANCE.createSeverityObservation();
				CD code = DatatypesFactory.eINSTANCE.createCD();
				so.setCode(code);
				obs.addObservation(so);
				target.addObservation(obs);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivitySeverityCode(
					(AllergyDrugSensitivity) objectToTest, diagnostician, map);
			}

		};

		validateAllergyDrugSensitivitySeverityCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateAllergyDrugSensitivitySeverityCodeVocab() {
		OperationsTestCase<AllergyDrugSensitivity> validateAllergyDrugSensitivitySeverityCodeVocabTestCase = new OperationsTestCase<AllergyDrugSensitivity>(
			"validateAllergyDrugSensitivitySeverityCodeVocab",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_DRUG_SENSITIVITY_SEVERITY_CODE_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyDrugSensitivity target) {
				target.init();
				AlertObservation obs = CCDFactory.eINSTANCE.createAlertObservation();
				SeverityObservation so = CCDFactory.eINSTANCE.createSeverityObservation();
				CD code = DatatypesFactory.eINSTANCE.createCD();
				code.setCodeSystem("2.16.840.1.113883.6.96");
				code.setCode("371923003");
				// so.setCode(code);
				obs.addObservation(so);
				target.addObservation(obs);
			}

			@Override
			protected void updateToPass(AllergyDrugSensitivity target) {
				target.getEntryRelationships().clear();
				AlertObservation obs = CCDFactory.eINSTANCE.createAlertObservation();
				SeverityObservation so = CCDFactory.eINSTANCE.createSeverityObservation();
				CD code = DatatypesFactory.eINSTANCE.createCD();
				code.setCodeSystem("2.16.840.1.113883.6.96");
				code.setCode("371923003");
				so.setCode(code);
				obs.addObservation(so);
				target.addObservation(obs);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivitySeverityCodeVocab(
					(AllergyDrugSensitivity) objectToTest, diagnostician, map);
			}

		};

		validateAllergyDrugSensitivitySeverityCodeVocabTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateAllergyDrugSensitivityTemplateId() {
		OperationsTestCase<AllergyDrugSensitivity> validateAllergyDrugSensitivityTemplateIdTestCase = new OperationsTestCase<AllergyDrugSensitivity>(
			"validateAllergyDrugSensitivityTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_DRUG_SENSITIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyDrugSensitivity target) {

			}

			@Override
			protected void updateToPass(AllergyDrugSensitivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivityTemplateId(
					(AllergyDrugSensitivity) objectToTest, diagnostician, map);
			}

		};

		validateAllergyDrugSensitivityTemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends AllergyDrugSensitivityOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AllergyDrugSensitivity> {

		public AllergyDrugSensitivity create() {
			return HITSPFactory.eINSTANCE.createAllergyDrugSensitivity();
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
	 * 
	 * @generated
	 */
	private static class ConstructorTestClass extends AllergyDrugSensitivityOperations {
	}

	/**
	 * Tests Operations Constructor for 100% coverage
	 * 
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

} // AllergyDrugSensitivityOperations
