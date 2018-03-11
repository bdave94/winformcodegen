/**
 * generated by Xtext 2.11.0
 */
package org.xtext.entityDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.entityDsl.EntityDslPackage;
import org.xtext.entityDsl.Spinner;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spinner</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.entityDsl.impl.SpinnerImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.xtext.entityDsl.impl.SpinnerImpl#getMinimumValue <em>Minimum Value</em>}</li>
 *   <li>{@link org.xtext.entityDsl.impl.SpinnerImpl#getMaximumValue <em>Maximum Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpinnerImpl extends WinFormControlTypeImpl implements Spinner
{
  /**
	 * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
  protected static final int DEFAULT_VALUE_EDEFAULT = 0;

  /**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
  protected int defaultValue = DEFAULT_VALUE_EDEFAULT;

  /**
	 * The default value of the '{@link #getMinimumValue() <em>Minimum Value</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMinimumValue()
	 * @generated
	 * @ordered
	 */
  protected static final int MINIMUM_VALUE_EDEFAULT = 0;

  /**
	 * The cached value of the '{@link #getMinimumValue() <em>Minimum Value</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMinimumValue()
	 * @generated
	 * @ordered
	 */
  protected int minimumValue = MINIMUM_VALUE_EDEFAULT;

  /**
	 * The default value of the '{@link #getMaximumValue() <em>Maximum Value</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMaximumValue()
	 * @generated
	 * @ordered
	 */
  protected static final int MAXIMUM_VALUE_EDEFAULT = 0;

  /**
	 * The cached value of the '{@link #getMaximumValue() <em>Maximum Value</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMaximumValue()
	 * @generated
	 * @ordered
	 */
  protected int maximumValue = MAXIMUM_VALUE_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected SpinnerImpl()
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
		return EntityDslPackage.Literals.SPINNER;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public int getDefaultValue()
  {
		return defaultValue;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setDefaultValue(int newDefaultValue)
  {
		int oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityDslPackage.SPINNER__DEFAULT_VALUE, oldDefaultValue, defaultValue));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public int getMinimumValue()
  {
		return minimumValue;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setMinimumValue(int newMinimumValue)
  {
		int oldMinimumValue = minimumValue;
		minimumValue = newMinimumValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityDslPackage.SPINNER__MINIMUM_VALUE, oldMinimumValue, minimumValue));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public int getMaximumValue()
  {
		return maximumValue;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setMaximumValue(int newMaximumValue)
  {
		int oldMaximumValue = maximumValue;
		maximumValue = newMaximumValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityDslPackage.SPINNER__MAXIMUM_VALUE, oldMaximumValue, maximumValue));
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
			case EntityDslPackage.SPINNER__DEFAULT_VALUE:
				return getDefaultValue();
			case EntityDslPackage.SPINNER__MINIMUM_VALUE:
				return getMinimumValue();
			case EntityDslPackage.SPINNER__MAXIMUM_VALUE:
				return getMaximumValue();
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
			case EntityDslPackage.SPINNER__DEFAULT_VALUE:
				setDefaultValue((Integer)newValue);
				return;
			case EntityDslPackage.SPINNER__MINIMUM_VALUE:
				setMinimumValue((Integer)newValue);
				return;
			case EntityDslPackage.SPINNER__MAXIMUM_VALUE:
				setMaximumValue((Integer)newValue);
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
			case EntityDslPackage.SPINNER__DEFAULT_VALUE:
				setDefaultValue(DEFAULT_VALUE_EDEFAULT);
				return;
			case EntityDslPackage.SPINNER__MINIMUM_VALUE:
				setMinimumValue(MINIMUM_VALUE_EDEFAULT);
				return;
			case EntityDslPackage.SPINNER__MAXIMUM_VALUE:
				setMaximumValue(MAXIMUM_VALUE_EDEFAULT);
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
			case EntityDslPackage.SPINNER__DEFAULT_VALUE:
				return defaultValue != DEFAULT_VALUE_EDEFAULT;
			case EntityDslPackage.SPINNER__MINIMUM_VALUE:
				return minimumValue != MINIMUM_VALUE_EDEFAULT;
			case EntityDslPackage.SPINNER__MAXIMUM_VALUE:
				return maximumValue != MAXIMUM_VALUE_EDEFAULT;
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
		result.append(" (defaultValue: ");
		result.append(defaultValue);
		result.append(", minimumValue: ");
		result.append(minimumValue);
		result.append(", maximumValue: ");
		result.append(maximumValue);
		result.append(')');
		return result.toString();
	}

} //SpinnerImpl