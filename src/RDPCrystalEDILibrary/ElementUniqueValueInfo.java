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

public class ElementUniqueValueInfo {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setSegmentOrdinalNumber(java.lang.Integer value) {
    try {
      javonetHandle.set("SegmentOrdinalNumber", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getSegmentOrdinalNumber() {
    try {
      java.lang.Integer res = javonetHandle.get("SegmentOrdinalNumber");
      if (res == null) return 0;
      return javonetHandle.get("SegmentOrdinalNumber");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  public void setElementOrdinalNumber(java.lang.Integer value) {
    try {
      javonetHandle.set("ElementOrdinalNumber", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getElementOrdinalNumber() {
    try {
      java.lang.Integer res = javonetHandle.get("ElementOrdinalNumber");
      if (res == null) return 0;
      return javonetHandle.get("ElementOrdinalNumber");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  public void setSubElementOrdinalNumber(java.lang.Integer value) {
    try {
      javonetHandle.set("SubElementOrdinalNumber", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getSubElementOrdinalNumber() {
    try {
      java.lang.Integer res = javonetHandle.get("SubElementOrdinalNumber");
      if (res == null) return 0;
      return javonetHandle.get("SubElementOrdinalNumber");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }

  public ElementUniqueValueInfo() {
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.ElementUniqueValueInfo");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ElementUniqueValueInfo(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
