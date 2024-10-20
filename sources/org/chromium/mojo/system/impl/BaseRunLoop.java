package org.chromium.mojo.system.impl;

import java.io.Closeable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class BaseRunLoop implements Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public static void runRunnable(Runnable runnable) {
        runnable.run();
    }
}
