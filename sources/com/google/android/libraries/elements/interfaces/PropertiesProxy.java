package com.google.android.libraries.elements.interfaces;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class PropertiesProxy {
    public abstract boolean hasLayoutProperties();

    public abstract boolean hasStyleProperties();

    public abstract LayoutPropertiesProxy layoutProperties();

    public abstract StylePropertiesProxy styleProperties();

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    final class CppProxy extends PropertiesProxy {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        private native void nativeDestroy(long j);

        private native boolean native_hasLayoutProperties(long j);

        private native boolean native_hasStyleProperties(long j);

        private native LayoutPropertiesProxy native_layoutProperties(long j);

        private native StylePropertiesProxy native_styleProperties(long j);

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

        @Override // com.google.android.libraries.elements.interfaces.PropertiesProxy
        public StylePropertiesProxy styleProperties() {
            return native_styleProperties(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.PropertiesProxy
        public boolean hasStyleProperties() {
            return native_hasStyleProperties(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.PropertiesProxy
        public LayoutPropertiesProxy layoutProperties() {
            return native_layoutProperties(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.PropertiesProxy
        public boolean hasLayoutProperties() {
            return native_hasLayoutProperties(this.nativeRef);
        }
    }
}
