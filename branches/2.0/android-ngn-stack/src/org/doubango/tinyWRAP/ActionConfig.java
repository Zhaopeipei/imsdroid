/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.39
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.doubango.tinyWRAP;

public class ActionConfig {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ActionConfig(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ActionConfig obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      tinyWRAPJNI.delete_ActionConfig(swigCPtr);
    }
    swigCPtr = 0;
  }

  public ActionConfig() {
    this(tinyWRAPJNI.new_ActionConfig(), true);
  }

  public boolean addHeader(String name, String value) {
    return tinyWRAPJNI.ActionConfig_addHeader(swigCPtr, this, name, value);
  }

  public boolean addPayload(java.nio.ByteBuffer payload, long len) {
    return tinyWRAPJNI.ActionConfig_addPayload(swigCPtr, this, payload, len);
  }

  public ActionConfig setResponseLine(short code, String phrase) {
    long cPtr = tinyWRAPJNI.ActionConfig_setResponseLine(swigCPtr, this, code, phrase);
    return (cPtr == 0) ? null : new ActionConfig(cPtr, false);
  }

  public ActionConfig setMediaString(twrap_media_type_t type, String key, String value) {
    long cPtr = tinyWRAPJNI.ActionConfig_setMediaString(swigCPtr, this, type.swigValue(), key, value);
    return (cPtr == 0) ? null : new ActionConfig(cPtr, false);
  }

  public ActionConfig setMediaInt(twrap_media_type_t type, String key, int value) {
    long cPtr = tinyWRAPJNI.ActionConfig_setMediaInt(swigCPtr, this, type.swigValue(), key, value);
    return (cPtr == 0) ? null : new ActionConfig(cPtr, false);
  }

}
