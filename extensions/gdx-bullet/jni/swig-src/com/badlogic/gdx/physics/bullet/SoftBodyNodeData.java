/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class SoftBodyNodeData {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected SoftBodyNodeData(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(SoftBodyNodeData obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_SoftBodyNodeData(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setM_material(SoftBodyMaterialData value) {
    gdxBulletJNI.SoftBodyNodeData_m_material_set(swigCPtr, this, SoftBodyMaterialData.getCPtr(value), value);
  }

  public SoftBodyMaterialData getM_material() {
    long cPtr = gdxBulletJNI.SoftBodyNodeData_m_material_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SoftBodyMaterialData(cPtr, false);
  }

  public void setM_position(btVector3FloatData value) {
    gdxBulletJNI.SoftBodyNodeData_m_position_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
  }

  public btVector3FloatData getM_position() {
    long cPtr = gdxBulletJNI.SoftBodyNodeData_m_position_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
  }

  public void setM_previousPosition(btVector3FloatData value) {
    gdxBulletJNI.SoftBodyNodeData_m_previousPosition_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
  }

  public btVector3FloatData getM_previousPosition() {
    long cPtr = gdxBulletJNI.SoftBodyNodeData_m_previousPosition_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
  }

  public void setM_velocity(btVector3FloatData value) {
    gdxBulletJNI.SoftBodyNodeData_m_velocity_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
  }

  public btVector3FloatData getM_velocity() {
    long cPtr = gdxBulletJNI.SoftBodyNodeData_m_velocity_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
  }

  public void setM_accumulatedForce(btVector3FloatData value) {
    gdxBulletJNI.SoftBodyNodeData_m_accumulatedForce_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
  }

  public btVector3FloatData getM_accumulatedForce() {
    long cPtr = gdxBulletJNI.SoftBodyNodeData_m_accumulatedForce_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
  }

  public void setM_normal(btVector3FloatData value) {
    gdxBulletJNI.SoftBodyNodeData_m_normal_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
  }

  public btVector3FloatData getM_normal() {
    long cPtr = gdxBulletJNI.SoftBodyNodeData_m_normal_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
  }

  public void setM_inverseMass(float value) {
    gdxBulletJNI.SoftBodyNodeData_m_inverseMass_set(swigCPtr, this, value);
  }

  public float getM_inverseMass() {
    return gdxBulletJNI.SoftBodyNodeData_m_inverseMass_get(swigCPtr, this);
  }

  public void setM_area(float value) {
    gdxBulletJNI.SoftBodyNodeData_m_area_set(swigCPtr, this, value);
  }

  public float getM_area() {
    return gdxBulletJNI.SoftBodyNodeData_m_area_get(swigCPtr, this);
  }

  public void setM_attach(int value) {
    gdxBulletJNI.SoftBodyNodeData_m_attach_set(swigCPtr, this, value);
  }

  public int getM_attach() {
    return gdxBulletJNI.SoftBodyNodeData_m_attach_get(swigCPtr, this);
  }

  public void setM_pad(int value) {
    gdxBulletJNI.SoftBodyNodeData_m_pad_set(swigCPtr, this, value);
  }

  public int getM_pad() {
    return gdxBulletJNI.SoftBodyNodeData_m_pad_get(swigCPtr, this);
  }

  public SoftBodyNodeData() {
    this(gdxBulletJNI.new_SoftBodyNodeData(), true);
  }

}