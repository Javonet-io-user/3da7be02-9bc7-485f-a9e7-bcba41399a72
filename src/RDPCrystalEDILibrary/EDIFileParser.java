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

public class EDIFileParser {
  protected NObject javonetHandle;
  /** GetProperty */
  public java.lang.Integer getNumberOfSegments() {
    try {
      java.lang.Integer res = javonetHandle.get("NumberOfSegments");
      if (res == null) return 0;
      return javonetHandle.get("NumberOfSegments");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  public java.lang.Boolean getFirstChunkLoaded() {
    try {
      java.lang.Boolean res = javonetHandle.get("FirstChunkLoaded");
      if (res == null) return false;
      return javonetHandle.get("FirstChunkLoaded");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetFiled */

  public static java.lang.Integer getWAIT_TIME() {
    try {
      java.lang.Integer res = Javonet.getType("EDIFileParser").get("WAIT_TIME");
      if (res == null) return 0;
      return Javonet.getType("EDIFileParser").get("WAIT_TIME");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setWAIT_TIME(java.lang.Integer param) {
    try {
      Javonet.getType("EDIFileParser").set("WAIT_TIME", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public EDIFileParser(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public Delimiters GetDelimiters(java.lang.String trimString) {
    try {
      Object res = javonetHandle.invoke("GetDelimiters", trimString);
      if (res == null) return null;
      return new Delimiters((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.String Take() {
    try {
      java.lang.String res = javonetHandle.invoke("Take");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public java.lang.Boolean IsCompleted() {
    try {
      java.lang.Boolean res = javonetHandle.invoke("IsCompleted");
      if (res == null) return false;
      return javonetHandle.invoke("IsCompleted");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public FileProgress StartLoadingFile(java.lang.Character delimiter) {
    try {
      Object res = javonetHandle.invoke("StartLoadingFile", delimiter);
      if (res == null) return null;
      return new FileProgress((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public static class FileProgress {
    protected NObject javonetHandle;

    public FileProgress(java.lang.Long initialSize) {
      try {
        javonetHandle = Javonet.New("RDPCrystalEDILibrary.EDIFileParser+FileProgress", initialSize);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public FileProgress(NObject handle) {
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
    /** Method */

    public void Update(java.lang.Long currentPosition) {
      try {
        javonetHandle.invoke("Update", currentPosition);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
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
