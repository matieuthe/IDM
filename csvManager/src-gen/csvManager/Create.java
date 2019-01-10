/**
 */
package csvManager;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link csvManager.Create#getAlias <em>Alias</em>}</li>
 *   <li>{@link csvManager.Create#getCsvfile <em>Csvfile</em>}</li>
 * </ul>
 *
 * @see csvManager.CsvManagerPackage#getCreate()
 * @model
 * @generated
 */
public interface Create extends Instruction {

	/**
	 * Returns the value of the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alias</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias</em>' attribute.
	 * @see #setAlias(String)
	 * @see csvManager.CsvManagerPackage#getCreate_Alias()
	 * @model required="true"
	 * @generated
	 */
	String getAlias();

	/**
	 * Sets the value of the '{@link csvManager.Create#getAlias <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias</em>' attribute.
	 * @see #getAlias()
	 * @generated
	 */
	void setAlias(String value);

	/**
	 * Returns the value of the '<em><b>Csvfile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Csvfile</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Csvfile</em>' containment reference.
	 * @see #setCsvfile(CsvFile)
	 * @see csvManager.CsvManagerPackage#getCreate_Csvfile()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CsvFile getCsvfile();

	/**
	 * Sets the value of the '{@link csvManager.Create#getCsvfile <em>Csvfile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Csvfile</em>' containment reference.
	 * @see #getCsvfile()
	 * @generated
	 */
	void setCsvfile(CsvFile value);
} // Create
