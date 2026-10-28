package O_OPPConcepts.F_Interface;

public interface InterfaceExplained {
    //subclass can extend on superclass.
    //subclass can implement more than one interface.
    //interface can extend more than one interface.

    //interface variables are static and final
    int a = 100;
    //interfaces can have methods that are static, abstract and default only
    void method1();
    static void method2(){
        System.out.println("Static Method");
    }
    default void method3(){
        System.out.println("Static Method");
    }
    //Interface cannot have: instance variables,instance methods, constructors, blocks, create objects from interface

    //{except in statics, private can be used} [it's given by default]
    //variables are static and final by default

    //CarObject explained
}
