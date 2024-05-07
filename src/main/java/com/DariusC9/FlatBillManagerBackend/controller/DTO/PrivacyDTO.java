package com.DariusC9.FlatBillManagerBackend.controller.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public record PrivacyDTO(@JsonProperty("text") String privacyText) { }
