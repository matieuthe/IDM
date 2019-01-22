/*
 * generated by Xtext 2.12.0
 */
grammar InternalCsvMan;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.csvmanl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.example.csvmanl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.csvmanl.services.CsvManGrammarAccess;

}

@parser::members {

 	private CsvManGrammarAccess grammarAccess;

    public InternalCsvManParser(TokenStream input, CsvManGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Program";
   	}

   	@Override
   	protected CsvManGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleProgram
entryRuleProgram returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProgramRule()); }
	iv_ruleProgram=ruleProgram
	{ $current=$iv_ruleProgram.current; }
	EOF;

// Rule Program
ruleProgram returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getProgramAccess().getProgramAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getProgramAccess().getInstructionInstructionParserRuleCall_1_0());
				}
				lv_instruction_1_0=ruleInstruction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProgramRule());
					}
					add(
						$current,
						"instruction",
						lv_instruction_1_0,
						"org.xtext.example.csvmanl.CsvMan.Instruction");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleInstruction
entryRuleInstruction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInstructionRule()); }
	iv_ruleInstruction=ruleInstruction
	{ $current=$iv_ruleInstruction.current; }
	EOF;

// Rule Instruction
ruleInstruction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getInstructionAccess().getCreateParserRuleCall_0());
		}
		this_Create_0=ruleCreate
		{
			$current = $this_Create_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getInstructionAccess().getLoadParserRuleCall_1());
		}
		this_Load_1=ruleLoad
		{
			$current = $this_Load_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getInstructionAccess().getShowParserRuleCall_2());
		}
		this_Show_2=ruleShow
		{
			$current = $this_Show_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getInstructionAccess().getUpdateParserRuleCall_3());
		}
		this_Update_3=ruleUpdate
		{
			$current = $this_Update_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getInstructionAccess().getAddParserRuleCall_4());
		}
		this_Add_4=ruleAdd
		{
			$current = $this_Add_4.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getInstructionAccess().getJoinParserRuleCall_5());
		}
		this_Join_5=ruleJoin
		{
			$current = $this_Join_5.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getInstructionAccess().getDeleteParserRuleCall_6());
		}
		this_Delete_6=ruleDelete
		{
			$current = $this_Delete_6.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getInstructionAccess().getExitParserRuleCall_7());
		}
		this_Exit_7=ruleExit
		{
			$current = $this_Exit_7.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getInstructionAccess().getCommentParserRuleCall_8());
		}
		this_Comment_8=ruleComment
		{
			$current = $this_Comment_8.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getInstructionAccess().getCopyParserRuleCall_9());
		}
		this_Copy_9=ruleCopy
		{
			$current = $this_Copy_9.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleCopy
entryRuleCopy returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCopyRule()); }
	iv_ruleCopy=ruleCopy
	{ $current=$iv_ruleCopy.current; }
	EOF;

// Rule Copy
ruleCopy returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getCopyAccess().getCopyAction_0(),
					$current);
			}
		)
		otherlv_1='copy'
		{
			newLeafNode(otherlv_1, grammarAccess.getCopyAccess().getCopyKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCopyAccess().getAliasEStringParserRuleCall_2_0());
				}
				lv_alias_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCopyRule());
					}
					set(
						$current,
						"alias",
						lv_alias_2_0,
						"org.xtext.example.csvmanl.CsvMan.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='in'
		{
			newLeafNode(otherlv_3, grammarAccess.getCopyAccess().getInKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCopyAccess().getTableEStringParserRuleCall_4_0());
				}
				lv_table_4_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCopyRule());
					}
					set(
						$current,
						"table",
						lv_table_4_0,
						"org.xtext.example.csvmanl.CsvMan.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_NL_5=RULE_NL
		{
			newLeafNode(this_NL_5, grammarAccess.getCopyAccess().getNLTerminalRuleCall_5());
		}
	)
;

// Entry rule entryRuleCreate
entryRuleCreate returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCreateRule()); }
	iv_ruleCreate=ruleCreate
	{ $current=$iv_ruleCreate.current; }
	EOF;

