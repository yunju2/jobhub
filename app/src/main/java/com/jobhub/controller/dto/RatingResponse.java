package com.jobhub.controller.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class RatingResponse {
    private final String userId;
    private final int star;
    private final String comment;
}
