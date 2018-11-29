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

public class HashSet<T>
    implements jio.System.Collections.Generic.ICollection<T>,
        jio.System.Collections.Generic.IEnumerable<T>,
        jio.System.Collections.IEnumerable,
        ISerializable,
        IDeserializationCallback,
        ISet<T>,
        IReadOnlyCollection<T>,
        Iterable<T> {
  protected NObject javonetHandle;

  @Override
  public Iterator<T> iterator() {
    return (Iterator<T>) this.GetEnumerator();
  }
  /** GetProperty */

  public java.lang.Integer getCount() {
    try {
      java.lang.Integer res = javonetHandle.get("Count");
      if (res == null) return 0;
      return javonetHandle.get("Count");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  public jio.System.Collections.Generic.IEqualityComparer<T> getComparer() {
    try {
      Object res = javonetHandle.<NObject>get("Comparer");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GenericConstructor */

  public HashSet(Class<?> T) {
    try {
      javonetHandle =
          Javonet.getType("System.Collections.Generic.HashSet`1", getReturnObjectName(T)).create();
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GenericConstructor */

  public HashSet(java.lang.Integer capacity, Class<?> T) {
    try {
      javonetHandle =
          Javonet.getType("System.Collections.Generic.HashSet`1", getReturnObjectName(T)).create();
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GenericConstructor */

  public HashSet(jio.System.Collections.Generic.IEqualityComparer<T> comparer, Class<?> T) {
    try {
      javonetHandle =
          Javonet.getType("System.Collections.Generic.HashSet`1", getReturnObjectName(T)).create();
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GenericConstructor */

  public HashSet(jio.System.Collections.Generic.IEnumerable<T> collection, Class<?> T) {
    try {
      javonetHandle =
          Javonet.getType("System.Collections.Generic.HashSet`1", getReturnObjectName(T)).create();
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GenericConstructor */

  public HashSet(
      jio.System.Collections.Generic.IEnumerable<T> collection,
      jio.System.Collections.Generic.IEqualityComparer<T> comparer,
      Class<?> T) {
    try {
      javonetHandle =
          Javonet.getType("System.Collections.Generic.HashSet`1", getReturnObjectName(T)).create();
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GenericConstructor */

  public HashSet(
      java.lang.Integer capacity,
      jio.System.Collections.Generic.IEqualityComparer<T> comparer,
      Class<?> T) {
    try {
      javonetHandle =
          Javonet.getType("System.Collections.Generic.HashSet`1", getReturnObjectName(T)).create();
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public HashSet(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void Clear() {
    try {
      javonetHandle.invoke("Clear");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Boolean Contains(T item) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("Contains", item);
      if (res == null) return false;
      return javonetHandle.invoke("Contains", item);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public void CopyTo(T array, java.lang.Integer arrayIndex) {
    try {
      javonetHandle.invoke("CopyTo", new Object[] {array}, arrayIndex);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Boolean Remove(T item) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("Remove", item);
      if (res == null) return false;
      return javonetHandle.invoke("Remove", item);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.Object GetEnumerator() {
    try {
      Object res = javonetHandle.invoke("System.Collections.Generic.IEnumerable<T>.GetEnumerator");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
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

  public java.lang.Object Add(T item) {
    try {
      Object res = javonetHandle.invoke("System.Collections.Generic.ICollection<T>.Add", item);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Boolean TryGetValue(T equalValue, T actualValue) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("TryGetValue", equalValue, actualValue);
      if (res == null) return false;
      return javonetHandle.invoke("TryGetValue", equalValue, actualValue);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public void UnionWith(jio.System.Collections.Generic.IEnumerable<T> other) {
    try {
      javonetHandle.invoke("UnionWith", other);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void IntersectWith(jio.System.Collections.Generic.IEnumerable<T> other) {
    try {
      javonetHandle.invoke("IntersectWith", other);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void ExceptWith(jio.System.Collections.Generic.IEnumerable<T> other) {
    try {
      javonetHandle.invoke("ExceptWith", other);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void SymmetricExceptWith(jio.System.Collections.Generic.IEnumerable<T> other) {
    try {
      javonetHandle.invoke("SymmetricExceptWith", other);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Boolean IsSubsetOf(jio.System.Collections.Generic.IEnumerable<T> other) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("IsSubsetOf", other);
      if (res == null) return false;
      return javonetHandle.invoke("IsSubsetOf", other);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.Boolean IsProperSubsetOf(jio.System.Collections.Generic.IEnumerable<T> other) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("IsProperSubsetOf", other);
      if (res == null) return false;
      return javonetHandle.invoke("IsProperSubsetOf", other);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.Boolean IsSupersetOf(jio.System.Collections.Generic.IEnumerable<T> other) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("IsSupersetOf", other);
      if (res == null) return false;
      return javonetHandle.invoke("IsSupersetOf", other);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.Boolean IsProperSupersetOf(jio.System.Collections.Generic.IEnumerable<T> other) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("IsProperSupersetOf", other);
      if (res == null) return false;
      return javonetHandle.invoke("IsProperSupersetOf", other);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.Boolean Overlaps(jio.System.Collections.Generic.IEnumerable<T> other) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("Overlaps", other);
      if (res == null) return false;
      return javonetHandle.invoke("Overlaps", other);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.Boolean SetEquals(jio.System.Collections.Generic.IEnumerable<T> other) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("SetEquals", other);
      if (res == null) return false;
      return javonetHandle.invoke("SetEquals", other);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public void CopyTo(T[] array) {
    try {
      javonetHandle.invoke("CopyTo", new Object[] {array});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void CopyTo(T[] array, java.lang.Integer arrayIndex, java.lang.Integer count) {
    try {
      javonetHandle.invoke("CopyTo", new Object[] {array}, arrayIndex, count);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Integer RemoveWhere(Predicate<T> match) {
    try {
      java.lang.Integer res = javonetHandle.invoke("RemoveWhere", match);
      if (res == null) return 0;
      return javonetHandle.invoke("RemoveWhere", match);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public void TrimExcess() {
    try {
      javonetHandle.invoke("TrimExcess");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static <T>
      jio.System.Collections.Generic.IEqualityComparer<HashSet<T>> CreateSetComparer() {
    try {
      Object res = Javonet.getType("HashSet").invoke("CreateSetComparer");
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
          javonetHandle.invoke("System.Collections.Generic.ICollection<T>.get_IsReadOnly");
      if (res == null) return false;
      return javonetHandle.invoke("System.Collections.Generic.ICollection<T>.get_IsReadOnly");
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

  public static class Enumerator<T> extends ValueType
      implements jio.System.Collections.Generic.IEnumerator<T>,
          IDisposable,
          jio.System.Collections.IEnumerator {
    protected NObject javonetHandle;
    /** GetProperty */
    public T get_Current(Class<?> returnType) {
      try {
        Object res = javonetHandle.invoke("get_Current");
        if (res == null) return null;
        return (T) Convert(res, returnType);
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

    public void Dispose() {
      try {
        javonetHandle.explicitInterface("IDisposable").invoke("Dispose");
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
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

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
