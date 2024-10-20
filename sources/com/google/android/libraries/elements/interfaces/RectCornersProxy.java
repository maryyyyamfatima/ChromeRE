package com.google.android.libraries.elements.interfaces;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class RectCornersProxy {
    public abstract boolean bottomEnd();

    public abstract boolean bottomLeft();

    public abstract boolean bottomRight();

    public abstract boolean bottomStart();

    public abstract boolean hasBottomEnd();

    public abstract boolean hasBottomLeft();

    public abstract boolean hasBottomRight();

    public abstract boolean hasBottomStart();

    public abstract boolean hasTopEnd();

    public abstract boolean hasTopLeft();

    public abstract boolean hasTopRight();

    public abstract boolean hasTopStart();

    public abstract boolean topEnd();

    public abstract boolean topLeft();

    public abstract boolean topRight();

    public abstract boolean topStart();

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    final class CppProxy extends RectCornersProxy {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        private native void nativeDestroy(long j);

        private native boolean native_bottomEnd(long j);

        private native boolean native_bottomLeft(long j);

        private native boolean native_bottomRight(long j);

        private native boolean native_bottomStart(long j);

        private native boolean native_hasBottomEnd(long j);

        private native boolean native_hasBottomLeft(long j);

        private native boolean native_hasBottomRight(long j);

        private native boolean native_hasBottomStart(long j);

        private native boolean native_hasTopEnd(long j);

        private native boolean native_hasTopLeft(long j);

        private native boolean native_hasTopRight(long j);

        private native boolean native_hasTopStart(long j);

        private native boolean native_topEnd(long j);

        private native boolean native_topLeft(long j);

        private native boolean native_topRight(long j);

        private native boolean native_topStart(long j);

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

        @Override // com.google.android.libraries.elements.interfaces.RectCornersProxy
        public boolean hasTopLeft() {
            return native_hasTopLeft(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.RectCornersProxy
        public boolean topLeft() {
            return native_topLeft(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.RectCornersProxy
        public boolean hasTopRight() {
            return native_hasTopRight(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.RectCornersProxy
        public boolean topRight() {
            return native_topRight(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.RectCornersProxy
        public boolean hasBottomLeft() {
            return native_hasBottomLeft(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.RectCornersProxy
        public boolean bottomLeft() {
            return native_bottomLeft(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.RectCornersProxy
        public boolean hasBottomRight() {
            return native_hasBottomRight(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.RectCornersProxy
        public boolean bottomRight() {
            return native_bottomRight(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.RectCornersProxy
        public boolean hasTopStart() {
            return native_hasTopStart(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.RectCornersProxy
        public boolean topStart() {
            return native_topStart(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.RectCornersProxy
        public boolean hasTopEnd() {
            return native_hasTopEnd(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.RectCornersProxy
        public boolean topEnd() {
            return native_topEnd(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.RectCornersProxy
        public boolean hasBottomStart() {
            return native_hasBottomStart(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.RectCornersProxy
        public boolean bottomStart() {
            return native_bottomStart(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.RectCornersProxy
        public boolean hasBottomEnd() {
            return native_hasBottomEnd(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.RectCornersProxy
        public boolean bottomEnd() {
            return native_bottomEnd(this.nativeRef);
        }
    }
}
