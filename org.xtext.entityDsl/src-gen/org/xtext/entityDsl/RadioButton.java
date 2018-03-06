/**
 * generated by Xtext 2.11.0
 */
package org.xtext.entityDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Radio Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.entityDsl.RadioButton#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see org.xtext.entityDsl.EntityDslPackage#getRadioButton()
 * @model
 * @generated
 */
public interface RadioButton extends EObject
{
  /**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.xtext.entityDsl.EntityDslPackage#getRadioButton_Text()
	 * @model
	 * @generated
	 */
  String getText();

  /**
	 * Sets the value of the '{@link org.xtext.entityDsl.RadioButton#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
  void setText(String value);

} // RadioButton
