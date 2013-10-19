/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package TEMJNI;

public class soistate_dim {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public soistate_dim(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(soistate_dim obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        temcoreJNI.delete_soistate_dim(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setNumsl(int value) {
    temcoreJNI.soistate_dim_numsl_set(swigCPtr, this, value);
  }

  public int getNumsl() {
    return temcoreJNI.soistate_dim_numsl_get(swigCPtr, this);
  }

  public void setMossnum(int value) {
    temcoreJNI.soistate_dim_mossnum_set(swigCPtr, this, value);
  }

  public int getMossnum() {
    return temcoreJNI.soistate_dim_mossnum_get(swigCPtr, this);
  }

  public void setShlwnum(int value) {
    temcoreJNI.soistate_dim_shlwnum_set(swigCPtr, this, value);
  }

  public int getShlwnum() {
    return temcoreJNI.soistate_dim_shlwnum_get(swigCPtr, this);
  }

  public void setDeepnum(int value) {
    temcoreJNI.soistate_dim_deepnum_set(swigCPtr, this, value);
  }

  public int getDeepnum() {
    return temcoreJNI.soistate_dim_deepnum_get(swigCPtr, this);
  }

  public void setMinenum(int value) {
    temcoreJNI.soistate_dim_minenum_set(swigCPtr, this, value);
  }

  public int getMinenum() {
    return temcoreJNI.soistate_dim_minenum_get(swigCPtr, this);
  }

  public void setMosstype(int value) {
    temcoreJNI.soistate_dim_mosstype_set(swigCPtr, this, value);
  }

  public int getMosstype() {
    return temcoreJNI.soistate_dim_mosstype_get(swigCPtr, this);
  }

  public void setTotthick(double value) {
    temcoreJNI.soistate_dim_totthick_set(swigCPtr, this, value);
  }

  public double getTotthick() {
    return temcoreJNI.soistate_dim_totthick_get(swigCPtr, this);
  }

  public void setMossthick(double value) {
    temcoreJNI.soistate_dim_mossthick_set(swigCPtr, this, value);
  }

  public double getMossthick() {
    return temcoreJNI.soistate_dim_mossthick_get(swigCPtr, this);
  }

  public void setShlwthick(double value) {
    temcoreJNI.soistate_dim_shlwthick_set(swigCPtr, this, value);
  }

  public double getShlwthick() {
    return temcoreJNI.soistate_dim_shlwthick_get(swigCPtr, this);
  }

  public void setDeepthick(double value) {
    temcoreJNI.soistate_dim_deepthick_set(swigCPtr, this, value);
  }

  public double getDeepthick() {
    return temcoreJNI.soistate_dim_deepthick_get(swigCPtr, this);
  }

  public void setMineathick(double value) {
    temcoreJNI.soistate_dim_mineathick_set(swigCPtr, this, value);
  }

  public double getMineathick() {
    return temcoreJNI.soistate_dim_mineathick_get(swigCPtr, this);
  }

  public void setMinebthick(double value) {
    temcoreJNI.soistate_dim_minebthick_set(swigCPtr, this, value);
  }

  public double getMinebthick() {
    return temcoreJNI.soistate_dim_minebthick_get(swigCPtr, this);
  }

  public void setMinecthick(double value) {
    temcoreJNI.soistate_dim_minecthick_set(swigCPtr, this, value);
  }

  public double getMinecthick() {
    return temcoreJNI.soistate_dim_minecthick_get(swigCPtr, this);
  }

  public void setZ(double[] value) {
    temcoreJNI.soistate_dim_z_set(swigCPtr, this, value);
  }

  public double[] getZ() {
    return temcoreJNI.soistate_dim_z_get(swigCPtr, this);
  }

  public void setDz(double[] value) {
    temcoreJNI.soistate_dim_dz_set(swigCPtr, this, value);
  }

  public double[] getDz() {
    return temcoreJNI.soistate_dim_dz_get(swigCPtr, this);
  }

  public void setPor(double[] value) {
    temcoreJNI.soistate_dim_por_set(swigCPtr, this, value);
  }

  public double[] getPor() {
    return temcoreJNI.soistate_dim_por_get(swigCPtr, this);
  }

  public void setAge(int[] value) {
    temcoreJNI.soistate_dim_age_set(swigCPtr, this, value);
  }

  public int[] getAge() {
    return temcoreJNI.soistate_dim_age_get(swigCPtr, this);
  }

  public void setType(int[] value) {
    temcoreJNI.soistate_dim_type_set(swigCPtr, this, value);
  }

  public int[] getType() {
    return temcoreJNI.soistate_dim_type_get(swigCPtr, this);
  }

  public void setTexture(int[] value) {
    temcoreJNI.soistate_dim_texture_set(swigCPtr, this, value);
  }

  public int[] getTexture() {
    return temcoreJNI.soistate_dim_texture_get(swigCPtr, this);
  }

  public void setFrootfrac(SWIGTYPE_p_a_NUM_PFT__double value) {
    temcoreJNI.soistate_dim_frootfrac_set(swigCPtr, this, SWIGTYPE_p_a_NUM_PFT__double.getCPtr(value));
  }

  public SWIGTYPE_p_a_NUM_PFT__double getFrootfrac() {
    long cPtr = temcoreJNI.soistate_dim_frootfrac_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_a_NUM_PFT__double(cPtr, false);
  }

  public soistate_dim() {
    this(temcoreJNI.new_soistate_dim(), true);
  }

}
