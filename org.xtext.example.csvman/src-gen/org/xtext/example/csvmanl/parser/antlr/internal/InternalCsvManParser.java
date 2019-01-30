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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NL", "RULE_ID", "RULE_OP", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_STRING", "RULE_INT", "RULE_WS", "RULE_ANY_OTHER", "'delete'", "'copy'", "'in'", "'create'", "'load'", "'as'", "'show'", "'('", "','", "')'", "'update'", "'set'", "'add'", "'join'", "'remove'", "'exit'", "'where'", "'='"
    };
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_OP=6;
    public static final int RULE_ID=5;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=10;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
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
    // InternalCsvMan.g:71:1: ruleProgram returns [EObject current=null] : ( () ( ( (lv_instruction_1_0= ruleInstruction ) ) this_NL_2= RULE_NL )* ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token this_NL_2=null;
        EObject lv_instruction_1_0 = null;



        	enterRule();

        try {
            // InternalCsvMan.g:77:2: ( ( () ( ( (lv_instruction_1_0= ruleInstruction ) ) this_NL_2= RULE_NL )* ) )
            // InternalCsvMan.g:78:2: ( () ( ( (lv_instruction_1_0= ruleInstruction ) ) this_NL_2= RULE_NL )* )
            {
            // InternalCsvMan.g:78:2: ( () ( ( (lv_instruction_1_0= ruleInstruction ) ) this_NL_2= RULE_NL )* )
            // InternalCsvMan.g:79:3: () ( ( (lv_instruction_1_0= ruleInstruction ) ) this_NL_2= RULE_NL )*
            {
            // InternalCsvMan.g:79:3: ()
            // InternalCsvMan.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProgramAccess().getProgramAction_0(),
            					current);
            			

            }

            // InternalCsvMan.g:86:3: ( ( (lv_instruction_1_0= ruleInstruction ) ) this_NL_2= RULE_NL )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ML_COMMENT && LA1_0<=RULE_SL_COMMENT)||(LA1_0>=13 && LA1_0<=14)||(LA1_0>=16 && LA1_0<=17)||LA1_0==19||LA1_0==23||(LA1_0>=25 && LA1_0<=28)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCsvMan.g:87:4: ( (lv_instruction_1_0= ruleInstruction ) ) this_NL_2= RULE_NL
            	    {
            	    // InternalCsvMan.g:87:4: ( (lv_instruction_1_0= ruleInstruction ) )
            	    // InternalCsvMan.g:88:5: (lv_instruction_1_0= ruleInstruction )
            	    {
            	    // InternalCsvMan.g:88:5: (lv_instruction_1_0= ruleInstruction )
            	    // InternalCsvMan.g:89:6: lv_instruction_1_0= ruleInstruction
            	    {

            	    						newCompositeNode(grammarAccess.getProgramAccess().getInstructionInstructionParserRuleCall_1_0_0());
            	    					
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

            	    this_NL_2=(Token)match(input,RULE_NL,FOLLOW_4); 

            	    				newLeafNode(this_NL_2, grammarAccess.getProgramAccess().getNLTerminalRuleCall_1_1());
            	    			

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
    // InternalCsvMan.g:115:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // InternalCsvMan.g:115:52: (iv_ruleInstruction= ruleInstruction EOF )
            // InternalCsvMan.g:116:2: iv_ruleInstruction= ruleInstruction EOF
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
    // InternalCsvMan.g:122:1: ruleInstruction returns [EObject current=null] : (this_Create_0= ruleCreate | this_Load_1= ruleLoad | this_Show_2= ruleShow | this_Update_3= ruleUpdate | this_Add_4= ruleAdd | this_Join_5= ruleJoin | this_Delete_6= ruleDelete | this_Exit_7= ruleExit | this_Comment_8= ruleComment | this_Copy_9= ruleCopy | this_Remove_10= ruleRemove ) ;
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

        EObject this_Copy_9 = null;

        EObject this_Remove_10 = null;



        	enterRule();

        try {
            // InternalCsvMan.g:128:2: ( (this_Create_0= ruleCreate | this_Load_1= ruleLoad | this_Show_2= ruleShow | this_Update_3= ruleUpdate | this_Add_4= ruleAdd | this_Join_5= ruleJoin | this_Delete_6= ruleDelete | this_Exit_7= ruleExit | this_Comment_8= ruleComment | this_Copy_9= ruleCopy | this_Remove_10= ruleRemove ) )
            // InternalCsvMan.g:129:2: (this_Create_0= ruleCreate | this_Load_1= ruleLoad | this_Show_2= ruleShow | this_Update_3= ruleUpdate | this_Add_4= ruleAdd | this_Join_5= ruleJoin | this_Delete_6= ruleDelete | this_Exit_7= ruleExit | this_Comment_8= ruleComment | this_Copy_9= ruleCopy | this_Remove_10= ruleRemove )
            {
            // InternalCsvMan.g:129:2: (this_Create_0= ruleCreate | this_Load_1= ruleLoad | this_Show_2= ruleShow | this_Update_3= ruleUpdate | this_Add_4= ruleAdd | this_Join_5= ruleJoin | this_Delete_6= ruleDelete | this_Exit_7= ruleExit | this_Comment_8= ruleComment | this_Copy_9= ruleCopy | this_Remove_10= ruleRemove )
            int alt2=11;
            switch ( input.LA(1) ) {
            case 16:
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
            case 23:
                {
                alt2=4;
                }
                break;
            case 25:
                {
                alt2=5;
                }
                break;
            case 26:
                {
                alt2=6;
                }
                break;
            case 13:
                {
                alt2=7;
                }
                break;
            case 28:
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
            case 14:
                {
                alt2=10;
                }
                break;
            case 27:
                {
                alt2=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalCsvMan.g:130:3: this_Create_0= ruleCreate
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
                    // InternalCsvMan.g:139:3: this_Load_1= ruleLoad
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
                    // InternalCsvMan.g:148:3: this_Show_2= ruleShow
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
                    // InternalCsvMan.g:157:3: this_Update_3= ruleUpdate
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
                    // InternalCsvMan.g:166:3: this_Add_4= ruleAdd
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
                    // InternalCsvMan.g:175:3: this_Join_5= ruleJoin
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
                    // InternalCsvMan.g:184:3: this_Delete_6= ruleDelete
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
                    // InternalCsvMan.g:193:3: this_Exit_7= ruleExit
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
                    // InternalCsvMan.g:202:3: this_Comment_8= ruleComment
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getCommentParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_Comment_8=ruleComment();

                    state._fsp--;


                    			current = this_Comment_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalCsvMan.g:211:3: this_Copy_9= ruleCopy
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getCopyParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_Copy_9=ruleCopy();

                    state._fsp--;


                    			current = this_Copy_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalCsvMan.g:220:3: this_Remove_10= ruleRemove
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getRemoveParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_Remove_10=ruleRemove();

                    state._fsp--;


                    			current = this_Remove_10;
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


    // $ANTLR start "entryRuleDelete"
    // InternalCsvMan.g:232:1: entryRuleDelete returns [EObject current=null] : iv_ruleDelete= ruleDelete EOF ;
    public final EObject entryRuleDelete() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelete = null;


        try {
            // InternalCsvMan.g:232:47: (iv_ruleDelete= ruleDelete EOF )
            // InternalCsvMan.g:233:2: iv_ruleDelete= ruleDelete EOF
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
    // InternalCsvMan.g:239:1: ruleDelete returns [EObject current=null] : ( () otherlv_1= 'delete' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleDelete() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalCsvMan.g:245:2: ( ( () otherlv_1= 'delete' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalCsvMan.g:246:2: ( () otherlv_1= 'delete' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalCsvMan.g:246:2: ( () otherlv_1= 'delete' ( (otherlv_2= RULE_ID ) ) )
            // InternalCsvMan.g:247:3: () otherlv_1= 'delete' ( (otherlv_2= RULE_ID ) )
            {
            // InternalCsvMan.g:247:3: ()
            // InternalCsvMan.g:248:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDeleteAccess().getDeleteAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getDeleteAccess().getDeleteKeyword_1());
            		
            // InternalCsvMan.g:258:3: ( (otherlv_2= RULE_ID ) )
            // InternalCsvMan.g:259:4: (otherlv_2= RULE_ID )
            {
            // InternalCsvMan.g:259:4: (otherlv_2= RULE_ID )
            // InternalCsvMan.g:260:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeleteRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getDeleteAccess().getCsvtableCsvTableCrossReference_2_0());
            				

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
    // $ANTLR end "ruleDelete"


    // $ANTLR start "entryRuleCopy"
    // InternalCsvMan.g:275:1: entryRuleCopy returns [EObject current=null] : iv_ruleCopy= ruleCopy EOF ;
    public final EObject entryRuleCopy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCopy = null;


        try {
            // InternalCsvMan.g:275:45: (iv_ruleCopy= ruleCopy EOF )
            // InternalCsvMan.g:276:2: iv_ruleCopy= ruleCopy EOF
            {
             newCompositeNode(grammarAccess.getCopyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCopy=ruleCopy();

            state._fsp--;

             current =iv_ruleCopy; 
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
    // $ANTLR end "entryRuleCopy"


    // $ANTLR start "ruleCopy"
    // InternalCsvMan.g:282:1: ruleCopy returns [EObject current=null] : ( () otherlv_1= 'copy' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'in' ( (lv_table_4_0= ruleCsvTable ) ) ) ;
    public final EObject ruleCopy() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_table_4_0 = null;



        	enterRule();

        try {
            // InternalCsvMan.g:288:2: ( ( () otherlv_1= 'copy' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'in' ( (lv_table_4_0= ruleCsvTable ) ) ) )
            // InternalCsvMan.g:289:2: ( () otherlv_1= 'copy' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'in' ( (lv_table_4_0= ruleCsvTable ) ) )
            {
            // InternalCsvMan.g:289:2: ( () otherlv_1= 'copy' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'in' ( (lv_table_4_0= ruleCsvTable ) ) )
            // InternalCsvMan.g:290:3: () otherlv_1= 'copy' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'in' ( (lv_table_4_0= ruleCsvTable ) )
            {
            // InternalCsvMan.g:290:3: ()
            // InternalCsvMan.g:291:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCopyAccess().getCopyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getCopyAccess().getCopyKeyword_1());
            		
            // InternalCsvMan.g:301:3: ( (otherlv_2= RULE_ID ) )
            // InternalCsvMan.g:302:4: (otherlv_2= RULE_ID )
            {
            // InternalCsvMan.g:302:4: (otherlv_2= RULE_ID )
            // InternalCsvMan.g:303:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCopyRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_2, grammarAccess.getCopyAccess().getAliasCsvTableCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getCopyAccess().getInKeyword_3());
            		
            // InternalCsvMan.g:318:3: ( (lv_table_4_0= ruleCsvTable ) )
            // InternalCsvMan.g:319:4: (lv_table_4_0= ruleCsvTable )
            {
            // InternalCsvMan.g:319:4: (lv_table_4_0= ruleCsvTable )
            // InternalCsvMan.g:320:5: lv_table_4_0= ruleCsvTable
            {

            					newCompositeNode(grammarAccess.getCopyAccess().getTableCsvTableParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_table_4_0=ruleCsvTable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCopyRule());
            					}
            					set(
            						current,
            						"table",
            						lv_table_4_0,
            						"org.xtext.example.csvmanl.CsvMan.CsvTable");
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
    // $ANTLR end "ruleCopy"


    // $ANTLR start "entryRuleCreate"
    // InternalCsvMan.g:341:1: entryRuleCreate returns [EObject current=null] : iv_ruleCreate= ruleCreate EOF ;
    public final EObject entryRuleCreate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreate = null;


        try {
            // InternalCsvMan.g:341:47: (iv_ruleCreate= ruleCreate EOF )
            // InternalCsvMan.g:342:2: iv_ruleCreate= ruleCreate EOF
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
    // InternalCsvMan.g:348:1: ruleCreate returns [EObject current=null] : ( () otherlv_1= 'create' ( (lv_csvtable_2_0= ruleCsvTable ) ) ) ;
    public final EObject ruleCreate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_csvtable_2_0 = null;



        	enterRule();

        try {
            // InternalCsvMan.g:354:2: ( ( () otherlv_1= 'create' ( (lv_csvtable_2_0= ruleCsvTable ) ) ) )
            // InternalCsvMan.g:355:2: ( () otherlv_1= 'create' ( (lv_csvtable_2_0= ruleCsvTable ) ) )
            {
            // InternalCsvMan.g:355:2: ( () otherlv_1= 'create' ( (lv_csvtable_2_0= ruleCsvTable ) ) )
            // InternalCsvMan.g:356:3: () otherlv_1= 'create' ( (lv_csvtable_2_0= ruleCsvTable ) )
            {
            // InternalCsvMan.g:356:3: ()
            // InternalCsvMan.g:357:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCreateAccess().getCreateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getCreateAccess().getCreateKeyword_1());
            		
            // InternalCsvMan.g:367:3: ( (lv_csvtable_2_0= ruleCsvTable ) )
            // InternalCsvMan.g:368:4: (lv_csvtable_2_0= ruleCsvTable )
            {
            // InternalCsvMan.g:368:4: (lv_csvtable_2_0= ruleCsvTable )
            // InternalCsvMan.g:369:5: lv_csvtable_2_0= ruleCsvTable
            {

            					newCompositeNode(grammarAccess.getCreateAccess().getCsvtableCsvTableParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_csvtable_2_0=ruleCsvTable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCreateRule());
            					}
            					set(
            						current,
            						"csvtable",
            						lv_csvtable_2_0,
            						"org.xtext.example.csvmanl.CsvMan.CsvTable");
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
    // InternalCsvMan.g:390:1: entryRuleLoad returns [EObject current=null] : iv_ruleLoad= ruleLoad EOF ;
    public final EObject entryRuleLoad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoad = null;


        try {
            // InternalCsvMan.g:390:45: (iv_ruleLoad= ruleLoad EOF )
            // InternalCsvMan.g:391:2: iv_ruleLoad= ruleLoad EOF
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
    // InternalCsvMan.g:397:1: ruleLoad returns [EObject current=null] : ( () otherlv_1= 'load' ( (lv_fichier_2_0= ruleEString ) ) otherlv_3= 'as' ( (lv_csvtable_4_0= ruleCsvTable ) ) ) ;
    public final EObject ruleLoad() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_fichier_2_0 = null;

        EObject lv_csvtable_4_0 = null;



        	enterRule();

        try {
            // InternalCsvMan.g:403:2: ( ( () otherlv_1= 'load' ( (lv_fichier_2_0= ruleEString ) ) otherlv_3= 'as' ( (lv_csvtable_4_0= ruleCsvTable ) ) ) )
            // InternalCsvMan.g:404:2: ( () otherlv_1= 'load' ( (lv_fichier_2_0= ruleEString ) ) otherlv_3= 'as' ( (lv_csvtable_4_0= ruleCsvTable ) ) )
            {
            // InternalCsvMan.g:404:2: ( () otherlv_1= 'load' ( (lv_fichier_2_0= ruleEString ) ) otherlv_3= 'as' ( (lv_csvtable_4_0= ruleCsvTable ) ) )
            // InternalCsvMan.g:405:3: () otherlv_1= 'load' ( (lv_fichier_2_0= ruleEString ) ) otherlv_3= 'as' ( (lv_csvtable_4_0= ruleCsvTable ) )
            {
            // InternalCsvMan.g:405:3: ()
            // InternalCsvMan.g:406:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLoadAccess().getLoadAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getLoadAccess().getLoadKeyword_1());
            		
            // InternalCsvMan.g:416:3: ( (lv_fichier_2_0= ruleEString ) )
            // InternalCsvMan.g:417:4: (lv_fichier_2_0= ruleEString )
            {
            // InternalCsvMan.g:417:4: (lv_fichier_2_0= ruleEString )
            // InternalCsvMan.g:418:5: lv_fichier_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLoadAccess().getFichierEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_fichier_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLoadRule());
            					}
            					set(
            						current,
            						"fichier",
            						lv_fichier_2_0,
            						"org.xtext.example.csvmanl.CsvMan.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getLoadAccess().getAsKeyword_3());
            		
            // InternalCsvMan.g:439:3: ( (lv_csvtable_4_0= ruleCsvTable ) )
            // InternalCsvMan.g:440:4: (lv_csvtable_4_0= ruleCsvTable )
            {
            // InternalCsvMan.g:440:4: (lv_csvtable_4_0= ruleCsvTable )
            // InternalCsvMan.g:441:5: lv_csvtable_4_0= ruleCsvTable
            {

            					newCompositeNode(grammarAccess.getLoadAccess().getCsvtableCsvTableParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_csvtable_4_0=ruleCsvTable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLoadRule());
            					}
            					set(
            						current,
            						"csvtable",
            						lv_csvtable_4_0,
            						"org.xtext.example.csvmanl.CsvMan.CsvTable");
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
    // InternalCsvMan.g:462:1: entryRuleShow returns [EObject current=null] : iv_ruleShow= ruleShow EOF ;
    public final EObject entryRuleShow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShow = null;


        try {
            // InternalCsvMan.g:462:45: (iv_ruleShow= ruleShow EOF )
            // InternalCsvMan.g:463:2: iv_ruleShow= ruleShow EOF
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
    // InternalCsvMan.g:469:1: ruleShow returns [EObject current=null] : ( () otherlv_1= 'show' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '(' ( (lv_colonne_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_colonne_6_0= ruleEString ) ) )* otherlv_7= ')' )? ( (lv_where_8_0= ruleWhere ) )? ) ;
    public final EObject ruleShow() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_colonne_4_0 = null;

        AntlrDatatypeRuleToken lv_colonne_6_0 = null;

        EObject lv_where_8_0 = null;



        	enterRule();

        try {
            // InternalCsvMan.g:475:2: ( ( () otherlv_1= 'show' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '(' ( (lv_colonne_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_colonne_6_0= ruleEString ) ) )* otherlv_7= ')' )? ( (lv_where_8_0= ruleWhere ) )? ) )
            // InternalCsvMan.g:476:2: ( () otherlv_1= 'show' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '(' ( (lv_colonne_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_colonne_6_0= ruleEString ) ) )* otherlv_7= ')' )? ( (lv_where_8_0= ruleWhere ) )? )
            {
            // InternalCsvMan.g:476:2: ( () otherlv_1= 'show' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '(' ( (lv_colonne_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_colonne_6_0= ruleEString ) ) )* otherlv_7= ')' )? ( (lv_where_8_0= ruleWhere ) )? )
            // InternalCsvMan.g:477:3: () otherlv_1= 'show' ( (otherlv_2= RULE_ID ) ) (otherlv_3= '(' ( (lv_colonne_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_colonne_6_0= ruleEString ) ) )* otherlv_7= ')' )? ( (lv_where_8_0= ruleWhere ) )?
            {
            // InternalCsvMan.g:477:3: ()
            // InternalCsvMan.g:478:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getShowAccess().getShowAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getShowAccess().getShowKeyword_1());
            		
            // InternalCsvMan.g:488:3: ( (otherlv_2= RULE_ID ) )
            // InternalCsvMan.g:489:4: (otherlv_2= RULE_ID )
            {
            // InternalCsvMan.g:489:4: (otherlv_2= RULE_ID )
            // InternalCsvMan.g:490:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getShowRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_2, grammarAccess.getShowAccess().getCsvtableCsvTableCrossReference_2_0());
            				

            }


            }

            // InternalCsvMan.g:501:3: (otherlv_3= '(' ( (lv_colonne_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_colonne_6_0= ruleEString ) ) )* otherlv_7= ')' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalCsvMan.g:502:4: otherlv_3= '(' ( (lv_colonne_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_colonne_6_0= ruleEString ) ) )* otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getShowAccess().getLeftParenthesisKeyword_3_0());
                    			
                    // InternalCsvMan.g:506:4: ( (lv_colonne_4_0= ruleEString ) )
                    // InternalCsvMan.g:507:5: (lv_colonne_4_0= ruleEString )
                    {
                    // InternalCsvMan.g:507:5: (lv_colonne_4_0= ruleEString )
                    // InternalCsvMan.g:508:6: lv_colonne_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getShowAccess().getColonneEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_10);
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

                    // InternalCsvMan.g:525:4: (otherlv_5= ',' ( (lv_colonne_6_0= ruleEString ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==21) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalCsvMan.g:526:5: otherlv_5= ',' ( (lv_colonne_6_0= ruleEString ) )
                    	    {
                    	    otherlv_5=(Token)match(input,21,FOLLOW_7); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getShowAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalCsvMan.g:530:5: ( (lv_colonne_6_0= ruleEString ) )
                    	    // InternalCsvMan.g:531:6: (lv_colonne_6_0= ruleEString )
                    	    {
                    	    // InternalCsvMan.g:531:6: (lv_colonne_6_0= ruleEString )
                    	    // InternalCsvMan.g:532:7: lv_colonne_6_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getShowAccess().getColonneEStringParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
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
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,22,FOLLOW_11); 

                    				newLeafNode(otherlv_7, grammarAccess.getShowAccess().getRightParenthesisKeyword_3_3());
                    			

                    }
                    break;

            }

            // InternalCsvMan.g:555:3: ( (lv_where_8_0= ruleWhere ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==29) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalCsvMan.g:556:4: (lv_where_8_0= ruleWhere )
                    {
                    // InternalCsvMan.g:556:4: (lv_where_8_0= ruleWhere )
                    // InternalCsvMan.g:557:5: lv_where_8_0= ruleWhere
                    {

                    					newCompositeNode(grammarAccess.getShowAccess().getWhereWhereParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
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
    // InternalCsvMan.g:578:1: entryRuleUpdate returns [EObject current=null] : iv_ruleUpdate= ruleUpdate EOF ;
    public final EObject entryRuleUpdate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdate = null;


        try {
            // InternalCsvMan.g:578:47: (iv_ruleUpdate= ruleUpdate EOF )
            // InternalCsvMan.g:579:2: iv_ruleUpdate= ruleUpdate EOF
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
    // InternalCsvMan.g:585:1: ruleUpdate returns [EObject current=null] : ( () otherlv_1= 'update' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'set' ( (lv_parameter_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameter_6_0= ruleParameter ) ) )* ( (lv_where_7_0= ruleWhere ) )? ) ;
    public final EObject ruleUpdate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_parameter_4_0 = null;

        EObject lv_parameter_6_0 = null;

        EObject lv_where_7_0 = null;



        	enterRule();

        try {
            // InternalCsvMan.g:591:2: ( ( () otherlv_1= 'update' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'set' ( (lv_parameter_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameter_6_0= ruleParameter ) ) )* ( (lv_where_7_0= ruleWhere ) )? ) )
            // InternalCsvMan.g:592:2: ( () otherlv_1= 'update' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'set' ( (lv_parameter_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameter_6_0= ruleParameter ) ) )* ( (lv_where_7_0= ruleWhere ) )? )
            {
            // InternalCsvMan.g:592:2: ( () otherlv_1= 'update' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'set' ( (lv_parameter_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameter_6_0= ruleParameter ) ) )* ( (lv_where_7_0= ruleWhere ) )? )
            // InternalCsvMan.g:593:3: () otherlv_1= 'update' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'set' ( (lv_parameter_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameter_6_0= ruleParameter ) ) )* ( (lv_where_7_0= ruleWhere ) )?
            {
            // InternalCsvMan.g:593:3: ()
            // InternalCsvMan.g:594:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUpdateAccess().getUpdateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getUpdateAccess().getUpdateKeyword_1());
            		
            // InternalCsvMan.g:604:3: ( (otherlv_2= RULE_ID ) )
            // InternalCsvMan.g:605:4: (otherlv_2= RULE_ID )
            {
            // InternalCsvMan.g:605:4: (otherlv_2= RULE_ID )
            // InternalCsvMan.g:606:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUpdateRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_2, grammarAccess.getUpdateAccess().getCsvtableCsvTableCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getUpdateAccess().getSetKeyword_3());
            		
            // InternalCsvMan.g:621:3: ( (lv_parameter_4_0= ruleParameter ) )
            // InternalCsvMan.g:622:4: (lv_parameter_4_0= ruleParameter )
            {
            // InternalCsvMan.g:622:4: (lv_parameter_4_0= ruleParameter )
            // InternalCsvMan.g:623:5: lv_parameter_4_0= ruleParameter
            {

            					newCompositeNode(grammarAccess.getUpdateAccess().getParameterParameterParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_13);
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

            // InternalCsvMan.g:640:3: (otherlv_5= ',' ( (lv_parameter_6_0= ruleParameter ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==21) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCsvMan.g:641:4: otherlv_5= ',' ( (lv_parameter_6_0= ruleParameter ) )
            	    {
            	    otherlv_5=(Token)match(input,21,FOLLOW_7); 

            	    				newLeafNode(otherlv_5, grammarAccess.getUpdateAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalCsvMan.g:645:4: ( (lv_parameter_6_0= ruleParameter ) )
            	    // InternalCsvMan.g:646:5: (lv_parameter_6_0= ruleParameter )
            	    {
            	    // InternalCsvMan.g:646:5: (lv_parameter_6_0= ruleParameter )
            	    // InternalCsvMan.g:647:6: lv_parameter_6_0= ruleParameter
            	    {

            	    						newCompositeNode(grammarAccess.getUpdateAccess().getParameterParameterParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_13);
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
            	    break loop6;
                }
            } while (true);

            // InternalCsvMan.g:665:3: ( (lv_where_7_0= ruleWhere ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==29) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalCsvMan.g:666:4: (lv_where_7_0= ruleWhere )
                    {
                    // InternalCsvMan.g:666:4: (lv_where_7_0= ruleWhere )
                    // InternalCsvMan.g:667:5: lv_where_7_0= ruleWhere
                    {

                    					newCompositeNode(grammarAccess.getUpdateAccess().getWhereWhereParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_2);
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
    // InternalCsvMan.g:688:1: entryRuleAdd returns [EObject current=null] : iv_ruleAdd= ruleAdd EOF ;
    public final EObject entryRuleAdd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdd = null;


        try {
            // InternalCsvMan.g:688:44: (iv_ruleAdd= ruleAdd EOF )
            // InternalCsvMan.g:689:2: iv_ruleAdd= ruleAdd EOF
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
    // InternalCsvMan.g:695:1: ruleAdd returns [EObject current=null] : ( () otherlv_1= 'add' ( (otherlv_2= '(' ( (lv_valeur_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_valeur_5_0= ruleEString ) ) )* otherlv_6= ')' ) | (otherlv_7= '(' ( (lv_parameter_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameter_10_0= ruleParameter ) ) )* otherlv_11= ')' ) ) otherlv_12= 'in' ( ( ruleEString ) ) ) ;
    public final EObject ruleAdd() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_valeur_3_0 = null;

        AntlrDatatypeRuleToken lv_valeur_5_0 = null;

        EObject lv_parameter_8_0 = null;

        EObject lv_parameter_10_0 = null;



        	enterRule();

        try {
            // InternalCsvMan.g:701:2: ( ( () otherlv_1= 'add' ( (otherlv_2= '(' ( (lv_valeur_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_valeur_5_0= ruleEString ) ) )* otherlv_6= ')' ) | (otherlv_7= '(' ( (lv_parameter_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameter_10_0= ruleParameter ) ) )* otherlv_11= ')' ) ) otherlv_12= 'in' ( ( ruleEString ) ) ) )
            // InternalCsvMan.g:702:2: ( () otherlv_1= 'add' ( (otherlv_2= '(' ( (lv_valeur_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_valeur_5_0= ruleEString ) ) )* otherlv_6= ')' ) | (otherlv_7= '(' ( (lv_parameter_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameter_10_0= ruleParameter ) ) )* otherlv_11= ')' ) ) otherlv_12= 'in' ( ( ruleEString ) ) )
            {
            // InternalCsvMan.g:702:2: ( () otherlv_1= 'add' ( (otherlv_2= '(' ( (lv_valeur_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_valeur_5_0= ruleEString ) ) )* otherlv_6= ')' ) | (otherlv_7= '(' ( (lv_parameter_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameter_10_0= ruleParameter ) ) )* otherlv_11= ')' ) ) otherlv_12= 'in' ( ( ruleEString ) ) )
            // InternalCsvMan.g:703:3: () otherlv_1= 'add' ( (otherlv_2= '(' ( (lv_valeur_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_valeur_5_0= ruleEString ) ) )* otherlv_6= ')' ) | (otherlv_7= '(' ( (lv_parameter_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameter_10_0= ruleParameter ) ) )* otherlv_11= ')' ) ) otherlv_12= 'in' ( ( ruleEString ) )
            {
            // InternalCsvMan.g:703:3: ()
            // InternalCsvMan.g:704:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAddAccess().getAddAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getAddAccess().getAddKeyword_1());
            		
            // InternalCsvMan.g:714:3: ( (otherlv_2= '(' ( (lv_valeur_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_valeur_5_0= ruleEString ) ) )* otherlv_6= ')' ) | (otherlv_7= '(' ( (lv_parameter_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameter_10_0= ruleParameter ) ) )* otherlv_11= ')' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                switch ( input.LA(2) ) {
                case RULE_STRING:
                    {
                    int LA10_2 = input.LA(3);

                    if ( ((LA10_2>=21 && LA10_2<=22)) ) {
                        alt10=1;
                    }
                    else if ( (LA10_2==30) ) {
                        alt10=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_ID:
                    {
                    int LA10_3 = input.LA(3);

                    if ( ((LA10_3>=21 && LA10_3<=22)) ) {
                        alt10=1;
                    }
                    else if ( (LA10_3==30) ) {
                        alt10=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_INT:
                    {
                    int LA10_4 = input.LA(3);

                    if ( ((LA10_4>=21 && LA10_4<=22)) ) {
                        alt10=1;
                    }
                    else if ( (LA10_4==30) ) {
                        alt10=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalCsvMan.g:715:4: (otherlv_2= '(' ( (lv_valeur_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_valeur_5_0= ruleEString ) ) )* otherlv_6= ')' )
                    {
                    // InternalCsvMan.g:715:4: (otherlv_2= '(' ( (lv_valeur_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_valeur_5_0= ruleEString ) ) )* otherlv_6= ')' )
                    // InternalCsvMan.g:716:5: otherlv_2= '(' ( (lv_valeur_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_valeur_5_0= ruleEString ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_7); 

                    					newLeafNode(otherlv_2, grammarAccess.getAddAccess().getLeftParenthesisKeyword_2_0_0());
                    				
                    // InternalCsvMan.g:720:5: ( (lv_valeur_3_0= ruleEString ) )
                    // InternalCsvMan.g:721:6: (lv_valeur_3_0= ruleEString )
                    {
                    // InternalCsvMan.g:721:6: (lv_valeur_3_0= ruleEString )
                    // InternalCsvMan.g:722:7: lv_valeur_3_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getAddAccess().getValeurEStringParserRuleCall_2_0_1_0());
                    						
                    pushFollow(FOLLOW_10);
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

                    // InternalCsvMan.g:739:5: (otherlv_4= ',' ( (lv_valeur_5_0= ruleEString ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==21) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalCsvMan.g:740:6: otherlv_4= ',' ( (lv_valeur_5_0= ruleEString ) )
                    	    {
                    	    otherlv_4=(Token)match(input,21,FOLLOW_7); 

                    	    						newLeafNode(otherlv_4, grammarAccess.getAddAccess().getCommaKeyword_2_0_2_0());
                    	    					
                    	    // InternalCsvMan.g:744:6: ( (lv_valeur_5_0= ruleEString ) )
                    	    // InternalCsvMan.g:745:7: (lv_valeur_5_0= ruleEString )
                    	    {
                    	    // InternalCsvMan.g:745:7: (lv_valeur_5_0= ruleEString )
                    	    // InternalCsvMan.g:746:8: lv_valeur_5_0= ruleEString
                    	    {

                    	    								newCompositeNode(grammarAccess.getAddAccess().getValeurEStringParserRuleCall_2_0_2_1_0());
                    	    							
                    	    pushFollow(FOLLOW_10);
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
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,22,FOLLOW_6); 

                    					newLeafNode(otherlv_6, grammarAccess.getAddAccess().getRightParenthesisKeyword_2_0_3());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalCsvMan.g:770:4: (otherlv_7= '(' ( (lv_parameter_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameter_10_0= ruleParameter ) ) )* otherlv_11= ')' )
                    {
                    // InternalCsvMan.g:770:4: (otherlv_7= '(' ( (lv_parameter_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameter_10_0= ruleParameter ) ) )* otherlv_11= ')' )
                    // InternalCsvMan.g:771:5: otherlv_7= '(' ( (lv_parameter_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameter_10_0= ruleParameter ) ) )* otherlv_11= ')'
                    {
                    otherlv_7=(Token)match(input,20,FOLLOW_7); 

                    					newLeafNode(otherlv_7, grammarAccess.getAddAccess().getLeftParenthesisKeyword_2_1_0());
                    				
                    // InternalCsvMan.g:775:5: ( (lv_parameter_8_0= ruleParameter ) )
                    // InternalCsvMan.g:776:6: (lv_parameter_8_0= ruleParameter )
                    {
                    // InternalCsvMan.g:776:6: (lv_parameter_8_0= ruleParameter )
                    // InternalCsvMan.g:777:7: lv_parameter_8_0= ruleParameter
                    {

                    							newCompositeNode(grammarAccess.getAddAccess().getParameterParameterParserRuleCall_2_1_1_0());
                    						
                    pushFollow(FOLLOW_10);
                    lv_parameter_8_0=ruleParameter();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getAddRule());
                    							}
                    							add(
                    								current,
                    								"parameter",
                    								lv_parameter_8_0,
                    								"org.xtext.example.csvmanl.CsvMan.Parameter");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalCsvMan.g:794:5: (otherlv_9= ',' ( (lv_parameter_10_0= ruleParameter ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==21) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalCsvMan.g:795:6: otherlv_9= ',' ( (lv_parameter_10_0= ruleParameter ) )
                    	    {
                    	    otherlv_9=(Token)match(input,21,FOLLOW_7); 

                    	    						newLeafNode(otherlv_9, grammarAccess.getAddAccess().getCommaKeyword_2_1_2_0());
                    	    					
                    	    // InternalCsvMan.g:799:6: ( (lv_parameter_10_0= ruleParameter ) )
                    	    // InternalCsvMan.g:800:7: (lv_parameter_10_0= ruleParameter )
                    	    {
                    	    // InternalCsvMan.g:800:7: (lv_parameter_10_0= ruleParameter )
                    	    // InternalCsvMan.g:801:8: lv_parameter_10_0= ruleParameter
                    	    {

                    	    								newCompositeNode(grammarAccess.getAddAccess().getParameterParameterParserRuleCall_2_1_2_1_0());
                    	    							
                    	    pushFollow(FOLLOW_10);
                    	    lv_parameter_10_0=ruleParameter();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getAddRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"parameter",
                    	    									lv_parameter_10_0,
                    	    									"org.xtext.example.csvmanl.CsvMan.Parameter");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,22,FOLLOW_6); 

                    					newLeafNode(otherlv_11, grammarAccess.getAddAccess().getRightParenthesisKeyword_2_1_3());
                    				

                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_12, grammarAccess.getAddAccess().getInKeyword_3());
            		
            // InternalCsvMan.g:829:3: ( ( ruleEString ) )
            // InternalCsvMan.g:830:4: ( ruleEString )
            {
            // InternalCsvMan.g:830:4: ( ruleEString )
            // InternalCsvMan.g:831:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAddAccess().getCsvtableCsvTableCrossReference_4_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


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
    // InternalCsvMan.g:849:1: entryRuleJoin returns [EObject current=null] : iv_ruleJoin= ruleJoin EOF ;
    public final EObject entryRuleJoin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoin = null;


        try {
            // InternalCsvMan.g:849:45: (iv_ruleJoin= ruleJoin EOF )
            // InternalCsvMan.g:850:2: iv_ruleJoin= ruleJoin EOF
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
    // InternalCsvMan.g:856:1: ruleJoin returns [EObject current=null] : ( () otherlv_1= 'join' ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) otherlv_4= 'in' ( (lv_table3_5_0= ruleCsvTable ) ) ) ;
    public final EObject ruleJoin() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_table3_5_0 = null;



        	enterRule();

        try {
            // InternalCsvMan.g:862:2: ( ( () otherlv_1= 'join' ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) otherlv_4= 'in' ( (lv_table3_5_0= ruleCsvTable ) ) ) )
            // InternalCsvMan.g:863:2: ( () otherlv_1= 'join' ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) otherlv_4= 'in' ( (lv_table3_5_0= ruleCsvTable ) ) )
            {
            // InternalCsvMan.g:863:2: ( () otherlv_1= 'join' ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) otherlv_4= 'in' ( (lv_table3_5_0= ruleCsvTable ) ) )
            // InternalCsvMan.g:864:3: () otherlv_1= 'join' ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) otherlv_4= 'in' ( (lv_table3_5_0= ruleCsvTable ) )
            {
            // InternalCsvMan.g:864:3: ()
            // InternalCsvMan.g:865:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getJoinAccess().getJoinAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getJoinAccess().getJoinKeyword_1());
            		
            // InternalCsvMan.g:875:3: ( (otherlv_2= RULE_ID ) )
            // InternalCsvMan.g:876:4: (otherlv_2= RULE_ID )
            {
            // InternalCsvMan.g:876:4: (otherlv_2= RULE_ID )
            // InternalCsvMan.g:877:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJoinRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(otherlv_2, grammarAccess.getJoinAccess().getTablesCsvTableCrossReference_2_0());
            				

            }


            }

            // InternalCsvMan.g:888:3: ( (otherlv_3= RULE_ID ) )
            // InternalCsvMan.g:889:4: (otherlv_3= RULE_ID )
            {
            // InternalCsvMan.g:889:4: (otherlv_3= RULE_ID )
            // InternalCsvMan.g:890:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJoinRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_3, grammarAccess.getJoinAccess().getTablesCsvTableCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getJoinAccess().getInKeyword_4());
            		
            // InternalCsvMan.g:905:3: ( (lv_table3_5_0= ruleCsvTable ) )
            // InternalCsvMan.g:906:4: (lv_table3_5_0= ruleCsvTable )
            {
            // InternalCsvMan.g:906:4: (lv_table3_5_0= ruleCsvTable )
            // InternalCsvMan.g:907:5: lv_table3_5_0= ruleCsvTable
            {

            					newCompositeNode(grammarAccess.getJoinAccess().getTable3CsvTableParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_table3_5_0=ruleCsvTable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJoinRule());
            					}
            					set(
            						current,
            						"table3",
            						lv_table3_5_0,
            						"org.xtext.example.csvmanl.CsvMan.CsvTable");
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


    // $ANTLR start "entryRuleRemove"
    // InternalCsvMan.g:928:1: entryRuleRemove returns [EObject current=null] : iv_ruleRemove= ruleRemove EOF ;
    public final EObject entryRuleRemove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRemove = null;


        try {
            // InternalCsvMan.g:928:47: (iv_ruleRemove= ruleRemove EOF )
            // InternalCsvMan.g:929:2: iv_ruleRemove= ruleRemove EOF
            {
             newCompositeNode(grammarAccess.getRemoveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRemove=ruleRemove();

            state._fsp--;

             current =iv_ruleRemove; 
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
    // $ANTLR end "entryRuleRemove"


    // $ANTLR start "ruleRemove"
    // InternalCsvMan.g:935:1: ruleRemove returns [EObject current=null] : ( () otherlv_1= 'remove' ( (otherlv_2= RULE_ID ) ) ( (lv_where_3_0= ruleWhere ) )? ) ;
    public final EObject ruleRemove() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_where_3_0 = null;



        	enterRule();

        try {
            // InternalCsvMan.g:941:2: ( ( () otherlv_1= 'remove' ( (otherlv_2= RULE_ID ) ) ( (lv_where_3_0= ruleWhere ) )? ) )
            // InternalCsvMan.g:942:2: ( () otherlv_1= 'remove' ( (otherlv_2= RULE_ID ) ) ( (lv_where_3_0= ruleWhere ) )? )
            {
            // InternalCsvMan.g:942:2: ( () otherlv_1= 'remove' ( (otherlv_2= RULE_ID ) ) ( (lv_where_3_0= ruleWhere ) )? )
            // InternalCsvMan.g:943:3: () otherlv_1= 'remove' ( (otherlv_2= RULE_ID ) ) ( (lv_where_3_0= ruleWhere ) )?
            {
            // InternalCsvMan.g:943:3: ()
            // InternalCsvMan.g:944:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRemoveAccess().getRemoveAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getRemoveAccess().getRemoveKeyword_1());
            		
            // InternalCsvMan.g:954:3: ( (otherlv_2= RULE_ID ) )
            // InternalCsvMan.g:955:4: (otherlv_2= RULE_ID )
            {
            // InternalCsvMan.g:955:4: (otherlv_2= RULE_ID )
            // InternalCsvMan.g:956:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRemoveRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_2, grammarAccess.getRemoveAccess().getCsvtableCsvTableCrossReference_2_0());
            				

            }


            }

            // InternalCsvMan.g:967:3: ( (lv_where_3_0= ruleWhere ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==29) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCsvMan.g:968:4: (lv_where_3_0= ruleWhere )
                    {
                    // InternalCsvMan.g:968:4: (lv_where_3_0= ruleWhere )
                    // InternalCsvMan.g:969:5: lv_where_3_0= ruleWhere
                    {

                    					newCompositeNode(grammarAccess.getRemoveAccess().getWhereWhereParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_where_3_0=ruleWhere();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRemoveRule());
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
    // $ANTLR end "ruleRemove"


    // $ANTLR start "entryRuleExit"
    // InternalCsvMan.g:990:1: entryRuleExit returns [EObject current=null] : iv_ruleExit= ruleExit EOF ;
    public final EObject entryRuleExit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExit = null;


        try {
            // InternalCsvMan.g:990:45: (iv_ruleExit= ruleExit EOF )
            // InternalCsvMan.g:991:2: iv_ruleExit= ruleExit EOF
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
    // InternalCsvMan.g:997:1: ruleExit returns [EObject current=null] : ( () otherlv_1= 'exit' ) ;
    public final EObject ruleExit() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalCsvMan.g:1003:2: ( ( () otherlv_1= 'exit' ) )
            // InternalCsvMan.g:1004:2: ( () otherlv_1= 'exit' )
            {
            // InternalCsvMan.g:1004:2: ( () otherlv_1= 'exit' )
            // InternalCsvMan.g:1005:3: () otherlv_1= 'exit'
            {
            // InternalCsvMan.g:1005:3: ()
            // InternalCsvMan.g:1006:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExitAccess().getExitAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_2); 

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
    // InternalCsvMan.g:1020:1: entryRuleWhere returns [EObject current=null] : iv_ruleWhere= ruleWhere EOF ;
    public final EObject entryRuleWhere() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhere = null;


        try {
            // InternalCsvMan.g:1020:46: (iv_ruleWhere= ruleWhere EOF )
            // InternalCsvMan.g:1021:2: iv_ruleWhere= ruleWhere EOF
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
    // InternalCsvMan.g:1027:1: ruleWhere returns [EObject current=null] : ( () otherlv_1= 'where' ( (lv_condition_2_0= ruleCondition ) ) (otherlv_3= ',' ( (lv_condition_4_0= ruleCondition ) ) )* ) ;
    public final EObject ruleWhere() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_condition_2_0 = null;

        EObject lv_condition_4_0 = null;



        	enterRule();

        try {
            // InternalCsvMan.g:1033:2: ( ( () otherlv_1= 'where' ( (lv_condition_2_0= ruleCondition ) ) (otherlv_3= ',' ( (lv_condition_4_0= ruleCondition ) ) )* ) )
            // InternalCsvMan.g:1034:2: ( () otherlv_1= 'where' ( (lv_condition_2_0= ruleCondition ) ) (otherlv_3= ',' ( (lv_condition_4_0= ruleCondition ) ) )* )
            {
            // InternalCsvMan.g:1034:2: ( () otherlv_1= 'where' ( (lv_condition_2_0= ruleCondition ) ) (otherlv_3= ',' ( (lv_condition_4_0= ruleCondition ) ) )* )
            // InternalCsvMan.g:1035:3: () otherlv_1= 'where' ( (lv_condition_2_0= ruleCondition ) ) (otherlv_3= ',' ( (lv_condition_4_0= ruleCondition ) ) )*
            {
            // InternalCsvMan.g:1035:3: ()
            // InternalCsvMan.g:1036:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWhereAccess().getWhereAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getWhereAccess().getWhereKeyword_1());
            		
            // InternalCsvMan.g:1046:3: ( (lv_condition_2_0= ruleCondition ) )
            // InternalCsvMan.g:1047:4: (lv_condition_2_0= ruleCondition )
            {
            // InternalCsvMan.g:1047:4: (lv_condition_2_0= ruleCondition )
            // InternalCsvMan.g:1048:5: lv_condition_2_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getWhereAccess().getConditionConditionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_15);
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

            // InternalCsvMan.g:1065:3: (otherlv_3= ',' ( (lv_condition_4_0= ruleCondition ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==21) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalCsvMan.g:1066:4: otherlv_3= ',' ( (lv_condition_4_0= ruleCondition ) )
            	    {
            	    otherlv_3=(Token)match(input,21,FOLLOW_7); 

            	    				newLeafNode(otherlv_3, grammarAccess.getWhereAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalCsvMan.g:1070:4: ( (lv_condition_4_0= ruleCondition ) )
            	    // InternalCsvMan.g:1071:5: (lv_condition_4_0= ruleCondition )
            	    {
            	    // InternalCsvMan.g:1071:5: (lv_condition_4_0= ruleCondition )
            	    // InternalCsvMan.g:1072:6: lv_condition_4_0= ruleCondition
            	    {

            	    						newCompositeNode(grammarAccess.getWhereAccess().getConditionConditionParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
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
            	    break loop12;
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
    // InternalCsvMan.g:1094:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalCsvMan.g:1094:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalCsvMan.g:1095:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalCsvMan.g:1101:1: ruleCondition returns [EObject current=null] : ( () ( (lv_colonne_1_0= ruleEString ) ) (otherlv_2= '=' | this_OP_3= RULE_OP ) ( (lv_valeur_4_0= ruleEString ) ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_OP_3=null;
        AntlrDatatypeRuleToken lv_colonne_1_0 = null;

        AntlrDatatypeRuleToken lv_valeur_4_0 = null;



        	enterRule();

        try {
            // InternalCsvMan.g:1107:2: ( ( () ( (lv_colonne_1_0= ruleEString ) ) (otherlv_2= '=' | this_OP_3= RULE_OP ) ( (lv_valeur_4_0= ruleEString ) ) ) )
            // InternalCsvMan.g:1108:2: ( () ( (lv_colonne_1_0= ruleEString ) ) (otherlv_2= '=' | this_OP_3= RULE_OP ) ( (lv_valeur_4_0= ruleEString ) ) )
            {
            // InternalCsvMan.g:1108:2: ( () ( (lv_colonne_1_0= ruleEString ) ) (otherlv_2= '=' | this_OP_3= RULE_OP ) ( (lv_valeur_4_0= ruleEString ) ) )
            // InternalCsvMan.g:1109:3: () ( (lv_colonne_1_0= ruleEString ) ) (otherlv_2= '=' | this_OP_3= RULE_OP ) ( (lv_valeur_4_0= ruleEString ) )
            {
            // InternalCsvMan.g:1109:3: ()
            // InternalCsvMan.g:1110:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConditionAccess().getConditionAction_0(),
            					current);
            			

            }

            // InternalCsvMan.g:1116:3: ( (lv_colonne_1_0= ruleEString ) )
            // InternalCsvMan.g:1117:4: (lv_colonne_1_0= ruleEString )
            {
            // InternalCsvMan.g:1117:4: (lv_colonne_1_0= ruleEString )
            // InternalCsvMan.g:1118:5: lv_colonne_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getConditionAccess().getColonneEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
            lv_colonne_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionRule());
            					}
            					set(
            						current,
            						"colonne",
            						lv_colonne_1_0,
            						"org.xtext.example.csvmanl.CsvMan.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCsvMan.g:1135:3: (otherlv_2= '=' | this_OP_3= RULE_OP )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==30) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_OP) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalCsvMan.g:1136:4: otherlv_2= '='
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getConditionAccess().getEqualsSignKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalCsvMan.g:1141:4: this_OP_3= RULE_OP
                    {
                    this_OP_3=(Token)match(input,RULE_OP,FOLLOW_7); 

                    				newLeafNode(this_OP_3, grammarAccess.getConditionAccess().getOPTerminalRuleCall_2_1());
                    			

                    }
                    break;

            }

            // InternalCsvMan.g:1146:3: ( (lv_valeur_4_0= ruleEString ) )
            // InternalCsvMan.g:1147:4: (lv_valeur_4_0= ruleEString )
            {
            // InternalCsvMan.g:1147:4: (lv_valeur_4_0= ruleEString )
            // InternalCsvMan.g:1148:5: lv_valeur_4_0= ruleEString
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
    // InternalCsvMan.g:1169:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalCsvMan.g:1169:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalCsvMan.g:1170:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalCsvMan.g:1176:1: ruleParameter returns [EObject current=null] : ( () ( (lv_colonne_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_colonne_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalCsvMan.g:1182:2: ( ( () ( (lv_colonne_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) ) )
            // InternalCsvMan.g:1183:2: ( () ( (lv_colonne_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) )
            {
            // InternalCsvMan.g:1183:2: ( () ( (lv_colonne_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) )
            // InternalCsvMan.g:1184:3: () ( (lv_colonne_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) )
            {
            // InternalCsvMan.g:1184:3: ()
            // InternalCsvMan.g:1185:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterAccess().getParameterAction_0(),
            					current);
            			

            }

            // InternalCsvMan.g:1191:3: ( (lv_colonne_1_0= ruleEString ) )
            // InternalCsvMan.g:1192:4: (lv_colonne_1_0= ruleEString )
            {
            // InternalCsvMan.g:1192:4: (lv_colonne_1_0= ruleEString )
            // InternalCsvMan.g:1193:5: lv_colonne_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getColonneEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_17);
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

            otherlv_2=(Token)match(input,30,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getEqualsSignKeyword_2());
            		
            // InternalCsvMan.g:1214:3: ( (lv_value_3_0= ruleEString ) )
            // InternalCsvMan.g:1215:4: (lv_value_3_0= ruleEString )
            {
            // InternalCsvMan.g:1215:4: (lv_value_3_0= ruleEString )
            // InternalCsvMan.g:1216:5: lv_value_3_0= ruleEString
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


    // $ANTLR start "entryRuleCsvTable"
    // InternalCsvMan.g:1237:1: entryRuleCsvTable returns [EObject current=null] : iv_ruleCsvTable= ruleCsvTable EOF ;
    public final EObject entryRuleCsvTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCsvTable = null;


        try {
            // InternalCsvMan.g:1237:49: (iv_ruleCsvTable= ruleCsvTable EOF )
            // InternalCsvMan.g:1238:2: iv_ruleCsvTable= ruleCsvTable EOF
            {
             newCompositeNode(grammarAccess.getCsvTableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCsvTable=ruleCsvTable();

            state._fsp--;

             current =iv_ruleCsvTable; 
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
    // $ANTLR end "entryRuleCsvTable"


    // $ANTLR start "ruleCsvTable"
    // InternalCsvMan.g:1244:1: ruleCsvTable returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '(' ( (lv_colonne_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_colonne_5_0= ruleEString ) ) )* otherlv_6= ')' )? ) ;
    public final EObject ruleCsvTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_colonne_3_0 = null;

        AntlrDatatypeRuleToken lv_colonne_5_0 = null;



        	enterRule();

        try {
            // InternalCsvMan.g:1250:2: ( ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '(' ( (lv_colonne_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_colonne_5_0= ruleEString ) ) )* otherlv_6= ')' )? ) )
            // InternalCsvMan.g:1251:2: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '(' ( (lv_colonne_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_colonne_5_0= ruleEString ) ) )* otherlv_6= ')' )? )
            {
            // InternalCsvMan.g:1251:2: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '(' ( (lv_colonne_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_colonne_5_0= ruleEString ) ) )* otherlv_6= ')' )? )
            // InternalCsvMan.g:1252:3: () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '(' ( (lv_colonne_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_colonne_5_0= ruleEString ) ) )* otherlv_6= ')' )?
            {
            // InternalCsvMan.g:1252:3: ()
            // InternalCsvMan.g:1253:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCsvTableAccess().getCsvTableAction_0(),
            					current);
            			

            }

            // InternalCsvMan.g:1259:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCsvMan.g:1260:4: (lv_name_1_0= ruleEString )
            {
            // InternalCsvMan.g:1260:4: (lv_name_1_0= ruleEString )
            // InternalCsvMan.g:1261:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCsvTableAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCsvTableRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.csvmanl.CsvMan.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCsvMan.g:1278:3: (otherlv_2= '(' ( (lv_colonne_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_colonne_5_0= ruleEString ) ) )* otherlv_6= ')' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==20) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalCsvMan.g:1279:4: otherlv_2= '(' ( (lv_colonne_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_colonne_5_0= ruleEString ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getCsvTableAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalCsvMan.g:1283:4: ( (lv_colonne_3_0= ruleEString ) )
                    // InternalCsvMan.g:1284:5: (lv_colonne_3_0= ruleEString )
                    {
                    // InternalCsvMan.g:1284:5: (lv_colonne_3_0= ruleEString )
                    // InternalCsvMan.g:1285:6: lv_colonne_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCsvTableAccess().getColonneEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_colonne_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCsvTableRule());
                    						}
                    						add(
                    							current,
                    							"colonne",
                    							lv_colonne_3_0,
                    							"org.xtext.example.csvmanl.CsvMan.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCsvMan.g:1302:4: (otherlv_4= ',' ( (lv_colonne_5_0= ruleEString ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==21) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalCsvMan.g:1303:5: otherlv_4= ',' ( (lv_colonne_5_0= ruleEString ) )
                    	    {
                    	    otherlv_4=(Token)match(input,21,FOLLOW_7); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getCsvTableAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalCsvMan.g:1307:5: ( (lv_colonne_5_0= ruleEString ) )
                    	    // InternalCsvMan.g:1308:6: (lv_colonne_5_0= ruleEString )
                    	    {
                    	    // InternalCsvMan.g:1308:6: (lv_colonne_5_0= ruleEString )
                    	    // InternalCsvMan.g:1309:7: lv_colonne_5_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getCsvTableAccess().getColonneEStringParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_colonne_5_0=ruleEString();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCsvTableRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"colonne",
                    	    								lv_colonne_5_0,
                    	    								"org.xtext.example.csvmanl.CsvMan.EString");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getCsvTableAccess().getRightParenthesisKeyword_2_3());
                    			

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
    // $ANTLR end "ruleCsvTable"


    // $ANTLR start "entryRuleComment"
    // InternalCsvMan.g:1336:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // InternalCsvMan.g:1336:48: (iv_ruleComment= ruleComment EOF )
            // InternalCsvMan.g:1337:2: iv_ruleComment= ruleComment EOF
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
    // InternalCsvMan.g:1343:1: ruleComment returns [EObject current=null] : (this_ML_COMMENT_0= RULE_ML_COMMENT | this_SL_COMMENT_1= RULE_SL_COMMENT ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        Token this_ML_COMMENT_0=null;
        Token this_SL_COMMENT_1=null;


        	enterRule();

        try {
            // InternalCsvMan.g:1349:2: ( (this_ML_COMMENT_0= RULE_ML_COMMENT | this_SL_COMMENT_1= RULE_SL_COMMENT ) )
            // InternalCsvMan.g:1350:2: (this_ML_COMMENT_0= RULE_ML_COMMENT | this_SL_COMMENT_1= RULE_SL_COMMENT )
            {
            // InternalCsvMan.g:1350:2: (this_ML_COMMENT_0= RULE_ML_COMMENT | this_SL_COMMENT_1= RULE_SL_COMMENT )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ML_COMMENT) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_SL_COMMENT) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalCsvMan.g:1351:3: this_ML_COMMENT_0= RULE_ML_COMMENT
                    {
                    this_ML_COMMENT_0=(Token)match(input,RULE_ML_COMMENT,FOLLOW_2); 

                    			newLeafNode(this_ML_COMMENT_0, grammarAccess.getCommentAccess().getML_COMMENTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCsvMan.g:1356:3: this_SL_COMMENT_1= RULE_SL_COMMENT
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
    // InternalCsvMan.g:1364:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalCsvMan.g:1364:47: (iv_ruleEString= ruleEString EOF )
            // InternalCsvMan.g:1365:2: iv_ruleEString= ruleEString EOF
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
    // InternalCsvMan.g:1371:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID | this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalCsvMan.g:1377:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID | this_INT_2= RULE_INT ) )
            // InternalCsvMan.g:1378:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID | this_INT_2= RULE_INT )
            {
            // InternalCsvMan.g:1378:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID | this_INT_2= RULE_INT )
            int alt17=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt17=1;
                }
                break;
            case RULE_ID:
                {
                alt17=2;
                }
                break;
            case RULE_INT:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalCsvMan.g:1379:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCsvMan.g:1387:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalCsvMan.g:1395:3: this_INT_2= RULE_INT
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000001E8B6182L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000620L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000020100002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000020200002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000040000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000100002L});

}