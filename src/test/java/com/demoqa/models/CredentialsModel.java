package com.demoqa.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class CredentialsModel {
    String userName, password;
}
