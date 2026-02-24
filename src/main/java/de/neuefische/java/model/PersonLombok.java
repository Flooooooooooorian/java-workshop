package de.neuefische.java.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class PersonLombok {
    @NonNull
    protected String name;
    private int age;
    private boolean isFullAge;
    private Category userType;

}
