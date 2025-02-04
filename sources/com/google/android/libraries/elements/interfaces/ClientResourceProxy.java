package com.google.android.libraries.elements.interfaces;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class ClientResourceProxy {
    public abstract String bundleId();

    public abstract long imageColor();

    public abstract String imageName();

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    final class CppProxy extends ClientResourceProxy {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        private native void nativeDestroy(long j);

        private native String native_bundleId(long j);

        private native long native_imageColor(long j);

        private native String native_imageName(long j);

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

        @Override // com.google.android.libraries.elements.interfaces.ClientResourceProxy
        public String bundleId() {
            return native_bundleId(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ClientResourceProxy
        public String imageName() {
            return native_imageName(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ClientResourceProxy
        public long imageColor() {
            return native_imageColor(this.nativeRef);
        }
    }
}
