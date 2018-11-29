package jio.System.ComponentModel;

import Common.Activation;
import static Common.Helper.Convert;
import static Common.Helper.getGetObjectName;
import static Common.Helper.getReturnObjectName;
import static Common.Helper.ConvertToConcreteInterfaceImplementation;
import Common.Helper;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;
import com.javonet.api.NEnum;
import com.javonet.api.keywords.NRef;
import com.javonet.api.keywords.NOut;
import com.javonet.api.NControlContainer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.lang.*;
import jio.System.ComponentModel.*;
import jio.System.Collections.*;
import jio.System.*;

public class PropertyDescriptorCollection
    implements ICollection, IEnumerable, IList, IDictionary, Iterable<Object> {
  protected NObject javonetHandle;

  @Override
  public Iterator<Object> iterator() {
    return (Iterator<Object>) this.GetEnumerator();
  }

  public PropertyDescriptorCollection(PropertyDescriptor properties) {
    try {
      javonetHandle =
          Javonet.New(
              "System.ComponentModel.PropertyDescriptorCollection", new Object[] {properties});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PropertyDescriptorCollection(PropertyDescriptor[] properties, java.lang.Boolean readOnly) {
    try {
      javonetHandle =
          Javonet.New(
              "System.ComponentModel.PropertyDescriptorCollection",
              new Object[] {properties},
              readOnly);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public PropertyDescriptorCollection(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public IEnumerator GetEnumerator() {
    try {
      Object res = javonetHandle.invoke("GetEnumerator");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Integer ICollection_get_Count() {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("ICollection")
              .invoke("System.Collections.ICollection.get_Count");
      if (res == null) return 0;
      return javonetHandle
          .explicitInterface("ICollection")
          .invoke("System.Collections.ICollection.get_Count");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public Object ICollection_get_SyncRoot() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("ICollection")
              .invoke("System.Collections.ICollection.get_SyncRoot");
      if (res == null) return null;
      return (Object) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Boolean ICollection_get_IsSynchronized() {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("ICollection")
              .invoke("System.Collections.ICollection.get_IsSynchronized");
      if (res == null) return false;
      return javonetHandle
          .explicitInterface("ICollection")
          .invoke("System.Collections.ICollection.get_IsSynchronized");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public IEnumerator IEnumerable_GetEnumerator() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("IEnumerable")
              .invoke("System.Collections.IEnumerable.GetEnumerator");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Object IList_get_Item(java.lang.Integer index) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("IList")
              .invoke("System.Collections.IList.get_Item", index);
      if (res == null) return null;
      return (Object) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void IList_set_Item(java.lang.Integer index, Object value) {
    try {
      javonetHandle
          .explicitInterface("IList")
          .invoke("System.Collections.IList.set_Item", index, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Integer IList_Add(Object value) {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("IList").invoke("System.Collections.IList.Add", value);
      if (res == null) return 0;
      return javonetHandle.explicitInterface("IList").invoke("System.Collections.IList.Add", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Boolean IList_Contains(Object value) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("IList")
              .invoke("System.Collections.IList.Contains", value);
      if (res == null) return false;
      return javonetHandle
          .explicitInterface("IList")
          .invoke("System.Collections.IList.Contains", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public void IList_Clear() {
    try {
      javonetHandle.explicitInterface("IList").invoke("System.Collections.IList.Clear");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Boolean IList_get_IsReadOnly() {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("IList")
              .invoke("System.Collections.IList.get_IsReadOnly");
      if (res == null) return false;
      return javonetHandle
          .explicitInterface("IList")
          .invoke("System.Collections.IList.get_IsReadOnly");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.Boolean IList_get_IsFixedSize() {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("IList")
              .invoke("System.Collections.IList.get_IsFixedSize");
      if (res == null) return false;
      return javonetHandle
          .explicitInterface("IList")
          .invoke("System.Collections.IList.get_IsFixedSize");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.Integer IList_IndexOf(Object value) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("IList")
              .invoke("System.Collections.IList.IndexOf", value);
      if (res == null) return 0;
      return javonetHandle
          .explicitInterface("IList")
          .invoke("System.Collections.IList.IndexOf", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public void IList_Insert(java.lang.Integer index, Object value) {
    try {
      javonetHandle
          .explicitInterface("IList")
          .invoke("System.Collections.IList.Insert", index, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void IList_Remove(Object value) {
    try {
      javonetHandle.explicitInterface("IList").invoke("System.Collections.IList.Remove", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void IList_RemoveAt(java.lang.Integer index) {
    try {
      javonetHandle.explicitInterface("IList").invoke("System.Collections.IList.RemoveAt", index);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public Object IDictionary_get_Item(Object key) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("IDictionary")
              .invoke("System.Collections.IDictionary.get_Item", key);
      if (res == null) return null;
      return (Object) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void IDictionary_set_Item(Object key, Object value) {
    try {
      javonetHandle
          .explicitInterface("IDictionary")
          .invoke("System.Collections.IDictionary.set_Item", key, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public ICollection IDictionary_get_Keys() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("IDictionary")
              .invoke("System.Collections.IDictionary.get_Keys");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public ICollection IDictionary_get_Values() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("IDictionary")
              .invoke("System.Collections.IDictionary.get_Values");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Boolean IDictionary_Contains(Object key) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("IDictionary")
              .invoke("System.Collections.IDictionary.Contains", key);
      if (res == null) return false;
      return javonetHandle
          .explicitInterface("IDictionary")
          .invoke("System.Collections.IDictionary.Contains", key);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public void IDictionary_Add(Object key, Object value) {
    try {
      javonetHandle
          .explicitInterface("IDictionary")
          .invoke("System.Collections.IDictionary.Add", key, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Clear() {
    try {
      javonetHandle.explicitInterface("IDictionary").invoke("System.Collections.IDictionary.Clear");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Boolean IDictionary_get_IsReadOnly() {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("IDictionary")
              .invoke("System.Collections.IDictionary.get_IsReadOnly");
      if (res == null) return false;
      return javonetHandle
          .explicitInterface("IDictionary")
          .invoke("System.Collections.IDictionary.get_IsReadOnly");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.Boolean IDictionary_get_IsFixedSize() {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("IDictionary")
              .invoke("System.Collections.IDictionary.get_IsFixedSize");
      if (res == null) return false;
      return javonetHandle
          .explicitInterface("IDictionary")
          .invoke("System.Collections.IDictionary.get_IsFixedSize");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public IDictionaryEnumerator IDictionary_GetEnumerator() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("IDictionary")
              .invoke("System.Collections.IDictionary.GetEnumerator");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void IDictionary_Remove(Object key) {
    try {
      javonetHandle
          .explicitInterface("IDictionary")
          .invoke("System.Collections.IDictionary.Remove", key);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
