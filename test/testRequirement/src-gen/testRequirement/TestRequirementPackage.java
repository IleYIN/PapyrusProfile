/**
 */
package testRequirement;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.papyrus.sysml14.requirements.RequirementsPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see testRequirement.TestRequirementFactory
 * @model kind="package"
 * @generated
 */
public interface TestRequirementPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "testRequirement";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://MyRequirement/1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "testRequirement";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TestRequirementPackage eINSTANCE = testRequirement.impl.TestRequirementPackageImpl.init();

	/**
	 * The meta object id for the '{@link testRequirement.impl.RequirementPlusImpl <em>Requirement Plus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see testRequirement.impl.RequirementPlusImpl
	 * @see testRequirement.impl.TestRequirementPackageImpl#getRequirementPlus()
	 * @generated
	 */
	int REQUIREMENT_PLUS = 0;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_PLUS__BASE_CLASS = RequirementsPackage.REQUIREMENT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_PLUS__DERIVED = RequirementsPackage.REQUIREMENT__DERIVED;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_PLUS__DERIVED_FROM = RequirementsPackage.REQUIREMENT__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_PLUS__ID = RequirementsPackage.REQUIREMENT__ID;

	/**
	 * The feature id for the '<em><b>Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_PLUS__MASTER = RequirementsPackage.REQUIREMENT__MASTER;

	/**
	 * The feature id for the '<em><b>Refined By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_PLUS__REFINED_BY = RequirementsPackage.REQUIREMENT__REFINED_BY;

	/**
	 * The feature id for the '<em><b>Satisfied By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_PLUS__SATISFIED_BY = RequirementsPackage.REQUIREMENT__SATISFIED_BY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_PLUS__TEXT = RequirementsPackage.REQUIREMENT__TEXT;

	/**
	 * The feature id for the '<em><b>Traced To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_PLUS__TRACED_TO = RequirementsPackage.REQUIREMENT__TRACED_TO;

	/**
	 * The feature id for the '<em><b>Verified By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_PLUS__VERIFIED_BY = RequirementsPackage.REQUIREMENT__VERIFIED_BY;

	/**
	 * The feature id for the '<em><b>Verified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_PLUS__VERIFIED = RequirementsPackage.REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Requirement Plus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_PLUS_FEATURE_COUNT = RequirementsPackage.REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Constraint9</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_PLUS___CONSTRAINT9__DIAGNOSTICCHAIN_MAP = RequirementsPackage.REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Requirement Plus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_PLUS_OPERATION_COUNT = RequirementsPackage.REQUIREMENT_OPERATION_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link testRequirement.RequirementPlus <em>Requirement Plus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement Plus</em>'.
	 * @see testRequirement.RequirementPlus
	 * @generated
	 */
	EClass getRequirementPlus();

	/**
	 * Returns the meta object for the attribute '{@link testRequirement.RequirementPlus#isVerified <em>Verified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Verified</em>'.
	 * @see testRequirement.RequirementPlus#isVerified()
	 * @see #getRequirementPlus()
	 * @generated
	 */
	EAttribute getRequirementPlus_Verified();

	/**
	 * Returns the meta object for the '{@link testRequirement.RequirementPlus#Constraint9(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Constraint9</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Constraint9</em>' operation.
	 * @see testRequirement.RequirementPlus#Constraint9(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRequirementPlus__Constraint9__DiagnosticChain_Map();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TestRequirementFactory getTestRequirementFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link testRequirement.impl.RequirementPlusImpl <em>Requirement Plus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see testRequirement.impl.RequirementPlusImpl
		 * @see testRequirement.impl.TestRequirementPackageImpl#getRequirementPlus()
		 * @generated
		 */
		EClass REQUIREMENT_PLUS = eINSTANCE.getRequirementPlus();

		/**
		 * The meta object literal for the '<em><b>Verified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_PLUS__VERIFIED = eINSTANCE.getRequirementPlus_Verified();

		/**
		 * The meta object literal for the '<em><b>Constraint9</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REQUIREMENT_PLUS___CONSTRAINT9__DIAGNOSTICCHAIN_MAP = eINSTANCE.getRequirementPlus__Constraint9__DiagnosticChain_Map();

	}

} //TestRequirementPackage
