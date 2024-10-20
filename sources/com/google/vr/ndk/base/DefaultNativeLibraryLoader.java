package com.google.vr.ndk.base;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public abstract class DefaultNativeLibraryLoader {
    private static volatile boolean shouldIgnoreDefaultLibrary = false;

    public static void maybeLoadDefaultLibrary() {
        if (shouldIgnoreDefaultLibrary) {
            return;
        }
        try {
            System.loadLibrary("gvr");
        } catch (UnsatisfiedLinkError unused) {
        }
    }
}
