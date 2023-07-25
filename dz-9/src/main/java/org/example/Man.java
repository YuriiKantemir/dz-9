package org.example;

public class Man extends Person {
    Man (String firstName, String lastName, Integer age) {
        super(firstName, lastName, age);
    }

    @Override
    boolean isRetired() {
        return age >=65;
    }

    @Override
    void registerPartnership(Person woman) {
        woman.setLastName(lastName);
        this.partner = woman;
    }


    @Override
    void deregisterPartnership(boolean shouldReturnToMaidenName) {
        if (shouldReturnToMaidenName) {
            this.partner.setLastName(this.partner.getMaidenName());
        }
        this.partner=null;
    }


}
