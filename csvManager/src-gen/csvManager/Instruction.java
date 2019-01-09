/**
 */
package csvManager;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link csvManager.Instruction#getParameter <em>Parameter</em>}</li>
 *   <li>{@link csvManager.Instruction#getKeyword <em>Keyword</em>}</li>
 *   <li>{@link csvManager.Instruction#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see csvManager.CsvManagerPackage#getInstruction()
 * @model
 * @generated
 */
public interface Instruction extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link csvManager.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see csvManager.CsvManagerPackage#getInstruction_Parameter()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Parameter> getParameter();

	/**
	 * Returns the value of the '<em><b>Keyword</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keyword</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keyword</em>' containment reference.
	 * @see #setKeyword(Keyword)
	 * @see csvManager.CsvManagerPackage#getInstruction_Keyword()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Keyword getKeyword();

	/**
	 * Sets the value of the '{@link csvManager.Instruction#getKeyword <em>Keyword</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keyword</em>' containment reference.
	 * @see #getKeyword()
	 * @generated
	 */
	void setKeyword(Keyword value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Condition)
	 * @see csvManager.CsvManagerPackage#getInstruction_Condition()
	 * @model containment="true"
	 * @generated
	 */
	Condition getCondition();

	/**
	 * Sets the value of the '{@link csvManager.Instruction#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Condition value);

} // Instruction
