package com.google.android.libraries.blocks;

import com.google.android.libraries.blocks.runtime.java.ContainerInstanceProxy;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class Container {
    public final ContainerInstanceProxy a;

    public Container(ContainerInstanceProxy containerInstanceProxy) {
        this.a = containerInstanceProxy;
    }

    private long getNativeContainerInstance() {
        return this.a.a;
    }

    private static Container fromNativeContainerInstance(long j) {
        return new Container(new ContainerInstanceProxy(j));
    }
}
