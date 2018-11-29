package jio.System.Collections.Specialized;

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
import jio.System.Collections.Specialized.*;
import jio.System.Runtime.Serialization.*;
import jio.System.*;
import jio.System.Collections.*;

public abstract class NameObjectCollectionBase
    implements ICollection, IEnumerable, ISerializable, IDeserializationCallback, Iterable<Object> {
  protected NObject javonetHandle;

  @Override
  public Iterator<Object> iterator() {
    return (Iterator<Object>) this.IEnumerable_GetEnumerator();
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

  public KeysCollection getKeys() {
    try {
      Object res = javonetHandle.<NObject>get("Keys");
      if (res == null) return null;
      return new KeysCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public NameObjectCollectionBase(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
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

  public IEnumerator IEnumerable_GetEnumerator() {
    try {
      Object res = javonetHandle.explicitInterface("IEnumerable").invoke("GetEnumerator");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
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

  public static class KeysCollection implements ICollection, IEnumerable, Iterable<Object> {
    protected NObject javonetHandle;

    @Override
    public Iterator<Object> iterator() {
      return (Iterator<Object>) this.GetEnumerator();
    }
    /** GetProperty */

    public java.lang.String get_Item(java.lang.Integer index) {
      try {
        java.lang.String res = javonetHandle.invoke("get_Item", index);
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
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

    public KeysCollection(NObject handle) {
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
    /** Method */

    public java.lang.String Get(java.lang.Integer index) {
      try {
        java.lang.String res = javonetHandle.invoke("Get", index);
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** Method */

    public IEnumerator GetEnumerator() {
      try {
        Object res = javonetHandle.explicitInterface("IEnumerable").invoke("GetEnumerator");
        if (res == null) return null;
        return ConvertToConcreteInterfaceImplementation((NObject) res);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
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
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
