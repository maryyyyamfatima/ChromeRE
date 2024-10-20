package com.google.android.libraries.elements.interfaces;

import io.grpc.Status;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class FetchResultHandler {
    public abstract Status onError(Status status);

    public abstract Status onSuccess(ArrayList arrayList);

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    final class CppProxy extends FetchResultHandler {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        private native void nativeDestroy(long j);

        private native Status native_onError(long j, Status status);

        private native Status native_onSuccess(long j, ArrayList arrayList);

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

        @Override // com.google.android.libraries.elements.interfaces.FetchResultHandler
        public Status onSuccess(ArrayList arrayList) {
            return native_onSuccess(this.nativeRef, arrayList);
        }

        @Override // com.google.android.libraries.elements.interfaces.FetchResultHandler
        public Status onError(Status status) {
            return native_onError(this.nativeRef, status);
        }
    }
}
