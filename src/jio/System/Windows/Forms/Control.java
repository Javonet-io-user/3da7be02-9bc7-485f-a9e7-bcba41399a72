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
import jio.System.ComponentModel.*;
import jio.System.Windows.Forms.*;
import jio.System.*;

public class Control extends Component
    implements IComponent,
        IDisposable,
        IDropTarget,
        ISynchronizeInvoke,
        IWin32Window,
        IBindableComponent {
  protected NObject javonetHandle;

  public Control() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Windows.Forms.Control");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Control(java.lang.String text) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Windows.Forms.Control", text);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Control(
      java.lang.String text,
      java.lang.Integer left,
      java.lang.Integer top,
      java.lang.Integer width,
      java.lang.Integer height) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Windows.Forms.Control", text, left, top, width, height);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Control(Control parent, java.lang.String text) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Windows.Forms.Control", parent, text);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Control(
      Control parent,
      java.lang.String text,
      java.lang.Integer left,
      java.lang.Integer top,
      java.lang.Integer width,
      java.lang.Integer height) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("System.Windows.Forms.Control", parent, text, left, top, width, height);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Control(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void OnDragEnter(DragEventArgs drgEvent) {
    try {
      javonetHandle
          .explicitInterface("IDropTarget")
          .invoke("System.Windows.Forms.IDropTarget.OnDragEnter", drgEvent);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void OnDragLeave(EventArgs e) {
    try {
      javonetHandle
          .explicitInterface("IDropTarget")
          .invoke("System.Windows.Forms.IDropTarget.OnDragLeave", e);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void OnDragDrop(DragEventArgs drgEvent) {
    try {
      javonetHandle
          .explicitInterface("IDropTarget")
          .invoke("System.Windows.Forms.IDropTarget.OnDragDrop", drgEvent);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void OnDragOver(DragEventArgs drgEvent) {
    try {
      javonetHandle
          .explicitInterface("IDropTarget")
          .invoke("System.Windows.Forms.IDropTarget.OnDragOver", drgEvent);
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
