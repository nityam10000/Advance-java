package com.projectMobile.mobileProject.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter

@NoArgsConstructor
@AllArgsConstructor
public class MobileDTO {
    @NotBlank(message = "Brand name is required")
    private String brandName;

    @NotBlank(message = "Model name is required")
    private String modelName;

    @Min(value = 1000, message = "Price must be at least 1000")
    private Double price;

    @Min(value = 1, message = "RAM must be at least 1 GB")
    private Integer ram;

    @Min(value = 8, message = "Storage must be at least 8 GB")
    private Integer storage;
}