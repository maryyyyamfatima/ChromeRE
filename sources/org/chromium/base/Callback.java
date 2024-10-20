package org.chromium.base;

import defpackage.ZE;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public interface Callback {
    ZE e0(Object obj);

    void onResult(Object obj);

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    public abstract class Helper {
        public static void onObjectResultFromNative(Callback callback, Object obj) {
            callback.onResult(obj);
        }

        public static void onBooleanResultFromNative(Callback callback, boolean z) {
            callback.onResult(Boolean.valueOf(z));
        }

        public static void onIntResultFromNative(Callback callback, int i) {
            callback.onResult(Integer.valueOf(i));
        }

        public static void onLongResultFromNative(Callback callback, long j) {
            callback.onResult(Long.valueOf(j));
        }

        public static void onTimeResultFromNative(Callback callback, long j) {
            callback.onResult(Long.valueOf(j));
        }

        public static void runRunnable(Runnable runnable) {
            runnable.run();
        }
    }
}
