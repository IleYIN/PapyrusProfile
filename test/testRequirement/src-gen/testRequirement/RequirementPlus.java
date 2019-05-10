/**
 */
package testRequirement;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.papyrus.sysml14.requirements.Requirement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement Plus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link testRequirement.RequirementPlus#isVerified <em>Verified</em>}</li>
 * </ul>
 *
 * @see testRequirement.TestRequirementPackage#getRequirementPlus()
 * @model
 * @generated
 */
public interface RequirementPlus extends Requirement {
	/**
	 * Returns the value of the '<em><b>Verified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verified</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verified</em>' attribute.
	 * @see #setVerified(boolean)
	 * @see testRequirement.TestRequirementPackage#getRequirementPlus_Verified()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isVerified();

	/**
	 * Sets the value of the '{@link testRequirement.RequirementPlus#isVerified <em>Verified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verified</em>' attribute.
	 * @see #isVerified()
	 * @generated
	 */
	void setVerified(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.verified->notEmpty()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean Constraint9(DiagnosticChain diagnostics, Map<Object, Object> context);

} // RequirementPlus
