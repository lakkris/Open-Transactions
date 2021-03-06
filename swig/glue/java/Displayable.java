/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opentransactions.otapi;

public class Displayable extends Storable {
  private long swigCPtr;

  protected Displayable(long cPtr, boolean cMemoryOwn) {
    super(otapiJNI.Displayable_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Displayable obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        otapiJNI.delete_Displayable(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void setGui_label(String value) {
    otapiJNI.Displayable_gui_label_set(swigCPtr, this, value);
  }

  public String getGui_label() {
    return otapiJNI.Displayable_gui_label_get(swigCPtr, this);
  }

  public static Displayable ot_dynamic_cast(Storable pObject) {
    long cPtr = otapiJNI.Displayable_ot_dynamic_cast(Storable.getCPtr(pObject), pObject);
    return (cPtr == 0) ? null : new Displayable(cPtr, false);
  }

}
