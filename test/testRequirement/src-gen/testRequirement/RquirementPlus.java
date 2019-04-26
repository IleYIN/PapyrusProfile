/**
 */
package testRequirement;

import org.eclipse.papyrus.sysml14.requirements.Requirement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rquirement Plus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link testRequirement.RquirementPlus#isVerified <em>Verified</em>}</li>
 * </ul>
 *
 * @see testRequirement.TestRequirementPackage#getRquirementPlus()
 * @model
 * @generated
 */
public interface RquirementPlus extends Requirement {
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
	 * @see testRequirement.TestRequirementPackage#getRquirementPlus_Verified()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isVerified();

	/**
	 * Sets the value of the '{@link testRequirement.RquirementPlus#isVerified <em>Verified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verified</em>' attribute.
	 * @see #isVerified()
	 * @generated
	 */
	void setVerified(boolean value);

} // RquirementPlus
