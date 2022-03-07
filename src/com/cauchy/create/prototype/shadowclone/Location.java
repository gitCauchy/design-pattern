package com.cauchy.create.prototype.shadowclone;

/**
 * @author Cauchy
 * @ClassName Location.java
 * @Date 2019年11月29日
 * @Description 地址类，若需要克隆，需要实现Cloneable接口，重写克隆方法。
 * @Version
 */
public class Location {
    /**
     * 街区
     */
    String street;
    /**
     * 房间号码
     */
    int roomNo;

    public Location(String street, int roomNo) {
        super();
        this.street = street;
        this.roomNo = roomNo;
    }

    public String toString() {
        return "Location [street=" + street + ", roomNo=" + roomNo + "]";
    }

}
