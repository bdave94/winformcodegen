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

import org.xtext.entityDsl.Attribute;
import org.xtext.entityDsl.EntityDslPackage;
import org.xtext.entityDsl.Label;
import org.xtext.entityDsl.WinFormControlType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.entityDsl.impl.AttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.entityDsl.impl.AttributeImpl#getInputType <em>Input Type</em>}</li>
 *   <li>{@link org.xtext.entityDsl.impl.AttributeImpl#getLabelText <em>Label Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeImpl extends MinimalEObjectImpl.Container implements Attribute
{
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
	 * The cached value of the '{@link #getInputType() <em>Input Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getInputType()
	 * @generated
	 * @ordered
	 */
  protected WinFormControlType inputType;

  /**
	 * The cached value of the '{@link #getLabelText() <em>Label Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLabelText()
	 * @generated
	 * @ordered
	 */
  protected Label labelText;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected AttributeImpl()
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
		return EntityDslPackage.Literals.ATTRIBUTE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EntityDslPackage.ATTRIBUTE__NAME, oldName, name));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public WinFormControlType getInputType()
  {
		return inputType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetInputType(WinFormControlType newInputType, NotificationChain msgs)
  {
		WinFormControlType oldInputType = inputType;
		inputType = newInputType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EntityDslPackage.ATTRIBUTE__INPUT_TYPE, oldInputType, newInputType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setInputType(WinFormControlType newInputType)
  {
		if (newInputType != inputType) {
			NotificationChain msgs = null;
			if (inputType != null)
				msgs = ((InternalEObject)inputType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EntityDslPackage.ATTRIBUTE__INPUT_TYPE, null, msgs);
			if (newInputType != null)
				msgs = ((InternalEObject)newInputType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EntityDslPackage.ATTRIBUTE__INPUT_TYPE, null, msgs);
			msgs = basicSetInputType(newInputType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityDslPackage.ATTRIBUTE__INPUT_TYPE, newInputType, newInputType));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Label getLabelText()
  {
		return labelText;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetLabelText(Label newLabelText, NotificationChain msgs)
  {
		Label oldLabelText = labelText;
		labelText = newLabelText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EntityDslPackage.ATTRIBUTE__LABEL_TEXT, oldLabelText, newLabelText);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setLabelText(Label newLabelText)
  {
		if (newLabelText != labelText) {
			NotificationChain msgs = null;
			if (labelText != null)
				msgs = ((InternalEObject)labelText).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EntityDslPackage.ATTRIBUTE__LABEL_TEXT, null, msgs);
			if (newLabelText != null)
				msgs = ((InternalEObject)newLabelText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EntityDslPackage.ATTRIBUTE__LABEL_TEXT, null, msgs);
			msgs = basicSetLabelText(newLabelText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityDslPackage.ATTRIBUTE__LABEL_TEXT, newLabelText, newLabelText));
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
			case EntityDslPackage.ATTRIBUTE__INPUT_TYPE:
				return basicSetInputType(null, msgs);
			case EntityDslPackage.ATTRIBUTE__LABEL_TEXT:
				return basicSetLabelText(null, msgs);
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
			case EntityDslPackage.ATTRIBUTE__NAME:
				return getName();
			case EntityDslPackage.ATTRIBUTE__INPUT_TYPE:
				return getInputType();
			case EntityDslPackage.ATTRIBUTE__LABEL_TEXT:
				return getLabelText();
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
			case EntityDslPackage.ATTRIBUTE__NAME:
				setName((String)newValue);
				return;
			case EntityDslPackage.ATTRIBUTE__INPUT_TYPE:
				setInputType((WinFormControlType)newValue);
				return;
			case EntityDslPackage.ATTRIBUTE__LABEL_TEXT:
				setLabelText((Label)newValue);
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
			case EntityDslPackage.ATTRIBUTE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EntityDslPackage.ATTRIBUTE__INPUT_TYPE:
				setInputType((WinFormControlType)null);
				return;
			case EntityDslPackage.ATTRIBUTE__LABEL_TEXT:
				setLabelText((Label)null);
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
			case EntityDslPackage.ATTRIBUTE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EntityDslPackage.ATTRIBUTE__INPUT_TYPE:
				return inputType != null;
			case EntityDslPackage.ATTRIBUTE__LABEL_TEXT:
				return labelText != null;
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

} //AttributeImpl