package com.psy888.fcc.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Value;

import java.util.UUID;
@Value
public class Person {
    @JsonProperty("id")
    UUID id;
    @JsonProperty("name")
    String name;
}
