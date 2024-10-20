package com.google.research.ink.core.jni;

import defpackage.AbstractC3176Yl1;
import defpackage.AbstractC4508dH1;
import defpackage.T02;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes5.dex */
public class NativeDocumentImpl implements T02 {
    public static native long nativeCreateInMemoryDocumentFromSnapshot(byte[] bArr);

    public static native long nativeCreateInMemoryDocumentWithPageProperties(byte[] bArr);

    public native boolean nativeCanRedo(long j);

    public native boolean nativeCanUndo(long j);

    public native void nativeFree(long j);

    public native int nativeGetElementCount(long j);

    public native byte[] nativeGetSnapshot(long j);

    public native void nativeSetUndoEnabled(long j, boolean z);

    static {
        AbstractC3176Yl1.a();
    }

    public final void finalize() {
        int i = AbstractC4508dH1.a;
        nativeFree(0L);
    }
}
