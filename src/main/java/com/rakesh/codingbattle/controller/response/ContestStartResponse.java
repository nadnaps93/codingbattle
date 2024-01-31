package com.rakesh.codingbattle.controller.response;

import com.rakesh.codingbattle.enums.EventType;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ContestStartResponse {
    private EventType eventType;
    private long createdAt;
    private String startedBy;
}
