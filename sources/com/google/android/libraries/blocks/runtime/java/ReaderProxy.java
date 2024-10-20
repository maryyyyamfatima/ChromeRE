package com.google.android.libraries.blocks.runtime.java;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public interface ReaderProxy {
    void onStreamData(byte[] bArr);

    void onStreamError(Throwable th);

    void onStreamFinished();
}