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
import jio.System.Collections.Generic.*;

public class LightWeightElement {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setComposite(java.lang.Boolean value) {
    try {
      javonetHandle.set("Composite", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getComposite() {
    try {
      java.lang.Boolean res = javonetHandle.get("Composite");
      if (res == null) return false;
      return javonetHandle.get("Composite");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  public java.lang.Boolean getHasRepeatingCompositeElements() {
    try {
      java.lang.Boolean res = javonetHandle.get("HasRepeatingCompositeElements");
      if (res == null) return false;
      return javonetHandle.get("HasRepeatingCompositeElements");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  public java.lang.Boolean getHasRepeatingElements() {
    try {
      java.lang.Boolean res = javonetHandle.get("HasRepeatingElements");
      if (res == null) return false;
      return javonetHandle.get("HasRepeatingElements");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
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
  /** SetProperty */

  public void setRepeatingCompositeElements(List<LightWeightElements> value) {
    try {
      javonetHandle.set("RepeatingCompositeElements", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public List<LightWeightElements> getRepeatingCompositeElements() {
    try {
      Object res = javonetHandle.<NObject>get("RepeatingCompositeElements");
      if (res == null) return null;
      return new List<LightWeightElements>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setRepeatingElementsValues(List<java.lang.String> value) {
    try {
      javonetHandle.set("RepeatingElementsValues", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public List<java.lang.String> getRepeatingElementsValues() {
    try {
      Object res = javonetHandle.<NObject>get("RepeatingElementsValues");
      if (res == null) return null;
      return new List<java.lang.String>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setDataValue(java.lang.String value) {
    try {
      javonetHandle.set("DataValue", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getDataValue() {
    try {
      java.lang.String res = javonetHandle.get("DataValue");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public LightWeightElement() {
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.LightWeightElement");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public LightWeightElement(java.lang.String elementValue) {
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.LightWeightElement", elementValue);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public LightWeightElement(java.lang.Boolean composite) {
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.LightWeightElement", composite);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public LightWeightElement(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public java.lang.Boolean ContainsData() {
    try {
      java.lang.Boolean res = javonetHandle.invoke("ContainsData");
      if (res == null) return false;
      return javonetHandle.invoke("ContainsData");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.Boolean ContainsNoData() {
    try {
      java.lang.Boolean res = javonetHandle.invoke("ContainsNoData");
      if (res == null) return false;
      return javonetHandle.invoke("ContainsNoData");
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

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
