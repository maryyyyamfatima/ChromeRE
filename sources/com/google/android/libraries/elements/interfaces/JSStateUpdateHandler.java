package com.google.android.libraries.elements.interfaces;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class JSStateUpdateHandler {
    public abstract byte[] getModel();

    public abstract byte[] getState();

    public abstract void stateDidUpdate(byte[] bArr);

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    final class CppProxy extends JSStateUpdateHandler {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        private native void nativeDestroy(long j);

        private native byte[] native_getModel(long j);

        private native byte[] native_getState(long j);

        private native void native_stateDidUpdate(long j, byte[] bArr);

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

        @Override // com.google.android.libraries.elements.interfaces.JSStateUpdateHandler
        public void stateDidUpdate(byte[] bArr) {
            native_stateDidUpdate(this.nativeRef, bArr);
        }

        @Override // com.google.android.libraries.elements.interfaces.JSStateUpdateHandler
        public byte[] getState() {
            return native_getState(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.JSStateUpdateHandler
        public byte[] getModel() {
            return native_getModel(this.nativeRef);
        }
    }
}
