/**
 */
package certification;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Port;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artefact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link certification.Artefact#getType <em>Type</em>}</li>
 *   <li>{@link certification.Artefact#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link certification.Artefact#getBase_Port <em>Base Port</em>}</li>
 *   <li>{@link certification.Artefact#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @see certification.CertificationPackage#getArtefact()
 * @model
 * @generated
 */
public interface Artefact extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link certification.TypeOfArtefact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see certification.TypeOfArtefact
	 * @see #setType(TypeOfArtefact)
	 * @see certification.CertificationPackage#getArtefact_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	TypeOfArtefact getType();

	/**
	 * Sets the value of the '{@link certification.Artefact#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see certification.TypeOfArtefact
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeOfArtefact value);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference list.
	 * The list contents are of type {@link certification.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference list.
	 * @see certification.CertificationPackage#getArtefact_Attribute()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Attribute> getAttribute();

	/**
	 * Returns the value of the '<em><b>Base Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Port</em>' reference.
	 * @see #setBase_Port(Port)
	 * @see certification.CertificationPackage#getArtefact_Base_Port()
	 * @model ordered="false"
	 * @generated
	 */
	Port getBase_Port();

	/**
	 * Sets the value of the '{@link certification.Artefact#getBase_Port <em>Base Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Port</em>' reference.
	 * @see #getBase_Port()
	 * @generated
	 */
	void setBase_Port(Port value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link certification.Direction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see certification.Direction
	 * @see #setDirection(Direction)
	 * @see certification.CertificationPackage#getArtefact_Direction()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Direction getDirection();

	/**
	 * Sets the value of the '{@link certification.Artefact#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see certification.Direction
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(Direction value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if(not(self.base_Port.type.oclIsUndefined()) and self.base_Port.type.oclIsKindOf(UML::Class))then
	 * 	self.base_Port.type.oclAsType(UML::Class).ownedAttribute->includesAll(self.attribute->collect(base_Property))
	 * else
	 * 	true
	 * endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean ConstraintAttributeOfArtefact(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Artefact
