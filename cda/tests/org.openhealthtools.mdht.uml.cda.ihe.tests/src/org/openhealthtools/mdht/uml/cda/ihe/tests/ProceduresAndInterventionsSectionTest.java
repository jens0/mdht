/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.ProceduresAndInterventionsSection;
import org.openhealthtools.mdht.uml.cda.ihe.operations.ProceduresAndInterventionsSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedures And Interventions Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProceduresAndInterventionsSection#validateProceduresAndInterventionsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures And Interventions Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProceduresAndInterventionsSection#validateProceduresAndInterventionsSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedures And Interventions Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProceduresAndInterventionsSection#getProcedureEntry() <em>Get Procedure Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProceduresAndInterventionsSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProceduresAndInterventionsSectionTemplateId() {
		OperationsTestCase<ProceduresAndInterventionsSection> validateProceduresAndInterventionsSectionTemplateIdTestCase = new OperationsTestCase<ProceduresAndInterventionsSection>(
			"validateProceduresAndInterventionsSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURES_AND_INTERVENTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresAndInterventionsSection target) {

			}

			@Override
			protected void updateToPass(ProceduresAndInterventionsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresAndInterventionsSectionOperations.validateProceduresAndInterventionsSectionTemplateId(
					(ProceduresAndInterventionsSection) objectToTest, diagnostician, map);
			}

		};

		validateProceduresAndInterventionsSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProceduresAndInterventionsSectionCode() {
		OperationsTestCase<ProceduresAndInterventionsSection> validateProceduresAndInterventionsSectionCodeTestCase = new OperationsTestCase<ProceduresAndInterventionsSection>(
			"validateProceduresAndInterventionsSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURES_AND_INTERVENTIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProceduresAndInterventionsSection target) {

			}

			@Override
			protected void updateToPass(ProceduresAndInterventionsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProceduresAndInterventionsSectionOperations.validateProceduresAndInterventionsSectionCode(
					(ProceduresAndInterventionsSection) objectToTest, diagnostician, map);
			}

		};

		validateProceduresAndInterventionsSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProcedureEntry() {

		ProceduresAndInterventionsSection target = objectFactory.create();
		target.getProcedureEntry();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProceduresAndInterventionsSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ProceduresAndInterventionsSection> {
		public ProceduresAndInterventionsSection create() {
			return IHEFactory.eINSTANCE.createProceduresAndInterventionsSection();
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
	private static class ConstructorTestClass extends ProceduresAndInterventionsSectionOperations {
	};

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

} // ProceduresAndInterventionsSectionOperations
