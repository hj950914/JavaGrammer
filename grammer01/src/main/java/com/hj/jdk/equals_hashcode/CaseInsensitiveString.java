package com.hj.jdk.equals_hashcode;

/**
 * Author: hj
 * Date: 2019-06-24 15:18
 * Description: 无视大小写的String
 */
public class CaseInsensitiveString {

    private String s;

    public CaseInsensitiveString(String s) {
        if (s == null) {
            throw new NullPointerException();
        }
        this.s = s;
    }

    /**
     * 违反对称性
     *
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (o instanceof CaseInsensitiveString) {
            System.out.println("CaseInsensitiveString");
            return s.equalsIgnoreCase(((CaseInsensitiveString) o).s);
        }
        if (o instanceof String) {
            System.out.println("String");
            return s.equalsIgnoreCase((String) o);
        }
        return false;
    }
}
