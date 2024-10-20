package com.google.android.libraries.elements.interfaces;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class TextTypeProxy {
    public abstract AttributedStringProxy additionalTruncationText();

    public abstract int maxLines();

    public abstract AttributedStringProxy text();

    public abstract AttributedStringProxy truncationText();

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    final class CppProxy extends TextTypeProxy {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        private native void nativeDestroy(long j);

        private native AttributedStringProxy native_additionalTruncationText(long j);

        private native int native_maxLines(long j);

        private native AttributedStringProxy native_text(long j);

        private native AttributedStringProxy native_truncationText(long j);

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

        @Override // com.google.android.libraries.elements.interfaces.TextTypeProxy
        public AttributedStringProxy text() {
            return native_text(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.TextTypeProxy
        public AttributedStringProxy truncationText() {
            return native_truncationText(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.TextTypeProxy
        public AttributedStringProxy additionalTruncationText() {
            return native_additionalTruncationText(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.TextTypeProxy
        public int maxLines() {
            return native_maxLines(this.nativeRef);
        }
    }
}
