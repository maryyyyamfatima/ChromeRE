package com.google.android.libraries.elements.interfaces;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class DimensionEdgesProxy {
    public abstract DimensionProxy all();

    public abstract DimensionProxy bottom();

    public abstract DimensionProxy end();

    public abstract DimensionProxy horizontal();

    public abstract DimensionProxy left();

    public abstract DimensionProxy right();

    public abstract DimensionProxy start();

    public abstract DimensionProxy top();

    public abstract DimensionProxy vertical();

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    final class CppProxy extends DimensionEdgesProxy {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        private native void nativeDestroy(long j);

        private native DimensionProxy native_all(long j);

        private native DimensionProxy native_bottom(long j);

        private native DimensionProxy native_end(long j);

        private native DimensionProxy native_horizontal(long j);

        private native DimensionProxy native_left(long j);

        private native DimensionProxy native_right(long j);

        private native DimensionProxy native_start(long j);

        private native DimensionProxy native_top(long j);

        private native DimensionProxy native_vertical(long j);

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

        @Override // com.google.android.libraries.elements.interfaces.DimensionEdgesProxy
        public DimensionProxy top() {
            return native_top(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.DimensionEdgesProxy
        public DimensionProxy left() {
            return native_left(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.DimensionEdgesProxy
        public DimensionProxy bottom() {
            return native_bottom(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.DimensionEdgesProxy
        public DimensionProxy right() {
            return native_right(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.DimensionEdgesProxy
        public DimensionProxy start() {
            return native_start(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.DimensionEdgesProxy
        public DimensionProxy end() {
            return native_end(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.DimensionEdgesProxy
        public DimensionProxy horizontal() {
            return native_horizontal(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.DimensionEdgesProxy
        public DimensionProxy vertical() {
            return native_vertical(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.DimensionEdgesProxy
        public DimensionProxy all() {
            return native_all(this.nativeRef);
        }
    }
}
