/**
 */
package csvManager.impl;

import csvManager.Condition;
import csvManager.CsvManagerPackage;
import csvManager.Instruction;
import csvManager.Keyword;
import csvManager.Parameter;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instruction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link csvManager.impl.InstructionImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link csvManager.impl.InstructionImpl#getKeyword <em>Keyword</em>}</li>
 *   <li>{@link csvManager.impl.InstructionImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstructionImpl extends MinimalEObjectImpl.Container implements Instruction {
	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameter;

	/**
	 * The cached value of the '{@link #getKeyword() <em>Keyword</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyword()
	 * @generated
	 * @ordered
	 */
	protected Keyword keyword;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Condition condition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstructionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsvManagerPackage.Literals.INSTRUCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameter() {
		if (parameter == null) {
			parameter = new EObjectContainmentEList<Parameter>(Parameter.class, this,
					CsvManagerPackage.INSTRUCTION__PARAMETER);
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Keyword getKeyword() {
		return keyword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKeyword(Keyword newKeyword, NotificationChain msgs) {
		Keyword oldKeyword = keyword;
		keyword = newKeyword;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CsvManagerPackage.INSTRUCTION__KEYWORD, oldKeyword, newKeyword);
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
	public void setKeyword(Keyword newKeyword) {
		if (newKeyword != keyword) {
			NotificationChain msgs = null;
			if (keyword != null)
				msgs = ((InternalEObject) keyword).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CsvManagerPackage.INSTRUCTION__KEYWORD, null, msgs);
			if (newKeyword != null)
				msgs = ((InternalEObject) newKeyword).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CsvManagerPackage.INSTRUCTION__KEYWORD, null, msgs);
			msgs = basicSetKeyword(newKeyword, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsvManagerPackage.INSTRUCTION__KEYWORD, newKeyword,
					newKeyword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Condition newCondition, NotificationChain msgs) {
		Condition oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CsvManagerPackage.INSTRUCTION__CONDITION, oldCondition, newCondition);
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
	public void setCondition(Condition newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject) condition).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CsvManagerPackage.INSTRUCTION__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject) newCondition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CsvManagerPackage.INSTRUCTION__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsvManagerPackage.INSTRUCTION__CONDITION,
					newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CsvManagerPackage.INSTRUCTION__PARAMETER:
			return ((InternalEList<?>) getParameter()).basicRemove(otherEnd, msgs);
		case CsvManagerPackage.INSTRUCTION__KEYWORD:
			return basicSetKeyword(null, msgs);
		case CsvManagerPackage.INSTRUCTION__CONDITION:
			return basicSetCondition(null, msgs);
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
		case CsvManagerPackage.INSTRUCTION__PARAMETER:
			return getParameter();
		case CsvManagerPackage.INSTRUCTION__KEYWORD:
			return getKeyword();
		case CsvManagerPackage.INSTRUCTION__CONDITION:
			return getCondition();
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
		case CsvManagerPackage.INSTRUCTION__PARAMETER:
			getParameter().clear();
			getParameter().addAll((Collection<? extends Parameter>) newValue);
			return;
		case CsvManagerPackage.INSTRUCTION__KEYWORD:
			setKeyword((Keyword) newValue);
			return;
		case CsvManagerPackage.INSTRUCTION__CONDITION:
			setCondition((Condition) newValue);
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
		case CsvManagerPackage.INSTRUCTION__PARAMETER:
			getParameter().clear();
			return;
		case CsvManagerPackage.INSTRUCTION__KEYWORD:
			setKeyword((Keyword) null);
			return;
		case CsvManagerPackage.INSTRUCTION__CONDITION:
			setCondition((Condition) null);
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
		case CsvManagerPackage.INSTRUCTION__PARAMETER:
			return parameter != null && !parameter.isEmpty();
		case CsvManagerPackage.INSTRUCTION__KEYWORD:
			return keyword != null;
		case CsvManagerPackage.INSTRUCTION__CONDITION:
			return condition != null;
		}
		return super.eIsSet(featureID);
	}

} //InstructionImpl
