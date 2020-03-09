package com.psy888.fcc.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Value;

import javax.validation.constraints.NotBlank;
import java.util.UUID;
@Value
public class Person {

    @JsonProperty("id")
    UUID id;
    @NotBlank
    @JsonProperty("name")
    String name;
}
