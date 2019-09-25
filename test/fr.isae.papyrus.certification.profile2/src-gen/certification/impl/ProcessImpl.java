/**
 */
package certification.impl;

import certification.Activity;
import certification.CertificationPackage;

import certification.util.CertificationValidator;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link certification.impl.ProcessImpl#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link certification.impl.ProcessImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link certification.impl.ProcessImpl#getSubprocess <em>Subprocess</em>}</li>
 *   <li>{@link certification.impl.ProcessImpl#getSemantics <em>Semantics</em>}</li>
 *   <li>{@link certification.impl.ProcessImpl#getNextprocess <em>Nextprocess</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessImpl extends MinimalEObjectImpl.Container implements certification.Process {
	/**
	 * The cached value of the '{@link #getBase_Class() <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Class()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Class base_Class;

	/**
	 * The cached value of the '{@link #getActivity() <em>Activity</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected EList<Activity> activity;

	/**
	 * The cached value of the '{@link #getSubprocess() <em>Subprocess</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubprocess()
	 * @generated
	 * @ordered
	 */
	protected EList<certification.Process> subprocess;

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
	 * The cached value of the '{@link #getNextprocess() <em>Nextprocess</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextprocess()
	 * @generated
	 * @ordered
	 */
	protected EList<certification.Process> nextprocess;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CertificationPackage.Literals.PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class getBase_Class() {
		if (base_Class != null && base_Class.eIsProxy()) {
			InternalEObject oldBase_Class = (InternalEObject)base_Class;
			base_Class = (org.eclipse.uml2.uml.Class)eResolveProxy(oldBase_Class);
			if (base_Class != oldBase_Class) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CertificationPackage.PROCESS__BASE_CLASS, oldBase_Class, base_Class));
			}
		}
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class basicGetBase_Class() {
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Class(org.eclipse.uml2.uml.Class newBase_Class) {
		org.eclipse.uml2.uml.Class oldBase_Class = base_Class;
		base_Class = newBase_Class;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CertificationPackage.PROCESS__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activity> getActivity() {
		if (activity == null) {
			activity = new EObjectResolvingEList<Activity>(Activity.class, this, CertificationPackage.PROCESS__ACTIVITY);
		}
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<certification.Process> getSubprocess() {
		if (subprocess == null) {
			subprocess = new EObjectResolvingEList<certification.Process>(certification.Process.class, this, CertificationPackage.PROCESS__SUBPROCESS);
		}
		return subprocess;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CertificationPackage.PROCESS__SEMANTICS, oldSemantics, semantics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<certification.Process> getNextprocess() {
		if (nextprocess == null) {
			nextprocess = new EObjectResolvingEList<certification.Process>(certification.Process.class, this, CertificationPackage.PROCESS__NEXTPROCESS);
		}
		return nextprocess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ConstraintAttributeOfProcess(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CertificationValidator.DIAGNOSTIC_SOURCE,
						 CertificationValidator.PROCESS__CONSTRAINT_ATTRIBUTE_OF_PROCESS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConstraintAttributeOfProcess", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CertificationPackage.PROCESS__BASE_CLASS:
				if (resolve) return getBase_Class();
				return basicGetBase_Class();
			case CertificationPackage.PROCESS__ACTIVITY:
				return getActivity();
			case CertificationPackage.PROCESS__SUBPROCESS:
				return getSubprocess();
			case CertificationPackage.PROCESS__SEMANTICS:
				return getSemantics();
			case CertificationPackage.PROCESS__NEXTPROCESS:
				return getNextprocess();
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
			case CertificationPackage.PROCESS__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)newValue);
				return;
			case CertificationPackage.PROCESS__ACTIVITY:
				getActivity().clear();
				getActivity().addAll((Collection<? extends Activity>)newValue);
				return;
			case CertificationPackage.PROCESS__SUBPROCESS:
				getSubprocess().clear();
				getSubprocess().addAll((Collection<? extends certification.Process>)newValue);
				return;
			case CertificationPackage.PROCESS__SEMANTICS:
				setSemantics((String)newValue);
				return;
			case CertificationPackage.PROCESS__NEXTPROCESS:
				getNextprocess().clear();
				getNextprocess().addAll((Collection<? extends certification.Process>)newValue);
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
			case CertificationPackage.PROCESS__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)null);
				return;
			case CertificationPackage.PROCESS__ACTIVITY:
				getActivity().clear();
				return;
			case CertificationPackage.PROCESS__SUBPROCESS:
				getSubprocess().clear();
				return;
			case CertificationPackage.PROCESS__SEMANTICS:
				setSemantics(SEMANTICS_EDEFAULT);
				return;
			case CertificationPackage.PROCESS__NEXTPROCESS:
				getNextprocess().clear();
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
			case CertificationPackage.PROCESS__BASE_CLASS:
				return base_Class != null;
			case CertificationPackage.PROCESS__ACTIVITY:
				return activity != null && !activity.isEmpty();
			case CertificationPackage.PROCESS__SUBPROCESS:
				return subprocess != null && !subprocess.isEmpty();
			case CertificationPackage.PROCESS__SEMANTICS:
				return SEMANTICS_EDEFAULT == null ? semantics != null : !SEMANTICS_EDEFAULT.equals(semantics);
			case CertificationPackage.PROCESS__NEXTPROCESS:
				return nextprocess != null && !nextprocess.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CertificationPackage.PROCESS___CONSTRAINT_ATTRIBUTE_OF_PROCESS__DIAGNOSTICCHAIN_MAP:
				return ConstraintAttributeOfProcess((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (semantics: ");
		result.append(semantics);
		result.append(')');
		return result.toString();
	}

} //ProcessImpl
