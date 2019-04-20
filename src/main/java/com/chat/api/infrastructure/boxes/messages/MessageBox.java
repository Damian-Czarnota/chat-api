package com.chat.api.infrastructure.boxes.messages;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class MessageBox {

    @NotNull
    @NotEmpty
    private String content;
}
