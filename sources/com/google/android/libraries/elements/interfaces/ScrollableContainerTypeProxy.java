package com.google.android.libraries.elements.interfaces;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class ScrollableContainerTypeProxy {
    public abstract PointProxy contentOffset();

    public abstract SizeProxy contentSize();

    public abstract ScrollableContainerTypeDirection direction();

    public abstract ScrollableContainerTypeOverscrollMode overscrollMode();

    public abstract boolean showHorizontalIndicator();

    public abstract boolean showVerticalIndicator();

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    final class CppProxy extends ScrollableContainerTypeProxy {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        private native void nativeDestroy(long j);

        private native PointProxy native_contentOffset(long j);

        private native SizeProxy native_contentSize(long j);

        private native ScrollableContainerTypeDirection native_direction(long j);

        private native ScrollableContainerTypeOverscrollMode native_overscrollMode(long j);

        private native boolean native_showHorizontalIndicator(long j);

        private native boolean native_showVerticalIndicator(long j);

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

        @Override // com.google.android.libraries.elements.interfaces.ScrollableContainerTypeProxy
        public ScrollableContainerTypeDirection direction() {
            return native_direction(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ScrollableContainerTypeProxy
        public PointProxy contentOffset() {
            return native_contentOffset(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ScrollableContainerTypeProxy
        public SizeProxy contentSize() {
            return native_contentSize(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ScrollableContainerTypeProxy
        public boolean showHorizontalIndicator() {
            return native_showHorizontalIndicator(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ScrollableContainerTypeProxy
        public boolean showVerticalIndicator() {
            return native_showVerticalIndicator(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ScrollableContainerTypeProxy
        public ScrollableContainerTypeOverscrollMode overscrollMode() {
            return native_overscrollMode(this.nativeRef);
        }
    }
}
