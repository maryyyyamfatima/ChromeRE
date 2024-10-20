package com.google.android.libraries.elements.interfaces;

import io.grpc.Status;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class ComponentState {
    public abstract Status dispose();

    public abstract boolean isEmpty();

    public static ComponentState create() {
        return CppProxy.create();
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    final class CppProxy extends ComponentState {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        public static native ComponentState create();

        private native void nativeDestroy(long j);

        private native Status native_dispose(long j);

        private native boolean native_isEmpty(long j);

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

        @Override // com.google.android.libraries.elements.interfaces.ComponentState
        public boolean isEmpty() {
            return native_isEmpty(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ComponentState
        public Status dispose() {
            return native_dispose(this.nativeRef);
        }
    }
}
