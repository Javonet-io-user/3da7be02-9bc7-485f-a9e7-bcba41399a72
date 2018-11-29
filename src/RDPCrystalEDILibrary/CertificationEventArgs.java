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
import jio.System.Security.Cryptography.X509Certificates.*;
import jio.System.Net.Security.*;

public class CertificationEventArgs extends EventArgs {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setCancel(java.lang.Boolean value) {
    try {
      javonetHandle.set("Cancel", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getCancel() {
    try {
      java.lang.Boolean res = javonetHandle.get("Cancel");
      if (res == null) return false;
      return javonetHandle.get("Cancel");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setCertificate(X509Certificate value) {
    try {
      javonetHandle.set("Certificate", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public X509Certificate getCertificate() {
    try {
      Object res = javonetHandle.<NObject>get("Certificate");
      if (res == null) return null;
      return new X509Certificate((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setChain(X509Chain value) {
    try {
      javonetHandle.set("Chain", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public X509Chain getChain() {
    try {
      Object res = javonetHandle.<NObject>get("Chain");
      if (res == null) return null;
      return new X509Chain((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setSslPolicyErrors(SslPolicyErrors value) {
    try {
      javonetHandle.set("SslPolicyErrors", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public SslPolicyErrors getSslPolicyErrors() {
    try {
      Object res = javonetHandle.<NEnum>get("SslPolicyErrors");
      if (res == null) return null;
      return SslPolicyErrors.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public CertificationEventArgs() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.CertificationEventArgs");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CertificationEventArgs(NObject handle) {
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
