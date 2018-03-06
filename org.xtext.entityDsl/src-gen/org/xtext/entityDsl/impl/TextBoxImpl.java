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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Box</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.entityDsl.impl.TextBoxImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.entityDsl.impl.TextBoxImpl#getRequired <em>Required</em>}</li>
 *   <li>{@link org.xtext.entityDsl.impl.TextBoxImpl#getMinTextLength <em>Min Text Length</em>}</li>
 *   <li>{@link org.xtext.entityDsl.impl.TextBoxImpl#getMaxTextLength <em>Max Text Length</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextBoxImpl extends MinimalEObjectImpl.Container implements TextBox
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
	 * The cached value of the '{@link #getRequired() <em>Required</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getRequired()
	 * @generated
	 * @ordered
	 */
  protected org.xtext.entityDsl.Boolean required;

  /**
	 * The default value of the '{@link #getMinTextLength() <em>Min Text Length</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMinTextLength()
	 * @generated
	 * @ordered
	 */
  protected static final int MIN_TEXT_LENGTH_EDEFAULT = 0;

  /**
	 * The cached value of the '{@link #getMinTextLength() <em>Min Text Length</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMinTextLength()
	 * @generated
	 * @ordered
	 */
  protected int minTextLength = MIN_TEXT_LENGTH_EDEFAULT;

  /**
	 * The default value of the '{@link #getMaxTextLength() <em>Max Text Length</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMaxTextLength()
	 * @generated
	 * @ordered
	 */
  protected static final int MAX_TEXT_LENGTH_EDEFAULT = 0;

  /**
	 * The cached value of the '{@link #getMaxTextLength() <em>Max Text Length</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMaxTextLength()
	 * @generated
	 * @ordered
	 */
  protected int maxTextLength = MAX_TEXT_LENGTH_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected TextBoxImpl()
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
		return EntityDslPackage.Literals.TEXT_BOX;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EntityDslPackage.TEXT_BOX__NAME, oldName, name));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public org.xtext.entityDsl.Boolean getRequired()
  {
		return required;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetRequired(org.xtext.entityDsl.Boolean newRequired, NotificationChain msgs)
  {
		org.xtext.entityDsl.Boolean oldRequired = required;
		required = newRequired;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EntityDslPackage.TEXT_BOX__REQUIRED, oldRequired, newRequired);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setRequired(org.xtext.entityDsl.Boolean newRequired)
  {
		if (newRequired != required) {
			NotificationChain msgs = null;
			if (required != null)
				msgs = ((InternalEObject)required).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EntityDslPackage.TEXT_BOX__REQUIRED, null, msgs);
			if (newRequired != null)
				msgs = ((InternalEObject)newRequired).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EntityDslPackage.TEXT_BOX__REQUIRED, null, msgs);
			msgs = basicSetRequired(newRequired, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityDslPackage.TEXT_BOX__REQUIRED, newRequired, newRequired));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public int getMinTextLength()
  {
		return minTextLength;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setMinTextLength(int newMinTextLength)
  {
		int oldMinTextLength = minTextLength;
		minTextLength = newMinTextLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityDslPackage.TEXT_BOX__MIN_TEXT_LENGTH, oldMinTextLength, minTextLength));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public int getMaxTextLength()
  {
		return maxTextLength;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setMaxTextLength(int newMaxTextLength)
  {
		int oldMaxTextLength = maxTextLength;
		maxTextLength = newMaxTextLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityDslPackage.TEXT_BOX__MAX_TEXT_LENGTH, oldMaxTextLength, maxTextLength));
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
			case EntityDslPackage.TEXT_BOX__REQUIRED:
				return basicSetRequired(null, msgs);
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
			case EntityDslPackage.TEXT_BOX__NAME:
				return getName();
			case EntityDslPackage.TEXT_BOX__REQUIRED:
				return getRequired();
			case EntityDslPackage.TEXT_BOX__MIN_TEXT_LENGTH:
				return getMinTextLength();
			case EntityDslPackage.TEXT_BOX__MAX_TEXT_LENGTH:
				return getMaxTextLength();
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
			case EntityDslPackage.TEXT_BOX__NAME:
				setName((String)newValue);
				return;
			case EntityDslPackage.TEXT_BOX__REQUIRED:
				setRequired((org.xtext.entityDsl.Boolean)newValue);
				return;
			case EntityDslPackage.TEXT_BOX__MIN_TEXT_LENGTH:
				setMinTextLength((Integer)newValue);
				return;
			case EntityDslPackage.TEXT_BOX__MAX_TEXT_LENGTH:
				setMaxTextLength((Integer)newValue);
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
			case EntityDslPackage.TEXT_BOX__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EntityDslPackage.TEXT_BOX__REQUIRED:
				setRequired((org.xtext.entityDsl.Boolean)null);
				return;
			case EntityDslPackage.TEXT_BOX__MIN_TEXT_LENGTH:
				setMinTextLength(MIN_TEXT_LENGTH_EDEFAULT);
				return;
			case EntityDslPackage.TEXT_BOX__MAX_TEXT_LENGTH:
				setMaxTextLength(MAX_TEXT_LENGTH_EDEFAULT);
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
			case EntityDslPackage.TEXT_BOX__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EntityDslPackage.TEXT_BOX__REQUIRED:
				return required != null;
			case EntityDslPackage.TEXT_BOX__MIN_TEXT_LENGTH:
				return minTextLength != MIN_TEXT_LENGTH_EDEFAULT;
			case EntityDslPackage.TEXT_BOX__MAX_TEXT_LENGTH:
				return maxTextLength != MAX_TEXT_LENGTH_EDEFAULT;
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
		result.append(", minTextLength: ");
		result.append(minTextLength);
		result.append(", maxTextLength: ");
		result.append(maxTextLength);
		result.append(')');
		return result.toString();
	}

} //TextBoxImpl
