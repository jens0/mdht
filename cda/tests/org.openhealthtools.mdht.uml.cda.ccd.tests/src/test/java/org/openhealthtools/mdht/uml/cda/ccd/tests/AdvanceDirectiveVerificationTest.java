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
import org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectiveVerification;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.operations.AdvanceDirectiveVerificationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Advance Directive Verification</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectiveVerification#validateAdvanceDirectiveVerificationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Verification Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectiveVerification#validateAdvanceDirectiveVerificationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Verification Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectiveVerification#validateAdvanceDirectiveVerificationTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Verification Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AdvanceDirectiveVerificationTest extends CDAValidationTest {

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateAdvanceDirectiveVerificationTemplateId() {
		OperationsTestCase<AdvanceDirectiveVerification> validateAdvanceDirectiveVerificationTemplateIdTestCase = new OperationsTestCase<AdvanceDirectiveVerification>(
			"validateAdvanceDirectiveVerificationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_VERIFICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveVerification target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveVerification target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveVerificationOperations.validateAdvanceDirectiveVerificationTemplateId(
					(AdvanceDirectiveVerification) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveVerificationTemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateAdvanceDirectiveVerificationTypeCode() {
		OperationsTestCase<AdvanceDirectiveVerification> validateAdvanceDirectiveVerificationTypeCodeTestCase = new OperationsTestCase<AdvanceDirectiveVerification>(
			"validateAdvanceDirectiveVerificationTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_VERIFICATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveVerification target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveVerification target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveVerificationOperations.validateAdvanceDirectiveVerificationTypeCode(
					(AdvanceDirectiveVerification) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveVerificationTypeCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateAdvanceDirectiveVerificationTime() {
		OperationsTestCase<AdvanceDirectiveVerification> validateAdvanceDirectiveVerificationTimeTestCase = new OperationsTestCase<AdvanceDirectiveVerification>(
			"validateAdvanceDirectiveVerificationTime",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_VERIFICATION_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveVerification target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveVerification target) {
				target.init();
				target.setTime(DatatypesFactory.eINSTANCE.createIVL_TS());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveVerificationOperations.validateAdvanceDirectiveVerificationTime(
					(AdvanceDirectiveVerification) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveVerificationTimeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends AdvanceDirectiveVerificationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AdvanceDirectiveVerification> {
		public AdvanceDirectiveVerification create() {
			return CCDFactory.eINSTANCE.createAdvanceDirectiveVerification();
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
	private static class ConstructorTestClass extends AdvanceDirectiveVerificationOperations {
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

} // AdvanceDirectiveVerificationOperations
