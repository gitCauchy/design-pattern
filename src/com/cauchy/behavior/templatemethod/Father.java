package com.cauchy.behavior.templatemethod;

/**
 * @author Cauchy
 * @ClassName Father.java
 * @Date 2019年11月30日
 * @Description 模板方法是指如果需要修改父类的方法（void m()）只需要子类重写 这个方法调用的方法即可，
 * 即为下面的op1(),op2()
 * @Version
 */
abstract public class Father {
    void m() {
        op1();
        op2();
    }

    abstract void op1();

    abstract void op2();
}