// Rule Create
ruleCreate returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getCreateAccess().getCreateAction_0(),
					$current);
			}
		)
		otherlv_1='create'
		{
			newLeafNode(otherlv_1, grammarAccess.getCreateAccess().getCreateKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCreateAccess().getTableEStringParserRuleCall_2_0());
				}
				lv_table_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCreateRule());
					}
					set(
						$current,
						"table",
						lv_table_2_0,
						"org.xtext.example.csvmanl.CsvMan.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='('
		{
			newLeafNode(otherlv_3, grammarAccess.getCreateAccess().getLeftParenthesisKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCreateAccess().getColonneEStringParserRuleCall_4_0());
				}
				lv_colonne_4_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCreateRule());
					}
					add(
						$current,
						"colonne",
						lv_colonne_4_0,
						"org.xtext.example.csvmanl.CsvMan.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_5=','
			{
				newLeafNode(otherlv_5, grammarAccess.getCreateAccess().getCommaKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getCreateAccess().getColonneEStringParserRuleCall_5_1_0());
					}
					lv_colonne_6_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCreateRule());
						}
						add(
							$current,
							"colonne",
							lv_colonne_6_0,
							"org.xtext.example.csvmanl.CsvMan.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_7=')'
		{
			newLeafNode(otherlv_7, grammarAccess.getCreateAccess().getRightParenthesisKeyword_6());
		}
		this_NL_8=RULE_NL
		{
			newLeafNode(this_NL_8, grammarAccess.getCreateAccess().getNLTerminalRuleCall_7());
		}
	)
;

// Entry rule entryRuleLoad
entryRuleLoad returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLoadRule()); }
	iv_ruleLoad=ruleLoad
	{ $current=$iv_ruleLoad.current; }
	EOF;

// Rule Load
ruleLoad returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getLoadAccess().getLoadAction_0(),
					$current);
			}
		)
		otherlv_1='load'
		{
			newLeafNode(otherlv_1, grammarAccess.getLoadAccess().getLoadKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getLoadAccess().getTableEStringParserRuleCall_2_0());
				}
				lv_table_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getLoadRule());
					}
					set(
						$current,
						"table",
						lv_table_2_0,
						"org.xtext.example.csvmanl.CsvMan.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='as'
		{
			newLeafNode(otherlv_3, grammarAccess.getLoadAccess().getAsKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getLoadAccess().getAliasEStringParserRuleCall_4_0());
				}
				lv_alias_4_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getLoadRule());
					}
					set(
						$current,
						"alias",
						lv_alias_4_0,
						"org.xtext.example.csvmanl.CsvMan.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_NL_5=RULE_NL
		{
			newLeafNode(this_NL_5, grammarAccess.getLoadAccess().getNLTerminalRuleCall_5());
		}
	)
;

// Entry rule entryRuleShow
entryRuleShow returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getShowRule()); }
	iv_ruleShow=ruleShow
	{ $current=$iv_ruleShow.current; }
	EOF;

