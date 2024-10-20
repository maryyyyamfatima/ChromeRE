package com.google.android.libraries.elements.interfaces;

import io.grpc.Status;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class ResourcePreloader {
    public abstract Status ensureLoaded(HashSet hashSet, ProcessState processState, ErrorPolicy errorPolicy, Long l);

    public abstract Status loadAll();

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    final class CppProxy extends ResourcePreloader {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        private native void nativeDestroy(long j);

        private native Status native_ensureLoaded(long j, HashSet hashSet, ProcessState processState, ErrorPolicy errorPolicy, Long l);

        private native Status native_loadAll(long j);

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

        @Override // com.google.android.libraries.elements.interfaces.ResourcePreloader
        public Status loadAll() {
            return native_loadAll(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ResourcePreloader
        public Status ensureLoaded(HashSet hashSet, ProcessState processState, ErrorPolicy errorPolicy, Long l) {
            return native_ensureLoaded(this.nativeRef, hashSet, processState, errorPolicy, l);
        }
    }
}
