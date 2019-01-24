/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.csvmanl.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.csvmanl.ide.contentassist.antlr.internal.InternalCsvManParser;
import org.xtext.example.csvmanl.services.CsvManGrammarAccess;

public class CsvManParser extends AbstractContentAssistParser {

	@Inject
	private CsvManGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalCsvManParser createParser() {
		InternalCsvManParser result = new InternalCsvManParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getInstructionAccess().getAlternatives(), "rule__Instruction__Alternatives");
					put(grammarAccess.getAddAccess().getAlternatives_2(), "rule__Add__Alternatives_2");
					put(grammarAccess.getConditionAccess().getAlternatives_2(), "rule__Condition__Alternatives_2");
					put(grammarAccess.getCommentAccess().getAlternatives(), "rule__Comment__Alternatives");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getProgramAccess().getGroup(), "rule__Program__Group__0");
					put(grammarAccess.getProgramAccess().getGroup_1(), "rule__Program__Group_1__0");
					put(grammarAccess.getRemoveAccess().getGroup(), "rule__Remove__Group__0");
					put(grammarAccess.getCopyAccess().getGroup(), "rule__Copy__Group__0");
					put(grammarAccess.getCreateAccess().getGroup(), "rule__Create__Group__0");
					put(grammarAccess.getLoadAccess().getGroup(), "rule__Load__Group__0");
					put(grammarAccess.getShowAccess().getGroup(), "rule__Show__Group__0");
					put(grammarAccess.getShowAccess().getGroup_3(), "rule__Show__Group_3__0");
					put(grammarAccess.getShowAccess().getGroup_3_2(), "rule__Show__Group_3_2__0");
					put(grammarAccess.getUpdateAccess().getGroup(), "rule__Update__Group__0");
					put(grammarAccess.getUpdateAccess().getGroup_5(), "rule__Update__Group_5__0");
					put(grammarAccess.getAddAccess().getGroup(), "rule__Add__Group__0");
					put(grammarAccess.getAddAccess().getGroup_2_0(), "rule__Add__Group_2_0__0");
					put(grammarAccess.getAddAccess().getGroup_2_0_2(), "rule__Add__Group_2_0_2__0");
					put(grammarAccess.getAddAccess().getGroup_2_1(), "rule__Add__Group_2_1__0");
					put(grammarAccess.getAddAccess().getGroup_2_1_2(), "rule__Add__Group_2_1_2__0");
					put(grammarAccess.getJoinAccess().getGroup(), "rule__Join__Group__0");
					put(grammarAccess.getDeleteAccess().getGroup(), "rule__Delete__Group__0");
					put(grammarAccess.getExitAccess().getGroup(), "rule__Exit__Group__0");
					put(grammarAccess.getWhereAccess().getGroup(), "rule__Where__Group__0");
					put(grammarAccess.getWhereAccess().getGroup_3(), "rule__Where__Group_3__0");
					put(grammarAccess.getConditionAccess().getGroup(), "rule__Condition__Group__0");
					put(grammarAccess.getParameterAccess().getGroup(), "rule__Parameter__Group__0");
					put(grammarAccess.getCsvTableAccess().getGroup(), "rule__CsvTable__Group__0");
					put(grammarAccess.getCsvTableAccess().getGroup_2(), "rule__CsvTable__Group_2__0");
					put(grammarAccess.getCsvTableAccess().getGroup_2_2(), "rule__CsvTable__Group_2_2__0");
					put(grammarAccess.getProgramAccess().getInstructionAssignment_1_0(), "rule__Program__InstructionAssignment_1_0");
					put(grammarAccess.getRemoveAccess().getCsvtableAssignment_2(), "rule__Remove__CsvtableAssignment_2");
					put(grammarAccess.getCopyAccess().getAliasAssignment_2(), "rule__Copy__AliasAssignment_2");
					put(grammarAccess.getCopyAccess().getTableAssignment_4(), "rule__Copy__TableAssignment_4");
					put(grammarAccess.getCreateAccess().getCsvtableAssignment_2(), "rule__Create__CsvtableAssignment_2");
					put(grammarAccess.getLoadAccess().getFichierAssignment_2(), "rule__Load__FichierAssignment_2");
					put(grammarAccess.getLoadAccess().getCsvtableAssignment_4(), "rule__Load__CsvtableAssignment_4");
					put(grammarAccess.getShowAccess().getCsvtableAssignment_2(), "rule__Show__CsvtableAssignment_2");
					put(grammarAccess.getShowAccess().getColonneAssignment_3_1(), "rule__Show__ColonneAssignment_3_1");
					put(grammarAccess.getShowAccess().getColonneAssignment_3_2_1(), "rule__Show__ColonneAssignment_3_2_1");
					put(grammarAccess.getShowAccess().getWhereAssignment_4(), "rule__Show__WhereAssignment_4");
					put(grammarAccess.getUpdateAccess().getCsvtableAssignment_2(), "rule__Update__CsvtableAssignment_2");
					put(grammarAccess.getUpdateAccess().getParameterAssignment_4(), "rule__Update__ParameterAssignment_4");
					put(grammarAccess.getUpdateAccess().getParameterAssignment_5_1(), "rule__Update__ParameterAssignment_5_1");
					put(grammarAccess.getUpdateAccess().getWhereAssignment_6(), "rule__Update__WhereAssignment_6");
					put(grammarAccess.getAddAccess().getValeurAssignment_2_0_1(), "rule__Add__ValeurAssignment_2_0_1");
					put(grammarAccess.getAddAccess().getValeurAssignment_2_0_2_1(), "rule__Add__ValeurAssignment_2_0_2_1");
					put(grammarAccess.getAddAccess().getParameterAssignment_2_1_1(), "rule__Add__ParameterAssignment_2_1_1");
					put(grammarAccess.getAddAccess().getParameterAssignment_2_1_2_1(), "rule__Add__ParameterAssignment_2_1_2_1");
					put(grammarAccess.getAddAccess().getCsvtableAssignment_4(), "rule__Add__CsvtableAssignment_4");
					put(grammarAccess.getJoinAccess().getTablesAssignment_2(), "rule__Join__TablesAssignment_2");
					put(grammarAccess.getJoinAccess().getTablesAssignment_3(), "rule__Join__TablesAssignment_3");
					put(grammarAccess.getJoinAccess().getTable3Assignment_5(), "rule__Join__Table3Assignment_5");
					put(grammarAccess.getDeleteAccess().getCsvtableAssignment_2(), "rule__Delete__CsvtableAssignment_2");
					put(grammarAccess.getDeleteAccess().getWhereAssignment_3(), "rule__Delete__WhereAssignment_3");
					put(grammarAccess.getWhereAccess().getConditionAssignment_2(), "rule__Where__ConditionAssignment_2");
					put(grammarAccess.getWhereAccess().getConditionAssignment_3_1(), "rule__Where__ConditionAssignment_3_1");
					put(grammarAccess.getConditionAccess().getColonneAssignment_1(), "rule__Condition__ColonneAssignment_1");
					put(grammarAccess.getConditionAccess().getValeurAssignment_3(), "rule__Condition__ValeurAssignment_3");
					put(grammarAccess.getParameterAccess().getColonneAssignment_1(), "rule__Parameter__ColonneAssignment_1");
					put(grammarAccess.getParameterAccess().getValueAssignment_3(), "rule__Parameter__ValueAssignment_3");
					put(grammarAccess.getCsvTableAccess().getNameAssignment_1(), "rule__CsvTable__NameAssignment_1");
					put(grammarAccess.getCsvTableAccess().getColonneAssignment_2_1(), "rule__CsvTable__ColonneAssignment_2_1");
					put(grammarAccess.getCsvTableAccess().getColonneAssignment_2_2_1(), "rule__CsvTable__ColonneAssignment_2_2_1");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public CsvManGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(CsvManGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
