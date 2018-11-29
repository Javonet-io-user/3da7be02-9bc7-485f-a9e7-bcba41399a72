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

public class LIN extends DocumentSegment {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setAssignedIdentification(java.lang.String value) {
    try {
      javonetHandle.set("AssignedIdentification", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getAssignedIdentification() {
    try {
      java.lang.String res = javonetHandle.get("AssignedIdentification");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setProductServiceIDQualifier1(java.lang.String value) {
    try {
      javonetHandle.set("ProductServiceIDQualifier1", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getProductServiceIDQualifier1() {
    try {
      java.lang.String res = javonetHandle.get("ProductServiceIDQualifier1");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setProductServiceID1(java.lang.String value) {
    try {
      javonetHandle.set("ProductServiceID1", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getProductServiceID1() {
    try {
      java.lang.String res = javonetHandle.get("ProductServiceID1");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setProductServiceIDQualifier2(java.lang.String value) {
    try {
      javonetHandle.set("ProductServiceIDQualifier2", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getProductServiceIDQualifier2() {
    try {
      java.lang.String res = javonetHandle.get("ProductServiceIDQualifier2");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setProductServiceID2(java.lang.String value) {
    try {
      javonetHandle.set("ProductServiceID2", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getProductServiceID2() {
    try {
      java.lang.String res = javonetHandle.get("ProductServiceID2");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setProductServiceIDQualifier3(java.lang.String value) {
    try {
      javonetHandle.set("ProductServiceIDQualifier3", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getProductServiceIDQualifier3() {
    try {
      java.lang.String res = javonetHandle.get("ProductServiceIDQualifier3");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setProductServiceID3(java.lang.String value) {
    try {
      javonetHandle.set("ProductServiceID3", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getProductServiceID3() {
    try {
      java.lang.String res = javonetHandle.get("ProductServiceID3");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setProductServiceIDQualifier4(java.lang.String value) {
    try {
      javonetHandle.set("ProductServiceIDQualifier4", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getProductServiceIDQualifier4() {
    try {
      java.lang.String res = javonetHandle.get("ProductServiceIDQualifier4");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setProductServiceID4(java.lang.String value) {
    try {
      javonetHandle.set("ProductServiceID4", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getProductServiceID4() {
    try {
      java.lang.String res = javonetHandle.get("ProductServiceID4");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setProductServiceIDQualifier5(java.lang.String value) {
    try {
      javonetHandle.set("ProductServiceIDQualifier5", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getProductServiceIDQualifier5() {
    try {
      java.lang.String res = javonetHandle.get("ProductServiceIDQualifier5");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setProductServiceID5(java.lang.String value) {
    try {
      javonetHandle.set("ProductServiceID5", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getProductServiceID5() {
    try {
      java.lang.String res = javonetHandle.get("ProductServiceID5");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setProductServiceIDQualifier6(java.lang.String value) {
    try {
      javonetHandle.set("ProductServiceIDQualifier6", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getProductServiceIDQualifier6() {
    try {
      java.lang.String res = javonetHandle.get("ProductServiceIDQualifier6");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setProductServiceID6(java.lang.String value) {
    try {
      javonetHandle.set("ProductServiceID6", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getProductServiceID6() {
    try {
      java.lang.String res = javonetHandle.get("ProductServiceID6");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setProductServiceIDQualifier7(java.lang.String value) {
    try {
      javonetHandle.set("ProductServiceIDQualifier7", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getProductServiceIDQualifier7() {
    try {
      java.lang.String res = javonetHandle.get("ProductServiceIDQualifier7");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setProductServiceID7(java.lang.String value) {
    try {
      javonetHandle.set("ProductServiceID7", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getProductServiceID7() {
    try {
      java.lang.String res = javonetHandle.get("ProductServiceID7");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setProductServiceIDQualifier8(java.lang.String value) {
    try {
      javonetHandle.set("ProductServiceIDQualifier8", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getProductServiceIDQualifier8() {
    try {
      java.lang.String res = javonetHandle.get("ProductServiceIDQualifier8");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setProductServiceID8(java.lang.String value) {
    try {
      javonetHandle.set("ProductServiceID8", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getProductServiceID8() {
    try {
      java.lang.String res = javonetHandle.get("ProductServiceID8");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setProductServiceIDQualifier9(java.lang.String value) {
    try {
      javonetHandle.set("ProductServiceIDQualifier9", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getProductServiceIDQualifier9() {
    try {
      java.lang.String res = javonetHandle.get("ProductServiceIDQualifier9");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setProductServiceID9(java.lang.String value) {
    try {
      javonetHandle.set("ProductServiceID9", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getProductServiceID9() {
    try {
      java.lang.String res = javonetHandle.get("ProductServiceID9");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setProductServiceIDQualifier10(java.lang.String value) {
    try {
      javonetHandle.set("ProductServiceIDQualifier10", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getProductServiceIDQualifier10() {
    try {
      java.lang.String res = javonetHandle.get("ProductServiceIDQualifier10");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setProductServiceID10(java.lang.String value) {
    try {
      javonetHandle.set("ProductServiceID10", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getProductServiceID10() {
    try {
      java.lang.String res = javonetHandle.get("ProductServiceID10");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setProductServiceIDQualifier11(java.lang.String value) {
    try {
      javonetHandle.set("ProductServiceIDQualifier11", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getProductServiceIDQualifier11() {
    try {
      java.lang.String res = javonetHandle.get("ProductServiceIDQualifier11");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setProductServiceID11(java.lang.String value) {
    try {
      javonetHandle.set("ProductServiceID11", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getProductServiceID11() {
    try {
      java.lang.String res = javonetHandle.get("ProductServiceID11");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setProductServiceIDQualifier12(java.lang.String value) {
    try {
      javonetHandle.set("ProductServiceIDQualifier12", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getProductServiceIDQualifier12() {
    try {
      java.lang.String res = javonetHandle.get("ProductServiceIDQualifier12");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setProductServiceID12(java.lang.String value) {
    try {
      javonetHandle.set("ProductServiceID12", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getProductServiceID12() {
    try {
      java.lang.String res = javonetHandle.get("ProductServiceID12");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setProductServiceIDQualifier13(java.lang.String value) {
    try {
      javonetHandle.set("ProductServiceIDQualifier13", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getProductServiceIDQualifier13() {
    try {
      java.lang.String res = javonetHandle.get("ProductServiceIDQualifier13");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setProductServiceID13(java.lang.String value) {
    try {
      javonetHandle.set("ProductServiceID13", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getProductServiceID13() {
    try {
      java.lang.String res = javonetHandle.get("ProductServiceID13");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setProductServiceIDQualifier14(java.lang.String value) {
    try {
      javonetHandle.set("ProductServiceIDQualifier14", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getProductServiceIDQualifier14() {
    try {
      java.lang.String res = javonetHandle.get("ProductServiceIDQualifier14");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setProductServiceID14(java.lang.String value) {
    try {
      javonetHandle.set("ProductServiceID14", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getProductServiceID14() {
    try {
      java.lang.String res = javonetHandle.get("ProductServiceID14");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setProductServiceIDQualifier15(java.lang.String value) {
    try {
      javonetHandle.set("ProductServiceIDQualifier15", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getProductServiceIDQualifier15() {
    try {
      java.lang.String res = javonetHandle.get("ProductServiceIDQualifier15");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setProductServiceID15(java.lang.String value) {
    try {
      javonetHandle.set("ProductServiceID15", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getProductServiceID15() {
    try {
      java.lang.String res = javonetHandle.get("ProductServiceID15");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public LIN() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.Documents.X12.IG5010.Segments.LIN");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public LIN(NObject handle) {
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
