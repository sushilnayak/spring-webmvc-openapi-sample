package com.nayak.openapi.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Schema(description = "Product information")
public class Product {

    @Schema(description = "Unique identifier of the product", example = "123", type = "integer", format = "int32")
    private Long id;

    @NotBlank
    @Schema(description = "Name of the product", example = "iPhone 14 Pro", requiredMode = Schema.RequiredMode.REQUIRED)
    private String name;

    @NotBlank
    @Schema(description = "Description of the product", example = "Latest iPhone model with advanced camera system")
    private String description;

    @NotNull
    @Positive
    @Schema(description = "Price of the product", example = "999.99", requiredMode = Schema.RequiredMode.REQUIRED, type = "string")
    private BigDecimal price;

    @Schema(description = "Creation timestamp", example = "2024-01-20T10:30:00", type = "string", format = "date-time")
    private LocalDateTime createdAt;

}