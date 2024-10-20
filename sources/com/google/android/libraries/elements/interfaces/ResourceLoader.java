package com.google.android.libraries.elements.interfaces;

import com.youtube.android.libraries.elements.StatusOr;
import io.grpc.Status;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class ResourceLoader {
    public abstract Status cacheResources();

    public abstract Status commitCachedTrackableResources();

    public abstract CertificateTracker getCertificateTracker();

    public abstract ResourceMetadataTracker getMetadataTracker();

    public abstract ResourcePreloader getPreloader();

    public abstract Status handleOmittedResources(TreeSet treeSet);

    public abstract Status handleResources(ArrayList arrayList);

    public abstract boolean isCacheValid();

    public abstract void registerMissingResourceHandler(MissingResourceHandler missingResourceHandler);

    public abstract void registerVerifier(String str, StatusOr statusOr);

    public abstract void updateResourceStatus(ResourceCheck resourceCheck);

    public abstract Status updateResources(ArrayList arrayList, ResourceLoaderCallback resourceLoaderCallback);

    public static StatusOr create(ControllerModuleLoader controllerModuleLoader, BlocksContainerLoaderProxy blocksContainerLoaderProxy, PublicKeyVerifierProvider publicKeyVerifierProvider, ResourceLoaderDelegate resourceLoaderDelegate, ResourceLoaderConfig resourceLoaderConfig) {
        return CppProxy.create(controllerModuleLoader, blocksContainerLoaderProxy, publicKeyVerifierProvider, resourceLoaderDelegate, resourceLoaderConfig);
    }

    public static StatusOr createWithCache(ControllerModuleLoader controllerModuleLoader, BlocksContainerLoaderProxy blocksContainerLoaderProxy, PublicKeyVerifierProvider publicKeyVerifierProvider, ResourceLoaderDelegate resourceLoaderDelegate, CacheStrategyDelegate cacheStrategyDelegate, ResourceLoaderConfig resourceLoaderConfig) {
        return CppProxy.createWithCache(controllerModuleLoader, blocksContainerLoaderProxy, publicKeyVerifierProvider, resourceLoaderDelegate, cacheStrategyDelegate, resourceLoaderConfig);
    }

    public static ResourceLoader createWithDefaultConfigWithBlocks(ControllerModuleLoader controllerModuleLoader, BlocksContainerLoaderProxy blocksContainerLoaderProxy, PublicKeyVerifierProvider publicKeyVerifierProvider, ResourceLoaderDelegate resourceLoaderDelegate) {
        return CppProxy.createWithDefaultConfigWithBlocks(controllerModuleLoader, blocksContainerLoaderProxy, publicKeyVerifierProvider, resourceLoaderDelegate);
    }

    public static ResourceLoader createWithDefaultConfig(ControllerModuleLoader controllerModuleLoader, PublicKeyVerifierProvider publicKeyVerifierProvider, ResourceLoaderDelegate resourceLoaderDelegate) {
        return CppProxy.createWithDefaultConfig(controllerModuleLoader, publicKeyVerifierProvider, resourceLoaderDelegate);
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    public final class CppProxy extends ResourceLoader {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        public static native StatusOr create(ControllerModuleLoader controllerModuleLoader, BlocksContainerLoaderProxy blocksContainerLoaderProxy, PublicKeyVerifierProvider publicKeyVerifierProvider, ResourceLoaderDelegate resourceLoaderDelegate, ResourceLoaderConfig resourceLoaderConfig);

        public static native StatusOr createWithCache(ControllerModuleLoader controllerModuleLoader, BlocksContainerLoaderProxy blocksContainerLoaderProxy, PublicKeyVerifierProvider publicKeyVerifierProvider, ResourceLoaderDelegate resourceLoaderDelegate, CacheStrategyDelegate cacheStrategyDelegate, ResourceLoaderConfig resourceLoaderConfig);

        public static native ResourceLoader createWithDefaultConfig(ControllerModuleLoader controllerModuleLoader, PublicKeyVerifierProvider publicKeyVerifierProvider, ResourceLoaderDelegate resourceLoaderDelegate);

        public static native ResourceLoader createWithDefaultConfigWithBlocks(ControllerModuleLoader controllerModuleLoader, BlocksContainerLoaderProxy blocksContainerLoaderProxy, PublicKeyVerifierProvider publicKeyVerifierProvider, ResourceLoaderDelegate resourceLoaderDelegate);

        private native void nativeDestroy(long j);

        private native Status native_cacheResources(long j);

        private native Status native_commitCachedTrackableResources(long j);

        private native CertificateTracker native_getCertificateTracker(long j);

        private native ResourceMetadataTracker native_getMetadataTracker(long j);

        private native ResourcePreloader native_getPreloader(long j);

        private native Status native_handleOmittedResources(long j, TreeSet treeSet);

        private native Status native_handleResources(long j, ArrayList arrayList);

        private native boolean native_isCacheValid(long j);

        private native void native_registerMissingResourceHandler(long j, MissingResourceHandler missingResourceHandler);

        private native void native_registerVerifier(long j, String str, StatusOr statusOr);

        private native void native_updateResourceStatus(long j, ResourceCheck resourceCheck);

        private native Status native_updateResources(long j, ArrayList arrayList, ResourceLoaderCallback resourceLoaderCallback);

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

        @Override // com.google.android.libraries.elements.interfaces.ResourceLoader
        public Status handleResources(ArrayList arrayList) {
            return native_handleResources(this.nativeRef, arrayList);
        }

        @Override // com.google.android.libraries.elements.interfaces.ResourceLoader
        public Status handleOmittedResources(TreeSet treeSet) {
            return native_handleOmittedResources(this.nativeRef, treeSet);
        }

        @Override // com.google.android.libraries.elements.interfaces.ResourceLoader
        public Status updateResources(ArrayList arrayList, ResourceLoaderCallback resourceLoaderCallback) {
            return native_updateResources(this.nativeRef, arrayList, resourceLoaderCallback);
        }

        @Override // com.google.android.libraries.elements.interfaces.ResourceLoader
        public void registerVerifier(String str, StatusOr statusOr) {
            native_registerVerifier(this.nativeRef, str, statusOr);
        }

        @Override // com.google.android.libraries.elements.interfaces.ResourceLoader
        public ResourcePreloader getPreloader() {
            return native_getPreloader(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ResourceLoader
        public ResourceMetadataTracker getMetadataTracker() {
            return native_getMetadataTracker(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ResourceLoader
        public CertificateTracker getCertificateTracker() {
            return native_getCertificateTracker(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ResourceLoader
        public void updateResourceStatus(ResourceCheck resourceCheck) {
            native_updateResourceStatus(this.nativeRef, resourceCheck);
        }

        @Override // com.google.android.libraries.elements.interfaces.ResourceLoader
        public Status commitCachedTrackableResources() {
            return native_commitCachedTrackableResources(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ResourceLoader
        public Status cacheResources() {
            return native_cacheResources(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ResourceLoader
        public boolean isCacheValid() {
            return native_isCacheValid(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.ResourceLoader
        public void registerMissingResourceHandler(MissingResourceHandler missingResourceHandler) {
            native_registerMissingResourceHandler(this.nativeRef, missingResourceHandler);
        }
    }
}
