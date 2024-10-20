package com.google.android.libraries.elements.interfaces;

import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class ResourceMetadataTracker {
    public abstract void addMetadata(ResourceMetadata resourceMetadata);

    public abstract ResourceMetadata getResourceMetadata(String str);

    public abstract TreeSet getTransitiveDeps(TreeSet treeSet);

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    final class CppProxy extends ResourceMetadataTracker {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        private native void nativeDestroy(long j);

        private native void native_addMetadata(long j, ResourceMetadata resourceMetadata);

        private native ResourceMetadata native_getResourceMetadata(long j, String str);

        private native TreeSet native_getTransitiveDeps(long j, TreeSet treeSet);

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

        @Override // com.google.android.libraries.elements.interfaces.ResourceMetadataTracker
        public void addMetadata(ResourceMetadata resourceMetadata) {
            native_addMetadata(this.nativeRef, resourceMetadata);
        }

        @Override // com.google.android.libraries.elements.interfaces.ResourceMetadataTracker
        public ResourceMetadata getResourceMetadata(String str) {
            return native_getResourceMetadata(this.nativeRef, str);
        }

        @Override // com.google.android.libraries.elements.interfaces.ResourceMetadataTracker
        public TreeSet getTransitiveDeps(TreeSet treeSet) {
            return native_getTransitiveDeps(this.nativeRef, treeSet);
        }
    }
}
