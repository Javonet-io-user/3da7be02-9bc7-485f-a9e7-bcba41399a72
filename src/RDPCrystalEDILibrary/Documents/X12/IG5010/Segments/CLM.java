package RDPCrystalEDILibrary.Documents.X12.IG5010.Segments;

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
import RDPCrystalEDILibrary.Documents.*;
import RDPCrystalEDILibrary.Documents.X12.IG5010.Segments.*;
import RDPCrystalEDILibrary.*;

public class CLM extends DocumentSegment {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setClaimSubmitterIdentifier(java.lang.String value) {
    try {
      javonetHandle.set("ClaimSubmitterIdentifier", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getClaimSubmitterIdentifier() {
    try {
      java.lang.String res = javonetHandle.get("ClaimSubmitterIdentifier");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setMonetaryAmount(java.lang.String value) {
    try {
      javonetHandle.set("MonetaryAmount", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getMonetaryAmount() {
    try {
      java.lang.String res = javonetHandle.get("MonetaryAmount");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setClaimFilingIndicatorCode(java.lang.String value) {
    try {
      javonetHandle.set("ClaimFilingIndicatorCode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getClaimFilingIndicatorCode() {
    try {
      java.lang.String res = javonetHandle.get("ClaimFilingIndicatorCode");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setNonInstitutionalClaimTypeCode(java.lang.String value) {
    try {
      javonetHandle.set("NonInstitutionalClaimTypeCode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getNonInstitutionalClaimTypeCode() {
    try {
      java.lang.String res = javonetHandle.get("NonInstitutionalClaimTypeCode");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setHealthCareServiceLocation(HealthCareServiceLocation value) {
    try {
      javonetHandle.set("HealthCareServiceLocation", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public HealthCareServiceLocation getHealthCareServiceLocation() {
    try {
      Object res = javonetHandle.<NObject>get("HealthCareServiceLocation");
      if (res == null) return null;
      return new HealthCareServiceLocation((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setYesNoConditionOrResponseCode1(java.lang.String value) {
    try {
      javonetHandle.set("YesNoConditionOrResponseCode1", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getYesNoConditionOrResponseCode1() {
    try {
      java.lang.String res = javonetHandle.get("YesNoConditionOrResponseCode1");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setAssignmentOrPlanParticipationCode(java.lang.String value) {
    try {
      javonetHandle.set("AssignmentOrPlanParticipationCode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getAssignmentOrPlanParticipationCode() {
    try {
      java.lang.String res = javonetHandle.get("AssignmentOrPlanParticipationCode");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setYesNoConditionOrResponseCode2(java.lang.String value) {
    try {
      javonetHandle.set("YesNoConditionOrResponseCode2", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getYesNoConditionOrResponseCode2() {
    try {
      java.lang.String res = javonetHandle.get("YesNoConditionOrResponseCode2");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setReleaseOfInformationCode(java.lang.String value) {
    try {
      javonetHandle.set("ReleaseOfInformationCode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getReleaseOfInformationCode() {
    try {
      java.lang.String res = javonetHandle.get("ReleaseOfInformationCode");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setPatientSignatureSourceCode(java.lang.String value) {
    try {
      javonetHandle.set("PatientSignatureSourceCode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getPatientSignatureSourceCode() {
    try {
      java.lang.String res = javonetHandle.get("PatientSignatureSourceCode");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setRelatedCausesInformation(RelatedCausesInformation value) {
    try {
      javonetHandle.set("RelatedCausesInformation", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public RelatedCausesInformation getRelatedCausesInformation() {
    try {
      Object res = javonetHandle.<NObject>get("RelatedCausesInformation");
      if (res == null) return null;
      return new RelatedCausesInformation((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setSpecialProgramCode(java.lang.String value) {
    try {
      javonetHandle.set("SpecialProgramCode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getSpecialProgramCode() {
    try {
      java.lang.String res = javonetHandle.get("SpecialProgramCode");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setYesNoConditionOrResponseCode3(java.lang.String value) {
    try {
      javonetHandle.set("YesNoConditionOrResponseCode3", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getYesNoConditionOrResponseCode3() {
    try {
      java.lang.String res = javonetHandle.get("YesNoConditionOrResponseCode3");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setLevelOfServiceCode(java.lang.String value) {
    try {
      javonetHandle.set("LevelOfServiceCode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getLevelOfServiceCode() {
    try {
      java.lang.String res = javonetHandle.get("LevelOfServiceCode");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setYesNoConditionOrResponseCode4(java.lang.String value) {
    try {
      javonetHandle.set("YesNoConditionOrResponseCode4", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getYesNoConditionOrResponseCode4() {
    try {
      java.lang.String res = javonetHandle.get("YesNoConditionOrResponseCode4");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setProviderAgreementCode(java.lang.String value) {
    try {
      javonetHandle.set("ProviderAgreementCode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getProviderAgreementCode() {
    try {
      java.lang.String res = javonetHandle.get("ProviderAgreementCode");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setClaimStatusCode(java.lang.String value) {
    try {
      javonetHandle.set("ClaimStatusCode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getClaimStatusCode() {
    try {
      java.lang.String res = javonetHandle.get("ClaimStatusCode");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setYesNoConditionOrResponseCode5(java.lang.String value) {
    try {
      javonetHandle.set("YesNoConditionOrResponseCode5", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getYesNoConditionOrResponseCode5() {
    try {
      java.lang.String res = javonetHandle.get("YesNoConditionOrResponseCode5");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setClaimStatusReasonCode(java.lang.String value) {
    try {
      javonetHandle.set("ClaimStatusReasonCode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getClaimStatusReasonCode() {
    try {
      java.lang.String res = javonetHandle.get("ClaimStatusReasonCode");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setDelayReasonCode(java.lang.String value) {
    try {
      javonetHandle.set("DelayReasonCode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getDelayReasonCode() {
    try {
      java.lang.String res = javonetHandle.get("DelayReasonCode");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public CLM() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.Documents.X12.IG5010.Segments.CLM");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CLM(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void Write(WriteArguments w) {
    try {
      javonetHandle.invoke("Write", w);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Load(LightWeightSegment segment) {
    try {
      javonetHandle.invoke("Load", segment);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
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
