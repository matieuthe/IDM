/**
 */
package csvManager.impl;

import csvManager.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CsvManagerFactoryImpl extends EFactoryImpl implements CsvManagerFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CsvManagerFactory init() {
		try {
			CsvManagerFactory theCsvManagerFactory = (CsvManagerFactory) EPackage.Registry.INSTANCE
					.getEFactory(CsvManagerPackage.eNS_URI);
			if (theCsvManagerFactory != null) {
				return theCsvManagerFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CsvManagerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CsvManagerFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case CsvManagerPackage.PROGRAM:
			return createProgram();
		case CsvManagerPackage.INSTRUCTION:
			return createInstruction();
		case CsvManagerPackage.LOAD:
			return createLoad();
		case CsvManagerPackage.SHOW:
			return createShow();
		case CsvManagerPackage.UPDATE:
			return createUpdate();
		case CsvManagerPackage.CREATE:
			return createCreate();
		case CsvManagerPackage.DELETE:
			return createDelete();
		case CsvManagerPackage.ADD:
			return createAdd();
		case CsvManagerPackage.JOIN:
			return createJoin();
		case CsvManagerPackage.EXIT:
			return createExit();
		case CsvManagerPackage.WHERE:
			return createWhere();
		case CsvManagerPackage.CONDITION:
			return createCondition();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Program createProgram() {
		ProgramImpl program = new ProgramImpl();
		return program;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instruction createInstruction() {
		InstructionImpl instruction = new InstructionImpl();
		return instruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Load createLoad() {
		LoadImpl load = new LoadImpl();
		return load;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Show createShow() {
		ShowImpl show = new ShowImpl();
		return show;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Update createUpdate() {
		UpdateImpl update = new UpdateImpl();
		return update;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Create createCreate() {
		CreateImpl create = new CreateImpl();
		return create;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Delete createDelete() {
		DeleteImpl delete = new DeleteImpl();
		return delete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Add createAdd() {
		AddImpl add = new AddImpl();
		return add;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Join createJoin() {
		JoinImpl join = new JoinImpl();
		return join;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exit createExit() {
		ExitImpl exit = new ExitImpl();
		return exit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Where createWhere() {
		WhereImpl where = new WhereImpl();
		return where;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CsvManagerPackage getCsvManagerPackage() {
		return (CsvManagerPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CsvManagerPackage getPackage() {
		return CsvManagerPackage.eINSTANCE;
	}

} //CsvManagerFactoryImpl
