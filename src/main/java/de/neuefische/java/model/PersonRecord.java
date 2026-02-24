package de.neuefische.java.model;

import lombok.With;

@With
public record PersonRecord(
        String name,
        int age,
        boolean isFullAge,
        Category userType
) {

    public PersonRecord withAge(int age) {
        return new PersonRecord(this.name, age, this.isFullAge, this.userType);
    }
}
