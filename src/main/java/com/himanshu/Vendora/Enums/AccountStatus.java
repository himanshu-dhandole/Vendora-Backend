package com.himanshu.Vendora.Enums;

public enum AccountStatus {
    PENDING_VERIFICATION, // User account is awaiting verification.
    ACTIVE,               // User account is fully active and operational.
    SUSPENDED,            // User account is temporarily suspended due to issues.
    INACTIVE,             // User account is inactive but not blocked or deleted.
    BANNED,              // User account is blocked due to serious violations.
    CLOSED                // User account is permanently closed or deleted.
}