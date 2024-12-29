/*
 * there are couple different Access Modifier in Java
 * public: every class can access 
 * protected: only the class in same package or some child class in other package can access 
 * default: default without writing any modifier only can be access by the same package 
 * private: only can be access by the class in the same file
 */
package AccessModifiers;

public void publicMethod(){
  // can be access from anywhere
}

protected void protectedMethod(){
  // only can be access in the saem package or child class
}

void defaultMethod(){
  // only can be access by this class in the same package 
}

private void privateMethod(){

  // only can be access by this class
}

/*
 * 
 */
