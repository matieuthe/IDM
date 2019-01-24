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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_OP", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_NL", "RULE_WS", "RULE_ANY_OTHER", "'='", "'remove'", "'copy'", "'in'", "'create'", "'load'", "'as'", "'show'", "'('", "')'", "','", "'update'", "'set'", "'add'", "'join'", "'delete'", "'exit'", "'where'"
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
    public static final int T__30=30;
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


    // $ANTLR start "entryRuleRemove"
    // InternalCsvMan.g:103:1: entryRuleRemove : ruleRemove EOF ;
    public final void entryRuleRemove() throws RecognitionException {
        try {
            // InternalCsvMan.g:104:1: ( ruleRemove EOF )
            // InternalCsvMan.g:105:1: ruleRemove EOF
            {
             before(grammarAccess.getRemoveRule()); 
            pushFollow(FOLLOW_1);
            ruleRemove();

            state._fsp--;

             after(grammarAccess.getRemoveRule()); 
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
    // $ANTLR end "entryRuleRemove"


    // $ANTLR start "ruleRemove"
    // InternalCsvMan.g:112:1: ruleRemove : ( ( rule__Remove__Group__0 ) ) ;
    public final void ruleRemove() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:116:2: ( ( ( rule__Remove__Group__0 ) ) )
            // InternalCsvMan.g:117:2: ( ( rule__Remove__Group__0 ) )
            {
            // InternalCsvMan.g:117:2: ( ( rule__Remove__Group__0 ) )
            // InternalCsvMan.g:118:3: ( rule__Remove__Group__0 )
            {
             before(grammarAccess.getRemoveAccess().getGroup()); 
            // InternalCsvMan.g:119:3: ( rule__Remove__Group__0 )
            // InternalCsvMan.g:119:4: rule__Remove__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Remove__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRemoveAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRemove"


    // $ANTLR start "entryRuleCopy"
    // InternalCsvMan.g:128:1: entryRuleCopy : ruleCopy EOF ;
    public final void entryRuleCopy() throws RecognitionException {
        try {
            // InternalCsvMan.g:129:1: ( ruleCopy EOF )
            // InternalCsvMan.g:130:1: ruleCopy EOF
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
    // InternalCsvMan.g:137:1: ruleCopy : ( ( rule__Copy__Group__0 ) ) ;
    public final void ruleCopy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:141:2: ( ( ( rule__Copy__Group__0 ) ) )
            // InternalCsvMan.g:142:2: ( ( rule__Copy__Group__0 ) )
            {
            // InternalCsvMan.g:142:2: ( ( rule__Copy__Group__0 ) )
            // InternalCsvMan.g:143:3: ( rule__Copy__Group__0 )
            {
             before(grammarAccess.getCopyAccess().getGroup()); 
            // InternalCsvMan.g:144:3: ( rule__Copy__Group__0 )
            // InternalCsvMan.g:144:4: rule__Copy__Group__0
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
    // InternalCsvMan.g:153:1: entryRuleCreate : ruleCreate EOF ;
    public final void entryRuleCreate() throws RecognitionException {
        try {
            // InternalCsvMan.g:154:1: ( ruleCreate EOF )
            // InternalCsvMan.g:155:1: ruleCreate EOF
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
    // InternalCsvMan.g:162:1: ruleCreate : ( ( rule__Create__Group__0 ) ) ;
    public final void ruleCreate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:166:2: ( ( ( rule__Create__Group__0 ) ) )
            // InternalCsvMan.g:167:2: ( ( rule__Create__Group__0 ) )
            {
            // InternalCsvMan.g:167:2: ( ( rule__Create__Group__0 ) )
            // InternalCsvMan.g:168:3: ( rule__Create__Group__0 )
            {
             before(grammarAccess.getCreateAccess().getGroup()); 
            // InternalCsvMan.g:169:3: ( rule__Create__Group__0 )
            // InternalCsvMan.g:169:4: rule__Create__Group__0
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
    // InternalCsvMan.g:178:1: entryRuleLoad : ruleLoad EOF ;
    public final void entryRuleLoad() throws RecognitionException {
        try {
            // InternalCsvMan.g:179:1: ( ruleLoad EOF )
            // InternalCsvMan.g:180:1: ruleLoad EOF
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
    // InternalCsvMan.g:187:1: ruleLoad : ( ( rule__Load__Group__0 ) ) ;
    public final void ruleLoad() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:191:2: ( ( ( rule__Load__Group__0 ) ) )
            // InternalCsvMan.g:192:2: ( ( rule__Load__Group__0 ) )
            {
            // InternalCsvMan.g:192:2: ( ( rule__Load__Group__0 ) )
            // InternalCsvMan.g:193:3: ( rule__Load__Group__0 )
            {
             before(grammarAccess.getLoadAccess().getGroup()); 
            // InternalCsvMan.g:194:3: ( rule__Load__Group__0 )
            // InternalCsvMan.g:194:4: rule__Load__Group__0
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
    // InternalCsvMan.g:203:1: entryRuleShow : ruleShow EOF ;
    public final void entryRuleShow() throws RecognitionException {
        try {
            // InternalCsvMan.g:204:1: ( ruleShow EOF )
            // InternalCsvMan.g:205:1: ruleShow EOF
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
    // InternalCsvMan.g:212:1: ruleShow : ( ( rule__Show__Group__0 ) ) ;
    public final void ruleShow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:216:2: ( ( ( rule__Show__Group__0 ) ) )
            // InternalCsvMan.g:217:2: ( ( rule__Show__Group__0 ) )
            {
            // InternalCsvMan.g:217:2: ( ( rule__Show__Group__0 ) )
            // InternalCsvMan.g:218:3: ( rule__Show__Group__0 )
            {
             before(grammarAccess.getShowAccess().getGroup()); 
            // InternalCsvMan.g:219:3: ( rule__Show__Group__0 )
            // InternalCsvMan.g:219:4: rule__Show__Group__0
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
    // InternalCsvMan.g:228:1: entryRuleUpdate : ruleUpdate EOF ;
    public final void entryRuleUpdate() throws RecognitionException {
        try {
            // InternalCsvMan.g:229:1: ( ruleUpdate EOF )
            // InternalCsvMan.g:230:1: ruleUpdate EOF
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
    // InternalCsvMan.g:237:1: ruleUpdate : ( ( rule__Update__Group__0 ) ) ;
    public final void ruleUpdate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:241:2: ( ( ( rule__Update__Group__0 ) ) )
            // InternalCsvMan.g:242:2: ( ( rule__Update__Group__0 ) )
            {
            // InternalCsvMan.g:242:2: ( ( rule__Update__Group__0 ) )
            // InternalCsvMan.g:243:3: ( rule__Update__Group__0 )
            {
             before(grammarAccess.getUpdateAccess().getGroup()); 
            // InternalCsvMan.g:244:3: ( rule__Update__Group__0 )
            // InternalCsvMan.g:244:4: rule__Update__Group__0
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
    // InternalCsvMan.g:253:1: entryRuleAdd : ruleAdd EOF ;
    public final void entryRuleAdd() throws RecognitionException {
        try {
            // InternalCsvMan.g:254:1: ( ruleAdd EOF )
            // InternalCsvMan.g:255:1: ruleAdd EOF
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
    // InternalCsvMan.g:262:1: ruleAdd : ( ( rule__Add__Group__0 ) ) ;
    public final void ruleAdd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:266:2: ( ( ( rule__Add__Group__0 ) ) )
            // InternalCsvMan.g:267:2: ( ( rule__Add__Group__0 ) )
            {
            // InternalCsvMan.g:267:2: ( ( rule__Add__Group__0 ) )
            // InternalCsvMan.g:268:3: ( rule__Add__Group__0 )
            {
             before(grammarAccess.getAddAccess().getGroup()); 
            // InternalCsvMan.g:269:3: ( rule__Add__Group__0 )
            // InternalCsvMan.g:269:4: rule__Add__Group__0
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
    // InternalCsvMan.g:278:1: entryRuleJoin : ruleJoin EOF ;
    public final void entryRuleJoin() throws RecognitionException {
        try {
            // InternalCsvMan.g:279:1: ( ruleJoin EOF )
            // InternalCsvMan.g:280:1: ruleJoin EOF
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
    // InternalCsvMan.g:287:1: ruleJoin : ( ( rule__Join__Group__0 ) ) ;
    public final void ruleJoin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:291:2: ( ( ( rule__Join__Group__0 ) ) )
            // InternalCsvMan.g:292:2: ( ( rule__Join__Group__0 ) )
            {
            // InternalCsvMan.g:292:2: ( ( rule__Join__Group__0 ) )
            // InternalCsvMan.g:293:3: ( rule__Join__Group__0 )
            {
             before(grammarAccess.getJoinAccess().getGroup()); 
            // InternalCsvMan.g:294:3: ( rule__Join__Group__0 )
            // InternalCsvMan.g:294:4: rule__Join__Group__0
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
    // InternalCsvMan.g:303:1: entryRuleDelete : ruleDelete EOF ;
    public final void entryRuleDelete() throws RecognitionException {
        try {
            // InternalCsvMan.g:304:1: ( ruleDelete EOF )
            // InternalCsvMan.g:305:1: ruleDelete EOF
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
    // InternalCsvMan.g:312:1: ruleDelete : ( ( rule__Delete__Group__0 ) ) ;
    public final void ruleDelete() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:316:2: ( ( ( rule__Delete__Group__0 ) ) )
            // InternalCsvMan.g:317:2: ( ( rule__Delete__Group__0 ) )
            {
            // InternalCsvMan.g:317:2: ( ( rule__Delete__Group__0 ) )
            // InternalCsvMan.g:318:3: ( rule__Delete__Group__0 )
            {
             before(grammarAccess.getDeleteAccess().getGroup()); 
            // InternalCsvMan.g:319:3: ( rule__Delete__Group__0 )
            // InternalCsvMan.g:319:4: rule__Delete__Group__0
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
    // InternalCsvMan.g:328:1: entryRuleExit : ruleExit EOF ;
    public final void entryRuleExit() throws RecognitionException {
        try {
            // InternalCsvMan.g:329:1: ( ruleExit EOF )
            // InternalCsvMan.g:330:1: ruleExit EOF
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
    // InternalCsvMan.g:337:1: ruleExit : ( ( rule__Exit__Group__0 ) ) ;
    public final void ruleExit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:341:2: ( ( ( rule__Exit__Group__0 ) ) )
            // InternalCsvMan.g:342:2: ( ( rule__Exit__Group__0 ) )
            {
            // InternalCsvMan.g:342:2: ( ( rule__Exit__Group__0 ) )
            // InternalCsvMan.g:343:3: ( rule__Exit__Group__0 )
            {
             before(grammarAccess.getExitAccess().getGroup()); 
            // InternalCsvMan.g:344:3: ( rule__Exit__Group__0 )
            // InternalCsvMan.g:344:4: rule__Exit__Group__0
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
    // InternalCsvMan.g:353:1: entryRuleWhere : ruleWhere EOF ;
    public final void entryRuleWhere() throws RecognitionException {
        try {
            // InternalCsvMan.g:354:1: ( ruleWhere EOF )
            // InternalCsvMan.g:355:1: ruleWhere EOF
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
    // InternalCsvMan.g:362:1: ruleWhere : ( ( rule__Where__Group__0 ) ) ;
    public final void ruleWhere() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:366:2: ( ( ( rule__Where__Group__0 ) ) )
            // InternalCsvMan.g:367:2: ( ( rule__Where__Group__0 ) )
            {
            // InternalCsvMan.g:367:2: ( ( rule__Where__Group__0 ) )
            // InternalCsvMan.g:368:3: ( rule__Where__Group__0 )
            {
             before(grammarAccess.getWhereAccess().getGroup()); 
            // InternalCsvMan.g:369:3: ( rule__Where__Group__0 )
            // InternalCsvMan.g:369:4: rule__Where__Group__0
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
    // InternalCsvMan.g:378:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalCsvMan.g:379:1: ( ruleCondition EOF )
            // InternalCsvMan.g:380:1: ruleCondition EOF
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
    // InternalCsvMan.g:387:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:391:2: ( ( ( rule__Condition__Group__0 ) ) )
            // InternalCsvMan.g:392:2: ( ( rule__Condition__Group__0 ) )
            {
            // InternalCsvMan.g:392:2: ( ( rule__Condition__Group__0 ) )
            // InternalCsvMan.g:393:3: ( rule__Condition__Group__0 )
            {
             before(grammarAccess.getConditionAccess().getGroup()); 
            // InternalCsvMan.g:394:3: ( rule__Condition__Group__0 )
            // InternalCsvMan.g:394:4: rule__Condition__Group__0
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
    // InternalCsvMan.g:403:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalCsvMan.g:404:1: ( ruleParameter EOF )
            // InternalCsvMan.g:405:1: ruleParameter EOF
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
    // InternalCsvMan.g:412:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:416:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalCsvMan.g:417:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalCsvMan.g:417:2: ( ( rule__Parameter__Group__0 ) )
            // InternalCsvMan.g:418:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalCsvMan.g:419:3: ( rule__Parameter__Group__0 )
            // InternalCsvMan.g:419:4: rule__Parameter__Group__0
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


    // $ANTLR start "entryRuleCsvTable"
    // InternalCsvMan.g:428:1: entryRuleCsvTable : ruleCsvTable EOF ;
    public final void entryRuleCsvTable() throws RecognitionException {
        try {
            // InternalCsvMan.g:429:1: ( ruleCsvTable EOF )
            // InternalCsvMan.g:430:1: ruleCsvTable EOF
            {
             before(grammarAccess.getCsvTableRule()); 
            pushFollow(FOLLOW_1);
            ruleCsvTable();

            state._fsp--;

             after(grammarAccess.getCsvTableRule()); 
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
    // $ANTLR end "entryRuleCsvTable"


    // $ANTLR start "ruleCsvTable"
    // InternalCsvMan.g:437:1: ruleCsvTable : ( ( rule__CsvTable__Group__0 ) ) ;
    public final void ruleCsvTable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:441:2: ( ( ( rule__CsvTable__Group__0 ) ) )
            // InternalCsvMan.g:442:2: ( ( rule__CsvTable__Group__0 ) )
            {
            // InternalCsvMan.g:442:2: ( ( rule__CsvTable__Group__0 ) )
            // InternalCsvMan.g:443:3: ( rule__CsvTable__Group__0 )
            {
             before(grammarAccess.getCsvTableAccess().getGroup()); 
            // InternalCsvMan.g:444:3: ( rule__CsvTable__Group__0 )
            // InternalCsvMan.g:444:4: rule__CsvTable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CsvTable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCsvTableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCsvTable"


    // $ANTLR start "entryRuleComment"
    // InternalCsvMan.g:453:1: entryRuleComment : ruleComment EOF ;
    public final void entryRuleComment() throws RecognitionException {
        try {
            // InternalCsvMan.g:454:1: ( ruleComment EOF )
            // InternalCsvMan.g:455:1: ruleComment EOF
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
    // InternalCsvMan.g:462:1: ruleComment : ( ( rule__Comment__Alternatives ) ) ;
    public final void ruleComment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:466:2: ( ( ( rule__Comment__Alternatives ) ) )
            // InternalCsvMan.g:467:2: ( ( rule__Comment__Alternatives ) )
            {
            // InternalCsvMan.g:467:2: ( ( rule__Comment__Alternatives ) )
            // InternalCsvMan.g:468:3: ( rule__Comment__Alternatives )
            {
             before(grammarAccess.getCommentAccess().getAlternatives()); 
            // InternalCsvMan.g:469:3: ( rule__Comment__Alternatives )
            // InternalCsvMan.g:469:4: rule__Comment__Alternatives
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
    // InternalCsvMan.g:478:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalCsvMan.g:479:1: ( ruleEString EOF )
            // InternalCsvMan.g:480:1: ruleEString EOF
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
    // InternalCsvMan.g:487:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:491:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalCsvMan.g:492:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalCsvMan.g:492:2: ( ( rule__EString__Alternatives ) )
            // InternalCsvMan.g:493:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalCsvMan.g:494:3: ( rule__EString__Alternatives )
            // InternalCsvMan.g:494:4: rule__EString__Alternatives
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
    // InternalCsvMan.g:502:1: rule__Instruction__Alternatives : ( ( ruleCreate ) | ( ruleLoad ) | ( ruleShow ) | ( ruleUpdate ) | ( ruleAdd ) | ( ruleJoin ) | ( ruleDelete ) | ( ruleExit ) | ( ruleComment ) | ( ruleCopy ) | ( ruleRemove ) );
    public final void rule__Instruction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:506:1: ( ( ruleCreate ) | ( ruleLoad ) | ( ruleShow ) | ( ruleUpdate ) | ( ruleAdd ) | ( ruleJoin ) | ( ruleDelete ) | ( ruleExit ) | ( ruleComment ) | ( ruleCopy ) | ( ruleRemove ) )
            int alt1=11;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt1=1;
                }
                break;
            case 18:
                {
                alt1=2;
                }
                break;
            case 20:
                {
                alt1=3;
                }
                break;
            case 24:
                {
                alt1=4;
                }
                break;
            case 26:
                {
                alt1=5;
                }
                break;
            case 27:
                {
                alt1=6;
                }
                break;
            case 28:
                {
                alt1=7;
                }
                break;
            case 29:
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
            case 15:
                {
                alt1=10;
                }
                break;
            case 14:
                {
                alt1=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalCsvMan.g:507:2: ( ruleCreate )
                    {
                    // InternalCsvMan.g:507:2: ( ruleCreate )
                    // InternalCsvMan.g:508:3: ruleCreate
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
                    // InternalCsvMan.g:513:2: ( ruleLoad )
                    {
                    // InternalCsvMan.g:513:2: ( ruleLoad )
                    // InternalCsvMan.g:514:3: ruleLoad
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
                    // InternalCsvMan.g:519:2: ( ruleShow )
                    {
                    // InternalCsvMan.g:519:2: ( ruleShow )
                    // InternalCsvMan.g:520:3: ruleShow
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
                    // InternalCsvMan.g:525:2: ( ruleUpdate )
                    {
                    // InternalCsvMan.g:525:2: ( ruleUpdate )
                    // InternalCsvMan.g:526:3: ruleUpdate
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
                    // InternalCsvMan.g:531:2: ( ruleAdd )
                    {
                    // InternalCsvMan.g:531:2: ( ruleAdd )
                    // InternalCsvMan.g:532:3: ruleAdd
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
                    // InternalCsvMan.g:537:2: ( ruleJoin )
                    {
                    // InternalCsvMan.g:537:2: ( ruleJoin )
                    // InternalCsvMan.g:538:3: ruleJoin
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
                    // InternalCsvMan.g:543:2: ( ruleDelete )
                    {
                    // InternalCsvMan.g:543:2: ( ruleDelete )
                    // InternalCsvMan.g:544:3: ruleDelete
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
                    // InternalCsvMan.g:549:2: ( ruleExit )
                    {
                    // InternalCsvMan.g:549:2: ( ruleExit )
                    // InternalCsvMan.g:550:3: ruleExit
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
                    // InternalCsvMan.g:555:2: ( ruleComment )
                    {
                    // InternalCsvMan.g:555:2: ( ruleComment )
                    // InternalCsvMan.g:556:3: ruleComment
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
                    // InternalCsvMan.g:561:2: ( ruleCopy )
                    {
                    // InternalCsvMan.g:561:2: ( ruleCopy )
                    // InternalCsvMan.g:562:3: ruleCopy
                    {
                     before(grammarAccess.getInstructionAccess().getCopyParserRuleCall_9()); 
                    pushFollow(FOLLOW_2);
                    ruleCopy();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getCopyParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalCsvMan.g:567:2: ( ruleRemove )
                    {
                    // InternalCsvMan.g:567:2: ( ruleRemove )
                    // InternalCsvMan.g:568:3: ruleRemove
                    {
                     before(grammarAccess.getInstructionAccess().getRemoveParserRuleCall_10()); 
                    pushFollow(FOLLOW_2);
                    ruleRemove();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getRemoveParserRuleCall_10()); 

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


    // $ANTLR start "rule__Add__Alternatives_2"
    // InternalCsvMan.g:577:1: rule__Add__Alternatives_2 : ( ( ( rule__Add__Group_2_0__0 ) ) | ( ( rule__Add__Group_2_1__0 ) ) );
    public final void rule__Add__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:581:1: ( ( ( rule__Add__Group_2_0__0 ) ) | ( ( rule__Add__Group_2_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==21) ) {
                switch ( input.LA(2) ) {
                case RULE_STRING:
                    {
                    int LA2_2 = input.LA(3);

                    if ( (LA2_2==13) ) {
                        alt2=2;
                    }
                    else if ( ((LA2_2>=22 && LA2_2<=23)) ) {
                        alt2=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_ID:
                    {
                    int LA2_3 = input.LA(3);

                    if ( (LA2_3==13) ) {
                        alt2=2;
                    }
                    else if ( ((LA2_3>=22 && LA2_3<=23)) ) {
                        alt2=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_INT:
                    {
                    int LA2_4 = input.LA(3);

                    if ( (LA2_4==13) ) {
                        alt2=2;
                    }
                    else if ( ((LA2_4>=22 && LA2_4<=23)) ) {
                        alt2=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalCsvMan.g:582:2: ( ( rule__Add__Group_2_0__0 ) )
                    {
                    // InternalCsvMan.g:582:2: ( ( rule__Add__Group_2_0__0 ) )
                    // InternalCsvMan.g:583:3: ( rule__Add__Group_2_0__0 )
                    {
                     before(grammarAccess.getAddAccess().getGroup_2_0()); 
                    // InternalCsvMan.g:584:3: ( rule__Add__Group_2_0__0 )
                    // InternalCsvMan.g:584:4: rule__Add__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Add__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAddAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCsvMan.g:588:2: ( ( rule__Add__Group_2_1__0 ) )
                    {
                    // InternalCsvMan.g:588:2: ( ( rule__Add__Group_2_1__0 ) )
                    // InternalCsvMan.g:589:3: ( rule__Add__Group_2_1__0 )
                    {
                     before(grammarAccess.getAddAccess().getGroup_2_1()); 
                    // InternalCsvMan.g:590:3: ( rule__Add__Group_2_1__0 )
                    // InternalCsvMan.g:590:4: rule__Add__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Add__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAddAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__Add__Alternatives_2"


    // $ANTLR start "rule__Condition__Alternatives_2"
    // InternalCsvMan.g:598:1: rule__Condition__Alternatives_2 : ( ( '=' ) | ( RULE_OP ) );
    public final void rule__Condition__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:602:1: ( ( '=' ) | ( RULE_OP ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_OP) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalCsvMan.g:603:2: ( '=' )
                    {
                    // InternalCsvMan.g:603:2: ( '=' )
                    // InternalCsvMan.g:604:3: '='
                    {
                     before(grammarAccess.getConditionAccess().getEqualsSignKeyword_2_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getEqualsSignKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCsvMan.g:609:2: ( RULE_OP )
                    {
                    // InternalCsvMan.g:609:2: ( RULE_OP )
                    // InternalCsvMan.g:610:3: RULE_OP
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
    // InternalCsvMan.g:619:1: rule__Comment__Alternatives : ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) );
    public final void rule__Comment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:623:1: ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ML_COMMENT) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_SL_COMMENT) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalCsvMan.g:624:2: ( RULE_ML_COMMENT )
                    {
                    // InternalCsvMan.g:624:2: ( RULE_ML_COMMENT )
                    // InternalCsvMan.g:625:3: RULE_ML_COMMENT
                    {
                     before(grammarAccess.getCommentAccess().getML_COMMENTTerminalRuleCall_0()); 
                    match(input,RULE_ML_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getCommentAccess().getML_COMMENTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCsvMan.g:630:2: ( RULE_SL_COMMENT )
                    {
                    // InternalCsvMan.g:630:2: ( RULE_SL_COMMENT )
                    // InternalCsvMan.g:631:3: RULE_SL_COMMENT
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
    // InternalCsvMan.g:640:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) | ( RULE_INT ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:644:1: ( ( RULE_STRING ) | ( RULE_ID ) | ( RULE_INT ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt5=1;
                }
                break;
            case RULE_ID:
                {
                alt5=2;
                }
                break;
            case RULE_INT:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalCsvMan.g:645:2: ( RULE_STRING )
                    {
                    // InternalCsvMan.g:645:2: ( RULE_STRING )
                    // InternalCsvMan.g:646:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCsvMan.g:651:2: ( RULE_ID )
                    {
                    // InternalCsvMan.g:651:2: ( RULE_ID )
                    // InternalCsvMan.g:652:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCsvMan.g:657:2: ( RULE_INT )
                    {
                    // InternalCsvMan.g:657:2: ( RULE_INT )
                    // InternalCsvMan.g:658:3: RULE_INT
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
    // InternalCsvMan.g:667:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:671:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalCsvMan.g:672:2: rule__Program__Group__0__Impl rule__Program__Group__1
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
    // InternalCsvMan.g:679:1: rule__Program__Group__0__Impl : ( () ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:683:1: ( ( () ) )
            // InternalCsvMan.g:684:1: ( () )
            {
            // InternalCsvMan.g:684:1: ( () )
            // InternalCsvMan.g:685:2: ()
            {
             before(grammarAccess.getProgramAccess().getProgramAction_0()); 
            // InternalCsvMan.g:686:2: ()
            // InternalCsvMan.g:686:3: 
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
    // InternalCsvMan.g:694:1: rule__Program__Group__1 : rule__Program__Group__1__Impl ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:698:1: ( rule__Program__Group__1__Impl )
            // InternalCsvMan.g:699:2: rule__Program__Group__1__Impl
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
    // InternalCsvMan.g:705:1: rule__Program__Group__1__Impl : ( ( rule__Program__Group_1__0 )* ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:709:1: ( ( ( rule__Program__Group_1__0 )* ) )
            // InternalCsvMan.g:710:1: ( ( rule__Program__Group_1__0 )* )
            {
            // InternalCsvMan.g:710:1: ( ( rule__Program__Group_1__0 )* )
            // InternalCsvMan.g:711:2: ( rule__Program__Group_1__0 )*
            {
             before(grammarAccess.getProgramAccess().getGroup_1()); 
            // InternalCsvMan.g:712:2: ( rule__Program__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_ML_COMMENT && LA6_0<=RULE_SL_COMMENT)||(LA6_0>=14 && LA6_0<=15)||(LA6_0>=17 && LA6_0<=18)||LA6_0==20||LA6_0==24||(LA6_0>=26 && LA6_0<=29)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCsvMan.g:712:3: rule__Program__Group_1__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Program__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getGroup_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Program__Group_1__0"
    // InternalCsvMan.g:721:1: rule__Program__Group_1__0 : rule__Program__Group_1__0__Impl rule__Program__Group_1__1 ;
    public final void rule__Program__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:725:1: ( rule__Program__Group_1__0__Impl rule__Program__Group_1__1 )
            // InternalCsvMan.g:726:2: rule__Program__Group_1__0__Impl rule__Program__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Program__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group_1__1();

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
    // $ANTLR end "rule__Program__Group_1__0"


    // $ANTLR start "rule__Program__Group_1__0__Impl"
    // InternalCsvMan.g:733:1: rule__Program__Group_1__0__Impl : ( ( rule__Program__InstructionAssignment_1_0 ) ) ;
    public final void rule__Program__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:737:1: ( ( ( rule__Program__InstructionAssignment_1_0 ) ) )
            // InternalCsvMan.g:738:1: ( ( rule__Program__InstructionAssignment_1_0 ) )
            {
            // InternalCsvMan.g:738:1: ( ( rule__Program__InstructionAssignment_1_0 ) )
            // InternalCsvMan.g:739:2: ( rule__Program__InstructionAssignment_1_0 )
            {
             before(grammarAccess.getProgramAccess().getInstructionAssignment_1_0()); 
            // InternalCsvMan.g:740:2: ( rule__Program__InstructionAssignment_1_0 )
            // InternalCsvMan.g:740:3: rule__Program__InstructionAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Program__InstructionAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getInstructionAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_1__0__Impl"


    // $ANTLR start "rule__Program__Group_1__1"
    // InternalCsvMan.g:748:1: rule__Program__Group_1__1 : rule__Program__Group_1__1__Impl ;
    public final void rule__Program__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:752:1: ( rule__Program__Group_1__1__Impl )
            // InternalCsvMan.g:753:2: rule__Program__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group_1__1__Impl();

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
    // $ANTLR end "rule__Program__Group_1__1"


    // $ANTLR start "rule__Program__Group_1__1__Impl"
    // InternalCsvMan.g:759:1: rule__Program__Group_1__1__Impl : ( RULE_NL ) ;
    public final void rule__Program__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:763:1: ( ( RULE_NL ) )
            // InternalCsvMan.g:764:1: ( RULE_NL )
            {
            // InternalCsvMan.g:764:1: ( RULE_NL )
            // InternalCsvMan.g:765:2: RULE_NL
            {
             before(grammarAccess.getProgramAccess().getNLTerminalRuleCall_1_1()); 
            match(input,RULE_NL,FOLLOW_2); 
             after(grammarAccess.getProgramAccess().getNLTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group_1__1__Impl"


    // $ANTLR start "rule__Remove__Group__0"
    // InternalCsvMan.g:775:1: rule__Remove__Group__0 : rule__Remove__Group__0__Impl rule__Remove__Group__1 ;
    public final void rule__Remove__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:779:1: ( rule__Remove__Group__0__Impl rule__Remove__Group__1 )
            // InternalCsvMan.g:780:2: rule__Remove__Group__0__Impl rule__Remove__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Remove__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Remove__Group__1();

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
    // $ANTLR end "rule__Remove__Group__0"


    // $ANTLR start "rule__Remove__Group__0__Impl"
    // InternalCsvMan.g:787:1: rule__Remove__Group__0__Impl : ( () ) ;
    public final void rule__Remove__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:791:1: ( ( () ) )
            // InternalCsvMan.g:792:1: ( () )
            {
            // InternalCsvMan.g:792:1: ( () )
            // InternalCsvMan.g:793:2: ()
            {
             before(grammarAccess.getRemoveAccess().getRemoveAction_0()); 
            // InternalCsvMan.g:794:2: ()
            // InternalCsvMan.g:794:3: 
            {
            }

             after(grammarAccess.getRemoveAccess().getRemoveAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Remove__Group__0__Impl"


    // $ANTLR start "rule__Remove__Group__1"
    // InternalCsvMan.g:802:1: rule__Remove__Group__1 : rule__Remove__Group__1__Impl rule__Remove__Group__2 ;
    public final void rule__Remove__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:806:1: ( rule__Remove__Group__1__Impl rule__Remove__Group__2 )
            // InternalCsvMan.g:807:2: rule__Remove__Group__1__Impl rule__Remove__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Remove__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Remove__Group__2();

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
    // $ANTLR end "rule__Remove__Group__1"


    // $ANTLR start "rule__Remove__Group__1__Impl"
    // InternalCsvMan.g:814:1: rule__Remove__Group__1__Impl : ( 'remove' ) ;
    public final void rule__Remove__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:818:1: ( ( 'remove' ) )
            // InternalCsvMan.g:819:1: ( 'remove' )
            {
            // InternalCsvMan.g:819:1: ( 'remove' )
            // InternalCsvMan.g:820:2: 'remove'
            {
             before(grammarAccess.getRemoveAccess().getRemoveKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRemoveAccess().getRemoveKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Remove__Group__1__Impl"


    // $ANTLR start "rule__Remove__Group__2"
    // InternalCsvMan.g:829:1: rule__Remove__Group__2 : rule__Remove__Group__2__Impl ;
    public final void rule__Remove__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:833:1: ( rule__Remove__Group__2__Impl )
            // InternalCsvMan.g:834:2: rule__Remove__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Remove__Group__2__Impl();

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
    // $ANTLR end "rule__Remove__Group__2"


    // $ANTLR start "rule__Remove__Group__2__Impl"
    // InternalCsvMan.g:840:1: rule__Remove__Group__2__Impl : ( ( rule__Remove__CsvtableAssignment_2 ) ) ;
    public final void rule__Remove__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:844:1: ( ( ( rule__Remove__CsvtableAssignment_2 ) ) )
            // InternalCsvMan.g:845:1: ( ( rule__Remove__CsvtableAssignment_2 ) )
            {
            // InternalCsvMan.g:845:1: ( ( rule__Remove__CsvtableAssignment_2 ) )
            // InternalCsvMan.g:846:2: ( rule__Remove__CsvtableAssignment_2 )
            {
             before(grammarAccess.getRemoveAccess().getCsvtableAssignment_2()); 
            // InternalCsvMan.g:847:2: ( rule__Remove__CsvtableAssignment_2 )
            // InternalCsvMan.g:847:3: rule__Remove__CsvtableAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Remove__CsvtableAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRemoveAccess().getCsvtableAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Remove__Group__2__Impl"


    // $ANTLR start "rule__Copy__Group__0"
    // InternalCsvMan.g:856:1: rule__Copy__Group__0 : rule__Copy__Group__0__Impl rule__Copy__Group__1 ;
    public final void rule__Copy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:860:1: ( rule__Copy__Group__0__Impl rule__Copy__Group__1 )
            // InternalCsvMan.g:861:2: rule__Copy__Group__0__Impl rule__Copy__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalCsvMan.g:868:1: rule__Copy__Group__0__Impl : ( () ) ;
    public final void rule__Copy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:872:1: ( ( () ) )
            // InternalCsvMan.g:873:1: ( () )
            {
            // InternalCsvMan.g:873:1: ( () )
            // InternalCsvMan.g:874:2: ()
            {
             before(grammarAccess.getCopyAccess().getCopyAction_0()); 
            // InternalCsvMan.g:875:2: ()
            // InternalCsvMan.g:875:3: 
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
    // InternalCsvMan.g:883:1: rule__Copy__Group__1 : rule__Copy__Group__1__Impl rule__Copy__Group__2 ;
    public final void rule__Copy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:887:1: ( rule__Copy__Group__1__Impl rule__Copy__Group__2 )
            // InternalCsvMan.g:888:2: rule__Copy__Group__1__Impl rule__Copy__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalCsvMan.g:895:1: rule__Copy__Group__1__Impl : ( 'copy' ) ;
    public final void rule__Copy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:899:1: ( ( 'copy' ) )
            // InternalCsvMan.g:900:1: ( 'copy' )
            {
            // InternalCsvMan.g:900:1: ( 'copy' )
            // InternalCsvMan.g:901:2: 'copy'
            {
             before(grammarAccess.getCopyAccess().getCopyKeyword_1()); 
            match(input,15,FOLLOW_2); 
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
    // InternalCsvMan.g:910:1: rule__Copy__Group__2 : rule__Copy__Group__2__Impl rule__Copy__Group__3 ;
    public final void rule__Copy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:914:1: ( rule__Copy__Group__2__Impl rule__Copy__Group__3 )
            // InternalCsvMan.g:915:2: rule__Copy__Group__2__Impl rule__Copy__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalCsvMan.g:922:1: rule__Copy__Group__2__Impl : ( ( rule__Copy__AliasAssignment_2 ) ) ;
    public final void rule__Copy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:926:1: ( ( ( rule__Copy__AliasAssignment_2 ) ) )
            // InternalCsvMan.g:927:1: ( ( rule__Copy__AliasAssignment_2 ) )
            {
            // InternalCsvMan.g:927:1: ( ( rule__Copy__AliasAssignment_2 ) )
            // InternalCsvMan.g:928:2: ( rule__Copy__AliasAssignment_2 )
            {
             before(grammarAccess.getCopyAccess().getAliasAssignment_2()); 
            // InternalCsvMan.g:929:2: ( rule__Copy__AliasAssignment_2 )
            // InternalCsvMan.g:929:3: rule__Copy__AliasAssignment_2
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
    // InternalCsvMan.g:937:1: rule__Copy__Group__3 : rule__Copy__Group__3__Impl rule__Copy__Group__4 ;
    public final void rule__Copy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:941:1: ( rule__Copy__Group__3__Impl rule__Copy__Group__4 )
            // InternalCsvMan.g:942:2: rule__Copy__Group__3__Impl rule__Copy__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalCsvMan.g:949:1: rule__Copy__Group__3__Impl : ( 'in' ) ;
    public final void rule__Copy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:953:1: ( ( 'in' ) )
            // InternalCsvMan.g:954:1: ( 'in' )
            {
            // InternalCsvMan.g:954:1: ( 'in' )
            // InternalCsvMan.g:955:2: 'in'
            {
             before(grammarAccess.getCopyAccess().getInKeyword_3()); 
            match(input,16,FOLLOW_2); 
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
    // InternalCsvMan.g:964:1: rule__Copy__Group__4 : rule__Copy__Group__4__Impl ;
    public final void rule__Copy__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:968:1: ( rule__Copy__Group__4__Impl )
            // InternalCsvMan.g:969:2: rule__Copy__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Copy__Group__4__Impl();

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
    // InternalCsvMan.g:975:1: rule__Copy__Group__4__Impl : ( ( rule__Copy__TableAssignment_4 ) ) ;
    public final void rule__Copy__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:979:1: ( ( ( rule__Copy__TableAssignment_4 ) ) )
            // InternalCsvMan.g:980:1: ( ( rule__Copy__TableAssignment_4 ) )
            {
            // InternalCsvMan.g:980:1: ( ( rule__Copy__TableAssignment_4 ) )
            // InternalCsvMan.g:981:2: ( rule__Copy__TableAssignment_4 )
            {
             before(grammarAccess.getCopyAccess().getTableAssignment_4()); 
            // InternalCsvMan.g:982:2: ( rule__Copy__TableAssignment_4 )
            // InternalCsvMan.g:982:3: rule__Copy__TableAssignment_4
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


    // $ANTLR start "rule__Create__Group__0"
    // InternalCsvMan.g:991:1: rule__Create__Group__0 : rule__Create__Group__0__Impl rule__Create__Group__1 ;
    public final void rule__Create__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:995:1: ( rule__Create__Group__0__Impl rule__Create__Group__1 )
            // InternalCsvMan.g:996:2: rule__Create__Group__0__Impl rule__Create__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalCsvMan.g:1003:1: rule__Create__Group__0__Impl : ( () ) ;
    public final void rule__Create__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1007:1: ( ( () ) )
            // InternalCsvMan.g:1008:1: ( () )
            {
            // InternalCsvMan.g:1008:1: ( () )
            // InternalCsvMan.g:1009:2: ()
            {
             before(grammarAccess.getCreateAccess().getCreateAction_0()); 
            // InternalCsvMan.g:1010:2: ()
            // InternalCsvMan.g:1010:3: 
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
    // InternalCsvMan.g:1018:1: rule__Create__Group__1 : rule__Create__Group__1__Impl rule__Create__Group__2 ;
    public final void rule__Create__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1022:1: ( rule__Create__Group__1__Impl rule__Create__Group__2 )
            // InternalCsvMan.g:1023:2: rule__Create__Group__1__Impl rule__Create__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalCsvMan.g:1030:1: rule__Create__Group__1__Impl : ( 'create' ) ;
    public final void rule__Create__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1034:1: ( ( 'create' ) )
            // InternalCsvMan.g:1035:1: ( 'create' )
            {
            // InternalCsvMan.g:1035:1: ( 'create' )
            // InternalCsvMan.g:1036:2: 'create'
            {
             before(grammarAccess.getCreateAccess().getCreateKeyword_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalCsvMan.g:1045:1: rule__Create__Group__2 : rule__Create__Group__2__Impl ;
    public final void rule__Create__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1049:1: ( rule__Create__Group__2__Impl )
            // InternalCsvMan.g:1050:2: rule__Create__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Create__Group__2__Impl();

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
    // InternalCsvMan.g:1056:1: rule__Create__Group__2__Impl : ( ( rule__Create__CsvtableAssignment_2 ) ) ;
    public final void rule__Create__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1060:1: ( ( ( rule__Create__CsvtableAssignment_2 ) ) )
            // InternalCsvMan.g:1061:1: ( ( rule__Create__CsvtableAssignment_2 ) )
            {
            // InternalCsvMan.g:1061:1: ( ( rule__Create__CsvtableAssignment_2 ) )
            // InternalCsvMan.g:1062:2: ( rule__Create__CsvtableAssignment_2 )
            {
             before(grammarAccess.getCreateAccess().getCsvtableAssignment_2()); 
            // InternalCsvMan.g:1063:2: ( rule__Create__CsvtableAssignment_2 )
            // InternalCsvMan.g:1063:3: rule__Create__CsvtableAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Create__CsvtableAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCreateAccess().getCsvtableAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Load__Group__0"
    // InternalCsvMan.g:1072:1: rule__Load__Group__0 : rule__Load__Group__0__Impl rule__Load__Group__1 ;
    public final void rule__Load__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1076:1: ( rule__Load__Group__0__Impl rule__Load__Group__1 )
            // InternalCsvMan.g:1077:2: rule__Load__Group__0__Impl rule__Load__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalCsvMan.g:1084:1: rule__Load__Group__0__Impl : ( () ) ;
    public final void rule__Load__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1088:1: ( ( () ) )
            // InternalCsvMan.g:1089:1: ( () )
            {
            // InternalCsvMan.g:1089:1: ( () )
            // InternalCsvMan.g:1090:2: ()
            {
             before(grammarAccess.getLoadAccess().getLoadAction_0()); 
            // InternalCsvMan.g:1091:2: ()
            // InternalCsvMan.g:1091:3: 
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
    // InternalCsvMan.g:1099:1: rule__Load__Group__1 : rule__Load__Group__1__Impl rule__Load__Group__2 ;
    public final void rule__Load__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1103:1: ( rule__Load__Group__1__Impl rule__Load__Group__2 )
            // InternalCsvMan.g:1104:2: rule__Load__Group__1__Impl rule__Load__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalCsvMan.g:1111:1: rule__Load__Group__1__Impl : ( 'load' ) ;
    public final void rule__Load__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1115:1: ( ( 'load' ) )
            // InternalCsvMan.g:1116:1: ( 'load' )
            {
            // InternalCsvMan.g:1116:1: ( 'load' )
            // InternalCsvMan.g:1117:2: 'load'
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
    // InternalCsvMan.g:1126:1: rule__Load__Group__2 : rule__Load__Group__2__Impl rule__Load__Group__3 ;
    public final void rule__Load__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1130:1: ( rule__Load__Group__2__Impl rule__Load__Group__3 )
            // InternalCsvMan.g:1131:2: rule__Load__Group__2__Impl rule__Load__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalCsvMan.g:1138:1: rule__Load__Group__2__Impl : ( ( rule__Load__FichierAssignment_2 ) ) ;
    public final void rule__Load__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1142:1: ( ( ( rule__Load__FichierAssignment_2 ) ) )
            // InternalCsvMan.g:1143:1: ( ( rule__Load__FichierAssignment_2 ) )
            {
            // InternalCsvMan.g:1143:1: ( ( rule__Load__FichierAssignment_2 ) )
            // InternalCsvMan.g:1144:2: ( rule__Load__FichierAssignment_2 )
            {
             before(grammarAccess.getLoadAccess().getFichierAssignment_2()); 
            // InternalCsvMan.g:1145:2: ( rule__Load__FichierAssignment_2 )
            // InternalCsvMan.g:1145:3: rule__Load__FichierAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Load__FichierAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLoadAccess().getFichierAssignment_2()); 

            }


            }

        }
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
    // InternalCsvMan.g:1153:1: rule__Load__Group__3 : rule__Load__Group__3__Impl rule__Load__Group__4 ;
    public final void rule__Load__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1157:1: ( rule__Load__Group__3__Impl rule__Load__Group__4 )
            // InternalCsvMan.g:1158:2: rule__Load__Group__3__Impl rule__Load__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalCsvMan.g:1165:1: rule__Load__Group__3__Impl : ( 'as' ) ;
    public final void rule__Load__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1169:1: ( ( 'as' ) )
            // InternalCsvMan.g:1170:1: ( 'as' )
            {
            // InternalCsvMan.g:1170:1: ( 'as' )
            // InternalCsvMan.g:1171:2: 'as'
            {
             before(grammarAccess.getLoadAccess().getAsKeyword_3()); 
            match(input,19,FOLLOW_2); 
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
    // InternalCsvMan.g:1180:1: rule__Load__Group__4 : rule__Load__Group__4__Impl ;
    public final void rule__Load__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1184:1: ( rule__Load__Group__4__Impl )
            // InternalCsvMan.g:1185:2: rule__Load__Group__4__Impl
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
    // InternalCsvMan.g:1191:1: rule__Load__Group__4__Impl : ( ( rule__Load__CsvtableAssignment_4 ) ) ;
    public final void rule__Load__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1195:1: ( ( ( rule__Load__CsvtableAssignment_4 ) ) )
            // InternalCsvMan.g:1196:1: ( ( rule__Load__CsvtableAssignment_4 ) )
            {
            // InternalCsvMan.g:1196:1: ( ( rule__Load__CsvtableAssignment_4 ) )
            // InternalCsvMan.g:1197:2: ( rule__Load__CsvtableAssignment_4 )
            {
             before(grammarAccess.getLoadAccess().getCsvtableAssignment_4()); 
            // InternalCsvMan.g:1198:2: ( rule__Load__CsvtableAssignment_4 )
            // InternalCsvMan.g:1198:3: rule__Load__CsvtableAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Load__CsvtableAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLoadAccess().getCsvtableAssignment_4()); 

            }


            }

        }
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
    // InternalCsvMan.g:1207:1: rule__Show__Group__0 : rule__Show__Group__0__Impl rule__Show__Group__1 ;
    public final void rule__Show__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1211:1: ( rule__Show__Group__0__Impl rule__Show__Group__1 )
            // InternalCsvMan.g:1212:2: rule__Show__Group__0__Impl rule__Show__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalCsvMan.g:1219:1: rule__Show__Group__0__Impl : ( () ) ;
    public final void rule__Show__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1223:1: ( ( () ) )
            // InternalCsvMan.g:1224:1: ( () )
            {
            // InternalCsvMan.g:1224:1: ( () )
            // InternalCsvMan.g:1225:2: ()
            {
             before(grammarAccess.getShowAccess().getShowAction_0()); 
            // InternalCsvMan.g:1226:2: ()
            // InternalCsvMan.g:1226:3: 
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
    // InternalCsvMan.g:1234:1: rule__Show__Group__1 : rule__Show__Group__1__Impl rule__Show__Group__2 ;
    public final void rule__Show__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1238:1: ( rule__Show__Group__1__Impl rule__Show__Group__2 )
            // InternalCsvMan.g:1239:2: rule__Show__Group__1__Impl rule__Show__Group__2
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
    // InternalCsvMan.g:1246:1: rule__Show__Group__1__Impl : ( 'show' ) ;
    public final void rule__Show__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1250:1: ( ( 'show' ) )
            // InternalCsvMan.g:1251:1: ( 'show' )
            {
            // InternalCsvMan.g:1251:1: ( 'show' )
            // InternalCsvMan.g:1252:2: 'show'
            {
             before(grammarAccess.getShowAccess().getShowKeyword_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalCsvMan.g:1261:1: rule__Show__Group__2 : rule__Show__Group__2__Impl rule__Show__Group__3 ;
    public final void rule__Show__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1265:1: ( rule__Show__Group__2__Impl rule__Show__Group__3 )
            // InternalCsvMan.g:1266:2: rule__Show__Group__2__Impl rule__Show__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalCsvMan.g:1273:1: rule__Show__Group__2__Impl : ( ( rule__Show__CsvtableAssignment_2 ) ) ;
    public final void rule__Show__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1277:1: ( ( ( rule__Show__CsvtableAssignment_2 ) ) )
            // InternalCsvMan.g:1278:1: ( ( rule__Show__CsvtableAssignment_2 ) )
            {
            // InternalCsvMan.g:1278:1: ( ( rule__Show__CsvtableAssignment_2 ) )
            // InternalCsvMan.g:1279:2: ( rule__Show__CsvtableAssignment_2 )
            {
             before(grammarAccess.getShowAccess().getCsvtableAssignment_2()); 
            // InternalCsvMan.g:1280:2: ( rule__Show__CsvtableAssignment_2 )
            // InternalCsvMan.g:1280:3: rule__Show__CsvtableAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Show__CsvtableAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getShowAccess().getCsvtableAssignment_2()); 

            }


            }

        }
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
    // InternalCsvMan.g:1288:1: rule__Show__Group__3 : rule__Show__Group__3__Impl rule__Show__Group__4 ;
    public final void rule__Show__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1292:1: ( rule__Show__Group__3__Impl rule__Show__Group__4 )
            // InternalCsvMan.g:1293:2: rule__Show__Group__3__Impl rule__Show__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalCsvMan.g:1300:1: rule__Show__Group__3__Impl : ( ( rule__Show__Group_3__0 )? ) ;
    public final void rule__Show__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1304:1: ( ( ( rule__Show__Group_3__0 )? ) )
            // InternalCsvMan.g:1305:1: ( ( rule__Show__Group_3__0 )? )
            {
            // InternalCsvMan.g:1305:1: ( ( rule__Show__Group_3__0 )? )
            // InternalCsvMan.g:1306:2: ( rule__Show__Group_3__0 )?
            {
             before(grammarAccess.getShowAccess().getGroup_3()); 
            // InternalCsvMan.g:1307:2: ( rule__Show__Group_3__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalCsvMan.g:1307:3: rule__Show__Group_3__0
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
    // InternalCsvMan.g:1315:1: rule__Show__Group__4 : rule__Show__Group__4__Impl ;
    public final void rule__Show__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1319:1: ( rule__Show__Group__4__Impl )
            // InternalCsvMan.g:1320:2: rule__Show__Group__4__Impl
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
    // InternalCsvMan.g:1326:1: rule__Show__Group__4__Impl : ( ( rule__Show__WhereAssignment_4 )? ) ;
    public final void rule__Show__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1330:1: ( ( ( rule__Show__WhereAssignment_4 )? ) )
            // InternalCsvMan.g:1331:1: ( ( rule__Show__WhereAssignment_4 )? )
            {
            // InternalCsvMan.g:1331:1: ( ( rule__Show__WhereAssignment_4 )? )
            // InternalCsvMan.g:1332:2: ( rule__Show__WhereAssignment_4 )?
            {
             before(grammarAccess.getShowAccess().getWhereAssignment_4()); 
            // InternalCsvMan.g:1333:2: ( rule__Show__WhereAssignment_4 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==30) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalCsvMan.g:1333:3: rule__Show__WhereAssignment_4
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


    // $ANTLR start "rule__Show__Group_3__0"
    // InternalCsvMan.g:1342:1: rule__Show__Group_3__0 : rule__Show__Group_3__0__Impl rule__Show__Group_3__1 ;
    public final void rule__Show__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1346:1: ( rule__Show__Group_3__0__Impl rule__Show__Group_3__1 )
            // InternalCsvMan.g:1347:2: rule__Show__Group_3__0__Impl rule__Show__Group_3__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalCsvMan.g:1354:1: rule__Show__Group_3__0__Impl : ( '(' ) ;
    public final void rule__Show__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1358:1: ( ( '(' ) )
            // InternalCsvMan.g:1359:1: ( '(' )
            {
            // InternalCsvMan.g:1359:1: ( '(' )
            // InternalCsvMan.g:1360:2: '('
            {
             before(grammarAccess.getShowAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalCsvMan.g:1369:1: rule__Show__Group_3__1 : rule__Show__Group_3__1__Impl rule__Show__Group_3__2 ;
    public final void rule__Show__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1373:1: ( rule__Show__Group_3__1__Impl rule__Show__Group_3__2 )
            // InternalCsvMan.g:1374:2: rule__Show__Group_3__1__Impl rule__Show__Group_3__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalCsvMan.g:1381:1: rule__Show__Group_3__1__Impl : ( ( rule__Show__ColonneAssignment_3_1 ) ) ;
    public final void rule__Show__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1385:1: ( ( ( rule__Show__ColonneAssignment_3_1 ) ) )
            // InternalCsvMan.g:1386:1: ( ( rule__Show__ColonneAssignment_3_1 ) )
            {
            // InternalCsvMan.g:1386:1: ( ( rule__Show__ColonneAssignment_3_1 ) )
            // InternalCsvMan.g:1387:2: ( rule__Show__ColonneAssignment_3_1 )
            {
             before(grammarAccess.getShowAccess().getColonneAssignment_3_1()); 
            // InternalCsvMan.g:1388:2: ( rule__Show__ColonneAssignment_3_1 )
            // InternalCsvMan.g:1388:3: rule__Show__ColonneAssignment_3_1
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
    // InternalCsvMan.g:1396:1: rule__Show__Group_3__2 : rule__Show__Group_3__2__Impl rule__Show__Group_3__3 ;
    public final void rule__Show__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1400:1: ( rule__Show__Group_3__2__Impl rule__Show__Group_3__3 )
            // InternalCsvMan.g:1401:2: rule__Show__Group_3__2__Impl rule__Show__Group_3__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalCsvMan.g:1408:1: rule__Show__Group_3__2__Impl : ( ( rule__Show__Group_3_2__0 )* ) ;
    public final void rule__Show__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1412:1: ( ( ( rule__Show__Group_3_2__0 )* ) )
            // InternalCsvMan.g:1413:1: ( ( rule__Show__Group_3_2__0 )* )
            {
            // InternalCsvMan.g:1413:1: ( ( rule__Show__Group_3_2__0 )* )
            // InternalCsvMan.g:1414:2: ( rule__Show__Group_3_2__0 )*
            {
             before(grammarAccess.getShowAccess().getGroup_3_2()); 
            // InternalCsvMan.g:1415:2: ( rule__Show__Group_3_2__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==23) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalCsvMan.g:1415:3: rule__Show__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_16);
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
    // InternalCsvMan.g:1423:1: rule__Show__Group_3__3 : rule__Show__Group_3__3__Impl ;
    public final void rule__Show__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1427:1: ( rule__Show__Group_3__3__Impl )
            // InternalCsvMan.g:1428:2: rule__Show__Group_3__3__Impl
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
    // InternalCsvMan.g:1434:1: rule__Show__Group_3__3__Impl : ( ')' ) ;
    public final void rule__Show__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1438:1: ( ( ')' ) )
            // InternalCsvMan.g:1439:1: ( ')' )
            {
            // InternalCsvMan.g:1439:1: ( ')' )
            // InternalCsvMan.g:1440:2: ')'
            {
             before(grammarAccess.getShowAccess().getRightParenthesisKeyword_3_3()); 
            match(input,22,FOLLOW_2); 
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
    // InternalCsvMan.g:1450:1: rule__Show__Group_3_2__0 : rule__Show__Group_3_2__0__Impl rule__Show__Group_3_2__1 ;
    public final void rule__Show__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1454:1: ( rule__Show__Group_3_2__0__Impl rule__Show__Group_3_2__1 )
            // InternalCsvMan.g:1455:2: rule__Show__Group_3_2__0__Impl rule__Show__Group_3_2__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalCsvMan.g:1462:1: rule__Show__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__Show__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1466:1: ( ( ',' ) )
            // InternalCsvMan.g:1467:1: ( ',' )
            {
            // InternalCsvMan.g:1467:1: ( ',' )
            // InternalCsvMan.g:1468:2: ','
            {
             before(grammarAccess.getShowAccess().getCommaKeyword_3_2_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalCsvMan.g:1477:1: rule__Show__Group_3_2__1 : rule__Show__Group_3_2__1__Impl ;
    public final void rule__Show__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1481:1: ( rule__Show__Group_3_2__1__Impl )
            // InternalCsvMan.g:1482:2: rule__Show__Group_3_2__1__Impl
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
    // InternalCsvMan.g:1488:1: rule__Show__Group_3_2__1__Impl : ( ( rule__Show__ColonneAssignment_3_2_1 ) ) ;
    public final void rule__Show__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1492:1: ( ( ( rule__Show__ColonneAssignment_3_2_1 ) ) )
            // InternalCsvMan.g:1493:1: ( ( rule__Show__ColonneAssignment_3_2_1 ) )
            {
            // InternalCsvMan.g:1493:1: ( ( rule__Show__ColonneAssignment_3_2_1 ) )
            // InternalCsvMan.g:1494:2: ( rule__Show__ColonneAssignment_3_2_1 )
            {
             before(grammarAccess.getShowAccess().getColonneAssignment_3_2_1()); 
            // InternalCsvMan.g:1495:2: ( rule__Show__ColonneAssignment_3_2_1 )
            // InternalCsvMan.g:1495:3: rule__Show__ColonneAssignment_3_2_1
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
    // InternalCsvMan.g:1504:1: rule__Update__Group__0 : rule__Update__Group__0__Impl rule__Update__Group__1 ;
    public final void rule__Update__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1508:1: ( rule__Update__Group__0__Impl rule__Update__Group__1 )
            // InternalCsvMan.g:1509:2: rule__Update__Group__0__Impl rule__Update__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalCsvMan.g:1516:1: rule__Update__Group__0__Impl : ( () ) ;
    public final void rule__Update__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1520:1: ( ( () ) )
            // InternalCsvMan.g:1521:1: ( () )
            {
            // InternalCsvMan.g:1521:1: ( () )
            // InternalCsvMan.g:1522:2: ()
            {
             before(grammarAccess.getUpdateAccess().getUpdateAction_0()); 
            // InternalCsvMan.g:1523:2: ()
            // InternalCsvMan.g:1523:3: 
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
    // InternalCsvMan.g:1531:1: rule__Update__Group__1 : rule__Update__Group__1__Impl rule__Update__Group__2 ;
    public final void rule__Update__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1535:1: ( rule__Update__Group__1__Impl rule__Update__Group__2 )
            // InternalCsvMan.g:1536:2: rule__Update__Group__1__Impl rule__Update__Group__2
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
    // InternalCsvMan.g:1543:1: rule__Update__Group__1__Impl : ( 'update' ) ;
    public final void rule__Update__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1547:1: ( ( 'update' ) )
            // InternalCsvMan.g:1548:1: ( 'update' )
            {
            // InternalCsvMan.g:1548:1: ( 'update' )
            // InternalCsvMan.g:1549:2: 'update'
            {
             before(grammarAccess.getUpdateAccess().getUpdateKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalCsvMan.g:1558:1: rule__Update__Group__2 : rule__Update__Group__2__Impl rule__Update__Group__3 ;
    public final void rule__Update__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1562:1: ( rule__Update__Group__2__Impl rule__Update__Group__3 )
            // InternalCsvMan.g:1563:2: rule__Update__Group__2__Impl rule__Update__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalCsvMan.g:1570:1: rule__Update__Group__2__Impl : ( ( rule__Update__CsvtableAssignment_2 ) ) ;
    public final void rule__Update__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1574:1: ( ( ( rule__Update__CsvtableAssignment_2 ) ) )
            // InternalCsvMan.g:1575:1: ( ( rule__Update__CsvtableAssignment_2 ) )
            {
            // InternalCsvMan.g:1575:1: ( ( rule__Update__CsvtableAssignment_2 ) )
            // InternalCsvMan.g:1576:2: ( rule__Update__CsvtableAssignment_2 )
            {
             before(grammarAccess.getUpdateAccess().getCsvtableAssignment_2()); 
            // InternalCsvMan.g:1577:2: ( rule__Update__CsvtableAssignment_2 )
            // InternalCsvMan.g:1577:3: rule__Update__CsvtableAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Update__CsvtableAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUpdateAccess().getCsvtableAssignment_2()); 

            }


            }

        }
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
    // InternalCsvMan.g:1585:1: rule__Update__Group__3 : rule__Update__Group__3__Impl rule__Update__Group__4 ;
    public final void rule__Update__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1589:1: ( rule__Update__Group__3__Impl rule__Update__Group__4 )
            // InternalCsvMan.g:1590:2: rule__Update__Group__3__Impl rule__Update__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalCsvMan.g:1597:1: rule__Update__Group__3__Impl : ( 'set' ) ;
    public final void rule__Update__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1601:1: ( ( 'set' ) )
            // InternalCsvMan.g:1602:1: ( 'set' )
            {
            // InternalCsvMan.g:1602:1: ( 'set' )
            // InternalCsvMan.g:1603:2: 'set'
            {
             before(grammarAccess.getUpdateAccess().getSetKeyword_3()); 
            match(input,25,FOLLOW_2); 
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
    // InternalCsvMan.g:1612:1: rule__Update__Group__4 : rule__Update__Group__4__Impl rule__Update__Group__5 ;
    public final void rule__Update__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1616:1: ( rule__Update__Group__4__Impl rule__Update__Group__5 )
            // InternalCsvMan.g:1617:2: rule__Update__Group__4__Impl rule__Update__Group__5
            {
            pushFollow(FOLLOW_19);
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
    // InternalCsvMan.g:1624:1: rule__Update__Group__4__Impl : ( ( rule__Update__ParameterAssignment_4 ) ) ;
    public final void rule__Update__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1628:1: ( ( ( rule__Update__ParameterAssignment_4 ) ) )
            // InternalCsvMan.g:1629:1: ( ( rule__Update__ParameterAssignment_4 ) )
            {
            // InternalCsvMan.g:1629:1: ( ( rule__Update__ParameterAssignment_4 ) )
            // InternalCsvMan.g:1630:2: ( rule__Update__ParameterAssignment_4 )
            {
             before(grammarAccess.getUpdateAccess().getParameterAssignment_4()); 
            // InternalCsvMan.g:1631:2: ( rule__Update__ParameterAssignment_4 )
            // InternalCsvMan.g:1631:3: rule__Update__ParameterAssignment_4
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
    // InternalCsvMan.g:1639:1: rule__Update__Group__5 : rule__Update__Group__5__Impl rule__Update__Group__6 ;
    public final void rule__Update__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1643:1: ( rule__Update__Group__5__Impl rule__Update__Group__6 )
            // InternalCsvMan.g:1644:2: rule__Update__Group__5__Impl rule__Update__Group__6
            {
            pushFollow(FOLLOW_19);
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
    // InternalCsvMan.g:1651:1: rule__Update__Group__5__Impl : ( ( rule__Update__Group_5__0 )* ) ;
    public final void rule__Update__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1655:1: ( ( ( rule__Update__Group_5__0 )* ) )
            // InternalCsvMan.g:1656:1: ( ( rule__Update__Group_5__0 )* )
            {
            // InternalCsvMan.g:1656:1: ( ( rule__Update__Group_5__0 )* )
            // InternalCsvMan.g:1657:2: ( rule__Update__Group_5__0 )*
            {
             before(grammarAccess.getUpdateAccess().getGroup_5()); 
            // InternalCsvMan.g:1658:2: ( rule__Update__Group_5__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalCsvMan.g:1658:3: rule__Update__Group_5__0
            	    {
            	    pushFollow(FOLLOW_16);
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
    // InternalCsvMan.g:1666:1: rule__Update__Group__6 : rule__Update__Group__6__Impl ;
    public final void rule__Update__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1670:1: ( rule__Update__Group__6__Impl )
            // InternalCsvMan.g:1671:2: rule__Update__Group__6__Impl
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
    // InternalCsvMan.g:1677:1: rule__Update__Group__6__Impl : ( ( rule__Update__WhereAssignment_6 )? ) ;
    public final void rule__Update__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1681:1: ( ( ( rule__Update__WhereAssignment_6 )? ) )
            // InternalCsvMan.g:1682:1: ( ( rule__Update__WhereAssignment_6 )? )
            {
            // InternalCsvMan.g:1682:1: ( ( rule__Update__WhereAssignment_6 )? )
            // InternalCsvMan.g:1683:2: ( rule__Update__WhereAssignment_6 )?
            {
             before(grammarAccess.getUpdateAccess().getWhereAssignment_6()); 
            // InternalCsvMan.g:1684:2: ( rule__Update__WhereAssignment_6 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==30) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCsvMan.g:1684:3: rule__Update__WhereAssignment_6
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


    // $ANTLR start "rule__Update__Group_5__0"
    // InternalCsvMan.g:1693:1: rule__Update__Group_5__0 : rule__Update__Group_5__0__Impl rule__Update__Group_5__1 ;
    public final void rule__Update__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1697:1: ( rule__Update__Group_5__0__Impl rule__Update__Group_5__1 )
            // InternalCsvMan.g:1698:2: rule__Update__Group_5__0__Impl rule__Update__Group_5__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalCsvMan.g:1705:1: rule__Update__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Update__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1709:1: ( ( ',' ) )
            // InternalCsvMan.g:1710:1: ( ',' )
            {
            // InternalCsvMan.g:1710:1: ( ',' )
            // InternalCsvMan.g:1711:2: ','
            {
             before(grammarAccess.getUpdateAccess().getCommaKeyword_5_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalCsvMan.g:1720:1: rule__Update__Group_5__1 : rule__Update__Group_5__1__Impl ;
    public final void rule__Update__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1724:1: ( rule__Update__Group_5__1__Impl )
            // InternalCsvMan.g:1725:2: rule__Update__Group_5__1__Impl
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
    // InternalCsvMan.g:1731:1: rule__Update__Group_5__1__Impl : ( ( rule__Update__ParameterAssignment_5_1 ) ) ;
    public final void rule__Update__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1735:1: ( ( ( rule__Update__ParameterAssignment_5_1 ) ) )
            // InternalCsvMan.g:1736:1: ( ( rule__Update__ParameterAssignment_5_1 ) )
            {
            // InternalCsvMan.g:1736:1: ( ( rule__Update__ParameterAssignment_5_1 ) )
            // InternalCsvMan.g:1737:2: ( rule__Update__ParameterAssignment_5_1 )
            {
             before(grammarAccess.getUpdateAccess().getParameterAssignment_5_1()); 
            // InternalCsvMan.g:1738:2: ( rule__Update__ParameterAssignment_5_1 )
            // InternalCsvMan.g:1738:3: rule__Update__ParameterAssignment_5_1
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
    // InternalCsvMan.g:1747:1: rule__Add__Group__0 : rule__Add__Group__0__Impl rule__Add__Group__1 ;
    public final void rule__Add__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1751:1: ( rule__Add__Group__0__Impl rule__Add__Group__1 )
            // InternalCsvMan.g:1752:2: rule__Add__Group__0__Impl rule__Add__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalCsvMan.g:1759:1: rule__Add__Group__0__Impl : ( () ) ;
    public final void rule__Add__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1763:1: ( ( () ) )
            // InternalCsvMan.g:1764:1: ( () )
            {
            // InternalCsvMan.g:1764:1: ( () )
            // InternalCsvMan.g:1765:2: ()
            {
             before(grammarAccess.getAddAccess().getAddAction_0()); 
            // InternalCsvMan.g:1766:2: ()
            // InternalCsvMan.g:1766:3: 
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
    // InternalCsvMan.g:1774:1: rule__Add__Group__1 : rule__Add__Group__1__Impl rule__Add__Group__2 ;
    public final void rule__Add__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1778:1: ( rule__Add__Group__1__Impl rule__Add__Group__2 )
            // InternalCsvMan.g:1779:2: rule__Add__Group__1__Impl rule__Add__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalCsvMan.g:1786:1: rule__Add__Group__1__Impl : ( 'add' ) ;
    public final void rule__Add__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1790:1: ( ( 'add' ) )
            // InternalCsvMan.g:1791:1: ( 'add' )
            {
            // InternalCsvMan.g:1791:1: ( 'add' )
            // InternalCsvMan.g:1792:2: 'add'
            {
             before(grammarAccess.getAddAccess().getAddKeyword_1()); 
            match(input,26,FOLLOW_2); 
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
    // InternalCsvMan.g:1801:1: rule__Add__Group__2 : rule__Add__Group__2__Impl rule__Add__Group__3 ;
    public final void rule__Add__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1805:1: ( rule__Add__Group__2__Impl rule__Add__Group__3 )
            // InternalCsvMan.g:1806:2: rule__Add__Group__2__Impl rule__Add__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalCsvMan.g:1813:1: rule__Add__Group__2__Impl : ( ( rule__Add__Alternatives_2 ) ) ;
    public final void rule__Add__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1817:1: ( ( ( rule__Add__Alternatives_2 ) ) )
            // InternalCsvMan.g:1818:1: ( ( rule__Add__Alternatives_2 ) )
            {
            // InternalCsvMan.g:1818:1: ( ( rule__Add__Alternatives_2 ) )
            // InternalCsvMan.g:1819:2: ( rule__Add__Alternatives_2 )
            {
             before(grammarAccess.getAddAccess().getAlternatives_2()); 
            // InternalCsvMan.g:1820:2: ( rule__Add__Alternatives_2 )
            // InternalCsvMan.g:1820:3: rule__Add__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__Add__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getAddAccess().getAlternatives_2()); 

            }


            }

        }
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
    // InternalCsvMan.g:1828:1: rule__Add__Group__3 : rule__Add__Group__3__Impl rule__Add__Group__4 ;
    public final void rule__Add__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1832:1: ( rule__Add__Group__3__Impl rule__Add__Group__4 )
            // InternalCsvMan.g:1833:2: rule__Add__Group__3__Impl rule__Add__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalCsvMan.g:1840:1: rule__Add__Group__3__Impl : ( 'in' ) ;
    public final void rule__Add__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1844:1: ( ( 'in' ) )
            // InternalCsvMan.g:1845:1: ( 'in' )
            {
            // InternalCsvMan.g:1845:1: ( 'in' )
            // InternalCsvMan.g:1846:2: 'in'
            {
             before(grammarAccess.getAddAccess().getInKeyword_3()); 
            match(input,16,FOLLOW_2); 
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
    // InternalCsvMan.g:1855:1: rule__Add__Group__4 : rule__Add__Group__4__Impl ;
    public final void rule__Add__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1859:1: ( rule__Add__Group__4__Impl )
            // InternalCsvMan.g:1860:2: rule__Add__Group__4__Impl
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
    // InternalCsvMan.g:1866:1: rule__Add__Group__4__Impl : ( ( rule__Add__CsvtableAssignment_4 ) ) ;
    public final void rule__Add__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1870:1: ( ( ( rule__Add__CsvtableAssignment_4 ) ) )
            // InternalCsvMan.g:1871:1: ( ( rule__Add__CsvtableAssignment_4 ) )
            {
            // InternalCsvMan.g:1871:1: ( ( rule__Add__CsvtableAssignment_4 ) )
            // InternalCsvMan.g:1872:2: ( rule__Add__CsvtableAssignment_4 )
            {
             before(grammarAccess.getAddAccess().getCsvtableAssignment_4()); 
            // InternalCsvMan.g:1873:2: ( rule__Add__CsvtableAssignment_4 )
            // InternalCsvMan.g:1873:3: rule__Add__CsvtableAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Add__CsvtableAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAddAccess().getCsvtableAssignment_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Add__Group_2_0__0"
    // InternalCsvMan.g:1882:1: rule__Add__Group_2_0__0 : rule__Add__Group_2_0__0__Impl rule__Add__Group_2_0__1 ;
    public final void rule__Add__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1886:1: ( rule__Add__Group_2_0__0__Impl rule__Add__Group_2_0__1 )
            // InternalCsvMan.g:1887:2: rule__Add__Group_2_0__0__Impl rule__Add__Group_2_0__1
            {
            pushFollow(FOLLOW_9);
            rule__Add__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Add__Group_2_0__1();

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
    // $ANTLR end "rule__Add__Group_2_0__0"


    // $ANTLR start "rule__Add__Group_2_0__0__Impl"
    // InternalCsvMan.g:1894:1: rule__Add__Group_2_0__0__Impl : ( '(' ) ;
    public final void rule__Add__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1898:1: ( ( '(' ) )
            // InternalCsvMan.g:1899:1: ( '(' )
            {
            // InternalCsvMan.g:1899:1: ( '(' )
            // InternalCsvMan.g:1900:2: '('
            {
             before(grammarAccess.getAddAccess().getLeftParenthesisKeyword_2_0_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAddAccess().getLeftParenthesisKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__Group_2_0__0__Impl"


    // $ANTLR start "rule__Add__Group_2_0__1"
    // InternalCsvMan.g:1909:1: rule__Add__Group_2_0__1 : rule__Add__Group_2_0__1__Impl rule__Add__Group_2_0__2 ;
    public final void rule__Add__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1913:1: ( rule__Add__Group_2_0__1__Impl rule__Add__Group_2_0__2 )
            // InternalCsvMan.g:1914:2: rule__Add__Group_2_0__1__Impl rule__Add__Group_2_0__2
            {
            pushFollow(FOLLOW_15);
            rule__Add__Group_2_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Add__Group_2_0__2();

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
    // $ANTLR end "rule__Add__Group_2_0__1"


    // $ANTLR start "rule__Add__Group_2_0__1__Impl"
    // InternalCsvMan.g:1921:1: rule__Add__Group_2_0__1__Impl : ( ( rule__Add__ValeurAssignment_2_0_1 ) ) ;
    public final void rule__Add__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1925:1: ( ( ( rule__Add__ValeurAssignment_2_0_1 ) ) )
            // InternalCsvMan.g:1926:1: ( ( rule__Add__ValeurAssignment_2_0_1 ) )
            {
            // InternalCsvMan.g:1926:1: ( ( rule__Add__ValeurAssignment_2_0_1 ) )
            // InternalCsvMan.g:1927:2: ( rule__Add__ValeurAssignment_2_0_1 )
            {
             before(grammarAccess.getAddAccess().getValeurAssignment_2_0_1()); 
            // InternalCsvMan.g:1928:2: ( rule__Add__ValeurAssignment_2_0_1 )
            // InternalCsvMan.g:1928:3: rule__Add__ValeurAssignment_2_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Add__ValeurAssignment_2_0_1();

            state._fsp--;


            }

             after(grammarAccess.getAddAccess().getValeurAssignment_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__Group_2_0__1__Impl"


    // $ANTLR start "rule__Add__Group_2_0__2"
    // InternalCsvMan.g:1936:1: rule__Add__Group_2_0__2 : rule__Add__Group_2_0__2__Impl rule__Add__Group_2_0__3 ;
    public final void rule__Add__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1940:1: ( rule__Add__Group_2_0__2__Impl rule__Add__Group_2_0__3 )
            // InternalCsvMan.g:1941:2: rule__Add__Group_2_0__2__Impl rule__Add__Group_2_0__3
            {
            pushFollow(FOLLOW_15);
            rule__Add__Group_2_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Add__Group_2_0__3();

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
    // $ANTLR end "rule__Add__Group_2_0__2"


    // $ANTLR start "rule__Add__Group_2_0__2__Impl"
    // InternalCsvMan.g:1948:1: rule__Add__Group_2_0__2__Impl : ( ( rule__Add__Group_2_0_2__0 )* ) ;
    public final void rule__Add__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1952:1: ( ( ( rule__Add__Group_2_0_2__0 )* ) )
            // InternalCsvMan.g:1953:1: ( ( rule__Add__Group_2_0_2__0 )* )
            {
            // InternalCsvMan.g:1953:1: ( ( rule__Add__Group_2_0_2__0 )* )
            // InternalCsvMan.g:1954:2: ( rule__Add__Group_2_0_2__0 )*
            {
             before(grammarAccess.getAddAccess().getGroup_2_0_2()); 
            // InternalCsvMan.g:1955:2: ( rule__Add__Group_2_0_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==23) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalCsvMan.g:1955:3: rule__Add__Group_2_0_2__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Add__Group_2_0_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getAddAccess().getGroup_2_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__Group_2_0__2__Impl"


    // $ANTLR start "rule__Add__Group_2_0__3"
    // InternalCsvMan.g:1963:1: rule__Add__Group_2_0__3 : rule__Add__Group_2_0__3__Impl ;
    public final void rule__Add__Group_2_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1967:1: ( rule__Add__Group_2_0__3__Impl )
            // InternalCsvMan.g:1968:2: rule__Add__Group_2_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Add__Group_2_0__3__Impl();

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
    // $ANTLR end "rule__Add__Group_2_0__3"


    // $ANTLR start "rule__Add__Group_2_0__3__Impl"
    // InternalCsvMan.g:1974:1: rule__Add__Group_2_0__3__Impl : ( ')' ) ;
    public final void rule__Add__Group_2_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1978:1: ( ( ')' ) )
            // InternalCsvMan.g:1979:1: ( ')' )
            {
            // InternalCsvMan.g:1979:1: ( ')' )
            // InternalCsvMan.g:1980:2: ')'
            {
             before(grammarAccess.getAddAccess().getRightParenthesisKeyword_2_0_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAddAccess().getRightParenthesisKeyword_2_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__Group_2_0__3__Impl"


    // $ANTLR start "rule__Add__Group_2_0_2__0"
    // InternalCsvMan.g:1990:1: rule__Add__Group_2_0_2__0 : rule__Add__Group_2_0_2__0__Impl rule__Add__Group_2_0_2__1 ;
    public final void rule__Add__Group_2_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1994:1: ( rule__Add__Group_2_0_2__0__Impl rule__Add__Group_2_0_2__1 )
            // InternalCsvMan.g:1995:2: rule__Add__Group_2_0_2__0__Impl rule__Add__Group_2_0_2__1
            {
            pushFollow(FOLLOW_9);
            rule__Add__Group_2_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Add__Group_2_0_2__1();

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
    // $ANTLR end "rule__Add__Group_2_0_2__0"


    // $ANTLR start "rule__Add__Group_2_0_2__0__Impl"
    // InternalCsvMan.g:2002:1: rule__Add__Group_2_0_2__0__Impl : ( ',' ) ;
    public final void rule__Add__Group_2_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2006:1: ( ( ',' ) )
            // InternalCsvMan.g:2007:1: ( ',' )
            {
            // InternalCsvMan.g:2007:1: ( ',' )
            // InternalCsvMan.g:2008:2: ','
            {
             before(grammarAccess.getAddAccess().getCommaKeyword_2_0_2_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAddAccess().getCommaKeyword_2_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__Group_2_0_2__0__Impl"


    // $ANTLR start "rule__Add__Group_2_0_2__1"
    // InternalCsvMan.g:2017:1: rule__Add__Group_2_0_2__1 : rule__Add__Group_2_0_2__1__Impl ;
    public final void rule__Add__Group_2_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2021:1: ( rule__Add__Group_2_0_2__1__Impl )
            // InternalCsvMan.g:2022:2: rule__Add__Group_2_0_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Add__Group_2_0_2__1__Impl();

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
    // $ANTLR end "rule__Add__Group_2_0_2__1"


    // $ANTLR start "rule__Add__Group_2_0_2__1__Impl"
    // InternalCsvMan.g:2028:1: rule__Add__Group_2_0_2__1__Impl : ( ( rule__Add__ValeurAssignment_2_0_2_1 ) ) ;
    public final void rule__Add__Group_2_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2032:1: ( ( ( rule__Add__ValeurAssignment_2_0_2_1 ) ) )
            // InternalCsvMan.g:2033:1: ( ( rule__Add__ValeurAssignment_2_0_2_1 ) )
            {
            // InternalCsvMan.g:2033:1: ( ( rule__Add__ValeurAssignment_2_0_2_1 ) )
            // InternalCsvMan.g:2034:2: ( rule__Add__ValeurAssignment_2_0_2_1 )
            {
             before(grammarAccess.getAddAccess().getValeurAssignment_2_0_2_1()); 
            // InternalCsvMan.g:2035:2: ( rule__Add__ValeurAssignment_2_0_2_1 )
            // InternalCsvMan.g:2035:3: rule__Add__ValeurAssignment_2_0_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Add__ValeurAssignment_2_0_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAddAccess().getValeurAssignment_2_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__Group_2_0_2__1__Impl"


    // $ANTLR start "rule__Add__Group_2_1__0"
    // InternalCsvMan.g:2044:1: rule__Add__Group_2_1__0 : rule__Add__Group_2_1__0__Impl rule__Add__Group_2_1__1 ;
    public final void rule__Add__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2048:1: ( rule__Add__Group_2_1__0__Impl rule__Add__Group_2_1__1 )
            // InternalCsvMan.g:2049:2: rule__Add__Group_2_1__0__Impl rule__Add__Group_2_1__1
            {
            pushFollow(FOLLOW_9);
            rule__Add__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Add__Group_2_1__1();

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
    // $ANTLR end "rule__Add__Group_2_1__0"


    // $ANTLR start "rule__Add__Group_2_1__0__Impl"
    // InternalCsvMan.g:2056:1: rule__Add__Group_2_1__0__Impl : ( '(' ) ;
    public final void rule__Add__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2060:1: ( ( '(' ) )
            // InternalCsvMan.g:2061:1: ( '(' )
            {
            // InternalCsvMan.g:2061:1: ( '(' )
            // InternalCsvMan.g:2062:2: '('
            {
             before(grammarAccess.getAddAccess().getLeftParenthesisKeyword_2_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAddAccess().getLeftParenthesisKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__Group_2_1__0__Impl"


    // $ANTLR start "rule__Add__Group_2_1__1"
    // InternalCsvMan.g:2071:1: rule__Add__Group_2_1__1 : rule__Add__Group_2_1__1__Impl rule__Add__Group_2_1__2 ;
    public final void rule__Add__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2075:1: ( rule__Add__Group_2_1__1__Impl rule__Add__Group_2_1__2 )
            // InternalCsvMan.g:2076:2: rule__Add__Group_2_1__1__Impl rule__Add__Group_2_1__2
            {
            pushFollow(FOLLOW_15);
            rule__Add__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Add__Group_2_1__2();

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
    // $ANTLR end "rule__Add__Group_2_1__1"


    // $ANTLR start "rule__Add__Group_2_1__1__Impl"
    // InternalCsvMan.g:2083:1: rule__Add__Group_2_1__1__Impl : ( ( rule__Add__ParameterAssignment_2_1_1 ) ) ;
    public final void rule__Add__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2087:1: ( ( ( rule__Add__ParameterAssignment_2_1_1 ) ) )
            // InternalCsvMan.g:2088:1: ( ( rule__Add__ParameterAssignment_2_1_1 ) )
            {
            // InternalCsvMan.g:2088:1: ( ( rule__Add__ParameterAssignment_2_1_1 ) )
            // InternalCsvMan.g:2089:2: ( rule__Add__ParameterAssignment_2_1_1 )
            {
             before(grammarAccess.getAddAccess().getParameterAssignment_2_1_1()); 
            // InternalCsvMan.g:2090:2: ( rule__Add__ParameterAssignment_2_1_1 )
            // InternalCsvMan.g:2090:3: rule__Add__ParameterAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Add__ParameterAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAddAccess().getParameterAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__Group_2_1__1__Impl"


    // $ANTLR start "rule__Add__Group_2_1__2"
    // InternalCsvMan.g:2098:1: rule__Add__Group_2_1__2 : rule__Add__Group_2_1__2__Impl rule__Add__Group_2_1__3 ;
    public final void rule__Add__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2102:1: ( rule__Add__Group_2_1__2__Impl rule__Add__Group_2_1__3 )
            // InternalCsvMan.g:2103:2: rule__Add__Group_2_1__2__Impl rule__Add__Group_2_1__3
            {
            pushFollow(FOLLOW_15);
            rule__Add__Group_2_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Add__Group_2_1__3();

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
    // $ANTLR end "rule__Add__Group_2_1__2"


    // $ANTLR start "rule__Add__Group_2_1__2__Impl"
    // InternalCsvMan.g:2110:1: rule__Add__Group_2_1__2__Impl : ( ( rule__Add__Group_2_1_2__0 )* ) ;
    public final void rule__Add__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2114:1: ( ( ( rule__Add__Group_2_1_2__0 )* ) )
            // InternalCsvMan.g:2115:1: ( ( rule__Add__Group_2_1_2__0 )* )
            {
            // InternalCsvMan.g:2115:1: ( ( rule__Add__Group_2_1_2__0 )* )
            // InternalCsvMan.g:2116:2: ( rule__Add__Group_2_1_2__0 )*
            {
             before(grammarAccess.getAddAccess().getGroup_2_1_2()); 
            // InternalCsvMan.g:2117:2: ( rule__Add__Group_2_1_2__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==23) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalCsvMan.g:2117:3: rule__Add__Group_2_1_2__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Add__Group_2_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getAddAccess().getGroup_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__Group_2_1__2__Impl"


    // $ANTLR start "rule__Add__Group_2_1__3"
    // InternalCsvMan.g:2125:1: rule__Add__Group_2_1__3 : rule__Add__Group_2_1__3__Impl ;
    public final void rule__Add__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2129:1: ( rule__Add__Group_2_1__3__Impl )
            // InternalCsvMan.g:2130:2: rule__Add__Group_2_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Add__Group_2_1__3__Impl();

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
    // $ANTLR end "rule__Add__Group_2_1__3"


    // $ANTLR start "rule__Add__Group_2_1__3__Impl"
    // InternalCsvMan.g:2136:1: rule__Add__Group_2_1__3__Impl : ( ')' ) ;
    public final void rule__Add__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2140:1: ( ( ')' ) )
            // InternalCsvMan.g:2141:1: ( ')' )
            {
            // InternalCsvMan.g:2141:1: ( ')' )
            // InternalCsvMan.g:2142:2: ')'
            {
             before(grammarAccess.getAddAccess().getRightParenthesisKeyword_2_1_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAddAccess().getRightParenthesisKeyword_2_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__Group_2_1__3__Impl"


    // $ANTLR start "rule__Add__Group_2_1_2__0"
    // InternalCsvMan.g:2152:1: rule__Add__Group_2_1_2__0 : rule__Add__Group_2_1_2__0__Impl rule__Add__Group_2_1_2__1 ;
    public final void rule__Add__Group_2_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2156:1: ( rule__Add__Group_2_1_2__0__Impl rule__Add__Group_2_1_2__1 )
            // InternalCsvMan.g:2157:2: rule__Add__Group_2_1_2__0__Impl rule__Add__Group_2_1_2__1
            {
            pushFollow(FOLLOW_9);
            rule__Add__Group_2_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Add__Group_2_1_2__1();

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
    // $ANTLR end "rule__Add__Group_2_1_2__0"


    // $ANTLR start "rule__Add__Group_2_1_2__0__Impl"
    // InternalCsvMan.g:2164:1: rule__Add__Group_2_1_2__0__Impl : ( ',' ) ;
    public final void rule__Add__Group_2_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2168:1: ( ( ',' ) )
            // InternalCsvMan.g:2169:1: ( ',' )
            {
            // InternalCsvMan.g:2169:1: ( ',' )
            // InternalCsvMan.g:2170:2: ','
            {
             before(grammarAccess.getAddAccess().getCommaKeyword_2_1_2_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAddAccess().getCommaKeyword_2_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__Group_2_1_2__0__Impl"


    // $ANTLR start "rule__Add__Group_2_1_2__1"
    // InternalCsvMan.g:2179:1: rule__Add__Group_2_1_2__1 : rule__Add__Group_2_1_2__1__Impl ;
    public final void rule__Add__Group_2_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2183:1: ( rule__Add__Group_2_1_2__1__Impl )
            // InternalCsvMan.g:2184:2: rule__Add__Group_2_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Add__Group_2_1_2__1__Impl();

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
    // $ANTLR end "rule__Add__Group_2_1_2__1"


    // $ANTLR start "rule__Add__Group_2_1_2__1__Impl"
    // InternalCsvMan.g:2190:1: rule__Add__Group_2_1_2__1__Impl : ( ( rule__Add__ParameterAssignment_2_1_2_1 ) ) ;
    public final void rule__Add__Group_2_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2194:1: ( ( ( rule__Add__ParameterAssignment_2_1_2_1 ) ) )
            // InternalCsvMan.g:2195:1: ( ( rule__Add__ParameterAssignment_2_1_2_1 ) )
            {
            // InternalCsvMan.g:2195:1: ( ( rule__Add__ParameterAssignment_2_1_2_1 ) )
            // InternalCsvMan.g:2196:2: ( rule__Add__ParameterAssignment_2_1_2_1 )
            {
             before(grammarAccess.getAddAccess().getParameterAssignment_2_1_2_1()); 
            // InternalCsvMan.g:2197:2: ( rule__Add__ParameterAssignment_2_1_2_1 )
            // InternalCsvMan.g:2197:3: rule__Add__ParameterAssignment_2_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Add__ParameterAssignment_2_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAddAccess().getParameterAssignment_2_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__Group_2_1_2__1__Impl"


    // $ANTLR start "rule__Join__Group__0"
    // InternalCsvMan.g:2206:1: rule__Join__Group__0 : rule__Join__Group__0__Impl rule__Join__Group__1 ;
    public final void rule__Join__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2210:1: ( rule__Join__Group__0__Impl rule__Join__Group__1 )
            // InternalCsvMan.g:2211:2: rule__Join__Group__0__Impl rule__Join__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalCsvMan.g:2218:1: rule__Join__Group__0__Impl : ( () ) ;
    public final void rule__Join__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2222:1: ( ( () ) )
            // InternalCsvMan.g:2223:1: ( () )
            {
            // InternalCsvMan.g:2223:1: ( () )
            // InternalCsvMan.g:2224:2: ()
            {
             before(grammarAccess.getJoinAccess().getJoinAction_0()); 
            // InternalCsvMan.g:2225:2: ()
            // InternalCsvMan.g:2225:3: 
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
    // InternalCsvMan.g:2233:1: rule__Join__Group__1 : rule__Join__Group__1__Impl rule__Join__Group__2 ;
    public final void rule__Join__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2237:1: ( rule__Join__Group__1__Impl rule__Join__Group__2 )
            // InternalCsvMan.g:2238:2: rule__Join__Group__1__Impl rule__Join__Group__2
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
    // InternalCsvMan.g:2245:1: rule__Join__Group__1__Impl : ( 'join' ) ;
    public final void rule__Join__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2249:1: ( ( 'join' ) )
            // InternalCsvMan.g:2250:1: ( 'join' )
            {
            // InternalCsvMan.g:2250:1: ( 'join' )
            // InternalCsvMan.g:2251:2: 'join'
            {
             before(grammarAccess.getJoinAccess().getJoinKeyword_1()); 
            match(input,27,FOLLOW_2); 
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
    // InternalCsvMan.g:2260:1: rule__Join__Group__2 : rule__Join__Group__2__Impl rule__Join__Group__3 ;
    public final void rule__Join__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2264:1: ( rule__Join__Group__2__Impl rule__Join__Group__3 )
            // InternalCsvMan.g:2265:2: rule__Join__Group__2__Impl rule__Join__Group__3
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
    // InternalCsvMan.g:2272:1: rule__Join__Group__2__Impl : ( ( rule__Join__TablesAssignment_2 ) ) ;
    public final void rule__Join__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2276:1: ( ( ( rule__Join__TablesAssignment_2 ) ) )
            // InternalCsvMan.g:2277:1: ( ( rule__Join__TablesAssignment_2 ) )
            {
            // InternalCsvMan.g:2277:1: ( ( rule__Join__TablesAssignment_2 ) )
            // InternalCsvMan.g:2278:2: ( rule__Join__TablesAssignment_2 )
            {
             before(grammarAccess.getJoinAccess().getTablesAssignment_2()); 
            // InternalCsvMan.g:2279:2: ( rule__Join__TablesAssignment_2 )
            // InternalCsvMan.g:2279:3: rule__Join__TablesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Join__TablesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getJoinAccess().getTablesAssignment_2()); 

            }


            }

        }
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
    // InternalCsvMan.g:2287:1: rule__Join__Group__3 : rule__Join__Group__3__Impl rule__Join__Group__4 ;
    public final void rule__Join__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2291:1: ( rule__Join__Group__3__Impl rule__Join__Group__4 )
            // InternalCsvMan.g:2292:2: rule__Join__Group__3__Impl rule__Join__Group__4
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
    // InternalCsvMan.g:2299:1: rule__Join__Group__3__Impl : ( ( rule__Join__TablesAssignment_3 ) ) ;
    public final void rule__Join__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2303:1: ( ( ( rule__Join__TablesAssignment_3 ) ) )
            // InternalCsvMan.g:2304:1: ( ( rule__Join__TablesAssignment_3 ) )
            {
            // InternalCsvMan.g:2304:1: ( ( rule__Join__TablesAssignment_3 ) )
            // InternalCsvMan.g:2305:2: ( rule__Join__TablesAssignment_3 )
            {
             before(grammarAccess.getJoinAccess().getTablesAssignment_3()); 
            // InternalCsvMan.g:2306:2: ( rule__Join__TablesAssignment_3 )
            // InternalCsvMan.g:2306:3: rule__Join__TablesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Join__TablesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getJoinAccess().getTablesAssignment_3()); 

            }


            }

        }
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
    // InternalCsvMan.g:2314:1: rule__Join__Group__4 : rule__Join__Group__4__Impl rule__Join__Group__5 ;
    public final void rule__Join__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2318:1: ( rule__Join__Group__4__Impl rule__Join__Group__5 )
            // InternalCsvMan.g:2319:2: rule__Join__Group__4__Impl rule__Join__Group__5
            {
            pushFollow(FOLLOW_9);
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
    // InternalCsvMan.g:2326:1: rule__Join__Group__4__Impl : ( 'in' ) ;
    public final void rule__Join__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2330:1: ( ( 'in' ) )
            // InternalCsvMan.g:2331:1: ( 'in' )
            {
            // InternalCsvMan.g:2331:1: ( 'in' )
            // InternalCsvMan.g:2332:2: 'in'
            {
             before(grammarAccess.getJoinAccess().getInKeyword_4()); 
            match(input,16,FOLLOW_2); 
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
    // InternalCsvMan.g:2341:1: rule__Join__Group__5 : rule__Join__Group__5__Impl ;
    public final void rule__Join__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2345:1: ( rule__Join__Group__5__Impl )
            // InternalCsvMan.g:2346:2: rule__Join__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Join__Group__5__Impl();

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
    // InternalCsvMan.g:2352:1: rule__Join__Group__5__Impl : ( ( rule__Join__Table3Assignment_5 ) ) ;
    public final void rule__Join__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2356:1: ( ( ( rule__Join__Table3Assignment_5 ) ) )
            // InternalCsvMan.g:2357:1: ( ( rule__Join__Table3Assignment_5 ) )
            {
            // InternalCsvMan.g:2357:1: ( ( rule__Join__Table3Assignment_5 ) )
            // InternalCsvMan.g:2358:2: ( rule__Join__Table3Assignment_5 )
            {
             before(grammarAccess.getJoinAccess().getTable3Assignment_5()); 
            // InternalCsvMan.g:2359:2: ( rule__Join__Table3Assignment_5 )
            // InternalCsvMan.g:2359:3: rule__Join__Table3Assignment_5
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


    // $ANTLR start "rule__Delete__Group__0"
    // InternalCsvMan.g:2368:1: rule__Delete__Group__0 : rule__Delete__Group__0__Impl rule__Delete__Group__1 ;
    public final void rule__Delete__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2372:1: ( rule__Delete__Group__0__Impl rule__Delete__Group__1 )
            // InternalCsvMan.g:2373:2: rule__Delete__Group__0__Impl rule__Delete__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalCsvMan.g:2380:1: rule__Delete__Group__0__Impl : ( () ) ;
    public final void rule__Delete__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2384:1: ( ( () ) )
            // InternalCsvMan.g:2385:1: ( () )
            {
            // InternalCsvMan.g:2385:1: ( () )
            // InternalCsvMan.g:2386:2: ()
            {
             before(grammarAccess.getDeleteAccess().getDeleteAction_0()); 
            // InternalCsvMan.g:2387:2: ()
            // InternalCsvMan.g:2387:3: 
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
    // InternalCsvMan.g:2395:1: rule__Delete__Group__1 : rule__Delete__Group__1__Impl rule__Delete__Group__2 ;
    public final void rule__Delete__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2399:1: ( rule__Delete__Group__1__Impl rule__Delete__Group__2 )
            // InternalCsvMan.g:2400:2: rule__Delete__Group__1__Impl rule__Delete__Group__2
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
    // InternalCsvMan.g:2407:1: rule__Delete__Group__1__Impl : ( 'delete' ) ;
    public final void rule__Delete__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2411:1: ( ( 'delete' ) )
            // InternalCsvMan.g:2412:1: ( 'delete' )
            {
            // InternalCsvMan.g:2412:1: ( 'delete' )
            // InternalCsvMan.g:2413:2: 'delete'
            {
             before(grammarAccess.getDeleteAccess().getDeleteKeyword_1()); 
            match(input,28,FOLLOW_2); 
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
    // InternalCsvMan.g:2422:1: rule__Delete__Group__2 : rule__Delete__Group__2__Impl rule__Delete__Group__3 ;
    public final void rule__Delete__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2426:1: ( rule__Delete__Group__2__Impl rule__Delete__Group__3 )
            // InternalCsvMan.g:2427:2: rule__Delete__Group__2__Impl rule__Delete__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalCsvMan.g:2434:1: rule__Delete__Group__2__Impl : ( ( rule__Delete__CsvtableAssignment_2 ) ) ;
    public final void rule__Delete__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2438:1: ( ( ( rule__Delete__CsvtableAssignment_2 ) ) )
            // InternalCsvMan.g:2439:1: ( ( rule__Delete__CsvtableAssignment_2 ) )
            {
            // InternalCsvMan.g:2439:1: ( ( rule__Delete__CsvtableAssignment_2 ) )
            // InternalCsvMan.g:2440:2: ( rule__Delete__CsvtableAssignment_2 )
            {
             before(grammarAccess.getDeleteAccess().getCsvtableAssignment_2()); 
            // InternalCsvMan.g:2441:2: ( rule__Delete__CsvtableAssignment_2 )
            // InternalCsvMan.g:2441:3: rule__Delete__CsvtableAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Delete__CsvtableAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDeleteAccess().getCsvtableAssignment_2()); 

            }


            }

        }
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
    // InternalCsvMan.g:2449:1: rule__Delete__Group__3 : rule__Delete__Group__3__Impl ;
    public final void rule__Delete__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2453:1: ( rule__Delete__Group__3__Impl )
            // InternalCsvMan.g:2454:2: rule__Delete__Group__3__Impl
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
    // InternalCsvMan.g:2460:1: rule__Delete__Group__3__Impl : ( ( rule__Delete__WhereAssignment_3 )? ) ;
    public final void rule__Delete__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2464:1: ( ( ( rule__Delete__WhereAssignment_3 )? ) )
            // InternalCsvMan.g:2465:1: ( ( rule__Delete__WhereAssignment_3 )? )
            {
            // InternalCsvMan.g:2465:1: ( ( rule__Delete__WhereAssignment_3 )? )
            // InternalCsvMan.g:2466:2: ( rule__Delete__WhereAssignment_3 )?
            {
             before(grammarAccess.getDeleteAccess().getWhereAssignment_3()); 
            // InternalCsvMan.g:2467:2: ( rule__Delete__WhereAssignment_3 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalCsvMan.g:2467:3: rule__Delete__WhereAssignment_3
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
    // InternalCsvMan.g:2476:1: rule__Exit__Group__0 : rule__Exit__Group__0__Impl rule__Exit__Group__1 ;
    public final void rule__Exit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2480:1: ( rule__Exit__Group__0__Impl rule__Exit__Group__1 )
            // InternalCsvMan.g:2481:2: rule__Exit__Group__0__Impl rule__Exit__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalCsvMan.g:2488:1: rule__Exit__Group__0__Impl : ( () ) ;
    public final void rule__Exit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2492:1: ( ( () ) )
            // InternalCsvMan.g:2493:1: ( () )
            {
            // InternalCsvMan.g:2493:1: ( () )
            // InternalCsvMan.g:2494:2: ()
            {
             before(grammarAccess.getExitAccess().getExitAction_0()); 
            // InternalCsvMan.g:2495:2: ()
            // InternalCsvMan.g:2495:3: 
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
    // InternalCsvMan.g:2503:1: rule__Exit__Group__1 : rule__Exit__Group__1__Impl ;
    public final void rule__Exit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2507:1: ( rule__Exit__Group__1__Impl )
            // InternalCsvMan.g:2508:2: rule__Exit__Group__1__Impl
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
    // InternalCsvMan.g:2514:1: rule__Exit__Group__1__Impl : ( 'exit' ) ;
    public final void rule__Exit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2518:1: ( ( 'exit' ) )
            // InternalCsvMan.g:2519:1: ( 'exit' )
            {
            // InternalCsvMan.g:2519:1: ( 'exit' )
            // InternalCsvMan.g:2520:2: 'exit'
            {
             before(grammarAccess.getExitAccess().getExitKeyword_1()); 
            match(input,29,FOLLOW_2); 
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
    // InternalCsvMan.g:2530:1: rule__Where__Group__0 : rule__Where__Group__0__Impl rule__Where__Group__1 ;
    public final void rule__Where__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2534:1: ( rule__Where__Group__0__Impl rule__Where__Group__1 )
            // InternalCsvMan.g:2535:2: rule__Where__Group__0__Impl rule__Where__Group__1
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
    // InternalCsvMan.g:2542:1: rule__Where__Group__0__Impl : ( () ) ;
    public final void rule__Where__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2546:1: ( ( () ) )
            // InternalCsvMan.g:2547:1: ( () )
            {
            // InternalCsvMan.g:2547:1: ( () )
            // InternalCsvMan.g:2548:2: ()
            {
             before(grammarAccess.getWhereAccess().getWhereAction_0()); 
            // InternalCsvMan.g:2549:2: ()
            // InternalCsvMan.g:2549:3: 
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
    // InternalCsvMan.g:2557:1: rule__Where__Group__1 : rule__Where__Group__1__Impl rule__Where__Group__2 ;
    public final void rule__Where__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2561:1: ( rule__Where__Group__1__Impl rule__Where__Group__2 )
            // InternalCsvMan.g:2562:2: rule__Where__Group__1__Impl rule__Where__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalCsvMan.g:2569:1: rule__Where__Group__1__Impl : ( 'where' ) ;
    public final void rule__Where__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2573:1: ( ( 'where' ) )
            // InternalCsvMan.g:2574:1: ( 'where' )
            {
            // InternalCsvMan.g:2574:1: ( 'where' )
            // InternalCsvMan.g:2575:2: 'where'
            {
             before(grammarAccess.getWhereAccess().getWhereKeyword_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalCsvMan.g:2584:1: rule__Where__Group__2 : rule__Where__Group__2__Impl rule__Where__Group__3 ;
    public final void rule__Where__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2588:1: ( rule__Where__Group__2__Impl rule__Where__Group__3 )
            // InternalCsvMan.g:2589:2: rule__Where__Group__2__Impl rule__Where__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalCsvMan.g:2596:1: rule__Where__Group__2__Impl : ( ( rule__Where__ConditionAssignment_2 ) ) ;
    public final void rule__Where__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2600:1: ( ( ( rule__Where__ConditionAssignment_2 ) ) )
            // InternalCsvMan.g:2601:1: ( ( rule__Where__ConditionAssignment_2 ) )
            {
            // InternalCsvMan.g:2601:1: ( ( rule__Where__ConditionAssignment_2 ) )
            // InternalCsvMan.g:2602:2: ( rule__Where__ConditionAssignment_2 )
            {
             before(grammarAccess.getWhereAccess().getConditionAssignment_2()); 
            // InternalCsvMan.g:2603:2: ( rule__Where__ConditionAssignment_2 )
            // InternalCsvMan.g:2603:3: rule__Where__ConditionAssignment_2
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
    // InternalCsvMan.g:2611:1: rule__Where__Group__3 : rule__Where__Group__3__Impl ;
    public final void rule__Where__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2615:1: ( rule__Where__Group__3__Impl )
            // InternalCsvMan.g:2616:2: rule__Where__Group__3__Impl
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
    // InternalCsvMan.g:2622:1: rule__Where__Group__3__Impl : ( ( rule__Where__Group_3__0 )* ) ;
    public final void rule__Where__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2626:1: ( ( ( rule__Where__Group_3__0 )* ) )
            // InternalCsvMan.g:2627:1: ( ( rule__Where__Group_3__0 )* )
            {
            // InternalCsvMan.g:2627:1: ( ( rule__Where__Group_3__0 )* )
            // InternalCsvMan.g:2628:2: ( rule__Where__Group_3__0 )*
            {
             before(grammarAccess.getWhereAccess().getGroup_3()); 
            // InternalCsvMan.g:2629:2: ( rule__Where__Group_3__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==23) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalCsvMan.g:2629:3: rule__Where__Group_3__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Where__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalCsvMan.g:2638:1: rule__Where__Group_3__0 : rule__Where__Group_3__0__Impl rule__Where__Group_3__1 ;
    public final void rule__Where__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2642:1: ( rule__Where__Group_3__0__Impl rule__Where__Group_3__1 )
            // InternalCsvMan.g:2643:2: rule__Where__Group_3__0__Impl rule__Where__Group_3__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalCsvMan.g:2650:1: rule__Where__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Where__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2654:1: ( ( ',' ) )
            // InternalCsvMan.g:2655:1: ( ',' )
            {
            // InternalCsvMan.g:2655:1: ( ',' )
            // InternalCsvMan.g:2656:2: ','
            {
             before(grammarAccess.getWhereAccess().getCommaKeyword_3_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalCsvMan.g:2665:1: rule__Where__Group_3__1 : rule__Where__Group_3__1__Impl ;
    public final void rule__Where__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2669:1: ( rule__Where__Group_3__1__Impl )
            // InternalCsvMan.g:2670:2: rule__Where__Group_3__1__Impl
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
    // InternalCsvMan.g:2676:1: rule__Where__Group_3__1__Impl : ( ( rule__Where__ConditionAssignment_3_1 ) ) ;
    public final void rule__Where__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2680:1: ( ( ( rule__Where__ConditionAssignment_3_1 ) ) )
            // InternalCsvMan.g:2681:1: ( ( rule__Where__ConditionAssignment_3_1 ) )
            {
            // InternalCsvMan.g:2681:1: ( ( rule__Where__ConditionAssignment_3_1 ) )
            // InternalCsvMan.g:2682:2: ( rule__Where__ConditionAssignment_3_1 )
            {
             before(grammarAccess.getWhereAccess().getConditionAssignment_3_1()); 
            // InternalCsvMan.g:2683:2: ( rule__Where__ConditionAssignment_3_1 )
            // InternalCsvMan.g:2683:3: rule__Where__ConditionAssignment_3_1
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
    // InternalCsvMan.g:2692:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2696:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalCsvMan.g:2697:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalCsvMan.g:2704:1: rule__Condition__Group__0__Impl : ( () ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2708:1: ( ( () ) )
            // InternalCsvMan.g:2709:1: ( () )
            {
            // InternalCsvMan.g:2709:1: ( () )
            // InternalCsvMan.g:2710:2: ()
            {
             before(grammarAccess.getConditionAccess().getConditionAction_0()); 
            // InternalCsvMan.g:2711:2: ()
            // InternalCsvMan.g:2711:3: 
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
    // InternalCsvMan.g:2719:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl rule__Condition__Group__2 ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2723:1: ( rule__Condition__Group__1__Impl rule__Condition__Group__2 )
            // InternalCsvMan.g:2724:2: rule__Condition__Group__1__Impl rule__Condition__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalCsvMan.g:2731:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__ColonneAssignment_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2735:1: ( ( ( rule__Condition__ColonneAssignment_1 ) ) )
            // InternalCsvMan.g:2736:1: ( ( rule__Condition__ColonneAssignment_1 ) )
            {
            // InternalCsvMan.g:2736:1: ( ( rule__Condition__ColonneAssignment_1 ) )
            // InternalCsvMan.g:2737:2: ( rule__Condition__ColonneAssignment_1 )
            {
             before(grammarAccess.getConditionAccess().getColonneAssignment_1()); 
            // InternalCsvMan.g:2738:2: ( rule__Condition__ColonneAssignment_1 )
            // InternalCsvMan.g:2738:3: rule__Condition__ColonneAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Condition__ColonneAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getColonneAssignment_1()); 

            }


            }

        }
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
    // InternalCsvMan.g:2746:1: rule__Condition__Group__2 : rule__Condition__Group__2__Impl rule__Condition__Group__3 ;
    public final void rule__Condition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2750:1: ( rule__Condition__Group__2__Impl rule__Condition__Group__3 )
            // InternalCsvMan.g:2751:2: rule__Condition__Group__2__Impl rule__Condition__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalCsvMan.g:2758:1: rule__Condition__Group__2__Impl : ( ( rule__Condition__Alternatives_2 ) ) ;
    public final void rule__Condition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2762:1: ( ( ( rule__Condition__Alternatives_2 ) ) )
            // InternalCsvMan.g:2763:1: ( ( rule__Condition__Alternatives_2 ) )
            {
            // InternalCsvMan.g:2763:1: ( ( rule__Condition__Alternatives_2 ) )
            // InternalCsvMan.g:2764:2: ( rule__Condition__Alternatives_2 )
            {
             before(grammarAccess.getConditionAccess().getAlternatives_2()); 
            // InternalCsvMan.g:2765:2: ( rule__Condition__Alternatives_2 )
            // InternalCsvMan.g:2765:3: rule__Condition__Alternatives_2
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
    // InternalCsvMan.g:2773:1: rule__Condition__Group__3 : rule__Condition__Group__3__Impl ;
    public final void rule__Condition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2777:1: ( rule__Condition__Group__3__Impl )
            // InternalCsvMan.g:2778:2: rule__Condition__Group__3__Impl
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
    // InternalCsvMan.g:2784:1: rule__Condition__Group__3__Impl : ( ( rule__Condition__ValeurAssignment_3 ) ) ;
    public final void rule__Condition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2788:1: ( ( ( rule__Condition__ValeurAssignment_3 ) ) )
            // InternalCsvMan.g:2789:1: ( ( rule__Condition__ValeurAssignment_3 ) )
            {
            // InternalCsvMan.g:2789:1: ( ( rule__Condition__ValeurAssignment_3 ) )
            // InternalCsvMan.g:2790:2: ( rule__Condition__ValeurAssignment_3 )
            {
             before(grammarAccess.getConditionAccess().getValeurAssignment_3()); 
            // InternalCsvMan.g:2791:2: ( rule__Condition__ValeurAssignment_3 )
            // InternalCsvMan.g:2791:3: rule__Condition__ValeurAssignment_3
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
    // InternalCsvMan.g:2800:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2804:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalCsvMan.g:2805:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalCsvMan.g:2812:1: rule__Parameter__Group__0__Impl : ( () ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2816:1: ( ( () ) )
            // InternalCsvMan.g:2817:1: ( () )
            {
            // InternalCsvMan.g:2817:1: ( () )
            // InternalCsvMan.g:2818:2: ()
            {
             before(grammarAccess.getParameterAccess().getParameterAction_0()); 
            // InternalCsvMan.g:2819:2: ()
            // InternalCsvMan.g:2819:3: 
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
    // InternalCsvMan.g:2827:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2831:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalCsvMan.g:2832:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalCsvMan.g:2839:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__ColonneAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2843:1: ( ( ( rule__Parameter__ColonneAssignment_1 ) ) )
            // InternalCsvMan.g:2844:1: ( ( rule__Parameter__ColonneAssignment_1 ) )
            {
            // InternalCsvMan.g:2844:1: ( ( rule__Parameter__ColonneAssignment_1 ) )
            // InternalCsvMan.g:2845:2: ( rule__Parameter__ColonneAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getColonneAssignment_1()); 
            // InternalCsvMan.g:2846:2: ( rule__Parameter__ColonneAssignment_1 )
            // InternalCsvMan.g:2846:3: rule__Parameter__ColonneAssignment_1
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
    // InternalCsvMan.g:2854:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2858:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // InternalCsvMan.g:2859:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalCsvMan.g:2866:1: rule__Parameter__Group__2__Impl : ( '=' ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2870:1: ( ( '=' ) )
            // InternalCsvMan.g:2871:1: ( '=' )
            {
            // InternalCsvMan.g:2871:1: ( '=' )
            // InternalCsvMan.g:2872:2: '='
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
    // InternalCsvMan.g:2881:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2885:1: ( rule__Parameter__Group__3__Impl )
            // InternalCsvMan.g:2886:2: rule__Parameter__Group__3__Impl
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
    // InternalCsvMan.g:2892:1: rule__Parameter__Group__3__Impl : ( ( rule__Parameter__ValueAssignment_3 ) ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2896:1: ( ( ( rule__Parameter__ValueAssignment_3 ) ) )
            // InternalCsvMan.g:2897:1: ( ( rule__Parameter__ValueAssignment_3 ) )
            {
            // InternalCsvMan.g:2897:1: ( ( rule__Parameter__ValueAssignment_3 ) )
            // InternalCsvMan.g:2898:2: ( rule__Parameter__ValueAssignment_3 )
            {
             before(grammarAccess.getParameterAccess().getValueAssignment_3()); 
            // InternalCsvMan.g:2899:2: ( rule__Parameter__ValueAssignment_3 )
            // InternalCsvMan.g:2899:3: rule__Parameter__ValueAssignment_3
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


    // $ANTLR start "rule__CsvTable__Group__0"
    // InternalCsvMan.g:2908:1: rule__CsvTable__Group__0 : rule__CsvTable__Group__0__Impl rule__CsvTable__Group__1 ;
    public final void rule__CsvTable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2912:1: ( rule__CsvTable__Group__0__Impl rule__CsvTable__Group__1 )
            // InternalCsvMan.g:2913:2: rule__CsvTable__Group__0__Impl rule__CsvTable__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__CsvTable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CsvTable__Group__1();

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
    // $ANTLR end "rule__CsvTable__Group__0"


    // $ANTLR start "rule__CsvTable__Group__0__Impl"
    // InternalCsvMan.g:2920:1: rule__CsvTable__Group__0__Impl : ( () ) ;
    public final void rule__CsvTable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2924:1: ( ( () ) )
            // InternalCsvMan.g:2925:1: ( () )
            {
            // InternalCsvMan.g:2925:1: ( () )
            // InternalCsvMan.g:2926:2: ()
            {
             before(grammarAccess.getCsvTableAccess().getCsvTableAction_0()); 
            // InternalCsvMan.g:2927:2: ()
            // InternalCsvMan.g:2927:3: 
            {
            }

             after(grammarAccess.getCsvTableAccess().getCsvTableAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvTable__Group__0__Impl"


    // $ANTLR start "rule__CsvTable__Group__1"
    // InternalCsvMan.g:2935:1: rule__CsvTable__Group__1 : rule__CsvTable__Group__1__Impl rule__CsvTable__Group__2 ;
    public final void rule__CsvTable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2939:1: ( rule__CsvTable__Group__1__Impl rule__CsvTable__Group__2 )
            // InternalCsvMan.g:2940:2: rule__CsvTable__Group__1__Impl rule__CsvTable__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__CsvTable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CsvTable__Group__2();

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
    // $ANTLR end "rule__CsvTable__Group__1"


    // $ANTLR start "rule__CsvTable__Group__1__Impl"
    // InternalCsvMan.g:2947:1: rule__CsvTable__Group__1__Impl : ( ( rule__CsvTable__NameAssignment_1 ) ) ;
    public final void rule__CsvTable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2951:1: ( ( ( rule__CsvTable__NameAssignment_1 ) ) )
            // InternalCsvMan.g:2952:1: ( ( rule__CsvTable__NameAssignment_1 ) )
            {
            // InternalCsvMan.g:2952:1: ( ( rule__CsvTable__NameAssignment_1 ) )
            // InternalCsvMan.g:2953:2: ( rule__CsvTable__NameAssignment_1 )
            {
             before(grammarAccess.getCsvTableAccess().getNameAssignment_1()); 
            // InternalCsvMan.g:2954:2: ( rule__CsvTable__NameAssignment_1 )
            // InternalCsvMan.g:2954:3: rule__CsvTable__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CsvTable__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCsvTableAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvTable__Group__1__Impl"


    // $ANTLR start "rule__CsvTable__Group__2"
    // InternalCsvMan.g:2962:1: rule__CsvTable__Group__2 : rule__CsvTable__Group__2__Impl ;
    public final void rule__CsvTable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2966:1: ( rule__CsvTable__Group__2__Impl )
            // InternalCsvMan.g:2967:2: rule__CsvTable__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CsvTable__Group__2__Impl();

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
    // $ANTLR end "rule__CsvTable__Group__2"


    // $ANTLR start "rule__CsvTable__Group__2__Impl"
    // InternalCsvMan.g:2973:1: rule__CsvTable__Group__2__Impl : ( ( rule__CsvTable__Group_2__0 )? ) ;
    public final void rule__CsvTable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2977:1: ( ( ( rule__CsvTable__Group_2__0 )? ) )
            // InternalCsvMan.g:2978:1: ( ( rule__CsvTable__Group_2__0 )? )
            {
            // InternalCsvMan.g:2978:1: ( ( rule__CsvTable__Group_2__0 )? )
            // InternalCsvMan.g:2979:2: ( rule__CsvTable__Group_2__0 )?
            {
             before(grammarAccess.getCsvTableAccess().getGroup_2()); 
            // InternalCsvMan.g:2980:2: ( rule__CsvTable__Group_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==21) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalCsvMan.g:2980:3: rule__CsvTable__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CsvTable__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCsvTableAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvTable__Group__2__Impl"


    // $ANTLR start "rule__CsvTable__Group_2__0"
    // InternalCsvMan.g:2989:1: rule__CsvTable__Group_2__0 : rule__CsvTable__Group_2__0__Impl rule__CsvTable__Group_2__1 ;
    public final void rule__CsvTable__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2993:1: ( rule__CsvTable__Group_2__0__Impl rule__CsvTable__Group_2__1 )
            // InternalCsvMan.g:2994:2: rule__CsvTable__Group_2__0__Impl rule__CsvTable__Group_2__1
            {
            pushFollow(FOLLOW_9);
            rule__CsvTable__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CsvTable__Group_2__1();

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
    // $ANTLR end "rule__CsvTable__Group_2__0"


    // $ANTLR start "rule__CsvTable__Group_2__0__Impl"
    // InternalCsvMan.g:3001:1: rule__CsvTable__Group_2__0__Impl : ( '(' ) ;
    public final void rule__CsvTable__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3005:1: ( ( '(' ) )
            // InternalCsvMan.g:3006:1: ( '(' )
            {
            // InternalCsvMan.g:3006:1: ( '(' )
            // InternalCsvMan.g:3007:2: '('
            {
             before(grammarAccess.getCsvTableAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCsvTableAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvTable__Group_2__0__Impl"


    // $ANTLR start "rule__CsvTable__Group_2__1"
    // InternalCsvMan.g:3016:1: rule__CsvTable__Group_2__1 : rule__CsvTable__Group_2__1__Impl rule__CsvTable__Group_2__2 ;
    public final void rule__CsvTable__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3020:1: ( rule__CsvTable__Group_2__1__Impl rule__CsvTable__Group_2__2 )
            // InternalCsvMan.g:3021:2: rule__CsvTable__Group_2__1__Impl rule__CsvTable__Group_2__2
            {
            pushFollow(FOLLOW_15);
            rule__CsvTable__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CsvTable__Group_2__2();

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
    // $ANTLR end "rule__CsvTable__Group_2__1"


    // $ANTLR start "rule__CsvTable__Group_2__1__Impl"
    // InternalCsvMan.g:3028:1: rule__CsvTable__Group_2__1__Impl : ( ( rule__CsvTable__ColonneAssignment_2_1 ) ) ;
    public final void rule__CsvTable__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3032:1: ( ( ( rule__CsvTable__ColonneAssignment_2_1 ) ) )
            // InternalCsvMan.g:3033:1: ( ( rule__CsvTable__ColonneAssignment_2_1 ) )
            {
            // InternalCsvMan.g:3033:1: ( ( rule__CsvTable__ColonneAssignment_2_1 ) )
            // InternalCsvMan.g:3034:2: ( rule__CsvTable__ColonneAssignment_2_1 )
            {
             before(grammarAccess.getCsvTableAccess().getColonneAssignment_2_1()); 
            // InternalCsvMan.g:3035:2: ( rule__CsvTable__ColonneAssignment_2_1 )
            // InternalCsvMan.g:3035:3: rule__CsvTable__ColonneAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__CsvTable__ColonneAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCsvTableAccess().getColonneAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvTable__Group_2__1__Impl"


    // $ANTLR start "rule__CsvTable__Group_2__2"
    // InternalCsvMan.g:3043:1: rule__CsvTable__Group_2__2 : rule__CsvTable__Group_2__2__Impl rule__CsvTable__Group_2__3 ;
    public final void rule__CsvTable__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3047:1: ( rule__CsvTable__Group_2__2__Impl rule__CsvTable__Group_2__3 )
            // InternalCsvMan.g:3048:2: rule__CsvTable__Group_2__2__Impl rule__CsvTable__Group_2__3
            {
            pushFollow(FOLLOW_15);
            rule__CsvTable__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CsvTable__Group_2__3();

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
    // $ANTLR end "rule__CsvTable__Group_2__2"


    // $ANTLR start "rule__CsvTable__Group_2__2__Impl"
    // InternalCsvMan.g:3055:1: rule__CsvTable__Group_2__2__Impl : ( ( rule__CsvTable__Group_2_2__0 )* ) ;
    public final void rule__CsvTable__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3059:1: ( ( ( rule__CsvTable__Group_2_2__0 )* ) )
            // InternalCsvMan.g:3060:1: ( ( rule__CsvTable__Group_2_2__0 )* )
            {
            // InternalCsvMan.g:3060:1: ( ( rule__CsvTable__Group_2_2__0 )* )
            // InternalCsvMan.g:3061:2: ( rule__CsvTable__Group_2_2__0 )*
            {
             before(grammarAccess.getCsvTableAccess().getGroup_2_2()); 
            // InternalCsvMan.g:3062:2: ( rule__CsvTable__Group_2_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==23) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalCsvMan.g:3062:3: rule__CsvTable__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__CsvTable__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getCsvTableAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvTable__Group_2__2__Impl"


    // $ANTLR start "rule__CsvTable__Group_2__3"
    // InternalCsvMan.g:3070:1: rule__CsvTable__Group_2__3 : rule__CsvTable__Group_2__3__Impl ;
    public final void rule__CsvTable__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3074:1: ( rule__CsvTable__Group_2__3__Impl )
            // InternalCsvMan.g:3075:2: rule__CsvTable__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CsvTable__Group_2__3__Impl();

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
    // $ANTLR end "rule__CsvTable__Group_2__3"


    // $ANTLR start "rule__CsvTable__Group_2__3__Impl"
    // InternalCsvMan.g:3081:1: rule__CsvTable__Group_2__3__Impl : ( ')' ) ;
    public final void rule__CsvTable__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3085:1: ( ( ')' ) )
            // InternalCsvMan.g:3086:1: ( ')' )
            {
            // InternalCsvMan.g:3086:1: ( ')' )
            // InternalCsvMan.g:3087:2: ')'
            {
             before(grammarAccess.getCsvTableAccess().getRightParenthesisKeyword_2_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCsvTableAccess().getRightParenthesisKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvTable__Group_2__3__Impl"


    // $ANTLR start "rule__CsvTable__Group_2_2__0"
    // InternalCsvMan.g:3097:1: rule__CsvTable__Group_2_2__0 : rule__CsvTable__Group_2_2__0__Impl rule__CsvTable__Group_2_2__1 ;
    public final void rule__CsvTable__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3101:1: ( rule__CsvTable__Group_2_2__0__Impl rule__CsvTable__Group_2_2__1 )
            // InternalCsvMan.g:3102:2: rule__CsvTable__Group_2_2__0__Impl rule__CsvTable__Group_2_2__1
            {
            pushFollow(FOLLOW_9);
            rule__CsvTable__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CsvTable__Group_2_2__1();

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
    // $ANTLR end "rule__CsvTable__Group_2_2__0"


    // $ANTLR start "rule__CsvTable__Group_2_2__0__Impl"
    // InternalCsvMan.g:3109:1: rule__CsvTable__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__CsvTable__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3113:1: ( ( ',' ) )
            // InternalCsvMan.g:3114:1: ( ',' )
            {
            // InternalCsvMan.g:3114:1: ( ',' )
            // InternalCsvMan.g:3115:2: ','
            {
             before(grammarAccess.getCsvTableAccess().getCommaKeyword_2_2_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCsvTableAccess().getCommaKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvTable__Group_2_2__0__Impl"


    // $ANTLR start "rule__CsvTable__Group_2_2__1"
    // InternalCsvMan.g:3124:1: rule__CsvTable__Group_2_2__1 : rule__CsvTable__Group_2_2__1__Impl ;
    public final void rule__CsvTable__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3128:1: ( rule__CsvTable__Group_2_2__1__Impl )
            // InternalCsvMan.g:3129:2: rule__CsvTable__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CsvTable__Group_2_2__1__Impl();

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
    // $ANTLR end "rule__CsvTable__Group_2_2__1"


    // $ANTLR start "rule__CsvTable__Group_2_2__1__Impl"
    // InternalCsvMan.g:3135:1: rule__CsvTable__Group_2_2__1__Impl : ( ( rule__CsvTable__ColonneAssignment_2_2_1 ) ) ;
    public final void rule__CsvTable__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3139:1: ( ( ( rule__CsvTable__ColonneAssignment_2_2_1 ) ) )
            // InternalCsvMan.g:3140:1: ( ( rule__CsvTable__ColonneAssignment_2_2_1 ) )
            {
            // InternalCsvMan.g:3140:1: ( ( rule__CsvTable__ColonneAssignment_2_2_1 ) )
            // InternalCsvMan.g:3141:2: ( rule__CsvTable__ColonneAssignment_2_2_1 )
            {
             before(grammarAccess.getCsvTableAccess().getColonneAssignment_2_2_1()); 
            // InternalCsvMan.g:3142:2: ( rule__CsvTable__ColonneAssignment_2_2_1 )
            // InternalCsvMan.g:3142:3: rule__CsvTable__ColonneAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__CsvTable__ColonneAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCsvTableAccess().getColonneAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvTable__Group_2_2__1__Impl"


    // $ANTLR start "rule__Program__InstructionAssignment_1_0"
    // InternalCsvMan.g:3151:1: rule__Program__InstructionAssignment_1_0 : ( ruleInstruction ) ;
    public final void rule__Program__InstructionAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3155:1: ( ( ruleInstruction ) )
            // InternalCsvMan.g:3156:2: ( ruleInstruction )
            {
            // InternalCsvMan.g:3156:2: ( ruleInstruction )
            // InternalCsvMan.g:3157:3: ruleInstruction
            {
             before(grammarAccess.getProgramAccess().getInstructionInstructionParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getInstructionInstructionParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__InstructionAssignment_1_0"


    // $ANTLR start "rule__Remove__CsvtableAssignment_2"
    // InternalCsvMan.g:3166:1: rule__Remove__CsvtableAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Remove__CsvtableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3170:1: ( ( ( RULE_ID ) ) )
            // InternalCsvMan.g:3171:2: ( ( RULE_ID ) )
            {
            // InternalCsvMan.g:3171:2: ( ( RULE_ID ) )
            // InternalCsvMan.g:3172:3: ( RULE_ID )
            {
             before(grammarAccess.getRemoveAccess().getCsvtableCsvTableCrossReference_2_0()); 
            // InternalCsvMan.g:3173:3: ( RULE_ID )
            // InternalCsvMan.g:3174:4: RULE_ID
            {
             before(grammarAccess.getRemoveAccess().getCsvtableCsvTableIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRemoveAccess().getCsvtableCsvTableIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getRemoveAccess().getCsvtableCsvTableCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Remove__CsvtableAssignment_2"


    // $ANTLR start "rule__Copy__AliasAssignment_2"
    // InternalCsvMan.g:3185:1: rule__Copy__AliasAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Copy__AliasAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3189:1: ( ( ( RULE_ID ) ) )
            // InternalCsvMan.g:3190:2: ( ( RULE_ID ) )
            {
            // InternalCsvMan.g:3190:2: ( ( RULE_ID ) )
            // InternalCsvMan.g:3191:3: ( RULE_ID )
            {
             before(grammarAccess.getCopyAccess().getAliasCsvTableCrossReference_2_0()); 
            // InternalCsvMan.g:3192:3: ( RULE_ID )
            // InternalCsvMan.g:3193:4: RULE_ID
            {
             before(grammarAccess.getCopyAccess().getAliasCsvTableIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCopyAccess().getAliasCsvTableIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getCopyAccess().getAliasCsvTableCrossReference_2_0()); 

            }


            }

        }
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
    // InternalCsvMan.g:3204:1: rule__Copy__TableAssignment_4 : ( ruleCsvTable ) ;
    public final void rule__Copy__TableAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3208:1: ( ( ruleCsvTable ) )
            // InternalCsvMan.g:3209:2: ( ruleCsvTable )
            {
            // InternalCsvMan.g:3209:2: ( ruleCsvTable )
            // InternalCsvMan.g:3210:3: ruleCsvTable
            {
             before(grammarAccess.getCopyAccess().getTableCsvTableParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCsvTable();

            state._fsp--;

             after(grammarAccess.getCopyAccess().getTableCsvTableParserRuleCall_4_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Create__CsvtableAssignment_2"
    // InternalCsvMan.g:3219:1: rule__Create__CsvtableAssignment_2 : ( ruleCsvTable ) ;
    public final void rule__Create__CsvtableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3223:1: ( ( ruleCsvTable ) )
            // InternalCsvMan.g:3224:2: ( ruleCsvTable )
            {
            // InternalCsvMan.g:3224:2: ( ruleCsvTable )
            // InternalCsvMan.g:3225:3: ruleCsvTable
            {
             before(grammarAccess.getCreateAccess().getCsvtableCsvTableParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCsvTable();

            state._fsp--;

             after(grammarAccess.getCreateAccess().getCsvtableCsvTableParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Create__CsvtableAssignment_2"


    // $ANTLR start "rule__Load__FichierAssignment_2"
    // InternalCsvMan.g:3234:1: rule__Load__FichierAssignment_2 : ( ruleEString ) ;
    public final void rule__Load__FichierAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3238:1: ( ( ruleEString ) )
            // InternalCsvMan.g:3239:2: ( ruleEString )
            {
            // InternalCsvMan.g:3239:2: ( ruleEString )
            // InternalCsvMan.g:3240:3: ruleEString
            {
             before(grammarAccess.getLoadAccess().getFichierEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLoadAccess().getFichierEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Load__FichierAssignment_2"


    // $ANTLR start "rule__Load__CsvtableAssignment_4"
    // InternalCsvMan.g:3249:1: rule__Load__CsvtableAssignment_4 : ( ruleCsvTable ) ;
    public final void rule__Load__CsvtableAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3253:1: ( ( ruleCsvTable ) )
            // InternalCsvMan.g:3254:2: ( ruleCsvTable )
            {
            // InternalCsvMan.g:3254:2: ( ruleCsvTable )
            // InternalCsvMan.g:3255:3: ruleCsvTable
            {
             before(grammarAccess.getLoadAccess().getCsvtableCsvTableParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCsvTable();

            state._fsp--;

             after(grammarAccess.getLoadAccess().getCsvtableCsvTableParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Load__CsvtableAssignment_4"


    // $ANTLR start "rule__Show__CsvtableAssignment_2"
    // InternalCsvMan.g:3264:1: rule__Show__CsvtableAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Show__CsvtableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3268:1: ( ( ( RULE_ID ) ) )
            // InternalCsvMan.g:3269:2: ( ( RULE_ID ) )
            {
            // InternalCsvMan.g:3269:2: ( ( RULE_ID ) )
            // InternalCsvMan.g:3270:3: ( RULE_ID )
            {
             before(grammarAccess.getShowAccess().getCsvtableCsvTableCrossReference_2_0()); 
            // InternalCsvMan.g:3271:3: ( RULE_ID )
            // InternalCsvMan.g:3272:4: RULE_ID
            {
             before(grammarAccess.getShowAccess().getCsvtableCsvTableIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getShowAccess().getCsvtableCsvTableIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getShowAccess().getCsvtableCsvTableCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Show__CsvtableAssignment_2"


    // $ANTLR start "rule__Show__ColonneAssignment_3_1"
    // InternalCsvMan.g:3283:1: rule__Show__ColonneAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Show__ColonneAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3287:1: ( ( ruleEString ) )
            // InternalCsvMan.g:3288:2: ( ruleEString )
            {
            // InternalCsvMan.g:3288:2: ( ruleEString )
            // InternalCsvMan.g:3289:3: ruleEString
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
    // InternalCsvMan.g:3298:1: rule__Show__ColonneAssignment_3_2_1 : ( ruleEString ) ;
    public final void rule__Show__ColonneAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3302:1: ( ( ruleEString ) )
            // InternalCsvMan.g:3303:2: ( ruleEString )
            {
            // InternalCsvMan.g:3303:2: ( ruleEString )
            // InternalCsvMan.g:3304:3: ruleEString
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
    // InternalCsvMan.g:3313:1: rule__Show__WhereAssignment_4 : ( ruleWhere ) ;
    public final void rule__Show__WhereAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3317:1: ( ( ruleWhere ) )
            // InternalCsvMan.g:3318:2: ( ruleWhere )
            {
            // InternalCsvMan.g:3318:2: ( ruleWhere )
            // InternalCsvMan.g:3319:3: ruleWhere
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


    // $ANTLR start "rule__Update__CsvtableAssignment_2"
    // InternalCsvMan.g:3328:1: rule__Update__CsvtableAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Update__CsvtableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3332:1: ( ( ( RULE_ID ) ) )
            // InternalCsvMan.g:3333:2: ( ( RULE_ID ) )
            {
            // InternalCsvMan.g:3333:2: ( ( RULE_ID ) )
            // InternalCsvMan.g:3334:3: ( RULE_ID )
            {
             before(grammarAccess.getUpdateAccess().getCsvtableCsvTableCrossReference_2_0()); 
            // InternalCsvMan.g:3335:3: ( RULE_ID )
            // InternalCsvMan.g:3336:4: RULE_ID
            {
             before(grammarAccess.getUpdateAccess().getCsvtableCsvTableIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUpdateAccess().getCsvtableCsvTableIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getUpdateAccess().getCsvtableCsvTableCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Update__CsvtableAssignment_2"


    // $ANTLR start "rule__Update__ParameterAssignment_4"
    // InternalCsvMan.g:3347:1: rule__Update__ParameterAssignment_4 : ( ruleParameter ) ;
    public final void rule__Update__ParameterAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3351:1: ( ( ruleParameter ) )
            // InternalCsvMan.g:3352:2: ( ruleParameter )
            {
            // InternalCsvMan.g:3352:2: ( ruleParameter )
            // InternalCsvMan.g:3353:3: ruleParameter
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
    // InternalCsvMan.g:3362:1: rule__Update__ParameterAssignment_5_1 : ( ruleParameter ) ;
    public final void rule__Update__ParameterAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3366:1: ( ( ruleParameter ) )
            // InternalCsvMan.g:3367:2: ( ruleParameter )
            {
            // InternalCsvMan.g:3367:2: ( ruleParameter )
            // InternalCsvMan.g:3368:3: ruleParameter
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
    // InternalCsvMan.g:3377:1: rule__Update__WhereAssignment_6 : ( ruleWhere ) ;
    public final void rule__Update__WhereAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3381:1: ( ( ruleWhere ) )
            // InternalCsvMan.g:3382:2: ( ruleWhere )
            {
            // InternalCsvMan.g:3382:2: ( ruleWhere )
            // InternalCsvMan.g:3383:3: ruleWhere
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


    // $ANTLR start "rule__Add__ValeurAssignment_2_0_1"
    // InternalCsvMan.g:3392:1: rule__Add__ValeurAssignment_2_0_1 : ( ruleEString ) ;
    public final void rule__Add__ValeurAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3396:1: ( ( ruleEString ) )
            // InternalCsvMan.g:3397:2: ( ruleEString )
            {
            // InternalCsvMan.g:3397:2: ( ruleEString )
            // InternalCsvMan.g:3398:3: ruleEString
            {
             before(grammarAccess.getAddAccess().getValeurEStringParserRuleCall_2_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAddAccess().getValeurEStringParserRuleCall_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__ValeurAssignment_2_0_1"


    // $ANTLR start "rule__Add__ValeurAssignment_2_0_2_1"
    // InternalCsvMan.g:3407:1: rule__Add__ValeurAssignment_2_0_2_1 : ( ruleEString ) ;
    public final void rule__Add__ValeurAssignment_2_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3411:1: ( ( ruleEString ) )
            // InternalCsvMan.g:3412:2: ( ruleEString )
            {
            // InternalCsvMan.g:3412:2: ( ruleEString )
            // InternalCsvMan.g:3413:3: ruleEString
            {
             before(grammarAccess.getAddAccess().getValeurEStringParserRuleCall_2_0_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAddAccess().getValeurEStringParserRuleCall_2_0_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__ValeurAssignment_2_0_2_1"


    // $ANTLR start "rule__Add__ParameterAssignment_2_1_1"
    // InternalCsvMan.g:3422:1: rule__Add__ParameterAssignment_2_1_1 : ( ruleParameter ) ;
    public final void rule__Add__ParameterAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3426:1: ( ( ruleParameter ) )
            // InternalCsvMan.g:3427:2: ( ruleParameter )
            {
            // InternalCsvMan.g:3427:2: ( ruleParameter )
            // InternalCsvMan.g:3428:3: ruleParameter
            {
             before(grammarAccess.getAddAccess().getParameterParameterParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getAddAccess().getParameterParameterParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__ParameterAssignment_2_1_1"


    // $ANTLR start "rule__Add__ParameterAssignment_2_1_2_1"
    // InternalCsvMan.g:3437:1: rule__Add__ParameterAssignment_2_1_2_1 : ( ruleParameter ) ;
    public final void rule__Add__ParameterAssignment_2_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3441:1: ( ( ruleParameter ) )
            // InternalCsvMan.g:3442:2: ( ruleParameter )
            {
            // InternalCsvMan.g:3442:2: ( ruleParameter )
            // InternalCsvMan.g:3443:3: ruleParameter
            {
             before(grammarAccess.getAddAccess().getParameterParameterParserRuleCall_2_1_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getAddAccess().getParameterParameterParserRuleCall_2_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__ParameterAssignment_2_1_2_1"


    // $ANTLR start "rule__Add__CsvtableAssignment_4"
    // InternalCsvMan.g:3452:1: rule__Add__CsvtableAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Add__CsvtableAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3456:1: ( ( ( ruleEString ) ) )
            // InternalCsvMan.g:3457:2: ( ( ruleEString ) )
            {
            // InternalCsvMan.g:3457:2: ( ( ruleEString ) )
            // InternalCsvMan.g:3458:3: ( ruleEString )
            {
             before(grammarAccess.getAddAccess().getCsvtableCsvTableCrossReference_4_0()); 
            // InternalCsvMan.g:3459:3: ( ruleEString )
            // InternalCsvMan.g:3460:4: ruleEString
            {
             before(grammarAccess.getAddAccess().getCsvtableCsvTableEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAddAccess().getCsvtableCsvTableEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getAddAccess().getCsvtableCsvTableCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Add__CsvtableAssignment_4"


    // $ANTLR start "rule__Join__TablesAssignment_2"
    // InternalCsvMan.g:3471:1: rule__Join__TablesAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Join__TablesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3475:1: ( ( ( RULE_ID ) ) )
            // InternalCsvMan.g:3476:2: ( ( RULE_ID ) )
            {
            // InternalCsvMan.g:3476:2: ( ( RULE_ID ) )
            // InternalCsvMan.g:3477:3: ( RULE_ID )
            {
             before(grammarAccess.getJoinAccess().getTablesCsvTableCrossReference_2_0()); 
            // InternalCsvMan.g:3478:3: ( RULE_ID )
            // InternalCsvMan.g:3479:4: RULE_ID
            {
             before(grammarAccess.getJoinAccess().getTablesCsvTableIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getJoinAccess().getTablesCsvTableIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getJoinAccess().getTablesCsvTableCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Join__TablesAssignment_2"


    // $ANTLR start "rule__Join__TablesAssignment_3"
    // InternalCsvMan.g:3490:1: rule__Join__TablesAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Join__TablesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3494:1: ( ( ( RULE_ID ) ) )
            // InternalCsvMan.g:3495:2: ( ( RULE_ID ) )
            {
            // InternalCsvMan.g:3495:2: ( ( RULE_ID ) )
            // InternalCsvMan.g:3496:3: ( RULE_ID )
            {
             before(grammarAccess.getJoinAccess().getTablesCsvTableCrossReference_3_0()); 
            // InternalCsvMan.g:3497:3: ( RULE_ID )
            // InternalCsvMan.g:3498:4: RULE_ID
            {
             before(grammarAccess.getJoinAccess().getTablesCsvTableIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getJoinAccess().getTablesCsvTableIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getJoinAccess().getTablesCsvTableCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Join__TablesAssignment_3"


    // $ANTLR start "rule__Join__Table3Assignment_5"
    // InternalCsvMan.g:3509:1: rule__Join__Table3Assignment_5 : ( ruleCsvTable ) ;
    public final void rule__Join__Table3Assignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3513:1: ( ( ruleCsvTable ) )
            // InternalCsvMan.g:3514:2: ( ruleCsvTable )
            {
            // InternalCsvMan.g:3514:2: ( ruleCsvTable )
            // InternalCsvMan.g:3515:3: ruleCsvTable
            {
             before(grammarAccess.getJoinAccess().getTable3CsvTableParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleCsvTable();

            state._fsp--;

             after(grammarAccess.getJoinAccess().getTable3CsvTableParserRuleCall_5_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Delete__CsvtableAssignment_2"
    // InternalCsvMan.g:3524:1: rule__Delete__CsvtableAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Delete__CsvtableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3528:1: ( ( ( RULE_ID ) ) )
            // InternalCsvMan.g:3529:2: ( ( RULE_ID ) )
            {
            // InternalCsvMan.g:3529:2: ( ( RULE_ID ) )
            // InternalCsvMan.g:3530:3: ( RULE_ID )
            {
             before(grammarAccess.getDeleteAccess().getCsvtableCsvTableCrossReference_2_0()); 
            // InternalCsvMan.g:3531:3: ( RULE_ID )
            // InternalCsvMan.g:3532:4: RULE_ID
            {
             before(grammarAccess.getDeleteAccess().getCsvtableCsvTableIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDeleteAccess().getCsvtableCsvTableIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getDeleteAccess().getCsvtableCsvTableCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delete__CsvtableAssignment_2"


    // $ANTLR start "rule__Delete__WhereAssignment_3"
    // InternalCsvMan.g:3543:1: rule__Delete__WhereAssignment_3 : ( ruleWhere ) ;
    public final void rule__Delete__WhereAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3547:1: ( ( ruleWhere ) )
            // InternalCsvMan.g:3548:2: ( ruleWhere )
            {
            // InternalCsvMan.g:3548:2: ( ruleWhere )
            // InternalCsvMan.g:3549:3: ruleWhere
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
    // InternalCsvMan.g:3558:1: rule__Where__ConditionAssignment_2 : ( ruleCondition ) ;
    public final void rule__Where__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3562:1: ( ( ruleCondition ) )
            // InternalCsvMan.g:3563:2: ( ruleCondition )
            {
            // InternalCsvMan.g:3563:2: ( ruleCondition )
            // InternalCsvMan.g:3564:3: ruleCondition
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
    // InternalCsvMan.g:3573:1: rule__Where__ConditionAssignment_3_1 : ( ruleCondition ) ;
    public final void rule__Where__ConditionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3577:1: ( ( ruleCondition ) )
            // InternalCsvMan.g:3578:2: ( ruleCondition )
            {
            // InternalCsvMan.g:3578:2: ( ruleCondition )
            // InternalCsvMan.g:3579:3: ruleCondition
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


    // $ANTLR start "rule__Condition__ColonneAssignment_1"
    // InternalCsvMan.g:3588:1: rule__Condition__ColonneAssignment_1 : ( ruleEString ) ;
    public final void rule__Condition__ColonneAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3592:1: ( ( ruleEString ) )
            // InternalCsvMan.g:3593:2: ( ruleEString )
            {
            // InternalCsvMan.g:3593:2: ( ruleEString )
            // InternalCsvMan.g:3594:3: ruleEString
            {
             before(grammarAccess.getConditionAccess().getColonneEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getColonneEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__ColonneAssignment_1"


    // $ANTLR start "rule__Condition__ValeurAssignment_3"
    // InternalCsvMan.g:3603:1: rule__Condition__ValeurAssignment_3 : ( ruleEString ) ;
    public final void rule__Condition__ValeurAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3607:1: ( ( ruleEString ) )
            // InternalCsvMan.g:3608:2: ( ruleEString )
            {
            // InternalCsvMan.g:3608:2: ( ruleEString )
            // InternalCsvMan.g:3609:3: ruleEString
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
    // InternalCsvMan.g:3618:1: rule__Parameter__ColonneAssignment_1 : ( ruleEString ) ;
    public final void rule__Parameter__ColonneAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3622:1: ( ( ruleEString ) )
            // InternalCsvMan.g:3623:2: ( ruleEString )
            {
            // InternalCsvMan.g:3623:2: ( ruleEString )
            // InternalCsvMan.g:3624:3: ruleEString
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
    // InternalCsvMan.g:3633:1: rule__Parameter__ValueAssignment_3 : ( ruleEString ) ;
    public final void rule__Parameter__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3637:1: ( ( ruleEString ) )
            // InternalCsvMan.g:3638:2: ( ruleEString )
            {
            // InternalCsvMan.g:3638:2: ( ruleEString )
            // InternalCsvMan.g:3639:3: ruleEString
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


    // $ANTLR start "rule__CsvTable__NameAssignment_1"
    // InternalCsvMan.g:3648:1: rule__CsvTable__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__CsvTable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3652:1: ( ( ruleEString ) )
            // InternalCsvMan.g:3653:2: ( ruleEString )
            {
            // InternalCsvMan.g:3653:2: ( ruleEString )
            // InternalCsvMan.g:3654:3: ruleEString
            {
             before(grammarAccess.getCsvTableAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCsvTableAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvTable__NameAssignment_1"


    // $ANTLR start "rule__CsvTable__ColonneAssignment_2_1"
    // InternalCsvMan.g:3663:1: rule__CsvTable__ColonneAssignment_2_1 : ( ruleEString ) ;
    public final void rule__CsvTable__ColonneAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3667:1: ( ( ruleEString ) )
            // InternalCsvMan.g:3668:2: ( ruleEString )
            {
            // InternalCsvMan.g:3668:2: ( ruleEString )
            // InternalCsvMan.g:3669:3: ruleEString
            {
             before(grammarAccess.getCsvTableAccess().getColonneEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCsvTableAccess().getColonneEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvTable__ColonneAssignment_2_1"


    // $ANTLR start "rule__CsvTable__ColonneAssignment_2_2_1"
    // InternalCsvMan.g:3678:1: rule__CsvTable__ColonneAssignment_2_2_1 : ( ruleEString ) ;
    public final void rule__CsvTable__ColonneAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3682:1: ( ( ruleEString ) )
            // InternalCsvMan.g:3683:2: ( ruleEString )
            {
            // InternalCsvMan.g:3683:2: ( ruleEString )
            // InternalCsvMan.g:3684:3: ruleEString
            {
             before(grammarAccess.getCsvTableAccess().getColonneEStringParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCsvTableAccess().getColonneEStringParserRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CsvTable__ColonneAssignment_2_2_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000003D16C060L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000003D16C062L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000380L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000002000L});

}