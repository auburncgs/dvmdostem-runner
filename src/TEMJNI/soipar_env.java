/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package TEMJNI;

public class soipar_env {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public soipar_env(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(soipar_env obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        temcoreJNI.delete_soipar_env(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setRtdp4gdd(double value) {
    temcoreJNI.soipar_env_rtdp4gdd_set(swigCPtr, this, value);
  }

  public double getRtdp4gdd() {
    return temcoreJNI.soipar_env_rtdp4gdd_get(swigCPtr, this);
  }

  public void setPsimax(double value) {
    temcoreJNI.soipar_env_psimax_set(swigCPtr, this, value);
  }

  public double getPsimax() {
    return temcoreJNI.soipar_env_psimax_get(swigCPtr, this);
  }

  public void setEvapmin(double value) {
    temcoreJNI.soipar_env_evapmin_set(swigCPtr, this, value);
  }

  public double getEvapmin() {
    return temcoreJNI.soipar_env_evapmin_get(swigCPtr, this);
  }

  public void setDrainmax(double value) {
    temcoreJNI.soipar_env_drainmax_set(swigCPtr, this, value);
  }

  public double getDrainmax() {
    return temcoreJNI.soipar_env_drainmax_get(swigCPtr, this);
  }

  public soipar_env() {
    this(temcoreJNI.new_soipar_env(), true);
  }

}
