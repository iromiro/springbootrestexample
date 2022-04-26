package com.irem.springbootrestexample.model;

import javax.persistence.*;
import javax.persistence.Table;
import javax.validation.constraints.*;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Data
@Entity
@Table(name = "Student")
@Getter
@Setter
@ToString
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull(message = "Must be not null")
    @Size(min =3)
    private String nameSurname;

    @NotBlank(message = "Must be not blank")
    private String schoolName;

    @Email(message ="Email should be valid")
    private String email;

    @Min(value = 18, message ="Cannot be younger than 18")
    private int age;

    private String phone;

}
