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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_OP", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_NL", "RULE_WS", "RULE_ANY_OTHER", "'='", "'copy'", "'in'", "'create'", "'('", "')'", "','", "'load'", "'as'", "'show'", "'update'", "'set'", "'add'", "'join'", "'delete'", "'exit'", "'where'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=6;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_OP=4;
    public static final int RULE_ID=8;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=9;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=5;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_NL=10;
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


    // $ANTLR start "entryRuleCopy"
    // InternalCsvMan.g:103:1: entryRuleCopy : ruleCopy EOF ;
    public final void entryRuleCopy() throws RecognitionException {
        try {
            // InternalCsvMan.g:104:1: ( ruleCopy EOF )
            // InternalCsvMan.g:105:1: ruleCopy EOF
            {
             before(grammarAccess.getCopyRule()); 
            pushFollow(FOLLOW_1);
            ruleCopy();

            state._fsp--;

             after(grammarAccess.getCopyRule()); 
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
    // $ANTLR end "entryRuleCopy"


    // $ANTLR start "ruleCopy"
    // InternalCsvMan.g:112:1: ruleCopy : ( ( rule__Copy__Group__0 ) ) ;
    public final void ruleCopy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:116:2: ( ( ( rule__Copy__Group__0 ) ) )
            // InternalCsvMan.g:117:2: ( ( rule__Copy__Group__0 ) )
            {
            // InternalCsvMan.g:117:2: ( ( rule__Copy__Group__0 ) )
            // InternalCsvMan.g:118:3: ( rule__Copy__Group__0 )
            {
             before(grammarAccess.getCopyAccess().getGroup()); 
            // InternalCsvMan.g:119:3: ( rule__Copy__Group__0 )
            // InternalCsvMan.g:119:4: rule__Copy__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Copy__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCopyAccess().getGroup()); 

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
    // $ANTLR end "ruleCopy"


    // $ANTLR start "entryRuleCreate"
    // InternalCsvMan.g:128:1: entryRuleCreate : ruleCreate EOF ;
    public final void entryRuleCreate() throws RecognitionException {
        try {
            // InternalCsvMan.g:129:1: ( ruleCreate EOF )
            // InternalCsvMan.g:130:1: ruleCreate EOF
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
    // InternalCsvMan.g:137:1: ruleCreate : ( ( rule__Create__Group__0 ) ) ;
    public final void ruleCreate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:141:2: ( ( ( rule__Create__Group__0 ) ) )
            // InternalCsvMan.g:142:2: ( ( rule__Create__Group__0 ) )
            {
            // InternalCsvMan.g:142:2: ( ( rule__Create__Group__0 ) )
            // InternalCsvMan.g:143:3: ( rule__Create__Group__0 )
            {
             before(grammarAccess.getCreateAccess().getGroup()); 
            // InternalCsvMan.g:144:3: ( rule__Create__Group__0 )
            // InternalCsvMan.g:144:4: rule__Create__Group__0
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
    // InternalCsvMan.g:153:1: entryRuleLoad : ruleLoad EOF ;
    public final void entryRuleLoad() throws RecognitionException {
        try {
            // InternalCsvMan.g:154:1: ( ruleLoad EOF )
            // InternalCsvMan.g:155:1: ruleLoad EOF
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
    // InternalCsvMan.g:162:1: ruleLoad : ( ( rule__Load__Group__0 ) ) ;
    public final void ruleLoad() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:166:2: ( ( ( rule__Load__Group__0 ) ) )
            // InternalCsvMan.g:167:2: ( ( rule__Load__Group__0 ) )
            {
            // InternalCsvMan.g:167:2: ( ( rule__Load__Group__0 ) )
            // InternalCsvMan.g:168:3: ( rule__Load__Group__0 )
            {
             before(grammarAccess.getLoadAccess().getGroup()); 
            // InternalCsvMan.g:169:3: ( rule__Load__Group__0 )
            // InternalCsvMan.g:169:4: rule__Load__Group__0
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
    // InternalCsvMan.g:178:1: entryRuleShow : ruleShow EOF ;
    public final void entryRuleShow() throws RecognitionException {
        try {
            // InternalCsvMan.g:179:1: ( ruleShow EOF )
            // InternalCsvMan.g:180:1: ruleShow EOF
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
    // InternalCsvMan.g:187:1: ruleShow : ( ( rule__Show__Group__0 ) ) ;
    public final void ruleShow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:191:2: ( ( ( rule__Show__Group__0 ) ) )
            // InternalCsvMan.g:192:2: ( ( rule__Show__Group__0 ) )
            {
            // InternalCsvMan.g:192:2: ( ( rule__Show__Group__0 ) )
            // InternalCsvMan.g:193:3: ( rule__Show__Group__0 )
            {
             before(grammarAccess.getShowAccess().getGroup()); 
            // InternalCsvMan.g:194:3: ( rule__Show__Group__0 )
            // InternalCsvMan.g:194:4: rule__Show__Group__0
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
    // InternalCsvMan.g:203:1: entryRuleUpdate : ruleUpdate EOF ;
    public final void entryRuleUpdate() throws RecognitionException {
        try {
            // InternalCsvMan.g:204:1: ( ruleUpdate EOF )
            // InternalCsvMan.g:205:1: ruleUpdate EOF
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
    // InternalCsvMan.g:212:1: ruleUpdate : ( ( rule__Update__Group__0 ) ) ;
    public final void ruleUpdate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:216:2: ( ( ( rule__Update__Group__0 ) ) )
            // InternalCsvMan.g:217:2: ( ( rule__Update__Group__0 ) )
            {
            // InternalCsvMan.g:217:2: ( ( rule__Update__Group__0 ) )
            // InternalCsvMan.g:218:3: ( rule__Update__Group__0 )
            {
             before(grammarAccess.getUpdateAccess().getGroup()); 
            // InternalCsvMan.g:219:3: ( rule__Update__Group__0 )
            // InternalCsvMan.g:219:4: rule__Update__Group__0
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
    // InternalCsvMan.g:228:1: entryRuleAdd : ruleAdd EOF ;
    public final void entryRuleAdd() throws RecognitionException {
        try {
            // InternalCsvMan.g:229:1: ( ruleAdd EOF )
            // InternalCsvMan.g:230:1: ruleAdd EOF
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
    // InternalCsvMan.g:237:1: ruleAdd : ( ( rule__Add__Group__0 ) ) ;
    public final void ruleAdd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:241:2: ( ( ( rule__Add__Group__0 ) ) )
            // InternalCsvMan.g:242:2: ( ( rule__Add__Group__0 ) )
            {
            // InternalCsvMan.g:242:2: ( ( rule__Add__Group__0 ) )
            // InternalCsvMan.g:243:3: ( rule__Add__Group__0 )
            {
             before(grammarAccess.getAddAccess().getGroup()); 
            // InternalCsvMan.g:244:3: ( rule__Add__Group__0 )
            // InternalCsvMan.g:244:4: rule__Add__Group__0
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
    // InternalCsvMan.g:253:1: entryRuleJoin : ruleJoin EOF ;
    public final void entryRuleJoin() throws RecognitionException {
        try {
            // InternalCsvMan.g:254:1: ( ruleJoin EOF )
            // InternalCsvMan.g:255:1: ruleJoin EOF
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
    // InternalCsvMan.g:262:1: ruleJoin : ( ( rule__Join__Group__0 ) ) ;
    public final void ruleJoin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:266:2: ( ( ( rule__Join__Group__0 ) ) )
            // InternalCsvMan.g:267:2: ( ( rule__Join__Group__0 ) )
            {
            // InternalCsvMan.g:267:2: ( ( rule__Join__Group__0 ) )
            // InternalCsvMan.g:268:3: ( rule__Join__Group__0 )
            {
             before(grammarAccess.getJoinAccess().getGroup()); 
            // InternalCsvMan.g:269:3: ( rule__Join__Group__0 )
            // InternalCsvMan.g:269:4: rule__Join__Group__0
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
    // InternalCsvMan.g:278:1: entryRuleDelete : ruleDelete EOF ;
    public final void entryRuleDelete() throws RecognitionException {
        try {
            // InternalCsvMan.g:279:1: ( ruleDelete EOF )
            // InternalCsvMan.g:280:1: ruleDelete EOF
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
    // InternalCsvMan.g:287:1: ruleDelete : ( ( rule__Delete__Group__0 ) ) ;
    public final void ruleDelete() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:291:2: ( ( ( rule__Delete__Group__0 ) ) )
            // InternalCsvMan.g:292:2: ( ( rule__Delete__Group__0 ) )
            {
            // InternalCsvMan.g:292:2: ( ( rule__Delete__Group__0 ) )
            // InternalCsvMan.g:293:3: ( rule__Delete__Group__0 )
            {
             before(grammarAccess.getDeleteAccess().getGroup()); 
            // InternalCsvMan.g:294:3: ( rule__Delete__Group__0 )
            // InternalCsvMan.g:294:4: rule__Delete__Group__0
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
    // InternalCsvMan.g:303:1: entryRuleExit : ruleExit EOF ;
    public final void entryRuleExit() throws RecognitionException {
        try {
            // InternalCsvMan.g:304:1: ( ruleExit EOF )
            // InternalCsvMan.g:305:1: ruleExit EOF
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
    // InternalCsvMan.g:312:1: ruleExit : ( ( rule__Exit__Group__0 ) ) ;
    public final void ruleExit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:316:2: ( ( ( rule__Exit__Group__0 ) ) )
            // InternalCsvMan.g:317:2: ( ( rule__Exit__Group__0 ) )
            {
            // InternalCsvMan.g:317:2: ( ( rule__Exit__Group__0 ) )
            // InternalCsvMan.g:318:3: ( rule__Exit__Group__0 )
            {
             before(grammarAccess.getExitAccess().getGroup()); 
            // InternalCsvMan.g:319:3: ( rule__Exit__Group__0 )
            // InternalCsvMan.g:319:4: rule__Exit__Group__0
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
    // InternalCsvMan.g:328:1: entryRuleWhere : ruleWhere EOF ;
    public final void entryRuleWhere() throws RecognitionException {
        try {
            // InternalCsvMan.g:329:1: ( ruleWhere EOF )
            // InternalCsvMan.g:330:1: ruleWhere EOF
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
    // InternalCsvMan.g:337:1: ruleWhere : ( ( rule__Where__Group__0 ) ) ;
    public final void ruleWhere() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:341:2: ( ( ( rule__Where__Group__0 ) ) )
            // InternalCsvMan.g:342:2: ( ( rule__Where__Group__0 ) )
            {
            // InternalCsvMan.g:342:2: ( ( rule__Where__Group__0 ) )
            // InternalCsvMan.g:343:3: ( rule__Where__Group__0 )
            {
             before(grammarAccess.getWhereAccess().getGroup()); 
            // InternalCsvMan.g:344:3: ( rule__Where__Group__0 )
            // InternalCsvMan.g:344:4: rule__Where__Group__0
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
    // InternalCsvMan.g:353:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalCsvMan.g:354:1: ( ruleCondition EOF )
            // InternalCsvMan.g:355:1: ruleCondition EOF
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
    // InternalCsvMan.g:362:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:366:2: ( ( ( rule__Condition__Group__0 ) ) )
            // InternalCsvMan.g:367:2: ( ( rule__Condition__Group__0 ) )
            {
            // InternalCsvMan.g:367:2: ( ( rule__Condition__Group__0 ) )
            // InternalCsvMan.g:368:3: ( rule__Condition__Group__0 )
            {
             before(grammarAccess.getConditionAccess().getGroup()); 
            // InternalCsvMan.g:369:3: ( rule__Condition__Group__0 )
            // InternalCsvMan.g:369:4: rule__Condition__Group__0
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


    // $ANTLR start "entryRuleParameter"
    // InternalCsvMan.g:378:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalCsvMan.g:379:1: ( ruleParameter EOF )
            // InternalCsvMan.g:380:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalCsvMan.g:387:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:391:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalCsvMan.g:392:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalCsvMan.g:392:2: ( ( rule__Parameter__Group__0 ) )
            // InternalCsvMan.g:393:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalCsvMan.g:394:3: ( rule__Parameter__Group__0 )
            // InternalCsvMan.g:394:4: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleComment"
    // InternalCsvMan.g:403:1: entryRuleComment : ruleComment EOF ;
    public final void entryRuleComment() throws RecognitionException {
        try {
            // InternalCsvMan.g:404:1: ( ruleComment EOF )
            // InternalCsvMan.g:405:1: ruleComment EOF
            {
             before(grammarAccess.getCommentRule()); 
            pushFollow(FOLLOW_1);
            ruleComment();

            state._fsp--;

             after(grammarAccess.getCommentRule()); 
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
    // $ANTLR end "entryRuleComment"


    // $ANTLR start "ruleComment"
    // InternalCsvMan.g:412:1: ruleComment : ( ( rule__Comment__Alternatives ) ) ;
    public final void ruleComment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:416:2: ( ( ( rule__Comment__Alternatives ) ) )
            // InternalCsvMan.g:417:2: ( ( rule__Comment__Alternatives ) )
            {
            // InternalCsvMan.g:417:2: ( ( rule__Comment__Alternatives ) )
            // InternalCsvMan.g:418:3: ( rule__Comment__Alternatives )
            {
             before(grammarAccess.getCommentAccess().getAlternatives()); 
            // InternalCsvMan.g:419:3: ( rule__Comment__Alternatives )
            // InternalCsvMan.g:419:4: rule__Comment__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Comment__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCommentAccess().getAlternatives()); 

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
    // $ANTLR end "ruleComment"


    // $ANTLR start "entryRuleEString"
    // InternalCsvMan.g:428:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalCsvMan.g:429:1: ( ruleEString EOF )
            // InternalCsvMan.g:430:1: ruleEString EOF
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
    // InternalCsvMan.g:437:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:441:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalCsvMan.g:442:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalCsvMan.g:442:2: ( ( rule__EString__Alternatives ) )
            // InternalCsvMan.g:443:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalCsvMan.g:444:3: ( rule__EString__Alternatives )
            // InternalCsvMan.g:444:4: rule__EString__Alternatives
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
    // InternalCsvMan.g:452:1: rule__Instruction__Alternatives : ( ( ruleCreate ) | ( ruleLoad ) | ( ruleShow ) | ( ruleUpdate ) | ( ruleAdd ) | ( ruleJoin ) | ( ruleDelete ) | ( ruleExit ) | ( ruleComment ) | ( ruleCopy ) );
    public final void rule__Instruction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:456:1: ( ( ruleCreate ) | ( ruleLoad ) | ( ruleShow ) | ( ruleUpdate ) | ( ruleAdd ) | ( ruleJoin ) | ( ruleDelete ) | ( ruleExit ) | ( ruleComment ) | ( ruleCopy ) )
            int alt1=10;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt1=1;
                }
                break;
            case 20:
                {
                alt1=2;
                }
                break;
            case 22:
                {
                alt1=3;
                }
                break;
            case 23:
                {
                alt1=4;
                }
                break;
            case 25:
                {
                alt1=5;
                }
                break;
            case 26:
                {
                alt1=6;
                }
                break;
            case 27:
                {
                alt1=7;
                }
                break;
            case 28:
                {
                alt1=8;
                }
                break;
            case RULE_ML_COMMENT:
            case RULE_SL_COMMENT:
                {
                alt1=9;
                }
                break;
            case 14:
                {
                alt1=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalCsvMan.g:457:2: ( ruleCreate )
                    {
                    // InternalCsvMan.g:457:2: ( ruleCreate )
                    // InternalCsvMan.g:458:3: ruleCreate
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
                    // InternalCsvMan.g:463:2: ( ruleLoad )
                    {
                    // InternalCsvMan.g:463:2: ( ruleLoad )
                    // InternalCsvMan.g:464:3: ruleLoad
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
                    // InternalCsvMan.g:469:2: ( ruleShow )
                    {
                    // InternalCsvMan.g:469:2: ( ruleShow )
                    // InternalCsvMan.g:470:3: ruleShow
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
                    // InternalCsvMan.g:475:2: ( ruleUpdate )
                    {
                    // InternalCsvMan.g:475:2: ( ruleUpdate )
                    // InternalCsvMan.g:476:3: ruleUpdate
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
                    // InternalCsvMan.g:481:2: ( ruleAdd )
                    {
                    // InternalCsvMan.g:481:2: ( ruleAdd )
                    // InternalCsvMan.g:482:3: ruleAdd
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
                    // InternalCsvMan.g:487:2: ( ruleJoin )
                    {
                    // InternalCsvMan.g:487:2: ( ruleJoin )
                    // InternalCsvMan.g:488:3: ruleJoin
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
                    // InternalCsvMan.g:493:2: ( ruleDelete )
                    {
                    // InternalCsvMan.g:493:2: ( ruleDelete )
                    // InternalCsvMan.g:494:3: ruleDelete
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
                    // InternalCsvMan.g:499:2: ( ruleExit )
                    {
                    // InternalCsvMan.g:499:2: ( ruleExit )
                    // InternalCsvMan.g:500:3: ruleExit
                    {
                     before(grammarAccess.getInstructionAccess().getExitParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleExit();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getExitParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalCsvMan.g:505:2: ( ruleComment )
                    {
                    // InternalCsvMan.g:505:2: ( ruleComment )
                    // InternalCsvMan.g:506:3: ruleComment
                    {
                     before(grammarAccess.getInstructionAccess().getCommentParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleComment();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getCommentParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalCsvMan.g:511:2: ( ruleCopy )
                    {
                    // InternalCsvMan.g:511:2: ( ruleCopy )
                    // InternalCsvMan.g:512:3: ruleCopy
                    {
                     before(grammarAccess.getInstructionAccess().getCopyParserRuleCall_9()); 
                    pushFollow(FOLLOW_2);
                    ruleCopy();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getCopyParserRuleCall_9()); 

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


    // $ANTLR start "rule__Condition__Alternatives_2"
    // InternalCsvMan.g:521:1: rule__Condition__Alternatives_2 : ( ( '=' ) | ( RULE_OP ) );
    public final void rule__Condition__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:525:1: ( ( '=' ) | ( RULE_OP ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_OP) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalCsvMan.g:526:2: ( '=' )
                    {
                    // InternalCsvMan.g:526:2: ( '=' )
                    // InternalCsvMan.g:527:3: '='
                    {
                     before(grammarAccess.getConditionAccess().getEqualsSignKeyword_2_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getEqualsSignKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCsvMan.g:532:2: ( RULE_OP )
                    {
                    // InternalCsvMan.g:532:2: ( RULE_OP )
                    // InternalCsvMan.g:533:3: RULE_OP
                    {
                     before(grammarAccess.getConditionAccess().getOPTerminalRuleCall_2_1()); 
                    match(input,RULE_OP,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getOPTerminalRuleCall_2_1()); 

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
    // $ANTLR end "rule__Condition__Alternatives_2"


    // $ANTLR start "rule__Comment__Alternatives"
    // InternalCsvMan.g:542:1: rule__Comment__Alternatives : ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) );
    public final void rule__Comment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:546:1: ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ML_COMMENT) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_SL_COMMENT) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalCsvMan.g:547:2: ( RULE_ML_COMMENT )
                    {
                    // InternalCsvMan.g:547:2: ( RULE_ML_COMMENT )
                    // InternalCsvMan.g:548:3: RULE_ML_COMMENT
                    {
                     before(grammarAccess.getCommentAccess().getML_COMMENTTerminalRuleCall_0()); 
                    match(input,RULE_ML_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getCommentAccess().getML_COMMENTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCsvMan.g:553:2: ( RULE_SL_COMMENT )
                    {
                    // InternalCsvMan.g:553:2: ( RULE_SL_COMMENT )
                    // InternalCsvMan.g:554:3: RULE_SL_COMMENT
                    {
                     before(grammarAccess.getCommentAccess().getSL_COMMENTTerminalRuleCall_1()); 
                    match(input,RULE_SL_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getCommentAccess().getSL_COMMENTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__Comment__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalCsvMan.g:563:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) | ( RULE_INT ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:567:1: ( ( RULE_STRING ) | ( RULE_ID ) | ( RULE_INT ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt4=1;
                }
                break;
            case RULE_ID:
                {
                alt4=2;
                }
                break;
            case RULE_INT:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalCsvMan.g:568:2: ( RULE_STRING )
                    {
                    // InternalCsvMan.g:568:2: ( RULE_STRING )
                    // InternalCsvMan.g:569:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCsvMan.g:574:2: ( RULE_ID )
                    {
                    // InternalCsvMan.g:574:2: ( RULE_ID )
                    // InternalCsvMan.g:575:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCsvMan.g:580:2: ( RULE_INT )
                    {
                    // InternalCsvMan.g:580:2: ( RULE_INT )
                    // InternalCsvMan.g:581:3: RULE_INT
                    {
                     before(grammarAccess.getEStringAccess().getINTTerminalRuleCall_2()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getINTTerminalRuleCall_2()); 

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
    // InternalCsvMan.g:590:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:594:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalCsvMan.g:595:2: rule__Program__Group__0__Impl rule__Program__Group__1
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
    // InternalCsvMan.g:602:1: rule__Program__Group__0__Impl : ( () ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:606:1: ( ( () ) )
            // InternalCsvMan.g:607:1: ( () )
            {
            // InternalCsvMan.g:607:1: ( () )
            // InternalCsvMan.g:608:2: ()
            {
             before(grammarAccess.getProgramAccess().getProgramAction_0()); 
            // InternalCsvMan.g:609:2: ()
            // InternalCsvMan.g:609:3: 
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
    // InternalCsvMan.g:617:1: rule__Program__Group__1 : rule__Program__Group__1__Impl ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:621:1: ( rule__Program__Group__1__Impl )
            // InternalCsvMan.g:622:2: rule__Program__Group__1__Impl
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
    // InternalCsvMan.g:628:1: rule__Program__Group__1__Impl : ( ( rule__Program__InstructionAssignment_1 )* ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:632:1: ( ( ( rule__Program__InstructionAssignment_1 )* ) )
            // InternalCsvMan.g:633:1: ( ( rule__Program__InstructionAssignment_1 )* )
            {
            // InternalCsvMan.g:633:1: ( ( rule__Program__InstructionAssignment_1 )* )
            // InternalCsvMan.g:634:2: ( rule__Program__InstructionAssignment_1 )*
            {
             before(grammarAccess.getProgramAccess().getInstructionAssignment_1()); 
            // InternalCsvMan.g:635:2: ( rule__Program__InstructionAssignment_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=RULE_ML_COMMENT && LA5_0<=RULE_SL_COMMENT)||LA5_0==14||LA5_0==16||LA5_0==20||(LA5_0>=22 && LA5_0<=23)||(LA5_0>=25 && LA5_0<=28)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalCsvMan.g:635:3: rule__Program__InstructionAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Program__InstructionAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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


    // $ANTLR start "rule__Copy__Group__0"
    // InternalCsvMan.g:644:1: rule__Copy__Group__0 : rule__Copy__Group__0__Impl rule__Copy__Group__1 ;
    public final void rule__Copy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:648:1: ( rule__Copy__Group__0__Impl rule__Copy__Group__1 )
            // InternalCsvMan.g:649:2: rule__Copy__Group__0__Impl rule__Copy__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Copy__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Copy__Group__1();

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
    // $ANTLR end "rule__Copy__Group__0"


    // $ANTLR start "rule__Copy__Group__0__Impl"
    // InternalCsvMan.g:656:1: rule__Copy__Group__0__Impl : ( () ) ;
    public final void rule__Copy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:660:1: ( ( () ) )
            // InternalCsvMan.g:661:1: ( () )
            {
            // InternalCsvMan.g:661:1: ( () )
            // InternalCsvMan.g:662:2: ()
            {
             before(grammarAccess.getCopyAccess().getCopyAction_0()); 
            // InternalCsvMan.g:663:2: ()
            // InternalCsvMan.g:663:3: 
            {
            }

             after(grammarAccess.getCopyAccess().getCopyAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Copy__Group__0__Impl"


    // $ANTLR start "rule__Copy__Group__1"
    // InternalCsvMan.g:671:1: rule__Copy__Group__1 : rule__Copy__Group__1__Impl rule__Copy__Group__2 ;
    public final void rule__Copy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:675:1: ( rule__Copy__Group__1__Impl rule__Copy__Group__2 )
            // InternalCsvMan.g:676:2: rule__Copy__Group__1__Impl rule__Copy__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Copy__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Copy__Group__2();

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
    // $ANTLR end "rule__Copy__Group__1"


    // $ANTLR start "rule__Copy__Group__1__Impl"
    // InternalCsvMan.g:683:1: rule__Copy__Group__1__Impl : ( 'copy' ) ;
    public final void rule__Copy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:687:1: ( ( 'copy' ) )
            // InternalCsvMan.g:688:1: ( 'copy' )
            {
            // InternalCsvMan.g:688:1: ( 'copy' )
            // InternalCsvMan.g:689:2: 'copy'
            {
             before(grammarAccess.getCopyAccess().getCopyKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getCopyAccess().getCopyKeyword_1()); 

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
    // $ANTLR end "rule__Copy__Group__1__Impl"


    // $ANTLR start "rule__Copy__Group__2"
    // InternalCsvMan.g:698:1: rule__Copy__Group__2 : rule__Copy__Group__2__Impl rule__Copy__Group__3 ;
    public final void rule__Copy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:702:1: ( rule__Copy__Group__2__Impl rule__Copy__Group__3 )
            // InternalCsvMan.g:703:2: rule__Copy__Group__2__Impl rule__Copy__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Copy__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Copy__Group__3();

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
    // $ANTLR end "rule__Copy__Group__2"


    // $ANTLR start "rule__Copy__Group__2__Impl"
    // InternalCsvMan.g:710:1: rule__Copy__Group__2__Impl : ( ( rule__Copy__AliasAssignment_2 ) ) ;
    public final void rule__Copy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:714:1: ( ( ( rule__Copy__AliasAssignment_2 ) ) )
            // InternalCsvMan.g:715:1: ( ( rule__Copy__AliasAssignment_2 ) )
            {
            // InternalCsvMan.g:715:1: ( ( rule__Copy__AliasAssignment_2 ) )
            // InternalCsvMan.g:716:2: ( rule__Copy__AliasAssignment_2 )
            {
             before(grammarAccess.getCopyAccess().getAliasAssignment_2()); 
            // InternalCsvMan.g:717:2: ( rule__Copy__AliasAssignment_2 )
            // InternalCsvMan.g:717:3: rule__Copy__AliasAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Copy__AliasAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCopyAccess().getAliasAssignment_2()); 

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
    // $ANTLR end "rule__Copy__Group__2__Impl"


    // $ANTLR start "rule__Copy__Group__3"
    // InternalCsvMan.g:725:1: rule__Copy__Group__3 : rule__Copy__Group__3__Impl rule__Copy__Group__4 ;
    public final void rule__Copy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:729:1: ( rule__Copy__Group__3__Impl rule__Copy__Group__4 )
            // InternalCsvMan.g:730:2: rule__Copy__Group__3__Impl rule__Copy__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Copy__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Copy__Group__4();

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
    // $ANTLR end "rule__Copy__Group__3"


    // $ANTLR start "rule__Copy__Group__3__Impl"
    // InternalCsvMan.g:737:1: rule__Copy__Group__3__Impl : ( 'in' ) ;
    public final void rule__Copy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:741:1: ( ( 'in' ) )
            // InternalCsvMan.g:742:1: ( 'in' )
            {
            // InternalCsvMan.g:742:1: ( 'in' )
            // InternalCsvMan.g:743:2: 'in'
            {
             before(grammarAccess.getCopyAccess().getInKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getCopyAccess().getInKeyword_3()); 

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
    // $ANTLR end "rule__Copy__Group__3__Impl"


    // $ANTLR start "rule__Copy__Group__4"
    // InternalCsvMan.g:752:1: rule__Copy__Group__4 : rule__Copy__Group__4__Impl rule__Copy__Group__5 ;
    public final void rule__Copy__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:756:1: ( rule__Copy__Group__4__Impl rule__Copy__Group__5 )
            // InternalCsvMan.g:757:2: rule__Copy__Group__4__Impl rule__Copy__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Copy__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Copy__Group__5();

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
    // $ANTLR end "rule__Copy__Group__4"


    // $ANTLR start "rule__Copy__Group__4__Impl"
    // InternalCsvMan.g:764:1: rule__Copy__Group__4__Impl : ( ( rule__Copy__TableAssignment_4 ) ) ;
    public final void rule__Copy__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:768:1: ( ( ( rule__Copy__TableAssignment_4 ) ) )
            // InternalCsvMan.g:769:1: ( ( rule__Copy__TableAssignment_4 ) )
            {
            // InternalCsvMan.g:769:1: ( ( rule__Copy__TableAssignment_4 ) )
            // InternalCsvMan.g:770:2: ( rule__Copy__TableAssignment_4 )
            {
             before(grammarAccess.getCopyAccess().getTableAssignment_4()); 
            // InternalCsvMan.g:771:2: ( rule__Copy__TableAssignment_4 )
            // InternalCsvMan.g:771:3: rule__Copy__TableAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Copy__TableAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCopyAccess().getTableAssignment_4()); 

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
    // $ANTLR end "rule__Copy__Group__4__Impl"


    // $ANTLR start "rule__Copy__Group__5"
    // InternalCsvMan.g:779:1: rule__Copy__Group__5 : rule__Copy__Group__5__Impl ;
    public final void rule__Copy__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:783:1: ( rule__Copy__Group__5__Impl )
            // InternalCsvMan.g:784:2: rule__Copy__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Copy__Group__5__Impl();

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
    // $ANTLR end "rule__Copy__Group__5"


    // $ANTLR start "rule__Copy__Group__5__Impl"
    // InternalCsvMan.g:790:1: rule__Copy__Group__5__Impl : ( RULE_NL ) ;
    public final void rule__Copy__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:794:1: ( ( RULE_NL ) )
            // InternalCsvMan.g:795:1: ( RULE_NL )
            {
            // InternalCsvMan.g:795:1: ( RULE_NL )
            // InternalCsvMan.g:796:2: RULE_NL
            {
             before(grammarAccess.getCopyAccess().getNLTerminalRuleCall_5()); 
            match(input,RULE_NL,FOLLOW_2); 
             after(grammarAccess.getCopyAccess().getNLTerminalRuleCall_5()); 

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
    // $ANTLR end "rule__Copy__Group__5__Impl"


    // $ANTLR start "rule__Create__Group__0"
    // InternalCsvMan.g:806:1: rule__Create__Group__0 : rule__Create__Group__0__Impl rule__Create__Group__1 ;
    public final void rule__Create__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:810:1: ( rule__Create__Group__0__Impl rule__Create__Group__1 )
            // InternalCsvMan.g:811:2: rule__Create__Group__0__Impl rule__Create__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalCsvMan.g:818:1: rule__Create__Group__0__Impl : ( () ) ;
    public final void rule__Create__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:822:1: ( ( () ) )
            // InternalCsvMan.g:823:1: ( () )
            {
            // InternalCsvMan.g:823:1: ( () )
            // InternalCsvMan.g:824:2: ()
            {
             before(grammarAccess.getCreateAccess().getCreateAction_0()); 
            // InternalCsvMan.g:825:2: ()
            // InternalCsvMan.g:825:3: 
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
    // InternalCsvMan.g:833:1: rule__Create__Group__1 : rule__Create__Group__1__Impl rule__Create__Group__2 ;
    public final void rule__Create__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:837:1: ( rule__Create__Group__1__Impl rule__Create__Group__2 )
            // InternalCsvMan.g:838:2: rule__Create__Group__1__Impl rule__Create__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalCsvMan.g:845:1: rule__Create__Group__1__Impl : ( 'create' ) ;
    public final void rule__Create__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:849:1: ( ( 'create' ) )
            // InternalCsvMan.g:850:1: ( 'create' )
            {
            // InternalCsvMan.g:850:1: ( 'create' )
            // InternalCsvMan.g:851:2: 'create'
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
    // InternalCsvMan.g:860:1: rule__Create__Group__2 : rule__Create__Group__2__Impl rule__Create__Group__3 ;
    public final void rule__Create__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:864:1: ( rule__Create__Group__2__Impl rule__Create__Group__3 )
            // InternalCsvMan.g:865:2: rule__Create__Group__2__Impl rule__Create__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalCsvMan.g:872:1: rule__Create__Group__2__Impl : ( ( rule__Create__TableAssignment_2 ) ) ;
    public final void rule__Create__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:876:1: ( ( ( rule__Create__TableAssignment_2 ) ) )
            // InternalCsvMan.g:877:1: ( ( rule__Create__TableAssignment_2 ) )
            {
            // InternalCsvMan.g:877:1: ( ( rule__Create__TableAssignment_2 ) )
            // InternalCsvMan.g:878:2: ( rule__Create__TableAssignment_2 )
            {
             before(grammarAccess.getCreateAccess().getTableAssignment_2()); 
            // InternalCsvMan.g:879:2: ( rule__Create__TableAssignment_2 )
            // InternalCsvMan.g:879:3: rule__Create__TableAssignment_2
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
    // InternalCsvMan.g:887:1: rule__Create__Group__3 : rule__Create__Group__3__Impl rule__Create__Group__4 ;
    public final void rule__Create__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:891:1: ( rule__Create__Group__3__Impl rule__Create__Group__4 )
            // InternalCsvMan.g:892:2: rule__Create__Group__3__Impl rule__Create__Group__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalCsvMan.g:899:1: rule__Create__Group__3__Impl : ( '(' ) ;
    public final void rule__Create__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:903:1: ( ( '(' ) )
            // InternalCsvMan.g:904:1: ( '(' )
            {
            // InternalCsvMan.g:904:1: ( '(' )
            // InternalCsvMan.g:905:2: '('
            {
             before(grammarAccess.getCreateAccess().getLeftParenthesisKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCreateAccess().getLeftParenthesisKeyword_3()); 

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
    // InternalCsvMan.g:914:1: rule__Create__Group__4 : rule__Create__Group__4__Impl rule__Create__Group__5 ;
    public final void rule__Create__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:918:1: ( rule__Create__Group__4__Impl rule__Create__Group__5 )
            // InternalCsvMan.g:919:2: rule__Create__Group__4__Impl rule__Create__Group__5
            {
            pushFollow(FOLLOW_10);
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
    // InternalCsvMan.g:926:1: rule__Create__Group__4__Impl : ( ( rule__Create__ColonneAssignment_4 ) ) ;
    public final void rule__Create__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:930:1: ( ( ( rule__Create__ColonneAssignment_4 ) ) )
            // InternalCsvMan.g:931:1: ( ( rule__Create__ColonneAssignment_4 ) )
            {
            // InternalCsvMan.g:931:1: ( ( rule__Create__ColonneAssignment_4 ) )
            // InternalCsvMan.g:932:2: ( rule__Create__ColonneAssignment_4 )
            {
             before(grammarAccess.getCreateAccess().getColonneAssignment_4()); 
            // InternalCsvMan.g:933:2: ( rule__Create__ColonneAssignment_4 )
            // InternalCsvMan.g:933:3: rule__Create__ColonneAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Create__ColonneAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCreateAccess().getColonneAssignment_4()); 

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
    // InternalCsvMan.g:941:1: rule__Create__Group__5 : rule__Create__Group__5__Impl rule__Create__Group__6 ;
    public final void rule__Create__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:945:1: ( rule__Create__Group__5__Impl rule__Create__Group__6 )
            // InternalCsvMan.g:946:2: rule__Create__Group__5__Impl rule__Create__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__Create__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Create__Group__6();

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
    // InternalCsvMan.g:953:1: rule__Create__Group__5__Impl : ( ( rule__Create__Group_5__0 )* ) ;
    public final void rule__Create__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:957:1: ( ( ( rule__Create__Group_5__0 )* ) )
            // InternalCsvMan.g:958:1: ( ( rule__Create__Group_5__0 )* )
            {
            // InternalCsvMan.g:958:1: ( ( rule__Create__Group_5__0 )* )
            // InternalCsvMan.g:959:2: ( rule__Create__Group_5__0 )*
            {
             before(grammarAccess.getCreateAccess().getGroup_5()); 
            // InternalCsvMan.g:960:2: ( rule__Create__Group_5__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCsvMan.g:960:3: rule__Create__Group_5__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Create__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getCreateAccess().getGroup_5()); 

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


    // $ANTLR start "rule__Create__Group__6"
    // InternalCsvMan.g:968:1: rule__Create__Group__6 : rule__Create__Group__6__Impl rule__Create__Group__7 ;
    public final void rule__Create__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:972:1: ( rule__Create__Group__6__Impl rule__Create__Group__7 )
            // InternalCsvMan.g:973:2: rule__Create__Group__6__Impl rule__Create__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__Create__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Create__Group__7();

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
    // $ANTLR end "rule__Create__Group__6"


    // $ANTLR start "rule__Create__Group__6__Impl"
    // InternalCsvMan.g:980:1: rule__Create__Group__6__Impl : ( ')' ) ;
    public final void rule__Create__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:984:1: ( ( ')' ) )
            // InternalCsvMan.g:985:1: ( ')' )
            {
            // InternalCsvMan.g:985:1: ( ')' )
            // InternalCsvMan.g:986:2: ')'
            {
             before(grammarAccess.getCreateAccess().getRightParenthesisKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCreateAccess().getRightParenthesisKeyword_6()); 

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
    // $ANTLR end "rule__Create__Group__6__Impl"


    // $ANTLR start "rule__Create__Group__7"
    // InternalCsvMan.g:995:1: rule__Create__Group__7 : rule__Create__Group__7__Impl ;
    public final void rule__Create__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:999:1: ( rule__Create__Group__7__Impl )
            // InternalCsvMan.g:1000:2: rule__Create__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Create__Group__7__Impl();

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
    // $ANTLR end "rule__Create__Group__7"


    // $ANTLR start "rule__Create__Group__7__Impl"
    // InternalCsvMan.g:1006:1: rule__Create__Group__7__Impl : ( RULE_NL ) ;
    public final void rule__Create__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1010:1: ( ( RULE_NL ) )
            // InternalCsvMan.g:1011:1: ( RULE_NL )
            {
            // InternalCsvMan.g:1011:1: ( RULE_NL )
            // InternalCsvMan.g:1012:2: RULE_NL
            {
             before(grammarAccess.getCreateAccess().getNLTerminalRuleCall_7()); 
            match(input,RULE_NL,FOLLOW_2); 
             after(grammarAccess.getCreateAccess().getNLTerminalRuleCall_7()); 

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
    // $ANTLR end "rule__Create__Group__7__Impl"


    // $ANTLR start "rule__Create__Group_5__0"
    // InternalCsvMan.g:1022:1: rule__Create__Group_5__0 : rule__Create__Group_5__0__Impl rule__Create__Group_5__1 ;
    public final void rule__Create__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1026:1: ( rule__Create__Group_5__0__Impl rule__Create__Group_5__1 )
            // InternalCsvMan.g:1027:2: rule__Create__Group_5__0__Impl rule__Create__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__Create__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Create__Group_5__1();

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
    // $ANTLR end "rule__Create__Group_5__0"


    // $ANTLR start "rule__Create__Group_5__0__Impl"
    // InternalCsvMan.g:1034:1: rule__Create__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Create__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1038:1: ( ( ',' ) )
            // InternalCsvMan.g:1039:1: ( ',' )
            {
            // InternalCsvMan.g:1039:1: ( ',' )
            // InternalCsvMan.g:1040:2: ','
            {
             before(grammarAccess.getCreateAccess().getCommaKeyword_5_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCreateAccess().getCommaKeyword_5_0()); 

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
    // $ANTLR end "rule__Create__Group_5__0__Impl"


    // $ANTLR start "rule__Create__Group_5__1"
    // InternalCsvMan.g:1049:1: rule__Create__Group_5__1 : rule__Create__Group_5__1__Impl ;
    public final void rule__Create__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1053:1: ( rule__Create__Group_5__1__Impl )
            // InternalCsvMan.g:1054:2: rule__Create__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Create__Group_5__1__Impl();

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
    // $ANTLR end "rule__Create__Group_5__1"


    // $ANTLR start "rule__Create__Group_5__1__Impl"
    // InternalCsvMan.g:1060:1: rule__Create__Group_5__1__Impl : ( ( rule__Create__ColonneAssignment_5_1 ) ) ;
    public final void rule__Create__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1064:1: ( ( ( rule__Create__ColonneAssignment_5_1 ) ) )
            // InternalCsvMan.g:1065:1: ( ( rule__Create__ColonneAssignment_5_1 ) )
            {
            // InternalCsvMan.g:1065:1: ( ( rule__Create__ColonneAssignment_5_1 ) )
            // InternalCsvMan.g:1066:2: ( rule__Create__ColonneAssignment_5_1 )
            {
             before(grammarAccess.getCreateAccess().getColonneAssignment_5_1()); 
            // InternalCsvMan.g:1067:2: ( rule__Create__ColonneAssignment_5_1 )
            // InternalCsvMan.g:1067:3: rule__Create__ColonneAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Create__ColonneAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getCreateAccess().getColonneAssignment_5_1()); 

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
    // $ANTLR end "rule__Create__Group_5__1__Impl"


    // $ANTLR start "rule__Load__Group__0"
    // InternalCsvMan.g:1076:1: rule__Load__Group__0 : rule__Load__Group__0__Impl rule__Load__Group__1 ;
    public final void rule__Load__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1080:1: ( rule__Load__Group__0__Impl rule__Load__Group__1 )
            // InternalCsvMan.g:1081:2: rule__Load__Group__0__Impl rule__Load__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalCsvMan.g:1088:1: rule__Load__Group__0__Impl : ( () ) ;
    public final void rule__Load__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1092:1: ( ( () ) )
            // InternalCsvMan.g:1093:1: ( () )
            {
            // InternalCsvMan.g:1093:1: ( () )
            // InternalCsvMan.g:1094:2: ()
            {
             before(grammarAccess.getLoadAccess().getLoadAction_0()); 
            // InternalCsvMan.g:1095:2: ()
            // InternalCsvMan.g:1095:3: 
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
    // InternalCsvMan.g:1103:1: rule__Load__Group__1 : rule__Load__Group__1__Impl rule__Load__Group__2 ;
    public final void rule__Load__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1107:1: ( rule__Load__Group__1__Impl rule__Load__Group__2 )
            // InternalCsvMan.g:1108:2: rule__Load__Group__1__Impl rule__Load__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalCsvMan.g:1115:1: rule__Load__Group__1__Impl : ( 'load' ) ;
    public final void rule__Load__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1119:1: ( ( 'load' ) )
            // InternalCsvMan.g:1120:1: ( 'load' )
            {
            // InternalCsvMan.g:1120:1: ( 'load' )
            // InternalCsvMan.g:1121:2: 'load'
            {
             before(grammarAccess.getLoadAccess().getLoadKeyword_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalCsvMan.g:1130:1: rule__Load__Group__2 : rule__Load__Group__2__Impl rule__Load__Group__3 ;
    public final void rule__Load__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1134:1: ( rule__Load__Group__2__Impl rule__Load__Group__3 )
            // InternalCsvMan.g:1135:2: rule__Load__Group__2__Impl rule__Load__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalCsvMan.g:1142:1: rule__Load__Group__2__Impl : ( ( rule__Load__TableAssignment_2 ) ) ;
    public final void rule__Load__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1146:1: ( ( ( rule__Load__TableAssignment_2 ) ) )
            // InternalCsvMan.g:1147:1: ( ( rule__Load__TableAssignment_2 ) )
            {
            // InternalCsvMan.g:1147:1: ( ( rule__Load__TableAssignment_2 ) )
            // InternalCsvMan.g:1148:2: ( rule__Load__TableAssignment_2 )
            {
             before(grammarAccess.getLoadAccess().getTableAssignment_2()); 
            // InternalCsvMan.g:1149:2: ( rule__Load__TableAssignment_2 )
            // InternalCsvMan.g:1149:3: rule__Load__TableAssignment_2
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
    // InternalCsvMan.g:1157:1: rule__Load__Group__3 : rule__Load__Group__3__Impl rule__Load__Group__4 ;
    public final void rule__Load__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1161:1: ( rule__Load__Group__3__Impl rule__Load__Group__4 )
            // InternalCsvMan.g:1162:2: rule__Load__Group__3__Impl rule__Load__Group__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalCsvMan.g:1169:1: rule__Load__Group__3__Impl : ( 'as' ) ;
    public final void rule__Load__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1173:1: ( ( 'as' ) )
            // InternalCsvMan.g:1174:1: ( 'as' )
            {
            // InternalCsvMan.g:1174:1: ( 'as' )
            // InternalCsvMan.g:1175:2: 'as'
            {
             before(grammarAccess.getLoadAccess().getAsKeyword_3()); 
            match(input,21,FOLLOW_2); 
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
    // InternalCsvMan.g:1184:1: rule__Load__Group__4 : rule__Load__Group__4__Impl rule__Load__Group__5 ;
    public final void rule__Load__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1188:1: ( rule__Load__Group__4__Impl rule__Load__Group__5 )
            // InternalCsvMan.g:1189:2: rule__Load__Group__4__Impl rule__Load__Group__5
            {
            pushFollow(FOLLOW_7);
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
    // InternalCsvMan.g:1196:1: rule__Load__Group__4__Impl : ( ( rule__Load__AliasAssignment_4 ) ) ;
    public final void rule__Load__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1200:1: ( ( ( rule__Load__AliasAssignment_4 ) ) )
            // InternalCsvMan.g:1201:1: ( ( rule__Load__AliasAssignment_4 ) )
            {
            // InternalCsvMan.g:1201:1: ( ( rule__Load__AliasAssignment_4 ) )
            // InternalCsvMan.g:1202:2: ( rule__Load__AliasAssignment_4 )
            {
             before(grammarAccess.getLoadAccess().getAliasAssignment_4()); 
            // InternalCsvMan.g:1203:2: ( rule__Load__AliasAssignment_4 )
            // InternalCsvMan.g:1203:3: rule__Load__AliasAssignment_4
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
    // InternalCsvMan.g:1211:1: rule__Load__Group__5 : rule__Load__Group__5__Impl ;
    public final void rule__Load__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1215:1: ( rule__Load__Group__5__Impl )
            // InternalCsvMan.g:1216:2: rule__Load__Group__5__Impl
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
    // InternalCsvMan.g:1222:1: rule__Load__Group__5__Impl : ( RULE_NL ) ;
    public final void rule__Load__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1226:1: ( ( RULE_NL ) )
            // InternalCsvMan.g:1227:1: ( RULE_NL )
            {
            // InternalCsvMan.g:1227:1: ( RULE_NL )
            // InternalCsvMan.g:1228:2: RULE_NL
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
    // InternalCsvMan.g:1238:1: rule__Show__Group__0 : rule__Show__Group__0__Impl rule__Show__Group__1 ;
    public final void rule__Show__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1242:1: ( rule__Show__Group__0__Impl rule__Show__Group__1 )
            // InternalCsvMan.g:1243:2: rule__Show__Group__0__Impl rule__Show__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalCsvMan.g:1250:1: rule__Show__Group__0__Impl : ( () ) ;
    public final void rule__Show__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1254:1: ( ( () ) )
            // InternalCsvMan.g:1255:1: ( () )
            {
            // InternalCsvMan.g:1255:1: ( () )
            // InternalCsvMan.g:1256:2: ()
            {
             before(grammarAccess.getShowAccess().getShowAction_0()); 
            // InternalCsvMan.g:1257:2: ()
            // InternalCsvMan.g:1257:3: 
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
    // InternalCsvMan.g:1265:1: rule__Show__Group__1 : rule__Show__Group__1__Impl rule__Show__Group__2 ;
    public final void rule__Show__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1269:1: ( rule__Show__Group__1__Impl rule__Show__Group__2 )
            // InternalCsvMan.g:1270:2: rule__Show__Group__1__Impl rule__Show__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalCsvMan.g:1277:1: rule__Show__Group__1__Impl : ( 'show' ) ;
    public final void rule__Show__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1281:1: ( ( 'show' ) )
            // InternalCsvMan.g:1282:1: ( 'show' )
            {
            // InternalCsvMan.g:1282:1: ( 'show' )
            // InternalCsvMan.g:1283:2: 'show'
            {
             before(grammarAccess.getShowAccess().getShowKeyword_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalCsvMan.g:1292:1: rule__Show__Group__2 : rule__Show__Group__2__Impl rule__Show__Group__3 ;
    public final void rule__Show__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1296:1: ( rule__Show__Group__2__Impl rule__Show__Group__3 )
            // InternalCsvMan.g:1297:2: rule__Show__Group__2__Impl rule__Show__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalCsvMan.g:1304:1: rule__Show__Group__2__Impl : ( ( rule__Show__TableAssignment_2 ) ) ;
    public final void rule__Show__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1308:1: ( ( ( rule__Show__TableAssignment_2 ) ) )
            // InternalCsvMan.g:1309:1: ( ( rule__Show__TableAssignment_2 ) )
            {
            // InternalCsvMan.g:1309:1: ( ( rule__Show__TableAssignment_2 ) )
            // InternalCsvMan.g:1310:2: ( rule__Show__TableAssignment_2 )
            {
             before(grammarAccess.getShowAccess().getTableAssignment_2()); 
            // InternalCsvMan.g:1311:2: ( rule__Show__TableAssignment_2 )
            // InternalCsvMan.g:1311:3: rule__Show__TableAssignment_2
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
    // InternalCsvMan.g:1319:1: rule__Show__Group__3 : rule__Show__Group__3__Impl rule__Show__Group__4 ;
    public final void rule__Show__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1323:1: ( rule__Show__Group__3__Impl rule__Show__Group__4 )
            // InternalCsvMan.g:1324:2: rule__Show__Group__3__Impl rule__Show__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalCsvMan.g:1331:1: rule__Show__Group__3__Impl : ( ( rule__Show__Group_3__0 )? ) ;
    public final void rule__Show__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1335:1: ( ( ( rule__Show__Group_3__0 )? ) )
            // InternalCsvMan.g:1336:1: ( ( rule__Show__Group_3__0 )? )
            {
            // InternalCsvMan.g:1336:1: ( ( rule__Show__Group_3__0 )? )
            // InternalCsvMan.g:1337:2: ( rule__Show__Group_3__0 )?
            {
             before(grammarAccess.getShowAccess().getGroup_3()); 
            // InternalCsvMan.g:1338:2: ( rule__Show__Group_3__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalCsvMan.g:1338:3: rule__Show__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Show__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getShowAccess().getGroup_3()); 

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
    // InternalCsvMan.g:1346:1: rule__Show__Group__4 : rule__Show__Group__4__Impl rule__Show__Group__5 ;
    public final void rule__Show__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1350:1: ( rule__Show__Group__4__Impl rule__Show__Group__5 )
            // InternalCsvMan.g:1351:2: rule__Show__Group__4__Impl rule__Show__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__Show__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Show__Group__5();

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
    // InternalCsvMan.g:1358:1: rule__Show__Group__4__Impl : ( ( rule__Show__WhereAssignment_4 )? ) ;
    public final void rule__Show__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1362:1: ( ( ( rule__Show__WhereAssignment_4 )? ) )
            // InternalCsvMan.g:1363:1: ( ( rule__Show__WhereAssignment_4 )? )
            {
            // InternalCsvMan.g:1363:1: ( ( rule__Show__WhereAssignment_4 )? )
            // InternalCsvMan.g:1364:2: ( rule__Show__WhereAssignment_4 )?
            {
             before(grammarAccess.getShowAccess().getWhereAssignment_4()); 
            // InternalCsvMan.g:1365:2: ( rule__Show__WhereAssignment_4 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==29) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalCsvMan.g:1365:3: rule__Show__WhereAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Show__WhereAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getShowAccess().getWhereAssignment_4()); 

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


    // $ANTLR start "rule__Show__Group__5"
    // InternalCsvMan.g:1373:1: rule__Show__Group__5 : rule__Show__Group__5__Impl ;
    public final void rule__Show__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1377:1: ( rule__Show__Group__5__Impl )
            // InternalCsvMan.g:1378:2: rule__Show__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Show__Group__5__Impl();

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
    // $ANTLR end "rule__Show__Group__5"


    // $ANTLR start "rule__Show__Group__5__Impl"
    // InternalCsvMan.g:1384:1: rule__Show__Group__5__Impl : ( RULE_NL ) ;
    public final void rule__Show__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1388:1: ( ( RULE_NL ) )
            // InternalCsvMan.g:1389:1: ( RULE_NL )
            {
            // InternalCsvMan.g:1389:1: ( RULE_NL )
            // InternalCsvMan.g:1390:2: RULE_NL
            {
             before(grammarAccess.getShowAccess().getNLTerminalRuleCall_5()); 
            match(input,RULE_NL,FOLLOW_2); 
             after(grammarAccess.getShowAccess().getNLTerminalRuleCall_5()); 

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
    // $ANTLR end "rule__Show__Group__5__Impl"


    // $ANTLR start "rule__Show__Group_3__0"
    // InternalCsvMan.g:1400:1: rule__Show__Group_3__0 : rule__Show__Group_3__0__Impl rule__Show__Group_3__1 ;
    public final void rule__Show__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1404:1: ( rule__Show__Group_3__0__Impl rule__Show__Group_3__1 )
            // InternalCsvMan.g:1405:2: rule__Show__Group_3__0__Impl rule__Show__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__Show__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Show__Group_3__1();

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
    // $ANTLR end "rule__Show__Group_3__0"


    // $ANTLR start "rule__Show__Group_3__0__Impl"
    // InternalCsvMan.g:1412:1: rule__Show__Group_3__0__Impl : ( '(' ) ;
    public final void rule__Show__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1416:1: ( ( '(' ) )
            // InternalCsvMan.g:1417:1: ( '(' )
            {
            // InternalCsvMan.g:1417:1: ( '(' )
            // InternalCsvMan.g:1418:2: '('
            {
             before(grammarAccess.getShowAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getShowAccess().getLeftParenthesisKeyword_3_0()); 

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
    // $ANTLR end "rule__Show__Group_3__0__Impl"


    // $ANTLR start "rule__Show__Group_3__1"
    // InternalCsvMan.g:1427:1: rule__Show__Group_3__1 : rule__Show__Group_3__1__Impl rule__Show__Group_3__2 ;
    public final void rule__Show__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1431:1: ( rule__Show__Group_3__1__Impl rule__Show__Group_3__2 )
            // InternalCsvMan.g:1432:2: rule__Show__Group_3__1__Impl rule__Show__Group_3__2
            {
            pushFollow(FOLLOW_10);
            rule__Show__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Show__Group_3__2();

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
    // $ANTLR end "rule__Show__Group_3__1"


    // $ANTLR start "rule__Show__Group_3__1__Impl"
    // InternalCsvMan.g:1439:1: rule__Show__Group_3__1__Impl : ( ( rule__Show__ColonneAssignment_3_1 ) ) ;
    public final void rule__Show__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1443:1: ( ( ( rule__Show__ColonneAssignment_3_1 ) ) )
            // InternalCsvMan.g:1444:1: ( ( rule__Show__ColonneAssignment_3_1 ) )
            {
            // InternalCsvMan.g:1444:1: ( ( rule__Show__ColonneAssignment_3_1 ) )
            // InternalCsvMan.g:1445:2: ( rule__Show__ColonneAssignment_3_1 )
            {
             before(grammarAccess.getShowAccess().getColonneAssignment_3_1()); 
            // InternalCsvMan.g:1446:2: ( rule__Show__ColonneAssignment_3_1 )
            // InternalCsvMan.g:1446:3: rule__Show__ColonneAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Show__ColonneAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getShowAccess().getColonneAssignment_3_1()); 

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
    // $ANTLR end "rule__Show__Group_3__1__Impl"


    // $ANTLR start "rule__Show__Group_3__2"
    // InternalCsvMan.g:1454:1: rule__Show__Group_3__2 : rule__Show__Group_3__2__Impl rule__Show__Group_3__3 ;
    public final void rule__Show__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1458:1: ( rule__Show__Group_3__2__Impl rule__Show__Group_3__3 )
            // InternalCsvMan.g:1459:2: rule__Show__Group_3__2__Impl rule__Show__Group_3__3
            {
            pushFollow(FOLLOW_10);
            rule__Show__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Show__Group_3__3();

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
    // $ANTLR end "rule__Show__Group_3__2"


    // $ANTLR start "rule__Show__Group_3__2__Impl"
    // InternalCsvMan.g:1466:1: rule__Show__Group_3__2__Impl : ( ( rule__Show__Group_3_2__0 )* ) ;
    public final void rule__Show__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1470:1: ( ( ( rule__Show__Group_3_2__0 )* ) )
            // InternalCsvMan.g:1471:1: ( ( rule__Show__Group_3_2__0 )* )
            {
            // InternalCsvMan.g:1471:1: ( ( rule__Show__Group_3_2__0 )* )
            // InternalCsvMan.g:1472:2: ( rule__Show__Group_3_2__0 )*
            {
             before(grammarAccess.getShowAccess().getGroup_3_2()); 
            // InternalCsvMan.g:1473:2: ( rule__Show__Group_3_2__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==19) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalCsvMan.g:1473:3: rule__Show__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Show__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getShowAccess().getGroup_3_2()); 

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
    // $ANTLR end "rule__Show__Group_3__2__Impl"


    // $ANTLR start "rule__Show__Group_3__3"
    // InternalCsvMan.g:1481:1: rule__Show__Group_3__3 : rule__Show__Group_3__3__Impl ;
    public final void rule__Show__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1485:1: ( rule__Show__Group_3__3__Impl )
            // InternalCsvMan.g:1486:2: rule__Show__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Show__Group_3__3__Impl();

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
    // $ANTLR end "rule__Show__Group_3__3"


    // $ANTLR start "rule__Show__Group_3__3__Impl"
    // InternalCsvMan.g:1492:1: rule__Show__Group_3__3__Impl : ( ')' ) ;
    public final void rule__Show__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1496:1: ( ( ')' ) )
            // InternalCsvMan.g:1497:1: ( ')' )
            {
            // InternalCsvMan.g:1497:1: ( ')' )
            // InternalCsvMan.g:1498:2: ')'
            {
             before(grammarAccess.getShowAccess().getRightParenthesisKeyword_3_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getShowAccess().getRightParenthesisKeyword_3_3()); 

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
    // $ANTLR end "rule__Show__Group_3__3__Impl"


    // $ANTLR start "rule__Show__Group_3_2__0"
    // InternalCsvMan.g:1508:1: rule__Show__Group_3_2__0 : rule__Show__Group_3_2__0__Impl rule__Show__Group_3_2__1 ;
    public final void rule__Show__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1512:1: ( rule__Show__Group_3_2__0__Impl rule__Show__Group_3_2__1 )
            // InternalCsvMan.g:1513:2: rule__Show__Group_3_2__0__Impl rule__Show__Group_3_2__1
            {
            pushFollow(FOLLOW_5);
            rule__Show__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Show__Group_3_2__1();

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
    // $ANTLR end "rule__Show__Group_3_2__0"


    // $ANTLR start "rule__Show__Group_3_2__0__Impl"
    // InternalCsvMan.g:1520:1: rule__Show__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__Show__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1524:1: ( ( ',' ) )
            // InternalCsvMan.g:1525:1: ( ',' )
            {
            // InternalCsvMan.g:1525:1: ( ',' )
            // InternalCsvMan.g:1526:2: ','
            {
             before(grammarAccess.getShowAccess().getCommaKeyword_3_2_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getShowAccess().getCommaKeyword_3_2_0()); 

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
    // $ANTLR end "rule__Show__Group_3_2__0__Impl"


    // $ANTLR start "rule__Show__Group_3_2__1"
    // InternalCsvMan.g:1535:1: rule__Show__Group_3_2__1 : rule__Show__Group_3_2__1__Impl ;
    public final void rule__Show__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1539:1: ( rule__Show__Group_3_2__1__Impl )
            // InternalCsvMan.g:1540:2: rule__Show__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Show__Group_3_2__1__Impl();

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
    // $ANTLR end "rule__Show__Group_3_2__1"


    // $ANTLR start "rule__Show__Group_3_2__1__Impl"
    // InternalCsvMan.g:1546:1: rule__Show__Group_3_2__1__Impl : ( ( rule__Show__ColonneAssignment_3_2_1 ) ) ;
    public final void rule__Show__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1550:1: ( ( ( rule__Show__ColonneAssignment_3_2_1 ) ) )
            // InternalCsvMan.g:1551:1: ( ( rule__Show__ColonneAssignment_3_2_1 ) )
            {
            // InternalCsvMan.g:1551:1: ( ( rule__Show__ColonneAssignment_3_2_1 ) )
            // InternalCsvMan.g:1552:2: ( rule__Show__ColonneAssignment_3_2_1 )
            {
             before(grammarAccess.getShowAccess().getColonneAssignment_3_2_1()); 
            // InternalCsvMan.g:1553:2: ( rule__Show__ColonneAssignment_3_2_1 )
            // InternalCsvMan.g:1553:3: rule__Show__ColonneAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Show__ColonneAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getShowAccess().getColonneAssignment_3_2_1()); 

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
    // $ANTLR end "rule__Show__Group_3_2__1__Impl"


    // $ANTLR start "rule__Update__Group__0"
    // InternalCsvMan.g:1562:1: rule__Update__Group__0 : rule__Update__Group__0__Impl rule__Update__Group__1 ;
    public final void rule__Update__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1566:1: ( rule__Update__Group__0__Impl rule__Update__Group__1 )
            // InternalCsvMan.g:1567:2: rule__Update__Group__0__Impl rule__Update__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalCsvMan.g:1574:1: rule__Update__Group__0__Impl : ( () ) ;
    public final void rule__Update__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1578:1: ( ( () ) )
            // InternalCsvMan.g:1579:1: ( () )
            {
            // InternalCsvMan.g:1579:1: ( () )
            // InternalCsvMan.g:1580:2: ()
            {
             before(grammarAccess.getUpdateAccess().getUpdateAction_0()); 
            // InternalCsvMan.g:1581:2: ()
            // InternalCsvMan.g:1581:3: 
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
    // InternalCsvMan.g:1589:1: rule__Update__Group__1 : rule__Update__Group__1__Impl rule__Update__Group__2 ;
    public final void rule__Update__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1593:1: ( rule__Update__Group__1__Impl rule__Update__Group__2 )
            // InternalCsvMan.g:1594:2: rule__Update__Group__1__Impl rule__Update__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalCsvMan.g:1601:1: rule__Update__Group__1__Impl : ( 'update' ) ;
    public final void rule__Update__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1605:1: ( ( 'update' ) )
            // InternalCsvMan.g:1606:1: ( 'update' )
            {
            // InternalCsvMan.g:1606:1: ( 'update' )
            // InternalCsvMan.g:1607:2: 'update'
            {
             before(grammarAccess.getUpdateAccess().getUpdateKeyword_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalCsvMan.g:1616:1: rule__Update__Group__2 : rule__Update__Group__2__Impl rule__Update__Group__3 ;
    public final void rule__Update__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1620:1: ( rule__Update__Group__2__Impl rule__Update__Group__3 )
            // InternalCsvMan.g:1621:2: rule__Update__Group__2__Impl rule__Update__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalCsvMan.g:1628:1: rule__Update__Group__2__Impl : ( ( rule__Update__TableAssignment_2 ) ) ;
    public final void rule__Update__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1632:1: ( ( ( rule__Update__TableAssignment_2 ) ) )
            // InternalCsvMan.g:1633:1: ( ( rule__Update__TableAssignment_2 ) )
            {
            // InternalCsvMan.g:1633:1: ( ( rule__Update__TableAssignment_2 ) )
            // InternalCsvMan.g:1634:2: ( rule__Update__TableAssignment_2 )
            {
             before(grammarAccess.getUpdateAccess().getTableAssignment_2()); 
            // InternalCsvMan.g:1635:2: ( rule__Update__TableAssignment_2 )
            // InternalCsvMan.g:1635:3: rule__Update__TableAssignment_2
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
    // InternalCsvMan.g:1643:1: rule__Update__Group__3 : rule__Update__Group__3__Impl rule__Update__Group__4 ;
    public final void rule__Update__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1647:1: ( rule__Update__Group__3__Impl rule__Update__Group__4 )
            // InternalCsvMan.g:1648:2: rule__Update__Group__3__Impl rule__Update__Group__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalCsvMan.g:1655:1: rule__Update__Group__3__Impl : ( 'set' ) ;
    public final void rule__Update__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1659:1: ( ( 'set' ) )
            // InternalCsvMan.g:1660:1: ( 'set' )
            {
            // InternalCsvMan.g:1660:1: ( 'set' )
            // InternalCsvMan.g:1661:2: 'set'
            {
             before(grammarAccess.getUpdateAccess().getSetKeyword_3()); 
            match(input,24,FOLLOW_2); 
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
    // InternalCsvMan.g:1670:1: rule__Update__Group__4 : rule__Update__Group__4__Impl rule__Update__Group__5 ;
    public final void rule__Update__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1674:1: ( rule__Update__Group__4__Impl rule__Update__Group__5 )
            // InternalCsvMan.g:1675:2: rule__Update__Group__4__Impl rule__Update__Group__5
            {
            pushFollow(FOLLOW_18);
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
    // InternalCsvMan.g:1682:1: rule__Update__Group__4__Impl : ( ( rule__Update__ParameterAssignment_4 ) ) ;
    public final void rule__Update__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1686:1: ( ( ( rule__Update__ParameterAssignment_4 ) ) )
            // InternalCsvMan.g:1687:1: ( ( rule__Update__ParameterAssignment_4 ) )
            {
            // InternalCsvMan.g:1687:1: ( ( rule__Update__ParameterAssignment_4 ) )
            // InternalCsvMan.g:1688:2: ( rule__Update__ParameterAssignment_4 )
            {
             before(grammarAccess.getUpdateAccess().getParameterAssignment_4()); 
            // InternalCsvMan.g:1689:2: ( rule__Update__ParameterAssignment_4 )
            // InternalCsvMan.g:1689:3: rule__Update__ParameterAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Update__ParameterAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getUpdateAccess().getParameterAssignment_4()); 

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
    // InternalCsvMan.g:1697:1: rule__Update__Group__5 : rule__Update__Group__5__Impl rule__Update__Group__6 ;
    public final void rule__Update__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1701:1: ( rule__Update__Group__5__Impl rule__Update__Group__6 )
            // InternalCsvMan.g:1702:2: rule__Update__Group__5__Impl rule__Update__Group__6
            {
            pushFollow(FOLLOW_18);
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
    // InternalCsvMan.g:1709:1: rule__Update__Group__5__Impl : ( ( rule__Update__Group_5__0 )* ) ;
    public final void rule__Update__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1713:1: ( ( ( rule__Update__Group_5__0 )* ) )
            // InternalCsvMan.g:1714:1: ( ( rule__Update__Group_5__0 )* )
            {
            // InternalCsvMan.g:1714:1: ( ( rule__Update__Group_5__0 )* )
            // InternalCsvMan.g:1715:2: ( rule__Update__Group_5__0 )*
            {
             before(grammarAccess.getUpdateAccess().getGroup_5()); 
            // InternalCsvMan.g:1716:2: ( rule__Update__Group_5__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==19) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalCsvMan.g:1716:3: rule__Update__Group_5__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Update__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getUpdateAccess().getGroup_5()); 

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
    // InternalCsvMan.g:1724:1: rule__Update__Group__6 : rule__Update__Group__6__Impl rule__Update__Group__7 ;
    public final void rule__Update__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1728:1: ( rule__Update__Group__6__Impl rule__Update__Group__7 )
            // InternalCsvMan.g:1729:2: rule__Update__Group__6__Impl rule__Update__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__Update__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Update__Group__7();

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
    // InternalCsvMan.g:1736:1: rule__Update__Group__6__Impl : ( ( rule__Update__WhereAssignment_6 )? ) ;
    public final void rule__Update__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1740:1: ( ( ( rule__Update__WhereAssignment_6 )? ) )
            // InternalCsvMan.g:1741:1: ( ( rule__Update__WhereAssignment_6 )? )
            {
            // InternalCsvMan.g:1741:1: ( ( rule__Update__WhereAssignment_6 )? )
            // InternalCsvMan.g:1742:2: ( rule__Update__WhereAssignment_6 )?
            {
             before(grammarAccess.getUpdateAccess().getWhereAssignment_6()); 
            // InternalCsvMan.g:1743:2: ( rule__Update__WhereAssignment_6 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==29) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCsvMan.g:1743:3: rule__Update__WhereAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Update__WhereAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUpdateAccess().getWhereAssignment_6()); 

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


    // $ANTLR start "rule__Update__Group__7"
    // InternalCsvMan.g:1751:1: rule__Update__Group__7 : rule__Update__Group__7__Impl ;
    public final void rule__Update__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1755:1: ( rule__Update__Group__7__Impl )
            // InternalCsvMan.g:1756:2: rule__Update__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Update__Group__7__Impl();

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
    // $ANTLR end "rule__Update__Group__7"


    // $ANTLR start "rule__Update__Group__7__Impl"
    // InternalCsvMan.g:1762:1: rule__Update__Group__7__Impl : ( RULE_NL ) ;
    public final void rule__Update__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1766:1: ( ( RULE_NL ) )
            // InternalCsvMan.g:1767:1: ( RULE_NL )
            {
            // InternalCsvMan.g:1767:1: ( RULE_NL )
            // InternalCsvMan.g:1768:2: RULE_NL
            {
             before(grammarAccess.getUpdateAccess().getNLTerminalRuleCall_7()); 
            match(input,RULE_NL,FOLLOW_2); 
             after(grammarAccess.getUpdateAccess().getNLTerminalRuleCall_7()); 

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
    // $ANTLR end "rule__Update__Group__7__Impl"


    // $ANTLR start "rule__Update__Group_5__0"
    // InternalCsvMan.g:1778:1: rule__Update__Group_5__0 : rule__Update__Group_5__0__Impl rule__Update__Group_5__1 ;
    public final void rule__Update__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1782:1: ( rule__Update__Group_5__0__Impl rule__Update__Group_5__1 )
            // InternalCsvMan.g:1783:2: rule__Update__Group_5__0__Impl rule__Update__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__Update__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Update__Group_5__1();

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
    // $ANTLR end "rule__Update__Group_5__0"


    // $ANTLR start "rule__Update__Group_5__0__Impl"
    // InternalCsvMan.g:1790:1: rule__Update__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Update__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1794:1: ( ( ',' ) )
            // InternalCsvMan.g:1795:1: ( ',' )
            {
            // InternalCsvMan.g:1795:1: ( ',' )
            // InternalCsvMan.g:1796:2: ','
            {
             before(grammarAccess.getUpdateAccess().getCommaKeyword_5_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getUpdateAccess().getCommaKeyword_5_0()); 

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
    // $ANTLR end "rule__Update__Group_5__0__Impl"


    // $ANTLR start "rule__Update__Group_5__1"
    // InternalCsvMan.g:1805:1: rule__Update__Group_5__1 : rule__Update__Group_5__1__Impl ;
    public final void rule__Update__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1809:1: ( rule__Update__Group_5__1__Impl )
            // InternalCsvMan.g:1810:2: rule__Update__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Update__Group_5__1__Impl();

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
    // $ANTLR end "rule__Update__Group_5__1"


    // $ANTLR start "rule__Update__Group_5__1__Impl"
    // InternalCsvMan.g:1816:1: rule__Update__Group_5__1__Impl : ( ( rule__Update__ParameterAssignment_5_1 ) ) ;
    public final void rule__Update__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1820:1: ( ( ( rule__Update__ParameterAssignment_5_1 ) ) )
            // InternalCsvMan.g:1821:1: ( ( rule__Update__ParameterAssignment_5_1 ) )
            {
            // InternalCsvMan.g:1821:1: ( ( rule__Update__ParameterAssignment_5_1 ) )
            // InternalCsvMan.g:1822:2: ( rule__Update__ParameterAssignment_5_1 )
            {
             before(grammarAccess.getUpdateAccess().getParameterAssignment_5_1()); 
            // InternalCsvMan.g:1823:2: ( rule__Update__ParameterAssignment_5_1 )
            // InternalCsvMan.g:1823:3: rule__Update__ParameterAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Update__ParameterAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getUpdateAccess().getParameterAssignment_5_1()); 

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
    // $ANTLR end "rule__Update__Group_5__1__Impl"


    // $ANTLR start "rule__Add__Group__0"
    // InternalCsvMan.g:1832:1: rule__Add__Group__0 : rule__Add__Group__0__Impl rule__Add__Group__1 ;
    public final void rule__Add__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1836:1: ( rule__Add__Group__0__Impl rule__Add__Group__1 )
            // InternalCsvMan.g:1837:2: rule__Add__Group__0__Impl rule__Add__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalCsvMan.g:1844:1: rule__Add__Group__0__Impl : ( () ) ;
    public final void rule__Add__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1848:1: ( ( () ) )
            // InternalCsvMan.g:1849:1: ( () )
            {
            // InternalCsvMan.g:1849:1: ( () )
            // InternalCsvMan.g:1850:2: ()
            {
             before(grammarAccess.getAddAccess().getAddAction_0()); 
            // InternalCsvMan.g:1851:2: ()
            // InternalCsvMan.g:1851:3: 
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
    // InternalCsvMan.g:1859:1: rule__Add__Group__1 : rule__Add__Group__1__Impl rule__Add__Group__2 ;
    public final void rule__Add__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1863:1: ( rule__Add__Group__1__Impl rule__Add__Group__2 )
            // InternalCsvMan.g:1864:2: rule__Add__Group__1__Impl rule__Add__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalCsvMan.g:1871:1: rule__Add__Group__1__Impl : ( 'add' ) ;
    public final void rule__Add__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1875:1: ( ( 'add' ) )
            // InternalCsvMan.g:1876:1: ( 'add' )
            {
            // InternalCsvMan.g:1876:1: ( 'add' )
            // InternalCsvMan.g:1877:2: 'add'
            {
             before(grammarAccess.getAddAccess().getAddKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalCsvMan.g:1886:1: rule__Add__Group__2 : rule__Add__Group__2__Impl rule__Add__Group__3 ;
    public final void rule__Add__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1890:1: ( rule__Add__Group__2__Impl rule__Add__Group__3 )
            // InternalCsvMan.g:1891:2: rule__Add__Group__2__Impl rule__Add__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalCsvMan.g:1898:1: rule__Add__Group__2__Impl : ( '(' ) ;
    public final void rule__Add__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1902:1: ( ( '(' ) )
            // InternalCsvMan.g:1903:1: ( '(' )
            {
            // InternalCsvMan.g:1903:1: ( '(' )
            // InternalCsvMan.g:1904:2: '('
            {
             before(grammarAccess.getAddAccess().getLeftParenthesisKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAddAccess().getLeftParenthesisKeyword_2()); 

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
    // InternalCsvMan.g:1913:1: rule__Add__Group__3 : rule__Add__Group__3__Impl rule__Add__Group__4 ;
    public final void rule__Add__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1917:1: ( rule__Add__Group__3__Impl rule__Add__Group__4 )
            // InternalCsvMan.g:1918:2: rule__Add__Group__3__Impl rule__Add__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalCsvMan.g:1925:1: rule__Add__Group__3__Impl : ( ( rule__Add__ValeurAssignment_3 ) ) ;
    public final void rule__Add__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1929:1: ( ( ( rule__Add__ValeurAssignment_3 ) ) )
            // InternalCsvMan.g:1930:1: ( ( rule__Add__ValeurAssignment_3 ) )
            {
            // InternalCsvMan.g:1930:1: ( ( rule__Add__ValeurAssignment_3 ) )
            // InternalCsvMan.g:1931:2: ( rule__Add__ValeurAssignment_3 )
            {
             before(grammarAccess.getAddAccess().getValeurAssignment_3()); 
            // InternalCsvMan.g:1932:2: ( rule__Add__ValeurAssignment_3 )
            // InternalCsvMan.g:1932:3: rule__Add__ValeurAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Add__ValeurAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAddAccess().getValeurAssignment_3()); 

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
    // InternalCsvMan.g:1940:1: rule__Add__Group__4 : rule__Add__Group__4__Impl rule__Add__Group__5 ;
    public final void rule__Add__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1944:1: ( rule__Add__Group__4__Impl rule__Add__Group__5 )
            // InternalCsvMan.g:1945:2: rule__Add__Group__4__Impl rule__Add__Group__5
            {
            pushFollow(FOLLOW_10);
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
    // InternalCsvMan.g:1952:1: rule__Add__Group__4__Impl : ( ( rule__Add__Group_4__0 )* ) ;
    public final void rule__Add__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1956:1: ( ( ( rule__Add__Group_4__0 )* ) )
            // InternalCsvMan.g:1957:1: ( ( rule__Add__Group_4__0 )* )
            {
            // InternalCsvMan.g:1957:1: ( ( rule__Add__Group_4__0 )* )
            // InternalCsvMan.g:1958:2: ( rule__Add__Group_4__0 )*
            {
             before(grammarAccess.getAddAccess().getGroup_4()); 
            // InternalCsvMan.g:1959:2: ( rule__Add__Group_4__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==19) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalCsvMan.g:1959:3: rule__Add__Group_4__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Add__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getAddAccess().getGroup_4()); 

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
    // InternalCsvMan.g:1967:1: rule__Add__Group__5 : rule__Add__Group__5__Impl rule__Add__Group__6 ;
    public final void rule__Add__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1971:1: ( rule__Add__Group__5__Impl rule__Add__Group__6 )
            // InternalCsvMan.g:1972:2: rule__Add__Group__5__Impl rule__Add__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Add__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Add__Group__6();

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
    // InternalCsvMan.g:1979:1: rule__Add__Group__5__Impl : ( ')' ) ;
    public final void rule__Add__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1983:1: ( ( ')' ) )
            // InternalCsvMan.g:1984:1: ( ')' )
            {
            // InternalCsvMan.g:1984:1: ( ')' )
            // InternalCsvMan.g:1985:2: ')'
            {
             before(grammarAccess.getAddAccess().getRightParenthesisKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getAddAccess().getRightParenthesisKeyword_5()); 

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


    // $ANTLR start "rule__Add__Group__6"
    // InternalCsvMan.g:1994:1: rule__Add__Group__6 : rule__Add__Group__6__Impl rule__Add__Group__7 ;
    public final void rule__Add__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1998:1: ( rule__Add__Group__6__Impl rule__Add__Group__7 )
            // InternalCsvMan.g:1999:2: rule__Add__Group__6__Impl rule__Add__Group__7
            {
            pushFollow(FOLLOW_5);
            rule__Add__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Add__Group__7();

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
    // $ANTLR end "rule__Add__Group__6"


    // $ANTLR start "rule__Add__Group__6__Impl"
    // InternalCsvMan.g:2006:1: rule__Add__Group__6__Impl : ( 'in' ) ;
    public final void rule__Add__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2010:1: ( ( 'in' ) )
            // InternalCsvMan.g:2011:1: ( 'in' )
            {
            // InternalCsvMan.g:2011:1: ( 'in' )
            // InternalCsvMan.g:2012:2: 'in'
            {
             before(grammarAccess.getAddAccess().getInKeyword_6()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getAddAccess().getInKeyword_6()); 

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
    // $ANTLR end "rule__Add__Group__6__Impl"


    // $ANTLR start "rule__Add__Group__7"
    // InternalCsvMan.g:2021:1: rule__Add__Group__7 : rule__Add__Group__7__Impl rule__Add__Group__8 ;
    public final void rule__Add__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2025:1: ( rule__Add__Group__7__Impl rule__Add__Group__8 )
            // InternalCsvMan.g:2026:2: rule__Add__Group__7__Impl rule__Add__Group__8
            {
            pushFollow(FOLLOW_7);
            rule__Add__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Add__Group__8();

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
    // $ANTLR end "rule__Add__Group__7"


    // $ANTLR start "rule__Add__Group__7__Impl"
    // InternalCsvMan.g:2033:1: rule__Add__Group__7__Impl : ( ( rule__Add__TableAssignment_7 ) ) ;
    public final void rule__Add__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2037:1: ( ( ( rule__Add__TableAssignment_7 ) ) )
            // InternalCsvMan.g:2038:1: ( ( rule__Add__TableAssignment_7 ) )
            {
            // InternalCsvMan.g:2038:1: ( ( rule__Add__TableAssignment_7 ) )
            // InternalCsvMan.g:2039:2: ( rule__Add__TableAssignment_7 )
            {
             before(grammarAccess.getAddAccess().getTableAssignment_7()); 
            // InternalCsvMan.g:2040:2: ( rule__Add__TableAssignment_7 )
            // InternalCsvMan.g:2040:3: rule__Add__TableAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Add__TableAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getAddAccess().getTableAssignment_7()); 

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
    // $ANTLR end "rule__Add__Group__7__Impl"


    // $ANTLR start "rule__Add__Group__8"
    // InternalCsvMan.g:2048:1: rule__Add__Group__8 : rule__Add__Group__8__Impl ;
    public final void rule__Add__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2052:1: ( rule__Add__Group__8__Impl )
            // InternalCsvMan.g:2053:2: rule__Add__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Add__Group__8__Impl();

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
    // $ANTLR end "rule__Add__Group__8"


    // $ANTLR start "rule__Add__Group__8__Impl"
    // InternalCsvMan.g:2059:1: rule__Add__Group__8__Impl : ( RULE_NL ) ;
    public final void rule__Add__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2063:1: ( ( RULE_NL ) )
            // InternalCsvMan.g:2064:1: ( RULE_NL )
            {
            // InternalCsvMan.g:2064:1: ( RULE_NL )
            // InternalCsvMan.g:2065:2: RULE_NL
            {
             before(grammarAccess.getAddAccess().getNLTerminalRuleCall_8()); 
            match(input,RULE_NL,FOLLOW_2); 
             after(grammarAccess.getAddAccess().getNLTerminalRuleCall_8()); 

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
    // $ANTLR end "rule__Add__Group__8__Impl"


    // $ANTLR start "rule__Add__Group_4__0"
    // InternalCsvMan.g:2075:1: rule__Add__Group_4__0 : rule__Add__Group_4__0__Impl rule__Add__Group_4__1 ;
    public final void rule__Add__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2079:1: ( rule__Add__Group_4__0__Impl rule__Add__Group_4__1 )
            // InternalCsvMan.g:2080:2: rule__Add__Group_4__0__Impl rule__Add__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__Add__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Add__Group_4__1();

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
    // $ANTLR end "rule__Add__Group_4__0"


    // $ANTLR start "rule__Add__Group_4__0__Impl"
    // InternalCsvMan.g:2087:1: rule__Add__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Add__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2091:1: ( ( ',' ) )
            // InternalCsvMan.g:2092:1: ( ',' )
            {
            // InternalCsvMan.g:2092:1: ( ',' )
            // InternalCsvMan.g:2093:2: ','
            {
             before(grammarAccess.getAddAccess().getCommaKeyword_4_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAddAccess().getCommaKeyword_4_0()); 

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
    // $ANTLR end "rule__Add__Group_4__0__Impl"


    // $ANTLR start "rule__Add__Group_4__1"
    // InternalCsvMan.g:2102:1: rule__Add__Group_4__1 : rule__Add__Group_4__1__Impl ;
    public final void rule__Add__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2106:1: ( rule__Add__Group_4__1__Impl )
            // InternalCsvMan.g:2107:2: rule__Add__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Add__Group_4__1__Impl();

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
    // $ANTLR end "rule__Add__Group_4__1"


    // $ANTLR start "rule__Add__Group_4__1__Impl"
    // InternalCsvMan.g:2113:1: rule__Add__Group_4__1__Impl : ( ( rule__Add__ValeurAssignment_4_1 ) ) ;
    public final void rule__Add__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2117:1: ( ( ( rule__Add__ValeurAssignment_4_1 ) ) )
            // InternalCsvMan.g:2118:1: ( ( rule__Add__ValeurAssignment_4_1 ) )
            {
            // InternalCsvMan.g:2118:1: ( ( rule__Add__ValeurAssignment_4_1 ) )
            // InternalCsvMan.g:2119:2: ( rule__Add__ValeurAssignment_4_1 )
            {
             before(grammarAccess.getAddAccess().getValeurAssignment_4_1()); 
            // InternalCsvMan.g:2120:2: ( rule__Add__ValeurAssignment_4_1 )
            // InternalCsvMan.g:2120:3: rule__Add__ValeurAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Add__ValeurAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getAddAccess().getValeurAssignment_4_1()); 

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
    // $ANTLR end "rule__Add__Group_4__1__Impl"


    // $ANTLR start "rule__Join__Group__0"
    // InternalCsvMan.g:2129:1: rule__Join__Group__0 : rule__Join__Group__0__Impl rule__Join__Group__1 ;
    public final void rule__Join__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2133:1: ( rule__Join__Group__0__Impl rule__Join__Group__1 )
            // InternalCsvMan.g:2134:2: rule__Join__Group__0__Impl rule__Join__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalCsvMan.g:2141:1: rule__Join__Group__0__Impl : ( () ) ;
    public final void rule__Join__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2145:1: ( ( () ) )
            // InternalCsvMan.g:2146:1: ( () )
            {
            // InternalCsvMan.g:2146:1: ( () )
            // InternalCsvMan.g:2147:2: ()
            {
             before(grammarAccess.getJoinAccess().getJoinAction_0()); 
            // InternalCsvMan.g:2148:2: ()
            // InternalCsvMan.g:2148:3: 
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
    // InternalCsvMan.g:2156:1: rule__Join__Group__1 : rule__Join__Group__1__Impl rule__Join__Group__2 ;
    public final void rule__Join__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2160:1: ( rule__Join__Group__1__Impl rule__Join__Group__2 )
            // InternalCsvMan.g:2161:2: rule__Join__Group__1__Impl rule__Join__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalCsvMan.g:2168:1: rule__Join__Group__1__Impl : ( 'join' ) ;
    public final void rule__Join__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2172:1: ( ( 'join' ) )
            // InternalCsvMan.g:2173:1: ( 'join' )
            {
            // InternalCsvMan.g:2173:1: ( 'join' )
            // InternalCsvMan.g:2174:2: 'join'
            {
             before(grammarAccess.getJoinAccess().getJoinKeyword_1()); 
            match(input,26,FOLLOW_2); 
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
    // InternalCsvMan.g:2183:1: rule__Join__Group__2 : rule__Join__Group__2__Impl rule__Join__Group__3 ;
    public final void rule__Join__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2187:1: ( rule__Join__Group__2__Impl rule__Join__Group__3 )
            // InternalCsvMan.g:2188:2: rule__Join__Group__2__Impl rule__Join__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalCsvMan.g:2195:1: rule__Join__Group__2__Impl : ( ( rule__Join__Table1Assignment_2 ) ) ;
    public final void rule__Join__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2199:1: ( ( ( rule__Join__Table1Assignment_2 ) ) )
            // InternalCsvMan.g:2200:1: ( ( rule__Join__Table1Assignment_2 ) )
            {
            // InternalCsvMan.g:2200:1: ( ( rule__Join__Table1Assignment_2 ) )
            // InternalCsvMan.g:2201:2: ( rule__Join__Table1Assignment_2 )
            {
             before(grammarAccess.getJoinAccess().getTable1Assignment_2()); 
            // InternalCsvMan.g:2202:2: ( rule__Join__Table1Assignment_2 )
            // InternalCsvMan.g:2202:3: rule__Join__Table1Assignment_2
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
    // InternalCsvMan.g:2210:1: rule__Join__Group__3 : rule__Join__Group__3__Impl rule__Join__Group__4 ;
    public final void rule__Join__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2214:1: ( rule__Join__Group__3__Impl rule__Join__Group__4 )
            // InternalCsvMan.g:2215:2: rule__Join__Group__3__Impl rule__Join__Group__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalCsvMan.g:2222:1: rule__Join__Group__3__Impl : ( ( rule__Join__Table2Assignment_3 ) ) ;
    public final void rule__Join__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2226:1: ( ( ( rule__Join__Table2Assignment_3 ) ) )
            // InternalCsvMan.g:2227:1: ( ( rule__Join__Table2Assignment_3 ) )
            {
            // InternalCsvMan.g:2227:1: ( ( rule__Join__Table2Assignment_3 ) )
            // InternalCsvMan.g:2228:2: ( rule__Join__Table2Assignment_3 )
            {
             before(grammarAccess.getJoinAccess().getTable2Assignment_3()); 
            // InternalCsvMan.g:2229:2: ( rule__Join__Table2Assignment_3 )
            // InternalCsvMan.g:2229:3: rule__Join__Table2Assignment_3
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
    // InternalCsvMan.g:2237:1: rule__Join__Group__4 : rule__Join__Group__4__Impl rule__Join__Group__5 ;
    public final void rule__Join__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2241:1: ( rule__Join__Group__4__Impl rule__Join__Group__5 )
            // InternalCsvMan.g:2242:2: rule__Join__Group__4__Impl rule__Join__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Join__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Join__Group__5();

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
    // InternalCsvMan.g:2249:1: rule__Join__Group__4__Impl : ( 'in' ) ;
    public final void rule__Join__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2253:1: ( ( 'in' ) )
            // InternalCsvMan.g:2254:1: ( 'in' )
            {
            // InternalCsvMan.g:2254:1: ( 'in' )
            // InternalCsvMan.g:2255:2: 'in'
            {
             before(grammarAccess.getJoinAccess().getInKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getJoinAccess().getInKeyword_4()); 

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


    // $ANTLR start "rule__Join__Group__5"
    // InternalCsvMan.g:2264:1: rule__Join__Group__5 : rule__Join__Group__5__Impl rule__Join__Group__6 ;
    public final void rule__Join__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2268:1: ( rule__Join__Group__5__Impl rule__Join__Group__6 )
            // InternalCsvMan.g:2269:2: rule__Join__Group__5__Impl rule__Join__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Join__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Join__Group__6();

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
    // $ANTLR end "rule__Join__Group__5"


    // $ANTLR start "rule__Join__Group__5__Impl"
    // InternalCsvMan.g:2276:1: rule__Join__Group__5__Impl : ( ( rule__Join__Table3Assignment_5 ) ) ;
    public final void rule__Join__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2280:1: ( ( ( rule__Join__Table3Assignment_5 ) ) )
            // InternalCsvMan.g:2281:1: ( ( rule__Join__Table3Assignment_5 ) )
            {
            // InternalCsvMan.g:2281:1: ( ( rule__Join__Table3Assignment_5 ) )
            // InternalCsvMan.g:2282:2: ( rule__Join__Table3Assignment_5 )
            {
             before(grammarAccess.getJoinAccess().getTable3Assignment_5()); 
            // InternalCsvMan.g:2283:2: ( rule__Join__Table3Assignment_5 )
            // InternalCsvMan.g:2283:3: rule__Join__Table3Assignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Join__Table3Assignment_5();

            state._fsp--;


            }

             after(grammarAccess.getJoinAccess().getTable3Assignment_5()); 

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
    // $ANTLR end "rule__Join__Group__5__Impl"


    // $ANTLR start "rule__Join__Group__6"
    // InternalCsvMan.g:2291:1: rule__Join__Group__6 : rule__Join__Group__6__Impl ;
    public final void rule__Join__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2295:1: ( rule__Join__Group__6__Impl )
            // InternalCsvMan.g:2296:2: rule__Join__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Join__Group__6__Impl();

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
    // $ANTLR end "rule__Join__Group__6"


    // $ANTLR start "rule__Join__Group__6__Impl"
    // InternalCsvMan.g:2302:1: rule__Join__Group__6__Impl : ( RULE_NL ) ;
    public final void rule__Join__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2306:1: ( ( RULE_NL ) )
            // InternalCsvMan.g:2307:1: ( RULE_NL )
            {
            // InternalCsvMan.g:2307:1: ( RULE_NL )
            // InternalCsvMan.g:2308:2: RULE_NL
            {
             before(grammarAccess.getJoinAccess().getNLTerminalRuleCall_6()); 
            match(input,RULE_NL,FOLLOW_2); 
             after(grammarAccess.getJoinAccess().getNLTerminalRuleCall_6()); 

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
    // $ANTLR end "rule__Join__Group__6__Impl"


    // $ANTLR start "rule__Delete__Group__0"
    // InternalCsvMan.g:2318:1: rule__Delete__Group__0 : rule__Delete__Group__0__Impl rule__Delete__Group__1 ;
    public final void rule__Delete__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2322:1: ( rule__Delete__Group__0__Impl rule__Delete__Group__1 )
            // InternalCsvMan.g:2323:2: rule__Delete__Group__0__Impl rule__Delete__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalCsvMan.g:2330:1: rule__Delete__Group__0__Impl : ( () ) ;
    public final void rule__Delete__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2334:1: ( ( () ) )
            // InternalCsvMan.g:2335:1: ( () )
            {
            // InternalCsvMan.g:2335:1: ( () )
            // InternalCsvMan.g:2336:2: ()
            {
             before(grammarAccess.getDeleteAccess().getDeleteAction_0()); 
            // InternalCsvMan.g:2337:2: ()
            // InternalCsvMan.g:2337:3: 
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
    // InternalCsvMan.g:2345:1: rule__Delete__Group__1 : rule__Delete__Group__1__Impl rule__Delete__Group__2 ;
    public final void rule__Delete__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2349:1: ( rule__Delete__Group__1__Impl rule__Delete__Group__2 )
            // InternalCsvMan.g:2350:2: rule__Delete__Group__1__Impl rule__Delete__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalCsvMan.g:2357:1: rule__Delete__Group__1__Impl : ( 'delete' ) ;
    public final void rule__Delete__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2361:1: ( ( 'delete' ) )
            // InternalCsvMan.g:2362:1: ( 'delete' )
            {
            // InternalCsvMan.g:2362:1: ( 'delete' )
            // InternalCsvMan.g:2363:2: 'delete'
            {
             before(grammarAccess.getDeleteAccess().getDeleteKeyword_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalCsvMan.g:2372:1: rule__Delete__Group__2 : rule__Delete__Group__2__Impl rule__Delete__Group__3 ;
    public final void rule__Delete__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2376:1: ( rule__Delete__Group__2__Impl rule__Delete__Group__3 )
            // InternalCsvMan.g:2377:2: rule__Delete__Group__2__Impl rule__Delete__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalCsvMan.g:2384:1: rule__Delete__Group__2__Impl : ( ( rule__Delete__TableAssignment_2 ) ) ;
    public final void rule__Delete__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2388:1: ( ( ( rule__Delete__TableAssignment_2 ) ) )
            // InternalCsvMan.g:2389:1: ( ( rule__Delete__TableAssignment_2 ) )
            {
            // InternalCsvMan.g:2389:1: ( ( rule__Delete__TableAssignment_2 ) )
            // InternalCsvMan.g:2390:2: ( rule__Delete__TableAssignment_2 )
            {
             before(grammarAccess.getDeleteAccess().getTableAssignment_2()); 
            // InternalCsvMan.g:2391:2: ( rule__Delete__TableAssignment_2 )
            // InternalCsvMan.g:2391:3: rule__Delete__TableAssignment_2
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
    // InternalCsvMan.g:2399:1: rule__Delete__Group__3 : rule__Delete__Group__3__Impl rule__Delete__Group__4 ;
    public final void rule__Delete__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2403:1: ( rule__Delete__Group__3__Impl rule__Delete__Group__4 )
            // InternalCsvMan.g:2404:2: rule__Delete__Group__3__Impl rule__Delete__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalCsvMan.g:2411:1: rule__Delete__Group__3__Impl : ( ( rule__Delete__WhereAssignment_3 )? ) ;
    public final void rule__Delete__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2415:1: ( ( ( rule__Delete__WhereAssignment_3 )? ) )
            // InternalCsvMan.g:2416:1: ( ( rule__Delete__WhereAssignment_3 )? )
            {
            // InternalCsvMan.g:2416:1: ( ( rule__Delete__WhereAssignment_3 )? )
            // InternalCsvMan.g:2417:2: ( rule__Delete__WhereAssignment_3 )?
            {
             before(grammarAccess.getDeleteAccess().getWhereAssignment_3()); 
            // InternalCsvMan.g:2418:2: ( rule__Delete__WhereAssignment_3 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalCsvMan.g:2418:3: rule__Delete__WhereAssignment_3
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
    // InternalCsvMan.g:2426:1: rule__Delete__Group__4 : rule__Delete__Group__4__Impl ;
    public final void rule__Delete__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2430:1: ( rule__Delete__Group__4__Impl )
            // InternalCsvMan.g:2431:2: rule__Delete__Group__4__Impl
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
    // InternalCsvMan.g:2437:1: rule__Delete__Group__4__Impl : ( RULE_NL ) ;
    public final void rule__Delete__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2441:1: ( ( RULE_NL ) )
            // InternalCsvMan.g:2442:1: ( RULE_NL )
            {
            // InternalCsvMan.g:2442:1: ( RULE_NL )
            // InternalCsvMan.g:2443:2: RULE_NL
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
    // InternalCsvMan.g:2453:1: rule__Exit__Group__0 : rule__Exit__Group__0__Impl rule__Exit__Group__1 ;
    public final void rule__Exit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2457:1: ( rule__Exit__Group__0__Impl rule__Exit__Group__1 )
            // InternalCsvMan.g:2458:2: rule__Exit__Group__0__Impl rule__Exit__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalCsvMan.g:2465:1: rule__Exit__Group__0__Impl : ( () ) ;
    public final void rule__Exit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2469:1: ( ( () ) )
            // InternalCsvMan.g:2470:1: ( () )
            {
            // InternalCsvMan.g:2470:1: ( () )
            // InternalCsvMan.g:2471:2: ()
            {
             before(grammarAccess.getExitAccess().getExitAction_0()); 
            // InternalCsvMan.g:2472:2: ()
            // InternalCsvMan.g:2472:3: 
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
    // InternalCsvMan.g:2480:1: rule__Exit__Group__1 : rule__Exit__Group__1__Impl ;
    public final void rule__Exit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2484:1: ( rule__Exit__Group__1__Impl )
            // InternalCsvMan.g:2485:2: rule__Exit__Group__1__Impl
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
    // InternalCsvMan.g:2491:1: rule__Exit__Group__1__Impl : ( 'exit' ) ;
    public final void rule__Exit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2495:1: ( ( 'exit' ) )
            // InternalCsvMan.g:2496:1: ( 'exit' )
            {
            // InternalCsvMan.g:2496:1: ( 'exit' )
            // InternalCsvMan.g:2497:2: 'exit'
            {
             before(grammarAccess.getExitAccess().getExitKeyword_1()); 
            match(input,28,FOLLOW_2); 
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
    // InternalCsvMan.g:2507:1: rule__Where__Group__0 : rule__Where__Group__0__Impl rule__Where__Group__1 ;
    public final void rule__Where__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2511:1: ( rule__Where__Group__0__Impl rule__Where__Group__1 )
            // InternalCsvMan.g:2512:2: rule__Where__Group__0__Impl rule__Where__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalCsvMan.g:2519:1: rule__Where__Group__0__Impl : ( () ) ;
    public final void rule__Where__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2523:1: ( ( () ) )
            // InternalCsvMan.g:2524:1: ( () )
            {
            // InternalCsvMan.g:2524:1: ( () )
            // InternalCsvMan.g:2525:2: ()
            {
             before(grammarAccess.getWhereAccess().getWhereAction_0()); 
            // InternalCsvMan.g:2526:2: ()
            // InternalCsvMan.g:2526:3: 
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
    // InternalCsvMan.g:2534:1: rule__Where__Group__1 : rule__Where__Group__1__Impl rule__Where__Group__2 ;
    public final void rule__Where__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2538:1: ( rule__Where__Group__1__Impl rule__Where__Group__2 )
            // InternalCsvMan.g:2539:2: rule__Where__Group__1__Impl rule__Where__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalCsvMan.g:2546:1: rule__Where__Group__1__Impl : ( 'where' ) ;
    public final void rule__Where__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2550:1: ( ( 'where' ) )
            // InternalCsvMan.g:2551:1: ( 'where' )
            {
            // InternalCsvMan.g:2551:1: ( 'where' )
            // InternalCsvMan.g:2552:2: 'where'
            {
             before(grammarAccess.getWhereAccess().getWhereKeyword_1()); 
            match(input,29,FOLLOW_2); 
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
    // InternalCsvMan.g:2561:1: rule__Where__Group__2 : rule__Where__Group__2__Impl rule__Where__Group__3 ;
    public final void rule__Where__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2565:1: ( rule__Where__Group__2__Impl rule__Where__Group__3 )
            // InternalCsvMan.g:2566:2: rule__Where__Group__2__Impl rule__Where__Group__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalCsvMan.g:2573:1: rule__Where__Group__2__Impl : ( ( rule__Where__ConditionAssignment_2 ) ) ;
    public final void rule__Where__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2577:1: ( ( ( rule__Where__ConditionAssignment_2 ) ) )
            // InternalCsvMan.g:2578:1: ( ( rule__Where__ConditionAssignment_2 ) )
            {
            // InternalCsvMan.g:2578:1: ( ( rule__Where__ConditionAssignment_2 ) )
            // InternalCsvMan.g:2579:2: ( rule__Where__ConditionAssignment_2 )
            {
             before(grammarAccess.getWhereAccess().getConditionAssignment_2()); 
            // InternalCsvMan.g:2580:2: ( rule__Where__ConditionAssignment_2 )
            // InternalCsvMan.g:2580:3: rule__Where__ConditionAssignment_2
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
    // InternalCsvMan.g:2588:1: rule__Where__Group__3 : rule__Where__Group__3__Impl ;
    public final void rule__Where__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2592:1: ( rule__Where__Group__3__Impl )
            // InternalCsvMan.g:2593:2: rule__Where__Group__3__Impl
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
    // InternalCsvMan.g:2599:1: rule__Where__Group__3__Impl : ( ( rule__Where__Group_3__0 )* ) ;
    public final void rule__Where__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2603:1: ( ( ( rule__Where__Group_3__0 )* ) )
            // InternalCsvMan.g:2604:1: ( ( rule__Where__Group_3__0 )* )
            {
            // InternalCsvMan.g:2604:1: ( ( rule__Where__Group_3__0 )* )
            // InternalCsvMan.g:2605:2: ( rule__Where__Group_3__0 )*
            {
             before(grammarAccess.getWhereAccess().getGroup_3()); 
            // InternalCsvMan.g:2606:2: ( rule__Where__Group_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==19) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalCsvMan.g:2606:3: rule__Where__Group_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Where__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalCsvMan.g:2615:1: rule__Where__Group_3__0 : rule__Where__Group_3__0__Impl rule__Where__Group_3__1 ;
    public final void rule__Where__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2619:1: ( rule__Where__Group_3__0__Impl rule__Where__Group_3__1 )
            // InternalCsvMan.g:2620:2: rule__Where__Group_3__0__Impl rule__Where__Group_3__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalCsvMan.g:2627:1: rule__Where__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Where__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2631:1: ( ( ',' ) )
            // InternalCsvMan.g:2632:1: ( ',' )
            {
            // InternalCsvMan.g:2632:1: ( ',' )
            // InternalCsvMan.g:2633:2: ','
            {
             before(grammarAccess.getWhereAccess().getCommaKeyword_3_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalCsvMan.g:2642:1: rule__Where__Group_3__1 : rule__Where__Group_3__1__Impl ;
    public final void rule__Where__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2646:1: ( rule__Where__Group_3__1__Impl )
            // InternalCsvMan.g:2647:2: rule__Where__Group_3__1__Impl
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
    // InternalCsvMan.g:2653:1: rule__Where__Group_3__1__Impl : ( ( rule__Where__ConditionAssignment_3_1 ) ) ;
    public final void rule__Where__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2657:1: ( ( ( rule__Where__ConditionAssignment_3_1 ) ) )
            // InternalCsvMan.g:2658:1: ( ( rule__Where__ConditionAssignment_3_1 ) )
            {
            // InternalCsvMan.g:2658:1: ( ( rule__Where__ConditionAssignment_3_1 ) )
            // InternalCsvMan.g:2659:2: ( rule__Where__ConditionAssignment_3_1 )
            {
             before(grammarAccess.getWhereAccess().getConditionAssignment_3_1()); 
            // InternalCsvMan.g:2660:2: ( rule__Where__ConditionAssignment_3_1 )
            // InternalCsvMan.g:2660:3: rule__Where__ConditionAssignment_3_1
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
    // InternalCsvMan.g:2669:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2673:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalCsvMan.g:2674:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalCsvMan.g:2681:1: rule__Condition__Group__0__Impl : ( () ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2685:1: ( ( () ) )
            // InternalCsvMan.g:2686:1: ( () )
            {
            // InternalCsvMan.g:2686:1: ( () )
            // InternalCsvMan.g:2687:2: ()
            {
             before(grammarAccess.getConditionAccess().getConditionAction_0()); 
            // InternalCsvMan.g:2688:2: ()
            // InternalCsvMan.g:2688:3: 
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
    // InternalCsvMan.g:2696:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl rule__Condition__Group__2 ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2700:1: ( rule__Condition__Group__1__Impl rule__Condition__Group__2 )
            // InternalCsvMan.g:2701:2: rule__Condition__Group__1__Impl rule__Condition__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalCsvMan.g:2708:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__AtributAssignment_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2712:1: ( ( ( rule__Condition__AtributAssignment_1 ) ) )
            // InternalCsvMan.g:2713:1: ( ( rule__Condition__AtributAssignment_1 ) )
            {
            // InternalCsvMan.g:2713:1: ( ( rule__Condition__AtributAssignment_1 ) )
            // InternalCsvMan.g:2714:2: ( rule__Condition__AtributAssignment_1 )
            {
             before(grammarAccess.getConditionAccess().getAtributAssignment_1()); 
            // InternalCsvMan.g:2715:2: ( rule__Condition__AtributAssignment_1 )
            // InternalCsvMan.g:2715:3: rule__Condition__AtributAssignment_1
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
    // InternalCsvMan.g:2723:1: rule__Condition__Group__2 : rule__Condition__Group__2__Impl rule__Condition__Group__3 ;
    public final void rule__Condition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2727:1: ( rule__Condition__Group__2__Impl rule__Condition__Group__3 )
            // InternalCsvMan.g:2728:2: rule__Condition__Group__2__Impl rule__Condition__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalCsvMan.g:2735:1: rule__Condition__Group__2__Impl : ( ( rule__Condition__Alternatives_2 ) ) ;
    public final void rule__Condition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2739:1: ( ( ( rule__Condition__Alternatives_2 ) ) )
            // InternalCsvMan.g:2740:1: ( ( rule__Condition__Alternatives_2 ) )
            {
            // InternalCsvMan.g:2740:1: ( ( rule__Condition__Alternatives_2 ) )
            // InternalCsvMan.g:2741:2: ( rule__Condition__Alternatives_2 )
            {
             before(grammarAccess.getConditionAccess().getAlternatives_2()); 
            // InternalCsvMan.g:2742:2: ( rule__Condition__Alternatives_2 )
            // InternalCsvMan.g:2742:3: rule__Condition__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getAlternatives_2()); 

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
    // InternalCsvMan.g:2750:1: rule__Condition__Group__3 : rule__Condition__Group__3__Impl ;
    public final void rule__Condition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2754:1: ( rule__Condition__Group__3__Impl )
            // InternalCsvMan.g:2755:2: rule__Condition__Group__3__Impl
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
    // InternalCsvMan.g:2761:1: rule__Condition__Group__3__Impl : ( ( rule__Condition__ValeurAssignment_3 ) ) ;
    public final void rule__Condition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2765:1: ( ( ( rule__Condition__ValeurAssignment_3 ) ) )
            // InternalCsvMan.g:2766:1: ( ( rule__Condition__ValeurAssignment_3 ) )
            {
            // InternalCsvMan.g:2766:1: ( ( rule__Condition__ValeurAssignment_3 ) )
            // InternalCsvMan.g:2767:2: ( rule__Condition__ValeurAssignment_3 )
            {
             before(grammarAccess.getConditionAccess().getValeurAssignment_3()); 
            // InternalCsvMan.g:2768:2: ( rule__Condition__ValeurAssignment_3 )
            // InternalCsvMan.g:2768:3: rule__Condition__ValeurAssignment_3
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


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalCsvMan.g:2777:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2781:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalCsvMan.g:2782:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1();

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
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // InternalCsvMan.g:2789:1: rule__Parameter__Group__0__Impl : ( () ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2793:1: ( ( () ) )
            // InternalCsvMan.g:2794:1: ( () )
            {
            // InternalCsvMan.g:2794:1: ( () )
            // InternalCsvMan.g:2795:2: ()
            {
             before(grammarAccess.getParameterAccess().getParameterAction_0()); 
            // InternalCsvMan.g:2796:2: ()
            // InternalCsvMan.g:2796:3: 
            {
            }

             after(grammarAccess.getParameterAccess().getParameterAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // InternalCsvMan.g:2804:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2808:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalCsvMan.g:2809:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__2();

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
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // InternalCsvMan.g:2816:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__ColonneAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2820:1: ( ( ( rule__Parameter__ColonneAssignment_1 ) ) )
            // InternalCsvMan.g:2821:1: ( ( rule__Parameter__ColonneAssignment_1 ) )
            {
            // InternalCsvMan.g:2821:1: ( ( rule__Parameter__ColonneAssignment_1 ) )
            // InternalCsvMan.g:2822:2: ( rule__Parameter__ColonneAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getColonneAssignment_1()); 
            // InternalCsvMan.g:2823:2: ( rule__Parameter__ColonneAssignment_1 )
            // InternalCsvMan.g:2823:3: rule__Parameter__ColonneAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__ColonneAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getColonneAssignment_1()); 

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
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__2"
    // InternalCsvMan.g:2831:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2835:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // InternalCsvMan.g:2836:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Parameter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__3();

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
    // $ANTLR end "rule__Parameter__Group__2"


    // $ANTLR start "rule__Parameter__Group__2__Impl"
    // InternalCsvMan.g:2843:1: rule__Parameter__Group__2__Impl : ( '=' ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2847:1: ( ( '=' ) )
            // InternalCsvMan.g:2848:1: ( '=' )
            {
            // InternalCsvMan.g:2848:1: ( '=' )
            // InternalCsvMan.g:2849:2: '='
            {
             before(grammarAccess.getParameterAccess().getEqualsSignKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getEqualsSignKeyword_2()); 

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
    // $ANTLR end "rule__Parameter__Group__2__Impl"


    // $ANTLR start "rule__Parameter__Group__3"
    // InternalCsvMan.g:2858:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2862:1: ( rule__Parameter__Group__3__Impl )
            // InternalCsvMan.g:2863:2: rule__Parameter__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__3__Impl();

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
    // $ANTLR end "rule__Parameter__Group__3"


    // $ANTLR start "rule__Parameter__Group__3__Impl"
    // InternalCsvMan.g:2869:1: rule__Parameter__Group__3__Impl : ( ( rule__Parameter__ValueAssignment_3 ) ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2873:1: ( ( ( rule__Parameter__ValueAssignment_3 ) ) )
            // InternalCsvMan.g:2874:1: ( ( rule__Parameter__ValueAssignment_3 ) )
            {
            // InternalCsvMan.g:2874:1: ( ( rule__Parameter__ValueAssignment_3 ) )
            // InternalCsvMan.g:2875:2: ( rule__Parameter__ValueAssignment_3 )
            {
             before(grammarAccess.getParameterAccess().getValueAssignment_3()); 
            // InternalCsvMan.g:2876:2: ( rule__Parameter__ValueAssignment_3 )
            // InternalCsvMan.g:2876:3: rule__Parameter__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getValueAssignment_3()); 

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
    // $ANTLR end "rule__Parameter__Group__3__Impl"


    // $ANTLR start "rule__Program__InstructionAssignment_1"
    // InternalCsvMan.g:2885:1: rule__Program__InstructionAssignment_1 : ( ruleInstruction ) ;
    public final void rule__Program__InstructionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2889:1: ( ( ruleInstruction ) )
            // InternalCsvMan.g:2890:2: ( ruleInstruction )
            {
            // InternalCsvMan.g:2890:2: ( ruleInstruction )
            // InternalCsvMan.g:2891:3: ruleInstruction
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


    // $ANTLR start "rule__Copy__AliasAssignment_2"
    // InternalCsvMan.g:2900:1: rule__Copy__AliasAssignment_2 : ( ruleEString ) ;
    public final void rule__Copy__AliasAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2904:1: ( ( ruleEString ) )
            // InternalCsvMan.g:2905:2: ( ruleEString )
            {
            // InternalCsvMan.g:2905:2: ( ruleEString )
            // InternalCsvMan.g:2906:3: ruleEString
            {
             before(grammarAccess.getCopyAccess().getAliasEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCopyAccess().getAliasEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Copy__AliasAssignment_2"


    // $ANTLR start "rule__Copy__TableAssignment_4"
    // InternalCsvMan.g:2915:1: rule__Copy__TableAssignment_4 : ( ruleEString ) ;
    public final void rule__Copy__TableAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2919:1: ( ( ruleEString ) )
            // InternalCsvMan.g:2920:2: ( ruleEString )
            {
            // InternalCsvMan.g:2920:2: ( ruleEString )
            // InternalCsvMan.g:2921:3: ruleEString
            {
             before(grammarAccess.getCopyAccess().getTableEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCopyAccess().getTableEStringParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Copy__TableAssignment_4"


    // $ANTLR start "rule__Create__TableAssignment_2"
    // InternalCsvMan.g:2930:1: rule__Create__TableAssignment_2 : ( ruleEString ) ;
    public final void rule__Create__TableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2934:1: ( ( ruleEString ) )
            // InternalCsvMan.g:2935:2: ( ruleEString )
            {
            // InternalCsvMan.g:2935:2: ( ruleEString )
            // InternalCsvMan.g:2936:3: ruleEString
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


    // $ANTLR start "rule__Create__ColonneAssignment_4"
    // InternalCsvMan.g:2945:1: rule__Create__ColonneAssignment_4 : ( ruleEString ) ;
    public final void rule__Create__ColonneAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2949:1: ( ( ruleEString ) )
            // InternalCsvMan.g:2950:2: ( ruleEString )
            {
            // InternalCsvMan.g:2950:2: ( ruleEString )
            // InternalCsvMan.g:2951:3: ruleEString
            {
             before(grammarAccess.getCreateAccess().getColonneEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCreateAccess().getColonneEStringParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Create__ColonneAssignment_4"


    // $ANTLR start "rule__Create__ColonneAssignment_5_1"
    // InternalCsvMan.g:2960:1: rule__Create__ColonneAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Create__ColonneAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2964:1: ( ( ruleEString ) )
            // InternalCsvMan.g:2965:2: ( ruleEString )
            {
            // InternalCsvMan.g:2965:2: ( ruleEString )
            // InternalCsvMan.g:2966:3: ruleEString
            {
             before(grammarAccess.getCreateAccess().getColonneEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCreateAccess().getColonneEStringParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Create__ColonneAssignment_5_1"


    // $ANTLR start "rule__Load__TableAssignment_2"
    // InternalCsvMan.g:2975:1: rule__Load__TableAssignment_2 : ( ruleEString ) ;
    public final void rule__Load__TableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2979:1: ( ( ruleEString ) )
            // InternalCsvMan.g:2980:2: ( ruleEString )
            {
            // InternalCsvMan.g:2980:2: ( ruleEString )
            // InternalCsvMan.g:2981:3: ruleEString
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
    // InternalCsvMan.g:2990:1: rule__Load__AliasAssignment_4 : ( ruleEString ) ;
    public final void rule__Load__AliasAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2994:1: ( ( ruleEString ) )
            // InternalCsvMan.g:2995:2: ( ruleEString )
            {
            // InternalCsvMan.g:2995:2: ( ruleEString )
            // InternalCsvMan.g:2996:3: ruleEString
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
    // InternalCsvMan.g:3005:1: rule__Show__TableAssignment_2 : ( ruleEString ) ;
    public final void rule__Show__TableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3009:1: ( ( ruleEString ) )
            // InternalCsvMan.g:3010:2: ( ruleEString )
            {
            // InternalCsvMan.g:3010:2: ( ruleEString )
            // InternalCsvMan.g:3011:3: ruleEString
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


    // $ANTLR start "rule__Show__ColonneAssignment_3_1"
    // InternalCsvMan.g:3020:1: rule__Show__ColonneAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Show__ColonneAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3024:1: ( ( ruleEString ) )
            // InternalCsvMan.g:3025:2: ( ruleEString )
            {
            // InternalCsvMan.g:3025:2: ( ruleEString )
            // InternalCsvMan.g:3026:3: ruleEString
            {
             before(grammarAccess.getShowAccess().getColonneEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getShowAccess().getColonneEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Show__ColonneAssignment_3_1"


    // $ANTLR start "rule__Show__ColonneAssignment_3_2_1"
    // InternalCsvMan.g:3035:1: rule__Show__ColonneAssignment_3_2_1 : ( ruleEString ) ;
    public final void rule__Show__ColonneAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3039:1: ( ( ruleEString ) )
            // InternalCsvMan.g:3040:2: ( ruleEString )
            {
            // InternalCsvMan.g:3040:2: ( ruleEString )
            // InternalCsvMan.g:3041:3: ruleEString
            {
             before(grammarAccess.getShowAccess().getColonneEStringParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getShowAccess().getColonneEStringParserRuleCall_3_2_1_0()); 

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
    // $ANTLR end "rule__Show__ColonneAssignment_3_2_1"


    // $ANTLR start "rule__Show__WhereAssignment_4"
    // InternalCsvMan.g:3050:1: rule__Show__WhereAssignment_4 : ( ruleWhere ) ;
    public final void rule__Show__WhereAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3054:1: ( ( ruleWhere ) )
            // InternalCsvMan.g:3055:2: ( ruleWhere )
            {
            // InternalCsvMan.g:3055:2: ( ruleWhere )
            // InternalCsvMan.g:3056:3: ruleWhere
            {
             before(grammarAccess.getShowAccess().getWhereWhereParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleWhere();

            state._fsp--;

             after(grammarAccess.getShowAccess().getWhereWhereParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Show__WhereAssignment_4"


    // $ANTLR start "rule__Update__TableAssignment_2"
    // InternalCsvMan.g:3065:1: rule__Update__TableAssignment_2 : ( ruleEString ) ;
    public final void rule__Update__TableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3069:1: ( ( ruleEString ) )
            // InternalCsvMan.g:3070:2: ( ruleEString )
            {
            // InternalCsvMan.g:3070:2: ( ruleEString )
            // InternalCsvMan.g:3071:3: ruleEString
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


    // $ANTLR start "rule__Update__ParameterAssignment_4"
    // InternalCsvMan.g:3080:1: rule__Update__ParameterAssignment_4 : ( ruleParameter ) ;
    public final void rule__Update__ParameterAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3084:1: ( ( ruleParameter ) )
            // InternalCsvMan.g:3085:2: ( ruleParameter )
            {
            // InternalCsvMan.g:3085:2: ( ruleParameter )
            // InternalCsvMan.g:3086:3: ruleParameter
            {
             before(grammarAccess.getUpdateAccess().getParameterParameterParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getUpdateAccess().getParameterParameterParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Update__ParameterAssignment_4"


    // $ANTLR start "rule__Update__ParameterAssignment_5_1"
    // InternalCsvMan.g:3095:1: rule__Update__ParameterAssignment_5_1 : ( ruleParameter ) ;
    public final void rule__Update__ParameterAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3099:1: ( ( ruleParameter ) )
            // InternalCsvMan.g:3100:2: ( ruleParameter )
            {
            // InternalCsvMan.g:3100:2: ( ruleParameter )
            // InternalCsvMan.g:3101:3: ruleParameter
            {
             before(grammarAccess.getUpdateAccess().getParameterParameterParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getUpdateAccess().getParameterParameterParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Update__ParameterAssignment_5_1"


    // $ANTLR start "rule__Update__WhereAssignment_6"
    // InternalCsvMan.g:3110:1: rule__Update__WhereAssignment_6 : ( ruleWhere ) ;
    public final void rule__Update__WhereAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3114:1: ( ( ruleWhere ) )
            // InternalCsvMan.g:3115:2: ( ruleWhere )
            {
            // InternalCsvMan.g:3115:2: ( ruleWhere )
            // InternalCsvMan.g:3116:3: ruleWhere
            {
             before(grammarAccess.getUpdateAccess().getWhereWhereParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleWhere();

            state._fsp--;

             after(grammarAccess.getUpdateAccess().getWhereWhereParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Update__WhereAssignment_6"


    // $ANTLR start "rule__Add__ValeurAssignment_3"
    // InternalCsvMan.g:3125:1: rule__Add__ValeurAssignment_3 : ( ruleEString ) ;
    public final void rule__Add__ValeurAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3129:1: ( ( ruleEString ) )
            // InternalCsvMan.g:3130:2: ( ruleEString )
            {
            // InternalCsvMan.g:3130:2: ( ruleEString )
            // InternalCsvMan.g:3131:3: ruleEString
            {
             before(grammarAccess.getAddAccess().getValeurEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAddAccess().getValeurEStringParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Add__ValeurAssignment_3"


    // $ANTLR start "rule__Add__ValeurAssignment_4_1"
    // InternalCsvMan.g:3140:1: rule__Add__ValeurAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Add__ValeurAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3144:1: ( ( ruleEString ) )
            // InternalCsvMan.g:3145:2: ( ruleEString )
            {
            // InternalCsvMan.g:3145:2: ( ruleEString )
            // InternalCsvMan.g:3146:3: ruleEString
            {
             before(grammarAccess.getAddAccess().getValeurEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAddAccess().getValeurEStringParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Add__ValeurAssignment_4_1"


    // $ANTLR start "rule__Add__TableAssignment_7"
    // InternalCsvMan.g:3155:1: rule__Add__TableAssignment_7 : ( ruleEString ) ;
    public final void rule__Add__TableAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3159:1: ( ( ruleEString ) )
            // InternalCsvMan.g:3160:2: ( ruleEString )
            {
            // InternalCsvMan.g:3160:2: ( ruleEString )
            // InternalCsvMan.g:3161:3: ruleEString
            {
             before(grammarAccess.getAddAccess().getTableEStringParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAddAccess().getTableEStringParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Add__TableAssignment_7"


    // $ANTLR start "rule__Join__Table1Assignment_2"
    // InternalCsvMan.g:3170:1: rule__Join__Table1Assignment_2 : ( ruleEString ) ;
    public final void rule__Join__Table1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3174:1: ( ( ruleEString ) )
            // InternalCsvMan.g:3175:2: ( ruleEString )
            {
            // InternalCsvMan.g:3175:2: ( ruleEString )
            // InternalCsvMan.g:3176:3: ruleEString
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
    // InternalCsvMan.g:3185:1: rule__Join__Table2Assignment_3 : ( ruleEString ) ;
    public final void rule__Join__Table2Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3189:1: ( ( ruleEString ) )
            // InternalCsvMan.g:3190:2: ( ruleEString )
            {
            // InternalCsvMan.g:3190:2: ( ruleEString )
            // InternalCsvMan.g:3191:3: ruleEString
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


    // $ANTLR start "rule__Join__Table3Assignment_5"
    // InternalCsvMan.g:3200:1: rule__Join__Table3Assignment_5 : ( ruleEString ) ;
    public final void rule__Join__Table3Assignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3204:1: ( ( ruleEString ) )
            // InternalCsvMan.g:3205:2: ( ruleEString )
            {
            // InternalCsvMan.g:3205:2: ( ruleEString )
            // InternalCsvMan.g:3206:3: ruleEString
            {
             before(grammarAccess.getJoinAccess().getTable3EStringParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getJoinAccess().getTable3EStringParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Join__Table3Assignment_5"


    // $ANTLR start "rule__Delete__TableAssignment_2"
    // InternalCsvMan.g:3215:1: rule__Delete__TableAssignment_2 : ( ruleEString ) ;
    public final void rule__Delete__TableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3219:1: ( ( ruleEString ) )
            // InternalCsvMan.g:3220:2: ( ruleEString )
            {
            // InternalCsvMan.g:3220:2: ( ruleEString )
            // InternalCsvMan.g:3221:3: ruleEString
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
    // InternalCsvMan.g:3230:1: rule__Delete__WhereAssignment_3 : ( ruleWhere ) ;
    public final void rule__Delete__WhereAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3234:1: ( ( ruleWhere ) )
            // InternalCsvMan.g:3235:2: ( ruleWhere )
            {
            // InternalCsvMan.g:3235:2: ( ruleWhere )
            // InternalCsvMan.g:3236:3: ruleWhere
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
    // InternalCsvMan.g:3245:1: rule__Where__ConditionAssignment_2 : ( ruleCondition ) ;
    public final void rule__Where__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3249:1: ( ( ruleCondition ) )
            // InternalCsvMan.g:3250:2: ( ruleCondition )
            {
            // InternalCsvMan.g:3250:2: ( ruleCondition )
            // InternalCsvMan.g:3251:3: ruleCondition
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
    // InternalCsvMan.g:3260:1: rule__Where__ConditionAssignment_3_1 : ( ruleCondition ) ;
    public final void rule__Where__ConditionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3264:1: ( ( ruleCondition ) )
            // InternalCsvMan.g:3265:2: ( ruleCondition )
            {
            // InternalCsvMan.g:3265:2: ( ruleCondition )
            // InternalCsvMan.g:3266:3: ruleCondition
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
    // InternalCsvMan.g:3275:1: rule__Condition__AtributAssignment_1 : ( ruleEString ) ;
    public final void rule__Condition__AtributAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3279:1: ( ( ruleEString ) )
            // InternalCsvMan.g:3280:2: ( ruleEString )
            {
            // InternalCsvMan.g:3280:2: ( ruleEString )
            // InternalCsvMan.g:3281:3: ruleEString
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
    // InternalCsvMan.g:3290:1: rule__Condition__ValeurAssignment_3 : ( ruleEString ) ;
    public final void rule__Condition__ValeurAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3294:1: ( ( ruleEString ) )
            // InternalCsvMan.g:3295:2: ( ruleEString )
            {
            // InternalCsvMan.g:3295:2: ( ruleEString )
            // InternalCsvMan.g:3296:3: ruleEString
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


    // $ANTLR start "rule__Parameter__ColonneAssignment_1"
    // InternalCsvMan.g:3305:1: rule__Parameter__ColonneAssignment_1 : ( ruleEString ) ;
    public final void rule__Parameter__ColonneAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3309:1: ( ( ruleEString ) )
            // InternalCsvMan.g:3310:2: ( ruleEString )
            {
            // InternalCsvMan.g:3310:2: ( ruleEString )
            // InternalCsvMan.g:3311:3: ruleEString
            {
             before(grammarAccess.getParameterAccess().getColonneEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getColonneEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Parameter__ColonneAssignment_1"


    // $ANTLR start "rule__Parameter__ValueAssignment_3"
    // InternalCsvMan.g:3320:1: rule__Parameter__ValueAssignment_3 : ( ruleEString ) ;
    public final void rule__Parameter__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3324:1: ( ( ruleEString ) )
            // InternalCsvMan.g:3325:2: ( ruleEString )
            {
            // InternalCsvMan.g:3325:2: ( ruleEString )
            // InternalCsvMan.g:3326:3: ruleEString
            {
             before(grammarAccess.getParameterAccess().getValueEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getValueEStringParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Parameter__ValueAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000001ED14060L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000001ED14062L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000380L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020020400L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020080400L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000400L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000002000L});

}