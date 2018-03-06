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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'database:'", "'entity'", "'{'", "'}'", "':'", "'['", "','", "']'", "'('", "')'", "'required='", "'min='", "'max='", "'RadioButtonGroup'", "'CheckBox'", "'TextBox'", "'ComboBox'"
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


    // $ANTLR start "entryRuleLabel"
    // InternalEntityDsl.g:128:1: entryRuleLabel : ruleLabel EOF ;
    public final void entryRuleLabel() throws RecognitionException {
        try {
            // InternalEntityDsl.g:129:1: ( ruleLabel EOF )
            // InternalEntityDsl.g:130:1: ruleLabel EOF
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
    // InternalEntityDsl.g:137:1: ruleLabel : ( ( rule__Label__TextAssignment ) ) ;
    public final void ruleLabel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:141:2: ( ( ( rule__Label__TextAssignment ) ) )
            // InternalEntityDsl.g:142:2: ( ( rule__Label__TextAssignment ) )
            {
            // InternalEntityDsl.g:142:2: ( ( rule__Label__TextAssignment ) )
            // InternalEntityDsl.g:143:3: ( rule__Label__TextAssignment )
            {
             before(grammarAccess.getLabelAccess().getTextAssignment()); 
            // InternalEntityDsl.g:144:3: ( rule__Label__TextAssignment )
            // InternalEntityDsl.g:144:4: rule__Label__TextAssignment
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
    // InternalEntityDsl.g:153:1: entryRuleWinFormControlType : ruleWinFormControlType EOF ;
    public final void entryRuleWinFormControlType() throws RecognitionException {
        try {
            // InternalEntityDsl.g:154:1: ( ruleWinFormControlType EOF )
            // InternalEntityDsl.g:155:1: ruleWinFormControlType EOF
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
    // InternalEntityDsl.g:162:1: ruleWinFormControlType : ( ( rule__WinFormControlType__Alternatives ) ) ;
    public final void ruleWinFormControlType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:166:2: ( ( ( rule__WinFormControlType__Alternatives ) ) )
            // InternalEntityDsl.g:167:2: ( ( rule__WinFormControlType__Alternatives ) )
            {
            // InternalEntityDsl.g:167:2: ( ( rule__WinFormControlType__Alternatives ) )
            // InternalEntityDsl.g:168:3: ( rule__WinFormControlType__Alternatives )
            {
             before(grammarAccess.getWinFormControlTypeAccess().getAlternatives()); 
            // InternalEntityDsl.g:169:3: ( rule__WinFormControlType__Alternatives )
            // InternalEntityDsl.g:169:4: rule__WinFormControlType__Alternatives
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


    // $ANTLR start "entryRuleRadioButtonGroup"
    // InternalEntityDsl.g:178:1: entryRuleRadioButtonGroup : ruleRadioButtonGroup EOF ;
    public final void entryRuleRadioButtonGroup() throws RecognitionException {
        try {
            // InternalEntityDsl.g:179:1: ( ruleRadioButtonGroup EOF )
            // InternalEntityDsl.g:180:1: ruleRadioButtonGroup EOF
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
    // InternalEntityDsl.g:187:1: ruleRadioButtonGroup : ( ( rule__RadioButtonGroup__Group__0 ) ) ;
    public final void ruleRadioButtonGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:191:2: ( ( ( rule__RadioButtonGroup__Group__0 ) ) )
            // InternalEntityDsl.g:192:2: ( ( rule__RadioButtonGroup__Group__0 ) )
            {
            // InternalEntityDsl.g:192:2: ( ( rule__RadioButtonGroup__Group__0 ) )
            // InternalEntityDsl.g:193:3: ( rule__RadioButtonGroup__Group__0 )
            {
             before(grammarAccess.getRadioButtonGroupAccess().getGroup()); 
            // InternalEntityDsl.g:194:3: ( rule__RadioButtonGroup__Group__0 )
            // InternalEntityDsl.g:194:4: rule__RadioButtonGroup__Group__0
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
    // InternalEntityDsl.g:203:1: entryRuleRadioButton : ruleRadioButton EOF ;
    public final void entryRuleRadioButton() throws RecognitionException {
        try {
            // InternalEntityDsl.g:204:1: ( ruleRadioButton EOF )
            // InternalEntityDsl.g:205:1: ruleRadioButton EOF
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
    // InternalEntityDsl.g:212:1: ruleRadioButton : ( ( rule__RadioButton__TextAssignment ) ) ;
    public final void ruleRadioButton() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:216:2: ( ( ( rule__RadioButton__TextAssignment ) ) )
            // InternalEntityDsl.g:217:2: ( ( rule__RadioButton__TextAssignment ) )
            {
            // InternalEntityDsl.g:217:2: ( ( rule__RadioButton__TextAssignment ) )
            // InternalEntityDsl.g:218:3: ( rule__RadioButton__TextAssignment )
            {
             before(grammarAccess.getRadioButtonAccess().getTextAssignment()); 
            // InternalEntityDsl.g:219:3: ( rule__RadioButton__TextAssignment )
            // InternalEntityDsl.g:219:4: rule__RadioButton__TextAssignment
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
    // InternalEntityDsl.g:228:1: entryRuleCheckBox : ruleCheckBox EOF ;
    public final void entryRuleCheckBox() throws RecognitionException {
        try {
            // InternalEntityDsl.g:229:1: ( ruleCheckBox EOF )
            // InternalEntityDsl.g:230:1: ruleCheckBox EOF
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
    // InternalEntityDsl.g:237:1: ruleCheckBox : ( ( rule__CheckBox__NameAssignment ) ) ;
    public final void ruleCheckBox() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:241:2: ( ( ( rule__CheckBox__NameAssignment ) ) )
            // InternalEntityDsl.g:242:2: ( ( rule__CheckBox__NameAssignment ) )
            {
            // InternalEntityDsl.g:242:2: ( ( rule__CheckBox__NameAssignment ) )
            // InternalEntityDsl.g:243:3: ( rule__CheckBox__NameAssignment )
            {
             before(grammarAccess.getCheckBoxAccess().getNameAssignment()); 
            // InternalEntityDsl.g:244:3: ( rule__CheckBox__NameAssignment )
            // InternalEntityDsl.g:244:4: rule__CheckBox__NameAssignment
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
    // InternalEntityDsl.g:253:1: entryRuleTextBox : ruleTextBox EOF ;
    public final void entryRuleTextBox() throws RecognitionException {
        try {
            // InternalEntityDsl.g:254:1: ( ruleTextBox EOF )
            // InternalEntityDsl.g:255:1: ruleTextBox EOF
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
    // InternalEntityDsl.g:262:1: ruleTextBox : ( ( rule__TextBox__Group__0 ) ) ;
    public final void ruleTextBox() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:266:2: ( ( ( rule__TextBox__Group__0 ) ) )
            // InternalEntityDsl.g:267:2: ( ( rule__TextBox__Group__0 ) )
            {
            // InternalEntityDsl.g:267:2: ( ( rule__TextBox__Group__0 ) )
            // InternalEntityDsl.g:268:3: ( rule__TextBox__Group__0 )
            {
             before(grammarAccess.getTextBoxAccess().getGroup()); 
            // InternalEntityDsl.g:269:3: ( rule__TextBox__Group__0 )
            // InternalEntityDsl.g:269:4: rule__TextBox__Group__0
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


    // $ANTLR start "entryRuleBoolean"
    // InternalEntityDsl.g:278:1: entryRuleBoolean : ruleBoolean EOF ;
    public final void entryRuleBoolean() throws RecognitionException {
        try {
            // InternalEntityDsl.g:279:1: ( ruleBoolean EOF )
            // InternalEntityDsl.g:280:1: ruleBoolean EOF
            {
             before(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleBoolean();

            state._fsp--;

             after(grammarAccess.getBooleanRule()); 
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
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // InternalEntityDsl.g:287:1: ruleBoolean : ( ( rule__Boolean__ValueAssignment ) ) ;
    public final void ruleBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:291:2: ( ( ( rule__Boolean__ValueAssignment ) ) )
            // InternalEntityDsl.g:292:2: ( ( rule__Boolean__ValueAssignment ) )
            {
            // InternalEntityDsl.g:292:2: ( ( rule__Boolean__ValueAssignment ) )
            // InternalEntityDsl.g:293:3: ( rule__Boolean__ValueAssignment )
            {
             before(grammarAccess.getBooleanAccess().getValueAssignment()); 
            // InternalEntityDsl.g:294:3: ( rule__Boolean__ValueAssignment )
            // InternalEntityDsl.g:294:4: rule__Boolean__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Boolean__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBooleanAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRuleComboBox"
    // InternalEntityDsl.g:303:1: entryRuleComboBox : ruleComboBox EOF ;
    public final void entryRuleComboBox() throws RecognitionException {
        try {
            // InternalEntityDsl.g:304:1: ( ruleComboBox EOF )
            // InternalEntityDsl.g:305:1: ruleComboBox EOF
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
    // InternalEntityDsl.g:312:1: ruleComboBox : ( ( rule__ComboBox__Group__0 ) ) ;
    public final void ruleComboBox() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:316:2: ( ( ( rule__ComboBox__Group__0 ) ) )
            // InternalEntityDsl.g:317:2: ( ( rule__ComboBox__Group__0 ) )
            {
            // InternalEntityDsl.g:317:2: ( ( rule__ComboBox__Group__0 ) )
            // InternalEntityDsl.g:318:3: ( rule__ComboBox__Group__0 )
            {
             before(grammarAccess.getComboBoxAccess().getGroup()); 
            // InternalEntityDsl.g:319:3: ( rule__ComboBox__Group__0 )
            // InternalEntityDsl.g:319:4: rule__ComboBox__Group__0
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
    // InternalEntityDsl.g:328:1: entryRuleComboBoxItem : ruleComboBoxItem EOF ;
    public final void entryRuleComboBoxItem() throws RecognitionException {
        try {
            // InternalEntityDsl.g:329:1: ( ruleComboBoxItem EOF )
            // InternalEntityDsl.g:330:1: ruleComboBoxItem EOF
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
    // InternalEntityDsl.g:337:1: ruleComboBoxItem : ( ( rule__ComboBoxItem__TextAssignment ) ) ;
    public final void ruleComboBoxItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:341:2: ( ( ( rule__ComboBoxItem__TextAssignment ) ) )
            // InternalEntityDsl.g:342:2: ( ( rule__ComboBoxItem__TextAssignment ) )
            {
            // InternalEntityDsl.g:342:2: ( ( rule__ComboBoxItem__TextAssignment ) )
            // InternalEntityDsl.g:343:3: ( rule__ComboBoxItem__TextAssignment )
            {
             before(grammarAccess.getComboBoxItemAccess().getTextAssignment()); 
            // InternalEntityDsl.g:344:3: ( rule__ComboBoxItem__TextAssignment )
            // InternalEntityDsl.g:344:4: rule__ComboBoxItem__TextAssignment
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


    // $ANTLR start "rule__WinFormControlType__Alternatives"
    // InternalEntityDsl.g:352:1: rule__WinFormControlType__Alternatives : ( ( ( rule__WinFormControlType__ControlTypeAssignment_0 ) ) | ( ruleComboBox ) | ( ruleCheckBox ) | ( ruleRadioButtonGroup ) );
    public final void rule__WinFormControlType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:356:1: ( ( ( rule__WinFormControlType__ControlTypeAssignment_0 ) ) | ( ruleComboBox ) | ( ruleCheckBox ) | ( ruleRadioButtonGroup ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt1=1;
                }
                break;
            case 29:
                {
                alt1=2;
                }
                break;
            case 27:
                {
                alt1=3;
                }
                break;
            case 26:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalEntityDsl.g:357:2: ( ( rule__WinFormControlType__ControlTypeAssignment_0 ) )
                    {
                    // InternalEntityDsl.g:357:2: ( ( rule__WinFormControlType__ControlTypeAssignment_0 ) )
                    // InternalEntityDsl.g:358:3: ( rule__WinFormControlType__ControlTypeAssignment_0 )
                    {
                     before(grammarAccess.getWinFormControlTypeAccess().getControlTypeAssignment_0()); 
                    // InternalEntityDsl.g:359:3: ( rule__WinFormControlType__ControlTypeAssignment_0 )
                    // InternalEntityDsl.g:359:4: rule__WinFormControlType__ControlTypeAssignment_0
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
                    // InternalEntityDsl.g:363:2: ( ruleComboBox )
                    {
                    // InternalEntityDsl.g:363:2: ( ruleComboBox )
                    // InternalEntityDsl.g:364:3: ruleComboBox
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
                    // InternalEntityDsl.g:369:2: ( ruleCheckBox )
                    {
                    // InternalEntityDsl.g:369:2: ( ruleCheckBox )
                    // InternalEntityDsl.g:370:3: ruleCheckBox
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
                    // InternalEntityDsl.g:375:2: ( ruleRadioButtonGroup )
                    {
                    // InternalEntityDsl.g:375:2: ( ruleRadioButtonGroup )
                    // InternalEntityDsl.g:376:3: ruleRadioButtonGroup
                    {
                     before(grammarAccess.getWinFormControlTypeAccess().getRadioButtonGroupParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleRadioButtonGroup();

                    state._fsp--;

                     after(grammarAccess.getWinFormControlTypeAccess().getRadioButtonGroupParserRuleCall_3()); 

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


    // $ANTLR start "rule__Boolean__ValueAlternatives_0"
    // InternalEntityDsl.g:385:1: rule__Boolean__ValueAlternatives_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Boolean__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:389:1: ( ( 'true' ) | ( 'false' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalEntityDsl.g:390:2: ( 'true' )
                    {
                    // InternalEntityDsl.g:390:2: ( 'true' )
                    // InternalEntityDsl.g:391:3: 'true'
                    {
                     before(grammarAccess.getBooleanAccess().getValueTrueKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getBooleanAccess().getValueTrueKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEntityDsl.g:396:2: ( 'false' )
                    {
                    // InternalEntityDsl.g:396:2: ( 'false' )
                    // InternalEntityDsl.g:397:3: 'false'
                    {
                     before(grammarAccess.getBooleanAccess().getValueFalseKeyword_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getBooleanAccess().getValueFalseKeyword_0_1()); 

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
    // $ANTLR end "rule__Boolean__ValueAlternatives_0"


    // $ANTLR start "rule__Domainmodel__Group__0"
    // InternalEntityDsl.g:406:1: rule__Domainmodel__Group__0 : rule__Domainmodel__Group__0__Impl rule__Domainmodel__Group__1 ;
    public final void rule__Domainmodel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:410:1: ( rule__Domainmodel__Group__0__Impl rule__Domainmodel__Group__1 )
            // InternalEntityDsl.g:411:2: rule__Domainmodel__Group__0__Impl rule__Domainmodel__Group__1
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
    // InternalEntityDsl.g:418:1: rule__Domainmodel__Group__0__Impl : ( 'database:' ) ;
    public final void rule__Domainmodel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:422:1: ( ( 'database:' ) )
            // InternalEntityDsl.g:423:1: ( 'database:' )
            {
            // InternalEntityDsl.g:423:1: ( 'database:' )
            // InternalEntityDsl.g:424:2: 'database:'
            {
             before(grammarAccess.getDomainmodelAccess().getDatabaseKeyword_0()); 
            match(input,13,FOLLOW_2); 
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
    // InternalEntityDsl.g:433:1: rule__Domainmodel__Group__1 : rule__Domainmodel__Group__1__Impl rule__Domainmodel__Group__2 ;
    public final void rule__Domainmodel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:437:1: ( rule__Domainmodel__Group__1__Impl rule__Domainmodel__Group__2 )
            // InternalEntityDsl.g:438:2: rule__Domainmodel__Group__1__Impl rule__Domainmodel__Group__2
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
    // InternalEntityDsl.g:445:1: rule__Domainmodel__Group__1__Impl : ( ( rule__Domainmodel__ApplicationNameAssignment_1 ) ) ;
    public final void rule__Domainmodel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:449:1: ( ( ( rule__Domainmodel__ApplicationNameAssignment_1 ) ) )
            // InternalEntityDsl.g:450:1: ( ( rule__Domainmodel__ApplicationNameAssignment_1 ) )
            {
            // InternalEntityDsl.g:450:1: ( ( rule__Domainmodel__ApplicationNameAssignment_1 ) )
            // InternalEntityDsl.g:451:2: ( rule__Domainmodel__ApplicationNameAssignment_1 )
            {
             before(grammarAccess.getDomainmodelAccess().getApplicationNameAssignment_1()); 
            // InternalEntityDsl.g:452:2: ( rule__Domainmodel__ApplicationNameAssignment_1 )
            // InternalEntityDsl.g:452:3: rule__Domainmodel__ApplicationNameAssignment_1
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
    // InternalEntityDsl.g:460:1: rule__Domainmodel__Group__2 : rule__Domainmodel__Group__2__Impl ;
    public final void rule__Domainmodel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:464:1: ( rule__Domainmodel__Group__2__Impl )
            // InternalEntityDsl.g:465:2: rule__Domainmodel__Group__2__Impl
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
    // InternalEntityDsl.g:471:1: rule__Domainmodel__Group__2__Impl : ( ( rule__Domainmodel__ElementsAssignment_2 )* ) ;
    public final void rule__Domainmodel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:475:1: ( ( ( rule__Domainmodel__ElementsAssignment_2 )* ) )
            // InternalEntityDsl.g:476:1: ( ( rule__Domainmodel__ElementsAssignment_2 )* )
            {
            // InternalEntityDsl.g:476:1: ( ( rule__Domainmodel__ElementsAssignment_2 )* )
            // InternalEntityDsl.g:477:2: ( rule__Domainmodel__ElementsAssignment_2 )*
            {
             before(grammarAccess.getDomainmodelAccess().getElementsAssignment_2()); 
            // InternalEntityDsl.g:478:2: ( rule__Domainmodel__ElementsAssignment_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalEntityDsl.g:478:3: rule__Domainmodel__ElementsAssignment_2
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
    // InternalEntityDsl.g:487:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:491:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalEntityDsl.g:492:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
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
    // InternalEntityDsl.g:499:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:503:1: ( ( 'entity' ) )
            // InternalEntityDsl.g:504:1: ( 'entity' )
            {
            // InternalEntityDsl.g:504:1: ( 'entity' )
            // InternalEntityDsl.g:505:2: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,14,FOLLOW_2); 
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
    // InternalEntityDsl.g:514:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:518:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalEntityDsl.g:519:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
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
    // InternalEntityDsl.g:526:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:530:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalEntityDsl.g:531:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalEntityDsl.g:531:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalEntityDsl.g:532:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalEntityDsl.g:533:2: ( rule__Entity__NameAssignment_1 )
            // InternalEntityDsl.g:533:3: rule__Entity__NameAssignment_1
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
    // InternalEntityDsl.g:541:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:545:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalEntityDsl.g:546:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
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
    // InternalEntityDsl.g:553:1: rule__Entity__Group__2__Impl : ( '{' ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:557:1: ( ( '{' ) )
            // InternalEntityDsl.g:558:1: ( '{' )
            {
            // InternalEntityDsl.g:558:1: ( '{' )
            // InternalEntityDsl.g:559:2: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
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
    // InternalEntityDsl.g:568:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:572:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalEntityDsl.g:573:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
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
    // InternalEntityDsl.g:580:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__AttributesAssignment_3 )* ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:584:1: ( ( ( rule__Entity__AttributesAssignment_3 )* ) )
            // InternalEntityDsl.g:585:1: ( ( rule__Entity__AttributesAssignment_3 )* )
            {
            // InternalEntityDsl.g:585:1: ( ( rule__Entity__AttributesAssignment_3 )* )
            // InternalEntityDsl.g:586:2: ( rule__Entity__AttributesAssignment_3 )*
            {
             before(grammarAccess.getEntityAccess().getAttributesAssignment_3()); 
            // InternalEntityDsl.g:587:2: ( rule__Entity__AttributesAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalEntityDsl.g:587:3: rule__Entity__AttributesAssignment_3
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
    // InternalEntityDsl.g:595:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:599:1: ( rule__Entity__Group__4__Impl )
            // InternalEntityDsl.g:600:2: rule__Entity__Group__4__Impl
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
    // InternalEntityDsl.g:606:1: rule__Entity__Group__4__Impl : ( '}' ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:610:1: ( ( '}' ) )
            // InternalEntityDsl.g:611:1: ( '}' )
            {
            // InternalEntityDsl.g:611:1: ( '}' )
            // InternalEntityDsl.g:612:2: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4()); 
            match(input,16,FOLLOW_2); 
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
    // InternalEntityDsl.g:622:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:626:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalEntityDsl.g:627:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
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
    // InternalEntityDsl.g:634:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__NameAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:638:1: ( ( ( rule__Attribute__NameAssignment_0 ) ) )
            // InternalEntityDsl.g:639:1: ( ( rule__Attribute__NameAssignment_0 ) )
            {
            // InternalEntityDsl.g:639:1: ( ( rule__Attribute__NameAssignment_0 ) )
            // InternalEntityDsl.g:640:2: ( rule__Attribute__NameAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_0()); 
            // InternalEntityDsl.g:641:2: ( rule__Attribute__NameAssignment_0 )
            // InternalEntityDsl.g:641:3: rule__Attribute__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_0()); 

            }


            }

        }
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
    // InternalEntityDsl.g:649:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:653:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalEntityDsl.g:654:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
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
    // InternalEntityDsl.g:661:1: rule__Attribute__Group__1__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:665:1: ( ( ':' ) )
            // InternalEntityDsl.g:666:1: ( ':' )
            {
            // InternalEntityDsl.g:666:1: ( ':' )
            // InternalEntityDsl.g:667:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getColonKeyword_1()); 

            }


            }

        }
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
    // InternalEntityDsl.g:676:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:680:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalEntityDsl.g:681:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
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
    // InternalEntityDsl.g:688:1: rule__Attribute__Group__2__Impl : ( '[' ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:692:1: ( ( '[' ) )
            // InternalEntityDsl.g:693:1: ( '[' )
            {
            // InternalEntityDsl.g:693:1: ( '[' )
            // InternalEntityDsl.g:694:2: '['
            {
             before(grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
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
    // InternalEntityDsl.g:703:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:707:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // InternalEntityDsl.g:708:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
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
    // InternalEntityDsl.g:715:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__InputTypeAssignment_3 ) ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:719:1: ( ( ( rule__Attribute__InputTypeAssignment_3 ) ) )
            // InternalEntityDsl.g:720:1: ( ( rule__Attribute__InputTypeAssignment_3 ) )
            {
            // InternalEntityDsl.g:720:1: ( ( rule__Attribute__InputTypeAssignment_3 ) )
            // InternalEntityDsl.g:721:2: ( rule__Attribute__InputTypeAssignment_3 )
            {
             before(grammarAccess.getAttributeAccess().getInputTypeAssignment_3()); 
            // InternalEntityDsl.g:722:2: ( rule__Attribute__InputTypeAssignment_3 )
            // InternalEntityDsl.g:722:3: rule__Attribute__InputTypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__InputTypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getInputTypeAssignment_3()); 

            }


            }

        }
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
    // InternalEntityDsl.g:730:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:734:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
            // InternalEntityDsl.g:735:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
            {
            pushFollow(FOLLOW_3);
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
    // InternalEntityDsl.g:742:1: rule__Attribute__Group__4__Impl : ( ',' ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:746:1: ( ( ',' ) )
            // InternalEntityDsl.g:747:1: ( ',' )
            {
            // InternalEntityDsl.g:747:1: ( ',' )
            // InternalEntityDsl.g:748:2: ','
            {
             before(grammarAccess.getAttributeAccess().getCommaKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getCommaKeyword_4()); 

            }


            }

        }
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
    // InternalEntityDsl.g:757:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl rule__Attribute__Group__6 ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:761:1: ( rule__Attribute__Group__5__Impl rule__Attribute__Group__6 )
            // InternalEntityDsl.g:762:2: rule__Attribute__Group__5__Impl rule__Attribute__Group__6
            {
            pushFollow(FOLLOW_13);
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
    // InternalEntityDsl.g:769:1: rule__Attribute__Group__5__Impl : ( ( rule__Attribute__LabelTextAssignment_5 ) ) ;
    public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:773:1: ( ( ( rule__Attribute__LabelTextAssignment_5 ) ) )
            // InternalEntityDsl.g:774:1: ( ( rule__Attribute__LabelTextAssignment_5 ) )
            {
            // InternalEntityDsl.g:774:1: ( ( rule__Attribute__LabelTextAssignment_5 ) )
            // InternalEntityDsl.g:775:2: ( rule__Attribute__LabelTextAssignment_5 )
            {
             before(grammarAccess.getAttributeAccess().getLabelTextAssignment_5()); 
            // InternalEntityDsl.g:776:2: ( rule__Attribute__LabelTextAssignment_5 )
            // InternalEntityDsl.g:776:3: rule__Attribute__LabelTextAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__LabelTextAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getLabelTextAssignment_5()); 

            }


            }

        }
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
    // InternalEntityDsl.g:784:1: rule__Attribute__Group__6 : rule__Attribute__Group__6__Impl ;
    public final void rule__Attribute__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:788:1: ( rule__Attribute__Group__6__Impl )
            // InternalEntityDsl.g:789:2: rule__Attribute__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__6__Impl();

            state._fsp--;


            }

        }
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
    // InternalEntityDsl.g:795:1: rule__Attribute__Group__6__Impl : ( ']' ) ;
    public final void rule__Attribute__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:799:1: ( ( ']' ) )
            // InternalEntityDsl.g:800:1: ( ']' )
            {
            // InternalEntityDsl.g:800:1: ( ']' )
            // InternalEntityDsl.g:801:2: ']'
            {
             before(grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_6()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__RadioButtonGroup__Group__0"
    // InternalEntityDsl.g:811:1: rule__RadioButtonGroup__Group__0 : rule__RadioButtonGroup__Group__0__Impl rule__RadioButtonGroup__Group__1 ;
    public final void rule__RadioButtonGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:815:1: ( rule__RadioButtonGroup__Group__0__Impl rule__RadioButtonGroup__Group__1 )
            // InternalEntityDsl.g:816:2: rule__RadioButtonGroup__Group__0__Impl rule__RadioButtonGroup__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalEntityDsl.g:823:1: rule__RadioButtonGroup__Group__0__Impl : ( ( rule__RadioButtonGroup__NameAssignment_0 ) ) ;
    public final void rule__RadioButtonGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:827:1: ( ( ( rule__RadioButtonGroup__NameAssignment_0 ) ) )
            // InternalEntityDsl.g:828:1: ( ( rule__RadioButtonGroup__NameAssignment_0 ) )
            {
            // InternalEntityDsl.g:828:1: ( ( rule__RadioButtonGroup__NameAssignment_0 ) )
            // InternalEntityDsl.g:829:2: ( rule__RadioButtonGroup__NameAssignment_0 )
            {
             before(grammarAccess.getRadioButtonGroupAccess().getNameAssignment_0()); 
            // InternalEntityDsl.g:830:2: ( rule__RadioButtonGroup__NameAssignment_0 )
            // InternalEntityDsl.g:830:3: rule__RadioButtonGroup__NameAssignment_0
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
    // InternalEntityDsl.g:838:1: rule__RadioButtonGroup__Group__1 : rule__RadioButtonGroup__Group__1__Impl rule__RadioButtonGroup__Group__2 ;
    public final void rule__RadioButtonGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:842:1: ( rule__RadioButtonGroup__Group__1__Impl rule__RadioButtonGroup__Group__2 )
            // InternalEntityDsl.g:843:2: rule__RadioButtonGroup__Group__1__Impl rule__RadioButtonGroup__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalEntityDsl.g:850:1: rule__RadioButtonGroup__Group__1__Impl : ( '(' ) ;
    public final void rule__RadioButtonGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:854:1: ( ( '(' ) )
            // InternalEntityDsl.g:855:1: ( '(' )
            {
            // InternalEntityDsl.g:855:1: ( '(' )
            // InternalEntityDsl.g:856:2: '('
            {
             before(grammarAccess.getRadioButtonGroupAccess().getLeftParenthesisKeyword_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalEntityDsl.g:865:1: rule__RadioButtonGroup__Group__2 : rule__RadioButtonGroup__Group__2__Impl rule__RadioButtonGroup__Group__3 ;
    public final void rule__RadioButtonGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:869:1: ( rule__RadioButtonGroup__Group__2__Impl rule__RadioButtonGroup__Group__3 )
            // InternalEntityDsl.g:870:2: rule__RadioButtonGroup__Group__2__Impl rule__RadioButtonGroup__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalEntityDsl.g:877:1: rule__RadioButtonGroup__Group__2__Impl : ( ( rule__RadioButtonGroup__ButtonsAssignment_2 )* ) ;
    public final void rule__RadioButtonGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:881:1: ( ( ( rule__RadioButtonGroup__ButtonsAssignment_2 )* ) )
            // InternalEntityDsl.g:882:1: ( ( rule__RadioButtonGroup__ButtonsAssignment_2 )* )
            {
            // InternalEntityDsl.g:882:1: ( ( rule__RadioButtonGroup__ButtonsAssignment_2 )* )
            // InternalEntityDsl.g:883:2: ( rule__RadioButtonGroup__ButtonsAssignment_2 )*
            {
             before(grammarAccess.getRadioButtonGroupAccess().getButtonsAssignment_2()); 
            // InternalEntityDsl.g:884:2: ( rule__RadioButtonGroup__ButtonsAssignment_2 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalEntityDsl.g:884:3: rule__RadioButtonGroup__ButtonsAssignment_2
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__RadioButtonGroup__ButtonsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // InternalEntityDsl.g:892:1: rule__RadioButtonGroup__Group__3 : rule__RadioButtonGroup__Group__3__Impl rule__RadioButtonGroup__Group__4 ;
    public final void rule__RadioButtonGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:896:1: ( rule__RadioButtonGroup__Group__3__Impl rule__RadioButtonGroup__Group__4 )
            // InternalEntityDsl.g:897:2: rule__RadioButtonGroup__Group__3__Impl rule__RadioButtonGroup__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalEntityDsl.g:904:1: rule__RadioButtonGroup__Group__3__Impl : ( ')' ) ;
    public final void rule__RadioButtonGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:908:1: ( ( ')' ) )
            // InternalEntityDsl.g:909:1: ( ')' )
            {
            // InternalEntityDsl.g:909:1: ( ')' )
            // InternalEntityDsl.g:910:2: ')'
            {
             before(grammarAccess.getRadioButtonGroupAccess().getRightParenthesisKeyword_3()); 
            match(input,22,FOLLOW_2); 
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
    // InternalEntityDsl.g:919:1: rule__RadioButtonGroup__Group__4 : rule__RadioButtonGroup__Group__4__Impl rule__RadioButtonGroup__Group__5 ;
    public final void rule__RadioButtonGroup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:923:1: ( rule__RadioButtonGroup__Group__4__Impl rule__RadioButtonGroup__Group__5 )
            // InternalEntityDsl.g:924:2: rule__RadioButtonGroup__Group__4__Impl rule__RadioButtonGroup__Group__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalEntityDsl.g:931:1: rule__RadioButtonGroup__Group__4__Impl : ( '[' ) ;
    public final void rule__RadioButtonGroup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:935:1: ( ( '[' ) )
            // InternalEntityDsl.g:936:1: ( '[' )
            {
            // InternalEntityDsl.g:936:1: ( '[' )
            // InternalEntityDsl.g:937:2: '['
            {
             before(grammarAccess.getRadioButtonGroupAccess().getLeftSquareBracketKeyword_4()); 
            match(input,18,FOLLOW_2); 
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
    // InternalEntityDsl.g:946:1: rule__RadioButtonGroup__Group__5 : rule__RadioButtonGroup__Group__5__Impl rule__RadioButtonGroup__Group__6 ;
    public final void rule__RadioButtonGroup__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:950:1: ( rule__RadioButtonGroup__Group__5__Impl rule__RadioButtonGroup__Group__6 )
            // InternalEntityDsl.g:951:2: rule__RadioButtonGroup__Group__5__Impl rule__RadioButtonGroup__Group__6
            {
            pushFollow(FOLLOW_17);
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
    // InternalEntityDsl.g:958:1: rule__RadioButtonGroup__Group__5__Impl : ( 'required=' ) ;
    public final void rule__RadioButtonGroup__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:962:1: ( ( 'required=' ) )
            // InternalEntityDsl.g:963:1: ( 'required=' )
            {
            // InternalEntityDsl.g:963:1: ( 'required=' )
            // InternalEntityDsl.g:964:2: 'required='
            {
             before(grammarAccess.getRadioButtonGroupAccess().getRequiredKeyword_5()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRadioButtonGroupAccess().getRequiredKeyword_5()); 

            }


            }

        }
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
    // InternalEntityDsl.g:973:1: rule__RadioButtonGroup__Group__6 : rule__RadioButtonGroup__Group__6__Impl rule__RadioButtonGroup__Group__7 ;
    public final void rule__RadioButtonGroup__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:977:1: ( rule__RadioButtonGroup__Group__6__Impl rule__RadioButtonGroup__Group__7 )
            // InternalEntityDsl.g:978:2: rule__RadioButtonGroup__Group__6__Impl rule__RadioButtonGroup__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__RadioButtonGroup__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RadioButtonGroup__Group__7();

            state._fsp--;


            }

        }
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
    // InternalEntityDsl.g:985:1: rule__RadioButtonGroup__Group__6__Impl : ( ( rule__RadioButtonGroup__RequiredAssignment_6 ) ) ;
    public final void rule__RadioButtonGroup__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:989:1: ( ( ( rule__RadioButtonGroup__RequiredAssignment_6 ) ) )
            // InternalEntityDsl.g:990:1: ( ( rule__RadioButtonGroup__RequiredAssignment_6 ) )
            {
            // InternalEntityDsl.g:990:1: ( ( rule__RadioButtonGroup__RequiredAssignment_6 ) )
            // InternalEntityDsl.g:991:2: ( rule__RadioButtonGroup__RequiredAssignment_6 )
            {
             before(grammarAccess.getRadioButtonGroupAccess().getRequiredAssignment_6()); 
            // InternalEntityDsl.g:992:2: ( rule__RadioButtonGroup__RequiredAssignment_6 )
            // InternalEntityDsl.g:992:3: rule__RadioButtonGroup__RequiredAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__RadioButtonGroup__RequiredAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRadioButtonGroupAccess().getRequiredAssignment_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__RadioButtonGroup__Group__7"
    // InternalEntityDsl.g:1000:1: rule__RadioButtonGroup__Group__7 : rule__RadioButtonGroup__Group__7__Impl ;
    public final void rule__RadioButtonGroup__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1004:1: ( rule__RadioButtonGroup__Group__7__Impl )
            // InternalEntityDsl.g:1005:2: rule__RadioButtonGroup__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RadioButtonGroup__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadioButtonGroup__Group__7"


    // $ANTLR start "rule__RadioButtonGroup__Group__7__Impl"
    // InternalEntityDsl.g:1011:1: rule__RadioButtonGroup__Group__7__Impl : ( ']' ) ;
    public final void rule__RadioButtonGroup__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1015:1: ( ( ']' ) )
            // InternalEntityDsl.g:1016:1: ( ']' )
            {
            // InternalEntityDsl.g:1016:1: ( ']' )
            // InternalEntityDsl.g:1017:2: ']'
            {
             before(grammarAccess.getRadioButtonGroupAccess().getRightSquareBracketKeyword_7()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRadioButtonGroupAccess().getRightSquareBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadioButtonGroup__Group__7__Impl"


    // $ANTLR start "rule__TextBox__Group__0"
    // InternalEntityDsl.g:1027:1: rule__TextBox__Group__0 : rule__TextBox__Group__0__Impl rule__TextBox__Group__1 ;
    public final void rule__TextBox__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1031:1: ( rule__TextBox__Group__0__Impl rule__TextBox__Group__1 )
            // InternalEntityDsl.g:1032:2: rule__TextBox__Group__0__Impl rule__TextBox__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalEntityDsl.g:1039:1: rule__TextBox__Group__0__Impl : ( ( rule__TextBox__NameAssignment_0 ) ) ;
    public final void rule__TextBox__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1043:1: ( ( ( rule__TextBox__NameAssignment_0 ) ) )
            // InternalEntityDsl.g:1044:1: ( ( rule__TextBox__NameAssignment_0 ) )
            {
            // InternalEntityDsl.g:1044:1: ( ( rule__TextBox__NameAssignment_0 ) )
            // InternalEntityDsl.g:1045:2: ( rule__TextBox__NameAssignment_0 )
            {
             before(grammarAccess.getTextBoxAccess().getNameAssignment_0()); 
            // InternalEntityDsl.g:1046:2: ( rule__TextBox__NameAssignment_0 )
            // InternalEntityDsl.g:1046:3: rule__TextBox__NameAssignment_0
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
    // InternalEntityDsl.g:1054:1: rule__TextBox__Group__1 : rule__TextBox__Group__1__Impl rule__TextBox__Group__2 ;
    public final void rule__TextBox__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1058:1: ( rule__TextBox__Group__1__Impl rule__TextBox__Group__2 )
            // InternalEntityDsl.g:1059:2: rule__TextBox__Group__1__Impl rule__TextBox__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalEntityDsl.g:1066:1: rule__TextBox__Group__1__Impl : ( '[' ) ;
    public final void rule__TextBox__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1070:1: ( ( '[' ) )
            // InternalEntityDsl.g:1071:1: ( '[' )
            {
            // InternalEntityDsl.g:1071:1: ( '[' )
            // InternalEntityDsl.g:1072:2: '['
            {
             before(grammarAccess.getTextBoxAccess().getLeftSquareBracketKeyword_1()); 
            match(input,18,FOLLOW_2); 
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
    // InternalEntityDsl.g:1081:1: rule__TextBox__Group__2 : rule__TextBox__Group__2__Impl rule__TextBox__Group__3 ;
    public final void rule__TextBox__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1085:1: ( rule__TextBox__Group__2__Impl rule__TextBox__Group__3 )
            // InternalEntityDsl.g:1086:2: rule__TextBox__Group__2__Impl rule__TextBox__Group__3
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
    // InternalEntityDsl.g:1093:1: rule__TextBox__Group__2__Impl : ( 'required=' ) ;
    public final void rule__TextBox__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1097:1: ( ( 'required=' ) )
            // InternalEntityDsl.g:1098:1: ( 'required=' )
            {
            // InternalEntityDsl.g:1098:1: ( 'required=' )
            // InternalEntityDsl.g:1099:2: 'required='
            {
             before(grammarAccess.getTextBoxAccess().getRequiredKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTextBoxAccess().getRequiredKeyword_2()); 

            }


            }

        }
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
    // InternalEntityDsl.g:1108:1: rule__TextBox__Group__3 : rule__TextBox__Group__3__Impl rule__TextBox__Group__4 ;
    public final void rule__TextBox__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1112:1: ( rule__TextBox__Group__3__Impl rule__TextBox__Group__4 )
            // InternalEntityDsl.g:1113:2: rule__TextBox__Group__3__Impl rule__TextBox__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalEntityDsl.g:1120:1: rule__TextBox__Group__3__Impl : ( ( rule__TextBox__RequiredAssignment_3 ) ) ;
    public final void rule__TextBox__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1124:1: ( ( ( rule__TextBox__RequiredAssignment_3 ) ) )
            // InternalEntityDsl.g:1125:1: ( ( rule__TextBox__RequiredAssignment_3 ) )
            {
            // InternalEntityDsl.g:1125:1: ( ( rule__TextBox__RequiredAssignment_3 ) )
            // InternalEntityDsl.g:1126:2: ( rule__TextBox__RequiredAssignment_3 )
            {
             before(grammarAccess.getTextBoxAccess().getRequiredAssignment_3()); 
            // InternalEntityDsl.g:1127:2: ( rule__TextBox__RequiredAssignment_3 )
            // InternalEntityDsl.g:1127:3: rule__TextBox__RequiredAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__TextBox__RequiredAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTextBoxAccess().getRequiredAssignment_3()); 

            }


            }

        }
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
    // InternalEntityDsl.g:1135:1: rule__TextBox__Group__4 : rule__TextBox__Group__4__Impl rule__TextBox__Group__5 ;
    public final void rule__TextBox__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1139:1: ( rule__TextBox__Group__4__Impl rule__TextBox__Group__5 )
            // InternalEntityDsl.g:1140:2: rule__TextBox__Group__4__Impl rule__TextBox__Group__5
            {
            pushFollow(FOLLOW_18);
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
    // InternalEntityDsl.g:1147:1: rule__TextBox__Group__4__Impl : ( ( rule__TextBox__Group_4__0 )? ) ;
    public final void rule__TextBox__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1151:1: ( ( ( rule__TextBox__Group_4__0 )? ) )
            // InternalEntityDsl.g:1152:1: ( ( rule__TextBox__Group_4__0 )? )
            {
            // InternalEntityDsl.g:1152:1: ( ( rule__TextBox__Group_4__0 )? )
            // InternalEntityDsl.g:1153:2: ( rule__TextBox__Group_4__0 )?
            {
             before(grammarAccess.getTextBoxAccess().getGroup_4()); 
            // InternalEntityDsl.g:1154:2: ( rule__TextBox__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalEntityDsl.g:1154:3: rule__TextBox__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TextBox__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextBoxAccess().getGroup_4()); 

            }


            }

        }
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
    // InternalEntityDsl.g:1162:1: rule__TextBox__Group__5 : rule__TextBox__Group__5__Impl rule__TextBox__Group__6 ;
    public final void rule__TextBox__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1166:1: ( rule__TextBox__Group__5__Impl rule__TextBox__Group__6 )
            // InternalEntityDsl.g:1167:2: rule__TextBox__Group__5__Impl rule__TextBox__Group__6
            {
            pushFollow(FOLLOW_18);
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
    // InternalEntityDsl.g:1174:1: rule__TextBox__Group__5__Impl : ( ( rule__TextBox__Group_5__0 )? ) ;
    public final void rule__TextBox__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1178:1: ( ( ( rule__TextBox__Group_5__0 )? ) )
            // InternalEntityDsl.g:1179:1: ( ( rule__TextBox__Group_5__0 )? )
            {
            // InternalEntityDsl.g:1179:1: ( ( rule__TextBox__Group_5__0 )? )
            // InternalEntityDsl.g:1180:2: ( rule__TextBox__Group_5__0 )?
            {
             before(grammarAccess.getTextBoxAccess().getGroup_5()); 
            // InternalEntityDsl.g:1181:2: ( rule__TextBox__Group_5__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalEntityDsl.g:1181:3: rule__TextBox__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TextBox__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextBoxAccess().getGroup_5()); 

            }


            }

        }
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
    // InternalEntityDsl.g:1189:1: rule__TextBox__Group__6 : rule__TextBox__Group__6__Impl ;
    public final void rule__TextBox__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1193:1: ( rule__TextBox__Group__6__Impl )
            // InternalEntityDsl.g:1194:2: rule__TextBox__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TextBox__Group__6__Impl();

            state._fsp--;


            }

        }
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
    // InternalEntityDsl.g:1200:1: rule__TextBox__Group__6__Impl : ( ']' ) ;
    public final void rule__TextBox__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1204:1: ( ( ']' ) )
            // InternalEntityDsl.g:1205:1: ( ']' )
            {
            // InternalEntityDsl.g:1205:1: ( ']' )
            // InternalEntityDsl.g:1206:2: ']'
            {
             before(grammarAccess.getTextBoxAccess().getRightSquareBracketKeyword_6()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTextBoxAccess().getRightSquareBracketKeyword_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__TextBox__Group_4__0"
    // InternalEntityDsl.g:1216:1: rule__TextBox__Group_4__0 : rule__TextBox__Group_4__0__Impl rule__TextBox__Group_4__1 ;
    public final void rule__TextBox__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1220:1: ( rule__TextBox__Group_4__0__Impl rule__TextBox__Group_4__1 )
            // InternalEntityDsl.g:1221:2: rule__TextBox__Group_4__0__Impl rule__TextBox__Group_4__1
            {
            pushFollow(FOLLOW_19);
            rule__TextBox__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextBox__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextBox__Group_4__0"


    // $ANTLR start "rule__TextBox__Group_4__0__Impl"
    // InternalEntityDsl.g:1228:1: rule__TextBox__Group_4__0__Impl : ( 'min=' ) ;
    public final void rule__TextBox__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1232:1: ( ( 'min=' ) )
            // InternalEntityDsl.g:1233:1: ( 'min=' )
            {
            // InternalEntityDsl.g:1233:1: ( 'min=' )
            // InternalEntityDsl.g:1234:2: 'min='
            {
             before(grammarAccess.getTextBoxAccess().getMinKeyword_4_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTextBoxAccess().getMinKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextBox__Group_4__0__Impl"


    // $ANTLR start "rule__TextBox__Group_4__1"
    // InternalEntityDsl.g:1243:1: rule__TextBox__Group_4__1 : rule__TextBox__Group_4__1__Impl ;
    public final void rule__TextBox__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1247:1: ( rule__TextBox__Group_4__1__Impl )
            // InternalEntityDsl.g:1248:2: rule__TextBox__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TextBox__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextBox__Group_4__1"


    // $ANTLR start "rule__TextBox__Group_4__1__Impl"
    // InternalEntityDsl.g:1254:1: rule__TextBox__Group_4__1__Impl : ( ( rule__TextBox__MinTextLengthAssignment_4_1 ) ) ;
    public final void rule__TextBox__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1258:1: ( ( ( rule__TextBox__MinTextLengthAssignment_4_1 ) ) )
            // InternalEntityDsl.g:1259:1: ( ( rule__TextBox__MinTextLengthAssignment_4_1 ) )
            {
            // InternalEntityDsl.g:1259:1: ( ( rule__TextBox__MinTextLengthAssignment_4_1 ) )
            // InternalEntityDsl.g:1260:2: ( rule__TextBox__MinTextLengthAssignment_4_1 )
            {
             before(grammarAccess.getTextBoxAccess().getMinTextLengthAssignment_4_1()); 
            // InternalEntityDsl.g:1261:2: ( rule__TextBox__MinTextLengthAssignment_4_1 )
            // InternalEntityDsl.g:1261:3: rule__TextBox__MinTextLengthAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__TextBox__MinTextLengthAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTextBoxAccess().getMinTextLengthAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextBox__Group_4__1__Impl"


    // $ANTLR start "rule__TextBox__Group_5__0"
    // InternalEntityDsl.g:1270:1: rule__TextBox__Group_5__0 : rule__TextBox__Group_5__0__Impl rule__TextBox__Group_5__1 ;
    public final void rule__TextBox__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1274:1: ( rule__TextBox__Group_5__0__Impl rule__TextBox__Group_5__1 )
            // InternalEntityDsl.g:1275:2: rule__TextBox__Group_5__0__Impl rule__TextBox__Group_5__1
            {
            pushFollow(FOLLOW_19);
            rule__TextBox__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextBox__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextBox__Group_5__0"


    // $ANTLR start "rule__TextBox__Group_5__0__Impl"
    // InternalEntityDsl.g:1282:1: rule__TextBox__Group_5__0__Impl : ( 'max=' ) ;
    public final void rule__TextBox__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1286:1: ( ( 'max=' ) )
            // InternalEntityDsl.g:1287:1: ( 'max=' )
            {
            // InternalEntityDsl.g:1287:1: ( 'max=' )
            // InternalEntityDsl.g:1288:2: 'max='
            {
             before(grammarAccess.getTextBoxAccess().getMaxKeyword_5_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTextBoxAccess().getMaxKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextBox__Group_5__0__Impl"


    // $ANTLR start "rule__TextBox__Group_5__1"
    // InternalEntityDsl.g:1297:1: rule__TextBox__Group_5__1 : rule__TextBox__Group_5__1__Impl ;
    public final void rule__TextBox__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1301:1: ( rule__TextBox__Group_5__1__Impl )
            // InternalEntityDsl.g:1302:2: rule__TextBox__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TextBox__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextBox__Group_5__1"


    // $ANTLR start "rule__TextBox__Group_5__1__Impl"
    // InternalEntityDsl.g:1308:1: rule__TextBox__Group_5__1__Impl : ( ( rule__TextBox__MaxTextLengthAssignment_5_1 ) ) ;
    public final void rule__TextBox__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1312:1: ( ( ( rule__TextBox__MaxTextLengthAssignment_5_1 ) ) )
            // InternalEntityDsl.g:1313:1: ( ( rule__TextBox__MaxTextLengthAssignment_5_1 ) )
            {
            // InternalEntityDsl.g:1313:1: ( ( rule__TextBox__MaxTextLengthAssignment_5_1 ) )
            // InternalEntityDsl.g:1314:2: ( rule__TextBox__MaxTextLengthAssignment_5_1 )
            {
             before(grammarAccess.getTextBoxAccess().getMaxTextLengthAssignment_5_1()); 
            // InternalEntityDsl.g:1315:2: ( rule__TextBox__MaxTextLengthAssignment_5_1 )
            // InternalEntityDsl.g:1315:3: rule__TextBox__MaxTextLengthAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__TextBox__MaxTextLengthAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getTextBoxAccess().getMaxTextLengthAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextBox__Group_5__1__Impl"


    // $ANTLR start "rule__ComboBox__Group__0"
    // InternalEntityDsl.g:1324:1: rule__ComboBox__Group__0 : rule__ComboBox__Group__0__Impl rule__ComboBox__Group__1 ;
    public final void rule__ComboBox__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1328:1: ( rule__ComboBox__Group__0__Impl rule__ComboBox__Group__1 )
            // InternalEntityDsl.g:1329:2: rule__ComboBox__Group__0__Impl rule__ComboBox__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalEntityDsl.g:1336:1: rule__ComboBox__Group__0__Impl : ( ( rule__ComboBox__NameAssignment_0 ) ) ;
    public final void rule__ComboBox__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1340:1: ( ( ( rule__ComboBox__NameAssignment_0 ) ) )
            // InternalEntityDsl.g:1341:1: ( ( rule__ComboBox__NameAssignment_0 ) )
            {
            // InternalEntityDsl.g:1341:1: ( ( rule__ComboBox__NameAssignment_0 ) )
            // InternalEntityDsl.g:1342:2: ( rule__ComboBox__NameAssignment_0 )
            {
             before(grammarAccess.getComboBoxAccess().getNameAssignment_0()); 
            // InternalEntityDsl.g:1343:2: ( rule__ComboBox__NameAssignment_0 )
            // InternalEntityDsl.g:1343:3: rule__ComboBox__NameAssignment_0
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
    // InternalEntityDsl.g:1351:1: rule__ComboBox__Group__1 : rule__ComboBox__Group__1__Impl rule__ComboBox__Group__2 ;
    public final void rule__ComboBox__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1355:1: ( rule__ComboBox__Group__1__Impl rule__ComboBox__Group__2 )
            // InternalEntityDsl.g:1356:2: rule__ComboBox__Group__1__Impl rule__ComboBox__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalEntityDsl.g:1363:1: rule__ComboBox__Group__1__Impl : ( '(' ) ;
    public final void rule__ComboBox__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1367:1: ( ( '(' ) )
            // InternalEntityDsl.g:1368:1: ( '(' )
            {
            // InternalEntityDsl.g:1368:1: ( '(' )
            // InternalEntityDsl.g:1369:2: '('
            {
             before(grammarAccess.getComboBoxAccess().getLeftParenthesisKeyword_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalEntityDsl.g:1378:1: rule__ComboBox__Group__2 : rule__ComboBox__Group__2__Impl rule__ComboBox__Group__3 ;
    public final void rule__ComboBox__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1382:1: ( rule__ComboBox__Group__2__Impl rule__ComboBox__Group__3 )
            // InternalEntityDsl.g:1383:2: rule__ComboBox__Group__2__Impl rule__ComboBox__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalEntityDsl.g:1390:1: rule__ComboBox__Group__2__Impl : ( ( rule__ComboBox__ItemsAssignment_2 )* ) ;
    public final void rule__ComboBox__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1394:1: ( ( ( rule__ComboBox__ItemsAssignment_2 )* ) )
            // InternalEntityDsl.g:1395:1: ( ( rule__ComboBox__ItemsAssignment_2 )* )
            {
            // InternalEntityDsl.g:1395:1: ( ( rule__ComboBox__ItemsAssignment_2 )* )
            // InternalEntityDsl.g:1396:2: ( rule__ComboBox__ItemsAssignment_2 )*
            {
             before(grammarAccess.getComboBoxAccess().getItemsAssignment_2()); 
            // InternalEntityDsl.g:1397:2: ( rule__ComboBox__ItemsAssignment_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalEntityDsl.g:1397:3: rule__ComboBox__ItemsAssignment_2
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ComboBox__ItemsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalEntityDsl.g:1405:1: rule__ComboBox__Group__3 : rule__ComboBox__Group__3__Impl rule__ComboBox__Group__4 ;
    public final void rule__ComboBox__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1409:1: ( rule__ComboBox__Group__3__Impl rule__ComboBox__Group__4 )
            // InternalEntityDsl.g:1410:2: rule__ComboBox__Group__3__Impl rule__ComboBox__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalEntityDsl.g:1417:1: rule__ComboBox__Group__3__Impl : ( ')' ) ;
    public final void rule__ComboBox__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1421:1: ( ( ')' ) )
            // InternalEntityDsl.g:1422:1: ( ')' )
            {
            // InternalEntityDsl.g:1422:1: ( ')' )
            // InternalEntityDsl.g:1423:2: ')'
            {
             before(grammarAccess.getComboBoxAccess().getRightParenthesisKeyword_3()); 
            match(input,22,FOLLOW_2); 
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
    // InternalEntityDsl.g:1432:1: rule__ComboBox__Group__4 : rule__ComboBox__Group__4__Impl rule__ComboBox__Group__5 ;
    public final void rule__ComboBox__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1436:1: ( rule__ComboBox__Group__4__Impl rule__ComboBox__Group__5 )
            // InternalEntityDsl.g:1437:2: rule__ComboBox__Group__4__Impl rule__ComboBox__Group__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalEntityDsl.g:1444:1: rule__ComboBox__Group__4__Impl : ( '[' ) ;
    public final void rule__ComboBox__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1448:1: ( ( '[' ) )
            // InternalEntityDsl.g:1449:1: ( '[' )
            {
            // InternalEntityDsl.g:1449:1: ( '[' )
            // InternalEntityDsl.g:1450:2: '['
            {
             before(grammarAccess.getComboBoxAccess().getLeftSquareBracketKeyword_4()); 
            match(input,18,FOLLOW_2); 
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
    // InternalEntityDsl.g:1459:1: rule__ComboBox__Group__5 : rule__ComboBox__Group__5__Impl rule__ComboBox__Group__6 ;
    public final void rule__ComboBox__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1463:1: ( rule__ComboBox__Group__5__Impl rule__ComboBox__Group__6 )
            // InternalEntityDsl.g:1464:2: rule__ComboBox__Group__5__Impl rule__ComboBox__Group__6
            {
            pushFollow(FOLLOW_17);
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
    // InternalEntityDsl.g:1471:1: rule__ComboBox__Group__5__Impl : ( 'required=' ) ;
    public final void rule__ComboBox__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1475:1: ( ( 'required=' ) )
            // InternalEntityDsl.g:1476:1: ( 'required=' )
            {
            // InternalEntityDsl.g:1476:1: ( 'required=' )
            // InternalEntityDsl.g:1477:2: 'required='
            {
             before(grammarAccess.getComboBoxAccess().getRequiredKeyword_5()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getComboBoxAccess().getRequiredKeyword_5()); 

            }


            }

        }
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
    // InternalEntityDsl.g:1486:1: rule__ComboBox__Group__6 : rule__ComboBox__Group__6__Impl rule__ComboBox__Group__7 ;
    public final void rule__ComboBox__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1490:1: ( rule__ComboBox__Group__6__Impl rule__ComboBox__Group__7 )
            // InternalEntityDsl.g:1491:2: rule__ComboBox__Group__6__Impl rule__ComboBox__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__ComboBox__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComboBox__Group__7();

            state._fsp--;


            }

        }
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
    // InternalEntityDsl.g:1498:1: rule__ComboBox__Group__6__Impl : ( ( rule__ComboBox__RequiredAssignment_6 ) ) ;
    public final void rule__ComboBox__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1502:1: ( ( ( rule__ComboBox__RequiredAssignment_6 ) ) )
            // InternalEntityDsl.g:1503:1: ( ( rule__ComboBox__RequiredAssignment_6 ) )
            {
            // InternalEntityDsl.g:1503:1: ( ( rule__ComboBox__RequiredAssignment_6 ) )
            // InternalEntityDsl.g:1504:2: ( rule__ComboBox__RequiredAssignment_6 )
            {
             before(grammarAccess.getComboBoxAccess().getRequiredAssignment_6()); 
            // InternalEntityDsl.g:1505:2: ( rule__ComboBox__RequiredAssignment_6 )
            // InternalEntityDsl.g:1505:3: rule__ComboBox__RequiredAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__ComboBox__RequiredAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getComboBoxAccess().getRequiredAssignment_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__ComboBox__Group__7"
    // InternalEntityDsl.g:1513:1: rule__ComboBox__Group__7 : rule__ComboBox__Group__7__Impl ;
    public final void rule__ComboBox__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1517:1: ( rule__ComboBox__Group__7__Impl )
            // InternalEntityDsl.g:1518:2: rule__ComboBox__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComboBox__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComboBox__Group__7"


    // $ANTLR start "rule__ComboBox__Group__7__Impl"
    // InternalEntityDsl.g:1524:1: rule__ComboBox__Group__7__Impl : ( ']' ) ;
    public final void rule__ComboBox__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1528:1: ( ( ']' ) )
            // InternalEntityDsl.g:1529:1: ( ']' )
            {
            // InternalEntityDsl.g:1529:1: ( ']' )
            // InternalEntityDsl.g:1530:2: ']'
            {
             before(grammarAccess.getComboBoxAccess().getRightSquareBracketKeyword_7()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getComboBoxAccess().getRightSquareBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComboBox__Group__7__Impl"


    // $ANTLR start "rule__Domainmodel__ApplicationNameAssignment_1"
    // InternalEntityDsl.g:1540:1: rule__Domainmodel__ApplicationNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Domainmodel__ApplicationNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1544:1: ( ( RULE_ID ) )
            // InternalEntityDsl.g:1545:2: ( RULE_ID )
            {
            // InternalEntityDsl.g:1545:2: ( RULE_ID )
            // InternalEntityDsl.g:1546:3: RULE_ID
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
    // InternalEntityDsl.g:1555:1: rule__Domainmodel__ElementsAssignment_2 : ( ruleEntity ) ;
    public final void rule__Domainmodel__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1559:1: ( ( ruleEntity ) )
            // InternalEntityDsl.g:1560:2: ( ruleEntity )
            {
            // InternalEntityDsl.g:1560:2: ( ruleEntity )
            // InternalEntityDsl.g:1561:3: ruleEntity
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
    // InternalEntityDsl.g:1570:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1574:1: ( ( RULE_ID ) )
            // InternalEntityDsl.g:1575:2: ( RULE_ID )
            {
            // InternalEntityDsl.g:1575:2: ( RULE_ID )
            // InternalEntityDsl.g:1576:3: RULE_ID
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
    // InternalEntityDsl.g:1585:1: rule__Entity__AttributesAssignment_3 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1589:1: ( ( ruleAttribute ) )
            // InternalEntityDsl.g:1590:2: ( ruleAttribute )
            {
            // InternalEntityDsl.g:1590:2: ( ruleAttribute )
            // InternalEntityDsl.g:1591:3: ruleAttribute
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


    // $ANTLR start "rule__Attribute__NameAssignment_0"
    // InternalEntityDsl.g:1600:1: rule__Attribute__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1604:1: ( ( RULE_ID ) )
            // InternalEntityDsl.g:1605:2: ( RULE_ID )
            {
            // InternalEntityDsl.g:1605:2: ( RULE_ID )
            // InternalEntityDsl.g:1606:3: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_0"


    // $ANTLR start "rule__Attribute__InputTypeAssignment_3"
    // InternalEntityDsl.g:1615:1: rule__Attribute__InputTypeAssignment_3 : ( ruleWinFormControlType ) ;
    public final void rule__Attribute__InputTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1619:1: ( ( ruleWinFormControlType ) )
            // InternalEntityDsl.g:1620:2: ( ruleWinFormControlType )
            {
            // InternalEntityDsl.g:1620:2: ( ruleWinFormControlType )
            // InternalEntityDsl.g:1621:3: ruleWinFormControlType
            {
             before(grammarAccess.getAttributeAccess().getInputTypeWinFormControlTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleWinFormControlType();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getInputTypeWinFormControlTypeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__InputTypeAssignment_3"


    // $ANTLR start "rule__Attribute__LabelTextAssignment_5"
    // InternalEntityDsl.g:1630:1: rule__Attribute__LabelTextAssignment_5 : ( ruleLabel ) ;
    public final void rule__Attribute__LabelTextAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1634:1: ( ( ruleLabel ) )
            // InternalEntityDsl.g:1635:2: ( ruleLabel )
            {
            // InternalEntityDsl.g:1635:2: ( ruleLabel )
            // InternalEntityDsl.g:1636:3: ruleLabel
            {
             before(grammarAccess.getAttributeAccess().getLabelTextLabelParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleLabel();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getLabelTextLabelParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__LabelTextAssignment_5"


    // $ANTLR start "rule__Label__TextAssignment"
    // InternalEntityDsl.g:1645:1: rule__Label__TextAssignment : ( RULE_ID ) ;
    public final void rule__Label__TextAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1649:1: ( ( RULE_ID ) )
            // InternalEntityDsl.g:1650:2: ( RULE_ID )
            {
            // InternalEntityDsl.g:1650:2: ( RULE_ID )
            // InternalEntityDsl.g:1651:3: RULE_ID
            {
             before(grammarAccess.getLabelAccess().getTextIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLabelAccess().getTextIDTerminalRuleCall_0()); 

            }


            }

        }
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
    // InternalEntityDsl.g:1660:1: rule__WinFormControlType__ControlTypeAssignment_0 : ( ruleTextBox ) ;
    public final void rule__WinFormControlType__ControlTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1664:1: ( ( ruleTextBox ) )
            // InternalEntityDsl.g:1665:2: ( ruleTextBox )
            {
            // InternalEntityDsl.g:1665:2: ( ruleTextBox )
            // InternalEntityDsl.g:1666:3: ruleTextBox
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


    // $ANTLR start "rule__RadioButtonGroup__NameAssignment_0"
    // InternalEntityDsl.g:1675:1: rule__RadioButtonGroup__NameAssignment_0 : ( ( 'RadioButtonGroup' ) ) ;
    public final void rule__RadioButtonGroup__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1679:1: ( ( ( 'RadioButtonGroup' ) ) )
            // InternalEntityDsl.g:1680:2: ( ( 'RadioButtonGroup' ) )
            {
            // InternalEntityDsl.g:1680:2: ( ( 'RadioButtonGroup' ) )
            // InternalEntityDsl.g:1681:3: ( 'RadioButtonGroup' )
            {
             before(grammarAccess.getRadioButtonGroupAccess().getNameRadioButtonGroupKeyword_0_0()); 
            // InternalEntityDsl.g:1682:3: ( 'RadioButtonGroup' )
            // InternalEntityDsl.g:1683:4: 'RadioButtonGroup'
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
    // InternalEntityDsl.g:1694:1: rule__RadioButtonGroup__ButtonsAssignment_2 : ( ruleRadioButton ) ;
    public final void rule__RadioButtonGroup__ButtonsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1698:1: ( ( ruleRadioButton ) )
            // InternalEntityDsl.g:1699:2: ( ruleRadioButton )
            {
            // InternalEntityDsl.g:1699:2: ( ruleRadioButton )
            // InternalEntityDsl.g:1700:3: ruleRadioButton
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


    // $ANTLR start "rule__RadioButtonGroup__RequiredAssignment_6"
    // InternalEntityDsl.g:1709:1: rule__RadioButtonGroup__RequiredAssignment_6 : ( ruleBoolean ) ;
    public final void rule__RadioButtonGroup__RequiredAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1713:1: ( ( ruleBoolean ) )
            // InternalEntityDsl.g:1714:2: ( ruleBoolean )
            {
            // InternalEntityDsl.g:1714:2: ( ruleBoolean )
            // InternalEntityDsl.g:1715:3: ruleBoolean
            {
             before(grammarAccess.getRadioButtonGroupAccess().getRequiredBooleanParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleBoolean();

            state._fsp--;

             after(grammarAccess.getRadioButtonGroupAccess().getRequiredBooleanParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RadioButtonGroup__RequiredAssignment_6"


    // $ANTLR start "rule__RadioButton__TextAssignment"
    // InternalEntityDsl.g:1724:1: rule__RadioButton__TextAssignment : ( RULE_ID ) ;
    public final void rule__RadioButton__TextAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1728:1: ( ( RULE_ID ) )
            // InternalEntityDsl.g:1729:2: ( RULE_ID )
            {
            // InternalEntityDsl.g:1729:2: ( RULE_ID )
            // InternalEntityDsl.g:1730:3: RULE_ID
            {
             before(grammarAccess.getRadioButtonAccess().getTextIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRadioButtonAccess().getTextIDTerminalRuleCall_0()); 

            }


            }

        }
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
    // InternalEntityDsl.g:1739:1: rule__CheckBox__NameAssignment : ( ( 'CheckBox' ) ) ;
    public final void rule__CheckBox__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1743:1: ( ( ( 'CheckBox' ) ) )
            // InternalEntityDsl.g:1744:2: ( ( 'CheckBox' ) )
            {
            // InternalEntityDsl.g:1744:2: ( ( 'CheckBox' ) )
            // InternalEntityDsl.g:1745:3: ( 'CheckBox' )
            {
             before(grammarAccess.getCheckBoxAccess().getNameCheckBoxKeyword_0()); 
            // InternalEntityDsl.g:1746:3: ( 'CheckBox' )
            // InternalEntityDsl.g:1747:4: 'CheckBox'
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
    // InternalEntityDsl.g:1758:1: rule__TextBox__NameAssignment_0 : ( ( 'TextBox' ) ) ;
    public final void rule__TextBox__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1762:1: ( ( ( 'TextBox' ) ) )
            // InternalEntityDsl.g:1763:2: ( ( 'TextBox' ) )
            {
            // InternalEntityDsl.g:1763:2: ( ( 'TextBox' ) )
            // InternalEntityDsl.g:1764:3: ( 'TextBox' )
            {
             before(grammarAccess.getTextBoxAccess().getNameTextBoxKeyword_0_0()); 
            // InternalEntityDsl.g:1765:3: ( 'TextBox' )
            // InternalEntityDsl.g:1766:4: 'TextBox'
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


    // $ANTLR start "rule__TextBox__RequiredAssignment_3"
    // InternalEntityDsl.g:1777:1: rule__TextBox__RequiredAssignment_3 : ( ruleBoolean ) ;
    public final void rule__TextBox__RequiredAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1781:1: ( ( ruleBoolean ) )
            // InternalEntityDsl.g:1782:2: ( ruleBoolean )
            {
            // InternalEntityDsl.g:1782:2: ( ruleBoolean )
            // InternalEntityDsl.g:1783:3: ruleBoolean
            {
             before(grammarAccess.getTextBoxAccess().getRequiredBooleanParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleBoolean();

            state._fsp--;

             after(grammarAccess.getTextBoxAccess().getRequiredBooleanParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextBox__RequiredAssignment_3"


    // $ANTLR start "rule__TextBox__MinTextLengthAssignment_4_1"
    // InternalEntityDsl.g:1792:1: rule__TextBox__MinTextLengthAssignment_4_1 : ( RULE_INT ) ;
    public final void rule__TextBox__MinTextLengthAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1796:1: ( ( RULE_INT ) )
            // InternalEntityDsl.g:1797:2: ( RULE_INT )
            {
            // InternalEntityDsl.g:1797:2: ( RULE_INT )
            // InternalEntityDsl.g:1798:3: RULE_INT
            {
             before(grammarAccess.getTextBoxAccess().getMinTextLengthINTTerminalRuleCall_4_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTextBoxAccess().getMinTextLengthINTTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextBox__MinTextLengthAssignment_4_1"


    // $ANTLR start "rule__TextBox__MaxTextLengthAssignment_5_1"
    // InternalEntityDsl.g:1807:1: rule__TextBox__MaxTextLengthAssignment_5_1 : ( RULE_INT ) ;
    public final void rule__TextBox__MaxTextLengthAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1811:1: ( ( RULE_INT ) )
            // InternalEntityDsl.g:1812:2: ( RULE_INT )
            {
            // InternalEntityDsl.g:1812:2: ( RULE_INT )
            // InternalEntityDsl.g:1813:3: RULE_INT
            {
             before(grammarAccess.getTextBoxAccess().getMaxTextLengthINTTerminalRuleCall_5_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTextBoxAccess().getMaxTextLengthINTTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextBox__MaxTextLengthAssignment_5_1"


    // $ANTLR start "rule__Boolean__ValueAssignment"
    // InternalEntityDsl.g:1822:1: rule__Boolean__ValueAssignment : ( ( rule__Boolean__ValueAlternatives_0 ) ) ;
    public final void rule__Boolean__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1826:1: ( ( ( rule__Boolean__ValueAlternatives_0 ) ) )
            // InternalEntityDsl.g:1827:2: ( ( rule__Boolean__ValueAlternatives_0 ) )
            {
            // InternalEntityDsl.g:1827:2: ( ( rule__Boolean__ValueAlternatives_0 ) )
            // InternalEntityDsl.g:1828:3: ( rule__Boolean__ValueAlternatives_0 )
            {
             before(grammarAccess.getBooleanAccess().getValueAlternatives_0()); 
            // InternalEntityDsl.g:1829:3: ( rule__Boolean__ValueAlternatives_0 )
            // InternalEntityDsl.g:1829:4: rule__Boolean__ValueAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Boolean__ValueAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanAccess().getValueAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boolean__ValueAssignment"


    // $ANTLR start "rule__ComboBox__NameAssignment_0"
    // InternalEntityDsl.g:1837:1: rule__ComboBox__NameAssignment_0 : ( ( 'ComboBox' ) ) ;
    public final void rule__ComboBox__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1841:1: ( ( ( 'ComboBox' ) ) )
            // InternalEntityDsl.g:1842:2: ( ( 'ComboBox' ) )
            {
            // InternalEntityDsl.g:1842:2: ( ( 'ComboBox' ) )
            // InternalEntityDsl.g:1843:3: ( 'ComboBox' )
            {
             before(grammarAccess.getComboBoxAccess().getNameComboBoxKeyword_0_0()); 
            // InternalEntityDsl.g:1844:3: ( 'ComboBox' )
            // InternalEntityDsl.g:1845:4: 'ComboBox'
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
    // InternalEntityDsl.g:1856:1: rule__ComboBox__ItemsAssignment_2 : ( ruleComboBoxItem ) ;
    public final void rule__ComboBox__ItemsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1860:1: ( ( ruleComboBoxItem ) )
            // InternalEntityDsl.g:1861:2: ( ruleComboBoxItem )
            {
            // InternalEntityDsl.g:1861:2: ( ruleComboBoxItem )
            // InternalEntityDsl.g:1862:3: ruleComboBoxItem
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


    // $ANTLR start "rule__ComboBox__RequiredAssignment_6"
    // InternalEntityDsl.g:1871:1: rule__ComboBox__RequiredAssignment_6 : ( ruleBoolean ) ;
    public final void rule__ComboBox__RequiredAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1875:1: ( ( ruleBoolean ) )
            // InternalEntityDsl.g:1876:2: ( ruleBoolean )
            {
            // InternalEntityDsl.g:1876:2: ( ruleBoolean )
            // InternalEntityDsl.g:1877:3: ruleBoolean
            {
             before(grammarAccess.getComboBoxAccess().getRequiredBooleanParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleBoolean();

            state._fsp--;

             after(grammarAccess.getComboBoxAccess().getRequiredBooleanParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComboBox__RequiredAssignment_6"


    // $ANTLR start "rule__ComboBoxItem__TextAssignment"
    // InternalEntityDsl.g:1886:1: rule__ComboBoxItem__TextAssignment : ( RULE_ID ) ;
    public final void rule__ComboBoxItem__TextAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1890:1: ( ( RULE_ID ) )
            // InternalEntityDsl.g:1891:2: ( RULE_ID )
            {
            // InternalEntityDsl.g:1891:2: ( RULE_ID )
            // InternalEntityDsl.g:1892:3: RULE_ID
            {
             before(grammarAccess.getComboBoxItemAccess().getTextIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComboBoxItemAccess().getTextIDTerminalRuleCall_0()); 

            }


            }

        }
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000003C000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000003100000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000020L});

}