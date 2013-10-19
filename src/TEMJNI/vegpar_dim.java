/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package TEMJNI;

public class vegpar_dim {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public vegpar_dim(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(vegpar_dim obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        temcoreJNI.delete_vegpar_dim(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setSla(double[] value) {
    temcoreJNI.vegpar_dim_sla_set(swigCPtr, this, value);
  }

  public double[] getSla() {
    return temcoreJNI.vegpar_dim_sla_get(swigCPtr, this);
  }

  public void setKlai(double[] value) {
    temcoreJNI.vegpar_dim_klai_set(swigCPtr, this, value);
  }

  public double[] getKlai() {
    return temcoreJNI.vegpar_dim_klai_get(swigCPtr, this);
  }

  public void setMinleaf(double[] value) {
    temcoreJNI.vegpar_dim_minleaf_set(swigCPtr, this, value);
  }

  public double[] getMinleaf() {
    return temcoreJNI.vegpar_dim_minleaf_get(swigCPtr, this);
  }

  public void setAleaf(double[] value) {
    temcoreJNI.vegpar_dim_aleaf_set(swigCPtr, this, value);
  }

  public double[] getAleaf() {
    return temcoreJNI.vegpar_dim_aleaf_get(swigCPtr, this);
  }

  public void setBleaf(double[] value) {
    temcoreJNI.vegpar_dim_bleaf_set(swigCPtr, this, value);
  }

  public double[] getBleaf() {
    return temcoreJNI.vegpar_dim_bleaf_get(swigCPtr, this);
  }

  public void setCleaf(double[] value) {
    temcoreJNI.vegpar_dim_cleaf_set(swigCPtr, this, value);
  }

  public double[] getCleaf() {
    return temcoreJNI.vegpar_dim_cleaf_get(swigCPtr, this);
  }

  public void setKfoliage(double[] value) {
    temcoreJNI.vegpar_dim_kfoliage_set(swigCPtr, this, value);
  }

  public double[] getKfoliage() {
    return temcoreJNI.vegpar_dim_kfoliage_get(swigCPtr, this);
  }

  public void setCov(double[] value) {
    temcoreJNI.vegpar_dim_cov_set(swigCPtr, this, value);
  }

  public double[] getCov() {
    return temcoreJNI.vegpar_dim_cov_get(swigCPtr, this);
  }

  public void setM1(double[] value) {
    temcoreJNI.vegpar_dim_m1_set(swigCPtr, this, value);
  }

  public double[] getM1() {
    return temcoreJNI.vegpar_dim_m1_get(swigCPtr, this);
  }

  public void setM2(double[] value) {
    temcoreJNI.vegpar_dim_m2_set(swigCPtr, this, value);
  }

  public double[] getM2() {
    return temcoreJNI.vegpar_dim_m2_get(swigCPtr, this);
  }

  public void setM3(double[] value) {
    temcoreJNI.vegpar_dim_m3_set(swigCPtr, this, value);
  }

  public double[] getM3() {
    return temcoreJNI.vegpar_dim_m3_get(swigCPtr, this);
  }

  public void setM4(double[] value) {
    temcoreJNI.vegpar_dim_m4_set(swigCPtr, this, value);
  }

  public double[] getM4() {
    return temcoreJNI.vegpar_dim_m4_get(swigCPtr, this);
  }

  public vegpar_dim() {
    this(temcoreJNI.new_vegpar_dim(), true);
  }

}
