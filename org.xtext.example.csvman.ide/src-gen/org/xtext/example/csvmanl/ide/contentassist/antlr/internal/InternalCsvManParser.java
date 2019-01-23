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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_OP", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_NL", "RULE_WS", "RULE_ANY_OTHER", "'='", "'remove'", "'copy'", "'in'", "'create'", "'('", "')'", "','", "'load'", "'as'", "'show'", "'update'", "'set'", "'add'", "'join'", "'delete'", "'exit'", "'where'"
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


    // $ANTLR start "entryRuleComment"
    // InternalCsvMan.g:428:1: entryRuleComment : ruleComment EOF ;
    public final void entryRuleComment() throws RecognitionException {
        try {
            // InternalCsvMan.g:429:1: ( ruleComment EOF )
            // InternalCsvMan.g:430:1: ruleComment EOF
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
    // InternalCsvMan.g:437:1: ruleComment : ( ( rule__Comment__Alternatives ) ) ;
    public final void ruleComment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:441:2: ( ( ( rule__Comment__Alternatives ) ) )
            // InternalCsvMan.g:442:2: ( ( rule__Comment__Alternatives ) )
            {
            // InternalCsvMan.g:442:2: ( ( rule__Comment__Alternatives ) )
            // InternalCsvMan.g:443:3: ( rule__Comment__Alternatives )
            {
             before(grammarAccess.getCommentAccess().getAlternatives()); 
            // InternalCsvMan.g:444:3: ( rule__Comment__Alternatives )
            // InternalCsvMan.g:444:4: rule__Comment__Alternatives
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
    // InternalCsvMan.g:453:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalCsvMan.g:454:1: ( ruleEString EOF )
            // InternalCsvMan.g:455:1: ruleEString EOF
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
    // InternalCsvMan.g:462:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:466:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalCsvMan.g:467:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalCsvMan.g:467:2: ( ( rule__EString__Alternatives ) )
            // InternalCsvMan.g:468:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalCsvMan.g:469:3: ( rule__EString__Alternatives )
            // InternalCsvMan.g:469:4: rule__EString__Alternatives
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
    // InternalCsvMan.g:477:1: rule__Instruction__Alternatives : ( ( ruleCreate ) | ( ruleLoad ) | ( ruleShow ) | ( ruleUpdate ) | ( ruleAdd ) | ( ruleJoin ) | ( ruleDelete ) | ( ruleExit ) | ( ruleComment ) | ( ruleCopy ) | ( ruleRemove ) );
    public final void rule__Instruction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:481:1: ( ( ruleCreate ) | ( ruleLoad ) | ( ruleShow ) | ( ruleUpdate ) | ( ruleAdd ) | ( ruleJoin ) | ( ruleDelete ) | ( ruleExit ) | ( ruleComment ) | ( ruleCopy ) | ( ruleRemove ) )
            int alt1=11;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt1=1;
                }
                break;
            case 21:
                {
                alt1=2;
                }
                break;
            case 23:
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
                    // InternalCsvMan.g:482:2: ( ruleCreate )
                    {
                    // InternalCsvMan.g:482:2: ( ruleCreate )
                    // InternalCsvMan.g:483:3: ruleCreate
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
                    // InternalCsvMan.g:488:2: ( ruleLoad )
                    {
                    // InternalCsvMan.g:488:2: ( ruleLoad )
                    // InternalCsvMan.g:489:3: ruleLoad
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
                    // InternalCsvMan.g:494:2: ( ruleShow )
                    {
                    // InternalCsvMan.g:494:2: ( ruleShow )
                    // InternalCsvMan.g:495:3: ruleShow
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
                    // InternalCsvMan.g:500:2: ( ruleUpdate )
                    {
                    // InternalCsvMan.g:500:2: ( ruleUpdate )
                    // InternalCsvMan.g:501:3: ruleUpdate
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
                    // InternalCsvMan.g:506:2: ( ruleAdd )
                    {
                    // InternalCsvMan.g:506:2: ( ruleAdd )
                    // InternalCsvMan.g:507:3: ruleAdd
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
                    // InternalCsvMan.g:512:2: ( ruleJoin )
                    {
                    // InternalCsvMan.g:512:2: ( ruleJoin )
                    // InternalCsvMan.g:513:3: ruleJoin
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
                    // InternalCsvMan.g:518:2: ( ruleDelete )
                    {
                    // InternalCsvMan.g:518:2: ( ruleDelete )
                    // InternalCsvMan.g:519:3: ruleDelete
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
                    // InternalCsvMan.g:524:2: ( ruleExit )
                    {
                    // InternalCsvMan.g:524:2: ( ruleExit )
                    // InternalCsvMan.g:525:3: ruleExit
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
                    // InternalCsvMan.g:530:2: ( ruleComment )
                    {
                    // InternalCsvMan.g:530:2: ( ruleComment )
                    // InternalCsvMan.g:531:3: ruleComment
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
                    // InternalCsvMan.g:536:2: ( ruleCopy )
                    {
                    // InternalCsvMan.g:536:2: ( ruleCopy )
                    // InternalCsvMan.g:537:3: ruleCopy
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
                    // InternalCsvMan.g:542:2: ( ruleRemove )
                    {
                    // InternalCsvMan.g:542:2: ( ruleRemove )
                    // InternalCsvMan.g:543:3: ruleRemove
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
    // InternalCsvMan.g:552:1: rule__Add__Alternatives_2 : ( ( ( rule__Add__Group_2_0__0 ) ) | ( ( rule__Add__Group_2_1__0 ) ) );
    public final void rule__Add__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:556:1: ( ( ( rule__Add__Group_2_0__0 ) ) | ( ( rule__Add__Group_2_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==18) ) {
                switch ( input.LA(2) ) {
                case RULE_STRING:
                    {
                    int LA2_2 = input.LA(3);

                    if ( ((LA2_2>=19 && LA2_2<=20)) ) {
                        alt2=1;
                    }
                    else if ( (LA2_2==13) ) {
                        alt2=2;
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
                    else if ( ((LA2_3>=19 && LA2_3<=20)) ) {
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

                    if ( ((LA2_4>=19 && LA2_4<=20)) ) {
                        alt2=1;
                    }
                    else if ( (LA2_4==13) ) {
                        alt2=2;
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
                    // InternalCsvMan.g:557:2: ( ( rule__Add__Group_2_0__0 ) )
                    {
                    // InternalCsvMan.g:557:2: ( ( rule__Add__Group_2_0__0 ) )
                    // InternalCsvMan.g:558:3: ( rule__Add__Group_2_0__0 )
                    {
                     before(grammarAccess.getAddAccess().getGroup_2_0()); 
                    // InternalCsvMan.g:559:3: ( rule__Add__Group_2_0__0 )
                    // InternalCsvMan.g:559:4: rule__Add__Group_2_0__0
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
                    // InternalCsvMan.g:563:2: ( ( rule__Add__Group_2_1__0 ) )
                    {
                    // InternalCsvMan.g:563:2: ( ( rule__Add__Group_2_1__0 ) )
                    // InternalCsvMan.g:564:3: ( rule__Add__Group_2_1__0 )
                    {
                     before(grammarAccess.getAddAccess().getGroup_2_1()); 
                    // InternalCsvMan.g:565:3: ( rule__Add__Group_2_1__0 )
                    // InternalCsvMan.g:565:4: rule__Add__Group_2_1__0
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
    // InternalCsvMan.g:573:1: rule__Condition__Alternatives_2 : ( ( '=' ) | ( RULE_OP ) );
    public final void rule__Condition__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:577:1: ( ( '=' ) | ( RULE_OP ) )
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
                    // InternalCsvMan.g:578:2: ( '=' )
                    {
                    // InternalCsvMan.g:578:2: ( '=' )
                    // InternalCsvMan.g:579:3: '='
                    {
                     before(grammarAccess.getConditionAccess().getEqualsSignKeyword_2_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getConditionAccess().getEqualsSignKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCsvMan.g:584:2: ( RULE_OP )
                    {
                    // InternalCsvMan.g:584:2: ( RULE_OP )
                    // InternalCsvMan.g:585:3: RULE_OP
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
    // InternalCsvMan.g:594:1: rule__Comment__Alternatives : ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) );
    public final void rule__Comment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:598:1: ( ( RULE_ML_COMMENT ) | ( RULE_SL_COMMENT ) )
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
                    // InternalCsvMan.g:599:2: ( RULE_ML_COMMENT )
                    {
                    // InternalCsvMan.g:599:2: ( RULE_ML_COMMENT )
                    // InternalCsvMan.g:600:3: RULE_ML_COMMENT
                    {
                     before(grammarAccess.getCommentAccess().getML_COMMENTTerminalRuleCall_0()); 
                    match(input,RULE_ML_COMMENT,FOLLOW_2); 
                     after(grammarAccess.getCommentAccess().getML_COMMENTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCsvMan.g:605:2: ( RULE_SL_COMMENT )
                    {
                    // InternalCsvMan.g:605:2: ( RULE_SL_COMMENT )
                    // InternalCsvMan.g:606:3: RULE_SL_COMMENT
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
    // InternalCsvMan.g:615:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) | ( RULE_INT ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:619:1: ( ( RULE_STRING ) | ( RULE_ID ) | ( RULE_INT ) )
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
                    // InternalCsvMan.g:620:2: ( RULE_STRING )
                    {
                    // InternalCsvMan.g:620:2: ( RULE_STRING )
                    // InternalCsvMan.g:621:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCsvMan.g:626:2: ( RULE_ID )
                    {
                    // InternalCsvMan.g:626:2: ( RULE_ID )
                    // InternalCsvMan.g:627:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCsvMan.g:632:2: ( RULE_INT )
                    {
                    // InternalCsvMan.g:632:2: ( RULE_INT )
                    // InternalCsvMan.g:633:3: RULE_INT
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
    // InternalCsvMan.g:642:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:646:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalCsvMan.g:647:2: rule__Program__Group__0__Impl rule__Program__Group__1
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
    // InternalCsvMan.g:654:1: rule__Program__Group__0__Impl : ( () ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:658:1: ( ( () ) )
            // InternalCsvMan.g:659:1: ( () )
            {
            // InternalCsvMan.g:659:1: ( () )
            // InternalCsvMan.g:660:2: ()
            {
             before(grammarAccess.getProgramAccess().getProgramAction_0()); 
            // InternalCsvMan.g:661:2: ()
            // InternalCsvMan.g:661:3: 
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
    // InternalCsvMan.g:669:1: rule__Program__Group__1 : rule__Program__Group__1__Impl ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:673:1: ( rule__Program__Group__1__Impl )
            // InternalCsvMan.g:674:2: rule__Program__Group__1__Impl
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
    // InternalCsvMan.g:680:1: rule__Program__Group__1__Impl : ( ( rule__Program__InstructionAssignment_1 )* ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:684:1: ( ( ( rule__Program__InstructionAssignment_1 )* ) )
            // InternalCsvMan.g:685:1: ( ( rule__Program__InstructionAssignment_1 )* )
            {
            // InternalCsvMan.g:685:1: ( ( rule__Program__InstructionAssignment_1 )* )
            // InternalCsvMan.g:686:2: ( rule__Program__InstructionAssignment_1 )*
            {
             before(grammarAccess.getProgramAccess().getInstructionAssignment_1()); 
            // InternalCsvMan.g:687:2: ( rule__Program__InstructionAssignment_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_ML_COMMENT && LA6_0<=RULE_SL_COMMENT)||(LA6_0>=14 && LA6_0<=15)||LA6_0==17||LA6_0==21||(LA6_0>=23 && LA6_0<=24)||(LA6_0>=26 && LA6_0<=29)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCsvMan.g:687:3: rule__Program__InstructionAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Program__InstructionAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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


    // $ANTLR start "rule__Remove__Group__0"
    // InternalCsvMan.g:696:1: rule__Remove__Group__0 : rule__Remove__Group__0__Impl rule__Remove__Group__1 ;
    public final void rule__Remove__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:700:1: ( rule__Remove__Group__0__Impl rule__Remove__Group__1 )
            // InternalCsvMan.g:701:2: rule__Remove__Group__0__Impl rule__Remove__Group__1
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
    // InternalCsvMan.g:708:1: rule__Remove__Group__0__Impl : ( () ) ;
    public final void rule__Remove__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:712:1: ( ( () ) )
            // InternalCsvMan.g:713:1: ( () )
            {
            // InternalCsvMan.g:713:1: ( () )
            // InternalCsvMan.g:714:2: ()
            {
             before(grammarAccess.getRemoveAccess().getRemoveAction_0()); 
            // InternalCsvMan.g:715:2: ()
            // InternalCsvMan.g:715:3: 
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
    // InternalCsvMan.g:723:1: rule__Remove__Group__1 : rule__Remove__Group__1__Impl rule__Remove__Group__2 ;
    public final void rule__Remove__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:727:1: ( rule__Remove__Group__1__Impl rule__Remove__Group__2 )
            // InternalCsvMan.g:728:2: rule__Remove__Group__1__Impl rule__Remove__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalCsvMan.g:735:1: rule__Remove__Group__1__Impl : ( 'remove' ) ;
    public final void rule__Remove__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:739:1: ( ( 'remove' ) )
            // InternalCsvMan.g:740:1: ( 'remove' )
            {
            // InternalCsvMan.g:740:1: ( 'remove' )
            // InternalCsvMan.g:741:2: 'remove'
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
    // InternalCsvMan.g:750:1: rule__Remove__Group__2 : rule__Remove__Group__2__Impl rule__Remove__Group__3 ;
    public final void rule__Remove__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:754:1: ( rule__Remove__Group__2__Impl rule__Remove__Group__3 )
            // InternalCsvMan.g:755:2: rule__Remove__Group__2__Impl rule__Remove__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Remove__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Remove__Group__3();

            state._fsp--;


            }

        }
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
    // InternalCsvMan.g:762:1: rule__Remove__Group__2__Impl : ( ( rule__Remove__TableAssignment_2 ) ) ;
    public final void rule__Remove__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:766:1: ( ( ( rule__Remove__TableAssignment_2 ) ) )
            // InternalCsvMan.g:767:1: ( ( rule__Remove__TableAssignment_2 ) )
            {
            // InternalCsvMan.g:767:1: ( ( rule__Remove__TableAssignment_2 ) )
            // InternalCsvMan.g:768:2: ( rule__Remove__TableAssignment_2 )
            {
             before(grammarAccess.getRemoveAccess().getTableAssignment_2()); 
            // InternalCsvMan.g:769:2: ( rule__Remove__TableAssignment_2 )
            // InternalCsvMan.g:769:3: rule__Remove__TableAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Remove__TableAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRemoveAccess().getTableAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Remove__Group__3"
    // InternalCsvMan.g:777:1: rule__Remove__Group__3 : rule__Remove__Group__3__Impl ;
    public final void rule__Remove__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:781:1: ( rule__Remove__Group__3__Impl )
            // InternalCsvMan.g:782:2: rule__Remove__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Remove__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Remove__Group__3"


    // $ANTLR start "rule__Remove__Group__3__Impl"
    // InternalCsvMan.g:788:1: rule__Remove__Group__3__Impl : ( RULE_NL ) ;
    public final void rule__Remove__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:792:1: ( ( RULE_NL ) )
            // InternalCsvMan.g:793:1: ( RULE_NL )
            {
            // InternalCsvMan.g:793:1: ( RULE_NL )
            // InternalCsvMan.g:794:2: RULE_NL
            {
             before(grammarAccess.getRemoveAccess().getNLTerminalRuleCall_3()); 
            match(input,RULE_NL,FOLLOW_2); 
             after(grammarAccess.getRemoveAccess().getNLTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Remove__Group__3__Impl"


    // $ANTLR start "rule__Copy__Group__0"
    // InternalCsvMan.g:804:1: rule__Copy__Group__0 : rule__Copy__Group__0__Impl rule__Copy__Group__1 ;
    public final void rule__Copy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:808:1: ( rule__Copy__Group__0__Impl rule__Copy__Group__1 )
            // InternalCsvMan.g:809:2: rule__Copy__Group__0__Impl rule__Copy__Group__1
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
    // InternalCsvMan.g:816:1: rule__Copy__Group__0__Impl : ( () ) ;
    public final void rule__Copy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:820:1: ( ( () ) )
            // InternalCsvMan.g:821:1: ( () )
            {
            // InternalCsvMan.g:821:1: ( () )
            // InternalCsvMan.g:822:2: ()
            {
             before(grammarAccess.getCopyAccess().getCopyAction_0()); 
            // InternalCsvMan.g:823:2: ()
            // InternalCsvMan.g:823:3: 
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
    // InternalCsvMan.g:831:1: rule__Copy__Group__1 : rule__Copy__Group__1__Impl rule__Copy__Group__2 ;
    public final void rule__Copy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:835:1: ( rule__Copy__Group__1__Impl rule__Copy__Group__2 )
            // InternalCsvMan.g:836:2: rule__Copy__Group__1__Impl rule__Copy__Group__2
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
    // InternalCsvMan.g:843:1: rule__Copy__Group__1__Impl : ( 'copy' ) ;
    public final void rule__Copy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:847:1: ( ( 'copy' ) )
            // InternalCsvMan.g:848:1: ( 'copy' )
            {
            // InternalCsvMan.g:848:1: ( 'copy' )
            // InternalCsvMan.g:849:2: 'copy'
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
    // InternalCsvMan.g:858:1: rule__Copy__Group__2 : rule__Copy__Group__2__Impl rule__Copy__Group__3 ;
    public final void rule__Copy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:862:1: ( rule__Copy__Group__2__Impl rule__Copy__Group__3 )
            // InternalCsvMan.g:863:2: rule__Copy__Group__2__Impl rule__Copy__Group__3
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
    // InternalCsvMan.g:870:1: rule__Copy__Group__2__Impl : ( ( rule__Copy__AliasAssignment_2 ) ) ;
    public final void rule__Copy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:874:1: ( ( ( rule__Copy__AliasAssignment_2 ) ) )
            // InternalCsvMan.g:875:1: ( ( rule__Copy__AliasAssignment_2 ) )
            {
            // InternalCsvMan.g:875:1: ( ( rule__Copy__AliasAssignment_2 ) )
            // InternalCsvMan.g:876:2: ( rule__Copy__AliasAssignment_2 )
            {
             before(grammarAccess.getCopyAccess().getAliasAssignment_2()); 
            // InternalCsvMan.g:877:2: ( rule__Copy__AliasAssignment_2 )
            // InternalCsvMan.g:877:3: rule__Copy__AliasAssignment_2
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
    // InternalCsvMan.g:885:1: rule__Copy__Group__3 : rule__Copy__Group__3__Impl rule__Copy__Group__4 ;
    public final void rule__Copy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:889:1: ( rule__Copy__Group__3__Impl rule__Copy__Group__4 )
            // InternalCsvMan.g:890:2: rule__Copy__Group__3__Impl rule__Copy__Group__4
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
    // InternalCsvMan.g:897:1: rule__Copy__Group__3__Impl : ( 'in' ) ;
    public final void rule__Copy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:901:1: ( ( 'in' ) )
            // InternalCsvMan.g:902:1: ( 'in' )
            {
            // InternalCsvMan.g:902:1: ( 'in' )
            // InternalCsvMan.g:903:2: 'in'
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
    // InternalCsvMan.g:912:1: rule__Copy__Group__4 : rule__Copy__Group__4__Impl rule__Copy__Group__5 ;
    public final void rule__Copy__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:916:1: ( rule__Copy__Group__4__Impl rule__Copy__Group__5 )
            // InternalCsvMan.g:917:2: rule__Copy__Group__4__Impl rule__Copy__Group__5
            {
            pushFollow(FOLLOW_6);
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
    // InternalCsvMan.g:924:1: rule__Copy__Group__4__Impl : ( ( rule__Copy__TableAssignment_4 ) ) ;
    public final void rule__Copy__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:928:1: ( ( ( rule__Copy__TableAssignment_4 ) ) )
            // InternalCsvMan.g:929:1: ( ( rule__Copy__TableAssignment_4 ) )
            {
            // InternalCsvMan.g:929:1: ( ( rule__Copy__TableAssignment_4 ) )
            // InternalCsvMan.g:930:2: ( rule__Copy__TableAssignment_4 )
            {
             before(grammarAccess.getCopyAccess().getTableAssignment_4()); 
            // InternalCsvMan.g:931:2: ( rule__Copy__TableAssignment_4 )
            // InternalCsvMan.g:931:3: rule__Copy__TableAssignment_4
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
    // InternalCsvMan.g:939:1: rule__Copy__Group__5 : rule__Copy__Group__5__Impl ;
    public final void rule__Copy__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:943:1: ( rule__Copy__Group__5__Impl )
            // InternalCsvMan.g:944:2: rule__Copy__Group__5__Impl
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
    // InternalCsvMan.g:950:1: rule__Copy__Group__5__Impl : ( RULE_NL ) ;
    public final void rule__Copy__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:954:1: ( ( RULE_NL ) )
            // InternalCsvMan.g:955:1: ( RULE_NL )
            {
            // InternalCsvMan.g:955:1: ( RULE_NL )
            // InternalCsvMan.g:956:2: RULE_NL
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
    // InternalCsvMan.g:966:1: rule__Create__Group__0 : rule__Create__Group__0__Impl rule__Create__Group__1 ;
    public final void rule__Create__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:970:1: ( rule__Create__Group__0__Impl rule__Create__Group__1 )
            // InternalCsvMan.g:971:2: rule__Create__Group__0__Impl rule__Create__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalCsvMan.g:978:1: rule__Create__Group__0__Impl : ( () ) ;
    public final void rule__Create__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:982:1: ( ( () ) )
            // InternalCsvMan.g:983:1: ( () )
            {
            // InternalCsvMan.g:983:1: ( () )
            // InternalCsvMan.g:984:2: ()
            {
             before(grammarAccess.getCreateAccess().getCreateAction_0()); 
            // InternalCsvMan.g:985:2: ()
            // InternalCsvMan.g:985:3: 
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
    // InternalCsvMan.g:993:1: rule__Create__Group__1 : rule__Create__Group__1__Impl rule__Create__Group__2 ;
    public final void rule__Create__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:997:1: ( rule__Create__Group__1__Impl rule__Create__Group__2 )
            // InternalCsvMan.g:998:2: rule__Create__Group__1__Impl rule__Create__Group__2
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
    // InternalCsvMan.g:1005:1: rule__Create__Group__1__Impl : ( 'create' ) ;
    public final void rule__Create__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1009:1: ( ( 'create' ) )
            // InternalCsvMan.g:1010:1: ( 'create' )
            {
            // InternalCsvMan.g:1010:1: ( 'create' )
            // InternalCsvMan.g:1011:2: 'create'
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
    // InternalCsvMan.g:1020:1: rule__Create__Group__2 : rule__Create__Group__2__Impl rule__Create__Group__3 ;
    public final void rule__Create__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1024:1: ( rule__Create__Group__2__Impl rule__Create__Group__3 )
            // InternalCsvMan.g:1025:2: rule__Create__Group__2__Impl rule__Create__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalCsvMan.g:1032:1: rule__Create__Group__2__Impl : ( ( rule__Create__TableAssignment_2 ) ) ;
    public final void rule__Create__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1036:1: ( ( ( rule__Create__TableAssignment_2 ) ) )
            // InternalCsvMan.g:1037:1: ( ( rule__Create__TableAssignment_2 ) )
            {
            // InternalCsvMan.g:1037:1: ( ( rule__Create__TableAssignment_2 ) )
            // InternalCsvMan.g:1038:2: ( rule__Create__TableAssignment_2 )
            {
             before(grammarAccess.getCreateAccess().getTableAssignment_2()); 
            // InternalCsvMan.g:1039:2: ( rule__Create__TableAssignment_2 )
            // InternalCsvMan.g:1039:3: rule__Create__TableAssignment_2
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
    // InternalCsvMan.g:1047:1: rule__Create__Group__3 : rule__Create__Group__3__Impl rule__Create__Group__4 ;
    public final void rule__Create__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1051:1: ( rule__Create__Group__3__Impl rule__Create__Group__4 )
            // InternalCsvMan.g:1052:2: rule__Create__Group__3__Impl rule__Create__Group__4
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
    // InternalCsvMan.g:1059:1: rule__Create__Group__3__Impl : ( '(' ) ;
    public final void rule__Create__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1063:1: ( ( '(' ) )
            // InternalCsvMan.g:1064:1: ( '(' )
            {
            // InternalCsvMan.g:1064:1: ( '(' )
            // InternalCsvMan.g:1065:2: '('
            {
             before(grammarAccess.getCreateAccess().getLeftParenthesisKeyword_3()); 
            match(input,18,FOLLOW_2); 
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
    // InternalCsvMan.g:1074:1: rule__Create__Group__4 : rule__Create__Group__4__Impl rule__Create__Group__5 ;
    public final void rule__Create__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1078:1: ( rule__Create__Group__4__Impl rule__Create__Group__5 )
            // InternalCsvMan.g:1079:2: rule__Create__Group__4__Impl rule__Create__Group__5
            {
            pushFollow(FOLLOW_11);
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
    // InternalCsvMan.g:1086:1: rule__Create__Group__4__Impl : ( ( rule__Create__ColonneAssignment_4 ) ) ;
    public final void rule__Create__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1090:1: ( ( ( rule__Create__ColonneAssignment_4 ) ) )
            // InternalCsvMan.g:1091:1: ( ( rule__Create__ColonneAssignment_4 ) )
            {
            // InternalCsvMan.g:1091:1: ( ( rule__Create__ColonneAssignment_4 ) )
            // InternalCsvMan.g:1092:2: ( rule__Create__ColonneAssignment_4 )
            {
             before(grammarAccess.getCreateAccess().getColonneAssignment_4()); 
            // InternalCsvMan.g:1093:2: ( rule__Create__ColonneAssignment_4 )
            // InternalCsvMan.g:1093:3: rule__Create__ColonneAssignment_4
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
    // InternalCsvMan.g:1101:1: rule__Create__Group__5 : rule__Create__Group__5__Impl rule__Create__Group__6 ;
    public final void rule__Create__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1105:1: ( rule__Create__Group__5__Impl rule__Create__Group__6 )
            // InternalCsvMan.g:1106:2: rule__Create__Group__5__Impl rule__Create__Group__6
            {
            pushFollow(FOLLOW_11);
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
    // InternalCsvMan.g:1113:1: rule__Create__Group__5__Impl : ( ( rule__Create__Group_5__0 )* ) ;
    public final void rule__Create__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1117:1: ( ( ( rule__Create__Group_5__0 )* ) )
            // InternalCsvMan.g:1118:1: ( ( rule__Create__Group_5__0 )* )
            {
            // InternalCsvMan.g:1118:1: ( ( rule__Create__Group_5__0 )* )
            // InternalCsvMan.g:1119:2: ( rule__Create__Group_5__0 )*
            {
             before(grammarAccess.getCreateAccess().getGroup_5()); 
            // InternalCsvMan.g:1120:2: ( rule__Create__Group_5__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalCsvMan.g:1120:3: rule__Create__Group_5__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Create__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalCsvMan.g:1128:1: rule__Create__Group__6 : rule__Create__Group__6__Impl rule__Create__Group__7 ;
    public final void rule__Create__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1132:1: ( rule__Create__Group__6__Impl rule__Create__Group__7 )
            // InternalCsvMan.g:1133:2: rule__Create__Group__6__Impl rule__Create__Group__7
            {
            pushFollow(FOLLOW_6);
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
    // InternalCsvMan.g:1140:1: rule__Create__Group__6__Impl : ( ')' ) ;
    public final void rule__Create__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1144:1: ( ( ')' ) )
            // InternalCsvMan.g:1145:1: ( ')' )
            {
            // InternalCsvMan.g:1145:1: ( ')' )
            // InternalCsvMan.g:1146:2: ')'
            {
             before(grammarAccess.getCreateAccess().getRightParenthesisKeyword_6()); 
            match(input,19,FOLLOW_2); 
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
    // InternalCsvMan.g:1155:1: rule__Create__Group__7 : rule__Create__Group__7__Impl ;
    public final void rule__Create__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1159:1: ( rule__Create__Group__7__Impl )
            // InternalCsvMan.g:1160:2: rule__Create__Group__7__Impl
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
    // InternalCsvMan.g:1166:1: rule__Create__Group__7__Impl : ( RULE_NL ) ;
    public final void rule__Create__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1170:1: ( ( RULE_NL ) )
            // InternalCsvMan.g:1171:1: ( RULE_NL )
            {
            // InternalCsvMan.g:1171:1: ( RULE_NL )
            // InternalCsvMan.g:1172:2: RULE_NL
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
    // InternalCsvMan.g:1182:1: rule__Create__Group_5__0 : rule__Create__Group_5__0__Impl rule__Create__Group_5__1 ;
    public final void rule__Create__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1186:1: ( rule__Create__Group_5__0__Impl rule__Create__Group_5__1 )
            // InternalCsvMan.g:1187:2: rule__Create__Group_5__0__Impl rule__Create__Group_5__1
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
    // InternalCsvMan.g:1194:1: rule__Create__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Create__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1198:1: ( ( ',' ) )
            // InternalCsvMan.g:1199:1: ( ',' )
            {
            // InternalCsvMan.g:1199:1: ( ',' )
            // InternalCsvMan.g:1200:2: ','
            {
             before(grammarAccess.getCreateAccess().getCommaKeyword_5_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalCsvMan.g:1209:1: rule__Create__Group_5__1 : rule__Create__Group_5__1__Impl ;
    public final void rule__Create__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1213:1: ( rule__Create__Group_5__1__Impl )
            // InternalCsvMan.g:1214:2: rule__Create__Group_5__1__Impl
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
    // InternalCsvMan.g:1220:1: rule__Create__Group_5__1__Impl : ( ( rule__Create__ColonneAssignment_5_1 ) ) ;
    public final void rule__Create__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1224:1: ( ( ( rule__Create__ColonneAssignment_5_1 ) ) )
            // InternalCsvMan.g:1225:1: ( ( rule__Create__ColonneAssignment_5_1 ) )
            {
            // InternalCsvMan.g:1225:1: ( ( rule__Create__ColonneAssignment_5_1 ) )
            // InternalCsvMan.g:1226:2: ( rule__Create__ColonneAssignment_5_1 )
            {
             before(grammarAccess.getCreateAccess().getColonneAssignment_5_1()); 
            // InternalCsvMan.g:1227:2: ( rule__Create__ColonneAssignment_5_1 )
            // InternalCsvMan.g:1227:3: rule__Create__ColonneAssignment_5_1
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
    // InternalCsvMan.g:1236:1: rule__Load__Group__0 : rule__Load__Group__0__Impl rule__Load__Group__1 ;
    public final void rule__Load__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1240:1: ( rule__Load__Group__0__Impl rule__Load__Group__1 )
            // InternalCsvMan.g:1241:2: rule__Load__Group__0__Impl rule__Load__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalCsvMan.g:1248:1: rule__Load__Group__0__Impl : ( () ) ;
    public final void rule__Load__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1252:1: ( ( () ) )
            // InternalCsvMan.g:1253:1: ( () )
            {
            // InternalCsvMan.g:1253:1: ( () )
            // InternalCsvMan.g:1254:2: ()
            {
             before(grammarAccess.getLoadAccess().getLoadAction_0()); 
            // InternalCsvMan.g:1255:2: ()
            // InternalCsvMan.g:1255:3: 
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
    // InternalCsvMan.g:1263:1: rule__Load__Group__1 : rule__Load__Group__1__Impl rule__Load__Group__2 ;
    public final void rule__Load__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1267:1: ( rule__Load__Group__1__Impl rule__Load__Group__2 )
            // InternalCsvMan.g:1268:2: rule__Load__Group__1__Impl rule__Load__Group__2
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
    // InternalCsvMan.g:1275:1: rule__Load__Group__1__Impl : ( 'load' ) ;
    public final void rule__Load__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1279:1: ( ( 'load' ) )
            // InternalCsvMan.g:1280:1: ( 'load' )
            {
            // InternalCsvMan.g:1280:1: ( 'load' )
            // InternalCsvMan.g:1281:2: 'load'
            {
             before(grammarAccess.getLoadAccess().getLoadKeyword_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalCsvMan.g:1290:1: rule__Load__Group__2 : rule__Load__Group__2__Impl rule__Load__Group__3 ;
    public final void rule__Load__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1294:1: ( rule__Load__Group__2__Impl rule__Load__Group__3 )
            // InternalCsvMan.g:1295:2: rule__Load__Group__2__Impl rule__Load__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalCsvMan.g:1302:1: rule__Load__Group__2__Impl : ( ( rule__Load__TableAssignment_2 ) ) ;
    public final void rule__Load__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1306:1: ( ( ( rule__Load__TableAssignment_2 ) ) )
            // InternalCsvMan.g:1307:1: ( ( rule__Load__TableAssignment_2 ) )
            {
            // InternalCsvMan.g:1307:1: ( ( rule__Load__TableAssignment_2 ) )
            // InternalCsvMan.g:1308:2: ( rule__Load__TableAssignment_2 )
            {
             before(grammarAccess.getLoadAccess().getTableAssignment_2()); 
            // InternalCsvMan.g:1309:2: ( rule__Load__TableAssignment_2 )
            // InternalCsvMan.g:1309:3: rule__Load__TableAssignment_2
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
    // InternalCsvMan.g:1317:1: rule__Load__Group__3 : rule__Load__Group__3__Impl rule__Load__Group__4 ;
    public final void rule__Load__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1321:1: ( rule__Load__Group__3__Impl rule__Load__Group__4 )
            // InternalCsvMan.g:1322:2: rule__Load__Group__3__Impl rule__Load__Group__4
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
    // InternalCsvMan.g:1329:1: rule__Load__Group__3__Impl : ( 'as' ) ;
    public final void rule__Load__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1333:1: ( ( 'as' ) )
            // InternalCsvMan.g:1334:1: ( 'as' )
            {
            // InternalCsvMan.g:1334:1: ( 'as' )
            // InternalCsvMan.g:1335:2: 'as'
            {
             before(grammarAccess.getLoadAccess().getAsKeyword_3()); 
            match(input,22,FOLLOW_2); 
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
    // InternalCsvMan.g:1344:1: rule__Load__Group__4 : rule__Load__Group__4__Impl rule__Load__Group__5 ;
    public final void rule__Load__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1348:1: ( rule__Load__Group__4__Impl rule__Load__Group__5 )
            // InternalCsvMan.g:1349:2: rule__Load__Group__4__Impl rule__Load__Group__5
            {
            pushFollow(FOLLOW_6);
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
    // InternalCsvMan.g:1356:1: rule__Load__Group__4__Impl : ( ( rule__Load__AliasAssignment_4 ) ) ;
    public final void rule__Load__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1360:1: ( ( ( rule__Load__AliasAssignment_4 ) ) )
            // InternalCsvMan.g:1361:1: ( ( rule__Load__AliasAssignment_4 ) )
            {
            // InternalCsvMan.g:1361:1: ( ( rule__Load__AliasAssignment_4 ) )
            // InternalCsvMan.g:1362:2: ( rule__Load__AliasAssignment_4 )
            {
             before(grammarAccess.getLoadAccess().getAliasAssignment_4()); 
            // InternalCsvMan.g:1363:2: ( rule__Load__AliasAssignment_4 )
            // InternalCsvMan.g:1363:3: rule__Load__AliasAssignment_4
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
    // InternalCsvMan.g:1371:1: rule__Load__Group__5 : rule__Load__Group__5__Impl ;
    public final void rule__Load__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1375:1: ( rule__Load__Group__5__Impl )
            // InternalCsvMan.g:1376:2: rule__Load__Group__5__Impl
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
    // InternalCsvMan.g:1382:1: rule__Load__Group__5__Impl : ( RULE_NL ) ;
    public final void rule__Load__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1386:1: ( ( RULE_NL ) )
            // InternalCsvMan.g:1387:1: ( RULE_NL )
            {
            // InternalCsvMan.g:1387:1: ( RULE_NL )
            // InternalCsvMan.g:1388:2: RULE_NL
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
    // InternalCsvMan.g:1398:1: rule__Show__Group__0 : rule__Show__Group__0__Impl rule__Show__Group__1 ;
    public final void rule__Show__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1402:1: ( rule__Show__Group__0__Impl rule__Show__Group__1 )
            // InternalCsvMan.g:1403:2: rule__Show__Group__0__Impl rule__Show__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalCsvMan.g:1410:1: rule__Show__Group__0__Impl : ( () ) ;
    public final void rule__Show__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1414:1: ( ( () ) )
            // InternalCsvMan.g:1415:1: ( () )
            {
            // InternalCsvMan.g:1415:1: ( () )
            // InternalCsvMan.g:1416:2: ()
            {
             before(grammarAccess.getShowAccess().getShowAction_0()); 
            // InternalCsvMan.g:1417:2: ()
            // InternalCsvMan.g:1417:3: 
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
    // InternalCsvMan.g:1425:1: rule__Show__Group__1 : rule__Show__Group__1__Impl rule__Show__Group__2 ;
    public final void rule__Show__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1429:1: ( rule__Show__Group__1__Impl rule__Show__Group__2 )
            // InternalCsvMan.g:1430:2: rule__Show__Group__1__Impl rule__Show__Group__2
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
    // InternalCsvMan.g:1437:1: rule__Show__Group__1__Impl : ( 'show' ) ;
    public final void rule__Show__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1441:1: ( ( 'show' ) )
            // InternalCsvMan.g:1442:1: ( 'show' )
            {
            // InternalCsvMan.g:1442:1: ( 'show' )
            // InternalCsvMan.g:1443:2: 'show'
            {
             before(grammarAccess.getShowAccess().getShowKeyword_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalCsvMan.g:1452:1: rule__Show__Group__2 : rule__Show__Group__2__Impl rule__Show__Group__3 ;
    public final void rule__Show__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1456:1: ( rule__Show__Group__2__Impl rule__Show__Group__3 )
            // InternalCsvMan.g:1457:2: rule__Show__Group__2__Impl rule__Show__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalCsvMan.g:1464:1: rule__Show__Group__2__Impl : ( ( rule__Show__TableAssignment_2 ) ) ;
    public final void rule__Show__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1468:1: ( ( ( rule__Show__TableAssignment_2 ) ) )
            // InternalCsvMan.g:1469:1: ( ( rule__Show__TableAssignment_2 ) )
            {
            // InternalCsvMan.g:1469:1: ( ( rule__Show__TableAssignment_2 ) )
            // InternalCsvMan.g:1470:2: ( rule__Show__TableAssignment_2 )
            {
             before(grammarAccess.getShowAccess().getTableAssignment_2()); 
            // InternalCsvMan.g:1471:2: ( rule__Show__TableAssignment_2 )
            // InternalCsvMan.g:1471:3: rule__Show__TableAssignment_2
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
    // InternalCsvMan.g:1479:1: rule__Show__Group__3 : rule__Show__Group__3__Impl rule__Show__Group__4 ;
    public final void rule__Show__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1483:1: ( rule__Show__Group__3__Impl rule__Show__Group__4 )
            // InternalCsvMan.g:1484:2: rule__Show__Group__3__Impl rule__Show__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalCsvMan.g:1491:1: rule__Show__Group__3__Impl : ( ( rule__Show__Group_3__0 )? ) ;
    public final void rule__Show__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1495:1: ( ( ( rule__Show__Group_3__0 )? ) )
            // InternalCsvMan.g:1496:1: ( ( rule__Show__Group_3__0 )? )
            {
            // InternalCsvMan.g:1496:1: ( ( rule__Show__Group_3__0 )? )
            // InternalCsvMan.g:1497:2: ( rule__Show__Group_3__0 )?
            {
             before(grammarAccess.getShowAccess().getGroup_3()); 
            // InternalCsvMan.g:1498:2: ( rule__Show__Group_3__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalCsvMan.g:1498:3: rule__Show__Group_3__0
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
    // InternalCsvMan.g:1506:1: rule__Show__Group__4 : rule__Show__Group__4__Impl rule__Show__Group__5 ;
    public final void rule__Show__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1510:1: ( rule__Show__Group__4__Impl rule__Show__Group__5 )
            // InternalCsvMan.g:1511:2: rule__Show__Group__4__Impl rule__Show__Group__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalCsvMan.g:1518:1: rule__Show__Group__4__Impl : ( ( rule__Show__WhereAssignment_4 )? ) ;
    public final void rule__Show__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1522:1: ( ( ( rule__Show__WhereAssignment_4 )? ) )
            // InternalCsvMan.g:1523:1: ( ( rule__Show__WhereAssignment_4 )? )
            {
            // InternalCsvMan.g:1523:1: ( ( rule__Show__WhereAssignment_4 )? )
            // InternalCsvMan.g:1524:2: ( rule__Show__WhereAssignment_4 )?
            {
             before(grammarAccess.getShowAccess().getWhereAssignment_4()); 
            // InternalCsvMan.g:1525:2: ( rule__Show__WhereAssignment_4 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==30) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalCsvMan.g:1525:3: rule__Show__WhereAssignment_4
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
    // InternalCsvMan.g:1533:1: rule__Show__Group__5 : rule__Show__Group__5__Impl ;
    public final void rule__Show__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1537:1: ( rule__Show__Group__5__Impl )
            // InternalCsvMan.g:1538:2: rule__Show__Group__5__Impl
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
    // InternalCsvMan.g:1544:1: rule__Show__Group__5__Impl : ( RULE_NL ) ;
    public final void rule__Show__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1548:1: ( ( RULE_NL ) )
            // InternalCsvMan.g:1549:1: ( RULE_NL )
            {
            // InternalCsvMan.g:1549:1: ( RULE_NL )
            // InternalCsvMan.g:1550:2: RULE_NL
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
    // InternalCsvMan.g:1560:1: rule__Show__Group_3__0 : rule__Show__Group_3__0__Impl rule__Show__Group_3__1 ;
    public final void rule__Show__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1564:1: ( rule__Show__Group_3__0__Impl rule__Show__Group_3__1 )
            // InternalCsvMan.g:1565:2: rule__Show__Group_3__0__Impl rule__Show__Group_3__1
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
    // InternalCsvMan.g:1572:1: rule__Show__Group_3__0__Impl : ( '(' ) ;
    public final void rule__Show__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1576:1: ( ( '(' ) )
            // InternalCsvMan.g:1577:1: ( '(' )
            {
            // InternalCsvMan.g:1577:1: ( '(' )
            // InternalCsvMan.g:1578:2: '('
            {
             before(grammarAccess.getShowAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalCsvMan.g:1587:1: rule__Show__Group_3__1 : rule__Show__Group_3__1__Impl rule__Show__Group_3__2 ;
    public final void rule__Show__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1591:1: ( rule__Show__Group_3__1__Impl rule__Show__Group_3__2 )
            // InternalCsvMan.g:1592:2: rule__Show__Group_3__1__Impl rule__Show__Group_3__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalCsvMan.g:1599:1: rule__Show__Group_3__1__Impl : ( ( rule__Show__ColonneAssignment_3_1 ) ) ;
    public final void rule__Show__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1603:1: ( ( ( rule__Show__ColonneAssignment_3_1 ) ) )
            // InternalCsvMan.g:1604:1: ( ( rule__Show__ColonneAssignment_3_1 ) )
            {
            // InternalCsvMan.g:1604:1: ( ( rule__Show__ColonneAssignment_3_1 ) )
            // InternalCsvMan.g:1605:2: ( rule__Show__ColonneAssignment_3_1 )
            {
             before(grammarAccess.getShowAccess().getColonneAssignment_3_1()); 
            // InternalCsvMan.g:1606:2: ( rule__Show__ColonneAssignment_3_1 )
            // InternalCsvMan.g:1606:3: rule__Show__ColonneAssignment_3_1
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
    // InternalCsvMan.g:1614:1: rule__Show__Group_3__2 : rule__Show__Group_3__2__Impl rule__Show__Group_3__3 ;
    public final void rule__Show__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1618:1: ( rule__Show__Group_3__2__Impl rule__Show__Group_3__3 )
            // InternalCsvMan.g:1619:2: rule__Show__Group_3__2__Impl rule__Show__Group_3__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalCsvMan.g:1626:1: rule__Show__Group_3__2__Impl : ( ( rule__Show__Group_3_2__0 )* ) ;
    public final void rule__Show__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1630:1: ( ( ( rule__Show__Group_3_2__0 )* ) )
            // InternalCsvMan.g:1631:1: ( ( rule__Show__Group_3_2__0 )* )
            {
            // InternalCsvMan.g:1631:1: ( ( rule__Show__Group_3_2__0 )* )
            // InternalCsvMan.g:1632:2: ( rule__Show__Group_3_2__0 )*
            {
             before(grammarAccess.getShowAccess().getGroup_3_2()); 
            // InternalCsvMan.g:1633:2: ( rule__Show__Group_3_2__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==20) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalCsvMan.g:1633:3: rule__Show__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Show__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalCsvMan.g:1641:1: rule__Show__Group_3__3 : rule__Show__Group_3__3__Impl ;
    public final void rule__Show__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1645:1: ( rule__Show__Group_3__3__Impl )
            // InternalCsvMan.g:1646:2: rule__Show__Group_3__3__Impl
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
    // InternalCsvMan.g:1652:1: rule__Show__Group_3__3__Impl : ( ')' ) ;
    public final void rule__Show__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1656:1: ( ( ')' ) )
            // InternalCsvMan.g:1657:1: ( ')' )
            {
            // InternalCsvMan.g:1657:1: ( ')' )
            // InternalCsvMan.g:1658:2: ')'
            {
             before(grammarAccess.getShowAccess().getRightParenthesisKeyword_3_3()); 
            match(input,19,FOLLOW_2); 
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
    // InternalCsvMan.g:1668:1: rule__Show__Group_3_2__0 : rule__Show__Group_3_2__0__Impl rule__Show__Group_3_2__1 ;
    public final void rule__Show__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1672:1: ( rule__Show__Group_3_2__0__Impl rule__Show__Group_3_2__1 )
            // InternalCsvMan.g:1673:2: rule__Show__Group_3_2__0__Impl rule__Show__Group_3_2__1
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
    // InternalCsvMan.g:1680:1: rule__Show__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__Show__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1684:1: ( ( ',' ) )
            // InternalCsvMan.g:1685:1: ( ',' )
            {
            // InternalCsvMan.g:1685:1: ( ',' )
            // InternalCsvMan.g:1686:2: ','
            {
             before(grammarAccess.getShowAccess().getCommaKeyword_3_2_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalCsvMan.g:1695:1: rule__Show__Group_3_2__1 : rule__Show__Group_3_2__1__Impl ;
    public final void rule__Show__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1699:1: ( rule__Show__Group_3_2__1__Impl )
            // InternalCsvMan.g:1700:2: rule__Show__Group_3_2__1__Impl
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
    // InternalCsvMan.g:1706:1: rule__Show__Group_3_2__1__Impl : ( ( rule__Show__ColonneAssignment_3_2_1 ) ) ;
    public final void rule__Show__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1710:1: ( ( ( rule__Show__ColonneAssignment_3_2_1 ) ) )
            // InternalCsvMan.g:1711:1: ( ( rule__Show__ColonneAssignment_3_2_1 ) )
            {
            // InternalCsvMan.g:1711:1: ( ( rule__Show__ColonneAssignment_3_2_1 ) )
            // InternalCsvMan.g:1712:2: ( rule__Show__ColonneAssignment_3_2_1 )
            {
             before(grammarAccess.getShowAccess().getColonneAssignment_3_2_1()); 
            // InternalCsvMan.g:1713:2: ( rule__Show__ColonneAssignment_3_2_1 )
            // InternalCsvMan.g:1713:3: rule__Show__ColonneAssignment_3_2_1
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
    // InternalCsvMan.g:1722:1: rule__Update__Group__0 : rule__Update__Group__0__Impl rule__Update__Group__1 ;
    public final void rule__Update__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1726:1: ( rule__Update__Group__0__Impl rule__Update__Group__1 )
            // InternalCsvMan.g:1727:2: rule__Update__Group__0__Impl rule__Update__Group__1
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
    // InternalCsvMan.g:1734:1: rule__Update__Group__0__Impl : ( () ) ;
    public final void rule__Update__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1738:1: ( ( () ) )
            // InternalCsvMan.g:1739:1: ( () )
            {
            // InternalCsvMan.g:1739:1: ( () )
            // InternalCsvMan.g:1740:2: ()
            {
             before(grammarAccess.getUpdateAccess().getUpdateAction_0()); 
            // InternalCsvMan.g:1741:2: ()
            // InternalCsvMan.g:1741:3: 
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
    // InternalCsvMan.g:1749:1: rule__Update__Group__1 : rule__Update__Group__1__Impl rule__Update__Group__2 ;
    public final void rule__Update__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1753:1: ( rule__Update__Group__1__Impl rule__Update__Group__2 )
            // InternalCsvMan.g:1754:2: rule__Update__Group__1__Impl rule__Update__Group__2
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
    // InternalCsvMan.g:1761:1: rule__Update__Group__1__Impl : ( 'update' ) ;
    public final void rule__Update__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1765:1: ( ( 'update' ) )
            // InternalCsvMan.g:1766:1: ( 'update' )
            {
            // InternalCsvMan.g:1766:1: ( 'update' )
            // InternalCsvMan.g:1767:2: 'update'
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
    // InternalCsvMan.g:1776:1: rule__Update__Group__2 : rule__Update__Group__2__Impl rule__Update__Group__3 ;
    public final void rule__Update__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1780:1: ( rule__Update__Group__2__Impl rule__Update__Group__3 )
            // InternalCsvMan.g:1781:2: rule__Update__Group__2__Impl rule__Update__Group__3
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
    // InternalCsvMan.g:1788:1: rule__Update__Group__2__Impl : ( ( rule__Update__TableAssignment_2 ) ) ;
    public final void rule__Update__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1792:1: ( ( ( rule__Update__TableAssignment_2 ) ) )
            // InternalCsvMan.g:1793:1: ( ( rule__Update__TableAssignment_2 ) )
            {
            // InternalCsvMan.g:1793:1: ( ( rule__Update__TableAssignment_2 ) )
            // InternalCsvMan.g:1794:2: ( rule__Update__TableAssignment_2 )
            {
             before(grammarAccess.getUpdateAccess().getTableAssignment_2()); 
            // InternalCsvMan.g:1795:2: ( rule__Update__TableAssignment_2 )
            // InternalCsvMan.g:1795:3: rule__Update__TableAssignment_2
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
    // InternalCsvMan.g:1803:1: rule__Update__Group__3 : rule__Update__Group__3__Impl rule__Update__Group__4 ;
    public final void rule__Update__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1807:1: ( rule__Update__Group__3__Impl rule__Update__Group__4 )
            // InternalCsvMan.g:1808:2: rule__Update__Group__3__Impl rule__Update__Group__4
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
    // InternalCsvMan.g:1815:1: rule__Update__Group__3__Impl : ( 'set' ) ;
    public final void rule__Update__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1819:1: ( ( 'set' ) )
            // InternalCsvMan.g:1820:1: ( 'set' )
            {
            // InternalCsvMan.g:1820:1: ( 'set' )
            // InternalCsvMan.g:1821:2: 'set'
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
    // InternalCsvMan.g:1830:1: rule__Update__Group__4 : rule__Update__Group__4__Impl rule__Update__Group__5 ;
    public final void rule__Update__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1834:1: ( rule__Update__Group__4__Impl rule__Update__Group__5 )
            // InternalCsvMan.g:1835:2: rule__Update__Group__4__Impl rule__Update__Group__5
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
    // InternalCsvMan.g:1842:1: rule__Update__Group__4__Impl : ( ( rule__Update__ParameterAssignment_4 ) ) ;
    public final void rule__Update__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1846:1: ( ( ( rule__Update__ParameterAssignment_4 ) ) )
            // InternalCsvMan.g:1847:1: ( ( rule__Update__ParameterAssignment_4 ) )
            {
            // InternalCsvMan.g:1847:1: ( ( rule__Update__ParameterAssignment_4 ) )
            // InternalCsvMan.g:1848:2: ( rule__Update__ParameterAssignment_4 )
            {
             before(grammarAccess.getUpdateAccess().getParameterAssignment_4()); 
            // InternalCsvMan.g:1849:2: ( rule__Update__ParameterAssignment_4 )
            // InternalCsvMan.g:1849:3: rule__Update__ParameterAssignment_4
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
    // InternalCsvMan.g:1857:1: rule__Update__Group__5 : rule__Update__Group__5__Impl rule__Update__Group__6 ;
    public final void rule__Update__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1861:1: ( rule__Update__Group__5__Impl rule__Update__Group__6 )
            // InternalCsvMan.g:1862:2: rule__Update__Group__5__Impl rule__Update__Group__6
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
    // InternalCsvMan.g:1869:1: rule__Update__Group__5__Impl : ( ( rule__Update__Group_5__0 )* ) ;
    public final void rule__Update__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1873:1: ( ( ( rule__Update__Group_5__0 )* ) )
            // InternalCsvMan.g:1874:1: ( ( rule__Update__Group_5__0 )* )
            {
            // InternalCsvMan.g:1874:1: ( ( rule__Update__Group_5__0 )* )
            // InternalCsvMan.g:1875:2: ( rule__Update__Group_5__0 )*
            {
             before(grammarAccess.getUpdateAccess().getGroup_5()); 
            // InternalCsvMan.g:1876:2: ( rule__Update__Group_5__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==20) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalCsvMan.g:1876:3: rule__Update__Group_5__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Update__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalCsvMan.g:1884:1: rule__Update__Group__6 : rule__Update__Group__6__Impl rule__Update__Group__7 ;
    public final void rule__Update__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1888:1: ( rule__Update__Group__6__Impl rule__Update__Group__7 )
            // InternalCsvMan.g:1889:2: rule__Update__Group__6__Impl rule__Update__Group__7
            {
            pushFollow(FOLLOW_19);
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
    // InternalCsvMan.g:1896:1: rule__Update__Group__6__Impl : ( ( rule__Update__WhereAssignment_6 )? ) ;
    public final void rule__Update__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1900:1: ( ( ( rule__Update__WhereAssignment_6 )? ) )
            // InternalCsvMan.g:1901:1: ( ( rule__Update__WhereAssignment_6 )? )
            {
            // InternalCsvMan.g:1901:1: ( ( rule__Update__WhereAssignment_6 )? )
            // InternalCsvMan.g:1902:2: ( rule__Update__WhereAssignment_6 )?
            {
             before(grammarAccess.getUpdateAccess().getWhereAssignment_6()); 
            // InternalCsvMan.g:1903:2: ( rule__Update__WhereAssignment_6 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCsvMan.g:1903:3: rule__Update__WhereAssignment_6
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
    // InternalCsvMan.g:1911:1: rule__Update__Group__7 : rule__Update__Group__7__Impl ;
    public final void rule__Update__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1915:1: ( rule__Update__Group__7__Impl )
            // InternalCsvMan.g:1916:2: rule__Update__Group__7__Impl
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
    // InternalCsvMan.g:1922:1: rule__Update__Group__7__Impl : ( RULE_NL ) ;
    public final void rule__Update__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1926:1: ( ( RULE_NL ) )
            // InternalCsvMan.g:1927:1: ( RULE_NL )
            {
            // InternalCsvMan.g:1927:1: ( RULE_NL )
            // InternalCsvMan.g:1928:2: RULE_NL
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
    // InternalCsvMan.g:1938:1: rule__Update__Group_5__0 : rule__Update__Group_5__0__Impl rule__Update__Group_5__1 ;
    public final void rule__Update__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1942:1: ( rule__Update__Group_5__0__Impl rule__Update__Group_5__1 )
            // InternalCsvMan.g:1943:2: rule__Update__Group_5__0__Impl rule__Update__Group_5__1
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
    // InternalCsvMan.g:1950:1: rule__Update__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Update__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1954:1: ( ( ',' ) )
            // InternalCsvMan.g:1955:1: ( ',' )
            {
            // InternalCsvMan.g:1955:1: ( ',' )
            // InternalCsvMan.g:1956:2: ','
            {
             before(grammarAccess.getUpdateAccess().getCommaKeyword_5_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalCsvMan.g:1965:1: rule__Update__Group_5__1 : rule__Update__Group_5__1__Impl ;
    public final void rule__Update__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1969:1: ( rule__Update__Group_5__1__Impl )
            // InternalCsvMan.g:1970:2: rule__Update__Group_5__1__Impl
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
    // InternalCsvMan.g:1976:1: rule__Update__Group_5__1__Impl : ( ( rule__Update__ParameterAssignment_5_1 ) ) ;
    public final void rule__Update__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1980:1: ( ( ( rule__Update__ParameterAssignment_5_1 ) ) )
            // InternalCsvMan.g:1981:1: ( ( rule__Update__ParameterAssignment_5_1 ) )
            {
            // InternalCsvMan.g:1981:1: ( ( rule__Update__ParameterAssignment_5_1 ) )
            // InternalCsvMan.g:1982:2: ( rule__Update__ParameterAssignment_5_1 )
            {
             before(grammarAccess.getUpdateAccess().getParameterAssignment_5_1()); 
            // InternalCsvMan.g:1983:2: ( rule__Update__ParameterAssignment_5_1 )
            // InternalCsvMan.g:1983:3: rule__Update__ParameterAssignment_5_1
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
    // InternalCsvMan.g:1992:1: rule__Add__Group__0 : rule__Add__Group__0__Impl rule__Add__Group__1 ;
    public final void rule__Add__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:1996:1: ( rule__Add__Group__0__Impl rule__Add__Group__1 )
            // InternalCsvMan.g:1997:2: rule__Add__Group__0__Impl rule__Add__Group__1
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
    // InternalCsvMan.g:2004:1: rule__Add__Group__0__Impl : ( () ) ;
    public final void rule__Add__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2008:1: ( ( () ) )
            // InternalCsvMan.g:2009:1: ( () )
            {
            // InternalCsvMan.g:2009:1: ( () )
            // InternalCsvMan.g:2010:2: ()
            {
             before(grammarAccess.getAddAccess().getAddAction_0()); 
            // InternalCsvMan.g:2011:2: ()
            // InternalCsvMan.g:2011:3: 
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
    // InternalCsvMan.g:2019:1: rule__Add__Group__1 : rule__Add__Group__1__Impl rule__Add__Group__2 ;
    public final void rule__Add__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2023:1: ( rule__Add__Group__1__Impl rule__Add__Group__2 )
            // InternalCsvMan.g:2024:2: rule__Add__Group__1__Impl rule__Add__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalCsvMan.g:2031:1: rule__Add__Group__1__Impl : ( 'add' ) ;
    public final void rule__Add__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2035:1: ( ( 'add' ) )
            // InternalCsvMan.g:2036:1: ( 'add' )
            {
            // InternalCsvMan.g:2036:1: ( 'add' )
            // InternalCsvMan.g:2037:2: 'add'
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
    // InternalCsvMan.g:2046:1: rule__Add__Group__2 : rule__Add__Group__2__Impl rule__Add__Group__3 ;
    public final void rule__Add__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2050:1: ( rule__Add__Group__2__Impl rule__Add__Group__3 )
            // InternalCsvMan.g:2051:2: rule__Add__Group__2__Impl rule__Add__Group__3
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
    // InternalCsvMan.g:2058:1: rule__Add__Group__2__Impl : ( ( rule__Add__Alternatives_2 ) ) ;
    public final void rule__Add__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2062:1: ( ( ( rule__Add__Alternatives_2 ) ) )
            // InternalCsvMan.g:2063:1: ( ( rule__Add__Alternatives_2 ) )
            {
            // InternalCsvMan.g:2063:1: ( ( rule__Add__Alternatives_2 ) )
            // InternalCsvMan.g:2064:2: ( rule__Add__Alternatives_2 )
            {
             before(grammarAccess.getAddAccess().getAlternatives_2()); 
            // InternalCsvMan.g:2065:2: ( rule__Add__Alternatives_2 )
            // InternalCsvMan.g:2065:3: rule__Add__Alternatives_2
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
    // InternalCsvMan.g:2073:1: rule__Add__Group__3 : rule__Add__Group__3__Impl rule__Add__Group__4 ;
    public final void rule__Add__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2077:1: ( rule__Add__Group__3__Impl rule__Add__Group__4 )
            // InternalCsvMan.g:2078:2: rule__Add__Group__3__Impl rule__Add__Group__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalCsvMan.g:2085:1: rule__Add__Group__3__Impl : ( 'in' ) ;
    public final void rule__Add__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2089:1: ( ( 'in' ) )
            // InternalCsvMan.g:2090:1: ( 'in' )
            {
            // InternalCsvMan.g:2090:1: ( 'in' )
            // InternalCsvMan.g:2091:2: 'in'
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
    // InternalCsvMan.g:2100:1: rule__Add__Group__4 : rule__Add__Group__4__Impl rule__Add__Group__5 ;
    public final void rule__Add__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2104:1: ( rule__Add__Group__4__Impl rule__Add__Group__5 )
            // InternalCsvMan.g:2105:2: rule__Add__Group__4__Impl rule__Add__Group__5
            {
            pushFollow(FOLLOW_6);
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
    // InternalCsvMan.g:2112:1: rule__Add__Group__4__Impl : ( ( rule__Add__TableAssignment_4 ) ) ;
    public final void rule__Add__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2116:1: ( ( ( rule__Add__TableAssignment_4 ) ) )
            // InternalCsvMan.g:2117:1: ( ( rule__Add__TableAssignment_4 ) )
            {
            // InternalCsvMan.g:2117:1: ( ( rule__Add__TableAssignment_4 ) )
            // InternalCsvMan.g:2118:2: ( rule__Add__TableAssignment_4 )
            {
             before(grammarAccess.getAddAccess().getTableAssignment_4()); 
            // InternalCsvMan.g:2119:2: ( rule__Add__TableAssignment_4 )
            // InternalCsvMan.g:2119:3: rule__Add__TableAssignment_4
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
    // InternalCsvMan.g:2127:1: rule__Add__Group__5 : rule__Add__Group__5__Impl ;
    public final void rule__Add__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2131:1: ( rule__Add__Group__5__Impl )
            // InternalCsvMan.g:2132:2: rule__Add__Group__5__Impl
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
    // InternalCsvMan.g:2138:1: rule__Add__Group__5__Impl : ( RULE_NL ) ;
    public final void rule__Add__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2142:1: ( ( RULE_NL ) )
            // InternalCsvMan.g:2143:1: ( RULE_NL )
            {
            // InternalCsvMan.g:2143:1: ( RULE_NL )
            // InternalCsvMan.g:2144:2: RULE_NL
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


    // $ANTLR start "rule__Add__Group_2_0__0"
    // InternalCsvMan.g:2154:1: rule__Add__Group_2_0__0 : rule__Add__Group_2_0__0__Impl rule__Add__Group_2_0__1 ;
    public final void rule__Add__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2158:1: ( rule__Add__Group_2_0__0__Impl rule__Add__Group_2_0__1 )
            // InternalCsvMan.g:2159:2: rule__Add__Group_2_0__0__Impl rule__Add__Group_2_0__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalCsvMan.g:2166:1: rule__Add__Group_2_0__0__Impl : ( '(' ) ;
    public final void rule__Add__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2170:1: ( ( '(' ) )
            // InternalCsvMan.g:2171:1: ( '(' )
            {
            // InternalCsvMan.g:2171:1: ( '(' )
            // InternalCsvMan.g:2172:2: '('
            {
             before(grammarAccess.getAddAccess().getLeftParenthesisKeyword_2_0_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalCsvMan.g:2181:1: rule__Add__Group_2_0__1 : rule__Add__Group_2_0__1__Impl rule__Add__Group_2_0__2 ;
    public final void rule__Add__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2185:1: ( rule__Add__Group_2_0__1__Impl rule__Add__Group_2_0__2 )
            // InternalCsvMan.g:2186:2: rule__Add__Group_2_0__1__Impl rule__Add__Group_2_0__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalCsvMan.g:2193:1: rule__Add__Group_2_0__1__Impl : ( ( rule__Add__ValeurAssignment_2_0_1 ) ) ;
    public final void rule__Add__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2197:1: ( ( ( rule__Add__ValeurAssignment_2_0_1 ) ) )
            // InternalCsvMan.g:2198:1: ( ( rule__Add__ValeurAssignment_2_0_1 ) )
            {
            // InternalCsvMan.g:2198:1: ( ( rule__Add__ValeurAssignment_2_0_1 ) )
            // InternalCsvMan.g:2199:2: ( rule__Add__ValeurAssignment_2_0_1 )
            {
             before(grammarAccess.getAddAccess().getValeurAssignment_2_0_1()); 
            // InternalCsvMan.g:2200:2: ( rule__Add__ValeurAssignment_2_0_1 )
            // InternalCsvMan.g:2200:3: rule__Add__ValeurAssignment_2_0_1
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
    // InternalCsvMan.g:2208:1: rule__Add__Group_2_0__2 : rule__Add__Group_2_0__2__Impl rule__Add__Group_2_0__3 ;
    public final void rule__Add__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2212:1: ( rule__Add__Group_2_0__2__Impl rule__Add__Group_2_0__3 )
            // InternalCsvMan.g:2213:2: rule__Add__Group_2_0__2__Impl rule__Add__Group_2_0__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalCsvMan.g:2220:1: rule__Add__Group_2_0__2__Impl : ( ( rule__Add__Group_2_0_2__0 )* ) ;
    public final void rule__Add__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2224:1: ( ( ( rule__Add__Group_2_0_2__0 )* ) )
            // InternalCsvMan.g:2225:1: ( ( rule__Add__Group_2_0_2__0 )* )
            {
            // InternalCsvMan.g:2225:1: ( ( rule__Add__Group_2_0_2__0 )* )
            // InternalCsvMan.g:2226:2: ( rule__Add__Group_2_0_2__0 )*
            {
             before(grammarAccess.getAddAccess().getGroup_2_0_2()); 
            // InternalCsvMan.g:2227:2: ( rule__Add__Group_2_0_2__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==20) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalCsvMan.g:2227:3: rule__Add__Group_2_0_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Add__Group_2_0_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalCsvMan.g:2235:1: rule__Add__Group_2_0__3 : rule__Add__Group_2_0__3__Impl ;
    public final void rule__Add__Group_2_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2239:1: ( rule__Add__Group_2_0__3__Impl )
            // InternalCsvMan.g:2240:2: rule__Add__Group_2_0__3__Impl
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
    // InternalCsvMan.g:2246:1: rule__Add__Group_2_0__3__Impl : ( ')' ) ;
    public final void rule__Add__Group_2_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2250:1: ( ( ')' ) )
            // InternalCsvMan.g:2251:1: ( ')' )
            {
            // InternalCsvMan.g:2251:1: ( ')' )
            // InternalCsvMan.g:2252:2: ')'
            {
             before(grammarAccess.getAddAccess().getRightParenthesisKeyword_2_0_3()); 
            match(input,19,FOLLOW_2); 
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
    // InternalCsvMan.g:2262:1: rule__Add__Group_2_0_2__0 : rule__Add__Group_2_0_2__0__Impl rule__Add__Group_2_0_2__1 ;
    public final void rule__Add__Group_2_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2266:1: ( rule__Add__Group_2_0_2__0__Impl rule__Add__Group_2_0_2__1 )
            // InternalCsvMan.g:2267:2: rule__Add__Group_2_0_2__0__Impl rule__Add__Group_2_0_2__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalCsvMan.g:2274:1: rule__Add__Group_2_0_2__0__Impl : ( ',' ) ;
    public final void rule__Add__Group_2_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2278:1: ( ( ',' ) )
            // InternalCsvMan.g:2279:1: ( ',' )
            {
            // InternalCsvMan.g:2279:1: ( ',' )
            // InternalCsvMan.g:2280:2: ','
            {
             before(grammarAccess.getAddAccess().getCommaKeyword_2_0_2_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalCsvMan.g:2289:1: rule__Add__Group_2_0_2__1 : rule__Add__Group_2_0_2__1__Impl ;
    public final void rule__Add__Group_2_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2293:1: ( rule__Add__Group_2_0_2__1__Impl )
            // InternalCsvMan.g:2294:2: rule__Add__Group_2_0_2__1__Impl
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
    // InternalCsvMan.g:2300:1: rule__Add__Group_2_0_2__1__Impl : ( ( rule__Add__ValeurAssignment_2_0_2_1 ) ) ;
    public final void rule__Add__Group_2_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2304:1: ( ( ( rule__Add__ValeurAssignment_2_0_2_1 ) ) )
            // InternalCsvMan.g:2305:1: ( ( rule__Add__ValeurAssignment_2_0_2_1 ) )
            {
            // InternalCsvMan.g:2305:1: ( ( rule__Add__ValeurAssignment_2_0_2_1 ) )
            // InternalCsvMan.g:2306:2: ( rule__Add__ValeurAssignment_2_0_2_1 )
            {
             before(grammarAccess.getAddAccess().getValeurAssignment_2_0_2_1()); 
            // InternalCsvMan.g:2307:2: ( rule__Add__ValeurAssignment_2_0_2_1 )
            // InternalCsvMan.g:2307:3: rule__Add__ValeurAssignment_2_0_2_1
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
    // InternalCsvMan.g:2316:1: rule__Add__Group_2_1__0 : rule__Add__Group_2_1__0__Impl rule__Add__Group_2_1__1 ;
    public final void rule__Add__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2320:1: ( rule__Add__Group_2_1__0__Impl rule__Add__Group_2_1__1 )
            // InternalCsvMan.g:2321:2: rule__Add__Group_2_1__0__Impl rule__Add__Group_2_1__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalCsvMan.g:2328:1: rule__Add__Group_2_1__0__Impl : ( '(' ) ;
    public final void rule__Add__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2332:1: ( ( '(' ) )
            // InternalCsvMan.g:2333:1: ( '(' )
            {
            // InternalCsvMan.g:2333:1: ( '(' )
            // InternalCsvMan.g:2334:2: '('
            {
             before(grammarAccess.getAddAccess().getLeftParenthesisKeyword_2_1_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalCsvMan.g:2343:1: rule__Add__Group_2_1__1 : rule__Add__Group_2_1__1__Impl rule__Add__Group_2_1__2 ;
    public final void rule__Add__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2347:1: ( rule__Add__Group_2_1__1__Impl rule__Add__Group_2_1__2 )
            // InternalCsvMan.g:2348:2: rule__Add__Group_2_1__1__Impl rule__Add__Group_2_1__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalCsvMan.g:2355:1: rule__Add__Group_2_1__1__Impl : ( ( rule__Add__ParameterAssignment_2_1_1 ) ) ;
    public final void rule__Add__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2359:1: ( ( ( rule__Add__ParameterAssignment_2_1_1 ) ) )
            // InternalCsvMan.g:2360:1: ( ( rule__Add__ParameterAssignment_2_1_1 ) )
            {
            // InternalCsvMan.g:2360:1: ( ( rule__Add__ParameterAssignment_2_1_1 ) )
            // InternalCsvMan.g:2361:2: ( rule__Add__ParameterAssignment_2_1_1 )
            {
             before(grammarAccess.getAddAccess().getParameterAssignment_2_1_1()); 
            // InternalCsvMan.g:2362:2: ( rule__Add__ParameterAssignment_2_1_1 )
            // InternalCsvMan.g:2362:3: rule__Add__ParameterAssignment_2_1_1
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
    // InternalCsvMan.g:2370:1: rule__Add__Group_2_1__2 : rule__Add__Group_2_1__2__Impl rule__Add__Group_2_1__3 ;
    public final void rule__Add__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2374:1: ( rule__Add__Group_2_1__2__Impl rule__Add__Group_2_1__3 )
            // InternalCsvMan.g:2375:2: rule__Add__Group_2_1__2__Impl rule__Add__Group_2_1__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalCsvMan.g:2382:1: rule__Add__Group_2_1__2__Impl : ( ( rule__Add__Group_2_1_2__0 )* ) ;
    public final void rule__Add__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2386:1: ( ( ( rule__Add__Group_2_1_2__0 )* ) )
            // InternalCsvMan.g:2387:1: ( ( rule__Add__Group_2_1_2__0 )* )
            {
            // InternalCsvMan.g:2387:1: ( ( rule__Add__Group_2_1_2__0 )* )
            // InternalCsvMan.g:2388:2: ( rule__Add__Group_2_1_2__0 )*
            {
             before(grammarAccess.getAddAccess().getGroup_2_1_2()); 
            // InternalCsvMan.g:2389:2: ( rule__Add__Group_2_1_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==20) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalCsvMan.g:2389:3: rule__Add__Group_2_1_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Add__Group_2_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalCsvMan.g:2397:1: rule__Add__Group_2_1__3 : rule__Add__Group_2_1__3__Impl ;
    public final void rule__Add__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2401:1: ( rule__Add__Group_2_1__3__Impl )
            // InternalCsvMan.g:2402:2: rule__Add__Group_2_1__3__Impl
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
    // InternalCsvMan.g:2408:1: rule__Add__Group_2_1__3__Impl : ( ')' ) ;
    public final void rule__Add__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2412:1: ( ( ')' ) )
            // InternalCsvMan.g:2413:1: ( ')' )
            {
            // InternalCsvMan.g:2413:1: ( ')' )
            // InternalCsvMan.g:2414:2: ')'
            {
             before(grammarAccess.getAddAccess().getRightParenthesisKeyword_2_1_3()); 
            match(input,19,FOLLOW_2); 
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
    // InternalCsvMan.g:2424:1: rule__Add__Group_2_1_2__0 : rule__Add__Group_2_1_2__0__Impl rule__Add__Group_2_1_2__1 ;
    public final void rule__Add__Group_2_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2428:1: ( rule__Add__Group_2_1_2__0__Impl rule__Add__Group_2_1_2__1 )
            // InternalCsvMan.g:2429:2: rule__Add__Group_2_1_2__0__Impl rule__Add__Group_2_1_2__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalCsvMan.g:2436:1: rule__Add__Group_2_1_2__0__Impl : ( ',' ) ;
    public final void rule__Add__Group_2_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2440:1: ( ( ',' ) )
            // InternalCsvMan.g:2441:1: ( ',' )
            {
            // InternalCsvMan.g:2441:1: ( ',' )
            // InternalCsvMan.g:2442:2: ','
            {
             before(grammarAccess.getAddAccess().getCommaKeyword_2_1_2_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalCsvMan.g:2451:1: rule__Add__Group_2_1_2__1 : rule__Add__Group_2_1_2__1__Impl ;
    public final void rule__Add__Group_2_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2455:1: ( rule__Add__Group_2_1_2__1__Impl )
            // InternalCsvMan.g:2456:2: rule__Add__Group_2_1_2__1__Impl
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
    // InternalCsvMan.g:2462:1: rule__Add__Group_2_1_2__1__Impl : ( ( rule__Add__ParameterAssignment_2_1_2_1 ) ) ;
    public final void rule__Add__Group_2_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2466:1: ( ( ( rule__Add__ParameterAssignment_2_1_2_1 ) ) )
            // InternalCsvMan.g:2467:1: ( ( rule__Add__ParameterAssignment_2_1_2_1 ) )
            {
            // InternalCsvMan.g:2467:1: ( ( rule__Add__ParameterAssignment_2_1_2_1 ) )
            // InternalCsvMan.g:2468:2: ( rule__Add__ParameterAssignment_2_1_2_1 )
            {
             before(grammarAccess.getAddAccess().getParameterAssignment_2_1_2_1()); 
            // InternalCsvMan.g:2469:2: ( rule__Add__ParameterAssignment_2_1_2_1 )
            // InternalCsvMan.g:2469:3: rule__Add__ParameterAssignment_2_1_2_1
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
    // InternalCsvMan.g:2478:1: rule__Join__Group__0 : rule__Join__Group__0__Impl rule__Join__Group__1 ;
    public final void rule__Join__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2482:1: ( rule__Join__Group__0__Impl rule__Join__Group__1 )
            // InternalCsvMan.g:2483:2: rule__Join__Group__0__Impl rule__Join__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalCsvMan.g:2490:1: rule__Join__Group__0__Impl : ( () ) ;
    public final void rule__Join__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2494:1: ( ( () ) )
            // InternalCsvMan.g:2495:1: ( () )
            {
            // InternalCsvMan.g:2495:1: ( () )
            // InternalCsvMan.g:2496:2: ()
            {
             before(grammarAccess.getJoinAccess().getJoinAction_0()); 
            // InternalCsvMan.g:2497:2: ()
            // InternalCsvMan.g:2497:3: 
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
    // InternalCsvMan.g:2505:1: rule__Join__Group__1 : rule__Join__Group__1__Impl rule__Join__Group__2 ;
    public final void rule__Join__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2509:1: ( rule__Join__Group__1__Impl rule__Join__Group__2 )
            // InternalCsvMan.g:2510:2: rule__Join__Group__1__Impl rule__Join__Group__2
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
    // InternalCsvMan.g:2517:1: rule__Join__Group__1__Impl : ( 'join' ) ;
    public final void rule__Join__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2521:1: ( ( 'join' ) )
            // InternalCsvMan.g:2522:1: ( 'join' )
            {
            // InternalCsvMan.g:2522:1: ( 'join' )
            // InternalCsvMan.g:2523:2: 'join'
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
    // InternalCsvMan.g:2532:1: rule__Join__Group__2 : rule__Join__Group__2__Impl rule__Join__Group__3 ;
    public final void rule__Join__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2536:1: ( rule__Join__Group__2__Impl rule__Join__Group__3 )
            // InternalCsvMan.g:2537:2: rule__Join__Group__2__Impl rule__Join__Group__3
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
    // InternalCsvMan.g:2544:1: rule__Join__Group__2__Impl : ( ( rule__Join__Table1Assignment_2 ) ) ;
    public final void rule__Join__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2548:1: ( ( ( rule__Join__Table1Assignment_2 ) ) )
            // InternalCsvMan.g:2549:1: ( ( rule__Join__Table1Assignment_2 ) )
            {
            // InternalCsvMan.g:2549:1: ( ( rule__Join__Table1Assignment_2 ) )
            // InternalCsvMan.g:2550:2: ( rule__Join__Table1Assignment_2 )
            {
             before(grammarAccess.getJoinAccess().getTable1Assignment_2()); 
            // InternalCsvMan.g:2551:2: ( rule__Join__Table1Assignment_2 )
            // InternalCsvMan.g:2551:3: rule__Join__Table1Assignment_2
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
    // InternalCsvMan.g:2559:1: rule__Join__Group__3 : rule__Join__Group__3__Impl rule__Join__Group__4 ;
    public final void rule__Join__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2563:1: ( rule__Join__Group__3__Impl rule__Join__Group__4 )
            // InternalCsvMan.g:2564:2: rule__Join__Group__3__Impl rule__Join__Group__4
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
    // InternalCsvMan.g:2571:1: rule__Join__Group__3__Impl : ( ( rule__Join__Table2Assignment_3 ) ) ;
    public final void rule__Join__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2575:1: ( ( ( rule__Join__Table2Assignment_3 ) ) )
            // InternalCsvMan.g:2576:1: ( ( rule__Join__Table2Assignment_3 ) )
            {
            // InternalCsvMan.g:2576:1: ( ( rule__Join__Table2Assignment_3 ) )
            // InternalCsvMan.g:2577:2: ( rule__Join__Table2Assignment_3 )
            {
             before(grammarAccess.getJoinAccess().getTable2Assignment_3()); 
            // InternalCsvMan.g:2578:2: ( rule__Join__Table2Assignment_3 )
            // InternalCsvMan.g:2578:3: rule__Join__Table2Assignment_3
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
    // InternalCsvMan.g:2586:1: rule__Join__Group__4 : rule__Join__Group__4__Impl rule__Join__Group__5 ;
    public final void rule__Join__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2590:1: ( rule__Join__Group__4__Impl rule__Join__Group__5 )
            // InternalCsvMan.g:2591:2: rule__Join__Group__4__Impl rule__Join__Group__5
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
    // InternalCsvMan.g:2598:1: rule__Join__Group__4__Impl : ( 'in' ) ;
    public final void rule__Join__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2602:1: ( ( 'in' ) )
            // InternalCsvMan.g:2603:1: ( 'in' )
            {
            // InternalCsvMan.g:2603:1: ( 'in' )
            // InternalCsvMan.g:2604:2: 'in'
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
    // InternalCsvMan.g:2613:1: rule__Join__Group__5 : rule__Join__Group__5__Impl rule__Join__Group__6 ;
    public final void rule__Join__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2617:1: ( rule__Join__Group__5__Impl rule__Join__Group__6 )
            // InternalCsvMan.g:2618:2: rule__Join__Group__5__Impl rule__Join__Group__6
            {
            pushFollow(FOLLOW_6);
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
    // InternalCsvMan.g:2625:1: rule__Join__Group__5__Impl : ( ( rule__Join__Table3Assignment_5 ) ) ;
    public final void rule__Join__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2629:1: ( ( ( rule__Join__Table3Assignment_5 ) ) )
            // InternalCsvMan.g:2630:1: ( ( rule__Join__Table3Assignment_5 ) )
            {
            // InternalCsvMan.g:2630:1: ( ( rule__Join__Table3Assignment_5 ) )
            // InternalCsvMan.g:2631:2: ( rule__Join__Table3Assignment_5 )
            {
             before(grammarAccess.getJoinAccess().getTable3Assignment_5()); 
            // InternalCsvMan.g:2632:2: ( rule__Join__Table3Assignment_5 )
            // InternalCsvMan.g:2632:3: rule__Join__Table3Assignment_5
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
    // InternalCsvMan.g:2640:1: rule__Join__Group__6 : rule__Join__Group__6__Impl ;
    public final void rule__Join__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2644:1: ( rule__Join__Group__6__Impl )
            // InternalCsvMan.g:2645:2: rule__Join__Group__6__Impl
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
    // InternalCsvMan.g:2651:1: rule__Join__Group__6__Impl : ( RULE_NL ) ;
    public final void rule__Join__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2655:1: ( ( RULE_NL ) )
            // InternalCsvMan.g:2656:1: ( RULE_NL )
            {
            // InternalCsvMan.g:2656:1: ( RULE_NL )
            // InternalCsvMan.g:2657:2: RULE_NL
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
    // InternalCsvMan.g:2667:1: rule__Delete__Group__0 : rule__Delete__Group__0__Impl rule__Delete__Group__1 ;
    public final void rule__Delete__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2671:1: ( rule__Delete__Group__0__Impl rule__Delete__Group__1 )
            // InternalCsvMan.g:2672:2: rule__Delete__Group__0__Impl rule__Delete__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalCsvMan.g:2679:1: rule__Delete__Group__0__Impl : ( () ) ;
    public final void rule__Delete__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2683:1: ( ( () ) )
            // InternalCsvMan.g:2684:1: ( () )
            {
            // InternalCsvMan.g:2684:1: ( () )
            // InternalCsvMan.g:2685:2: ()
            {
             before(grammarAccess.getDeleteAccess().getDeleteAction_0()); 
            // InternalCsvMan.g:2686:2: ()
            // InternalCsvMan.g:2686:3: 
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
    // InternalCsvMan.g:2694:1: rule__Delete__Group__1 : rule__Delete__Group__1__Impl rule__Delete__Group__2 ;
    public final void rule__Delete__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2698:1: ( rule__Delete__Group__1__Impl rule__Delete__Group__2 )
            // InternalCsvMan.g:2699:2: rule__Delete__Group__1__Impl rule__Delete__Group__2
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
    // InternalCsvMan.g:2706:1: rule__Delete__Group__1__Impl : ( 'delete' ) ;
    public final void rule__Delete__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2710:1: ( ( 'delete' ) )
            // InternalCsvMan.g:2711:1: ( 'delete' )
            {
            // InternalCsvMan.g:2711:1: ( 'delete' )
            // InternalCsvMan.g:2712:2: 'delete'
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
    // InternalCsvMan.g:2721:1: rule__Delete__Group__2 : rule__Delete__Group__2__Impl rule__Delete__Group__3 ;
    public final void rule__Delete__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2725:1: ( rule__Delete__Group__2__Impl rule__Delete__Group__3 )
            // InternalCsvMan.g:2726:2: rule__Delete__Group__2__Impl rule__Delete__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalCsvMan.g:2733:1: rule__Delete__Group__2__Impl : ( ( rule__Delete__TableAssignment_2 ) ) ;
    public final void rule__Delete__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2737:1: ( ( ( rule__Delete__TableAssignment_2 ) ) )
            // InternalCsvMan.g:2738:1: ( ( rule__Delete__TableAssignment_2 ) )
            {
            // InternalCsvMan.g:2738:1: ( ( rule__Delete__TableAssignment_2 ) )
            // InternalCsvMan.g:2739:2: ( rule__Delete__TableAssignment_2 )
            {
             before(grammarAccess.getDeleteAccess().getTableAssignment_2()); 
            // InternalCsvMan.g:2740:2: ( rule__Delete__TableAssignment_2 )
            // InternalCsvMan.g:2740:3: rule__Delete__TableAssignment_2
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
    // InternalCsvMan.g:2748:1: rule__Delete__Group__3 : rule__Delete__Group__3__Impl rule__Delete__Group__4 ;
    public final void rule__Delete__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2752:1: ( rule__Delete__Group__3__Impl rule__Delete__Group__4 )
            // InternalCsvMan.g:2753:2: rule__Delete__Group__3__Impl rule__Delete__Group__4
            {
            pushFollow(FOLLOW_23);
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
    // InternalCsvMan.g:2760:1: rule__Delete__Group__3__Impl : ( ( rule__Delete__WhereAssignment_3 )? ) ;
    public final void rule__Delete__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2764:1: ( ( ( rule__Delete__WhereAssignment_3 )? ) )
            // InternalCsvMan.g:2765:1: ( ( rule__Delete__WhereAssignment_3 )? )
            {
            // InternalCsvMan.g:2765:1: ( ( rule__Delete__WhereAssignment_3 )? )
            // InternalCsvMan.g:2766:2: ( rule__Delete__WhereAssignment_3 )?
            {
             before(grammarAccess.getDeleteAccess().getWhereAssignment_3()); 
            // InternalCsvMan.g:2767:2: ( rule__Delete__WhereAssignment_3 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalCsvMan.g:2767:3: rule__Delete__WhereAssignment_3
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
    // InternalCsvMan.g:2775:1: rule__Delete__Group__4 : rule__Delete__Group__4__Impl ;
    public final void rule__Delete__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2779:1: ( rule__Delete__Group__4__Impl )
            // InternalCsvMan.g:2780:2: rule__Delete__Group__4__Impl
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
    // InternalCsvMan.g:2786:1: rule__Delete__Group__4__Impl : ( RULE_NL ) ;
    public final void rule__Delete__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2790:1: ( ( RULE_NL ) )
            // InternalCsvMan.g:2791:1: ( RULE_NL )
            {
            // InternalCsvMan.g:2791:1: ( RULE_NL )
            // InternalCsvMan.g:2792:2: RULE_NL
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
    // InternalCsvMan.g:2802:1: rule__Exit__Group__0 : rule__Exit__Group__0__Impl rule__Exit__Group__1 ;
    public final void rule__Exit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2806:1: ( rule__Exit__Group__0__Impl rule__Exit__Group__1 )
            // InternalCsvMan.g:2807:2: rule__Exit__Group__0__Impl rule__Exit__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalCsvMan.g:2814:1: rule__Exit__Group__0__Impl : ( () ) ;
    public final void rule__Exit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2818:1: ( ( () ) )
            // InternalCsvMan.g:2819:1: ( () )
            {
            // InternalCsvMan.g:2819:1: ( () )
            // InternalCsvMan.g:2820:2: ()
            {
             before(grammarAccess.getExitAccess().getExitAction_0()); 
            // InternalCsvMan.g:2821:2: ()
            // InternalCsvMan.g:2821:3: 
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
    // InternalCsvMan.g:2829:1: rule__Exit__Group__1 : rule__Exit__Group__1__Impl ;
    public final void rule__Exit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2833:1: ( rule__Exit__Group__1__Impl )
            // InternalCsvMan.g:2834:2: rule__Exit__Group__1__Impl
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
    // InternalCsvMan.g:2840:1: rule__Exit__Group__1__Impl : ( 'exit' ) ;
    public final void rule__Exit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2844:1: ( ( 'exit' ) )
            // InternalCsvMan.g:2845:1: ( 'exit' )
            {
            // InternalCsvMan.g:2845:1: ( 'exit' )
            // InternalCsvMan.g:2846:2: 'exit'
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
    // InternalCsvMan.g:2856:1: rule__Where__Group__0 : rule__Where__Group__0__Impl rule__Where__Group__1 ;
    public final void rule__Where__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2860:1: ( rule__Where__Group__0__Impl rule__Where__Group__1 )
            // InternalCsvMan.g:2861:2: rule__Where__Group__0__Impl rule__Where__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalCsvMan.g:2868:1: rule__Where__Group__0__Impl : ( () ) ;
    public final void rule__Where__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2872:1: ( ( () ) )
            // InternalCsvMan.g:2873:1: ( () )
            {
            // InternalCsvMan.g:2873:1: ( () )
            // InternalCsvMan.g:2874:2: ()
            {
             before(grammarAccess.getWhereAccess().getWhereAction_0()); 
            // InternalCsvMan.g:2875:2: ()
            // InternalCsvMan.g:2875:3: 
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
    // InternalCsvMan.g:2883:1: rule__Where__Group__1 : rule__Where__Group__1__Impl rule__Where__Group__2 ;
    public final void rule__Where__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2887:1: ( rule__Where__Group__1__Impl rule__Where__Group__2 )
            // InternalCsvMan.g:2888:2: rule__Where__Group__1__Impl rule__Where__Group__2
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
    // InternalCsvMan.g:2895:1: rule__Where__Group__1__Impl : ( 'where' ) ;
    public final void rule__Where__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2899:1: ( ( 'where' ) )
            // InternalCsvMan.g:2900:1: ( 'where' )
            {
            // InternalCsvMan.g:2900:1: ( 'where' )
            // InternalCsvMan.g:2901:2: 'where'
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
    // InternalCsvMan.g:2910:1: rule__Where__Group__2 : rule__Where__Group__2__Impl rule__Where__Group__3 ;
    public final void rule__Where__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2914:1: ( rule__Where__Group__2__Impl rule__Where__Group__3 )
            // InternalCsvMan.g:2915:2: rule__Where__Group__2__Impl rule__Where__Group__3
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
    // InternalCsvMan.g:2922:1: rule__Where__Group__2__Impl : ( ( rule__Where__ConditionAssignment_2 ) ) ;
    public final void rule__Where__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2926:1: ( ( ( rule__Where__ConditionAssignment_2 ) ) )
            // InternalCsvMan.g:2927:1: ( ( rule__Where__ConditionAssignment_2 ) )
            {
            // InternalCsvMan.g:2927:1: ( ( rule__Where__ConditionAssignment_2 ) )
            // InternalCsvMan.g:2928:2: ( rule__Where__ConditionAssignment_2 )
            {
             before(grammarAccess.getWhereAccess().getConditionAssignment_2()); 
            // InternalCsvMan.g:2929:2: ( rule__Where__ConditionAssignment_2 )
            // InternalCsvMan.g:2929:3: rule__Where__ConditionAssignment_2
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
    // InternalCsvMan.g:2937:1: rule__Where__Group__3 : rule__Where__Group__3__Impl ;
    public final void rule__Where__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2941:1: ( rule__Where__Group__3__Impl )
            // InternalCsvMan.g:2942:2: rule__Where__Group__3__Impl
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
    // InternalCsvMan.g:2948:1: rule__Where__Group__3__Impl : ( ( rule__Where__Group_3__0 )* ) ;
    public final void rule__Where__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2952:1: ( ( ( rule__Where__Group_3__0 )* ) )
            // InternalCsvMan.g:2953:1: ( ( rule__Where__Group_3__0 )* )
            {
            // InternalCsvMan.g:2953:1: ( ( rule__Where__Group_3__0 )* )
            // InternalCsvMan.g:2954:2: ( rule__Where__Group_3__0 )*
            {
             before(grammarAccess.getWhereAccess().getGroup_3()); 
            // InternalCsvMan.g:2955:2: ( rule__Where__Group_3__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==20) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalCsvMan.g:2955:3: rule__Where__Group_3__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Where__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalCsvMan.g:2964:1: rule__Where__Group_3__0 : rule__Where__Group_3__0__Impl rule__Where__Group_3__1 ;
    public final void rule__Where__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2968:1: ( rule__Where__Group_3__0__Impl rule__Where__Group_3__1 )
            // InternalCsvMan.g:2969:2: rule__Where__Group_3__0__Impl rule__Where__Group_3__1
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
    // InternalCsvMan.g:2976:1: rule__Where__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Where__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2980:1: ( ( ',' ) )
            // InternalCsvMan.g:2981:1: ( ',' )
            {
            // InternalCsvMan.g:2981:1: ( ',' )
            // InternalCsvMan.g:2982:2: ','
            {
             before(grammarAccess.getWhereAccess().getCommaKeyword_3_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalCsvMan.g:2991:1: rule__Where__Group_3__1 : rule__Where__Group_3__1__Impl ;
    public final void rule__Where__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:2995:1: ( rule__Where__Group_3__1__Impl )
            // InternalCsvMan.g:2996:2: rule__Where__Group_3__1__Impl
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
    // InternalCsvMan.g:3002:1: rule__Where__Group_3__1__Impl : ( ( rule__Where__ConditionAssignment_3_1 ) ) ;
    public final void rule__Where__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3006:1: ( ( ( rule__Where__ConditionAssignment_3_1 ) ) )
            // InternalCsvMan.g:3007:1: ( ( rule__Where__ConditionAssignment_3_1 ) )
            {
            // InternalCsvMan.g:3007:1: ( ( rule__Where__ConditionAssignment_3_1 ) )
            // InternalCsvMan.g:3008:2: ( rule__Where__ConditionAssignment_3_1 )
            {
             before(grammarAccess.getWhereAccess().getConditionAssignment_3_1()); 
            // InternalCsvMan.g:3009:2: ( rule__Where__ConditionAssignment_3_1 )
            // InternalCsvMan.g:3009:3: rule__Where__ConditionAssignment_3_1
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
    // InternalCsvMan.g:3018:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3022:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalCsvMan.g:3023:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
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
    // InternalCsvMan.g:3030:1: rule__Condition__Group__0__Impl : ( () ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3034:1: ( ( () ) )
            // InternalCsvMan.g:3035:1: ( () )
            {
            // InternalCsvMan.g:3035:1: ( () )
            // InternalCsvMan.g:3036:2: ()
            {
             before(grammarAccess.getConditionAccess().getConditionAction_0()); 
            // InternalCsvMan.g:3037:2: ()
            // InternalCsvMan.g:3037:3: 
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
    // InternalCsvMan.g:3045:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl rule__Condition__Group__2 ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3049:1: ( rule__Condition__Group__1__Impl rule__Condition__Group__2 )
            // InternalCsvMan.g:3050:2: rule__Condition__Group__1__Impl rule__Condition__Group__2
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
    // InternalCsvMan.g:3057:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__AtributAssignment_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3061:1: ( ( ( rule__Condition__AtributAssignment_1 ) ) )
            // InternalCsvMan.g:3062:1: ( ( rule__Condition__AtributAssignment_1 ) )
            {
            // InternalCsvMan.g:3062:1: ( ( rule__Condition__AtributAssignment_1 ) )
            // InternalCsvMan.g:3063:2: ( rule__Condition__AtributAssignment_1 )
            {
             before(grammarAccess.getConditionAccess().getAtributAssignment_1()); 
            // InternalCsvMan.g:3064:2: ( rule__Condition__AtributAssignment_1 )
            // InternalCsvMan.g:3064:3: rule__Condition__AtributAssignment_1
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
    // InternalCsvMan.g:3072:1: rule__Condition__Group__2 : rule__Condition__Group__2__Impl rule__Condition__Group__3 ;
    public final void rule__Condition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3076:1: ( rule__Condition__Group__2__Impl rule__Condition__Group__3 )
            // InternalCsvMan.g:3077:2: rule__Condition__Group__2__Impl rule__Condition__Group__3
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
    // InternalCsvMan.g:3084:1: rule__Condition__Group__2__Impl : ( ( rule__Condition__Alternatives_2 ) ) ;
    public final void rule__Condition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3088:1: ( ( ( rule__Condition__Alternatives_2 ) ) )
            // InternalCsvMan.g:3089:1: ( ( rule__Condition__Alternatives_2 ) )
            {
            // InternalCsvMan.g:3089:1: ( ( rule__Condition__Alternatives_2 ) )
            // InternalCsvMan.g:3090:2: ( rule__Condition__Alternatives_2 )
            {
             before(grammarAccess.getConditionAccess().getAlternatives_2()); 
            // InternalCsvMan.g:3091:2: ( rule__Condition__Alternatives_2 )
            // InternalCsvMan.g:3091:3: rule__Condition__Alternatives_2
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
    // InternalCsvMan.g:3099:1: rule__Condition__Group__3 : rule__Condition__Group__3__Impl ;
    public final void rule__Condition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3103:1: ( rule__Condition__Group__3__Impl )
            // InternalCsvMan.g:3104:2: rule__Condition__Group__3__Impl
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
    // InternalCsvMan.g:3110:1: rule__Condition__Group__3__Impl : ( ( rule__Condition__ValeurAssignment_3 ) ) ;
    public final void rule__Condition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3114:1: ( ( ( rule__Condition__ValeurAssignment_3 ) ) )
            // InternalCsvMan.g:3115:1: ( ( rule__Condition__ValeurAssignment_3 ) )
            {
            // InternalCsvMan.g:3115:1: ( ( rule__Condition__ValeurAssignment_3 ) )
            // InternalCsvMan.g:3116:2: ( rule__Condition__ValeurAssignment_3 )
            {
             before(grammarAccess.getConditionAccess().getValeurAssignment_3()); 
            // InternalCsvMan.g:3117:2: ( rule__Condition__ValeurAssignment_3 )
            // InternalCsvMan.g:3117:3: rule__Condition__ValeurAssignment_3
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
    // InternalCsvMan.g:3126:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3130:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalCsvMan.g:3131:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
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
    // InternalCsvMan.g:3138:1: rule__Parameter__Group__0__Impl : ( () ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3142:1: ( ( () ) )
            // InternalCsvMan.g:3143:1: ( () )
            {
            // InternalCsvMan.g:3143:1: ( () )
            // InternalCsvMan.g:3144:2: ()
            {
             before(grammarAccess.getParameterAccess().getParameterAction_0()); 
            // InternalCsvMan.g:3145:2: ()
            // InternalCsvMan.g:3145:3: 
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
    // InternalCsvMan.g:3153:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3157:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalCsvMan.g:3158:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
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
    // InternalCsvMan.g:3165:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__ColonneAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3169:1: ( ( ( rule__Parameter__ColonneAssignment_1 ) ) )
            // InternalCsvMan.g:3170:1: ( ( rule__Parameter__ColonneAssignment_1 ) )
            {
            // InternalCsvMan.g:3170:1: ( ( rule__Parameter__ColonneAssignment_1 ) )
            // InternalCsvMan.g:3171:2: ( rule__Parameter__ColonneAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getColonneAssignment_1()); 
            // InternalCsvMan.g:3172:2: ( rule__Parameter__ColonneAssignment_1 )
            // InternalCsvMan.g:3172:3: rule__Parameter__ColonneAssignment_1
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
    // InternalCsvMan.g:3180:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3184:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // InternalCsvMan.g:3185:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
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
    // InternalCsvMan.g:3192:1: rule__Parameter__Group__2__Impl : ( '=' ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3196:1: ( ( '=' ) )
            // InternalCsvMan.g:3197:1: ( '=' )
            {
            // InternalCsvMan.g:3197:1: ( '=' )
            // InternalCsvMan.g:3198:2: '='
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
    // InternalCsvMan.g:3207:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3211:1: ( rule__Parameter__Group__3__Impl )
            // InternalCsvMan.g:3212:2: rule__Parameter__Group__3__Impl
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
    // InternalCsvMan.g:3218:1: rule__Parameter__Group__3__Impl : ( ( rule__Parameter__ValueAssignment_3 ) ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3222:1: ( ( ( rule__Parameter__ValueAssignment_3 ) ) )
            // InternalCsvMan.g:3223:1: ( ( rule__Parameter__ValueAssignment_3 ) )
            {
            // InternalCsvMan.g:3223:1: ( ( rule__Parameter__ValueAssignment_3 ) )
            // InternalCsvMan.g:3224:2: ( rule__Parameter__ValueAssignment_3 )
            {
             before(grammarAccess.getParameterAccess().getValueAssignment_3()); 
            // InternalCsvMan.g:3225:2: ( rule__Parameter__ValueAssignment_3 )
            // InternalCsvMan.g:3225:3: rule__Parameter__ValueAssignment_3
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
    // InternalCsvMan.g:3234:1: rule__Program__InstructionAssignment_1 : ( ruleInstruction ) ;
    public final void rule__Program__InstructionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3238:1: ( ( ruleInstruction ) )
            // InternalCsvMan.g:3239:2: ( ruleInstruction )
            {
            // InternalCsvMan.g:3239:2: ( ruleInstruction )
            // InternalCsvMan.g:3240:3: ruleInstruction
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


    // $ANTLR start "rule__Remove__TableAssignment_2"
    // InternalCsvMan.g:3249:1: rule__Remove__TableAssignment_2 : ( ruleEString ) ;
    public final void rule__Remove__TableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3253:1: ( ( ruleEString ) )
            // InternalCsvMan.g:3254:2: ( ruleEString )
            {
            // InternalCsvMan.g:3254:2: ( ruleEString )
            // InternalCsvMan.g:3255:3: ruleEString
            {
             before(grammarAccess.getRemoveAccess().getTableEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRemoveAccess().getTableEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Remove__TableAssignment_2"


    // $ANTLR start "rule__Copy__AliasAssignment_2"
    // InternalCsvMan.g:3264:1: rule__Copy__AliasAssignment_2 : ( ruleEString ) ;
    public final void rule__Copy__AliasAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3268:1: ( ( ruleEString ) )
            // InternalCsvMan.g:3269:2: ( ruleEString )
            {
            // InternalCsvMan.g:3269:2: ( ruleEString )
            // InternalCsvMan.g:3270:3: ruleEString
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
    // InternalCsvMan.g:3279:1: rule__Copy__TableAssignment_4 : ( ruleEString ) ;
    public final void rule__Copy__TableAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3283:1: ( ( ruleEString ) )
            // InternalCsvMan.g:3284:2: ( ruleEString )
            {
            // InternalCsvMan.g:3284:2: ( ruleEString )
            // InternalCsvMan.g:3285:3: ruleEString
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
    // InternalCsvMan.g:3294:1: rule__Create__TableAssignment_2 : ( ruleEString ) ;
    public final void rule__Create__TableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3298:1: ( ( ruleEString ) )
            // InternalCsvMan.g:3299:2: ( ruleEString )
            {
            // InternalCsvMan.g:3299:2: ( ruleEString )
            // InternalCsvMan.g:3300:3: ruleEString
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
    // InternalCsvMan.g:3309:1: rule__Create__ColonneAssignment_4 : ( ruleEString ) ;
    public final void rule__Create__ColonneAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3313:1: ( ( ruleEString ) )
            // InternalCsvMan.g:3314:2: ( ruleEString )
            {
            // InternalCsvMan.g:3314:2: ( ruleEString )
            // InternalCsvMan.g:3315:3: ruleEString
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
    // InternalCsvMan.g:3324:1: rule__Create__ColonneAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Create__ColonneAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3328:1: ( ( ruleEString ) )
            // InternalCsvMan.g:3329:2: ( ruleEString )
            {
            // InternalCsvMan.g:3329:2: ( ruleEString )
            // InternalCsvMan.g:3330:3: ruleEString
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
    // InternalCsvMan.g:3339:1: rule__Load__TableAssignment_2 : ( ruleEString ) ;
    public final void rule__Load__TableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3343:1: ( ( ruleEString ) )
            // InternalCsvMan.g:3344:2: ( ruleEString )
            {
            // InternalCsvMan.g:3344:2: ( ruleEString )
            // InternalCsvMan.g:3345:3: ruleEString
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
    // InternalCsvMan.g:3354:1: rule__Load__AliasAssignment_4 : ( ruleEString ) ;
    public final void rule__Load__AliasAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3358:1: ( ( ruleEString ) )
            // InternalCsvMan.g:3359:2: ( ruleEString )
            {
            // InternalCsvMan.g:3359:2: ( ruleEString )
            // InternalCsvMan.g:3360:3: ruleEString
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
    // InternalCsvMan.g:3369:1: rule__Show__TableAssignment_2 : ( ruleEString ) ;
    public final void rule__Show__TableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3373:1: ( ( ruleEString ) )
            // InternalCsvMan.g:3374:2: ( ruleEString )
            {
            // InternalCsvMan.g:3374:2: ( ruleEString )
            // InternalCsvMan.g:3375:3: ruleEString
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
    // InternalCsvMan.g:3384:1: rule__Show__ColonneAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Show__ColonneAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3388:1: ( ( ruleEString ) )
            // InternalCsvMan.g:3389:2: ( ruleEString )
            {
            // InternalCsvMan.g:3389:2: ( ruleEString )
            // InternalCsvMan.g:3390:3: ruleEString
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
    // InternalCsvMan.g:3399:1: rule__Show__ColonneAssignment_3_2_1 : ( ruleEString ) ;
    public final void rule__Show__ColonneAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3403:1: ( ( ruleEString ) )
            // InternalCsvMan.g:3404:2: ( ruleEString )
            {
            // InternalCsvMan.g:3404:2: ( ruleEString )
            // InternalCsvMan.g:3405:3: ruleEString
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
    // InternalCsvMan.g:3414:1: rule__Show__WhereAssignment_4 : ( ruleWhere ) ;
    public final void rule__Show__WhereAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3418:1: ( ( ruleWhere ) )
            // InternalCsvMan.g:3419:2: ( ruleWhere )
            {
            // InternalCsvMan.g:3419:2: ( ruleWhere )
            // InternalCsvMan.g:3420:3: ruleWhere
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
    // InternalCsvMan.g:3429:1: rule__Update__TableAssignment_2 : ( ruleEString ) ;
    public final void rule__Update__TableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3433:1: ( ( ruleEString ) )
            // InternalCsvMan.g:3434:2: ( ruleEString )
            {
            // InternalCsvMan.g:3434:2: ( ruleEString )
            // InternalCsvMan.g:3435:3: ruleEString
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
    // InternalCsvMan.g:3444:1: rule__Update__ParameterAssignment_4 : ( ruleParameter ) ;
    public final void rule__Update__ParameterAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3448:1: ( ( ruleParameter ) )
            // InternalCsvMan.g:3449:2: ( ruleParameter )
            {
            // InternalCsvMan.g:3449:2: ( ruleParameter )
            // InternalCsvMan.g:3450:3: ruleParameter
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
    // InternalCsvMan.g:3459:1: rule__Update__ParameterAssignment_5_1 : ( ruleParameter ) ;
    public final void rule__Update__ParameterAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3463:1: ( ( ruleParameter ) )
            // InternalCsvMan.g:3464:2: ( ruleParameter )
            {
            // InternalCsvMan.g:3464:2: ( ruleParameter )
            // InternalCsvMan.g:3465:3: ruleParameter
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
    // InternalCsvMan.g:3474:1: rule__Update__WhereAssignment_6 : ( ruleWhere ) ;
    public final void rule__Update__WhereAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3478:1: ( ( ruleWhere ) )
            // InternalCsvMan.g:3479:2: ( ruleWhere )
            {
            // InternalCsvMan.g:3479:2: ( ruleWhere )
            // InternalCsvMan.g:3480:3: ruleWhere
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
    // InternalCsvMan.g:3489:1: rule__Add__ValeurAssignment_2_0_1 : ( ruleEString ) ;
    public final void rule__Add__ValeurAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3493:1: ( ( ruleEString ) )
            // InternalCsvMan.g:3494:2: ( ruleEString )
            {
            // InternalCsvMan.g:3494:2: ( ruleEString )
            // InternalCsvMan.g:3495:3: ruleEString
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
    // InternalCsvMan.g:3504:1: rule__Add__ValeurAssignment_2_0_2_1 : ( ruleEString ) ;
    public final void rule__Add__ValeurAssignment_2_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3508:1: ( ( ruleEString ) )
            // InternalCsvMan.g:3509:2: ( ruleEString )
            {
            // InternalCsvMan.g:3509:2: ( ruleEString )
            // InternalCsvMan.g:3510:3: ruleEString
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
    // InternalCsvMan.g:3519:1: rule__Add__ParameterAssignment_2_1_1 : ( ruleParameter ) ;
    public final void rule__Add__ParameterAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3523:1: ( ( ruleParameter ) )
            // InternalCsvMan.g:3524:2: ( ruleParameter )
            {
            // InternalCsvMan.g:3524:2: ( ruleParameter )
            // InternalCsvMan.g:3525:3: ruleParameter
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
    // InternalCsvMan.g:3534:1: rule__Add__ParameterAssignment_2_1_2_1 : ( ruleParameter ) ;
    public final void rule__Add__ParameterAssignment_2_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3538:1: ( ( ruleParameter ) )
            // InternalCsvMan.g:3539:2: ( ruleParameter )
            {
            // InternalCsvMan.g:3539:2: ( ruleParameter )
            // InternalCsvMan.g:3540:3: ruleParameter
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


    // $ANTLR start "rule__Add__TableAssignment_4"
    // InternalCsvMan.g:3549:1: rule__Add__TableAssignment_4 : ( ruleEString ) ;
    public final void rule__Add__TableAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3553:1: ( ( ruleEString ) )
            // InternalCsvMan.g:3554:2: ( ruleEString )
            {
            // InternalCsvMan.g:3554:2: ( ruleEString )
            // InternalCsvMan.g:3555:3: ruleEString
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
    // InternalCsvMan.g:3564:1: rule__Join__Table1Assignment_2 : ( ruleEString ) ;
    public final void rule__Join__Table1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3568:1: ( ( ruleEString ) )
            // InternalCsvMan.g:3569:2: ( ruleEString )
            {
            // InternalCsvMan.g:3569:2: ( ruleEString )
            // InternalCsvMan.g:3570:3: ruleEString
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
    // InternalCsvMan.g:3579:1: rule__Join__Table2Assignment_3 : ( ruleEString ) ;
    public final void rule__Join__Table2Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3583:1: ( ( ruleEString ) )
            // InternalCsvMan.g:3584:2: ( ruleEString )
            {
            // InternalCsvMan.g:3584:2: ( ruleEString )
            // InternalCsvMan.g:3585:3: ruleEString
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
    // InternalCsvMan.g:3594:1: rule__Join__Table3Assignment_5 : ( ruleEString ) ;
    public final void rule__Join__Table3Assignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3598:1: ( ( ruleEString ) )
            // InternalCsvMan.g:3599:2: ( ruleEString )
            {
            // InternalCsvMan.g:3599:2: ( ruleEString )
            // InternalCsvMan.g:3600:3: ruleEString
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
    // InternalCsvMan.g:3609:1: rule__Delete__TableAssignment_2 : ( ruleEString ) ;
    public final void rule__Delete__TableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3613:1: ( ( ruleEString ) )
            // InternalCsvMan.g:3614:2: ( ruleEString )
            {
            // InternalCsvMan.g:3614:2: ( ruleEString )
            // InternalCsvMan.g:3615:3: ruleEString
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
    // InternalCsvMan.g:3624:1: rule__Delete__WhereAssignment_3 : ( ruleWhere ) ;
    public final void rule__Delete__WhereAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3628:1: ( ( ruleWhere ) )
            // InternalCsvMan.g:3629:2: ( ruleWhere )
            {
            // InternalCsvMan.g:3629:2: ( ruleWhere )
            // InternalCsvMan.g:3630:3: ruleWhere
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
    // InternalCsvMan.g:3639:1: rule__Where__ConditionAssignment_2 : ( ruleCondition ) ;
    public final void rule__Where__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3643:1: ( ( ruleCondition ) )
            // InternalCsvMan.g:3644:2: ( ruleCondition )
            {
            // InternalCsvMan.g:3644:2: ( ruleCondition )
            // InternalCsvMan.g:3645:3: ruleCondition
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
    // InternalCsvMan.g:3654:1: rule__Where__ConditionAssignment_3_1 : ( ruleCondition ) ;
    public final void rule__Where__ConditionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3658:1: ( ( ruleCondition ) )
            // InternalCsvMan.g:3659:2: ( ruleCondition )
            {
            // InternalCsvMan.g:3659:2: ( ruleCondition )
            // InternalCsvMan.g:3660:3: ruleCondition
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
    // InternalCsvMan.g:3669:1: rule__Condition__AtributAssignment_1 : ( ruleEString ) ;
    public final void rule__Condition__AtributAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3673:1: ( ( ruleEString ) )
            // InternalCsvMan.g:3674:2: ( ruleEString )
            {
            // InternalCsvMan.g:3674:2: ( ruleEString )
            // InternalCsvMan.g:3675:3: ruleEString
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
    // InternalCsvMan.g:3684:1: rule__Condition__ValeurAssignment_3 : ( ruleEString ) ;
    public final void rule__Condition__ValeurAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3688:1: ( ( ruleEString ) )
            // InternalCsvMan.g:3689:2: ( ruleEString )
            {
            // InternalCsvMan.g:3689:2: ( ruleEString )
            // InternalCsvMan.g:3690:3: ruleEString
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
    // InternalCsvMan.g:3699:1: rule__Parameter__ColonneAssignment_1 : ( ruleEString ) ;
    public final void rule__Parameter__ColonneAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3703:1: ( ( ruleEString ) )
            // InternalCsvMan.g:3704:2: ( ruleEString )
            {
            // InternalCsvMan.g:3704:2: ( ruleEString )
            // InternalCsvMan.g:3705:3: ruleEString
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
    // InternalCsvMan.g:3714:1: rule__Parameter__ValueAssignment_3 : ( ruleEString ) ;
    public final void rule__Parameter__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCsvMan.g:3718:1: ( ( ruleEString ) )
            // InternalCsvMan.g:3719:2: ( ruleEString )
            {
            // InternalCsvMan.g:3719:2: ( ruleEString )
            // InternalCsvMan.g:3720:3: ruleEString
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000003DA2C060L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000003DA2C062L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000380L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000040040400L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040100400L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000400L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000002000L});

}