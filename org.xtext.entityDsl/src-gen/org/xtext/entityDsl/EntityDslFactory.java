/**
 * generated by Xtext 2.11.0
 */
package org.xtext.entityDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.entityDsl.EntityDslPackage
 * @generated
 */
public interface EntityDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EntityDslFactory eINSTANCE = org.xtext.entityDsl.impl.EntityDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Domainmodel</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Domainmodel</em>'.
   * @generated
   */
  Domainmodel createDomainmodel();

  /**
   * Returns a new object of class '<em>Entity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entity</em>'.
   * @generated
   */
  Entity createEntity();

  /**
   * Returns a new object of class '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute</em>'.
   * @generated
   */
  Attribute createAttribute();

  /**
   * Returns a new object of class '<em>Data Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Type</em>'.
   * @generated
   */
  DataType createDataType();

  /**
   * Returns a new object of class '<em>Label</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Label</em>'.
   * @generated
   */
  Label createLabel();

  /**
   * Returns a new object of class '<em>Win Form Control Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Win Form Control Type</em>'.
   * @generated
   */
  WinFormControlType createWinFormControlType();

  /**
   * Returns a new object of class '<em>Track Bar</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Track Bar</em>'.
   * @generated
   */
  TrackBar createTrackBar();

  /**
   * Returns a new object of class '<em>Spinner</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Spinner</em>'.
   * @generated
   */
  Spinner createSpinner();

  /**
   * Returns a new object of class '<em>Radio Button Group</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Radio Button Group</em>'.
   * @generated
   */
  RadioButtonGroup createRadioButtonGroup();

  /**
   * Returns a new object of class '<em>Radio Button</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Radio Button</em>'.
   * @generated
   */
  RadioButton createRadioButton();

  /**
   * Returns a new object of class '<em>Check Box</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Check Box</em>'.
   * @generated
   */
  CheckBox createCheckBox();

  /**
   * Returns a new object of class '<em>Text Box</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Text Box</em>'.
   * @generated
   */
  TextBox createTextBox();

  /**
   * Returns a new object of class '<em>Combo Box</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Combo Box</em>'.
   * @generated
   */
  ComboBox createComboBox();

  /**
   * Returns a new object of class '<em>Combo Box Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Combo Box Item</em>'.
   * @generated
   */
  ComboBoxItem createComboBoxItem();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  EntityDslPackage getEntityDslPackage();

} //EntityDslFactory
