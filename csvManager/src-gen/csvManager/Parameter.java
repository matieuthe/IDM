/**
 */
package csvManager;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link csvManager.Parameter#getValue <em>Value</em>}</li>
 *   <li>{@link csvManager.Parameter#getColonne <em>Colonne</em>}</li>
 * </ul>
 *
 * @see csvManager.CsvManagerPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends EObject {

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see csvManager.CsvManagerPackage#getParameter_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link csvManager.Parameter#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Colonne</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Colonne</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colonne</em>' attribute.
	 * @see #setColonne(String)
	 * @see csvManager.CsvManagerPackage#getParameter_Colonne()
	 * @model required="true"
	 * @generated
	 */
	String getColonne();

	/**
	 * Sets the value of the '{@link csvManager.Parameter#getColonne <em>Colonne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Colonne</em>' attribute.
	 * @see #getColonne()
	 * @generated
	 */
	void setColonne(String value);
} // Parameter
