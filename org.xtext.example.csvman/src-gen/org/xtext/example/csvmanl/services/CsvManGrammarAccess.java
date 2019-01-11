/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.csvmanl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class CsvManGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ProgramElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.csvmanl.CsvMan.Program");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cProgramAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cInstructionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cInstructionInstructionParserRuleCall_1_0 = (RuleCall)cInstructionAssignment_1.eContents().get(0);
		
		//Program:
		//	{Program} instruction+=Instruction*;
		@Override public ParserRule getRule() { return rule; }
		
		//{Program} instruction+=Instruction*
		public Group getGroup() { return cGroup; }
		
		//{Program}
		public Action getProgramAction_0() { return cProgramAction_0; }
		
		//instruction+=Instruction*
		public Assignment getInstructionAssignment_1() { return cInstructionAssignment_1; }
		
		//Instruction
		public RuleCall getInstructionInstructionParserRuleCall_1_0() { return cInstructionInstructionParserRuleCall_1_0; }
	}
	public class InstructionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.csvmanl.CsvMan.Instruction");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cCreateParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cLoadParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cShowParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cUpdateParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cAddParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cJoinParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		private final RuleCall cDeleteParserRuleCall_6 = (RuleCall)cAlternatives.eContents().get(6);
		private final RuleCall cExitParserRuleCall_7 = (RuleCall)cAlternatives.eContents().get(7);
		
		//Instruction:
		//	Create | Load | Show | Update | Add | Join | Delete | Exit;
		@Override public ParserRule getRule() { return rule; }
		
		//Create | Load | Show | Update | Add | Join | Delete | Exit
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Create
		public RuleCall getCreateParserRuleCall_0() { return cCreateParserRuleCall_0; }
		
		//Load
		public RuleCall getLoadParserRuleCall_1() { return cLoadParserRuleCall_1; }
		
		//Show
		public RuleCall getShowParserRuleCall_2() { return cShowParserRuleCall_2; }
		
		//Update
		public RuleCall getUpdateParserRuleCall_3() { return cUpdateParserRuleCall_3; }
		
		//Add
		public RuleCall getAddParserRuleCall_4() { return cAddParserRuleCall_4; }
		
		//Join
		public RuleCall getJoinParserRuleCall_5() { return cJoinParserRuleCall_5; }
		
		//Delete
		public RuleCall getDeleteParserRuleCall_6() { return cDeleteParserRuleCall_6; }
		
		//Exit
		public RuleCall getExitParserRuleCall_7() { return cExitParserRuleCall_7; }
	}
	public class CreateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.csvmanl.CsvMan.Create");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cCreateAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cCreateKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTableAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTableEStringParserRuleCall_2_0 = (RuleCall)cTableAssignment_2.eContents().get(0);
		private final Keyword cAsKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cAliasAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cAliasEStringParserRuleCall_4_0 = (RuleCall)cAliasAssignment_4.eContents().get(0);
		private final RuleCall cNLTerminalRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		
		//Create:
		//	{Create}
		//	'create' table=EString 'as' alias=EString NL;
		@Override public ParserRule getRule() { return rule; }
		
		//{Create} 'create' table=EString 'as' alias=EString NL
		public Group getGroup() { return cGroup; }
		
		//{Create}
		public Action getCreateAction_0() { return cCreateAction_0; }
		
		//'create'
		public Keyword getCreateKeyword_1() { return cCreateKeyword_1; }
		
		//table=EString
		public Assignment getTableAssignment_2() { return cTableAssignment_2; }
		
		//EString
		public RuleCall getTableEStringParserRuleCall_2_0() { return cTableEStringParserRuleCall_2_0; }
		
		//'as'
		public Keyword getAsKeyword_3() { return cAsKeyword_3; }
		
		//alias=EString
		public Assignment getAliasAssignment_4() { return cAliasAssignment_4; }
		
		//EString
		public RuleCall getAliasEStringParserRuleCall_4_0() { return cAliasEStringParserRuleCall_4_0; }
		
		//NL
		public RuleCall getNLTerminalRuleCall_5() { return cNLTerminalRuleCall_5; }
	}
	public class LoadElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.csvmanl.CsvMan.Load");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cLoadAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLoadKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTableAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTableEStringParserRuleCall_2_0 = (RuleCall)cTableAssignment_2.eContents().get(0);
		private final Keyword cAsKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cAliasAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cAliasEStringParserRuleCall_4_0 = (RuleCall)cAliasAssignment_4.eContents().get(0);
		private final RuleCall cNLTerminalRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		
		//Load:
		//	{Load}
		//	'load' table=EString 'as' alias=EString NL;
		@Override public ParserRule getRule() { return rule; }
		
		//{Load} 'load' table=EString 'as' alias=EString NL
		public Group getGroup() { return cGroup; }
		
		//{Load}
		public Action getLoadAction_0() { return cLoadAction_0; }
		
		//'load'
		public Keyword getLoadKeyword_1() { return cLoadKeyword_1; }
		
		//table=EString
		public Assignment getTableAssignment_2() { return cTableAssignment_2; }
		
		//EString
		public RuleCall getTableEStringParserRuleCall_2_0() { return cTableEStringParserRuleCall_2_0; }
		
		//'as'
		public Keyword getAsKeyword_3() { return cAsKeyword_3; }
		
		//alias=EString
		public Assignment getAliasAssignment_4() { return cAliasAssignment_4; }
		
		//EString
		public RuleCall getAliasEStringParserRuleCall_4_0() { return cAliasEStringParserRuleCall_4_0; }
		
		//NL
		public RuleCall getNLTerminalRuleCall_5() { return cNLTerminalRuleCall_5; }
	}
	public class ShowElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.csvmanl.CsvMan.Show");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cShowAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cShowKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTableAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTableEStringParserRuleCall_2_0 = (RuleCall)cTableAssignment_2.eContents().get(0);
		private final Assignment cWhereAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cWhereWhereParserRuleCall_3_0 = (RuleCall)cWhereAssignment_3.eContents().get(0);
		private final RuleCall cNLTerminalRuleCall_4 = (RuleCall)cGroup.eContents().get(4);
		
		//Show:
		//	{Show}
		//	'show' table=EString where=Where? NL;
		@Override public ParserRule getRule() { return rule; }
		
		//{Show} 'show' table=EString where=Where? NL
		public Group getGroup() { return cGroup; }
		
		//{Show}
		public Action getShowAction_0() { return cShowAction_0; }
		
		//'show'
		public Keyword getShowKeyword_1() { return cShowKeyword_1; }
		
		//table=EString
		public Assignment getTableAssignment_2() { return cTableAssignment_2; }
		
		//EString
		public RuleCall getTableEStringParserRuleCall_2_0() { return cTableEStringParserRuleCall_2_0; }
		
		//where=Where?
		public Assignment getWhereAssignment_3() { return cWhereAssignment_3; }
		
		//Where
		public RuleCall getWhereWhereParserRuleCall_3_0() { return cWhereWhereParserRuleCall_3_0; }
		
		//NL
		public RuleCall getNLTerminalRuleCall_4() { return cNLTerminalRuleCall_4; }
	}
	public class UpdateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.csvmanl.CsvMan.Update");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cUpdateAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cUpdateKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTableAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTableEStringParserRuleCall_2_0 = (RuleCall)cTableAssignment_2.eContents().get(0);
		private final Keyword cSetKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cParametersAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cParametersEStringParserRuleCall_4_0 = (RuleCall)cParametersAssignment_4.eContents().get(0);
		private final Assignment cWhereAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cWhereWhereParserRuleCall_5_0 = (RuleCall)cWhereAssignment_5.eContents().get(0);
		private final RuleCall cNLTerminalRuleCall_6 = (RuleCall)cGroup.eContents().get(6);
		
		//Update:
		//	{Update}
		//	'update' table=EString 'set' parameters=EString where=Where? NL;
		@Override public ParserRule getRule() { return rule; }
		
		//{Update} 'update' table=EString 'set' parameters=EString where=Where? NL
		public Group getGroup() { return cGroup; }
		
		//{Update}
		public Action getUpdateAction_0() { return cUpdateAction_0; }
		
		//'update'
		public Keyword getUpdateKeyword_1() { return cUpdateKeyword_1; }
		
		//table=EString
		public Assignment getTableAssignment_2() { return cTableAssignment_2; }
		
		//EString
		public RuleCall getTableEStringParserRuleCall_2_0() { return cTableEStringParserRuleCall_2_0; }
		
		//'set'
		public Keyword getSetKeyword_3() { return cSetKeyword_3; }
		
		//parameters=EString
		public Assignment getParametersAssignment_4() { return cParametersAssignment_4; }
		
		//EString
		public RuleCall getParametersEStringParserRuleCall_4_0() { return cParametersEStringParserRuleCall_4_0; }
		
		//where=Where?
		public Assignment getWhereAssignment_5() { return cWhereAssignment_5; }
		
		//Where
		public RuleCall getWhereWhereParserRuleCall_5_0() { return cWhereWhereParserRuleCall_5_0; }
		
		//NL
		public RuleCall getNLTerminalRuleCall_6() { return cNLTerminalRuleCall_6; }
	}
	public class AddElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.csvmanl.CsvMan.Add");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cAddAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cAddKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTupleAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTupleEStringParserRuleCall_2_0 = (RuleCall)cTupleAssignment_2.eContents().get(0);
		private final Keyword cInKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cTableAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTableEStringParserRuleCall_4_0 = (RuleCall)cTableAssignment_4.eContents().get(0);
		private final RuleCall cNLTerminalRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		
		//Add:
		//	{Add}
		//	'add' tuple=EString 'in' table=EString NL;
		@Override public ParserRule getRule() { return rule; }
		
		//{Add} 'add' tuple=EString 'in' table=EString NL
		public Group getGroup() { return cGroup; }
		
		//{Add}
		public Action getAddAction_0() { return cAddAction_0; }
		
		//'add'
		public Keyword getAddKeyword_1() { return cAddKeyword_1; }
		
		//tuple=EString
		public Assignment getTupleAssignment_2() { return cTupleAssignment_2; }
		
		//EString
		public RuleCall getTupleEStringParserRuleCall_2_0() { return cTupleEStringParserRuleCall_2_0; }
		
		//'in'
		public Keyword getInKeyword_3() { return cInKeyword_3; }
		
		//table=EString
		public Assignment getTableAssignment_4() { return cTableAssignment_4; }
		
		//EString
		public RuleCall getTableEStringParserRuleCall_4_0() { return cTableEStringParserRuleCall_4_0; }
		
		//NL
		public RuleCall getNLTerminalRuleCall_5() { return cNLTerminalRuleCall_5; }
	}
	public class JoinElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.csvmanl.CsvMan.Join");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cJoinAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cJoinKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTable1Assignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTable1EStringParserRuleCall_2_0 = (RuleCall)cTable1Assignment_2.eContents().get(0);
		private final Assignment cTable2Assignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTable2EStringParserRuleCall_3_0 = (RuleCall)cTable2Assignment_3.eContents().get(0);
		private final RuleCall cNLTerminalRuleCall_4 = (RuleCall)cGroup.eContents().get(4);
		
		//Join:
		//	{Join}
		//	'join' table1=EString table2=EString NL;
		@Override public ParserRule getRule() { return rule; }
		
		//{Join} 'join' table1=EString table2=EString NL
		public Group getGroup() { return cGroup; }
		
		//{Join}
		public Action getJoinAction_0() { return cJoinAction_0; }
		
		//'join'
		public Keyword getJoinKeyword_1() { return cJoinKeyword_1; }
		
		//table1=EString
		public Assignment getTable1Assignment_2() { return cTable1Assignment_2; }
		
		//EString
		public RuleCall getTable1EStringParserRuleCall_2_0() { return cTable1EStringParserRuleCall_2_0; }
		
		//table2=EString
		public Assignment getTable2Assignment_3() { return cTable2Assignment_3; }
		
		//EString
		public RuleCall getTable2EStringParserRuleCall_3_0() { return cTable2EStringParserRuleCall_3_0; }
		
		//NL
		public RuleCall getNLTerminalRuleCall_4() { return cNLTerminalRuleCall_4; }
	}
	public class DeleteElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.csvmanl.CsvMan.Delete");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cDeleteAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cDeleteKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTableAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTableEStringParserRuleCall_2_0 = (RuleCall)cTableAssignment_2.eContents().get(0);
		private final Assignment cWhereAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cWhereWhereParserRuleCall_3_0 = (RuleCall)cWhereAssignment_3.eContents().get(0);
		private final RuleCall cNLTerminalRuleCall_4 = (RuleCall)cGroup.eContents().get(4);
		
		//Delete:
		//	{Delete}
		//	'delete' table=EString where=Where? NL;
		@Override public ParserRule getRule() { return rule; }
		
		//{Delete} 'delete' table=EString where=Where? NL
		public Group getGroup() { return cGroup; }
		
		//{Delete}
		public Action getDeleteAction_0() { return cDeleteAction_0; }
		
		//'delete'
		public Keyword getDeleteKeyword_1() { return cDeleteKeyword_1; }
		
		//table=EString
		public Assignment getTableAssignment_2() { return cTableAssignment_2; }
		
		//EString
		public RuleCall getTableEStringParserRuleCall_2_0() { return cTableEStringParserRuleCall_2_0; }
		
		//where=Where?
		public Assignment getWhereAssignment_3() { return cWhereAssignment_3; }
		
		//Where
		public RuleCall getWhereWhereParserRuleCall_3_0() { return cWhereWhereParserRuleCall_3_0; }
		
		//NL
		public RuleCall getNLTerminalRuleCall_4() { return cNLTerminalRuleCall_4; }
	}
	public class ExitElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.csvmanl.CsvMan.Exit");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cExitAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cExitKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final RuleCall cNLTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		
		//Exit:
		//	{Exit}
		//	'exit' NL;
		@Override public ParserRule getRule() { return rule; }
		
		//{Exit} 'exit' NL
		public Group getGroup() { return cGroup; }
		
		//{Exit}
		public Action getExitAction_0() { return cExitAction_0; }
		
		//'exit'
		public Keyword getExitKeyword_1() { return cExitKeyword_1; }
		
		//NL
		public RuleCall getNLTerminalRuleCall_2() { return cNLTerminalRuleCall_2; }
	}
	public class WhereElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.csvmanl.CsvMan.Where");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cWhereAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cWhereKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cConditionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cConditionConditionParserRuleCall_2_0 = (RuleCall)cConditionAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cCommaKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cConditionAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cConditionConditionParserRuleCall_3_1_0 = (RuleCall)cConditionAssignment_3_1.eContents().get(0);
		
		//Where:
		//	{Where}
		//	'where' condition+=Condition (',' condition+=Condition)*;
		@Override public ParserRule getRule() { return rule; }
		
		//{Where} 'where' condition+=Condition (',' condition+=Condition)*
		public Group getGroup() { return cGroup; }
		
		//{Where}
		public Action getWhereAction_0() { return cWhereAction_0; }
		
		//'where'
		public Keyword getWhereKeyword_1() { return cWhereKeyword_1; }
		
		//condition+=Condition
		public Assignment getConditionAssignment_2() { return cConditionAssignment_2; }
		
		//Condition
		public RuleCall getConditionConditionParserRuleCall_2_0() { return cConditionConditionParserRuleCall_2_0; }
		
		//(',' condition+=Condition)*
		public Group getGroup_3() { return cGroup_3; }
		
		//','
		public Keyword getCommaKeyword_3_0() { return cCommaKeyword_3_0; }
		
		//condition+=Condition
		public Assignment getConditionAssignment_3_1() { return cConditionAssignment_3_1; }
		
		//Condition
		public RuleCall getConditionConditionParserRuleCall_3_1_0() { return cConditionConditionParserRuleCall_3_1_0; }
	}
	public class ConditionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.csvmanl.CsvMan.Condition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cConditionAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cAtributAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cAtributEStringParserRuleCall_1_0 = (RuleCall)cAtributAssignment_1.eContents().get(0);
		private final RuleCall cOPTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Assignment cValeurAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cValeurEStringParserRuleCall_3_0 = (RuleCall)cValeurAssignment_3.eContents().get(0);
		
		//Condition:
		//	{Condition} atribut=EString OP valeur=EString;
		@Override public ParserRule getRule() { return rule; }
		
		//{Condition} atribut=EString OP valeur=EString
		public Group getGroup() { return cGroup; }
		
		//{Condition}
		public Action getConditionAction_0() { return cConditionAction_0; }
		
		//atribut=EString
		public Assignment getAtributAssignment_1() { return cAtributAssignment_1; }
		
		//EString
		public RuleCall getAtributEStringParserRuleCall_1_0() { return cAtributEStringParserRuleCall_1_0; }
		
		//OP
		public RuleCall getOPTerminalRuleCall_2() { return cOPTerminalRuleCall_2; }
		
		//valeur=EString
		public Assignment getValeurAssignment_3() { return cValeurAssignment_3; }
		
		//EString
		public RuleCall getValeurEStringParserRuleCall_3_0() { return cValeurEStringParserRuleCall_3_0; }
	}
	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.csvmanl.CsvMan.EString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EString:
		//	STRING | ID;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING | ID
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}
	
	
	private final ProgramElements pProgram;
	private final InstructionElements pInstruction;
	private final CreateElements pCreate;
	private final LoadElements pLoad;
	private final ShowElements pShow;
	private final UpdateElements pUpdate;
	private final AddElements pAdd;
	private final JoinElements pJoin;
	private final DeleteElements pDelete;
	private final ExitElements pExit;
	private final WhereElements pWhere;
	private final ConditionElements pCondition;
	private final EStringElements pEString;
	private final TerminalRule tOP;
	private final TerminalRule tNL;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public CsvManGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pProgram = new ProgramElements();
		this.pInstruction = new InstructionElements();
		this.pCreate = new CreateElements();
		this.pLoad = new LoadElements();
		this.pShow = new ShowElements();
		this.pUpdate = new UpdateElements();
		this.pAdd = new AddElements();
		this.pJoin = new JoinElements();
		this.pDelete = new DeleteElements();
		this.pExit = new ExitElements();
		this.pWhere = new WhereElements();
		this.pCondition = new ConditionElements();
		this.pEString = new EStringElements();
		this.tOP = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.csvmanl.CsvMan.OP");
		this.tNL = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.csvmanl.CsvMan.NL");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.csvmanl.CsvMan".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Program:
	//	{Program} instruction+=Instruction*;
	public ProgramElements getProgramAccess() {
		return pProgram;
	}
	
	public ParserRule getProgramRule() {
		return getProgramAccess().getRule();
	}
	
	//Instruction:
	//	Create | Load | Show | Update | Add | Join | Delete | Exit;
	public InstructionElements getInstructionAccess() {
		return pInstruction;
	}
	
	public ParserRule getInstructionRule() {
		return getInstructionAccess().getRule();
	}
	
	//Create:
	//	{Create}
	//	'create' table=EString 'as' alias=EString NL;
	public CreateElements getCreateAccess() {
		return pCreate;
	}
	
	public ParserRule getCreateRule() {
		return getCreateAccess().getRule();
	}
	
	//Load:
	//	{Load}
	//	'load' table=EString 'as' alias=EString NL;
	public LoadElements getLoadAccess() {
		return pLoad;
	}
	
	public ParserRule getLoadRule() {
		return getLoadAccess().getRule();
	}
	
	//Show:
	//	{Show}
	//	'show' table=EString where=Where? NL;
	public ShowElements getShowAccess() {
		return pShow;
	}
	
	public ParserRule getShowRule() {
		return getShowAccess().getRule();
	}
	
	//Update:
	//	{Update}
	//	'update' table=EString 'set' parameters=EString where=Where? NL;
	public UpdateElements getUpdateAccess() {
		return pUpdate;
	}
	
	public ParserRule getUpdateRule() {
		return getUpdateAccess().getRule();
	}
	
	//Add:
	//	{Add}
	//	'add' tuple=EString 'in' table=EString NL;
	public AddElements getAddAccess() {
		return pAdd;
	}
	
	public ParserRule getAddRule() {
		return getAddAccess().getRule();
	}
	
	//Join:
	//	{Join}
	//	'join' table1=EString table2=EString NL;
	public JoinElements getJoinAccess() {
		return pJoin;
	}
	
	public ParserRule getJoinRule() {
		return getJoinAccess().getRule();
	}
	
	//Delete:
	//	{Delete}
	//	'delete' table=EString where=Where? NL;
	public DeleteElements getDeleteAccess() {
		return pDelete;
	}
	
	public ParserRule getDeleteRule() {
		return getDeleteAccess().getRule();
	}
	
	//Exit:
	//	{Exit}
	//	'exit' NL;
	public ExitElements getExitAccess() {
		return pExit;
	}
	
	public ParserRule getExitRule() {
		return getExitAccess().getRule();
	}
	
	//Where:
	//	{Where}
	//	'where' condition+=Condition (',' condition+=Condition)*;
	public WhereElements getWhereAccess() {
		return pWhere;
	}
	
	public ParserRule getWhereRule() {
		return getWhereAccess().getRule();
	}
	
	//Condition:
	//	{Condition} atribut=EString OP valeur=EString;
	public ConditionElements getConditionAccess() {
		return pCondition;
	}
	
	public ParserRule getConditionRule() {
		return getConditionAccess().getRule();
	}
	
	//EString:
	//	STRING | ID;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}
	
	//terminal OP:
	//	'<' | '=' | '>' | '>=' | '<=';
	public TerminalRule getOPRule() {
		return tOP;
	}
	
	//terminal NL:
	//	'\r' | '\n'+;
	public TerminalRule getNLRule() {
		return tNL;
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
