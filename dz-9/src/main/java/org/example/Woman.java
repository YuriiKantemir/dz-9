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
        if (man instanceof Man){
            this.setLastName(man.getLastName());
            man.patner = this;
            this.partner = man;
        }else{
            System.out.println("Please select a partner with other gender");
        }

    }

    @Override
    void deregisterPartnership(boolean shouldReturnToMaidenName) {
        if (partner == null){
            return;
        }
        if (shouldReturnToMaidenName) {
            this.setLastName(getMaidenName());
        }
        this.partner.partner = null;
        this.partner = null;

    }


}
