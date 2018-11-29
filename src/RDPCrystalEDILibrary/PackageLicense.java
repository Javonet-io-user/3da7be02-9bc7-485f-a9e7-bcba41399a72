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
import jio.System.*;

public class PackageLicense {
  protected NObject javonetHandle;
  /** GetFiled */
  public static java.lang.String getKey() {
    try {
      java.lang.String res = Javonet.getType("PackageLicense").get("Key");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  public static void setKey(java.lang.String param) {
    try {
      Javonet.getType("PackageLicense").set("Key", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public static <T> java.lang.Boolean IsValidLicense(Object instance) {
    try {
      java.lang.Boolean res = Javonet.getType("PackageLicense").invoke("IsValidLicense", instance);
      if (res == null) return false;
      return Javonet.getType("PackageLicense").invoke("IsValidLicense", instance);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public static java.lang.Boolean IsValidLicense() {
    try {
      java.lang.Boolean res = Javonet.getType("PackageLicense").invoke("IsValidLicense");
      if (res == null) return false;
      return Javonet.getType("PackageLicense").invoke("IsValidLicense");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
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
