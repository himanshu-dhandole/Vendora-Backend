package com.himanshu.Vendora.Enums;

public enum AccountStatus {
    PENDING_VERIFICATION, // Users account is awaiting verification.
    ACTIVE,               // Users account is fully active and operational.
    SUSPENDED,            // Users account is temporarily suspended due to issues.
    INACTIVE,             // Users account is inactive but not blocked or deleted.
    BANNED,              // Users account is blocked due to serious violations.
    CLOSED                // Users account is permanently closed or deleted.
}