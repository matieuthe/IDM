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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCsvManParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'create'", "'as'", "'load'", "'show'", "'update'", "'set'", "'add'", "'in'", "'join'", "'delete'", "'exit'", "'where'", "'<'", "'='", "'>'", "'>='", "'<='"
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




    // $ANTLR start "entryRuleProgram"
    // InternalCsvMan.g:64:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalCsvMan.g:64:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalCsvMan.g:65:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalCsvMan.g:71:1: ruleProgram returns [EObject current=null] : ( () ( (lv_instruction_1_0= ruleInstruction ) )* ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_instruction_1_0 = null;



        	enterRule();

        try {
            // InternalCsvMan.g:77:2: ( ( () ( (lv_instruction_1_0= ruleInstruction ) )* ) )
            // InternalCsvMan.g:78:2: ( () ( (lv_instruction_1_0= ruleInstruction ) )* )
            {
            // InternalCsvMan.g:78:2: ( () ( (lv_instruction_1_0= ruleInstruction ) )* )
            // InternalCsvMan.g:79:3: () ( (lv_instruction_1_0= ruleInstruction ) )*
            {
            // InternalCsvMan.g:79:3: ()
            // InternalCsvMan.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProgramAccess().getProgramAction_0(),
            					current);
            			

            }

            // InternalCsvMan.g:86:3: ( (lv_instruction_1_0= ruleInstruction ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||(LA1_0>=13 && LA1_0<=15)||LA1_0==17||(LA1_0>=19 && LA1_0<=21)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCsvMan.g:87:4: (lv_instruction_1_0= ruleInstruction )
            	    {
            	    // InternalCsvMan.g:87:4: (lv_instruction_1_0= ruleInstruction )
            	    // InternalCsvMan.g:88:5: lv_instruction_1_0= ruleInstruction
            	    {

            	    					newCompositeNode(grammarAccess.getProgramAccess().getInstructionInstructionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_instruction_1_0=ruleInstruction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"instruction",
            	    						lv_instruction_1_0,
            	    						"org.xtext.example.csvmanl.CsvMan.Instruction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleInstruction"
    // InternalCsvMan.g:109:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // InternalCsvMan.g:109:52: (iv_ruleInstruction= ruleInstruction EOF )
            // InternalCsvMan.g:110:2: iv_ruleInstruction= ruleInstruction EOF
            {
             newCompositeNode(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstruction=ruleInstruction();

            state._fsp--;

             current =iv_ruleInstruction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // InternalCsvMan.g:116:1: ruleInstruction returns [EObject current=null] : (this_Create_0= ruleCreate | this_Load_1= ruleLoad | this_Show_2= ruleShow | this_Update_3= ruleUpdate | this_Add_4= ruleAdd | this_Join_5= ruleJoin | this_Delete_6= ruleDelete | this_Exit_7= ruleExit ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        EObject this_Create_0 = null;

        EObject this_Load_1 = null;

        EObject this_Show_2 = null;

        EObject this_Update_3 = null;

        EObject this_Add_4 = null;

        EObject this_Join_5 = null;

        EObject this_Delete_6 = null;

        EObject this_Exit_7 = null;



        	enterRule();

        try {
            // InternalCsvMan.g:122:2: ( (this_Create_0= ruleCreate | this_Load_1= ruleLoad | this_Show_2= ruleShow | this_Update_3= ruleUpdate | this_Add_4= ruleAdd | this_Join_5= ruleJoin | this_Delete_6= ruleDelete | this_Exit_7= ruleExit ) )
            // InternalCsvMan.g:123:2: (this_Create_0= ruleCreate | this_Load_1= ruleLoad | this_Show_2= ruleShow | this_Update_3= ruleUpdate | this_Add_4= ruleAdd | this_Join_5= ruleJoin | this_Delete_6= ruleDelete | this_Exit_7= ruleExit )
            {
            // InternalCsvMan.g:123:2: (this_Create_0= ruleCreate | this_Load_1= ruleLoad | this_Show_2= ruleShow | this_Update_3= ruleUpdate | this_Add_4= ruleAdd | this_Join_5= ruleJoin | this_Delete_6= ruleDelete | this_Exit_7= ruleExit )
            int alt2=8;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 13:
                {
                alt2=2;
                }
                break;
            case 14:
                {
                alt2=3;
                }
                break;
            case 15:
                {
                alt2=4;
                }
                break;
            case 17:
                {
                alt2=5;
                }
                break;
            case 19:
                {
                alt2=6;
                }
                break;
            case 20:
                {
                alt2=7;
                }
                break;
            case 21:
                {
                alt2=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalCsvMan.g:124:3: this_Create_0= ruleCreate
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getCreateParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Create_0=ruleCreate();

                    state._fsp--;


                    			current = this_Create_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCsvMan.g:133:3: this_Load_1= ruleLoad
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getLoadParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Load_1=ruleLoad();

                    state._fsp--;


                    			current = this_Load_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalCsvMan.g:142:3: this_Show_2= ruleShow
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getShowParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Show_2=ruleShow();

                    state._fsp--;


                    			current = this_Show_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalCsvMan.g:151:3: this_Update_3= ruleUpdate
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getUpdateParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Update_3=ruleUpdate();

                    state._fsp--;


                    			current = this_Update_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalCsvMan.g:160:3: this_Add_4= ruleAdd
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getAddParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Add_4=ruleAdd();

                    state._fsp--;


                    			current = this_Add_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalCsvMan.g:169:3: this_Join_5= ruleJoin
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getJoinParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Join_5=ruleJoin();

                    state._fsp--;


                    			current = this_Join_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalCsvMan.g:178:3: this_Delete_6= ruleDelete
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getDeleteParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Delete_6=ruleDelete();

                    state._fsp--;


                    			current = this_Delete_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalCsvMan.g:187:3: this_Exit_7= ruleExit
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getExitParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Exit_7=ruleExit();

                    state._fsp--;


                    			current = this_Exit_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleCreate"
    // InternalCsvMan.g:199:1: entryRuleCreate returns [EObject current=null] : iv_ruleCreate= ruleCreate EOF ;
    public final EObject entryRuleCreate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreate = null;


        try {
            // InternalCsvMan.g:199:47: (iv_ruleCreate= ruleCreate EOF )
            // InternalCsvMan.g:200:2: iv_ruleCreate= ruleCreate EOF
            {
             newCompositeNode(grammarAccess.getCreateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCreate=ruleCreate();

            state._fsp--;

             current =iv_ruleCreate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCreate"


    // $ANTLR start "ruleCreate"
    // InternalCsvMan.g:206:1: ruleCreate returns [EObject current=null] : ( () otherlv_1= 'create' ( (lv_table_2_0= ruleEString ) ) otherlv_3= 'as' ( (lv_alias_4_0= ruleEString ) ) ) ;
    public final EObject ruleCreate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_table_2_0 = null;

        AntlrDatatypeRuleToken lv_alias_4_0 = null;



        	enterRule();

        try {
            // InternalCsvMan.g:212:2: ( ( () otherlv_1= 'create' ( (lv_table_2_0= ruleEString ) ) otherlv_3= 'as' ( (lv_alias_4_0= ruleEString ) ) ) )
            // InternalCsvMan.g:213:2: ( () otherlv_1= 'create' ( (lv_table_2_0= ruleEString ) ) otherlv_3= 'as' ( (lv_alias_4_0= ruleEString ) ) )
            {
            // InternalCsvMan.g:213:2: ( () otherlv_1= 'create' ( (lv_table_2_0= ruleEString ) ) otherlv_3= 'as' ( (lv_alias_4_0= ruleEString ) ) )
            // InternalCsvMan.g:214:3: () otherlv_1= 'create' ( (lv_table_2_0= ruleEString ) ) otherlv_3= 'as' ( (lv_alias_4_0= ruleEString ) )
            {
            // InternalCsvMan.g:214:3: ()
            // InternalCsvMan.g:215:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCreateAccess().getCreateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getCreateAccess().getCreateKeyword_1());
            		
            // InternalCsvMan.g:225:3: ( (lv_table_2_0= ruleEString ) )
            // InternalCsvMan.g:226:4: (lv_table_2_0= ruleEString )
            {
            // InternalCsvMan.g:226:4: (lv_table_2_0= ruleEString )
            // InternalCsvMan.g:227:5: lv_table_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCreateAccess().getTableEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_table_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCreateRule());
            					}
            					set(
            						current,
            						"table",
            						lv_table_2_0,
            						"org.xtext.example.csvmanl.CsvMan.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getCreateAccess().getAsKeyword_3());
            		
            // InternalCsvMan.g:248:3: ( (lv_alias_4_0= ruleEString ) )
            // InternalCsvMan.g:249:4: (lv_alias_4_0= ruleEString )
            {
            // InternalCsvMan.g:249:4: (lv_alias_4_0= ruleEString )
            // InternalCsvMan.g:250:5: lv_alias_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCreateAccess().getAliasEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_alias_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCreateRule());
            					}
            					set(
            						current,
            						"alias",
            						lv_alias_4_0,
            						"org.xtext.example.csvmanl.CsvMan.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCreate"


    // $ANTLR start "entryRuleLoad"
    // InternalCsvMan.g:271:1: entryRuleLoad returns [EObject current=null] : iv_ruleLoad= ruleLoad EOF ;
    public final EObject entryRuleLoad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoad = null;


        try {
            // InternalCsvMan.g:271:45: (iv_ruleLoad= ruleLoad EOF )
            // InternalCsvMan.g:272:2: iv_ruleLoad= ruleLoad EOF
            {
             newCompositeNode(grammarAccess.getLoadRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoad=ruleLoad();

            state._fsp--;

             current =iv_ruleLoad; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLoad"


    // $ANTLR start "ruleLoad"
    // InternalCsvMan.g:278:1: ruleLoad returns [EObject current=null] : ( () otherlv_1= 'load' ( (lv_table_2_0= ruleEString ) ) otherlv_3= 'as' ( (lv_alias_4_0= ruleEString ) ) ) ;
    public final EObject ruleLoad() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_table_2_0 = null;

        AntlrDatatypeRuleToken lv_alias_4_0 = null;



        	enterRule();

        try {
            // InternalCsvMan.g:284:2: ( ( () otherlv_1= 'load' ( (lv_table_2_0= ruleEString ) ) otherlv_3= 'as' ( (lv_alias_4_0= ruleEString ) ) ) )
            // InternalCsvMan.g:285:2: ( () otherlv_1= 'load' ( (lv_table_2_0= ruleEString ) ) otherlv_3= 'as' ( (lv_alias_4_0= ruleEString ) ) )
            {
            // InternalCsvMan.g:285:2: ( () otherlv_1= 'load' ( (lv_table_2_0= ruleEString ) ) otherlv_3= 'as' ( (lv_alias_4_0= ruleEString ) ) )
            // InternalCsvMan.g:286:3: () otherlv_1= 'load' ( (lv_table_2_0= ruleEString ) ) otherlv_3= 'as' ( (lv_alias_4_0= ruleEString ) )
            {
            // InternalCsvMan.g:286:3: ()
            // InternalCsvMan.g:287:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLoadAccess().getLoadAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getLoadAccess().getLoadKeyword_1());
            		
            // InternalCsvMan.g:297:3: ( (lv_table_2_0= ruleEString ) )
            // InternalCsvMan.g:298:4: (lv_table_2_0= ruleEString )
            {
            // InternalCsvMan.g:298:4: (lv_table_2_0= ruleEString )
            // InternalCsvMan.g:299:5: lv_table_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLoadAccess().getTableEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_table_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLoadRule());
            					}
            					set(
            						current,
            						"table",
            						lv_table_2_0,
            						"org.xtext.example.csvmanl.CsvMan.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getLoadAccess().getAsKeyword_3());
            		
            // InternalCsvMan.g:320:3: ( (lv_alias_4_0= ruleEString ) )
            // InternalCsvMan.g:321:4: (lv_alias_4_0= ruleEString )
            {
            // InternalCsvMan.g:321:4: (lv_alias_4_0= ruleEString )
            // InternalCsvMan.g:322:5: lv_alias_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLoadAccess().getAliasEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_alias_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLoadRule());
            					}
            					set(
            						current,
            						"alias",
            						lv_alias_4_0,
            						"org.xtext.example.csvmanl.CsvMan.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLoad"


    // $ANTLR start "entryRuleShow"
    // InternalCsvMan.g:343:1: entryRuleShow returns [EObject current=null] : iv_ruleShow= ruleShow EOF ;
    public final EObject entryRuleShow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShow = null;


        try {
            // InternalCsvMan.g:343:45: (iv_ruleShow= ruleShow EOF )
            // InternalCsvMan.g:344:2: iv_ruleShow= ruleShow EOF
            {
             newCompositeNode(grammarAccess.getShowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleShow=ruleShow();

            state._fsp--;

             current =iv_ruleShow; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShow"


    // $ANTLR start "ruleShow"
    // InternalCsvMan.g:350:1: ruleShow returns [EObject current=null] : ( () otherlv_1= 'show' ( (lv_table_2_0= ruleEString ) ) ( (lv_where_3_0= ruleWhere ) )? ) ;
    public final EObject ruleShow() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_table_2_0 = null;

        EObject lv_where_3_0 = null;



        	enterRule();

        try {
            // InternalCsvMan.g:356:2: ( ( () otherlv_1= 'show' ( (lv_table_2_0= ruleEString ) ) ( (lv_where_3_0= ruleWhere ) )? ) )
            // InternalCsvMan.g:357:2: ( () otherlv_1= 'show' ( (lv_table_2_0= ruleEString ) ) ( (lv_where_3_0= ruleWhere ) )? )
            {
            // InternalCsvMan.g:357:2: ( () otherlv_1= 'show' ( (lv_table_2_0= ruleEString ) ) ( (lv_where_3_0= ruleWhere ) )? )
            // InternalCsvMan.g:358:3: () otherlv_1= 'show' ( (lv_table_2_0= ruleEString ) ) ( (lv_where_3_0= ruleWhere ) )?
            {
            // InternalCsvMan.g:358:3: ()
            // InternalCsvMan.g:359:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getShowAccess().getShowAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getShowAccess().getShowKeyword_1());
            		
            // InternalCsvMan.g:369:3: ( (lv_table_2_0= ruleEString ) )
            // InternalCsvMan.g:370:4: (lv_table_2_0= ruleEString )
            {
            // InternalCsvMan.g:370:4: (lv_table_2_0= ruleEString )
            // InternalCsvMan.g:371:5: lv_table_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getShowAccess().getTableEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_table_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getShowRule());
            					}
            					set(
            						current,
            						"table",
            						lv_table_2_0,
            						"org.xtext.example.csvmanl.CsvMan.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCsvMan.g:388:3: ( (lv_where_3_0= ruleWhere ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==22) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalCsvMan.g:389:4: (lv_where_3_0= ruleWhere )
                    {
                    // InternalCsvMan.g:389:4: (lv_where_3_0= ruleWhere )
                    // InternalCsvMan.g:390:5: lv_where_3_0= ruleWhere
                    {

                    					newCompositeNode(grammarAccess.getShowAccess().getWhereWhereParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_where_3_0=ruleWhere();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getShowRule());
                    					}
                    					set(
                    						current,
                    						"where",
                    						lv_where_3_0,
                    						"org.xtext.example.csvmanl.CsvMan.Where");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShow"


    // $ANTLR start "entryRuleUpdate"
    // InternalCsvMan.g:411:1: entryRuleUpdate returns [EObject current=null] : iv_ruleUpdate= ruleUpdate EOF ;
    public final EObject entryRuleUpdate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdate = null;


        try {
            // InternalCsvMan.g:411:47: (iv_ruleUpdate= ruleUpdate EOF )
            // InternalCsvMan.g:412:2: iv_ruleUpdate= ruleUpdate EOF
            {
             newCompositeNode(grammarAccess.getUpdateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUpdate=ruleUpdate();

            state._fsp--;

             current =iv_ruleUpdate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUpdate"


    // $ANTLR start "ruleUpdate"
    // InternalCsvMan.g:418:1: ruleUpdate returns [EObject current=null] : ( () otherlv_1= 'update' ( (lv_table_2_0= ruleEString ) ) otherlv_3= 'set' ( (lv_parameters_4_0= ruleEString ) ) ( (lv_where_5_0= ruleWhere ) )? ) ;
    public final EObject ruleUpdate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_table_2_0 = null;

        AntlrDatatypeRuleToken lv_parameters_4_0 = null;

        EObject lv_where_5_0 = null;



        	enterRule();

        try {
            // InternalCsvMan.g:424:2: ( ( () otherlv_1= 'update' ( (lv_table_2_0= ruleEString ) ) otherlv_3= 'set' ( (lv_parameters_4_0= ruleEString ) ) ( (lv_where_5_0= ruleWhere ) )? ) )
            // InternalCsvMan.g:425:2: ( () otherlv_1= 'update' ( (lv_table_2_0= ruleEString ) ) otherlv_3= 'set' ( (lv_parameters_4_0= ruleEString ) ) ( (lv_where_5_0= ruleWhere ) )? )
            {
            // InternalCsvMan.g:425:2: ( () otherlv_1= 'update' ( (lv_table_2_0= ruleEString ) ) otherlv_3= 'set' ( (lv_parameters_4_0= ruleEString ) ) ( (lv_where_5_0= ruleWhere ) )? )
            // InternalCsvMan.g:426:3: () otherlv_1= 'update' ( (lv_table_2_0= ruleEString ) ) otherlv_3= 'set' ( (lv_parameters_4_0= ruleEString ) ) ( (lv_where_5_0= ruleWhere ) )?
            {
            // InternalCsvMan.g:426:3: ()
            // InternalCsvMan.g:427:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUpdateAccess().getUpdateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getUpdateAccess().getUpdateKeyword_1());
            		
            // InternalCsvMan.g:437:3: ( (lv_table_2_0= ruleEString ) )
            // InternalCsvMan.g:438:4: (lv_table_2_0= ruleEString )
            {
            // InternalCsvMan.g:438:4: (lv_table_2_0= ruleEString )
            // InternalCsvMan.g:439:5: lv_table_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getUpdateAccess().getTableEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_table_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUpdateRule());
            					}
            					set(
            						current,
            						"table",
            						lv_table_2_0,
            						"org.xtext.example.csvmanl.CsvMan.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getUpdateAccess().getSetKeyword_3());
            		
            // InternalCsvMan.g:460:3: ( (lv_parameters_4_0= ruleEString ) )
            // InternalCsvMan.g:461:4: (lv_parameters_4_0= ruleEString )
            {
            // InternalCsvMan.g:461:4: (lv_parameters_4_0= ruleEString )
            // InternalCsvMan.g:462:5: lv_parameters_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getUpdateAccess().getParametersEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_parameters_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUpdateRule());
            					}
            					set(
            						current,
            						"parameters",
            						lv_parameters_4_0,
            						"org.xtext.example.csvmanl.CsvMan.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCsvMan.g:479:3: ( (lv_where_5_0= ruleWhere ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==22) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalCsvMan.g:480:4: (lv_where_5_0= ruleWhere )
                    {
                    // InternalCsvMan.g:480:4: (lv_where_5_0= ruleWhere )
                    // InternalCsvMan.g:481:5: lv_where_5_0= ruleWhere
                    {

                    					newCompositeNode(grammarAccess.getUpdateAccess().getWhereWhereParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_where_5_0=ruleWhere();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUpdateRule());
                    					}
                    					set(
                    						current,
                    						"where",
                    						lv_where_5_0,
                    						"org.xtext.example.csvmanl.CsvMan.Where");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUpdate"


    // $ANTLR start "entryRuleAdd"
    // InternalCsvMan.g:502:1: entryRuleAdd returns [EObject current=null] : iv_ruleAdd= ruleAdd EOF ;
    public final EObject entryRuleAdd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdd = null;


        try {
            // InternalCsvMan.g:502:44: (iv_ruleAdd= ruleAdd EOF )
            // InternalCsvMan.g:503:2: iv_ruleAdd= ruleAdd EOF
            {
             newCompositeNode(grammarAccess.getAddRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdd=ruleAdd();

            state._fsp--;

             current =iv_ruleAdd; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdd"


    // $ANTLR start "ruleAdd"
    // InternalCsvMan.g:509:1: ruleAdd returns [EObject current=null] : ( () otherlv_1= 'add' ( (lv_tuple_2_0= ruleEString ) ) otherlv_3= 'in' ( (lv_table_4_0= ruleEString ) ) ) ;
    public final EObject ruleAdd() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_tuple_2_0 = null;

        AntlrDatatypeRuleToken lv_table_4_0 = null;



        	enterRule();

        try {
            // InternalCsvMan.g:515:2: ( ( () otherlv_1= 'add' ( (lv_tuple_2_0= ruleEString ) ) otherlv_3= 'in' ( (lv_table_4_0= ruleEString ) ) ) )
            // InternalCsvMan.g:516:2: ( () otherlv_1= 'add' ( (lv_tuple_2_0= ruleEString ) ) otherlv_3= 'in' ( (lv_table_4_0= ruleEString ) ) )
            {
            // InternalCsvMan.g:516:2: ( () otherlv_1= 'add' ( (lv_tuple_2_0= ruleEString ) ) otherlv_3= 'in' ( (lv_table_4_0= ruleEString ) ) )
            // InternalCsvMan.g:517:3: () otherlv_1= 'add' ( (lv_tuple_2_0= ruleEString ) ) otherlv_3= 'in' ( (lv_table_4_0= ruleEString ) )
            {
            // InternalCsvMan.g:517:3: ()
            // InternalCsvMan.g:518:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAddAccess().getAddAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAddAccess().getAddKeyword_1());
            		
            // InternalCsvMan.g:528:3: ( (lv_tuple_2_0= ruleEString ) )
            // InternalCsvMan.g:529:4: (lv_tuple_2_0= ruleEString )
            {
            // InternalCsvMan.g:529:4: (lv_tuple_2_0= ruleEString )
            // InternalCsvMan.g:530:5: lv_tuple_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAddAccess().getTupleEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_tuple_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddRule());
            					}
            					set(
            						current,
            						"tuple",
            						lv_tuple_2_0,
            						"org.xtext.example.csvmanl.CsvMan.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getAddAccess().getInKeyword_3());
            		
            // InternalCsvMan.g:551:3: ( (lv_table_4_0= ruleEString ) )
            // InternalCsvMan.g:552:4: (lv_table_4_0= ruleEString )
            {
            // InternalCsvMan.g:552:4: (lv_table_4_0= ruleEString )
            // InternalCsvMan.g:553:5: lv_table_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAddAccess().getTableEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_table_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddRule());
            					}
            					set(
            						current,
            						"table",
            						lv_table_4_0,
            						"org.xtext.example.csvmanl.CsvMan.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdd"


    // $ANTLR start "entryRuleJoin"
    // InternalCsvMan.g:574:1: entryRuleJoin returns [EObject current=null] : iv_ruleJoin= ruleJoin EOF ;
    public final EObject entryRuleJoin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoin = null;


        try {
            // InternalCsvMan.g:574:45: (iv_ruleJoin= ruleJoin EOF )
            // InternalCsvMan.g:575:2: iv_ruleJoin= ruleJoin EOF
            {
             newCompositeNode(grammarAccess.getJoinRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJoin=ruleJoin();

            state._fsp--;

             current =iv_ruleJoin; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJoin"


    // $ANTLR start "ruleJoin"
    // InternalCsvMan.g:581:1: ruleJoin returns [EObject current=null] : ( () otherlv_1= 'join' ( (lv_table1_2_0= ruleEString ) ) ( (lv_table2_3_0= ruleEString ) ) ) ;
    public final EObject ruleJoin() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_table1_2_0 = null;

        AntlrDatatypeRuleToken lv_table2_3_0 = null;



        	enterRule();

        try {
            // InternalCsvMan.g:587:2: ( ( () otherlv_1= 'join' ( (lv_table1_2_0= ruleEString ) ) ( (lv_table2_3_0= ruleEString ) ) ) )
            // InternalCsvMan.g:588:2: ( () otherlv_1= 'join' ( (lv_table1_2_0= ruleEString ) ) ( (lv_table2_3_0= ruleEString ) ) )
            {
            // InternalCsvMan.g:588:2: ( () otherlv_1= 'join' ( (lv_table1_2_0= ruleEString ) ) ( (lv_table2_3_0= ruleEString ) ) )
            // InternalCsvMan.g:589:3: () otherlv_1= 'join' ( (lv_table1_2_0= ruleEString ) ) ( (lv_table2_3_0= ruleEString ) )
            {
            // InternalCsvMan.g:589:3: ()
            // InternalCsvMan.g:590:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getJoinAccess().getJoinAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getJoinAccess().getJoinKeyword_1());
            		
            // InternalCsvMan.g:600:3: ( (lv_table1_2_0= ruleEString ) )
            // InternalCsvMan.g:601:4: (lv_table1_2_0= ruleEString )
            {
            // InternalCsvMan.g:601:4: (lv_table1_2_0= ruleEString )
            // InternalCsvMan.g:602:5: lv_table1_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getJoinAccess().getTable1EStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_table1_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJoinRule());
            					}
            					set(
            						current,
            						"table1",
            						lv_table1_2_0,
            						"org.xtext.example.csvmanl.CsvMan.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCsvMan.g:619:3: ( (lv_table2_3_0= ruleEString ) )
            // InternalCsvMan.g:620:4: (lv_table2_3_0= ruleEString )
            {
            // InternalCsvMan.g:620:4: (lv_table2_3_0= ruleEString )
            // InternalCsvMan.g:621:5: lv_table2_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getJoinAccess().getTable2EStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_table2_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJoinRule());
            					}
            					set(
            						current,
            						"table2",
            						lv_table2_3_0,
            						"org.xtext.example.csvmanl.CsvMan.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJoin"


    // $ANTLR start "entryRuleDelete"
    // InternalCsvMan.g:642:1: entryRuleDelete returns [EObject current=null] : iv_ruleDelete= ruleDelete EOF ;
    public final EObject entryRuleDelete() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelete = null;


        try {
            // InternalCsvMan.g:642:47: (iv_ruleDelete= ruleDelete EOF )
            // InternalCsvMan.g:643:2: iv_ruleDelete= ruleDelete EOF
            {
             newCompositeNode(grammarAccess.getDeleteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDelete=ruleDelete();

            state._fsp--;

             current =iv_ruleDelete; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDelete"


    // $ANTLR start "ruleDelete"
    // InternalCsvMan.g:649:1: ruleDelete returns [EObject current=null] : ( () otherlv_1= 'delete' ( (lv_table_2_0= ruleEString ) ) ( (lv_where_3_0= ruleWhere ) )? ) ;
    public final EObject ruleDelete() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_table_2_0 = null;

        EObject lv_where_3_0 = null;



        	enterRule();

        try {
            // InternalCsvMan.g:655:2: ( ( () otherlv_1= 'delete' ( (lv_table_2_0= ruleEString ) ) ( (lv_where_3_0= ruleWhere ) )? ) )
            // InternalCsvMan.g:656:2: ( () otherlv_1= 'delete' ( (lv_table_2_0= ruleEString ) ) ( (lv_where_3_0= ruleWhere ) )? )
            {
            // InternalCsvMan.g:656:2: ( () otherlv_1= 'delete' ( (lv_table_2_0= ruleEString ) ) ( (lv_where_3_0= ruleWhere ) )? )
            // InternalCsvMan.g:657:3: () otherlv_1= 'delete' ( (lv_table_2_0= ruleEString ) ) ( (lv_where_3_0= ruleWhere ) )?
            {
            // InternalCsvMan.g:657:3: ()
            // InternalCsvMan.g:658:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDeleteAccess().getDeleteAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getDeleteAccess().getDeleteKeyword_1());
            		
            // InternalCsvMan.g:668:3: ( (lv_table_2_0= ruleEString ) )
            // InternalCsvMan.g:669:4: (lv_table_2_0= ruleEString )
            {
            // InternalCsvMan.g:669:4: (lv_table_2_0= ruleEString )
            // InternalCsvMan.g:670:5: lv_table_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDeleteAccess().getTableEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_table_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeleteRule());
            					}
            					set(
            						current,
            						"table",
            						lv_table_2_0,
            						"org.xtext.example.csvmanl.CsvMan.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCsvMan.g:687:3: ( (lv_where_3_0= ruleWhere ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalCsvMan.g:688:4: (lv_where_3_0= ruleWhere )
                    {
                    // InternalCsvMan.g:688:4: (lv_where_3_0= ruleWhere )
                    // InternalCsvMan.g:689:5: lv_where_3_0= ruleWhere
                    {

                    					newCompositeNode(grammarAccess.getDeleteAccess().getWhereWhereParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_where_3_0=ruleWhere();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDeleteRule());
                    					}
                    					set(
                    						current,
                    						"where",
                    						lv_where_3_0,
                    						"org.xtext.example.csvmanl.CsvMan.Where");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDelete"


    // $ANTLR start "entryRuleExit"
    // InternalCsvMan.g:710:1: entryRuleExit returns [EObject current=null] : iv_ruleExit= ruleExit EOF ;
    public final EObject entryRuleExit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExit = null;


        try {
            // InternalCsvMan.g:710:45: (iv_ruleExit= ruleExit EOF )
            // InternalCsvMan.g:711:2: iv_ruleExit= ruleExit EOF
            {
             newCompositeNode(grammarAccess.getExitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExit=ruleExit();

            state._fsp--;

             current =iv_ruleExit; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExit"


    // $ANTLR start "ruleExit"
    // InternalCsvMan.g:717:1: ruleExit returns [EObject current=null] : ( () otherlv_1= 'exit' ) ;
    public final EObject ruleExit() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalCsvMan.g:723:2: ( ( () otherlv_1= 'exit' ) )
            // InternalCsvMan.g:724:2: ( () otherlv_1= 'exit' )
            {
            // InternalCsvMan.g:724:2: ( () otherlv_1= 'exit' )
            // InternalCsvMan.g:725:3: () otherlv_1= 'exit'
            {
            // InternalCsvMan.g:725:3: ()
            // InternalCsvMan.g:726:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExitAccess().getExitAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getExitAccess().getExitKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExit"


    // $ANTLR start "entryRuleWhere"
    // InternalCsvMan.g:740:1: entryRuleWhere returns [EObject current=null] : iv_ruleWhere= ruleWhere EOF ;
    public final EObject entryRuleWhere() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhere = null;


        try {
            // InternalCsvMan.g:740:46: (iv_ruleWhere= ruleWhere EOF )
            // InternalCsvMan.g:741:2: iv_ruleWhere= ruleWhere EOF
            {
             newCompositeNode(grammarAccess.getWhereRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhere=ruleWhere();

            state._fsp--;

             current =iv_ruleWhere; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhere"


    // $ANTLR start "ruleWhere"
    // InternalCsvMan.g:747:1: ruleWhere returns [EObject current=null] : ( () otherlv_1= 'where' ( (lv_condition_2_0= ruleCondition ) )+ ) ;
    public final EObject ruleWhere() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_condition_2_0 = null;



        	enterRule();

        try {
            // InternalCsvMan.g:753:2: ( ( () otherlv_1= 'where' ( (lv_condition_2_0= ruleCondition ) )+ ) )
            // InternalCsvMan.g:754:2: ( () otherlv_1= 'where' ( (lv_condition_2_0= ruleCondition ) )+ )
            {
            // InternalCsvMan.g:754:2: ( () otherlv_1= 'where' ( (lv_condition_2_0= ruleCondition ) )+ )
            // InternalCsvMan.g:755:3: () otherlv_1= 'where' ( (lv_condition_2_0= ruleCondition ) )+
            {
            // InternalCsvMan.g:755:3: ()
            // InternalCsvMan.g:756:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWhereAccess().getWhereAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getWhereAccess().getWhereKeyword_1());
            		
            // InternalCsvMan.g:766:3: ( (lv_condition_2_0= ruleCondition ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_ID)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCsvMan.g:767:4: (lv_condition_2_0= ruleCondition )
            	    {
            	    // InternalCsvMan.g:767:4: (lv_condition_2_0= ruleCondition )
            	    // InternalCsvMan.g:768:5: lv_condition_2_0= ruleCondition
            	    {

            	    					newCompositeNode(grammarAccess.getWhereAccess().getConditionConditionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_condition_2_0=ruleCondition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getWhereRule());
            	    					}
            	    					add(
            	    						current,
            	    						"condition",
            	    						lv_condition_2_0,
            	    						"org.xtext.example.csvmanl.CsvMan.Condition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhere"


    // $ANTLR start "entryRuleCondition"
    // InternalCsvMan.g:789:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalCsvMan.g:789:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalCsvMan.g:790:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalCsvMan.g:796:1: ruleCondition returns [EObject current=null] : ( () ( (lv_atribut_1_0= ruleEString ) ) ( (lv_operator_2_0= ruleOperator ) ) ( (lv_valeur_3_0= ruleEString ) ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_atribut_1_0 = null;

        EObject lv_operator_2_0 = null;

        AntlrDatatypeRuleToken lv_valeur_3_0 = null;



        	enterRule();

        try {
            // InternalCsvMan.g:802:2: ( ( () ( (lv_atribut_1_0= ruleEString ) ) ( (lv_operator_2_0= ruleOperator ) ) ( (lv_valeur_3_0= ruleEString ) ) ) )
            // InternalCsvMan.g:803:2: ( () ( (lv_atribut_1_0= ruleEString ) ) ( (lv_operator_2_0= ruleOperator ) ) ( (lv_valeur_3_0= ruleEString ) ) )
            {
            // InternalCsvMan.g:803:2: ( () ( (lv_atribut_1_0= ruleEString ) ) ( (lv_operator_2_0= ruleOperator ) ) ( (lv_valeur_3_0= ruleEString ) ) )
            // InternalCsvMan.g:804:3: () ( (lv_atribut_1_0= ruleEString ) ) ( (lv_operator_2_0= ruleOperator ) ) ( (lv_valeur_3_0= ruleEString ) )
            {
            // InternalCsvMan.g:804:3: ()
            // InternalCsvMan.g:805:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConditionAccess().getConditionAction_0(),
            					current);
            			

            }

            // InternalCsvMan.g:811:3: ( (lv_atribut_1_0= ruleEString ) )
            // InternalCsvMan.g:812:4: (lv_atribut_1_0= ruleEString )
            {
            // InternalCsvMan.g:812:4: (lv_atribut_1_0= ruleEString )
            // InternalCsvMan.g:813:5: lv_atribut_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getConditionAccess().getAtributEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_atribut_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionRule());
            					}
            					set(
            						current,
            						"atribut",
            						lv_atribut_1_0,
            						"org.xtext.example.csvmanl.CsvMan.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCsvMan.g:830:3: ( (lv_operator_2_0= ruleOperator ) )
            // InternalCsvMan.g:831:4: (lv_operator_2_0= ruleOperator )
            {
            // InternalCsvMan.g:831:4: (lv_operator_2_0= ruleOperator )
            // InternalCsvMan.g:832:5: lv_operator_2_0= ruleOperator
            {

            					newCompositeNode(grammarAccess.getConditionAccess().getOperatorOperatorParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_operator_2_0=ruleOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_2_0,
            						"org.xtext.example.csvmanl.CsvMan.Operator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCsvMan.g:849:3: ( (lv_valeur_3_0= ruleEString ) )
            // InternalCsvMan.g:850:4: (lv_valeur_3_0= ruleEString )
            {
            // InternalCsvMan.g:850:4: (lv_valeur_3_0= ruleEString )
            // InternalCsvMan.g:851:5: lv_valeur_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getConditionAccess().getValeurEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_valeur_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionRule());
            					}
            					set(
            						current,
            						"valeur",
            						lv_valeur_3_0,
            						"org.xtext.example.csvmanl.CsvMan.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleOperator"
    // InternalCsvMan.g:872:1: entryRuleOperator returns [EObject current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final EObject entryRuleOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperator = null;


        try {
            // InternalCsvMan.g:872:49: (iv_ruleOperator= ruleOperator EOF )
            // InternalCsvMan.g:873:2: iv_ruleOperator= ruleOperator EOF
            {
             newCompositeNode(grammarAccess.getOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperator=ruleOperator();

            state._fsp--;

             current =iv_ruleOperator; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperator"


    // $ANTLR start "ruleOperator"
    // InternalCsvMan.g:879:1: ruleOperator returns [EObject current=null] : (otherlv_0= '<' | otherlv_1= '=' | otherlv_2= '>' | otherlv_3= '>=' | otherlv_4= '<=' ) ;
    public final EObject ruleOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalCsvMan.g:885:2: ( (otherlv_0= '<' | otherlv_1= '=' | otherlv_2= '>' | otherlv_3= '>=' | otherlv_4= '<=' ) )
            // InternalCsvMan.g:886:2: (otherlv_0= '<' | otherlv_1= '=' | otherlv_2= '>' | otherlv_3= '>=' | otherlv_4= '<=' )
            {
            // InternalCsvMan.g:886:2: (otherlv_0= '<' | otherlv_1= '=' | otherlv_2= '>' | otherlv_3= '>=' | otherlv_4= '<=' )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt7=1;
                }
                break;
            case 24:
                {
                alt7=2;
                }
                break;
            case 25:
                {
                alt7=3;
                }
                break;
            case 26:
                {
                alt7=4;
                }
                break;
            case 27:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalCsvMan.g:887:3: otherlv_0= '<'
                    {
                    otherlv_0=(Token)match(input,23,FOLLOW_2); 

                    			newLeafNode(otherlv_0, grammarAccess.getOperatorAccess().getLessThanSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCsvMan.g:892:3: otherlv_1= '='
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_2); 

                    			newLeafNode(otherlv_1, grammarAccess.getOperatorAccess().getEqualsSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalCsvMan.g:897:3: otherlv_2= '>'
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_2); 

                    			newLeafNode(otherlv_2, grammarAccess.getOperatorAccess().getGreaterThanSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalCsvMan.g:902:3: otherlv_3= '>='
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_2); 

                    			newLeafNode(otherlv_3, grammarAccess.getOperatorAccess().getGreaterThanSignEqualsSignKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalCsvMan.g:907:3: otherlv_4= '<='
                    {
                    otherlv_4=(Token)match(input,27,FOLLOW_2); 

                    			newLeafNode(otherlv_4, grammarAccess.getOperatorAccess().getLessThanSignEqualsSignKeyword_4());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperator"


    // $ANTLR start "entryRuleEString"
    // InternalCsvMan.g:915:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalCsvMan.g:915:47: (iv_ruleEString= ruleEString EOF )
            // InternalCsvMan.g:916:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalCsvMan.g:922:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalCsvMan.g:928:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalCsvMan.g:929:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalCsvMan.g:929:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalCsvMan.g:930:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCsvMan.g:938:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000003AE802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000F800000L});

}