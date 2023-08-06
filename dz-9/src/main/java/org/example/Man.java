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
        if (woman instanceof Woman){
            woman.setLastName(lastName);
            woman.partner = this;
            this.partner = woman;
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
            this.partner.setLastName(this.partner.getMaidenName());
        }
        this.partner.partner = null;
        this.partner=null;
    }


}
