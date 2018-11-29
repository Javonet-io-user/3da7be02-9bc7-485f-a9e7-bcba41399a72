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

public class ScrubPosition {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setCompositeElementNumber(java.lang.Integer value) {
    try {
      javonetHandle.set("CompositeElementNumber", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getCompositeElementNumber() {
    try {
      java.lang.Integer res = javonetHandle.get("CompositeElementNumber");
      if (res == null) return 0;
      return javonetHandle.get("CompositeElementNumber");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  public void setElementNumber(java.lang.Integer value) {
    try {
      javonetHandle.set("ElementNumber", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getElementNumber() {
    try {
      java.lang.Integer res = javonetHandle.get("ElementNumber");
      if (res == null) return 0;
      return javonetHandle.get("ElementNumber");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }

  public ScrubPosition() {
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.ScrubPosition");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ScrubPosition(java.lang.Integer elementNumber) {
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.ScrubPosition", elementNumber);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ScrubPosition(java.lang.Integer compositeElementNumber, java.lang.Integer elementNumber) {
    try {
      javonetHandle =
          Javonet.New("RDPCrystalEDILibrary.ScrubPosition", compositeElementNumber, elementNumber);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ScrubPosition(NObject handle) {
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