// Rule Show
ruleShow returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getShowAccess().getShowAction_0(),
					$current);
			}
		)
		otherlv_1='show'
		{
			newLeafNode(otherlv_1, grammarAccess.getShowAccess().getShowKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getShowAccess().getTableEStringParserRuleCall_2_0());
				}
				lv_table_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getShowRule());
					}
					set(
						$current,
						"table",
						lv_table_2_0,
						"org.xtext.example.csvmanl.CsvMan.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_3='('
			{
				newLeafNode(otherlv_3, grammarAccess.getShowAccess().getLeftParenthesisKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getShowAccess().getColonneEStringParserRuleCall_3_1_0());
					}
					lv_colonne_4_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getShowRule());
						}
						add(
							$current,
							"colonne",
							lv_colonne_4_0,
							"org.xtext.example.csvmanl.CsvMan.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_5=','
				{
					newLeafNode(otherlv_5, grammarAccess.getShowAccess().getCommaKeyword_3_2_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getShowAccess().getColonneEStringParserRuleCall_3_2_1_0());
						}
						lv_colonne_6_0=ruleEString
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getShowRule());
							}
							add(
								$current,
								"colonne",
								lv_colonne_6_0,
								"org.xtext.example.csvmanl.CsvMan.EString");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_7=')'
			{
				newLeafNode(otherlv_7, grammarAccess.getShowAccess().getRightParenthesisKeyword_3_3());
			}
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getShowAccess().getWhereWhereParserRuleCall_4_0());
				}
				lv_where_8_0=ruleWhere
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getShowRule());
					}
					set(
						$current,
						"where",
						lv_where_8_0,
						"org.xtext.example.csvmanl.CsvMan.Where");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		this_NL_9=RULE_NL
		{
			newLeafNode(this_NL_9, grammarAccess.getShowAccess().getNLTerminalRuleCall_5());
		}
	)
;

// Entry rule entryRuleUpdate
entryRuleUpdate returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUpdateRule()); }
	iv_ruleUpdate=ruleUpdate
	{ $current=$iv_ruleUpdate.current; }
	EOF;

// Rule Update
ruleUpdate returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getUpdateAccess().getUpdateAction_0(),
					$current);
			}
		)
		otherlv_1='update'
		{
			newLeafNode(otherlv_1, grammarAccess.getUpdateAccess().getUpdateKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getUpdateAccess().getTableEStringParserRuleCall_2_0());
				}
				lv_table_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getUpdateRule());
					}
					set(
						$current,
						"table",
						lv_table_2_0,
						"org.xtext.example.csvmanl.CsvMan.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='set'
		{
			newLeafNode(otherlv_3, grammarAccess.getUpdateAccess().getSetKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getUpdateAccess().getParameterParameterParserRuleCall_4_0());
				}
				lv_parameter_4_0=ruleParameter
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getUpdateRule());
					}
					add(
						$current,
						"parameter",
						lv_parameter_4_0,
						"org.xtext.example.csvmanl.CsvMan.Parameter");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_5=','
			{
				newLeafNode(otherlv_5, grammarAccess.getUpdateAccess().getCommaKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getUpdateAccess().getParameterParameterParserRuleCall_5_1_0());
					}
					lv_parameter_6_0=ruleParameter
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getUpdateRule());
						}
						add(
							$current,
							"parameter",
							lv_parameter_6_0,
							"org.xtext.example.csvmanl.CsvMan.Parameter");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getUpdateAccess().getWhereWhereParserRuleCall_6_0());
				}
				lv_where_7_0=ruleWhere
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getUpdateRule());
					}
					set(
						$current,
						"where",
						lv_where_7_0,
						"org.xtext.example.csvmanl.CsvMan.Where");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		this_NL_8=RULE_NL
		{
			newLeafNode(this_NL_8, grammarAccess.getUpdateAccess().getNLTerminalRuleCall_7());
		}
	)
;

// Entry rule entryRuleAdd
entryRuleAdd returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAddRule()); }
	iv_ruleAdd=ruleAdd
	{ $current=$iv_ruleAdd.current; }
	EOF;

// Rule Add
ruleAdd returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getAddAccess().getAddAction_0(),
					$current);
			}
		)
		otherlv_1='add'
		{
			newLeafNode(otherlv_1, grammarAccess.getAddAccess().getAddKeyword_1());
		}
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getAddAccess().getLeftParenthesisKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAddAccess().getValeurEStringParserRuleCall_3_0());
				}
				lv_valeur_3_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAddRule());
					}
					add(
						$current,
						"valeur",
						lv_valeur_3_0,
						"org.xtext.example.csvmanl.CsvMan.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_4=','
			{
				newLeafNode(otherlv_4, grammarAccess.getAddAccess().getCommaKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getAddAccess().getValeurEStringParserRuleCall_4_1_0());
					}
					lv_valeur_5_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAddRule());
						}
						add(
							$current,
							"valeur",
							lv_valeur_5_0,
							"org.xtext.example.csvmanl.CsvMan.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_6=')'
		{
			newLeafNode(otherlv_6, grammarAccess.getAddAccess().getRightParenthesisKeyword_5());
		}
		otherlv_7='in'
		{
			newLeafNode(otherlv_7, grammarAccess.getAddAccess().getInKeyword_6());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAddAccess().getTableEStringParserRuleCall_7_0());
				}
				lv_table_8_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAddRule());
					}
					set(
						$current,
						"table",
						lv_table_8_0,
						"org.xtext.example.csvmanl.CsvMan.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_NL_9=RULE_NL
		{
			newLeafNode(this_NL_9, grammarAccess.getAddAccess().getNLTerminalRuleCall_8());
		}
	)
