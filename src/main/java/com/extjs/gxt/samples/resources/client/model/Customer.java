/*
 * Ext GWT 2.2.1 - Ext for GWT
 * Copyright(c) 2007-2010, Ext JS, LLC.
 * licensing@extjs.com
 * 
 * http://extjs.com/license
 */
package com.extjs.gxt.samples.resources.client.model;

import java.io.Serializable;

import com.extjs.gxt.ui.client.data.BeanModelTag;

public class Customer implements Serializable, BeanModelTag {

  private String name;
  private String email;
  private int age;

  public Customer() {

  }

  public Customer(String name, String email, int age) {
    this.age = age;
    this.email = email;
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
