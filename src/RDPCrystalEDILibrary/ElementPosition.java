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

public class ElementPosition {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setSegmentOridinalPosition(java.lang.Integer value) {
    try {
      javonetHandle.set("SegmentOridinalPosition", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getSegmentOridinalPosition() {
    try {
      java.lang.Integer res = javonetHandle.get("SegmentOridinalPosition");
      if (res == null) return 0;
      return javonetHandle.get("SegmentOridinalPosition");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  public void setElementOrdinalPosition(java.lang.Integer value) {
    try {
      javonetHandle.set("ElementOrdinalPosition", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getElementOrdinalPosition() {
    try {
      java.lang.Integer res = javonetHandle.get("ElementOrdinalPosition");
      if (res == null) return 0;
      return javonetHandle.get("ElementOrdinalPosition");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  public void setCompositeElementPosition(java.lang.Integer value) {
    try {
      javonetHandle.set("CompositeElementPosition", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getCompositeElementPosition() {
    try {
      java.lang.Integer res = javonetHandle.get("CompositeElementPosition");
      if (res == null) return 0;
      return javonetHandle.get("CompositeElementPosition");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }

  public ElementPosition() {
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.ElementPosition");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ElementPosition(
      java.lang.Integer segmentOridinalPosition,
      java.lang.Integer elementOrdinalPosition,
      java.lang.Integer compositeElementPosition) {
    try {
      javonetHandle =
          Javonet.New(
              "RDPCrystalEDILibrary.ElementPosition",
              segmentOridinalPosition,
              elementOrdinalPosition,
              compositeElementPosition);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ElementPosition(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public java.lang.Boolean IsSegmentPosition() {
    try {
      java.lang.Boolean res = javonetHandle.invoke("IsSegmentPosition");
      if (res == null) return false;
      return javonetHandle.invoke("IsSegmentPosition");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.Boolean IsElementPosition() {
    try {
      java.lang.Boolean res = javonetHandle.invoke("IsElementPosition");
      if (res == null) return false;
      return javonetHandle.invoke("IsElementPosition");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.Boolean IsCompositeElementPosition() {
    try {
      java.lang.Boolean res = javonetHandle.invoke("IsCompositeElementPosition");
      if (res == null) return false;
      return javonetHandle.invoke("IsCompositeElementPosition");
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

  public java.lang.String ToSummaryKey() {
    try {
      java.lang.String res = javonetHandle.invoke("ToSummaryKey");
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
