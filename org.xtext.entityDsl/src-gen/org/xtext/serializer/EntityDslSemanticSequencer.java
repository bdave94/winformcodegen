/*
 * generated by Xtext 2.11.0
 */
package org.xtext.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.entityDsl.Attribute;
import org.xtext.entityDsl.CheckBox;
import org.xtext.entityDsl.ComboBox;
import org.xtext.entityDsl.ComboBoxItem;
import org.xtext.entityDsl.Domainmodel;
import org.xtext.entityDsl.Entity;
import org.xtext.entityDsl.EntityDslPackage;
import org.xtext.entityDsl.Label;
import org.xtext.entityDsl.RadioButton;
import org.xtext.entityDsl.RadioButtonGroup;
import org.xtext.entityDsl.TextBox;
import org.xtext.entityDsl.WinFormControlType;
import org.xtext.services.EntityDslGrammarAccess;

@SuppressWarnings("all")
public class EntityDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private EntityDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == EntityDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case EntityDslPackage.ATTRIBUTE:
				sequence_Attribute(context, (Attribute) semanticObject); 
				return; 
			case EntityDslPackage.BOOLEAN:
				sequence_Boolean(context, (org.xtext.entityDsl.Boolean) semanticObject); 
				return; 
			case EntityDslPackage.CHECK_BOX:
				sequence_CheckBox(context, (CheckBox) semanticObject); 
				return; 
			case EntityDslPackage.COMBO_BOX:
				sequence_ComboBox(context, (ComboBox) semanticObject); 
				return; 
			case EntityDslPackage.COMBO_BOX_ITEM:
				sequence_ComboBoxItem(context, (ComboBoxItem) semanticObject); 
				return; 
			case EntityDslPackage.DOMAINMODEL:
				sequence_Domainmodel(context, (Domainmodel) semanticObject); 
				return; 
			case EntityDslPackage.ENTITY:
				sequence_Entity(context, (Entity) semanticObject); 
				return; 
			case EntityDslPackage.LABEL:
				sequence_Label(context, (Label) semanticObject); 
				return; 
			case EntityDslPackage.RADIO_BUTTON:
				sequence_RadioButton(context, (RadioButton) semanticObject); 
				return; 
			case EntityDslPackage.RADIO_BUTTON_GROUP:
				sequence_RadioButtonGroup(context, (RadioButtonGroup) semanticObject); 
				return; 
			case EntityDslPackage.TEXT_BOX:
				sequence_TextBox(context, (TextBox) semanticObject); 
				return; 
			case EntityDslPackage.WIN_FORM_CONTROL_TYPE:
				sequence_WinFormControlType(context, (WinFormControlType) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Attribute returns Attribute
	 *
	 * Constraint:
	 *     (name=ID inputType=WinFormControlType labelText=Label)
	 */
	protected void sequence_Attribute(ISerializationContext context, Attribute semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EntityDslPackage.Literals.ATTRIBUTE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EntityDslPackage.Literals.ATTRIBUTE__NAME));
			if (transientValues.isValueTransient(semanticObject, EntityDslPackage.Literals.ATTRIBUTE__INPUT_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EntityDslPackage.Literals.ATTRIBUTE__INPUT_TYPE));
			if (transientValues.isValueTransient(semanticObject, EntityDslPackage.Literals.ATTRIBUTE__LABEL_TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EntityDslPackage.Literals.ATTRIBUTE__LABEL_TEXT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAttributeAccess().getInputTypeWinFormControlTypeParserRuleCall_3_0(), semanticObject.getInputType());
		feeder.accept(grammarAccess.getAttributeAccess().getLabelTextLabelParserRuleCall_5_0(), semanticObject.getLabelText());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Boolean returns Boolean
	 *
	 * Constraint:
	 *     (value='true' | value='false')
	 */
	protected void sequence_Boolean(ISerializationContext context, org.xtext.entityDsl.Boolean semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     WinFormControlType returns CheckBox
	 *     CheckBox returns CheckBox
	 *
	 * Constraint:
	 *     name='CheckBox'
	 */
	protected void sequence_CheckBox(ISerializationContext context, CheckBox semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EntityDslPackage.Literals.WIN_FORM_CONTROL_TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EntityDslPackage.Literals.WIN_FORM_CONTROL_TYPE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCheckBoxAccess().getNameCheckBoxKeyword_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ComboBoxItem returns ComboBoxItem
	 *
	 * Constraint:
	 *     text=ID
	 */
	protected void sequence_ComboBoxItem(ISerializationContext context, ComboBoxItem semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EntityDslPackage.Literals.COMBO_BOX_ITEM__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EntityDslPackage.Literals.COMBO_BOX_ITEM__TEXT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getComboBoxItemAccess().getTextIDTerminalRuleCall_0(), semanticObject.getText());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     WinFormControlType returns ComboBox
	 *     ComboBox returns ComboBox
	 *
	 * Constraint:
	 *     (name='ComboBox' items+=ComboBoxItem* required=Boolean)
	 */
	protected void sequence_ComboBox(ISerializationContext context, ComboBox semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Domainmodel returns Domainmodel
	 *
	 * Constraint:
	 *     (applicationName=ID elements+=Entity*)
	 */
	protected void sequence_Domainmodel(ISerializationContext context, Domainmodel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Entity returns Entity
	 *
	 * Constraint:
	 *     (name=ID attributes+=Attribute*)
	 */
	protected void sequence_Entity(ISerializationContext context, Entity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Label returns Label
	 *
	 * Constraint:
	 *     text=ID
	 */
	protected void sequence_Label(ISerializationContext context, Label semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EntityDslPackage.Literals.LABEL__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EntityDslPackage.Literals.LABEL__TEXT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLabelAccess().getTextIDTerminalRuleCall_0(), semanticObject.getText());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     WinFormControlType returns RadioButtonGroup
	 *     RadioButtonGroup returns RadioButtonGroup
	 *
	 * Constraint:
	 *     (name='RadioButtonGroup' buttons+=RadioButton* required=Boolean)
	 */
	protected void sequence_RadioButtonGroup(ISerializationContext context, RadioButtonGroup semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RadioButton returns RadioButton
	 *
	 * Constraint:
	 *     text=ID
	 */
	protected void sequence_RadioButton(ISerializationContext context, RadioButton semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EntityDslPackage.Literals.RADIO_BUTTON__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EntityDslPackage.Literals.RADIO_BUTTON__TEXT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRadioButtonAccess().getTextIDTerminalRuleCall_0(), semanticObject.getText());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TextBox returns TextBox
	 *
	 * Constraint:
	 *     (name='TextBox' required=Boolean minTextLength=INT? maxTextLength=INT?)
	 */
	protected void sequence_TextBox(ISerializationContext context, TextBox semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     WinFormControlType returns WinFormControlType
	 *
	 * Constraint:
	 *     controlType=TextBox
	 */
	protected void sequence_WinFormControlType(ISerializationContext context, WinFormControlType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EntityDslPackage.Literals.WIN_FORM_CONTROL_TYPE__CONTROL_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EntityDslPackage.Literals.WIN_FORM_CONTROL_TYPE__CONTROL_TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getWinFormControlTypeAccess().getControlTypeTextBoxParserRuleCall_0_0(), semanticObject.getControlType());
		feeder.finish();
	}
	
	
}