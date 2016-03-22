package com.samczsun.skype4j.exceptions.handler;

public enum ErrorSource {
    PARSING_CAPTCHA,
    REGISTERING_WEBSOCKET,
    POLLING_SKYPE,
    REFRESHING_ENDPOINT,
    THREAD_POOL_DEAD,
    PARSING_MESSAGE,
    NO_MESSAGE_TYPE,
    SESSION_ACTIVE,
    REAUTHENTICATING,
    SERVER_PING,
    CLOSING_WEBSOCKET,
    UPDATING_CONTACT_LIST,
    TYPING, DISPATCHING_EVENT
}
