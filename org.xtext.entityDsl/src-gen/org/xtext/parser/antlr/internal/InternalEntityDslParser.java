package org.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.services.EntityDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEntityDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'database:'", "'entity'", "'{'", "'}'", "':'", "'['", "','", "']'", "'RadioButtonGroup'", "'('", "')'", "'required='", "'CheckBox'", "'TextBox'", "'min='", "'max='", "'true'", "'false'", "'ComboBox'"
    };
    public static final int RULE_STRING=6;
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalEntityDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEntityDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEntityDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEntityDsl.g"; }



     	private EntityDslGrammarAccess grammarAccess;

        public InternalEntityDslParser(TokenStream input, EntityDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Domainmodel";
       	}

       	@Override
       	protected EntityDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDomainmodel"
    // InternalEntityDsl.g:64:1: entryRuleDomainmodel returns [EObject current=null] : iv_ruleDomainmodel= ruleDomainmodel EOF ;
    public final EObject entryRuleDomainmodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainmodel = null;


        try {
            // InternalEntityDsl.g:64:52: (iv_ruleDomainmodel= ruleDomainmodel EOF )
            // InternalEntityDsl.g:65:2: iv_ruleDomainmodel= ruleDomainmodel EOF
            {
             newCompositeNode(grammarAccess.getDomainmodelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDomainmodel=ruleDomainmodel();

            state._fsp--;

             current =iv_ruleDomainmodel; 
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
    // $ANTLR end "entryRuleDomainmodel"


    // $ANTLR start "ruleDomainmodel"
    // InternalEntityDsl.g:71:1: ruleDomainmodel returns [EObject current=null] : (otherlv_0= 'database:' ( (lv_applicationName_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleEntity ) )* ) ;
    public final EObject ruleDomainmodel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_applicationName_1_0=null;
        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalEntityDsl.g:77:2: ( (otherlv_0= 'database:' ( (lv_applicationName_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleEntity ) )* ) )
            // InternalEntityDsl.g:78:2: (otherlv_0= 'database:' ( (lv_applicationName_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleEntity ) )* )
            {
            // InternalEntityDsl.g:78:2: (otherlv_0= 'database:' ( (lv_applicationName_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleEntity ) )* )
            // InternalEntityDsl.g:79:3: otherlv_0= 'database:' ( (lv_applicationName_1_0= RULE_ID ) ) ( (lv_elements_2_0= ruleEntity ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDomainmodelAccess().getDatabaseKeyword_0());
            		
            // InternalEntityDsl.g:83:3: ( (lv_applicationName_1_0= RULE_ID ) )
            // InternalEntityDsl.g:84:4: (lv_applicationName_1_0= RULE_ID )
            {
            // InternalEntityDsl.g:84:4: (lv_applicationName_1_0= RULE_ID )
            // InternalEntityDsl.g:85:5: lv_applicationName_1_0= RULE_ID
            {
            lv_applicationName_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_applicationName_1_0, grammarAccess.getDomainmodelAccess().getApplicationNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDomainmodelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"applicationName",
            						lv_applicationName_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalEntityDsl.g:101:3: ( (lv_elements_2_0= ruleEntity ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEntityDsl.g:102:4: (lv_elements_2_0= ruleEntity )
            	    {
            	    // InternalEntityDsl.g:102:4: (lv_elements_2_0= ruleEntity )
            	    // InternalEntityDsl.g:103:5: lv_elements_2_0= ruleEntity
            	    {

            	    					newCompositeNode(grammarAccess.getDomainmodelAccess().getElementsEntityParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_elements_2_0=ruleEntity();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDomainmodelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_2_0,
            	    						"org.xtext.EntityDsl.Entity");
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
    // $ANTLR end "ruleDomainmodel"


    // $ANTLR start "entryRuleEntity"
    // InternalEntityDsl.g:124:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalEntityDsl.g:124:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalEntityDsl.g:125:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalEntityDsl.g:131:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_attributes_3_0 = null;



        	enterRule();

        try {
            // InternalEntityDsl.g:137:2: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' ) )
            // InternalEntityDsl.g:138:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' )
            {
            // InternalEntityDsl.g:138:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' )
            // InternalEntityDsl.g:139:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalEntityDsl.g:143:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEntityDsl.g:144:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEntityDsl.g:144:4: (lv_name_1_0= RULE_ID )
            // InternalEntityDsl.g:145:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalEntityDsl.g:165:3: ( (lv_attributes_3_0= ruleAttribute ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalEntityDsl.g:166:4: (lv_attributes_3_0= ruleAttribute )
            	    {
            	    // InternalEntityDsl.g:166:4: (lv_attributes_3_0= ruleAttribute )
            	    // InternalEntityDsl.g:167:5: lv_attributes_3_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_attributes_3_0=ruleAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_3_0,
            	    						"org.xtext.EntityDsl.Attribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleAttribute"
    // InternalEntityDsl.g:192:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalEntityDsl.g:192:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalEntityDsl.g:193:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalEntityDsl.g:199:1: ruleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '[' ( (lv_inputType_3_0= ruleWinFormControlType ) ) otherlv_4= ',' ( (lv_labelText_5_0= ruleLabel ) ) otherlv_6= ']' ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_inputType_3_0 = null;

        EObject lv_labelText_5_0 = null;



        	enterRule();

        try {
            // InternalEntityDsl.g:205:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '[' ( (lv_inputType_3_0= ruleWinFormControlType ) ) otherlv_4= ',' ( (lv_labelText_5_0= ruleLabel ) ) otherlv_6= ']' ) )
            // InternalEntityDsl.g:206:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '[' ( (lv_inputType_3_0= ruleWinFormControlType ) ) otherlv_4= ',' ( (lv_labelText_5_0= ruleLabel ) ) otherlv_6= ']' )
            {
            // InternalEntityDsl.g:206:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '[' ( (lv_inputType_3_0= ruleWinFormControlType ) ) otherlv_4= ',' ( (lv_labelText_5_0= ruleLabel ) ) otherlv_6= ']' )
            // InternalEntityDsl.g:207:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '[' ( (lv_inputType_3_0= ruleWinFormControlType ) ) otherlv_4= ',' ( (lv_labelText_5_0= ruleLabel ) ) otherlv_6= ']'
            {
            // InternalEntityDsl.g:207:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalEntityDsl.g:208:4: (lv_name_0_0= RULE_ID )
            {
            // InternalEntityDsl.g:208:4: (lv_name_0_0= RULE_ID )
            // InternalEntityDsl.g:209:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_0_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalEntityDsl.g:233:3: ( (lv_inputType_3_0= ruleWinFormControlType ) )
            // InternalEntityDsl.g:234:4: (lv_inputType_3_0= ruleWinFormControlType )
            {
            // InternalEntityDsl.g:234:4: (lv_inputType_3_0= ruleWinFormControlType )
            // InternalEntityDsl.g:235:5: lv_inputType_3_0= ruleWinFormControlType
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getInputTypeWinFormControlTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_inputType_3_0=ruleWinFormControlType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"inputType",
            						lv_inputType_3_0,
            						"org.xtext.EntityDsl.WinFormControlType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getCommaKeyword_4());
            		
            // InternalEntityDsl.g:256:3: ( (lv_labelText_5_0= ruleLabel ) )
            // InternalEntityDsl.g:257:4: (lv_labelText_5_0= ruleLabel )
            {
            // InternalEntityDsl.g:257:4: (lv_labelText_5_0= ruleLabel )
            // InternalEntityDsl.g:258:5: lv_labelText_5_0= ruleLabel
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getLabelTextLabelParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_11);
            lv_labelText_5_0=ruleLabel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"labelText",
            						lv_labelText_5_0,
            						"org.xtext.EntityDsl.Label");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_6());
            		

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleLabel"
    // InternalEntityDsl.g:283:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // InternalEntityDsl.g:283:46: (iv_ruleLabel= ruleLabel EOF )
            // InternalEntityDsl.g:284:2: iv_ruleLabel= ruleLabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLabel=ruleLabel();

            state._fsp--;

             current =iv_ruleLabel; 
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
    // $ANTLR end "entryRuleLabel"


    // $ANTLR start "ruleLabel"
    // InternalEntityDsl.g:290:1: ruleLabel returns [EObject current=null] : ( (lv_text_0_0= RULE_ID ) ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;


        	enterRule();

        try {
            // InternalEntityDsl.g:296:2: ( ( (lv_text_0_0= RULE_ID ) ) )
            // InternalEntityDsl.g:297:2: ( (lv_text_0_0= RULE_ID ) )
            {
            // InternalEntityDsl.g:297:2: ( (lv_text_0_0= RULE_ID ) )
            // InternalEntityDsl.g:298:3: (lv_text_0_0= RULE_ID )
            {
            // InternalEntityDsl.g:298:3: (lv_text_0_0= RULE_ID )
            // InternalEntityDsl.g:299:4: lv_text_0_0= RULE_ID
            {
            lv_text_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_text_0_0, grammarAccess.getLabelAccess().getTextIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getLabelRule());
            				}
            				setWithLastConsumed(
            					current,
            					"text",
            					lv_text_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleLabel"


    // $ANTLR start "entryRuleWinFormControlType"
    // InternalEntityDsl.g:318:1: entryRuleWinFormControlType returns [EObject current=null] : iv_ruleWinFormControlType= ruleWinFormControlType EOF ;
    public final EObject entryRuleWinFormControlType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWinFormControlType = null;


        try {
            // InternalEntityDsl.g:318:59: (iv_ruleWinFormControlType= ruleWinFormControlType EOF )
            // InternalEntityDsl.g:319:2: iv_ruleWinFormControlType= ruleWinFormControlType EOF
            {
             newCompositeNode(grammarAccess.getWinFormControlTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWinFormControlType=ruleWinFormControlType();

            state._fsp--;

             current =iv_ruleWinFormControlType; 
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
    // $ANTLR end "entryRuleWinFormControlType"


    // $ANTLR start "ruleWinFormControlType"
    // InternalEntityDsl.g:325:1: ruleWinFormControlType returns [EObject current=null] : ( ( (lv_controlType_0_0= ruleTextBox ) ) | this_ComboBox_1= ruleComboBox | this_CheckBox_2= ruleCheckBox | this_RadioButtonGroup_3= ruleRadioButtonGroup ) ;
    public final EObject ruleWinFormControlType() throws RecognitionException {
        EObject current = null;

        EObject lv_controlType_0_0 = null;

        EObject this_ComboBox_1 = null;

        EObject this_CheckBox_2 = null;

        EObject this_RadioButtonGroup_3 = null;



        	enterRule();

        try {
            // InternalEntityDsl.g:331:2: ( ( ( (lv_controlType_0_0= ruleTextBox ) ) | this_ComboBox_1= ruleComboBox | this_CheckBox_2= ruleCheckBox | this_RadioButtonGroup_3= ruleRadioButtonGroup ) )
            // InternalEntityDsl.g:332:2: ( ( (lv_controlType_0_0= ruleTextBox ) ) | this_ComboBox_1= ruleComboBox | this_CheckBox_2= ruleCheckBox | this_RadioButtonGroup_3= ruleRadioButtonGroup )
            {
            // InternalEntityDsl.g:332:2: ( ( (lv_controlType_0_0= ruleTextBox ) ) | this_ComboBox_1= ruleComboBox | this_CheckBox_2= ruleCheckBox | this_RadioButtonGroup_3= ruleRadioButtonGroup )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt3=1;
                }
                break;
            case 29:
                {
                alt3=2;
                }
                break;
            case 23:
                {
                alt3=3;
                }
                break;
            case 19:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalEntityDsl.g:333:3: ( (lv_controlType_0_0= ruleTextBox ) )
                    {
                    // InternalEntityDsl.g:333:3: ( (lv_controlType_0_0= ruleTextBox ) )
                    // InternalEntityDsl.g:334:4: (lv_controlType_0_0= ruleTextBox )
                    {
                    // InternalEntityDsl.g:334:4: (lv_controlType_0_0= ruleTextBox )
                    // InternalEntityDsl.g:335:5: lv_controlType_0_0= ruleTextBox
                    {

                    					newCompositeNode(grammarAccess.getWinFormControlTypeAccess().getControlTypeTextBoxParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_controlType_0_0=ruleTextBox();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getWinFormControlTypeRule());
                    					}
                    					set(
                    						current,
                    						"controlType",
                    						lv_controlType_0_0,
                    						"org.xtext.EntityDsl.TextBox");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEntityDsl.g:353:3: this_ComboBox_1= ruleComboBox
                    {

                    			newCompositeNode(grammarAccess.getWinFormControlTypeAccess().getComboBoxParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComboBox_1=ruleComboBox();

                    state._fsp--;


                    			current = this_ComboBox_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalEntityDsl.g:362:3: this_CheckBox_2= ruleCheckBox
                    {

                    			newCompositeNode(grammarAccess.getWinFormControlTypeAccess().getCheckBoxParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_CheckBox_2=ruleCheckBox();

                    state._fsp--;


                    			current = this_CheckBox_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalEntityDsl.g:371:3: this_RadioButtonGroup_3= ruleRadioButtonGroup
                    {

                    			newCompositeNode(grammarAccess.getWinFormControlTypeAccess().getRadioButtonGroupParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_RadioButtonGroup_3=ruleRadioButtonGroup();

                    state._fsp--;


                    			current = this_RadioButtonGroup_3;
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
    // $ANTLR end "ruleWinFormControlType"


    // $ANTLR start "entryRuleRadioButtonGroup"
    // InternalEntityDsl.g:383:1: entryRuleRadioButtonGroup returns [EObject current=null] : iv_ruleRadioButtonGroup= ruleRadioButtonGroup EOF ;
    public final EObject entryRuleRadioButtonGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRadioButtonGroup = null;


        try {
            // InternalEntityDsl.g:383:57: (iv_ruleRadioButtonGroup= ruleRadioButtonGroup EOF )
            // InternalEntityDsl.g:384:2: iv_ruleRadioButtonGroup= ruleRadioButtonGroup EOF
            {
             newCompositeNode(grammarAccess.getRadioButtonGroupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRadioButtonGroup=ruleRadioButtonGroup();

            state._fsp--;

             current =iv_ruleRadioButtonGroup; 
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
    // $ANTLR end "entryRuleRadioButtonGroup"


    // $ANTLR start "ruleRadioButtonGroup"
    // InternalEntityDsl.g:390:1: ruleRadioButtonGroup returns [EObject current=null] : ( ( (lv_name_0_0= 'RadioButtonGroup' ) ) otherlv_1= '(' ( (lv_buttons_2_0= ruleRadioButton ) )* otherlv_3= ')' otherlv_4= '[' otherlv_5= 'required=' ( (lv_required_6_0= ruleBoolean ) ) otherlv_7= ']' ) ;
    public final EObject ruleRadioButtonGroup() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_buttons_2_0 = null;

        EObject lv_required_6_0 = null;



        	enterRule();

        try {
            // InternalEntityDsl.g:396:2: ( ( ( (lv_name_0_0= 'RadioButtonGroup' ) ) otherlv_1= '(' ( (lv_buttons_2_0= ruleRadioButton ) )* otherlv_3= ')' otherlv_4= '[' otherlv_5= 'required=' ( (lv_required_6_0= ruleBoolean ) ) otherlv_7= ']' ) )
            // InternalEntityDsl.g:397:2: ( ( (lv_name_0_0= 'RadioButtonGroup' ) ) otherlv_1= '(' ( (lv_buttons_2_0= ruleRadioButton ) )* otherlv_3= ')' otherlv_4= '[' otherlv_5= 'required=' ( (lv_required_6_0= ruleBoolean ) ) otherlv_7= ']' )
            {
            // InternalEntityDsl.g:397:2: ( ( (lv_name_0_0= 'RadioButtonGroup' ) ) otherlv_1= '(' ( (lv_buttons_2_0= ruleRadioButton ) )* otherlv_3= ')' otherlv_4= '[' otherlv_5= 'required=' ( (lv_required_6_0= ruleBoolean ) ) otherlv_7= ']' )
            // InternalEntityDsl.g:398:3: ( (lv_name_0_0= 'RadioButtonGroup' ) ) otherlv_1= '(' ( (lv_buttons_2_0= ruleRadioButton ) )* otherlv_3= ')' otherlv_4= '[' otherlv_5= 'required=' ( (lv_required_6_0= ruleBoolean ) ) otherlv_7= ']'
            {
            // InternalEntityDsl.g:398:3: ( (lv_name_0_0= 'RadioButtonGroup' ) )
            // InternalEntityDsl.g:399:4: (lv_name_0_0= 'RadioButtonGroup' )
            {
            // InternalEntityDsl.g:399:4: (lv_name_0_0= 'RadioButtonGroup' )
            // InternalEntityDsl.g:400:5: lv_name_0_0= 'RadioButtonGroup'
            {
            lv_name_0_0=(Token)match(input,19,FOLLOW_12); 

            					newLeafNode(lv_name_0_0, grammarAccess.getRadioButtonGroupAccess().getNameRadioButtonGroupKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRadioButtonGroupRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "RadioButtonGroup");
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getRadioButtonGroupAccess().getLeftParenthesisKeyword_1());
            		
            // InternalEntityDsl.g:416:3: ( (lv_buttons_2_0= ruleRadioButton ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalEntityDsl.g:417:4: (lv_buttons_2_0= ruleRadioButton )
            	    {
            	    // InternalEntityDsl.g:417:4: (lv_buttons_2_0= ruleRadioButton )
            	    // InternalEntityDsl.g:418:5: lv_buttons_2_0= ruleRadioButton
            	    {

            	    					newCompositeNode(grammarAccess.getRadioButtonGroupAccess().getButtonsRadioButtonParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_buttons_2_0=ruleRadioButton();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRadioButtonGroupRule());
            	    					}
            	    					add(
            	    						current,
            	    						"buttons",
            	    						lv_buttons_2_0,
            	    						"org.xtext.EntityDsl.RadioButton");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_3=(Token)match(input,21,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getRadioButtonGroupAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getRadioButtonGroupAccess().getLeftSquareBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,22,FOLLOW_15); 

            			newLeafNode(otherlv_5, grammarAccess.getRadioButtonGroupAccess().getRequiredKeyword_5());
            		
            // InternalEntityDsl.g:447:3: ( (lv_required_6_0= ruleBoolean ) )
            // InternalEntityDsl.g:448:4: (lv_required_6_0= ruleBoolean )
            {
            // InternalEntityDsl.g:448:4: (lv_required_6_0= ruleBoolean )
            // InternalEntityDsl.g:449:5: lv_required_6_0= ruleBoolean
            {

            					newCompositeNode(grammarAccess.getRadioButtonGroupAccess().getRequiredBooleanParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_11);
            lv_required_6_0=ruleBoolean();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRadioButtonGroupRule());
            					}
            					set(
            						current,
            						"required",
            						lv_required_6_0,
            						"org.xtext.EntityDsl.Boolean");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getRadioButtonGroupAccess().getRightSquareBracketKeyword_7());
            		

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
    // $ANTLR end "ruleRadioButtonGroup"


    // $ANTLR start "entryRuleRadioButton"
    // InternalEntityDsl.g:474:1: entryRuleRadioButton returns [EObject current=null] : iv_ruleRadioButton= ruleRadioButton EOF ;
    public final EObject entryRuleRadioButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRadioButton = null;


        try {
            // InternalEntityDsl.g:474:52: (iv_ruleRadioButton= ruleRadioButton EOF )
            // InternalEntityDsl.g:475:2: iv_ruleRadioButton= ruleRadioButton EOF
            {
             newCompositeNode(grammarAccess.getRadioButtonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRadioButton=ruleRadioButton();

            state._fsp--;

             current =iv_ruleRadioButton; 
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
    // $ANTLR end "entryRuleRadioButton"


    // $ANTLR start "ruleRadioButton"
    // InternalEntityDsl.g:481:1: ruleRadioButton returns [EObject current=null] : ( (lv_text_0_0= RULE_ID ) ) ;
    public final EObject ruleRadioButton() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;


        	enterRule();

        try {
            // InternalEntityDsl.g:487:2: ( ( (lv_text_0_0= RULE_ID ) ) )
            // InternalEntityDsl.g:488:2: ( (lv_text_0_0= RULE_ID ) )
            {
            // InternalEntityDsl.g:488:2: ( (lv_text_0_0= RULE_ID ) )
            // InternalEntityDsl.g:489:3: (lv_text_0_0= RULE_ID )
            {
            // InternalEntityDsl.g:489:3: (lv_text_0_0= RULE_ID )
            // InternalEntityDsl.g:490:4: lv_text_0_0= RULE_ID
            {
            lv_text_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_text_0_0, grammarAccess.getRadioButtonAccess().getTextIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getRadioButtonRule());
            				}
            				setWithLastConsumed(
            					current,
            					"text",
            					lv_text_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleRadioButton"


    // $ANTLR start "entryRuleCheckBox"
    // InternalEntityDsl.g:509:1: entryRuleCheckBox returns [EObject current=null] : iv_ruleCheckBox= ruleCheckBox EOF ;
    public final EObject entryRuleCheckBox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckBox = null;


        try {
            // InternalEntityDsl.g:509:49: (iv_ruleCheckBox= ruleCheckBox EOF )
            // InternalEntityDsl.g:510:2: iv_ruleCheckBox= ruleCheckBox EOF
            {
             newCompositeNode(grammarAccess.getCheckBoxRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCheckBox=ruleCheckBox();

            state._fsp--;

             current =iv_ruleCheckBox; 
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
    // $ANTLR end "entryRuleCheckBox"


    // $ANTLR start "ruleCheckBox"
    // InternalEntityDsl.g:516:1: ruleCheckBox returns [EObject current=null] : ( (lv_name_0_0= 'CheckBox' ) ) ;
    public final EObject ruleCheckBox() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalEntityDsl.g:522:2: ( ( (lv_name_0_0= 'CheckBox' ) ) )
            // InternalEntityDsl.g:523:2: ( (lv_name_0_0= 'CheckBox' ) )
            {
            // InternalEntityDsl.g:523:2: ( (lv_name_0_0= 'CheckBox' ) )
            // InternalEntityDsl.g:524:3: (lv_name_0_0= 'CheckBox' )
            {
            // InternalEntityDsl.g:524:3: (lv_name_0_0= 'CheckBox' )
            // InternalEntityDsl.g:525:4: lv_name_0_0= 'CheckBox'
            {
            lv_name_0_0=(Token)match(input,23,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getCheckBoxAccess().getNameCheckBoxKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getCheckBoxRule());
            				}
            				setWithLastConsumed(current, "name", lv_name_0_0, "CheckBox");
            			

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
    // $ANTLR end "ruleCheckBox"


    // $ANTLR start "entryRuleTextBox"
    // InternalEntityDsl.g:540:1: entryRuleTextBox returns [EObject current=null] : iv_ruleTextBox= ruleTextBox EOF ;
    public final EObject entryRuleTextBox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextBox = null;


        try {
            // InternalEntityDsl.g:540:48: (iv_ruleTextBox= ruleTextBox EOF )
            // InternalEntityDsl.g:541:2: iv_ruleTextBox= ruleTextBox EOF
            {
             newCompositeNode(grammarAccess.getTextBoxRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTextBox=ruleTextBox();

            state._fsp--;

             current =iv_ruleTextBox; 
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
    // $ANTLR end "entryRuleTextBox"


    // $ANTLR start "ruleTextBox"
    // InternalEntityDsl.g:547:1: ruleTextBox returns [EObject current=null] : ( ( (lv_name_0_0= 'TextBox' ) ) otherlv_1= '[' otherlv_2= 'required=' ( (lv_required_3_0= ruleBoolean ) ) (otherlv_4= 'min=' ( (lv_minTextLength_5_0= RULE_INT ) ) )? (otherlv_6= 'max=' ( (lv_maxTextLength_7_0= RULE_INT ) ) )? otherlv_8= ']' ) ;
    public final EObject ruleTextBox() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_minTextLength_5_0=null;
        Token otherlv_6=null;
        Token lv_maxTextLength_7_0=null;
        Token otherlv_8=null;
        EObject lv_required_3_0 = null;



        	enterRule();

        try {
            // InternalEntityDsl.g:553:2: ( ( ( (lv_name_0_0= 'TextBox' ) ) otherlv_1= '[' otherlv_2= 'required=' ( (lv_required_3_0= ruleBoolean ) ) (otherlv_4= 'min=' ( (lv_minTextLength_5_0= RULE_INT ) ) )? (otherlv_6= 'max=' ( (lv_maxTextLength_7_0= RULE_INT ) ) )? otherlv_8= ']' ) )
            // InternalEntityDsl.g:554:2: ( ( (lv_name_0_0= 'TextBox' ) ) otherlv_1= '[' otherlv_2= 'required=' ( (lv_required_3_0= ruleBoolean ) ) (otherlv_4= 'min=' ( (lv_minTextLength_5_0= RULE_INT ) ) )? (otherlv_6= 'max=' ( (lv_maxTextLength_7_0= RULE_INT ) ) )? otherlv_8= ']' )
            {
            // InternalEntityDsl.g:554:2: ( ( (lv_name_0_0= 'TextBox' ) ) otherlv_1= '[' otherlv_2= 'required=' ( (lv_required_3_0= ruleBoolean ) ) (otherlv_4= 'min=' ( (lv_minTextLength_5_0= RULE_INT ) ) )? (otherlv_6= 'max=' ( (lv_maxTextLength_7_0= RULE_INT ) ) )? otherlv_8= ']' )
            // InternalEntityDsl.g:555:3: ( (lv_name_0_0= 'TextBox' ) ) otherlv_1= '[' otherlv_2= 'required=' ( (lv_required_3_0= ruleBoolean ) ) (otherlv_4= 'min=' ( (lv_minTextLength_5_0= RULE_INT ) ) )? (otherlv_6= 'max=' ( (lv_maxTextLength_7_0= RULE_INT ) ) )? otherlv_8= ']'
            {
            // InternalEntityDsl.g:555:3: ( (lv_name_0_0= 'TextBox' ) )
            // InternalEntityDsl.g:556:4: (lv_name_0_0= 'TextBox' )
            {
            // InternalEntityDsl.g:556:4: (lv_name_0_0= 'TextBox' )
            // InternalEntityDsl.g:557:5: lv_name_0_0= 'TextBox'
            {
            lv_name_0_0=(Token)match(input,24,FOLLOW_8); 

            					newLeafNode(lv_name_0_0, grammarAccess.getTextBoxAccess().getNameTextBoxKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTextBoxRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "TextBox");
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getTextBoxAccess().getLeftSquareBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getTextBoxAccess().getRequiredKeyword_2());
            		
            // InternalEntityDsl.g:577:3: ( (lv_required_3_0= ruleBoolean ) )
            // InternalEntityDsl.g:578:4: (lv_required_3_0= ruleBoolean )
            {
            // InternalEntityDsl.g:578:4: (lv_required_3_0= ruleBoolean )
            // InternalEntityDsl.g:579:5: lv_required_3_0= ruleBoolean
            {

            					newCompositeNode(grammarAccess.getTextBoxAccess().getRequiredBooleanParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_16);
            lv_required_3_0=ruleBoolean();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTextBoxRule());
            					}
            					set(
            						current,
            						"required",
            						lv_required_3_0,
            						"org.xtext.EntityDsl.Boolean");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEntityDsl.g:596:3: (otherlv_4= 'min=' ( (lv_minTextLength_5_0= RULE_INT ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==25) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalEntityDsl.g:597:4: otherlv_4= 'min=' ( (lv_minTextLength_5_0= RULE_INT ) )
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_17); 

                    				newLeafNode(otherlv_4, grammarAccess.getTextBoxAccess().getMinKeyword_4_0());
                    			
                    // InternalEntityDsl.g:601:4: ( (lv_minTextLength_5_0= RULE_INT ) )
                    // InternalEntityDsl.g:602:5: (lv_minTextLength_5_0= RULE_INT )
                    {
                    // InternalEntityDsl.g:602:5: (lv_minTextLength_5_0= RULE_INT )
                    // InternalEntityDsl.g:603:6: lv_minTextLength_5_0= RULE_INT
                    {
                    lv_minTextLength_5_0=(Token)match(input,RULE_INT,FOLLOW_18); 

                    						newLeafNode(lv_minTextLength_5_0, grammarAccess.getTextBoxAccess().getMinTextLengthINTTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTextBoxRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"minTextLength",
                    							lv_minTextLength_5_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEntityDsl.g:620:3: (otherlv_6= 'max=' ( (lv_maxTextLength_7_0= RULE_INT ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==26) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalEntityDsl.g:621:4: otherlv_6= 'max=' ( (lv_maxTextLength_7_0= RULE_INT ) )
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_17); 

                    				newLeafNode(otherlv_6, grammarAccess.getTextBoxAccess().getMaxKeyword_5_0());
                    			
                    // InternalEntityDsl.g:625:4: ( (lv_maxTextLength_7_0= RULE_INT ) )
                    // InternalEntityDsl.g:626:5: (lv_maxTextLength_7_0= RULE_INT )
                    {
                    // InternalEntityDsl.g:626:5: (lv_maxTextLength_7_0= RULE_INT )
                    // InternalEntityDsl.g:627:6: lv_maxTextLength_7_0= RULE_INT
                    {
                    lv_maxTextLength_7_0=(Token)match(input,RULE_INT,FOLLOW_11); 

                    						newLeafNode(lv_maxTextLength_7_0, grammarAccess.getTextBoxAccess().getMaxTextLengthINTTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTextBoxRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"maxTextLength",
                    							lv_maxTextLength_7_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getTextBoxAccess().getRightSquareBracketKeyword_6());
            		

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
    // $ANTLR end "ruleTextBox"


    // $ANTLR start "entryRuleBoolean"
    // InternalEntityDsl.g:652:1: entryRuleBoolean returns [EObject current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final EObject entryRuleBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolean = null;


        try {
            // InternalEntityDsl.g:652:48: (iv_ruleBoolean= ruleBoolean EOF )
            // InternalEntityDsl.g:653:2: iv_ruleBoolean= ruleBoolean EOF
            {
             newCompositeNode(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoolean=ruleBoolean();

            state._fsp--;

             current =iv_ruleBoolean; 
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
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // InternalEntityDsl.g:659:1: ruleBoolean returns [EObject current=null] : ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) ) ;
    public final EObject ruleBoolean() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;


        	enterRule();

        try {
            // InternalEntityDsl.g:665:2: ( ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) ) )
            // InternalEntityDsl.g:666:2: ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) )
            {
            // InternalEntityDsl.g:666:2: ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) )
            // InternalEntityDsl.g:667:3: ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) )
            {
            // InternalEntityDsl.g:667:3: ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) )
            // InternalEntityDsl.g:668:4: (lv_value_0_1= 'true' | lv_value_0_2= 'false' )
            {
            // InternalEntityDsl.g:668:4: (lv_value_0_1= 'true' | lv_value_0_2= 'false' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==27) ) {
                alt7=1;
            }
            else if ( (LA7_0==28) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalEntityDsl.g:669:5: lv_value_0_1= 'true'
                    {
                    lv_value_0_1=(Token)match(input,27,FOLLOW_2); 

                    					newLeafNode(lv_value_0_1, grammarAccess.getBooleanAccess().getValueTrueKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBooleanRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalEntityDsl.g:680:5: lv_value_0_2= 'false'
                    {
                    lv_value_0_2=(Token)match(input,28,FOLLOW_2); 

                    					newLeafNode(lv_value_0_2, grammarAccess.getBooleanAccess().getValueFalseKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBooleanRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_2, null);
                    				

                    }
                    break;

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
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRuleComboBox"
    // InternalEntityDsl.g:696:1: entryRuleComboBox returns [EObject current=null] : iv_ruleComboBox= ruleComboBox EOF ;
    public final EObject entryRuleComboBox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComboBox = null;


        try {
            // InternalEntityDsl.g:696:49: (iv_ruleComboBox= ruleComboBox EOF )
            // InternalEntityDsl.g:697:2: iv_ruleComboBox= ruleComboBox EOF
            {
             newCompositeNode(grammarAccess.getComboBoxRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComboBox=ruleComboBox();

            state._fsp--;

             current =iv_ruleComboBox; 
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
    // $ANTLR end "entryRuleComboBox"


    // $ANTLR start "ruleComboBox"
    // InternalEntityDsl.g:703:1: ruleComboBox returns [EObject current=null] : ( ( (lv_name_0_0= 'ComboBox' ) ) otherlv_1= '(' ( (lv_items_2_0= ruleComboBoxItem ) )* otherlv_3= ')' otherlv_4= '[' otherlv_5= 'required=' ( (lv_required_6_0= ruleBoolean ) ) otherlv_7= ']' ) ;
    public final EObject ruleComboBox() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_items_2_0 = null;

        EObject lv_required_6_0 = null;



        	enterRule();

        try {
            // InternalEntityDsl.g:709:2: ( ( ( (lv_name_0_0= 'ComboBox' ) ) otherlv_1= '(' ( (lv_items_2_0= ruleComboBoxItem ) )* otherlv_3= ')' otherlv_4= '[' otherlv_5= 'required=' ( (lv_required_6_0= ruleBoolean ) ) otherlv_7= ']' ) )
            // InternalEntityDsl.g:710:2: ( ( (lv_name_0_0= 'ComboBox' ) ) otherlv_1= '(' ( (lv_items_2_0= ruleComboBoxItem ) )* otherlv_3= ')' otherlv_4= '[' otherlv_5= 'required=' ( (lv_required_6_0= ruleBoolean ) ) otherlv_7= ']' )
            {
            // InternalEntityDsl.g:710:2: ( ( (lv_name_0_0= 'ComboBox' ) ) otherlv_1= '(' ( (lv_items_2_0= ruleComboBoxItem ) )* otherlv_3= ')' otherlv_4= '[' otherlv_5= 'required=' ( (lv_required_6_0= ruleBoolean ) ) otherlv_7= ']' )
            // InternalEntityDsl.g:711:3: ( (lv_name_0_0= 'ComboBox' ) ) otherlv_1= '(' ( (lv_items_2_0= ruleComboBoxItem ) )* otherlv_3= ')' otherlv_4= '[' otherlv_5= 'required=' ( (lv_required_6_0= ruleBoolean ) ) otherlv_7= ']'
            {
            // InternalEntityDsl.g:711:3: ( (lv_name_0_0= 'ComboBox' ) )
            // InternalEntityDsl.g:712:4: (lv_name_0_0= 'ComboBox' )
            {
            // InternalEntityDsl.g:712:4: (lv_name_0_0= 'ComboBox' )
            // InternalEntityDsl.g:713:5: lv_name_0_0= 'ComboBox'
            {
            lv_name_0_0=(Token)match(input,29,FOLLOW_12); 

            					newLeafNode(lv_name_0_0, grammarAccess.getComboBoxAccess().getNameComboBoxKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComboBoxRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "ComboBox");
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getComboBoxAccess().getLeftParenthesisKeyword_1());
            		
            // InternalEntityDsl.g:729:3: ( (lv_items_2_0= ruleComboBoxItem ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalEntityDsl.g:730:4: (lv_items_2_0= ruleComboBoxItem )
            	    {
            	    // InternalEntityDsl.g:730:4: (lv_items_2_0= ruleComboBoxItem )
            	    // InternalEntityDsl.g:731:5: lv_items_2_0= ruleComboBoxItem
            	    {

            	    					newCompositeNode(grammarAccess.getComboBoxAccess().getItemsComboBoxItemParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_items_2_0=ruleComboBoxItem();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getComboBoxRule());
            	    					}
            	    					add(
            	    						current,
            	    						"items",
            	    						lv_items_2_0,
            	    						"org.xtext.EntityDsl.ComboBoxItem");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_3=(Token)match(input,21,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getComboBoxAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getComboBoxAccess().getLeftSquareBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,22,FOLLOW_15); 

            			newLeafNode(otherlv_5, grammarAccess.getComboBoxAccess().getRequiredKeyword_5());
            		
            // InternalEntityDsl.g:760:3: ( (lv_required_6_0= ruleBoolean ) )
            // InternalEntityDsl.g:761:4: (lv_required_6_0= ruleBoolean )
            {
            // InternalEntityDsl.g:761:4: (lv_required_6_0= ruleBoolean )
            // InternalEntityDsl.g:762:5: lv_required_6_0= ruleBoolean
            {

            					newCompositeNode(grammarAccess.getComboBoxAccess().getRequiredBooleanParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_11);
            lv_required_6_0=ruleBoolean();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComboBoxRule());
            					}
            					set(
            						current,
            						"required",
            						lv_required_6_0,
            						"org.xtext.EntityDsl.Boolean");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getComboBoxAccess().getRightSquareBracketKeyword_7());
            		

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
    // $ANTLR end "ruleComboBox"


    // $ANTLR start "entryRuleComboBoxItem"
    // InternalEntityDsl.g:787:1: entryRuleComboBoxItem returns [EObject current=null] : iv_ruleComboBoxItem= ruleComboBoxItem EOF ;
    public final EObject entryRuleComboBoxItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComboBoxItem = null;


        try {
            // InternalEntityDsl.g:787:53: (iv_ruleComboBoxItem= ruleComboBoxItem EOF )
            // InternalEntityDsl.g:788:2: iv_ruleComboBoxItem= ruleComboBoxItem EOF
            {
             newCompositeNode(grammarAccess.getComboBoxItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComboBoxItem=ruleComboBoxItem();

            state._fsp--;

             current =iv_ruleComboBoxItem; 
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
    // $ANTLR end "entryRuleComboBoxItem"


    // $ANTLR start "ruleComboBoxItem"
    // InternalEntityDsl.g:794:1: ruleComboBoxItem returns [EObject current=null] : ( (lv_text_0_0= RULE_ID ) ) ;
    public final EObject ruleComboBoxItem() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;


        	enterRule();

        try {
            // InternalEntityDsl.g:800:2: ( ( (lv_text_0_0= RULE_ID ) ) )
            // InternalEntityDsl.g:801:2: ( (lv_text_0_0= RULE_ID ) )
            {
            // InternalEntityDsl.g:801:2: ( (lv_text_0_0= RULE_ID ) )
            // InternalEntityDsl.g:802:3: (lv_text_0_0= RULE_ID )
            {
            // InternalEntityDsl.g:802:3: (lv_text_0_0= RULE_ID )
            // InternalEntityDsl.g:803:4: lv_text_0_0= RULE_ID
            {
            lv_text_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_text_0_0, grammarAccess.getComboBoxItemAccess().getTextIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getComboBoxItemRule());
            				}
            				setWithLastConsumed(
            					current,
            					"text",
            					lv_text_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleComboBoxItem"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000021880000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000006040000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004040000L});

}