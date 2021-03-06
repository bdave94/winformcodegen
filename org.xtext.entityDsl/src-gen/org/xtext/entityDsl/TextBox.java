/**
 * generated by Xtext 2.11.0
 */
package org.xtext.entityDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.entityDsl.TextBox#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.entityDsl.TextBox#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.xtext.entityDsl.TextBox#getMinTextLength <em>Min Text Length</em>}</li>
 *   <li>{@link org.xtext.entityDsl.TextBox#getMaxTextLength <em>Max Text Length</em>}</li>
 * </ul>
 *
 * @see org.xtext.entityDsl.EntityDslPackage#getTextBox()
 * @model
 * @generated
 */
public interface TextBox extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.entityDsl.EntityDslPackage#getTextBox_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.entityDsl.TextBox#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see org.xtext.entityDsl.EntityDslPackage#getTextBox_DataType()
   * @model containment="true"
   * @generated
   */
  DataType getDataType();

  /**
   * Sets the value of the '{@link org.xtext.entityDsl.TextBox#getDataType <em>Data Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data Type</em>' containment reference.
   * @see #getDataType()
   * @generated
   */
  void setDataType(DataType value);

  /**
   * Returns the value of the '<em><b>Min Text Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Min Text Length</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Min Text Length</em>' attribute.
   * @see #setMinTextLength(int)
   * @see org.xtext.entityDsl.EntityDslPackage#getTextBox_MinTextLength()
   * @model
   * @generated
   */
  int getMinTextLength();

  /**
   * Sets the value of the '{@link org.xtext.entityDsl.TextBox#getMinTextLength <em>Min Text Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Min Text Length</em>' attribute.
   * @see #getMinTextLength()
   * @generated
   */
  void setMinTextLength(int value);

  /**
   * Returns the value of the '<em><b>Max Text Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Max Text Length</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max Text Length</em>' attribute.
   * @see #setMaxTextLength(int)
   * @see org.xtext.entityDsl.EntityDslPackage#getTextBox_MaxTextLength()
   * @model
   * @generated
   */
  int getMaxTextLength();

  /**
   * Sets the value of the '{@link org.xtext.entityDsl.TextBox#getMaxTextLength <em>Max Text Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max Text Length</em>' attribute.
   * @see #getMaxTextLength()
   * @generated
   */
  void setMaxTextLength(int value);

} // TextBox
