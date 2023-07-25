package org.example;

public class Woman extends Person {

    Woman (String firstName, String lastName, Integer age) {
        super(firstName, lastName, age);

    }
    @Override
    boolean isRetired() {
        if (age>=60) {
            return true;
        }else{
            return false;
        }
    }

    @Override
    void registerPartnership(Person man) {
        this.setLastName(man.getLastName());
        this.partner = man;
    }

    @Override
    void deregisterPartnership(boolean shouldReturnToMaidenName) {
        if (shouldReturnToMaidenName) {
            this.setLastName(getMaidenName());
        }
        this.partner = null;

    }


}
