package com.cauchy.create.singleton;

/**
 * 不仅仅解决线程同步，还可以防止序列化
 * @author Cauchy
 *
 */
public enum Singleton07 {
	INSTANCE;
}
// 枚举类是没有构造方法，也就无法通过反射，生成对象