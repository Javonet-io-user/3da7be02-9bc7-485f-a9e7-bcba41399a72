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

public class SemanticRule {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setBaseSegmentPosition(ElementPosition value) {
    try {
      javonetHandle.set("BaseSegmentPosition", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public ElementPosition getBaseSegmentPosition() {
    try {
      Object res = javonetHandle.<NObject>get("BaseSegmentPosition");
      if (res == null) return null;
      return new ElementPosition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setDependentSegmentPosition(ElementPosition value) {
    try {
      javonetHandle.set("DependentSegmentPosition", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public ElementPosition getDependentSegmentPosition() {
    try {
      Object res = javonetHandle.<NObject>get("DependentSegmentPosition");
      if (res == null) return null;
      return new ElementPosition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setDefaultValues(HashSet<java.lang.String> value) {
    try {
      javonetHandle.set("DefaultValues", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public HashSet<java.lang.String> getDefaultValues() {
    try {
      Object res = javonetHandle.<NObject>get("DefaultValues");
      if (res == null) return null;
      return new HashSet<java.lang.String>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setAcceptedValues(HashSet<java.lang.String> value) {
    try {
      javonetHandle.set("AcceptedValues", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public HashSet<java.lang.String> getAcceptedValues() {
    try {
      Object res = javonetHandle.<NObject>get("AcceptedValues");
      if (res == null) return null;
      return new HashSet<java.lang.String>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setConditionalValues(HashSet<java.lang.String> value) {
    try {
      javonetHandle.set("ConditionalValues", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public HashSet<java.lang.String> getConditionalValues() {
    try {
      Object res = javonetHandle.<NObject>get("ConditionalValues");
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

  public void setUsage(Usage value) {
    try {
      javonetHandle.set("Usage", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Usage getUsage() {
    try {
      Object res = javonetHandle.<NEnum>get("Usage");
      if (res == null) return null;
      return Usage.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setElseUsage(Usage value) {
    try {
      javonetHandle.set("ElseUsage", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Usage getElseUsage() {
    try {
      Object res = javonetHandle.<NEnum>get("ElseUsage");
      if (res == null) return null;
      return Usage.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public SemanticRule() {
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.SemanticRule");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SemanticRule(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
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
