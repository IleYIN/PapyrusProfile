/**
 */
package certification;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see certification.CertificationFactory
 * @model kind="package"
 * @generated
 */
public interface CertificationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "certification";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.isae.fr/certification/1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "certification";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CertificationPackage eINSTANCE = certification.impl.CertificationPackageImpl.init();

	/**
	 * The meta object id for the '{@link certification.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see certification.impl.ProcessImpl
	 * @see certification.impl.CertificationPackageImpl#getProcess()
	 * @generated
	 */
	int PROCESS = 0;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__BASE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ACTIVITY = 1;

	/**
	 * The feature id for the '<em><b>Subprocess</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__SUBPROCESS = 2;

	/**
	 * The feature id for the '<em><b>Semantics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__SEMANTICS = 3;

	/**
	 * The feature id for the '<em><b>Nextprocess</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__NEXTPROCESS = 4;

	/**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Constraint Attribute Of Process</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___CONSTRAINT_ATTRIBUTE_OF_PROCESS__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link certification.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see certification.impl.ActivityImpl
	 * @see certification.impl.CertificationPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 1;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__BASE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__TASK = 1;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link certification.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see certification.impl.TaskImpl
	 * @see certification.impl.CertificationPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 2;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__BASE_CLASS = 0;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link certification.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see certification.impl.RoleImpl
	 * @see certification.impl.CertificationPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 3;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__BASE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ACTIVITY = 1;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link certification.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see certification.impl.AttributeImpl
	 * @see certification.impl.CertificationPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 4;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__BASE_PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Update Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__UPDATE_TIME = 1;

	/**
	 * The feature id for the '<em><b>Semantics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__SEMANTICS = 2;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__CONTENT = 3;

	/**
	 * The feature id for the '<em><b>Sub Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__SUB_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link certification.impl.ArtefactImpl <em>Artefact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see certification.impl.ArtefactImpl
	 * @see certification.impl.CertificationPackageImpl#getArtefact()
	 * @generated
	 */
	int ARTEFACT = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTEFACT__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTEFACT__ATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Base Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTEFACT__BASE_PORT = 2;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTEFACT__DIRECTION = 3;

	/**
	 * The number of structural features of the '<em>Artefact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTEFACT_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Constraint Attribute Of Artefact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTEFACT___CONSTRAINT_ATTRIBUTE_OF_ARTEFACT__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Artefact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTEFACT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link certification.TypeOfArtefact <em>Type Of Artefact</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see certification.TypeOfArtefact
	 * @see certification.impl.CertificationPackageImpl#getTypeOfArtefact()
	 * @generated
	 */
	int TYPE_OF_ARTEFACT = 6;

	/**
	 * The meta object id for the '{@link certification.Direction <em>Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see certification.Direction
	 * @see certification.impl.CertificationPackageImpl#getDirection()
	 * @generated
	 */
	int DIRECTION = 7;


	/**
	 * Returns the meta object for class '{@link certification.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see certification.Process
	 * @generated
	 */
	EClass getProcess();

	/**
	 * Returns the meta object for the reference '{@link certification.Process#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see certification.Process#getBase_Class()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Base_Class();

	/**
	 * Returns the meta object for the reference list '{@link certification.Process#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activity</em>'.
	 * @see certification.Process#getActivity()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Activity();

	/**
	 * Returns the meta object for the reference list '{@link certification.Process#getSubprocess <em>Subprocess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subprocess</em>'.
	 * @see certification.Process#getSubprocess()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Subprocess();

	/**
	 * Returns the meta object for the attribute '{@link certification.Process#getSemantics <em>Semantics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semantics</em>'.
	 * @see certification.Process#getSemantics()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_Semantics();

	/**
	 * Returns the meta object for the reference list '{@link certification.Process#getNextprocess <em>Nextprocess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Nextprocess</em>'.
	 * @see certification.Process#getNextprocess()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Nextprocess();

	/**
	 * Returns the meta object for the '{@link certification.Process#ConstraintAttributeOfProcess(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Constraint Attribute Of Process</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Constraint Attribute Of Process</em>' operation.
	 * @see certification.Process#ConstraintAttributeOfProcess(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getProcess__ConstraintAttributeOfProcess__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link certification.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see certification.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the reference '{@link certification.Activity#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see certification.Activity#getBase_Class()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Base_Class();

	/**
	 * Returns the meta object for the reference list '{@link certification.Activity#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Task</em>'.
	 * @see certification.Activity#getTask()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Task();

	/**
	 * Returns the meta object for class '{@link certification.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see certification.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the reference '{@link certification.Task#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see certification.Task#getBase_Class()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Base_Class();

	/**
	 * Returns the meta object for class '{@link certification.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see certification.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the reference '{@link certification.Role#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see certification.Role#getBase_Class()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Base_Class();

	/**
	 * Returns the meta object for the reference list '{@link certification.Role#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activity</em>'.
	 * @see certification.Role#getActivity()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Activity();

	/**
	 * Returns the meta object for class '{@link certification.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see certification.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the reference '{@link certification.Attribute#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see certification.Attribute#getBase_Property()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Base_Property();

	/**
	 * Returns the meta object for the attribute '{@link certification.Attribute#getUpdateTime <em>Update Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update Time</em>'.
	 * @see certification.Attribute#getUpdateTime()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_UpdateTime();

	/**
	 * Returns the meta object for the attribute '{@link certification.Attribute#getSemantics <em>Semantics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semantics</em>'.
	 * @see certification.Attribute#getSemantics()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Semantics();

	/**
	 * Returns the meta object for the attribute '{@link certification.Attribute#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see certification.Attribute#getContent()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Content();

	/**
	 * Returns the meta object for the reference list '{@link certification.Attribute#getSubAttribute <em>Sub Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Attribute</em>'.
	 * @see certification.Attribute#getSubAttribute()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_SubAttribute();

	/**
	 * Returns the meta object for class '{@link certification.Artefact <em>Artefact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artefact</em>'.
	 * @see certification.Artefact
	 * @generated
	 */
	EClass getArtefact();

	/**
	 * Returns the meta object for the attribute '{@link certification.Artefact#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see certification.Artefact#getType()
	 * @see #getArtefact()
	 * @generated
	 */
	EAttribute getArtefact_Type();

	/**
	 * Returns the meta object for the reference list '{@link certification.Artefact#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attribute</em>'.
	 * @see certification.Artefact#getAttribute()
	 * @see #getArtefact()
	 * @generated
	 */
	EReference getArtefact_Attribute();

	/**
	 * Returns the meta object for the reference '{@link certification.Artefact#getBase_Port <em>Base Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Port</em>'.
	 * @see certification.Artefact#getBase_Port()
	 * @see #getArtefact()
	 * @generated
	 */
	EReference getArtefact_Base_Port();

	/**
	 * Returns the meta object for the attribute '{@link certification.Artefact#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see certification.Artefact#getDirection()
	 * @see #getArtefact()
	 * @generated
	 */
	EAttribute getArtefact_Direction();

	/**
	 * Returns the meta object for the '{@link certification.Artefact#ConstraintAttributeOfArtefact(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Constraint Attribute Of Artefact</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Constraint Attribute Of Artefact</em>' operation.
	 * @see certification.Artefact#ConstraintAttributeOfArtefact(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getArtefact__ConstraintAttributeOfArtefact__DiagnosticChain_Map();

	/**
	 * Returns the meta object for enum '{@link certification.TypeOfArtefact <em>Type Of Artefact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Of Artefact</em>'.
	 * @see certification.TypeOfArtefact
	 * @generated
	 */
	EEnum getTypeOfArtefact();

	/**
	 * Returns the meta object for enum '{@link certification.Direction <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Direction</em>'.
	 * @see certification.Direction
	 * @generated
	 */
	EEnum getDirection();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CertificationFactory getCertificationFactory();

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
		 * The meta object literal for the '{@link certification.impl.ProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see certification.impl.ProcessImpl
		 * @see certification.impl.CertificationPackageImpl#getProcess()
		 * @generated
		 */
		EClass PROCESS = eINSTANCE.getProcess();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__BASE_CLASS = eINSTANCE.getProcess_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__ACTIVITY = eINSTANCE.getProcess_Activity();

		/**
		 * The meta object literal for the '<em><b>Subprocess</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__SUBPROCESS = eINSTANCE.getProcess_Subprocess();

		/**
		 * The meta object literal for the '<em><b>Semantics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__SEMANTICS = eINSTANCE.getProcess_Semantics();

		/**
		 * The meta object literal for the '<em><b>Nextprocess</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__NEXTPROCESS = eINSTANCE.getProcess_Nextprocess();

		/**
		 * The meta object literal for the '<em><b>Constraint Attribute Of Process</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROCESS___CONSTRAINT_ATTRIBUTE_OF_PROCESS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getProcess__ConstraintAttributeOfProcess__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link certification.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see certification.impl.ActivityImpl
		 * @see certification.impl.CertificationPackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__BASE_CLASS = eINSTANCE.getActivity_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__TASK = eINSTANCE.getActivity_Task();

		/**
		 * The meta object literal for the '{@link certification.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see certification.impl.TaskImpl
		 * @see certification.impl.CertificationPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__BASE_CLASS = eINSTANCE.getTask_Base_Class();

		/**
		 * The meta object literal for the '{@link certification.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see certification.impl.RoleImpl
		 * @see certification.impl.CertificationPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__BASE_CLASS = eINSTANCE.getRole_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__ACTIVITY = eINSTANCE.getRole_Activity();

		/**
		 * The meta object literal for the '{@link certification.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see certification.impl.AttributeImpl
		 * @see certification.impl.CertificationPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__BASE_PROPERTY = eINSTANCE.getAttribute_Base_Property();

		/**
		 * The meta object literal for the '<em><b>Update Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__UPDATE_TIME = eINSTANCE.getAttribute_UpdateTime();

		/**
		 * The meta object literal for the '<em><b>Semantics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__SEMANTICS = eINSTANCE.getAttribute_Semantics();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__CONTENT = eINSTANCE.getAttribute_Content();

		/**
		 * The meta object literal for the '<em><b>Sub Attribute</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__SUB_ATTRIBUTE = eINSTANCE.getAttribute_SubAttribute();

		/**
		 * The meta object literal for the '{@link certification.impl.ArtefactImpl <em>Artefact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see certification.impl.ArtefactImpl
		 * @see certification.impl.CertificationPackageImpl#getArtefact()
		 * @generated
		 */
		EClass ARTEFACT = eINSTANCE.getArtefact();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTEFACT__TYPE = eINSTANCE.getArtefact_Type();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTEFACT__ATTRIBUTE = eINSTANCE.getArtefact_Attribute();

		/**
		 * The meta object literal for the '<em><b>Base Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTEFACT__BASE_PORT = eINSTANCE.getArtefact_Base_Port();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTEFACT__DIRECTION = eINSTANCE.getArtefact_Direction();

		/**
		 * The meta object literal for the '<em><b>Constraint Attribute Of Artefact</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARTEFACT___CONSTRAINT_ATTRIBUTE_OF_ARTEFACT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getArtefact__ConstraintAttributeOfArtefact__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link certification.TypeOfArtefact <em>Type Of Artefact</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see certification.TypeOfArtefact
		 * @see certification.impl.CertificationPackageImpl#getTypeOfArtefact()
		 * @generated
		 */
		EEnum TYPE_OF_ARTEFACT = eINSTANCE.getTypeOfArtefact();

		/**
		 * The meta object literal for the '{@link certification.Direction <em>Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see certification.Direction
		 * @see certification.impl.CertificationPackageImpl#getDirection()
		 * @generated
		 */
		EEnum DIRECTION = eINSTANCE.getDirection();

	}

} //CertificationPackage
