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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.entityDsl.DataType;
import org.xtext.entityDsl.EntityDslPackage;
import org.xtext.entityDsl.RadioButton;
import org.xtext.entityDsl.RadioButtonGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Radio Button Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.entityDsl.impl.RadioButtonGroupImpl#getButtons <em>Buttons</em>}</li>
 *   <li>{@link org.xtext.entityDsl.impl.RadioButtonGroupImpl#getDataType <em>Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RadioButtonGroupImpl extends WinFormControlTypeImpl implements RadioButtonGroup
{
  /**
   * The cached value of the '{@link #getButtons() <em>Buttons</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getButtons()
   * @generated
   * @ordered
   */
  protected EList<RadioButton> buttons;

  /**
   * The cached value of the '{@link #getDataType() <em>Data Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataType()
   * @generated
   * @ordered
   */
  protected DataType dataType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RadioButtonGroupImpl()
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
    return EntityDslPackage.Literals.RADIO_BUTTON_GROUP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RadioButton> getButtons()
  {
    if (buttons == null)
    {
      buttons = new EObjectContainmentEList<RadioButton>(RadioButton.class, this, EntityDslPackage.RADIO_BUTTON_GROUP__BUTTONS);
    }
    return buttons;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataType getDataType()
  {
    return dataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDataType(DataType newDataType, NotificationChain msgs)
  {
    DataType oldDataType = dataType;
    dataType = newDataType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EntityDslPackage.RADIO_BUTTON_GROUP__DATA_TYPE, oldDataType, newDataType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDataType(DataType newDataType)
  {
    if (newDataType != dataType)
    {
      NotificationChain msgs = null;
      if (dataType != null)
        msgs = ((InternalEObject)dataType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EntityDslPackage.RADIO_BUTTON_GROUP__DATA_TYPE, null, msgs);
      if (newDataType != null)
        msgs = ((InternalEObject)newDataType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EntityDslPackage.RADIO_BUTTON_GROUP__DATA_TYPE, null, msgs);
      msgs = basicSetDataType(newDataType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EntityDslPackage.RADIO_BUTTON_GROUP__DATA_TYPE, newDataType, newDataType));
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
      case EntityDslPackage.RADIO_BUTTON_GROUP__BUTTONS:
        return ((InternalEList<?>)getButtons()).basicRemove(otherEnd, msgs);
      case EntityDslPackage.RADIO_BUTTON_GROUP__DATA_TYPE:
        return basicSetDataType(null, msgs);
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
      case EntityDslPackage.RADIO_BUTTON_GROUP__BUTTONS:
        return getButtons();
      case EntityDslPackage.RADIO_BUTTON_GROUP__DATA_TYPE:
        return getDataType();
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
      case EntityDslPackage.RADIO_BUTTON_GROUP__BUTTONS:
        getButtons().clear();
        getButtons().addAll((Collection<? extends RadioButton>)newValue);
        return;
      case EntityDslPackage.RADIO_BUTTON_GROUP__DATA_TYPE:
        setDataType((DataType)newValue);
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
      case EntityDslPackage.RADIO_BUTTON_GROUP__BUTTONS:
        getButtons().clear();
        return;
      case EntityDslPackage.RADIO_BUTTON_GROUP__DATA_TYPE:
        setDataType((DataType)null);
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
      case EntityDslPackage.RADIO_BUTTON_GROUP__BUTTONS:
        return buttons != null && !buttons.isEmpty();
      case EntityDslPackage.RADIO_BUTTON_GROUP__DATA_TYPE:
        return dataType != null;
    }
    return super.eIsSet(featureID);
  }

} //RadioButtonGroupImpl
