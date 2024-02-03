package com.rakesh.codingbattle.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
public class SubmitEvent extends Event{
    private Long contestQuestionId;

}
