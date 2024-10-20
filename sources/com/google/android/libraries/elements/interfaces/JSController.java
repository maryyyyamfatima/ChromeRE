package com.google.android.libraries.elements.interfaces;

import com.google.android.libraries.blocks.Container;
import com.youtube.android.libraries.elements.StatusOr;
import io.grpc.Status;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class JSController {
    public abstract StatusOr executeFfiFunction(String str, String str2, byte[] bArr);

    public abstract void executeFunction(byte[] bArr, byte[] bArr2, byte[] bArr3, ByteStore byteStore, JSCommandResolver jSCommandResolver, JSFutureHandler jSFutureHandler);

    public abstract Status executePreloadInstruction(byte[] bArr);

    public abstract void prewarmExecutor();

    public abstract void registerControllerInitializer(String str, JSControllerInitializer jSControllerInitializer);

    public abstract void registerFunctionBinding(int i, JSFunctionBinding jSFunctionBinding);

    public abstract void registerStateUpdateHandler(String str, JSStateUpdateHandler jSStateUpdateHandler);

    public abstract void setPreloader(ResourcePreloader resourcePreloader);

    public abstract Status unregisterControllerInitializer(String str);

    public abstract Status unregisterStateUpdateHandler(String str);

    public static JSController create(PerformanceLogger performanceLogger, JSModuleCache jSModuleCache, Container container, JSControllerConfig jSControllerConfig) {
        return CppProxy.create(performanceLogger, jSModuleCache, container, jSControllerConfig);
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    final class CppProxy extends JSController {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        public static native JSController create(PerformanceLogger performanceLogger, JSModuleCache jSModuleCache, Container container, JSControllerConfig jSControllerConfig);

        private native void nativeDestroy(long j);

        private native StatusOr native_executeFfiFunction(long j, String str, String str2, byte[] bArr);

        private native void native_executeFunction(long j, byte[] bArr, byte[] bArr2, byte[] bArr3, ByteStore byteStore, JSCommandResolver jSCommandResolver, JSFutureHandler jSFutureHandler);

        private native Status native_executePreloadInstruction(long j, byte[] bArr);

        private native void native_prewarmExecutor(long j);

        private native void native_registerControllerInitializer(long j, String str, JSControllerInitializer jSControllerInitializer);

        private native void native_registerFunctionBinding(long j, int i, JSFunctionBinding jSFunctionBinding);

        private native void native_registerStateUpdateHandler(long j, String str, JSStateUpdateHandler jSStateUpdateHandler);

        private native void native_setPreloader(long j, ResourcePreloader resourcePreloader);

        private native Status native_unregisterControllerInitializer(long j, String str);

        private native Status native_unregisterStateUpdateHandler(long j, String str);

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

        @Override // com.google.android.libraries.elements.interfaces.JSController
        public void setPreloader(ResourcePreloader resourcePreloader) {
            native_setPreloader(this.nativeRef, resourcePreloader);
        }

        @Override // com.google.android.libraries.elements.interfaces.JSController
        public void executeFunction(byte[] bArr, byte[] bArr2, byte[] bArr3, ByteStore byteStore, JSCommandResolver jSCommandResolver, JSFutureHandler jSFutureHandler) {
            native_executeFunction(this.nativeRef, bArr, bArr2, bArr3, byteStore, jSCommandResolver, jSFutureHandler);
        }

        @Override // com.google.android.libraries.elements.interfaces.JSController
        public StatusOr executeFfiFunction(String str, String str2, byte[] bArr) {
            return native_executeFfiFunction(this.nativeRef, str, str2, bArr);
        }

        @Override // com.google.android.libraries.elements.interfaces.JSController
        public void registerFunctionBinding(int i, JSFunctionBinding jSFunctionBinding) {
            native_registerFunctionBinding(this.nativeRef, i, jSFunctionBinding);
        }

        @Override // com.google.android.libraries.elements.interfaces.JSController
        public void registerStateUpdateHandler(String str, JSStateUpdateHandler jSStateUpdateHandler) {
            native_registerStateUpdateHandler(this.nativeRef, str, jSStateUpdateHandler);
        }

        @Override // com.google.android.libraries.elements.interfaces.JSController
        public Status unregisterStateUpdateHandler(String str) {
            return native_unregisterStateUpdateHandler(this.nativeRef, str);
        }

        @Override // com.google.android.libraries.elements.interfaces.JSController
        public void registerControllerInitializer(String str, JSControllerInitializer jSControllerInitializer) {
            native_registerControllerInitializer(this.nativeRef, str, jSControllerInitializer);
        }

        @Override // com.google.android.libraries.elements.interfaces.JSController
        public Status unregisterControllerInitializer(String str) {
            return native_unregisterControllerInitializer(this.nativeRef, str);
        }

        @Override // com.google.android.libraries.elements.interfaces.JSController
        public Status executePreloadInstruction(byte[] bArr) {
            return native_executePreloadInstruction(this.nativeRef, bArr);
        }

        @Override // com.google.android.libraries.elements.interfaces.JSController
        public void prewarmExecutor() {
            native_prewarmExecutor(this.nativeRef);
        }
    }
}
