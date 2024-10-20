package com.google.android.libraries.elements.interfaces;

import android.graphics.Rect;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class IntersectionEngine {
    public abstract void checkProminence();

    public abstract void onEnter(String str, Rect rect, Rect rect2, Rect rect3, boolean z);

    public abstract void onExit(String str, Rect rect, Rect rect2, Rect rect3, boolean z);

    public abstract void onScroll(String str, Rect rect, Rect rect2, Rect rect3, int i, int i2);

    public abstract void onSizeChange(String str, Rect rect, Rect rect2, Rect rect3, boolean z);

    public abstract void setEnableProminence(boolean z, ProminenceAlgorithm prominenceAlgorithm);

    public abstract void setEnableProminenceForGroup(String str, boolean z);

    public abstract void setRtl(boolean z);

    public abstract IntersectionSubscription subscribe(String str, IntersectionObserver intersectionObserver);

    public static IntersectionEngine create() {
        return CppProxy.create();
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    final class CppProxy extends IntersectionEngine {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        public static native IntersectionEngine create();

        private native void nativeDestroy(long j);

        private native void native_checkProminence(long j);

        private native void native_onEnter(long j, String str, Rect rect, Rect rect2, Rect rect3, boolean z);

        private native void native_onExit(long j, String str, Rect rect, Rect rect2, Rect rect3, boolean z);

        private native void native_onScroll(long j, String str, Rect rect, Rect rect2, Rect rect3, int i, int i2);

        private native void native_onSizeChange(long j, String str, Rect rect, Rect rect2, Rect rect3, boolean z);

        private native void native_setEnableProminence(long j, boolean z, ProminenceAlgorithm prominenceAlgorithm);

        private native void native_setEnableProminenceForGroup(long j, String str, boolean z);

        private native void native_setRtl(long j, boolean z);

        private native IntersectionSubscription native_subscribe(long j, String str, IntersectionObserver intersectionObserver);

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

        @Override // com.google.android.libraries.elements.interfaces.IntersectionEngine
        public IntersectionSubscription subscribe(String str, IntersectionObserver intersectionObserver) {
            return native_subscribe(this.nativeRef, str, intersectionObserver);
        }

        @Override // com.google.android.libraries.elements.interfaces.IntersectionEngine
        public void onScroll(String str, Rect rect, Rect rect2, Rect rect3, int i, int i2) {
            native_onScroll(this.nativeRef, str, rect, rect2, rect3, i, i2);
        }

        @Override // com.google.android.libraries.elements.interfaces.IntersectionEngine
        public void onEnter(String str, Rect rect, Rect rect2, Rect rect3, boolean z) {
            native_onEnter(this.nativeRef, str, rect, rect2, rect3, z);
        }

        @Override // com.google.android.libraries.elements.interfaces.IntersectionEngine
        public void onExit(String str, Rect rect, Rect rect2, Rect rect3, boolean z) {
            native_onExit(this.nativeRef, str, rect, rect2, rect3, z);
        }

        @Override // com.google.android.libraries.elements.interfaces.IntersectionEngine
        public void onSizeChange(String str, Rect rect, Rect rect2, Rect rect3, boolean z) {
            native_onSizeChange(this.nativeRef, str, rect, rect2, rect3, z);
        }

        @Override // com.google.android.libraries.elements.interfaces.IntersectionEngine
        public void setEnableProminence(boolean z, ProminenceAlgorithm prominenceAlgorithm) {
            native_setEnableProminence(this.nativeRef, z, prominenceAlgorithm);
        }

        @Override // com.google.android.libraries.elements.interfaces.IntersectionEngine
        public void checkProminence() {
            native_checkProminence(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.IntersectionEngine
        public void setRtl(boolean z) {
            native_setRtl(this.nativeRef, z);
        }

        @Override // com.google.android.libraries.elements.interfaces.IntersectionEngine
        public void setEnableProminenceForGroup(String str, boolean z) {
            native_setEnableProminenceForGroup(this.nativeRef, str, z);
        }
    }
}
