/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package TEMJNI;

public class soi2atm_env {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public soi2atm_env(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(soi2atm_env obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        temcoreJNI.delete_soi2atm_env(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setEvap(double value) {
    temcoreJNI.soi2atm_env_evap_set(swigCPtr, this, value);
  }

  public double getEvap() {
    return temcoreJNI.soi2atm_env_evap_get(swigCPtr, this);
  }

  public void setEvap_pet(double value) {
    temcoreJNI.soi2atm_env_evap_pet_set(swigCPtr, this, value);
  }

  public double getEvap_pet() {
    return temcoreJNI.soi2atm_env_evap_pet_get(swigCPtr, this);
  }

  public void setSwrefl(double value) {
    temcoreJNI.soi2atm_env_swrefl_set(swigCPtr, this, value);
  }

  public double getSwrefl() {
    return temcoreJNI.soi2atm_env_swrefl_get(swigCPtr, this);
  }

  public soi2atm_env() {
    this(temcoreJNI.new_soi2atm_env(), true);
  }

}
