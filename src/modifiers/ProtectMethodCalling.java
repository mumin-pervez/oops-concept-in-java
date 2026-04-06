package modifiers;

import methodsignature.ProtectedMethodClass;

//ProtectMethodCalling is the Child class and ProtectedMethodClass is the Parent class
public class ProtectMethodCalling extends ProtectedMethodClass {

  public static void main(String[] args) {
    ProtectMethodCalling obj = new ProtectMethodCalling();
    obj.protectedMethod(); //Output: This is protected method

  }

}
