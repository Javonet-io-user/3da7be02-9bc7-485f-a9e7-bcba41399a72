package jio.System.Windows.Forms;

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
import jio.System.Windows.Forms.*;
import jio.System.Runtime.Serialization.*;

public class TreeNode extends MarshalByRefObject implements ICloneable, ISerializable {
  protected NObject javonetHandle;

  public TreeNode() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Windows.Forms.TreeNode");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public TreeNode(java.lang.String text) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Windows.Forms.TreeNode", text);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public TreeNode(java.lang.String text, TreeNode children) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Windows.Forms.TreeNode", text, new Object[] {children});
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public TreeNode(
      java.lang.String text, java.lang.Integer imageIndex, java.lang.Integer selectedImageIndex) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("System.Windows.Forms.TreeNode", text, imageIndex, selectedImageIndex);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public TreeNode(
      java.lang.String text,
      java.lang.Integer imageIndex,
      java.lang.Integer selectedImageIndex,
      TreeNode[] children) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Windows.Forms.TreeNode",
              text,
              imageIndex,
              selectedImageIndex,
              new Object[] {children});
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public TreeNode(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void ISerializable_GetObjectData(SerializationInfo si, StreamingContext context) {
    try {
      javonetHandle
          .explicitInterface("ISerializable")
          .invoke("System.Runtime.Serialization.ISerializable.GetObjectData", si, context);
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
