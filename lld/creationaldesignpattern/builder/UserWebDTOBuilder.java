package lld.creationaldesignpattern.builder;

import java.time.LocalDate;
import java.time.Period;
import java.util.StringJoiner;

//The concrete builder for UserWebDTO
public class UserWebDTOBuilder implements UserDTOBuilder {
    public String fname;
    public String lname;
    public String age;
    public String address;
    public UserWebDTO userWebDTO;

    @Override
    public UserDTOBuilder withFirstName(String fname) {
        this.fname = fname;
        return this;
    }

    @Override
    public UserDTOBuilder withLastName(String lname) {
        this.lname=lname;
        return this;
    }

    @Override
    public UserDTOBuilder withBirthday(LocalDate date) {
        Period time = Period.between(date, LocalDate.now());
        int years = time.getYears();
        this.age = String.valueOf(years);
        return this;
    }

    @Override
    public UserDTOBuilder withAddress(Address address) {
        var stringJoiner = new StringJoiner(" ");
        stringJoiner.add(address.getHouseNumber());
        stringJoiner.add(address.getStreet());
        stringJoiner.add(address.getCity());
        stringJoiner.add(address.getState());
        stringJoiner.add(address.getZipcode());
        this.address = stringJoiner.toString();
        return this;
    }

    @Override
    public UserDTO build() {
        userWebDTO = new UserWebDTO(fname+" "+lname, address, age);
        return userWebDTO;
    }

    @Override
    public UserDTO getUserDTO() {
        return userWebDTO;
    }
}
