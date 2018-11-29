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

public class Ack999Generator {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setDelimiters(Delimiters value) {
    try {
      javonetHandle.set("Delimiters", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Delimiters getDelimiters() {
    try {
      Object res = javonetHandle.<NObject>get("Delimiters");
      if (res == null) return null;
      return new Delimiters((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setSegmentSeparatorString(java.lang.String value) {
    try {
      javonetHandle.set("SegmentSeparatorString", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getSegmentSeparatorString() {
    try {
      java.lang.String res = javonetHandle.get("SegmentSeparatorString");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setPaddingChar(java.lang.Character value) {
    try {
      javonetHandle.set("PaddingChar", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Character getPaddingChar() {
    try {
      java.lang.Character res = javonetHandle.get("PaddingChar");
      if (res == null) return null;
      return javonetHandle.get("PaddingChar");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public Ack999Generator() {
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.Ack999Generator");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Ack999Generator(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public EDIDocument Generate999Acknowledgement(EDIValidator ediValidator) {
    try {
      Object res = javonetHandle.invoke("Generate999Acknowledgement", ediValidator);
      if (res == null) return null;
      return new EDIDocument((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
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
