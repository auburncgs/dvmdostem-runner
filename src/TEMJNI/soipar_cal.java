/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package TEMJNI;

public class soipar_cal {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public soipar_cal(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(soipar_cal obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        temcoreJNI.delete_soipar_cal(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setMicbnup(double value) {
    temcoreJNI.soipar_cal_micbnup_set(swigCPtr, this, value);
  }

  public double getMicbnup() {
    return temcoreJNI.soipar_cal_micbnup_get(swigCPtr, this);
  }

  public void setKdcmoss(double value) {
    temcoreJNI.soipar_cal_kdcmoss_set(swigCPtr, this, value);
  }

  public double getKdcmoss() {
    return temcoreJNI.soipar_cal_kdcmoss_get(swigCPtr, this);
  }

  public void setKdcrawc(double value) {
    temcoreJNI.soipar_cal_kdcrawc_set(swigCPtr, this, value);
  }

  public double getKdcrawc() {
    return temcoreJNI.soipar_cal_kdcrawc_get(swigCPtr, this);
  }

  public void setKdcsoma(double value) {
    temcoreJNI.soipar_cal_kdcsoma_set(swigCPtr, this, value);
  }

  public double getKdcsoma() {
    return temcoreJNI.soipar_cal_kdcsoma_get(swigCPtr, this);
  }

  public void setKdcsompr(double value) {
    temcoreJNI.soipar_cal_kdcsompr_set(swigCPtr, this, value);
  }

  public double getKdcsompr() {
    return temcoreJNI.soipar_cal_kdcsompr_get(swigCPtr, this);
  }

  public void setKdcsomcr(double value) {
    temcoreJNI.soipar_cal_kdcsomcr_set(swigCPtr, this, value);
  }

  public double getKdcsomcr() {
    return temcoreJNI.soipar_cal_kdcsomcr_get(swigCPtr, this);
  }

  public soipar_cal() {
    this(temcoreJNI.new_soipar_cal(), true);
  }

}
