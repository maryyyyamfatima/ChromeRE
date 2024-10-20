package com.google.android.libraries.elements.interfaces;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class DirectUpdateExecutor {
    public abstract void applyChangeStylePropertiesBackgroundColor(long j);

    public abstract void applyChangeStylePropertiesOpacity(float f);

    public abstract void applyChangeStylePropertiesRotation(float f);

    public abstract void applyChangeStylePropertiesScale(float f);

    public abstract void applyChangeStylePropertiesTranslation(float f, float f2);

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    final class CppProxy extends DirectUpdateExecutor {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        private native void nativeDestroy(long j);

        private native void native_applyChangeStylePropertiesBackgroundColor(long j, long j2);

        private native void native_applyChangeStylePropertiesOpacity(long j, float f);

        private native void native_applyChangeStylePropertiesRotation(long j, float f);

        private native void native_applyChangeStylePropertiesScale(long j, float f);

        private native void native_applyChangeStylePropertiesTranslation(long j, float f, float f2);

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

        @Override // com.google.android.libraries.elements.interfaces.DirectUpdateExecutor
        public void applyChangeStylePropertiesOpacity(float f) {
            native_applyChangeStylePropertiesOpacity(this.nativeRef, f);
        }

        @Override // com.google.android.libraries.elements.interfaces.DirectUpdateExecutor
        public void applyChangeStylePropertiesBackgroundColor(long j) {
            native_applyChangeStylePropertiesBackgroundColor(this.nativeRef, j);
        }

        @Override // com.google.android.libraries.elements.interfaces.DirectUpdateExecutor
        public void applyChangeStylePropertiesScale(float f) {
            native_applyChangeStylePropertiesScale(this.nativeRef, f);
        }

        @Override // com.google.android.libraries.elements.interfaces.DirectUpdateExecutor
        public void applyChangeStylePropertiesRotation(float f) {
            native_applyChangeStylePropertiesRotation(this.nativeRef, f);
        }

        @Override // com.google.android.libraries.elements.interfaces.DirectUpdateExecutor
        public void applyChangeStylePropertiesTranslation(float f, float f2) {
            native_applyChangeStylePropertiesTranslation(this.nativeRef, f, f2);
        }
    }
}
