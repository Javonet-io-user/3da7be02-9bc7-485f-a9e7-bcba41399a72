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

public class Segment {
  protected NObject javonetHandle;
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

  public void setLoopValidationIndex(java.lang.Integer value) {
    try {
      javonetHandle.set("LoopValidationIndex", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getLoopValidationIndex() {
    try {
      java.lang.Integer res = javonetHandle.get("LoopValidationIndex");
      if (res == null) return 0;
      return javonetHandle.get("LoopValidationIndex");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  public void setSelfRules(Collection<SelfRule> value) {
    try {
      javonetHandle.set("SelfRules", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Collection<SelfRule> getSelfRules() {
    try {
      Object res = javonetHandle.<NObject>get("SelfRules");
      if (res == null) return null;
      return new Collection<SelfRule>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setGeneralSelfRules(Collection<GeneralSelfRule> value) {
    try {
      javonetHandle.set("GeneralSelfRules", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Collection<GeneralSelfRule> getGeneralSelfRules() {
    try {
      Object res = javonetHandle.<NObject>get("GeneralSelfRules");
      if (res == null) return null;
      return new Collection<GeneralSelfRule>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setElementExclusionConstraints(Collection<ElementExclusionConstraint> value) {
    try {
      javonetHandle.set("ElementExclusionConstraints", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Collection<ElementExclusionConstraint> getElementExclusionConstraints() {
    try {
      Object res = javonetHandle.<NObject>get("ElementExclusionConstraints");
      if (res == null) return null;
      return new Collection<ElementExclusionConstraint>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setElementListConditionConstraints(
      Collection<ElementListConditionalConstraint> value) {
    try {
      javonetHandle.set("ElementListConditionConstraints", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Collection<ElementListConditionalConstraint> getElementListConditionConstraints() {
    try {
      Object res = javonetHandle.<NObject>get("ElementListConditionConstraints");
      if (res == null) return null;
      return new Collection<ElementListConditionalConstraint>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setModified(java.lang.Boolean value) {
    try {
      javonetHandle.set("Modified", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getModified() {
    try {
      java.lang.Boolean res = javonetHandle.get("Modified");
      if (res == null) return false;
      return javonetHandle.get("Modified");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setElementRequiredConstraints(Collection<ElementRequiredConstraint> value) {
    try {
      javonetHandle.set("ElementRequiredConstraints", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Collection<ElementRequiredConstraint> getElementRequiredConstraints() {
    try {
      Object res = javonetHandle.<NObject>get("ElementRequiredConstraints");
      if (res == null) return null;
      return new Collection<ElementRequiredConstraint>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setElementPairConstraints(Collection<ElementPairConstraint> value) {
    try {
      javonetHandle.set("ElementPairConstraints", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Collection<ElementPairConstraint> getElementPairConstraints() {
    try {
      Object res = javonetHandle.<NObject>get("ElementPairConstraints");
      if (res == null) return null;
      return new Collection<ElementPairConstraint>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setElementConditionalConstraints(Collection<ElementConditionalConstraint> value) {
    try {
      javonetHandle.set("ElementConditionalConstraints", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Collection<ElementConditionalConstraint> getElementConditionalConstraints() {
    try {
      Object res = javonetHandle.<NObject>get("ElementConditionalConstraints");
      if (res == null) return null;
      return new Collection<ElementConditionalConstraint>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setElementSchema(Collection<ElementSchema> value) {
    try {
      javonetHandle.set("ElementSchema", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Collection<ElementSchema> getElementSchema() {
    try {
      Object res = javonetHandle.<NObject>get("ElementSchema");
      if (res == null) return null;
      return new Collection<ElementSchema>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setMasks(Collection<Mask> value) {
    try {
      javonetHandle.set("Masks", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Collection<Mask> getMasks() {
    try {
      Object res = javonetHandle.<NObject>get("Masks");
      if (res == null) return null;
      return new Collection<Mask>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public Segment() {
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.Segment");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Segment(java.lang.String name) {
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.Segment", name);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Segment(NObject handle) {
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
