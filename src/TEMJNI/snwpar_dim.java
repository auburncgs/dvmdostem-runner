/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package TEMJNI;

public class snwpar_dim {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected snwpar_dim(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(snwpar_dim obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        temcoreJNI.delete_snwpar_dim(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setNewden(double value) {
    temcoreJNI.snwpar_dim_newden_set(swigCPtr, this, value);
  }

  public double getNewden() {
    return temcoreJNI.snwpar_dim_newden_get(swigCPtr, this);
  }

  public void setDenmax(double value) {
    temcoreJNI.snwpar_dim_denmax_set(swigCPtr, this, value);
  }

  public double getDenmax() {
    return temcoreJNI.snwpar_dim_denmax_get(swigCPtr, this);
  }

  public snwpar_dim() {
    this(temcoreJNI.new_snwpar_dim(), true);
  }

}