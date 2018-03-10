package org.xtext.ide.contentassist.antlr.internal;

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
import org.xtext.services.EntityDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEntityDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'string'", "'int'", "'double'", "'database:'", "'entity'", "'{'", "'}'", "':'", "'['", "','", "']'", "'('", "')'", "'*'", "'Spinner'", "'RadioButtonGroup'", "'CheckBox'", "'TextBox'", "'ComboBox'"
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

    	public void setGrammarAccess(EntityDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleDomainmodel"
    // InternalEntityDsl.g:53:1: entryRuleDomainmodel : ruleDomainmodel EOF ;
    public final void entryRuleDomainmodel() throws RecognitionException {
        try {
            // InternalEntityDsl.g:54:1: ( ruleDomainmodel EOF )
            // InternalEntityDsl.g:55:1: ruleDomainmodel EOF
            {
             before(grammarAccess.getDomainmodelRule()); 
            pushFollow(FOLLOW_1);
            ruleDomainmodel();

            state._fsp--;

             after(grammarAccess.getDomainmodelRule()); 
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
    // $ANTLR end "entryRuleDomainmodel"


    // $ANTLR start "ruleDomainmodel"
    // InternalEntityDsl.g:62:1: ruleDomainmodel : ( ( rule__Domainmodel__Group__0 ) ) ;
    public final void ruleDomainmodel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:66:2: ( ( ( rule__Domainmodel__Group__0 ) ) )
            // InternalEntityDsl.g:67:2: ( ( rule__Domainmodel__Group__0 ) )
            {
            // InternalEntityDsl.g:67:2: ( ( rule__Domainmodel__Group__0 ) )
            // InternalEntityDsl.g:68:3: ( rule__Domainmodel__Group__0 )
            {
             before(grammarAccess.getDomainmodelAccess().getGroup()); 
            // InternalEntityDsl.g:69:3: ( rule__Domainmodel__Group__0 )
            // InternalEntityDsl.g:69:4: rule__Domainmodel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Domainmodel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDomainmodelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDomainmodel"


    // $ANTLR start "entryRuleEntity"
    // InternalEntityDsl.g:78:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalEntityDsl.g:79:1: ( ruleEntity EOF )
            // InternalEntityDsl.g:80:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalEntityDsl.g:87:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:91:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalEntityDsl.g:92:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalEntityDsl.g:92:2: ( ( rule__Entity__Group__0 ) )
            // InternalEntityDsl.g:93:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalEntityDsl.g:94:3: ( rule__Entity__Group__0 )
            // InternalEntityDsl.g:94:4: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleAttribute"
    // InternalEntityDsl.g:103:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalEntityDsl.g:104:1: ( ruleAttribute EOF )
            // InternalEntityDsl.g:105:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalEntityDsl.g:112:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:116:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalEntityDsl.g:117:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalEntityDsl.g:117:2: ( ( rule__Attribute__Group__0 ) )
            // InternalEntityDsl.g:118:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalEntityDsl.g:119:3: ( rule__Attribute__Group__0 )
            // InternalEntityDsl.g:119:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleDataType"
    // InternalEntityDsl.g:128:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // InternalEntityDsl.g:129:1: ( ruleDataType EOF )
            // InternalEntityDsl.g:130:1: ruleDataType EOF
            {
             before(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getDataTypeRule()); 
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
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalEntityDsl.g:137:1: ruleDataType : ( ( rule__DataType__TypeAssignment ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:141:2: ( ( ( rule__DataType__TypeAssignment ) ) )
            // InternalEntityDsl.g:142:2: ( ( rule__DataType__TypeAssignment ) )
            {
            // InternalEntityDsl.g:142:2: ( ( rule__DataType__TypeAssignment ) )
            // InternalEntityDsl.g:143:3: ( rule__DataType__TypeAssignment )
            {
             before(grammarAccess.getDataTypeAccess().getTypeAssignment()); 
            // InternalEntityDsl.g:144:3: ( rule__DataType__TypeAssignment )
            // InternalEntityDsl.g:144:4: rule__DataType__TypeAssignment
            {
            pushFollow(FOLLOW_2);
            rule__DataType__TypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getTypeAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleLabel"
    // InternalEntityDsl.g:153:1: entryRuleLabel : ruleLabel EOF ;
    public final void entryRuleLabel() throws RecognitionException {
        try {
            // InternalEntityDsl.g:154:1: ( ruleLabel EOF )
            // InternalEntityDsl.g:155:1: ruleLabel EOF
            {
             before(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_1);
            ruleLabel();

            state._fsp--;

             after(grammarAccess.getLabelRule()); 
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
    // $ANTLR end "entryRuleLabel"


    // $ANTLR start "ruleLabel"
    // InternalEntityDsl.g:162:1: ruleLabel : ( ( rule__Label__TextAssignment ) ) ;
    public final void ruleLabel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:166:2: ( ( ( rule__Label__TextAssignment ) ) )
            // InternalEntityDsl.g:167:2: ( ( rule__Label__TextAssignment ) )
            {
            // InternalEntityDsl.g:167:2: ( ( rule__Label__TextAssignment ) )
            // InternalEntityDsl.g:168:3: ( rule__Label__TextAssignment )
            {
             before(grammarAccess.getLabelAccess().getTextAssignment()); 
            // InternalEntityDsl.g:169:3: ( rule__Label__TextAssignment )
            // InternalEntityDsl.g:169:4: rule__Label__TextAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Label__TextAssignment();

            state._fsp--;


            }

             after(grammarAccess.getLabelAccess().getTextAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLabel"


    // $ANTLR start "entryRuleWinFormControlType"
    // InternalEntityDsl.g:178:1: entryRuleWinFormControlType : ruleWinFormControlType EOF ;
    public final void entryRuleWinFormControlType() throws RecognitionException {
        try {
            // InternalEntityDsl.g:179:1: ( ruleWinFormControlType EOF )
            // InternalEntityDsl.g:180:1: ruleWinFormControlType EOF
            {
             before(grammarAccess.getWinFormControlTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleWinFormControlType();

            state._fsp--;

             after(grammarAccess.getWinFormControlTypeRule()); 
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
    // $ANTLR end "entryRuleWinFormControlType"


    // $ANTLR start "ruleWinFormControlType"
    // InternalEntityDsl.g:187:1: ruleWinFormControlType : ( ( rule__WinFormControlType__Alternatives ) ) ;
    public final void ruleWinFormControlType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:191:2: ( ( ( rule__WinFormControlType__Alternatives ) ) )
            // InternalEntityDsl.g:192:2: ( ( rule__WinFormControlType__Alternatives ) )
            {
            // InternalEntityDsl.g:192:2: ( ( rule__WinFormControlType__Alternatives ) )
            // InternalEntityDsl.g:193:3: ( rule__WinFormControlType__Alternatives )
            {
             before(grammarAccess.getWinFormControlTypeAccess().getAlternatives()); 
            // InternalEntityDsl.g:194:3: ( rule__WinFormControlType__Alternatives )
            // InternalEntityDsl.g:194:4: rule__WinFormControlType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__WinFormControlType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getWinFormControlTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWinFormControlType"


    // $ANTLR start "entryRuleSpinner"
    // InternalEntityDsl.g:203:1: entryRuleSpinner : ruleSpinner EOF ;
    public final void entryRuleSpinner() throws RecognitionException {
        try {
            // InternalEntityDsl.g:204:1: ( ruleSpinner EOF )
            // InternalEntityDsl.g:205:1: ruleSpinner EOF
            {
             before(grammarAccess.getSpinnerRule()); 
            pushFollow(FOLLOW_1);
            ruleSpinner();

            state._fsp--;

             after(grammarAccess.getSpinnerRule()); 
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
    // $ANTLR end "entryRuleSpinner"


    // $ANTLR start "ruleSpinner"
    // InternalEntityDsl.g:212:1: ruleSpinner : ( ( rule__Spinner__Group__0 ) ) ;
    public final void ruleSpinner() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:216:2: ( ( ( rule__Spinner__Group__0 ) ) )
            // InternalEntityDsl.g:217:2: ( ( rule__Spinner__Group__0 ) )
            {
            // InternalEntityDsl.g:217:2: ( ( rule__Spinner__Group__0 ) )
            // InternalEntityDsl.g:218:3: ( rule__Spinner__Group__0 )
            {
             before(grammarAccess.getSpinnerAccess().getGroup()); 
            // InternalEntityDsl.g:219:3: ( rule__Spinner__Group__0 )
            // InternalEntityDsl.g:219:4: rule__Spinner__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Spinner__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSpinnerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSpinner"


    // $ANTLR start "entryRuleRadioButtonGroup"
    // InternalEntityDsl.g:228:1: entryRuleRadioButtonGroup : ruleRadioButtonGroup EOF ;
    public final void entryRuleRadioButtonGroup() throws RecognitionException {
        try {
            // InternalEntityDsl.g:229:1: ( ruleRadioButtonGroup EOF )
            // InternalEntityDsl.g:230:1: ruleRadioButtonGroup EOF
            {
             before(grammarAccess.getRadioButtonGroupRule()); 
            pushFollow(FOLLOW_1);
            ruleRadioButtonGroup();

            state._fsp--;

             after(grammarAccess.getRadioButtonGroupRule()); 
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
    // $ANTLR end "entryRuleRadioButtonGroup"


    // $ANTLR start "ruleRadioButtonGroup"
    // InternalEntityDsl.g:237:1: ruleRadioButtonGroup : ( ( rule__RadioButtonGroup__Group__0 ) ) ;
    public final void ruleRadioButtonGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:241:2: ( ( ( rule__RadioButtonGroup__Group__0 ) ) )
            // InternalEntityDsl.g:242:2: ( ( rule__RadioButtonGroup__Group__0 ) )
            {
            // InternalEntityDsl.g:242:2: ( ( rule__RadioButtonGroup__Group__0 ) )
            // InternalEntityDsl.g:243:3: ( rule__RadioButtonGroup__Group__0 )
            {
             before(grammarAccess.getRadioButtonGroupAccess().getGroup()); 
            // InternalEntityDsl.g:244:3: ( rule__RadioButtonGroup__Group__0 )
            // InternalEntityDsl.g:244:4: rule__RadioButtonGroup__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RadioButtonGroup__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRadioButtonGroupAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRadioButtonGroup"


    // $ANTLR start "entryRuleRadioButton"
    // InternalEntityDsl.g:253:1: entryRuleRadioButton : ruleRadioButton EOF ;
    public final void entryRuleRadioButton() throws RecognitionException {
        try {
            // InternalEntityDsl.g:254:1: ( ruleRadioButton EOF )
            // InternalEntityDsl.g:255:1: ruleRadioButton EOF
            {
             before(grammarAccess.getRadioButtonRule()); 
            pushFollow(FOLLOW_1);
            ruleRadioButton();

            state._fsp--;

             after(grammarAccess.getRadioButtonRule()); 
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
    // $ANTLR end "entryRuleRadioButton"


    // $ANTLR start "ruleRadioButton"
    // InternalEntityDsl.g:262:1: ruleRadioButton : ( ( rule__RadioButton__TextAssignment ) ) ;
    public final void ruleRadioButton() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:266:2: ( ( ( rule__RadioButton__TextAssignment ) ) )
            // InternalEntityDsl.g:267:2: ( ( rule__RadioButton__TextAssignment ) )
            {
            // InternalEntityDsl.g:267:2: ( ( rule__RadioButton__TextAssignment ) )
            // InternalEntityDsl.g:268:3: ( rule__RadioButton__TextAssignment )
            {
             before(grammarAccess.getRadioButtonAccess().getTextAssignment()); 
            // InternalEntityDsl.g:269:3: ( rule__RadioButton__TextAssignment )
            // InternalEntityDsl.g:269:4: rule__RadioButton__TextAssignment
            {
            pushFollow(FOLLOW_2);
            rule__RadioButton__TextAssignment();

            state._fsp--;


            }

             after(grammarAccess.getRadioButtonAccess().getTextAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRadioButton"


    // $ANTLR start "entryRuleCheckBox"
    // InternalEntityDsl.g:278:1: entryRuleCheckBox : ruleCheckBox EOF ;
    public final void entryRuleCheckBox() throws RecognitionException {
        try {
            // InternalEntityDsl.g:279:1: ( ruleCheckBox EOF )
            // InternalEntityDsl.g:280:1: ruleCheckBox EOF
            {
             before(grammarAccess.getCheckBoxRule()); 
            pushFollow(FOLLOW_1);
            ruleCheckBox();

            state._fsp--;

             after(grammarAccess.getCheckBoxRule()); 
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
    // $ANTLR end "entryRuleCheckBox"


    // $ANTLR start "ruleCheckBox"
    // InternalEntityDsl.g:287:1: ruleCheckBox : ( ( rule__CheckBox__NameAssignment ) ) ;
    public final void ruleCheckBox() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:291:2: ( ( ( rule__CheckBox__NameAssignment ) ) )
            // InternalEntityDsl.g:292:2: ( ( rule__CheckBox__NameAssignment ) )
            {
            // InternalEntityDsl.g:292:2: ( ( rule__CheckBox__NameAssignment ) )
            // InternalEntityDsl.g:293:3: ( rule__CheckBox__NameAssignment )
            {
             before(grammarAccess.getCheckBoxAccess().getNameAssignment()); 
            // InternalEntityDsl.g:294:3: ( rule__CheckBox__NameAssignment )
            // InternalEntityDsl.g:294:4: rule__CheckBox__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__CheckBox__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getCheckBoxAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCheckBox"


    // $ANTLR start "entryRuleTextBox"
    // InternalEntityDsl.g:303:1: entryRuleTextBox : ruleTextBox EOF ;
    public final void entryRuleTextBox() throws RecognitionException {
        try {
            // InternalEntityDsl.g:304:1: ( ruleTextBox EOF )
            // InternalEntityDsl.g:305:1: ruleTextBox EOF
            {
             before(grammarAccess.getTextBoxRule()); 
            pushFollow(FOLLOW_1);
            ruleTextBox();

            state._fsp--;

             after(grammarAccess.getTextBoxRule()); 
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
    // $ANTLR end "entryRuleTextBox"


    // $ANTLR start "ruleTextBox"
    // InternalEntityDsl.g:312:1: ruleTextBox : ( ( rule__TextBox__Group__0 ) ) ;
    public final void ruleTextBox() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:316:2: ( ( ( rule__TextBox__Group__0 ) ) )
            // InternalEntityDsl.g:317:2: ( ( rule__TextBox__Group__0 ) )
            {
            // InternalEntityDsl.g:317:2: ( ( rule__TextBox__Group__0 ) )
            // InternalEntityDsl.g:318:3: ( rule__TextBox__Group__0 )
            {
             before(grammarAccess.getTextBoxAccess().getGroup()); 
            // InternalEntityDsl.g:319:3: ( rule__TextBox__Group__0 )
            // InternalEntityDsl.g:319:4: rule__TextBox__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TextBox__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTextBoxAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTextBox"


    // $ANTLR start "entryRuleComboBox"
    // InternalEntityDsl.g:328:1: entryRuleComboBox : ruleComboBox EOF ;
    public final void entryRuleComboBox() throws RecognitionException {
        try {
            // InternalEntityDsl.g:329:1: ( ruleComboBox EOF )
            // InternalEntityDsl.g:330:1: ruleComboBox EOF
            {
             before(grammarAccess.getComboBoxRule()); 
            pushFollow(FOLLOW_1);
            ruleComboBox();

            state._fsp--;

             after(grammarAccess.getComboBoxRule()); 
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
    // $ANTLR end "entryRuleComboBox"


    // $ANTLR start "ruleComboBox"
    // InternalEntityDsl.g:337:1: ruleComboBox : ( ( rule__ComboBox__Group__0 ) ) ;
    public final void ruleComboBox() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:341:2: ( ( ( rule__ComboBox__Group__0 ) ) )
            // InternalEntityDsl.g:342:2: ( ( rule__ComboBox__Group__0 ) )
            {
            // InternalEntityDsl.g:342:2: ( ( rule__ComboBox__Group__0 ) )
            // InternalEntityDsl.g:343:3: ( rule__ComboBox__Group__0 )
            {
             before(grammarAccess.getComboBoxAccess().getGroup()); 
            // InternalEntityDsl.g:344:3: ( rule__ComboBox__Group__0 )
            // InternalEntityDsl.g:344:4: rule__ComboBox__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComboBox__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComboBoxAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComboBox"


    // $ANTLR start "entryRuleComboBoxItem"
    // InternalEntityDsl.g:353:1: entryRuleComboBoxItem : ruleComboBoxItem EOF ;
    public final void entryRuleComboBoxItem() throws RecognitionException {
        try {
            // InternalEntityDsl.g:354:1: ( ruleComboBoxItem EOF )
            // InternalEntityDsl.g:355:1: ruleComboBoxItem EOF
            {
             before(grammarAccess.getComboBoxItemRule()); 
            pushFollow(FOLLOW_1);
            ruleComboBoxItem();

            state._fsp--;

             after(grammarAccess.getComboBoxItemRule()); 
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
    // $ANTLR end "entryRuleComboBoxItem"


    // $ANTLR start "ruleComboBoxItem"
    // InternalEntityDsl.g:362:1: ruleComboBoxItem : ( ( rule__ComboBoxItem__TextAssignment ) ) ;
    public final void ruleComboBoxItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:366:2: ( ( ( rule__ComboBoxItem__TextAssignment ) ) )
            // InternalEntityDsl.g:367:2: ( ( rule__ComboBoxItem__TextAssignment ) )
            {
            // InternalEntityDsl.g:367:2: ( ( rule__ComboBoxItem__TextAssignment ) )
            // InternalEntityDsl.g:368:3: ( rule__ComboBoxItem__TextAssignment )
            {
             before(grammarAccess.getComboBoxItemAccess().getTextAssignment()); 
            // InternalEntityDsl.g:369:3: ( rule__ComboBoxItem__TextAssignment )
            // InternalEntityDsl.g:369:4: rule__ComboBoxItem__TextAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ComboBoxItem__TextAssignment();

            state._fsp--;


            }

             after(grammarAccess.getComboBoxItemAccess().getTextAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComboBoxItem"


    // $ANTLR start "rule__DataType__TypeAlternatives_0"
    // InternalEntityDsl.g:377:1: rule__DataType__TypeAlternatives_0 : ( ( 'string' ) | ( 'int' ) | ( 'double' ) );
    public final void rule__DataType__TypeAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:381:1: ( ( 'string' ) | ( 'int' ) | ( 'double' ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalEntityDsl.g:382:2: ( 'string' )
                    {
                    // InternalEntityDsl.g:382:2: ( 'string' )
                    // InternalEntityDsl.g:383:3: 'string'
                    {
                     before(grammarAccess.getDataTypeAccess().getTypeStringKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getDataTypeAccess().getTypeStringKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEntityDsl.g:388:2: ( 'int' )
                    {
                    // InternalEntityDsl.g:388:2: ( 'int' )
                    // InternalEntityDsl.g:389:3: 'int'
                    {
                     before(grammarAccess.getDataTypeAccess().getTypeIntKeyword_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getDataTypeAccess().getTypeIntKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEntityDsl.g:394:2: ( 'double' )
                    {
                    // InternalEntityDsl.g:394:2: ( 'double' )
                    // InternalEntityDsl.g:395:3: 'double'
                    {
                     before(grammarAccess.getDataTypeAccess().getTypeDoubleKeyword_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getDataTypeAccess().getTypeDoubleKeyword_0_2()); 

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
    // $ANTLR end "rule__DataType__TypeAlternatives_0"


    // $ANTLR start "rule__WinFormControlType__Alternatives"
    // InternalEntityDsl.g:404:1: rule__WinFormControlType__Alternatives : ( ( ( rule__WinFormControlType__ControlTypeAssignment_0 ) ) | ( ruleComboBox ) | ( ruleCheckBox ) | ( ruleRadioButtonGroup ) | ( ruleSpinner ) );
    public final void rule__WinFormControlType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:408:1: ( ( ( rule__WinFormControlType__ControlTypeAssignment_0 ) ) | ( ruleComboBox ) | ( ruleCheckBox ) | ( ruleRadioButtonGroup ) | ( ruleSpinner ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt2=1;
                }
                break;
            case 29:
                {
                alt2=2;
                }
                break;
            case 27:
                {
                alt2=3;
                }
                break;
            case 26:
                {
                alt2=4;
                }
                break;
            case 25:
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
                    // InternalEntityDsl.g:409:2: ( ( rule__WinFormControlType__ControlTypeAssignment_0 ) )
                    {
                    // InternalEntityDsl.g:409:2: ( ( rule__WinFormControlType__ControlTypeAssignment_0 ) )
                    // InternalEntityDsl.g:410:3: ( rule__WinFormControlType__ControlTypeAssignment_0 )
                    {
                     before(grammarAccess.getWinFormControlTypeAccess().getControlTypeAssignment_0()); 
                    // InternalEntityDsl.g:411:3: ( rule__WinFormControlType__ControlTypeAssignment_0 )
                    // InternalEntityDsl.g:411:4: rule__WinFormControlType__ControlTypeAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__WinFormControlType__ControlTypeAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getWinFormControlTypeAccess().getControlTypeAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEntityDsl.g:415:2: ( ruleComboBox )
                    {
                    // InternalEntityDsl.g:415:2: ( ruleComboBox )
                    // InternalEntityDsl.g:416:3: ruleComboBox
                    {
                     before(grammarAccess.getWinFormControlTypeAccess().getComboBoxParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleComboBox();

                    state._fsp--;

                     after(grammarAccess.getWinFormControlTypeAccess().getComboBoxParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEntityDsl.g:421:2: ( ruleCheckBox )
                    {
                    // InternalEntityDsl.g:421:2: ( ruleCheckBox )
                    // InternalEntityDsl.g:422:3: ruleCheckBox
                    {
                     before(grammarAccess.getWinFormControlTypeAccess().getCheckBoxParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCheckBox();

                    state._fsp--;

                     after(grammarAccess.getWinFormControlTypeAccess().getCheckBoxParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalEntityDsl.g:427:2: ( ruleRadioButtonGroup )
                    {
                    // InternalEntityDsl.g:427:2: ( ruleRadioButtonGroup )
                    // InternalEntityDsl.g:428:3: ruleRadioButtonGroup
                    {
                     before(grammarAccess.getWinFormControlTypeAccess().getRadioButtonGroupParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleRadioButtonGroup();

                    state._fsp--;

                     after(grammarAccess.getWinFormControlTypeAccess().getRadioButtonGroupParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalEntityDsl.g:433:2: ( ruleSpinner )
                    {
                    // InternalEntityDsl.g:433:2: ( ruleSpinner )
                    // InternalEntityDsl.g:434:3: ruleSpinner
                    {
                     before(grammarAccess.getWinFormControlTypeAccess().getSpinnerParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleSpinner();

                    state._fsp--;

                     after(grammarAccess.getWinFormControlTypeAccess().getSpinnerParserRuleCall_4()); 

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
    // $ANTLR end "rule__WinFormControlType__Alternatives"


    // $ANTLR start "rule__Domainmodel__Group__0"
    // InternalEntityDsl.g:443:1: rule__Domainmodel__Group__0 : rule__Domainmodel__Group__0__Impl rule__Domainmodel__Group__1 ;
    public final void rule__Domainmodel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:447:1: ( rule__Domainmodel__Group__0__Impl rule__Domainmodel__Group__1 )
            // InternalEntityDsl.g:448:2: rule__Domainmodel__Group__0__Impl rule__Domainmodel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Domainmodel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Domainmodel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domainmodel__Group__0"


    // $ANTLR start "rule__Domainmodel__Group__0__Impl"
    // InternalEntityDsl.g:455:1: rule__Domainmodel__Group__0__Impl : ( 'database:' ) ;
    public final void rule__Domainmodel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:459:1: ( ( 'database:' ) )
            // InternalEntityDsl.g:460:1: ( 'database:' )
            {
            // InternalEntityDsl.g:460:1: ( 'database:' )
            // InternalEntityDsl.g:461:2: 'database:'
            {
             before(grammarAccess.getDomainmodelAccess().getDatabaseKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getDomainmodelAccess().getDatabaseKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domainmodel__Group__0__Impl"


    // $ANTLR start "rule__Domainmodel__Group__1"
    // InternalEntityDsl.g:470:1: rule__Domainmodel__Group__1 : rule__Domainmodel__Group__1__Impl rule__Domainmodel__Group__2 ;
    public final void rule__Domainmodel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:474:1: ( rule__Domainmodel__Group__1__Impl rule__Domainmodel__Group__2 )
            // InternalEntityDsl.g:475:2: rule__Domainmodel__Group__1__Impl rule__Domainmodel__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Domainmodel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Domainmodel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domainmodel__Group__1"


    // $ANTLR start "rule__Domainmodel__Group__1__Impl"
    // InternalEntityDsl.g:482:1: rule__Domainmodel__Group__1__Impl : ( ( rule__Domainmodel__ApplicationNameAssignment_1 ) ) ;
    public final void rule__Domainmodel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:486:1: ( ( ( rule__Domainmodel__ApplicationNameAssignment_1 ) ) )
            // InternalEntityDsl.g:487:1: ( ( rule__Domainmodel__ApplicationNameAssignment_1 ) )
            {
            // InternalEntityDsl.g:487:1: ( ( rule__Domainmodel__ApplicationNameAssignment_1 ) )
            // InternalEntityDsl.g:488:2: ( rule__Domainmodel__ApplicationNameAssignment_1 )
            {
             before(grammarAccess.getDomainmodelAccess().getApplicationNameAssignment_1()); 
            // InternalEntityDsl.g:489:2: ( rule__Domainmodel__ApplicationNameAssignment_1 )
            // InternalEntityDsl.g:489:3: rule__Domainmodel__ApplicationNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Domainmodel__ApplicationNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDomainmodelAccess().getApplicationNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domainmodel__Group__1__Impl"


    // $ANTLR start "rule__Domainmodel__Group__2"
    // InternalEntityDsl.g:497:1: rule__Domainmodel__Group__2 : rule__Domainmodel__Group__2__Impl ;
    public final void rule__Domainmodel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:501:1: ( rule__Domainmodel__Group__2__Impl )
            // InternalEntityDsl.g:502:2: rule__Domainmodel__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Domainmodel__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domainmodel__Group__2"


    // $ANTLR start "rule__Domainmodel__Group__2__Impl"
    // InternalEntityDsl.g:508:1: rule__Domainmodel__Group__2__Impl : ( ( rule__Domainmodel__ElementsAssignment_2 )* ) ;
    public final void rule__Domainmodel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:512:1: ( ( ( rule__Domainmodel__ElementsAssignment_2 )* ) )
            // InternalEntityDsl.g:513:1: ( ( rule__Domainmodel__ElementsAssignment_2 )* )
            {
            // InternalEntityDsl.g:513:1: ( ( rule__Domainmodel__ElementsAssignment_2 )* )
            // InternalEntityDsl.g:514:2: ( rule__Domainmodel__ElementsAssignment_2 )*
            {
             before(grammarAccess.getDomainmodelAccess().getElementsAssignment_2()); 
            // InternalEntityDsl.g:515:2: ( rule__Domainmodel__ElementsAssignment_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalEntityDsl.g:515:3: rule__Domainmodel__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Domainmodel__ElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getDomainmodelAccess().getElementsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domainmodel__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalEntityDsl.g:524:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:528:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalEntityDsl.g:529:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // InternalEntityDsl.g:536:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:540:1: ( ( 'entity' ) )
            // InternalEntityDsl.g:541:1: ( 'entity' )
            {
            // InternalEntityDsl.g:541:1: ( 'entity' )
            // InternalEntityDsl.g:542:2: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // InternalEntityDsl.g:551:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:555:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalEntityDsl.g:556:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // InternalEntityDsl.g:563:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:567:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalEntityDsl.g:568:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalEntityDsl.g:568:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalEntityDsl.g:569:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalEntityDsl.g:570:2: ( rule__Entity__NameAssignment_1 )
            // InternalEntityDsl.g:570:3: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // InternalEntityDsl.g:578:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:582:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalEntityDsl.g:583:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // InternalEntityDsl.g:590:1: rule__Entity__Group__2__Impl : ( '{' ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:594:1: ( ( '{' ) )
            // InternalEntityDsl.g:595:1: ( '{' )
            {
            // InternalEntityDsl.g:595:1: ( '{' )
            // InternalEntityDsl.g:596:2: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // InternalEntityDsl.g:605:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:609:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalEntityDsl.g:610:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // InternalEntityDsl.g:617:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__AttributesAssignment_3 )* ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:621:1: ( ( ( rule__Entity__AttributesAssignment_3 )* ) )
            // InternalEntityDsl.g:622:1: ( ( rule__Entity__AttributesAssignment_3 )* )
            {
            // InternalEntityDsl.g:622:1: ( ( rule__Entity__AttributesAssignment_3 )* )
            // InternalEntityDsl.g:623:2: ( rule__Entity__AttributesAssignment_3 )*
            {
             before(grammarAccess.getEntityAccess().getAttributesAssignment_3()); 
            // InternalEntityDsl.g:624:2: ( rule__Entity__AttributesAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID||LA4_0==24) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalEntityDsl.g:624:3: rule__Entity__AttributesAssignment_3
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Entity__AttributesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getAttributesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // InternalEntityDsl.g:632:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:636:1: ( rule__Entity__Group__4__Impl )
            // InternalEntityDsl.g:637:2: rule__Entity__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // InternalEntityDsl.g:643:1: rule__Entity__Group__4__Impl : ( '}' ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:647:1: ( ( '}' ) )
            // InternalEntityDsl.g:648:1: ( '}' )
            {
            // InternalEntityDsl.g:648:1: ( '}' )
            // InternalEntityDsl.g:649:2: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalEntityDsl.g:659:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:663:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalEntityDsl.g:664:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalEntityDsl.g:671:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__RequiredAssignment_0 )? ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:675:1: ( ( ( rule__Attribute__RequiredAssignment_0 )? ) )
            // InternalEntityDsl.g:676:1: ( ( rule__Attribute__RequiredAssignment_0 )? )
            {
            // InternalEntityDsl.g:676:1: ( ( rule__Attribute__RequiredAssignment_0 )? )
            // InternalEntityDsl.g:677:2: ( rule__Attribute__RequiredAssignment_0 )?
            {
             before(grammarAccess.getAttributeAccess().getRequiredAssignment_0()); 
            // InternalEntityDsl.g:678:2: ( rule__Attribute__RequiredAssignment_0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalEntityDsl.g:678:3: rule__Attribute__RequiredAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__RequiredAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getRequiredAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalEntityDsl.g:686:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:690:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalEntityDsl.g:691:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalEntityDsl.g:698:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:702:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalEntityDsl.g:703:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalEntityDsl.g:703:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalEntityDsl.g:704:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalEntityDsl.g:705:2: ( rule__Attribute__NameAssignment_1 )
            // InternalEntityDsl.g:705:3: rule__Attribute__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalEntityDsl.g:713:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:717:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalEntityDsl.g:718:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Attribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalEntityDsl.g:725:1: rule__Attribute__Group__2__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:729:1: ( ( ':' ) )
            // InternalEntityDsl.g:730:1: ( ':' )
            {
            // InternalEntityDsl.g:730:1: ( ':' )
            // InternalEntityDsl.g:731:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__3"
    // InternalEntityDsl.g:740:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:744:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // InternalEntityDsl.g:745:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Attribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3"


    // $ANTLR start "rule__Attribute__Group__3__Impl"
    // InternalEntityDsl.g:752:1: rule__Attribute__Group__3__Impl : ( '[' ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:756:1: ( ( '[' ) )
            // InternalEntityDsl.g:757:1: ( '[' )
            {
            // InternalEntityDsl.g:757:1: ( '[' )
            // InternalEntityDsl.g:758:2: '['
            {
             before(grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3__Impl"


    // $ANTLR start "rule__Attribute__Group__4"
    // InternalEntityDsl.g:767:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:771:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
            // InternalEntityDsl.g:772:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Attribute__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__4"


    // $ANTLR start "rule__Attribute__Group__4__Impl"
    // InternalEntityDsl.g:779:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__InputTypeAssignment_4 ) ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:783:1: ( ( ( rule__Attribute__InputTypeAssignment_4 ) ) )
            // InternalEntityDsl.g:784:1: ( ( rule__Attribute__InputTypeAssignment_4 ) )
            {
            // InternalEntityDsl.g:784:1: ( ( rule__Attribute__InputTypeAssignment_4 ) )
            // InternalEntityDsl.g:785:2: ( rule__Attribute__InputTypeAssignment_4 )
            {
             before(grammarAccess.getAttributeAccess().getInputTypeAssignment_4()); 
            // InternalEntityDsl.g:786:2: ( rule__Attribute__InputTypeAssignment_4 )
            // InternalEntityDsl.g:786:3: rule__Attribute__InputTypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__InputTypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getInputTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__4__Impl"


    // $ANTLR start "rule__Attribute__Group__5"
    // InternalEntityDsl.g:794:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl rule__Attribute__Group__6 ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:798:1: ( rule__Attribute__Group__5__Impl rule__Attribute__Group__6 )
            // InternalEntityDsl.g:799:2: rule__Attribute__Group__5__Impl rule__Attribute__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__Attribute__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__5"


    // $ANTLR start "rule__Attribute__Group__5__Impl"
    // InternalEntityDsl.g:806:1: rule__Attribute__Group__5__Impl : ( ',' ) ;
    public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:810:1: ( ( ',' ) )
            // InternalEntityDsl.g:811:1: ( ',' )
            {
            // InternalEntityDsl.g:811:1: ( ',' )
            // InternalEntityDsl.g:812:2: ','
            {
             before(grammarAccess.getAttributeAccess().getCommaKeyword_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getCommaKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__5__Impl"


    // $ANTLR start "rule__Attribute__Group__6"
    // InternalEntityDsl.g:821:1: rule__Attribute__Group__6 : rule__Attribute__Group__6__Impl rule__Attribute__Group__7 ;
    public final void rule__Attribute__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:825:1: ( rule__Attribute__Group__6__Impl rule__Attribute__Group__7 )
            // InternalEntityDsl.g:826:2: rule__Attribute__Group__6__Impl rule__Attribute__Group__7
            {
            pushFollow(FOLLOW_15);
            rule__Attribute__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__6"


    // $ANTLR start "rule__Attribute__Group__6__Impl"
    // InternalEntityDsl.g:833:1: rule__Attribute__Group__6__Impl : ( ( rule__Attribute__LabelTextAssignment_6 ) ) ;
    public final void rule__Attribute__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:837:1: ( ( ( rule__Attribute__LabelTextAssignment_6 ) ) )
            // InternalEntityDsl.g:838:1: ( ( rule__Attribute__LabelTextAssignment_6 ) )
            {
            // InternalEntityDsl.g:838:1: ( ( rule__Attribute__LabelTextAssignment_6 ) )
            // InternalEntityDsl.g:839:2: ( rule__Attribute__LabelTextAssignment_6 )
            {
             before(grammarAccess.getAttributeAccess().getLabelTextAssignment_6()); 
            // InternalEntityDsl.g:840:2: ( rule__Attribute__LabelTextAssignment_6 )
            // InternalEntityDsl.g:840:3: rule__Attribute__LabelTextAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__LabelTextAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getLabelTextAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__6__Impl"


    // $ANTLR start "rule__Attribute__Group__7"
    // InternalEntityDsl.g:848:1: rule__Attribute__Group__7 : rule__Attribute__Group__7__Impl ;
    public final void rule__Attribute__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:852:1: ( rule__Attribute__Group__7__Impl )
            // InternalEntityDsl.g:853:2: rule__Attribute__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__7"


    // $ANTLR start "rule__Attribute__Group__7__Impl"
    // InternalEntityDsl.g:859:1: rule__Attribute__Group__7__Impl : ( ']' ) ;
    public final void rule__Attribute__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:863:1: ( ( ']' ) )
            // InternalEntityDsl.g:864:1: ( ']' )
            {
            // InternalEntityDsl.g:864:1: ( ']' )
            // InternalEntityDsl.g:865:2: ']'
            {
             before(grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_7()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__7__Impl"


    // $ANTLR start "rule__Spinner__Group__0"
    // InternalEntityDsl.g:875:1: rule__Spinner__Group__0 : rule__Spinner__Group__0__Impl rule__Spinner__Group__1 ;
    public final void rule__Spinner__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:879:1: ( rule__Spinner__Group__0__Impl rule__Spinner__Group__1 )
            // InternalEntityDsl.g:880:2: rule__Spinner__Group__0__Impl rule__Spinner__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Spinner__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Spinner__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spinner__Group__0"


    // $ANTLR start "rule__Spinner__Group__0__Impl"
    // InternalEntityDsl.g:887:1: rule__Spinner__Group__0__Impl : ( ( rule__Spinner__NameAssignment_0 ) ) ;
    public final void rule__Spinner__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:891:1: ( ( ( rule__Spinner__NameAssignment_0 ) ) )
            // InternalEntityDsl.g:892:1: ( ( rule__Spinner__NameAssignment_0 ) )
            {
            // InternalEntityDsl.g:892:1: ( ( rule__Spinner__NameAssignment_0 ) )
            // InternalEntityDsl.g:893:2: ( rule__Spinner__NameAssignment_0 )
            {
             before(grammarAccess.getSpinnerAccess().getNameAssignment_0()); 
            // InternalEntityDsl.g:894:2: ( rule__Spinner__NameAssignment_0 )
            // InternalEntityDsl.g:894:3: rule__Spinner__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Spinner__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSpinnerAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spinner__Group__0__Impl"


    // $ANTLR start "rule__Spinner__Group__1"
    // InternalEntityDsl.g:902:1: rule__Spinner__Group__1 : rule__Spinner__Group__1__Impl rule__Spinner__Group__2 ;
    public final void rule__Spinner__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:906:1: ( rule__Spinner__Group__1__Impl rule__Spinner__Group__2 )
            // InternalEntityDsl.g:907:2: rule__Spinner__Group__1__Impl rule__Spinner__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Spinner__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Spinner__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spinner__Group__1"


    // $ANTLR start "rule__Spinner__Group__1__Impl"
    // InternalEntityDsl.g:914:1: rule__Spinner__Group__1__Impl : ( '[' ) ;
    public final void rule__Spinner__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:918:1: ( ( '[' ) )
            // InternalEntityDsl.g:919:1: ( '[' )
            {
            // InternalEntityDsl.g:919:1: ( '[' )
            // InternalEntityDsl.g:920:2: '['
            {
             before(grammarAccess.getSpinnerAccess().getLeftSquareBracketKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSpinnerAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spinner__Group__1__Impl"


    // $ANTLR start "rule__Spinner__Group__2"
    // InternalEntityDsl.g:929:1: rule__Spinner__Group__2 : rule__Spinner__Group__2__Impl rule__Spinner__Group__3 ;
    public final void rule__Spinner__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:933:1: ( rule__Spinner__Group__2__Impl rule__Spinner__Group__3 )
            // InternalEntityDsl.g:934:2: rule__Spinner__Group__2__Impl rule__Spinner__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Spinner__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Spinner__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spinner__Group__2"


    // $ANTLR start "rule__Spinner__Group__2__Impl"
    // InternalEntityDsl.g:941:1: rule__Spinner__Group__2__Impl : ( ( rule__Spinner__DefaultValueAssignment_2 ) ) ;
    public final void rule__Spinner__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:945:1: ( ( ( rule__Spinner__DefaultValueAssignment_2 ) ) )
            // InternalEntityDsl.g:946:1: ( ( rule__Spinner__DefaultValueAssignment_2 ) )
            {
            // InternalEntityDsl.g:946:1: ( ( rule__Spinner__DefaultValueAssignment_2 ) )
            // InternalEntityDsl.g:947:2: ( rule__Spinner__DefaultValueAssignment_2 )
            {
             before(grammarAccess.getSpinnerAccess().getDefaultValueAssignment_2()); 
            // InternalEntityDsl.g:948:2: ( rule__Spinner__DefaultValueAssignment_2 )
            // InternalEntityDsl.g:948:3: rule__Spinner__DefaultValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Spinner__DefaultValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSpinnerAccess().getDefaultValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spinner__Group__2__Impl"


    // $ANTLR start "rule__Spinner__Group__3"
    // InternalEntityDsl.g:956:1: rule__Spinner__Group__3 : rule__Spinner__Group__3__Impl rule__Spinner__Group__4 ;
    public final void rule__Spinner__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:960:1: ( rule__Spinner__Group__3__Impl rule__Spinner__Group__4 )
            // InternalEntityDsl.g:961:2: rule__Spinner__Group__3__Impl rule__Spinner__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Spinner__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Spinner__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spinner__Group__3"


    // $ANTLR start "rule__Spinner__Group__3__Impl"
    // InternalEntityDsl.g:968:1: rule__Spinner__Group__3__Impl : ( ',' ) ;
    public final void rule__Spinner__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:972:1: ( ( ',' ) )
            // InternalEntityDsl.g:973:1: ( ',' )
            {
            // InternalEntityDsl.g:973:1: ( ',' )
            // InternalEntityDsl.g:974:2: ','
            {
             before(grammarAccess.getSpinnerAccess().getCommaKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSpinnerAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spinner__Group__3__Impl"


    // $ANTLR start "rule__Spinner__Group__4"
    // InternalEntityDsl.g:983:1: rule__Spinner__Group__4 : rule__Spinner__Group__4__Impl rule__Spinner__Group__5 ;
    public final void rule__Spinner__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:987:1: ( rule__Spinner__Group__4__Impl rule__Spinner__Group__5 )
            // InternalEntityDsl.g:988:2: rule__Spinner__Group__4__Impl rule__Spinner__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Spinner__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Spinner__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spinner__Group__4"


    // $ANTLR start "rule__Spinner__Group__4__Impl"
    // InternalEntityDsl.g:995:1: rule__Spinner__Group__4__Impl : ( '(' ) ;
    public final void rule__Spinner__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:999:1: ( ( '(' ) )
            // InternalEntityDsl.g:1000:1: ( '(' )
            {
            // InternalEntityDsl.g:1000:1: ( '(' )
            // InternalEntityDsl.g:1001:2: '('
            {
             before(grammarAccess.getSpinnerAccess().getLeftParenthesisKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSpinnerAccess().getLeftParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spinner__Group__4__Impl"


    // $ANTLR start "rule__Spinner__Group__5"
    // InternalEntityDsl.g:1010:1: rule__Spinner__Group__5 : rule__Spinner__Group__5__Impl rule__Spinner__Group__6 ;
    public final void rule__Spinner__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1014:1: ( rule__Spinner__Group__5__Impl rule__Spinner__Group__6 )
            // InternalEntityDsl.g:1015:2: rule__Spinner__Group__5__Impl rule__Spinner__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__Spinner__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Spinner__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spinner__Group__5"


    // $ANTLR start "rule__Spinner__Group__5__Impl"
    // InternalEntityDsl.g:1022:1: rule__Spinner__Group__5__Impl : ( ( rule__Spinner__MinimumValueAssignment_5 ) ) ;
    public final void rule__Spinner__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1026:1: ( ( ( rule__Spinner__MinimumValueAssignment_5 ) ) )
            // InternalEntityDsl.g:1027:1: ( ( rule__Spinner__MinimumValueAssignment_5 ) )
            {
            // InternalEntityDsl.g:1027:1: ( ( rule__Spinner__MinimumValueAssignment_5 ) )
            // InternalEntityDsl.g:1028:2: ( rule__Spinner__MinimumValueAssignment_5 )
            {
             before(grammarAccess.getSpinnerAccess().getMinimumValueAssignment_5()); 
            // InternalEntityDsl.g:1029:2: ( rule__Spinner__MinimumValueAssignment_5 )
            // InternalEntityDsl.g:1029:3: rule__Spinner__MinimumValueAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Spinner__MinimumValueAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSpinnerAccess().getMinimumValueAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spinner__Group__5__Impl"


    // $ANTLR start "rule__Spinner__Group__6"
    // InternalEntityDsl.g:1037:1: rule__Spinner__Group__6 : rule__Spinner__Group__6__Impl rule__Spinner__Group__7 ;
    public final void rule__Spinner__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1041:1: ( rule__Spinner__Group__6__Impl rule__Spinner__Group__7 )
            // InternalEntityDsl.g:1042:2: rule__Spinner__Group__6__Impl rule__Spinner__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__Spinner__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Spinner__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spinner__Group__6"


    // $ANTLR start "rule__Spinner__Group__6__Impl"
    // InternalEntityDsl.g:1049:1: rule__Spinner__Group__6__Impl : ( ',' ) ;
    public final void rule__Spinner__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1053:1: ( ( ',' ) )
            // InternalEntityDsl.g:1054:1: ( ',' )
            {
            // InternalEntityDsl.g:1054:1: ( ',' )
            // InternalEntityDsl.g:1055:2: ','
            {
             before(grammarAccess.getSpinnerAccess().getCommaKeyword_6()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSpinnerAccess().getCommaKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spinner__Group__6__Impl"


    // $ANTLR start "rule__Spinner__Group__7"
    // InternalEntityDsl.g:1064:1: rule__Spinner__Group__7 : rule__Spinner__Group__7__Impl rule__Spinner__Group__8 ;
    public final void rule__Spinner__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1068:1: ( rule__Spinner__Group__7__Impl rule__Spinner__Group__8 )
            // InternalEntityDsl.g:1069:2: rule__Spinner__Group__7__Impl rule__Spinner__Group__8
            {
            pushFollow(FOLLOW_18);
            rule__Spinner__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Spinner__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spinner__Group__7"


    // $ANTLR start "rule__Spinner__Group__7__Impl"
    // InternalEntityDsl.g:1076:1: rule__Spinner__Group__7__Impl : ( ( rule__Spinner__MaximumValueAssignment_7 ) ) ;
    public final void rule__Spinner__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1080:1: ( ( ( rule__Spinner__MaximumValueAssignment_7 ) ) )
            // InternalEntityDsl.g:1081:1: ( ( rule__Spinner__MaximumValueAssignment_7 ) )
            {
            // InternalEntityDsl.g:1081:1: ( ( rule__Spinner__MaximumValueAssignment_7 ) )
            // InternalEntityDsl.g:1082:2: ( rule__Spinner__MaximumValueAssignment_7 )
            {
             before(grammarAccess.getSpinnerAccess().getMaximumValueAssignment_7()); 
            // InternalEntityDsl.g:1083:2: ( rule__Spinner__MaximumValueAssignment_7 )
            // InternalEntityDsl.g:1083:3: rule__Spinner__MaximumValueAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Spinner__MaximumValueAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getSpinnerAccess().getMaximumValueAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spinner__Group__7__Impl"


    // $ANTLR start "rule__Spinner__Group__8"
    // InternalEntityDsl.g:1091:1: rule__Spinner__Group__8 : rule__Spinner__Group__8__Impl rule__Spinner__Group__9 ;
    public final void rule__Spinner__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1095:1: ( rule__Spinner__Group__8__Impl rule__Spinner__Group__9 )
            // InternalEntityDsl.g:1096:2: rule__Spinner__Group__8__Impl rule__Spinner__Group__9
            {
            pushFollow(FOLLOW_15);
            rule__Spinner__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Spinner__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spinner__Group__8"


    // $ANTLR start "rule__Spinner__Group__8__Impl"
    // InternalEntityDsl.g:1103:1: rule__Spinner__Group__8__Impl : ( ')' ) ;
    public final void rule__Spinner__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1107:1: ( ( ')' ) )
            // InternalEntityDsl.g:1108:1: ( ')' )
            {
            // InternalEntityDsl.g:1108:1: ( ')' )
            // InternalEntityDsl.g:1109:2: ')'
            {
             before(grammarAccess.getSpinnerAccess().getRightParenthesisKeyword_8()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSpinnerAccess().getRightParenthesisKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spinner__Group__8__Impl"


    // $ANTLR start "rule__Spinner__Group__9"
    // InternalEntityDsl.g:1118:1: rule__Spinner__Group__9 : rule__Spinner__Group__9__Impl ;
    public final void rule__Spinner__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1122:1: ( rule__Spinner__Group__9__Impl )
            // InternalEntityDsl.g:1123:2: rule__Spinner__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Spinner__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spinner__Group__9"


    // $ANTLR start "rule__Spinner__Group__9__Impl"
    // InternalEntityDsl.g:1129:1: rule__Spinner__Group__9__Impl : ( ']' ) ;
    public final void rule__Spinner__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1133:1: ( ( ']' ) )
            // InternalEntityDsl.g:1134:1: ( ']' )
            {
            // InternalEntityDsl.g:1134:1: ( ']' )
            // InternalEntityDsl.g:1135:2: ']'
            {
             before(grammarAccess.getSpinnerAccess().getRightSquareBracketKeyword_9()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSpinnerAccess().getRightSquareBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spinner__Group__9__Impl"


    // $ANTLR start "rule__RadioButtonGroup__Group__0"
    // InternalEntityDsl.g:1145:1: rule__RadioButtonGroup__Group__0 : rule__RadioButtonGroup__Group__0__Impl rule__RadioButtonGroup__Group__1 ;
    public final void rule__RadioButtonGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1149:1: ( rule__RadioButtonGroup__Group__0__Impl rule__RadioButtonGroup__Group__1 )
            // InternalEntityDsl.g:1150:2: rule__RadioButtonGroup__Group__0__Impl rule__RadioButtonGroup__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__RadioButtonGroup__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RadioButtonGroup__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadioButtonGroup__Group__0"


    // $ANTLR start "rule__RadioButtonGroup__Group__0__Impl"
    // InternalEntityDsl.g:1157:1: rule__RadioButtonGroup__Group__0__Impl : ( ( rule__RadioButtonGroup__NameAssignment_0 ) ) ;
    public final void rule__RadioButtonGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1161:1: ( ( ( rule__RadioButtonGroup__NameAssignment_0 ) ) )
            // InternalEntityDsl.g:1162:1: ( ( rule__RadioButtonGroup__NameAssignment_0 ) )
            {
            // InternalEntityDsl.g:1162:1: ( ( rule__RadioButtonGroup__NameAssignment_0 ) )
            // InternalEntityDsl.g:1163:2: ( rule__RadioButtonGroup__NameAssignment_0 )
            {
             before(grammarAccess.getRadioButtonGroupAccess().getNameAssignment_0()); 
            // InternalEntityDsl.g:1164:2: ( rule__RadioButtonGroup__NameAssignment_0 )
            // InternalEntityDsl.g:1164:3: rule__RadioButtonGroup__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RadioButtonGroup__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRadioButtonGroupAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadioButtonGroup__Group__0__Impl"


    // $ANTLR start "rule__RadioButtonGroup__Group__1"
    // InternalEntityDsl.g:1172:1: rule__RadioButtonGroup__Group__1 : rule__RadioButtonGroup__Group__1__Impl rule__RadioButtonGroup__Group__2 ;
    public final void rule__RadioButtonGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1176:1: ( rule__RadioButtonGroup__Group__1__Impl rule__RadioButtonGroup__Group__2 )
            // InternalEntityDsl.g:1177:2: rule__RadioButtonGroup__Group__1__Impl rule__RadioButtonGroup__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__RadioButtonGroup__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RadioButtonGroup__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadioButtonGroup__Group__1"


    // $ANTLR start "rule__RadioButtonGroup__Group__1__Impl"
    // InternalEntityDsl.g:1184:1: rule__RadioButtonGroup__Group__1__Impl : ( '(' ) ;
    public final void rule__RadioButtonGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1188:1: ( ( '(' ) )
            // InternalEntityDsl.g:1189:1: ( '(' )
            {
            // InternalEntityDsl.g:1189:1: ( '(' )
            // InternalEntityDsl.g:1190:2: '('
            {
             before(grammarAccess.getRadioButtonGroupAccess().getLeftParenthesisKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRadioButtonGroupAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadioButtonGroup__Group__1__Impl"


    // $ANTLR start "rule__RadioButtonGroup__Group__2"
    // InternalEntityDsl.g:1199:1: rule__RadioButtonGroup__Group__2 : rule__RadioButtonGroup__Group__2__Impl rule__RadioButtonGroup__Group__3 ;
    public final void rule__RadioButtonGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1203:1: ( rule__RadioButtonGroup__Group__2__Impl rule__RadioButtonGroup__Group__3 )
            // InternalEntityDsl.g:1204:2: rule__RadioButtonGroup__Group__2__Impl rule__RadioButtonGroup__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__RadioButtonGroup__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RadioButtonGroup__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadioButtonGroup__Group__2"


    // $ANTLR start "rule__RadioButtonGroup__Group__2__Impl"
    // InternalEntityDsl.g:1211:1: rule__RadioButtonGroup__Group__2__Impl : ( ( rule__RadioButtonGroup__ButtonsAssignment_2 )* ) ;
    public final void rule__RadioButtonGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1215:1: ( ( ( rule__RadioButtonGroup__ButtonsAssignment_2 )* ) )
            // InternalEntityDsl.g:1216:1: ( ( rule__RadioButtonGroup__ButtonsAssignment_2 )* )
            {
            // InternalEntityDsl.g:1216:1: ( ( rule__RadioButtonGroup__ButtonsAssignment_2 )* )
            // InternalEntityDsl.g:1217:2: ( rule__RadioButtonGroup__ButtonsAssignment_2 )*
            {
             before(grammarAccess.getRadioButtonGroupAccess().getButtonsAssignment_2()); 
            // InternalEntityDsl.g:1218:2: ( rule__RadioButtonGroup__ButtonsAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_STRING) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalEntityDsl.g:1218:3: rule__RadioButtonGroup__ButtonsAssignment_2
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__RadioButtonGroup__ButtonsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getRadioButtonGroupAccess().getButtonsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadioButtonGroup__Group__2__Impl"


    // $ANTLR start "rule__RadioButtonGroup__Group__3"
    // InternalEntityDsl.g:1226:1: rule__RadioButtonGroup__Group__3 : rule__RadioButtonGroup__Group__3__Impl rule__RadioButtonGroup__Group__4 ;
    public final void rule__RadioButtonGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1230:1: ( rule__RadioButtonGroup__Group__3__Impl rule__RadioButtonGroup__Group__4 )
            // InternalEntityDsl.g:1231:2: rule__RadioButtonGroup__Group__3__Impl rule__RadioButtonGroup__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__RadioButtonGroup__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RadioButtonGroup__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadioButtonGroup__Group__3"


    // $ANTLR start "rule__RadioButtonGroup__Group__3__Impl"
    // InternalEntityDsl.g:1238:1: rule__RadioButtonGroup__Group__3__Impl : ( ')' ) ;
    public final void rule__RadioButtonGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1242:1: ( ( ')' ) )
            // InternalEntityDsl.g:1243:1: ( ')' )
            {
            // InternalEntityDsl.g:1243:1: ( ')' )
            // InternalEntityDsl.g:1244:2: ')'
            {
             before(grammarAccess.getRadioButtonGroupAccess().getRightParenthesisKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRadioButtonGroupAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadioButtonGroup__Group__3__Impl"


    // $ANTLR start "rule__RadioButtonGroup__Group__4"
    // InternalEntityDsl.g:1253:1: rule__RadioButtonGroup__Group__4 : rule__RadioButtonGroup__Group__4__Impl rule__RadioButtonGroup__Group__5 ;
    public final void rule__RadioButtonGroup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1257:1: ( rule__RadioButtonGroup__Group__4__Impl rule__RadioButtonGroup__Group__5 )
            // InternalEntityDsl.g:1258:2: rule__RadioButtonGroup__Group__4__Impl rule__RadioButtonGroup__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__RadioButtonGroup__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RadioButtonGroup__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadioButtonGroup__Group__4"


    // $ANTLR start "rule__RadioButtonGroup__Group__4__Impl"
    // InternalEntityDsl.g:1265:1: rule__RadioButtonGroup__Group__4__Impl : ( '[' ) ;
    public final void rule__RadioButtonGroup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1269:1: ( ( '[' ) )
            // InternalEntityDsl.g:1270:1: ( '[' )
            {
            // InternalEntityDsl.g:1270:1: ( '[' )
            // InternalEntityDsl.g:1271:2: '['
            {
             before(grammarAccess.getRadioButtonGroupAccess().getLeftSquareBracketKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getRadioButtonGroupAccess().getLeftSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadioButtonGroup__Group__4__Impl"


    // $ANTLR start "rule__RadioButtonGroup__Group__5"
    // InternalEntityDsl.g:1280:1: rule__RadioButtonGroup__Group__5 : rule__RadioButtonGroup__Group__5__Impl rule__RadioButtonGroup__Group__6 ;
    public final void rule__RadioButtonGroup__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1284:1: ( rule__RadioButtonGroup__Group__5__Impl rule__RadioButtonGroup__Group__6 )
            // InternalEntityDsl.g:1285:2: rule__RadioButtonGroup__Group__5__Impl rule__RadioButtonGroup__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__RadioButtonGroup__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RadioButtonGroup__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadioButtonGroup__Group__5"


    // $ANTLR start "rule__RadioButtonGroup__Group__5__Impl"
    // InternalEntityDsl.g:1292:1: rule__RadioButtonGroup__Group__5__Impl : ( ( rule__RadioButtonGroup__DataTypeAssignment_5 ) ) ;
    public final void rule__RadioButtonGroup__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1296:1: ( ( ( rule__RadioButtonGroup__DataTypeAssignment_5 ) ) )
            // InternalEntityDsl.g:1297:1: ( ( rule__RadioButtonGroup__DataTypeAssignment_5 ) )
            {
            // InternalEntityDsl.g:1297:1: ( ( rule__RadioButtonGroup__DataTypeAssignment_5 ) )
            // InternalEntityDsl.g:1298:2: ( rule__RadioButtonGroup__DataTypeAssignment_5 )
            {
             before(grammarAccess.getRadioButtonGroupAccess().getDataTypeAssignment_5()); 
            // InternalEntityDsl.g:1299:2: ( rule__RadioButtonGroup__DataTypeAssignment_5 )
            // InternalEntityDsl.g:1299:3: rule__RadioButtonGroup__DataTypeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__RadioButtonGroup__DataTypeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRadioButtonGroupAccess().getDataTypeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadioButtonGroup__Group__5__Impl"


    // $ANTLR start "rule__RadioButtonGroup__Group__6"
    // InternalEntityDsl.g:1307:1: rule__RadioButtonGroup__Group__6 : rule__RadioButtonGroup__Group__6__Impl ;
    public final void rule__RadioButtonGroup__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1311:1: ( rule__RadioButtonGroup__Group__6__Impl )
            // InternalEntityDsl.g:1312:2: rule__RadioButtonGroup__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RadioButtonGroup__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadioButtonGroup__Group__6"


    // $ANTLR start "rule__RadioButtonGroup__Group__6__Impl"
    // InternalEntityDsl.g:1318:1: rule__RadioButtonGroup__Group__6__Impl : ( ']' ) ;
    public final void rule__RadioButtonGroup__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1322:1: ( ( ']' ) )
            // InternalEntityDsl.g:1323:1: ( ']' )
            {
            // InternalEntityDsl.g:1323:1: ( ']' )
            // InternalEntityDsl.g:1324:2: ']'
            {
             before(grammarAccess.getRadioButtonGroupAccess().getRightSquareBracketKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRadioButtonGroupAccess().getRightSquareBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadioButtonGroup__Group__6__Impl"


    // $ANTLR start "rule__TextBox__Group__0"
    // InternalEntityDsl.g:1334:1: rule__TextBox__Group__0 : rule__TextBox__Group__0__Impl rule__TextBox__Group__1 ;
    public final void rule__TextBox__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1338:1: ( rule__TextBox__Group__0__Impl rule__TextBox__Group__1 )
            // InternalEntityDsl.g:1339:2: rule__TextBox__Group__0__Impl rule__TextBox__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__TextBox__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextBox__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextBox__Group__0"


    // $ANTLR start "rule__TextBox__Group__0__Impl"
    // InternalEntityDsl.g:1346:1: rule__TextBox__Group__0__Impl : ( ( rule__TextBox__NameAssignment_0 ) ) ;
    public final void rule__TextBox__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1350:1: ( ( ( rule__TextBox__NameAssignment_0 ) ) )
            // InternalEntityDsl.g:1351:1: ( ( rule__TextBox__NameAssignment_0 ) )
            {
            // InternalEntityDsl.g:1351:1: ( ( rule__TextBox__NameAssignment_0 ) )
            // InternalEntityDsl.g:1352:2: ( rule__TextBox__NameAssignment_0 )
            {
             before(grammarAccess.getTextBoxAccess().getNameAssignment_0()); 
            // InternalEntityDsl.g:1353:2: ( rule__TextBox__NameAssignment_0 )
            // InternalEntityDsl.g:1353:3: rule__TextBox__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TextBox__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTextBoxAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextBox__Group__0__Impl"


    // $ANTLR start "rule__TextBox__Group__1"
    // InternalEntityDsl.g:1361:1: rule__TextBox__Group__1 : rule__TextBox__Group__1__Impl rule__TextBox__Group__2 ;
    public final void rule__TextBox__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1365:1: ( rule__TextBox__Group__1__Impl rule__TextBox__Group__2 )
            // InternalEntityDsl.g:1366:2: rule__TextBox__Group__1__Impl rule__TextBox__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__TextBox__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextBox__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextBox__Group__1"


    // $ANTLR start "rule__TextBox__Group__1__Impl"
    // InternalEntityDsl.g:1373:1: rule__TextBox__Group__1__Impl : ( '[' ) ;
    public final void rule__TextBox__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1377:1: ( ( '[' ) )
            // InternalEntityDsl.g:1378:1: ( '[' )
            {
            // InternalEntityDsl.g:1378:1: ( '[' )
            // InternalEntityDsl.g:1379:2: '['
            {
             before(grammarAccess.getTextBoxAccess().getLeftSquareBracketKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTextBoxAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextBox__Group__1__Impl"


    // $ANTLR start "rule__TextBox__Group__2"
    // InternalEntityDsl.g:1388:1: rule__TextBox__Group__2 : rule__TextBox__Group__2__Impl rule__TextBox__Group__3 ;
    public final void rule__TextBox__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1392:1: ( rule__TextBox__Group__2__Impl rule__TextBox__Group__3 )
            // InternalEntityDsl.g:1393:2: rule__TextBox__Group__2__Impl rule__TextBox__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__TextBox__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextBox__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextBox__Group__2"


    // $ANTLR start "rule__TextBox__Group__2__Impl"
    // InternalEntityDsl.g:1400:1: rule__TextBox__Group__2__Impl : ( ( rule__TextBox__DataTypeAssignment_2 ) ) ;
    public final void rule__TextBox__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1404:1: ( ( ( rule__TextBox__DataTypeAssignment_2 ) ) )
            // InternalEntityDsl.g:1405:1: ( ( rule__TextBox__DataTypeAssignment_2 ) )
            {
            // InternalEntityDsl.g:1405:1: ( ( rule__TextBox__DataTypeAssignment_2 ) )
            // InternalEntityDsl.g:1406:2: ( rule__TextBox__DataTypeAssignment_2 )
            {
             before(grammarAccess.getTextBoxAccess().getDataTypeAssignment_2()); 
            // InternalEntityDsl.g:1407:2: ( rule__TextBox__DataTypeAssignment_2 )
            // InternalEntityDsl.g:1407:3: rule__TextBox__DataTypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TextBox__DataTypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTextBoxAccess().getDataTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextBox__Group__2__Impl"


    // $ANTLR start "rule__TextBox__Group__3"
    // InternalEntityDsl.g:1415:1: rule__TextBox__Group__3 : rule__TextBox__Group__3__Impl rule__TextBox__Group__4 ;
    public final void rule__TextBox__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1419:1: ( rule__TextBox__Group__3__Impl rule__TextBox__Group__4 )
            // InternalEntityDsl.g:1420:2: rule__TextBox__Group__3__Impl rule__TextBox__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__TextBox__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextBox__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextBox__Group__3"


    // $ANTLR start "rule__TextBox__Group__3__Impl"
    // InternalEntityDsl.g:1427:1: rule__TextBox__Group__3__Impl : ( '(' ) ;
    public final void rule__TextBox__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1431:1: ( ( '(' ) )
            // InternalEntityDsl.g:1432:1: ( '(' )
            {
            // InternalEntityDsl.g:1432:1: ( '(' )
            // InternalEntityDsl.g:1433:2: '('
            {
             before(grammarAccess.getTextBoxAccess().getLeftParenthesisKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTextBoxAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextBox__Group__3__Impl"


    // $ANTLR start "rule__TextBox__Group__4"
    // InternalEntityDsl.g:1442:1: rule__TextBox__Group__4 : rule__TextBox__Group__4__Impl rule__TextBox__Group__5 ;
    public final void rule__TextBox__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1446:1: ( rule__TextBox__Group__4__Impl rule__TextBox__Group__5 )
            // InternalEntityDsl.g:1447:2: rule__TextBox__Group__4__Impl rule__TextBox__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__TextBox__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextBox__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextBox__Group__4"


    // $ANTLR start "rule__TextBox__Group__4__Impl"
    // InternalEntityDsl.g:1454:1: rule__TextBox__Group__4__Impl : ( ( rule__TextBox__MinTextLengthAssignment_4 )? ) ;
    public final void rule__TextBox__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1458:1: ( ( ( rule__TextBox__MinTextLengthAssignment_4 )? ) )
            // InternalEntityDsl.g:1459:1: ( ( rule__TextBox__MinTextLengthAssignment_4 )? )
            {
            // InternalEntityDsl.g:1459:1: ( ( rule__TextBox__MinTextLengthAssignment_4 )? )
            // InternalEntityDsl.g:1460:2: ( rule__TextBox__MinTextLengthAssignment_4 )?
            {
             before(grammarAccess.getTextBoxAccess().getMinTextLengthAssignment_4()); 
            // InternalEntityDsl.g:1461:2: ( rule__TextBox__MinTextLengthAssignment_4 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalEntityDsl.g:1461:3: rule__TextBox__MinTextLengthAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__TextBox__MinTextLengthAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextBoxAccess().getMinTextLengthAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextBox__Group__4__Impl"


    // $ANTLR start "rule__TextBox__Group__5"
    // InternalEntityDsl.g:1469:1: rule__TextBox__Group__5 : rule__TextBox__Group__5__Impl rule__TextBox__Group__6 ;
    public final void rule__TextBox__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1473:1: ( rule__TextBox__Group__5__Impl rule__TextBox__Group__6 )
            // InternalEntityDsl.g:1474:2: rule__TextBox__Group__5__Impl rule__TextBox__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__TextBox__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextBox__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextBox__Group__5"


    // $ANTLR start "rule__TextBox__Group__5__Impl"
    // InternalEntityDsl.g:1481:1: rule__TextBox__Group__5__Impl : ( ',' ) ;
    public final void rule__TextBox__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1485:1: ( ( ',' ) )
            // InternalEntityDsl.g:1486:1: ( ',' )
            {
            // InternalEntityDsl.g:1486:1: ( ',' )
            // InternalEntityDsl.g:1487:2: ','
            {
             before(grammarAccess.getTextBoxAccess().getCommaKeyword_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTextBoxAccess().getCommaKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextBox__Group__5__Impl"


    // $ANTLR start "rule__TextBox__Group__6"
    // InternalEntityDsl.g:1496:1: rule__TextBox__Group__6 : rule__TextBox__Group__6__Impl rule__TextBox__Group__7 ;
    public final void rule__TextBox__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1500:1: ( rule__TextBox__Group__6__Impl rule__TextBox__Group__7 )
            // InternalEntityDsl.g:1501:2: rule__TextBox__Group__6__Impl rule__TextBox__Group__7
            {
            pushFollow(FOLLOW_23);
            rule__TextBox__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextBox__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextBox__Group__6"


    // $ANTLR start "rule__TextBox__Group__6__Impl"
    // InternalEntityDsl.g:1508:1: rule__TextBox__Group__6__Impl : ( ( rule__TextBox__MaxTextLengthAssignment_6 )? ) ;
    public final void rule__TextBox__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1512:1: ( ( ( rule__TextBox__MaxTextLengthAssignment_6 )? ) )
            // InternalEntityDsl.g:1513:1: ( ( rule__TextBox__MaxTextLengthAssignment_6 )? )
            {
            // InternalEntityDsl.g:1513:1: ( ( rule__TextBox__MaxTextLengthAssignment_6 )? )
            // InternalEntityDsl.g:1514:2: ( rule__TextBox__MaxTextLengthAssignment_6 )?
            {
             before(grammarAccess.getTextBoxAccess().getMaxTextLengthAssignment_6()); 
            // InternalEntityDsl.g:1515:2: ( rule__TextBox__MaxTextLengthAssignment_6 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalEntityDsl.g:1515:3: rule__TextBox__MaxTextLengthAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__TextBox__MaxTextLengthAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextBoxAccess().getMaxTextLengthAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextBox__Group__6__Impl"


    // $ANTLR start "rule__TextBox__Group__7"
    // InternalEntityDsl.g:1523:1: rule__TextBox__Group__7 : rule__TextBox__Group__7__Impl rule__TextBox__Group__8 ;
    public final void rule__TextBox__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1527:1: ( rule__TextBox__Group__7__Impl rule__TextBox__Group__8 )
            // InternalEntityDsl.g:1528:2: rule__TextBox__Group__7__Impl rule__TextBox__Group__8
            {
            pushFollow(FOLLOW_15);
            rule__TextBox__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextBox__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextBox__Group__7"


    // $ANTLR start "rule__TextBox__Group__7__Impl"
    // InternalEntityDsl.g:1535:1: rule__TextBox__Group__7__Impl : ( ')' ) ;
    public final void rule__TextBox__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1539:1: ( ( ')' ) )
            // InternalEntityDsl.g:1540:1: ( ')' )
            {
            // InternalEntityDsl.g:1540:1: ( ')' )
            // InternalEntityDsl.g:1541:2: ')'
            {
             before(grammarAccess.getTextBoxAccess().getRightParenthesisKeyword_7()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTextBoxAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextBox__Group__7__Impl"


    // $ANTLR start "rule__TextBox__Group__8"
    // InternalEntityDsl.g:1550:1: rule__TextBox__Group__8 : rule__TextBox__Group__8__Impl ;
    public final void rule__TextBox__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1554:1: ( rule__TextBox__Group__8__Impl )
            // InternalEntityDsl.g:1555:2: rule__TextBox__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TextBox__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextBox__Group__8"


    // $ANTLR start "rule__TextBox__Group__8__Impl"
    // InternalEntityDsl.g:1561:1: rule__TextBox__Group__8__Impl : ( ']' ) ;
    public final void rule__TextBox__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1565:1: ( ( ']' ) )
            // InternalEntityDsl.g:1566:1: ( ']' )
            {
            // InternalEntityDsl.g:1566:1: ( ']' )
            // InternalEntityDsl.g:1567:2: ']'
            {
             before(grammarAccess.getTextBoxAccess().getRightSquareBracketKeyword_8()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTextBoxAccess().getRightSquareBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextBox__Group__8__Impl"


    // $ANTLR start "rule__ComboBox__Group__0"
    // InternalEntityDsl.g:1577:1: rule__ComboBox__Group__0 : rule__ComboBox__Group__0__Impl rule__ComboBox__Group__1 ;
    public final void rule__ComboBox__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1581:1: ( rule__ComboBox__Group__0__Impl rule__ComboBox__Group__1 )
            // InternalEntityDsl.g:1582:2: rule__ComboBox__Group__0__Impl rule__ComboBox__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__ComboBox__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComboBox__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComboBox__Group__0"


    // $ANTLR start "rule__ComboBox__Group__0__Impl"
    // InternalEntityDsl.g:1589:1: rule__ComboBox__Group__0__Impl : ( ( rule__ComboBox__NameAssignment_0 ) ) ;
    public final void rule__ComboBox__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1593:1: ( ( ( rule__ComboBox__NameAssignment_0 ) ) )
            // InternalEntityDsl.g:1594:1: ( ( rule__ComboBox__NameAssignment_0 ) )
            {
            // InternalEntityDsl.g:1594:1: ( ( rule__ComboBox__NameAssignment_0 ) )
            // InternalEntityDsl.g:1595:2: ( rule__ComboBox__NameAssignment_0 )
            {
             before(grammarAccess.getComboBoxAccess().getNameAssignment_0()); 
            // InternalEntityDsl.g:1596:2: ( rule__ComboBox__NameAssignment_0 )
            // InternalEntityDsl.g:1596:3: rule__ComboBox__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ComboBox__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getComboBoxAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComboBox__Group__0__Impl"


    // $ANTLR start "rule__ComboBox__Group__1"
    // InternalEntityDsl.g:1604:1: rule__ComboBox__Group__1 : rule__ComboBox__Group__1__Impl rule__ComboBox__Group__2 ;
    public final void rule__ComboBox__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1608:1: ( rule__ComboBox__Group__1__Impl rule__ComboBox__Group__2 )
            // InternalEntityDsl.g:1609:2: rule__ComboBox__Group__1__Impl rule__ComboBox__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__ComboBox__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComboBox__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComboBox__Group__1"


    // $ANTLR start "rule__ComboBox__Group__1__Impl"
    // InternalEntityDsl.g:1616:1: rule__ComboBox__Group__1__Impl : ( '(' ) ;
    public final void rule__ComboBox__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1620:1: ( ( '(' ) )
            // InternalEntityDsl.g:1621:1: ( '(' )
            {
            // InternalEntityDsl.g:1621:1: ( '(' )
            // InternalEntityDsl.g:1622:2: '('
            {
             before(grammarAccess.getComboBoxAccess().getLeftParenthesisKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getComboBoxAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComboBox__Group__1__Impl"


    // $ANTLR start "rule__ComboBox__Group__2"
    // InternalEntityDsl.g:1631:1: rule__ComboBox__Group__2 : rule__ComboBox__Group__2__Impl rule__ComboBox__Group__3 ;
    public final void rule__ComboBox__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1635:1: ( rule__ComboBox__Group__2__Impl rule__ComboBox__Group__3 )
            // InternalEntityDsl.g:1636:2: rule__ComboBox__Group__2__Impl rule__ComboBox__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__ComboBox__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComboBox__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComboBox__Group__2"


    // $ANTLR start "rule__ComboBox__Group__2__Impl"
    // InternalEntityDsl.g:1643:1: rule__ComboBox__Group__2__Impl : ( ( rule__ComboBox__ItemsAssignment_2 )* ) ;
    public final void rule__ComboBox__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1647:1: ( ( ( rule__ComboBox__ItemsAssignment_2 )* ) )
            // InternalEntityDsl.g:1648:1: ( ( rule__ComboBox__ItemsAssignment_2 )* )
            {
            // InternalEntityDsl.g:1648:1: ( ( rule__ComboBox__ItemsAssignment_2 )* )
            // InternalEntityDsl.g:1649:2: ( rule__ComboBox__ItemsAssignment_2 )*
            {
             before(grammarAccess.getComboBoxAccess().getItemsAssignment_2()); 
            // InternalEntityDsl.g:1650:2: ( rule__ComboBox__ItemsAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_STRING) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalEntityDsl.g:1650:3: rule__ComboBox__ItemsAssignment_2
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__ComboBox__ItemsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getComboBoxAccess().getItemsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComboBox__Group__2__Impl"


    // $ANTLR start "rule__ComboBox__Group__3"
    // InternalEntityDsl.g:1658:1: rule__ComboBox__Group__3 : rule__ComboBox__Group__3__Impl rule__ComboBox__Group__4 ;
    public final void rule__ComboBox__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1662:1: ( rule__ComboBox__Group__3__Impl rule__ComboBox__Group__4 )
            // InternalEntityDsl.g:1663:2: rule__ComboBox__Group__3__Impl rule__ComboBox__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__ComboBox__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComboBox__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComboBox__Group__3"


    // $ANTLR start "rule__ComboBox__Group__3__Impl"
    // InternalEntityDsl.g:1670:1: rule__ComboBox__Group__3__Impl : ( ')' ) ;
    public final void rule__ComboBox__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1674:1: ( ( ')' ) )
            // InternalEntityDsl.g:1675:1: ( ')' )
            {
            // InternalEntityDsl.g:1675:1: ( ')' )
            // InternalEntityDsl.g:1676:2: ')'
            {
             before(grammarAccess.getComboBoxAccess().getRightParenthesisKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getComboBoxAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComboBox__Group__3__Impl"


    // $ANTLR start "rule__ComboBox__Group__4"
    // InternalEntityDsl.g:1685:1: rule__ComboBox__Group__4 : rule__ComboBox__Group__4__Impl rule__ComboBox__Group__5 ;
    public final void rule__ComboBox__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1689:1: ( rule__ComboBox__Group__4__Impl rule__ComboBox__Group__5 )
            // InternalEntityDsl.g:1690:2: rule__ComboBox__Group__4__Impl rule__ComboBox__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__ComboBox__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComboBox__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComboBox__Group__4"


    // $ANTLR start "rule__ComboBox__Group__4__Impl"
    // InternalEntityDsl.g:1697:1: rule__ComboBox__Group__4__Impl : ( '[' ) ;
    public final void rule__ComboBox__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1701:1: ( ( '[' ) )
            // InternalEntityDsl.g:1702:1: ( '[' )
            {
            // InternalEntityDsl.g:1702:1: ( '[' )
            // InternalEntityDsl.g:1703:2: '['
            {
             before(grammarAccess.getComboBoxAccess().getLeftSquareBracketKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getComboBoxAccess().getLeftSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComboBox__Group__4__Impl"


    // $ANTLR start "rule__ComboBox__Group__5"
    // InternalEntityDsl.g:1712:1: rule__ComboBox__Group__5 : rule__ComboBox__Group__5__Impl rule__ComboBox__Group__6 ;
    public final void rule__ComboBox__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1716:1: ( rule__ComboBox__Group__5__Impl rule__ComboBox__Group__6 )
            // InternalEntityDsl.g:1717:2: rule__ComboBox__Group__5__Impl rule__ComboBox__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__ComboBox__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComboBox__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComboBox__Group__5"


    // $ANTLR start "rule__ComboBox__Group__5__Impl"
    // InternalEntityDsl.g:1724:1: rule__ComboBox__Group__5__Impl : ( ( rule__ComboBox__DataTypeAssignment_5 ) ) ;
    public final void rule__ComboBox__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1728:1: ( ( ( rule__ComboBox__DataTypeAssignment_5 ) ) )
            // InternalEntityDsl.g:1729:1: ( ( rule__ComboBox__DataTypeAssignment_5 ) )
            {
            // InternalEntityDsl.g:1729:1: ( ( rule__ComboBox__DataTypeAssignment_5 ) )
            // InternalEntityDsl.g:1730:2: ( rule__ComboBox__DataTypeAssignment_5 )
            {
             before(grammarAccess.getComboBoxAccess().getDataTypeAssignment_5()); 
            // InternalEntityDsl.g:1731:2: ( rule__ComboBox__DataTypeAssignment_5 )
            // InternalEntityDsl.g:1731:3: rule__ComboBox__DataTypeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ComboBox__DataTypeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getComboBoxAccess().getDataTypeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComboBox__Group__5__Impl"


    // $ANTLR start "rule__ComboBox__Group__6"
    // InternalEntityDsl.g:1739:1: rule__ComboBox__Group__6 : rule__ComboBox__Group__6__Impl ;
    public final void rule__ComboBox__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1743:1: ( rule__ComboBox__Group__6__Impl )
            // InternalEntityDsl.g:1744:2: rule__ComboBox__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComboBox__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComboBox__Group__6"


    // $ANTLR start "rule__ComboBox__Group__6__Impl"
    // InternalEntityDsl.g:1750:1: rule__ComboBox__Group__6__Impl : ( ']' ) ;
    public final void rule__ComboBox__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1754:1: ( ( ']' ) )
            // InternalEntityDsl.g:1755:1: ( ']' )
            {
            // InternalEntityDsl.g:1755:1: ( ']' )
            // InternalEntityDsl.g:1756:2: ']'
            {
             before(grammarAccess.getComboBoxAccess().getRightSquareBracketKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getComboBoxAccess().getRightSquareBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComboBox__Group__6__Impl"


    // $ANTLR start "rule__Domainmodel__ApplicationNameAssignment_1"
    // InternalEntityDsl.g:1766:1: rule__Domainmodel__ApplicationNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Domainmodel__ApplicationNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1770:1: ( ( RULE_ID ) )
            // InternalEntityDsl.g:1771:2: ( RULE_ID )
            {
            // InternalEntityDsl.g:1771:2: ( RULE_ID )
            // InternalEntityDsl.g:1772:3: RULE_ID
            {
             before(grammarAccess.getDomainmodelAccess().getApplicationNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDomainmodelAccess().getApplicationNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domainmodel__ApplicationNameAssignment_1"


    // $ANTLR start "rule__Domainmodel__ElementsAssignment_2"
    // InternalEntityDsl.g:1781:1: rule__Domainmodel__ElementsAssignment_2 : ( ruleEntity ) ;
    public final void rule__Domainmodel__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1785:1: ( ( ruleEntity ) )
            // InternalEntityDsl.g:1786:2: ( ruleEntity )
            {
            // InternalEntityDsl.g:1786:2: ( ruleEntity )
            // InternalEntityDsl.g:1787:3: ruleEntity
            {
             before(grammarAccess.getDomainmodelAccess().getElementsEntityParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getDomainmodelAccess().getElementsEntityParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domainmodel__ElementsAssignment_2"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // InternalEntityDsl.g:1796:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1800:1: ( ( RULE_ID ) )
            // InternalEntityDsl.g:1801:2: ( RULE_ID )
            {
            // InternalEntityDsl.g:1801:2: ( RULE_ID )
            // InternalEntityDsl.g:1802:3: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NameAssignment_1"


    // $ANTLR start "rule__Entity__AttributesAssignment_3"
    // InternalEntityDsl.g:1811:1: rule__Entity__AttributesAssignment_3 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1815:1: ( ( ruleAttribute ) )
            // InternalEntityDsl.g:1816:2: ( ruleAttribute )
            {
            // InternalEntityDsl.g:1816:2: ( ruleAttribute )
            // InternalEntityDsl.g:1817:3: ruleAttribute
            {
             before(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__AttributesAssignment_3"


    // $ANTLR start "rule__Attribute__RequiredAssignment_0"
    // InternalEntityDsl.g:1826:1: rule__Attribute__RequiredAssignment_0 : ( ( '*' ) ) ;
    public final void rule__Attribute__RequiredAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1830:1: ( ( ( '*' ) ) )
            // InternalEntityDsl.g:1831:2: ( ( '*' ) )
            {
            // InternalEntityDsl.g:1831:2: ( ( '*' ) )
            // InternalEntityDsl.g:1832:3: ( '*' )
            {
             before(grammarAccess.getAttributeAccess().getRequiredAsteriskKeyword_0_0()); 
            // InternalEntityDsl.g:1833:3: ( '*' )
            // InternalEntityDsl.g:1834:4: '*'
            {
             before(grammarAccess.getAttributeAccess().getRequiredAsteriskKeyword_0_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getRequiredAsteriskKeyword_0_0()); 

            }

             after(grammarAccess.getAttributeAccess().getRequiredAsteriskKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__RequiredAssignment_0"


    // $ANTLR start "rule__Attribute__NameAssignment_1"
    // InternalEntityDsl.g:1845:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1849:1: ( ( RULE_ID ) )
            // InternalEntityDsl.g:1850:2: ( RULE_ID )
            {
            // InternalEntityDsl.g:1850:2: ( RULE_ID )
            // InternalEntityDsl.g:1851:3: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_1"


    // $ANTLR start "rule__Attribute__InputTypeAssignment_4"
    // InternalEntityDsl.g:1860:1: rule__Attribute__InputTypeAssignment_4 : ( ruleWinFormControlType ) ;
    public final void rule__Attribute__InputTypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1864:1: ( ( ruleWinFormControlType ) )
            // InternalEntityDsl.g:1865:2: ( ruleWinFormControlType )
            {
            // InternalEntityDsl.g:1865:2: ( ruleWinFormControlType )
            // InternalEntityDsl.g:1866:3: ruleWinFormControlType
            {
             before(grammarAccess.getAttributeAccess().getInputTypeWinFormControlTypeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleWinFormControlType();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getInputTypeWinFormControlTypeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__InputTypeAssignment_4"


    // $ANTLR start "rule__Attribute__LabelTextAssignment_6"
    // InternalEntityDsl.g:1875:1: rule__Attribute__LabelTextAssignment_6 : ( ruleLabel ) ;
    public final void rule__Attribute__LabelTextAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1879:1: ( ( ruleLabel ) )
            // InternalEntityDsl.g:1880:2: ( ruleLabel )
            {
            // InternalEntityDsl.g:1880:2: ( ruleLabel )
            // InternalEntityDsl.g:1881:3: ruleLabel
            {
             before(grammarAccess.getAttributeAccess().getLabelTextLabelParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleLabel();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getLabelTextLabelParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__LabelTextAssignment_6"


    // $ANTLR start "rule__DataType__TypeAssignment"
    // InternalEntityDsl.g:1890:1: rule__DataType__TypeAssignment : ( ( rule__DataType__TypeAlternatives_0 ) ) ;
    public final void rule__DataType__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1894:1: ( ( ( rule__DataType__TypeAlternatives_0 ) ) )
            // InternalEntityDsl.g:1895:2: ( ( rule__DataType__TypeAlternatives_0 ) )
            {
            // InternalEntityDsl.g:1895:2: ( ( rule__DataType__TypeAlternatives_0 ) )
            // InternalEntityDsl.g:1896:3: ( rule__DataType__TypeAlternatives_0 )
            {
             before(grammarAccess.getDataTypeAccess().getTypeAlternatives_0()); 
            // InternalEntityDsl.g:1897:3: ( rule__DataType__TypeAlternatives_0 )
            // InternalEntityDsl.g:1897:4: rule__DataType__TypeAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__DataType__TypeAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getTypeAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__TypeAssignment"


    // $ANTLR start "rule__Label__TextAssignment"
    // InternalEntityDsl.g:1905:1: rule__Label__TextAssignment : ( RULE_STRING ) ;
    public final void rule__Label__TextAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1909:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:1910:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:1910:2: ( RULE_STRING )
            // InternalEntityDsl.g:1911:3: RULE_STRING
            {
             before(grammarAccess.getLabelAccess().getTextSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLabelAccess().getTextSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__TextAssignment"


    // $ANTLR start "rule__WinFormControlType__ControlTypeAssignment_0"
    // InternalEntityDsl.g:1920:1: rule__WinFormControlType__ControlTypeAssignment_0 : ( ruleTextBox ) ;
    public final void rule__WinFormControlType__ControlTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1924:1: ( ( ruleTextBox ) )
            // InternalEntityDsl.g:1925:2: ( ruleTextBox )
            {
            // InternalEntityDsl.g:1925:2: ( ruleTextBox )
            // InternalEntityDsl.g:1926:3: ruleTextBox
            {
             before(grammarAccess.getWinFormControlTypeAccess().getControlTypeTextBoxParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTextBox();

            state._fsp--;

             after(grammarAccess.getWinFormControlTypeAccess().getControlTypeTextBoxParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WinFormControlType__ControlTypeAssignment_0"


    // $ANTLR start "rule__Spinner__NameAssignment_0"
    // InternalEntityDsl.g:1935:1: rule__Spinner__NameAssignment_0 : ( ( 'Spinner' ) ) ;
    public final void rule__Spinner__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1939:1: ( ( ( 'Spinner' ) ) )
            // InternalEntityDsl.g:1940:2: ( ( 'Spinner' ) )
            {
            // InternalEntityDsl.g:1940:2: ( ( 'Spinner' ) )
            // InternalEntityDsl.g:1941:3: ( 'Spinner' )
            {
             before(grammarAccess.getSpinnerAccess().getNameSpinnerKeyword_0_0()); 
            // InternalEntityDsl.g:1942:3: ( 'Spinner' )
            // InternalEntityDsl.g:1943:4: 'Spinner'
            {
             before(grammarAccess.getSpinnerAccess().getNameSpinnerKeyword_0_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSpinnerAccess().getNameSpinnerKeyword_0_0()); 

            }

             after(grammarAccess.getSpinnerAccess().getNameSpinnerKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spinner__NameAssignment_0"


    // $ANTLR start "rule__Spinner__DefaultValueAssignment_2"
    // InternalEntityDsl.g:1954:1: rule__Spinner__DefaultValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__Spinner__DefaultValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1958:1: ( ( RULE_INT ) )
            // InternalEntityDsl.g:1959:2: ( RULE_INT )
            {
            // InternalEntityDsl.g:1959:2: ( RULE_INT )
            // InternalEntityDsl.g:1960:3: RULE_INT
            {
             before(grammarAccess.getSpinnerAccess().getDefaultValueINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSpinnerAccess().getDefaultValueINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spinner__DefaultValueAssignment_2"


    // $ANTLR start "rule__Spinner__MinimumValueAssignment_5"
    // InternalEntityDsl.g:1969:1: rule__Spinner__MinimumValueAssignment_5 : ( RULE_INT ) ;
    public final void rule__Spinner__MinimumValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1973:1: ( ( RULE_INT ) )
            // InternalEntityDsl.g:1974:2: ( RULE_INT )
            {
            // InternalEntityDsl.g:1974:2: ( RULE_INT )
            // InternalEntityDsl.g:1975:3: RULE_INT
            {
             before(grammarAccess.getSpinnerAccess().getMinimumValueINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSpinnerAccess().getMinimumValueINTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spinner__MinimumValueAssignment_5"


    // $ANTLR start "rule__Spinner__MaximumValueAssignment_7"
    // InternalEntityDsl.g:1984:1: rule__Spinner__MaximumValueAssignment_7 : ( RULE_INT ) ;
    public final void rule__Spinner__MaximumValueAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1988:1: ( ( RULE_INT ) )
            // InternalEntityDsl.g:1989:2: ( RULE_INT )
            {
            // InternalEntityDsl.g:1989:2: ( RULE_INT )
            // InternalEntityDsl.g:1990:3: RULE_INT
            {
             before(grammarAccess.getSpinnerAccess().getMaximumValueINTTerminalRuleCall_7_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSpinnerAccess().getMaximumValueINTTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spinner__MaximumValueAssignment_7"


    // $ANTLR start "rule__RadioButtonGroup__NameAssignment_0"
    // InternalEntityDsl.g:1999:1: rule__RadioButtonGroup__NameAssignment_0 : ( ( 'RadioButtonGroup' ) ) ;
    public final void rule__RadioButtonGroup__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2003:1: ( ( ( 'RadioButtonGroup' ) ) )
            // InternalEntityDsl.g:2004:2: ( ( 'RadioButtonGroup' ) )
            {
            // InternalEntityDsl.g:2004:2: ( ( 'RadioButtonGroup' ) )
            // InternalEntityDsl.g:2005:3: ( 'RadioButtonGroup' )
            {
             before(grammarAccess.getRadioButtonGroupAccess().getNameRadioButtonGroupKeyword_0_0()); 
            // InternalEntityDsl.g:2006:3: ( 'RadioButtonGroup' )
            // InternalEntityDsl.g:2007:4: 'RadioButtonGroup'
            {
             before(grammarAccess.getRadioButtonGroupAccess().getNameRadioButtonGroupKeyword_0_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getRadioButtonGroupAccess().getNameRadioButtonGroupKeyword_0_0()); 

            }

             after(grammarAccess.getRadioButtonGroupAccess().getNameRadioButtonGroupKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadioButtonGroup__NameAssignment_0"


    // $ANTLR start "rule__RadioButtonGroup__ButtonsAssignment_2"
    // InternalEntityDsl.g:2018:1: rule__RadioButtonGroup__ButtonsAssignment_2 : ( ruleRadioButton ) ;
    public final void rule__RadioButtonGroup__ButtonsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2022:1: ( ( ruleRadioButton ) )
            // InternalEntityDsl.g:2023:2: ( ruleRadioButton )
            {
            // InternalEntityDsl.g:2023:2: ( ruleRadioButton )
            // InternalEntityDsl.g:2024:3: ruleRadioButton
            {
             before(grammarAccess.getRadioButtonGroupAccess().getButtonsRadioButtonParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRadioButton();

            state._fsp--;

             after(grammarAccess.getRadioButtonGroupAccess().getButtonsRadioButtonParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadioButtonGroup__ButtonsAssignment_2"


    // $ANTLR start "rule__RadioButtonGroup__DataTypeAssignment_5"
    // InternalEntityDsl.g:2033:1: rule__RadioButtonGroup__DataTypeAssignment_5 : ( ruleDataType ) ;
    public final void rule__RadioButtonGroup__DataTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2037:1: ( ( ruleDataType ) )
            // InternalEntityDsl.g:2038:2: ( ruleDataType )
            {
            // InternalEntityDsl.g:2038:2: ( ruleDataType )
            // InternalEntityDsl.g:2039:3: ruleDataType
            {
             before(grammarAccess.getRadioButtonGroupAccess().getDataTypeDataTypeParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getRadioButtonGroupAccess().getDataTypeDataTypeParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadioButtonGroup__DataTypeAssignment_5"


    // $ANTLR start "rule__RadioButton__TextAssignment"
    // InternalEntityDsl.g:2048:1: rule__RadioButton__TextAssignment : ( RULE_STRING ) ;
    public final void rule__RadioButton__TextAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2052:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:2053:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:2053:2: ( RULE_STRING )
            // InternalEntityDsl.g:2054:3: RULE_STRING
            {
             before(grammarAccess.getRadioButtonAccess().getTextSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRadioButtonAccess().getTextSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadioButton__TextAssignment"


    // $ANTLR start "rule__CheckBox__NameAssignment"
    // InternalEntityDsl.g:2063:1: rule__CheckBox__NameAssignment : ( ( 'CheckBox' ) ) ;
    public final void rule__CheckBox__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2067:1: ( ( ( 'CheckBox' ) ) )
            // InternalEntityDsl.g:2068:2: ( ( 'CheckBox' ) )
            {
            // InternalEntityDsl.g:2068:2: ( ( 'CheckBox' ) )
            // InternalEntityDsl.g:2069:3: ( 'CheckBox' )
            {
             before(grammarAccess.getCheckBoxAccess().getNameCheckBoxKeyword_0()); 
            // InternalEntityDsl.g:2070:3: ( 'CheckBox' )
            // InternalEntityDsl.g:2071:4: 'CheckBox'
            {
             before(grammarAccess.getCheckBoxAccess().getNameCheckBoxKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCheckBoxAccess().getNameCheckBoxKeyword_0()); 

            }

             after(grammarAccess.getCheckBoxAccess().getNameCheckBoxKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckBox__NameAssignment"


    // $ANTLR start "rule__TextBox__NameAssignment_0"
    // InternalEntityDsl.g:2082:1: rule__TextBox__NameAssignment_0 : ( ( 'TextBox' ) ) ;
    public final void rule__TextBox__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2086:1: ( ( ( 'TextBox' ) ) )
            // InternalEntityDsl.g:2087:2: ( ( 'TextBox' ) )
            {
            // InternalEntityDsl.g:2087:2: ( ( 'TextBox' ) )
            // InternalEntityDsl.g:2088:3: ( 'TextBox' )
            {
             before(grammarAccess.getTextBoxAccess().getNameTextBoxKeyword_0_0()); 
            // InternalEntityDsl.g:2089:3: ( 'TextBox' )
            // InternalEntityDsl.g:2090:4: 'TextBox'
            {
             before(grammarAccess.getTextBoxAccess().getNameTextBoxKeyword_0_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getTextBoxAccess().getNameTextBoxKeyword_0_0()); 

            }

             after(grammarAccess.getTextBoxAccess().getNameTextBoxKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextBox__NameAssignment_0"


    // $ANTLR start "rule__TextBox__DataTypeAssignment_2"
    // InternalEntityDsl.g:2101:1: rule__TextBox__DataTypeAssignment_2 : ( ruleDataType ) ;
    public final void rule__TextBox__DataTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2105:1: ( ( ruleDataType ) )
            // InternalEntityDsl.g:2106:2: ( ruleDataType )
            {
            // InternalEntityDsl.g:2106:2: ( ruleDataType )
            // InternalEntityDsl.g:2107:3: ruleDataType
            {
             before(grammarAccess.getTextBoxAccess().getDataTypeDataTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getTextBoxAccess().getDataTypeDataTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextBox__DataTypeAssignment_2"


    // $ANTLR start "rule__TextBox__MinTextLengthAssignment_4"
    // InternalEntityDsl.g:2116:1: rule__TextBox__MinTextLengthAssignment_4 : ( RULE_INT ) ;
    public final void rule__TextBox__MinTextLengthAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2120:1: ( ( RULE_INT ) )
            // InternalEntityDsl.g:2121:2: ( RULE_INT )
            {
            // InternalEntityDsl.g:2121:2: ( RULE_INT )
            // InternalEntityDsl.g:2122:3: RULE_INT
            {
             before(grammarAccess.getTextBoxAccess().getMinTextLengthINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTextBoxAccess().getMinTextLengthINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextBox__MinTextLengthAssignment_4"


    // $ANTLR start "rule__TextBox__MaxTextLengthAssignment_6"
    // InternalEntityDsl.g:2131:1: rule__TextBox__MaxTextLengthAssignment_6 : ( RULE_INT ) ;
    public final void rule__TextBox__MaxTextLengthAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2135:1: ( ( RULE_INT ) )
            // InternalEntityDsl.g:2136:2: ( RULE_INT )
            {
            // InternalEntityDsl.g:2136:2: ( RULE_INT )
            // InternalEntityDsl.g:2137:3: RULE_INT
            {
             before(grammarAccess.getTextBoxAccess().getMaxTextLengthINTTerminalRuleCall_6_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTextBoxAccess().getMaxTextLengthINTTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextBox__MaxTextLengthAssignment_6"


    // $ANTLR start "rule__ComboBox__NameAssignment_0"
    // InternalEntityDsl.g:2146:1: rule__ComboBox__NameAssignment_0 : ( ( 'ComboBox' ) ) ;
    public final void rule__ComboBox__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2150:1: ( ( ( 'ComboBox' ) ) )
            // InternalEntityDsl.g:2151:2: ( ( 'ComboBox' ) )
            {
            // InternalEntityDsl.g:2151:2: ( ( 'ComboBox' ) )
            // InternalEntityDsl.g:2152:3: ( 'ComboBox' )
            {
             before(grammarAccess.getComboBoxAccess().getNameComboBoxKeyword_0_0()); 
            // InternalEntityDsl.g:2153:3: ( 'ComboBox' )
            // InternalEntityDsl.g:2154:4: 'ComboBox'
            {
             before(grammarAccess.getComboBoxAccess().getNameComboBoxKeyword_0_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getComboBoxAccess().getNameComboBoxKeyword_0_0()); 

            }

             after(grammarAccess.getComboBoxAccess().getNameComboBoxKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComboBox__NameAssignment_0"


    // $ANTLR start "rule__ComboBox__ItemsAssignment_2"
    // InternalEntityDsl.g:2165:1: rule__ComboBox__ItemsAssignment_2 : ( ruleComboBoxItem ) ;
    public final void rule__ComboBox__ItemsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2169:1: ( ( ruleComboBoxItem ) )
            // InternalEntityDsl.g:2170:2: ( ruleComboBoxItem )
            {
            // InternalEntityDsl.g:2170:2: ( ruleComboBoxItem )
            // InternalEntityDsl.g:2171:3: ruleComboBoxItem
            {
             before(grammarAccess.getComboBoxAccess().getItemsComboBoxItemParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleComboBoxItem();

            state._fsp--;

             after(grammarAccess.getComboBoxAccess().getItemsComboBoxItemParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComboBox__ItemsAssignment_2"


    // $ANTLR start "rule__ComboBox__DataTypeAssignment_5"
    // InternalEntityDsl.g:2180:1: rule__ComboBox__DataTypeAssignment_5 : ( ruleDataType ) ;
    public final void rule__ComboBox__DataTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2184:1: ( ( ruleDataType ) )
            // InternalEntityDsl.g:2185:2: ( ruleDataType )
            {
            // InternalEntityDsl.g:2185:2: ( ruleDataType )
            // InternalEntityDsl.g:2186:3: ruleDataType
            {
             before(grammarAccess.getComboBoxAccess().getDataTypeDataTypeParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getComboBoxAccess().getDataTypeDataTypeParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComboBox__DataTypeAssignment_5"


    // $ANTLR start "rule__ComboBoxItem__TextAssignment"
    // InternalEntityDsl.g:2195:1: rule__ComboBoxItem__TextAssignment : ( RULE_STRING ) ;
    public final void rule__ComboBoxItem__TextAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2199:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:2200:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:2200:2: ( RULE_STRING )
            // InternalEntityDsl.g:2201:3: RULE_STRING
            {
             before(grammarAccess.getComboBoxItemAccess().getTextSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getComboBoxItemAccess().getTextSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComboBoxItem__TextAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001020010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001000012L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000003E000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000800040L});

}