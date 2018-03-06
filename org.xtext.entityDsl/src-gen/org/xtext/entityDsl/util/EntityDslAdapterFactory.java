/**
 * generated by Xtext 2.11.0
 */
package org.xtext.entityDsl.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.xtext.entityDsl.Attribute;
import org.xtext.entityDsl.CheckBox;
import org.xtext.entityDsl.ComboBox;
import org.xtext.entityDsl.ComboBoxItem;
import org.xtext.entityDsl.Domainmodel;
import org.xtext.entityDsl.Entity;
import org.xtext.entityDsl.EntityDslPackage;
import org.xtext.entityDsl.Label;
import org.xtext.entityDsl.RadioButton;
import org.xtext.entityDsl.RadioButtonGroup;
import org.xtext.entityDsl.TextBox;
import org.xtext.entityDsl.WinFormControlType;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.entityDsl.EntityDslPackage
 * @generated
 */
public class EntityDslAdapterFactory extends AdapterFactoryImpl
{
  /**
	 * The cached model package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static EntityDslPackage modelPackage;

  /**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EntityDslAdapterFactory()
  {
		if (modelPackage == null) {
			modelPackage = EntityDslPackage.eINSTANCE;
		}
	}

  /**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
  @Override
  public boolean isFactoryForType(Object object)
  {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

  /**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected EntityDslSwitch<Adapter> modelSwitch =
    new EntityDslSwitch<Adapter>() {
			@Override
			public Adapter caseDomainmodel(Domainmodel object) {
				return createDomainmodelAdapter();
			}
			@Override
			public Adapter caseEntity(Entity object) {
				return createEntityAdapter();
			}
			@Override
			public Adapter caseAttribute(Attribute object) {
				return createAttributeAdapter();
			}
			@Override
			public Adapter caseLabel(Label object) {
				return createLabelAdapter();
			}
			@Override
			public Adapter caseWinFormControlType(WinFormControlType object) {
				return createWinFormControlTypeAdapter();
			}
			@Override
			public Adapter caseRadioButtonGroup(RadioButtonGroup object) {
				return createRadioButtonGroupAdapter();
			}
			@Override
			public Adapter caseRadioButton(RadioButton object) {
				return createRadioButtonAdapter();
			}
			@Override
			public Adapter caseCheckBox(CheckBox object) {
				return createCheckBoxAdapter();
			}
			@Override
			public Adapter caseTextBox(TextBox object) {
				return createTextBoxAdapter();
			}
			@Override
			public Adapter caseBoolean(org.xtext.entityDsl.Boolean object) {
				return createBooleanAdapter();
			}
			@Override
			public Adapter caseComboBox(ComboBox object) {
				return createComboBoxAdapter();
			}
			@Override
			public Adapter caseComboBoxItem(ComboBoxItem object) {
				return createComboBoxItemAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

  /**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
  @Override
  public Adapter createAdapter(Notifier target)
  {
		return modelSwitch.doSwitch((EObject)target);
	}


  /**
	 * Creates a new adapter for an object of class '{@link org.xtext.entityDsl.Domainmodel <em>Domainmodel</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.entityDsl.Domainmodel
	 * @generated
	 */
  public Adapter createDomainmodelAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.xtext.entityDsl.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.entityDsl.Entity
	 * @generated
	 */
  public Adapter createEntityAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.xtext.entityDsl.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.entityDsl.Attribute
	 * @generated
	 */
  public Adapter createAttributeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.xtext.entityDsl.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.entityDsl.Label
	 * @generated
	 */
  public Adapter createLabelAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.xtext.entityDsl.WinFormControlType <em>Win Form Control Type</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.entityDsl.WinFormControlType
	 * @generated
	 */
  public Adapter createWinFormControlTypeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.xtext.entityDsl.RadioButtonGroup <em>Radio Button Group</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.entityDsl.RadioButtonGroup
	 * @generated
	 */
  public Adapter createRadioButtonGroupAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.xtext.entityDsl.RadioButton <em>Radio Button</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.entityDsl.RadioButton
	 * @generated
	 */
  public Adapter createRadioButtonAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.xtext.entityDsl.CheckBox <em>Check Box</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.entityDsl.CheckBox
	 * @generated
	 */
  public Adapter createCheckBoxAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.xtext.entityDsl.TextBox <em>Text Box</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.entityDsl.TextBox
	 * @generated
	 */
  public Adapter createTextBoxAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.xtext.entityDsl.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.entityDsl.Boolean
	 * @generated
	 */
  public Adapter createBooleanAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.xtext.entityDsl.ComboBox <em>Combo Box</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.entityDsl.ComboBox
	 * @generated
	 */
  public Adapter createComboBoxAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.xtext.entityDsl.ComboBoxItem <em>Combo Box Item</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.xtext.entityDsl.ComboBoxItem
	 * @generated
	 */
  public Adapter createComboBoxItemAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
  public Adapter createEObjectAdapter()
  {
		return null;
	}

} //EntityDslAdapterFactory
