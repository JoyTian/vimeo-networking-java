/*
 * Copyright (c) 2015 Vimeo (https://vimeo.com)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.vimeo.networking.model.error;

import com.google.gson.annotations.SerializedName;

/**
 * Created by kylevenn on 7/15/15.
 */
public enum ErrorCode {
    // The default code that will be returned if the code returned from the server isn't enumerated below
    // If that is the case, check the raw response for the code [KV]
    DEFAULT,
    @SerializedName("1000")
    BAD_REQUEST,
    @SerializedName("1001")
    UNAUTHORIZED,
    @SerializedName("1002")
    FORBIDDEN,
    @SerializedName("1003")
    NOT_FOUND,
    @SerializedName("1004")
    INTERNAL_SERVER_ERROR,
    @SerializedName("1005")
    NOT_IMPLEMENTED,
    @SerializedName("1006")
    SERVICE_UNAVAILABLE,
    @SerializedName("2000")
    MISSING_REQUIRED_HEADER,
    @SerializedName("2001")
    MISSING_REQUIRED_QUERY_PARAM,
    @SerializedName("2002")
    MISSING_REQUIRED_BODY,
    @SerializedName("2100")
    UNSUPPORTED_HEADER,
    @SerializedName("2101")
    UNSUPPORTED_QUERY_PARAM,
    @SerializedName("2200")
    INVALID_HEADER_VALUE,
    @SerializedName("2201")
    INVALID_QUERY_PARAM_VALUE,
    @SerializedName("2202")
    INVALID_URI,
    @SerializedName("2203")
    INVALID_AUTHENTICATION_INFO,
    @SerializedName("2204")
    INVALID_INPUT,
    @SerializedName("2205")
    INVALID_BODY,
    @SerializedName("2206")
    INVALID_ACCEPT_HEADER,
    @SerializedName("2216")
    INVALID_INPUT_EMAIL_TOO_LONG,
    @SerializedName("2210")
    INVALID_INPUT_PASSWORD_TOO_SHORT,
    @SerializedName("2211")
    INVALID_INPUT_PASSWORD_TOO_SIMPLE,
    @SerializedName("2212")
    INVALID_INPUT_PASSWORD_TOO_OBVIOUS,
    @SerializedName("2217")
    INVALID_INPUT_EMAIL_NOT_RECOGNIZED,
    @SerializedName("2218")
    INVALID_INPUT_PASSWORD_EMAIL_MISMATCH,
    @SerializedName("2209")
    INVALID_INPUT_NO_PASSWORD,
    @SerializedName("2214")
    INVALID_INPUT_NO_EMAIL,
    @SerializedName("2215")
    INVALID_INPUT_NO_RFC_822_EMAIL,
    @SerializedName("2213")
    INVALID_INPUT_NO_NAME,
    @SerializedName("2208")
    INVALID_INPUT_NAME_TOO_LONG,
    @SerializedName("2303")
    UNABLE_TO_CREATE_USER_INVALID_TOKEN,
    @SerializedName("2306")
    UNABLE_TO_CREATE_USER_NO_TOKEN,
    @SerializedName("2304")
    UNABLE_TO_CREATE_USER_NON_EXISTENT_PROPERTY,
    @SerializedName("2305")
    UNABLE_TO_CREATE_USER_MALFORMED_TOKEN,
    @SerializedName("2307")
    UNABLE_TO_CREATE_USER_TOKEN_CAN_NOT_DECRYPT,
    @SerializedName("2308")
    UNABLE_TO_CREATE_USER_TOKEN_TOO_LONG,
    @SerializedName("2312")
    UNABLE_TO_LOGIN_NO_TOKEN,
    @SerializedName("2310")
    UNABLE_TO_LOGIN_NON_EXISTENT_PROPERTY,
    @SerializedName("2311")
    UNABLE_TO_LOGIN_MALFORMED_TOKEN,
    @SerializedName("2313")
    UNABLE_TO_LOGIN_TOKEN_CAN_NOT_DECRYPT,
    @SerializedName("2314")
    UNABLE_TO_LOGIN_TOKEN_TOO_LONG,
    @SerializedName("2219")
    INVALID_INPUT_GRANT_TYPE,
    @SerializedName("2220")
    INVALID_INPUT_EMBED_TYPE,
    @SerializedName("2221")
    INVALID_INPUT_VIEW_TYPE,
    @SerializedName("2222")
    INVALID_INPUT_VIDEO_PASSWORD_MISMATCH,
    @SerializedName("2223")
    INVALID_INPUT_VIDEO_NO_PASSWORD,
    @SerializedName("2315")
    UNABLE_TO_CREATE_USER_CAN_NOT_VALIDATE_TOKEN,
    @SerializedName("2207")
    INVALID_NO_INPUT,
    @SerializedName("2300")
    INVALID_TOKEN,
    @SerializedName("2301")
    NON_EXISTENT_PROPERTY,
    @SerializedName("2302")
    MALFORMED_TOKEN,
    @SerializedName("2400")
    USER_EXISTS,
    @SerializedName("2401")
    EMAIL_BLOCKED,
    @SerializedName("2402")
    SPAMMER_USER,
    @SerializedName("2403")
    PURGATORY_USER,
    @SerializedName("2404")
    URL_UNAVAILABLE,
    @SerializedName("2406")
    USER_NOT_AUTHORIZED_TO_DELETE_ACCOUNT,
    @SerializedName("2500")
    APP_DOES_NOT_HAVE_DELETE_CAPABILITY,
    @SerializedName("2501")
    APP_DOES_NOT_HAVE_PROTECTED_VIDEO_CAPABILITY,
    @SerializedName("4000")
    OPERATION_TIMED_OUT,
    @SerializedName("5001")
    ACCESS_TOKEN_NOT_GENERATED,
    @SerializedName("6000")
    METHOD_NOT_IMPLEMENTED,
    @SerializedName("5000")
    RESOURCE_NOT_FOUND,
    @SerializedName("7000")
    SERVER_BUSY,
    @SerializedName("7100")
    SERVER_OVERLOADED,
    @SerializedName("8000")
    INVALID_CREDENTIALS,
    @SerializedName("8001")
    UNAUTHORIZED_CLIENT
}