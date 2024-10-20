package com.google.android.libraries.elements.interfaces;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class ImageProxy {
    public abstract ContentMode contentMode();

    public abstract boolean flipForRtlLayout();

    public abstract ImageFormatHint imageFormatHint();

    public abstract ArrayList sources();

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    final class CppProxy extends ImageProxy {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        private native void nativeDestroy(long j);

        private native ContentMode native_contentMode(long j);

        private native boolean native_flipForRtlLayout(long j);

        private native ImageFormatHint native_imageFormatHint(long j);

        private native ArrayList native_sources(long j);

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

        @Override // com.google.android.libraries.elements.interfaces.ImageProxy
        public ArrayList sources() {
            return native_sources(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ImageProxy
        public boolean flipForRtlLayout() {
            return native_flipForRtlLayout(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ImageProxy
        public ImageFormatHint imageFormatHint() {
            return native_imageFormatHint(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ImageProxy
        public ContentMode contentMode() {
            return native_contentMode(this.nativeRef);
        }
    }
}
