/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package TEMJNI;

public class lnd2atm_env {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected lnd2atm_env(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(lnd2atm_env obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        temcoreJNI.delete_lnd2atm_env(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setEet(double value) {
    temcoreJNI.lnd2atm_env_eet_set(swigCPtr, this, value);
  }

  public double getEet() {
    return temcoreJNI.lnd2atm_env_eet_get(swigCPtr, this);
  }

  public void setPet(double value) {
    temcoreJNI.lnd2atm_env_pet_set(swigCPtr, this, value);
  }

  public double getPet() {
    return temcoreJNI.lnd2atm_env_pet_get(swigCPtr, this);
  }

  public lnd2atm_env() {
    this(temcoreJNI.new_lnd2atm_env(), true);
  }

}
