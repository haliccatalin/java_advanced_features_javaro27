package com.sda.inheritance;

public class CaineDePaza extends Paznic {

    public CaineDePaza(String name, String cnp, boolean openDoor, String lesa) {
        super(name, cnp, openDoor);

        super.printPersonName();
        super.printPaznicName();
    }
}
