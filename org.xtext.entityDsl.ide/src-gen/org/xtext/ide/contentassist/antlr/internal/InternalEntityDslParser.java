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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'string'", "'int'", "'double'", "'database:'", "'entity'", "'{'", "'}'", "':'", "'['", "','", "']'", "'('", "')'", "'*'", "'TrackBar'", "'Spinner'", "'RadioButtonGroup'", "'CheckBox'", "'TextBox'", "'ComboBox'"
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
    public static final int T__30=30;
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


    // $ANTLR start "entryRuleTrackBar"
    // InternalEntityDsl.g:203:1: entryRuleTrackBar : ruleTrackBar EOF ;
    public final void entryRuleTrackBar() throws RecognitionException {
        try {
            // InternalEntityDsl.g:204:1: ( ruleTrackBar EOF )
            // InternalEntityDsl.g:205:1: ruleTrackBar EOF
            {
             before(grammarAccess.getTrackBarRule()); 
            pushFollow(FOLLOW_1);
            ruleTrackBar();

            state._fsp--;

             after(grammarAccess.getTrackBarRule()); 
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
    // $ANTLR end "entryRuleTrackBar"


    // $ANTLR start "ruleTrackBar"
    // InternalEntityDsl.g:212:1: ruleTrackBar : ( ( rule__TrackBar__Group__0 ) ) ;
    public final void ruleTrackBar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:216:2: ( ( ( rule__TrackBar__Group__0 ) ) )
            // InternalEntityDsl.g:217:2: ( ( rule__TrackBar__Group__0 ) )
            {
            // InternalEntityDsl.g:217:2: ( ( rule__TrackBar__Group__0 ) )
            // InternalEntityDsl.g:218:3: ( rule__TrackBar__Group__0 )
            {
             before(grammarAccess.getTrackBarAccess().getGroup()); 
            // InternalEntityDsl.g:219:3: ( rule__TrackBar__Group__0 )
            // InternalEntityDsl.g:219:4: rule__TrackBar__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TrackBar__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTrackBarAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTrackBar"


    // $ANTLR start "entryRuleSpinner"
    // InternalEntityDsl.g:228:1: entryRuleSpinner : ruleSpinner EOF ;
    public final void entryRuleSpinner() throws RecognitionException {
        try {
            // InternalEntityDsl.g:229:1: ( ruleSpinner EOF )
            // InternalEntityDsl.g:230:1: ruleSpinner EOF
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
    // InternalEntityDsl.g:237:1: ruleSpinner : ( ( rule__Spinner__Group__0 ) ) ;
    public final void ruleSpinner() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:241:2: ( ( ( rule__Spinner__Group__0 ) ) )
            // InternalEntityDsl.g:242:2: ( ( rule__Spinner__Group__0 ) )
            {
            // InternalEntityDsl.g:242:2: ( ( rule__Spinner__Group__0 ) )
            // InternalEntityDsl.g:243:3: ( rule__Spinner__Group__0 )
            {
             before(grammarAccess.getSpinnerAccess().getGroup()); 
            // InternalEntityDsl.g:244:3: ( rule__Spinner__Group__0 )
            // InternalEntityDsl.g:244:4: rule__Spinner__Group__0
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
    // InternalEntityDsl.g:253:1: entryRuleRadioButtonGroup : ruleRadioButtonGroup EOF ;
    public final void entryRuleRadioButtonGroup() throws RecognitionException {
        try {
            // InternalEntityDsl.g:254:1: ( ruleRadioButtonGroup EOF )
            // InternalEntityDsl.g:255:1: ruleRadioButtonGroup EOF
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
    // InternalEntityDsl.g:262:1: ruleRadioButtonGroup : ( ( rule__RadioButtonGroup__Group__0 ) ) ;
    public final void ruleRadioButtonGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:266:2: ( ( ( rule__RadioButtonGroup__Group__0 ) ) )
            // InternalEntityDsl.g:267:2: ( ( rule__RadioButtonGroup__Group__0 ) )
            {
            // InternalEntityDsl.g:267:2: ( ( rule__RadioButtonGroup__Group__0 ) )
            // InternalEntityDsl.g:268:3: ( rule__RadioButtonGroup__Group__0 )
            {
             before(grammarAccess.getRadioButtonGroupAccess().getGroup()); 
            // InternalEntityDsl.g:269:3: ( rule__RadioButtonGroup__Group__0 )
            // InternalEntityDsl.g:269:4: rule__RadioButtonGroup__Group__0
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
    // InternalEntityDsl.g:278:1: entryRuleRadioButton : ruleRadioButton EOF ;
    public final void entryRuleRadioButton() throws RecognitionException {
        try {
            // InternalEntityDsl.g:279:1: ( ruleRadioButton EOF )
            // InternalEntityDsl.g:280:1: ruleRadioButton EOF
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
    // InternalEntityDsl.g:287:1: ruleRadioButton : ( ( rule__RadioButton__TextAssignment ) ) ;
    public final void ruleRadioButton() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:291:2: ( ( ( rule__RadioButton__TextAssignment ) ) )
            // InternalEntityDsl.g:292:2: ( ( rule__RadioButton__TextAssignment ) )
            {
            // InternalEntityDsl.g:292:2: ( ( rule__RadioButton__TextAssignment ) )
            // InternalEntityDsl.g:293:3: ( rule__RadioButton__TextAssignment )
            {
             before(grammarAccess.getRadioButtonAccess().getTextAssignment()); 
            // InternalEntityDsl.g:294:3: ( rule__RadioButton__TextAssignment )
            // InternalEntityDsl.g:294:4: rule__RadioButton__TextAssignment
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
    // InternalEntityDsl.g:303:1: entryRuleCheckBox : ruleCheckBox EOF ;
    public final void entryRuleCheckBox() throws RecognitionException {
        try {
            // InternalEntityDsl.g:304:1: ( ruleCheckBox EOF )
            // InternalEntityDsl.g:305:1: ruleCheckBox EOF
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
    // InternalEntityDsl.g:312:1: ruleCheckBox : ( ( rule__CheckBox__NameAssignment ) ) ;
    public final void ruleCheckBox() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:316:2: ( ( ( rule__CheckBox__NameAssignment ) ) )
            // InternalEntityDsl.g:317:2: ( ( rule__CheckBox__NameAssignment ) )
            {
            // InternalEntityDsl.g:317:2: ( ( rule__CheckBox__NameAssignment ) )
            // InternalEntityDsl.g:318:3: ( rule__CheckBox__NameAssignment )
            {
             before(grammarAccess.getCheckBoxAccess().getNameAssignment()); 
            // InternalEntityDsl.g:319:3: ( rule__CheckBox__NameAssignment )
            // InternalEntityDsl.g:319:4: rule__CheckBox__NameAssignment
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
    // InternalEntityDsl.g:328:1: entryRuleTextBox : ruleTextBox EOF ;
    public final void entryRuleTextBox() throws RecognitionException {
        try {
            // InternalEntityDsl.g:329:1: ( ruleTextBox EOF )
            // InternalEntityDsl.g:330:1: ruleTextBox EOF
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
    // InternalEntityDsl.g:337:1: ruleTextBox : ( ( rule__TextBox__Group__0 ) ) ;
    public final void ruleTextBox() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:341:2: ( ( ( rule__TextBox__Group__0 ) ) )
            // InternalEntityDsl.g:342:2: ( ( rule__TextBox__Group__0 ) )
            {
            // InternalEntityDsl.g:342:2: ( ( rule__TextBox__Group__0 ) )
            // InternalEntityDsl.g:343:3: ( rule__TextBox__Group__0 )
            {
             before(grammarAccess.getTextBoxAccess().getGroup()); 
            // InternalEntityDsl.g:344:3: ( rule__TextBox__Group__0 )
            // InternalEntityDsl.g:344:4: rule__TextBox__Group__0
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
    // InternalEntityDsl.g:353:1: entryRuleComboBox : ruleComboBox EOF ;
    public final void entryRuleComboBox() throws RecognitionException {
        try {
            // InternalEntityDsl.g:354:1: ( ruleComboBox EOF )
            // InternalEntityDsl.g:355:1: ruleComboBox EOF
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
    // InternalEntityDsl.g:362:1: ruleComboBox : ( ( rule__ComboBox__Group__0 ) ) ;
    public final void ruleComboBox() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:366:2: ( ( ( rule__ComboBox__Group__0 ) ) )
            // InternalEntityDsl.g:367:2: ( ( rule__ComboBox__Group__0 ) )
            {
            // InternalEntityDsl.g:367:2: ( ( rule__ComboBox__Group__0 ) )
            // InternalEntityDsl.g:368:3: ( rule__ComboBox__Group__0 )
            {
             before(grammarAccess.getComboBoxAccess().getGroup()); 
            // InternalEntityDsl.g:369:3: ( rule__ComboBox__Group__0 )
            // InternalEntityDsl.g:369:4: rule__ComboBox__Group__0
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
    // InternalEntityDsl.g:378:1: entryRuleComboBoxItem : ruleComboBoxItem EOF ;
    public final void entryRuleComboBoxItem() throws RecognitionException {
        try {
            // InternalEntityDsl.g:379:1: ( ruleComboBoxItem EOF )
            // InternalEntityDsl.g:380:1: ruleComboBoxItem EOF
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
    // InternalEntityDsl.g:387:1: ruleComboBoxItem : ( ( rule__ComboBoxItem__TextAssignment ) ) ;
    public final void ruleComboBoxItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:391:2: ( ( ( rule__ComboBoxItem__TextAssignment ) ) )
            // InternalEntityDsl.g:392:2: ( ( rule__ComboBoxItem__TextAssignment ) )
            {
            // InternalEntityDsl.g:392:2: ( ( rule__ComboBoxItem__TextAssignment ) )
            // InternalEntityDsl.g:393:3: ( rule__ComboBoxItem__TextAssignment )
            {
             before(grammarAccess.getComboBoxItemAccess().getTextAssignment()); 
            // InternalEntityDsl.g:394:3: ( rule__ComboBoxItem__TextAssignment )
            // InternalEntityDsl.g:394:4: rule__ComboBoxItem__TextAssignment
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
    // InternalEntityDsl.g:402:1: rule__DataType__TypeAlternatives_0 : ( ( 'string' ) | ( 'int' ) | ( 'double' ) );
    public final void rule__DataType__TypeAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:406:1: ( ( 'string' ) | ( 'int' ) | ( 'double' ) )
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
                    // InternalEntityDsl.g:407:2: ( 'string' )
                    {
                    // InternalEntityDsl.g:407:2: ( 'string' )
                    // InternalEntityDsl.g:408:3: 'string'
                    {
                     before(grammarAccess.getDataTypeAccess().getTypeStringKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getDataTypeAccess().getTypeStringKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEntityDsl.g:413:2: ( 'int' )
                    {
                    // InternalEntityDsl.g:413:2: ( 'int' )
                    // InternalEntityDsl.g:414:3: 'int'
                    {
                     before(grammarAccess.getDataTypeAccess().getTypeIntKeyword_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getDataTypeAccess().getTypeIntKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEntityDsl.g:419:2: ( 'double' )
                    {
                    // InternalEntityDsl.g:419:2: ( 'double' )
                    // InternalEntityDsl.g:420:3: 'double'
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
    // InternalEntityDsl.g:429:1: rule__WinFormControlType__Alternatives : ( ( ( rule__WinFormControlType__ControlTypeAssignment_0 ) ) | ( ruleComboBox ) | ( ruleCheckBox ) | ( ruleRadioButtonGroup ) | ( ruleSpinner ) | ( ruleTrackBar ) );
    public final void rule__WinFormControlType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:433:1: ( ( ( rule__WinFormControlType__ControlTypeAssignment_0 ) ) | ( ruleComboBox ) | ( ruleCheckBox ) | ( ruleRadioButtonGroup ) | ( ruleSpinner ) | ( ruleTrackBar ) )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt2=1;
                }
                break;
            case 30:
                {
                alt2=2;
                }
                break;
            case 28:
                {
                alt2=3;
                }
                break;
            case 27:
                {
                alt2=4;
                }
                break;
            case 26:
                {
                alt2=5;
                }
                break;
            case 25:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalEntityDsl.g:434:2: ( ( rule__WinFormControlType__ControlTypeAssignment_0 ) )
                    {
                    // InternalEntityDsl.g:434:2: ( ( rule__WinFormControlType__ControlTypeAssignment_0 ) )
                    // InternalEntityDsl.g:435:3: ( rule__WinFormControlType__ControlTypeAssignment_0 )
                    {
                     before(grammarAccess.getWinFormControlTypeAccess().getControlTypeAssignment_0()); 
                    // InternalEntityDsl.g:436:3: ( rule__WinFormControlType__ControlTypeAssignment_0 )
                    // InternalEntityDsl.g:436:4: rule__WinFormControlType__ControlTypeAssignment_0
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
                    // InternalEntityDsl.g:440:2: ( ruleComboBox )
                    {
                    // InternalEntityDsl.g:440:2: ( ruleComboBox )
                    // InternalEntityDsl.g:441:3: ruleComboBox
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
                    // InternalEntityDsl.g:446:2: ( ruleCheckBox )
                    {
                    // InternalEntityDsl.g:446:2: ( ruleCheckBox )
                    // InternalEntityDsl.g:447:3: ruleCheckBox
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
                    // InternalEntityDsl.g:452:2: ( ruleRadioButtonGroup )
                    {
                    // InternalEntityDsl.g:452:2: ( ruleRadioButtonGroup )
                    // InternalEntityDsl.g:453:3: ruleRadioButtonGroup
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
                    // InternalEntityDsl.g:458:2: ( ruleSpinner )
                    {
                    // InternalEntityDsl.g:458:2: ( ruleSpinner )
                    // InternalEntityDsl.g:459:3: ruleSpinner
                    {
                     before(grammarAccess.getWinFormControlTypeAccess().getSpinnerParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleSpinner();

                    state._fsp--;

                     after(grammarAccess.getWinFormControlTypeAccess().getSpinnerParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalEntityDsl.g:464:2: ( ruleTrackBar )
                    {
                    // InternalEntityDsl.g:464:2: ( ruleTrackBar )
                    // InternalEntityDsl.g:465:3: ruleTrackBar
                    {
                     before(grammarAccess.getWinFormControlTypeAccess().getTrackBarParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleTrackBar();

                    state._fsp--;

                     after(grammarAccess.getWinFormControlTypeAccess().getTrackBarParserRuleCall_5()); 

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
    // InternalEntityDsl.g:474:1: rule__Domainmodel__Group__0 : rule__Domainmodel__Group__0__Impl rule__Domainmodel__Group__1 ;
    public final void rule__Domainmodel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:478:1: ( rule__Domainmodel__Group__0__Impl rule__Domainmodel__Group__1 )
            // InternalEntityDsl.g:479:2: rule__Domainmodel__Group__0__Impl rule__Domainmodel__Group__1
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
    // InternalEntityDsl.g:486:1: rule__Domainmodel__Group__0__Impl : ( 'database:' ) ;
    public final void rule__Domainmodel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:490:1: ( ( 'database:' ) )
            // InternalEntityDsl.g:491:1: ( 'database:' )
            {
            // InternalEntityDsl.g:491:1: ( 'database:' )
            // InternalEntityDsl.g:492:2: 'database:'
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
    // InternalEntityDsl.g:501:1: rule__Domainmodel__Group__1 : rule__Domainmodel__Group__1__Impl rule__Domainmodel__Group__2 ;
    public final void rule__Domainmodel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:505:1: ( rule__Domainmodel__Group__1__Impl rule__Domainmodel__Group__2 )
            // InternalEntityDsl.g:506:2: rule__Domainmodel__Group__1__Impl rule__Domainmodel__Group__2
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
    // InternalEntityDsl.g:513:1: rule__Domainmodel__Group__1__Impl : ( ( rule__Domainmodel__ApplicationNameAssignment_1 ) ) ;
    public final void rule__Domainmodel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:517:1: ( ( ( rule__Domainmodel__ApplicationNameAssignment_1 ) ) )
            // InternalEntityDsl.g:518:1: ( ( rule__Domainmodel__ApplicationNameAssignment_1 ) )
            {
            // InternalEntityDsl.g:518:1: ( ( rule__Domainmodel__ApplicationNameAssignment_1 ) )
            // InternalEntityDsl.g:519:2: ( rule__Domainmodel__ApplicationNameAssignment_1 )
            {
             before(grammarAccess.getDomainmodelAccess().getApplicationNameAssignment_1()); 
            // InternalEntityDsl.g:520:2: ( rule__Domainmodel__ApplicationNameAssignment_1 )
            // InternalEntityDsl.g:520:3: rule__Domainmodel__ApplicationNameAssignment_1
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
    // InternalEntityDsl.g:528:1: rule__Domainmodel__Group__2 : rule__Domainmodel__Group__2__Impl ;
    public final void rule__Domainmodel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:532:1: ( rule__Domainmodel__Group__2__Impl )
            // InternalEntityDsl.g:533:2: rule__Domainmodel__Group__2__Impl
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
    // InternalEntityDsl.g:539:1: rule__Domainmodel__Group__2__Impl : ( ( rule__Domainmodel__ElementsAssignment_2 )* ) ;
    public final void rule__Domainmodel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:543:1: ( ( ( rule__Domainmodel__ElementsAssignment_2 )* ) )
            // InternalEntityDsl.g:544:1: ( ( rule__Domainmodel__ElementsAssignment_2 )* )
            {
            // InternalEntityDsl.g:544:1: ( ( rule__Domainmodel__ElementsAssignment_2 )* )
            // InternalEntityDsl.g:545:2: ( rule__Domainmodel__ElementsAssignment_2 )*
            {
             before(grammarAccess.getDomainmodelAccess().getElementsAssignment_2()); 
            // InternalEntityDsl.g:546:2: ( rule__Domainmodel__ElementsAssignment_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalEntityDsl.g:546:3: rule__Domainmodel__ElementsAssignment_2
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
    // InternalEntityDsl.g:555:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:559:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalEntityDsl.g:560:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
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
    // InternalEntityDsl.g:567:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:571:1: ( ( 'entity' ) )
            // InternalEntityDsl.g:572:1: ( 'entity' )
            {
            // InternalEntityDsl.g:572:1: ( 'entity' )
            // InternalEntityDsl.g:573:2: 'entity'
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
    // InternalEntityDsl.g:582:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:586:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalEntityDsl.g:587:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
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
    // InternalEntityDsl.g:594:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:598:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalEntityDsl.g:599:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalEntityDsl.g:599:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalEntityDsl.g:600:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalEntityDsl.g:601:2: ( rule__Entity__NameAssignment_1 )
            // InternalEntityDsl.g:601:3: rule__Entity__NameAssignment_1
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
    // InternalEntityDsl.g:609:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:613:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalEntityDsl.g:614:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
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
    // InternalEntityDsl.g:621:1: rule__Entity__Group__2__Impl : ( '{' ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:625:1: ( ( '{' ) )
            // InternalEntityDsl.g:626:1: ( '{' )
            {
            // InternalEntityDsl.g:626:1: ( '{' )
            // InternalEntityDsl.g:627:2: '{'
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
    // InternalEntityDsl.g:636:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:640:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalEntityDsl.g:641:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
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
    // InternalEntityDsl.g:648:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__AttributesAssignment_3 )* ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:652:1: ( ( ( rule__Entity__AttributesAssignment_3 )* ) )
            // InternalEntityDsl.g:653:1: ( ( rule__Entity__AttributesAssignment_3 )* )
            {
            // InternalEntityDsl.g:653:1: ( ( rule__Entity__AttributesAssignment_3 )* )
            // InternalEntityDsl.g:654:2: ( rule__Entity__AttributesAssignment_3 )*
            {
             before(grammarAccess.getEntityAccess().getAttributesAssignment_3()); 
            // InternalEntityDsl.g:655:2: ( rule__Entity__AttributesAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID||LA4_0==24) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalEntityDsl.g:655:3: rule__Entity__AttributesAssignment_3
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
    // InternalEntityDsl.g:663:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:667:1: ( rule__Entity__Group__4__Impl )
            // InternalEntityDsl.g:668:2: rule__Entity__Group__4__Impl
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
    // InternalEntityDsl.g:674:1: rule__Entity__Group__4__Impl : ( '}' ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:678:1: ( ( '}' ) )
            // InternalEntityDsl.g:679:1: ( '}' )
            {
            // InternalEntityDsl.g:679:1: ( '}' )
            // InternalEntityDsl.g:680:2: '}'
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
    // InternalEntityDsl.g:690:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:694:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalEntityDsl.g:695:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
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
    // InternalEntityDsl.g:702:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__RequiredAssignment_0 )? ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:706:1: ( ( ( rule__Attribute__RequiredAssignment_0 )? ) )
            // InternalEntityDsl.g:707:1: ( ( rule__Attribute__RequiredAssignment_0 )? )
            {
            // InternalEntityDsl.g:707:1: ( ( rule__Attribute__RequiredAssignment_0 )? )
            // InternalEntityDsl.g:708:2: ( rule__Attribute__RequiredAssignment_0 )?
            {
             before(grammarAccess.getAttributeAccess().getRequiredAssignment_0()); 
            // InternalEntityDsl.g:709:2: ( rule__Attribute__RequiredAssignment_0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalEntityDsl.g:709:3: rule__Attribute__RequiredAssignment_0
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
    // InternalEntityDsl.g:717:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:721:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalEntityDsl.g:722:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
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
    // InternalEntityDsl.g:729:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:733:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalEntityDsl.g:734:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalEntityDsl.g:734:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalEntityDsl.g:735:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalEntityDsl.g:736:2: ( rule__Attribute__NameAssignment_1 )
            // InternalEntityDsl.g:736:3: rule__Attribute__NameAssignment_1
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
    // InternalEntityDsl.g:744:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:748:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalEntityDsl.g:749:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
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
    // InternalEntityDsl.g:756:1: rule__Attribute__Group__2__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:760:1: ( ( ':' ) )
            // InternalEntityDsl.g:761:1: ( ':' )
            {
            // InternalEntityDsl.g:761:1: ( ':' )
            // InternalEntityDsl.g:762:2: ':'
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
    // InternalEntityDsl.g:771:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:775:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // InternalEntityDsl.g:776:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
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
    // InternalEntityDsl.g:783:1: rule__Attribute__Group__3__Impl : ( '[' ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:787:1: ( ( '[' ) )
            // InternalEntityDsl.g:788:1: ( '[' )
            {
            // InternalEntityDsl.g:788:1: ( '[' )
            // InternalEntityDsl.g:789:2: '['
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
    // InternalEntityDsl.g:798:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:802:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
            // InternalEntityDsl.g:803:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
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
    // InternalEntityDsl.g:810:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__InputTypeAssignment_4 ) ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:814:1: ( ( ( rule__Attribute__InputTypeAssignment_4 ) ) )
            // InternalEntityDsl.g:815:1: ( ( rule__Attribute__InputTypeAssignment_4 ) )
            {
            // InternalEntityDsl.g:815:1: ( ( rule__Attribute__InputTypeAssignment_4 ) )
            // InternalEntityDsl.g:816:2: ( rule__Attribute__InputTypeAssignment_4 )
            {
             before(grammarAccess.getAttributeAccess().getInputTypeAssignment_4()); 
            // InternalEntityDsl.g:817:2: ( rule__Attribute__InputTypeAssignment_4 )
            // InternalEntityDsl.g:817:3: rule__Attribute__InputTypeAssignment_4
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
    // InternalEntityDsl.g:825:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl rule__Attribute__Group__6 ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:829:1: ( rule__Attribute__Group__5__Impl rule__Attribute__Group__6 )
            // InternalEntityDsl.g:830:2: rule__Attribute__Group__5__Impl rule__Attribute__Group__6
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
    // InternalEntityDsl.g:837:1: rule__Attribute__Group__5__Impl : ( ',' ) ;
    public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:841:1: ( ( ',' ) )
            // InternalEntityDsl.g:842:1: ( ',' )
            {
            // InternalEntityDsl.g:842:1: ( ',' )
            // InternalEntityDsl.g:843:2: ','
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
    // InternalEntityDsl.g:852:1: rule__Attribute__Group__6 : rule__Attribute__Group__6__Impl rule__Attribute__Group__7 ;
    public final void rule__Attribute__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:856:1: ( rule__Attribute__Group__6__Impl rule__Attribute__Group__7 )
            // InternalEntityDsl.g:857:2: rule__Attribute__Group__6__Impl rule__Attribute__Group__7
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
    // InternalEntityDsl.g:864:1: rule__Attribute__Group__6__Impl : ( ( rule__Attribute__LabelTextAssignment_6 ) ) ;
    public final void rule__Attribute__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:868:1: ( ( ( rule__Attribute__LabelTextAssignment_6 ) ) )
            // InternalEntityDsl.g:869:1: ( ( rule__Attribute__LabelTextAssignment_6 ) )
            {
            // InternalEntityDsl.g:869:1: ( ( rule__Attribute__LabelTextAssignment_6 ) )
            // InternalEntityDsl.g:870:2: ( rule__Attribute__LabelTextAssignment_6 )
            {
             before(grammarAccess.getAttributeAccess().getLabelTextAssignment_6()); 
            // InternalEntityDsl.g:871:2: ( rule__Attribute__LabelTextAssignment_6 )
            // InternalEntityDsl.g:871:3: rule__Attribute__LabelTextAssignment_6
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
    // InternalEntityDsl.g:879:1: rule__Attribute__Group__7 : rule__Attribute__Group__7__Impl ;
    public final void rule__Attribute__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:883:1: ( rule__Attribute__Group__7__Impl )
            // InternalEntityDsl.g:884:2: rule__Attribute__Group__7__Impl
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
    // InternalEntityDsl.g:890:1: rule__Attribute__Group__7__Impl : ( ']' ) ;
    public final void rule__Attribute__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:894:1: ( ( ']' ) )
            // InternalEntityDsl.g:895:1: ( ']' )
            {
            // InternalEntityDsl.g:895:1: ( ']' )
            // InternalEntityDsl.g:896:2: ']'
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


    // $ANTLR start "rule__TrackBar__Group__0"
    // InternalEntityDsl.g:906:1: rule__TrackBar__Group__0 : rule__TrackBar__Group__0__Impl rule__TrackBar__Group__1 ;
    public final void rule__TrackBar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:910:1: ( rule__TrackBar__Group__0__Impl rule__TrackBar__Group__1 )
            // InternalEntityDsl.g:911:2: rule__TrackBar__Group__0__Impl rule__TrackBar__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__TrackBar__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrackBar__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrackBar__Group__0"


    // $ANTLR start "rule__TrackBar__Group__0__Impl"
    // InternalEntityDsl.g:918:1: rule__TrackBar__Group__0__Impl : ( ( rule__TrackBar__NameAssignment_0 ) ) ;
    public final void rule__TrackBar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:922:1: ( ( ( rule__TrackBar__NameAssignment_0 ) ) )
            // InternalEntityDsl.g:923:1: ( ( rule__TrackBar__NameAssignment_0 ) )
            {
            // InternalEntityDsl.g:923:1: ( ( rule__TrackBar__NameAssignment_0 ) )
            // InternalEntityDsl.g:924:2: ( rule__TrackBar__NameAssignment_0 )
            {
             before(grammarAccess.getTrackBarAccess().getNameAssignment_0()); 
            // InternalEntityDsl.g:925:2: ( rule__TrackBar__NameAssignment_0 )
            // InternalEntityDsl.g:925:3: rule__TrackBar__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TrackBar__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTrackBarAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrackBar__Group__0__Impl"


    // $ANTLR start "rule__TrackBar__Group__1"
    // InternalEntityDsl.g:933:1: rule__TrackBar__Group__1 : rule__TrackBar__Group__1__Impl rule__TrackBar__Group__2 ;
    public final void rule__TrackBar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:937:1: ( rule__TrackBar__Group__1__Impl rule__TrackBar__Group__2 )
            // InternalEntityDsl.g:938:2: rule__TrackBar__Group__1__Impl rule__TrackBar__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__TrackBar__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrackBar__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrackBar__Group__1"


    // $ANTLR start "rule__TrackBar__Group__1__Impl"
    // InternalEntityDsl.g:945:1: rule__TrackBar__Group__1__Impl : ( '[' ) ;
    public final void rule__TrackBar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:949:1: ( ( '[' ) )
            // InternalEntityDsl.g:950:1: ( '[' )
            {
            // InternalEntityDsl.g:950:1: ( '[' )
            // InternalEntityDsl.g:951:2: '['
            {
             before(grammarAccess.getTrackBarAccess().getLeftSquareBracketKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTrackBarAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrackBar__Group__1__Impl"


    // $ANTLR start "rule__TrackBar__Group__2"
    // InternalEntityDsl.g:960:1: rule__TrackBar__Group__2 : rule__TrackBar__Group__2__Impl rule__TrackBar__Group__3 ;
    public final void rule__TrackBar__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:964:1: ( rule__TrackBar__Group__2__Impl rule__TrackBar__Group__3 )
            // InternalEntityDsl.g:965:2: rule__TrackBar__Group__2__Impl rule__TrackBar__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__TrackBar__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrackBar__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrackBar__Group__2"


    // $ANTLR start "rule__TrackBar__Group__2__Impl"
    // InternalEntityDsl.g:972:1: rule__TrackBar__Group__2__Impl : ( ( rule__TrackBar__DataTypeAssignment_2 ) ) ;
    public final void rule__TrackBar__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:976:1: ( ( ( rule__TrackBar__DataTypeAssignment_2 ) ) )
            // InternalEntityDsl.g:977:1: ( ( rule__TrackBar__DataTypeAssignment_2 ) )
            {
            // InternalEntityDsl.g:977:1: ( ( rule__TrackBar__DataTypeAssignment_2 ) )
            // InternalEntityDsl.g:978:2: ( rule__TrackBar__DataTypeAssignment_2 )
            {
             before(grammarAccess.getTrackBarAccess().getDataTypeAssignment_2()); 
            // InternalEntityDsl.g:979:2: ( rule__TrackBar__DataTypeAssignment_2 )
            // InternalEntityDsl.g:979:3: rule__TrackBar__DataTypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TrackBar__DataTypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTrackBarAccess().getDataTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrackBar__Group__2__Impl"


    // $ANTLR start "rule__TrackBar__Group__3"
    // InternalEntityDsl.g:987:1: rule__TrackBar__Group__3 : rule__TrackBar__Group__3__Impl rule__TrackBar__Group__4 ;
    public final void rule__TrackBar__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:991:1: ( rule__TrackBar__Group__3__Impl rule__TrackBar__Group__4 )
            // InternalEntityDsl.g:992:2: rule__TrackBar__Group__3__Impl rule__TrackBar__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__TrackBar__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrackBar__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrackBar__Group__3"


    // $ANTLR start "rule__TrackBar__Group__3__Impl"
    // InternalEntityDsl.g:999:1: rule__TrackBar__Group__3__Impl : ( ',' ) ;
    public final void rule__TrackBar__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1003:1: ( ( ',' ) )
            // InternalEntityDsl.g:1004:1: ( ',' )
            {
            // InternalEntityDsl.g:1004:1: ( ',' )
            // InternalEntityDsl.g:1005:2: ','
            {
             before(grammarAccess.getTrackBarAccess().getCommaKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTrackBarAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrackBar__Group__3__Impl"


    // $ANTLR start "rule__TrackBar__Group__4"
    // InternalEntityDsl.g:1014:1: rule__TrackBar__Group__4 : rule__TrackBar__Group__4__Impl rule__TrackBar__Group__5 ;
    public final void rule__TrackBar__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1018:1: ( rule__TrackBar__Group__4__Impl rule__TrackBar__Group__5 )
            // InternalEntityDsl.g:1019:2: rule__TrackBar__Group__4__Impl rule__TrackBar__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__TrackBar__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrackBar__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrackBar__Group__4"


    // $ANTLR start "rule__TrackBar__Group__4__Impl"
    // InternalEntityDsl.g:1026:1: rule__TrackBar__Group__4__Impl : ( ( rule__TrackBar__DefaultTickAssignment_4 ) ) ;
    public final void rule__TrackBar__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1030:1: ( ( ( rule__TrackBar__DefaultTickAssignment_4 ) ) )
            // InternalEntityDsl.g:1031:1: ( ( rule__TrackBar__DefaultTickAssignment_4 ) )
            {
            // InternalEntityDsl.g:1031:1: ( ( rule__TrackBar__DefaultTickAssignment_4 ) )
            // InternalEntityDsl.g:1032:2: ( rule__TrackBar__DefaultTickAssignment_4 )
            {
             before(grammarAccess.getTrackBarAccess().getDefaultTickAssignment_4()); 
            // InternalEntityDsl.g:1033:2: ( rule__TrackBar__DefaultTickAssignment_4 )
            // InternalEntityDsl.g:1033:3: rule__TrackBar__DefaultTickAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__TrackBar__DefaultTickAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTrackBarAccess().getDefaultTickAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrackBar__Group__4__Impl"


    // $ANTLR start "rule__TrackBar__Group__5"
    // InternalEntityDsl.g:1041:1: rule__TrackBar__Group__5 : rule__TrackBar__Group__5__Impl rule__TrackBar__Group__6 ;
    public final void rule__TrackBar__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1045:1: ( rule__TrackBar__Group__5__Impl rule__TrackBar__Group__6 )
            // InternalEntityDsl.g:1046:2: rule__TrackBar__Group__5__Impl rule__TrackBar__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__TrackBar__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrackBar__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrackBar__Group__5"


    // $ANTLR start "rule__TrackBar__Group__5__Impl"
    // InternalEntityDsl.g:1053:1: rule__TrackBar__Group__5__Impl : ( ',' ) ;
    public final void rule__TrackBar__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1057:1: ( ( ',' ) )
            // InternalEntityDsl.g:1058:1: ( ',' )
            {
            // InternalEntityDsl.g:1058:1: ( ',' )
            // InternalEntityDsl.g:1059:2: ','
            {
             before(grammarAccess.getTrackBarAccess().getCommaKeyword_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTrackBarAccess().getCommaKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrackBar__Group__5__Impl"


    // $ANTLR start "rule__TrackBar__Group__6"
    // InternalEntityDsl.g:1068:1: rule__TrackBar__Group__6 : rule__TrackBar__Group__6__Impl rule__TrackBar__Group__7 ;
    public final void rule__TrackBar__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1072:1: ( rule__TrackBar__Group__6__Impl rule__TrackBar__Group__7 )
            // InternalEntityDsl.g:1073:2: rule__TrackBar__Group__6__Impl rule__TrackBar__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__TrackBar__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrackBar__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrackBar__Group__6"


    // $ANTLR start "rule__TrackBar__Group__6__Impl"
    // InternalEntityDsl.g:1080:1: rule__TrackBar__Group__6__Impl : ( ( rule__TrackBar__IncrementAssignment_6 ) ) ;
    public final void rule__TrackBar__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1084:1: ( ( ( rule__TrackBar__IncrementAssignment_6 ) ) )
            // InternalEntityDsl.g:1085:1: ( ( rule__TrackBar__IncrementAssignment_6 ) )
            {
            // InternalEntityDsl.g:1085:1: ( ( rule__TrackBar__IncrementAssignment_6 ) )
            // InternalEntityDsl.g:1086:2: ( rule__TrackBar__IncrementAssignment_6 )
            {
             before(grammarAccess.getTrackBarAccess().getIncrementAssignment_6()); 
            // InternalEntityDsl.g:1087:2: ( rule__TrackBar__IncrementAssignment_6 )
            // InternalEntityDsl.g:1087:3: rule__TrackBar__IncrementAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__TrackBar__IncrementAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getTrackBarAccess().getIncrementAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrackBar__Group__6__Impl"


    // $ANTLR start "rule__TrackBar__Group__7"
    // InternalEntityDsl.g:1095:1: rule__TrackBar__Group__7 : rule__TrackBar__Group__7__Impl rule__TrackBar__Group__8 ;
    public final void rule__TrackBar__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1099:1: ( rule__TrackBar__Group__7__Impl rule__TrackBar__Group__8 )
            // InternalEntityDsl.g:1100:2: rule__TrackBar__Group__7__Impl rule__TrackBar__Group__8
            {
            pushFollow(FOLLOW_18);
            rule__TrackBar__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrackBar__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrackBar__Group__7"


    // $ANTLR start "rule__TrackBar__Group__7__Impl"
    // InternalEntityDsl.g:1107:1: rule__TrackBar__Group__7__Impl : ( ',' ) ;
    public final void rule__TrackBar__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1111:1: ( ( ',' ) )
            // InternalEntityDsl.g:1112:1: ( ',' )
            {
            // InternalEntityDsl.g:1112:1: ( ',' )
            // InternalEntityDsl.g:1113:2: ','
            {
             before(grammarAccess.getTrackBarAccess().getCommaKeyword_7()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTrackBarAccess().getCommaKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrackBar__Group__7__Impl"


    // $ANTLR start "rule__TrackBar__Group__8"
    // InternalEntityDsl.g:1122:1: rule__TrackBar__Group__8 : rule__TrackBar__Group__8__Impl rule__TrackBar__Group__9 ;
    public final void rule__TrackBar__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1126:1: ( rule__TrackBar__Group__8__Impl rule__TrackBar__Group__9 )
            // InternalEntityDsl.g:1127:2: rule__TrackBar__Group__8__Impl rule__TrackBar__Group__9
            {
            pushFollow(FOLLOW_18);
            rule__TrackBar__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrackBar__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrackBar__Group__8"


    // $ANTLR start "rule__TrackBar__Group__8__Impl"
    // InternalEntityDsl.g:1134:1: rule__TrackBar__Group__8__Impl : ( ( rule__TrackBar__Group_8__0 )? ) ;
    public final void rule__TrackBar__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1138:1: ( ( ( rule__TrackBar__Group_8__0 )? ) )
            // InternalEntityDsl.g:1139:1: ( ( rule__TrackBar__Group_8__0 )? )
            {
            // InternalEntityDsl.g:1139:1: ( ( rule__TrackBar__Group_8__0 )? )
            // InternalEntityDsl.g:1140:2: ( rule__TrackBar__Group_8__0 )?
            {
             before(grammarAccess.getTrackBarAccess().getGroup_8()); 
            // InternalEntityDsl.g:1141:2: ( rule__TrackBar__Group_8__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalEntityDsl.g:1141:3: rule__TrackBar__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TrackBar__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTrackBarAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrackBar__Group__8__Impl"


    // $ANTLR start "rule__TrackBar__Group__9"
    // InternalEntityDsl.g:1149:1: rule__TrackBar__Group__9 : rule__TrackBar__Group__9__Impl rule__TrackBar__Group__10 ;
    public final void rule__TrackBar__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1153:1: ( rule__TrackBar__Group__9__Impl rule__TrackBar__Group__10 )
            // InternalEntityDsl.g:1154:2: rule__TrackBar__Group__9__Impl rule__TrackBar__Group__10
            {
            pushFollow(FOLLOW_17);
            rule__TrackBar__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrackBar__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrackBar__Group__9"


    // $ANTLR start "rule__TrackBar__Group__9__Impl"
    // InternalEntityDsl.g:1161:1: rule__TrackBar__Group__9__Impl : ( '(' ) ;
    public final void rule__TrackBar__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1165:1: ( ( '(' ) )
            // InternalEntityDsl.g:1166:1: ( '(' )
            {
            // InternalEntityDsl.g:1166:1: ( '(' )
            // InternalEntityDsl.g:1167:2: '('
            {
             before(grammarAccess.getTrackBarAccess().getLeftParenthesisKeyword_9()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTrackBarAccess().getLeftParenthesisKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrackBar__Group__9__Impl"


    // $ANTLR start "rule__TrackBar__Group__10"
    // InternalEntityDsl.g:1176:1: rule__TrackBar__Group__10 : rule__TrackBar__Group__10__Impl rule__TrackBar__Group__11 ;
    public final void rule__TrackBar__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1180:1: ( rule__TrackBar__Group__10__Impl rule__TrackBar__Group__11 )
            // InternalEntityDsl.g:1181:2: rule__TrackBar__Group__10__Impl rule__TrackBar__Group__11
            {
            pushFollow(FOLLOW_13);
            rule__TrackBar__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrackBar__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrackBar__Group__10"


    // $ANTLR start "rule__TrackBar__Group__10__Impl"
    // InternalEntityDsl.g:1188:1: rule__TrackBar__Group__10__Impl : ( ( rule__TrackBar__MinimumValueAssignment_10 ) ) ;
    public final void rule__TrackBar__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1192:1: ( ( ( rule__TrackBar__MinimumValueAssignment_10 ) ) )
            // InternalEntityDsl.g:1193:1: ( ( rule__TrackBar__MinimumValueAssignment_10 ) )
            {
            // InternalEntityDsl.g:1193:1: ( ( rule__TrackBar__MinimumValueAssignment_10 ) )
            // InternalEntityDsl.g:1194:2: ( rule__TrackBar__MinimumValueAssignment_10 )
            {
             before(grammarAccess.getTrackBarAccess().getMinimumValueAssignment_10()); 
            // InternalEntityDsl.g:1195:2: ( rule__TrackBar__MinimumValueAssignment_10 )
            // InternalEntityDsl.g:1195:3: rule__TrackBar__MinimumValueAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__TrackBar__MinimumValueAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getTrackBarAccess().getMinimumValueAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrackBar__Group__10__Impl"


    // $ANTLR start "rule__TrackBar__Group__11"
    // InternalEntityDsl.g:1203:1: rule__TrackBar__Group__11 : rule__TrackBar__Group__11__Impl rule__TrackBar__Group__12 ;
    public final void rule__TrackBar__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1207:1: ( rule__TrackBar__Group__11__Impl rule__TrackBar__Group__12 )
            // InternalEntityDsl.g:1208:2: rule__TrackBar__Group__11__Impl rule__TrackBar__Group__12
            {
            pushFollow(FOLLOW_17);
            rule__TrackBar__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrackBar__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrackBar__Group__11"


    // $ANTLR start "rule__TrackBar__Group__11__Impl"
    // InternalEntityDsl.g:1215:1: rule__TrackBar__Group__11__Impl : ( ',' ) ;
    public final void rule__TrackBar__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1219:1: ( ( ',' ) )
            // InternalEntityDsl.g:1220:1: ( ',' )
            {
            // InternalEntityDsl.g:1220:1: ( ',' )
            // InternalEntityDsl.g:1221:2: ','
            {
             before(grammarAccess.getTrackBarAccess().getCommaKeyword_11()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTrackBarAccess().getCommaKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrackBar__Group__11__Impl"


    // $ANTLR start "rule__TrackBar__Group__12"
    // InternalEntityDsl.g:1230:1: rule__TrackBar__Group__12 : rule__TrackBar__Group__12__Impl rule__TrackBar__Group__13 ;
    public final void rule__TrackBar__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1234:1: ( rule__TrackBar__Group__12__Impl rule__TrackBar__Group__13 )
            // InternalEntityDsl.g:1235:2: rule__TrackBar__Group__12__Impl rule__TrackBar__Group__13
            {
            pushFollow(FOLLOW_19);
            rule__TrackBar__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrackBar__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrackBar__Group__12"


    // $ANTLR start "rule__TrackBar__Group__12__Impl"
    // InternalEntityDsl.g:1242:1: rule__TrackBar__Group__12__Impl : ( ( rule__TrackBar__MaximumValueAssignment_12 ) ) ;
    public final void rule__TrackBar__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1246:1: ( ( ( rule__TrackBar__MaximumValueAssignment_12 ) ) )
            // InternalEntityDsl.g:1247:1: ( ( rule__TrackBar__MaximumValueAssignment_12 ) )
            {
            // InternalEntityDsl.g:1247:1: ( ( rule__TrackBar__MaximumValueAssignment_12 ) )
            // InternalEntityDsl.g:1248:2: ( rule__TrackBar__MaximumValueAssignment_12 )
            {
             before(grammarAccess.getTrackBarAccess().getMaximumValueAssignment_12()); 
            // InternalEntityDsl.g:1249:2: ( rule__TrackBar__MaximumValueAssignment_12 )
            // InternalEntityDsl.g:1249:3: rule__TrackBar__MaximumValueAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__TrackBar__MaximumValueAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getTrackBarAccess().getMaximumValueAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrackBar__Group__12__Impl"


    // $ANTLR start "rule__TrackBar__Group__13"
    // InternalEntityDsl.g:1257:1: rule__TrackBar__Group__13 : rule__TrackBar__Group__13__Impl rule__TrackBar__Group__14 ;
    public final void rule__TrackBar__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1261:1: ( rule__TrackBar__Group__13__Impl rule__TrackBar__Group__14 )
            // InternalEntityDsl.g:1262:2: rule__TrackBar__Group__13__Impl rule__TrackBar__Group__14
            {
            pushFollow(FOLLOW_20);
            rule__TrackBar__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrackBar__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrackBar__Group__13"


    // $ANTLR start "rule__TrackBar__Group__13__Impl"
    // InternalEntityDsl.g:1269:1: rule__TrackBar__Group__13__Impl : ( ')' ) ;
    public final void rule__TrackBar__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1273:1: ( ( ')' ) )
            // InternalEntityDsl.g:1274:1: ( ')' )
            {
            // InternalEntityDsl.g:1274:1: ( ')' )
            // InternalEntityDsl.g:1275:2: ')'
            {
             before(grammarAccess.getTrackBarAccess().getRightParenthesisKeyword_13()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTrackBarAccess().getRightParenthesisKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrackBar__Group__13__Impl"


    // $ANTLR start "rule__TrackBar__Group__14"
    // InternalEntityDsl.g:1284:1: rule__TrackBar__Group__14 : rule__TrackBar__Group__14__Impl rule__TrackBar__Group__15 ;
    public final void rule__TrackBar__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1288:1: ( rule__TrackBar__Group__14__Impl rule__TrackBar__Group__15 )
            // InternalEntityDsl.g:1289:2: rule__TrackBar__Group__14__Impl rule__TrackBar__Group__15
            {
            pushFollow(FOLLOW_20);
            rule__TrackBar__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrackBar__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrackBar__Group__14"


    // $ANTLR start "rule__TrackBar__Group__14__Impl"
    // InternalEntityDsl.g:1296:1: rule__TrackBar__Group__14__Impl : ( ( rule__TrackBar__Group_14__0 )? ) ;
    public final void rule__TrackBar__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1300:1: ( ( ( rule__TrackBar__Group_14__0 )? ) )
            // InternalEntityDsl.g:1301:1: ( ( rule__TrackBar__Group_14__0 )? )
            {
            // InternalEntityDsl.g:1301:1: ( ( rule__TrackBar__Group_14__0 )? )
            // InternalEntityDsl.g:1302:2: ( rule__TrackBar__Group_14__0 )?
            {
             before(grammarAccess.getTrackBarAccess().getGroup_14()); 
            // InternalEntityDsl.g:1303:2: ( rule__TrackBar__Group_14__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalEntityDsl.g:1303:3: rule__TrackBar__Group_14__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TrackBar__Group_14__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTrackBarAccess().getGroup_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrackBar__Group__14__Impl"


    // $ANTLR start "rule__TrackBar__Group__15"
    // InternalEntityDsl.g:1311:1: rule__TrackBar__Group__15 : rule__TrackBar__Group__15__Impl ;
    public final void rule__TrackBar__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1315:1: ( rule__TrackBar__Group__15__Impl )
            // InternalEntityDsl.g:1316:2: rule__TrackBar__Group__15__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TrackBar__Group__15__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrackBar__Group__15"


    // $ANTLR start "rule__TrackBar__Group__15__Impl"
    // InternalEntityDsl.g:1322:1: rule__TrackBar__Group__15__Impl : ( ']' ) ;
    public final void rule__TrackBar__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1326:1: ( ( ']' ) )
            // InternalEntityDsl.g:1327:1: ( ']' )
            {
            // InternalEntityDsl.g:1327:1: ( ']' )
            // InternalEntityDsl.g:1328:2: ']'
            {
             before(grammarAccess.getTrackBarAccess().getRightSquareBracketKeyword_15()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTrackBarAccess().getRightSquareBracketKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrackBar__Group__15__Impl"


    // $ANTLR start "rule__TrackBar__Group_8__0"
    // InternalEntityDsl.g:1338:1: rule__TrackBar__Group_8__0 : rule__TrackBar__Group_8__0__Impl rule__TrackBar__Group_8__1 ;
    public final void rule__TrackBar__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1342:1: ( rule__TrackBar__Group_8__0__Impl rule__TrackBar__Group_8__1 )
            // InternalEntityDsl.g:1343:2: rule__TrackBar__Group_8__0__Impl rule__TrackBar__Group_8__1
            {
            pushFollow(FOLLOW_13);
            rule__TrackBar__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrackBar__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrackBar__Group_8__0"


    // $ANTLR start "rule__TrackBar__Group_8__0__Impl"
    // InternalEntityDsl.g:1350:1: rule__TrackBar__Group_8__0__Impl : ( ( rule__TrackBar__DenominatorAssignment_8_0 ) ) ;
    public final void rule__TrackBar__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1354:1: ( ( ( rule__TrackBar__DenominatorAssignment_8_0 ) ) )
            // InternalEntityDsl.g:1355:1: ( ( rule__TrackBar__DenominatorAssignment_8_0 ) )
            {
            // InternalEntityDsl.g:1355:1: ( ( rule__TrackBar__DenominatorAssignment_8_0 ) )
            // InternalEntityDsl.g:1356:2: ( rule__TrackBar__DenominatorAssignment_8_0 )
            {
             before(grammarAccess.getTrackBarAccess().getDenominatorAssignment_8_0()); 
            // InternalEntityDsl.g:1357:2: ( rule__TrackBar__DenominatorAssignment_8_0 )
            // InternalEntityDsl.g:1357:3: rule__TrackBar__DenominatorAssignment_8_0
            {
            pushFollow(FOLLOW_2);
            rule__TrackBar__DenominatorAssignment_8_0();

            state._fsp--;


            }

             after(grammarAccess.getTrackBarAccess().getDenominatorAssignment_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrackBar__Group_8__0__Impl"


    // $ANTLR start "rule__TrackBar__Group_8__1"
    // InternalEntityDsl.g:1365:1: rule__TrackBar__Group_8__1 : rule__TrackBar__Group_8__1__Impl ;
    public final void rule__TrackBar__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1369:1: ( rule__TrackBar__Group_8__1__Impl )
            // InternalEntityDsl.g:1370:2: rule__TrackBar__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TrackBar__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrackBar__Group_8__1"


    // $ANTLR start "rule__TrackBar__Group_8__1__Impl"
    // InternalEntityDsl.g:1376:1: rule__TrackBar__Group_8__1__Impl : ( ',' ) ;
    public final void rule__TrackBar__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1380:1: ( ( ',' ) )
            // InternalEntityDsl.g:1381:1: ( ',' )
            {
            // InternalEntityDsl.g:1381:1: ( ',' )
            // InternalEntityDsl.g:1382:2: ','
            {
             before(grammarAccess.getTrackBarAccess().getCommaKeyword_8_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTrackBarAccess().getCommaKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrackBar__Group_8__1__Impl"


    // $ANTLR start "rule__TrackBar__Group_14__0"
    // InternalEntityDsl.g:1392:1: rule__TrackBar__Group_14__0 : rule__TrackBar__Group_14__0__Impl rule__TrackBar__Group_14__1 ;
    public final void rule__TrackBar__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1396:1: ( rule__TrackBar__Group_14__0__Impl rule__TrackBar__Group_14__1 )
            // InternalEntityDsl.g:1397:2: rule__TrackBar__Group_14__0__Impl rule__TrackBar__Group_14__1
            {
            pushFollow(FOLLOW_21);
            rule__TrackBar__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrackBar__Group_14__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrackBar__Group_14__0"


    // $ANTLR start "rule__TrackBar__Group_14__0__Impl"
    // InternalEntityDsl.g:1404:1: rule__TrackBar__Group_14__0__Impl : ( '(' ) ;
    public final void rule__TrackBar__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1408:1: ( ( '(' ) )
            // InternalEntityDsl.g:1409:1: ( '(' )
            {
            // InternalEntityDsl.g:1409:1: ( '(' )
            // InternalEntityDsl.g:1410:2: '('
            {
             before(grammarAccess.getTrackBarAccess().getLeftParenthesisKeyword_14_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTrackBarAccess().getLeftParenthesisKeyword_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrackBar__Group_14__0__Impl"


    // $ANTLR start "rule__TrackBar__Group_14__1"
    // InternalEntityDsl.g:1419:1: rule__TrackBar__Group_14__1 : rule__TrackBar__Group_14__1__Impl rule__TrackBar__Group_14__2 ;
    public final void rule__TrackBar__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1423:1: ( rule__TrackBar__Group_14__1__Impl rule__TrackBar__Group_14__2 )
            // InternalEntityDsl.g:1424:2: rule__TrackBar__Group_14__1__Impl rule__TrackBar__Group_14__2
            {
            pushFollow(FOLLOW_21);
            rule__TrackBar__Group_14__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrackBar__Group_14__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrackBar__Group_14__1"


    // $ANTLR start "rule__TrackBar__Group_14__1__Impl"
    // InternalEntityDsl.g:1431:1: rule__TrackBar__Group_14__1__Impl : ( ( rule__TrackBar__StringValuesAssignment_14_1 )* ) ;
    public final void rule__TrackBar__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1435:1: ( ( ( rule__TrackBar__StringValuesAssignment_14_1 )* ) )
            // InternalEntityDsl.g:1436:1: ( ( rule__TrackBar__StringValuesAssignment_14_1 )* )
            {
            // InternalEntityDsl.g:1436:1: ( ( rule__TrackBar__StringValuesAssignment_14_1 )* )
            // InternalEntityDsl.g:1437:2: ( rule__TrackBar__StringValuesAssignment_14_1 )*
            {
             before(grammarAccess.getTrackBarAccess().getStringValuesAssignment_14_1()); 
            // InternalEntityDsl.g:1438:2: ( rule__TrackBar__StringValuesAssignment_14_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_STRING) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalEntityDsl.g:1438:3: rule__TrackBar__StringValuesAssignment_14_1
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__TrackBar__StringValuesAssignment_14_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getTrackBarAccess().getStringValuesAssignment_14_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrackBar__Group_14__1__Impl"


    // $ANTLR start "rule__TrackBar__Group_14__2"
    // InternalEntityDsl.g:1446:1: rule__TrackBar__Group_14__2 : rule__TrackBar__Group_14__2__Impl ;
    public final void rule__TrackBar__Group_14__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1450:1: ( rule__TrackBar__Group_14__2__Impl )
            // InternalEntityDsl.g:1451:2: rule__TrackBar__Group_14__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TrackBar__Group_14__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrackBar__Group_14__2"


    // $ANTLR start "rule__TrackBar__Group_14__2__Impl"
    // InternalEntityDsl.g:1457:1: rule__TrackBar__Group_14__2__Impl : ( ')' ) ;
    public final void rule__TrackBar__Group_14__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1461:1: ( ( ')' ) )
            // InternalEntityDsl.g:1462:1: ( ')' )
            {
            // InternalEntityDsl.g:1462:1: ( ')' )
            // InternalEntityDsl.g:1463:2: ')'
            {
             before(grammarAccess.getTrackBarAccess().getRightParenthesisKeyword_14_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTrackBarAccess().getRightParenthesisKeyword_14_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrackBar__Group_14__2__Impl"


    // $ANTLR start "rule__Spinner__Group__0"
    // InternalEntityDsl.g:1473:1: rule__Spinner__Group__0 : rule__Spinner__Group__0__Impl rule__Spinner__Group__1 ;
    public final void rule__Spinner__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1477:1: ( rule__Spinner__Group__0__Impl rule__Spinner__Group__1 )
            // InternalEntityDsl.g:1478:2: rule__Spinner__Group__0__Impl rule__Spinner__Group__1
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
    // InternalEntityDsl.g:1485:1: rule__Spinner__Group__0__Impl : ( ( rule__Spinner__NameAssignment_0 ) ) ;
    public final void rule__Spinner__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1489:1: ( ( ( rule__Spinner__NameAssignment_0 ) ) )
            // InternalEntityDsl.g:1490:1: ( ( rule__Spinner__NameAssignment_0 ) )
            {
            // InternalEntityDsl.g:1490:1: ( ( rule__Spinner__NameAssignment_0 ) )
            // InternalEntityDsl.g:1491:2: ( rule__Spinner__NameAssignment_0 )
            {
             before(grammarAccess.getSpinnerAccess().getNameAssignment_0()); 
            // InternalEntityDsl.g:1492:2: ( rule__Spinner__NameAssignment_0 )
            // InternalEntityDsl.g:1492:3: rule__Spinner__NameAssignment_0
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
    // InternalEntityDsl.g:1500:1: rule__Spinner__Group__1 : rule__Spinner__Group__1__Impl rule__Spinner__Group__2 ;
    public final void rule__Spinner__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1504:1: ( rule__Spinner__Group__1__Impl rule__Spinner__Group__2 )
            // InternalEntityDsl.g:1505:2: rule__Spinner__Group__1__Impl rule__Spinner__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalEntityDsl.g:1512:1: rule__Spinner__Group__1__Impl : ( '[' ) ;
    public final void rule__Spinner__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1516:1: ( ( '[' ) )
            // InternalEntityDsl.g:1517:1: ( '[' )
            {
            // InternalEntityDsl.g:1517:1: ( '[' )
            // InternalEntityDsl.g:1518:2: '['
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
    // InternalEntityDsl.g:1527:1: rule__Spinner__Group__2 : rule__Spinner__Group__2__Impl rule__Spinner__Group__3 ;
    public final void rule__Spinner__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1531:1: ( rule__Spinner__Group__2__Impl rule__Spinner__Group__3 )
            // InternalEntityDsl.g:1532:2: rule__Spinner__Group__2__Impl rule__Spinner__Group__3
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
    // InternalEntityDsl.g:1539:1: rule__Spinner__Group__2__Impl : ( ( rule__Spinner__DefaultValueAssignment_2 ) ) ;
    public final void rule__Spinner__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1543:1: ( ( ( rule__Spinner__DefaultValueAssignment_2 ) ) )
            // InternalEntityDsl.g:1544:1: ( ( rule__Spinner__DefaultValueAssignment_2 ) )
            {
            // InternalEntityDsl.g:1544:1: ( ( rule__Spinner__DefaultValueAssignment_2 ) )
            // InternalEntityDsl.g:1545:2: ( rule__Spinner__DefaultValueAssignment_2 )
            {
             before(grammarAccess.getSpinnerAccess().getDefaultValueAssignment_2()); 
            // InternalEntityDsl.g:1546:2: ( rule__Spinner__DefaultValueAssignment_2 )
            // InternalEntityDsl.g:1546:3: rule__Spinner__DefaultValueAssignment_2
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
    // InternalEntityDsl.g:1554:1: rule__Spinner__Group__3 : rule__Spinner__Group__3__Impl rule__Spinner__Group__4 ;
    public final void rule__Spinner__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1558:1: ( rule__Spinner__Group__3__Impl rule__Spinner__Group__4 )
            // InternalEntityDsl.g:1559:2: rule__Spinner__Group__3__Impl rule__Spinner__Group__4
            {
            pushFollow(FOLLOW_23);
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
    // InternalEntityDsl.g:1566:1: rule__Spinner__Group__3__Impl : ( ',' ) ;
    public final void rule__Spinner__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1570:1: ( ( ',' ) )
            // InternalEntityDsl.g:1571:1: ( ',' )
            {
            // InternalEntityDsl.g:1571:1: ( ',' )
            // InternalEntityDsl.g:1572:2: ','
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
    // InternalEntityDsl.g:1581:1: rule__Spinner__Group__4 : rule__Spinner__Group__4__Impl rule__Spinner__Group__5 ;
    public final void rule__Spinner__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1585:1: ( rule__Spinner__Group__4__Impl rule__Spinner__Group__5 )
            // InternalEntityDsl.g:1586:2: rule__Spinner__Group__4__Impl rule__Spinner__Group__5
            {
            pushFollow(FOLLOW_17);
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
    // InternalEntityDsl.g:1593:1: rule__Spinner__Group__4__Impl : ( '(' ) ;
    public final void rule__Spinner__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1597:1: ( ( '(' ) )
            // InternalEntityDsl.g:1598:1: ( '(' )
            {
            // InternalEntityDsl.g:1598:1: ( '(' )
            // InternalEntityDsl.g:1599:2: '('
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
    // InternalEntityDsl.g:1608:1: rule__Spinner__Group__5 : rule__Spinner__Group__5__Impl rule__Spinner__Group__6 ;
    public final void rule__Spinner__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1612:1: ( rule__Spinner__Group__5__Impl rule__Spinner__Group__6 )
            // InternalEntityDsl.g:1613:2: rule__Spinner__Group__5__Impl rule__Spinner__Group__6
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
    // InternalEntityDsl.g:1620:1: rule__Spinner__Group__5__Impl : ( ( rule__Spinner__MinimumValueAssignment_5 ) ) ;
    public final void rule__Spinner__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1624:1: ( ( ( rule__Spinner__MinimumValueAssignment_5 ) ) )
            // InternalEntityDsl.g:1625:1: ( ( rule__Spinner__MinimumValueAssignment_5 ) )
            {
            // InternalEntityDsl.g:1625:1: ( ( rule__Spinner__MinimumValueAssignment_5 ) )
            // InternalEntityDsl.g:1626:2: ( rule__Spinner__MinimumValueAssignment_5 )
            {
             before(grammarAccess.getSpinnerAccess().getMinimumValueAssignment_5()); 
            // InternalEntityDsl.g:1627:2: ( rule__Spinner__MinimumValueAssignment_5 )
            // InternalEntityDsl.g:1627:3: rule__Spinner__MinimumValueAssignment_5
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
    // InternalEntityDsl.g:1635:1: rule__Spinner__Group__6 : rule__Spinner__Group__6__Impl rule__Spinner__Group__7 ;
    public final void rule__Spinner__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1639:1: ( rule__Spinner__Group__6__Impl rule__Spinner__Group__7 )
            // InternalEntityDsl.g:1640:2: rule__Spinner__Group__6__Impl rule__Spinner__Group__7
            {
            pushFollow(FOLLOW_17);
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
    // InternalEntityDsl.g:1647:1: rule__Spinner__Group__6__Impl : ( ',' ) ;
    public final void rule__Spinner__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1651:1: ( ( ',' ) )
            // InternalEntityDsl.g:1652:1: ( ',' )
            {
            // InternalEntityDsl.g:1652:1: ( ',' )
            // InternalEntityDsl.g:1653:2: ','
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
    // InternalEntityDsl.g:1662:1: rule__Spinner__Group__7 : rule__Spinner__Group__7__Impl rule__Spinner__Group__8 ;
    public final void rule__Spinner__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1666:1: ( rule__Spinner__Group__7__Impl rule__Spinner__Group__8 )
            // InternalEntityDsl.g:1667:2: rule__Spinner__Group__7__Impl rule__Spinner__Group__8
            {
            pushFollow(FOLLOW_19);
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
    // InternalEntityDsl.g:1674:1: rule__Spinner__Group__7__Impl : ( ( rule__Spinner__MaximumValueAssignment_7 ) ) ;
    public final void rule__Spinner__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1678:1: ( ( ( rule__Spinner__MaximumValueAssignment_7 ) ) )
            // InternalEntityDsl.g:1679:1: ( ( rule__Spinner__MaximumValueAssignment_7 ) )
            {
            // InternalEntityDsl.g:1679:1: ( ( rule__Spinner__MaximumValueAssignment_7 ) )
            // InternalEntityDsl.g:1680:2: ( rule__Spinner__MaximumValueAssignment_7 )
            {
             before(grammarAccess.getSpinnerAccess().getMaximumValueAssignment_7()); 
            // InternalEntityDsl.g:1681:2: ( rule__Spinner__MaximumValueAssignment_7 )
            // InternalEntityDsl.g:1681:3: rule__Spinner__MaximumValueAssignment_7
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
    // InternalEntityDsl.g:1689:1: rule__Spinner__Group__8 : rule__Spinner__Group__8__Impl rule__Spinner__Group__9 ;
    public final void rule__Spinner__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1693:1: ( rule__Spinner__Group__8__Impl rule__Spinner__Group__9 )
            // InternalEntityDsl.g:1694:2: rule__Spinner__Group__8__Impl rule__Spinner__Group__9
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
    // InternalEntityDsl.g:1701:1: rule__Spinner__Group__8__Impl : ( ')' ) ;
    public final void rule__Spinner__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1705:1: ( ( ')' ) )
            // InternalEntityDsl.g:1706:1: ( ')' )
            {
            // InternalEntityDsl.g:1706:1: ( ')' )
            // InternalEntityDsl.g:1707:2: ')'
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
    // InternalEntityDsl.g:1716:1: rule__Spinner__Group__9 : rule__Spinner__Group__9__Impl ;
    public final void rule__Spinner__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1720:1: ( rule__Spinner__Group__9__Impl )
            // InternalEntityDsl.g:1721:2: rule__Spinner__Group__9__Impl
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
    // InternalEntityDsl.g:1727:1: rule__Spinner__Group__9__Impl : ( ']' ) ;
    public final void rule__Spinner__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1731:1: ( ( ']' ) )
            // InternalEntityDsl.g:1732:1: ( ']' )
            {
            // InternalEntityDsl.g:1732:1: ( ']' )
            // InternalEntityDsl.g:1733:2: ']'
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
    // InternalEntityDsl.g:1743:1: rule__RadioButtonGroup__Group__0 : rule__RadioButtonGroup__Group__0__Impl rule__RadioButtonGroup__Group__1 ;
    public final void rule__RadioButtonGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1747:1: ( rule__RadioButtonGroup__Group__0__Impl rule__RadioButtonGroup__Group__1 )
            // InternalEntityDsl.g:1748:2: rule__RadioButtonGroup__Group__0__Impl rule__RadioButtonGroup__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalEntityDsl.g:1755:1: rule__RadioButtonGroup__Group__0__Impl : ( ( rule__RadioButtonGroup__NameAssignment_0 ) ) ;
    public final void rule__RadioButtonGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1759:1: ( ( ( rule__RadioButtonGroup__NameAssignment_0 ) ) )
            // InternalEntityDsl.g:1760:1: ( ( rule__RadioButtonGroup__NameAssignment_0 ) )
            {
            // InternalEntityDsl.g:1760:1: ( ( rule__RadioButtonGroup__NameAssignment_0 ) )
            // InternalEntityDsl.g:1761:2: ( rule__RadioButtonGroup__NameAssignment_0 )
            {
             before(grammarAccess.getRadioButtonGroupAccess().getNameAssignment_0()); 
            // InternalEntityDsl.g:1762:2: ( rule__RadioButtonGroup__NameAssignment_0 )
            // InternalEntityDsl.g:1762:3: rule__RadioButtonGroup__NameAssignment_0
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
    // InternalEntityDsl.g:1770:1: rule__RadioButtonGroup__Group__1 : rule__RadioButtonGroup__Group__1__Impl rule__RadioButtonGroup__Group__2 ;
    public final void rule__RadioButtonGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1774:1: ( rule__RadioButtonGroup__Group__1__Impl rule__RadioButtonGroup__Group__2 )
            // InternalEntityDsl.g:1775:2: rule__RadioButtonGroup__Group__1__Impl rule__RadioButtonGroup__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalEntityDsl.g:1782:1: rule__RadioButtonGroup__Group__1__Impl : ( '(' ) ;
    public final void rule__RadioButtonGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1786:1: ( ( '(' ) )
            // InternalEntityDsl.g:1787:1: ( '(' )
            {
            // InternalEntityDsl.g:1787:1: ( '(' )
            // InternalEntityDsl.g:1788:2: '('
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
    // InternalEntityDsl.g:1797:1: rule__RadioButtonGroup__Group__2 : rule__RadioButtonGroup__Group__2__Impl rule__RadioButtonGroup__Group__3 ;
    public final void rule__RadioButtonGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1801:1: ( rule__RadioButtonGroup__Group__2__Impl rule__RadioButtonGroup__Group__3 )
            // InternalEntityDsl.g:1802:2: rule__RadioButtonGroup__Group__2__Impl rule__RadioButtonGroup__Group__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalEntityDsl.g:1809:1: rule__RadioButtonGroup__Group__2__Impl : ( ( rule__RadioButtonGroup__ButtonsAssignment_2 )* ) ;
    public final void rule__RadioButtonGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1813:1: ( ( ( rule__RadioButtonGroup__ButtonsAssignment_2 )* ) )
            // InternalEntityDsl.g:1814:1: ( ( rule__RadioButtonGroup__ButtonsAssignment_2 )* )
            {
            // InternalEntityDsl.g:1814:1: ( ( rule__RadioButtonGroup__ButtonsAssignment_2 )* )
            // InternalEntityDsl.g:1815:2: ( rule__RadioButtonGroup__ButtonsAssignment_2 )*
            {
             before(grammarAccess.getRadioButtonGroupAccess().getButtonsAssignment_2()); 
            // InternalEntityDsl.g:1816:2: ( rule__RadioButtonGroup__ButtonsAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_STRING) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalEntityDsl.g:1816:3: rule__RadioButtonGroup__ButtonsAssignment_2
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__RadioButtonGroup__ButtonsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalEntityDsl.g:1824:1: rule__RadioButtonGroup__Group__3 : rule__RadioButtonGroup__Group__3__Impl rule__RadioButtonGroup__Group__4 ;
    public final void rule__RadioButtonGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1828:1: ( rule__RadioButtonGroup__Group__3__Impl rule__RadioButtonGroup__Group__4 )
            // InternalEntityDsl.g:1829:2: rule__RadioButtonGroup__Group__3__Impl rule__RadioButtonGroup__Group__4
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
    // InternalEntityDsl.g:1836:1: rule__RadioButtonGroup__Group__3__Impl : ( ')' ) ;
    public final void rule__RadioButtonGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1840:1: ( ( ')' ) )
            // InternalEntityDsl.g:1841:1: ( ')' )
            {
            // InternalEntityDsl.g:1841:1: ( ')' )
            // InternalEntityDsl.g:1842:2: ')'
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
    // InternalEntityDsl.g:1851:1: rule__RadioButtonGroup__Group__4 : rule__RadioButtonGroup__Group__4__Impl rule__RadioButtonGroup__Group__5 ;
    public final void rule__RadioButtonGroup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1855:1: ( rule__RadioButtonGroup__Group__4__Impl rule__RadioButtonGroup__Group__5 )
            // InternalEntityDsl.g:1856:2: rule__RadioButtonGroup__Group__4__Impl rule__RadioButtonGroup__Group__5
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
    // InternalEntityDsl.g:1863:1: rule__RadioButtonGroup__Group__4__Impl : ( '[' ) ;
    public final void rule__RadioButtonGroup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1867:1: ( ( '[' ) )
            // InternalEntityDsl.g:1868:1: ( '[' )
            {
            // InternalEntityDsl.g:1868:1: ( '[' )
            // InternalEntityDsl.g:1869:2: '['
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
    // InternalEntityDsl.g:1878:1: rule__RadioButtonGroup__Group__5 : rule__RadioButtonGroup__Group__5__Impl rule__RadioButtonGroup__Group__6 ;
    public final void rule__RadioButtonGroup__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1882:1: ( rule__RadioButtonGroup__Group__5__Impl rule__RadioButtonGroup__Group__6 )
            // InternalEntityDsl.g:1883:2: rule__RadioButtonGroup__Group__5__Impl rule__RadioButtonGroup__Group__6
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
    // InternalEntityDsl.g:1890:1: rule__RadioButtonGroup__Group__5__Impl : ( ( rule__RadioButtonGroup__DataTypeAssignment_5 ) ) ;
    public final void rule__RadioButtonGroup__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1894:1: ( ( ( rule__RadioButtonGroup__DataTypeAssignment_5 ) ) )
            // InternalEntityDsl.g:1895:1: ( ( rule__RadioButtonGroup__DataTypeAssignment_5 ) )
            {
            // InternalEntityDsl.g:1895:1: ( ( rule__RadioButtonGroup__DataTypeAssignment_5 ) )
            // InternalEntityDsl.g:1896:2: ( rule__RadioButtonGroup__DataTypeAssignment_5 )
            {
             before(grammarAccess.getRadioButtonGroupAccess().getDataTypeAssignment_5()); 
            // InternalEntityDsl.g:1897:2: ( rule__RadioButtonGroup__DataTypeAssignment_5 )
            // InternalEntityDsl.g:1897:3: rule__RadioButtonGroup__DataTypeAssignment_5
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
    // InternalEntityDsl.g:1905:1: rule__RadioButtonGroup__Group__6 : rule__RadioButtonGroup__Group__6__Impl ;
    public final void rule__RadioButtonGroup__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1909:1: ( rule__RadioButtonGroup__Group__6__Impl )
            // InternalEntityDsl.g:1910:2: rule__RadioButtonGroup__Group__6__Impl
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
    // InternalEntityDsl.g:1916:1: rule__RadioButtonGroup__Group__6__Impl : ( ']' ) ;
    public final void rule__RadioButtonGroup__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1920:1: ( ( ']' ) )
            // InternalEntityDsl.g:1921:1: ( ']' )
            {
            // InternalEntityDsl.g:1921:1: ( ']' )
            // InternalEntityDsl.g:1922:2: ']'
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
    // InternalEntityDsl.g:1932:1: rule__TextBox__Group__0 : rule__TextBox__Group__0__Impl rule__TextBox__Group__1 ;
    public final void rule__TextBox__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1936:1: ( rule__TextBox__Group__0__Impl rule__TextBox__Group__1 )
            // InternalEntityDsl.g:1937:2: rule__TextBox__Group__0__Impl rule__TextBox__Group__1
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
    // InternalEntityDsl.g:1944:1: rule__TextBox__Group__0__Impl : ( ( rule__TextBox__NameAssignment_0 ) ) ;
    public final void rule__TextBox__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1948:1: ( ( ( rule__TextBox__NameAssignment_0 ) ) )
            // InternalEntityDsl.g:1949:1: ( ( rule__TextBox__NameAssignment_0 ) )
            {
            // InternalEntityDsl.g:1949:1: ( ( rule__TextBox__NameAssignment_0 ) )
            // InternalEntityDsl.g:1950:2: ( rule__TextBox__NameAssignment_0 )
            {
             before(grammarAccess.getTextBoxAccess().getNameAssignment_0()); 
            // InternalEntityDsl.g:1951:2: ( rule__TextBox__NameAssignment_0 )
            // InternalEntityDsl.g:1951:3: rule__TextBox__NameAssignment_0
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
    // InternalEntityDsl.g:1959:1: rule__TextBox__Group__1 : rule__TextBox__Group__1__Impl rule__TextBox__Group__2 ;
    public final void rule__TextBox__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1963:1: ( rule__TextBox__Group__1__Impl rule__TextBox__Group__2 )
            // InternalEntityDsl.g:1964:2: rule__TextBox__Group__1__Impl rule__TextBox__Group__2
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
    // InternalEntityDsl.g:1971:1: rule__TextBox__Group__1__Impl : ( '[' ) ;
    public final void rule__TextBox__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1975:1: ( ( '[' ) )
            // InternalEntityDsl.g:1976:1: ( '[' )
            {
            // InternalEntityDsl.g:1976:1: ( '[' )
            // InternalEntityDsl.g:1977:2: '['
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
    // InternalEntityDsl.g:1986:1: rule__TextBox__Group__2 : rule__TextBox__Group__2__Impl rule__TextBox__Group__3 ;
    public final void rule__TextBox__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:1990:1: ( rule__TextBox__Group__2__Impl rule__TextBox__Group__3 )
            // InternalEntityDsl.g:1991:2: rule__TextBox__Group__2__Impl rule__TextBox__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalEntityDsl.g:1998:1: rule__TextBox__Group__2__Impl : ( ( rule__TextBox__DataTypeAssignment_2 ) ) ;
    public final void rule__TextBox__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2002:1: ( ( ( rule__TextBox__DataTypeAssignment_2 ) ) )
            // InternalEntityDsl.g:2003:1: ( ( rule__TextBox__DataTypeAssignment_2 ) )
            {
            // InternalEntityDsl.g:2003:1: ( ( rule__TextBox__DataTypeAssignment_2 ) )
            // InternalEntityDsl.g:2004:2: ( rule__TextBox__DataTypeAssignment_2 )
            {
             before(grammarAccess.getTextBoxAccess().getDataTypeAssignment_2()); 
            // InternalEntityDsl.g:2005:2: ( rule__TextBox__DataTypeAssignment_2 )
            // InternalEntityDsl.g:2005:3: rule__TextBox__DataTypeAssignment_2
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
    // InternalEntityDsl.g:2013:1: rule__TextBox__Group__3 : rule__TextBox__Group__3__Impl rule__TextBox__Group__4 ;
    public final void rule__TextBox__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2017:1: ( rule__TextBox__Group__3__Impl rule__TextBox__Group__4 )
            // InternalEntityDsl.g:2018:2: rule__TextBox__Group__3__Impl rule__TextBox__Group__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalEntityDsl.g:2025:1: rule__TextBox__Group__3__Impl : ( '(' ) ;
    public final void rule__TextBox__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2029:1: ( ( '(' ) )
            // InternalEntityDsl.g:2030:1: ( '(' )
            {
            // InternalEntityDsl.g:2030:1: ( '(' )
            // InternalEntityDsl.g:2031:2: '('
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
    // InternalEntityDsl.g:2040:1: rule__TextBox__Group__4 : rule__TextBox__Group__4__Impl rule__TextBox__Group__5 ;
    public final void rule__TextBox__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2044:1: ( rule__TextBox__Group__4__Impl rule__TextBox__Group__5 )
            // InternalEntityDsl.g:2045:2: rule__TextBox__Group__4__Impl rule__TextBox__Group__5
            {
            pushFollow(FOLLOW_24);
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
    // InternalEntityDsl.g:2052:1: rule__TextBox__Group__4__Impl : ( ( rule__TextBox__MinTextLengthAssignment_4 )? ) ;
    public final void rule__TextBox__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2056:1: ( ( ( rule__TextBox__MinTextLengthAssignment_4 )? ) )
            // InternalEntityDsl.g:2057:1: ( ( rule__TextBox__MinTextLengthAssignment_4 )? )
            {
            // InternalEntityDsl.g:2057:1: ( ( rule__TextBox__MinTextLengthAssignment_4 )? )
            // InternalEntityDsl.g:2058:2: ( rule__TextBox__MinTextLengthAssignment_4 )?
            {
             before(grammarAccess.getTextBoxAccess().getMinTextLengthAssignment_4()); 
            // InternalEntityDsl.g:2059:2: ( rule__TextBox__MinTextLengthAssignment_4 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalEntityDsl.g:2059:3: rule__TextBox__MinTextLengthAssignment_4
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
    // InternalEntityDsl.g:2067:1: rule__TextBox__Group__5 : rule__TextBox__Group__5__Impl rule__TextBox__Group__6 ;
    public final void rule__TextBox__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2071:1: ( rule__TextBox__Group__5__Impl rule__TextBox__Group__6 )
            // InternalEntityDsl.g:2072:2: rule__TextBox__Group__5__Impl rule__TextBox__Group__6
            {
            pushFollow(FOLLOW_25);
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
    // InternalEntityDsl.g:2079:1: rule__TextBox__Group__5__Impl : ( ',' ) ;
    public final void rule__TextBox__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2083:1: ( ( ',' ) )
            // InternalEntityDsl.g:2084:1: ( ',' )
            {
            // InternalEntityDsl.g:2084:1: ( ',' )
            // InternalEntityDsl.g:2085:2: ','
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
    // InternalEntityDsl.g:2094:1: rule__TextBox__Group__6 : rule__TextBox__Group__6__Impl rule__TextBox__Group__7 ;
    public final void rule__TextBox__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2098:1: ( rule__TextBox__Group__6__Impl rule__TextBox__Group__7 )
            // InternalEntityDsl.g:2099:2: rule__TextBox__Group__6__Impl rule__TextBox__Group__7
            {
            pushFollow(FOLLOW_25);
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
    // InternalEntityDsl.g:2106:1: rule__TextBox__Group__6__Impl : ( ( rule__TextBox__MaxTextLengthAssignment_6 )? ) ;
    public final void rule__TextBox__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2110:1: ( ( ( rule__TextBox__MaxTextLengthAssignment_6 )? ) )
            // InternalEntityDsl.g:2111:1: ( ( rule__TextBox__MaxTextLengthAssignment_6 )? )
            {
            // InternalEntityDsl.g:2111:1: ( ( rule__TextBox__MaxTextLengthAssignment_6 )? )
            // InternalEntityDsl.g:2112:2: ( rule__TextBox__MaxTextLengthAssignment_6 )?
            {
             before(grammarAccess.getTextBoxAccess().getMaxTextLengthAssignment_6()); 
            // InternalEntityDsl.g:2113:2: ( rule__TextBox__MaxTextLengthAssignment_6 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_INT) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalEntityDsl.g:2113:3: rule__TextBox__MaxTextLengthAssignment_6
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
    // InternalEntityDsl.g:2121:1: rule__TextBox__Group__7 : rule__TextBox__Group__7__Impl rule__TextBox__Group__8 ;
    public final void rule__TextBox__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2125:1: ( rule__TextBox__Group__7__Impl rule__TextBox__Group__8 )
            // InternalEntityDsl.g:2126:2: rule__TextBox__Group__7__Impl rule__TextBox__Group__8
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
    // InternalEntityDsl.g:2133:1: rule__TextBox__Group__7__Impl : ( ')' ) ;
    public final void rule__TextBox__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2137:1: ( ( ')' ) )
            // InternalEntityDsl.g:2138:1: ( ')' )
            {
            // InternalEntityDsl.g:2138:1: ( ')' )
            // InternalEntityDsl.g:2139:2: ')'
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
    // InternalEntityDsl.g:2148:1: rule__TextBox__Group__8 : rule__TextBox__Group__8__Impl ;
    public final void rule__TextBox__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2152:1: ( rule__TextBox__Group__8__Impl )
            // InternalEntityDsl.g:2153:2: rule__TextBox__Group__8__Impl
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
    // InternalEntityDsl.g:2159:1: rule__TextBox__Group__8__Impl : ( ']' ) ;
    public final void rule__TextBox__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2163:1: ( ( ']' ) )
            // InternalEntityDsl.g:2164:1: ( ']' )
            {
            // InternalEntityDsl.g:2164:1: ( ']' )
            // InternalEntityDsl.g:2165:2: ']'
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
    // InternalEntityDsl.g:2175:1: rule__ComboBox__Group__0 : rule__ComboBox__Group__0__Impl rule__ComboBox__Group__1 ;
    public final void rule__ComboBox__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2179:1: ( rule__ComboBox__Group__0__Impl rule__ComboBox__Group__1 )
            // InternalEntityDsl.g:2180:2: rule__ComboBox__Group__0__Impl rule__ComboBox__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalEntityDsl.g:2187:1: rule__ComboBox__Group__0__Impl : ( ( rule__ComboBox__NameAssignment_0 ) ) ;
    public final void rule__ComboBox__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2191:1: ( ( ( rule__ComboBox__NameAssignment_0 ) ) )
            // InternalEntityDsl.g:2192:1: ( ( rule__ComboBox__NameAssignment_0 ) )
            {
            // InternalEntityDsl.g:2192:1: ( ( rule__ComboBox__NameAssignment_0 ) )
            // InternalEntityDsl.g:2193:2: ( rule__ComboBox__NameAssignment_0 )
            {
             before(grammarAccess.getComboBoxAccess().getNameAssignment_0()); 
            // InternalEntityDsl.g:2194:2: ( rule__ComboBox__NameAssignment_0 )
            // InternalEntityDsl.g:2194:3: rule__ComboBox__NameAssignment_0
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
    // InternalEntityDsl.g:2202:1: rule__ComboBox__Group__1 : rule__ComboBox__Group__1__Impl rule__ComboBox__Group__2 ;
    public final void rule__ComboBox__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2206:1: ( rule__ComboBox__Group__1__Impl rule__ComboBox__Group__2 )
            // InternalEntityDsl.g:2207:2: rule__ComboBox__Group__1__Impl rule__ComboBox__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalEntityDsl.g:2214:1: rule__ComboBox__Group__1__Impl : ( '(' ) ;
    public final void rule__ComboBox__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2218:1: ( ( '(' ) )
            // InternalEntityDsl.g:2219:1: ( '(' )
            {
            // InternalEntityDsl.g:2219:1: ( '(' )
            // InternalEntityDsl.g:2220:2: '('
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
    // InternalEntityDsl.g:2229:1: rule__ComboBox__Group__2 : rule__ComboBox__Group__2__Impl rule__ComboBox__Group__3 ;
    public final void rule__ComboBox__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2233:1: ( rule__ComboBox__Group__2__Impl rule__ComboBox__Group__3 )
            // InternalEntityDsl.g:2234:2: rule__ComboBox__Group__2__Impl rule__ComboBox__Group__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalEntityDsl.g:2241:1: rule__ComboBox__Group__2__Impl : ( ( rule__ComboBox__ItemsAssignment_2 )* ) ;
    public final void rule__ComboBox__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2245:1: ( ( ( rule__ComboBox__ItemsAssignment_2 )* ) )
            // InternalEntityDsl.g:2246:1: ( ( rule__ComboBox__ItemsAssignment_2 )* )
            {
            // InternalEntityDsl.g:2246:1: ( ( rule__ComboBox__ItemsAssignment_2 )* )
            // InternalEntityDsl.g:2247:2: ( rule__ComboBox__ItemsAssignment_2 )*
            {
             before(grammarAccess.getComboBoxAccess().getItemsAssignment_2()); 
            // InternalEntityDsl.g:2248:2: ( rule__ComboBox__ItemsAssignment_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_STRING) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalEntityDsl.g:2248:3: rule__ComboBox__ItemsAssignment_2
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__ComboBox__ItemsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalEntityDsl.g:2256:1: rule__ComboBox__Group__3 : rule__ComboBox__Group__3__Impl rule__ComboBox__Group__4 ;
    public final void rule__ComboBox__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2260:1: ( rule__ComboBox__Group__3__Impl rule__ComboBox__Group__4 )
            // InternalEntityDsl.g:2261:2: rule__ComboBox__Group__3__Impl rule__ComboBox__Group__4
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
    // InternalEntityDsl.g:2268:1: rule__ComboBox__Group__3__Impl : ( ')' ) ;
    public final void rule__ComboBox__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2272:1: ( ( ')' ) )
            // InternalEntityDsl.g:2273:1: ( ')' )
            {
            // InternalEntityDsl.g:2273:1: ( ')' )
            // InternalEntityDsl.g:2274:2: ')'
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
    // InternalEntityDsl.g:2283:1: rule__ComboBox__Group__4 : rule__ComboBox__Group__4__Impl rule__ComboBox__Group__5 ;
    public final void rule__ComboBox__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2287:1: ( rule__ComboBox__Group__4__Impl rule__ComboBox__Group__5 )
            // InternalEntityDsl.g:2288:2: rule__ComboBox__Group__4__Impl rule__ComboBox__Group__5
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
    // InternalEntityDsl.g:2295:1: rule__ComboBox__Group__4__Impl : ( '[' ) ;
    public final void rule__ComboBox__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2299:1: ( ( '[' ) )
            // InternalEntityDsl.g:2300:1: ( '[' )
            {
            // InternalEntityDsl.g:2300:1: ( '[' )
            // InternalEntityDsl.g:2301:2: '['
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
    // InternalEntityDsl.g:2310:1: rule__ComboBox__Group__5 : rule__ComboBox__Group__5__Impl rule__ComboBox__Group__6 ;
    public final void rule__ComboBox__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2314:1: ( rule__ComboBox__Group__5__Impl rule__ComboBox__Group__6 )
            // InternalEntityDsl.g:2315:2: rule__ComboBox__Group__5__Impl rule__ComboBox__Group__6
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
    // InternalEntityDsl.g:2322:1: rule__ComboBox__Group__5__Impl : ( ( rule__ComboBox__DataTypeAssignment_5 ) ) ;
    public final void rule__ComboBox__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2326:1: ( ( ( rule__ComboBox__DataTypeAssignment_5 ) ) )
            // InternalEntityDsl.g:2327:1: ( ( rule__ComboBox__DataTypeAssignment_5 ) )
            {
            // InternalEntityDsl.g:2327:1: ( ( rule__ComboBox__DataTypeAssignment_5 ) )
            // InternalEntityDsl.g:2328:2: ( rule__ComboBox__DataTypeAssignment_5 )
            {
             before(grammarAccess.getComboBoxAccess().getDataTypeAssignment_5()); 
            // InternalEntityDsl.g:2329:2: ( rule__ComboBox__DataTypeAssignment_5 )
            // InternalEntityDsl.g:2329:3: rule__ComboBox__DataTypeAssignment_5
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
    // InternalEntityDsl.g:2337:1: rule__ComboBox__Group__6 : rule__ComboBox__Group__6__Impl ;
    public final void rule__ComboBox__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2341:1: ( rule__ComboBox__Group__6__Impl )
            // InternalEntityDsl.g:2342:2: rule__ComboBox__Group__6__Impl
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
    // InternalEntityDsl.g:2348:1: rule__ComboBox__Group__6__Impl : ( ']' ) ;
    public final void rule__ComboBox__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2352:1: ( ( ']' ) )
            // InternalEntityDsl.g:2353:1: ( ']' )
            {
            // InternalEntityDsl.g:2353:1: ( ']' )
            // InternalEntityDsl.g:2354:2: ']'
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
    // InternalEntityDsl.g:2364:1: rule__Domainmodel__ApplicationNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Domainmodel__ApplicationNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2368:1: ( ( RULE_ID ) )
            // InternalEntityDsl.g:2369:2: ( RULE_ID )
            {
            // InternalEntityDsl.g:2369:2: ( RULE_ID )
            // InternalEntityDsl.g:2370:3: RULE_ID
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
    // InternalEntityDsl.g:2379:1: rule__Domainmodel__ElementsAssignment_2 : ( ruleEntity ) ;
    public final void rule__Domainmodel__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2383:1: ( ( ruleEntity ) )
            // InternalEntityDsl.g:2384:2: ( ruleEntity )
            {
            // InternalEntityDsl.g:2384:2: ( ruleEntity )
            // InternalEntityDsl.g:2385:3: ruleEntity
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
    // InternalEntityDsl.g:2394:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2398:1: ( ( RULE_ID ) )
            // InternalEntityDsl.g:2399:2: ( RULE_ID )
            {
            // InternalEntityDsl.g:2399:2: ( RULE_ID )
            // InternalEntityDsl.g:2400:3: RULE_ID
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
    // InternalEntityDsl.g:2409:1: rule__Entity__AttributesAssignment_3 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2413:1: ( ( ruleAttribute ) )
            // InternalEntityDsl.g:2414:2: ( ruleAttribute )
            {
            // InternalEntityDsl.g:2414:2: ( ruleAttribute )
            // InternalEntityDsl.g:2415:3: ruleAttribute
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
    // InternalEntityDsl.g:2424:1: rule__Attribute__RequiredAssignment_0 : ( ( '*' ) ) ;
    public final void rule__Attribute__RequiredAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2428:1: ( ( ( '*' ) ) )
            // InternalEntityDsl.g:2429:2: ( ( '*' ) )
            {
            // InternalEntityDsl.g:2429:2: ( ( '*' ) )
            // InternalEntityDsl.g:2430:3: ( '*' )
            {
             before(grammarAccess.getAttributeAccess().getRequiredAsteriskKeyword_0_0()); 
            // InternalEntityDsl.g:2431:3: ( '*' )
            // InternalEntityDsl.g:2432:4: '*'
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
    // InternalEntityDsl.g:2443:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2447:1: ( ( RULE_ID ) )
            // InternalEntityDsl.g:2448:2: ( RULE_ID )
            {
            // InternalEntityDsl.g:2448:2: ( RULE_ID )
            // InternalEntityDsl.g:2449:3: RULE_ID
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
    // InternalEntityDsl.g:2458:1: rule__Attribute__InputTypeAssignment_4 : ( ruleWinFormControlType ) ;
    public final void rule__Attribute__InputTypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2462:1: ( ( ruleWinFormControlType ) )
            // InternalEntityDsl.g:2463:2: ( ruleWinFormControlType )
            {
            // InternalEntityDsl.g:2463:2: ( ruleWinFormControlType )
            // InternalEntityDsl.g:2464:3: ruleWinFormControlType
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
    // InternalEntityDsl.g:2473:1: rule__Attribute__LabelTextAssignment_6 : ( ruleLabel ) ;
    public final void rule__Attribute__LabelTextAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2477:1: ( ( ruleLabel ) )
            // InternalEntityDsl.g:2478:2: ( ruleLabel )
            {
            // InternalEntityDsl.g:2478:2: ( ruleLabel )
            // InternalEntityDsl.g:2479:3: ruleLabel
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
    // InternalEntityDsl.g:2488:1: rule__DataType__TypeAssignment : ( ( rule__DataType__TypeAlternatives_0 ) ) ;
    public final void rule__DataType__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2492:1: ( ( ( rule__DataType__TypeAlternatives_0 ) ) )
            // InternalEntityDsl.g:2493:2: ( ( rule__DataType__TypeAlternatives_0 ) )
            {
            // InternalEntityDsl.g:2493:2: ( ( rule__DataType__TypeAlternatives_0 ) )
            // InternalEntityDsl.g:2494:3: ( rule__DataType__TypeAlternatives_0 )
            {
             before(grammarAccess.getDataTypeAccess().getTypeAlternatives_0()); 
            // InternalEntityDsl.g:2495:3: ( rule__DataType__TypeAlternatives_0 )
            // InternalEntityDsl.g:2495:4: rule__DataType__TypeAlternatives_0
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
    // InternalEntityDsl.g:2503:1: rule__Label__TextAssignment : ( RULE_STRING ) ;
    public final void rule__Label__TextAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2507:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:2508:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:2508:2: ( RULE_STRING )
            // InternalEntityDsl.g:2509:3: RULE_STRING
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
    // InternalEntityDsl.g:2518:1: rule__WinFormControlType__ControlTypeAssignment_0 : ( ruleTextBox ) ;
    public final void rule__WinFormControlType__ControlTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2522:1: ( ( ruleTextBox ) )
            // InternalEntityDsl.g:2523:2: ( ruleTextBox )
            {
            // InternalEntityDsl.g:2523:2: ( ruleTextBox )
            // InternalEntityDsl.g:2524:3: ruleTextBox
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


    // $ANTLR start "rule__TrackBar__NameAssignment_0"
    // InternalEntityDsl.g:2533:1: rule__TrackBar__NameAssignment_0 : ( ( 'TrackBar' ) ) ;
    public final void rule__TrackBar__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2537:1: ( ( ( 'TrackBar' ) ) )
            // InternalEntityDsl.g:2538:2: ( ( 'TrackBar' ) )
            {
            // InternalEntityDsl.g:2538:2: ( ( 'TrackBar' ) )
            // InternalEntityDsl.g:2539:3: ( 'TrackBar' )
            {
             before(grammarAccess.getTrackBarAccess().getNameTrackBarKeyword_0_0()); 
            // InternalEntityDsl.g:2540:3: ( 'TrackBar' )
            // InternalEntityDsl.g:2541:4: 'TrackBar'
            {
             before(grammarAccess.getTrackBarAccess().getNameTrackBarKeyword_0_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTrackBarAccess().getNameTrackBarKeyword_0_0()); 

            }

             after(grammarAccess.getTrackBarAccess().getNameTrackBarKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrackBar__NameAssignment_0"


    // $ANTLR start "rule__TrackBar__DataTypeAssignment_2"
    // InternalEntityDsl.g:2552:1: rule__TrackBar__DataTypeAssignment_2 : ( ruleDataType ) ;
    public final void rule__TrackBar__DataTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2556:1: ( ( ruleDataType ) )
            // InternalEntityDsl.g:2557:2: ( ruleDataType )
            {
            // InternalEntityDsl.g:2557:2: ( ruleDataType )
            // InternalEntityDsl.g:2558:3: ruleDataType
            {
             before(grammarAccess.getTrackBarAccess().getDataTypeDataTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getTrackBarAccess().getDataTypeDataTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrackBar__DataTypeAssignment_2"


    // $ANTLR start "rule__TrackBar__DefaultTickAssignment_4"
    // InternalEntityDsl.g:2567:1: rule__TrackBar__DefaultTickAssignment_4 : ( RULE_INT ) ;
    public final void rule__TrackBar__DefaultTickAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2571:1: ( ( RULE_INT ) )
            // InternalEntityDsl.g:2572:2: ( RULE_INT )
            {
            // InternalEntityDsl.g:2572:2: ( RULE_INT )
            // InternalEntityDsl.g:2573:3: RULE_INT
            {
             before(grammarAccess.getTrackBarAccess().getDefaultTickINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTrackBarAccess().getDefaultTickINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrackBar__DefaultTickAssignment_4"


    // $ANTLR start "rule__TrackBar__IncrementAssignment_6"
    // InternalEntityDsl.g:2582:1: rule__TrackBar__IncrementAssignment_6 : ( RULE_INT ) ;
    public final void rule__TrackBar__IncrementAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2586:1: ( ( RULE_INT ) )
            // InternalEntityDsl.g:2587:2: ( RULE_INT )
            {
            // InternalEntityDsl.g:2587:2: ( RULE_INT )
            // InternalEntityDsl.g:2588:3: RULE_INT
            {
             before(grammarAccess.getTrackBarAccess().getIncrementINTTerminalRuleCall_6_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTrackBarAccess().getIncrementINTTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrackBar__IncrementAssignment_6"


    // $ANTLR start "rule__TrackBar__DenominatorAssignment_8_0"
    // InternalEntityDsl.g:2597:1: rule__TrackBar__DenominatorAssignment_8_0 : ( RULE_INT ) ;
    public final void rule__TrackBar__DenominatorAssignment_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2601:1: ( ( RULE_INT ) )
            // InternalEntityDsl.g:2602:2: ( RULE_INT )
            {
            // InternalEntityDsl.g:2602:2: ( RULE_INT )
            // InternalEntityDsl.g:2603:3: RULE_INT
            {
             before(grammarAccess.getTrackBarAccess().getDenominatorINTTerminalRuleCall_8_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTrackBarAccess().getDenominatorINTTerminalRuleCall_8_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrackBar__DenominatorAssignment_8_0"


    // $ANTLR start "rule__TrackBar__MinimumValueAssignment_10"
    // InternalEntityDsl.g:2612:1: rule__TrackBar__MinimumValueAssignment_10 : ( RULE_INT ) ;
    public final void rule__TrackBar__MinimumValueAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2616:1: ( ( RULE_INT ) )
            // InternalEntityDsl.g:2617:2: ( RULE_INT )
            {
            // InternalEntityDsl.g:2617:2: ( RULE_INT )
            // InternalEntityDsl.g:2618:3: RULE_INT
            {
             before(grammarAccess.getTrackBarAccess().getMinimumValueINTTerminalRuleCall_10_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTrackBarAccess().getMinimumValueINTTerminalRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrackBar__MinimumValueAssignment_10"


    // $ANTLR start "rule__TrackBar__MaximumValueAssignment_12"
    // InternalEntityDsl.g:2627:1: rule__TrackBar__MaximumValueAssignment_12 : ( RULE_INT ) ;
    public final void rule__TrackBar__MaximumValueAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2631:1: ( ( RULE_INT ) )
            // InternalEntityDsl.g:2632:2: ( RULE_INT )
            {
            // InternalEntityDsl.g:2632:2: ( RULE_INT )
            // InternalEntityDsl.g:2633:3: RULE_INT
            {
             before(grammarAccess.getTrackBarAccess().getMaximumValueINTTerminalRuleCall_12_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTrackBarAccess().getMaximumValueINTTerminalRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrackBar__MaximumValueAssignment_12"


    // $ANTLR start "rule__TrackBar__StringValuesAssignment_14_1"
    // InternalEntityDsl.g:2642:1: rule__TrackBar__StringValuesAssignment_14_1 : ( RULE_STRING ) ;
    public final void rule__TrackBar__StringValuesAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2646:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:2647:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:2647:2: ( RULE_STRING )
            // InternalEntityDsl.g:2648:3: RULE_STRING
            {
             before(grammarAccess.getTrackBarAccess().getStringValuesSTRINGTerminalRuleCall_14_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTrackBarAccess().getStringValuesSTRINGTerminalRuleCall_14_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrackBar__StringValuesAssignment_14_1"


    // $ANTLR start "rule__Spinner__NameAssignment_0"
    // InternalEntityDsl.g:2657:1: rule__Spinner__NameAssignment_0 : ( ( 'Spinner' ) ) ;
    public final void rule__Spinner__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2661:1: ( ( ( 'Spinner' ) ) )
            // InternalEntityDsl.g:2662:2: ( ( 'Spinner' ) )
            {
            // InternalEntityDsl.g:2662:2: ( ( 'Spinner' ) )
            // InternalEntityDsl.g:2663:3: ( 'Spinner' )
            {
             before(grammarAccess.getSpinnerAccess().getNameSpinnerKeyword_0_0()); 
            // InternalEntityDsl.g:2664:3: ( 'Spinner' )
            // InternalEntityDsl.g:2665:4: 'Spinner'
            {
             before(grammarAccess.getSpinnerAccess().getNameSpinnerKeyword_0_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalEntityDsl.g:2676:1: rule__Spinner__DefaultValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__Spinner__DefaultValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2680:1: ( ( RULE_INT ) )
            // InternalEntityDsl.g:2681:2: ( RULE_INT )
            {
            // InternalEntityDsl.g:2681:2: ( RULE_INT )
            // InternalEntityDsl.g:2682:3: RULE_INT
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
    // InternalEntityDsl.g:2691:1: rule__Spinner__MinimumValueAssignment_5 : ( RULE_INT ) ;
    public final void rule__Spinner__MinimumValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2695:1: ( ( RULE_INT ) )
            // InternalEntityDsl.g:2696:2: ( RULE_INT )
            {
            // InternalEntityDsl.g:2696:2: ( RULE_INT )
            // InternalEntityDsl.g:2697:3: RULE_INT
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
    // InternalEntityDsl.g:2706:1: rule__Spinner__MaximumValueAssignment_7 : ( RULE_INT ) ;
    public final void rule__Spinner__MaximumValueAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2710:1: ( ( RULE_INT ) )
            // InternalEntityDsl.g:2711:2: ( RULE_INT )
            {
            // InternalEntityDsl.g:2711:2: ( RULE_INT )
            // InternalEntityDsl.g:2712:3: RULE_INT
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
    // InternalEntityDsl.g:2721:1: rule__RadioButtonGroup__NameAssignment_0 : ( ( 'RadioButtonGroup' ) ) ;
    public final void rule__RadioButtonGroup__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2725:1: ( ( ( 'RadioButtonGroup' ) ) )
            // InternalEntityDsl.g:2726:2: ( ( 'RadioButtonGroup' ) )
            {
            // InternalEntityDsl.g:2726:2: ( ( 'RadioButtonGroup' ) )
            // InternalEntityDsl.g:2727:3: ( 'RadioButtonGroup' )
            {
             before(grammarAccess.getRadioButtonGroupAccess().getNameRadioButtonGroupKeyword_0_0()); 
            // InternalEntityDsl.g:2728:3: ( 'RadioButtonGroup' )
            // InternalEntityDsl.g:2729:4: 'RadioButtonGroup'
            {
             before(grammarAccess.getRadioButtonGroupAccess().getNameRadioButtonGroupKeyword_0_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalEntityDsl.g:2740:1: rule__RadioButtonGroup__ButtonsAssignment_2 : ( ruleRadioButton ) ;
    public final void rule__RadioButtonGroup__ButtonsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2744:1: ( ( ruleRadioButton ) )
            // InternalEntityDsl.g:2745:2: ( ruleRadioButton )
            {
            // InternalEntityDsl.g:2745:2: ( ruleRadioButton )
            // InternalEntityDsl.g:2746:3: ruleRadioButton
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
    // InternalEntityDsl.g:2755:1: rule__RadioButtonGroup__DataTypeAssignment_5 : ( ruleDataType ) ;
    public final void rule__RadioButtonGroup__DataTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2759:1: ( ( ruleDataType ) )
            // InternalEntityDsl.g:2760:2: ( ruleDataType )
            {
            // InternalEntityDsl.g:2760:2: ( ruleDataType )
            // InternalEntityDsl.g:2761:3: ruleDataType
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
    // InternalEntityDsl.g:2770:1: rule__RadioButton__TextAssignment : ( RULE_STRING ) ;
    public final void rule__RadioButton__TextAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2774:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:2775:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:2775:2: ( RULE_STRING )
            // InternalEntityDsl.g:2776:3: RULE_STRING
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
    // InternalEntityDsl.g:2785:1: rule__CheckBox__NameAssignment : ( ( 'CheckBox' ) ) ;
    public final void rule__CheckBox__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2789:1: ( ( ( 'CheckBox' ) ) )
            // InternalEntityDsl.g:2790:2: ( ( 'CheckBox' ) )
            {
            // InternalEntityDsl.g:2790:2: ( ( 'CheckBox' ) )
            // InternalEntityDsl.g:2791:3: ( 'CheckBox' )
            {
             before(grammarAccess.getCheckBoxAccess().getNameCheckBoxKeyword_0()); 
            // InternalEntityDsl.g:2792:3: ( 'CheckBox' )
            // InternalEntityDsl.g:2793:4: 'CheckBox'
            {
             before(grammarAccess.getCheckBoxAccess().getNameCheckBoxKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalEntityDsl.g:2804:1: rule__TextBox__NameAssignment_0 : ( ( 'TextBox' ) ) ;
    public final void rule__TextBox__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2808:1: ( ( ( 'TextBox' ) ) )
            // InternalEntityDsl.g:2809:2: ( ( 'TextBox' ) )
            {
            // InternalEntityDsl.g:2809:2: ( ( 'TextBox' ) )
            // InternalEntityDsl.g:2810:3: ( 'TextBox' )
            {
             before(grammarAccess.getTextBoxAccess().getNameTextBoxKeyword_0_0()); 
            // InternalEntityDsl.g:2811:3: ( 'TextBox' )
            // InternalEntityDsl.g:2812:4: 'TextBox'
            {
             before(grammarAccess.getTextBoxAccess().getNameTextBoxKeyword_0_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalEntityDsl.g:2823:1: rule__TextBox__DataTypeAssignment_2 : ( ruleDataType ) ;
    public final void rule__TextBox__DataTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2827:1: ( ( ruleDataType ) )
            // InternalEntityDsl.g:2828:2: ( ruleDataType )
            {
            // InternalEntityDsl.g:2828:2: ( ruleDataType )
            // InternalEntityDsl.g:2829:3: ruleDataType
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
    // InternalEntityDsl.g:2838:1: rule__TextBox__MinTextLengthAssignment_4 : ( RULE_INT ) ;
    public final void rule__TextBox__MinTextLengthAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2842:1: ( ( RULE_INT ) )
            // InternalEntityDsl.g:2843:2: ( RULE_INT )
            {
            // InternalEntityDsl.g:2843:2: ( RULE_INT )
            // InternalEntityDsl.g:2844:3: RULE_INT
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
    // InternalEntityDsl.g:2853:1: rule__TextBox__MaxTextLengthAssignment_6 : ( RULE_INT ) ;
    public final void rule__TextBox__MaxTextLengthAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2857:1: ( ( RULE_INT ) )
            // InternalEntityDsl.g:2858:2: ( RULE_INT )
            {
            // InternalEntityDsl.g:2858:2: ( RULE_INT )
            // InternalEntityDsl.g:2859:3: RULE_INT
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
    // InternalEntityDsl.g:2868:1: rule__ComboBox__NameAssignment_0 : ( ( 'ComboBox' ) ) ;
    public final void rule__ComboBox__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2872:1: ( ( ( 'ComboBox' ) ) )
            // InternalEntityDsl.g:2873:2: ( ( 'ComboBox' ) )
            {
            // InternalEntityDsl.g:2873:2: ( ( 'ComboBox' ) )
            // InternalEntityDsl.g:2874:3: ( 'ComboBox' )
            {
             before(grammarAccess.getComboBoxAccess().getNameComboBoxKeyword_0_0()); 
            // InternalEntityDsl.g:2875:3: ( 'ComboBox' )
            // InternalEntityDsl.g:2876:4: 'ComboBox'
            {
             before(grammarAccess.getComboBoxAccess().getNameComboBoxKeyword_0_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalEntityDsl.g:2887:1: rule__ComboBox__ItemsAssignment_2 : ( ruleComboBoxItem ) ;
    public final void rule__ComboBox__ItemsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2891:1: ( ( ruleComboBoxItem ) )
            // InternalEntityDsl.g:2892:2: ( ruleComboBoxItem )
            {
            // InternalEntityDsl.g:2892:2: ( ruleComboBoxItem )
            // InternalEntityDsl.g:2893:3: ruleComboBoxItem
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
    // InternalEntityDsl.g:2902:1: rule__ComboBox__DataTypeAssignment_5 : ( ruleDataType ) ;
    public final void rule__ComboBox__DataTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2906:1: ( ( ruleDataType ) )
            // InternalEntityDsl.g:2907:2: ( ruleDataType )
            {
            // InternalEntityDsl.g:2907:2: ( ruleDataType )
            // InternalEntityDsl.g:2908:3: ruleDataType
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
    // InternalEntityDsl.g:2917:1: rule__ComboBoxItem__TextAssignment : ( RULE_STRING ) ;
    public final void rule__ComboBoxItem__TextAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDsl.g:2921:1: ( ( RULE_STRING ) )
            // InternalEntityDsl.g:2922:2: ( RULE_STRING )
            {
            // InternalEntityDsl.g:2922:2: ( RULE_STRING )
            // InternalEntityDsl.g:2923:3: RULE_STRING
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
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000007E000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000800040L});

}