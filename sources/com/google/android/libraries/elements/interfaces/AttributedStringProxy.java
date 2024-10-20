package com.google.android.libraries.elements.interfaces;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class AttributedStringProxy {
    public abstract TextAlignment alignment();

    public abstract boolean androidIncludeFontPadding();

    public abstract String content();

    public abstract LineBreakMode lineBreakMode();

    public abstract float lineSpacing();

    public abstract TruncationMode truncationMode();

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    final class CppProxy extends AttributedStringProxy {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        private native void nativeDestroy(long j);

        private native TextAlignment native_alignment(long j);

        private native boolean native_androidIncludeFontPadding(long j);

        private native String native_content(long j);

        private native LineBreakMode native_lineBreakMode(long j);

        private native float native_lineSpacing(long j);

        private native TruncationMode native_truncationMode(long j);

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

        @Override // com.google.android.libraries.elements.interfaces.AttributedStringProxy
        public String content() {
            return native_content(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.AttributedStringProxy
        public float lineSpacing() {
            return native_lineSpacing(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.AttributedStringProxy
        public TextAlignment alignment() {
            return native_alignment(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.AttributedStringProxy
        public LineBreakMode lineBreakMode() {
            return native_lineBreakMode(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.AttributedStringProxy
        public boolean androidIncludeFontPadding() {
            return native_androidIncludeFontPadding(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.AttributedStringProxy
        public TruncationMode truncationMode() {
            return native_truncationMode(this.nativeRef);
        }
    }
}
