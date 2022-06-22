package Sevice.Impl;

import Sevice.Sevice;

public class Aengt implements Sevice {
    @Override
    public void sing() {
        System.out.println("场地确认");
        System.out.println("费用确认");
        Mubiao mubiao =new Mubiao();
        mubiao.sing();
        System.out.println("场地确认");
    }
}
