/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.csvmanl.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.example.csvmanl.services.CsvManGrammarAccess;

@SuppressWarnings("all")
public class CsvManSyntacticSequencer extends AbstractSyntacticSequencer {

	protected CsvManGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Comment_ML_COMMENTTerminalRuleCall_0_or_SL_COMMENTTerminalRuleCall_1;
	protected AbstractElementAlias match_Condition_EqualsSignKeyword_2_0_or_OPTerminalRuleCall_2_1;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (CsvManGrammarAccess) access;
		match_Comment_ML_COMMENTTerminalRuleCall_0_or_SL_COMMENTTerminalRuleCall_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getCommentAccess().getML_COMMENTTerminalRuleCall_0()), new TokenAlias(false, false, grammarAccess.getCommentAccess().getSL_COMMENTTerminalRuleCall_1()));
		match_Condition_EqualsSignKeyword_2_0_or_OPTerminalRuleCall_2_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getConditionAccess().getEqualsSignKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getConditionAccess().getOPTerminalRuleCall_2_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getML_COMMENTRule())
			return getML_COMMENTToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getNLRule())
			return getNLToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getOPRule())
			return getOPToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getSL_COMMENTRule())
			return getSL_COMMENTToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal ML_COMMENT	: '/*' -> '*&#47;';
	 */
	protected String getML_COMMENTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "/*";
	}
	
	/**
	 * terminal NL: (('\b'|'\t')*('\r'|'\n' | ';')+);
	 */
	protected String getNLToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\r";
	}
	
	/**
	 * terminal OP: '<' | '>' | '>=' | '<=';
	 */
	protected String getOPToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "<";
	}
	
	/**
	 * terminal SL_COMMENT 	: '//' !('\n'|'\r')* ('\r'? '\n')?;
	 */
	protected String getSL_COMMENTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "//";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Comment_ML_COMMENTTerminalRuleCall_0_or_SL_COMMENTTerminalRuleCall_1.equals(syntax))
				emit_Comment_ML_COMMENTTerminalRuleCall_0_or_SL_COMMENTTerminalRuleCall_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Condition_EqualsSignKeyword_2_0_or_OPTerminalRuleCall_2_1.equals(syntax))
				emit_Condition_EqualsSignKeyword_2_0_or_OPTerminalRuleCall_2_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     SL_COMMENT | ML_COMMENT
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_Comment_ML_COMMENTTerminalRuleCall_0_or_SL_COMMENTTerminalRuleCall_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '=' | OP
	 *
	 * This ambiguous syntax occurs at:
	 *     atribut=EString (ambiguity) valeur=EString
	 */
	protected void emit_Condition_EqualsSignKeyword_2_0_or_OPTerminalRuleCall_2_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
