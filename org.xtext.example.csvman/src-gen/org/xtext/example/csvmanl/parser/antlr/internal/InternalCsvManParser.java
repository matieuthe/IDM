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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NL", "RULE_OP", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_WS", "RULE_ANY_OTHER", "'create'", "'('", "','", "')'", "'load'", "'as'", "'show'", "'update'", "'set'", "'add'", "'in'", "'join'", "'delete'", "'exit'", "'where'", "'='"
    };
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=7;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_OP=5;
    public static final int RULE_ID=9;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=10;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=6;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_NL=4;
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

                if ( ((LA1_0>=RULE_ML_COMMENT && LA1_0<=RULE_SL_COMMENT)||LA1_0==13||LA1_0==17||(LA1_0>=19 && LA1_0<=20)||LA1_0==22||(LA1_0>=24 && LA1_0<=26)) ) {
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
    // InternalCsvMan.g:116:1: ruleInstruction returns [EObject current=null] : (this_Create_0= ruleCreate | this_Load_1= ruleLoad | this_Show_2= ruleShow | this_Update_3= ruleUpdate | this_Add_4= ruleAdd | this_Join_5= ruleJoin | this_Delete_6= ruleDelete | this_Exit_7= ruleExit | this_Comment_8= ruleComment ) ;
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

        EObject this_Comment_8 = null;



        	enterRule();

        try {
            // InternalCsvMan.g:122:2: ( (this_Create_0= ruleCreate | this_Load_1= ruleLoad | this_Show_2= ruleShow | this_Update_3= ruleUpdate | this_Add_4= ruleAdd | this_Join_5= ruleJoin | this_Delete_6= ruleDelete | this_Exit_7= ruleExit | this_Comment_8= ruleComment ) )
            // InternalCsvMan.g:123:2: (this_Create_0= ruleCreate | this_Load_1= ruleLoad | this_Show_2= ruleShow | this_Update_3= ruleUpdate | this_Add_4= ruleAdd | this_Join_5= ruleJoin | this_Delete_6= ruleDelete | this_Exit_7= ruleExit | this_Comment_8= ruleComment )
            {
            // InternalCsvMan.g:123:2: (this_Create_0= ruleCreate | this_Load_1= ruleLoad | this_Show_2= ruleShow | this_Update_3= ruleUpdate | this_Add_4= ruleAdd | this_Join_5= ruleJoin | this_Delete_6= ruleDelete | this_Exit_7= ruleExit | this_Comment_8= ruleComment )
            int alt2=9;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 17:
                {
                alt2=2;
                }
                break;
            case 19:
                {
                alt2=3;
                }
                break;
            case 20:
                {
                alt2=4;
                }
                break;
            case 22:
                {
                alt2=5;
                }
                break;
            case 24:
                {
                alt2=6;
                }
                break;
            case 25:
                {
                alt2=7;
                }
                break;
            case 26:
                {
                alt2=8;
                }
                break;
            case RULE_ML_COMMENT:
            case RULE_SL_COMMENT:
                {
                alt2=9;
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
                case 9 :
                    // InternalCsvMan.g:196:3: this_Comment_8= ruleComment
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getCommentParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_Comment_8=ruleComment();

                    state._fsp--;


                    			current = this_Comment_8;
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
    // InternalCsvMan.g:208:1: entryRuleCreate returns [EObject current=null] : iv_ruleCreate= ruleCreate EOF ;
    public final EObject entryRuleCreate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreate = null;


        try {
            // InternalCsvMan.g:208:47: (iv_ruleCreate= ruleCreate EOF )
            // InternalCsvMan.g:209:2: iv_ruleCreate= ruleCreate EOF
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
    // InternalCsvMan.g:215:1: ruleCreate returns [EObject current=null] : ( () otherlv_1= 'create' ( (lv_table_2_0= ruleEString ) ) otherlv_3= '(' ( (lv_colonne_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_colonne_6_0= ruleEString ) ) )* otherlv_7= ')' this_NL_8= RULE_NL ) ;
    public final EObject ruleCreate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token this_NL_8=null;
        AntlrDatatypeRuleToken lv_table_2_0 = null;

        AntlrDatatypeRuleToken lv_colonne_4_0 = null;

        AntlrDatatypeRuleToken lv_colonne_6_0 = null;



        	enterRule();

        try {
            // InternalCsvMan.g:221:2: ( ( () otherlv_1= 'create' ( (lv_table_2_0= ruleEString ) ) otherlv_3= '(' ( (lv_colonne_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_colonne_6_0= ruleEString ) ) )* otherlv_7= ')' this_NL_8= RULE_NL ) )
            // InternalCsvMan.g:222:2: ( () otherlv_1= 'create' ( (lv_table_2_0= ruleEString ) ) otherlv_3= '(' ( (lv_colonne_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_colonne_6_0= ruleEString ) ) )* otherlv_7= ')' this_NL_8= RULE_NL )
            {
            // InternalCsvMan.g:222:2: ( () otherlv_1= 'create' ( (lv_table_2_0= ruleEString ) ) otherlv_3= '(' ( (lv_colonne_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_colonne_6_0= ruleEString ) ) )* otherlv_7= ')' this_NL_8= RULE_NL )
            // InternalCsvMan.g:223:3: () otherlv_1= 'create' ( (lv_table_2_0= ruleEString ) ) otherlv_3= '(' ( (lv_colonne_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_colonne_6_0= ruleEString ) ) )* otherlv_7= ')' this_NL_8= RULE_NL
            {
            // InternalCsvMan.g:223:3: ()
            // InternalCsvMan.g:224:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCreateAccess().getCreateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getCreateAccess().getCreateKeyword_1());
            		
            // InternalCsvMan.g:234:3: ( (lv_table_2_0= ruleEString ) )
            // InternalCsvMan.g:235:4: (lv_table_2_0= ruleEString )
            {
            // InternalCsvMan.g:235:4: (lv_table_2_0= ruleEString )
            // InternalCsvMan.g:236:5: lv_table_2_0= ruleEString
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

            otherlv_3=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getCreateAccess().getLeftParenthesisKeyword_3());
            		
            // InternalCsvMan.g:257:3: ( (lv_colonne_4_0= ruleEString ) )
            // InternalCsvMan.g:258:4: (lv_colonne_4_0= ruleEString )
            {
            // InternalCsvMan.g:258:4: (lv_colonne_4_0= ruleEString )
            // InternalCsvMan.g:259:5: lv_colonne_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCreateAccess().getColonneEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_colonne_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCreateRule());
            					}
            					add(
            						current,
            						"colonne",
            						lv_colonne_4_0,
            						"org.xtext.example.csvmanl.CsvMan.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCsvMan.g:276:3: (otherlv_5= ',' ( (lv_colonne_6_0= ruleEString ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCsvMan.g:277:4: otherlv_5= ',' ( (lv_colonne_6_0= ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,15,FOLLOW_4); 

            	    				newLeafNode(otherlv_5, grammarAccess.getCreateAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalCsvMan.g:281:4: ( (lv_colonne_6_0= ruleEString ) )
            	    // InternalCsvMan.g:282:5: (lv_colonne_6_0= ruleEString )
            	    {
            	    // InternalCsvMan.g:282:5: (lv_colonne_6_0= ruleEString )
            	    // InternalCsvMan.g:283:6: lv_colonne_6_0= ruleEString
            	    {

            	    						newCompositeNode(grammarAccess.getCreateAccess().getColonneEStringParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_colonne_6_0=ruleEString();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCreateRule());
            	    						}
            	    						add(
            	    							current,
            	    							"colonne",
            	    							lv_colonne_6_0,
            	    							"org.xtext.example.csvmanl.CsvMan.EString");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_7=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getCreateAccess().getRightParenthesisKeyword_6());
            		
            this_NL_8=(Token)match(input,RULE_NL,FOLLOW_2); 

            			newLeafNode(this_NL_8, grammarAccess.getCreateAccess().getNLTerminalRuleCall_7());
            		

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
    // InternalCsvMan.g:313:1: entryRuleLoad returns [EObject current=null] : iv_ruleLoad= ruleLoad EOF ;
    public final EObject entryRuleLoad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoad = null;


        try {
            // InternalCsvMan.g:313:45: (iv_ruleLoad= ruleLoad EOF )
            // InternalCsvMan.g:314:2: iv_ruleLoad= ruleLoad EOF
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
    // InternalCsvMan.g:320:1: ruleLoad returns [EObject current=null] : ( () otherlv_1= 'load' ( (lv_table_2_0= ruleEString ) ) otherlv_3= 'as' ( (lv_alias_4_0= ruleEString ) ) this_NL_5= RULE_NL ) ;
    public final EObject ruleLoad() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token this_NL_5=null;
        AntlrDatatypeRuleToken lv_table_2_0 = null;

        AntlrDatatypeRuleToken lv_alias_4_0 = null;



        	enterRule();

        try {
            // InternalCsvMan.g:326:2: ( ( () otherlv_1= 'load' ( (lv_table_2_0= ruleEString ) ) otherlv_3= 'as' ( (lv_alias_4_0= ruleEString ) ) this_NL_5= RULE_NL ) )
            // InternalCsvMan.g:327:2: ( () otherlv_1= 'load' ( (lv_table_2_0= ruleEString ) ) otherlv_3= 'as' ( (lv_alias_4_0= ruleEString ) ) this_NL_5= RULE_NL )
            {
            // InternalCsvMan.g:327:2: ( () otherlv_1= 'load' ( (lv_table_2_0= ruleEString ) ) otherlv_3= 'as' ( (lv_alias_4_0= ruleEString ) ) this_NL_5= RULE_NL )
            // InternalCsvMan.g:328:3: () otherlv_1= 'load' ( (lv_table_2_0= ruleEString ) ) otherlv_3= 'as' ( (lv_alias_4_0= ruleEString ) ) this_NL_5= RULE_NL
            {
            // InternalCsvMan.g:328:3: ()
            // InternalCsvMan.g:329:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLoadAccess().getLoadAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getLoadAccess().getLoadKeyword_1());
            		
            // InternalCsvMan.g:339:3: ( (lv_table_2_0= ruleEString ) )
            // InternalCsvMan.g:340:4: (lv_table_2_0= ruleEString )
            {
            // InternalCsvMan.g:340:4: (lv_table_2_0= ruleEString )
            // InternalCsvMan.g:341:5: lv_table_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLoadAccess().getTableEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
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

            otherlv_3=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getLoadAccess().getAsKeyword_3());
            		
            // InternalCsvMan.g:362:3: ( (lv_alias_4_0= ruleEString ) )
            // InternalCsvMan.g:363:4: (lv_alias_4_0= ruleEString )
            {
            // InternalCsvMan.g:363:4: (lv_alias_4_0= ruleEString )
            // InternalCsvMan.g:364:5: lv_alias_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLoadAccess().getAliasEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
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

            this_NL_5=(Token)match(input,RULE_NL,FOLLOW_2); 

            			newLeafNode(this_NL_5, grammarAccess.getLoadAccess().getNLTerminalRuleCall_5());
            		

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
    // InternalCsvMan.g:389:1: entryRuleShow returns [EObject current=null] : iv_ruleShow= ruleShow EOF ;
    public final EObject entryRuleShow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShow = null;


        try {
            // InternalCsvMan.g:389:45: (iv_ruleShow= ruleShow EOF )
            // InternalCsvMan.g:390:2: iv_ruleShow= ruleShow EOF
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
    // InternalCsvMan.g:396:1: ruleShow returns [EObject current=null] : ( () otherlv_1= 'show' ( (lv_table_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_colonne_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_colonne_6_0= ruleEString ) ) )* otherlv_7= ')' )? ( (lv_where_8_0= ruleWhere ) )? this_NL_9= RULE_NL ) ;
    public final EObject ruleShow() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token this_NL_9=null;
        AntlrDatatypeRuleToken lv_table_2_0 = null;

        AntlrDatatypeRuleToken lv_colonne_4_0 = null;

        AntlrDatatypeRuleToken lv_colonne_6_0 = null;

        EObject lv_where_8_0 = null;



        	enterRule();

        try {
            // InternalCsvMan.g:402:2: ( ( () otherlv_1= 'show' ( (lv_table_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_colonne_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_colonne_6_0= ruleEString ) ) )* otherlv_7= ')' )? ( (lv_where_8_0= ruleWhere ) )? this_NL_9= RULE_NL ) )
            // InternalCsvMan.g:403:2: ( () otherlv_1= 'show' ( (lv_table_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_colonne_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_colonne_6_0= ruleEString ) ) )* otherlv_7= ')' )? ( (lv_where_8_0= ruleWhere ) )? this_NL_9= RULE_NL )
            {
            // InternalCsvMan.g:403:2: ( () otherlv_1= 'show' ( (lv_table_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_colonne_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_colonne_6_0= ruleEString ) ) )* otherlv_7= ')' )? ( (lv_where_8_0= ruleWhere ) )? this_NL_9= RULE_NL )
            // InternalCsvMan.g:404:3: () otherlv_1= 'show' ( (lv_table_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_colonne_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_colonne_6_0= ruleEString ) ) )* otherlv_7= ')' )? ( (lv_where_8_0= ruleWhere ) )? this_NL_9= RULE_NL
            {
            // InternalCsvMan.g:404:3: ()
            // InternalCsvMan.g:405:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getShowAccess().getShowAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getShowAccess().getShowKeyword_1());
            		
            // InternalCsvMan.g:415:3: ( (lv_table_2_0= ruleEString ) )
            // InternalCsvMan.g:416:4: (lv_table_2_0= ruleEString )
            {
            // InternalCsvMan.g:416:4: (lv_table_2_0= ruleEString )
            // InternalCsvMan.g:417:5: lv_table_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getShowAccess().getTableEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
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

            // InternalCsvMan.g:434:3: (otherlv_3= '(' ( (lv_colonne_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_colonne_6_0= ruleEString ) ) )* otherlv_7= ')' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalCsvMan.g:435:4: otherlv_3= '(' ( (lv_colonne_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_colonne_6_0= ruleEString ) ) )* otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getShowAccess().getLeftParenthesisKeyword_3_0());
                    			
                    // InternalCsvMan.g:439:4: ( (lv_colonne_4_0= ruleEString ) )
                    // InternalCsvMan.g:440:5: (lv_colonne_4_0= ruleEString )
                    {
                    // InternalCsvMan.g:440:5: (lv_colonne_4_0= ruleEString )
                    // InternalCsvMan.g:441:6: lv_colonne_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getShowAccess().getColonneEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_colonne_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getShowRule());
                    						}
                    						add(
                    							current,
                    							"colonne",
                    							lv_colonne_4_0,
                    							"org.xtext.example.csvmanl.CsvMan.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCsvMan.g:458:4: (otherlv_5= ',' ( (lv_colonne_6_0= ruleEString ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==15) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalCsvMan.g:459:5: otherlv_5= ',' ( (lv_colonne_6_0= ruleEString ) )
                    	    {
                    	    otherlv_5=(Token)match(input,15,FOLLOW_4); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getShowAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalCsvMan.g:463:5: ( (lv_colonne_6_0= ruleEString ) )
                    	    // InternalCsvMan.g:464:6: (lv_colonne_6_0= ruleEString )
                    	    {
                    	    // InternalCsvMan.g:464:6: (lv_colonne_6_0= ruleEString )
                    	    // InternalCsvMan.g:465:7: lv_colonne_6_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getShowAccess().getColonneEStringParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_colonne_6_0=ruleEString();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getShowRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"colonne",
                    	    								lv_colonne_6_0,
                    	    								"org.xtext.example.csvmanl.CsvMan.EString");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,16,FOLLOW_10); 

                    				newLeafNode(otherlv_7, grammarAccess.getShowAccess().getRightParenthesisKeyword_3_3());
                    			

                    }
                    break;

            }

            // InternalCsvMan.g:488:3: ( (lv_where_8_0= ruleWhere ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==27) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalCsvMan.g:489:4: (lv_where_8_0= ruleWhere )
                    {
                    // InternalCsvMan.g:489:4: (lv_where_8_0= ruleWhere )
                    // InternalCsvMan.g:490:5: lv_where_8_0= ruleWhere
                    {

                    					newCompositeNode(grammarAccess.getShowAccess().getWhereWhereParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_where_8_0=ruleWhere();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getShowRule());
                    					}
                    					set(
                    						current,
                    						"where",
                    						lv_where_8_0,
                    						"org.xtext.example.csvmanl.CsvMan.Where");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_NL_9=(Token)match(input,RULE_NL,FOLLOW_2); 

            			newLeafNode(this_NL_9, grammarAccess.getShowAccess().getNLTerminalRuleCall_5());
            		

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
    // InternalCsvMan.g:515:1: entryRuleUpdate returns [EObject current=null] : iv_ruleUpdate= ruleUpdate EOF ;
    public final EObject entryRuleUpdate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdate = null;


        try {
            // InternalCsvMan.g:515:47: (iv_ruleUpdate= ruleUpdate EOF )
            // InternalCsvMan.g:516:2: iv_ruleUpdate= ruleUpdate EOF
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
    // InternalCsvMan.g:522:1: ruleUpdate returns [EObject current=null] : ( () otherlv_1= 'update' ( (lv_table_2_0= ruleEString ) ) otherlv_3= 'set' ( (lv_parameter_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameter_6_0= ruleParameter ) ) )* ( (lv_where_7_0= ruleWhere ) )? this_NL_8= RULE_NL ) ;
    public final EObject ruleUpdate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token this_NL_8=null;
        AntlrDatatypeRuleToken lv_table_2_0 = null;

        EObject lv_parameter_4_0 = null;

        EObject lv_parameter_6_0 = null;

        EObject lv_where_7_0 = null;



        	enterRule();

        try {
            // InternalCsvMan.g:528:2: ( ( () otherlv_1= 'update' ( (lv_table_2_0= ruleEString ) ) otherlv_3= 'set' ( (lv_parameter_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameter_6_0= ruleParameter ) ) )* ( (lv_where_7_0= ruleWhere ) )? this_NL_8= RULE_NL ) )
            // InternalCsvMan.g:529:2: ( () otherlv_1= 'update' ( (lv_table_2_0= ruleEString ) ) otherlv_3= 'set' ( (lv_parameter_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameter_6_0= ruleParameter ) ) )* ( (lv_where_7_0= ruleWhere ) )? this_NL_8= RULE_NL )
            {
            // InternalCsvMan.g:529:2: ( () otherlv_1= 'update' ( (lv_table_2_0= ruleEString ) ) otherlv_3= 'set' ( (lv_parameter_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameter_6_0= ruleParameter ) ) )* ( (lv_where_7_0= ruleWhere ) )? this_NL_8= RULE_NL )
            // InternalCsvMan.g:530:3: () otherlv_1= 'update' ( (lv_table_2_0= ruleEString ) ) otherlv_3= 'set' ( (lv_parameter_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameter_6_0= ruleParameter ) ) )* ( (lv_where_7_0= ruleWhere ) )? this_NL_8= RULE_NL
            {
            // InternalCsvMan.g:530:3: ()
            // InternalCsvMan.g:531:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUpdateAccess().getUpdateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getUpdateAccess().getUpdateKeyword_1());
            		
            // InternalCsvMan.g:541:3: ( (lv_table_2_0= ruleEString ) )
            // InternalCsvMan.g:542:4: (lv_table_2_0= ruleEString )
            {
            // InternalCsvMan.g:542:4: (lv_table_2_0= ruleEString )
            // InternalCsvMan.g:543:5: lv_table_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getUpdateAccess().getTableEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
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

            otherlv_3=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getUpdateAccess().getSetKeyword_3());
            		
            // InternalCsvMan.g:564:3: ( (lv_parameter_4_0= ruleParameter ) )
            // InternalCsvMan.g:565:4: (lv_parameter_4_0= ruleParameter )
            {
            // InternalCsvMan.g:565:4: (lv_parameter_4_0= ruleParameter )
            // InternalCsvMan.g:566:5: lv_parameter_4_0= ruleParameter
            {

            					newCompositeNode(grammarAccess.getUpdateAccess().getParameterParameterParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_12);
            lv_parameter_4_0=ruleParameter();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUpdateRule());
            					}
            					add(
            						current,
            						"parameter",
            						lv_parameter_4_0,
            						"org.xtext.example.csvmanl.CsvMan.Parameter");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCsvMan.g:583:3: (otherlv_5= ',' ( (lv_parameter_6_0= ruleParameter ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalCsvMan.g:584:4: otherlv_5= ',' ( (lv_parameter_6_0= ruleParameter ) )
            	    {
            	    otherlv_5=(Token)match(input,15,FOLLOW_4); 

            	    				newLeafNode(otherlv_5, grammarAccess.getUpdateAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalCsvMan.g:588:4: ( (lv_parameter_6_0= ruleParameter ) )
            	    // InternalCsvMan.g:589:5: (lv_parameter_6_0= ruleParameter )
            	    {
            	    // InternalCsvMan.g:589:5: (lv_parameter_6_0= ruleParameter )
            	    // InternalCsvMan.g:590:6: lv_parameter_6_0= ruleParameter
            	    {

            	    						newCompositeNode(grammarAccess.getUpdateAccess().getParameterParameterParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_parameter_6_0=ruleParameter();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getUpdateRule());
            	    						}
            	    						add(
            	    							current,
            	    							"parameter",
            	    							lv_parameter_6_0,
            	    							"org.xtext.example.csvmanl.CsvMan.Parameter");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalCsvMan.g:608:3: ( (lv_where_7_0= ruleWhere ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalCsvMan.g:609:4: (lv_where_7_0= ruleWhere )
                    {
                    // InternalCsvMan.g:609:4: (lv_where_7_0= ruleWhere )
                    // InternalCsvMan.g:610:5: lv_where_7_0= ruleWhere
                    {

                    					newCompositeNode(grammarAccess.getUpdateAccess().getWhereWhereParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_where_7_0=ruleWhere();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUpdateRule());
                    					}
                    					set(
                    						current,
                    						"where",
                    						lv_where_7_0,
                    						"org.xtext.example.csvmanl.CsvMan.Where");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_NL_8=(Token)match(input,RULE_NL,FOLLOW_2); 

            			newLeafNode(this_NL_8, grammarAccess.getUpdateAccess().getNLTerminalRuleCall_7());
            		

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
    // InternalCsvMan.g:635:1: entryRuleAdd returns [EObject current=null] : iv_ruleAdd= ruleAdd EOF ;
    public final EObject entryRuleAdd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdd = null;


        try {
            // InternalCsvMan.g:635:44: (iv_ruleAdd= ruleAdd EOF )
            // InternalCsvMan.g:636:2: iv_ruleAdd= ruleAdd EOF
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
    // InternalCsvMan.g:642:1: ruleAdd returns [EObject current=null] : ( () otherlv_1= 'add' otherlv_2= '(' ( (lv_valeur_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_valeur_5_0= ruleEString ) ) )* otherlv_6= ')' otherlv_7= 'in' ( (lv_table_8_0= ruleEString ) ) this_NL_9= RULE_NL ) ;
    public final EObject ruleAdd() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token this_NL_9=null;
        AntlrDatatypeRuleToken lv_valeur_3_0 = null;

        AntlrDatatypeRuleToken lv_valeur_5_0 = null;

        AntlrDatatypeRuleToken lv_table_8_0 = null;



        	enterRule();

        try {
            // InternalCsvMan.g:648:2: ( ( () otherlv_1= 'add' otherlv_2= '(' ( (lv_valeur_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_valeur_5_0= ruleEString ) ) )* otherlv_6= ')' otherlv_7= 'in' ( (lv_table_8_0= ruleEString ) ) this_NL_9= RULE_NL ) )
            // InternalCsvMan.g:649:2: ( () otherlv_1= 'add' otherlv_2= '(' ( (lv_valeur_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_valeur_5_0= ruleEString ) ) )* otherlv_6= ')' otherlv_7= 'in' ( (lv_table_8_0= ruleEString ) ) this_NL_9= RULE_NL )
            {
            // InternalCsvMan.g:649:2: ( () otherlv_1= 'add' otherlv_2= '(' ( (lv_valeur_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_valeur_5_0= ruleEString ) ) )* otherlv_6= ')' otherlv_7= 'in' ( (lv_table_8_0= ruleEString ) ) this_NL_9= RULE_NL )
            // InternalCsvMan.g:650:3: () otherlv_1= 'add' otherlv_2= '(' ( (lv_valeur_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_valeur_5_0= ruleEString ) ) )* otherlv_6= ')' otherlv_7= 'in' ( (lv_table_8_0= ruleEString ) ) this_NL_9= RULE_NL
            {
            // InternalCsvMan.g:650:3: ()
            // InternalCsvMan.g:651:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAddAccess().getAddAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getAddAccess().getAddKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getAddAccess().getLeftParenthesisKeyword_2());
            		
            // InternalCsvMan.g:665:3: ( (lv_valeur_3_0= ruleEString ) )
            // InternalCsvMan.g:666:4: (lv_valeur_3_0= ruleEString )
            {
            // InternalCsvMan.g:666:4: (lv_valeur_3_0= ruleEString )
            // InternalCsvMan.g:667:5: lv_valeur_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAddAccess().getValeurEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_valeur_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddRule());
            					}
            					add(
            						current,
            						"valeur",
            						lv_valeur_3_0,
            						"org.xtext.example.csvmanl.CsvMan.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCsvMan.g:684:3: (otherlv_4= ',' ( (lv_valeur_5_0= ruleEString ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==15) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalCsvMan.g:685:4: otherlv_4= ',' ( (lv_valeur_5_0= ruleEString ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_4); 

            	    				newLeafNode(otherlv_4, grammarAccess.getAddAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalCsvMan.g:689:4: ( (lv_valeur_5_0= ruleEString ) )
            	    // InternalCsvMan.g:690:5: (lv_valeur_5_0= ruleEString )
            	    {
            	    // InternalCsvMan.g:690:5: (lv_valeur_5_0= ruleEString )
            	    // InternalCsvMan.g:691:6: lv_valeur_5_0= ruleEString
            	    {

            	    						newCompositeNode(grammarAccess.getAddAccess().getValeurEStringParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_valeur_5_0=ruleEString();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAddRule());
            	    						}
            	    						add(
            	    							current,
            	    							"valeur",
            	    							lv_valeur_5_0,
            	    							"org.xtext.example.csvmanl.CsvMan.EString");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getAddAccess().getRightParenthesisKeyword_5());
            		
            otherlv_7=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getAddAccess().getInKeyword_6());
            		
            // InternalCsvMan.g:717:3: ( (lv_table_8_0= ruleEString ) )
            // InternalCsvMan.g:718:4: (lv_table_8_0= ruleEString )
            {
            // InternalCsvMan.g:718:4: (lv_table_8_0= ruleEString )
            // InternalCsvMan.g:719:5: lv_table_8_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAddAccess().getTableEStringParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_7);
            lv_table_8_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddRule());
            					}
            					set(
            						current,
            						"table",
            						lv_table_8_0,
            						"org.xtext.example.csvmanl.CsvMan.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_NL_9=(Token)match(input,RULE_NL,FOLLOW_2); 

            			newLeafNode(this_NL_9, grammarAccess.getAddAccess().getNLTerminalRuleCall_8());
            		

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
    // InternalCsvMan.g:744:1: entryRuleJoin returns [EObject current=null] : iv_ruleJoin= ruleJoin EOF ;
    public final EObject entryRuleJoin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoin = null;


        try {
            // InternalCsvMan.g:744:45: (iv_ruleJoin= ruleJoin EOF )
            // InternalCsvMan.g:745:2: iv_ruleJoin= ruleJoin EOF
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
    // InternalCsvMan.g:751:1: ruleJoin returns [EObject current=null] : ( () otherlv_1= 'join' ( (lv_table1_2_0= ruleEString ) ) ( (lv_table2_3_0= ruleEString ) ) this_NL_4= RULE_NL ) ;
    public final EObject ruleJoin() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_NL_4=null;
        AntlrDatatypeRuleToken lv_table1_2_0 = null;

        AntlrDatatypeRuleToken lv_table2_3_0 = null;



        	enterRule();

        try {
            // InternalCsvMan.g:757:2: ( ( () otherlv_1= 'join' ( (lv_table1_2_0= ruleEString ) ) ( (lv_table2_3_0= ruleEString ) ) this_NL_4= RULE_NL ) )
            // InternalCsvMan.g:758:2: ( () otherlv_1= 'join' ( (lv_table1_2_0= ruleEString ) ) ( (lv_table2_3_0= ruleEString ) ) this_NL_4= RULE_NL )
            {
            // InternalCsvMan.g:758:2: ( () otherlv_1= 'join' ( (lv_table1_2_0= ruleEString ) ) ( (lv_table2_3_0= ruleEString ) ) this_NL_4= RULE_NL )
            // InternalCsvMan.g:759:3: () otherlv_1= 'join' ( (lv_table1_2_0= ruleEString ) ) ( (lv_table2_3_0= ruleEString ) ) this_NL_4= RULE_NL
            {
            // InternalCsvMan.g:759:3: ()
            // InternalCsvMan.g:760:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getJoinAccess().getJoinAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getJoinAccess().getJoinKeyword_1());
            		
            // InternalCsvMan.g:770:3: ( (lv_table1_2_0= ruleEString ) )
            // InternalCsvMan.g:771:4: (lv_table1_2_0= ruleEString )
            {
            // InternalCsvMan.g:771:4: (lv_table1_2_0= ruleEString )
            // InternalCsvMan.g:772:5: lv_table1_2_0= ruleEString
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

            // InternalCsvMan.g:789:3: ( (lv_table2_3_0= ruleEString ) )
            // InternalCsvMan.g:790:4: (lv_table2_3_0= ruleEString )
            {
            // InternalCsvMan.g:790:4: (lv_table2_3_0= ruleEString )
            // InternalCsvMan.g:791:5: lv_table2_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getJoinAccess().getTable2EStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
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

            this_NL_4=(Token)match(input,RULE_NL,FOLLOW_2); 

            			newLeafNode(this_NL_4, grammarAccess.getJoinAccess().getNLTerminalRuleCall_4());
            		

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
    // InternalCsvMan.g:816:1: entryRuleDelete returns [EObject current=null] : iv_ruleDelete= ruleDelete EOF ;
    public final EObject entryRuleDelete() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelete = null;


        try {
            // InternalCsvMan.g:816:47: (iv_ruleDelete= ruleDelete EOF )
            // InternalCsvMan.g:817:2: iv_ruleDelete= ruleDelete EOF
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
    // InternalCsvMan.g:823:1: ruleDelete returns [EObject current=null] : ( () otherlv_1= 'delete' ( (lv_table_2_0= ruleEString ) ) ( (lv_where_3_0= ruleWhere ) )? this_NL_4= RULE_NL ) ;
    public final EObject ruleDelete() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_NL_4=null;
        AntlrDatatypeRuleToken lv_table_2_0 = null;

        EObject lv_where_3_0 = null;



        	enterRule();

        try {
            // InternalCsvMan.g:829:2: ( ( () otherlv_1= 'delete' ( (lv_table_2_0= ruleEString ) ) ( (lv_where_3_0= ruleWhere ) )? this_NL_4= RULE_NL ) )
            // InternalCsvMan.g:830:2: ( () otherlv_1= 'delete' ( (lv_table_2_0= ruleEString ) ) ( (lv_where_3_0= ruleWhere ) )? this_NL_4= RULE_NL )
            {
            // InternalCsvMan.g:830:2: ( () otherlv_1= 'delete' ( (lv_table_2_0= ruleEString ) ) ( (lv_where_3_0= ruleWhere ) )? this_NL_4= RULE_NL )
            // InternalCsvMan.g:831:3: () otherlv_1= 'delete' ( (lv_table_2_0= ruleEString ) ) ( (lv_where_3_0= ruleWhere ) )? this_NL_4= RULE_NL
            {
            // InternalCsvMan.g:831:3: ()
            // InternalCsvMan.g:832:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDeleteAccess().getDeleteAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getDeleteAccess().getDeleteKeyword_1());
            		
            // InternalCsvMan.g:842:3: ( (lv_table_2_0= ruleEString ) )
            // InternalCsvMan.g:843:4: (lv_table_2_0= ruleEString )
            {
            // InternalCsvMan.g:843:4: (lv_table_2_0= ruleEString )
            // InternalCsvMan.g:844:5: lv_table_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDeleteAccess().getTableEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
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

            // InternalCsvMan.g:861:3: ( (lv_where_3_0= ruleWhere ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalCsvMan.g:862:4: (lv_where_3_0= ruleWhere )
                    {
                    // InternalCsvMan.g:862:4: (lv_where_3_0= ruleWhere )
                    // InternalCsvMan.g:863:5: lv_where_3_0= ruleWhere
                    {

                    					newCompositeNode(grammarAccess.getDeleteAccess().getWhereWhereParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_7);
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

            this_NL_4=(Token)match(input,RULE_NL,FOLLOW_2); 

            			newLeafNode(this_NL_4, grammarAccess.getDeleteAccess().getNLTerminalRuleCall_4());
            		

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
    // InternalCsvMan.g:888:1: entryRuleExit returns [EObject current=null] : iv_ruleExit= ruleExit EOF ;
    public final EObject entryRuleExit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExit = null;


        try {
            // InternalCsvMan.g:888:45: (iv_ruleExit= ruleExit EOF )
            // InternalCsvMan.g:889:2: iv_ruleExit= ruleExit EOF
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
    // InternalCsvMan.g:895:1: ruleExit returns [EObject current=null] : ( () otherlv_1= 'exit' ) ;
    public final EObject ruleExit() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalCsvMan.g:901:2: ( ( () otherlv_1= 'exit' ) )
            // InternalCsvMan.g:902:2: ( () otherlv_1= 'exit' )
            {
            // InternalCsvMan.g:902:2: ( () otherlv_1= 'exit' )
            // InternalCsvMan.g:903:3: () otherlv_1= 'exit'
            {
            // InternalCsvMan.g:903:3: ()
            // InternalCsvMan.g:904:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExitAccess().getExitAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_2); 

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
    // InternalCsvMan.g:918:1: entryRuleWhere returns [EObject current=null] : iv_ruleWhere= ruleWhere EOF ;
    public final EObject entryRuleWhere() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhere = null;


        try {
            // InternalCsvMan.g:918:46: (iv_ruleWhere= ruleWhere EOF )
            // InternalCsvMan.g:919:2: iv_ruleWhere= ruleWhere EOF
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
    // InternalCsvMan.g:925:1: ruleWhere returns [EObject current=null] : ( () otherlv_1= 'where' ( (lv_condition_2_0= ruleCondition ) ) (otherlv_3= ',' ( (lv_condition_4_0= ruleCondition ) ) )* ) ;
    public final EObject ruleWhere() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_condition_2_0 = null;

        EObject lv_condition_4_0 = null;



        	enterRule();

        try {
            // InternalCsvMan.g:931:2: ( ( () otherlv_1= 'where' ( (lv_condition_2_0= ruleCondition ) ) (otherlv_3= ',' ( (lv_condition_4_0= ruleCondition ) ) )* ) )
            // InternalCsvMan.g:932:2: ( () otherlv_1= 'where' ( (lv_condition_2_0= ruleCondition ) ) (otherlv_3= ',' ( (lv_condition_4_0= ruleCondition ) ) )* )
            {
            // InternalCsvMan.g:932:2: ( () otherlv_1= 'where' ( (lv_condition_2_0= ruleCondition ) ) (otherlv_3= ',' ( (lv_condition_4_0= ruleCondition ) ) )* )
            // InternalCsvMan.g:933:3: () otherlv_1= 'where' ( (lv_condition_2_0= ruleCondition ) ) (otherlv_3= ',' ( (lv_condition_4_0= ruleCondition ) ) )*
            {
            // InternalCsvMan.g:933:3: ()
            // InternalCsvMan.g:934:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWhereAccess().getWhereAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getWhereAccess().getWhereKeyword_1());
            		
            // InternalCsvMan.g:944:3: ( (lv_condition_2_0= ruleCondition ) )
            // InternalCsvMan.g:945:4: (lv_condition_2_0= ruleCondition )
            {
            // InternalCsvMan.g:945:4: (lv_condition_2_0= ruleCondition )
            // InternalCsvMan.g:946:5: lv_condition_2_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getWhereAccess().getConditionConditionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
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

            // InternalCsvMan.g:963:3: (otherlv_3= ',' ( (lv_condition_4_0= ruleCondition ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==15) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalCsvMan.g:964:4: otherlv_3= ',' ( (lv_condition_4_0= ruleCondition ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_4); 

            	    				newLeafNode(otherlv_3, grammarAccess.getWhereAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalCsvMan.g:968:4: ( (lv_condition_4_0= ruleCondition ) )
            	    // InternalCsvMan.g:969:5: (lv_condition_4_0= ruleCondition )
            	    {
            	    // InternalCsvMan.g:969:5: (lv_condition_4_0= ruleCondition )
            	    // InternalCsvMan.g:970:6: lv_condition_4_0= ruleCondition
            	    {

            	    						newCompositeNode(grammarAccess.getWhereAccess().getConditionConditionParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_condition_4_0=ruleCondition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getWhereRule());
            	    						}
            	    						add(
            	    							current,
            	    							"condition",
            	    							lv_condition_4_0,
            	    							"org.xtext.example.csvmanl.CsvMan.Condition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // $ANTLR end "ruleWhere"


    // $ANTLR start "entryRuleCondition"
    // InternalCsvMan.g:992:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalCsvMan.g:992:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalCsvMan.g:993:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalCsvMan.g:999:1: ruleCondition returns [EObject current=null] : ( () ( (lv_atribut_1_0= ruleEString ) ) (otherlv_2= '=' | this_OP_3= RULE_OP ) ( (lv_valeur_4_0= ruleEString ) ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_OP_3=null;
        AntlrDatatypeRuleToken lv_atribut_1_0 = null;

        AntlrDatatypeRuleToken lv_valeur_4_0 = null;



        	enterRule();

        try {
            // InternalCsvMan.g:1005:2: ( ( () ( (lv_atribut_1_0= ruleEString ) ) (otherlv_2= '=' | this_OP_3= RULE_OP ) ( (lv_valeur_4_0= ruleEString ) ) ) )
            // InternalCsvMan.g:1006:2: ( () ( (lv_atribut_1_0= ruleEString ) ) (otherlv_2= '=' | this_OP_3= RULE_OP ) ( (lv_valeur_4_0= ruleEString ) ) )
            {
            // InternalCsvMan.g:1006:2: ( () ( (lv_atribut_1_0= ruleEString ) ) (otherlv_2= '=' | this_OP_3= RULE_OP ) ( (lv_valeur_4_0= ruleEString ) ) )
            // InternalCsvMan.g:1007:3: () ( (lv_atribut_1_0= ruleEString ) ) (otherlv_2= '=' | this_OP_3= RULE_OP ) ( (lv_valeur_4_0= ruleEString ) )
            {
            // InternalCsvMan.g:1007:3: ()
            // InternalCsvMan.g:1008:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConditionAccess().getConditionAction_0(),
            					current);
            			

            }

            // InternalCsvMan.g:1014:3: ( (lv_atribut_1_0= ruleEString ) )
            // InternalCsvMan.g:1015:4: (lv_atribut_1_0= ruleEString )
            {
            // InternalCsvMan.g:1015:4: (lv_atribut_1_0= ruleEString )
            // InternalCsvMan.g:1016:5: lv_atribut_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getConditionAccess().getAtributEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
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

            // InternalCsvMan.g:1033:3: (otherlv_2= '=' | this_OP_3= RULE_OP )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==28) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_OP) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalCsvMan.g:1034:4: otherlv_2= '='
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getConditionAccess().getEqualsSignKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalCsvMan.g:1039:4: this_OP_3= RULE_OP
                    {
                    this_OP_3=(Token)match(input,RULE_OP,FOLLOW_4); 

                    				newLeafNode(this_OP_3, grammarAccess.getConditionAccess().getOPTerminalRuleCall_2_1());
                    			

                    }
                    break;

            }

            // InternalCsvMan.g:1044:3: ( (lv_valeur_4_0= ruleEString ) )
            // InternalCsvMan.g:1045:4: (lv_valeur_4_0= ruleEString )
            {
            // InternalCsvMan.g:1045:4: (lv_valeur_4_0= ruleEString )
            // InternalCsvMan.g:1046:5: lv_valeur_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getConditionAccess().getValeurEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_valeur_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionRule());
            					}
            					set(
            						current,
            						"valeur",
            						lv_valeur_4_0,
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


    // $ANTLR start "entryRuleParameter"
    // InternalCsvMan.g:1067:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalCsvMan.g:1067:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalCsvMan.g:1068:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalCsvMan.g:1074:1: ruleParameter returns [EObject current=null] : ( () ( (lv_colonne_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_colonne_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalCsvMan.g:1080:2: ( ( () ( (lv_colonne_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) ) )
            // InternalCsvMan.g:1081:2: ( () ( (lv_colonne_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) )
            {
            // InternalCsvMan.g:1081:2: ( () ( (lv_colonne_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) )
            // InternalCsvMan.g:1082:3: () ( (lv_colonne_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) )
            {
            // InternalCsvMan.g:1082:3: ()
            // InternalCsvMan.g:1083:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterAccess().getParameterAction_0(),
            					current);
            			

            }

            // InternalCsvMan.g:1089:3: ( (lv_colonne_1_0= ruleEString ) )
            // InternalCsvMan.g:1090:4: (lv_colonne_1_0= ruleEString )
            {
            // InternalCsvMan.g:1090:4: (lv_colonne_1_0= ruleEString )
            // InternalCsvMan.g:1091:5: lv_colonne_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getColonneEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
            lv_colonne_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"colonne",
            						lv_colonne_1_0,
            						"org.xtext.example.csvmanl.CsvMan.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getEqualsSignKeyword_2());
            		
            // InternalCsvMan.g:1112:3: ( (lv_value_3_0= ruleEString ) )
            // InternalCsvMan.g:1113:4: (lv_value_3_0= ruleEString )
            {
            // InternalCsvMan.g:1113:4: (lv_value_3_0= ruleEString )
            // InternalCsvMan.g:1114:5: lv_value_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getValueEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleComment"
    // InternalCsvMan.g:1135:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // InternalCsvMan.g:1135:48: (iv_ruleComment= ruleComment EOF )
            // InternalCsvMan.g:1136:2: iv_ruleComment= ruleComment EOF
            {
             newCompositeNode(grammarAccess.getCommentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComment=ruleComment();

            state._fsp--;

             current =iv_ruleComment; 
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
    // $ANTLR end "entryRuleComment"


    // $ANTLR start "ruleComment"
    // InternalCsvMan.g:1142:1: ruleComment returns [EObject current=null] : (this_ML_COMMENT_0= RULE_ML_COMMENT | this_SL_COMMENT_1= RULE_SL_COMMENT ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        Token this_ML_COMMENT_0=null;
        Token this_SL_COMMENT_1=null;


        	enterRule();

        try {
            // InternalCsvMan.g:1148:2: ( (this_ML_COMMENT_0= RULE_ML_COMMENT | this_SL_COMMENT_1= RULE_SL_COMMENT ) )
            // InternalCsvMan.g:1149:2: (this_ML_COMMENT_0= RULE_ML_COMMENT | this_SL_COMMENT_1= RULE_SL_COMMENT )
            {
            // InternalCsvMan.g:1149:2: (this_ML_COMMENT_0= RULE_ML_COMMENT | this_SL_COMMENT_1= RULE_SL_COMMENT )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ML_COMMENT) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_SL_COMMENT) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalCsvMan.g:1150:3: this_ML_COMMENT_0= RULE_ML_COMMENT
                    {
                    this_ML_COMMENT_0=(Token)match(input,RULE_ML_COMMENT,FOLLOW_2); 

                    			newLeafNode(this_ML_COMMENT_0, grammarAccess.getCommentAccess().getML_COMMENTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCsvMan.g:1155:3: this_SL_COMMENT_1= RULE_SL_COMMENT
                    {
                    this_SL_COMMENT_1=(Token)match(input,RULE_SL_COMMENT,FOLLOW_2); 

                    			newLeafNode(this_SL_COMMENT_1, grammarAccess.getCommentAccess().getSL_COMMENTTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleComment"


    // $ANTLR start "entryRuleEString"
    // InternalCsvMan.g:1163:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalCsvMan.g:1163:47: (iv_ruleEString= ruleEString EOF )
            // InternalCsvMan.g:1164:2: iv_ruleEString= ruleEString EOF
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
    // InternalCsvMan.g:1170:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID | this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalCsvMan.g:1176:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID | this_INT_2= RULE_INT ) )
            // InternalCsvMan.g:1177:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID | this_INT_2= RULE_INT )
            {
            // InternalCsvMan.g:1177:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID | this_INT_2= RULE_INT )
            int alt14=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt14=1;
                }
                break;
            case RULE_ID:
                {
                alt14=2;
                }
                break;
            case RULE_INT:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalCsvMan.g:1178:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCsvMan.g:1186:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalCsvMan.g:1194:3: this_INT_2= RULE_INT
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_2);
                    		

                    			newLeafNode(this_INT_2, grammarAccess.getEStringAccess().getINTTerminalRuleCall_2());
                    		

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000075A20C2L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000700L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000008004010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000008008010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000000L});

}