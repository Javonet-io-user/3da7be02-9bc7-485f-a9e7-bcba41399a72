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

public class CodeList {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setCodes(Dictionary<java.lang.String, Code> value) {
    try {
      javonetHandle.set("Codes", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Dictionary<java.lang.String, Code> getCodes() {
    try {
      Object res = javonetHandle.<NObject>get("Codes");
      if (res == null) return null;
      return new Dictionary<java.lang.String, Code>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
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

  public void setExternalDelimiter(java.lang.Character value) {
    try {
      javonetHandle.set("ExternalDelimiter", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Character getExternalDelimiter() {
    try {
      java.lang.Character res = javonetHandle.get("ExternalDelimiter");
      if (res == null) return null;
      return javonetHandle.get("ExternalDelimiter");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setExternalFilename(java.lang.String value) {
    try {
      javonetHandle.set("ExternalFilename", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getExternalFilename() {
    try {
      java.lang.String res = javonetHandle.get("ExternalFilename");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setExternalCodeList(java.lang.Boolean value) {
    try {
      javonetHandle.set("ExternalCodeList", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getExternalCodeList() {
    try {
      java.lang.Boolean res = javonetHandle.get("ExternalCodeList");
      if (res == null) return false;
      return javonetHandle.get("ExternalCodeList");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }

  public CodeList() {
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.CodeList");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CodeList(NObject handle) {
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
