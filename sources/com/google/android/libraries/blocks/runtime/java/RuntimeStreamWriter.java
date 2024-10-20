package com.google.android.libraries.blocks.runtime.java;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class RuntimeStreamWriter implements AutoCloseable {
    public final native void nativeDelete(long j);

    public final native void nativeSetWriter(long j, WriterProxy writerProxy);

    public final native boolean nativeWrite(long j, byte[] bArr);

    public final native void nativeWritesDone(long j);

    public final native void nativeWritesDoneWithError(long j, byte[] bArr);

    public final void finalize() {
        nativeDelete(0L);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        nativeWritesDone(0L);
    }
}
