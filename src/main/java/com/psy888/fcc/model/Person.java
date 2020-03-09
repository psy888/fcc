package com.psy888.fcc.model;

import lombok.Value;

import java.util.UUID;
@Value
public class Person {
    private final UUID id;
    private final String name;
}