;

// Entry rule entryRuleJoin
entryRuleJoin returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getJoinRule()); }
	iv_ruleJoin=ruleJoin
	{ $current=$iv_ruleJoin.current; }
	EOF;

// Rule Join
ruleJoin returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getJoinAccess().getJoinAction_0(),
					$current);
			}
		)
		otherlv_1='join'
		{
			newLeafNode(otherlv_1, grammarAccess.getJoinAccess().getJoinKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getJoinAccess().getTable1EStringParserRuleCall_2_0());
				}
				lv_table1_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getJoinRule());
					}
					set(
						$current,
						"table1",
						lv_table1_2_0,
						"org.xtext.example.csvmanl.CsvMan.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getJoinAccess().getTable2EStringParserRuleCall_3_0());
				}
				lv_table2_3_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getJoinRule());
					}
					set(
						$current,
						"table2",
						lv_table2_3_0,
						"org.xtext.example.csvmanl.CsvMan.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='in'
		{
			newLeafNode(otherlv_4, grammarAccess.getJoinAccess().getInKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getJoinAccess().getTable3EStringParserRuleCall_5_0());
				}
				lv_table3_5_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getJoinRule());
					}
					set(
						$current,
						"table3",
						lv_table3_5_0,
						"org.xtext.example.csvmanl.CsvMan.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_NL_6=RULE_NL
		{
			newLeafNode(this_NL_6, grammarAccess.getJoinAccess().getNLTerminalRuleCall_6());
		}
	)
;

// Entry rule entryRuleDelete
entryRuleDelete returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDeleteRule()); }
	iv_ruleDelete=ruleDelete
	{ $current=$iv_ruleDelete.current; }
	EOF;

// Rule Delete
ruleDelete returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getDeleteAccess().getDeleteAction_0(),
					$current);
			}
		)
		otherlv_1='delete'
		{
			newLeafNode(otherlv_1, grammarAccess.getDeleteAccess().getDeleteKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDeleteAccess().getTableEStringParserRuleCall_2_0());
				}
				lv_table_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDeleteRule());
					}
					set(
						$current,
						"table",
						lv_table_2_0,
						"org.xtext.example.csvmanl.CsvMan.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getDeleteAccess().getWhereWhereParserRuleCall_3_0());
				}
				lv_where_3_0=ruleWhere
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDeleteRule());
					}
					set(
						$current,
						"where",
						lv_where_3_0,
						"org.xtext.example.csvmanl.CsvMan.Where");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		this_NL_4=RULE_NL
		{
			newLeafNode(this_NL_4, grammarAccess.getDeleteAccess().getNLTerminalRuleCall_4());
		}
	)
;

// Entry rule entryRuleExit
entryRuleExit returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExitRule()); }
	iv_ruleExit=ruleExit
	{ $current=$iv_ruleExit.current; }
	EOF;

// Rule Exit
ruleExit returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getExitAccess().getExitAction_0(),
					$current);
			}
		)
		otherlv_1='exit'
		{
			newLeafNode(otherlv_1, grammarAccess.getExitAccess().getExitKeyword_1());
		}
	)
;

