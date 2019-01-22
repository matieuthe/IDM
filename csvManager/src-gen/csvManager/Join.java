/**
 */
package csvManager;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Join</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link csvManager.Join#getTable1 <em>Table1</em>}</li>
 *   <li>{@link csvManager.Join#getTable2 <em>Table2</em>}</li>
 *   <li>{@link csvManager.Join#getWhere <em>Where</em>}</li>
 *   <li>{@link csvManager.Join#getTable3 <em>Table3</em>}</li>
 * </ul>
 *
 * @see csvManager.CsvManagerPackage#getJoin()
 * @model
 * @generated
 */
public interface Join extends Instruction {

	/**
	 * Returns the value of the '<em><b>Table1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table1</em>' attribute.
	 * @see #setTable1(String)
	 * @see csvManager.CsvManagerPackage#getJoin_Table1()
	 * @model required="true"
	 * @generated
	 */
	String getTable1();

	/**
	 * Sets the value of the '{@link csvManager.Join#getTable1 <em>Table1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table1</em>' attribute.
	 * @see #getTable1()
	 * @generated
	 */
	void setTable1(String value);

	/**
	 * Returns the value of the '<em><b>Table2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table2</em>' attribute.
	 * @see #setTable2(String)
	 * @see csvManager.CsvManagerPackage#getJoin_Table2()
	 * @model required="true"
	 * @generated
	 */
	String getTable2();

	/**
	 * Sets the value of the '{@link csvManager.Join#getTable2 <em>Table2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table2</em>' attribute.
	 * @see #getTable2()
	 * @generated
	 */
	void setTable2(String value);

	/**
	 * Returns the value of the '<em><b>Where</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Where</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Where</em>' containment reference.
	 * @see #setWhere(Where)
	 * @see csvManager.CsvManagerPackage#getJoin_Where()
	 * @model containment="true"
	 * @generated
	 */
	Where getWhere();

	/**
	 * Sets the value of the '{@link csvManager.Join#getWhere <em>Where</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Where</em>' containment reference.
	 * @see #getWhere()
	 * @generated
	 */
	void setWhere(Where value);

	/**
	 * Returns the value of the '<em><b>Table3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table3</em>' attribute.
	 * @see #setTable3(String)
	 * @see csvManager.CsvManagerPackage#getJoin_Table3()
	 * @model required="true"
	 * @generated
	 */
	String getTable3();

	/**
	 * Sets the value of the '{@link csvManager.Join#getTable3 <em>Table3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table3</em>' attribute.
	 * @see #getTable3()
	 * @generated
	 */
	void setTable3(String value);
} // Join
