/*
 * Functional modifier include static, final, abstract, synchronized, native, strictfp
 * static: belong to class, can be used directly, no need to create a instance
 * final: final method cannot be override
 * abstract: no method, need to be fullfill in child class 
 * synchronized: sychronize the multiple threads work
 * native: when using non java such as C, c++
 * strictfp: control the decimal accurate, fit the IEEE 754 standard
 */

public static void staticMethod(){
// static method, no need for instance
}

public final void finalMethod(){
  //final method cannot be override 
}

public abstract void abstractMethod(){
  //abstract method, no method need the child class write it
}

public synchronized void synchronizedMehtod(){

  //secure the multiple thread working
}

/*
 * some modifier cannot be used together
 * abstract and fianl, abstract need the child class to overide but final cannot override 
 * abstract and privat, private is not visible to child public class FunctionalModifier {
  abstract and static: static is not an instance 
 }
 */

public static final void combinedMethod(){
// public static, cannot be overide as final
}
protected synchronized void syncMethod(){
// protected multiple thread works
}
