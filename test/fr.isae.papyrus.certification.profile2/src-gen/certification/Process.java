/**
 */
package certification;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link certification.Process#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link certification.Process#getActivity <em>Activity</em>}</li>
 *   <li>{@link certification.Process#getSubprocess <em>Subprocess</em>}</li>
 *   <li>{@link certification.Process#getSemantics <em>Semantics</em>}</li>
 *   <li>{@link certification.Process#getNextprocess <em>Nextprocess</em>}</li>
 * </ul>
 *
 * @see certification.CertificationPackage#getProcess()
 * @model
 * @generated
 */
public interface Process extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Class</em>' reference.
	 * @see #setBase_Class(org.eclipse.uml2.uml.Class)
	 * @see certification.CertificationPackage#getProcess_Base_Class()
	 * @model ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link certification.Process#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(org.eclipse.uml2.uml.Class value);

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' reference list.
	 * The list contents are of type {@link certification.Activity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' reference list.
	 * @see certification.CertificationPackage#getProcess_Activity()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Activity> getActivity();

	/**
	 * Returns the value of the '<em><b>Subprocess</b></em>' reference list.
	 * The list contents are of type {@link certification.Process}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subprocess</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subprocess</em>' reference list.
	 * @see certification.CertificationPackage#getProcess_Subprocess()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Process> getSubprocess();

	/**
	 * Returns the value of the '<em><b>Semantics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Semantics</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantics</em>' attribute.
	 * @see #setSemantics(String)
	 * @see certification.CertificationPackage#getProcess_Semantics()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getSemantics();

	/**
	 * Sets the value of the '{@link certification.Process#getSemantics <em>Semantics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semantics</em>' attribute.
	 * @see #getSemantics()
	 * @generated
	 */
	void setSemantics(String value);

	/**
	 * Returns the value of the '<em><b>Nextprocess</b></em>' reference list.
	 * The list contents are of type {@link certification.Process}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nextprocess</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nextprocess</em>' reference list.
	 * @see certification.CertificationPackage#getProcess_Nextprocess()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Process> getNextprocess();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.base_Class.ownedAttribute->forAll(not extension_Attribute.oclIsUndefined())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean ConstraintAttributeOfProcess(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Process
