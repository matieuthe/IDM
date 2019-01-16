package org.xtext.example.csvmanl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.csvmanl.services.CsvManGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCsvManParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_NL", "RULE_OP", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'create'", "'as'", "'load'", "'show'", "'update'", "'set'", "'add'", "'in'", "'join'", "'delete'", "'exit'", "'where'", "','"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_OP=7;
    public static final int RULE_ID=5;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_INT=8;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_NL=6;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalCsvManParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCsvManParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCsvManParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCsvMan.g"; }


    	private CsvManGrammarAccess grammarAccess;

    	public void setGrammarAccess(CsvManGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleProgram"
    // InternalCsvMan.g:53:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // InternalCsvMan.g:54:1: ( ruleProgram EOF )
            // InternalCsvMan.g:55:1: ruleProgram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalCsvMan.g:62:1: ruleProgram : ( ( rule__Program__Group__0 ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:66:2: ( ( ( rule__Program__Group__0 ) ) )
            // InternalCsvMan.g:67:2: ( ( rule__Program__Group__0 ) )
            {
            // InternalCsvMan.g:67:2: ( ( rule__Program__Group__0 ) )
            // InternalCsvMan.g:68:3: ( rule__Program__Group__0 )
            {
             before(grammarAccess.getProgramAccess().getGroup()); 
            // InternalCsvMan.g:69:3: ( rule__Program__Group__0 )
            // InternalCsvMan.g:69:4: rule__Program__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleInstruction"
    // InternalCsvMan.g:78:1: entryRuleInstruction : ruleInstruction EOF ;
    public final void entryRuleInstruction() throws RecognitionException {
        try {
            // InternalCsvMan.g:79:1: ( ruleInstruction EOF )
            // InternalCsvMan.g:80:1: ruleInstruction EOF
            {
             before(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_1);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getInstructionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // InternalCsvMan.g:87:1: ruleInstruction : ( ( rule__Instruction__Alternatives ) ) ;
    public final void ruleInstruction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:91:2: ( ( ( rule__Instruction__Alternatives ) ) )
            // InternalCsvMan.g:92:2: ( ( rule__Instruction__Alternatives ) )
            {
            // InternalCsvMan.g:92:2: ( ( rule__Instruction__Alternatives ) )
            // InternalCsvMan.g:93:3: ( rule__Instruction__Alternatives )
            {
             before(grammarAccess.getInstructionAccess().getAlternatives()); 
            // InternalCsvMan.g:94:3: ( rule__Instruction__Alternatives )
            // InternalCsvMan.g:94:4: rule__Instruction__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Instruction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInstructionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleCreate"
    // InternalCsvMan.g:103:1: entryRuleCreate : ruleCreate EOF ;
    public final void entryRuleCreate() throws RecognitionException {
        try {
            // InternalCsvMan.g:104:1: ( ruleCreate EOF )
            // InternalCsvMan.g:105:1: ruleCreate EOF
            {
             before(grammarAccess.getCreateRule()); 
            pushFollow(FOLLOW_1);
            ruleCreate();

            state._fsp--;

             after(grammarAccess.getCreateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCreate"


    // $ANTLR start "ruleCreate"
    // InternalCsvMan.g:112:1: ruleCreate : ( ( rule__Create__Group__0 ) ) ;
    public final void ruleCreate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:116:2: ( ( ( rule__Create__Group__0 ) ) )
            // InternalCsvMan.g:117:2: ( ( rule__Create__Group__0 ) )
            {
            // InternalCsvMan.g:117:2: ( ( rule__Create__Group__0 ) )
            // InternalCsvMan.g:118:3: ( rule__Create__Group__0 )
            {
             before(grammarAccess.getCreateAccess().getGroup()); 
            // InternalCsvMan.g:119:3: ( rule__Create__Group__0 )
            // InternalCsvMan.g:119:4: rule__Create__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Create__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCreateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCreate"


    // $ANTLR start "entryRuleLoad"
    // InternalCsvMan.g:128:1: entryRuleLoad : ruleLoad EOF ;
    public final void entryRuleLoad() throws RecognitionException {
        try {
            // InternalCsvMan.g:129:1: ( ruleLoad EOF )
            // InternalCsvMan.g:130:1: ruleLoad EOF
            {
             before(grammarAccess.getLoadRule()); 
            pushFollow(FOLLOW_1);
            ruleLoad();

            state._fsp--;

             after(grammarAccess.getLoadRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLoad"


    // $ANTLR start "ruleLoad"
    // InternalCsvMan.g:137:1: ruleLoad : ( ( rule__Load__Group__0 ) ) ;
    public final void ruleLoad() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:141:2: ( ( ( rule__Load__Group__0 ) ) )
            // InternalCsvMan.g:142:2: ( ( rule__Load__Group__0 ) )
            {
            // InternalCsvMan.g:142:2: ( ( rule__Load__Group__0 ) )
            // InternalCsvMan.g:143:3: ( rule__Load__Group__0 )
            {
             before(grammarAccess.getLoadAccess().getGroup()); 
            // InternalCsvMan.g:144:3: ( rule__Load__Group__0 )
            // InternalCsvMan.g:144:4: rule__Load__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Load__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLoadAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLoad"


    // $ANTLR start "entryRuleShow"
    // InternalCsvMan.g:153:1: entryRuleShow : ruleShow EOF ;
    public final void entryRuleShow() throws RecognitionException {
        try {
            // InternalCsvMan.g:154:1: ( ruleShow EOF )
            // InternalCsvMan.g:155:1: ruleShow EOF
            {
             before(grammarAccess.getShowRule()); 
            pushFollow(FOLLOW_1);
            ruleShow();

            state._fsp--;

             after(grammarAccess.getShowRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleShow"


    // $ANTLR start "ruleShow"
    // InternalCsvMan.g:162:1: ruleShow : ( ( rule__Show__Group__0 ) ) ;
    public final void ruleShow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:166:2: ( ( ( rule__Show__Group__0 ) ) )
            // InternalCsvMan.g:167:2: ( ( rule__Show__Group__0 ) )
            {
            // InternalCsvMan.g:167:2: ( ( rule__Show__Group__0 ) )
            // InternalCsvMan.g:168:3: ( rule__Show__Group__0 )
            {
             before(grammarAccess.getShowAccess().getGroup()); 
            // InternalCsvMan.g:169:3: ( rule__Show__Group__0 )
            // InternalCsvMan.g:169:4: rule__Show__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Show__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getShowAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleShow"


    // $ANTLR start "entryRuleUpdate"
    // InternalCsvMan.g:178:1: entryRuleUpdate : ruleUpdate EOF ;
    public final void entryRuleUpdate() throws RecognitionException {
        try {
            // InternalCsvMan.g:179:1: ( ruleUpdate EOF )
            // InternalCsvMan.g:180:1: ruleUpdate EOF
            {
             before(grammarAccess.getUpdateRule()); 
            pushFollow(FOLLOW_1);
            ruleUpdate();

            state._fsp--;

             after(grammarAccess.getUpdateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUpdate"


    // $ANTLR start "ruleUpdate"
    // InternalCsvMan.g:187:1: ruleUpdate : ( ( rule__Update__Group__0 ) ) ;
    public final void ruleUpdate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:191:2: ( ( ( rule__Update__Group__0 ) ) )
            // InternalCsvMan.g:192:2: ( ( rule__Update__Group__0 ) )
            {
            // InternalCsvMan.g:192:2: ( ( rule__Update__Group__0 ) )
            // InternalCsvMan.g:193:3: ( rule__Update__Group__0 )
            {
             before(grammarAccess.getUpdateAccess().getGroup()); 
            // InternalCsvMan.g:194:3: ( rule__Update__Group__0 )
            // InternalCsvMan.g:194:4: rule__Update__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Update__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUpdateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUpdate"


    // $ANTLR start "entryRuleAdd"
    // InternalCsvMan.g:203:1: entryRuleAdd : ruleAdd EOF ;
    public final void entryRuleAdd() throws RecognitionException {
        try {
            // InternalCsvMan.g:204:1: ( ruleAdd EOF )
            // InternalCsvMan.g:205:1: ruleAdd EOF
            {
             before(grammarAccess.getAddRule()); 
            pushFollow(FOLLOW_1);
            ruleAdd();

            state._fsp--;

             after(grammarAccess.getAddRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAdd"


    // $ANTLR start "ruleAdd"
    // InternalCsvMan.g:212:1: ruleAdd : ( ( rule__Add__Group__0 ) ) ;
    public final void ruleAdd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:216:2: ( ( ( rule__Add__Group__0 ) ) )
            // InternalCsvMan.g:217:2: ( ( rule__Add__Group__0 ) )
            {
            // InternalCsvMan.g:217:2: ( ( rule__Add__Group__0 ) )
            // InternalCsvMan.g:218:3: ( rule__Add__Group__0 )
            {
             before(grammarAccess.getAddAccess().getGroup()); 
            // InternalCsvMan.g:219:3: ( rule__Add__Group__0 )
            // InternalCsvMan.g:219:4: rule__Add__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Add__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAddAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAdd"


    // $ANTLR start "entryRuleJoin"
    // InternalCsvMan.g:228:1: entryRuleJoin : ruleJoin EOF ;
    public final void entryRuleJoin() throws RecognitionException {
        try {
            // InternalCsvMan.g:229:1: ( ruleJoin EOF )
            // InternalCsvMan.g:230:1: ruleJoin EOF
            {
             before(grammarAccess.getJoinRule()); 
            pushFollow(FOLLOW_1);
            ruleJoin();

            state._fsp--;

             after(grammarAccess.getJoinRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJoin"


    // $ANTLR start "ruleJoin"
    // InternalCsvMan.g:237:1: ruleJoin : ( ( rule__Join__Group__0 ) ) ;
    public final void ruleJoin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:241:2: ( ( ( rule__Join__Group__0 ) ) )
            // InternalCsvMan.g:242:2: ( ( rule__Join__Group__0 ) )
            {
            // InternalCsvMan.g:242:2: ( ( rule__Join__Group__0 ) )
            // InternalCsvMan.g:243:3: ( rule__Join__Group__0 )
            {
             before(grammarAccess.getJoinAccess().getGroup()); 
            // InternalCsvMan.g:244:3: ( rule__Join__Group__0 )
            // InternalCsvMan.g:244:4: rule__Join__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Join__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJoinAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJoin"


    // $ANTLR start "entryRuleDelete"
    // InternalCsvMan.g:253:1: entryRuleDelete : ruleDelete EOF ;
    public final void entryRuleDelete() throws RecognitionException {
        try {
            // InternalCsvMan.g:254:1: ( ruleDelete EOF )
            // InternalCsvMan.g:255:1: ruleDelete EOF
            {
             before(grammarAccess.getDeleteRule()); 
            pushFollow(FOLLOW_1);
            ruleDelete();

            state._fsp--;

             after(grammarAccess.getDeleteRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDelete"


    // $ANTLR start "ruleDelete"
    // InternalCsvMan.g:262:1: ruleDelete : ( ( rule__Delete__Group__0 ) ) ;
    public final void ruleDelete() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:266:2: ( ( ( rule__Delete__Group__0 ) ) )
            // InternalCsvMan.g:267:2: ( ( rule__Delete__Group__0 ) )
            {
            // InternalCsvMan.g:267:2: ( ( rule__Delete__Group__0 ) )
            // InternalCsvMan.g:268:3: ( rule__Delete__Group__0 )
            {
             before(grammarAccess.getDeleteAccess().getGroup()); 
            // InternalCsvMan.g:269:3: ( rule__Delete__Group__0 )
            // InternalCsvMan.g:269:4: rule__Delete__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Delete__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeleteAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDelete"


    // $ANTLR start "entryRuleExit"
    // InternalCsvMan.g:278:1: entryRuleExit : ruleExit EOF ;
    public final void entryRuleExit() throws RecognitionException {
        try {
            // InternalCsvMan.g:279:1: ( ruleExit EOF )
            // InternalCsvMan.g:280:1: ruleExit EOF
            {
             before(grammarAccess.getExitRule()); 
            pushFollow(FOLLOW_1);
            ruleExit();

            state._fsp--;

             after(grammarAccess.getExitRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExit"


    // $ANTLR start "ruleExit"
    // InternalCsvMan.g:287:1: ruleExit : ( ( rule__Exit__Group__0 ) ) ;
    public final void ruleExit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:291:2: ( ( ( rule__Exit__Group__0 ) ) )
            // InternalCsvMan.g:292:2: ( ( rule__Exit__Group__0 ) )
            {
            // InternalCsvMan.g:292:2: ( ( rule__Exit__Group__0 ) )
            // InternalCsvMan.g:293:3: ( rule__Exit__Group__0 )
            {
             before(grammarAccess.getExitAccess().getGroup()); 
            // InternalCsvMan.g:294:3: ( rule__Exit__Group__0 )
            // InternalCsvMan.g:294:4: rule__Exit__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Exit__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExitAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExit"


    // $ANTLR start "entryRuleWhere"
    // InternalCsvMan.g:303:1: entryRuleWhere : ruleWhere EOF ;
    public final void entryRuleWhere() throws RecognitionException {
        try {
            // InternalCsvMan.g:304:1: ( ruleWhere EOF )
            // InternalCsvMan.g:305:1: ruleWhere EOF
            {
             before(grammarAccess.getWhereRule()); 
            pushFollow(FOLLOW_1);
            ruleWhere();

            state._fsp--;

             after(grammarAccess.getWhereRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWhere"


    // $ANTLR start "ruleWhere"
    // InternalCsvMan.g:312:1: ruleWhere : ( ( rule__Where__Group__0 ) ) ;
    public final void ruleWhere() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:316:2: ( ( ( rule__Where__Group__0 ) ) )
            // InternalCsvMan.g:317:2: ( ( rule__Where__Group__0 ) )
            {
            // InternalCsvMan.g:317:2: ( ( rule__Where__Group__0 ) )
            // InternalCsvMan.g:318:3: ( rule__Where__Group__0 )
            {
             before(grammarAccess.getWhereAccess().getGroup()); 
            // InternalCsvMan.g:319:3: ( rule__Where__Group__0 )
            // InternalCsvMan.g:319:4: rule__Where__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Where__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWhereAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWhere"


    // $ANTLR start "entryRuleCondition"
    // InternalCsvMan.g:328:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalCsvMan.g:329:1: ( ruleCondition EOF )
            // InternalCsvMan.g:330:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalCsvMan.g:337:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:341:2: ( ( ( rule__Condition__Group__0 ) ) )
            // InternalCsvMan.g:342:2: ( ( rule__Condition__Group__0 ) )
            {
            // InternalCsvMan.g:342:2: ( ( rule__Condition__Group__0 ) )
            // InternalCsvMan.g:343:3: ( rule__Condition__Group__0 )
            {
             before(grammarAccess.getConditionAccess().getGroup()); 
            // InternalCsvMan.g:344:3: ( rule__Condition__Group__0 )
            // InternalCsvMan.g:344:4: rule__Condition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleEString"
    // InternalCsvMan.g:353:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalCsvMan.g:354:1: ( ruleEString EOF )
            // InternalCsvMan.g:355:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalCsvMan.g:362:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:366:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalCsvMan.g:367:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalCsvMan.g:367:2: ( ( rule__EString__Alternatives ) )
            // InternalCsvMan.g:368:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalCsvMan.g:369:3: ( rule__EString__Alternatives )
            // InternalCsvMan.g:369:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "rule__Instruction__Alternatives"
    // InternalCsvMan.g:377:1: rule__Instruction__Alternatives : ( ( ruleCreate ) | ( ruleLoad ) | ( ruleShow ) | ( ruleUpdate ) | ( ruleAdd ) | ( ruleJoin ) | ( ruleDelete ) | ( ruleExit ) );
    public final void rule__Instruction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:381:1: ( ( ruleCreate ) | ( ruleLoad ) | ( ruleShow ) | ( ruleUpdate ) | ( ruleAdd ) | ( ruleJoin ) | ( ruleDelete ) | ( ruleExit ) )
            int alt1=8;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt1=1;
                }
                break;
            case 15:
                {
                alt1=2;
                }
                break;
            case 16:
                {
                alt1=3;
                }
                break;
            case 17:
                {
                alt1=4;
                }
                break;
            case 19:
                {
                alt1=5;
                }
                break;
            case 21:
                {
                alt1=6;
                }
                break;
            case 22:
                {
                alt1=7;
                }
                break;
            case 23:
                {
                alt1=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalCsvMan.g:382:2: ( ruleCreate )
                    {
                    // InternalCsvMan.g:382:2: ( ruleCreate )
                    // InternalCsvMan.g:383:3: ruleCreate
                    {
                     before(grammarAccess.getInstructionAccess().getCreateParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCreate();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getCreateParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCsvMan.g:388:2: ( ruleLoad )
                    {
                    // InternalCsvMan.g:388:2: ( ruleLoad )
                    // InternalCsvMan.g:389:3: ruleLoad
                    {
                     before(grammarAccess.getInstructionAccess().getLoadParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLoad();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getLoadParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCsvMan.g:394:2: ( ruleShow )
                    {
                    // InternalCsvMan.g:394:2: ( ruleShow )
                    // InternalCsvMan.g:395:3: ruleShow
                    {
                     before(grammarAccess.getInstructionAccess().getShowParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleShow();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getShowParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCsvMan.g:400:2: ( ruleUpdate )
                    {
                    // InternalCsvMan.g:400:2: ( ruleUpdate )
                    // InternalCsvMan.g:401:3: ruleUpdate
                    {
                     before(grammarAccess.getInstructionAccess().getUpdateParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleUpdate();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getUpdateParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCsvMan.g:406:2: ( ruleAdd )
                    {
                    // InternalCsvMan.g:406:2: ( ruleAdd )
                    // InternalCsvMan.g:407:3: ruleAdd
                    {
                     before(grammarAccess.getInstructionAccess().getAddParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleAdd();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getAddParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalCsvMan.g:412:2: ( ruleJoin )
                    {
                    // InternalCsvMan.g:412:2: ( ruleJoin )
                    // InternalCsvMan.g:413:3: ruleJoin
                    {
                     before(grammarAccess.getInstructionAccess().getJoinParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleJoin();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getJoinParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalCsvMan.g:418:2: ( ruleDelete )
                    {
                    // InternalCsvMan.g:418:2: ( ruleDelete )
                    // InternalCsvMan.g:419:3: ruleDelete
                    {
                     before(grammarAccess.getInstructionAccess().getDeleteParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleDelete();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getDeleteParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalCsvMan.g:424:2: ( ruleExit )
                    {
                    // InternalCsvMan.g:424:2: ( ruleExit )
                    // InternalCsvMan.g:425:3: ruleExit
                    {
                     before(grammarAccess.getInstructionAccess().getExitParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleExit();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getExitParserRuleCall_7()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalCsvMan.g:434:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:438:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalCsvMan.g:439:2: ( RULE_STRING )
                    {
                    // InternalCsvMan.g:439:2: ( RULE_STRING )
                    // InternalCsvMan.g:440:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCsvMan.g:445:2: ( RULE_ID )
                    {
                    // InternalCsvMan.g:445:2: ( RULE_ID )
                    // InternalCsvMan.g:446:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Program__Group__0"
    // InternalCsvMan.g:455:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:459:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalCsvMan.g:460:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Program__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0"


    // $ANTLR start "rule__Program__Group__0__Impl"
    // InternalCsvMan.g:467:1: rule__Program__Group__0__Impl : ( () ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:471:1: ( ( () ) )
            // InternalCsvMan.g:472:1: ( () )
            {
            // InternalCsvMan.g:472:1: ( () )
            // InternalCsvMan.g:473:2: ()
            {
             before(grammarAccess.getProgramAccess().getProgramAction_0()); 
            // InternalCsvMan.g:474:2: ()
            // InternalCsvMan.g:474:3: 
            {
            }

             after(grammarAccess.getProgramAccess().getProgramAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0__Impl"


    // $ANTLR start "rule__Program__Group__1"
    // InternalCsvMan.g:482:1: rule__Program__Group__1 : rule__Program__Group__1__Impl ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:486:1: ( rule__Program__Group__1__Impl )
            // InternalCsvMan.g:487:2: rule__Program__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1"


    // $ANTLR start "rule__Program__Group__1__Impl"
    // InternalCsvMan.g:493:1: rule__Program__Group__1__Impl : ( ( rule__Program__InstructionAssignment_1 )* ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:497:1: ( ( ( rule__Program__InstructionAssignment_1 )* ) )
            // InternalCsvMan.g:498:1: ( ( rule__Program__InstructionAssignment_1 )* )
            {
            // InternalCsvMan.g:498:1: ( ( rule__Program__InstructionAssignment_1 )* )
            // InternalCsvMan.g:499:2: ( rule__Program__InstructionAssignment_1 )*
            {
             before(grammarAccess.getProgramAccess().getInstructionAssignment_1()); 
            // InternalCsvMan.g:500:2: ( rule__Program__InstructionAssignment_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13||(LA3_0>=15 && LA3_0<=17)||LA3_0==19||(LA3_0>=21 && LA3_0<=23)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCsvMan.g:500:3: rule__Program__InstructionAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Program__InstructionAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getInstructionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1__Impl"


    // $ANTLR start "rule__Create__Group__0"
    // InternalCsvMan.g:509:1: rule__Create__Group__0 : rule__Create__Group__0__Impl rule__Create__Group__1 ;
    public final void rule__Create__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:513:1: ( rule__Create__Group__0__Impl rule__Create__Group__1 )
            // InternalCsvMan.g:514:2: rule__Create__Group__0__Impl rule__Create__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Create__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Create__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Create__Group__0"


    // $ANTLR start "rule__Create__Group__0__Impl"
    // InternalCsvMan.g:521:1: rule__Create__Group__0__Impl : ( () ) ;
    public final void rule__Create__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:525:1: ( ( () ) )
            // InternalCsvMan.g:526:1: ( () )
            {
            // InternalCsvMan.g:526:1: ( () )
            // InternalCsvMan.g:527:2: ()
            {
             before(grammarAccess.getCreateAccess().getCreateAction_0()); 
            // InternalCsvMan.g:528:2: ()
            // InternalCsvMan.g:528:3: 
            {
            }

             after(grammarAccess.getCreateAccess().getCreateAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Create__Group__0__Impl"


    // $ANTLR start "rule__Create__Group__1"
    // InternalCsvMan.g:536:1: rule__Create__Group__1 : rule__Create__Group__1__Impl rule__Create__Group__2 ;
    public final void rule__Create__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:540:1: ( rule__Create__Group__1__Impl rule__Create__Group__2 )
            // InternalCsvMan.g:541:2: rule__Create__Group__1__Impl rule__Create__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Create__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Create__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Create__Group__1"


    // $ANTLR start "rule__Create__Group__1__Impl"
    // InternalCsvMan.g:548:1: rule__Create__Group__1__Impl : ( 'create' ) ;
    public final void rule__Create__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:552:1: ( ( 'create' ) )
            // InternalCsvMan.g:553:1: ( 'create' )
            {
            // InternalCsvMan.g:553:1: ( 'create' )
            // InternalCsvMan.g:554:2: 'create'
            {
             before(grammarAccess.getCreateAccess().getCreateKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getCreateAccess().getCreateKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Create__Group__1__Impl"


    // $ANTLR start "rule__Create__Group__2"
    // InternalCsvMan.g:563:1: rule__Create__Group__2 : rule__Create__Group__2__Impl rule__Create__Group__3 ;
    public final void rule__Create__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:567:1: ( rule__Create__Group__2__Impl rule__Create__Group__3 )
            // InternalCsvMan.g:568:2: rule__Create__Group__2__Impl rule__Create__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Create__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Create__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Create__Group__2"


    // $ANTLR start "rule__Create__Group__2__Impl"
    // InternalCsvMan.g:575:1: rule__Create__Group__2__Impl : ( ( rule__Create__TableAssignment_2 ) ) ;
    public final void rule__Create__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:579:1: ( ( ( rule__Create__TableAssignment_2 ) ) )
            // InternalCsvMan.g:580:1: ( ( rule__Create__TableAssignment_2 ) )
            {
            // InternalCsvMan.g:580:1: ( ( rule__Create__TableAssignment_2 ) )
            // InternalCsvMan.g:581:2: ( rule__Create__TableAssignment_2 )
            {
             before(grammarAccess.getCreateAccess().getTableAssignment_2()); 
            // InternalCsvMan.g:582:2: ( rule__Create__TableAssignment_2 )
            // InternalCsvMan.g:582:3: rule__Create__TableAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Create__TableAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCreateAccess().getTableAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Create__Group__2__Impl"


    // $ANTLR start "rule__Create__Group__3"
    // InternalCsvMan.g:590:1: rule__Create__Group__3 : rule__Create__Group__3__Impl rule__Create__Group__4 ;
    public final void rule__Create__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:594:1: ( rule__Create__Group__3__Impl rule__Create__Group__4 )
            // InternalCsvMan.g:595:2: rule__Create__Group__3__Impl rule__Create__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Create__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Create__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Create__Group__3"


    // $ANTLR start "rule__Create__Group__3__Impl"
    // InternalCsvMan.g:602:1: rule__Create__Group__3__Impl : ( 'as' ) ;
    public final void rule__Create__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:606:1: ( ( 'as' ) )
            // InternalCsvMan.g:607:1: ( 'as' )
            {
            // InternalCsvMan.g:607:1: ( 'as' )
            // InternalCsvMan.g:608:2: 'as'
            {
             before(grammarAccess.getCreateAccess().getAsKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getCreateAccess().getAsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Create__Group__3__Impl"


    // $ANTLR start "rule__Create__Group__4"
    // InternalCsvMan.g:617:1: rule__Create__Group__4 : rule__Create__Group__4__Impl rule__Create__Group__5 ;
    public final void rule__Create__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:621:1: ( rule__Create__Group__4__Impl rule__Create__Group__5 )
            // InternalCsvMan.g:622:2: rule__Create__Group__4__Impl rule__Create__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Create__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Create__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Create__Group__4"


    // $ANTLR start "rule__Create__Group__4__Impl"
    // InternalCsvMan.g:629:1: rule__Create__Group__4__Impl : ( ( rule__Create__AliasAssignment_4 ) ) ;
    public final void rule__Create__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:633:1: ( ( ( rule__Create__AliasAssignment_4 ) ) )
            // InternalCsvMan.g:634:1: ( ( rule__Create__AliasAssignment_4 ) )
            {
            // InternalCsvMan.g:634:1: ( ( rule__Create__AliasAssignment_4 ) )
            // InternalCsvMan.g:635:2: ( rule__Create__AliasAssignment_4 )
            {
             before(grammarAccess.getCreateAccess().getAliasAssignment_4()); 
            // InternalCsvMan.g:636:2: ( rule__Create__AliasAssignment_4 )
            // InternalCsvMan.g:636:3: rule__Create__AliasAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Create__AliasAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCreateAccess().getAliasAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Create__Group__4__Impl"


    // $ANTLR start "rule__Create__Group__5"
    // InternalCsvMan.g:644:1: rule__Create__Group__5 : rule__Create__Group__5__Impl ;
    public final void rule__Create__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:648:1: ( rule__Create__Group__5__Impl )
            // InternalCsvMan.g:649:2: rule__Create__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Create__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Create__Group__5"


    // $ANTLR start "rule__Create__Group__5__Impl"
    // InternalCsvMan.g:655:1: rule__Create__Group__5__Impl : ( RULE_NL ) ;
    public final void rule__Create__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:659:1: ( ( RULE_NL ) )
            // InternalCsvMan.g:660:1: ( RULE_NL )
            {
            // InternalCsvMan.g:660:1: ( RULE_NL )
            // InternalCsvMan.g:661:2: RULE_NL
            {
             before(grammarAccess.getCreateAccess().getNLTerminalRuleCall_5()); 
            match(input,RULE_NL,FOLLOW_2); 
             after(grammarAccess.getCreateAccess().getNLTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Create__Group__5__Impl"


    // $ANTLR start "rule__Load__Group__0"
    // InternalCsvMan.g:671:1: rule__Load__Group__0 : rule__Load__Group__0__Impl rule__Load__Group__1 ;
    public final void rule__Load__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:675:1: ( rule__Load__Group__0__Impl rule__Load__Group__1 )
            // InternalCsvMan.g:676:2: rule__Load__Group__0__Impl rule__Load__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Load__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Load__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Load__Group__0"


    // $ANTLR start "rule__Load__Group__0__Impl"
    // InternalCsvMan.g:683:1: rule__Load__Group__0__Impl : ( () ) ;
    public final void rule__Load__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:687:1: ( ( () ) )
            // InternalCsvMan.g:688:1: ( () )
            {
            // InternalCsvMan.g:688:1: ( () )
            // InternalCsvMan.g:689:2: ()
            {
             before(grammarAccess.getLoadAccess().getLoadAction_0()); 
            // InternalCsvMan.g:690:2: ()
            // InternalCsvMan.g:690:3: 
            {
            }

             after(grammarAccess.getLoadAccess().getLoadAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Load__Group__0__Impl"


    // $ANTLR start "rule__Load__Group__1"
    // InternalCsvMan.g:698:1: rule__Load__Group__1 : rule__Load__Group__1__Impl rule__Load__Group__2 ;
    public final void rule__Load__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:702:1: ( rule__Load__Group__1__Impl rule__Load__Group__2 )
            // InternalCsvMan.g:703:2: rule__Load__Group__1__Impl rule__Load__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Load__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Load__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Load__Group__1"


    // $ANTLR start "rule__Load__Group__1__Impl"
    // InternalCsvMan.g:710:1: rule__Load__Group__1__Impl : ( 'load' ) ;
    public final void rule__Load__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:714:1: ( ( 'load' ) )
            // InternalCsvMan.g:715:1: ( 'load' )
            {
            // InternalCsvMan.g:715:1: ( 'load' )
            // InternalCsvMan.g:716:2: 'load'
            {
             before(grammarAccess.getLoadAccess().getLoadKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getLoadAccess().getLoadKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Load__Group__1__Impl"


    // $ANTLR start "rule__Load__Group__2"
    // InternalCsvMan.g:725:1: rule__Load__Group__2 : rule__Load__Group__2__Impl rule__Load__Group__3 ;
    public final void rule__Load__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:729:1: ( rule__Load__Group__2__Impl rule__Load__Group__3 )
            // InternalCsvMan.g:730:2: rule__Load__Group__2__Impl rule__Load__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Load__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Load__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Load__Group__2"


    // $ANTLR start "rule__Load__Group__2__Impl"
    // InternalCsvMan.g:737:1: rule__Load__Group__2__Impl : ( ( rule__Load__TableAssignment_2 ) ) ;
    public final void rule__Load__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:741:1: ( ( ( rule__Load__TableAssignment_2 ) ) )
            // InternalCsvMan.g:742:1: ( ( rule__Load__TableAssignment_2 ) )
            {
            // InternalCsvMan.g:742:1: ( ( rule__Load__TableAssignment_2 ) )
            // InternalCsvMan.g:743:2: ( rule__Load__TableAssignment_2 )
            {
             before(grammarAccess.getLoadAccess().getTableAssignment_2()); 
            // InternalCsvMan.g:744:2: ( rule__Load__TableAssignment_2 )
            // InternalCsvMan.g:744:3: rule__Load__TableAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Load__TableAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLoadAccess().getTableAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Load__Group__2__Impl"


    // $ANTLR start "rule__Load__Group__3"
    // InternalCsvMan.g:752:1: rule__Load__Group__3 : rule__Load__Group__3__Impl rule__Load__Group__4 ;
    public final void rule__Load__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:756:1: ( rule__Load__Group__3__Impl rule__Load__Group__4 )
            // InternalCsvMan.g:757:2: rule__Load__Group__3__Impl rule__Load__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Load__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Load__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Load__Group__3"


    // $ANTLR start "rule__Load__Group__3__Impl"
    // InternalCsvMan.g:764:1: rule__Load__Group__3__Impl : ( 'as' ) ;
    public final void rule__Load__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:768:1: ( ( 'as' ) )
            // InternalCsvMan.g:769:1: ( 'as' )
            {
            // InternalCsvMan.g:769:1: ( 'as' )
            // InternalCsvMan.g:770:2: 'as'
            {
             before(grammarAccess.getLoadAccess().getAsKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getLoadAccess().getAsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Load__Group__3__Impl"


    // $ANTLR start "rule__Load__Group__4"
    // InternalCsvMan.g:779:1: rule__Load__Group__4 : rule__Load__Group__4__Impl rule__Load__Group__5 ;
    public final void rule__Load__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:783:1: ( rule__Load__Group__4__Impl rule__Load__Group__5 )
            // InternalCsvMan.g:784:2: rule__Load__Group__4__Impl rule__Load__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Load__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Load__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Load__Group__4"


    // $ANTLR start "rule__Load__Group__4__Impl"
    // InternalCsvMan.g:791:1: rule__Load__Group__4__Impl : ( ( rule__Load__AliasAssignment_4 ) ) ;
    public final void rule__Load__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:795:1: ( ( ( rule__Load__AliasAssignment_4 ) ) )
            // InternalCsvMan.g:796:1: ( ( rule__Load__AliasAssignment_4 ) )
            {
            // InternalCsvMan.g:796:1: ( ( rule__Load__AliasAssignment_4 ) )
            // InternalCsvMan.g:797:2: ( rule__Load__AliasAssignment_4 )
            {
             before(grammarAccess.getLoadAccess().getAliasAssignment_4()); 
            // InternalCsvMan.g:798:2: ( rule__Load__AliasAssignment_4 )
            // InternalCsvMan.g:798:3: rule__Load__AliasAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Load__AliasAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLoadAccess().getAliasAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Load__Group__4__Impl"


    // $ANTLR start "rule__Load__Group__5"
    // InternalCsvMan.g:806:1: rule__Load__Group__5 : rule__Load__Group__5__Impl ;
    public final void rule__Load__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:810:1: ( rule__Load__Group__5__Impl )
            // InternalCsvMan.g:811:2: rule__Load__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Load__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Load__Group__5"


    // $ANTLR start "rule__Load__Group__5__Impl"
    // InternalCsvMan.g:817:1: rule__Load__Group__5__Impl : ( RULE_NL ) ;
    public final void rule__Load__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:821:1: ( ( RULE_NL ) )
            // InternalCsvMan.g:822:1: ( RULE_NL )
            {
            // InternalCsvMan.g:822:1: ( RULE_NL )
            // InternalCsvMan.g:823:2: RULE_NL
            {
             before(grammarAccess.getLoadAccess().getNLTerminalRuleCall_5()); 
            match(input,RULE_NL,FOLLOW_2); 
             after(grammarAccess.getLoadAccess().getNLTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Load__Group__5__Impl"


    // $ANTLR start "rule__Show__Group__0"
    // InternalCsvMan.g:833:1: rule__Show__Group__0 : rule__Show__Group__0__Impl rule__Show__Group__1 ;
    public final void rule__Show__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:837:1: ( rule__Show__Group__0__Impl rule__Show__Group__1 )
            // InternalCsvMan.g:838:2: rule__Show__Group__0__Impl rule__Show__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Show__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Show__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Show__Group__0"


    // $ANTLR start "rule__Show__Group__0__Impl"
    // InternalCsvMan.g:845:1: rule__Show__Group__0__Impl : ( () ) ;
    public final void rule__Show__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:849:1: ( ( () ) )
            // InternalCsvMan.g:850:1: ( () )
            {
            // InternalCsvMan.g:850:1: ( () )
            // InternalCsvMan.g:851:2: ()
            {
             before(grammarAccess.getShowAccess().getShowAction_0()); 
            // InternalCsvMan.g:852:2: ()
            // InternalCsvMan.g:852:3: 
            {
            }

             after(grammarAccess.getShowAccess().getShowAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Show__Group__0__Impl"


    // $ANTLR start "rule__Show__Group__1"
    // InternalCsvMan.g:860:1: rule__Show__Group__1 : rule__Show__Group__1__Impl rule__Show__Group__2 ;
    public final void rule__Show__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:864:1: ( rule__Show__Group__1__Impl rule__Show__Group__2 )
            // InternalCsvMan.g:865:2: rule__Show__Group__1__Impl rule__Show__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Show__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Show__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Show__Group__1"


    // $ANTLR start "rule__Show__Group__1__Impl"
    // InternalCsvMan.g:872:1: rule__Show__Group__1__Impl : ( 'show' ) ;
    public final void rule__Show__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:876:1: ( ( 'show' ) )
            // InternalCsvMan.g:877:1: ( 'show' )
            {
            // InternalCsvMan.g:877:1: ( 'show' )
            // InternalCsvMan.g:878:2: 'show'
            {
             before(grammarAccess.getShowAccess().getShowKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getShowAccess().getShowKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Show__Group__1__Impl"


    // $ANTLR start "rule__Show__Group__2"
    // InternalCsvMan.g:887:1: rule__Show__Group__2 : rule__Show__Group__2__Impl rule__Show__Group__3 ;
    public final void rule__Show__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:891:1: ( rule__Show__Group__2__Impl rule__Show__Group__3 )
            // InternalCsvMan.g:892:2: rule__Show__Group__2__Impl rule__Show__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Show__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Show__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Show__Group__2"


    // $ANTLR start "rule__Show__Group__2__Impl"
    // InternalCsvMan.g:899:1: rule__Show__Group__2__Impl : ( ( rule__Show__TableAssignment_2 ) ) ;
    public final void rule__Show__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:903:1: ( ( ( rule__Show__TableAssignment_2 ) ) )
            // InternalCsvMan.g:904:1: ( ( rule__Show__TableAssignment_2 ) )
            {
            // InternalCsvMan.g:904:1: ( ( rule__Show__TableAssignment_2 ) )
            // InternalCsvMan.g:905:2: ( rule__Show__TableAssignment_2 )
            {
             before(grammarAccess.getShowAccess().getTableAssignment_2()); 
            // InternalCsvMan.g:906:2: ( rule__Show__TableAssignment_2 )
            // InternalCsvMan.g:906:3: rule__Show__TableAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Show__TableAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getShowAccess().getTableAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Show__Group__2__Impl"


    // $ANTLR start "rule__Show__Group__3"
    // InternalCsvMan.g:914:1: rule__Show__Group__3 : rule__Show__Group__3__Impl rule__Show__Group__4 ;
    public final void rule__Show__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:918:1: ( rule__Show__Group__3__Impl rule__Show__Group__4 )
            // InternalCsvMan.g:919:2: rule__Show__Group__3__Impl rule__Show__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Show__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Show__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Show__Group__3"


    // $ANTLR start "rule__Show__Group__3__Impl"
    // InternalCsvMan.g:926:1: rule__Show__Group__3__Impl : ( ( rule__Show__WhereAssignment_3 )? ) ;
    public final void rule__Show__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:930:1: ( ( ( rule__Show__WhereAssignment_3 )? ) )
            // InternalCsvMan.g:931:1: ( ( rule__Show__WhereAssignment_3 )? )
            {
            // InternalCsvMan.g:931:1: ( ( rule__Show__WhereAssignment_3 )? )
            // InternalCsvMan.g:932:2: ( rule__Show__WhereAssignment_3 )?
            {
             before(grammarAccess.getShowAccess().getWhereAssignment_3()); 
            // InternalCsvMan.g:933:2: ( rule__Show__WhereAssignment_3 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==24) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalCsvMan.g:933:3: rule__Show__WhereAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Show__WhereAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getShowAccess().getWhereAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Show__Group__3__Impl"


    // $ANTLR start "rule__Show__Group__4"
    // InternalCsvMan.g:941:1: rule__Show__Group__4 : rule__Show__Group__4__Impl ;
    public final void rule__Show__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:945:1: ( rule__Show__Group__4__Impl )
            // InternalCsvMan.g:946:2: rule__Show__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Show__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Show__Group__4"


    // $ANTLR start "rule__Show__Group__4__Impl"
    // InternalCsvMan.g:952:1: rule__Show__Group__4__Impl : ( RULE_NL ) ;
    public final void rule__Show__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:956:1: ( ( RULE_NL ) )
            // InternalCsvMan.g:957:1: ( RULE_NL )
            {
            // InternalCsvMan.g:957:1: ( RULE_NL )
            // InternalCsvMan.g:958:2: RULE_NL
            {
             before(grammarAccess.getShowAccess().getNLTerminalRuleCall_4()); 
            match(input,RULE_NL,FOLLOW_2); 
             after(grammarAccess.getShowAccess().getNLTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Show__Group__4__Impl"


    // $ANTLR start "rule__Update__Group__0"
    // InternalCsvMan.g:968:1: rule__Update__Group__0 : rule__Update__Group__0__Impl rule__Update__Group__1 ;
    public final void rule__Update__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:972:1: ( rule__Update__Group__0__Impl rule__Update__Group__1 )
            // InternalCsvMan.g:973:2: rule__Update__Group__0__Impl rule__Update__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Update__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Update__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Update__Group__0"


    // $ANTLR start "rule__Update__Group__0__Impl"
    // InternalCsvMan.g:980:1: rule__Update__Group__0__Impl : ( () ) ;
    public final void rule__Update__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:984:1: ( ( () ) )
            // InternalCsvMan.g:985:1: ( () )
            {
            // InternalCsvMan.g:985:1: ( () )
            // InternalCsvMan.g:986:2: ()
            {
             before(grammarAccess.getUpdateAccess().getUpdateAction_0()); 
            // InternalCsvMan.g:987:2: ()
            // InternalCsvMan.g:987:3: 
            {
            }

             after(grammarAccess.getUpdateAccess().getUpdateAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Update__Group__0__Impl"


    // $ANTLR start "rule__Update__Group__1"
    // InternalCsvMan.g:995:1: rule__Update__Group__1 : rule__Update__Group__1__Impl rule__Update__Group__2 ;
    public final void rule__Update__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:999:1: ( rule__Update__Group__1__Impl rule__Update__Group__2 )
            // InternalCsvMan.g:1000:2: rule__Update__Group__1__Impl rule__Update__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Update__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Update__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Update__Group__1"


    // $ANTLR start "rule__Update__Group__1__Impl"
    // InternalCsvMan.g:1007:1: rule__Update__Group__1__Impl : ( 'update' ) ;
    public final void rule__Update__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1011:1: ( ( 'update' ) )
            // InternalCsvMan.g:1012:1: ( 'update' )
            {
            // InternalCsvMan.g:1012:1: ( 'update' )
            // InternalCsvMan.g:1013:2: 'update'
            {
             before(grammarAccess.getUpdateAccess().getUpdateKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getUpdateAccess().getUpdateKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Update__Group__1__Impl"


    // $ANTLR start "rule__Update__Group__2"
    // InternalCsvMan.g:1022:1: rule__Update__Group__2 : rule__Update__Group__2__Impl rule__Update__Group__3 ;
    public final void rule__Update__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1026:1: ( rule__Update__Group__2__Impl rule__Update__Group__3 )
            // InternalCsvMan.g:1027:2: rule__Update__Group__2__Impl rule__Update__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Update__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Update__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Update__Group__2"


    // $ANTLR start "rule__Update__Group__2__Impl"
    // InternalCsvMan.g:1034:1: rule__Update__Group__2__Impl : ( ( rule__Update__TableAssignment_2 ) ) ;
    public final void rule__Update__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1038:1: ( ( ( rule__Update__TableAssignment_2 ) ) )
            // InternalCsvMan.g:1039:1: ( ( rule__Update__TableAssignment_2 ) )
            {
            // InternalCsvMan.g:1039:1: ( ( rule__Update__TableAssignment_2 ) )
            // InternalCsvMan.g:1040:2: ( rule__Update__TableAssignment_2 )
            {
             before(grammarAccess.getUpdateAccess().getTableAssignment_2()); 
            // InternalCsvMan.g:1041:2: ( rule__Update__TableAssignment_2 )
            // InternalCsvMan.g:1041:3: rule__Update__TableAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Update__TableAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUpdateAccess().getTableAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Update__Group__2__Impl"


    // $ANTLR start "rule__Update__Group__3"
    // InternalCsvMan.g:1049:1: rule__Update__Group__3 : rule__Update__Group__3__Impl rule__Update__Group__4 ;
    public final void rule__Update__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1053:1: ( rule__Update__Group__3__Impl rule__Update__Group__4 )
            // InternalCsvMan.g:1054:2: rule__Update__Group__3__Impl rule__Update__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Update__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Update__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Update__Group__3"


    // $ANTLR start "rule__Update__Group__3__Impl"
    // InternalCsvMan.g:1061:1: rule__Update__Group__3__Impl : ( 'set' ) ;
    public final void rule__Update__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1065:1: ( ( 'set' ) )
            // InternalCsvMan.g:1066:1: ( 'set' )
            {
            // InternalCsvMan.g:1066:1: ( 'set' )
            // InternalCsvMan.g:1067:2: 'set'
            {
             before(grammarAccess.getUpdateAccess().getSetKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getUpdateAccess().getSetKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Update__Group__3__Impl"


    // $ANTLR start "rule__Update__Group__4"
    // InternalCsvMan.g:1076:1: rule__Update__Group__4 : rule__Update__Group__4__Impl rule__Update__Group__5 ;
    public final void rule__Update__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1080:1: ( rule__Update__Group__4__Impl rule__Update__Group__5 )
            // InternalCsvMan.g:1081:2: rule__Update__Group__4__Impl rule__Update__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Update__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Update__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Update__Group__4"


    // $ANTLR start "rule__Update__Group__4__Impl"
    // InternalCsvMan.g:1088:1: rule__Update__Group__4__Impl : ( ( rule__Update__ParametersAssignment_4 ) ) ;
    public final void rule__Update__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1092:1: ( ( ( rule__Update__ParametersAssignment_4 ) ) )
            // InternalCsvMan.g:1093:1: ( ( rule__Update__ParametersAssignment_4 ) )
            {
            // InternalCsvMan.g:1093:1: ( ( rule__Update__ParametersAssignment_4 ) )
            // InternalCsvMan.g:1094:2: ( rule__Update__ParametersAssignment_4 )
            {
             before(grammarAccess.getUpdateAccess().getParametersAssignment_4()); 
            // InternalCsvMan.g:1095:2: ( rule__Update__ParametersAssignment_4 )
            // InternalCsvMan.g:1095:3: rule__Update__ParametersAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Update__ParametersAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getUpdateAccess().getParametersAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Update__Group__4__Impl"


    // $ANTLR start "rule__Update__Group__5"
    // InternalCsvMan.g:1103:1: rule__Update__Group__5 : rule__Update__Group__5__Impl rule__Update__Group__6 ;
    public final void rule__Update__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1107:1: ( rule__Update__Group__5__Impl rule__Update__Group__6 )
            // InternalCsvMan.g:1108:2: rule__Update__Group__5__Impl rule__Update__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__Update__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Update__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Update__Group__5"


    // $ANTLR start "rule__Update__Group__5__Impl"
    // InternalCsvMan.g:1115:1: rule__Update__Group__5__Impl : ( ( rule__Update__WhereAssignment_5 )? ) ;
    public final void rule__Update__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1119:1: ( ( ( rule__Update__WhereAssignment_5 )? ) )
            // InternalCsvMan.g:1120:1: ( ( rule__Update__WhereAssignment_5 )? )
            {
            // InternalCsvMan.g:1120:1: ( ( rule__Update__WhereAssignment_5 )? )
            // InternalCsvMan.g:1121:2: ( rule__Update__WhereAssignment_5 )?
            {
             before(grammarAccess.getUpdateAccess().getWhereAssignment_5()); 
            // InternalCsvMan.g:1122:2: ( rule__Update__WhereAssignment_5 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalCsvMan.g:1122:3: rule__Update__WhereAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Update__WhereAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUpdateAccess().getWhereAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Update__Group__5__Impl"


    // $ANTLR start "rule__Update__Group__6"
    // InternalCsvMan.g:1130:1: rule__Update__Group__6 : rule__Update__Group__6__Impl ;
    public final void rule__Update__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1134:1: ( rule__Update__Group__6__Impl )
            // InternalCsvMan.g:1135:2: rule__Update__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Update__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Update__Group__6"


    // $ANTLR start "rule__Update__Group__6__Impl"
    // InternalCsvMan.g:1141:1: rule__Update__Group__6__Impl : ( RULE_NL ) ;
    public final void rule__Update__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1145:1: ( ( RULE_NL ) )
            // InternalCsvMan.g:1146:1: ( RULE_NL )
            {
            // InternalCsvMan.g:1146:1: ( RULE_NL )
            // InternalCsvMan.g:1147:2: RULE_NL
            {
             before(grammarAccess.getUpdateAccess().getNLTerminalRuleCall_6()); 
            match(input,RULE_NL,FOLLOW_2); 
             after(grammarAccess.getUpdateAccess().getNLTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Update__Group__6__Impl"


    // $ANTLR start "rule__Add__Group__0"
    // InternalCsvMan.g:1157:1: rule__Add__Group__0 : rule__Add__Group__0__Impl rule__Add__Group__1 ;
    public final void rule__Add__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1161:1: ( rule__Add__Group__0__Impl rule__Add__Group__1 )
            // InternalCsvMan.g:1162:2: rule__Add__Group__0__Impl rule__Add__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Add__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Add__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__Group__0"


    // $ANTLR start "rule__Add__Group__0__Impl"
    // InternalCsvMan.g:1169:1: rule__Add__Group__0__Impl : ( () ) ;
    public final void rule__Add__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1173:1: ( ( () ) )
            // InternalCsvMan.g:1174:1: ( () )
            {
            // InternalCsvMan.g:1174:1: ( () )
            // InternalCsvMan.g:1175:2: ()
            {
             before(grammarAccess.getAddAccess().getAddAction_0()); 
            // InternalCsvMan.g:1176:2: ()
            // InternalCsvMan.g:1176:3: 
            {
            }

             after(grammarAccess.getAddAccess().getAddAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__Group__0__Impl"


    // $ANTLR start "rule__Add__Group__1"
    // InternalCsvMan.g:1184:1: rule__Add__Group__1 : rule__Add__Group__1__Impl rule__Add__Group__2 ;
    public final void rule__Add__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1188:1: ( rule__Add__Group__1__Impl rule__Add__Group__2 )
            // InternalCsvMan.g:1189:2: rule__Add__Group__1__Impl rule__Add__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Add__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Add__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__Group__1"


    // $ANTLR start "rule__Add__Group__1__Impl"
    // InternalCsvMan.g:1196:1: rule__Add__Group__1__Impl : ( 'add' ) ;
    public final void rule__Add__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1200:1: ( ( 'add' ) )
            // InternalCsvMan.g:1201:1: ( 'add' )
            {
            // InternalCsvMan.g:1201:1: ( 'add' )
            // InternalCsvMan.g:1202:2: 'add'
            {
             before(grammarAccess.getAddAccess().getAddKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAddAccess().getAddKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__Group__1__Impl"


    // $ANTLR start "rule__Add__Group__2"
    // InternalCsvMan.g:1211:1: rule__Add__Group__2 : rule__Add__Group__2__Impl rule__Add__Group__3 ;
    public final void rule__Add__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1215:1: ( rule__Add__Group__2__Impl rule__Add__Group__3 )
            // InternalCsvMan.g:1216:2: rule__Add__Group__2__Impl rule__Add__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Add__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Add__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__Group__2"


    // $ANTLR start "rule__Add__Group__2__Impl"
    // InternalCsvMan.g:1223:1: rule__Add__Group__2__Impl : ( ( rule__Add__TupleAssignment_2 ) ) ;
    public final void rule__Add__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1227:1: ( ( ( rule__Add__TupleAssignment_2 ) ) )
            // InternalCsvMan.g:1228:1: ( ( rule__Add__TupleAssignment_2 ) )
            {
            // InternalCsvMan.g:1228:1: ( ( rule__Add__TupleAssignment_2 ) )
            // InternalCsvMan.g:1229:2: ( rule__Add__TupleAssignment_2 )
            {
             before(grammarAccess.getAddAccess().getTupleAssignment_2()); 
            // InternalCsvMan.g:1230:2: ( rule__Add__TupleAssignment_2 )
            // InternalCsvMan.g:1230:3: rule__Add__TupleAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Add__TupleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAddAccess().getTupleAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__Group__2__Impl"


    // $ANTLR start "rule__Add__Group__3"
    // InternalCsvMan.g:1238:1: rule__Add__Group__3 : rule__Add__Group__3__Impl rule__Add__Group__4 ;
    public final void rule__Add__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1242:1: ( rule__Add__Group__3__Impl rule__Add__Group__4 )
            // InternalCsvMan.g:1243:2: rule__Add__Group__3__Impl rule__Add__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Add__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Add__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__Group__3"


    // $ANTLR start "rule__Add__Group__3__Impl"
    // InternalCsvMan.g:1250:1: rule__Add__Group__3__Impl : ( 'in' ) ;
    public final void rule__Add__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1254:1: ( ( 'in' ) )
            // InternalCsvMan.g:1255:1: ( 'in' )
            {
            // InternalCsvMan.g:1255:1: ( 'in' )
            // InternalCsvMan.g:1256:2: 'in'
            {
             before(grammarAccess.getAddAccess().getInKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAddAccess().getInKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__Group__3__Impl"


    // $ANTLR start "rule__Add__Group__4"
    // InternalCsvMan.g:1265:1: rule__Add__Group__4 : rule__Add__Group__4__Impl rule__Add__Group__5 ;
    public final void rule__Add__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1269:1: ( rule__Add__Group__4__Impl rule__Add__Group__5 )
            // InternalCsvMan.g:1270:2: rule__Add__Group__4__Impl rule__Add__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Add__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Add__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__Group__4"


    // $ANTLR start "rule__Add__Group__4__Impl"
    // InternalCsvMan.g:1277:1: rule__Add__Group__4__Impl : ( ( rule__Add__TableAssignment_4 ) ) ;
    public final void rule__Add__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1281:1: ( ( ( rule__Add__TableAssignment_4 ) ) )
            // InternalCsvMan.g:1282:1: ( ( rule__Add__TableAssignment_4 ) )
            {
            // InternalCsvMan.g:1282:1: ( ( rule__Add__TableAssignment_4 ) )
            // InternalCsvMan.g:1283:2: ( rule__Add__TableAssignment_4 )
            {
             before(grammarAccess.getAddAccess().getTableAssignment_4()); 
            // InternalCsvMan.g:1284:2: ( rule__Add__TableAssignment_4 )
            // InternalCsvMan.g:1284:3: rule__Add__TableAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Add__TableAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAddAccess().getTableAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__Group__4__Impl"


    // $ANTLR start "rule__Add__Group__5"
    // InternalCsvMan.g:1292:1: rule__Add__Group__5 : rule__Add__Group__5__Impl ;
    public final void rule__Add__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1296:1: ( rule__Add__Group__5__Impl )
            // InternalCsvMan.g:1297:2: rule__Add__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Add__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__Group__5"


    // $ANTLR start "rule__Add__Group__5__Impl"
    // InternalCsvMan.g:1303:1: rule__Add__Group__5__Impl : ( RULE_NL ) ;
    public final void rule__Add__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1307:1: ( ( RULE_NL ) )
            // InternalCsvMan.g:1308:1: ( RULE_NL )
            {
            // InternalCsvMan.g:1308:1: ( RULE_NL )
            // InternalCsvMan.g:1309:2: RULE_NL
            {
             before(grammarAccess.getAddAccess().getNLTerminalRuleCall_5()); 
            match(input,RULE_NL,FOLLOW_2); 
             after(grammarAccess.getAddAccess().getNLTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__Group__5__Impl"


    // $ANTLR start "rule__Join__Group__0"
    // InternalCsvMan.g:1319:1: rule__Join__Group__0 : rule__Join__Group__0__Impl rule__Join__Group__1 ;
    public final void rule__Join__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1323:1: ( rule__Join__Group__0__Impl rule__Join__Group__1 )
            // InternalCsvMan.g:1324:2: rule__Join__Group__0__Impl rule__Join__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Join__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Join__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Join__Group__0"


    // $ANTLR start "rule__Join__Group__0__Impl"
    // InternalCsvMan.g:1331:1: rule__Join__Group__0__Impl : ( () ) ;
    public final void rule__Join__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1335:1: ( ( () ) )
            // InternalCsvMan.g:1336:1: ( () )
            {
            // InternalCsvMan.g:1336:1: ( () )
            // InternalCsvMan.g:1337:2: ()
            {
             before(grammarAccess.getJoinAccess().getJoinAction_0()); 
            // InternalCsvMan.g:1338:2: ()
            // InternalCsvMan.g:1338:3: 
            {
            }

             after(grammarAccess.getJoinAccess().getJoinAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Join__Group__0__Impl"


    // $ANTLR start "rule__Join__Group__1"
    // InternalCsvMan.g:1346:1: rule__Join__Group__1 : rule__Join__Group__1__Impl rule__Join__Group__2 ;
    public final void rule__Join__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1350:1: ( rule__Join__Group__1__Impl rule__Join__Group__2 )
            // InternalCsvMan.g:1351:2: rule__Join__Group__1__Impl rule__Join__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Join__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Join__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Join__Group__1"


    // $ANTLR start "rule__Join__Group__1__Impl"
    // InternalCsvMan.g:1358:1: rule__Join__Group__1__Impl : ( 'join' ) ;
    public final void rule__Join__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1362:1: ( ( 'join' ) )
            // InternalCsvMan.g:1363:1: ( 'join' )
            {
            // InternalCsvMan.g:1363:1: ( 'join' )
            // InternalCsvMan.g:1364:2: 'join'
            {
             before(grammarAccess.getJoinAccess().getJoinKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getJoinAccess().getJoinKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Join__Group__1__Impl"


    // $ANTLR start "rule__Join__Group__2"
    // InternalCsvMan.g:1373:1: rule__Join__Group__2 : rule__Join__Group__2__Impl rule__Join__Group__3 ;
    public final void rule__Join__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1377:1: ( rule__Join__Group__2__Impl rule__Join__Group__3 )
            // InternalCsvMan.g:1378:2: rule__Join__Group__2__Impl rule__Join__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Join__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Join__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Join__Group__2"


    // $ANTLR start "rule__Join__Group__2__Impl"
    // InternalCsvMan.g:1385:1: rule__Join__Group__2__Impl : ( ( rule__Join__Table1Assignment_2 ) ) ;
    public final void rule__Join__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1389:1: ( ( ( rule__Join__Table1Assignment_2 ) ) )
            // InternalCsvMan.g:1390:1: ( ( rule__Join__Table1Assignment_2 ) )
            {
            // InternalCsvMan.g:1390:1: ( ( rule__Join__Table1Assignment_2 ) )
            // InternalCsvMan.g:1391:2: ( rule__Join__Table1Assignment_2 )
            {
             before(grammarAccess.getJoinAccess().getTable1Assignment_2()); 
            // InternalCsvMan.g:1392:2: ( rule__Join__Table1Assignment_2 )
            // InternalCsvMan.g:1392:3: rule__Join__Table1Assignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Join__Table1Assignment_2();

            state._fsp--;


            }

             after(grammarAccess.getJoinAccess().getTable1Assignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Join__Group__2__Impl"


    // $ANTLR start "rule__Join__Group__3"
    // InternalCsvMan.g:1400:1: rule__Join__Group__3 : rule__Join__Group__3__Impl rule__Join__Group__4 ;
    public final void rule__Join__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1404:1: ( rule__Join__Group__3__Impl rule__Join__Group__4 )
            // InternalCsvMan.g:1405:2: rule__Join__Group__3__Impl rule__Join__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Join__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Join__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Join__Group__3"


    // $ANTLR start "rule__Join__Group__3__Impl"
    // InternalCsvMan.g:1412:1: rule__Join__Group__3__Impl : ( ( rule__Join__Table2Assignment_3 ) ) ;
    public final void rule__Join__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1416:1: ( ( ( rule__Join__Table2Assignment_3 ) ) )
            // InternalCsvMan.g:1417:1: ( ( rule__Join__Table2Assignment_3 ) )
            {
            // InternalCsvMan.g:1417:1: ( ( rule__Join__Table2Assignment_3 ) )
            // InternalCsvMan.g:1418:2: ( rule__Join__Table2Assignment_3 )
            {
             before(grammarAccess.getJoinAccess().getTable2Assignment_3()); 
            // InternalCsvMan.g:1419:2: ( rule__Join__Table2Assignment_3 )
            // InternalCsvMan.g:1419:3: rule__Join__Table2Assignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Join__Table2Assignment_3();

            state._fsp--;


            }

             after(grammarAccess.getJoinAccess().getTable2Assignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Join__Group__3__Impl"


    // $ANTLR start "rule__Join__Group__4"
    // InternalCsvMan.g:1427:1: rule__Join__Group__4 : rule__Join__Group__4__Impl ;
    public final void rule__Join__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1431:1: ( rule__Join__Group__4__Impl )
            // InternalCsvMan.g:1432:2: rule__Join__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Join__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Join__Group__4"


    // $ANTLR start "rule__Join__Group__4__Impl"
    // InternalCsvMan.g:1438:1: rule__Join__Group__4__Impl : ( RULE_NL ) ;
    public final void rule__Join__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1442:1: ( ( RULE_NL ) )
            // InternalCsvMan.g:1443:1: ( RULE_NL )
            {
            // InternalCsvMan.g:1443:1: ( RULE_NL )
            // InternalCsvMan.g:1444:2: RULE_NL
            {
             before(grammarAccess.getJoinAccess().getNLTerminalRuleCall_4()); 
            match(input,RULE_NL,FOLLOW_2); 
             after(grammarAccess.getJoinAccess().getNLTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Join__Group__4__Impl"


    // $ANTLR start "rule__Delete__Group__0"
    // InternalCsvMan.g:1454:1: rule__Delete__Group__0 : rule__Delete__Group__0__Impl rule__Delete__Group__1 ;
    public final void rule__Delete__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1458:1: ( rule__Delete__Group__0__Impl rule__Delete__Group__1 )
            // InternalCsvMan.g:1459:2: rule__Delete__Group__0__Impl rule__Delete__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Delete__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delete__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delete__Group__0"


    // $ANTLR start "rule__Delete__Group__0__Impl"
    // InternalCsvMan.g:1466:1: rule__Delete__Group__0__Impl : ( () ) ;
    public final void rule__Delete__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1470:1: ( ( () ) )
            // InternalCsvMan.g:1471:1: ( () )
            {
            // InternalCsvMan.g:1471:1: ( () )
            // InternalCsvMan.g:1472:2: ()
            {
             before(grammarAccess.getDeleteAccess().getDeleteAction_0()); 
            // InternalCsvMan.g:1473:2: ()
            // InternalCsvMan.g:1473:3: 
            {
            }

             after(grammarAccess.getDeleteAccess().getDeleteAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delete__Group__0__Impl"


    // $ANTLR start "rule__Delete__Group__1"
    // InternalCsvMan.g:1481:1: rule__Delete__Group__1 : rule__Delete__Group__1__Impl rule__Delete__Group__2 ;
    public final void rule__Delete__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1485:1: ( rule__Delete__Group__1__Impl rule__Delete__Group__2 )
            // InternalCsvMan.g:1486:2: rule__Delete__Group__1__Impl rule__Delete__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Delete__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delete__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delete__Group__1"


    // $ANTLR start "rule__Delete__Group__1__Impl"
    // InternalCsvMan.g:1493:1: rule__Delete__Group__1__Impl : ( 'delete' ) ;
    public final void rule__Delete__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1497:1: ( ( 'delete' ) )
            // InternalCsvMan.g:1498:1: ( 'delete' )
            {
            // InternalCsvMan.g:1498:1: ( 'delete' )
            // InternalCsvMan.g:1499:2: 'delete'
            {
             before(grammarAccess.getDeleteAccess().getDeleteKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDeleteAccess().getDeleteKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delete__Group__1__Impl"


    // $ANTLR start "rule__Delete__Group__2"
    // InternalCsvMan.g:1508:1: rule__Delete__Group__2 : rule__Delete__Group__2__Impl rule__Delete__Group__3 ;
    public final void rule__Delete__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1512:1: ( rule__Delete__Group__2__Impl rule__Delete__Group__3 )
            // InternalCsvMan.g:1513:2: rule__Delete__Group__2__Impl rule__Delete__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Delete__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delete__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delete__Group__2"


    // $ANTLR start "rule__Delete__Group__2__Impl"
    // InternalCsvMan.g:1520:1: rule__Delete__Group__2__Impl : ( ( rule__Delete__TableAssignment_2 ) ) ;
    public final void rule__Delete__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1524:1: ( ( ( rule__Delete__TableAssignment_2 ) ) )
            // InternalCsvMan.g:1525:1: ( ( rule__Delete__TableAssignment_2 ) )
            {
            // InternalCsvMan.g:1525:1: ( ( rule__Delete__TableAssignment_2 ) )
            // InternalCsvMan.g:1526:2: ( rule__Delete__TableAssignment_2 )
            {
             before(grammarAccess.getDeleteAccess().getTableAssignment_2()); 
            // InternalCsvMan.g:1527:2: ( rule__Delete__TableAssignment_2 )
            // InternalCsvMan.g:1527:3: rule__Delete__TableAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Delete__TableAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDeleteAccess().getTableAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delete__Group__2__Impl"


    // $ANTLR start "rule__Delete__Group__3"
    // InternalCsvMan.g:1535:1: rule__Delete__Group__3 : rule__Delete__Group__3__Impl rule__Delete__Group__4 ;
    public final void rule__Delete__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1539:1: ( rule__Delete__Group__3__Impl rule__Delete__Group__4 )
            // InternalCsvMan.g:1540:2: rule__Delete__Group__3__Impl rule__Delete__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Delete__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delete__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delete__Group__3"


    // $ANTLR start "rule__Delete__Group__3__Impl"
    // InternalCsvMan.g:1547:1: rule__Delete__Group__3__Impl : ( ( rule__Delete__WhereAssignment_3 )? ) ;
    public final void rule__Delete__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1551:1: ( ( ( rule__Delete__WhereAssignment_3 )? ) )
            // InternalCsvMan.g:1552:1: ( ( rule__Delete__WhereAssignment_3 )? )
            {
            // InternalCsvMan.g:1552:1: ( ( rule__Delete__WhereAssignment_3 )? )
            // InternalCsvMan.g:1553:2: ( rule__Delete__WhereAssignment_3 )?
            {
             before(grammarAccess.getDeleteAccess().getWhereAssignment_3()); 
            // InternalCsvMan.g:1554:2: ( rule__Delete__WhereAssignment_3 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalCsvMan.g:1554:3: rule__Delete__WhereAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Delete__WhereAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeleteAccess().getWhereAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delete__Group__3__Impl"


    // $ANTLR start "rule__Delete__Group__4"
    // InternalCsvMan.g:1562:1: rule__Delete__Group__4 : rule__Delete__Group__4__Impl ;
    public final void rule__Delete__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1566:1: ( rule__Delete__Group__4__Impl )
            // InternalCsvMan.g:1567:2: rule__Delete__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Delete__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delete__Group__4"


    // $ANTLR start "rule__Delete__Group__4__Impl"
    // InternalCsvMan.g:1573:1: rule__Delete__Group__4__Impl : ( RULE_NL ) ;
    public final void rule__Delete__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1577:1: ( ( RULE_NL ) )
            // InternalCsvMan.g:1578:1: ( RULE_NL )
            {
            // InternalCsvMan.g:1578:1: ( RULE_NL )
            // InternalCsvMan.g:1579:2: RULE_NL
            {
             before(grammarAccess.getDeleteAccess().getNLTerminalRuleCall_4()); 
            match(input,RULE_NL,FOLLOW_2); 
             after(grammarAccess.getDeleteAccess().getNLTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delete__Group__4__Impl"


    // $ANTLR start "rule__Exit__Group__0"
    // InternalCsvMan.g:1589:1: rule__Exit__Group__0 : rule__Exit__Group__0__Impl rule__Exit__Group__1 ;
    public final void rule__Exit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1593:1: ( rule__Exit__Group__0__Impl rule__Exit__Group__1 )
            // InternalCsvMan.g:1594:2: rule__Exit__Group__0__Impl rule__Exit__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Exit__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exit__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exit__Group__0"


    // $ANTLR start "rule__Exit__Group__0__Impl"
    // InternalCsvMan.g:1601:1: rule__Exit__Group__0__Impl : ( () ) ;
    public final void rule__Exit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1605:1: ( ( () ) )
            // InternalCsvMan.g:1606:1: ( () )
            {
            // InternalCsvMan.g:1606:1: ( () )
            // InternalCsvMan.g:1607:2: ()
            {
             before(grammarAccess.getExitAccess().getExitAction_0()); 
            // InternalCsvMan.g:1608:2: ()
            // InternalCsvMan.g:1608:3: 
            {
            }

             after(grammarAccess.getExitAccess().getExitAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exit__Group__0__Impl"


    // $ANTLR start "rule__Exit__Group__1"
    // InternalCsvMan.g:1616:1: rule__Exit__Group__1 : rule__Exit__Group__1__Impl rule__Exit__Group__2 ;
    public final void rule__Exit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1620:1: ( rule__Exit__Group__1__Impl rule__Exit__Group__2 )
            // InternalCsvMan.g:1621:2: rule__Exit__Group__1__Impl rule__Exit__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Exit__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exit__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exit__Group__1"


    // $ANTLR start "rule__Exit__Group__1__Impl"
    // InternalCsvMan.g:1628:1: rule__Exit__Group__1__Impl : ( 'exit' ) ;
    public final void rule__Exit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1632:1: ( ( 'exit' ) )
            // InternalCsvMan.g:1633:1: ( 'exit' )
            {
            // InternalCsvMan.g:1633:1: ( 'exit' )
            // InternalCsvMan.g:1634:2: 'exit'
            {
             before(grammarAccess.getExitAccess().getExitKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getExitAccess().getExitKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exit__Group__1__Impl"


    // $ANTLR start "rule__Exit__Group__2"
    // InternalCsvMan.g:1643:1: rule__Exit__Group__2 : rule__Exit__Group__2__Impl ;
    public final void rule__Exit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1647:1: ( rule__Exit__Group__2__Impl )
            // InternalCsvMan.g:1648:2: rule__Exit__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exit__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exit__Group__2"


    // $ANTLR start "rule__Exit__Group__2__Impl"
    // InternalCsvMan.g:1654:1: rule__Exit__Group__2__Impl : ( RULE_NL ) ;
    public final void rule__Exit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1658:1: ( ( RULE_NL ) )
            // InternalCsvMan.g:1659:1: ( RULE_NL )
            {
            // InternalCsvMan.g:1659:1: ( RULE_NL )
            // InternalCsvMan.g:1660:2: RULE_NL
            {
             before(grammarAccess.getExitAccess().getNLTerminalRuleCall_2()); 
            match(input,RULE_NL,FOLLOW_2); 
             after(grammarAccess.getExitAccess().getNLTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exit__Group__2__Impl"


    // $ANTLR start "rule__Where__Group__0"
    // InternalCsvMan.g:1670:1: rule__Where__Group__0 : rule__Where__Group__0__Impl rule__Where__Group__1 ;
    public final void rule__Where__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1674:1: ( rule__Where__Group__0__Impl rule__Where__Group__1 )
            // InternalCsvMan.g:1675:2: rule__Where__Group__0__Impl rule__Where__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Where__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Where__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Where__Group__0"


    // $ANTLR start "rule__Where__Group__0__Impl"
    // InternalCsvMan.g:1682:1: rule__Where__Group__0__Impl : ( () ) ;
    public final void rule__Where__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1686:1: ( ( () ) )
            // InternalCsvMan.g:1687:1: ( () )
            {
            // InternalCsvMan.g:1687:1: ( () )
            // InternalCsvMan.g:1688:2: ()
            {
             before(grammarAccess.getWhereAccess().getWhereAction_0()); 
            // InternalCsvMan.g:1689:2: ()
            // InternalCsvMan.g:1689:3: 
            {
            }

             after(grammarAccess.getWhereAccess().getWhereAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Where__Group__0__Impl"


    // $ANTLR start "rule__Where__Group__1"
    // InternalCsvMan.g:1697:1: rule__Where__Group__1 : rule__Where__Group__1__Impl rule__Where__Group__2 ;
    public final void rule__Where__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1701:1: ( rule__Where__Group__1__Impl rule__Where__Group__2 )
            // InternalCsvMan.g:1702:2: rule__Where__Group__1__Impl rule__Where__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Where__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Where__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Where__Group__1"


    // $ANTLR start "rule__Where__Group__1__Impl"
    // InternalCsvMan.g:1709:1: rule__Where__Group__1__Impl : ( 'where' ) ;
    public final void rule__Where__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1713:1: ( ( 'where' ) )
            // InternalCsvMan.g:1714:1: ( 'where' )
            {
            // InternalCsvMan.g:1714:1: ( 'where' )
            // InternalCsvMan.g:1715:2: 'where'
            {
             before(grammarAccess.getWhereAccess().getWhereKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getWhereAccess().getWhereKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Where__Group__1__Impl"


    // $ANTLR start "rule__Where__Group__2"
    // InternalCsvMan.g:1724:1: rule__Where__Group__2 : rule__Where__Group__2__Impl rule__Where__Group__3 ;
    public final void rule__Where__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1728:1: ( rule__Where__Group__2__Impl rule__Where__Group__3 )
            // InternalCsvMan.g:1729:2: rule__Where__Group__2__Impl rule__Where__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__Where__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Where__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Where__Group__2"


    // $ANTLR start "rule__Where__Group__2__Impl"
    // InternalCsvMan.g:1736:1: rule__Where__Group__2__Impl : ( ( rule__Where__ConditionAssignment_2 ) ) ;
    public final void rule__Where__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1740:1: ( ( ( rule__Where__ConditionAssignment_2 ) ) )
            // InternalCsvMan.g:1741:1: ( ( rule__Where__ConditionAssignment_2 ) )
            {
            // InternalCsvMan.g:1741:1: ( ( rule__Where__ConditionAssignment_2 ) )
            // InternalCsvMan.g:1742:2: ( rule__Where__ConditionAssignment_2 )
            {
             before(grammarAccess.getWhereAccess().getConditionAssignment_2()); 
            // InternalCsvMan.g:1743:2: ( rule__Where__ConditionAssignment_2 )
            // InternalCsvMan.g:1743:3: rule__Where__ConditionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Where__ConditionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWhereAccess().getConditionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Where__Group__2__Impl"


    // $ANTLR start "rule__Where__Group__3"
    // InternalCsvMan.g:1751:1: rule__Where__Group__3 : rule__Where__Group__3__Impl ;
    public final void rule__Where__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1755:1: ( rule__Where__Group__3__Impl )
            // InternalCsvMan.g:1756:2: rule__Where__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Where__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Where__Group__3"


    // $ANTLR start "rule__Where__Group__3__Impl"
    // InternalCsvMan.g:1762:1: rule__Where__Group__3__Impl : ( ( rule__Where__Group_3__0 )* ) ;
    public final void rule__Where__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1766:1: ( ( ( rule__Where__Group_3__0 )* ) )
            // InternalCsvMan.g:1767:1: ( ( rule__Where__Group_3__0 )* )
            {
            // InternalCsvMan.g:1767:1: ( ( rule__Where__Group_3__0 )* )
            // InternalCsvMan.g:1768:2: ( rule__Where__Group_3__0 )*
            {
             before(grammarAccess.getWhereAccess().getGroup_3()); 
            // InternalCsvMan.g:1769:2: ( rule__Where__Group_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==25) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalCsvMan.g:1769:3: rule__Where__Group_3__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Where__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getWhereAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Where__Group__3__Impl"


    // $ANTLR start "rule__Where__Group_3__0"
    // InternalCsvMan.g:1778:1: rule__Where__Group_3__0 : rule__Where__Group_3__0__Impl rule__Where__Group_3__1 ;
    public final void rule__Where__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1782:1: ( rule__Where__Group_3__0__Impl rule__Where__Group_3__1 )
            // InternalCsvMan.g:1783:2: rule__Where__Group_3__0__Impl rule__Where__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__Where__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Where__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Where__Group_3__0"


    // $ANTLR start "rule__Where__Group_3__0__Impl"
    // InternalCsvMan.g:1790:1: rule__Where__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Where__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1794:1: ( ( ',' ) )
            // InternalCsvMan.g:1795:1: ( ',' )
            {
            // InternalCsvMan.g:1795:1: ( ',' )
            // InternalCsvMan.g:1796:2: ','
            {
             before(grammarAccess.getWhereAccess().getCommaKeyword_3_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getWhereAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Where__Group_3__0__Impl"


    // $ANTLR start "rule__Where__Group_3__1"
    // InternalCsvMan.g:1805:1: rule__Where__Group_3__1 : rule__Where__Group_3__1__Impl ;
    public final void rule__Where__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1809:1: ( rule__Where__Group_3__1__Impl )
            // InternalCsvMan.g:1810:2: rule__Where__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Where__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Where__Group_3__1"


    // $ANTLR start "rule__Where__Group_3__1__Impl"
    // InternalCsvMan.g:1816:1: rule__Where__Group_3__1__Impl : ( ( rule__Where__ConditionAssignment_3_1 ) ) ;
    public final void rule__Where__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1820:1: ( ( ( rule__Where__ConditionAssignment_3_1 ) ) )
            // InternalCsvMan.g:1821:1: ( ( rule__Where__ConditionAssignment_3_1 ) )
            {
            // InternalCsvMan.g:1821:1: ( ( rule__Where__ConditionAssignment_3_1 ) )
            // InternalCsvMan.g:1822:2: ( rule__Where__ConditionAssignment_3_1 )
            {
             before(grammarAccess.getWhereAccess().getConditionAssignment_3_1()); 
            // InternalCsvMan.g:1823:2: ( rule__Where__ConditionAssignment_3_1 )
            // InternalCsvMan.g:1823:3: rule__Where__ConditionAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Where__ConditionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getWhereAccess().getConditionAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Where__Group_3__1__Impl"


    // $ANTLR start "rule__Condition__Group__0"
    // InternalCsvMan.g:1832:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1836:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalCsvMan.g:1837:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Condition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0"


    // $ANTLR start "rule__Condition__Group__0__Impl"
    // InternalCsvMan.g:1844:1: rule__Condition__Group__0__Impl : ( () ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1848:1: ( ( () ) )
            // InternalCsvMan.g:1849:1: ( () )
            {
            // InternalCsvMan.g:1849:1: ( () )
            // InternalCsvMan.g:1850:2: ()
            {
             before(grammarAccess.getConditionAccess().getConditionAction_0()); 
            // InternalCsvMan.g:1851:2: ()
            // InternalCsvMan.g:1851:3: 
            {
            }

             after(grammarAccess.getConditionAccess().getConditionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0__Impl"


    // $ANTLR start "rule__Condition__Group__1"
    // InternalCsvMan.g:1859:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl rule__Condition__Group__2 ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1863:1: ( rule__Condition__Group__1__Impl rule__Condition__Group__2 )
            // InternalCsvMan.g:1864:2: rule__Condition__Group__1__Impl rule__Condition__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Condition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1"


    // $ANTLR start "rule__Condition__Group__1__Impl"
    // InternalCsvMan.g:1871:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__AtributAssignment_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1875:1: ( ( ( rule__Condition__AtributAssignment_1 ) ) )
            // InternalCsvMan.g:1876:1: ( ( rule__Condition__AtributAssignment_1 ) )
            {
            // InternalCsvMan.g:1876:1: ( ( rule__Condition__AtributAssignment_1 ) )
            // InternalCsvMan.g:1877:2: ( rule__Condition__AtributAssignment_1 )
            {
             before(grammarAccess.getConditionAccess().getAtributAssignment_1()); 
            // InternalCsvMan.g:1878:2: ( rule__Condition__AtributAssignment_1 )
            // InternalCsvMan.g:1878:3: rule__Condition__AtributAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Condition__AtributAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getAtributAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1__Impl"


    // $ANTLR start "rule__Condition__Group__2"
    // InternalCsvMan.g:1886:1: rule__Condition__Group__2 : rule__Condition__Group__2__Impl rule__Condition__Group__3 ;
    public final void rule__Condition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1890:1: ( rule__Condition__Group__2__Impl rule__Condition__Group__3 )
            // InternalCsvMan.g:1891:2: rule__Condition__Group__2__Impl rule__Condition__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Condition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__2"


    // $ANTLR start "rule__Condition__Group__2__Impl"
    // InternalCsvMan.g:1898:1: rule__Condition__Group__2__Impl : ( RULE_OP ) ;
    public final void rule__Condition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1902:1: ( ( RULE_OP ) )
            // InternalCsvMan.g:1903:1: ( RULE_OP )
            {
            // InternalCsvMan.g:1903:1: ( RULE_OP )
            // InternalCsvMan.g:1904:2: RULE_OP
            {
             before(grammarAccess.getConditionAccess().getOPTerminalRuleCall_2()); 
            match(input,RULE_OP,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getOPTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__2__Impl"


    // $ANTLR start "rule__Condition__Group__3"
    // InternalCsvMan.g:1913:1: rule__Condition__Group__3 : rule__Condition__Group__3__Impl ;
    public final void rule__Condition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1917:1: ( rule__Condition__Group__3__Impl )
            // InternalCsvMan.g:1918:2: rule__Condition__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__3"


    // $ANTLR start "rule__Condition__Group__3__Impl"
    // InternalCsvMan.g:1924:1: rule__Condition__Group__3__Impl : ( ( rule__Condition__ValeurAssignment_3 ) ) ;
    public final void rule__Condition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1928:1: ( ( ( rule__Condition__ValeurAssignment_3 ) ) )
            // InternalCsvMan.g:1929:1: ( ( rule__Condition__ValeurAssignment_3 ) )
            {
            // InternalCsvMan.g:1929:1: ( ( rule__Condition__ValeurAssignment_3 ) )
            // InternalCsvMan.g:1930:2: ( rule__Condition__ValeurAssignment_3 )
            {
             before(grammarAccess.getConditionAccess().getValeurAssignment_3()); 
            // InternalCsvMan.g:1931:2: ( rule__Condition__ValeurAssignment_3 )
            // InternalCsvMan.g:1931:3: rule__Condition__ValeurAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Condition__ValeurAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getValeurAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__3__Impl"


    // $ANTLR start "rule__Program__InstructionAssignment_1"
    // InternalCsvMan.g:1940:1: rule__Program__InstructionAssignment_1 : ( ruleInstruction ) ;
    public final void rule__Program__InstructionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1944:1: ( ( ruleInstruction ) )
            // InternalCsvMan.g:1945:2: ( ruleInstruction )
            {
            // InternalCsvMan.g:1945:2: ( ruleInstruction )
            // InternalCsvMan.g:1946:3: ruleInstruction
            {
             before(grammarAccess.getProgramAccess().getInstructionInstructionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getInstructionInstructionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__InstructionAssignment_1"


    // $ANTLR start "rule__Create__TableAssignment_2"
    // InternalCsvMan.g:1955:1: rule__Create__TableAssignment_2 : ( ruleEString ) ;
    public final void rule__Create__TableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1959:1: ( ( ruleEString ) )
            // InternalCsvMan.g:1960:2: ( ruleEString )
            {
            // InternalCsvMan.g:1960:2: ( ruleEString )
            // InternalCsvMan.g:1961:3: ruleEString
            {
             before(grammarAccess.getCreateAccess().getTableEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCreateAccess().getTableEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Create__TableAssignment_2"


    // $ANTLR start "rule__Create__AliasAssignment_4"
    // InternalCsvMan.g:1970:1: rule__Create__AliasAssignment_4 : ( ruleEString ) ;
    public final void rule__Create__AliasAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1974:1: ( ( ruleEString ) )
            // InternalCsvMan.g:1975:2: ( ruleEString )
            {
            // InternalCsvMan.g:1975:2: ( ruleEString )
            // InternalCsvMan.g:1976:3: ruleEString
            {
             before(grammarAccess.getCreateAccess().getAliasEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCreateAccess().getAliasEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Create__AliasAssignment_4"


    // $ANTLR start "rule__Load__TableAssignment_2"
    // InternalCsvMan.g:1985:1: rule__Load__TableAssignment_2 : ( ruleEString ) ;
    public final void rule__Load__TableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1989:1: ( ( ruleEString ) )
            // InternalCsvMan.g:1990:2: ( ruleEString )
            {
            // InternalCsvMan.g:1990:2: ( ruleEString )
            // InternalCsvMan.g:1991:3: ruleEString
            {
             before(grammarAccess.getLoadAccess().getTableEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLoadAccess().getTableEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Load__TableAssignment_2"


    // $ANTLR start "rule__Load__AliasAssignment_4"
    // InternalCsvMan.g:2000:1: rule__Load__AliasAssignment_4 : ( ruleEString ) ;
    public final void rule__Load__AliasAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2004:1: ( ( ruleEString ) )
            // InternalCsvMan.g:2005:2: ( ruleEString )
            {
            // InternalCsvMan.g:2005:2: ( ruleEString )
            // InternalCsvMan.g:2006:3: ruleEString
            {
             before(grammarAccess.getLoadAccess().getAliasEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLoadAccess().getAliasEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Load__AliasAssignment_4"


    // $ANTLR start "rule__Show__TableAssignment_2"
    // InternalCsvMan.g:2015:1: rule__Show__TableAssignment_2 : ( ruleEString ) ;
    public final void rule__Show__TableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2019:1: ( ( ruleEString ) )
            // InternalCsvMan.g:2020:2: ( ruleEString )
            {
            // InternalCsvMan.g:2020:2: ( ruleEString )
            // InternalCsvMan.g:2021:3: ruleEString
            {
             before(grammarAccess.getShowAccess().getTableEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getShowAccess().getTableEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Show__TableAssignment_2"


    // $ANTLR start "rule__Show__WhereAssignment_3"
    // InternalCsvMan.g:2030:1: rule__Show__WhereAssignment_3 : ( ruleWhere ) ;
    public final void rule__Show__WhereAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2034:1: ( ( ruleWhere ) )
            // InternalCsvMan.g:2035:2: ( ruleWhere )
            {
            // InternalCsvMan.g:2035:2: ( ruleWhere )
            // InternalCsvMan.g:2036:3: ruleWhere
            {
             before(grammarAccess.getShowAccess().getWhereWhereParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleWhere();

            state._fsp--;

             after(grammarAccess.getShowAccess().getWhereWhereParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Show__WhereAssignment_3"


    // $ANTLR start "rule__Update__TableAssignment_2"
    // InternalCsvMan.g:2045:1: rule__Update__TableAssignment_2 : ( ruleEString ) ;
    public final void rule__Update__TableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2049:1: ( ( ruleEString ) )
            // InternalCsvMan.g:2050:2: ( ruleEString )
            {
            // InternalCsvMan.g:2050:2: ( ruleEString )
            // InternalCsvMan.g:2051:3: ruleEString
            {
             before(grammarAccess.getUpdateAccess().getTableEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getUpdateAccess().getTableEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Update__TableAssignment_2"


    // $ANTLR start "rule__Update__ParametersAssignment_4"
    // InternalCsvMan.g:2060:1: rule__Update__ParametersAssignment_4 : ( ruleEString ) ;
    public final void rule__Update__ParametersAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2064:1: ( ( ruleEString ) )
            // InternalCsvMan.g:2065:2: ( ruleEString )
            {
            // InternalCsvMan.g:2065:2: ( ruleEString )
            // InternalCsvMan.g:2066:3: ruleEString
            {
             before(grammarAccess.getUpdateAccess().getParametersEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getUpdateAccess().getParametersEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Update__ParametersAssignment_4"


    // $ANTLR start "rule__Update__WhereAssignment_5"
    // InternalCsvMan.g:2075:1: rule__Update__WhereAssignment_5 : ( ruleWhere ) ;
    public final void rule__Update__WhereAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2079:1: ( ( ruleWhere ) )
            // InternalCsvMan.g:2080:2: ( ruleWhere )
            {
            // InternalCsvMan.g:2080:2: ( ruleWhere )
            // InternalCsvMan.g:2081:3: ruleWhere
            {
             before(grammarAccess.getUpdateAccess().getWhereWhereParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleWhere();

            state._fsp--;

             after(grammarAccess.getUpdateAccess().getWhereWhereParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Update__WhereAssignment_5"


    // $ANTLR start "rule__Add__TupleAssignment_2"
    // InternalCsvMan.g:2090:1: rule__Add__TupleAssignment_2 : ( ruleEString ) ;
    public final void rule__Add__TupleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2094:1: ( ( ruleEString ) )
            // InternalCsvMan.g:2095:2: ( ruleEString )
            {
            // InternalCsvMan.g:2095:2: ( ruleEString )
            // InternalCsvMan.g:2096:3: ruleEString
            {
             before(grammarAccess.getAddAccess().getTupleEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAddAccess().getTupleEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__TupleAssignment_2"


    // $ANTLR start "rule__Add__TableAssignment_4"
    // InternalCsvMan.g:2105:1: rule__Add__TableAssignment_4 : ( ruleEString ) ;
    public final void rule__Add__TableAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2109:1: ( ( ruleEString ) )
            // InternalCsvMan.g:2110:2: ( ruleEString )
            {
            // InternalCsvMan.g:2110:2: ( ruleEString )
            // InternalCsvMan.g:2111:3: ruleEString
            {
             before(grammarAccess.getAddAccess().getTableEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAddAccess().getTableEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__TableAssignment_4"


    // $ANTLR start "rule__Join__Table1Assignment_2"
    // InternalCsvMan.g:2120:1: rule__Join__Table1Assignment_2 : ( ruleEString ) ;
    public final void rule__Join__Table1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2124:1: ( ( ruleEString ) )
            // InternalCsvMan.g:2125:2: ( ruleEString )
            {
            // InternalCsvMan.g:2125:2: ( ruleEString )
            // InternalCsvMan.g:2126:3: ruleEString
            {
             before(grammarAccess.getJoinAccess().getTable1EStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getJoinAccess().getTable1EStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Join__Table1Assignment_2"


    // $ANTLR start "rule__Join__Table2Assignment_3"
    // InternalCsvMan.g:2135:1: rule__Join__Table2Assignment_3 : ( ruleEString ) ;
    public final void rule__Join__Table2Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2139:1: ( ( ruleEString ) )
            // InternalCsvMan.g:2140:2: ( ruleEString )
            {
            // InternalCsvMan.g:2140:2: ( ruleEString )
            // InternalCsvMan.g:2141:3: ruleEString
            {
             before(grammarAccess.getJoinAccess().getTable2EStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getJoinAccess().getTable2EStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Join__Table2Assignment_3"


    // $ANTLR start "rule__Delete__TableAssignment_2"
    // InternalCsvMan.g:2150:1: rule__Delete__TableAssignment_2 : ( ruleEString ) ;
    public final void rule__Delete__TableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2154:1: ( ( ruleEString ) )
            // InternalCsvMan.g:2155:2: ( ruleEString )
            {
            // InternalCsvMan.g:2155:2: ( ruleEString )
            // InternalCsvMan.g:2156:3: ruleEString
            {
             before(grammarAccess.getDeleteAccess().getTableEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDeleteAccess().getTableEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delete__TableAssignment_2"


    // $ANTLR start "rule__Delete__WhereAssignment_3"
    // InternalCsvMan.g:2165:1: rule__Delete__WhereAssignment_3 : ( ruleWhere ) ;
    public final void rule__Delete__WhereAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2169:1: ( ( ruleWhere ) )
            // InternalCsvMan.g:2170:2: ( ruleWhere )
            {
            // InternalCsvMan.g:2170:2: ( ruleWhere )
            // InternalCsvMan.g:2171:3: ruleWhere
            {
             before(grammarAccess.getDeleteAccess().getWhereWhereParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleWhere();

            state._fsp--;

             after(grammarAccess.getDeleteAccess().getWhereWhereParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delete__WhereAssignment_3"


    // $ANTLR start "rule__Where__ConditionAssignment_2"
    // InternalCsvMan.g:2180:1: rule__Where__ConditionAssignment_2 : ( ruleCondition ) ;
    public final void rule__Where__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2184:1: ( ( ruleCondition ) )
            // InternalCsvMan.g:2185:2: ( ruleCondition )
            {
            // InternalCsvMan.g:2185:2: ( ruleCondition )
            // InternalCsvMan.g:2186:3: ruleCondition
            {
             before(grammarAccess.getWhereAccess().getConditionConditionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getWhereAccess().getConditionConditionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Where__ConditionAssignment_2"


    // $ANTLR start "rule__Where__ConditionAssignment_3_1"
    // InternalCsvMan.g:2195:1: rule__Where__ConditionAssignment_3_1 : ( ruleCondition ) ;
    public final void rule__Where__ConditionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2199:1: ( ( ruleCondition ) )
            // InternalCsvMan.g:2200:2: ( ruleCondition )
            {
            // InternalCsvMan.g:2200:2: ( ruleCondition )
            // InternalCsvMan.g:2201:3: ruleCondition
            {
             before(grammarAccess.getWhereAccess().getConditionConditionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getWhereAccess().getConditionConditionParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Where__ConditionAssignment_3_1"


    // $ANTLR start "rule__Condition__AtributAssignment_1"
    // InternalCsvMan.g:2210:1: rule__Condition__AtributAssignment_1 : ( ruleEString ) ;
    public final void rule__Condition__AtributAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2214:1: ( ( ruleEString ) )
            // InternalCsvMan.g:2215:2: ( ruleEString )
            {
            // InternalCsvMan.g:2215:2: ( ruleEString )
            // InternalCsvMan.g:2216:3: ruleEString
            {
             before(grammarAccess.getConditionAccess().getAtributEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getAtributEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__AtributAssignment_1"


    // $ANTLR start "rule__Condition__ValeurAssignment_3"
    // InternalCsvMan.g:2225:1: rule__Condition__ValeurAssignment_3 : ( ruleEString ) ;
    public final void rule__Condition__ValeurAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2229:1: ( ( ruleEString ) )
            // InternalCsvMan.g:2230:2: ( ruleEString )
            {
            // InternalCsvMan.g:2230:2: ( ruleEString )
            // InternalCsvMan.g:2231:3: ruleEString
            {
             before(grammarAccess.getConditionAccess().getValeurEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getValeurEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__ValeurAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000EBA000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000EBA002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000080L});

}