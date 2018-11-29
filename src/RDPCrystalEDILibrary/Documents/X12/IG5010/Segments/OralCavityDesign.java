package RDPCrystalEDILibrary.Documents.X12.IG5010.Segments;

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
import RDPCrystalEDILibrary.Documents.*;
import RDPCrystalEDILibrary.Documents.X12.IG5010.Segments.*;

public class OralCavityDesign extends CompositeElement {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setOralCavityDesignCode1(java.lang.String value) {
    try {
      javonetHandle.set("OralCavityDesignCode1", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getOralCavityDesignCode1() {
    try {
      java.lang.String res = javonetHandle.get("OralCavityDesignCode1");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setOralCavityDesignCode2(java.lang.String value) {
    try {
      javonetHandle.set("OralCavityDesignCode2", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getOralCavityDesignCode2() {
    try {
      java.lang.String res = javonetHandle.get("OralCavityDesignCode2");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setOralCavityDesignCode3(java.lang.String value) {
    try {
      javonetHandle.set("OralCavityDesignCode3", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getOralCavityDesignCode3() {
    try {
      java.lang.String res = javonetHandle.get("OralCavityDesignCode3");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setOralCavityDesignCode4(java.lang.String value) {
    try {
      javonetHandle.set("OralCavityDesignCode4", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getOralCavityDesignCode4() {
    try {
      java.lang.String res = javonetHandle.get("OralCavityDesignCode4");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setOralCavityDesignCode5(java.lang.String value) {
    try {
      javonetHandle.set("OralCavityDesignCode5", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getOralCavityDesignCode5() {
    try {
      java.lang.String res = javonetHandle.get("OralCavityDesignCode5");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public OralCavityDesign() {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("RDPCrystalEDILibrary.Documents.X12.IG5010.Segments.OralCavityDesign");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public OralCavityDesign(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public java.lang.String GetString(java.lang.Character compElemSep) {
    try {
      java.lang.String res = javonetHandle.invoke("GetString", compElemSep);
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