// Entry rule entryRuleWhere
entryRuleWhere returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWhereRule()); }
	iv_ruleWhere=ruleWhere
	{ $current=$iv_ruleWhere.current; }
	EOF;

// Rule Where
ruleWhere returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getWhereAccess().getWhereAction_0(),
					$current);
			}
		)
		otherlv_1='where'
		{
			newLeafNode(otherlv_1, grammarAccess.getWhereAccess().getWhereKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getWhereAccess().getConditionConditionParserRuleCall_2_0());
				}
				lv_condition_2_0=ruleCondition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWhereRule());
					}
					add(
						$current,
						"condition",
						lv_condition_2_0,
						"org.xtext.example.csvmanl.CsvMan.Condition");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_3=','
			{
				newLeafNode(otherlv_3, grammarAccess.getWhereAccess().getCommaKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getWhereAccess().getConditionConditionParserRuleCall_3_1_0());
					}
					lv_condition_4_0=ruleCondition
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getWhereRule());
						}
						add(
							$current,
							"condition",
							lv_condition_4_0,
							"org.xtext.example.csvmanl.CsvMan.Condition");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleCondition
entryRuleCondition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConditionRule()); }
	iv_ruleCondition=ruleCondition
	{ $current=$iv_ruleCondition.current; }
	EOF;

// Rule Condition
ruleCondition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getConditionAccess().getConditionAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getConditionAccess().getAtributEStringParserRuleCall_1_0());
				}
				lv_atribut_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConditionRule());
					}
					set(
						$current,
						"atribut",
						lv_atribut_1_0,
						"org.xtext.example.csvmanl.CsvMan.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_2='='
			{
				newLeafNode(otherlv_2, grammarAccess.getConditionAccess().getEqualsSignKeyword_2_0());
			}
			    |
			this_OP_3=RULE_OP
			{
				newLeafNode(this_OP_3, grammarAccess.getConditionAccess().getOPTerminalRuleCall_2_1());
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getConditionAccess().getValeurEStringParserRuleCall_3_0());
				}
				lv_valeur_4_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConditionRule());
					}
					set(
						$current,
						"valeur",
						lv_valeur_4_0,
						"org.xtext.example.csvmanl.CsvMan.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleParameter
entryRuleParameter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getParameterRule()); }
	iv_ruleParameter=ruleParameter
	{ $current=$iv_ruleParameter.current; }
	EOF;

// Rule Parameter
ruleParameter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getParameterAccess().getParameterAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getParameterAccess().getColonneEStringParserRuleCall_1_0());
				}
				lv_colonne_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getParameterRule());
					}
					set(
						$current,
						"colonne",
						lv_colonne_1_0,
						"org.xtext.example.csvmanl.CsvMan.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='='
		{
			newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getEqualsSignKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getParameterAccess().getValueEStringParserRuleCall_3_0());
				}
				lv_value_3_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getParameterRule());
					}
					set(
						$current,
						"value",
						lv_value_3_0,
						"org.xtext.example.csvmanl.CsvMan.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleComment
entryRuleComment returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCommentRule()); }
	iv_ruleComment=ruleComment
	{ $current=$iv_ruleComment.current; }
	EOF;

// Rule Comment
ruleComment returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ML_COMMENT_0=RULE_ML_COMMENT
		{
			newLeafNode(this_ML_COMMENT_0, grammarAccess.getCommentAccess().getML_COMMENTTerminalRuleCall_0());
		}
		    |
		this_SL_COMMENT_1=RULE_SL_COMMENT
		{
			newLeafNode(this_SL_COMMENT_1, grammarAccess.getCommentAccess().getSL_COMMENTTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
		}
		    |
		this_INT_2=RULE_INT
		{
			$current.merge(this_INT_2);
		}
		{
			newLeafNode(this_INT_2, grammarAccess.getEStringAccess().getINTTerminalRuleCall_2());
		}
	)
;

RULE_OP : ('<'|'>'|'>='|'<=');

RULE_NL : ('\b'|'\t')* ('\r'|'\n'|';')+;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
