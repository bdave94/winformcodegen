/**
 * generated by Xtext 2.11.0
 */
package org.xtext.entityDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.entityDsl.EntityDslPackage;
import org.xtext.entityDsl.TextBox;
import org.xtext.entityDsl.WinFormControlType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Win Form Control Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.entityDsl.impl.WinFormControlTypeImpl#getControlType <em>Control Type</em>}</li>
 *   <li>{@link org.xtext.entityDsl.impl.WinFormControlTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WinFormControlTypeImpl extends MinimalEObjectImpl.Container implements WinFormControlType
{
  /**
	 * The cached value of the '{@link #getControlType() <em>Control Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getControlType()
	 * @generated
	 * @ordered
	 */
  protected TextBox controlType;

  /**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
  protected static final String NAME_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
  protected String name = NAME_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected WinFormControlTypeImpl()
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
		return EntityDslPackage.Literals.WIN_FORM_CONTROL_TYPE;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TextBox getControlType()
  {
		return controlType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetControlType(TextBox newControlType, NotificationChain msgs)
  {
		TextBox oldControlType = controlType;
		controlType = newControlType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EntityDslPackage.WIN_FORM_CONTROL_TYPE__CONTROL_TYPE, oldControlType, newControlType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setControlType(TextBox newControlType)
  {
		if (newControlType != controlType) {
			NotificationChain msgs = null;
			if (controlType != null)
				msgs = ((InternalEObject)controlType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EntityDslPackage.WIN_FORM_CONTROL_TYPE__CONTROL_TYPE, null, msgs);
			if (newControlType != null)
				msgs = ((InternalEObject)newControlType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EntityDslPackage.WIN_FORM_CONTROL_TYPE__CONTROL_TYPE, null, msgs);
			msgs = basicSetControlType(newControlType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityDslPackage.WIN_FORM_CONTROL_TYPE__CONTROL_TYPE, newControlType, newControlType));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getName()
  {
		return name;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setName(String newName)
  {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityDslPackage.WIN_FORM_CONTROL_TYPE__NAME, oldName, name));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case EntityDslPackage.WIN_FORM_CONTROL_TYPE__CONTROL_TYPE:
				return basicSetControlType(null, msgs);
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
		switch (featureID) {
			case EntityDslPackage.WIN_FORM_CONTROL_TYPE__CONTROL_TYPE:
				return getControlType();
			case EntityDslPackage.WIN_FORM_CONTROL_TYPE__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case EntityDslPackage.WIN_FORM_CONTROL_TYPE__CONTROL_TYPE:
				setControlType((TextBox)newValue);
				return;
			case EntityDslPackage.WIN_FORM_CONTROL_TYPE__NAME:
				setName((String)newValue);
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
		switch (featureID) {
			case EntityDslPackage.WIN_FORM_CONTROL_TYPE__CONTROL_TYPE:
				setControlType((TextBox)null);
				return;
			case EntityDslPackage.WIN_FORM_CONTROL_TYPE__NAME:
				setName(NAME_EDEFAULT);
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
		switch (featureID) {
			case EntityDslPackage.WIN_FORM_CONTROL_TYPE__CONTROL_TYPE:
				return controlType != null;
			case EntityDslPackage.WIN_FORM_CONTROL_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //WinFormControlTypeImpl
