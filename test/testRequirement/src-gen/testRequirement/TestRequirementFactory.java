/**
 */
package testRequirement;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see testRequirement.TestRequirementPackage
 * @generated
 */
public interface TestRequirementFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TestRequirementFactory eINSTANCE = testRequirement.impl.TestRequirementFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Requirement Plus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requirement Plus</em>'.
	 * @generated
	 */
	RequirementPlus createRequirementPlus();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TestRequirementPackage getTestRequirementPackage();

} //TestRequirementFactory
