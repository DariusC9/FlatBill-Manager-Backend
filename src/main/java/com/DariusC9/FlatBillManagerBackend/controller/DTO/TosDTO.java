package com.DariusC9.FlatBillManagerBackend.controller.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public record TosDTO(@JsonProperty("text") String tosText) { }