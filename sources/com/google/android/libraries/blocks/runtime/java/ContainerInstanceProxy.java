package com.google.android.libraries.blocks.runtime.java;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class ContainerInstanceProxy {
    public final long a;

    public final native byte[] nativeContainerDebugSnapshot(long j);

    public final native long nativeCreateBlock(long j, int i);

    public final native long nativeCreateConcreteBlock(long j, int i, InstanceProxy instanceProxy);

    public final native long nativeCreateFromMovableRef(long j, String str);

    public final native long nativeCreateFromSharedRef(long j, String str);

    public final native void nativeDelete(long j);

    public ContainerInstanceProxy(long j) {
        this.a = j;
    }

    public final void finalize() {
        nativeDelete(this.a);
    }
}
