package com.google.android.libraries.blocks.runtime.java;

import com.google.android.libraries.blocks.StreamReaderWriter;
import com.google.common.util.concurrent.SettableFuture;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class BaseClient implements AutoCloseable {

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    public interface ReadableWritableStreamCreator {
        StreamReaderWriter create(long j, long j2);
    }

    public final native void nativeCallAsync(long j, int i, byte[] bArr, SettableFuture settableFuture);

    public final native long nativeCallReadableStream(long j, int i, byte[] bArr);

    public final native StreamReaderWriter nativeCallReadableWritableStream(long j, int i, ReadableWritableStreamCreator readableWritableStreamCreator);

    public final native byte[] nativeCallSync(long j, int i, byte[] bArr);

    public final native long nativeCallWritableStream(long j, int i, SettableFuture settableFuture);

    public final native void nativeDelete(long j);

    public final native InstanceProxy nativeGetUnderlyingInstanceProxy(long j);

    public final native void nativeRelease(long j);

    public final native String nativeToMovableRef(long j);

    public final native String nativeToSharedRef(long j);

    @Override // java.lang.AutoCloseable
    public final void close() {
        nativeRelease(0L);
    }

    public final void finalize() {
        nativeDelete(0L);
    }
}
