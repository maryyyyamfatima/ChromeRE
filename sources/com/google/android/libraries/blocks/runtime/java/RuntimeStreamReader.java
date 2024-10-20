package com.google.android.libraries.blocks.runtime.java;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class RuntimeStreamReader implements AutoCloseable {
    public final native void nativeDelete(long j);

    public final native void nativeReadsDone(long j);

    public final native void nativeReadsDoneWithError(long j, byte[] bArr);

    public final native void nativeSetReader(long j, ReaderProxy readerProxy);

    public final void finalize() {
        nativeDelete(0L);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        nativeReadsDone(0L);
    }
}
