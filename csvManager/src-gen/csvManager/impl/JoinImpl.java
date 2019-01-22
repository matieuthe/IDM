/**
 */
package csvManager.impl;

import csvManager.CsvManagerPackage;
import csvManager.Join;

import csvManager.Where;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Join</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link csvManager.impl.JoinImpl#getTable1 <em>Table1</em>}</li>
 *   <li>{@link csvManager.impl.JoinImpl#getTable2 <em>Table2</em>}</li>
 *   <li>{@link csvManager.impl.JoinImpl#getWhere <em>Where</em>}</li>
 *   <li>{@link csvManager.impl.JoinImpl#getTable3 <em>Table3</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JoinImpl extends InstructionImpl implements Join {
	/**
	 * The default value of the '{@link #getTable1() <em>Table1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTable1()
	 * @generated
	 * @ordered
	 */
	protected static final String TABLE1_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTable1() <em>Table1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTable1()
	 * @generated
	 * @ordered
	 */
	protected String table1 = TABLE1_EDEFAULT;
	/**
	 * The default value of the '{@link #getTable2() <em>Table2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTable2()
	 * @generated
	 * @ordered
	 */
	protected static final String TABLE2_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTable2() <em>Table2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTable2()
	 * @generated
	 * @ordered
	 */
	protected String table2 = TABLE2_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWhere() <em>Where</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhere()
	 * @generated
	 * @ordered
	 */
	protected Where where;

	/**
	 * The default value of the '{@link #getTable3() <em>Table3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTable3()
	 * @generated
	 * @ordered
	 */
	protected static final String TABLE3_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTable3() <em>Table3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTable3()
	 * @generated
	 * @ordered
	 */
	protected String table3 = TABLE3_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JoinImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsvManagerPackage.Literals.JOIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTable1() {
		return table1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTable1(String newTable1) {
		String oldTable1 = table1;
		table1 = newTable1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsvManagerPackage.JOIN__TABLE1, oldTable1, table1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTable2() {
		return table2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTable2(String newTable2) {
		String oldTable2 = table2;
		table2 = newTable2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsvManagerPackage.JOIN__TABLE2, oldTable2, table2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Where getWhere() {
		return where;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhere(Where newWhere, NotificationChain msgs) {
		Where oldWhere = where;
		where = newWhere;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CsvManagerPackage.JOIN__WHERE, oldWhere, newWhere);
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
	public void setWhere(Where newWhere) {
		if (newWhere != where) {
			NotificationChain msgs = null;
			if (where != null)
				msgs = ((InternalEObject) where).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CsvManagerPackage.JOIN__WHERE, null, msgs);
			if (newWhere != null)
				msgs = ((InternalEObject) newWhere).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CsvManagerPackage.JOIN__WHERE, null, msgs);
			msgs = basicSetWhere(newWhere, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsvManagerPackage.JOIN__WHERE, newWhere, newWhere));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTable3() {
		return table3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTable3(String newTable3) {
		String oldTable3 = table3;
		table3 = newTable3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsvManagerPackage.JOIN__TABLE3, oldTable3, table3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CsvManagerPackage.JOIN__WHERE:
			return basicSetWhere(null, msgs);
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
		case CsvManagerPackage.JOIN__TABLE1:
			return getTable1();
		case CsvManagerPackage.JOIN__TABLE2:
			return getTable2();
		case CsvManagerPackage.JOIN__WHERE:
			return getWhere();
		case CsvManagerPackage.JOIN__TABLE3:
			return getTable3();
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
		case CsvManagerPackage.JOIN__TABLE1:
			setTable1((String) newValue);
			return;
		case CsvManagerPackage.JOIN__TABLE2:
			setTable2((String) newValue);
			return;
		case CsvManagerPackage.JOIN__WHERE:
			setWhere((Where) newValue);
			return;
		case CsvManagerPackage.JOIN__TABLE3:
			setTable3((String) newValue);
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
		case CsvManagerPackage.JOIN__TABLE1:
			setTable1(TABLE1_EDEFAULT);
			return;
		case CsvManagerPackage.JOIN__TABLE2:
			setTable2(TABLE2_EDEFAULT);
			return;
		case CsvManagerPackage.JOIN__WHERE:
			setWhere((Where) null);
			return;
		case CsvManagerPackage.JOIN__TABLE3:
			setTable3(TABLE3_EDEFAULT);
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
		case CsvManagerPackage.JOIN__TABLE1:
			return TABLE1_EDEFAULT == null ? table1 != null : !TABLE1_EDEFAULT.equals(table1);
		case CsvManagerPackage.JOIN__TABLE2:
			return TABLE2_EDEFAULT == null ? table2 != null : !TABLE2_EDEFAULT.equals(table2);
		case CsvManagerPackage.JOIN__WHERE:
			return where != null;
		case CsvManagerPackage.JOIN__TABLE3:
			return TABLE3_EDEFAULT == null ? table3 != null : !TABLE3_EDEFAULT.equals(table3);
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
		result.append(" (table1: ");
		result.append(table1);
		result.append(", table2: ");
		result.append(table2);
		result.append(", table3: ");
		result.append(table3);
		result.append(')');
		return result.toString();
	}

} //JoinImpl
