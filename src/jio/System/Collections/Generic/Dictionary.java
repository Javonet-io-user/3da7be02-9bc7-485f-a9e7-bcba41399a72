package jio.System.Collections.Generic;

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
import jio.System.Collections.Generic.*;
import jio.System.Runtime.Serialization.*;
import jio.System.*;
import jio.System.Collections.*;

public class Dictionary<TKey, TValue>
    implements jio.System.Collections.Generic.IDictionary<TKey, TValue>,
        jio.System.Collections.Generic.ICollection<KeyValuePair<TKey, TValue>>,
        jio.System.Collections.Generic.IEnumerable<KeyValuePair<TKey, TValue>>,
        jio.System.Collections.IEnumerable,
        jio.System.Collections.IDictionary,
        jio.System.Collections.ICollection,
        IReadOnlyDictionary<TKey, TValue>,
        IReadOnlyCollection<KeyValuePair<TKey, TValue>>,
        ISerializable,
        IDeserializationCallback,
        Iterable<KeyValuePair<TKey, TValue>> {
  protected NObject javonetHandle;

  @Override
  public Iterator<KeyValuePair<TKey, TValue>> iterator() {
    return (Iterator<KeyValuePair<TKey, TValue>>) this.GetEnumerator();
  }
  /** GetProperty */

  public jio.System.Collections.Generic.IEqualityComparer<TKey> getComparer() {
    try {
      Object res = javonetHandle.<NObject>get("Comparer");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public java.lang.Integer getCount() {
    try {
      java.lang.Integer res = javonetHandle.explicitInterface("ICollection").invoke("Count");
      if (res == null) return 0;
      return javonetHandle.explicitInterface("ICollection").invoke("Count");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  public KeyCollection<TKey, TValue> getKeysProperty() {
    try {
      Object res = javonetHandle.<NObject>get("Keys");
      if (res == null) return null;
      return new KeyCollection<TKey, TValue>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public ValueCollection<TKey, TValue> getValuesProperty() {
    try {
      Object res = javonetHandle.<NObject>get("Values");
      if (res == null) return null;
      return new ValueCollection<TKey, TValue>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void set_Item(TKey key, TValue value) {
    try {
      javonetHandle.invoke("set_Item", key, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public TValue get_Item(TKey key, Class<?> returnType) {
    try {
      Object res = javonetHandle.invoke("get_Item", key);
      if (res == null) return null;
      return (TValue) Convert(res, returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GenericConstructor */

  public Dictionary(Class<?> TKey, Class<?> TValue) {
    try {
      javonetHandle =
          Javonet.getType(
                  "System.Collections.Generic.Dictionary`2",
                  getReturnObjectName(TKey),
                  getReturnObjectName(TValue))
              .create();
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GenericConstructor */

  public Dictionary(java.lang.Integer capacity, Class<?> TKey, Class<?> TValue) {
    try {
      javonetHandle =
          Javonet.getType(
                  "System.Collections.Generic.Dictionary`2",
                  getReturnObjectName(TKey),
                  getReturnObjectName(TValue))
              .create();
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GenericConstructor */

  public Dictionary(
      jio.System.Collections.Generic.IEqualityComparer<TKey> comparer,
      Class<?> TKey,
      Class<?> TValue) {
    try {
      javonetHandle =
          Javonet.getType(
                  "System.Collections.Generic.Dictionary`2",
                  getReturnObjectName(TKey),
                  getReturnObjectName(TValue))
              .create();
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GenericConstructor */

  public Dictionary(
      java.lang.Integer capacity,
      jio.System.Collections.Generic.IEqualityComparer<TKey> comparer,
      Class<?> TKey,
      Class<?> TValue) {
    try {
      javonetHandle =
          Javonet.getType(
                  "System.Collections.Generic.Dictionary`2",
                  getReturnObjectName(TKey),
                  getReturnObjectName(TValue))
              .create();
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GenericConstructor */

  public Dictionary(
      jio.System.Collections.Generic.IDictionary<TKey, TValue> dictionary,
      jio.System.Collections.Generic.IEqualityComparer<TKey> comparer,
      Class<?> TKey,
      Class<?> TValue) {
    try {
      javonetHandle =
          Javonet.getType(
                  "System.Collections.Generic.Dictionary`2",
                  getReturnObjectName(TKey),
                  getReturnObjectName(TValue))
              .create();
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GenericConstructor */

  public Dictionary(
      jio.System.Collections.Generic.IDictionary<TKey, TValue> dictionary,
      Class<?> TKey,
      Class<?> TValue) {
    try {
      javonetHandle =
          Javonet.getType(
                  "System.Collections.Generic.Dictionary`2",
                  getReturnObjectName(TKey),
                  getReturnObjectName(TValue))
              .create();
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Dictionary(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void Add(TKey key, TValue value) {
    try {
      javonetHandle.invoke("Add", key, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Clear() {
    try {
      javonetHandle.explicitInterface("IDictionary").invoke("Clear");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Boolean ContainsKey(TKey key) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("ContainsKey", key);
      if (res == null) return false;
      return javonetHandle.invoke("ContainsKey", key);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.Object get_Values() {
    try {
      Object res =
          javonetHandle.invoke(
              "System.Collections.Generic.IReadOnlyDictionary<TKey,TValue>.get_Values");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Boolean Remove(TKey key) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("Remove", key);
      if (res == null) return false;
      return javonetHandle.invoke("Remove", key);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.Boolean TryGetValue(TKey key, TValue value) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("TryGetValue", key, value);
      if (res == null) return false;
      return javonetHandle.invoke("TryGetValue", key, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.Boolean ContainsValue(TValue value) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("ContainsValue", value);
      if (res == null) return false;
      return javonetHandle.invoke("ContainsValue", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public void ISerializable_GetObjectData(SerializationInfo info, StreamingContext context) {
    try {
      javonetHandle.explicitInterface("ISerializable").invoke("GetObjectData", info, context);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void OnDeserialization(Object sender) {
    try {
      javonetHandle
          .explicitInterface("IDeserializationCallback")
          .invoke("OnDeserialization", sender);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Object get_Keys() {
    try {
      Object res =
          javonetHandle.invoke(
              "System.Collections.Generic.IReadOnlyDictionary<TKey,TValue>.get_Keys");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Object GetEnumerator() {
    try {
      Object res =
          javonetHandle.invoke(
              "System.Collections.Generic.IEnumerable<System.Collections.Generic.KeyValuePair<TKey,TValue>>.GetEnumerator");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Boolean get_IsReadOnly() {
    try {
      java.lang.Boolean res =
          javonetHandle.invoke(
              "System.Collections.Generic.ICollection<System.Collections.Generic.KeyValuePair<TKey,TValue>>.get_IsReadOnly");
      if (res == null) return false;
      return javonetHandle.invoke(
          "System.Collections.Generic.ICollection<System.Collections.Generic.KeyValuePair<TKey,TValue>>.get_IsReadOnly");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public void Add(KeyValuePair<TKey, TValue> keyValuePair) {
    try {
      javonetHandle.invoke(
          "System.Collections.Generic.ICollection<System.Collections.Generic.KeyValuePair<TKey,TValue>>.Add",
          keyValuePair);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Boolean Contains(KeyValuePair<TKey, TValue> keyValuePair) {
    try {
      java.lang.Boolean res =
          javonetHandle.invoke(
              "System.Collections.Generic.ICollection<System.Collections.Generic.KeyValuePair<TKey,TValue>>.Contains",
              keyValuePair);
      if (res == null) return false;
      return javonetHandle.invoke(
          "System.Collections.Generic.ICollection<System.Collections.Generic.KeyValuePair<TKey,TValue>>.Contains",
          keyValuePair);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public void CopyTo(KeyValuePair array, java.lang.Integer index) {
    try {
      javonetHandle.invoke(
          "System.Collections.Generic.ICollection<System.Collections.Generic.KeyValuePair<TKey,TValue>>.CopyTo",
          new Object[] {array},
          index);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Boolean Remove(KeyValuePair<TKey, TValue> keyValuePair) {
    try {
      java.lang.Boolean res =
          javonetHandle.invoke(
              "System.Collections.Generic.ICollection<System.Collections.Generic.KeyValuePair<TKey,TValue>>.Remove",
              keyValuePair);
      if (res == null) return false;
      return javonetHandle.invoke(
          "System.Collections.Generic.ICollection<System.Collections.Generic.KeyValuePair<TKey,TValue>>.Remove",
          keyValuePair);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public jio.System.Collections.IEnumerator IEnumerable_GetEnumerator() {
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

  public jio.System.Collections.ICollection IDictionary_get_Keys() {
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

  public jio.System.Collections.ICollection IDictionary_get_Values() {
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
  /** Method */

  public void ICollection_CopyTo(java.lang.reflect.Array array, java.lang.Integer index) {
    try {
      javonetHandle
          .explicitInterface("ICollection")
          .invoke("System.Collections.ICollection.CopyTo", array, index);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
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

  public static class Enumerator<TKey, TValue> extends ValueType
      implements jio.System.Collections.Generic.IEnumerator<KeyValuePair<TKey, TValue>>,
          IDisposable,
          jio.System.Collections.IEnumerator,
          IDictionaryEnumerator {
    protected NObject javonetHandle;
    /** GetProperty */
    public KeyValuePair<TKey, TValue> getCurrent() {
      try {
        Object res = javonetHandle.<NObject>get("Current");
        if (res == null) return null;
        return new KeyValuePair<TKey, TValue>((NObject) res);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }

    public Enumerator(NObject handle) {
      super(handle);
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
    /** Method */

    public java.lang.Boolean MoveNext() {
      try {
        java.lang.Boolean res = javonetHandle.explicitInterface("IEnumerator").invoke("MoveNext");
        if (res == null) return false;
        return javonetHandle.explicitInterface("IEnumerator").invoke("MoveNext");
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return false;
      }
    }
    /** Method */

    public void Dispose() {
      try {
        javonetHandle.explicitInterface("IDisposable").invoke("Dispose");
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** Method */

    public Object get_Current() {
      try {
        Object res =
            javonetHandle
                .explicitInterface("IEnumerator")
                .invoke("System.Collections.IEnumerator.get_Current");
        if (res == null) return null;
        return (Object) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }
    /** Method */

    public void Reset() {
      try {
        javonetHandle
            .explicitInterface("IEnumerator")
            .invoke("System.Collections.IEnumerator.Reset");
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** Method */

    public Object get_Key() {
      try {
        Object res =
            javonetHandle
                .explicitInterface("IDictionaryEnumerator")
                .invoke("System.Collections.IDictionaryEnumerator.get_Key");
        if (res == null) return null;
        return (Object) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }
    /** Method */

    public Object get_Value() {
      try {
        Object res =
            javonetHandle
                .explicitInterface("IDictionaryEnumerator")
                .invoke("System.Collections.IDictionaryEnumerator.get_Value");
        if (res == null) return null;
        return (Object) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }
    /** Method */

    public DictionaryEntry get_Entry() {
      try {
        Object res =
            javonetHandle
                .explicitInterface("IDictionaryEnumerator")
                .invoke("System.Collections.IDictionaryEnumerator.get_Entry");
        if (res == null) return null;
        return new DictionaryEntry((NObject) res);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }
  }

  public static class KeyCollection<TKey, TValue>
      implements jio.System.Collections.Generic.ICollection<TKey>,
          jio.System.Collections.Generic.IEnumerable<TKey>,
          jio.System.Collections.IEnumerable,
          jio.System.Collections.ICollection,
          IReadOnlyCollection<TKey>,
          Iterable<TKey> {
    protected NObject javonetHandle;

    @Override
    public Iterator<TKey> iterator() {
      return (Iterator<TKey>) this.GetEnumerator();
    }
    /** GetProperty */

    public java.lang.Integer getCount() {
      try {
        java.lang.Integer res = javonetHandle.explicitInterface("ICollection").invoke("Count");
        if (res == null) return 0;
        return javonetHandle.explicitInterface("ICollection").invoke("Count");
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return 0;
      }
    }
    /** GenericConstructor */

    public KeyCollection(Dictionary<TKey, TValue> dictionary, Class<?> TKey, Class<?> TValue) {
      try {
        javonetHandle =
            Javonet.getType(
                    "System.Collections.Generic.Dictionary`2+KeyCollection",
                    getReturnObjectName(TKey),
                    getReturnObjectName(TValue))
                .create();
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public KeyCollection(NObject handle) {
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
    /** Method */

    public java.lang.Object GetEnumerator() {
      try {
        Object res =
            javonetHandle.invoke("System.Collections.Generic.IEnumerable<TKey>.GetEnumerator");
        if (res == null) return null;
        return ConvertToConcreteInterfaceImplementation((NObject) res);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }
    /** Method */

    public void CopyTo(TKey array, java.lang.Integer index) {
      try {
        javonetHandle.invoke("CopyTo", new Object[] {array}, index);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** Method */

    public java.lang.Boolean get_IsReadOnly() {
      try {
        java.lang.Boolean res =
            javonetHandle.invoke("System.Collections.Generic.ICollection<TKey>.get_IsReadOnly");
        if (res == null) return false;
        return javonetHandle.invoke("System.Collections.Generic.ICollection<TKey>.get_IsReadOnly");
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return false;
      }
    }
    /** Method */

    public void Add(TKey item) {
      try {
        javonetHandle.invoke("System.Collections.Generic.ICollection<TKey>.Add", item);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** Method */

    public void Clear() {
      try {
        javonetHandle.invoke("System.Collections.Generic.ICollection<TKey>.Clear");
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** Method */

    public java.lang.Boolean Contains(TKey item) {
      try {
        java.lang.Boolean res =
            javonetHandle.invoke("System.Collections.Generic.ICollection<TKey>.Contains", item);
        if (res == null) return false;
        return javonetHandle.invoke("System.Collections.Generic.ICollection<TKey>.Contains", item);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return false;
      }
    }
    /** Method */

    public java.lang.Boolean Remove(TKey item) {
      try {
        java.lang.Boolean res =
            javonetHandle.invoke("System.Collections.Generic.ICollection<TKey>.Remove", item);
        if (res == null) return false;
        return javonetHandle.invoke("System.Collections.Generic.ICollection<TKey>.Remove", item);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return false;
      }
    }
    /** Method */

    public void CopyTo(java.lang.reflect.Array array, java.lang.Integer index) {
      try {
        javonetHandle
            .explicitInterface("ICollection")
            .invoke("System.Collections.ICollection.CopyTo", array, index);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** Method */

    public Object get_SyncRoot() {
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

    public java.lang.Boolean get_IsSynchronized() {
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

    public static class Enumerator<TKey, TValue> extends ValueType
        implements jio.System.Collections.Generic.IEnumerator<TKey>,
            IDisposable,
            jio.System.Collections.IEnumerator {
      protected NObject javonetHandle;
      /** GetProperty */
      public TKey get_Current(Class<?> returnType) {
        try {
          Object res = javonetHandle.invoke("get_Current");
          if (res == null) return null;
          return (TKey) Convert(res, returnType);
        } catch (JavonetException _javonetException) {
          _javonetException.printStackTrace();
          return null;
        }
      }

      public Enumerator(NObject handle) {
        super(handle);
        this.javonetHandle = handle;
      }

      public void setJavonetHandle(NObject handle) {
        this.javonetHandle = handle;
      }
      /** Method */

      public java.lang.Boolean MoveNext() {
        try {
          java.lang.Boolean res = javonetHandle.explicitInterface("IEnumerator").invoke("MoveNext");
          if (res == null) return false;
          return javonetHandle.explicitInterface("IEnumerator").invoke("MoveNext");
        } catch (JavonetException _javonetException) {
          _javonetException.printStackTrace();
          return false;
        }
      }
      /** Method */

      public void Dispose() {
        try {
          javonetHandle.explicitInterface("IDisposable").invoke("Dispose");
        } catch (JavonetException _javonetException) {
          _javonetException.printStackTrace();
        }
      }
      /** Method */

      public Object get_Current() {
        try {
          Object res =
              javonetHandle
                  .explicitInterface("IEnumerator")
                  .invoke("System.Collections.IEnumerator.get_Current");
          if (res == null) return null;
          return (Object) res;
        } catch (JavonetException _javonetException) {
          _javonetException.printStackTrace();
          return null;
        }
      }
      /** Method */

      public void Reset() {
        try {
          javonetHandle
              .explicitInterface("IEnumerator")
              .invoke("System.Collections.IEnumerator.Reset");
        } catch (JavonetException _javonetException) {
          _javonetException.printStackTrace();
        }
      }
    }
  }

  public static class ValueCollection<TKey, TValue>
      implements jio.System.Collections.Generic.ICollection<TValue>,
          jio.System.Collections.Generic.IEnumerable<TValue>,
          jio.System.Collections.IEnumerable,
          jio.System.Collections.ICollection,
          IReadOnlyCollection<TValue>,
          Iterable<TValue> {
    protected NObject javonetHandle;

    @Override
    public Iterator<TValue> iterator() {
      return (Iterator<TValue>) this.GetEnumerator();
    }
    /** GetProperty */

    public java.lang.Integer getCount() {
      try {
        java.lang.Integer res = javonetHandle.explicitInterface("ICollection").invoke("Count");
        if (res == null) return 0;
        return javonetHandle.explicitInterface("ICollection").invoke("Count");
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return 0;
      }
    }
    /** GenericConstructor */

    public ValueCollection(Dictionary<TKey, TValue> dictionary, Class<?> TKey, Class<?> TValue) {
      try {
        javonetHandle =
            Javonet.getType(
                    "System.Collections.Generic.Dictionary`2+ValueCollection",
                    getReturnObjectName(TKey),
                    getReturnObjectName(TValue))
                .create();
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public ValueCollection(NObject handle) {
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
    /** Method */

    public java.lang.Object GetEnumerator() {
      try {
        Object res =
            javonetHandle.invoke("System.Collections.Generic.IEnumerable<TValue>.GetEnumerator");
        if (res == null) return null;
        return ConvertToConcreteInterfaceImplementation((NObject) res);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }
    /** Method */

    public void CopyTo(TValue array, java.lang.Integer index) {
      try {
        javonetHandle.invoke("CopyTo", new Object[] {array}, index);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** Method */

    public java.lang.Boolean get_IsReadOnly() {
      try {
        java.lang.Boolean res =
            javonetHandle.invoke("System.Collections.Generic.ICollection<TValue>.get_IsReadOnly");
        if (res == null) return false;
        return javonetHandle.invoke(
            "System.Collections.Generic.ICollection<TValue>.get_IsReadOnly");
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return false;
      }
    }
    /** Method */

    public void Add(TValue item) {
      try {
        javonetHandle.invoke("System.Collections.Generic.ICollection<TValue>.Add", item);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** Method */

    public void Clear() {
      try {
        javonetHandle.invoke("System.Collections.Generic.ICollection<TValue>.Clear");
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** Method */

    public java.lang.Boolean Contains(TValue item) {
      try {
        java.lang.Boolean res =
            javonetHandle.invoke("System.Collections.Generic.ICollection<TValue>.Contains", item);
        if (res == null) return false;
        return javonetHandle.invoke(
            "System.Collections.Generic.ICollection<TValue>.Contains", item);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return false;
      }
    }
    /** Method */

    public java.lang.Boolean Remove(TValue item) {
      try {
        java.lang.Boolean res =
            javonetHandle.invoke("System.Collections.Generic.ICollection<TValue>.Remove", item);
        if (res == null) return false;
        return javonetHandle.invoke("System.Collections.Generic.ICollection<TValue>.Remove", item);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return false;
      }
    }
    /** Method */

    public void CopyTo(java.lang.reflect.Array array, java.lang.Integer index) {
      try {
        javonetHandle
            .explicitInterface("ICollection")
            .invoke("System.Collections.ICollection.CopyTo", array, index);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** Method */

    public Object get_SyncRoot() {
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

    public java.lang.Boolean get_IsSynchronized() {
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

    public static class Enumerator<TKey, TValue> extends ValueType
        implements jio.System.Collections.Generic.IEnumerator<TValue>,
            IDisposable,
            jio.System.Collections.IEnumerator {
      protected NObject javonetHandle;
      /** GetProperty */
      public TValue get_Current(Class<?> returnType) {
        try {
          Object res = javonetHandle.invoke("get_Current");
          if (res == null) return null;
          return (TValue) Convert(res, returnType);
        } catch (JavonetException _javonetException) {
          _javonetException.printStackTrace();
          return null;
        }
      }

      public Enumerator(NObject handle) {
        super(handle);
        this.javonetHandle = handle;
      }

      public void setJavonetHandle(NObject handle) {
        this.javonetHandle = handle;
      }
      /** Method */

      public java.lang.Boolean MoveNext() {
        try {
          java.lang.Boolean res = javonetHandle.explicitInterface("IEnumerator").invoke("MoveNext");
          if (res == null) return false;
          return javonetHandle.explicitInterface("IEnumerator").invoke("MoveNext");
        } catch (JavonetException _javonetException) {
          _javonetException.printStackTrace();
          return false;
        }
      }
      /** Method */

      public void Dispose() {
        try {
          javonetHandle.explicitInterface("IDisposable").invoke("Dispose");
        } catch (JavonetException _javonetException) {
          _javonetException.printStackTrace();
        }
      }
      /** Method */

      public Object get_Current() {
        try {
          Object res =
              javonetHandle
                  .explicitInterface("IEnumerator")
                  .invoke("System.Collections.IEnumerator.get_Current");
          if (res == null) return null;
          return (Object) res;
        } catch (JavonetException _javonetException) {
          _javonetException.printStackTrace();
          return null;
        }
      }
      /** Method */

      public void Reset() {
        try {
          javonetHandle
              .explicitInterface("IEnumerator")
              .invoke("System.Collections.IEnumerator.Reset");
        } catch (JavonetException _javonetException) {
          _javonetException.printStackTrace();
        }
      }
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
