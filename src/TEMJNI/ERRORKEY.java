/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package TEMJNI;

public final class ERRORKEY {
  public final static ERRORKEY I_VAR_NULL = new ERRORKEY("I_VAR_NULL", temcoreJNI.I_VAR_NULL_get());
  public final static ERRORKEY I_INPUT_INVALID = new ERRORKEY("I_INPUT_INVALID");
  public final static ERRORKEY I_TEM_TSTEP_SMALL = new ERRORKEY("I_TEM_TSTEP_SMALL", temcoreJNI.I_TEM_TSTEP_SMALL_get());
  public final static ERRORKEY I_BOTTOM_NEW_FRONT = new ERRORKEY("I_BOTTOM_NEW_FRONT");
  public final static ERRORKEY I_NAN_TLD = new ERRORKEY("I_NAN_TLD");
  public final static ERRORKEY I_NAN_TIT = new ERRORKEY("I_NAN_TIT");
  public final static ERRORKEY I_NAN_TII = new ERRORKEY("I_NAN_TII");
  public final static ERRORKEY I_TOO_BIG_TII = new ERRORKEY("I_TOO_BIG_TII");
  public final static ERRORKEY I_TOO_SMALL_TII = new ERRORKEY("I_TOO_SMALL_TII");
  public final static ERRORKEY I_WAT_TSTEP_SMALL = new ERRORKEY("I_WAT_TSTEP_SMALL", temcoreJNI.I_WAT_TSTEP_SMALL_get());
  public final static ERRORKEY I_NAN_WATER = new ERRORKEY("I_NAN_WATER");
  public final static ERRORKEY I_NEG_WATER = new ERRORKEY("I_NEG_WATER");
  public final static ERRORKEY I_TOO_MANY_FRZ_FRONTS = new ERRORKEY("I_TOO_MANY_FRZ_FRONTS", temcoreJNI.I_TOO_MANY_FRZ_FRONTS_get());
  public final static ERRORKEY I_TOO_MANY_THW_FRONTS = new ERRORKEY("I_TOO_MANY_THW_FRONTS");
  public final static ERRORKEY I_FRONT_INCONSISTENT = new ERRORKEY("I_FRONT_INCONSISTENT");
  public final static ERRORKEY I_FROZEN_STATE = new ERRORKEY("I_FROZEN_STATE");
  public final static ERRORKEY I_GROW_START = new ERRORKEY("I_GROW_START");
  public final static ERRORKEY I_SNOW_AGE = new ERRORKEY("I_SNOW_AGE");
  public final static ERRORKEY I_NIMMOB_RANGE = new ERRORKEY("I_NIMMOB_RANGE", temcoreJNI.I_NIMMOB_RANGE_get());
  public final static ERRORKEY I_NUPTAKE_RANGE = new ERRORKEY("I_NUPTAKE_RANGE");
  public final static ERRORKEY I_BURN_ZERO = new ERRORKEY("I_BURN_ZERO", temcoreJNI.I_BURN_ZERO_get());
  public final static ERRORKEY I_LAYER_FIRST_DEEP = new ERRORKEY("I_LAYER_FIRST_DEEP", temcoreJNI.I_LAYER_FIRST_DEEP_get());
  public final static ERRORKEY I_FRONT_STATE_INCON = new ERRORKEY("I_FRONT_STATE_INCON");
  public final static ERRORKEY I_FRONT_POSITION = new ERRORKEY("I_FRONT_POSITION");
  public final static ERRORKEY I_NCFILE_NOT_EXIST = new ERRORKEY("I_NCFILE_NOT_EXIST", temcoreJNI.I_NCFILE_NOT_EXIST_get());
  public final static ERRORKEY I_NCDIM_NOT_EXIST = new ERRORKEY("I_NCDIM_NOT_EXIST");
  public final static ERRORKEY I_NCVAR_NOT_EXIST = new ERRORKEY("I_NCVAR_NOT_EXIST");
  public final static ERRORKEY I_NCVAR_GET_ERROR = new ERRORKEY("I_NCVAR_GET_ERROR");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static ERRORKEY swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + ERRORKEY.class + " with value " + swigValue);
  }

  private ERRORKEY(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private ERRORKEY(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private ERRORKEY(String swigName, ERRORKEY swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static ERRORKEY[] swigValues = { I_VAR_NULL, I_INPUT_INVALID, I_TEM_TSTEP_SMALL, I_BOTTOM_NEW_FRONT, I_NAN_TLD, I_NAN_TIT, I_NAN_TII, I_TOO_BIG_TII, I_TOO_SMALL_TII, I_WAT_TSTEP_SMALL, I_NAN_WATER, I_NEG_WATER, I_TOO_MANY_FRZ_FRONTS, I_TOO_MANY_THW_FRONTS, I_FRONT_INCONSISTENT, I_FROZEN_STATE, I_GROW_START, I_SNOW_AGE, I_NIMMOB_RANGE, I_NUPTAKE_RANGE, I_BURN_ZERO, I_LAYER_FIRST_DEEP, I_FRONT_STATE_INCON, I_FRONT_POSITION, I_NCFILE_NOT_EXIST, I_NCDIM_NOT_EXIST, I_NCVAR_NOT_EXIST, I_NCVAR_GET_ERROR };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

