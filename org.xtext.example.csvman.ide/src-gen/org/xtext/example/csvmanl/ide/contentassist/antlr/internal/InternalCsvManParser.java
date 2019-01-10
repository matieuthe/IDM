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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<'", "'='", "'>'", "'>='", "'<='", "'create'", "'as'", "'load'", "'show'", "'update'", "'set'", "'add'", "'in'", "'join'", "'delete'", "'exit'", "'where'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
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


    // $ANTLR start "entryRuleOperator"
    // InternalCsvMan.g:353:1: entryRuleOperator : ruleOperator EOF ;
    public final void entryRuleOperator() throws RecognitionException {
        try {
            // InternalCsvMan.g:354:1: ( ruleOperator EOF )
            // InternalCsvMan.g:355:1: ruleOperator EOF
            {
             before(grammarAccess.getOperatorRule()); 
            pushFollow(FOLLOW_1);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getOperatorRule()); 
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
    // $ANTLR end "entryRuleOperator"


    // $ANTLR start "ruleOperator"
    // InternalCsvMan.g:362:1: ruleOperator : ( ( rule__Operator__Alternatives ) ) ;
    public final void ruleOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:366:2: ( ( ( rule__Operator__Alternatives ) ) )
            // InternalCsvMan.g:367:2: ( ( rule__Operator__Alternatives ) )
            {
            // InternalCsvMan.g:367:2: ( ( rule__Operator__Alternatives ) )
            // InternalCsvMan.g:368:3: ( rule__Operator__Alternatives )
            {
             before(grammarAccess.getOperatorAccess().getAlternatives()); 
            // InternalCsvMan.g:369:3: ( rule__Operator__Alternatives )
            // InternalCsvMan.g:369:4: rule__Operator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperatorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleOperator"


    // $ANTLR start "entryRuleEString"
    // InternalCsvMan.g:378:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalCsvMan.g:379:1: ( ruleEString EOF )
            // InternalCsvMan.g:380:1: ruleEString EOF
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
    // InternalCsvMan.g:387:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:391:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalCsvMan.g:392:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalCsvMan.g:392:2: ( ( rule__EString__Alternatives ) )
            // InternalCsvMan.g:393:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalCsvMan.g:394:3: ( rule__EString__Alternatives )
            // InternalCsvMan.g:394:4: rule__EString__Alternatives
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
    // InternalCsvMan.g:402:1: rule__Instruction__Alternatives : ( ( ruleCreate ) | ( ruleLoad ) | ( ruleShow ) | ( ruleUpdate ) | ( ruleAdd ) | ( ruleJoin ) | ( ruleDelete ) | ( ruleExit ) );
    public final void rule__Instruction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:406:1: ( ( ruleCreate ) | ( ruleLoad ) | ( ruleShow ) | ( ruleUpdate ) | ( ruleAdd ) | ( ruleJoin ) | ( ruleDelete ) | ( ruleExit ) )
            int alt1=8;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt1=1;
                }
                break;
            case 18:
                {
                alt1=2;
                }
                break;
            case 19:
                {
                alt1=3;
                }
                break;
            case 20:
                {
                alt1=4;
                }
                break;
            case 22:
                {
                alt1=5;
                }
                break;
            case 24:
                {
                alt1=6;
                }
                break;
            case 25:
                {
                alt1=7;
                }
                break;
            case 26:
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
                    // InternalCsvMan.g:407:2: ( ruleCreate )
                    {
                    // InternalCsvMan.g:407:2: ( ruleCreate )
                    // InternalCsvMan.g:408:3: ruleCreate
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
                    // InternalCsvMan.g:413:2: ( ruleLoad )
                    {
                    // InternalCsvMan.g:413:2: ( ruleLoad )
                    // InternalCsvMan.g:414:3: ruleLoad
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
                    // InternalCsvMan.g:419:2: ( ruleShow )
                    {
                    // InternalCsvMan.g:419:2: ( ruleShow )
                    // InternalCsvMan.g:420:3: ruleShow
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
                    // InternalCsvMan.g:425:2: ( ruleUpdate )
                    {
                    // InternalCsvMan.g:425:2: ( ruleUpdate )
                    // InternalCsvMan.g:426:3: ruleUpdate
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
                    // InternalCsvMan.g:431:2: ( ruleAdd )
                    {
                    // InternalCsvMan.g:431:2: ( ruleAdd )
                    // InternalCsvMan.g:432:3: ruleAdd
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
                    // InternalCsvMan.g:437:2: ( ruleJoin )
                    {
                    // InternalCsvMan.g:437:2: ( ruleJoin )
                    // InternalCsvMan.g:438:3: ruleJoin
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
                    // InternalCsvMan.g:443:2: ( ruleDelete )
                    {
                    // InternalCsvMan.g:443:2: ( ruleDelete )
                    // InternalCsvMan.g:444:3: ruleDelete
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
                    // InternalCsvMan.g:449:2: ( ruleExit )
                    {
                    // InternalCsvMan.g:449:2: ( ruleExit )
                    // InternalCsvMan.g:450:3: ruleExit
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


    // $ANTLR start "rule__Operator__Alternatives"
    // InternalCsvMan.g:459:1: rule__Operator__Alternatives : ( ( '<' ) | ( '=' ) | ( '>' ) | ( '>=' ) | ( '<=' ) );
    public final void rule__Operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:463:1: ( ( '<' ) | ( '=' ) | ( '>' ) | ( '>=' ) | ( '<=' ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            case 15:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalCsvMan.g:464:2: ( '<' )
                    {
                    // InternalCsvMan.g:464:2: ( '<' )
                    // InternalCsvMan.g:465:3: '<'
                    {
                     before(grammarAccess.getOperatorAccess().getLessThanSignKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getOperatorAccess().getLessThanSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCsvMan.g:470:2: ( '=' )
                    {
                    // InternalCsvMan.g:470:2: ( '=' )
                    // InternalCsvMan.g:471:3: '='
                    {
                     before(grammarAccess.getOperatorAccess().getEqualsSignKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getOperatorAccess().getEqualsSignKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCsvMan.g:476:2: ( '>' )
                    {
                    // InternalCsvMan.g:476:2: ( '>' )
                    // InternalCsvMan.g:477:3: '>'
                    {
                     before(grammarAccess.getOperatorAccess().getGreaterThanSignKeyword_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getOperatorAccess().getGreaterThanSignKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCsvMan.g:482:2: ( '>=' )
                    {
                    // InternalCsvMan.g:482:2: ( '>=' )
                    // InternalCsvMan.g:483:3: '>='
                    {
                     before(grammarAccess.getOperatorAccess().getGreaterThanSignEqualsSignKeyword_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getOperatorAccess().getGreaterThanSignEqualsSignKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCsvMan.g:488:2: ( '<=' )
                    {
                    // InternalCsvMan.g:488:2: ( '<=' )
                    // InternalCsvMan.g:489:3: '<='
                    {
                     before(grammarAccess.getOperatorAccess().getLessThanSignEqualsSignKeyword_4()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getOperatorAccess().getLessThanSignEqualsSignKeyword_4()); 

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
    // $ANTLR end "rule__Operator__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalCsvMan.g:498:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:502:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalCsvMan.g:503:2: ( RULE_STRING )
                    {
                    // InternalCsvMan.g:503:2: ( RULE_STRING )
                    // InternalCsvMan.g:504:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCsvMan.g:509:2: ( RULE_ID )
                    {
                    // InternalCsvMan.g:509:2: ( RULE_ID )
                    // InternalCsvMan.g:510:3: RULE_ID
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
    // InternalCsvMan.g:519:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:523:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalCsvMan.g:524:2: rule__Program__Group__0__Impl rule__Program__Group__1
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
    // InternalCsvMan.g:531:1: rule__Program__Group__0__Impl : ( () ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:535:1: ( ( () ) )
            // InternalCsvMan.g:536:1: ( () )
            {
            // InternalCsvMan.g:536:1: ( () )
            // InternalCsvMan.g:537:2: ()
            {
             before(grammarAccess.getProgramAccess().getProgramAction_0()); 
            // InternalCsvMan.g:538:2: ()
            // InternalCsvMan.g:538:3: 
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
    // InternalCsvMan.g:546:1: rule__Program__Group__1 : rule__Program__Group__1__Impl ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:550:1: ( rule__Program__Group__1__Impl )
            // InternalCsvMan.g:551:2: rule__Program__Group__1__Impl
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
    // InternalCsvMan.g:557:1: rule__Program__Group__1__Impl : ( ( rule__Program__InstructionAssignment_1 )* ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:561:1: ( ( ( rule__Program__InstructionAssignment_1 )* ) )
            // InternalCsvMan.g:562:1: ( ( rule__Program__InstructionAssignment_1 )* )
            {
            // InternalCsvMan.g:562:1: ( ( rule__Program__InstructionAssignment_1 )* )
            // InternalCsvMan.g:563:2: ( rule__Program__InstructionAssignment_1 )*
            {
             before(grammarAccess.getProgramAccess().getInstructionAssignment_1()); 
            // InternalCsvMan.g:564:2: ( rule__Program__InstructionAssignment_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16||(LA4_0>=18 && LA4_0<=20)||LA4_0==22||(LA4_0>=24 && LA4_0<=26)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalCsvMan.g:564:3: rule__Program__InstructionAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Program__InstructionAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // InternalCsvMan.g:573:1: rule__Create__Group__0 : rule__Create__Group__0__Impl rule__Create__Group__1 ;
    public final void rule__Create__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:577:1: ( rule__Create__Group__0__Impl rule__Create__Group__1 )
            // InternalCsvMan.g:578:2: rule__Create__Group__0__Impl rule__Create__Group__1
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
    // InternalCsvMan.g:585:1: rule__Create__Group__0__Impl : ( () ) ;
    public final void rule__Create__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:589:1: ( ( () ) )
            // InternalCsvMan.g:590:1: ( () )
            {
            // InternalCsvMan.g:590:1: ( () )
            // InternalCsvMan.g:591:2: ()
            {
             before(grammarAccess.getCreateAccess().getCreateAction_0()); 
            // InternalCsvMan.g:592:2: ()
            // InternalCsvMan.g:592:3: 
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
    // InternalCsvMan.g:600:1: rule__Create__Group__1 : rule__Create__Group__1__Impl rule__Create__Group__2 ;
    public final void rule__Create__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:604:1: ( rule__Create__Group__1__Impl rule__Create__Group__2 )
            // InternalCsvMan.g:605:2: rule__Create__Group__1__Impl rule__Create__Group__2
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
    // InternalCsvMan.g:612:1: rule__Create__Group__1__Impl : ( 'create' ) ;
    public final void rule__Create__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:616:1: ( ( 'create' ) )
            // InternalCsvMan.g:617:1: ( 'create' )
            {
            // InternalCsvMan.g:617:1: ( 'create' )
            // InternalCsvMan.g:618:2: 'create'
            {
             before(grammarAccess.getCreateAccess().getCreateKeyword_1()); 
            match(input,16,FOLLOW_2); 
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
    // InternalCsvMan.g:627:1: rule__Create__Group__2 : rule__Create__Group__2__Impl rule__Create__Group__3 ;
    public final void rule__Create__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:631:1: ( rule__Create__Group__2__Impl rule__Create__Group__3 )
            // InternalCsvMan.g:632:2: rule__Create__Group__2__Impl rule__Create__Group__3
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
    // InternalCsvMan.g:639:1: rule__Create__Group__2__Impl : ( ( rule__Create__TableAssignment_2 ) ) ;
    public final void rule__Create__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:643:1: ( ( ( rule__Create__TableAssignment_2 ) ) )
            // InternalCsvMan.g:644:1: ( ( rule__Create__TableAssignment_2 ) )
            {
            // InternalCsvMan.g:644:1: ( ( rule__Create__TableAssignment_2 ) )
            // InternalCsvMan.g:645:2: ( rule__Create__TableAssignment_2 )
            {
             before(grammarAccess.getCreateAccess().getTableAssignment_2()); 
            // InternalCsvMan.g:646:2: ( rule__Create__TableAssignment_2 )
            // InternalCsvMan.g:646:3: rule__Create__TableAssignment_2
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
    // InternalCsvMan.g:654:1: rule__Create__Group__3 : rule__Create__Group__3__Impl rule__Create__Group__4 ;
    public final void rule__Create__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:658:1: ( rule__Create__Group__3__Impl rule__Create__Group__4 )
            // InternalCsvMan.g:659:2: rule__Create__Group__3__Impl rule__Create__Group__4
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
    // InternalCsvMan.g:666:1: rule__Create__Group__3__Impl : ( 'as' ) ;
    public final void rule__Create__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:670:1: ( ( 'as' ) )
            // InternalCsvMan.g:671:1: ( 'as' )
            {
            // InternalCsvMan.g:671:1: ( 'as' )
            // InternalCsvMan.g:672:2: 'as'
            {
             before(grammarAccess.getCreateAccess().getAsKeyword_3()); 
            match(input,17,FOLLOW_2); 
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
    // InternalCsvMan.g:681:1: rule__Create__Group__4 : rule__Create__Group__4__Impl ;
    public final void rule__Create__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:685:1: ( rule__Create__Group__4__Impl )
            // InternalCsvMan.g:686:2: rule__Create__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Create__Group__4__Impl();

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
    // InternalCsvMan.g:692:1: rule__Create__Group__4__Impl : ( ( rule__Create__AliasAssignment_4 ) ) ;
    public final void rule__Create__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:696:1: ( ( ( rule__Create__AliasAssignment_4 ) ) )
            // InternalCsvMan.g:697:1: ( ( rule__Create__AliasAssignment_4 ) )
            {
            // InternalCsvMan.g:697:1: ( ( rule__Create__AliasAssignment_4 ) )
            // InternalCsvMan.g:698:2: ( rule__Create__AliasAssignment_4 )
            {
             before(grammarAccess.getCreateAccess().getAliasAssignment_4()); 
            // InternalCsvMan.g:699:2: ( rule__Create__AliasAssignment_4 )
            // InternalCsvMan.g:699:3: rule__Create__AliasAssignment_4
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


    // $ANTLR start "rule__Load__Group__0"
    // InternalCsvMan.g:708:1: rule__Load__Group__0 : rule__Load__Group__0__Impl rule__Load__Group__1 ;
    public final void rule__Load__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:712:1: ( rule__Load__Group__0__Impl rule__Load__Group__1 )
            // InternalCsvMan.g:713:2: rule__Load__Group__0__Impl rule__Load__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalCsvMan.g:720:1: rule__Load__Group__0__Impl : ( () ) ;
    public final void rule__Load__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:724:1: ( ( () ) )
            // InternalCsvMan.g:725:1: ( () )
            {
            // InternalCsvMan.g:725:1: ( () )
            // InternalCsvMan.g:726:2: ()
            {
             before(grammarAccess.getLoadAccess().getLoadAction_0()); 
            // InternalCsvMan.g:727:2: ()
            // InternalCsvMan.g:727:3: 
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
    // InternalCsvMan.g:735:1: rule__Load__Group__1 : rule__Load__Group__1__Impl rule__Load__Group__2 ;
    public final void rule__Load__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:739:1: ( rule__Load__Group__1__Impl rule__Load__Group__2 )
            // InternalCsvMan.g:740:2: rule__Load__Group__1__Impl rule__Load__Group__2
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
    // InternalCsvMan.g:747:1: rule__Load__Group__1__Impl : ( 'load' ) ;
    public final void rule__Load__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:751:1: ( ( 'load' ) )
            // InternalCsvMan.g:752:1: ( 'load' )
            {
            // InternalCsvMan.g:752:1: ( 'load' )
            // InternalCsvMan.g:753:2: 'load'
            {
             before(grammarAccess.getLoadAccess().getLoadKeyword_1()); 
            match(input,18,FOLLOW_2); 
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
    // InternalCsvMan.g:762:1: rule__Load__Group__2 : rule__Load__Group__2__Impl rule__Load__Group__3 ;
    public final void rule__Load__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:766:1: ( rule__Load__Group__2__Impl rule__Load__Group__3 )
            // InternalCsvMan.g:767:2: rule__Load__Group__2__Impl rule__Load__Group__3
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
    // InternalCsvMan.g:774:1: rule__Load__Group__2__Impl : ( ( rule__Load__TableAssignment_2 ) ) ;
    public final void rule__Load__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:778:1: ( ( ( rule__Load__TableAssignment_2 ) ) )
            // InternalCsvMan.g:779:1: ( ( rule__Load__TableAssignment_2 ) )
            {
            // InternalCsvMan.g:779:1: ( ( rule__Load__TableAssignment_2 ) )
            // InternalCsvMan.g:780:2: ( rule__Load__TableAssignment_2 )
            {
             before(grammarAccess.getLoadAccess().getTableAssignment_2()); 
            // InternalCsvMan.g:781:2: ( rule__Load__TableAssignment_2 )
            // InternalCsvMan.g:781:3: rule__Load__TableAssignment_2
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
    // InternalCsvMan.g:789:1: rule__Load__Group__3 : rule__Load__Group__3__Impl rule__Load__Group__4 ;
    public final void rule__Load__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:793:1: ( rule__Load__Group__3__Impl rule__Load__Group__4 )
            // InternalCsvMan.g:794:2: rule__Load__Group__3__Impl rule__Load__Group__4
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
    // InternalCsvMan.g:801:1: rule__Load__Group__3__Impl : ( 'as' ) ;
    public final void rule__Load__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:805:1: ( ( 'as' ) )
            // InternalCsvMan.g:806:1: ( 'as' )
            {
            // InternalCsvMan.g:806:1: ( 'as' )
            // InternalCsvMan.g:807:2: 'as'
            {
             before(grammarAccess.getLoadAccess().getAsKeyword_3()); 
            match(input,17,FOLLOW_2); 
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
    // InternalCsvMan.g:816:1: rule__Load__Group__4 : rule__Load__Group__4__Impl ;
    public final void rule__Load__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:820:1: ( rule__Load__Group__4__Impl )
            // InternalCsvMan.g:821:2: rule__Load__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Load__Group__4__Impl();

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
    // InternalCsvMan.g:827:1: rule__Load__Group__4__Impl : ( ( rule__Load__AliasAssignment_4 ) ) ;
    public final void rule__Load__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:831:1: ( ( ( rule__Load__AliasAssignment_4 ) ) )
            // InternalCsvMan.g:832:1: ( ( rule__Load__AliasAssignment_4 ) )
            {
            // InternalCsvMan.g:832:1: ( ( rule__Load__AliasAssignment_4 ) )
            // InternalCsvMan.g:833:2: ( rule__Load__AliasAssignment_4 )
            {
             before(grammarAccess.getLoadAccess().getAliasAssignment_4()); 
            // InternalCsvMan.g:834:2: ( rule__Load__AliasAssignment_4 )
            // InternalCsvMan.g:834:3: rule__Load__AliasAssignment_4
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


    // $ANTLR start "rule__Show__Group__0"
    // InternalCsvMan.g:843:1: rule__Show__Group__0 : rule__Show__Group__0__Impl rule__Show__Group__1 ;
    public final void rule__Show__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:847:1: ( rule__Show__Group__0__Impl rule__Show__Group__1 )
            // InternalCsvMan.g:848:2: rule__Show__Group__0__Impl rule__Show__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalCsvMan.g:855:1: rule__Show__Group__0__Impl : ( () ) ;
    public final void rule__Show__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:859:1: ( ( () ) )
            // InternalCsvMan.g:860:1: ( () )
            {
            // InternalCsvMan.g:860:1: ( () )
            // InternalCsvMan.g:861:2: ()
            {
             before(grammarAccess.getShowAccess().getShowAction_0()); 
            // InternalCsvMan.g:862:2: ()
            // InternalCsvMan.g:862:3: 
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
    // InternalCsvMan.g:870:1: rule__Show__Group__1 : rule__Show__Group__1__Impl rule__Show__Group__2 ;
    public final void rule__Show__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:874:1: ( rule__Show__Group__1__Impl rule__Show__Group__2 )
            // InternalCsvMan.g:875:2: rule__Show__Group__1__Impl rule__Show__Group__2
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
    // InternalCsvMan.g:882:1: rule__Show__Group__1__Impl : ( 'show' ) ;
    public final void rule__Show__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:886:1: ( ( 'show' ) )
            // InternalCsvMan.g:887:1: ( 'show' )
            {
            // InternalCsvMan.g:887:1: ( 'show' )
            // InternalCsvMan.g:888:2: 'show'
            {
             before(grammarAccess.getShowAccess().getShowKeyword_1()); 
            match(input,19,FOLLOW_2); 
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
    // InternalCsvMan.g:897:1: rule__Show__Group__2 : rule__Show__Group__2__Impl rule__Show__Group__3 ;
    public final void rule__Show__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:901:1: ( rule__Show__Group__2__Impl rule__Show__Group__3 )
            // InternalCsvMan.g:902:2: rule__Show__Group__2__Impl rule__Show__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalCsvMan.g:909:1: rule__Show__Group__2__Impl : ( ( rule__Show__TableAssignment_2 ) ) ;
    public final void rule__Show__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:913:1: ( ( ( rule__Show__TableAssignment_2 ) ) )
            // InternalCsvMan.g:914:1: ( ( rule__Show__TableAssignment_2 ) )
            {
            // InternalCsvMan.g:914:1: ( ( rule__Show__TableAssignment_2 ) )
            // InternalCsvMan.g:915:2: ( rule__Show__TableAssignment_2 )
            {
             before(grammarAccess.getShowAccess().getTableAssignment_2()); 
            // InternalCsvMan.g:916:2: ( rule__Show__TableAssignment_2 )
            // InternalCsvMan.g:916:3: rule__Show__TableAssignment_2
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
    // InternalCsvMan.g:924:1: rule__Show__Group__3 : rule__Show__Group__3__Impl ;
    public final void rule__Show__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:928:1: ( rule__Show__Group__3__Impl )
            // InternalCsvMan.g:929:2: rule__Show__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Show__Group__3__Impl();

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
    // InternalCsvMan.g:935:1: rule__Show__Group__3__Impl : ( ( rule__Show__WhereAssignment_3 )? ) ;
    public final void rule__Show__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:939:1: ( ( ( rule__Show__WhereAssignment_3 )? ) )
            // InternalCsvMan.g:940:1: ( ( rule__Show__WhereAssignment_3 )? )
            {
            // InternalCsvMan.g:940:1: ( ( rule__Show__WhereAssignment_3 )? )
            // InternalCsvMan.g:941:2: ( rule__Show__WhereAssignment_3 )?
            {
             before(grammarAccess.getShowAccess().getWhereAssignment_3()); 
            // InternalCsvMan.g:942:2: ( rule__Show__WhereAssignment_3 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==27) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalCsvMan.g:942:3: rule__Show__WhereAssignment_3
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


    // $ANTLR start "rule__Update__Group__0"
    // InternalCsvMan.g:951:1: rule__Update__Group__0 : rule__Update__Group__0__Impl rule__Update__Group__1 ;
    public final void rule__Update__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:955:1: ( rule__Update__Group__0__Impl rule__Update__Group__1 )
            // InternalCsvMan.g:956:2: rule__Update__Group__0__Impl rule__Update__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalCsvMan.g:963:1: rule__Update__Group__0__Impl : ( () ) ;
    public final void rule__Update__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:967:1: ( ( () ) )
            // InternalCsvMan.g:968:1: ( () )
            {
            // InternalCsvMan.g:968:1: ( () )
            // InternalCsvMan.g:969:2: ()
            {
             before(grammarAccess.getUpdateAccess().getUpdateAction_0()); 
            // InternalCsvMan.g:970:2: ()
            // InternalCsvMan.g:970:3: 
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
    // InternalCsvMan.g:978:1: rule__Update__Group__1 : rule__Update__Group__1__Impl rule__Update__Group__2 ;
    public final void rule__Update__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:982:1: ( rule__Update__Group__1__Impl rule__Update__Group__2 )
            // InternalCsvMan.g:983:2: rule__Update__Group__1__Impl rule__Update__Group__2
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
    // InternalCsvMan.g:990:1: rule__Update__Group__1__Impl : ( 'update' ) ;
    public final void rule__Update__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:994:1: ( ( 'update' ) )
            // InternalCsvMan.g:995:1: ( 'update' )
            {
            // InternalCsvMan.g:995:1: ( 'update' )
            // InternalCsvMan.g:996:2: 'update'
            {
             before(grammarAccess.getUpdateAccess().getUpdateKeyword_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalCsvMan.g:1005:1: rule__Update__Group__2 : rule__Update__Group__2__Impl rule__Update__Group__3 ;
    public final void rule__Update__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1009:1: ( rule__Update__Group__2__Impl rule__Update__Group__3 )
            // InternalCsvMan.g:1010:2: rule__Update__Group__2__Impl rule__Update__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalCsvMan.g:1017:1: rule__Update__Group__2__Impl : ( ( rule__Update__TableAssignment_2 ) ) ;
    public final void rule__Update__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1021:1: ( ( ( rule__Update__TableAssignment_2 ) ) )
            // InternalCsvMan.g:1022:1: ( ( rule__Update__TableAssignment_2 ) )
            {
            // InternalCsvMan.g:1022:1: ( ( rule__Update__TableAssignment_2 ) )
            // InternalCsvMan.g:1023:2: ( rule__Update__TableAssignment_2 )
            {
             before(grammarAccess.getUpdateAccess().getTableAssignment_2()); 
            // InternalCsvMan.g:1024:2: ( rule__Update__TableAssignment_2 )
            // InternalCsvMan.g:1024:3: rule__Update__TableAssignment_2
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
    // InternalCsvMan.g:1032:1: rule__Update__Group__3 : rule__Update__Group__3__Impl rule__Update__Group__4 ;
    public final void rule__Update__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1036:1: ( rule__Update__Group__3__Impl rule__Update__Group__4 )
            // InternalCsvMan.g:1037:2: rule__Update__Group__3__Impl rule__Update__Group__4
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
    // InternalCsvMan.g:1044:1: rule__Update__Group__3__Impl : ( 'set' ) ;
    public final void rule__Update__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1048:1: ( ( 'set' ) )
            // InternalCsvMan.g:1049:1: ( 'set' )
            {
            // InternalCsvMan.g:1049:1: ( 'set' )
            // InternalCsvMan.g:1050:2: 'set'
            {
             before(grammarAccess.getUpdateAccess().getSetKeyword_3()); 
            match(input,21,FOLLOW_2); 
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
    // InternalCsvMan.g:1059:1: rule__Update__Group__4 : rule__Update__Group__4__Impl rule__Update__Group__5 ;
    public final void rule__Update__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1063:1: ( rule__Update__Group__4__Impl rule__Update__Group__5 )
            // InternalCsvMan.g:1064:2: rule__Update__Group__4__Impl rule__Update__Group__5
            {
            pushFollow(FOLLOW_10);
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
    // InternalCsvMan.g:1071:1: rule__Update__Group__4__Impl : ( ( rule__Update__ParametersAssignment_4 ) ) ;
    public final void rule__Update__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1075:1: ( ( ( rule__Update__ParametersAssignment_4 ) ) )
            // InternalCsvMan.g:1076:1: ( ( rule__Update__ParametersAssignment_4 ) )
            {
            // InternalCsvMan.g:1076:1: ( ( rule__Update__ParametersAssignment_4 ) )
            // InternalCsvMan.g:1077:2: ( rule__Update__ParametersAssignment_4 )
            {
             before(grammarAccess.getUpdateAccess().getParametersAssignment_4()); 
            // InternalCsvMan.g:1078:2: ( rule__Update__ParametersAssignment_4 )
            // InternalCsvMan.g:1078:3: rule__Update__ParametersAssignment_4
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
    // InternalCsvMan.g:1086:1: rule__Update__Group__5 : rule__Update__Group__5__Impl ;
    public final void rule__Update__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1090:1: ( rule__Update__Group__5__Impl )
            // InternalCsvMan.g:1091:2: rule__Update__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Update__Group__5__Impl();

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
    // InternalCsvMan.g:1097:1: rule__Update__Group__5__Impl : ( ( rule__Update__WhereAssignment_5 )? ) ;
    public final void rule__Update__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1101:1: ( ( ( rule__Update__WhereAssignment_5 )? ) )
            // InternalCsvMan.g:1102:1: ( ( rule__Update__WhereAssignment_5 )? )
            {
            // InternalCsvMan.g:1102:1: ( ( rule__Update__WhereAssignment_5 )? )
            // InternalCsvMan.g:1103:2: ( rule__Update__WhereAssignment_5 )?
            {
             before(grammarAccess.getUpdateAccess().getWhereAssignment_5()); 
            // InternalCsvMan.g:1104:2: ( rule__Update__WhereAssignment_5 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==27) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalCsvMan.g:1104:3: rule__Update__WhereAssignment_5
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


    // $ANTLR start "rule__Add__Group__0"
    // InternalCsvMan.g:1113:1: rule__Add__Group__0 : rule__Add__Group__0__Impl rule__Add__Group__1 ;
    public final void rule__Add__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1117:1: ( rule__Add__Group__0__Impl rule__Add__Group__1 )
            // InternalCsvMan.g:1118:2: rule__Add__Group__0__Impl rule__Add__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalCsvMan.g:1125:1: rule__Add__Group__0__Impl : ( () ) ;
    public final void rule__Add__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1129:1: ( ( () ) )
            // InternalCsvMan.g:1130:1: ( () )
            {
            // InternalCsvMan.g:1130:1: ( () )
            // InternalCsvMan.g:1131:2: ()
            {
             before(grammarAccess.getAddAccess().getAddAction_0()); 
            // InternalCsvMan.g:1132:2: ()
            // InternalCsvMan.g:1132:3: 
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
    // InternalCsvMan.g:1140:1: rule__Add__Group__1 : rule__Add__Group__1__Impl rule__Add__Group__2 ;
    public final void rule__Add__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1144:1: ( rule__Add__Group__1__Impl rule__Add__Group__2 )
            // InternalCsvMan.g:1145:2: rule__Add__Group__1__Impl rule__Add__Group__2
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
    // InternalCsvMan.g:1152:1: rule__Add__Group__1__Impl : ( 'add' ) ;
    public final void rule__Add__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1156:1: ( ( 'add' ) )
            // InternalCsvMan.g:1157:1: ( 'add' )
            {
            // InternalCsvMan.g:1157:1: ( 'add' )
            // InternalCsvMan.g:1158:2: 'add'
            {
             before(grammarAccess.getAddAccess().getAddKeyword_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalCsvMan.g:1167:1: rule__Add__Group__2 : rule__Add__Group__2__Impl rule__Add__Group__3 ;
    public final void rule__Add__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1171:1: ( rule__Add__Group__2__Impl rule__Add__Group__3 )
            // InternalCsvMan.g:1172:2: rule__Add__Group__2__Impl rule__Add__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalCsvMan.g:1179:1: rule__Add__Group__2__Impl : ( ( rule__Add__TupleAssignment_2 ) ) ;
    public final void rule__Add__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1183:1: ( ( ( rule__Add__TupleAssignment_2 ) ) )
            // InternalCsvMan.g:1184:1: ( ( rule__Add__TupleAssignment_2 ) )
            {
            // InternalCsvMan.g:1184:1: ( ( rule__Add__TupleAssignment_2 ) )
            // InternalCsvMan.g:1185:2: ( rule__Add__TupleAssignment_2 )
            {
             before(grammarAccess.getAddAccess().getTupleAssignment_2()); 
            // InternalCsvMan.g:1186:2: ( rule__Add__TupleAssignment_2 )
            // InternalCsvMan.g:1186:3: rule__Add__TupleAssignment_2
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
    // InternalCsvMan.g:1194:1: rule__Add__Group__3 : rule__Add__Group__3__Impl rule__Add__Group__4 ;
    public final void rule__Add__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1198:1: ( rule__Add__Group__3__Impl rule__Add__Group__4 )
            // InternalCsvMan.g:1199:2: rule__Add__Group__3__Impl rule__Add__Group__4
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
    // InternalCsvMan.g:1206:1: rule__Add__Group__3__Impl : ( 'in' ) ;
    public final void rule__Add__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1210:1: ( ( 'in' ) )
            // InternalCsvMan.g:1211:1: ( 'in' )
            {
            // InternalCsvMan.g:1211:1: ( 'in' )
            // InternalCsvMan.g:1212:2: 'in'
            {
             before(grammarAccess.getAddAccess().getInKeyword_3()); 
            match(input,23,FOLLOW_2); 
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
    // InternalCsvMan.g:1221:1: rule__Add__Group__4 : rule__Add__Group__4__Impl ;
    public final void rule__Add__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1225:1: ( rule__Add__Group__4__Impl )
            // InternalCsvMan.g:1226:2: rule__Add__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Add__Group__4__Impl();

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
    // InternalCsvMan.g:1232:1: rule__Add__Group__4__Impl : ( ( rule__Add__TableAssignment_4 ) ) ;
    public final void rule__Add__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1236:1: ( ( ( rule__Add__TableAssignment_4 ) ) )
            // InternalCsvMan.g:1237:1: ( ( rule__Add__TableAssignment_4 ) )
            {
            // InternalCsvMan.g:1237:1: ( ( rule__Add__TableAssignment_4 ) )
            // InternalCsvMan.g:1238:2: ( rule__Add__TableAssignment_4 )
            {
             before(grammarAccess.getAddAccess().getTableAssignment_4()); 
            // InternalCsvMan.g:1239:2: ( rule__Add__TableAssignment_4 )
            // InternalCsvMan.g:1239:3: rule__Add__TableAssignment_4
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


    // $ANTLR start "rule__Join__Group__0"
    // InternalCsvMan.g:1248:1: rule__Join__Group__0 : rule__Join__Group__0__Impl rule__Join__Group__1 ;
    public final void rule__Join__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1252:1: ( rule__Join__Group__0__Impl rule__Join__Group__1 )
            // InternalCsvMan.g:1253:2: rule__Join__Group__0__Impl rule__Join__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalCsvMan.g:1260:1: rule__Join__Group__0__Impl : ( () ) ;
    public final void rule__Join__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1264:1: ( ( () ) )
            // InternalCsvMan.g:1265:1: ( () )
            {
            // InternalCsvMan.g:1265:1: ( () )
            // InternalCsvMan.g:1266:2: ()
            {
             before(grammarAccess.getJoinAccess().getJoinAction_0()); 
            // InternalCsvMan.g:1267:2: ()
            // InternalCsvMan.g:1267:3: 
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
    // InternalCsvMan.g:1275:1: rule__Join__Group__1 : rule__Join__Group__1__Impl rule__Join__Group__2 ;
    public final void rule__Join__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1279:1: ( rule__Join__Group__1__Impl rule__Join__Group__2 )
            // InternalCsvMan.g:1280:2: rule__Join__Group__1__Impl rule__Join__Group__2
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
    // InternalCsvMan.g:1287:1: rule__Join__Group__1__Impl : ( 'join' ) ;
    public final void rule__Join__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1291:1: ( ( 'join' ) )
            // InternalCsvMan.g:1292:1: ( 'join' )
            {
            // InternalCsvMan.g:1292:1: ( 'join' )
            // InternalCsvMan.g:1293:2: 'join'
            {
             before(grammarAccess.getJoinAccess().getJoinKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalCsvMan.g:1302:1: rule__Join__Group__2 : rule__Join__Group__2__Impl rule__Join__Group__3 ;
    public final void rule__Join__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1306:1: ( rule__Join__Group__2__Impl rule__Join__Group__3 )
            // InternalCsvMan.g:1307:2: rule__Join__Group__2__Impl rule__Join__Group__3
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
    // InternalCsvMan.g:1314:1: rule__Join__Group__2__Impl : ( ( rule__Join__Table1Assignment_2 ) ) ;
    public final void rule__Join__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1318:1: ( ( ( rule__Join__Table1Assignment_2 ) ) )
            // InternalCsvMan.g:1319:1: ( ( rule__Join__Table1Assignment_2 ) )
            {
            // InternalCsvMan.g:1319:1: ( ( rule__Join__Table1Assignment_2 ) )
            // InternalCsvMan.g:1320:2: ( rule__Join__Table1Assignment_2 )
            {
             before(grammarAccess.getJoinAccess().getTable1Assignment_2()); 
            // InternalCsvMan.g:1321:2: ( rule__Join__Table1Assignment_2 )
            // InternalCsvMan.g:1321:3: rule__Join__Table1Assignment_2
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
    // InternalCsvMan.g:1329:1: rule__Join__Group__3 : rule__Join__Group__3__Impl ;
    public final void rule__Join__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1333:1: ( rule__Join__Group__3__Impl )
            // InternalCsvMan.g:1334:2: rule__Join__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Join__Group__3__Impl();

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
    // InternalCsvMan.g:1340:1: rule__Join__Group__3__Impl : ( ( rule__Join__Table2Assignment_3 ) ) ;
    public final void rule__Join__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1344:1: ( ( ( rule__Join__Table2Assignment_3 ) ) )
            // InternalCsvMan.g:1345:1: ( ( rule__Join__Table2Assignment_3 ) )
            {
            // InternalCsvMan.g:1345:1: ( ( rule__Join__Table2Assignment_3 ) )
            // InternalCsvMan.g:1346:2: ( rule__Join__Table2Assignment_3 )
            {
             before(grammarAccess.getJoinAccess().getTable2Assignment_3()); 
            // InternalCsvMan.g:1347:2: ( rule__Join__Table2Assignment_3 )
            // InternalCsvMan.g:1347:3: rule__Join__Table2Assignment_3
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


    // $ANTLR start "rule__Delete__Group__0"
    // InternalCsvMan.g:1356:1: rule__Delete__Group__0 : rule__Delete__Group__0__Impl rule__Delete__Group__1 ;
    public final void rule__Delete__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1360:1: ( rule__Delete__Group__0__Impl rule__Delete__Group__1 )
            // InternalCsvMan.g:1361:2: rule__Delete__Group__0__Impl rule__Delete__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalCsvMan.g:1368:1: rule__Delete__Group__0__Impl : ( () ) ;
    public final void rule__Delete__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1372:1: ( ( () ) )
            // InternalCsvMan.g:1373:1: ( () )
            {
            // InternalCsvMan.g:1373:1: ( () )
            // InternalCsvMan.g:1374:2: ()
            {
             before(grammarAccess.getDeleteAccess().getDeleteAction_0()); 
            // InternalCsvMan.g:1375:2: ()
            // InternalCsvMan.g:1375:3: 
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
    // InternalCsvMan.g:1383:1: rule__Delete__Group__1 : rule__Delete__Group__1__Impl rule__Delete__Group__2 ;
    public final void rule__Delete__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1387:1: ( rule__Delete__Group__1__Impl rule__Delete__Group__2 )
            // InternalCsvMan.g:1388:2: rule__Delete__Group__1__Impl rule__Delete__Group__2
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
    // InternalCsvMan.g:1395:1: rule__Delete__Group__1__Impl : ( 'delete' ) ;
    public final void rule__Delete__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1399:1: ( ( 'delete' ) )
            // InternalCsvMan.g:1400:1: ( 'delete' )
            {
            // InternalCsvMan.g:1400:1: ( 'delete' )
            // InternalCsvMan.g:1401:2: 'delete'
            {
             before(grammarAccess.getDeleteAccess().getDeleteKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalCsvMan.g:1410:1: rule__Delete__Group__2 : rule__Delete__Group__2__Impl rule__Delete__Group__3 ;
    public final void rule__Delete__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1414:1: ( rule__Delete__Group__2__Impl rule__Delete__Group__3 )
            // InternalCsvMan.g:1415:2: rule__Delete__Group__2__Impl rule__Delete__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalCsvMan.g:1422:1: rule__Delete__Group__2__Impl : ( ( rule__Delete__TableAssignment_2 ) ) ;
    public final void rule__Delete__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1426:1: ( ( ( rule__Delete__TableAssignment_2 ) ) )
            // InternalCsvMan.g:1427:1: ( ( rule__Delete__TableAssignment_2 ) )
            {
            // InternalCsvMan.g:1427:1: ( ( rule__Delete__TableAssignment_2 ) )
            // InternalCsvMan.g:1428:2: ( rule__Delete__TableAssignment_2 )
            {
             before(grammarAccess.getDeleteAccess().getTableAssignment_2()); 
            // InternalCsvMan.g:1429:2: ( rule__Delete__TableAssignment_2 )
            // InternalCsvMan.g:1429:3: rule__Delete__TableAssignment_2
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
    // InternalCsvMan.g:1437:1: rule__Delete__Group__3 : rule__Delete__Group__3__Impl ;
    public final void rule__Delete__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1441:1: ( rule__Delete__Group__3__Impl )
            // InternalCsvMan.g:1442:2: rule__Delete__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Delete__Group__3__Impl();

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
    // InternalCsvMan.g:1448:1: rule__Delete__Group__3__Impl : ( ( rule__Delete__WhereAssignment_3 )? ) ;
    public final void rule__Delete__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1452:1: ( ( ( rule__Delete__WhereAssignment_3 )? ) )
            // InternalCsvMan.g:1453:1: ( ( rule__Delete__WhereAssignment_3 )? )
            {
            // InternalCsvMan.g:1453:1: ( ( rule__Delete__WhereAssignment_3 )? )
            // InternalCsvMan.g:1454:2: ( rule__Delete__WhereAssignment_3 )?
            {
             before(grammarAccess.getDeleteAccess().getWhereAssignment_3()); 
            // InternalCsvMan.g:1455:2: ( rule__Delete__WhereAssignment_3 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==27) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalCsvMan.g:1455:3: rule__Delete__WhereAssignment_3
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


    // $ANTLR start "rule__Exit__Group__0"
    // InternalCsvMan.g:1464:1: rule__Exit__Group__0 : rule__Exit__Group__0__Impl rule__Exit__Group__1 ;
    public final void rule__Exit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1468:1: ( rule__Exit__Group__0__Impl rule__Exit__Group__1 )
            // InternalCsvMan.g:1469:2: rule__Exit__Group__0__Impl rule__Exit__Group__1
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
    // InternalCsvMan.g:1476:1: rule__Exit__Group__0__Impl : ( () ) ;
    public final void rule__Exit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1480:1: ( ( () ) )
            // InternalCsvMan.g:1481:1: ( () )
            {
            // InternalCsvMan.g:1481:1: ( () )
            // InternalCsvMan.g:1482:2: ()
            {
             before(grammarAccess.getExitAccess().getExitAction_0()); 
            // InternalCsvMan.g:1483:2: ()
            // InternalCsvMan.g:1483:3: 
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
    // InternalCsvMan.g:1491:1: rule__Exit__Group__1 : rule__Exit__Group__1__Impl ;
    public final void rule__Exit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1495:1: ( rule__Exit__Group__1__Impl )
            // InternalCsvMan.g:1496:2: rule__Exit__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exit__Group__1__Impl();

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
    // InternalCsvMan.g:1502:1: rule__Exit__Group__1__Impl : ( 'exit' ) ;
    public final void rule__Exit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1506:1: ( ( 'exit' ) )
            // InternalCsvMan.g:1507:1: ( 'exit' )
            {
            // InternalCsvMan.g:1507:1: ( 'exit' )
            // InternalCsvMan.g:1508:2: 'exit'
            {
             before(grammarAccess.getExitAccess().getExitKeyword_1()); 
            match(input,26,FOLLOW_2); 
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


    // $ANTLR start "rule__Where__Group__0"
    // InternalCsvMan.g:1518:1: rule__Where__Group__0 : rule__Where__Group__0__Impl rule__Where__Group__1 ;
    public final void rule__Where__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1522:1: ( rule__Where__Group__0__Impl rule__Where__Group__1 )
            // InternalCsvMan.g:1523:2: rule__Where__Group__0__Impl rule__Where__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalCsvMan.g:1530:1: rule__Where__Group__0__Impl : ( () ) ;
    public final void rule__Where__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1534:1: ( ( () ) )
            // InternalCsvMan.g:1535:1: ( () )
            {
            // InternalCsvMan.g:1535:1: ( () )
            // InternalCsvMan.g:1536:2: ()
            {
             before(grammarAccess.getWhereAccess().getWhereAction_0()); 
            // InternalCsvMan.g:1537:2: ()
            // InternalCsvMan.g:1537:3: 
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
    // InternalCsvMan.g:1545:1: rule__Where__Group__1 : rule__Where__Group__1__Impl rule__Where__Group__2 ;
    public final void rule__Where__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1549:1: ( rule__Where__Group__1__Impl rule__Where__Group__2 )
            // InternalCsvMan.g:1550:2: rule__Where__Group__1__Impl rule__Where__Group__2
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
    // InternalCsvMan.g:1557:1: rule__Where__Group__1__Impl : ( 'where' ) ;
    public final void rule__Where__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1561:1: ( ( 'where' ) )
            // InternalCsvMan.g:1562:1: ( 'where' )
            {
            // InternalCsvMan.g:1562:1: ( 'where' )
            // InternalCsvMan.g:1563:2: 'where'
            {
             before(grammarAccess.getWhereAccess().getWhereKeyword_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalCsvMan.g:1572:1: rule__Where__Group__2 : rule__Where__Group__2__Impl ;
    public final void rule__Where__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1576:1: ( rule__Where__Group__2__Impl )
            // InternalCsvMan.g:1577:2: rule__Where__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Where__Group__2__Impl();

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
    // InternalCsvMan.g:1583:1: rule__Where__Group__2__Impl : ( ( ( rule__Where__ConditionAssignment_2 ) ) ( ( rule__Where__ConditionAssignment_2 )* ) ) ;
    public final void rule__Where__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1587:1: ( ( ( ( rule__Where__ConditionAssignment_2 ) ) ( ( rule__Where__ConditionAssignment_2 )* ) ) )
            // InternalCsvMan.g:1588:1: ( ( ( rule__Where__ConditionAssignment_2 ) ) ( ( rule__Where__ConditionAssignment_2 )* ) )
            {
            // InternalCsvMan.g:1588:1: ( ( ( rule__Where__ConditionAssignment_2 ) ) ( ( rule__Where__ConditionAssignment_2 )* ) )
            // InternalCsvMan.g:1589:2: ( ( rule__Where__ConditionAssignment_2 ) ) ( ( rule__Where__ConditionAssignment_2 )* )
            {
            // InternalCsvMan.g:1589:2: ( ( rule__Where__ConditionAssignment_2 ) )
            // InternalCsvMan.g:1590:3: ( rule__Where__ConditionAssignment_2 )
            {
             before(grammarAccess.getWhereAccess().getConditionAssignment_2()); 
            // InternalCsvMan.g:1591:3: ( rule__Where__ConditionAssignment_2 )
            // InternalCsvMan.g:1591:4: rule__Where__ConditionAssignment_2
            {
            pushFollow(FOLLOW_17);
            rule__Where__ConditionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWhereAccess().getConditionAssignment_2()); 

            }

            // InternalCsvMan.g:1594:2: ( ( rule__Where__ConditionAssignment_2 )* )
            // InternalCsvMan.g:1595:3: ( rule__Where__ConditionAssignment_2 )*
            {
             before(grammarAccess.getWhereAccess().getConditionAssignment_2()); 
            // InternalCsvMan.g:1596:3: ( rule__Where__ConditionAssignment_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_STRING && LA8_0<=RULE_ID)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCsvMan.g:1596:4: rule__Where__ConditionAssignment_2
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Where__ConditionAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getWhereAccess().getConditionAssignment_2()); 

            }


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


    // $ANTLR start "rule__Condition__Group__0"
    // InternalCsvMan.g:1606:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1610:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalCsvMan.g:1611:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
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
    // InternalCsvMan.g:1618:1: rule__Condition__Group__0__Impl : ( () ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1622:1: ( ( () ) )
            // InternalCsvMan.g:1623:1: ( () )
            {
            // InternalCsvMan.g:1623:1: ( () )
            // InternalCsvMan.g:1624:2: ()
            {
             before(grammarAccess.getConditionAccess().getConditionAction_0()); 
            // InternalCsvMan.g:1625:2: ()
            // InternalCsvMan.g:1625:3: 
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
    // InternalCsvMan.g:1633:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl rule__Condition__Group__2 ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1637:1: ( rule__Condition__Group__1__Impl rule__Condition__Group__2 )
            // InternalCsvMan.g:1638:2: rule__Condition__Group__1__Impl rule__Condition__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalCsvMan.g:1645:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__AtributAssignment_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1649:1: ( ( ( rule__Condition__AtributAssignment_1 ) ) )
            // InternalCsvMan.g:1650:1: ( ( rule__Condition__AtributAssignment_1 ) )
            {
            // InternalCsvMan.g:1650:1: ( ( rule__Condition__AtributAssignment_1 ) )
            // InternalCsvMan.g:1651:2: ( rule__Condition__AtributAssignment_1 )
            {
             before(grammarAccess.getConditionAccess().getAtributAssignment_1()); 
            // InternalCsvMan.g:1652:2: ( rule__Condition__AtributAssignment_1 )
            // InternalCsvMan.g:1652:3: rule__Condition__AtributAssignment_1
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
    // InternalCsvMan.g:1660:1: rule__Condition__Group__2 : rule__Condition__Group__2__Impl rule__Condition__Group__3 ;
    public final void rule__Condition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1664:1: ( rule__Condition__Group__2__Impl rule__Condition__Group__3 )
            // InternalCsvMan.g:1665:2: rule__Condition__Group__2__Impl rule__Condition__Group__3
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
    // InternalCsvMan.g:1672:1: rule__Condition__Group__2__Impl : ( ( rule__Condition__OperatorAssignment_2 ) ) ;
    public final void rule__Condition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1676:1: ( ( ( rule__Condition__OperatorAssignment_2 ) ) )
            // InternalCsvMan.g:1677:1: ( ( rule__Condition__OperatorAssignment_2 ) )
            {
            // InternalCsvMan.g:1677:1: ( ( rule__Condition__OperatorAssignment_2 ) )
            // InternalCsvMan.g:1678:2: ( rule__Condition__OperatorAssignment_2 )
            {
             before(grammarAccess.getConditionAccess().getOperatorAssignment_2()); 
            // InternalCsvMan.g:1679:2: ( rule__Condition__OperatorAssignment_2 )
            // InternalCsvMan.g:1679:3: rule__Condition__OperatorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Condition__OperatorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getOperatorAssignment_2()); 

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
    // InternalCsvMan.g:1687:1: rule__Condition__Group__3 : rule__Condition__Group__3__Impl ;
    public final void rule__Condition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1691:1: ( rule__Condition__Group__3__Impl )
            // InternalCsvMan.g:1692:2: rule__Condition__Group__3__Impl
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
    // InternalCsvMan.g:1698:1: rule__Condition__Group__3__Impl : ( ( rule__Condition__ValeurAssignment_3 ) ) ;
    public final void rule__Condition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1702:1: ( ( ( rule__Condition__ValeurAssignment_3 ) ) )
            // InternalCsvMan.g:1703:1: ( ( rule__Condition__ValeurAssignment_3 ) )
            {
            // InternalCsvMan.g:1703:1: ( ( rule__Condition__ValeurAssignment_3 ) )
            // InternalCsvMan.g:1704:2: ( rule__Condition__ValeurAssignment_3 )
            {
             before(grammarAccess.getConditionAccess().getValeurAssignment_3()); 
            // InternalCsvMan.g:1705:2: ( rule__Condition__ValeurAssignment_3 )
            // InternalCsvMan.g:1705:3: rule__Condition__ValeurAssignment_3
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
    // InternalCsvMan.g:1714:1: rule__Program__InstructionAssignment_1 : ( ruleInstruction ) ;
    public final void rule__Program__InstructionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1718:1: ( ( ruleInstruction ) )
            // InternalCsvMan.g:1719:2: ( ruleInstruction )
            {
            // InternalCsvMan.g:1719:2: ( ruleInstruction )
            // InternalCsvMan.g:1720:3: ruleInstruction
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
    // InternalCsvMan.g:1729:1: rule__Create__TableAssignment_2 : ( ruleEString ) ;
    public final void rule__Create__TableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1733:1: ( ( ruleEString ) )
            // InternalCsvMan.g:1734:2: ( ruleEString )
            {
            // InternalCsvMan.g:1734:2: ( ruleEString )
            // InternalCsvMan.g:1735:3: ruleEString
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
    // InternalCsvMan.g:1744:1: rule__Create__AliasAssignment_4 : ( ruleEString ) ;
    public final void rule__Create__AliasAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1748:1: ( ( ruleEString ) )
            // InternalCsvMan.g:1749:2: ( ruleEString )
            {
            // InternalCsvMan.g:1749:2: ( ruleEString )
            // InternalCsvMan.g:1750:3: ruleEString
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
    // InternalCsvMan.g:1759:1: rule__Load__TableAssignment_2 : ( ruleEString ) ;
    public final void rule__Load__TableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1763:1: ( ( ruleEString ) )
            // InternalCsvMan.g:1764:2: ( ruleEString )
            {
            // InternalCsvMan.g:1764:2: ( ruleEString )
            // InternalCsvMan.g:1765:3: ruleEString
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
    // InternalCsvMan.g:1774:1: rule__Load__AliasAssignment_4 : ( ruleEString ) ;
    public final void rule__Load__AliasAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1778:1: ( ( ruleEString ) )
            // InternalCsvMan.g:1779:2: ( ruleEString )
            {
            // InternalCsvMan.g:1779:2: ( ruleEString )
            // InternalCsvMan.g:1780:3: ruleEString
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
    // InternalCsvMan.g:1789:1: rule__Show__TableAssignment_2 : ( ruleEString ) ;
    public final void rule__Show__TableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1793:1: ( ( ruleEString ) )
            // InternalCsvMan.g:1794:2: ( ruleEString )
            {
            // InternalCsvMan.g:1794:2: ( ruleEString )
            // InternalCsvMan.g:1795:3: ruleEString
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
    // InternalCsvMan.g:1804:1: rule__Show__WhereAssignment_3 : ( ruleWhere ) ;
    public final void rule__Show__WhereAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1808:1: ( ( ruleWhere ) )
            // InternalCsvMan.g:1809:2: ( ruleWhere )
            {
            // InternalCsvMan.g:1809:2: ( ruleWhere )
            // InternalCsvMan.g:1810:3: ruleWhere
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
    // InternalCsvMan.g:1819:1: rule__Update__TableAssignment_2 : ( ruleEString ) ;
    public final void rule__Update__TableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1823:1: ( ( ruleEString ) )
            // InternalCsvMan.g:1824:2: ( ruleEString )
            {
            // InternalCsvMan.g:1824:2: ( ruleEString )
            // InternalCsvMan.g:1825:3: ruleEString
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
    // InternalCsvMan.g:1834:1: rule__Update__ParametersAssignment_4 : ( ruleEString ) ;
    public final void rule__Update__ParametersAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1838:1: ( ( ruleEString ) )
            // InternalCsvMan.g:1839:2: ( ruleEString )
            {
            // InternalCsvMan.g:1839:2: ( ruleEString )
            // InternalCsvMan.g:1840:3: ruleEString
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
    // InternalCsvMan.g:1849:1: rule__Update__WhereAssignment_5 : ( ruleWhere ) ;
    public final void rule__Update__WhereAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1853:1: ( ( ruleWhere ) )
            // InternalCsvMan.g:1854:2: ( ruleWhere )
            {
            // InternalCsvMan.g:1854:2: ( ruleWhere )
            // InternalCsvMan.g:1855:3: ruleWhere
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
    // InternalCsvMan.g:1864:1: rule__Add__TupleAssignment_2 : ( ruleEString ) ;
    public final void rule__Add__TupleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1868:1: ( ( ruleEString ) )
            // InternalCsvMan.g:1869:2: ( ruleEString )
            {
            // InternalCsvMan.g:1869:2: ( ruleEString )
            // InternalCsvMan.g:1870:3: ruleEString
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
    // InternalCsvMan.g:1879:1: rule__Add__TableAssignment_4 : ( ruleEString ) ;
    public final void rule__Add__TableAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1883:1: ( ( ruleEString ) )
            // InternalCsvMan.g:1884:2: ( ruleEString )
            {
            // InternalCsvMan.g:1884:2: ( ruleEString )
            // InternalCsvMan.g:1885:3: ruleEString
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
    // InternalCsvMan.g:1894:1: rule__Join__Table1Assignment_2 : ( ruleEString ) ;
    public final void rule__Join__Table1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1898:1: ( ( ruleEString ) )
            // InternalCsvMan.g:1899:2: ( ruleEString )
            {
            // InternalCsvMan.g:1899:2: ( ruleEString )
            // InternalCsvMan.g:1900:3: ruleEString
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
    // InternalCsvMan.g:1909:1: rule__Join__Table2Assignment_3 : ( ruleEString ) ;
    public final void rule__Join__Table2Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1913:1: ( ( ruleEString ) )
            // InternalCsvMan.g:1914:2: ( ruleEString )
            {
            // InternalCsvMan.g:1914:2: ( ruleEString )
            // InternalCsvMan.g:1915:3: ruleEString
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
    // InternalCsvMan.g:1924:1: rule__Delete__TableAssignment_2 : ( ruleEString ) ;
    public final void rule__Delete__TableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1928:1: ( ( ruleEString ) )
            // InternalCsvMan.g:1929:2: ( ruleEString )
            {
            // InternalCsvMan.g:1929:2: ( ruleEString )
            // InternalCsvMan.g:1930:3: ruleEString
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
    // InternalCsvMan.g:1939:1: rule__Delete__WhereAssignment_3 : ( ruleWhere ) ;
    public final void rule__Delete__WhereAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1943:1: ( ( ruleWhere ) )
            // InternalCsvMan.g:1944:2: ( ruleWhere )
            {
            // InternalCsvMan.g:1944:2: ( ruleWhere )
            // InternalCsvMan.g:1945:3: ruleWhere
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
    // InternalCsvMan.g:1954:1: rule__Where__ConditionAssignment_2 : ( ruleCondition ) ;
    public final void rule__Where__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1958:1: ( ( ruleCondition ) )
            // InternalCsvMan.g:1959:2: ( ruleCondition )
            {
            // InternalCsvMan.g:1959:2: ( ruleCondition )
            // InternalCsvMan.g:1960:3: ruleCondition
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


    // $ANTLR start "rule__Condition__AtributAssignment_1"
    // InternalCsvMan.g:1969:1: rule__Condition__AtributAssignment_1 : ( ruleEString ) ;
    public final void rule__Condition__AtributAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1973:1: ( ( ruleEString ) )
            // InternalCsvMan.g:1974:2: ( ruleEString )
            {
            // InternalCsvMan.g:1974:2: ( ruleEString )
            // InternalCsvMan.g:1975:3: ruleEString
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


    // $ANTLR start "rule__Condition__OperatorAssignment_2"
    // InternalCsvMan.g:1984:1: rule__Condition__OperatorAssignment_2 : ( ruleOperator ) ;
    public final void rule__Condition__OperatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1988:1: ( ( ruleOperator ) )
            // InternalCsvMan.g:1989:2: ( ruleOperator )
            {
            // InternalCsvMan.g:1989:2: ( ruleOperator )
            // InternalCsvMan.g:1990:3: ruleOperator
            {
             before(grammarAccess.getConditionAccess().getOperatorOperatorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getOperatorOperatorParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Condition__OperatorAssignment_2"


    // $ANTLR start "rule__Condition__ValeurAssignment_3"
    // InternalCsvMan.g:1999:1: rule__Condition__ValeurAssignment_3 : ( ruleEString ) ;
    public final void rule__Condition__ValeurAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2003:1: ( ( ruleEString ) )
            // InternalCsvMan.g:2004:2: ( ruleEString )
            {
            // InternalCsvMan.g:2004:2: ( ruleEString )
            // InternalCsvMan.g:2005:3: ruleEString
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000075D0000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000075D0002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000000F800L});

}