package com.kusher.kusher_in_korea.payment;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class payApiResponse {


    @ApiModelProperty(example = "상태코드")
    private int status;

    @ApiModelProperty(example = "메시지")
    private String message;

    @ApiModelProperty(example = "응답데이터")
    private Map<String, Object> data;


    public payApiResponse() {
        this(HttpStatus.OK);
    } // constructor

    public payApiResponse(HttpStatus httpStatus) {

        this.status = httpStatus.value();
        this.message = httpStatus.getReasonPhrase();
        this.data = new HashMap<>();
    } // constructor-overloading


    public void add(String key, Object value) {

        this.data.put(key, value);
    } // add
} // end class