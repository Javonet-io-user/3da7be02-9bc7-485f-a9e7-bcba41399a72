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
import jio.System.ComponentModel.*;
import RDPCrystalEDILibrary.*;
import jio.System.*;
import jio.System.Net.*;

public class HTTP extends Component implements IComponent, IDisposable {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setUsername(java.lang.String value) {
    try {
      javonetHandle.set("Username", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getUsername() {
    try {
      java.lang.String res = javonetHandle.get("Username");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setPassword(java.lang.String value) {
    try {
      javonetHandle.set("Password", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getPassword() {
    try {
      java.lang.String res = javonetHandle.get("Password");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setHostname(java.lang.String value) {
    try {
      javonetHandle.set("Hostname", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getHostname() {
    try {
      java.lang.String res = javonetHandle.get("Hostname");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setCommand(java.lang.String value) {
    try {
      javonetHandle.set("Command", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getCommand() {
    try {
      java.lang.String res = javonetHandle.get("Command");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public HTTP() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.HTTP");
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "FileUploadCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (UploadFileCompletedDelegate handler : _FileUploadCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UploadFileCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DownloadFileCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DownloadFileCompletedDelegate handler : _DownloadFileCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DownloadFileProgressChanged",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DownloadFileProgressChangedDelegate handler :
                  _DownloadFileProgressChangedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DownloadProgressChangedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "FileUploadProgressChanged",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (UploadFileProgressChangedDelegate handler :
                  _FileUploadProgressChangedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UploadProgressChangedEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public HTTP(IContainer container) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.HTTP", container);
      super.setJavonetHandle(javonetHandle);
      javonetHandle.addEventListener(
          "FileUploadCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (UploadFileCompletedDelegate handler : _FileUploadCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UploadFileCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DownloadFileCompleted",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DownloadFileCompletedDelegate handler : _DownloadFileCompletedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], AsyncCompletedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "DownloadFileProgressChanged",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (DownloadFileProgressChangedDelegate handler :
                  _DownloadFileProgressChangedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], DownloadProgressChangedEventArgs.class));
              }
            }
          });
      javonetHandle.addEventListener(
          "FileUploadProgressChanged",
          new com.javonet.api.INEventListener() {
            @Override
            public void eventOccurred(Object[] objects) {
              for (UploadFileProgressChangedDelegate handler :
                  _FileUploadProgressChangedListeners) {
                handler.Invoke(
                    Convert(objects[0], Object.class),
                    Convert(objects[1], UploadProgressChangedEventArgs.class));
              }
            }
          });
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public HTTP(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void UploadFile(java.lang.String path) {
    try {
      javonetHandle.invoke("UploadFile", path);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void UploadFileAsync(java.lang.String path) {
    try {
      javonetHandle.invoke("UploadFileAsync", path);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void DownloadFile(java.lang.String downloadedFilePath) {
    try {
      javonetHandle.invoke("DownloadFile", downloadedFilePath);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void DownloadFileAsync(java.lang.String downloadedFilePath) {
    try {
      javonetHandle.invoke("DownloadFileAsync", downloadedFilePath);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Event */

  private java.util.ArrayList<UploadFileCompletedDelegate> _FileUploadCompletedListeners =
      new java.util.ArrayList<UploadFileCompletedDelegate>();

  public void addFileUploadCompleted(UploadFileCompletedDelegate toAdd) {
    _FileUploadCompletedListeners.add(toAdd);
  }

  public void removeFileUploadCompleted(UploadFileCompletedDelegate toRemove) {
    _FileUploadCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<DownloadFileCompletedDelegate> _DownloadFileCompletedListeners =
      new java.util.ArrayList<DownloadFileCompletedDelegate>();

  public void addDownloadFileCompleted(DownloadFileCompletedDelegate toAdd) {
    _DownloadFileCompletedListeners.add(toAdd);
  }

  public void removeDownloadFileCompleted(DownloadFileCompletedDelegate toRemove) {
    _DownloadFileCompletedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<DownloadFileProgressChangedDelegate>
      _DownloadFileProgressChangedListeners =
          new java.util.ArrayList<DownloadFileProgressChangedDelegate>();

  public void addDownloadFileProgressChanged(DownloadFileProgressChangedDelegate toAdd) {
    _DownloadFileProgressChangedListeners.add(toAdd);
  }

  public void removeDownloadFileProgressChanged(DownloadFileProgressChangedDelegate toRemove) {
    _DownloadFileProgressChangedListeners.remove(toRemove);
  }
  /** Event */

  private java.util.ArrayList<UploadFileProgressChangedDelegate>
      _FileUploadProgressChangedListeners =
          new java.util.ArrayList<UploadFileProgressChangedDelegate>();

  public void addFileUploadProgressChanged(UploadFileProgressChangedDelegate toAdd) {
    _FileUploadProgressChangedListeners.add(toAdd);
  }

  public void removeFileUploadProgressChanged(UploadFileProgressChangedDelegate toRemove) {
    _FileUploadProgressChangedListeners.remove(toRemove);
  }

  public interface UploadFileCompletedDelegate {
    public void Invoke(Object sender, UploadFileCompletedEventArgs e);
  }

  public interface UploadFileProgressChangedDelegate {
    public void Invoke(Object sender, UploadProgressChangedEventArgs e);
  }

  public interface DownloadFileCompletedDelegate {
    public void Invoke(Object sender, AsyncCompletedEventArgs e);
  }

  public interface DownloadFileProgressChangedDelegate {
    public void Invoke(Object sender, DownloadProgressChangedEventArgs e);
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
