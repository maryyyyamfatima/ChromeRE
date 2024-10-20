package com.google.android.libraries.elements.interfaces;

import com.youtube.android.libraries.elements.StatusOr;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class EntitiesProcessorResolver {
    public static StatusOr create(ByteStore byteStore, EnvironmentDataSource environmentDataSource, EntitiesObserverConfig entitiesObserverConfig) {
        return CppProxy.create(byteStore, environmentDataSource, entitiesObserverConfig);
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    final class CppProxy extends EntitiesProcessorResolver {
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        public static native StatusOr create(ByteStore byteStore, EnvironmentDataSource environmentDataSource, EntitiesObserverConfig entitiesObserverConfig);

        private native void nativeDestroy(long j);

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
    }
}
