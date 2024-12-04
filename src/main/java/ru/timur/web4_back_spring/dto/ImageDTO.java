package ru.timur.web4_back_spring.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ImageDTO implements Serializable {
    @NotNull(message = "Image type cannot be null")
    @NotBlank(message = "Image type cannot be empty")
    private String type;

    @NotNull(message = "Base64 cannot be null")
    @NotBlank(message = "Base64 cannot be empty")
    private String base64;
}
