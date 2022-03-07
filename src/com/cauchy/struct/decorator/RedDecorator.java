package com.cauchy.struct.decorator;

/**
 * @author Cauchy
 * @ClassName RedDecorator.java
 * @Date 2019��11��30��
 * @Description ��ɫװ����
 * @Version
 */
public class RedDecorator extends Decorator {

    public RedDecorator(Apple apple) {
        super(apple);
    }

    public void descA() {
        System.out.println("��װ������չ����");
    }

    @Override
    public void desc() {
        System.out.println("װ�γ�Ϊ��ɫ��");
        super.desc();
        System.out.println("װ����װ�ν���");
    }

}
