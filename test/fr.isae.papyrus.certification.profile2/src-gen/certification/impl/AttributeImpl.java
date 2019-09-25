/**
 */
package certification.impl;

import certification.Attribute;
import certification.CertificationPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link certification.impl.AttributeImpl#getBase_Property <em>Base Property</em>}</li>
 *   <li>{@link certification.impl.AttributeImpl#getUpdateTime <em>Update Time</em>}</li>
 *   <li>{@link certification.impl.AttributeImpl#getSemantics <em>Semantics</em>}</li>
 *   <li>{@link certification.impl.AttributeImpl#getContent <em>Content</em>}</li>
 *   <li>{@link certification.impl.AttributeImpl#getSubAttribute <em>Sub Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeImpl extends MinimalEObjectImpl.Container implements Attribute {
	/**
	 * The cached value of the '{@link #getBase_Property() <em>Base Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Property()
	 * @generated
	 * @ordered
	 */
	protected Property base_Property;

	/**
	 * The default value of the '{@link #getUpdateTime() <em>Update Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateTime()
	 * @generated
	 * @ordered
	 */
	protected static final String UPDATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpdateTime() <em>Update Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateTime()
	 * @generated
	 * @ordered
	 */
	protected String updateTime = UPDATE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSemantics() <em>Semantics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemantics()
	 * @generated
	 * @ordered
	 */
	protected static final String SEMANTICS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSemantics() <em>Semantics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemantics()
	 * @generated
	 * @ordered
	 */
	protected String semantics = SEMANTICS_EDEFAULT;

	/**
	 * The default value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected String content = CONTENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubAttribute() <em>Sub Attribute</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> subAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CertificationPackage.Literals.ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getBase_Property() {
		if (base_Property != null && base_Property.eIsProxy()) {
			InternalEObject oldBase_Property = (InternalEObject)base_Property;
			base_Property = (Property)eResolveProxy(oldBase_Property);
			if (base_Property != oldBase_Property) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CertificationPackage.ATTRIBUTE__BASE_PROPERTY, oldBase_Property, base_Property));
			}
		}
		return base_Property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetBase_Property() {
		return base_Property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Property(Property newBase_Property) {
		Property oldBase_Property = base_Property;
		base_Property = newBase_Property;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CertificationPackage.ATTRIBUTE__BASE_PROPERTY, oldBase_Property, base_Property));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUpdateTime() {
		return updateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdateTime(String newUpdateTime) {
		String oldUpdateTime = updateTime;
		updateTime = newUpdateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CertificationPackage.ATTRIBUTE__UPDATE_TIME, oldUpdateTime, updateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSemantics() {
		return semantics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemantics(String newSemantics) {
		String oldSemantics = semantics;
		semantics = newSemantics;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CertificationPackage.ATTRIBUTE__SEMANTICS, oldSemantics, semantics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(String newContent) {
		String oldContent = content;
		content = newContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CertificationPackage.ATTRIBUTE__CONTENT, oldContent, content));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getSubAttribute() {
		if (subAttribute == null) {
			subAttribute = new EObjectResolvingEList<Attribute>(Attribute.class, this, CertificationPackage.ATTRIBUTE__SUB_ATTRIBUTE);
		}
		return subAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CertificationPackage.ATTRIBUTE__BASE_PROPERTY:
				if (resolve) return getBase_Property();
				return basicGetBase_Property();
			case CertificationPackage.ATTRIBUTE__UPDATE_TIME:
				return getUpdateTime();
			case CertificationPackage.ATTRIBUTE__SEMANTICS:
				return getSemantics();
			case CertificationPackage.ATTRIBUTE__CONTENT:
				return getContent();
			case CertificationPackage.ATTRIBUTE__SUB_ATTRIBUTE:
				return getSubAttribute();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CertificationPackage.ATTRIBUTE__BASE_PROPERTY:
				setBase_Property((Property)newValue);
				return;
			case CertificationPackage.ATTRIBUTE__UPDATE_TIME:
				setUpdateTime((String)newValue);
				return;
			case CertificationPackage.ATTRIBUTE__SEMANTICS:
				setSemantics((String)newValue);
				return;
			case CertificationPackage.ATTRIBUTE__CONTENT:
				setContent((String)newValue);
				return;
			case CertificationPackage.ATTRIBUTE__SUB_ATTRIBUTE:
				getSubAttribute().clear();
				getSubAttribute().addAll((Collection<? extends Attribute>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CertificationPackage.ATTRIBUTE__BASE_PROPERTY:
				setBase_Property((Property)null);
				return;
			case CertificationPackage.ATTRIBUTE__UPDATE_TIME:
				setUpdateTime(UPDATE_TIME_EDEFAULT);
				return;
			case CertificationPackage.ATTRIBUTE__SEMANTICS:
				setSemantics(SEMANTICS_EDEFAULT);
				return;
			case CertificationPackage.ATTRIBUTE__CONTENT:
				setContent(CONTENT_EDEFAULT);
				return;
			case CertificationPackage.ATTRIBUTE__SUB_ATTRIBUTE:
				getSubAttribute().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CertificationPackage.ATTRIBUTE__BASE_PROPERTY:
				return base_Property != null;
			case CertificationPackage.ATTRIBUTE__UPDATE_TIME:
				return UPDATE_TIME_EDEFAULT == null ? updateTime != null : !UPDATE_TIME_EDEFAULT.equals(updateTime);
			case CertificationPackage.ATTRIBUTE__SEMANTICS:
				return SEMANTICS_EDEFAULT == null ? semantics != null : !SEMANTICS_EDEFAULT.equals(semantics);
			case CertificationPackage.ATTRIBUTE__CONTENT:
				return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
			case CertificationPackage.ATTRIBUTE__SUB_ATTRIBUTE:
				return subAttribute != null && !subAttribute.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (updateTime: ");
		result.append(updateTime);
		result.append(", semantics: ");
		result.append(semantics);
		result.append(", content: ");
		result.append(content);
		result.append(')');
		return result.toString();
	}

} //AttributeImpl
