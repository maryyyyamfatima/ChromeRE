package com.google.android.libraries.elements.interfaces;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class ImageTypeProxy {
    public abstract ImageProxy defaultImage();

    public abstract ImageProxy errorImage();

    public abstract ImageProxy image();

    public abstract float preloadWidthHint();

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    final class CppProxy extends ImageTypeProxy {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        private native void nativeDestroy(long j);

        private native ImageProxy native_defaultImage(long j);

        private native ImageProxy native_errorImage(long j);

        private native ImageProxy native_image(long j);

        private native float native_preloadWidthHint(long j);

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

        @Override // com.google.android.libraries.elements.interfaces.ImageTypeProxy
        public ImageProxy image() {
            return native_image(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ImageTypeProxy
        public ImageProxy defaultImage() {
            return native_defaultImage(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ImageTypeProxy
        public ImageProxy errorImage() {
            return native_errorImage(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ImageTypeProxy
        public float preloadWidthHint() {
            return native_preloadWidthHint(this.nativeRef);
        }
    }
}
