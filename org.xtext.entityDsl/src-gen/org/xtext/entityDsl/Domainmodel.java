/**
 * generated by Xtext 2.11.0
 */
package org.xtext.entityDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domainmodel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.entityDsl.Domainmodel#getApplicationName <em>Application Name</em>}</li>
 *   <li>{@link org.xtext.entityDsl.Domainmodel#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see org.xtext.entityDsl.EntityDslPackage#getDomainmodel()
 * @model
 * @generated
 */
public interface Domainmodel extends EObject
{
  /**
   * Returns the value of the '<em><b>Application Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Application Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Application Name</em>' attribute.
   * @see #setApplicationName(String)
   * @see org.xtext.entityDsl.EntityDslPackage#getDomainmodel_ApplicationName()
   * @model
   * @generated
   */
  String getApplicationName();

  /**
   * Sets the value of the '{@link org.xtext.entityDsl.Domainmodel#getApplicationName <em>Application Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Application Name</em>' attribute.
   * @see #getApplicationName()
   * @generated
   */
  void setApplicationName(String value);

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.entityDsl.Entity}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see org.xtext.entityDsl.EntityDslPackage#getDomainmodel_Elements()
   * @model containment="true"
   * @generated
   */
  EList<Entity> getElements();

} // Domainmodel
