package ru.sertok.spring.boot.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ErrorCode {
    _404(404,"error-404"), _403(403,"error-403");
    private Integer code;
    private String value;

}
