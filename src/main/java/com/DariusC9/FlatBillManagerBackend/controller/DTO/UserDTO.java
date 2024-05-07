package com.DariusC9.FlatBillManagerBackend.controller.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public record UserDTO(@JsonProperty("id") UUID id,
                      @JsonProperty("name") String name,
                      @JsonProperty("email") String email,
                      @JsonProperty("password") String password) { }
