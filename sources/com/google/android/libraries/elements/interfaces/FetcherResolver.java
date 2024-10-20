package com.google.android.libraries.elements.interfaces;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class FetcherResolver {
    public abstract Fetcher getFetcher(int i, byte[] bArr);

    public abstract void register(int i, FetcherFactory fetcherFactory);

    public static FetcherResolver sharedResolver() {
        return CppProxy.sharedResolver();
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    final class CppProxy extends FetcherResolver {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        private native void nativeDestroy(long j);

        private native Fetcher native_getFetcher(long j, int i, byte[] bArr);

        private native void native_register(long j, int i, FetcherFactory fetcherFactory);

        public static native FetcherResolver sharedResolver();

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

        @Override // com.google.android.libraries.elements.interfaces.FetcherResolver
        public void register(int i, FetcherFactory fetcherFactory) {
            native_register(this.nativeRef, i, fetcherFactory);
        }

        @Override // com.google.android.libraries.elements.interfaces.FetcherResolver
        public Fetcher getFetcher(int i, byte[] bArr) {
            return native_getFetcher(this.nativeRef, i, bArr);
        }
    }
}
