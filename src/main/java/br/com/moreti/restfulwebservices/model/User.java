package br.com.moreti.restfulwebservices.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@ApiModel(description = "All details about the user.")
public class User {
    private Integer id;
    @Size(min = 2, message = "Name should have at least 2 characters.")
    @ApiModelProperty(notes = "Name should have at least 2 characters.")
    private String name;

    @Past
    @ApiModelProperty(notes = "The birthdate should be in the past.")
    private LocalDate birthdate;

    protected User() {
    }

    public User(Integer id, String name, LocalDate birthdate) {
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("User{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", birthdate=").append(birthdate);
        sb.append('}');
        return sb.toString();
    }
}
