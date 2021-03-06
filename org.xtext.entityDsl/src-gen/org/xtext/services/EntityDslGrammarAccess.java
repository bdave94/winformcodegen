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
		private final Assignment cRequiredAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cRequiredAsteriskKeyword_0_0 = (Keyword)cRequiredAssignment_0.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cLeftSquareBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cInputTypeAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cInputTypeWinFormControlTypeParserRuleCall_4_0 = (RuleCall)cInputTypeAssignment_4.eContents().get(0);
		private final Keyword cCommaKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cLabelTextAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cLabelTextLabelParserRuleCall_6_0 = (RuleCall)cLabelTextAssignment_6.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//Attribute:
		//	required='*'? name=ID ':' '[' inputType=WinFormControlType ',' labelText=Label ']';
		@Override public ParserRule getRule() { return rule; }
		
		//required='*'? name=ID ':' '[' inputType=WinFormControlType ',' labelText=Label ']'
		public Group getGroup() { return cGroup; }
		
		//required='*'?
		public Assignment getRequiredAssignment_0() { return cRequiredAssignment_0; }
		
		//'*'
		public Keyword getRequiredAsteriskKeyword_0_0() { return cRequiredAsteriskKeyword_0_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_3() { return cLeftSquareBracketKeyword_3; }
		
		//inputType=WinFormControlType
		public Assignment getInputTypeAssignment_4() { return cInputTypeAssignment_4; }
		
		//WinFormControlType
		public RuleCall getInputTypeWinFormControlTypeParserRuleCall_4_0() { return cInputTypeWinFormControlTypeParserRuleCall_4_0; }
		
		//','
		public Keyword getCommaKeyword_5() { return cCommaKeyword_5; }
		
		//labelText=Label
		public Assignment getLabelTextAssignment_6() { return cLabelTextAssignment_6; }
		
		//Label
		public RuleCall getLabelTextLabelParserRuleCall_6_0() { return cLabelTextLabelParserRuleCall_6_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_7() { return cRightSquareBracketKeyword_7; }
	}
	public class DataTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.EntityDsl.DataType");
		private final Assignment cTypeAssignment = (Assignment)rule.eContents().get(1);
		private final Alternatives cTypeAlternatives_0 = (Alternatives)cTypeAssignment.eContents().get(0);
		private final Keyword cTypeStringKeyword_0_0 = (Keyword)cTypeAlternatives_0.eContents().get(0);
		private final Keyword cTypeIntKeyword_0_1 = (Keyword)cTypeAlternatives_0.eContents().get(1);
		private final Keyword cTypeDoubleKeyword_0_2 = (Keyword)cTypeAlternatives_0.eContents().get(2);
		
		//DataType:
		//	type=('string' | 'int' | 'double');
		@Override public ParserRule getRule() { return rule; }
		
		//type=('string' | 'int' | 'double')
		public Assignment getTypeAssignment() { return cTypeAssignment; }
		
		//('string' | 'int' | 'double')
		public Alternatives getTypeAlternatives_0() { return cTypeAlternatives_0; }
		
		//'string'
		public Keyword getTypeStringKeyword_0_0() { return cTypeStringKeyword_0_0; }
		
		//'int'
		public Keyword getTypeIntKeyword_0_1() { return cTypeIntKeyword_0_1; }
		
		//'double'
		public Keyword getTypeDoubleKeyword_0_2() { return cTypeDoubleKeyword_0_2; }
	}
	public class LabelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.EntityDsl.Label");
		private final Assignment cTextAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cTextSTRINGTerminalRuleCall_0 = (RuleCall)cTextAssignment.eContents().get(0);
		
		//Label:
		//	text=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//text=STRING
		public Assignment getTextAssignment() { return cTextAssignment; }
		
		//STRING
		public RuleCall getTextSTRINGTerminalRuleCall_0() { return cTextSTRINGTerminalRuleCall_0; }
	}
	public class WinFormControlTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.EntityDsl.WinFormControlType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cControlTypeAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cControlTypeTextBoxParserRuleCall_0_0 = (RuleCall)cControlTypeAssignment_0.eContents().get(0);
		private final RuleCall cComboBoxParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cCheckBoxParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cRadioButtonGroupParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cSpinnerParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cTrackBarParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		
		//WinFormControlType:
		//	controlType=TextBox | ComboBox | CheckBox | RadioButtonGroup | Spinner | TrackBar;
		@Override public ParserRule getRule() { return rule; }
		
		//controlType=TextBox | ComboBox | CheckBox | RadioButtonGroup | Spinner | TrackBar
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
		
		//Spinner
		public RuleCall getSpinnerParserRuleCall_4() { return cSpinnerParserRuleCall_4; }
		
		//TrackBar
		public RuleCall getTrackBarParserRuleCall_5() { return cTrackBarParserRuleCall_5; }
	}
	public class TrackBarElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.EntityDsl.TrackBar");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cNameTrackBarKeyword_0_0 = (Keyword)cNameAssignment_0.eContents().get(0);
		private final Keyword cLeftSquareBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cDataTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cDataTypeDataTypeParserRuleCall_2_0 = (RuleCall)cDataTypeAssignment_2.eContents().get(0);
		private final Keyword cCommaKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cDefaultTickAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cDefaultTickINTTerminalRuleCall_4_0 = (RuleCall)cDefaultTickAssignment_4.eContents().get(0);
		private final Keyword cCommaKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cIncrementAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cIncrementINTTerminalRuleCall_6_0 = (RuleCall)cIncrementAssignment_6.eContents().get(0);
		private final Keyword cCommaKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Group cGroup_8 = (Group)cGroup.eContents().get(8);
		private final Assignment cDenominatorAssignment_8_0 = (Assignment)cGroup_8.eContents().get(0);
		private final RuleCall cDenominatorINTTerminalRuleCall_8_0_0 = (RuleCall)cDenominatorAssignment_8_0.eContents().get(0);
		private final Keyword cCommaKeyword_8_1 = (Keyword)cGroup_8.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Assignment cMinimumValueAssignment_10 = (Assignment)cGroup.eContents().get(10);
		private final RuleCall cMinimumValueINTTerminalRuleCall_10_0 = (RuleCall)cMinimumValueAssignment_10.eContents().get(0);
		private final Keyword cCommaKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cMaximumValueAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cMaximumValueINTTerminalRuleCall_12_0 = (RuleCall)cMaximumValueAssignment_12.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Group cGroup_14 = (Group)cGroup.eContents().get(14);
		private final Keyword cLeftParenthesisKeyword_14_0 = (Keyword)cGroup_14.eContents().get(0);
		private final Assignment cStringValuesAssignment_14_1 = (Assignment)cGroup_14.eContents().get(1);
		private final RuleCall cStringValuesSTRINGTerminalRuleCall_14_1_0 = (RuleCall)cStringValuesAssignment_14_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_14_2 = (Keyword)cGroup_14.eContents().get(2);
		private final Keyword cRightSquareBracketKeyword_15 = (Keyword)cGroup.eContents().get(15);
		
		//TrackBar:
		//	name='TrackBar' '[' dataType=DataType ',' defaultTick=INT ',' increment=INT ',' (denominator=INT ',')? '('
		//	minimumValue=INT ',' maximumValue=INT ')' ('(' stringValues+=STRING* ')')? ']';
		@Override public ParserRule getRule() { return rule; }
		
		//name='TrackBar' '[' dataType=DataType ',' defaultTick=INT ',' increment=INT ',' (denominator=INT ',')? '('
		//minimumValue=INT ',' maximumValue=INT ')' ('(' stringValues+=STRING* ')')? ']'
		public Group getGroup() { return cGroup; }
		
		//name='TrackBar'
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//'TrackBar'
		public Keyword getNameTrackBarKeyword_0_0() { return cNameTrackBarKeyword_0_0; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_1() { return cLeftSquareBracketKeyword_1; }
		
		//dataType=DataType
		public Assignment getDataTypeAssignment_2() { return cDataTypeAssignment_2; }
		
		//DataType
		public RuleCall getDataTypeDataTypeParserRuleCall_2_0() { return cDataTypeDataTypeParserRuleCall_2_0; }
		
		//','
		public Keyword getCommaKeyword_3() { return cCommaKeyword_3; }
		
		//defaultTick=INT
		public Assignment getDefaultTickAssignment_4() { return cDefaultTickAssignment_4; }
		
		//INT
		public RuleCall getDefaultTickINTTerminalRuleCall_4_0() { return cDefaultTickINTTerminalRuleCall_4_0; }
		
		//','
		public Keyword getCommaKeyword_5() { return cCommaKeyword_5; }
		
		//increment=INT
		public Assignment getIncrementAssignment_6() { return cIncrementAssignment_6; }
		
		//INT
		public RuleCall getIncrementINTTerminalRuleCall_6_0() { return cIncrementINTTerminalRuleCall_6_0; }
		
		//','
		public Keyword getCommaKeyword_7() { return cCommaKeyword_7; }
		
		//(denominator=INT ',')?
		public Group getGroup_8() { return cGroup_8; }
		
		//denominator=INT
		public Assignment getDenominatorAssignment_8_0() { return cDenominatorAssignment_8_0; }
		
		//INT
		public RuleCall getDenominatorINTTerminalRuleCall_8_0_0() { return cDenominatorINTTerminalRuleCall_8_0_0; }
		
		//','
		public Keyword getCommaKeyword_8_1() { return cCommaKeyword_8_1; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_9() { return cLeftParenthesisKeyword_9; }
		
		//minimumValue=INT
		public Assignment getMinimumValueAssignment_10() { return cMinimumValueAssignment_10; }
		
		//INT
		public RuleCall getMinimumValueINTTerminalRuleCall_10_0() { return cMinimumValueINTTerminalRuleCall_10_0; }
		
		//','
		public Keyword getCommaKeyword_11() { return cCommaKeyword_11; }
		
		//maximumValue=INT
		public Assignment getMaximumValueAssignment_12() { return cMaximumValueAssignment_12; }
		
		//INT
		public RuleCall getMaximumValueINTTerminalRuleCall_12_0() { return cMaximumValueINTTerminalRuleCall_12_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_13() { return cRightParenthesisKeyword_13; }
		
		//('(' stringValues+=STRING* ')')?
		public Group getGroup_14() { return cGroup_14; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_14_0() { return cLeftParenthesisKeyword_14_0; }
		
		//stringValues+=STRING*
		public Assignment getStringValuesAssignment_14_1() { return cStringValuesAssignment_14_1; }
		
		//STRING
		public RuleCall getStringValuesSTRINGTerminalRuleCall_14_1_0() { return cStringValuesSTRINGTerminalRuleCall_14_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_14_2() { return cRightParenthesisKeyword_14_2; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_15() { return cRightSquareBracketKeyword_15; }
	}
	public class SpinnerElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.EntityDsl.Spinner");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cNameSpinnerKeyword_0_0 = (Keyword)cNameAssignment_0.eContents().get(0);
		private final Keyword cLeftSquareBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cDefaultValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cDefaultValueINTTerminalRuleCall_2_0 = (RuleCall)cDefaultValueAssignment_2.eContents().get(0);
		private final Keyword cCommaKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cLeftParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cMinimumValueAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cMinimumValueINTTerminalRuleCall_5_0 = (RuleCall)cMinimumValueAssignment_5.eContents().get(0);
		private final Keyword cCommaKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cMaximumValueAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cMaximumValueINTTerminalRuleCall_7_0 = (RuleCall)cMaximumValueAssignment_7.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Keyword cRightSquareBracketKeyword_9 = (Keyword)cGroup.eContents().get(9);
		
		//Spinner:
		//	name='Spinner' '[' defaultValue=INT ',' '(' minimumValue=INT ',' maximumValue=INT ')' ']';
		@Override public ParserRule getRule() { return rule; }
		
		//name='Spinner' '[' defaultValue=INT ',' '(' minimumValue=INT ',' maximumValue=INT ')' ']'
		public Group getGroup() { return cGroup; }
		
		//name='Spinner'
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//'Spinner'
		public Keyword getNameSpinnerKeyword_0_0() { return cNameSpinnerKeyword_0_0; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_1() { return cLeftSquareBracketKeyword_1; }
		
		//defaultValue=INT
		public Assignment getDefaultValueAssignment_2() { return cDefaultValueAssignment_2; }
		
		//INT
		public RuleCall getDefaultValueINTTerminalRuleCall_2_0() { return cDefaultValueINTTerminalRuleCall_2_0; }
		
		//','
		public Keyword getCommaKeyword_3() { return cCommaKeyword_3; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_4() { return cLeftParenthesisKeyword_4; }
		
		//minimumValue=INT
		public Assignment getMinimumValueAssignment_5() { return cMinimumValueAssignment_5; }
		
		//INT
		public RuleCall getMinimumValueINTTerminalRuleCall_5_0() { return cMinimumValueINTTerminalRuleCall_5_0; }
		
		//','
		public Keyword getCommaKeyword_6() { return cCommaKeyword_6; }
		
		//maximumValue=INT
		public Assignment getMaximumValueAssignment_7() { return cMaximumValueAssignment_7; }
		
		//INT
		public RuleCall getMaximumValueINTTerminalRuleCall_7_0() { return cMaximumValueINTTerminalRuleCall_7_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_8() { return cRightParenthesisKeyword_8; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_9() { return cRightSquareBracketKeyword_9; }
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
		private final Assignment cDataTypeAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cDataTypeDataTypeParserRuleCall_5_0 = (RuleCall)cDataTypeAssignment_5.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//RadioButtonGroup:
		//	name='RadioButtonGroup' '(' buttons+=RadioButton* ')' '[' dataType=DataType ']';
		@Override public ParserRule getRule() { return rule; }
		
		//name='RadioButtonGroup' '(' buttons+=RadioButton* ')' '[' dataType=DataType ']'
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
		
		//dataType=DataType
		public Assignment getDataTypeAssignment_5() { return cDataTypeAssignment_5; }
		
		//DataType
		public RuleCall getDataTypeDataTypeParserRuleCall_5_0() { return cDataTypeDataTypeParserRuleCall_5_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_6() { return cRightSquareBracketKeyword_6; }
	}
	public class RadioButtonElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.EntityDsl.RadioButton");
		private final Assignment cTextAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cTextSTRINGTerminalRuleCall_0 = (RuleCall)cTextAssignment.eContents().get(0);
		
		//RadioButton:
		//	text=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//text=STRING
		public Assignment getTextAssignment() { return cTextAssignment; }
		
		//STRING
		public RuleCall getTextSTRINGTerminalRuleCall_0() { return cTextSTRINGTerminalRuleCall_0; }
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
		private final Assignment cDataTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cDataTypeDataTypeParserRuleCall_2_0 = (RuleCall)cDataTypeAssignment_2.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cMinTextLengthAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cMinTextLengthINTTerminalRuleCall_4_0 = (RuleCall)cMinTextLengthAssignment_4.eContents().get(0);
		private final Keyword cCommaKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cMaxTextLengthAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cMaxTextLengthINTTerminalRuleCall_6_0 = (RuleCall)cMaxTextLengthAssignment_6.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Keyword cRightSquareBracketKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//TextBox:
		//	name='TextBox' '[' dataType=DataType '(' minTextLength=INT? ',' maxTextLength=INT? ')' ']';
		@Override public ParserRule getRule() { return rule; }
		
		//name='TextBox' '[' dataType=DataType '(' minTextLength=INT? ',' maxTextLength=INT? ')' ']'
		public Group getGroup() { return cGroup; }
		
		//name='TextBox'
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//'TextBox'
		public Keyword getNameTextBoxKeyword_0_0() { return cNameTextBoxKeyword_0_0; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_1() { return cLeftSquareBracketKeyword_1; }
		
		//dataType=DataType
		public Assignment getDataTypeAssignment_2() { return cDataTypeAssignment_2; }
		
		//DataType
		public RuleCall getDataTypeDataTypeParserRuleCall_2_0() { return cDataTypeDataTypeParserRuleCall_2_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_3() { return cLeftParenthesisKeyword_3; }
		
		//minTextLength=INT?
		public Assignment getMinTextLengthAssignment_4() { return cMinTextLengthAssignment_4; }
		
		//INT
		public RuleCall getMinTextLengthINTTerminalRuleCall_4_0() { return cMinTextLengthINTTerminalRuleCall_4_0; }
		
		//','
		public Keyword getCommaKeyword_5() { return cCommaKeyword_5; }
		
		//maxTextLength=INT?
		public Assignment getMaxTextLengthAssignment_6() { return cMaxTextLengthAssignment_6; }
		
		//INT
		public RuleCall getMaxTextLengthINTTerminalRuleCall_6_0() { return cMaxTextLengthINTTerminalRuleCall_6_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_7() { return cRightParenthesisKeyword_7; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_8() { return cRightSquareBracketKeyword_8; }
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
		private final Assignment cDataTypeAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cDataTypeDataTypeParserRuleCall_5_0 = (RuleCall)cDataTypeAssignment_5.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//ComboBox:
		//	name='ComboBox' '(' items+=ComboBoxItem* ')' '[' dataType=DataType ']';
		@Override public ParserRule getRule() { return rule; }
		
		//name='ComboBox' '(' items+=ComboBoxItem* ')' '[' dataType=DataType ']'
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
		
		//dataType=DataType
		public Assignment getDataTypeAssignment_5() { return cDataTypeAssignment_5; }
		
		//DataType
		public RuleCall getDataTypeDataTypeParserRuleCall_5_0() { return cDataTypeDataTypeParserRuleCall_5_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_6() { return cRightSquareBracketKeyword_6; }
	}
	public class ComboBoxItemElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.EntityDsl.ComboBoxItem");
		private final Assignment cTextAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cTextSTRINGTerminalRuleCall_0 = (RuleCall)cTextAssignment.eContents().get(0);
		
		//ComboBoxItem:
		//	text=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//text=STRING
		public Assignment getTextAssignment() { return cTextAssignment; }
		
		//STRING
		public RuleCall getTextSTRINGTerminalRuleCall_0() { return cTextSTRINGTerminalRuleCall_0; }
	}
	
	
	private final DomainmodelElements pDomainmodel;
	private final EntityElements pEntity;
	private final AttributeElements pAttribute;
	private final DataTypeElements pDataType;
	private final LabelElements pLabel;
	private final WinFormControlTypeElements pWinFormControlType;
	private final TrackBarElements pTrackBar;
	private final SpinnerElements pSpinner;
	private final RadioButtonGroupElements pRadioButtonGroup;
	private final RadioButtonElements pRadioButton;
	private final CheckBoxElements pCheckBox;
	private final TextBoxElements pTextBox;
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
		this.pDataType = new DataTypeElements();
		this.pLabel = new LabelElements();
		this.pWinFormControlType = new WinFormControlTypeElements();
		this.pTrackBar = new TrackBarElements();
		this.pSpinner = new SpinnerElements();
		this.pRadioButtonGroup = new RadioButtonGroupElements();
		this.pRadioButton = new RadioButtonElements();
		this.pCheckBox = new CheckBoxElements();
		this.pTextBox = new TextBoxElements();
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
	//	required='*'? name=ID ':' '[' inputType=WinFormControlType ',' labelText=Label ']';
	public AttributeElements getAttributeAccess() {
		return pAttribute;
	}
	
	public ParserRule getAttributeRule() {
		return getAttributeAccess().getRule();
	}
	
	//DataType:
	//	type=('string' | 'int' | 'double');
	public DataTypeElements getDataTypeAccess() {
		return pDataType;
	}
	
	public ParserRule getDataTypeRule() {
		return getDataTypeAccess().getRule();
	}
	
	//Label:
	//	text=STRING;
	public LabelElements getLabelAccess() {
		return pLabel;
	}
	
	public ParserRule getLabelRule() {
		return getLabelAccess().getRule();
	}
	
	//WinFormControlType:
	//	controlType=TextBox | ComboBox | CheckBox | RadioButtonGroup | Spinner | TrackBar;
	public WinFormControlTypeElements getWinFormControlTypeAccess() {
		return pWinFormControlType;
	}
	
	public ParserRule getWinFormControlTypeRule() {
		return getWinFormControlTypeAccess().getRule();
	}
	
	//TrackBar:
	//	name='TrackBar' '[' dataType=DataType ',' defaultTick=INT ',' increment=INT ',' (denominator=INT ',')? '('
	//	minimumValue=INT ',' maximumValue=INT ')' ('(' stringValues+=STRING* ')')? ']';
	public TrackBarElements getTrackBarAccess() {
		return pTrackBar;
	}
	
	public ParserRule getTrackBarRule() {
		return getTrackBarAccess().getRule();
	}
	
	//Spinner:
	//	name='Spinner' '[' defaultValue=INT ',' '(' minimumValue=INT ',' maximumValue=INT ')' ']';
	public SpinnerElements getSpinnerAccess() {
		return pSpinner;
	}
	
	public ParserRule getSpinnerRule() {
		return getSpinnerAccess().getRule();
	}
	
	//RadioButtonGroup:
	//	name='RadioButtonGroup' '(' buttons+=RadioButton* ')' '[' dataType=DataType ']';
	public RadioButtonGroupElements getRadioButtonGroupAccess() {
		return pRadioButtonGroup;
	}
	
	public ParserRule getRadioButtonGroupRule() {
		return getRadioButtonGroupAccess().getRule();
	}
	
	//RadioButton:
	//	text=STRING;
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
	//	name='TextBox' '[' dataType=DataType '(' minTextLength=INT? ',' maxTextLength=INT? ')' ']';
	public TextBoxElements getTextBoxAccess() {
		return pTextBox;
	}
	
	public ParserRule getTextBoxRule() {
		return getTextBoxAccess().getRule();
	}
	
	//ComboBox:
	//	name='ComboBox' '(' items+=ComboBoxItem* ')' '[' dataType=DataType ']';
	public ComboBoxElements getComboBoxAccess() {
		return pComboBox;
	}
	
	public ParserRule getComboBoxRule() {
		return getComboBoxAccess().getRule();
	}
	
	//ComboBoxItem:
	//	text=STRING;
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
