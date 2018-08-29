
package com.test.myejb;

/**
 *
 * @author dhanushka
 */
public class AddBean {
    private int i, j, k;

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }

    public int getK() {
        return k;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public void setK(int k) {
        this.k = k;
    }
    
    public void add(){
        k = i+j;
    }
}
