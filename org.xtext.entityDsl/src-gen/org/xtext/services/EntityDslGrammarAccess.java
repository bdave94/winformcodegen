/*
 * generated by Xtext 2.11.0
 */
package org.xtext.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class EntityDslGrammarAccess extends AbstractGrammarElementFinder {
	
	public class DomainmodelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.EntityDsl.Domainmodel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDatabaseKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cApplicationNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cApplicationNameIDTerminalRuleCall_1_0 = (RuleCall)cApplicationNameAssignment_1.eContents().get(0);
		private final Assignment cElementsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cElementsEntityParserRuleCall_2_0 = (RuleCall)cElementsAssignment_2.eContents().get(0);
		
		//Domainmodel:
		//	'database:' applicationName=ID
		//	elements+=Entity*;
		@Override public ParserRule getRule() { return rule; }
		
		//'database:' applicationName=ID elements+=Entity*
		public Group getGroup() { return cGroup; }
		
		//'database:'
		public Keyword getDatabaseKeyword_0() { return cDatabaseKeyword_0; }
		
		//applicationName=ID
		public Assignment getApplicationNameAssignment_1() { return cApplicationNameAssignment_1; }
		
		//ID
		public RuleCall getApplicationNameIDTerminalRuleCall_1_0() { return cApplicationNameIDTerminalRuleCall_1_0; }
		
		//elements+=Entity*
		public Assignment getElementsAssignment_2() { return cElementsAssignment_2; }
		
		//Entity
		public RuleCall getElementsEntityParserRuleCall_2_0() { return cElementsEntityParserRuleCall_2_0; }
	}
	public class EntityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.EntityDsl.Entity");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEntityKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cAttributesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cAttributesAttributeParserRuleCall_3_0 = (RuleCall)cAttributesAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Entity:
		//	'entity' name=ID '{'
		//	attributes+=Attribute*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'entity' name=ID '{' attributes+=Attribute* '}'
		public Group getGroup() { return cGroup; }
		
		//'entity'
		public Keyword getEntityKeyword_0() { return cEntityKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//attributes+=Attribute*
		public Assignment getAttributesAssignment_3() { return cAttributesAssignment_3; }
		
		//Attribute
		public RuleCall getAttributesAttributeParserRuleCall_3_0() { return cAttributesAttributeParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class AttributeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.EntityDsl.Attribute");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cInputTypeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cInputTypeWinFormControlTypeParserRuleCall_3_0 = (RuleCall)cInputTypeAssignment_3.eContents().get(0);
		private final Keyword cCommaKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cLabelTextAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cLabelTextLabelParserRuleCall_5_0 = (RuleCall)cLabelTextAssignment_5.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Attribute:
		//	name=ID ':' '[' inputType=WinFormControlType ',' labelText=Label ']';
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID ':' '[' inputType=WinFormControlType ',' labelText=Label ']'
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_2() { return cLeftSquareBracketKeyword_2; }
		
		//inputType=WinFormControlType
		public Assignment getInputTypeAssignment_3() { return cInputTypeAssignment_3; }
		
		//WinFormControlType
		public RuleCall getInputTypeWinFormControlTypeParserRuleCall_3_0() { return cInputTypeWinFormControlTypeParserRuleCall_3_0; }
		
		//','
		public Keyword getCommaKeyword_4() { return cCommaKeyword_4; }
		
		//labelText=Label
		public Assignment getLabelTextAssignment_5() { return cLabelTextAssignment_5; }
		
		//Label
		public RuleCall getLabelTextLabelParserRuleCall_5_0() { return cLabelTextLabelParserRuleCall_5_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_6() { return cRightSquareBracketKeyword_6; }
	}
	public class LabelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.EntityDsl.Label");
		private final Assignment cTextAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cTextIDTerminalRuleCall_0 = (RuleCall)cTextAssignment.eContents().get(0);
		
		//Label:
		//	text=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//text=ID
		public Assignment getTextAssignment() { return cTextAssignment; }
		
		//ID
		public RuleCall getTextIDTerminalRuleCall_0() { return cTextIDTerminalRuleCall_0; }
	}
	public class WinFormControlTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.EntityDsl.WinFormControlType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cControlTypeAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cControlTypeTextBoxParserRuleCall_0_0 = (RuleCall)cControlTypeAssignment_0.eContents().get(0);
		private final RuleCall cComboBoxParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cCheckBoxParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cRadioButtonGroupParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//WinFormControlType:
		//	controlType=TextBox | ComboBox | CheckBox | RadioButtonGroup;
		@Override public ParserRule getRule() { return rule; }
		
		//controlType=TextBox | ComboBox | CheckBox | RadioButtonGroup
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//controlType=TextBox
		public Assignment getControlTypeAssignment_0() { return cControlTypeAssignment_0; }
		
		//TextBox
		public RuleCall getControlTypeTextBoxParserRuleCall_0_0() { return cControlTypeTextBoxParserRuleCall_0_0; }
		
		//ComboBox
		public RuleCall getComboBoxParserRuleCall_1() { return cComboBoxParserRuleCall_1; }
		
		//CheckBox
		public RuleCall getCheckBoxParserRuleCall_2() { return cCheckBoxParserRuleCall_2; }
		
		//RadioButtonGroup
		public RuleCall getRadioButtonGroupParserRuleCall_3() { return cRadioButtonGroupParserRuleCall_3; }
	}
	public class RadioButtonGroupElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.EntityDsl.RadioButtonGroup");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cNameRadioButtonGroupKeyword_0_0 = (Keyword)cNameAssignment_0.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cButtonsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cButtonsRadioButtonParserRuleCall_2_0 = (RuleCall)cButtonsAssignment_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cLeftSquareBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cRequiredKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cRequiredAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cRequiredBooleanParserRuleCall_6_0 = (RuleCall)cRequiredAssignment_6.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//RadioButtonGroup:
		//	name='RadioButtonGroup' '(' buttons+=RadioButton* ')' '[' 'required=' required=Boolean ']';
		@Override public ParserRule getRule() { return rule; }
		
		//name='RadioButtonGroup' '(' buttons+=RadioButton* ')' '[' 'required=' required=Boolean ']'
		public Group getGroup() { return cGroup; }
		
		//name='RadioButtonGroup'
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//'RadioButtonGroup'
		public Keyword getNameRadioButtonGroupKeyword_0_0() { return cNameRadioButtonGroupKeyword_0_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//buttons+=RadioButton*
		public Assignment getButtonsAssignment_2() { return cButtonsAssignment_2; }
		
		//RadioButton
		public RuleCall getButtonsRadioButtonParserRuleCall_2_0() { return cButtonsRadioButtonParserRuleCall_2_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_4() { return cLeftSquareBracketKeyword_4; }
		
		//'required='
		public Keyword getRequiredKeyword_5() { return cRequiredKeyword_5; }
		
		//required=Boolean
		public Assignment getRequiredAssignment_6() { return cRequiredAssignment_6; }
		
		//Boolean
		public RuleCall getRequiredBooleanParserRuleCall_6_0() { return cRequiredBooleanParserRuleCall_6_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_7() { return cRightSquareBracketKeyword_7; }
	}
	public class RadioButtonElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.EntityDsl.RadioButton");
		private final Assignment cTextAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cTextIDTerminalRuleCall_0 = (RuleCall)cTextAssignment.eContents().get(0);
		
		//RadioButton:
		//	text=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//text=ID
		public Assignment getTextAssignment() { return cTextAssignment; }
		
		//ID
		public RuleCall getTextIDTerminalRuleCall_0() { return cTextIDTerminalRuleCall_0; }
	}
	public class CheckBoxElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.EntityDsl.CheckBox");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final Keyword cNameCheckBoxKeyword_0 = (Keyword)cNameAssignment.eContents().get(0);
		
		//CheckBox:
		//	name='CheckBox';
		@Override public ParserRule getRule() { return rule; }
		
		//name='CheckBox'
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//'CheckBox'
		public Keyword getNameCheckBoxKeyword_0() { return cNameCheckBoxKeyword_0; }
	}
	public class TextBoxElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.EntityDsl.TextBox");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cNameTextBoxKeyword_0_0 = (Keyword)cNameAssignment_0.eContents().get(0);
		private final Keyword cLeftSquareBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cRequiredKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cRequiredAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cRequiredBooleanParserRuleCall_3_0 = (RuleCall)cRequiredAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cMinKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cMinTextLengthAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cMinTextLengthINTTerminalRuleCall_4_1_0 = (RuleCall)cMinTextLengthAssignment_4_1.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cMaxKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cMaxTextLengthAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cMaxTextLengthINTTerminalRuleCall_5_1_0 = (RuleCall)cMaxTextLengthAssignment_5_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//TextBox:
		//	name='TextBox' '[' 'required=' required=Boolean ('min=' minTextLength=INT)? ('max=' maxTextLength=INT)? ']';
		@Override public ParserRule getRule() { return rule; }
		
		//name='TextBox' '[' 'required=' required=Boolean ('min=' minTextLength=INT)? ('max=' maxTextLength=INT)? ']'
		public Group getGroup() { return cGroup; }
		
		//name='TextBox'
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//'TextBox'
		public Keyword getNameTextBoxKeyword_0_0() { return cNameTextBoxKeyword_0_0; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_1() { return cLeftSquareBracketKeyword_1; }
		
		//'required='
		public Keyword getRequiredKeyword_2() { return cRequiredKeyword_2; }
		
		//required=Boolean
		public Assignment getRequiredAssignment_3() { return cRequiredAssignment_3; }
		
		//Boolean
		public RuleCall getRequiredBooleanParserRuleCall_3_0() { return cRequiredBooleanParserRuleCall_3_0; }
		
		//('min=' minTextLength=INT)?
		public Group getGroup_4() { return cGroup_4; }
		
		//'min='
		public Keyword getMinKeyword_4_0() { return cMinKeyword_4_0; }
		
		//minTextLength=INT
		public Assignment getMinTextLengthAssignment_4_1() { return cMinTextLengthAssignment_4_1; }
		
		//INT
		public RuleCall getMinTextLengthINTTerminalRuleCall_4_1_0() { return cMinTextLengthINTTerminalRuleCall_4_1_0; }
		
		//('max=' maxTextLength=INT)?
		public Group getGroup_5() { return cGroup_5; }
		
		//'max='
		public Keyword getMaxKeyword_5_0() { return cMaxKeyword_5_0; }
		
		//maxTextLength=INT
		public Assignment getMaxTextLengthAssignment_5_1() { return cMaxTextLengthAssignment_5_1; }
		
		//INT
		public RuleCall getMaxTextLengthINTTerminalRuleCall_5_1_0() { return cMaxTextLengthINTTerminalRuleCall_5_1_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_6() { return cRightSquareBracketKeyword_6; }
	}
	public class BooleanElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.EntityDsl.Boolean");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final Alternatives cValueAlternatives_0 = (Alternatives)cValueAssignment.eContents().get(0);
		private final Keyword cValueTrueKeyword_0_0 = (Keyword)cValueAlternatives_0.eContents().get(0);
		private final Keyword cValueFalseKeyword_0_1 = (Keyword)cValueAlternatives_0.eContents().get(1);
		
		//Boolean:
		//	value=('true' | 'false');
		@Override public ParserRule getRule() { return rule; }
		
		//value=('true' | 'false')
		public Assignment getValueAssignment() { return cValueAssignment; }
		
		//('true' | 'false')
		public Alternatives getValueAlternatives_0() { return cValueAlternatives_0; }
		
		//'true'
		public Keyword getValueTrueKeyword_0_0() { return cValueTrueKeyword_0_0; }
		
		//'false'
		public Keyword getValueFalseKeyword_0_1() { return cValueFalseKeyword_0_1; }
	}
	public class ComboBoxElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.EntityDsl.ComboBox");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cNameComboBoxKeyword_0_0 = (Keyword)cNameAssignment_0.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cItemsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cItemsComboBoxItemParserRuleCall_2_0 = (RuleCall)cItemsAssignment_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cLeftSquareBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cRequiredKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cRequiredAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cRequiredBooleanParserRuleCall_6_0 = (RuleCall)cRequiredAssignment_6.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//ComboBox:
		//	name='ComboBox' '(' items+=ComboBoxItem* ')' '[' 'required=' required=Boolean ']';
		@Override public ParserRule getRule() { return rule; }
		
		//name='ComboBox' '(' items+=ComboBoxItem* ')' '[' 'required=' required=Boolean ']'
		public Group getGroup() { return cGroup; }
		
		//name='ComboBox'
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//'ComboBox'
		public Keyword getNameComboBoxKeyword_0_0() { return cNameComboBoxKeyword_0_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//items+=ComboBoxItem*
		public Assignment getItemsAssignment_2() { return cItemsAssignment_2; }
		
		//ComboBoxItem
		public RuleCall getItemsComboBoxItemParserRuleCall_2_0() { return cItemsComboBoxItemParserRuleCall_2_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_4() { return cLeftSquareBracketKeyword_4; }
		
		//'required='
		public Keyword getRequiredKeyword_5() { return cRequiredKeyword_5; }
		
		//required=Boolean
		public Assignment getRequiredAssignment_6() { return cRequiredAssignment_6; }
		
		//Boolean
		public RuleCall getRequiredBooleanParserRuleCall_6_0() { return cRequiredBooleanParserRuleCall_6_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_7() { return cRightSquareBracketKeyword_7; }
	}
	public class ComboBoxItemElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.EntityDsl.ComboBoxItem");
		private final Assignment cTextAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cTextIDTerminalRuleCall_0 = (RuleCall)cTextAssignment.eContents().get(0);
		
		//ComboBoxItem:
		//	text=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//text=ID
		public Assignment getTextAssignment() { return cTextAssignment; }
		
		//ID
		public RuleCall getTextIDTerminalRuleCall_0() { return cTextIDTerminalRuleCall_0; }
	}
	
	
	private final DomainmodelElements pDomainmodel;
	private final EntityElements pEntity;
	private final AttributeElements pAttribute;
	private final LabelElements pLabel;
	private final WinFormControlTypeElements pWinFormControlType;
	private final RadioButtonGroupElements pRadioButtonGroup;
	private final RadioButtonElements pRadioButton;
	private final CheckBoxElements pCheckBox;
	private final TextBoxElements pTextBox;
	private final BooleanElements pBoolean;
	private final ComboBoxElements pComboBox;
	private final ComboBoxItemElements pComboBoxItem;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public EntityDslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pDomainmodel = new DomainmodelElements();
		this.pEntity = new EntityElements();
		this.pAttribute = new AttributeElements();
		this.pLabel = new LabelElements();
		this.pWinFormControlType = new WinFormControlTypeElements();
		this.pRadioButtonGroup = new RadioButtonGroupElements();
		this.pRadioButton = new RadioButtonElements();
		this.pCheckBox = new CheckBoxElements();
		this.pTextBox = new TextBoxElements();
		this.pBoolean = new BooleanElements();
		this.pComboBox = new ComboBoxElements();
		this.pComboBoxItem = new ComboBoxItemElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.EntityDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Domainmodel:
	//	'database:' applicationName=ID
	//	elements+=Entity*;
	public DomainmodelElements getDomainmodelAccess() {
		return pDomainmodel;
	}
	
	public ParserRule getDomainmodelRule() {
		return getDomainmodelAccess().getRule();
	}
	
	//Entity:
	//	'entity' name=ID '{'
	//	attributes+=Attribute*
	//	'}';
	public EntityElements getEntityAccess() {
		return pEntity;
	}
	
	public ParserRule getEntityRule() {
		return getEntityAccess().getRule();
	}
	
	//Attribute:
	//	name=ID ':' '[' inputType=WinFormControlType ',' labelText=Label ']';
	public AttributeElements getAttributeAccess() {
		return pAttribute;
	}
	
	public ParserRule getAttributeRule() {
		return getAttributeAccess().getRule();
	}
	
	//Label:
	//	text=ID;
	public LabelElements getLabelAccess() {
		return pLabel;
	}
	
	public ParserRule getLabelRule() {
		return getLabelAccess().getRule();
	}
	
	//WinFormControlType:
	//	controlType=TextBox | ComboBox | CheckBox | RadioButtonGroup;
	public WinFormControlTypeElements getWinFormControlTypeAccess() {
		return pWinFormControlType;
	}
	
	public ParserRule getWinFormControlTypeRule() {
		return getWinFormControlTypeAccess().getRule();
	}
	
	//RadioButtonGroup:
	//	name='RadioButtonGroup' '(' buttons+=RadioButton* ')' '[' 'required=' required=Boolean ']';
	public RadioButtonGroupElements getRadioButtonGroupAccess() {
		return pRadioButtonGroup;
	}
	
	public ParserRule getRadioButtonGroupRule() {
		return getRadioButtonGroupAccess().getRule();
	}
	
	//RadioButton:
	//	text=ID;
	public RadioButtonElements getRadioButtonAccess() {
		return pRadioButton;
	}
	
	public ParserRule getRadioButtonRule() {
		return getRadioButtonAccess().getRule();
	}
	
	//CheckBox:
	//	name='CheckBox';
	public CheckBoxElements getCheckBoxAccess() {
		return pCheckBox;
	}
	
	public ParserRule getCheckBoxRule() {
		return getCheckBoxAccess().getRule();
	}
	
	//TextBox:
	//	name='TextBox' '[' 'required=' required=Boolean ('min=' minTextLength=INT)? ('max=' maxTextLength=INT)? ']';
	public TextBoxElements getTextBoxAccess() {
		return pTextBox;
	}
	
	public ParserRule getTextBoxRule() {
		return getTextBoxAccess().getRule();
	}
	
	//Boolean:
	//	value=('true' | 'false');
	public BooleanElements getBooleanAccess() {
		return pBoolean;
	}
	
	public ParserRule getBooleanRule() {
		return getBooleanAccess().getRule();
	}
	
	//ComboBox:
	//	name='ComboBox' '(' items+=ComboBoxItem* ')' '[' 'required=' required=Boolean ']';
	public ComboBoxElements getComboBoxAccess() {
		return pComboBox;
	}
	
	public ParserRule getComboBoxRule() {
		return getComboBoxAccess().getRule();
	}
	
	//ComboBoxItem:
	//	text=ID;
	public ComboBoxItemElements getComboBoxItemAccess() {
		return pComboBoxItem;
	}
	
	public ParserRule getComboBoxItemRule() {
		return getComboBoxItemAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
