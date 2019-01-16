/**
 */
package csvManager;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Where</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link csvManager.Where#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see csvManager.CsvManagerPackage#getWhere()
 * @model
 * @generated
 */
public interface Where extends EObject {

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference list.
	 * The list contents are of type {@link csvManager.Condition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference list.
	 * @see csvManager.CsvManagerPackage#getWhere_Condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Condition> getCondition();
} // Where
