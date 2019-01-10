/**
 */
package csvManager;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link csvManager.Add#getTable <em>Table</em>}</li>
 *   <li>{@link csvManager.Add#getTuple <em>Tuple</em>}</li>
 * </ul>
 *
 * @see csvManager.CsvManagerPackage#getAdd()
 * @model
 * @generated
 */
public interface Add extends Instruction {

	/**
	 * Returns the value of the '<em><b>Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' attribute.
	 * @see #setTable(String)
	 * @see csvManager.CsvManagerPackage#getAdd_Table()
	 * @model required="true"
	 * @generated
	 */
	String getTable();

	/**
	 * Sets the value of the '{@link csvManager.Add#getTable <em>Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' attribute.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(String value);

	/**
	 * Returns the value of the '<em><b>Tuple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tuple</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tuple</em>' attribute.
	 * @see #setTuple(String)
	 * @see csvManager.CsvManagerPackage#getAdd_Tuple()
	 * @model required="true"
	 * @generated
	 */
	String getTuple();

	/**
	 * Sets the value of the '{@link csvManager.Add#getTuple <em>Tuple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tuple</em>' attribute.
	 * @see #getTuple()
	 * @generated
	 */
	void setTuple(String value);
} // Add
