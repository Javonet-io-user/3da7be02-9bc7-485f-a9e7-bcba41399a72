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
import RDPCrystalEDILibrary.Rules.*;

public class SegmentSchema {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setPosition(java.lang.String value) {
    try {
      javonetHandle.set("Position", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getPosition() {
    try {
      java.lang.String res = javonetHandle.get("Position");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
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

  public void setOnlySegmentInLoop(java.lang.Boolean value) {
    try {
      javonetHandle.set("OnlySegmentInLoop", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getOnlySegmentInLoop() {
    try {
      java.lang.Boolean res = javonetHandle.get("OnlySegmentInLoop");
      if (res == null) return false;
      return javonetHandle.get("OnlySegmentInLoop");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
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
  /** GetProperty */

  public java.lang.Integer getOridinalNumber() {
    try {
      java.lang.Integer res = javonetHandle.get("OridinalNumber");
      if (res == null) return 0;
      return javonetHandle.get("OridinalNumber");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
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
  /** SetProperty */

  public void setRepeatIndefinite(java.lang.Boolean value) {
    try {
      javonetHandle.set("RepeatIndefinite", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getRepeatIndefinite() {
    try {
      java.lang.Boolean res = javonetHandle.get("RepeatIndefinite");
      if (res == null) return false;
      return javonetHandle.get("RepeatIndefinite");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setRules(Collection<SemanticRule> value) {
    try {
      javonetHandle.set("Rules", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Collection<SemanticRule> getRules() {
    try {
      Object res = javonetHandle.<NObject>get("Rules");
      if (res == null) return null;
      return new Collection<SemanticRule>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setGeneralRules(Collection<GeneralRule> value) {
    try {
      javonetHandle.set("GeneralRules", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Collection<GeneralRule> getGeneralRules() {
    try {
      Object res = javonetHandle.<NObject>get("GeneralRules");
      if (res == null) return null;
      return new Collection<GeneralRule>((NObject) res);
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

  public void setMaskNumber(java.lang.Integer value) {
    try {
      javonetHandle.set("MaskNumber", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getMaskNumber() {
    try {
      java.lang.Integer res = javonetHandle.get("MaskNumber");
      if (res == null) return 0;
      return javonetHandle.get("MaskNumber");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }

  public SegmentSchema() {
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.SegmentSchema");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SegmentSchema(java.lang.String segmentName) {
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.SegmentSchema", segmentName);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SegmentSchema(java.lang.String segmentName, Usage usage) {
    try {
      javonetHandle =
          Javonet.New("RDPCrystalEDILibrary.SegmentSchema", segmentName, NEnum.fromJavaEnum(usage));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SegmentSchema(java.lang.String segmentName, Usage usage, java.lang.Integer maskNumber) {
    try {
      javonetHandle =
          Javonet.New(
              "RDPCrystalEDILibrary.SegmentSchema",
              segmentName,
              NEnum.fromJavaEnum(usage),
              maskNumber);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SegmentSchema(NObject handle) {
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
