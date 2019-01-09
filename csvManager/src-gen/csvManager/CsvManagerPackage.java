/**
 */
package csvManager;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see csvManager.CsvManagerFactory
 * @model kind="package"
 * @generated
 */
public interface CsvManagerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "csvManager";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/csvManager";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "csvManager";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CsvManagerPackage eINSTANCE = csvManager.impl.CsvManagerPackageImpl.init();

	/**
	 * The meta object id for the '{@link csvManager.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see csvManager.impl.ProgramImpl
	 * @see csvManager.impl.CsvManagerPackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 0;

	/**
	 * The feature id for the '<em><b>Instruction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__INSTRUCTION = 0;

	/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link csvManager.impl.InstructionImpl <em>Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see csvManager.impl.InstructionImpl
	 * @see csvManager.impl.CsvManagerPackageImpl#getInstruction()
	 * @generated
	 */
	int INSTRUCTION = 1;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__PARAMETER = 0;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__KEYWORD = 1;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__CONDITION = 2;

	/**
	 * The number of structural features of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link csvManager.impl.KeywordImpl <em>Keyword</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see csvManager.impl.KeywordImpl
	 * @see csvManager.impl.CsvManagerPackageImpl#getKeyword()
	 * @generated
	 */
	int KEYWORD = 2;

	/**
	 * The number of structural features of the '<em>Keyword</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Keyword</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link csvManager.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see csvManager.impl.ParameterImpl
	 * @see csvManager.impl.CsvManagerPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 3;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link csvManager.impl.SelectionParameterImpl <em>Selection Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see csvManager.impl.SelectionParameterImpl
	 * @see csvManager.impl.CsvManagerPackageImpl#getSelectionParameter()
	 * @generated
	 */
	int SELECTION_PARAMETER = 4;

	/**
	 * The number of structural features of the '<em>Selection Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_PARAMETER_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Selection Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_PARAMETER_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link csvManager.impl.ConditionParameterImpl <em>Condition Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see csvManager.impl.ConditionParameterImpl
	 * @see csvManager.impl.CsvManagerPackageImpl#getConditionParameter()
	 * @generated
	 */
	int CONDITION_PARAMETER = 5;

	/**
	 * The number of structural features of the '<em>Condition Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_PARAMETER_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Condition Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_PARAMETER_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link csvManager.impl.LoadImpl <em>Load</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see csvManager.impl.LoadImpl
	 * @see csvManager.impl.CsvManagerPackageImpl#getLoad()
	 * @generated
	 */
	int LOAD = 6;

	/**
	 * The number of structural features of the '<em>Load</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_FEATURE_COUNT = KEYWORD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Load</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_OPERATION_COUNT = KEYWORD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link csvManager.impl.ShowImpl <em>Show</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see csvManager.impl.ShowImpl
	 * @see csvManager.impl.CsvManagerPackageImpl#getShow()
	 * @generated
	 */
	int SHOW = 7;

	/**
	 * The number of structural features of the '<em>Show</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_FEATURE_COUNT = KEYWORD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Show</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_OPERATION_COUNT = KEYWORD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link csvManager.impl.UpdateImpl <em>Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see csvManager.impl.UpdateImpl
	 * @see csvManager.impl.CsvManagerPackageImpl#getUpdate()
	 * @generated
	 */
	int UPDATE = 8;

	/**
	 * The number of structural features of the '<em>Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_FEATURE_COUNT = KEYWORD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_OPERATION_COUNT = KEYWORD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link csvManager.impl.CreateImpl <em>Create</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see csvManager.impl.CreateImpl
	 * @see csvManager.impl.CsvManagerPackageImpl#getCreate()
	 * @generated
	 */
	int CREATE = 9;

	/**
	 * The number of structural features of the '<em>Create</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_FEATURE_COUNT = KEYWORD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Create</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OPERATION_COUNT = KEYWORD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link csvManager.impl.DeleteImpl <em>Delete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see csvManager.impl.DeleteImpl
	 * @see csvManager.impl.CsvManagerPackageImpl#getDelete()
	 * @generated
	 */
	int DELETE = 10;

	/**
	 * The number of structural features of the '<em>Delete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_FEATURE_COUNT = KEYWORD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Delete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_OPERATION_COUNT = KEYWORD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link csvManager.impl.AddImpl <em>Add</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see csvManager.impl.AddImpl
	 * @see csvManager.impl.CsvManagerPackageImpl#getAdd()
	 * @generated
	 */
	int ADD = 11;

	/**
	 * The number of structural features of the '<em>Add</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FEATURE_COUNT = KEYWORD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Add</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OPERATION_COUNT = KEYWORD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link csvManager.impl.JoinImpl <em>Join</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see csvManager.impl.JoinImpl
	 * @see csvManager.impl.CsvManagerPackageImpl#getJoin()
	 * @generated
	 */
	int JOIN = 12;

	/**
	 * The number of structural features of the '<em>Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_FEATURE_COUNT = KEYWORD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_OPERATION_COUNT = KEYWORD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link csvManager.impl.ExitImpl <em>Exit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see csvManager.impl.ExitImpl
	 * @see csvManager.impl.CsvManagerPackageImpl#getExit()
	 * @generated
	 */
	int EXIT = 13;

	/**
	 * The number of structural features of the '<em>Exit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_FEATURE_COUNT = KEYWORD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Exit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_OPERATION_COUNT = KEYWORD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link csvManager.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see csvManager.impl.ConditionImpl
	 * @see csvManager.impl.CsvManagerPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 14;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link csvManager.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see csvManager.Program
	 * @generated
	 */
	EClass getProgram();

	/**
	 * Returns the meta object for the containment reference list '{@link csvManager.Program#getInstruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instruction</em>'.
	 * @see csvManager.Program#getInstruction()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Instruction();

	/**
	 * Returns the meta object for class '{@link csvManager.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction</em>'.
	 * @see csvManager.Instruction
	 * @generated
	 */
	EClass getInstruction();

	/**
	 * Returns the meta object for the containment reference list '{@link csvManager.Instruction#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see csvManager.Instruction#getParameter()
	 * @see #getInstruction()
	 * @generated
	 */
	EReference getInstruction_Parameter();

	/**
	 * Returns the meta object for the containment reference '{@link csvManager.Instruction#getKeyword <em>Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Keyword</em>'.
	 * @see csvManager.Instruction#getKeyword()
	 * @see #getInstruction()
	 * @generated
	 */
	EReference getInstruction_Keyword();

	/**
	 * Returns the meta object for the containment reference '{@link csvManager.Instruction#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see csvManager.Instruction#getCondition()
	 * @see #getInstruction()
	 * @generated
	 */
	EReference getInstruction_Condition();

	/**
	 * Returns the meta object for class '{@link csvManager.Keyword <em>Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Keyword</em>'.
	 * @see csvManager.Keyword
	 * @generated
	 */
	EClass getKeyword();

	/**
	 * Returns the meta object for class '{@link csvManager.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see csvManager.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for class '{@link csvManager.SelectionParameter <em>Selection Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selection Parameter</em>'.
	 * @see csvManager.SelectionParameter
	 * @generated
	 */
	EClass getSelectionParameter();

	/**
	 * Returns the meta object for class '{@link csvManager.ConditionParameter <em>Condition Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Parameter</em>'.
	 * @see csvManager.ConditionParameter
	 * @generated
	 */
	EClass getConditionParameter();

	/**
	 * Returns the meta object for class '{@link csvManager.Load <em>Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load</em>'.
	 * @see csvManager.Load
	 * @generated
	 */
	EClass getLoad();

	/**
	 * Returns the meta object for class '{@link csvManager.Show <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Show</em>'.
	 * @see csvManager.Show
	 * @generated
	 */
	EClass getShow();

	/**
	 * Returns the meta object for class '{@link csvManager.Update <em>Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update</em>'.
	 * @see csvManager.Update
	 * @generated
	 */
	EClass getUpdate();

	/**
	 * Returns the meta object for class '{@link csvManager.Create <em>Create</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create</em>'.
	 * @see csvManager.Create
	 * @generated
	 */
	EClass getCreate();

	/**
	 * Returns the meta object for class '{@link csvManager.Delete <em>Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete</em>'.
	 * @see csvManager.Delete
	 * @generated
	 */
	EClass getDelete();

	/**
	 * Returns the meta object for class '{@link csvManager.Add <em>Add</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add</em>'.
	 * @see csvManager.Add
	 * @generated
	 */
	EClass getAdd();

	/**
	 * Returns the meta object for class '{@link csvManager.Join <em>Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join</em>'.
	 * @see csvManager.Join
	 * @generated
	 */
	EClass getJoin();

	/**
	 * Returns the meta object for class '{@link csvManager.Exit <em>Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exit</em>'.
	 * @see csvManager.Exit
	 * @generated
	 */
	EClass getExit();

	/**
	 * Returns the meta object for class '{@link csvManager.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see csvManager.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CsvManagerFactory getCsvManagerFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link csvManager.impl.ProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see csvManager.impl.ProgramImpl
		 * @see csvManager.impl.CsvManagerPackageImpl#getProgram()
		 * @generated
		 */
		EClass PROGRAM = eINSTANCE.getProgram();

		/**
		 * The meta object literal for the '<em><b>Instruction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__INSTRUCTION = eINSTANCE.getProgram_Instruction();

		/**
		 * The meta object literal for the '{@link csvManager.impl.InstructionImpl <em>Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see csvManager.impl.InstructionImpl
		 * @see csvManager.impl.CsvManagerPackageImpl#getInstruction()
		 * @generated
		 */
		EClass INSTRUCTION = eINSTANCE.getInstruction();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTION__PARAMETER = eINSTANCE.getInstruction_Parameter();

		/**
		 * The meta object literal for the '<em><b>Keyword</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTION__KEYWORD = eINSTANCE.getInstruction_Keyword();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTION__CONDITION = eINSTANCE.getInstruction_Condition();

		/**
		 * The meta object literal for the '{@link csvManager.impl.KeywordImpl <em>Keyword</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see csvManager.impl.KeywordImpl
		 * @see csvManager.impl.CsvManagerPackageImpl#getKeyword()
		 * @generated
		 */
		EClass KEYWORD = eINSTANCE.getKeyword();

		/**
		 * The meta object literal for the '{@link csvManager.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see csvManager.impl.ParameterImpl
		 * @see csvManager.impl.CsvManagerPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '{@link csvManager.impl.SelectionParameterImpl <em>Selection Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see csvManager.impl.SelectionParameterImpl
		 * @see csvManager.impl.CsvManagerPackageImpl#getSelectionParameter()
		 * @generated
		 */
		EClass SELECTION_PARAMETER = eINSTANCE.getSelectionParameter();

		/**
		 * The meta object literal for the '{@link csvManager.impl.ConditionParameterImpl <em>Condition Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see csvManager.impl.ConditionParameterImpl
		 * @see csvManager.impl.CsvManagerPackageImpl#getConditionParameter()
		 * @generated
		 */
		EClass CONDITION_PARAMETER = eINSTANCE.getConditionParameter();

		/**
		 * The meta object literal for the '{@link csvManager.impl.LoadImpl <em>Load</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see csvManager.impl.LoadImpl
		 * @see csvManager.impl.CsvManagerPackageImpl#getLoad()
		 * @generated
		 */
		EClass LOAD = eINSTANCE.getLoad();

		/**
		 * The meta object literal for the '{@link csvManager.impl.ShowImpl <em>Show</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see csvManager.impl.ShowImpl
		 * @see csvManager.impl.CsvManagerPackageImpl#getShow()
		 * @generated
		 */
		EClass SHOW = eINSTANCE.getShow();

		/**
		 * The meta object literal for the '{@link csvManager.impl.UpdateImpl <em>Update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see csvManager.impl.UpdateImpl
		 * @see csvManager.impl.CsvManagerPackageImpl#getUpdate()
		 * @generated
		 */
		EClass UPDATE = eINSTANCE.getUpdate();

		/**
		 * The meta object literal for the '{@link csvManager.impl.CreateImpl <em>Create</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see csvManager.impl.CreateImpl
		 * @see csvManager.impl.CsvManagerPackageImpl#getCreate()
		 * @generated
		 */
		EClass CREATE = eINSTANCE.getCreate();

		/**
		 * The meta object literal for the '{@link csvManager.impl.DeleteImpl <em>Delete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see csvManager.impl.DeleteImpl
		 * @see csvManager.impl.CsvManagerPackageImpl#getDelete()
		 * @generated
		 */
		EClass DELETE = eINSTANCE.getDelete();

		/**
		 * The meta object literal for the '{@link csvManager.impl.AddImpl <em>Add</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see csvManager.impl.AddImpl
		 * @see csvManager.impl.CsvManagerPackageImpl#getAdd()
		 * @generated
		 */
		EClass ADD = eINSTANCE.getAdd();

		/**
		 * The meta object literal for the '{@link csvManager.impl.JoinImpl <em>Join</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see csvManager.impl.JoinImpl
		 * @see csvManager.impl.CsvManagerPackageImpl#getJoin()
		 * @generated
		 */
		EClass JOIN = eINSTANCE.getJoin();

		/**
		 * The meta object literal for the '{@link csvManager.impl.ExitImpl <em>Exit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see csvManager.impl.ExitImpl
		 * @see csvManager.impl.CsvManagerPackageImpl#getExit()
		 * @generated
		 */
		EClass EXIT = eINSTANCE.getExit();

		/**
		 * The meta object literal for the '{@link csvManager.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see csvManager.impl.ConditionImpl
		 * @see csvManager.impl.CsvManagerPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

	}

} //CsvManagerPackage
