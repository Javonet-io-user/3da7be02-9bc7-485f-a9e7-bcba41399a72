package RDPCrystalEDILibrary;

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
import RDPCrystalEDILibrary.*;

public class LightWeightSegment {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setName(java.lang.String value) {
    try {
      javonetHandle.set("Name", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getName() {
    try {
      java.lang.String res = javonetHandle.get("Name");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setSegmentLoop(LightWeightLoop value) {
    try {
      javonetHandle.set("SegmentLoop", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public LightWeightLoop getSegmentLoop() {
    try {
      Object res = javonetHandle.<NObject>get("SegmentLoop");
      if (res == null) return null;
      return new LightWeightLoop((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setOrdinalNumber(java.lang.Integer value) {
    try {
      javonetHandle.set("OrdinalNumber", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getOrdinalNumber() {
    try {
      java.lang.Integer res = javonetHandle.get("OrdinalNumber");
      if (res == null) return 0;
      return javonetHandle.get("OrdinalNumber");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  public void setElements(LightWeightElements value) {
    try {
      javonetHandle.set("Elements", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public LightWeightElements getElements() {
    try {
      Object res = javonetHandle.<NObject>get("Elements");
      if (res == null) return null;
      return new LightWeightElements((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public LightWeightElement getLastElement() {
    try {
      Object res = javonetHandle.<NObject>get("LastElement");
      if (res == null) return null;
      return new LightWeightElement((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public LightWeightElement getFirstElement() {
    try {
      Object res = javonetHandle.<NObject>get("FirstElement");
      if (res == null) return null;
      return new LightWeightElement((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public LightWeightSegment() {
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.LightWeightSegment");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public LightWeightSegment(java.lang.String segmentName) {
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.LightWeightSegment", segmentName);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public LightWeightSegment(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public java.lang.Boolean ContainsElement(java.lang.Integer elementIndex) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("ContainsElement", elementIndex);
      if (res == null) return false;
      return javonetHandle.invoke("ContainsElement", elementIndex);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.String ToString() {
    try {
      java.lang.String res = javonetHandle.invoke("ToString");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public java.lang.String ToEDIString(Delimiters delimiters) {
    try {
      java.lang.String res = javonetHandle.invoke("ToEDIString", delimiters);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
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
