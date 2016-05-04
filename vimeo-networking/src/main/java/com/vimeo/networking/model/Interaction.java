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

package com.vimeo.networking.model;

import com.google.gson.annotations.SerializedName;

import org.jetbrains.annotations.Nullable;

import java.io.Serializable;
import java.util.Date;

/**
 * This model object represents an Interaction.
 * Created by zetterstromk on 6/5/15.
 */
public class Interaction implements Serializable {

    private static final long serialVersionUID = 2033767841952340400L;
    private static final String STREAM_PURCHASED = "purchased";
    private static final String STREAM_RESTRICTED = "restricted";
    private static final String STREAM_AVAILABLE = "available";
    private static final String STREAM_UNAVAILABLE = "unavailable";

    public enum Stream {
        @SerializedName(STREAM_PURCHASED)
        PURCHASED(STREAM_PURCHASED),
        @SerializedName(STREAM_RESTRICTED)
        RESTRICTED(STREAM_RESTRICTED),
        @SerializedName(STREAM_AVAILABLE)
        AVAILABLE(STREAM_AVAILABLE),
        @SerializedName(STREAM_UNAVAILABLE)
        UNAVAILABLE(STREAM_UNAVAILABLE);

        private final String mName;

        Stream(String name) {
            mName = name;
        }

        @Override
        public String toString() {
            return mName;
        }
    }

    @SerializedName("added")
    public boolean added;
    @Nullable
    @SerializedName("addedDate")
    public Date addedDate;
    @Nullable
    @SerializedName("uri")
    public String uri;
    @Nullable
    @SerializedName("stream")
    public Stream stream;
    @Nullable
    @SerializedName("expiration")
    public Date expiration;
}
