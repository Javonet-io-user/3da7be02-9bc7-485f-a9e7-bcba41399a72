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
import RDPCrystalEDILibrary.*;
import jio.System.Windows.Forms.*;

public class TreeGenerator {
  protected NObject javonetHandle;

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public static TreeNode BuildRulesTree(EDIRulesReader reader) {
    try {
      Object res = Javonet.getType("TreeGenerator").invoke("BuildRulesTree", reader);
      if (res == null) return null;
      return new TreeNode((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static TreeNode BuildEDIDocumentTree(
      EDIDocument document, java.lang.Boolean expandLoopNode) {
    try {
      Object res =
          Javonet.getType("TreeGenerator").invoke("BuildEDIDocumentTree", document, expandLoopNode);
      if (res == null) return null;
      return new TreeNode((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static TreeNode BuildValidatedDataTree(EDIValidator validator) {
    try {
      Object res = Javonet.getType("TreeGenerator").invoke("BuildValidatedDataTree", validator);
      if (res == null) return null;
      return new TreeNode((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
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
