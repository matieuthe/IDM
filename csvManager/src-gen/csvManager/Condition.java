/**
 */
package csvManager;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link csvManager.Condition#getAtribut <em>Atribut</em>}</li>
 *   <li>{@link csvManager.Condition#getValeur <em>Valeur</em>}</li>
 * </ul>
 *
 * @see csvManager.CsvManagerPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends EObject {

	/**
	 * Returns the value of the '<em><b>Atribut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atribut</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atribut</em>' attribute.
	 * @see #setAtribut(String)
	 * @see csvManager.CsvManagerPackage#getCondition_Atribut()
	 * @model required="true"
	 * @generated
	 */
	String getAtribut();

	/**
	 * Sets the value of the '{@link csvManager.Condition#getAtribut <em>Atribut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Atribut</em>' attribute.
	 * @see #getAtribut()
	 * @generated
	 */
	void setAtribut(String value);

	/**
	 * Returns the value of the '<em><b>Valeur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valeur</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valeur</em>' attribute.
	 * @see #setValeur(String)
	 * @see csvManager.CsvManagerPackage#getCondition_Valeur()
	 * @model required="true"
	 * @generated
	 */
	String getValeur();

	/**
	 * Sets the value of the '{@link csvManager.Condition#getValeur <em>Valeur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valeur</em>' attribute.
	 * @see #getValeur()
	 * @generated
	 */
	void setValeur(String value);
} // Condition
