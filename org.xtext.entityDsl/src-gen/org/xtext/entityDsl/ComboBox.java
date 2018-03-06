/**
 * generated by Xtext 2.11.0
 */
package org.xtext.entityDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Combo Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.entityDsl.ComboBox#getItems <em>Items</em>}</li>
 *   <li>{@link org.xtext.entityDsl.ComboBox#getRequired <em>Required</em>}</li>
 * </ul>
 *
 * @see org.xtext.entityDsl.EntityDslPackage#getComboBox()
 * @model
 * @generated
 */
public interface ComboBox extends WinFormControlType
{
  /**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link org.xtext.entityDsl.ComboBoxItem}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see org.xtext.entityDsl.EntityDslPackage#getComboBox_Items()
	 * @model containment="true"
	 * @generated
	 */
  EList<ComboBoxItem> getItems();

  /**
	 * Returns the value of the '<em><b>Required</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Required</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' containment reference.
	 * @see #setRequired(org.xtext.entityDsl.Boolean)
	 * @see org.xtext.entityDsl.EntityDslPackage#getComboBox_Required()
	 * @model containment="true"
	 * @generated
	 */
  org.xtext.entityDsl.Boolean getRequired();

  /**
	 * Sets the value of the '{@link org.xtext.entityDsl.ComboBox#getRequired <em>Required</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' containment reference.
	 * @see #getRequired()
	 * @generated
	 */
  void setRequired(org.xtext.entityDsl.Boolean value);

} // ComboBox
