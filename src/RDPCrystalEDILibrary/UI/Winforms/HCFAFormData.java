package RDPCrystalEDILibrary.UI.Winforms;

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
import RDPCrystalEDILibrary.UI.Winforms.*;

public class HCFAFormData {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setID(java.lang.Integer value) {
    try {
      javonetHandle.set("ID", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getID() {
    try {
      java.lang.Integer res = javonetHandle.get("ID");
      if (res == null) return 0;
      return javonetHandle.get("ID");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  public void setBox0a(java.lang.Boolean value) {
    try {
      javonetHandle.set("Box0a", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getBox0a() {
    try {
      java.lang.Boolean res = javonetHandle.get("Box0a");
      if (res == null) return false;
      return javonetHandle.get("Box0a");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setBox0b(java.lang.Boolean value) {
    try {
      javonetHandle.set("Box0b", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getBox0b() {
    try {
      java.lang.Boolean res = javonetHandle.get("Box0b");
      if (res == null) return false;
      return javonetHandle.get("Box0b");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setBox0c(java.lang.Boolean value) {
    try {
      javonetHandle.set("Box0c", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getBox0c() {
    try {
      java.lang.Boolean res = javonetHandle.get("Box0c");
      if (res == null) return false;
      return javonetHandle.get("Box0c");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setBox0d(java.lang.Boolean value) {
    try {
      javonetHandle.set("Box0d", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getBox0d() {
    try {
      java.lang.Boolean res = javonetHandle.get("Box0d");
      if (res == null) return false;
      return javonetHandle.get("Box0d");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setBox0e(java.lang.Boolean value) {
    try {
      javonetHandle.set("Box0e", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getBox0e() {
    try {
      java.lang.Boolean res = javonetHandle.get("Box0e");
      if (res == null) return false;
      return javonetHandle.get("Box0e");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setBox0f(java.lang.Boolean value) {
    try {
      javonetHandle.set("Box0f", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getBox0f() {
    try {
      java.lang.Boolean res = javonetHandle.get("Box0f");
      if (res == null) return false;
      return javonetHandle.get("Box0f");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setBox0g(java.lang.Boolean value) {
    try {
      javonetHandle.set("Box0g", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getBox0g() {
    try {
      java.lang.Boolean res = javonetHandle.get("Box0g");
      if (res == null) return false;
      return javonetHandle.get("Box0g");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setBox10Aa(java.lang.Boolean value) {
    try {
      javonetHandle.set("Box10Aa", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getBox10Aa() {
    try {
      java.lang.Boolean res = javonetHandle.get("Box10Aa");
      if (res == null) return false;
      return javonetHandle.get("Box10Aa");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setBox10Ab(java.lang.Boolean value) {
    try {
      javonetHandle.set("Box10Ab", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getBox10Ab() {
    try {
      java.lang.Boolean res = javonetHandle.get("Box10Ab");
      if (res == null) return false;
      return javonetHandle.get("Box10Ab");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setBox10b3(java.lang.String value) {
    try {
      javonetHandle.set("Box10b3", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox10b3() {
    try {
      java.lang.String res = javonetHandle.get("Box10b3");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox10Ba(java.lang.Boolean value) {
    try {
      javonetHandle.set("Box10Ba", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getBox10Ba() {
    try {
      java.lang.Boolean res = javonetHandle.get("Box10Ba");
      if (res == null) return false;
      return javonetHandle.get("Box10Ba");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setBox10Bb(java.lang.Boolean value) {
    try {
      javonetHandle.set("Box10Bb", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getBox10Bb() {
    try {
      java.lang.Boolean res = javonetHandle.get("Box10Bb");
      if (res == null) return false;
      return javonetHandle.get("Box10Bb");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setBox10Ca(java.lang.Boolean value) {
    try {
      javonetHandle.set("Box10Ca", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getBox10Ca() {
    try {
      java.lang.Boolean res = javonetHandle.get("Box10Ca");
      if (res == null) return false;
      return javonetHandle.get("Box10Ca");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setBox10Cb(java.lang.Boolean value) {
    try {
      javonetHandle.set("Box10Cb", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getBox10Cb() {
    try {
      java.lang.Boolean res = javonetHandle.get("Box10Cb");
      if (res == null) return false;
      return javonetHandle.get("Box10Cb");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setBox11(java.lang.String value) {
    try {
      javonetHandle.set("Box11", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox11() {
    try {
      java.lang.String res = javonetHandle.get("Box11");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox11A(java.lang.String value) {
    try {
      javonetHandle.set("Box11A", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox11A() {
    try {
      java.lang.String res = javonetHandle.get("Box11A");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox11Ab(java.lang.Boolean value) {
    try {
      javonetHandle.set("Box11Ab", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getBox11Ab() {
    try {
      java.lang.Boolean res = javonetHandle.get("Box11Ab");
      if (res == null) return false;
      return javonetHandle.get("Box11Ab");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setBox11Ac(java.lang.Boolean value) {
    try {
      javonetHandle.set("Box11Ac", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getBox11Ac() {
    try {
      java.lang.Boolean res = javonetHandle.get("Box11Ac");
      if (res == null) return false;
      return javonetHandle.get("Box11Ac");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setBox11b(java.lang.String value) {
    try {
      javonetHandle.set("Box11b", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox11b() {
    try {
      java.lang.String res = javonetHandle.get("Box11b");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox11c(java.lang.String value) {
    try {
      javonetHandle.set("Box11c", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox11c() {
    try {
      java.lang.String res = javonetHandle.get("Box11c");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox11Da(java.lang.Boolean value) {
    try {
      javonetHandle.set("Box11Da", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getBox11Da() {
    try {
      java.lang.Boolean res = javonetHandle.get("Box11Da");
      if (res == null) return false;
      return javonetHandle.get("Box11Da");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setBox11Db(java.lang.Boolean value) {
    try {
      javonetHandle.set("Box11Db", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getBox11Db() {
    try {
      java.lang.Boolean res = javonetHandle.get("Box11Db");
      if (res == null) return false;
      return javonetHandle.get("Box11Db");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setBox12(java.lang.String value) {
    try {
      javonetHandle.set("Box12", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox12() {
    try {
      java.lang.String res = javonetHandle.get("Box12");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox12b(java.lang.String value) {
    try {
      javonetHandle.set("Box12b", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox12b() {
    try {
      java.lang.String res = javonetHandle.get("Box12b");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox13(java.lang.String value) {
    try {
      javonetHandle.set("Box13", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox13() {
    try {
      java.lang.String res = javonetHandle.get("Box13");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox14(java.lang.String value) {
    try {
      javonetHandle.set("Box14", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox14() {
    try {
      java.lang.String res = javonetHandle.get("Box14");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox15(java.lang.String value) {
    try {
      javonetHandle.set("Box15", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox15() {
    try {
      java.lang.String res = javonetHandle.get("Box15");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox16a(java.lang.String value) {
    try {
      javonetHandle.set("Box16a", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox16a() {
    try {
      java.lang.String res = javonetHandle.get("Box16a");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox16b(java.lang.String value) {
    try {
      javonetHandle.set("Box16b", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox16b() {
    try {
      java.lang.String res = javonetHandle.get("Box16b");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox17(java.lang.String value) {
    try {
      javonetHandle.set("Box17", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox17() {
    try {
      java.lang.String res = javonetHandle.get("Box17");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox17a(java.lang.String value) {
    try {
      javonetHandle.set("Box17a", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox17a() {
    try {
      java.lang.String res = javonetHandle.get("Box17a");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox18a(java.lang.String value) {
    try {
      javonetHandle.set("Box18a", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox18a() {
    try {
      java.lang.String res = javonetHandle.get("Box18a");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox18b(java.lang.String value) {
    try {
      javonetHandle.set("Box18b", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox18b() {
    try {
      java.lang.String res = javonetHandle.get("Box18b");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox19(java.lang.String value) {
    try {
      javonetHandle.set("Box19", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox19() {
    try {
      java.lang.String res = javonetHandle.get("Box19");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox1a(java.lang.String value) {
    try {
      javonetHandle.set("Box1a", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox1a() {
    try {
      java.lang.String res = javonetHandle.get("Box1a");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox2(java.lang.String value) {
    try {
      javonetHandle.set("Box2", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox2() {
    try {
      java.lang.String res = javonetHandle.get("Box2");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox20Aa(java.lang.Boolean value) {
    try {
      javonetHandle.set("Box20Aa", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getBox20Aa() {
    try {
      java.lang.Boolean res = javonetHandle.get("Box20Aa");
      if (res == null) return false;
      return javonetHandle.get("Box20Aa");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setBox20Ab(java.lang.Boolean value) {
    try {
      javonetHandle.set("Box20Ab", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getBox20Ab() {
    try {
      java.lang.Boolean res = javonetHandle.get("Box20Ab");
      if (res == null) return false;
      return javonetHandle.get("Box20Ab");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setBox20b(java.lang.String value) {
    try {
      javonetHandle.set("Box20b", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox20b() {
    try {
      java.lang.String res = javonetHandle.get("Box20b");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox21a(java.lang.String value) {
    try {
      javonetHandle.set("Box21a", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox21a() {
    try {
      java.lang.String res = javonetHandle.get("Box21a");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox21b(java.lang.String value) {
    try {
      javonetHandle.set("Box21b", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox21b() {
    try {
      java.lang.String res = javonetHandle.get("Box21b");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox21c(java.lang.String value) {
    try {
      javonetHandle.set("Box21c", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox21c() {
    try {
      java.lang.String res = javonetHandle.get("Box21c");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox21d(java.lang.String value) {
    try {
      javonetHandle.set("Box21d", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox21d() {
    try {
      java.lang.String res = javonetHandle.get("Box21d");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox22a(java.lang.String value) {
    try {
      javonetHandle.set("Box22a", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox22a() {
    try {
      java.lang.String res = javonetHandle.get("Box22a");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox22b(java.lang.String value) {
    try {
      javonetHandle.set("Box22b", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox22b() {
    try {
      java.lang.String res = javonetHandle.get("Box22b");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox23(java.lang.String value) {
    try {
      javonetHandle.set("Box23", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox23() {
    try {
      java.lang.String res = javonetHandle.get("Box23");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox241a(java.lang.String value) {
    try {
      javonetHandle.set("Box241a", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox241a() {
    try {
      java.lang.String res = javonetHandle.get("Box241a");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox241aa(java.lang.String value) {
    try {
      javonetHandle.set("Box241aa", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox241aa() {
    try {
      java.lang.String res = javonetHandle.get("Box241aa");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox241b(java.lang.String value) {
    try {
      javonetHandle.set("Box241b", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox241b() {
    try {
      java.lang.String res = javonetHandle.get("Box241b");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox241c(java.lang.String value) {
    try {
      javonetHandle.set("Box241c", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox241c() {
    try {
      java.lang.String res = javonetHandle.get("Box241c");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox241da(java.lang.String value) {
    try {
      javonetHandle.set("Box241da", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox241da() {
    try {
      java.lang.String res = javonetHandle.get("Box241da");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox241db(java.lang.String value) {
    try {
      javonetHandle.set("Box241db", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox241db() {
    try {
      java.lang.String res = javonetHandle.get("Box241db");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox241e(java.lang.String value) {
    try {
      javonetHandle.set("Box241e", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox241e() {
    try {
      java.lang.String res = javonetHandle.get("Box241e");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox241f(java.lang.String value) {
    try {
      javonetHandle.set("Box241f", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox241f() {
    try {
      java.lang.String res = javonetHandle.get("Box241f");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox241g(java.lang.String value) {
    try {
      javonetHandle.set("Box241g", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox241g() {
    try {
      java.lang.String res = javonetHandle.get("Box241g");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox241h(java.lang.String value) {
    try {
      javonetHandle.set("Box241h", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox241h() {
    try {
      java.lang.String res = javonetHandle.get("Box241h");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox241i(java.lang.String value) {
    try {
      javonetHandle.set("Box241i", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox241i() {
    try {
      java.lang.String res = javonetHandle.get("Box241i");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox241j(java.lang.String value) {
    try {
      javonetHandle.set("Box241j", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox241j() {
    try {
      java.lang.String res = javonetHandle.get("Box241j");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox241k(java.lang.String value) {
    try {
      javonetHandle.set("Box241k", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox241k() {
    try {
      java.lang.String res = javonetHandle.get("Box241k");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox242a(java.lang.String value) {
    try {
      javonetHandle.set("Box242a", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox242a() {
    try {
      java.lang.String res = javonetHandle.get("Box242a");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox242aa(java.lang.String value) {
    try {
      javonetHandle.set("Box242aa", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox242aa() {
    try {
      java.lang.String res = javonetHandle.get("Box242aa");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox242b(java.lang.String value) {
    try {
      javonetHandle.set("Box242b", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox242b() {
    try {
      java.lang.String res = javonetHandle.get("Box242b");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox242c(java.lang.String value) {
    try {
      javonetHandle.set("Box242c", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox242c() {
    try {
      java.lang.String res = javonetHandle.get("Box242c");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox242da(java.lang.String value) {
    try {
      javonetHandle.set("Box242da", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox242da() {
    try {
      java.lang.String res = javonetHandle.get("Box242da");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox242db(java.lang.String value) {
    try {
      javonetHandle.set("Box242db", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox242db() {
    try {
      java.lang.String res = javonetHandle.get("Box242db");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox242e(java.lang.String value) {
    try {
      javonetHandle.set("Box242e", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox242e() {
    try {
      java.lang.String res = javonetHandle.get("Box242e");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox242f(java.lang.String value) {
    try {
      javonetHandle.set("Box242f", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox242f() {
    try {
      java.lang.String res = javonetHandle.get("Box242f");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox242g(java.lang.String value) {
    try {
      javonetHandle.set("Box242g", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox242g() {
    try {
      java.lang.String res = javonetHandle.get("Box242g");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox242h(java.lang.String value) {
    try {
      javonetHandle.set("Box242h", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox242h() {
    try {
      java.lang.String res = javonetHandle.get("Box242h");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox242i(java.lang.String value) {
    try {
      javonetHandle.set("Box242i", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox242i() {
    try {
      java.lang.String res = javonetHandle.get("Box242i");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox242j(java.lang.String value) {
    try {
      javonetHandle.set("Box242j", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox242j() {
    try {
      java.lang.String res = javonetHandle.get("Box242j");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox242k(java.lang.String value) {
    try {
      javonetHandle.set("Box242k", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox242k() {
    try {
      java.lang.String res = javonetHandle.get("Box242k");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox243a(java.lang.String value) {
    try {
      javonetHandle.set("Box243a", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox243a() {
    try {
      java.lang.String res = javonetHandle.get("Box243a");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox243aa(java.lang.String value) {
    try {
      javonetHandle.set("Box243aa", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox243aa() {
    try {
      java.lang.String res = javonetHandle.get("Box243aa");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox243b(java.lang.String value) {
    try {
      javonetHandle.set("Box243b", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox243b() {
    try {
      java.lang.String res = javonetHandle.get("Box243b");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox243c(java.lang.String value) {
    try {
      javonetHandle.set("Box243c", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox243c() {
    try {
      java.lang.String res = javonetHandle.get("Box243c");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox243da(java.lang.String value) {
    try {
      javonetHandle.set("Box243da", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox243da() {
    try {
      java.lang.String res = javonetHandle.get("Box243da");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox243db(java.lang.String value) {
    try {
      javonetHandle.set("Box243db", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox243db() {
    try {
      java.lang.String res = javonetHandle.get("Box243db");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox243e(java.lang.String value) {
    try {
      javonetHandle.set("Box243e", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox243e() {
    try {
      java.lang.String res = javonetHandle.get("Box243e");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox243f(java.lang.String value) {
    try {
      javonetHandle.set("Box243f", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox243f() {
    try {
      java.lang.String res = javonetHandle.get("Box243f");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox243g(java.lang.String value) {
    try {
      javonetHandle.set("Box243g", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox243g() {
    try {
      java.lang.String res = javonetHandle.get("Box243g");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox243h(java.lang.String value) {
    try {
      javonetHandle.set("Box243h", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox243h() {
    try {
      java.lang.String res = javonetHandle.get("Box243h");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox243i(java.lang.String value) {
    try {
      javonetHandle.set("Box243i", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox243i() {
    try {
      java.lang.String res = javonetHandle.get("Box243i");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox243j(java.lang.String value) {
    try {
      javonetHandle.set("Box243j", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox243j() {
    try {
      java.lang.String res = javonetHandle.get("Box243j");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox243k(java.lang.String value) {
    try {
      javonetHandle.set("Box243k", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox243k() {
    try {
      java.lang.String res = javonetHandle.get("Box243k");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox244a(java.lang.String value) {
    try {
      javonetHandle.set("Box244a", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox244a() {
    try {
      java.lang.String res = javonetHandle.get("Box244a");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox244aa(java.lang.String value) {
    try {
      javonetHandle.set("Box244aa", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox244aa() {
    try {
      java.lang.String res = javonetHandle.get("Box244aa");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox244b(java.lang.String value) {
    try {
      javonetHandle.set("Box244b", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox244b() {
    try {
      java.lang.String res = javonetHandle.get("Box244b");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox244c(java.lang.String value) {
    try {
      javonetHandle.set("Box244c", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox244c() {
    try {
      java.lang.String res = javonetHandle.get("Box244c");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox244da(java.lang.String value) {
    try {
      javonetHandle.set("Box244da", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox244da() {
    try {
      java.lang.String res = javonetHandle.get("Box244da");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox244db(java.lang.String value) {
    try {
      javonetHandle.set("Box244db", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox244db() {
    try {
      java.lang.String res = javonetHandle.get("Box244db");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox244e(java.lang.String value) {
    try {
      javonetHandle.set("Box244e", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox244e() {
    try {
      java.lang.String res = javonetHandle.get("Box244e");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox244f(java.lang.String value) {
    try {
      javonetHandle.set("Box244f", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox244f() {
    try {
      java.lang.String res = javonetHandle.get("Box244f");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox244g(java.lang.String value) {
    try {
      javonetHandle.set("Box244g", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox244g() {
    try {
      java.lang.String res = javonetHandle.get("Box244g");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox244h(java.lang.String value) {
    try {
      javonetHandle.set("Box244h", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox244h() {
    try {
      java.lang.String res = javonetHandle.get("Box244h");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox244i(java.lang.String value) {
    try {
      javonetHandle.set("Box244i", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox244i() {
    try {
      java.lang.String res = javonetHandle.get("Box244i");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox244j(java.lang.String value) {
    try {
      javonetHandle.set("Box244j", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox244j() {
    try {
      java.lang.String res = javonetHandle.get("Box244j");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox244k(java.lang.String value) {
    try {
      javonetHandle.set("Box244k", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox244k() {
    try {
      java.lang.String res = javonetHandle.get("Box244k");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox245a(java.lang.String value) {
    try {
      javonetHandle.set("Box245a", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox245a() {
    try {
      java.lang.String res = javonetHandle.get("Box245a");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox245aa(java.lang.String value) {
    try {
      javonetHandle.set("Box245aa", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox245aa() {
    try {
      java.lang.String res = javonetHandle.get("Box245aa");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox245b(java.lang.String value) {
    try {
      javonetHandle.set("Box245b", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox245b() {
    try {
      java.lang.String res = javonetHandle.get("Box245b");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox245c(java.lang.String value) {
    try {
      javonetHandle.set("Box245c", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox245c() {
    try {
      java.lang.String res = javonetHandle.get("Box245c");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox245da(java.lang.String value) {
    try {
      javonetHandle.set("Box245da", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox245da() {
    try {
      java.lang.String res = javonetHandle.get("Box245da");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox245db(java.lang.String value) {
    try {
      javonetHandle.set("Box245db", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox245db() {
    try {
      java.lang.String res = javonetHandle.get("Box245db");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox245e(java.lang.String value) {
    try {
      javonetHandle.set("Box245e", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox245e() {
    try {
      java.lang.String res = javonetHandle.get("Box245e");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox245f(java.lang.String value) {
    try {
      javonetHandle.set("Box245f", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox245f() {
    try {
      java.lang.String res = javonetHandle.get("Box245f");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox245g(java.lang.String value) {
    try {
      javonetHandle.set("Box245g", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox245g() {
    try {
      java.lang.String res = javonetHandle.get("Box245g");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox245h(java.lang.String value) {
    try {
      javonetHandle.set("Box245h", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox245h() {
    try {
      java.lang.String res = javonetHandle.get("Box245h");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox245i(java.lang.String value) {
    try {
      javonetHandle.set("Box245i", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox245i() {
    try {
      java.lang.String res = javonetHandle.get("Box245i");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox245j(java.lang.String value) {
    try {
      javonetHandle.set("Box245j", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox245j() {
    try {
      java.lang.String res = javonetHandle.get("Box245j");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox245k(java.lang.String value) {
    try {
      javonetHandle.set("Box245k", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox245k() {
    try {
      java.lang.String res = javonetHandle.get("Box245k");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox246a(java.lang.String value) {
    try {
      javonetHandle.set("Box246a", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox246a() {
    try {
      java.lang.String res = javonetHandle.get("Box246a");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox246aa(java.lang.String value) {
    try {
      javonetHandle.set("Box246aa", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox246aa() {
    try {
      java.lang.String res = javonetHandle.get("Box246aa");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox246b(java.lang.String value) {
    try {
      javonetHandle.set("Box246b", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox246b() {
    try {
      java.lang.String res = javonetHandle.get("Box246b");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox246c(java.lang.String value) {
    try {
      javonetHandle.set("Box246c", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox246c() {
    try {
      java.lang.String res = javonetHandle.get("Box246c");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox246da(java.lang.String value) {
    try {
      javonetHandle.set("Box246da", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox246da() {
    try {
      java.lang.String res = javonetHandle.get("Box246da");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox246db(java.lang.String value) {
    try {
      javonetHandle.set("Box246db", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox246db() {
    try {
      java.lang.String res = javonetHandle.get("Box246db");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox246e(java.lang.String value) {
    try {
      javonetHandle.set("Box246e", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox246e() {
    try {
      java.lang.String res = javonetHandle.get("Box246e");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox246f(java.lang.String value) {
    try {
      javonetHandle.set("Box246f", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox246f() {
    try {
      java.lang.String res = javonetHandle.get("Box246f");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox246g(java.lang.String value) {
    try {
      javonetHandle.set("Box246g", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox246g() {
    try {
      java.lang.String res = javonetHandle.get("Box246g");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox246h(java.lang.String value) {
    try {
      javonetHandle.set("Box246h", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox246h() {
    try {
      java.lang.String res = javonetHandle.get("Box246h");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox246i(java.lang.String value) {
    try {
      javonetHandle.set("Box246i", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox246i() {
    try {
      java.lang.String res = javonetHandle.get("Box246i");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox246j(java.lang.String value) {
    try {
      javonetHandle.set("Box246j", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox246j() {
    try {
      java.lang.String res = javonetHandle.get("Box246j");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox246k(java.lang.String value) {
    try {
      javonetHandle.set("Box246k", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox246k() {
    try {
      java.lang.String res = javonetHandle.get("Box246k");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox25(java.lang.String value) {
    try {
      javonetHandle.set("Box25", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox25() {
    try {
      java.lang.String res = javonetHandle.get("Box25");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox25a(java.lang.String value) {
    try {
      javonetHandle.set("Box25a", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox25a() {
    try {
      java.lang.String res = javonetHandle.get("Box25a");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox25b(java.lang.String value) {
    try {
      javonetHandle.set("Box25b", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox25b() {
    try {
      java.lang.String res = javonetHandle.get("Box25b");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox26(java.lang.String value) {
    try {
      javonetHandle.set("Box26", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox26() {
    try {
      java.lang.String res = javonetHandle.get("Box26");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox27a(java.lang.Boolean value) {
    try {
      javonetHandle.set("Box27a", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getBox27a() {
    try {
      java.lang.Boolean res = javonetHandle.get("Box27a");
      if (res == null) return false;
      return javonetHandle.get("Box27a");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setBox27b(java.lang.Boolean value) {
    try {
      javonetHandle.set("Box27b", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getBox27b() {
    try {
      java.lang.Boolean res = javonetHandle.get("Box27b");
      if (res == null) return false;
      return javonetHandle.get("Box27b");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setBox28(java.lang.String value) {
    try {
      javonetHandle.set("Box28", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox28() {
    try {
      java.lang.String res = javonetHandle.get("Box28");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox29(java.lang.String value) {
    try {
      javonetHandle.set("Box29", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox29() {
    try {
      java.lang.String res = javonetHandle.get("Box29");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox30(java.lang.String value) {
    try {
      javonetHandle.set("Box30", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox30() {
    try {
      java.lang.String res = javonetHandle.get("Box30");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox31(java.lang.String value) {
    try {
      javonetHandle.set("Box31", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox31() {
    try {
      java.lang.String res = javonetHandle.get("Box31");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox32(java.lang.String value) {
    try {
      javonetHandle.set("Box32", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox32() {
    try {
      java.lang.String res = javonetHandle.get("Box32");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox33(java.lang.String value) {
    try {
      javonetHandle.set("Box33", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox33() {
    try {
      java.lang.String res = javonetHandle.get("Box33");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox33a(java.lang.String value) {
    try {
      javonetHandle.set("Box33a", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox33a() {
    try {
      java.lang.String res = javonetHandle.get("Box33a");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox33b(java.lang.String value) {
    try {
      javonetHandle.set("Box33b", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox33b() {
    try {
      java.lang.String res = javonetHandle.get("Box33b");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox3a(java.lang.String value) {
    try {
      javonetHandle.set("Box3a", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox3a() {
    try {
      java.lang.String res = javonetHandle.get("Box3a");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox3b(java.lang.Boolean value) {
    try {
      javonetHandle.set("Box3b", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getBox3b() {
    try {
      java.lang.Boolean res = javonetHandle.get("Box3b");
      if (res == null) return false;
      return javonetHandle.get("Box3b");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setBox3c(java.lang.Boolean value) {
    try {
      javonetHandle.set("Box3c", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getBox3c() {
    try {
      java.lang.Boolean res = javonetHandle.get("Box3c");
      if (res == null) return false;
      return javonetHandle.get("Box3c");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setBox4(java.lang.String value) {
    try {
      javonetHandle.set("Box4", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox4() {
    try {
      java.lang.String res = javonetHandle.get("Box4");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox5a(java.lang.String value) {
    try {
      javonetHandle.set("Box5a", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox5a() {
    try {
      java.lang.String res = javonetHandle.get("Box5a");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox5b(java.lang.String value) {
    try {
      javonetHandle.set("Box5b", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox5b() {
    try {
      java.lang.String res = javonetHandle.get("Box5b");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox5c(java.lang.String value) {
    try {
      javonetHandle.set("Box5c", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox5c() {
    try {
      java.lang.String res = javonetHandle.get("Box5c");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox5d(java.lang.String value) {
    try {
      javonetHandle.set("Box5d", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox5d() {
    try {
      java.lang.String res = javonetHandle.get("Box5d");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox5e(java.lang.String value) {
    try {
      javonetHandle.set("Box5e", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox5e() {
    try {
      java.lang.String res = javonetHandle.get("Box5e");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox6a(java.lang.Boolean value) {
    try {
      javonetHandle.set("Box6a", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getBox6a() {
    try {
      java.lang.Boolean res = javonetHandle.get("Box6a");
      if (res == null) return false;
      return javonetHandle.get("Box6a");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setBox6b(java.lang.Boolean value) {
    try {
      javonetHandle.set("Box6b", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getBox6b() {
    try {
      java.lang.Boolean res = javonetHandle.get("Box6b");
      if (res == null) return false;
      return javonetHandle.get("Box6b");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setBox6c(java.lang.Boolean value) {
    try {
      javonetHandle.set("Box6c", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getBox6c() {
    try {
      java.lang.Boolean res = javonetHandle.get("Box6c");
      if (res == null) return false;
      return javonetHandle.get("Box6c");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setBox6d(java.lang.Boolean value) {
    try {
      javonetHandle.set("Box6d", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getBox6d() {
    try {
      java.lang.Boolean res = javonetHandle.get("Box6d");
      if (res == null) return false;
      return javonetHandle.get("Box6d");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setBox7a(java.lang.String value) {
    try {
      javonetHandle.set("Box7a", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox7a() {
    try {
      java.lang.String res = javonetHandle.get("Box7a");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox7b(java.lang.String value) {
    try {
      javonetHandle.set("Box7b", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox7b() {
    try {
      java.lang.String res = javonetHandle.get("Box7b");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox7c(java.lang.String value) {
    try {
      javonetHandle.set("Box7c", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox7c() {
    try {
      java.lang.String res = javonetHandle.get("Box7c");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox7d(java.lang.String value) {
    try {
      javonetHandle.set("Box7d", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox7d() {
    try {
      java.lang.String res = javonetHandle.get("Box7d");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox7e(java.lang.String value) {
    try {
      javonetHandle.set("Box7e", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox7e() {
    try {
      java.lang.String res = javonetHandle.get("Box7e");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox8Aa(java.lang.Boolean value) {
    try {
      javonetHandle.set("Box8Aa", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getBox8Aa() {
    try {
      java.lang.Boolean res = javonetHandle.get("Box8Aa");
      if (res == null) return false;
      return javonetHandle.get("Box8Aa");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setBox8Ab(java.lang.Boolean value) {
    try {
      javonetHandle.set("Box8Ab", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getBox8Ab() {
    try {
      java.lang.Boolean res = javonetHandle.get("Box8Ab");
      if (res == null) return false;
      return javonetHandle.get("Box8Ab");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setBox8Ac(java.lang.Boolean value) {
    try {
      javonetHandle.set("Box8Ac", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getBox8Ac() {
    try {
      java.lang.Boolean res = javonetHandle.get("Box8Ac");
      if (res == null) return false;
      return javonetHandle.get("Box8Ac");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setBox8Ba(java.lang.Boolean value) {
    try {
      javonetHandle.set("Box8Ba", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getBox8Ba() {
    try {
      java.lang.Boolean res = javonetHandle.get("Box8Ba");
      if (res == null) return false;
      return javonetHandle.get("Box8Ba");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setBox8Bb(java.lang.Boolean value) {
    try {
      javonetHandle.set("Box8Bb", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getBox8Bb() {
    try {
      java.lang.Boolean res = javonetHandle.get("Box8Bb");
      if (res == null) return false;
      return javonetHandle.get("Box8Bb");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setBox8Bc(java.lang.Boolean value) {
    try {
      javonetHandle.set("Box8Bc", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getBox8Bc() {
    try {
      java.lang.Boolean res = javonetHandle.get("Box8Bc");
      if (res == null) return false;
      return javonetHandle.get("Box8Bc");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setBox9(java.lang.String value) {
    try {
      javonetHandle.set("Box9", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox9() {
    try {
      java.lang.String res = javonetHandle.get("Box9");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox9a(java.lang.String value) {
    try {
      javonetHandle.set("Box9a", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox9a() {
    try {
      java.lang.String res = javonetHandle.get("Box9a");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox9Ba(java.lang.String value) {
    try {
      javonetHandle.set("Box9Ba", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox9Ba() {
    try {
      java.lang.String res = javonetHandle.get("Box9Ba");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox9Bb(java.lang.Boolean value) {
    try {
      javonetHandle.set("Box9Bb", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getBox9Bb() {
    try {
      java.lang.Boolean res = javonetHandle.get("Box9Bb");
      if (res == null) return false;
      return javonetHandle.get("Box9Bb");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setBox9Bc(java.lang.Boolean value) {
    try {
      javonetHandle.set("Box9Bc", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getBox9Bc() {
    try {
      java.lang.Boolean res = javonetHandle.get("Box9Bc");
      if (res == null) return false;
      return javonetHandle.get("Box9Bc");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setBox9c(java.lang.String value) {
    try {
      javonetHandle.set("Box9c", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox9c() {
    try {
      java.lang.String res = javonetHandle.get("Box9c");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setBox9d(java.lang.String value) {
    try {
      javonetHandle.set("Box9d", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getBox9d() {
    try {
      java.lang.String res = javonetHandle.get("Box9d");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public HCFAFormData() {
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.UI.Winforms.HCFAFormData");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public HCFAFormData(NObject handle) {
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
