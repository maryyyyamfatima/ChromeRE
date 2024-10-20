package com.google.android.libraries.elements.interfaces;

import com.google.protos.youtube.elements.DirectUpdatePropertiesOuterClass$DirectUpdateProperties;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class DirectUpdateProcessor {
    public abstract void dispose();

    public abstract void processProperties(DirectUpdatePropertiesOuterClass$DirectUpdateProperties directUpdatePropertiesOuterClass$DirectUpdateProperties);

    public static DirectUpdateProcessor create(DirectUpdateExecutor directUpdateExecutor, ByteStore byteStore, CommandHandlerResolver commandHandlerResolver) {
        return CppProxy.create(directUpdateExecutor, byteStore, commandHandlerResolver);
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    final class CppProxy extends DirectUpdateProcessor {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        public static native DirectUpdateProcessor create(DirectUpdateExecutor directUpdateExecutor, ByteStore byteStore, CommandHandlerResolver commandHandlerResolver);

        private native void nativeDestroy(long j);

        private native void native_dispose(long j);

        private native void native_processProperties(long j, DirectUpdatePropertiesOuterClass$DirectUpdateProperties directUpdatePropertiesOuterClass$DirectUpdateProperties);

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

        @Override // com.google.android.libraries.elements.interfaces.DirectUpdateProcessor
        public void processProperties(DirectUpdatePropertiesOuterClass$DirectUpdateProperties directUpdatePropertiesOuterClass$DirectUpdateProperties) {
            native_processProperties(this.nativeRef, directUpdatePropertiesOuterClass$DirectUpdateProperties);
        }

        @Override // com.google.android.libraries.elements.interfaces.DirectUpdateProcessor
        public void dispose() {
            native_dispose(this.nativeRef);
        }
    }
}
