package com.google.android.libraries.elements.interfaces;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class HotReloadResourceListener {
    public abstract void onResourcesReceived(byte[] bArr);

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    final class CppProxy extends HotReloadResourceListener {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        private native void nativeDestroy(long j);

        private native void native_onResourcesReceived(long j, byte[] bArr);

        private CppProxy(long j) {
            if (j == 0) {
                throw new RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j;
        }

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        public void finalize() {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.google.android.libraries.elements.interfaces.HotReloadResourceListener
        public void onResourcesReceived(byte[] bArr) {
            native_onResourcesReceived(this.nativeRef, bArr);
        }
    }
}