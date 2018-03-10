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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'database:'", "'entity'", "'{'", "'}'", "'*'", "':'", "'['", "','", "']'", "'string'", "'int'", "'double'", "'Spinner'", "'('", "')'", "'RadioButtonGroup'", "'CheckBox'", "'TextBox'", "'ComboBox'"
    };
    public static final int RULE_STRING=5;
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
    public static final int RULE_INT=6;
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

                if ( (LA2_0==RULE_ID||LA2_0==15) ) {
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
    // InternalEntityDsl.g:199:1: ruleAttribute returns [EObject current=null] : ( ( (lv_required_0_0= '*' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '[' ( (lv_inputType_4_0= ruleWinFormControlType ) ) otherlv_5= ',' ( (lv_labelText_6_0= ruleLabel ) ) otherlv_7= ']' ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_required_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_inputType_4_0 = null;

        EObject lv_labelText_6_0 = null;



        	enterRule();

        try {
            // InternalEntityDsl.g:205:2: ( ( ( (lv_required_0_0= '*' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '[' ( (lv_inputType_4_0= ruleWinFormControlType ) ) otherlv_5= ',' ( (lv_labelText_6_0= ruleLabel ) ) otherlv_7= ']' ) )
            // InternalEntityDsl.g:206:2: ( ( (lv_required_0_0= '*' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '[' ( (lv_inputType_4_0= ruleWinFormControlType ) ) otherlv_5= ',' ( (lv_labelText_6_0= ruleLabel ) ) otherlv_7= ']' )
            {
            // InternalEntityDsl.g:206:2: ( ( (lv_required_0_0= '*' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '[' ( (lv_inputType_4_0= ruleWinFormControlType ) ) otherlv_5= ',' ( (lv_labelText_6_0= ruleLabel ) ) otherlv_7= ']' )
            // InternalEntityDsl.g:207:3: ( (lv_required_0_0= '*' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '[' ( (lv_inputType_4_0= ruleWinFormControlType ) ) otherlv_5= ',' ( (lv_labelText_6_0= ruleLabel ) ) otherlv_7= ']'
            {
            // InternalEntityDsl.g:207:3: ( (lv_required_0_0= '*' ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalEntityDsl.g:208:4: (lv_required_0_0= '*' )
                    {
                    // InternalEntityDsl.g:208:4: (lv_required_0_0= '*' )
                    // InternalEntityDsl.g:209:5: lv_required_0_0= '*'
                    {
                    lv_required_0_0=(Token)match(input,15,FOLLOW_3); 

                    					newLeafNode(lv_required_0_0, grammarAccess.getAttributeAccess().getRequiredAsteriskKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(current, "required", lv_required_0_0, "*");
                    				

                    }


                    }
                    break;

            }

            // InternalEntityDsl.g:221:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEntityDsl.g:222:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEntityDsl.g:222:4: (lv_name_1_0= RULE_ID )
            // InternalEntityDsl.g:223:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalEntityDsl.g:247:3: ( (lv_inputType_4_0= ruleWinFormControlType ) )
            // InternalEntityDsl.g:248:4: (lv_inputType_4_0= ruleWinFormControlType )
            {
            // InternalEntityDsl.g:248:4: (lv_inputType_4_0= ruleWinFormControlType )
            // InternalEntityDsl.g:249:5: lv_inputType_4_0= ruleWinFormControlType
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getInputTypeWinFormControlTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_10);
            lv_inputType_4_0=ruleWinFormControlType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"inputType",
            						lv_inputType_4_0,
            						"org.xtext.EntityDsl.WinFormControlType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getCommaKeyword_5());
            		
            // InternalEntityDsl.g:270:3: ( (lv_labelText_6_0= ruleLabel ) )
            // InternalEntityDsl.g:271:4: (lv_labelText_6_0= ruleLabel )
            {
            // InternalEntityDsl.g:271:4: (lv_labelText_6_0= ruleLabel )
            // InternalEntityDsl.g:272:5: lv_labelText_6_0= ruleLabel
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getLabelTextLabelParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_12);
            lv_labelText_6_0=ruleLabel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"labelText",
            						lv_labelText_6_0,
            						"org.xtext.EntityDsl.Label");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_7());
            		

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


    // $ANTLR start "entryRuleDataType"
    // InternalEntityDsl.g:297:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalEntityDsl.g:297:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalEntityDsl.g:298:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType; 
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
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalEntityDsl.g:304:1: ruleDataType returns [EObject current=null] : ( ( (lv_type_0_1= 'string' | lv_type_0_2= 'int' | lv_type_0_3= 'double' ) ) ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_1=null;
        Token lv_type_0_2=null;
        Token lv_type_0_3=null;


        	enterRule();

        try {
            // InternalEntityDsl.g:310:2: ( ( ( (lv_type_0_1= 'string' | lv_type_0_2= 'int' | lv_type_0_3= 'double' ) ) ) )
            // InternalEntityDsl.g:311:2: ( ( (lv_type_0_1= 'string' | lv_type_0_2= 'int' | lv_type_0_3= 'double' ) ) )
            {
            // InternalEntityDsl.g:311:2: ( ( (lv_type_0_1= 'string' | lv_type_0_2= 'int' | lv_type_0_3= 'double' ) ) )
            // InternalEntityDsl.g:312:3: ( (lv_type_0_1= 'string' | lv_type_0_2= 'int' | lv_type_0_3= 'double' ) )
            {
            // InternalEntityDsl.g:312:3: ( (lv_type_0_1= 'string' | lv_type_0_2= 'int' | lv_type_0_3= 'double' ) )
            // InternalEntityDsl.g:313:4: (lv_type_0_1= 'string' | lv_type_0_2= 'int' | lv_type_0_3= 'double' )
            {
            // InternalEntityDsl.g:313:4: (lv_type_0_1= 'string' | lv_type_0_2= 'int' | lv_type_0_3= 'double' )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt4=1;
                }
                break;
            case 21:
                {
                alt4=2;
                }
                break;
            case 22:
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
                    // InternalEntityDsl.g:314:5: lv_type_0_1= 'string'
                    {
                    lv_type_0_1=(Token)match(input,20,FOLLOW_2); 

                    					newLeafNode(lv_type_0_1, grammarAccess.getDataTypeAccess().getTypeStringKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDataTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalEntityDsl.g:325:5: lv_type_0_2= 'int'
                    {
                    lv_type_0_2=(Token)match(input,21,FOLLOW_2); 

                    					newLeafNode(lv_type_0_2, grammarAccess.getDataTypeAccess().getTypeIntKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDataTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalEntityDsl.g:336:5: lv_type_0_3= 'double'
                    {
                    lv_type_0_3=(Token)match(input,22,FOLLOW_2); 

                    					newLeafNode(lv_type_0_3, grammarAccess.getDataTypeAccess().getTypeDoubleKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDataTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_3, null);
                    				

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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleLabel"
    // InternalEntityDsl.g:352:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // InternalEntityDsl.g:352:46: (iv_ruleLabel= ruleLabel EOF )
            // InternalEntityDsl.g:353:2: iv_ruleLabel= ruleLabel EOF
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
    // InternalEntityDsl.g:359:1: ruleLabel returns [EObject current=null] : ( (lv_text_0_0= RULE_STRING ) ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;


        	enterRule();

        try {
            // InternalEntityDsl.g:365:2: ( ( (lv_text_0_0= RULE_STRING ) ) )
            // InternalEntityDsl.g:366:2: ( (lv_text_0_0= RULE_STRING ) )
            {
            // InternalEntityDsl.g:366:2: ( (lv_text_0_0= RULE_STRING ) )
            // InternalEntityDsl.g:367:3: (lv_text_0_0= RULE_STRING )
            {
            // InternalEntityDsl.g:367:3: (lv_text_0_0= RULE_STRING )
            // InternalEntityDsl.g:368:4: lv_text_0_0= RULE_STRING
            {
            lv_text_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_text_0_0, grammarAccess.getLabelAccess().getTextSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getLabelRule());
            				}
            				setWithLastConsumed(
            					current,
            					"text",
            					lv_text_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // InternalEntityDsl.g:387:1: entryRuleWinFormControlType returns [EObject current=null] : iv_ruleWinFormControlType= ruleWinFormControlType EOF ;
    public final EObject entryRuleWinFormControlType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWinFormControlType = null;


        try {
            // InternalEntityDsl.g:387:59: (iv_ruleWinFormControlType= ruleWinFormControlType EOF )
            // InternalEntityDsl.g:388:2: iv_ruleWinFormControlType= ruleWinFormControlType EOF
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
    // InternalEntityDsl.g:394:1: ruleWinFormControlType returns [EObject current=null] : ( ( (lv_controlType_0_0= ruleTextBox ) ) | this_ComboBox_1= ruleComboBox | this_CheckBox_2= ruleCheckBox | this_RadioButtonGroup_3= ruleRadioButtonGroup | this_Spinner_4= ruleSpinner ) ;
    public final EObject ruleWinFormControlType() throws RecognitionException {
        EObject current = null;

        EObject lv_controlType_0_0 = null;

        EObject this_ComboBox_1 = null;

        EObject this_CheckBox_2 = null;

        EObject this_RadioButtonGroup_3 = null;

        EObject this_Spinner_4 = null;



        	enterRule();

        try {
            // InternalEntityDsl.g:400:2: ( ( ( (lv_controlType_0_0= ruleTextBox ) ) | this_ComboBox_1= ruleComboBox | this_CheckBox_2= ruleCheckBox | this_RadioButtonGroup_3= ruleRadioButtonGroup | this_Spinner_4= ruleSpinner ) )
            // InternalEntityDsl.g:401:2: ( ( (lv_controlType_0_0= ruleTextBox ) ) | this_ComboBox_1= ruleComboBox | this_CheckBox_2= ruleCheckBox | this_RadioButtonGroup_3= ruleRadioButtonGroup | this_Spinner_4= ruleSpinner )
            {
            // InternalEntityDsl.g:401:2: ( ( (lv_controlType_0_0= ruleTextBox ) ) | this_ComboBox_1= ruleComboBox | this_CheckBox_2= ruleCheckBox | this_RadioButtonGroup_3= ruleRadioButtonGroup | this_Spinner_4= ruleSpinner )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt5=1;
                }
                break;
            case 29:
                {
                alt5=2;
                }
                break;
            case 27:
                {
                alt5=3;
                }
                break;
            case 26:
                {
                alt5=4;
                }
                break;
            case 23:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalEntityDsl.g:402:3: ( (lv_controlType_0_0= ruleTextBox ) )
                    {
                    // InternalEntityDsl.g:402:3: ( (lv_controlType_0_0= ruleTextBox ) )
                    // InternalEntityDsl.g:403:4: (lv_controlType_0_0= ruleTextBox )
                    {
                    // InternalEntityDsl.g:403:4: (lv_controlType_0_0= ruleTextBox )
                    // InternalEntityDsl.g:404:5: lv_controlType_0_0= ruleTextBox
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
                    // InternalEntityDsl.g:422:3: this_ComboBox_1= ruleComboBox
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
                    // InternalEntityDsl.g:431:3: this_CheckBox_2= ruleCheckBox
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
                    // InternalEntityDsl.g:440:3: this_RadioButtonGroup_3= ruleRadioButtonGroup
                    {

                    			newCompositeNode(grammarAccess.getWinFormControlTypeAccess().getRadioButtonGroupParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_RadioButtonGroup_3=ruleRadioButtonGroup();

                    state._fsp--;


                    			current = this_RadioButtonGroup_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalEntityDsl.g:449:3: this_Spinner_4= ruleSpinner
                    {

                    			newCompositeNode(grammarAccess.getWinFormControlTypeAccess().getSpinnerParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Spinner_4=ruleSpinner();

                    state._fsp--;


                    			current = this_Spinner_4;
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


    // $ANTLR start "entryRuleSpinner"
    // InternalEntityDsl.g:461:1: entryRuleSpinner returns [EObject current=null] : iv_ruleSpinner= ruleSpinner EOF ;
    public final EObject entryRuleSpinner() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpinner = null;


        try {
            // InternalEntityDsl.g:461:48: (iv_ruleSpinner= ruleSpinner EOF )
            // InternalEntityDsl.g:462:2: iv_ruleSpinner= ruleSpinner EOF
            {
             newCompositeNode(grammarAccess.getSpinnerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpinner=ruleSpinner();

            state._fsp--;

             current =iv_ruleSpinner; 
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
    // $ANTLR end "entryRuleSpinner"


    // $ANTLR start "ruleSpinner"
    // InternalEntityDsl.g:468:1: ruleSpinner returns [EObject current=null] : ( ( (lv_name_0_0= 'Spinner' ) ) otherlv_1= '[' ( (lv_defaultValue_2_0= RULE_INT ) ) otherlv_3= ',' otherlv_4= '(' ( (lv_minimumValue_5_0= RULE_INT ) ) otherlv_6= ',' ( (lv_maximumValue_7_0= RULE_INT ) ) otherlv_8= ')' otherlv_9= ']' ) ;
    public final EObject ruleSpinner() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_defaultValue_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_minimumValue_5_0=null;
        Token otherlv_6=null;
        Token lv_maximumValue_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalEntityDsl.g:474:2: ( ( ( (lv_name_0_0= 'Spinner' ) ) otherlv_1= '[' ( (lv_defaultValue_2_0= RULE_INT ) ) otherlv_3= ',' otherlv_4= '(' ( (lv_minimumValue_5_0= RULE_INT ) ) otherlv_6= ',' ( (lv_maximumValue_7_0= RULE_INT ) ) otherlv_8= ')' otherlv_9= ']' ) )
            // InternalEntityDsl.g:475:2: ( ( (lv_name_0_0= 'Spinner' ) ) otherlv_1= '[' ( (lv_defaultValue_2_0= RULE_INT ) ) otherlv_3= ',' otherlv_4= '(' ( (lv_minimumValue_5_0= RULE_INT ) ) otherlv_6= ',' ( (lv_maximumValue_7_0= RULE_INT ) ) otherlv_8= ')' otherlv_9= ']' )
            {
            // InternalEntityDsl.g:475:2: ( ( (lv_name_0_0= 'Spinner' ) ) otherlv_1= '[' ( (lv_defaultValue_2_0= RULE_INT ) ) otherlv_3= ',' otherlv_4= '(' ( (lv_minimumValue_5_0= RULE_INT ) ) otherlv_6= ',' ( (lv_maximumValue_7_0= RULE_INT ) ) otherlv_8= ')' otherlv_9= ']' )
            // InternalEntityDsl.g:476:3: ( (lv_name_0_0= 'Spinner' ) ) otherlv_1= '[' ( (lv_defaultValue_2_0= RULE_INT ) ) otherlv_3= ',' otherlv_4= '(' ( (lv_minimumValue_5_0= RULE_INT ) ) otherlv_6= ',' ( (lv_maximumValue_7_0= RULE_INT ) ) otherlv_8= ')' otherlv_9= ']'
            {
            // InternalEntityDsl.g:476:3: ( (lv_name_0_0= 'Spinner' ) )
            // InternalEntityDsl.g:477:4: (lv_name_0_0= 'Spinner' )
            {
            // InternalEntityDsl.g:477:4: (lv_name_0_0= 'Spinner' )
            // InternalEntityDsl.g:478:5: lv_name_0_0= 'Spinner'
            {
            lv_name_0_0=(Token)match(input,23,FOLLOW_8); 

            					newLeafNode(lv_name_0_0, grammarAccess.getSpinnerAccess().getNameSpinnerKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSpinnerRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "Spinner");
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getSpinnerAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalEntityDsl.g:494:3: ( (lv_defaultValue_2_0= RULE_INT ) )
            // InternalEntityDsl.g:495:4: (lv_defaultValue_2_0= RULE_INT )
            {
            // InternalEntityDsl.g:495:4: (lv_defaultValue_2_0= RULE_INT )
            // InternalEntityDsl.g:496:5: lv_defaultValue_2_0= RULE_INT
            {
            lv_defaultValue_2_0=(Token)match(input,RULE_INT,FOLLOW_10); 

            					newLeafNode(lv_defaultValue_2_0, grammarAccess.getSpinnerAccess().getDefaultValueINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSpinnerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"defaultValue",
            						lv_defaultValue_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getSpinnerAccess().getCommaKeyword_3());
            		
            otherlv_4=(Token)match(input,24,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getSpinnerAccess().getLeftParenthesisKeyword_4());
            		
            // InternalEntityDsl.g:520:3: ( (lv_minimumValue_5_0= RULE_INT ) )
            // InternalEntityDsl.g:521:4: (lv_minimumValue_5_0= RULE_INT )
            {
            // InternalEntityDsl.g:521:4: (lv_minimumValue_5_0= RULE_INT )
            // InternalEntityDsl.g:522:5: lv_minimumValue_5_0= RULE_INT
            {
            lv_minimumValue_5_0=(Token)match(input,RULE_INT,FOLLOW_10); 

            					newLeafNode(lv_minimumValue_5_0, grammarAccess.getSpinnerAccess().getMinimumValueINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSpinnerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"minimumValue",
            						lv_minimumValue_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getSpinnerAccess().getCommaKeyword_6());
            		
            // InternalEntityDsl.g:542:3: ( (lv_maximumValue_7_0= RULE_INT ) )
            // InternalEntityDsl.g:543:4: (lv_maximumValue_7_0= RULE_INT )
            {
            // InternalEntityDsl.g:543:4: (lv_maximumValue_7_0= RULE_INT )
            // InternalEntityDsl.g:544:5: lv_maximumValue_7_0= RULE_INT
            {
            lv_maximumValue_7_0=(Token)match(input,RULE_INT,FOLLOW_15); 

            					newLeafNode(lv_maximumValue_7_0, grammarAccess.getSpinnerAccess().getMaximumValueINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSpinnerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"maximumValue",
            						lv_maximumValue_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_8=(Token)match(input,25,FOLLOW_12); 

            			newLeafNode(otherlv_8, grammarAccess.getSpinnerAccess().getRightParenthesisKeyword_8());
            		
            otherlv_9=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getSpinnerAccess().getRightSquareBracketKeyword_9());
            		

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
    // $ANTLR end "ruleSpinner"


    // $ANTLR start "entryRuleRadioButtonGroup"
    // InternalEntityDsl.g:572:1: entryRuleRadioButtonGroup returns [EObject current=null] : iv_ruleRadioButtonGroup= ruleRadioButtonGroup EOF ;
    public final EObject entryRuleRadioButtonGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRadioButtonGroup = null;


        try {
            // InternalEntityDsl.g:572:57: (iv_ruleRadioButtonGroup= ruleRadioButtonGroup EOF )
            // InternalEntityDsl.g:573:2: iv_ruleRadioButtonGroup= ruleRadioButtonGroup EOF
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
    // InternalEntityDsl.g:579:1: ruleRadioButtonGroup returns [EObject current=null] : ( ( (lv_name_0_0= 'RadioButtonGroup' ) ) otherlv_1= '(' ( (lv_buttons_2_0= ruleRadioButton ) )* otherlv_3= ')' otherlv_4= '[' ( (lv_dataType_5_0= ruleDataType ) ) otherlv_6= ']' ) ;
    public final EObject ruleRadioButtonGroup() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_buttons_2_0 = null;

        EObject lv_dataType_5_0 = null;



        	enterRule();

        try {
            // InternalEntityDsl.g:585:2: ( ( ( (lv_name_0_0= 'RadioButtonGroup' ) ) otherlv_1= '(' ( (lv_buttons_2_0= ruleRadioButton ) )* otherlv_3= ')' otherlv_4= '[' ( (lv_dataType_5_0= ruleDataType ) ) otherlv_6= ']' ) )
            // InternalEntityDsl.g:586:2: ( ( (lv_name_0_0= 'RadioButtonGroup' ) ) otherlv_1= '(' ( (lv_buttons_2_0= ruleRadioButton ) )* otherlv_3= ')' otherlv_4= '[' ( (lv_dataType_5_0= ruleDataType ) ) otherlv_6= ']' )
            {
            // InternalEntityDsl.g:586:2: ( ( (lv_name_0_0= 'RadioButtonGroup' ) ) otherlv_1= '(' ( (lv_buttons_2_0= ruleRadioButton ) )* otherlv_3= ')' otherlv_4= '[' ( (lv_dataType_5_0= ruleDataType ) ) otherlv_6= ']' )
            // InternalEntityDsl.g:587:3: ( (lv_name_0_0= 'RadioButtonGroup' ) ) otherlv_1= '(' ( (lv_buttons_2_0= ruleRadioButton ) )* otherlv_3= ')' otherlv_4= '[' ( (lv_dataType_5_0= ruleDataType ) ) otherlv_6= ']'
            {
            // InternalEntityDsl.g:587:3: ( (lv_name_0_0= 'RadioButtonGroup' ) )
            // InternalEntityDsl.g:588:4: (lv_name_0_0= 'RadioButtonGroup' )
            {
            // InternalEntityDsl.g:588:4: (lv_name_0_0= 'RadioButtonGroup' )
            // InternalEntityDsl.g:589:5: lv_name_0_0= 'RadioButtonGroup'
            {
            lv_name_0_0=(Token)match(input,26,FOLLOW_14); 

            					newLeafNode(lv_name_0_0, grammarAccess.getRadioButtonGroupAccess().getNameRadioButtonGroupKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRadioButtonGroupRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "RadioButtonGroup");
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getRadioButtonGroupAccess().getLeftParenthesisKeyword_1());
            		
            // InternalEntityDsl.g:605:3: ( (lv_buttons_2_0= ruleRadioButton ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_STRING) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalEntityDsl.g:606:4: (lv_buttons_2_0= ruleRadioButton )
            	    {
            	    // InternalEntityDsl.g:606:4: (lv_buttons_2_0= ruleRadioButton )
            	    // InternalEntityDsl.g:607:5: lv_buttons_2_0= ruleRadioButton
            	    {

            	    					newCompositeNode(grammarAccess.getRadioButtonGroupAccess().getButtonsRadioButtonParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_16);
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
            	    break loop6;
                }
            } while (true);

            otherlv_3=(Token)match(input,25,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getRadioButtonGroupAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,17,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getRadioButtonGroupAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalEntityDsl.g:632:3: ( (lv_dataType_5_0= ruleDataType ) )
            // InternalEntityDsl.g:633:4: (lv_dataType_5_0= ruleDataType )
            {
            // InternalEntityDsl.g:633:4: (lv_dataType_5_0= ruleDataType )
            // InternalEntityDsl.g:634:5: lv_dataType_5_0= ruleDataType
            {

            					newCompositeNode(grammarAccess.getRadioButtonGroupAccess().getDataTypeDataTypeParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_12);
            lv_dataType_5_0=ruleDataType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRadioButtonGroupRule());
            					}
            					set(
            						current,
            						"dataType",
            						lv_dataType_5_0,
            						"org.xtext.EntityDsl.DataType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getRadioButtonGroupAccess().getRightSquareBracketKeyword_6());
            		

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
    // InternalEntityDsl.g:659:1: entryRuleRadioButton returns [EObject current=null] : iv_ruleRadioButton= ruleRadioButton EOF ;
    public final EObject entryRuleRadioButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRadioButton = null;


        try {
            // InternalEntityDsl.g:659:52: (iv_ruleRadioButton= ruleRadioButton EOF )
            // InternalEntityDsl.g:660:2: iv_ruleRadioButton= ruleRadioButton EOF
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
    // InternalEntityDsl.g:666:1: ruleRadioButton returns [EObject current=null] : ( (lv_text_0_0= RULE_STRING ) ) ;
    public final EObject ruleRadioButton() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;


        	enterRule();

        try {
            // InternalEntityDsl.g:672:2: ( ( (lv_text_0_0= RULE_STRING ) ) )
            // InternalEntityDsl.g:673:2: ( (lv_text_0_0= RULE_STRING ) )
            {
            // InternalEntityDsl.g:673:2: ( (lv_text_0_0= RULE_STRING ) )
            // InternalEntityDsl.g:674:3: (lv_text_0_0= RULE_STRING )
            {
            // InternalEntityDsl.g:674:3: (lv_text_0_0= RULE_STRING )
            // InternalEntityDsl.g:675:4: lv_text_0_0= RULE_STRING
            {
            lv_text_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_text_0_0, grammarAccess.getRadioButtonAccess().getTextSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getRadioButtonRule());
            				}
            				setWithLastConsumed(
            					current,
            					"text",
            					lv_text_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // InternalEntityDsl.g:694:1: entryRuleCheckBox returns [EObject current=null] : iv_ruleCheckBox= ruleCheckBox EOF ;
    public final EObject entryRuleCheckBox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckBox = null;


        try {
            // InternalEntityDsl.g:694:49: (iv_ruleCheckBox= ruleCheckBox EOF )
            // InternalEntityDsl.g:695:2: iv_ruleCheckBox= ruleCheckBox EOF
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
    // InternalEntityDsl.g:701:1: ruleCheckBox returns [EObject current=null] : ( (lv_name_0_0= 'CheckBox' ) ) ;
    public final EObject ruleCheckBox() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalEntityDsl.g:707:2: ( ( (lv_name_0_0= 'CheckBox' ) ) )
            // InternalEntityDsl.g:708:2: ( (lv_name_0_0= 'CheckBox' ) )
            {
            // InternalEntityDsl.g:708:2: ( (lv_name_0_0= 'CheckBox' ) )
            // InternalEntityDsl.g:709:3: (lv_name_0_0= 'CheckBox' )
            {
            // InternalEntityDsl.g:709:3: (lv_name_0_0= 'CheckBox' )
            // InternalEntityDsl.g:710:4: lv_name_0_0= 'CheckBox'
            {
            lv_name_0_0=(Token)match(input,27,FOLLOW_2); 

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
    // InternalEntityDsl.g:725:1: entryRuleTextBox returns [EObject current=null] : iv_ruleTextBox= ruleTextBox EOF ;
    public final EObject entryRuleTextBox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextBox = null;


        try {
            // InternalEntityDsl.g:725:48: (iv_ruleTextBox= ruleTextBox EOF )
            // InternalEntityDsl.g:726:2: iv_ruleTextBox= ruleTextBox EOF
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
    // InternalEntityDsl.g:732:1: ruleTextBox returns [EObject current=null] : ( ( (lv_name_0_0= 'TextBox' ) ) otherlv_1= '[' ( (lv_dataType_2_0= ruleDataType ) ) otherlv_3= '(' ( (lv_minTextLength_4_0= RULE_INT ) )? otherlv_5= ',' ( (lv_maxTextLength_6_0= RULE_INT ) )? otherlv_7= ')' otherlv_8= ']' ) ;
    public final EObject ruleTextBox() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_minTextLength_4_0=null;
        Token otherlv_5=null;
        Token lv_maxTextLength_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_dataType_2_0 = null;



        	enterRule();

        try {
            // InternalEntityDsl.g:738:2: ( ( ( (lv_name_0_0= 'TextBox' ) ) otherlv_1= '[' ( (lv_dataType_2_0= ruleDataType ) ) otherlv_3= '(' ( (lv_minTextLength_4_0= RULE_INT ) )? otherlv_5= ',' ( (lv_maxTextLength_6_0= RULE_INT ) )? otherlv_7= ')' otherlv_8= ']' ) )
            // InternalEntityDsl.g:739:2: ( ( (lv_name_0_0= 'TextBox' ) ) otherlv_1= '[' ( (lv_dataType_2_0= ruleDataType ) ) otherlv_3= '(' ( (lv_minTextLength_4_0= RULE_INT ) )? otherlv_5= ',' ( (lv_maxTextLength_6_0= RULE_INT ) )? otherlv_7= ')' otherlv_8= ']' )
            {
            // InternalEntityDsl.g:739:2: ( ( (lv_name_0_0= 'TextBox' ) ) otherlv_1= '[' ( (lv_dataType_2_0= ruleDataType ) ) otherlv_3= '(' ( (lv_minTextLength_4_0= RULE_INT ) )? otherlv_5= ',' ( (lv_maxTextLength_6_0= RULE_INT ) )? otherlv_7= ')' otherlv_8= ']' )
            // InternalEntityDsl.g:740:3: ( (lv_name_0_0= 'TextBox' ) ) otherlv_1= '[' ( (lv_dataType_2_0= ruleDataType ) ) otherlv_3= '(' ( (lv_minTextLength_4_0= RULE_INT ) )? otherlv_5= ',' ( (lv_maxTextLength_6_0= RULE_INT ) )? otherlv_7= ')' otherlv_8= ']'
            {
            // InternalEntityDsl.g:740:3: ( (lv_name_0_0= 'TextBox' ) )
            // InternalEntityDsl.g:741:4: (lv_name_0_0= 'TextBox' )
            {
            // InternalEntityDsl.g:741:4: (lv_name_0_0= 'TextBox' )
            // InternalEntityDsl.g:742:5: lv_name_0_0= 'TextBox'
            {
            lv_name_0_0=(Token)match(input,28,FOLLOW_8); 

            					newLeafNode(lv_name_0_0, grammarAccess.getTextBoxAccess().getNameTextBoxKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTextBoxRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "TextBox");
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getTextBoxAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalEntityDsl.g:758:3: ( (lv_dataType_2_0= ruleDataType ) )
            // InternalEntityDsl.g:759:4: (lv_dataType_2_0= ruleDataType )
            {
            // InternalEntityDsl.g:759:4: (lv_dataType_2_0= ruleDataType )
            // InternalEntityDsl.g:760:5: lv_dataType_2_0= ruleDataType
            {

            					newCompositeNode(grammarAccess.getTextBoxAccess().getDataTypeDataTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
            lv_dataType_2_0=ruleDataType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTextBoxRule());
            					}
            					set(
            						current,
            						"dataType",
            						lv_dataType_2_0,
            						"org.xtext.EntityDsl.DataType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getTextBoxAccess().getLeftParenthesisKeyword_3());
            		
            // InternalEntityDsl.g:781:3: ( (lv_minTextLength_4_0= RULE_INT ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalEntityDsl.g:782:4: (lv_minTextLength_4_0= RULE_INT )
                    {
                    // InternalEntityDsl.g:782:4: (lv_minTextLength_4_0= RULE_INT )
                    // InternalEntityDsl.g:783:5: lv_minTextLength_4_0= RULE_INT
                    {
                    lv_minTextLength_4_0=(Token)match(input,RULE_INT,FOLLOW_10); 

                    					newLeafNode(lv_minTextLength_4_0, grammarAccess.getTextBoxAccess().getMinTextLengthINTTerminalRuleCall_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTextBoxRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"minTextLength",
                    						lv_minTextLength_4_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,18,FOLLOW_19); 

            			newLeafNode(otherlv_5, grammarAccess.getTextBoxAccess().getCommaKeyword_5());
            		
            // InternalEntityDsl.g:803:3: ( (lv_maxTextLength_6_0= RULE_INT ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalEntityDsl.g:804:4: (lv_maxTextLength_6_0= RULE_INT )
                    {
                    // InternalEntityDsl.g:804:4: (lv_maxTextLength_6_0= RULE_INT )
                    // InternalEntityDsl.g:805:5: lv_maxTextLength_6_0= RULE_INT
                    {
                    lv_maxTextLength_6_0=(Token)match(input,RULE_INT,FOLLOW_15); 

                    					newLeafNode(lv_maxTextLength_6_0, grammarAccess.getTextBoxAccess().getMaxTextLengthINTTerminalRuleCall_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTextBoxRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"maxTextLength",
                    						lv_maxTextLength_6_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,25,FOLLOW_12); 

            			newLeafNode(otherlv_7, grammarAccess.getTextBoxAccess().getRightParenthesisKeyword_7());
            		
            otherlv_8=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getTextBoxAccess().getRightSquareBracketKeyword_8());
            		

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


    // $ANTLR start "entryRuleComboBox"
    // InternalEntityDsl.g:833:1: entryRuleComboBox returns [EObject current=null] : iv_ruleComboBox= ruleComboBox EOF ;
    public final EObject entryRuleComboBox() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComboBox = null;


        try {
            // InternalEntityDsl.g:833:49: (iv_ruleComboBox= ruleComboBox EOF )
            // InternalEntityDsl.g:834:2: iv_ruleComboBox= ruleComboBox EOF
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
    // InternalEntityDsl.g:840:1: ruleComboBox returns [EObject current=null] : ( ( (lv_name_0_0= 'ComboBox' ) ) otherlv_1= '(' ( (lv_items_2_0= ruleComboBoxItem ) )* otherlv_3= ')' otherlv_4= '[' ( (lv_dataType_5_0= ruleDataType ) ) otherlv_6= ']' ) ;
    public final EObject ruleComboBox() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_items_2_0 = null;

        EObject lv_dataType_5_0 = null;



        	enterRule();

        try {
            // InternalEntityDsl.g:846:2: ( ( ( (lv_name_0_0= 'ComboBox' ) ) otherlv_1= '(' ( (lv_items_2_0= ruleComboBoxItem ) )* otherlv_3= ')' otherlv_4= '[' ( (lv_dataType_5_0= ruleDataType ) ) otherlv_6= ']' ) )
            // InternalEntityDsl.g:847:2: ( ( (lv_name_0_0= 'ComboBox' ) ) otherlv_1= '(' ( (lv_items_2_0= ruleComboBoxItem ) )* otherlv_3= ')' otherlv_4= '[' ( (lv_dataType_5_0= ruleDataType ) ) otherlv_6= ']' )
            {
            // InternalEntityDsl.g:847:2: ( ( (lv_name_0_0= 'ComboBox' ) ) otherlv_1= '(' ( (lv_items_2_0= ruleComboBoxItem ) )* otherlv_3= ')' otherlv_4= '[' ( (lv_dataType_5_0= ruleDataType ) ) otherlv_6= ']' )
            // InternalEntityDsl.g:848:3: ( (lv_name_0_0= 'ComboBox' ) ) otherlv_1= '(' ( (lv_items_2_0= ruleComboBoxItem ) )* otherlv_3= ')' otherlv_4= '[' ( (lv_dataType_5_0= ruleDataType ) ) otherlv_6= ']'
            {
            // InternalEntityDsl.g:848:3: ( (lv_name_0_0= 'ComboBox' ) )
            // InternalEntityDsl.g:849:4: (lv_name_0_0= 'ComboBox' )
            {
            // InternalEntityDsl.g:849:4: (lv_name_0_0= 'ComboBox' )
            // InternalEntityDsl.g:850:5: lv_name_0_0= 'ComboBox'
            {
            lv_name_0_0=(Token)match(input,29,FOLLOW_14); 

            					newLeafNode(lv_name_0_0, grammarAccess.getComboBoxAccess().getNameComboBoxKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComboBoxRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_0_0, "ComboBox");
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getComboBoxAccess().getLeftParenthesisKeyword_1());
            		
            // InternalEntityDsl.g:866:3: ( (lv_items_2_0= ruleComboBoxItem ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_STRING) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalEntityDsl.g:867:4: (lv_items_2_0= ruleComboBoxItem )
            	    {
            	    // InternalEntityDsl.g:867:4: (lv_items_2_0= ruleComboBoxItem )
            	    // InternalEntityDsl.g:868:5: lv_items_2_0= ruleComboBoxItem
            	    {

            	    					newCompositeNode(grammarAccess.getComboBoxAccess().getItemsComboBoxItemParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_16);
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
            	    break loop9;
                }
            } while (true);

            otherlv_3=(Token)match(input,25,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getComboBoxAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,17,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getComboBoxAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalEntityDsl.g:893:3: ( (lv_dataType_5_0= ruleDataType ) )
            // InternalEntityDsl.g:894:4: (lv_dataType_5_0= ruleDataType )
            {
            // InternalEntityDsl.g:894:4: (lv_dataType_5_0= ruleDataType )
            // InternalEntityDsl.g:895:5: lv_dataType_5_0= ruleDataType
            {

            					newCompositeNode(grammarAccess.getComboBoxAccess().getDataTypeDataTypeParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_12);
            lv_dataType_5_0=ruleDataType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComboBoxRule());
            					}
            					set(
            						current,
            						"dataType",
            						lv_dataType_5_0,
            						"org.xtext.EntityDsl.DataType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getComboBoxAccess().getRightSquareBracketKeyword_6());
            		

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
    // InternalEntityDsl.g:920:1: entryRuleComboBoxItem returns [EObject current=null] : iv_ruleComboBoxItem= ruleComboBoxItem EOF ;
    public final EObject entryRuleComboBoxItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComboBoxItem = null;


        try {
            // InternalEntityDsl.g:920:53: (iv_ruleComboBoxItem= ruleComboBoxItem EOF )
            // InternalEntityDsl.g:921:2: iv_ruleComboBoxItem= ruleComboBoxItem EOF
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
    // InternalEntityDsl.g:927:1: ruleComboBoxItem returns [EObject current=null] : ( (lv_text_0_0= RULE_STRING ) ) ;
    public final EObject ruleComboBoxItem() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;


        	enterRule();

        try {
            // InternalEntityDsl.g:933:2: ( ( (lv_text_0_0= RULE_STRING ) ) )
            // InternalEntityDsl.g:934:2: ( (lv_text_0_0= RULE_STRING ) )
            {
            // InternalEntityDsl.g:934:2: ( (lv_text_0_0= RULE_STRING ) )
            // InternalEntityDsl.g:935:3: (lv_text_0_0= RULE_STRING )
            {
            // InternalEntityDsl.g:935:3: (lv_text_0_0= RULE_STRING )
            // InternalEntityDsl.g:936:4: lv_text_0_0= RULE_STRING
            {
            lv_text_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_text_0_0, grammarAccess.getComboBoxItemAccess().getTextSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getComboBoxItemRule());
            				}
            				setWithLastConsumed(
            					current,
            					"text",
            					lv_text_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000003C800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000040040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000040L});

}