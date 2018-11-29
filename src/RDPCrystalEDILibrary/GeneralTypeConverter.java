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
import jio.System.Globalization.*;

public class GeneralTypeConverter extends TypeConverter {
  protected NObject javonetHandle;

  public GeneralTypeConverter() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("RDPCrystalEDILibrary.GeneralTypeConverter");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public GeneralTypeConverter(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public java.lang.Boolean CanConvertTo(
      ITypeDescriptorContext context, jio.System.Type destinationType) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("CanConvertTo", context, destinationType);
      if (res == null) return false;
      return javonetHandle.invoke("CanConvertTo", context, destinationType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public Object ConvertTo(
      ITypeDescriptorContext context,
      CultureInfo culture,
      Object value,
      jio.System.Type destinationType) {
    try {
      Object res = javonetHandle.invoke("ConvertTo", context, culture, value, destinationType);
      if (res == null) return null;
      return (Object) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public PropertyDescriptorCollection GetProperties(
      ITypeDescriptorContext context, Object value, Attribute attributes) {
    try {
      Object res = javonetHandle.invoke("GetProperties", context, value, new Object[] {attributes});
      if (res == null) return null;
      return new PropertyDescriptorCollection((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Boolean GetPropertiesSupported(ITypeDescriptorContext context) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("GetPropertiesSupported", context);
      if (res == null) return false;
      return javonetHandle.invoke("GetPropertiesSupported", context);
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
