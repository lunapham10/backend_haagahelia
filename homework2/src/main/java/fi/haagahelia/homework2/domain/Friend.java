package fi.haagahelia.homework2.domain;

import jakarta.validation.constraints.NotBlank;

public class Friend {
    @NotBlank
    private String firstName;
    @NotBlank
    private String lastName;

    public Friend(){
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String toString() {
        return "Friend [firstName=" + firstName + ", lastName=" + lastName + "]";
    }

}
