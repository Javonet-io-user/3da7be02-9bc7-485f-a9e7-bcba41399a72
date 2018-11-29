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

public class LightWeightLoop {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setParent(LightWeightLoop value) {
    try {
      javonetHandle.set("Parent", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public LightWeightLoop getParent() {
    try {
      Object res = javonetHandle.<NObject>get("Parent");
      if (res == null) return null;
      return new LightWeightLoop((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setIsSegmentLoop(java.lang.Boolean value) {
    try {
      javonetHandle.set("IsSegmentLoop", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getIsSegmentLoop() {
    try {
      java.lang.Boolean res = javonetHandle.get("IsSegmentLoop");
      if (res == null) return false;
      return javonetHandle.get("IsSegmentLoop");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setSegments(LightWeightSegments value) {
    try {
      javonetHandle.set("Segments", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public LightWeightSegments getSegments() {
    try {
      Object res = javonetHandle.<NObject>get("Segments");
      if (res == null) return null;
      return new LightWeightSegments((NObject) res);
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

  public void setLoops(LightWeightLoops value) {
    try {
      javonetHandle.set("Loops", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public LightWeightLoops getLoops() {
    try {
      Object res = javonetHandle.<NObject>get("Loops");
      if (res == null) return null;
      return new LightWeightLoops((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public LightWeightSegment getLastSegment() {
    try {
      Object res = javonetHandle.<NObject>get("LastSegment");
      if (res == null) return null;
      return new LightWeightSegment((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public LightWeightSegment getFirstSegment() {
    try {
      Object res = javonetHandle.<NObject>get("FirstSegment");
      if (res == null) return null;
      return new LightWeightSegment((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public LightWeightLoop() {
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.LightWeightLoop");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public LightWeightLoop(java.lang.String name) {
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.LightWeightLoop", name);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public LightWeightLoop(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public LightWeightLoop GetLastLoop() {
    try {
      Object res = javonetHandle.invoke("GetLastLoop");
      if (res == null) return null;
      return new LightWeightLoop((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public LightWeightLoop GetLoop(java.lang.String loopName) {
    try {
      Object res = javonetHandle.invoke("GetLoop", loopName);
      if (res == null) return null;
      return new LightWeightLoop((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public LightWeightSegment GetSegment(java.lang.String segmentName) {
    try {
      Object res = javonetHandle.invoke("GetSegment", segmentName);
      if (res == null) return null;
      return new LightWeightSegment((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public LightWeightSegments GetSegmentCollection(java.lang.String segmentName) {
    try {
      Object res = javonetHandle.invoke("GetSegmentCollection", segmentName);
      if (res == null) return null;
      return new LightWeightSegments((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public LightWeightSegments GetSegments(
      java.lang.String segmentName,
      java.lang.Integer elementPosition,
      java.lang.String elementValue) {
    try {
      Object res = javonetHandle.invoke("GetSegments", segmentName, elementPosition, elementValue);
      if (res == null) return null;
      return new LightWeightSegments((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public LightWeightLoops GetLoopCollection(java.lang.String loopName) {
    try {
      Object res = javonetHandle.invoke("GetLoopCollection", loopName);
      if (res == null) return null;
      return new LightWeightLoops((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Boolean ContainsSegment(java.lang.String segmentName) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("ContainsSegment", segmentName);
      if (res == null) return false;
      return javonetHandle.invoke("ContainsSegment", segmentName);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public LightWeightLoop CreateLoop(java.lang.String loopName) {
    try {
      Object res = javonetHandle.invoke("CreateLoop", loopName);
      if (res == null) return null;
      return new LightWeightLoop((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public LightWeightLoop CreateLoop() {
    try {
      Object res = javonetHandle.invoke("CreateLoop");
      if (res == null) return null;
      return new LightWeightLoop((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public LightWeightSegment CreateSegment(java.lang.String segmentName) {
    try {
      Object res = javonetHandle.invoke("CreateSegment", segmentName);
      if (res == null) return null;
      return new LightWeightSegment((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public LightWeightSegment CreateSegmentLoop(java.lang.String segmentName) {
    try {
      Object res = javonetHandle.invoke("CreateSegmentLoop", segmentName);
      if (res == null) return null;
      return new LightWeightSegment((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
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
