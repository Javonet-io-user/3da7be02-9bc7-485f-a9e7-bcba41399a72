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
import jio.System.Collections.ObjectModel.*;

public class SelfRule {
  protected NObject javonetHandle;
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

  public void setElementValues(HashSet<java.lang.String> value) {
    try {
      javonetHandle.set("ElementValues", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public HashSet<java.lang.String> getElementValues() {
    try {
      Object res = javonetHandle.<NObject>get("ElementValues");
      if (res == null) return null;
      return new HashSet<java.lang.String>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setRuleOperator(RuleOperator value) {
    try {
      javonetHandle.set("RuleOperator", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public RuleOperator getRuleOperator() {
    try {
      Object res = javonetHandle.<NEnum>get("RuleOperator");
      if (res == null) return null;
      return RuleOperator.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setUsedElementCollection(Collection<java.lang.Integer> value) {
    try {
      javonetHandle.set("UsedElementCollection", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Collection<java.lang.Integer> getUsedElementCollection() {
    try {
      Object res = javonetHandle.<NObject>get("UsedElementCollection");
      if (res == null) return null;
      return new Collection<java.lang.Integer>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setNotUsedElementCollection(Collection<java.lang.Integer> value) {
    try {
      javonetHandle.set("NotUsedElementCollection", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Collection<java.lang.Integer> getNotUsedElementCollection() {
    try {
      Object res = javonetHandle.<NObject>get("NotUsedElementCollection");
      if (res == null) return null;
      return new Collection<java.lang.Integer>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public SelfRule() {
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.SelfRule");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SelfRule(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public java.lang.String GetNotUsedOrdinalsString() {
    try {
      java.lang.String res = javonetHandle.invoke("GetNotUsedOrdinalsString");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public java.lang.String GetUsedOrdinalsString() {
    try {
      java.lang.String res = javonetHandle.invoke("GetUsedOrdinalsString");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public java.lang.String GetUsedOrdinalsString(java.lang.Character separator) {
    try {
      java.lang.String res = javonetHandle.invoke("GetUsedOrdinalsString", separator);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public java.lang.String GetNotUsedOrdinalsString(java.lang.Character separator) {
    try {
      java.lang.String res = javonetHandle.invoke("GetNotUsedOrdinalsString", separator);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public java.lang.String GetCommaSeparatedElementValues() {
    try {
      java.lang.String res = javonetHandle.invoke("GetCommaSeparatedElementValues");
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
