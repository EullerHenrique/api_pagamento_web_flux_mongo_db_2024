package com.api.pagamento.domain.dto.request_response.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseMessage {

    private int status;
    private String error;
    private String message;

}
