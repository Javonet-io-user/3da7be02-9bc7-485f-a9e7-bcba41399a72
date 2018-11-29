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
import jio.System.*;
import RDPCrystalEDILibrary.*;

public class ValidationEventsArgs extends EventArgs {
  protected NObject javonetHandle;
  /** GetProperty */
  public java.lang.Boolean getPassed() {
    try {
      java.lang.Boolean res = javonetHandle.get("Passed");
      if (res == null) return false;
      return javonetHandle.get("Passed");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  public java.lang.Double getMilliseconds() {
    try {
      java.lang.Double res = javonetHandle.get("Milliseconds");
      if (res == null) return 0.0;
      return javonetHandle.get("Milliseconds");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0.0;
    }
  }

  public ValidationEventsArgs() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.ValidationEventsArgs");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ValidationEventsArgs(java.lang.Boolean passed, java.lang.Double milliseconds) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("RDPCrystalEDILibrary.ValidationEventsArgs", passed, milliseconds);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ValidationEventsArgs(NObject handle) {
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
