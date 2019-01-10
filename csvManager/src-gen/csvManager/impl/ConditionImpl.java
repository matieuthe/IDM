/**
 */
package csvManager.impl;

import csvManager.Condition;
import csvManager.CsvManagerPackage;

import csvManager.Operator;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link csvManager.impl.ConditionImpl#getAtribut <em>Atribut</em>}</li>
 *   <li>{@link csvManager.impl.ConditionImpl#getValeur <em>Valeur</em>}</li>
 *   <li>{@link csvManager.impl.ConditionImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionImpl extends MinimalEObjectImpl.Container implements Condition {
	/**
	 * The default value of the '{@link #getAtribut() <em>Atribut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtribut()
	 * @generated
	 * @ordered
	 */
	protected static final String ATRIBUT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAtribut() <em>Atribut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtribut()
	 * @generated
	 * @ordered
	 */
	protected String atribut = ATRIBUT_EDEFAULT;
	/**
	 * The default value of the '{@link #getValeur() <em>Valeur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValeur()
	 * @generated
	 * @ordered
	 */
	protected static final String VALEUR_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getValeur() <em>Valeur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValeur()
	 * @generated
	 * @ordered
	 */
	protected String valeur = VALEUR_EDEFAULT;
	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected Operator operator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsvManagerPackage.Literals.CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAtribut() {
		return atribut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAtribut(String newAtribut) {
		String oldAtribut = atribut;
		atribut = newAtribut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsvManagerPackage.CONDITION__ATRIBUT, oldAtribut,
					atribut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValeur() {
		return valeur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValeur(String newValeur) {
		String oldValeur = valeur;
		valeur = newValeur;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsvManagerPackage.CONDITION__VALEUR, oldValeur,
					valeur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperator(Operator newOperator, NotificationChain msgs) {
		Operator oldOperator = operator;
		operator = newOperator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CsvManagerPackage.CONDITION__OPERATOR, oldOperator, newOperator);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(Operator newOperator) {
		if (newOperator != operator) {
			NotificationChain msgs = null;
			if (operator != null)
				msgs = ((InternalEObject) operator).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CsvManagerPackage.CONDITION__OPERATOR, null, msgs);
			if (newOperator != null)
				msgs = ((InternalEObject) newOperator).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CsvManagerPackage.CONDITION__OPERATOR, null, msgs);
			msgs = basicSetOperator(newOperator, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsvManagerPackage.CONDITION__OPERATOR, newOperator,
					newOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CsvManagerPackage.CONDITION__OPERATOR:
			return basicSetOperator(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CsvManagerPackage.CONDITION__ATRIBUT:
			return getAtribut();
		case CsvManagerPackage.CONDITION__VALEUR:
			return getValeur();
		case CsvManagerPackage.CONDITION__OPERATOR:
			return getOperator();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CsvManagerPackage.CONDITION__ATRIBUT:
			setAtribut((String) newValue);
			return;
		case CsvManagerPackage.CONDITION__VALEUR:
			setValeur((String) newValue);
			return;
		case CsvManagerPackage.CONDITION__OPERATOR:
			setOperator((Operator) newValue);
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
		case CsvManagerPackage.CONDITION__ATRIBUT:
			setAtribut(ATRIBUT_EDEFAULT);
			return;
		case CsvManagerPackage.CONDITION__VALEUR:
			setValeur(VALEUR_EDEFAULT);
			return;
		case CsvManagerPackage.CONDITION__OPERATOR:
			setOperator((Operator) null);
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
		case CsvManagerPackage.CONDITION__ATRIBUT:
			return ATRIBUT_EDEFAULT == null ? atribut != null : !ATRIBUT_EDEFAULT.equals(atribut);
		case CsvManagerPackage.CONDITION__VALEUR:
			return VALEUR_EDEFAULT == null ? valeur != null : !VALEUR_EDEFAULT.equals(valeur);
		case CsvManagerPackage.CONDITION__OPERATOR:
			return operator != null;
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
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (atribut: ");
		result.append(atribut);
		result.append(", valeur: ");
		result.append(valeur);
		result.append(')');
		return result.toString();
	}

} //ConditionImpl
