package com.google.android.libraries.elements.interfaces;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class ImageSourceProxy {
    public abstract ClientResourceProxy clientResource();

    public abstract long height();

    public abstract byte[] imageData();

    public abstract String url();

    public abstract long width();

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    final class CppProxy extends ImageSourceProxy {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        private native void nativeDestroy(long j);

        private native ClientResourceProxy native_clientResource(long j);

        private native long native_height(long j);

        private native byte[] native_imageData(long j);

        private native String native_url(long j);

        private native long native_width(long j);

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

        @Override // com.google.android.libraries.elements.interfaces.ImageSourceProxy
        public String url() {
            return native_url(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ImageSourceProxy
        public byte[] imageData() {
            return native_imageData(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ImageSourceProxy
        public long width() {
            return native_width(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ImageSourceProxy
        public long height() {
            return native_height(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ImageSourceProxy
        public ClientResourceProxy clientResource() {
            return native_clientResource(this.nativeRef);
        }
    }
}
