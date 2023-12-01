package com.book.book_aws.domain.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Role {

    GUEST("ROLE_GUEST", "손님"),
    USERS("ROLE_USERS", "일반 사용자"); // USER -> USERS

    private final String key;
    private final String title;
}
