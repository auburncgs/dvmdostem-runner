/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package TEMJNI;

public class soistate_bgc {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected soistate_bgc(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(soistate_bgc obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        temcoreJNI.delete_soistate_bgc(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setWdebrisc(double value) {
    temcoreJNI.soistate_bgc_wdebrisc_set(swigCPtr, this, value);
  }

  public double getWdebrisc() {
    return temcoreJNI.soistate_bgc_wdebrisc_get(swigCPtr, this);
  }

  public void setWdebrisn(double value) {
    temcoreJNI.soistate_bgc_wdebrisn_set(swigCPtr, this, value);
  }

  public double getWdebrisn() {
    return temcoreJNI.soistate_bgc_wdebrisn_get(swigCPtr, this);
  }

  public void setDmossc(double value) {
    temcoreJNI.soistate_bgc_dmossc_set(swigCPtr, this, value);
  }

  public double getDmossc() {
    return temcoreJNI.soistate_bgc_dmossc_get(swigCPtr, this);
  }

  public void setDmossn(double value) {
    temcoreJNI.soistate_bgc_dmossn_set(swigCPtr, this, value);
  }

  public double getDmossn() {
    return temcoreJNI.soistate_bgc_dmossn_get(swigCPtr, this);
  }

  public void setRawc(double[] value) {
    temcoreJNI.soistate_bgc_rawc_set(swigCPtr, this, value);
  }

  public double[] getRawc() {
    return temcoreJNI.soistate_bgc_rawc_get(swigCPtr, this);
  }

  public void setSoma(double[] value) {
    temcoreJNI.soistate_bgc_soma_set(swigCPtr, this, value);
  }

  public double[] getSoma() {
    return temcoreJNI.soistate_bgc_soma_get(swigCPtr, this);
  }

  public void setSompr(double[] value) {
    temcoreJNI.soistate_bgc_sompr_set(swigCPtr, this, value);
  }

  public double[] getSompr() {
    return temcoreJNI.soistate_bgc_sompr_get(swigCPtr, this);
  }

  public void setSomcr(double[] value) {
    temcoreJNI.soistate_bgc_somcr_set(swigCPtr, this, value);
  }

  public double[] getSomcr() {
    return temcoreJNI.soistate_bgc_somcr_get(swigCPtr, this);
  }

  public void setOrgn(double[] value) {
    temcoreJNI.soistate_bgc_orgn_set(swigCPtr, this, value);
  }

  public double[] getOrgn() {
    return temcoreJNI.soistate_bgc_orgn_get(swigCPtr, this);
  }

  public void setAvln(double[] value) {
    temcoreJNI.soistate_bgc_avln_set(swigCPtr, this, value);
  }

  public double[] getAvln() {
    return temcoreJNI.soistate_bgc_avln_get(swigCPtr, this);
  }

  public soistate_bgc() {
    this(temcoreJNI.new_soistate_bgc(), true);
  }

}
