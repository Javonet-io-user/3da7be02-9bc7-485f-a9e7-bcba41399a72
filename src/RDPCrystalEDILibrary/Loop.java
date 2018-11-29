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
import jio.System.Collections.ObjectModel.*;
import jio.System.*;

public class Loop extends LightWeightLoop {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setRepetitionIndefinite(java.lang.Boolean value) {
    try {
      javonetHandle.set("RepetitionIndefinite", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getRepetitionIndefinite() {
    try {
      java.lang.Boolean res = javonetHandle.get("RepetitionIndefinite");
      if (res == null) return false;
      return javonetHandle.get("RepetitionIndefinite");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setParentAsLoop(Loop value) {
    try {
      javonetHandle.set("Parent", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Loop getParentAsLoop() {
    try {
      Object res = javonetHandle.<NObject>get("Parent");
      if (res == null) return null;
      return new Loop((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setTag(Object value) {
    try {
      javonetHandle.set("Tag", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Object getTag() {
    try {
      Object res = javonetHandle.<NObject>get("Tag");
      if (res == null) return null;
      return (Object) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setOccurred(java.lang.Boolean value) {
    try {
      javonetHandle.set("Occurred", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getOccurred() {
    try {
      java.lang.Boolean res = javonetHandle.get("Occurred");
      if (res == null) return false;
      return javonetHandle.get("Occurred");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
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

  public void setSegmentsAsLoop(DataSegments value) {
    try {
      javonetHandle.set("Segments", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public DataSegments getSegmentsAsLoop() {
    try {
      Object res = javonetHandle.<NObject>get("Segments");
      if (res == null) return null;
      return new DataSegments((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setDescription(java.lang.String value) {
    try {
      javonetHandle.set("Description", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getDescription() {
    try {
      java.lang.String res = javonetHandle.get("Description");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setLoopsAsLoop(Loops value) {
    try {
      javonetHandle.set("Loops", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Loops getLoopsAsLoop() {
    try {
      Object res = javonetHandle.<NObject>get("Loops");
      if (res == null) return null;
      return new Loops((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setMinimumOccurrences(java.lang.Integer value) {
    try {
      javonetHandle.set("MinimumOccurrences", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getMinimumOccurrences() {
    try {
      java.lang.Integer res = javonetHandle.get("MinimumOccurrences");
      if (res == null) return 0;
      return javonetHandle.get("MinimumOccurrences");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  public void setMaximumOccurrences(java.lang.Integer value) {
    try {
      javonetHandle.set("MaximumOccurrences", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getMaximumOccurrences() {
    try {
      java.lang.Integer res = javonetHandle.get("MaximumOccurrences");
      if (res == null) return 0;
      return javonetHandle.get("MaximumOccurrences");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  public DataSegment getLastSegmentAsLoop() {
    try {
      Object res = javonetHandle.<NObject>get("LastSegment");
      if (res == null) return null;
      return new DataSegment((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public DataSegment getFirstSegmentAsLoop() {
    try {
      Object res = javonetHandle.<NObject>get("FirstSegment");
      if (res == null) return null;
      return new DataSegment((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public Loop() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.Loop");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Loop(java.lang.String name) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.Loop", name);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Loop(java.lang.String name, java.lang.String description) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.Loop", name, description);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Loop(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public Loop Loop___GetLastLoop() {
    try {
      Object res = javonetHandle.invoke("GetLastLoop");
      if (res == null) return null;
      return new Loop((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Loop Loop___GetLoop(java.lang.String loopName) {
    try {
      Object res = javonetHandle.invoke("GetLoop", loopName);
      if (res == null) return null;
      return new Loop((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public DataSegment Loop___GetSegment(java.lang.String segmentName) {
    try {
      Object res = javonetHandle.invoke("GetSegment", segmentName);
      if (res == null) return null;
      return new DataSegment((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Integer GetSegmentPosition(DataSegment segment) {
    try {
      java.lang.Integer res = javonetHandle.invoke("GetSegmentPosition", segment);
      if (res == null) return 0;
      return javonetHandle.invoke("GetSegmentPosition", segment);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public Collection<DataSegment> Loop___GetSegmentCollection(java.lang.String segmentName) {
    try {
      Object res = javonetHandle.invoke("GetSegmentCollection", segmentName);
      if (res == null) return null;
      return new Collection<DataSegment>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public DataSegments Loop___GetSegments(
      java.lang.String segmentName,
      java.lang.Integer elementPosition,
      java.lang.String elementValue) {
    try {
      Object res = javonetHandle.invoke("GetSegments", segmentName, elementPosition, elementValue);
      if (res == null) return null;
      return new DataSegments((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Collection<Loop> Loop___GetLoopCollection(java.lang.String loopName) {
    try {
      Object res = javonetHandle.invoke("GetLoopCollection", loopName);
      if (res == null) return null;
      return new Collection<Loop>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public DataSegment Loop___GetSegment(java.lang.Integer segmentOridinalNumber) {
    try {
      Object res = javonetHandle.invoke("GetSegment", segmentOridinalNumber);
      if (res == null) return null;
      return new DataSegment((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public DataSegment GetNextSegment(java.lang.Integer currentIndex) {
    try {
      Object res = javonetHandle.invoke("GetNextSegment", currentIndex);
      if (res == null) return null;
      return new DataSegment((NObject) res);
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

  public DataSegment Loop___CreateSegment(java.lang.String segmentName) {
    try {
      Object res = javonetHandle.invoke("CreateSegment", segmentName);
      if (res == null) return null;
      return new DataSegment((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public DataSegment Loop___CreateSegment(
      java.lang.String segmentName,
      java.lang.Integer min,
      java.lang.Integer max,
      Usage usage,
      java.lang.String description) {
    try {
      Object res =
          javonetHandle.invoke(
              "CreateSegment", segmentName, min, max, NEnum.fromJavaEnum(usage), description);
      if (res == null) return null;
      return new DataSegment((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public DataSegment Loop___CreateSegmentLoop(
      java.lang.String segmentName,
      java.lang.Integer min,
      java.lang.Integer max,
      Usage usage,
      java.lang.String description) {
    try {
      Object res =
          javonetHandle.invoke(
              "CreateSegmentLoop", segmentName, min, max, NEnum.fromJavaEnum(usage), description);
      if (res == null) return null;
      return new DataSegment((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Loop Loop___CreateLoop(java.lang.String name) {
    try {
      Object res = javonetHandle.invoke("CreateLoop", name);
      if (res == null) return null;
      return new Loop((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Loop Loop___CreateLoop() {
    try {
      Object res = javonetHandle.invoke("CreateLoop");
      if (res == null) return null;
      return new Loop((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Loop Loop___CreateLoop(java.lang.String name, java.lang.String description) {
    try {
      Object res = javonetHandle.invoke("CreateLoop", name, description);
      if (res == null) return null;
      return new Loop((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Loop GetSiblingAbove() {
    try {
      Object res = javonetHandle.invoke("GetSiblingAbove");
      if (res == null) return null;
      return new Loop((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Integer GetChildPosition(Loop childLoop) {
    try {
      java.lang.Integer res = javonetHandle.invoke("GetChildPosition", childLoop);
      if (res == null) return 0;
      return javonetHandle.invoke("GetChildPosition", childLoop);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
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
