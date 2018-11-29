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
import jio.System.*;

public class DataSegment extends LightWeightSegment {
  protected NObject javonetHandle;
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

  public void setSegmentID(java.lang.String value) {
    try {
      javonetHandle.set("SegmentID", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getSegmentID() {
    try {
      java.lang.String res = javonetHandle.get("SegmentID");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
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

  public void setSegmentLoopAsDataSegment(Loop value) {
    try {
      javonetHandle.set("SegmentLoop", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Loop getSegmentLoopAsDataSegment() {
    try {
      Object res = javonetHandle.<NObject>get("SegmentLoop");
      if (res == null) return null;
      return new Loop((NObject) res);
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

  public void setElementRequiredConstraint(Collection<ElementRequiredConstraint> value) {
    try {
      javonetHandle.set("ElementRequiredConstraint", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public Collection<ElementRequiredConstraint> getElementRequiredConstraint() {
    try {
      Object res = javonetHandle.<NObject>get("ElementRequiredConstraint");
      if (res == null) return null;
      return new Collection<ElementRequiredConstraint>((NObject) res);
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

  public void setOwningLoop(java.lang.String value) {
    try {
      javonetHandle.set("OwningLoop", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getOwningLoop() {
    try {
      java.lang.String res = javonetHandle.get("OwningLoop");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
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

  public void setElementsAsDataSegment(DataElements value) {
    try {
      javonetHandle.set("Elements", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public DataElements getElementsAsDataSegment() {
    try {
      Object res = javonetHandle.<NObject>get("Elements");
      if (res == null) return null;
      return new DataElements((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public DataElement getLastElementAsDataSegment() {
    try {
      Object res = javonetHandle.<NObject>get("LastElement");
      if (res == null) return null;
      return new DataElement((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public DataElement getFirstElementAsDataSegment() {
    try {
      Object res = javonetHandle.<NObject>get("FirstElement");
      if (res == null) return null;
      return new DataElement((NObject) res);
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
  /** GetFiled */

  public static java.lang.Integer getNumberCreated() {
    try {
      java.lang.Integer res = Javonet.getType("DataSegment").get("NumberCreated");
      if (res == null) return 0;
      return Javonet.getType("DataSegment").get("NumberCreated");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setNumberCreated(java.lang.Integer param) {
    try {
      Javonet.getType("DataSegment").set("NumberCreated", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DataSegment(java.lang.String segmentName, java.lang.String description) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.DataSegment", segmentName, description);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DataSegment(
      java.lang.String segmentName,
      java.lang.Integer min,
      java.lang.Integer max,
      Usage usage,
      java.lang.String description) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "RDPCrystalEDILibrary.DataSegment",
              segmentName,
              min,
              max,
              NEnum.fromJavaEnum(usage),
              description);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DataSegment(java.lang.String segmentName) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.DataSegment", segmentName);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DataSegment(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public DataElement CreateDataElement(java.lang.Boolean composite) {
    try {
      Object res = javonetHandle.invoke("CreateDataElement", composite);
      if (res == null) return null;
      return new DataElement((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Boolean ContainsElement(java.lang.Integer elementIndex) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("ContainsElement", elementIndex);
      if (res == null) return false;
      return javonetHandle.invoke("ContainsElement", elementIndex);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public void Populate(java.lang.String[] elementValues) {
    try {
      javonetHandle.invoke("Populate", new Object[] {elementValues});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void PopulateElements(java.lang.String[] elementValues) {
    try {
      javonetHandle.invoke("PopulateElements", new Object[] {elementValues});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Boolean HasElementPairConstraints() {
    try {
      java.lang.Boolean res = javonetHandle.invoke("HasElementPairConstraints");
      if (res == null) return false;
      return javonetHandle.invoke("HasElementPairConstraints");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
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
