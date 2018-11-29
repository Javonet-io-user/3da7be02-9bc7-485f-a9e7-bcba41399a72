package RDPCrystalEDILibrary.Rules;

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
import jio.System.*;
import RDPCrystalEDILibrary.Rules.*;
import RDPCrystalEDILibrary.*;
import jio.System.Collections.Generic.*;

public class CodeConditionEventArgs extends EventArgs {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setCodeCondition(CodeCondition value) {
    try {
      javonetHandle.set("CodeCondition", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public CodeCondition getCodeCondition() {
    try {
      Object res = javonetHandle.<NObject>get("CodeCondition");
      if (res == null) return null;
      return new CodeCondition((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setDataLoop(LightWeightLoop value) {
    try {
      javonetHandle.set("DataLoop", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public LightWeightLoop getDataLoop() {
    try {
      Object res = javonetHandle.<NObject>get("DataLoop");
      if (res == null) return null;
      return new LightWeightLoop((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setCurrentSegmentSchema(DataSegment value) {
    try {
      javonetHandle.set("CurrentSegmentSchema", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public DataSegment getCurrentSegmentSchema() {
    try {
      Object res = javonetHandle.<NObject>get("CurrentSegmentSchema");
      if (res == null) return null;
      return new DataSegment((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setCurrentSegment(LightWeightSegment value) {
    try {
      javonetHandle.set("CurrentSegment", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public LightWeightSegment getCurrentSegment() {
    try {
      Object res = javonetHandle.<NObject>get("CurrentSegment");
      if (res == null) return null;
      return new LightWeightSegment((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setCurrentLoop(Loop value) {
    try {
      javonetHandle.set("CurrentLoop", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Loop getCurrentLoop() {
    try {
      Object res = javonetHandle.<NObject>get("CurrentLoop");
      if (res == null) return null;
      return new Loop((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setFoundSegments(FoundSegmentCollection value) {
    try {
      javonetHandle.set("FoundSegments", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public FoundSegmentCollection getFoundSegments() {
    try {
      Object res = javonetHandle.<NObject>get("FoundSegments");
      if (res == null) return null;
      return new FoundSegmentCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setFoundElements(Dictionary<java.lang.Integer, java.lang.String> value) {
    try {
      javonetHandle.set("FoundElements", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Dictionary<java.lang.Integer, java.lang.String> getFoundElements() {
    try {
      Object res = javonetHandle.<NObject>get("FoundElements");
      if (res == null) return null;
      return new Dictionary<java.lang.Integer, java.lang.String>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setConditionValid(java.lang.Boolean value) {
    try {
      javonetHandle.set("ConditionValid", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getConditionValid() {
    try {
      java.lang.Boolean res = javonetHandle.get("ConditionValid");
      if (res == null) return false;
      return javonetHandle.get("ConditionValid");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }

  public CodeConditionEventArgs() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.Rules.CodeConditionEventArgs");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CodeConditionEventArgs(NObject handle) {
    super(handle);
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
