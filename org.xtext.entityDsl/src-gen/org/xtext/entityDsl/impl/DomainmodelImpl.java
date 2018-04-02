/**
 * generated by Xtext 2.11.0
 */
package org.xtext.entityDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.entityDsl.Domainmodel;
import org.xtext.entityDsl.Entity;
import org.xtext.entityDsl.EntityDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domainmodel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.entityDsl.impl.DomainmodelImpl#getApplicationName <em>Application Name</em>}</li>
 *   <li>{@link org.xtext.entityDsl.impl.DomainmodelImpl#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainmodelImpl extends MinimalEObjectImpl.Container implements Domainmodel
{
  /**
   * The default value of the '{@link #getApplicationName() <em>Application Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getApplicationName()
   * @generated
   * @ordered
   */
  protected static final String APPLICATION_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getApplicationName() <em>Application Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getApplicationName()
   * @generated
   * @ordered
   */
  protected String applicationName = APPLICATION_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElements()
   * @generated
   * @ordered
   */
  protected EList<Entity> elements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DomainmodelImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return EntityDslPackage.Literals.DOMAINMODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getApplicationName()
  {
    return applicationName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setApplicationName(String newApplicationName)
  {
    String oldApplicationName = applicationName;
    applicationName = newApplicationName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EntityDslPackage.DOMAINMODEL__APPLICATION_NAME, oldApplicationName, applicationName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Entity> getElements()
  {
    if (elements == null)
    {
      elements = new EObjectContainmentEList<Entity>(Entity.class, this, EntityDslPackage.DOMAINMODEL__ELEMENTS);
    }
    return elements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case EntityDslPackage.DOMAINMODEL__ELEMENTS:
        return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case EntityDslPackage.DOMAINMODEL__APPLICATION_NAME:
        return getApplicationName();
      case EntityDslPackage.DOMAINMODEL__ELEMENTS:
        return getElements();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EntityDslPackage.DOMAINMODEL__APPLICATION_NAME:
        setApplicationName((String)newValue);
        return;
      case EntityDslPackage.DOMAINMODEL__ELEMENTS:
        getElements().clear();
        getElements().addAll((Collection<? extends Entity>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case EntityDslPackage.DOMAINMODEL__APPLICATION_NAME:
        setApplicationName(APPLICATION_NAME_EDEFAULT);
        return;
      case EntityDslPackage.DOMAINMODEL__ELEMENTS:
        getElements().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case EntityDslPackage.DOMAINMODEL__APPLICATION_NAME:
        return APPLICATION_NAME_EDEFAULT == null ? applicationName != null : !APPLICATION_NAME_EDEFAULT.equals(applicationName);
      case EntityDslPackage.DOMAINMODEL__ELEMENTS:
        return elements != null && !elements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (applicationName: ");
    result.append(applicationName);
    result.append(')');
    return result.toString();
  }

} //DomainmodelImpl
