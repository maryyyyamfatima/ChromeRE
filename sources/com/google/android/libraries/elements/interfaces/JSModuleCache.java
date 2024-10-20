package com.google.android.libraries.elements.interfaces;

import com.youtube.android.libraries.elements.StatusOr;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class JSModuleCache {
    public abstract void addObserver(JSModuleCacheObserver jSModuleCacheObserver);

    public abstract StatusOr getAvailableModuleSetVersion(String str);

    public abstract JSModuleBytesProvider getBytesProvider();

    public abstract ControllerModuleLoader getLoader();

    public abstract StatusOr getModuleContents(String str);

    public abstract StatusOr getModuleDependencies(String str);

    public abstract StatusOr getSerializedModuleConfig(String str);

    public static JSModuleCache create() {
        return CppProxy.create();
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    final class CppProxy extends JSModuleCache {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        public static native JSModuleCache create();

        private native void nativeDestroy(long j);

        private native void native_addObserver(long j, JSModuleCacheObserver jSModuleCacheObserver);

        private native StatusOr native_getAvailableModuleSetVersion(long j, String str);

        private native JSModuleBytesProvider native_getBytesProvider(long j);

        private native ControllerModuleLoader native_getLoader(long j);

        private native StatusOr native_getModuleContents(long j, String str);

        private native StatusOr native_getModuleDependencies(long j, String str);

        private native StatusOr native_getSerializedModuleConfig(long j, String str);

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

        @Override // com.google.android.libraries.elements.interfaces.JSModuleCache
        public ControllerModuleLoader getLoader() {
            return native_getLoader(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.JSModuleCache
        public JSModuleBytesProvider getBytesProvider() {
            return native_getBytesProvider(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.JSModuleCache
        public void addObserver(JSModuleCacheObserver jSModuleCacheObserver) {
            native_addObserver(this.nativeRef, jSModuleCacheObserver);
        }

        @Override // com.google.android.libraries.elements.interfaces.JSModuleCache
        public StatusOr getModuleContents(String str) {
            return native_getModuleContents(this.nativeRef, str);
        }

        @Override // com.google.android.libraries.elements.interfaces.JSModuleCache
        public StatusOr getModuleDependencies(String str) {
            return native_getModuleDependencies(this.nativeRef, str);
        }

        @Override // com.google.android.libraries.elements.interfaces.JSModuleCache
        public StatusOr getAvailableModuleSetVersion(String str) {
            return native_getAvailableModuleSetVersion(this.nativeRef, str);
        }

        @Override // com.google.android.libraries.elements.interfaces.JSModuleCache
        public StatusOr getSerializedModuleConfig(String str) {
            return native_getSerializedModuleConfig(this.nativeRef, str);
        }
    }
}
