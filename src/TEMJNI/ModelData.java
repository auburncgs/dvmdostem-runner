/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package TEMJNI;

public class ModelData {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public ModelData(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(ModelData obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        temcoreJNI.delete_ModelData(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ModelData() {
    this(temcoreJNI.new_ModelData(), true);
  }

  public void setMyid(int value) {
    temcoreJNI.ModelData_myid_set(swigCPtr, this, value);
  }

  public int getMyid() {
    return temcoreJNI.ModelData_myid_get(swigCPtr, this);
  }

  public void setNumprocs(int value) {
    temcoreJNI.ModelData_numprocs_set(swigCPtr, this, value);
  }

  public int getNumprocs() {
    return temcoreJNI.ModelData_numprocs_get(swigCPtr, this);
  }

  public void setRunmode(int value) {
    temcoreJNI.ModelData_runmode_set(swigCPtr, this, value);
  }

  public int getRunmode() {
    return temcoreJNI.ModelData_runmode_get(swigCPtr, this);
  }

  public void setConsoledebug(boolean value) {
    temcoreJNI.ModelData_consoledebug_set(swigCPtr, this, value);
  }

  public boolean getConsoledebug() {
    return temcoreJNI.ModelData_consoledebug_get(swigCPtr, this);
  }

  public void setEnvmodule(boolean value) {
    temcoreJNI.ModelData_envmodule_set(swigCPtr, this, value);
  }

  public boolean getEnvmodule() {
    return temcoreJNI.ModelData_envmodule_get(swigCPtr, this);
  }

  public void setBgcmodule(boolean value) {
    temcoreJNI.ModelData_bgcmodule_set(swigCPtr, this, value);
  }

  public boolean getBgcmodule() {
    return temcoreJNI.ModelData_bgcmodule_get(swigCPtr, this);
  }

  public void setDvmmodule(boolean value) {
    temcoreJNI.ModelData_dvmmodule_set(swigCPtr, this, value);
  }

  public boolean getDvmmodule() {
    return temcoreJNI.ModelData_dvmmodule_get(swigCPtr, this);
  }

  public void setDslmodule(boolean value) {
    temcoreJNI.ModelData_dslmodule_set(swigCPtr, this, value);
  }

  public boolean getDslmodule() {
    return temcoreJNI.ModelData_dslmodule_get(swigCPtr, this);
  }

  public void setDsbmodule(boolean value) {
    temcoreJNI.ModelData_dsbmodule_set(swigCPtr, this, value);
  }

  public boolean getDsbmodule() {
    return temcoreJNI.ModelData_dsbmodule_get(swigCPtr, this);
  }

  public void setFriderived(boolean value) {
    temcoreJNI.ModelData_friderived_set(swigCPtr, this, value);
  }

  public boolean getFriderived() {
    return temcoreJNI.ModelData_friderived_get(swigCPtr, this);
  }

  public void setNfeed(boolean value) {
    temcoreJNI.ModelData_nfeed_set(swigCPtr, this, value);
  }

  public boolean getNfeed() {
    return temcoreJNI.ModelData_nfeed_get(swigCPtr, this);
  }

  public void setAvlnflg(boolean value) {
    temcoreJNI.ModelData_avlnflg_set(swigCPtr, this, value);
  }

  public boolean getAvlnflg() {
    return temcoreJNI.ModelData_avlnflg_get(swigCPtr, this);
  }

  public void setBaseline(boolean value) {
    temcoreJNI.ModelData_baseline_set(swigCPtr, this, value);
  }

  public boolean getBaseline() {
    return temcoreJNI.ModelData_baseline_get(swigCPtr, this);
  }

  public void setRuneq(boolean value) {
    temcoreJNI.ModelData_runeq_set(swigCPtr, this, value);
  }

  public boolean getRuneq() {
    return temcoreJNI.ModelData_runeq_get(swigCPtr, this);
  }

  public void setRunsp(boolean value) {
    temcoreJNI.ModelData_runsp_set(swigCPtr, this, value);
  }

  public boolean getRunsp() {
    return temcoreJNI.ModelData_runsp_get(swigCPtr, this);
  }

  public void setRuntr(boolean value) {
    temcoreJNI.ModelData_runtr_set(swigCPtr, this, value);
  }

  public boolean getRuntr() {
    return temcoreJNI.ModelData_runtr_get(swigCPtr, this);
  }

  public void setRunsc(boolean value) {
    temcoreJNI.ModelData_runsc_set(swigCPtr, this, value);
  }

  public boolean getRunsc() {
    return temcoreJNI.ModelData_runsc_get(swigCPtr, this);
  }

  public void setInitmode(int value) {
    temcoreJNI.ModelData_initmode_set(swigCPtr, this, value);
  }

  public int getInitmode() {
    return temcoreJNI.ModelData_initmode_get(swigCPtr, this);
  }

  public void setCasename(String value) {
    temcoreJNI.ModelData_casename_set(swigCPtr, this, value);
  }

  public String getCasename() {
    return temcoreJNI.ModelData_casename_get(swigCPtr, this);
  }

  public void setConfigdir(String value) {
    temcoreJNI.ModelData_configdir_set(swigCPtr, this, value);
  }

  public String getConfigdir() {
    return temcoreJNI.ModelData_configdir_get(swigCPtr, this);
  }

  public void setRunchtfile(String value) {
    temcoreJNI.ModelData_runchtfile_set(swigCPtr, this, value);
  }

  public String getRunchtfile() {
    return temcoreJNI.ModelData_runchtfile_get(swigCPtr, this);
  }

  public void setOutputdir(String value) {
    temcoreJNI.ModelData_outputdir_set(swigCPtr, this, value);
  }

  public String getOutputdir() {
    return temcoreJNI.ModelData_outputdir_get(swigCPtr, this);
  }

  public void setReginputdir(String value) {
    temcoreJNI.ModelData_reginputdir_set(swigCPtr, this, value);
  }

  public String getReginputdir() {
    return temcoreJNI.ModelData_reginputdir_get(swigCPtr, this);
  }

  public void setGrdinputdir(String value) {
    temcoreJNI.ModelData_grdinputdir_set(swigCPtr, this, value);
  }

  public String getGrdinputdir() {
    return temcoreJNI.ModelData_grdinputdir_get(swigCPtr, this);
  }

  public void setChtinputdir(String value) {
    temcoreJNI.ModelData_chtinputdir_set(swigCPtr, this, value);
  }

  public String getChtinputdir() {
    return temcoreJNI.ModelData_chtinputdir_get(swigCPtr, this);
  }

  public void setRunstages(String value) {
    temcoreJNI.ModelData_runstages_set(swigCPtr, this, value);
  }

  public String getRunstages() {
    return temcoreJNI.ModelData_runstages_get(swigCPtr, this);
  }

  public void setInitmodes(String value) {
    temcoreJNI.ModelData_initmodes_set(swigCPtr, this, value);
  }

  public String getInitmodes() {
    return temcoreJNI.ModelData_initmodes_get(swigCPtr, this);
  }

  public void setInitialfile(String value) {
    temcoreJNI.ModelData_initialfile_set(swigCPtr, this, value);
  }

  public String getInitialfile() {
    return temcoreJNI.ModelData_initialfile_get(swigCPtr, this);
  }

  public void setChangeclimate(int value) {
    temcoreJNI.ModelData_changeclimate_set(swigCPtr, this, value);
  }

  public int getChangeclimate() {
    return temcoreJNI.ModelData_changeclimate_get(swigCPtr, this);
  }

  public void setChangeco2(int value) {
    temcoreJNI.ModelData_changeco2_set(swigCPtr, this, value);
  }

  public int getChangeco2() {
    return temcoreJNI.ModelData_changeco2_get(swigCPtr, this);
  }

  public void setUpdatelai(boolean value) {
    temcoreJNI.ModelData_updatelai_set(swigCPtr, this, value);
  }

  public boolean getUpdatelai() {
    return temcoreJNI.ModelData_updatelai_get(swigCPtr, this);
  }

  public void setUseseverity(boolean value) {
    temcoreJNI.ModelData_useseverity_set(swigCPtr, this, value);
  }

  public boolean getUseseverity() {
    return temcoreJNI.ModelData_useseverity_get(swigCPtr, this);
  }

  public void setOutstartyr(int value) {
    temcoreJNI.ModelData_outstartyr_set(swigCPtr, this, value);
  }

  public int getOutstartyr() {
    return temcoreJNI.ModelData_outstartyr_get(swigCPtr, this);
  }

  public void setOutSiteDay(boolean value) {
    temcoreJNI.ModelData_outSiteDay_set(swigCPtr, this, value);
  }

  public boolean getOutSiteDay() {
    return temcoreJNI.ModelData_outSiteDay_get(swigCPtr, this);
  }

  public void setOutSiteMonth(boolean value) {
    temcoreJNI.ModelData_outSiteMonth_set(swigCPtr, this, value);
  }

  public boolean getOutSiteMonth() {
    return temcoreJNI.ModelData_outSiteMonth_get(swigCPtr, this);
  }

  public void setOutSiteYear(boolean value) {
    temcoreJNI.ModelData_outSiteYear_set(swigCPtr, this, value);
  }

  public boolean getOutSiteYear() {
    return temcoreJNI.ModelData_outSiteYear_get(swigCPtr, this);
  }

  public void setOutRegn(boolean value) {
    temcoreJNI.ModelData_outRegn_set(swigCPtr, this, value);
  }

  public boolean getOutRegn() {
    return temcoreJNI.ModelData_outRegn_get(swigCPtr, this);
  }

  public void setOutSoilClm(boolean value) {
    temcoreJNI.ModelData_outSoilClm_set(swigCPtr, this, value);
  }

  public boolean getOutSoilClm() {
    return temcoreJNI.ModelData_outSoilClm_get(swigCPtr, this);
  }

  public void setAct_gridno(int value) {
    temcoreJNI.ModelData_act_gridno_set(swigCPtr, this, value);
  }

  public int getAct_gridno() {
    return temcoreJNI.ModelData_act_gridno_get(swigCPtr, this);
  }

  public void setAct_drainno(int value) {
    temcoreJNI.ModelData_act_drainno_set(swigCPtr, this, value);
  }

  public int getAct_drainno() {
    return temcoreJNI.ModelData_act_drainno_get(swigCPtr, this);
  }

  public void setAct_soilno(int value) {
    temcoreJNI.ModelData_act_soilno_set(swigCPtr, this, value);
  }

  public int getAct_soilno() {
    return temcoreJNI.ModelData_act_soilno_get(swigCPtr, this);
  }

  public void setAct_gfireno(int value) {
    temcoreJNI.ModelData_act_gfireno_set(swigCPtr, this, value);
  }

  public int getAct_gfireno() {
    return temcoreJNI.ModelData_act_gfireno_get(swigCPtr, this);
  }

  public void setAct_chtno(int value) {
    temcoreJNI.ModelData_act_chtno_set(swigCPtr, this, value);
  }

  public int getAct_chtno() {
    return temcoreJNI.ModelData_act_chtno_get(swigCPtr, this);
  }

  public void setAct_initchtno(int value) {
    temcoreJNI.ModelData_act_initchtno_set(swigCPtr, this, value);
  }

  public int getAct_initchtno() {
    return temcoreJNI.ModelData_act_initchtno_get(swigCPtr, this);
  }

  public void setAct_clmno(int value) {
    temcoreJNI.ModelData_act_clmno_set(swigCPtr, this, value);
  }

  public int getAct_clmno() {
    return temcoreJNI.ModelData_act_clmno_get(swigCPtr, this);
  }

  public void setAct_clmyr_beg(int value) {
    temcoreJNI.ModelData_act_clmyr_beg_set(swigCPtr, this, value);
  }

  public int getAct_clmyr_beg() {
    return temcoreJNI.ModelData_act_clmyr_beg_get(swigCPtr, this);
  }

  public void setAct_clmyr_end(int value) {
    temcoreJNI.ModelData_act_clmyr_end_set(swigCPtr, this, value);
  }

  public int getAct_clmyr_end() {
    return temcoreJNI.ModelData_act_clmyr_end_get(swigCPtr, this);
  }

  public void setAct_clmyr(int value) {
    temcoreJNI.ModelData_act_clmyr_set(swigCPtr, this, value);
  }

  public int getAct_clmyr() {
    return temcoreJNI.ModelData_act_clmyr_get(swigCPtr, this);
  }

  public void setAct_clmstep(int value) {
    temcoreJNI.ModelData_act_clmstep_set(swigCPtr, this, value);
  }

  public int getAct_clmstep() {
    return temcoreJNI.ModelData_act_clmstep_get(swigCPtr, this);
  }

  public void setAct_vegno(int value) {
    temcoreJNI.ModelData_act_vegno_set(swigCPtr, this, value);
  }

  public int getAct_vegno() {
    return temcoreJNI.ModelData_act_vegno_get(swigCPtr, this);
  }

  public void setAct_vegset(int value) {
    temcoreJNI.ModelData_act_vegset_set(swigCPtr, this, value);
  }

  public int getAct_vegset() {
    return temcoreJNI.ModelData_act_vegset_get(swigCPtr, this);
  }

  public void setAct_fireno(int value) {
    temcoreJNI.ModelData_act_fireno_set(swigCPtr, this, value);
  }

  public int getAct_fireno() {
    return temcoreJNI.ModelData_act_fireno_get(swigCPtr, this);
  }

  public void setAct_fireset(int value) {
    temcoreJNI.ModelData_act_fireset_set(swigCPtr, this, value);
  }

  public int getAct_fireset() {
    return temcoreJNI.ModelData_act_fireset_get(swigCPtr, this);
  }

  public void checking4run() {
    temcoreJNI.ModelData_checking4run(swigCPtr, this);
  }

}
