/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package TEMJNI;

public class soipar_bgc {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public soipar_bgc(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(soipar_bgc obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        temcoreJNI.delete_soipar_bgc(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setKn2(double value) {
    temcoreJNI.soipar_bgc_kn2_set(swigCPtr, this, value);
  }

  public double getKn2() {
    return temcoreJNI.soipar_bgc_kn2_get(swigCPtr, this);
  }

  public void setMoistmin(double value) {
    temcoreJNI.soipar_bgc_moistmin_set(swigCPtr, this, value);
  }

  public double getMoistmin() {
    return temcoreJNI.soipar_bgc_moistmin_get(swigCPtr, this);
  }

  public void setMoistmax(double value) {
    temcoreJNI.soipar_bgc_moistmax_set(swigCPtr, this, value);
  }

  public double getMoistmax() {
    return temcoreJNI.soipar_bgc_moistmax_get(swigCPtr, this);
  }

  public void setMoistopt(double value) {
    temcoreJNI.soipar_bgc_moistopt_set(swigCPtr, this, value);
  }

  public double getMoistopt() {
    return temcoreJNI.soipar_bgc_moistopt_get(swigCPtr, this);
  }

  public void setRhq10(double value) {
    temcoreJNI.soipar_bgc_rhq10_set(swigCPtr, this, value);
  }

  public double getRhq10() {
    return temcoreJNI.soipar_bgc_rhq10_get(swigCPtr, this);
  }

  public void setPropftos(double value) {
    temcoreJNI.soipar_bgc_propftos_set(swigCPtr, this, value);
  }

  public double getPropftos() {
    return temcoreJNI.soipar_bgc_propftos_get(swigCPtr, this);
  }

  public void setNmincnsoil(double value) {
    temcoreJNI.soipar_bgc_nmincnsoil_set(swigCPtr, this, value);
  }

  public double getNmincnsoil() {
    return temcoreJNI.soipar_bgc_nmincnsoil_get(swigCPtr, this);
  }

  public void setFnloss(double value) {
    temcoreJNI.soipar_bgc_fnloss_set(swigCPtr, this, value);
  }

  public double getFnloss() {
    return temcoreJNI.soipar_bgc_fnloss_get(swigCPtr, this);
  }

  public void setFsoma(double value) {
    temcoreJNI.soipar_bgc_fsoma_set(swigCPtr, this, value);
  }

  public double getFsoma() {
    return temcoreJNI.soipar_bgc_fsoma_get(swigCPtr, this);
  }

  public void setFsompr(double value) {
    temcoreJNI.soipar_bgc_fsompr_set(swigCPtr, this, value);
  }

  public double getFsompr() {
    return temcoreJNI.soipar_bgc_fsompr_get(swigCPtr, this);
  }

  public void setFsomcr(double value) {
    temcoreJNI.soipar_bgc_fsomcr_set(swigCPtr, this, value);
  }

  public double getFsomcr() {
    return temcoreJNI.soipar_bgc_fsomcr_get(swigCPtr, this);
  }

  public void setSom2co2(double value) {
    temcoreJNI.soipar_bgc_som2co2_set(swigCPtr, this, value);
  }

  public double getSom2co2() {
    return temcoreJNI.soipar_bgc_som2co2_get(swigCPtr, this);
  }

  public void setEqrawc(double value) {
    temcoreJNI.soipar_bgc_eqrawc_set(swigCPtr, this, value);
  }

  public double getEqrawc() {
    return temcoreJNI.soipar_bgc_eqrawc_get(swigCPtr, this);
  }

  public void setEqsoma(double value) {
    temcoreJNI.soipar_bgc_eqsoma_set(swigCPtr, this, value);
  }

  public double getEqsoma() {
    return temcoreJNI.soipar_bgc_eqsoma_get(swigCPtr, this);
  }

  public void setEqsompr(double value) {
    temcoreJNI.soipar_bgc_eqsompr_set(swigCPtr, this, value);
  }

  public double getEqsompr() {
    return temcoreJNI.soipar_bgc_eqsompr_get(swigCPtr, this);
  }

  public void setEqsomcr(double value) {
    temcoreJNI.soipar_bgc_eqsomcr_set(swigCPtr, this, value);
  }

  public double getEqsomcr() {
    return temcoreJNI.soipar_bgc_eqsomcr_get(swigCPtr, this);
  }

  public void setKdmoss(double value) {
    temcoreJNI.soipar_bgc_kdmoss_set(swigCPtr, this, value);
  }

  public double getKdmoss() {
    return temcoreJNI.soipar_bgc_kdmoss_get(swigCPtr, this);
  }

  public void setLcclnc(double value) {
    temcoreJNI.soipar_bgc_lcclnc_set(swigCPtr, this, value);
  }

  public double getLcclnc() {
    return temcoreJNI.soipar_bgc_lcclnc_get(swigCPtr, this);
  }

  public void setKdrawc(double[] value) {
    temcoreJNI.soipar_bgc_kdrawc_set(swigCPtr, this, value);
  }

  public double[] getKdrawc() {
    return temcoreJNI.soipar_bgc_kdrawc_get(swigCPtr, this);
  }

  public void setKdsoma(double[] value) {
    temcoreJNI.soipar_bgc_kdsoma_set(swigCPtr, this, value);
  }

  public double[] getKdsoma() {
    return temcoreJNI.soipar_bgc_kdsoma_get(swigCPtr, this);
  }

  public void setKdsompr(double[] value) {
    temcoreJNI.soipar_bgc_kdsompr_set(swigCPtr, this, value);
  }

  public double[] getKdsompr() {
    return temcoreJNI.soipar_bgc_kdsompr_get(swigCPtr, this);
  }

  public void setKdsomcr(double[] value) {
    temcoreJNI.soipar_bgc_kdsomcr_set(swigCPtr, this, value);
  }

  public double[] getKdsomcr() {
    return temcoreJNI.soipar_bgc_kdsomcr_get(swigCPtr, this);
  }

  public soipar_bgc() {
    this(temcoreJNI.new_soipar_bgc(), true);
  }

}
