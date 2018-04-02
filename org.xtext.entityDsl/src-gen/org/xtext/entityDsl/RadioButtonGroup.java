/**
 * generated by Xtext 2.11.0
 */
package org.xtext.entityDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Radio Button Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.entityDsl.RadioButtonGroup#getButtons <em>Buttons</em>}</li>
 *   <li>{@link org.xtext.entityDsl.RadioButtonGroup#getDataType <em>Data Type</em>}</li>
 * </ul>
 *
 * @see org.xtext.entityDsl.EntityDslPackage#getRadioButtonGroup()
 * @model
 * @generated
 */
public interface RadioButtonGroup extends WinFormControlType
{
  /**
   * Returns the value of the '<em><b>Buttons</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.entityDsl.RadioButton}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Buttons</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Buttons</em>' containment reference list.
   * @see org.xtext.entityDsl.EntityDslPackage#getRadioButtonGroup_Buttons()
   * @model containment="true"
   * @generated
   */
  EList<RadioButton> getButtons();

  /**
   * Returns the value of the '<em><b>Data Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data Type</em>' containment reference.
   * @see #setDataType(DataType)
   * @see org.xtext.entityDsl.EntityDslPackage#getRadioButtonGroup_DataType()
   * @model containment="true"
   * @generated
   */
  DataType getDataType();

  /**
   * Sets the value of the '{@link org.xtext.entityDsl.RadioButtonGroup#getDataType <em>Data Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data Type</em>' containment reference.
   * @see #getDataType()
   * @generated
   */
  void setDataType(DataType value);

} // RadioButtonGroup
