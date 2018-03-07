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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'string'", "'int'", "'double'", "'database:'", "'entity'", "'{'", "'}'", "':'", "'['", "','", "']'", "'('", "')'", "'*'", "'RadioButtonGroup'", "'CheckBox'", "'TextBox'", "'ComboBox'"
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


    // $ANTLR start "entryRuleRadioButtonGroup"
    // InternalEntityDsl.g:203:1: entryRuleRadioButtonGroup : ruleRadioButtonGroup EOF ;
    public final void entryRuleRadioButtonGroup() throws RecognitionException {
        try {
            // InternalEntityDsl.g:204:1: ( ruleRadioButtonGroup EOF )
            // InternalEntityDsl.g:205:1: ruleRadioButtonGroup EOF
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
    // InternalEntityDsl.g:212:1: ruleRadioButtonGroup : ( ( rule__RadioButtonGroup__Group__0 ) ) ;
    public final void ruleRadioButtonGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:216:2: ( ( ( rule__RadioButtonGroup__Group__0 ) ) )
            // InternalEntityDsl.g:217:2: ( ( rule__RadioButtonGroup__Group__0 ) )
            {
            // InternalEntityDsl.g:217:2: ( ( rule__RadioButtonGroup__Group__0 ) )
            // InternalEntityDsl.g:218:3: ( rule__RadioButtonGroup__Group__0 )
            {
             before(grammarAccess.getRadioButtonGroupAccess().getGroup()); 
            // InternalEntityDsl.g:219:3: ( rule__RadioButtonGroup__Group__0 )
            // InternalEntityDsl.g:219:4: rule__RadioButtonGroup__Group__0
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
    // InternalEntityDsl.g:228:1: entryRuleRadioButton : ruleRadioButton EOF ;
    public final void entryRuleRadioButton() throws RecognitionException {
        try {
            // InternalEntityDsl.g:229:1: ( ruleRadioButton EOF )
            // InternalEntityDsl.g:230:1: ruleRadioButton EOF
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
    // InternalEntityDsl.g:237:1: ruleRadioButton : ( ( rule__RadioButton__TextAssignment ) ) ;
    public final void ruleRadioButton() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:241:2: ( ( ( rule__RadioButton__TextAssignment ) ) )
            // InternalEntityDsl.g:242:2: ( ( rule__RadioButton__TextAssignment ) )
            {
            // InternalEntityDsl.g:242:2: ( ( rule__RadioButton__TextAssignment ) )
            // InternalEntityDsl.g:243:3: ( rule__RadioButton__TextAssignment )
            {
             before(grammarAccess.getRadioButtonAccess().getTextAssignment()); 
            // InternalEntityDsl.g:244:3: ( rule__RadioButton__TextAssignment )
            // InternalEntityDsl.g:244:4: rule__RadioButton__TextAssignment
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
    // InternalEntityDsl.g:253:1: entryRuleCheckBox : ruleCheckBox EOF ;
    public final void entryRuleCheckBox() throws RecognitionException {
        try {
            // InternalEntityDsl.g:254:1: ( ruleCheckBox EOF )
            // InternalEntityDsl.g:255:1: ruleCheckBox EOF
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
    // InternalEntityDsl.g:262:1: ruleCheckBox : ( ( rule__CheckBox__NameAssignment ) ) ;
    public final void ruleCheckBox() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:266:2: ( ( ( rule__CheckBox__NameAssignment ) ) )
            // InternalEntityDsl.g:267:2: ( ( rule__CheckBox__NameAssignment ) )
            {
            // InternalEntityDsl.g:267:2: ( ( rule__CheckBox__NameAssignment ) )
            // InternalEntityDsl.g:268:3: ( rule__CheckBox__NameAssignment )
            {
             before(grammarAccess.getCheckBoxAccess().getNameAssignment()); 
            // InternalEntityDsl.g:269:3: ( rule__CheckBox__NameAssignment )
            // InternalEntityDsl.g:269:4: rule__CheckBox__NameAssignment
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
    // InternalEntityDsl.g:278:1: entryRuleTextBox : ruleTextBox EOF ;
    public final void entryRuleTextBox() throws RecognitionException {
        try {
            // InternalEntityDsl.g:279:1: ( ruleTextBox EOF )
            // InternalEntityDsl.g:280:1: ruleTextBox EOF
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
    // InternalEntityDsl.g:287:1: ruleTextBox : ( ( rule__TextBox__Group__0 ) ) ;
    public final void ruleTextBox() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:291:2: ( ( ( rule__TextBox__Group__0 ) ) )
            // InternalEntityDsl.g:292:2: ( ( rule__TextBox__Group__0 ) )
            {
            // InternalEntityDsl.g:292:2: ( ( rule__TextBox__Group__0 ) )
            // InternalEntityDsl.g:293:3: ( rule__TextBox__Group__0 )
            {
             before(grammarAccess.getTextBoxAccess().getGroup()); 
            // InternalEntityDsl.g:294:3: ( rule__TextBox__Group__0 )
            // InternalEntityDsl.g:294:4: rule__TextBox__Group__0
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


    // $ANTLR start "rule__DataType__TypeAlternatives_0"
    // InternalEntityDsl.g:352:1: rule__DataType__TypeAlternatives_0 : ( ( 'string' ) | ( 'int' ) | ( 'double' ) );
    public final void rule__DataType__TypeAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:356:1: ( ( 'string' ) | ( 'int' ) | ( 'double' ) )
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
                    // InternalEntityDsl.g:357:2: ( 'string' )
                    {
                    // InternalEntityDsl.g:357:2: ( 'string' )
                    // InternalEntityDsl.g:358:3: 'string'
                    {
                     before(grammarAccess.getDataTypeAccess().getTypeStringKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getDataTypeAccess().getTypeStringKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEntityDsl.g:363:2: ( 'int' )
                    {
                    // InternalEntityDsl.g:363:2: ( 'int' )
                    // InternalEntityDsl.g:364:3: 'int'
                    {
                     before(grammarAccess.getDataTypeAccess().getTypeIntKeyword_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getDataTypeAccess().getTypeIntKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEntityDsl.g:369:2: ( 'double' )
                    {
                    // InternalEntityDsl.g:369:2: ( 'double' )
                    // InternalEntityDsl.g:370:3: 'double'
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
    // InternalEntityDsl.g:379:1: rule__WinFormControlType__Alternatives : ( ( ( rule__WinFormControlType__ControlTypeAssignment_0 ) ) | ( ruleComboBox ) | ( ruleCheckBox ) | ( ruleRadioButtonGroup ) );
    public final void rule__WinFormControlType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:383:1: ( ( ( rule__WinFormControlType__ControlTypeAssignment_0 ) ) | ( ruleComboBox ) | ( ruleCheckBox ) | ( ruleRadioButtonGroup ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt2=1;
                }
                break;
            case 28:
                {
                alt2=2;
                }
                break;
            case 26:
                {
                alt2=3;
                }
                break;
            case 25:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalEntityDsl.g:384:2: ( ( rule__WinFormControlType__ControlTypeAssignment_0 ) )
                    {
                    // InternalEntityDsl.g:384:2: ( ( rule__WinFormControlType__ControlTypeAssignment_0 ) )
                    // InternalEntityDsl.g:385:3: ( rule__WinFormControlType__ControlTypeAssignment_0 )
                    {
                     before(grammarAccess.getWinFormControlTypeAccess().getControlTypeAssignment_0()); 
                    // InternalEntityDsl.g:386:3: ( rule__WinFormControlType__ControlTypeAssignment_0 )
                    // InternalEntityDsl.g:386:4: rule__WinFormControlType__ControlTypeAssignment_0
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
                    // InternalEntityDsl.g:390:2: ( ruleComboBox )
                    {
                    // InternalEntityDsl.g:390:2: ( ruleComboBox )
                    // InternalEntityDsl.g:391:3: ruleComboBox
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
                    // InternalEntityDsl.g:396:2: ( ruleCheckBox )
                    {
                    // InternalEntityDsl.g:396:2: ( ruleCheckBox )
                    // InternalEntityDsl.g:397:3: ruleCheckBox
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
                    // InternalEntityDsl.g:402:2: ( ruleRadioButtonGroup )
                    {
                    // InternalEntityDsl.g:402:2: ( ruleRadioButtonGroup )
                    // InternalEntityDsl.g:403:3: ruleRadioButtonGroup
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


    // $ANTLR start "rule__Domainmodel__Group__0"
    // InternalEntityDsl.g:412:1: rule__Domainmodel__Group__0 : rule__Domainmodel__Group__0__Impl rule__Domainmodel__Group__1 ;
    public final void rule__Domainmodel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:416:1: ( rule__Domainmodel__Group__0__Impl rule__Domainmodel__Group__1 )
            // InternalEntityDsl.g:417:2: rule__Domainmodel__Group__0__Impl rule__Domainmodel__Group__1
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
    // InternalEntityDsl.g:424:1: rule__Domainmodel__Group__0__Impl : ( 'database:' ) ;
    public final void rule__Domainmodel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:428:1: ( ( 'database:' ) )
            // InternalEntityDsl.g:429:1: ( 'database:' )
            {
            // InternalEntityDsl.g:429:1: ( 'database:' )
            // InternalEntityDsl.g:430:2: 'database:'
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
    // InternalEntityDsl.g:439:1: rule__Domainmodel__Group__1 : rule__Domainmodel__Group__1__Impl rule__Domainmodel__Group__2 ;
    public final void rule__Domainmodel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:443:1: ( rule__Domainmodel__Group__1__Impl rule__Domainmodel__Group__2 )
            // InternalEntityDsl.g:444:2: rule__Domainmodel__Group__1__Impl rule__Domainmodel__Group__2
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
    // InternalEntityDsl.g:451:1: rule__Domainmodel__Group__1__Impl : ( ( rule__Domainmodel__ApplicationNameAssignment_1 ) ) ;
    public final void rule__Domainmodel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:455:1: ( ( ( rule__Domainmodel__ApplicationNameAssignment_1 ) ) )
            // InternalEntityDsl.g:456:1: ( ( rule__Domainmodel__ApplicationNameAssignment_1 ) )
            {
            // InternalEntityDsl.g:456:1: ( ( rule__Domainmodel__ApplicationNameAssignment_1 ) )
            // InternalEntityDsl.g:457:2: ( rule__Domainmodel__ApplicationNameAssignment_1 )
            {
             before(grammarAccess.getDomainmodelAccess().getApplicationNameAssignment_1()); 
            // InternalEntityDsl.g:458:2: ( rule__Domainmodel__ApplicationNameAssignment_1 )
            // InternalEntityDsl.g:458:3: rule__Domainmodel__ApplicationNameAssignment_1
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
    // InternalEntityDsl.g:466:1: rule__Domainmodel__Group__2 : rule__Domainmodel__Group__2__Impl ;
    public final void rule__Domainmodel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:470:1: ( rule__Domainmodel__Group__2__Impl )
            // InternalEntityDsl.g:471:2: rule__Domainmodel__Group__2__Impl
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
    // InternalEntityDsl.g:477:1: rule__Domainmodel__Group__2__Impl : ( ( rule__Domainmodel__ElementsAssignment_2 )* ) ;
    public final void rule__Domainmodel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:481:1: ( ( ( rule__Domainmodel__ElementsAssignment_2 )* ) )
            // InternalEntityDsl.g:482:1: ( ( rule__Domainmodel__ElementsAssignment_2 )* )
            {
            // InternalEntityDsl.g:482:1: ( ( rule__Domainmodel__ElementsAssignment_2 )* )
            // InternalEntityDsl.g:483:2: ( rule__Domainmodel__ElementsAssignment_2 )*
            {
             before(grammarAccess.getDomainmodelAccess().getElementsAssignment_2()); 
            // InternalEntityDsl.g:484:2: ( rule__Domainmodel__ElementsAssignment_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalEntityDsl.g:484:3: rule__Domainmodel__ElementsAssignment_2
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
    // InternalEntityDsl.g:493:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:497:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalEntityDsl.g:498:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
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
    // InternalEntityDsl.g:505:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:509:1: ( ( 'entity' ) )
            // InternalEntityDsl.g:510:1: ( 'entity' )
            {
            // InternalEntityDsl.g:510:1: ( 'entity' )
            // InternalEntityDsl.g:511:2: 'entity'
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
    // InternalEntityDsl.g:520:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:524:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalEntityDsl.g:525:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
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
    // InternalEntityDsl.g:532:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:536:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalEntityDsl.g:537:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalEntityDsl.g:537:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalEntityDsl.g:538:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalEntityDsl.g:539:2: ( rule__Entity__NameAssignment_1 )
            // InternalEntityDsl.g:539:3: rule__Entity__NameAssignment_1
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
    // InternalEntityDsl.g:547:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:551:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalEntityDsl.g:552:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
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
    // InternalEntityDsl.g:559:1: rule__Entity__Group__2__Impl : ( '{' ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:563:1: ( ( '{' ) )
            // InternalEntityDsl.g:564:1: ( '{' )
            {
            // InternalEntityDsl.g:564:1: ( '{' )
            // InternalEntityDsl.g:565:2: '{'
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
    // InternalEntityDsl.g:574:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:578:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalEntityDsl.g:579:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
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
    // InternalEntityDsl.g:586:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__AttributesAssignment_3 )* ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:590:1: ( ( ( rule__Entity__AttributesAssignment_3 )* ) )
            // InternalEntityDsl.g:591:1: ( ( rule__Entity__AttributesAssignment_3 )* )
            {
            // InternalEntityDsl.g:591:1: ( ( rule__Entity__AttributesAssignment_3 )* )
            // InternalEntityDsl.g:592:2: ( rule__Entity__AttributesAssignment_3 )*
            {
             before(grammarAccess.getEntityAccess().getAttributesAssignment_3()); 
            // InternalEntityDsl.g:593:2: ( rule__Entity__AttributesAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID||LA4_0==24) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalEntityDsl.g:593:3: rule__Entity__AttributesAssignment_3
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
    // InternalEntityDsl.g:601:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:605:1: ( rule__Entity__Group__4__Impl )
            // InternalEntityDsl.g:606:2: rule__Entity__Group__4__Impl
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
    // InternalEntityDsl.g:612:1: rule__Entity__Group__4__Impl : ( '}' ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:616:1: ( ( '}' ) )
            // InternalEntityDsl.g:617:1: ( '}' )
            {
            // InternalEntityDsl.g:617:1: ( '}' )
            // InternalEntityDsl.g:618:2: '}'
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
    // InternalEntityDsl.g:628:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:632:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalEntityDsl.g:633:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
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
    // InternalEntityDsl.g:640:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__RequiredAssignment_0 )? ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:644:1: ( ( ( rule__Attribute__RequiredAssignment_0 )? ) )
            // InternalEntityDsl.g:645:1: ( ( rule__Attribute__RequiredAssignment_0 )? )
            {
            // InternalEntityDsl.g:645:1: ( ( rule__Attribute__RequiredAssignment_0 )? )
            // InternalEntityDsl.g:646:2: ( rule__Attribute__RequiredAssignment_0 )?
            {
             before(grammarAccess.getAttributeAccess().getRequiredAssignment_0()); 
            // InternalEntityDsl.g:647:2: ( rule__Attribute__RequiredAssignment_0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalEntityDsl.g:647:3: rule__Attribute__RequiredAssignment_0
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
    // InternalEntityDsl.g:655:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:659:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalEntityDsl.g:660:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
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
    // InternalEntityDsl.g:667:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:671:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalEntityDsl.g:672:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalEntityDsl.g:672:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalEntityDsl.g:673:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalEntityDsl.g:674:2: ( rule__Attribute__NameAssignment_1 )
            // InternalEntityDsl.g:674:3: rule__Attribute__NameAssignment_1
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
    // InternalEntityDsl.g:682:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:686:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalEntityDsl.g:687:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
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
    // InternalEntityDsl.g:694:1: rule__Attribute__Group__2__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:698:1: ( ( ':' ) )
            // InternalEntityDsl.g:699:1: ( ':' )
            {
            // InternalEntityDsl.g:699:1: ( ':' )
            // InternalEntityDsl.g:700:2: ':'
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
    // InternalEntityDsl.g:709:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:713:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // InternalEntityDsl.g:714:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
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
    // InternalEntityDsl.g:721:1: rule__Attribute__Group__3__Impl : ( '[' ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:725:1: ( ( '[' ) )
            // InternalEntityDsl.g:726:1: ( '[' )
            {
            // InternalEntityDsl.g:726:1: ( '[' )
            // InternalEntityDsl.g:727:2: '['
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
    // InternalEntityDsl.g:736:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:740:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
            // InternalEntityDsl.g:741:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
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
    // InternalEntityDsl.g:748:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__InputTypeAssignment_4 ) ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:752:1: ( ( ( rule__Attribute__InputTypeAssignment_4 ) ) )
            // InternalEntityDsl.g:753:1: ( ( rule__Attribute__InputTypeAssignment_4 ) )
            {
            // InternalEntityDsl.g:753:1: ( ( rule__Attribute__InputTypeAssignment_4 ) )
            // InternalEntityDsl.g:754:2: ( rule__Attribute__InputTypeAssignment_4 )
            {
             before(grammarAccess.getAttributeAccess().getInputTypeAssignment_4()); 
            // InternalEntityDsl.g:755:2: ( rule__Attribute__InputTypeAssignment_4 )
            // InternalEntityDsl.g:755:3: rule__Attribute__InputTypeAssignment_4
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
    // InternalEntityDsl.g:763:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl rule__Attribute__Group__6 ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:767:1: ( rule__Attribute__Group__5__Impl rule__Attribute__Group__6 )
            // InternalEntityDsl.g:768:2: rule__Attribute__Group__5__Impl rule__Attribute__Group__6
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
    // InternalEntityDsl.g:775:1: rule__Attribute__Group__5__Impl : ( ',' ) ;
    public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:779:1: ( ( ',' ) )
            // InternalEntityDsl.g:780:1: ( ',' )
            {
            // InternalEntityDsl.g:780:1: ( ',' )
            // InternalEntityDsl.g:781:2: ','
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
    // InternalEntityDsl.g:790:1: rule__Attribute__Group__6 : rule__Attribute__Group__6__Impl rule__Attribute__Group__7 ;
    public final void rule__Attribute__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:794:1: ( rule__Attribute__Group__6__Impl rule__Attribute__Group__7 )
            // InternalEntityDsl.g:795:2: rule__Attribute__Group__6__Impl rule__Attribute__Group__7
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
    // InternalEntityDsl.g:802:1: rule__Attribute__Group__6__Impl : ( ( rule__Attribute__LabelTextAssignment_6 ) ) ;
    public final void rule__Attribute__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:806:1: ( ( ( rule__Attribute__LabelTextAssignment_6 ) ) )
            // InternalEntityDsl.g:807:1: ( ( rule__Attribute__LabelTextAssignment_6 ) )
            {
            // InternalEntityDsl.g:807:1: ( ( rule__Attribute__LabelTextAssignment_6 ) )
            // InternalEntityDsl.g:808:2: ( rule__Attribute__LabelTextAssignment_6 )
            {
             before(grammarAccess.getAttributeAccess().getLabelTextAssignment_6()); 
            // InternalEntityDsl.g:809:2: ( rule__Attribute__LabelTextAssignment_6 )
            // InternalEntityDsl.g:809:3: rule__Attribute__LabelTextAssignment_6
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
    // InternalEntityDsl.g:817:1: rule__Attribute__Group__7 : rule__Attribute__Group__7__Impl ;
    public final void rule__Attribute__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:821:1: ( rule__Attribute__Group__7__Impl )
            // InternalEntityDsl.g:822:2: rule__Attribute__Group__7__Impl
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
    // InternalEntityDsl.g:828:1: rule__Attribute__Group__7__Impl : ( ']' ) ;
    public final void rule__Attribute__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:832:1: ( ( ']' ) )
            // InternalEntityDsl.g:833:1: ( ']' )
            {
            // InternalEntityDsl.g:833:1: ( ']' )
            // InternalEntityDsl.g:834:2: ']'
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


    // $ANTLR start "rule__RadioButtonGroup__Group__0"
    // InternalEntityDsl.g:844:1: rule__RadioButtonGroup__Group__0 : rule__RadioButtonGroup__Group__0__Impl rule__RadioButtonGroup__Group__1 ;
    public final void rule__RadioButtonGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:848:1: ( rule__RadioButtonGroup__Group__0__Impl rule__RadioButtonGroup__Group__1 )
            // InternalEntityDsl.g:849:2: rule__RadioButtonGroup__Group__0__Impl rule__RadioButtonGroup__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalEntityDsl.g:856:1: rule__RadioButtonGroup__Group__0__Impl : ( ( rule__RadioButtonGroup__NameAssignment_0 ) ) ;
    public final void rule__RadioButtonGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:860:1: ( ( ( rule__RadioButtonGroup__NameAssignment_0 ) ) )
            // InternalEntityDsl.g:861:1: ( ( rule__RadioButtonGroup__NameAssignment_0 ) )
            {
            // InternalEntityDsl.g:861:1: ( ( rule__RadioButtonGroup__NameAssignment_0 ) )
            // InternalEntityDsl.g:862:2: ( rule__RadioButtonGroup__NameAssignment_0 )
            {
             before(grammarAccess.getRadioButtonGroupAccess().getNameAssignment_0()); 
            // InternalEntityDsl.g:863:2: ( rule__RadioButtonGroup__NameAssignment_0 )
            // InternalEntityDsl.g:863:3: rule__RadioButtonGroup__NameAssignment_0
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
    // InternalEntityDsl.g:871:1: rule__RadioButtonGroup__Group__1 : rule__RadioButtonGroup__Group__1__Impl rule__RadioButtonGroup__Group__2 ;
    public final void rule__RadioButtonGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:875:1: ( rule__RadioButtonGroup__Group__1__Impl rule__RadioButtonGroup__Group__2 )
            // InternalEntityDsl.g:876:2: rule__RadioButtonGroup__Group__1__Impl rule__RadioButtonGroup__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalEntityDsl.g:883:1: rule__RadioButtonGroup__Group__1__Impl : ( '(' ) ;
    public final void rule__RadioButtonGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:887:1: ( ( '(' ) )
            // InternalEntityDsl.g:888:1: ( '(' )
            {
            // InternalEntityDsl.g:888:1: ( '(' )
            // InternalEntityDsl.g:889:2: '('
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
    // InternalEntityDsl.g:898:1: rule__RadioButtonGroup__Group__2 : rule__RadioButtonGroup__Group__2__Impl rule__RadioButtonGroup__Group__3 ;
    public final void rule__RadioButtonGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:902:1: ( rule__RadioButtonGroup__Group__2__Impl rule__RadioButtonGroup__Group__3 )
            // InternalEntityDsl.g:903:2: rule__RadioButtonGroup__Group__2__Impl rule__RadioButtonGroup__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalEntityDsl.g:910:1: rule__RadioButtonGroup__Group__2__Impl : ( ( rule__RadioButtonGroup__ButtonsAssignment_2 )* ) ;
    public final void rule__RadioButtonGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:914:1: ( ( ( rule__RadioButtonGroup__ButtonsAssignment_2 )* ) )
            // InternalEntityDsl.g:915:1: ( ( rule__RadioButtonGroup__ButtonsAssignment_2 )* )
            {
            // InternalEntityDsl.g:915:1: ( ( rule__RadioButtonGroup__ButtonsAssignment_2 )* )
            // InternalEntityDsl.g:916:2: ( rule__RadioButtonGroup__ButtonsAssignment_2 )*
            {
             before(grammarAccess.getRadioButtonGroupAccess().getButtonsAssignment_2()); 
            // InternalEntityDsl.g:917:2: ( rule__RadioButtonGroup__ButtonsAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_STRING) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalEntityDsl.g:917:3: rule__RadioButtonGroup__ButtonsAssignment_2
            	    {
            	    pushFollow(FOLLOW_18);
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
    // InternalEntityDsl.g:925:1: rule__RadioButtonGroup__Group__3 : rule__RadioButtonGroup__Group__3__Impl rule__RadioButtonGroup__Group__4 ;
    public final void rule__RadioButtonGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:929:1: ( rule__RadioButtonGroup__Group__3__Impl rule__RadioButtonGroup__Group__4 )
            // InternalEntityDsl.g:930:2: rule__RadioButtonGroup__Group__3__Impl rule__RadioButtonGroup__Group__4
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
    // InternalEntityDsl.g:937:1: rule__RadioButtonGroup__Group__3__Impl : ( ')' ) ;
    public final void rule__RadioButtonGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:941:1: ( ( ')' ) )
            // InternalEntityDsl.g:942:1: ( ')' )
            {
            // InternalEntityDsl.g:942:1: ( ')' )
            // InternalEntityDsl.g:943:2: ')'
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
    // InternalEntityDsl.g:952:1: rule__RadioButtonGroup__Group__4 : rule__RadioButtonGroup__Group__4__Impl rule__RadioButtonGroup__Group__5 ;
    public final void rule__RadioButtonGroup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:956:1: ( rule__RadioButtonGroup__Group__4__Impl rule__RadioButtonGroup__Group__5 )
            // InternalEntityDsl.g:957:2: rule__RadioButtonGroup__Group__4__Impl rule__RadioButtonGroup__Group__5
            {
            pushFollow(FOLLOW_19);
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
    // InternalEntityDsl.g:964:1: rule__RadioButtonGroup__Group__4__Impl : ( '[' ) ;
    public final void rule__RadioButtonGroup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:968:1: ( ( '[' ) )
            // InternalEntityDsl.g:969:1: ( '[' )
            {
            // InternalEntityDsl.g:969:1: ( '[' )
            // InternalEntityDsl.g:970:2: '['
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
    // InternalEntityDsl.g:979:1: rule__RadioButtonGroup__Group__5 : rule__RadioButtonGroup__Group__5__Impl rule__RadioButtonGroup__Group__6 ;
    public final void rule__RadioButtonGroup__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:983:1: ( rule__RadioButtonGroup__Group__5__Impl rule__RadioButtonGroup__Group__6 )
            // InternalEntityDsl.g:984:2: rule__RadioButtonGroup__Group__5__Impl rule__RadioButtonGroup__Group__6
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
    // InternalEntityDsl.g:991:1: rule__RadioButtonGroup__Group__5__Impl : ( ( rule__RadioButtonGroup__DataTypeAssignment_5 ) ) ;
    public final void rule__RadioButtonGroup__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:995:1: ( ( ( rule__RadioButtonGroup__DataTypeAssignment_5 ) ) )
            // InternalEntityDsl.g:996:1: ( ( rule__RadioButtonGroup__DataTypeAssignment_5 ) )
            {
            // InternalEntityDsl.g:996:1: ( ( rule__RadioButtonGroup__DataTypeAssignment_5 ) )
            // InternalEntityDsl.g:997:2: ( rule__RadioButtonGroup__DataTypeAssignment_5 )
            {
             before(grammarAccess.getRadioButtonGroupAccess().getDataTypeAssignment_5()); 
            // InternalEntityDsl.g:998:2: ( rule__RadioButtonGroup__DataTypeAssignment_5 )
            // InternalEntityDsl.g:998:3: rule__RadioButtonGroup__DataTypeAssignment_5
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
    // InternalEntityDsl.g:1006:1: rule__RadioButtonGroup__Group__6 : rule__RadioButtonGroup__Group__6__Impl ;
    public final void rule__RadioButtonGroup__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1010:1: ( rule__RadioButtonGroup__Group__6__Impl )
            // InternalEntityDsl.g:1011:2: rule__RadioButtonGroup__Group__6__Impl
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
    // InternalEntityDsl.g:1017:1: rule__RadioButtonGroup__Group__6__Impl : ( ']' ) ;
    public final void rule__RadioButtonGroup__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1021:1: ( ( ']' ) )
            // InternalEntityDsl.g:1022:1: ( ']' )
            {
            // InternalEntityDsl.g:1022:1: ( ']' )
            // InternalEntityDsl.g:1023:2: ']'
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
    // InternalEntityDsl.g:1033:1: rule__TextBox__Group__0 : rule__TextBox__Group__0__Impl rule__TextBox__Group__1 ;
    public final void rule__TextBox__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1037:1: ( rule__TextBox__Group__0__Impl rule__TextBox__Group__1 )
            // InternalEntityDsl.g:1038:2: rule__TextBox__Group__0__Impl rule__TextBox__Group__1
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
    // InternalEntityDsl.g:1045:1: rule__TextBox__Group__0__Impl : ( ( rule__TextBox__NameAssignment_0 ) ) ;
    public final void rule__TextBox__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1049:1: ( ( ( rule__TextBox__NameAssignment_0 ) ) )
            // InternalEntityDsl.g:1050:1: ( ( rule__TextBox__NameAssignment_0 ) )
            {
            // InternalEntityDsl.g:1050:1: ( ( rule__TextBox__NameAssignment_0 ) )
            // InternalEntityDsl.g:1051:2: ( rule__TextBox__NameAssignment_0 )
            {
             before(grammarAccess.getTextBoxAccess().getNameAssignment_0()); 
            // InternalEntityDsl.g:1052:2: ( rule__TextBox__NameAssignment_0 )
            // InternalEntityDsl.g:1052:3: rule__TextBox__NameAssignment_0
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
    // InternalEntityDsl.g:1060:1: rule__TextBox__Group__1 : rule__TextBox__Group__1__Impl rule__TextBox__Group__2 ;
    public final void rule__TextBox__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1064:1: ( rule__TextBox__Group__1__Impl rule__TextBox__Group__2 )
            // InternalEntityDsl.g:1065:2: rule__TextBox__Group__1__Impl rule__TextBox__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalEntityDsl.g:1072:1: rule__TextBox__Group__1__Impl : ( '[' ) ;
    public final void rule__TextBox__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1076:1: ( ( '[' ) )
            // InternalEntityDsl.g:1077:1: ( '[' )
            {
            // InternalEntityDsl.g:1077:1: ( '[' )
            // InternalEntityDsl.g:1078:2: '['
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
    // InternalEntityDsl.g:1087:1: rule__TextBox__Group__2 : rule__TextBox__Group__2__Impl rule__TextBox__Group__3 ;
    public final void rule__TextBox__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1091:1: ( rule__TextBox__Group__2__Impl rule__TextBox__Group__3 )
            // InternalEntityDsl.g:1092:2: rule__TextBox__Group__2__Impl rule__TextBox__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalEntityDsl.g:1099:1: rule__TextBox__Group__2__Impl : ( ( rule__TextBox__DataTypeAssignment_2 ) ) ;
    public final void rule__TextBox__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1103:1: ( ( ( rule__TextBox__DataTypeAssignment_2 ) ) )
            // InternalEntityDsl.g:1104:1: ( ( rule__TextBox__DataTypeAssignment_2 ) )
            {
            // InternalEntityDsl.g:1104:1: ( ( rule__TextBox__DataTypeAssignment_2 ) )
            // InternalEntityDsl.g:1105:2: ( rule__TextBox__DataTypeAssignment_2 )
            {
             before(grammarAccess.getTextBoxAccess().getDataTypeAssignment_2()); 
            // InternalEntityDsl.g:1106:2: ( rule__TextBox__DataTypeAssignment_2 )
            // InternalEntityDsl.g:1106:3: rule__TextBox__DataTypeAssignment_2
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
    // InternalEntityDsl.g:1114:1: rule__TextBox__Group__3 : rule__TextBox__Group__3__Impl rule__TextBox__Group__4 ;
    public final void rule__TextBox__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1118:1: ( rule__TextBox__Group__3__Impl rule__TextBox__Group__4 )
            // InternalEntityDsl.g:1119:2: rule__TextBox__Group__3__Impl rule__TextBox__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalEntityDsl.g:1126:1: rule__TextBox__Group__3__Impl : ( '(' ) ;
    public final void rule__TextBox__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1130:1: ( ( '(' ) )
            // InternalEntityDsl.g:1131:1: ( '(' )
            {
            // InternalEntityDsl.g:1131:1: ( '(' )
            // InternalEntityDsl.g:1132:2: '('
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
    // InternalEntityDsl.g:1141:1: rule__TextBox__Group__4 : rule__TextBox__Group__4__Impl rule__TextBox__Group__5 ;
    public final void rule__TextBox__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1145:1: ( rule__TextBox__Group__4__Impl rule__TextBox__Group__5 )
            // InternalEntityDsl.g:1146:2: rule__TextBox__Group__4__Impl rule__TextBox__Group__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalEntityDsl.g:1153:1: rule__TextBox__Group__4__Impl : ( ( rule__TextBox__MinTextLengthAssignment_4 )? ) ;
    public final void rule__TextBox__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1157:1: ( ( ( rule__TextBox__MinTextLengthAssignment_4 )? ) )
            // InternalEntityDsl.g:1158:1: ( ( rule__TextBox__MinTextLengthAssignment_4 )? )
            {
            // InternalEntityDsl.g:1158:1: ( ( rule__TextBox__MinTextLengthAssignment_4 )? )
            // InternalEntityDsl.g:1159:2: ( rule__TextBox__MinTextLengthAssignment_4 )?
            {
             before(grammarAccess.getTextBoxAccess().getMinTextLengthAssignment_4()); 
            // InternalEntityDsl.g:1160:2: ( rule__TextBox__MinTextLengthAssignment_4 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalEntityDsl.g:1160:3: rule__TextBox__MinTextLengthAssignment_4
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
    // InternalEntityDsl.g:1168:1: rule__TextBox__Group__5 : rule__TextBox__Group__5__Impl rule__TextBox__Group__6 ;
    public final void rule__TextBox__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1172:1: ( rule__TextBox__Group__5__Impl rule__TextBox__Group__6 )
            // InternalEntityDsl.g:1173:2: rule__TextBox__Group__5__Impl rule__TextBox__Group__6
            {
            pushFollow(FOLLOW_21);
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
    // InternalEntityDsl.g:1180:1: rule__TextBox__Group__5__Impl : ( ',' ) ;
    public final void rule__TextBox__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1184:1: ( ( ',' ) )
            // InternalEntityDsl.g:1185:1: ( ',' )
            {
            // InternalEntityDsl.g:1185:1: ( ',' )
            // InternalEntityDsl.g:1186:2: ','
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
    // InternalEntityDsl.g:1195:1: rule__TextBox__Group__6 : rule__TextBox__Group__6__Impl rule__TextBox__Group__7 ;
    public final void rule__TextBox__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1199:1: ( rule__TextBox__Group__6__Impl rule__TextBox__Group__7 )
            // InternalEntityDsl.g:1200:2: rule__TextBox__Group__6__Impl rule__TextBox__Group__7
            {
            pushFollow(FOLLOW_21);
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
    // InternalEntityDsl.g:1207:1: rule__TextBox__Group__6__Impl : ( ( rule__TextBox__MaxTextLengthAssignment_6 )? ) ;
    public final void rule__TextBox__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1211:1: ( ( ( rule__TextBox__MaxTextLengthAssignment_6 )? ) )
            // InternalEntityDsl.g:1212:1: ( ( rule__TextBox__MaxTextLengthAssignment_6 )? )
            {
            // InternalEntityDsl.g:1212:1: ( ( rule__TextBox__MaxTextLengthAssignment_6 )? )
            // InternalEntityDsl.g:1213:2: ( rule__TextBox__MaxTextLengthAssignment_6 )?
            {
             before(grammarAccess.getTextBoxAccess().getMaxTextLengthAssignment_6()); 
            // InternalEntityDsl.g:1214:2: ( rule__TextBox__MaxTextLengthAssignment_6 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalEntityDsl.g:1214:3: rule__TextBox__MaxTextLengthAssignment_6
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
    // InternalEntityDsl.g:1222:1: rule__TextBox__Group__7 : rule__TextBox__Group__7__Impl rule__TextBox__Group__8 ;
    public final void rule__TextBox__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1226:1: ( rule__TextBox__Group__7__Impl rule__TextBox__Group__8 )
            // InternalEntityDsl.g:1227:2: rule__TextBox__Group__7__Impl rule__TextBox__Group__8
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
    // InternalEntityDsl.g:1234:1: rule__TextBox__Group__7__Impl : ( ')' ) ;
    public final void rule__TextBox__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1238:1: ( ( ')' ) )
            // InternalEntityDsl.g:1239:1: ( ')' )
            {
            // InternalEntityDsl.g:1239:1: ( ')' )
            // InternalEntityDsl.g:1240:2: ')'
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
    // InternalEntityDsl.g:1249:1: rule__TextBox__Group__8 : rule__TextBox__Group__8__Impl ;
    public final void rule__TextBox__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1253:1: ( rule__TextBox__Group__8__Impl )
            // InternalEntityDsl.g:1254:2: rule__TextBox__Group__8__Impl
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
    // InternalEntityDsl.g:1260:1: rule__TextBox__Group__8__Impl : ( ']' ) ;
    public final void rule__TextBox__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1264:1: ( ( ']' ) )
            // InternalEntityDsl.g:1265:1: ( ']' )
            {
            // InternalEntityDsl.g:1265:1: ( ']' )
            // InternalEntityDsl.g:1266:2: ']'
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
    // InternalEntityDsl.g:1276:1: rule__ComboBox__Group__0 : rule__ComboBox__Group__0__Impl rule__ComboBox__Group__1 ;
    public final void rule__ComboBox__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1280:1: ( rule__ComboBox__Group__0__Impl rule__ComboBox__Group__1 )
            // InternalEntityDsl.g:1281:2: rule__ComboBox__Group__0__Impl rule__ComboBox__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalEntityDsl.g:1288:1: rule__ComboBox__Group__0__Impl : ( ( rule__ComboBox__NameAssignment_0 ) ) ;
    public final void rule__ComboBox__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1292:1: ( ( ( rule__ComboBox__NameAssignment_0 ) ) )
            // InternalEntityDsl.g:1293:1: ( ( rule__ComboBox__NameAssignment_0 ) )
            {
            // InternalEntityDsl.g:1293:1: ( ( rule__ComboBox__NameAssignment_0 ) )
            // InternalEntityDsl.g:1294:2: ( rule__ComboBox__NameAssignment_0 )
            {
             before(grammarAccess.getComboBoxAccess().getNameAssignment_0()); 
            // InternalEntityDsl.g:1295:2: ( rule__ComboBox__NameAssignment_0 )
            // InternalEntityDsl.g:1295:3: rule__ComboBox__NameAssignment_0
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
    // InternalEntityDsl.g:1303:1: rule__ComboBox__Group__1 : rule__ComboBox__Group__1__Impl rule__ComboBox__Group__2 ;
    public final void rule__ComboBox__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1307:1: ( rule__ComboBox__Group__1__Impl rule__ComboBox__Group__2 )
            // InternalEntityDsl.g:1308:2: rule__ComboBox__Group__1__Impl rule__ComboBox__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalEntityDsl.g:1315:1: rule__ComboBox__Group__1__Impl : ( '(' ) ;
    public final void rule__ComboBox__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1319:1: ( ( '(' ) )
            // InternalEntityDsl.g:1320:1: ( '(' )
            {
            // InternalEntityDsl.g:1320:1: ( '(' )
            // InternalEntityDsl.g:1321:2: '('
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
    // InternalEntityDsl.g:1330:1: rule__ComboBox__Group__2 : rule__ComboBox__Group__2__Impl rule__ComboBox__Group__3 ;
    public final void rule__ComboBox__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1334:1: ( rule__ComboBox__Group__2__Impl rule__ComboBox__Group__3 )
            // InternalEntityDsl.g:1335:2: rule__ComboBox__Group__2__Impl rule__ComboBox__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalEntityDsl.g:1342:1: rule__ComboBox__Group__2__Impl : ( ( rule__ComboBox__ItemsAssignment_2 )* ) ;
    public final void rule__ComboBox__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1346:1: ( ( ( rule__ComboBox__ItemsAssignment_2 )* ) )
            // InternalEntityDsl.g:1347:1: ( ( rule__ComboBox__ItemsAssignment_2 )* )
            {
            // InternalEntityDsl.g:1347:1: ( ( rule__ComboBox__ItemsAssignment_2 )* )
            // InternalEntityDsl.g:1348:2: ( rule__ComboBox__ItemsAssignment_2 )*
            {
             before(grammarAccess.getComboBoxAccess().getItemsAssignment_2()); 
            // InternalEntityDsl.g:1349:2: ( rule__ComboBox__ItemsAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_STRING) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalEntityDsl.g:1349:3: rule__ComboBox__ItemsAssignment_2
            	    {
            	    pushFollow(FOLLOW_18);
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
    // InternalEntityDsl.g:1357:1: rule__ComboBox__Group__3 : rule__ComboBox__Group__3__Impl rule__ComboBox__Group__4 ;
    public final void rule__ComboBox__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1361:1: ( rule__ComboBox__Group__3__Impl rule__ComboBox__Group__4 )
            // InternalEntityDsl.g:1362:2: rule__ComboBox__Group__3__Impl rule__ComboBox__Group__4
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
    // InternalEntityDsl.g:1369:1: rule__ComboBox__Group__3__Impl : ( ')' ) ;
    public final void rule__ComboBox__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1373:1: ( ( ')' ) )
            // InternalEntityDsl.g:1374:1: ( ')' )
            {
            // InternalEntityDsl.g:1374:1: ( ')' )
            // InternalEntityDsl.g:1375:2: ')'
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
    // InternalEntityDsl.g:1384:1: rule__ComboBox__Group__4 : rule__ComboBox__Group__4__Impl rule__ComboBox__Group__5 ;
    public final void rule__ComboBox__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1388:1: ( rule__ComboBox__Group__4__Impl rule__ComboBox__Group__5 )
            // InternalEntityDsl.g:1389:2: rule__ComboBox__Group__4__Impl rule__ComboBox__Group__5
            {
            pushFollow(FOLLOW_19);
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
    // InternalEntityDsl.g:1396:1: rule__ComboBox__Group__4__Impl : ( '[' ) ;
    public final void rule__ComboBox__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1400:1: ( ( '[' ) )
            // InternalEntityDsl.g:1401:1: ( '[' )
            {
            // InternalEntityDsl.g:1401:1: ( '[' )
            // InternalEntityDsl.g:1402:2: '['
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
    // InternalEntityDsl.g:1411:1: rule__ComboBox__Group__5 : rule__ComboBox__Group__5__Impl rule__ComboBox__Group__6 ;
    public final void rule__ComboBox__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1415:1: ( rule__ComboBox__Group__5__Impl rule__ComboBox__Group__6 )
            // InternalEntityDsl.g:1416:2: rule__ComboBox__Group__5__Impl rule__ComboBox__Group__6
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
    // InternalEntityDsl.g:1423:1: rule__ComboBox__Group__5__Impl : ( ( rule__ComboBox__DataTypeAssignment_5 ) ) ;
    public final void rule__ComboBox__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1427:1: ( ( ( rule__ComboBox__DataTypeAssignment_5 ) ) )
            // InternalEntityDsl.g:1428:1: ( ( rule__ComboBox__DataTypeAssignment_5 ) )
            {
            // InternalEntityDsl.g:1428:1: ( ( rule__ComboBox__DataTypeAssignment_5 ) )
            // InternalEntityDsl.g:1429:2: ( rule__ComboBox__DataTypeAssignment_5 )
            {
             before(grammarAccess.getComboBoxAccess().getDataTypeAssignment_5()); 
            // InternalEntityDsl.g:1430:2: ( rule__ComboBox__DataTypeAssignment_5 )
            // InternalEntityDsl.g:1430:3: rule__ComboBox__DataTypeAssignment_5
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
    // InternalEntityDsl.g:1438:1: rule__ComboBox__Group__6 : rule__ComboBox__Group__6__Impl ;
    public final void rule__ComboBox__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1442:1: ( rule__ComboBox__Group__6__Impl )
            // InternalEntityDsl.g:1443:2: rule__ComboBox__Group__6__Impl
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
    // InternalEntityDsl.g:1449:1: rule__ComboBox__Group__6__Impl : ( ']' ) ;
    public final void rule__ComboBox__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1453:1: ( ( ']' ) )
            // InternalEntityDsl.g:1454:1: ( ']' )
            {
            // InternalEntityDsl.g:1454:1: ( ']' )
            // InternalEntityDsl.g:1455:2: ']'
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
    // InternalEntityDsl.g:1465:1: rule__Domainmodel__ApplicationNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Domainmodel__ApplicationNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1469:1: ( ( RULE_ID ) )
            // InternalEntityDsl.g:1470:2: ( RULE_ID )
            {
            // InternalEntityDsl.g:1470:2: ( RULE_ID )
            // InternalEntityDsl.g:1471:3: RULE_ID
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
    // InternalEntityDsl.g:1480:1: rule__Domainmodel__ElementsAssignment_2 : ( ruleEntity ) ;
    public final void rule__Domainmodel__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1484:1: ( ( ruleEntity ) )
            // InternalEntityDsl.g:1485:2: ( ruleEntity )
            {
            // InternalEntityDsl.g:1485:2: ( ruleEntity )
            // InternalEntityDsl.g:1486:3: ruleEntity
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
    // InternalEntityDsl.g:1495:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1499:1: ( ( RULE_ID ) )
            // InternalEntityDsl.g:1500:2: ( RULE_ID )
            {
            // InternalEntityDsl.g:1500:2: ( RULE_ID )
            // InternalEntityDsl.g:1501:3: RULE_ID
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
    // InternalEntityDsl.g:1510:1: rule__Entity__AttributesAssignment_3 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1514:1: ( ( ruleAttribute ) )
            // InternalEntityDsl.g:1515:2: ( ruleAttribute )
            {
            // InternalEntityDsl.g:1515:2: ( ruleAttribute )
            // InternalEntityDsl.g:1516:3: ruleAttribute
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
    // InternalEntityDsl.g:1525:1: rule__Attribute__RequiredAssignment_0 : ( ( '*' ) ) ;
    public final void rule__Attribute__RequiredAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1529:1: ( ( ( '*' ) ) )
            // InternalEntityDsl.g:1530:2: ( ( '*' ) )
            {
            // InternalEntityDsl.g:1530:2: ( ( '*' ) )
            // InternalEntityDsl.g:1531:3: ( '*' )
            {
             before(grammarAccess.getAttributeAccess().getRequiredAsteriskKeyword_0_0()); 
            // InternalEntityDsl.g:1532:3: ( '*' )
            // InternalEntityDsl.g:1533:4: '*'
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
    // InternalEntityDsl.g:1544:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1548:1: ( ( RULE_ID ) )
            // InternalEntityDsl.g:1549:2: ( RULE_ID )
            {
            // InternalEntityDsl.g:1549:2: ( RULE_ID )
            // InternalEntityDsl.g:1550:3: RULE_ID
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
    // InternalEntityDsl.g:1559:1: rule__Attribute__InputTypeAssignment_4 : ( ruleWinFormControlType ) ;
    public final void rule__Attribute__InputTypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1563:1: ( ( ruleWinFormControlType ) )
            // InternalEntityDsl.g:1564:2: ( ruleWinFormControlType )
            {
            // InternalEntityDsl.g:1564:2: ( ruleWinFormControlType )
            // InternalEntityDsl.g:1565:3: ruleWinFormControlType
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
    // InternalEntityDsl.g:1574:1: rule__Attribute__LabelTextAssignment_6 : ( ruleLabel ) ;
    public final void rule__Attribute__LabelTextAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1578:1: ( ( ruleLabel ) )
            // InternalEntityDsl.g:1579:2: ( ruleLabel )
            {
            // InternalEntityDsl.g:1579:2: ( ruleLabel )
            // InternalEntityDsl.g:1580:3: ruleLabel
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
    // InternalEntityDsl.g:1589:1: rule__DataType__TypeAssignment : ( ( rule__DataType__TypeAlternatives_0 ) ) ;
    public final void rule__DataType__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1593:1: ( ( ( rule__DataType__TypeAlternatives_0 ) ) )
            // InternalEntityDsl.g:1594:2: ( ( rule__DataType__TypeAlternatives_0 ) )
            {
            // InternalEntityDsl.g:1594:2: ( ( rule__DataType__TypeAlternatives_0 ) )
            // InternalEntityDsl.g:1595:3: ( rule__DataType__TypeAlternatives_0 )
            {
             before(grammarAccess.getDataTypeAccess().getTypeAlternatives_0()); 
            // InternalEntityDsl.g:1596:3: ( rule__DataType__TypeAlternatives_0 )
            // InternalEntityDsl.g:1596:4: rule__DataType__TypeAlternatives_0
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
    // InternalEntityDsl.g:1604:1: rule__Label__TextAssignment : ( RULE_STRING ) ;
    public final void rule__Label__TextAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1608:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:1609:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:1609:2: ( RULE_STRING )
            // InternalEntityDsl.g:1610:3: RULE_STRING
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
    // InternalEntityDsl.g:1619:1: rule__WinFormControlType__ControlTypeAssignment_0 : ( ruleTextBox ) ;
    public final void rule__WinFormControlType__ControlTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1623:1: ( ( ruleTextBox ) )
            // InternalEntityDsl.g:1624:2: ( ruleTextBox )
            {
            // InternalEntityDsl.g:1624:2: ( ruleTextBox )
            // InternalEntityDsl.g:1625:3: ruleTextBox
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
    // InternalEntityDsl.g:1634:1: rule__RadioButtonGroup__NameAssignment_0 : ( ( 'RadioButtonGroup' ) ) ;
    public final void rule__RadioButtonGroup__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1638:1: ( ( ( 'RadioButtonGroup' ) ) )
            // InternalEntityDsl.g:1639:2: ( ( 'RadioButtonGroup' ) )
            {
            // InternalEntityDsl.g:1639:2: ( ( 'RadioButtonGroup' ) )
            // InternalEntityDsl.g:1640:3: ( 'RadioButtonGroup' )
            {
             before(grammarAccess.getRadioButtonGroupAccess().getNameRadioButtonGroupKeyword_0_0()); 
            // InternalEntityDsl.g:1641:3: ( 'RadioButtonGroup' )
            // InternalEntityDsl.g:1642:4: 'RadioButtonGroup'
            {
             before(grammarAccess.getRadioButtonGroupAccess().getNameRadioButtonGroupKeyword_0_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalEntityDsl.g:1653:1: rule__RadioButtonGroup__ButtonsAssignment_2 : ( ruleRadioButton ) ;
    public final void rule__RadioButtonGroup__ButtonsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1657:1: ( ( ruleRadioButton ) )
            // InternalEntityDsl.g:1658:2: ( ruleRadioButton )
            {
            // InternalEntityDsl.g:1658:2: ( ruleRadioButton )
            // InternalEntityDsl.g:1659:3: ruleRadioButton
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
    // InternalEntityDsl.g:1668:1: rule__RadioButtonGroup__DataTypeAssignment_5 : ( ruleDataType ) ;
    public final void rule__RadioButtonGroup__DataTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1672:1: ( ( ruleDataType ) )
            // InternalEntityDsl.g:1673:2: ( ruleDataType )
            {
            // InternalEntityDsl.g:1673:2: ( ruleDataType )
            // InternalEntityDsl.g:1674:3: ruleDataType
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
    // InternalEntityDsl.g:1683:1: rule__RadioButton__TextAssignment : ( RULE_STRING ) ;
    public final void rule__RadioButton__TextAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1687:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:1688:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:1688:2: ( RULE_STRING )
            // InternalEntityDsl.g:1689:3: RULE_STRING
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
    // InternalEntityDsl.g:1698:1: rule__CheckBox__NameAssignment : ( ( 'CheckBox' ) ) ;
    public final void rule__CheckBox__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1702:1: ( ( ( 'CheckBox' ) ) )
            // InternalEntityDsl.g:1703:2: ( ( 'CheckBox' ) )
            {
            // InternalEntityDsl.g:1703:2: ( ( 'CheckBox' ) )
            // InternalEntityDsl.g:1704:3: ( 'CheckBox' )
            {
             before(grammarAccess.getCheckBoxAccess().getNameCheckBoxKeyword_0()); 
            // InternalEntityDsl.g:1705:3: ( 'CheckBox' )
            // InternalEntityDsl.g:1706:4: 'CheckBox'
            {
             before(grammarAccess.getCheckBoxAccess().getNameCheckBoxKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalEntityDsl.g:1717:1: rule__TextBox__NameAssignment_0 : ( ( 'TextBox' ) ) ;
    public final void rule__TextBox__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1721:1: ( ( ( 'TextBox' ) ) )
            // InternalEntityDsl.g:1722:2: ( ( 'TextBox' ) )
            {
            // InternalEntityDsl.g:1722:2: ( ( 'TextBox' ) )
            // InternalEntityDsl.g:1723:3: ( 'TextBox' )
            {
             before(grammarAccess.getTextBoxAccess().getNameTextBoxKeyword_0_0()); 
            // InternalEntityDsl.g:1724:3: ( 'TextBox' )
            // InternalEntityDsl.g:1725:4: 'TextBox'
            {
             before(grammarAccess.getTextBoxAccess().getNameTextBoxKeyword_0_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalEntityDsl.g:1736:1: rule__TextBox__DataTypeAssignment_2 : ( ruleDataType ) ;
    public final void rule__TextBox__DataTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1740:1: ( ( ruleDataType ) )
            // InternalEntityDsl.g:1741:2: ( ruleDataType )
            {
            // InternalEntityDsl.g:1741:2: ( ruleDataType )
            // InternalEntityDsl.g:1742:3: ruleDataType
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
    // InternalEntityDsl.g:1751:1: rule__TextBox__MinTextLengthAssignment_4 : ( RULE_INT ) ;
    public final void rule__TextBox__MinTextLengthAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1755:1: ( ( RULE_INT ) )
            // InternalEntityDsl.g:1756:2: ( RULE_INT )
            {
            // InternalEntityDsl.g:1756:2: ( RULE_INT )
            // InternalEntityDsl.g:1757:3: RULE_INT
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
    // InternalEntityDsl.g:1766:1: rule__TextBox__MaxTextLengthAssignment_6 : ( RULE_INT ) ;
    public final void rule__TextBox__MaxTextLengthAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1770:1: ( ( RULE_INT ) )
            // InternalEntityDsl.g:1771:2: ( RULE_INT )
            {
            // InternalEntityDsl.g:1771:2: ( RULE_INT )
            // InternalEntityDsl.g:1772:3: RULE_INT
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
    // InternalEntityDsl.g:1781:1: rule__ComboBox__NameAssignment_0 : ( ( 'ComboBox' ) ) ;
    public final void rule__ComboBox__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1785:1: ( ( ( 'ComboBox' ) ) )
            // InternalEntityDsl.g:1786:2: ( ( 'ComboBox' ) )
            {
            // InternalEntityDsl.g:1786:2: ( ( 'ComboBox' ) )
            // InternalEntityDsl.g:1787:3: ( 'ComboBox' )
            {
             before(grammarAccess.getComboBoxAccess().getNameComboBoxKeyword_0_0()); 
            // InternalEntityDsl.g:1788:3: ( 'ComboBox' )
            // InternalEntityDsl.g:1789:4: 'ComboBox'
            {
             before(grammarAccess.getComboBoxAccess().getNameComboBoxKeyword_0_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalEntityDsl.g:1800:1: rule__ComboBox__ItemsAssignment_2 : ( ruleComboBoxItem ) ;
    public final void rule__ComboBox__ItemsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1804:1: ( ( ruleComboBoxItem ) )
            // InternalEntityDsl.g:1805:2: ( ruleComboBoxItem )
            {
            // InternalEntityDsl.g:1805:2: ( ruleComboBoxItem )
            // InternalEntityDsl.g:1806:3: ruleComboBoxItem
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
    // InternalEntityDsl.g:1815:1: rule__ComboBox__DataTypeAssignment_5 : ( ruleDataType ) ;
    public final void rule__ComboBox__DataTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1819:1: ( ( ruleDataType ) )
            // InternalEntityDsl.g:1820:2: ( ruleDataType )
            {
            // InternalEntityDsl.g:1820:2: ( ruleDataType )
            // InternalEntityDsl.g:1821:3: ruleDataType
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
    // InternalEntityDsl.g:1830:1: rule__ComboBoxItem__TextAssignment : ( RULE_STRING ) ;
    public final void rule__ComboBoxItem__TextAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1834:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:1835:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:1835:2: ( RULE_STRING )
            // InternalEntityDsl.g:1836:3: RULE_STRING
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
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000001E000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800040L});

}