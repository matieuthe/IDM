/**
 */
package csvManager;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link csvManager.Create#getColonne <em>Colonne</em>}</li>
 *   <li>{@link csvManager.Create#getTable <em>Table</em>}</li>
 * </ul>
 *
 * @see csvManager.CsvManagerPackage#getCreate()
 * @model
 * @generated
 */
public interface Create extends Instruction {

	/**
	 * Returns the value of the '<em><b>Colonne</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Colonne</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colonne</em>' attribute list.
	 * @see csvManager.CsvManagerPackage#getCreate_Colonne()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getColonne();

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
	 * @see csvManager.CsvManagerPackage#getCreate_Table()
	 * @model required="true"
	 * @generated
	 */
	String getTable();

	/**
	 * Sets the value of the '{@link csvManager.Create#getTable <em>Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' attribute.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(String value);
} // Create
