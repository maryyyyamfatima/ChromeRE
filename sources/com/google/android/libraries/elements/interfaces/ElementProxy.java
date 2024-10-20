package com.google.android.libraries.elements.interfaces;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class ElementProxy {
    public abstract ArrayList childElements();

    public abstract String key();

    public abstract PropertiesProxy properties();

    public abstract TypeProxy type();

    public static ElementProxy create(byte[] bArr) {
        return CppProxy.create(bArr);
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    final class CppProxy extends ElementProxy {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        public static native ElementProxy create(byte[] bArr);

        private native void nativeDestroy(long j);

        private native ArrayList native_childElements(long j);

        private native String native_key(long j);

        private native PropertiesProxy native_properties(long j);

        private native TypeProxy native_type(long j);

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

        @Override // com.google.android.libraries.elements.interfaces.ElementProxy
        public TypeProxy type() {
            return native_type(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ElementProxy
        public ArrayList childElements() {
            return native_childElements(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ElementProxy
        public PropertiesProxy properties() {
            return native_properties(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ElementProxy
        public String key() {
            return native_key(this.nativeRef);
        }
    }
}
