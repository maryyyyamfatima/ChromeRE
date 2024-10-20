package com.google.android.libraries.elements.interfaces;

import com.youtube.android.libraries.elements.StatusOr;
import io.grpc.Status;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class Component {
    public abstract Status debugSetModel(byte[] bArr);

    public abstract Status dispose();

    public abstract int getCompletedMaterializationCount();

    public abstract int getMaterializationCount();

    public abstract String getTemplateUri();

    public abstract boolean isDirty();

    public abstract byte[] latestEntitiesConfig();

    public abstract byte[] latestModel();

    public abstract void markDirtyForHotReload();

    public abstract StatusOr materialize(boolean z);

    public abstract Status setElement(ByteBuffer byteBuffer);

    public abstract void setObserver(ComponentObserver componentObserver);

    public static StatusOr createWithElement(ComponentElement componentElement, DevResourceManager devResourceManager, EntitiesProcessorResolver entitiesProcessorResolver, ComponentConfig componentConfig, ComponentState componentState) {
        return CppProxy.createWithElement(componentElement, devResourceManager, entitiesProcessorResolver, componentConfig, componentState);
    }

    public static StatusOr create(ByteBuffer byteBuffer, DevResourceManager devResourceManager, EntitiesProcessorResolver entitiesProcessorResolver, ComponentConfig componentConfig, ComponentState componentState) {
        return CppProxy.create(byteBuffer, devResourceManager, entitiesProcessorResolver, componentConfig, componentState);
    }

    public static int getInstanceCount() {
        return CppProxy.getInstanceCount();
    }

    public static int getUndisposedInstanceCount() {
        return CppProxy.getUndisposedInstanceCount();
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    final class CppProxy extends Component {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        public static native StatusOr create(ByteBuffer byteBuffer, DevResourceManager devResourceManager, EntitiesProcessorResolver entitiesProcessorResolver, ComponentConfig componentConfig, ComponentState componentState);

        public static native StatusOr createWithElement(ComponentElement componentElement, DevResourceManager devResourceManager, EntitiesProcessorResolver entitiesProcessorResolver, ComponentConfig componentConfig, ComponentState componentState);

        public static native int getInstanceCount();

        public static native int getUndisposedInstanceCount();

        private native void nativeDestroy(long j);

        private native Status native_debugSetModel(long j, byte[] bArr);

        private native Status native_dispose(long j);

        private native int native_getCompletedMaterializationCount(long j);

        private native int native_getMaterializationCount(long j);

        private native String native_getTemplateUri(long j);

        private native boolean native_isDirty(long j);

        private native byte[] native_latestEntitiesConfig(long j);

        private native byte[] native_latestModel(long j);

        private native void native_markDirtyForHotReload(long j);

        private native StatusOr native_materialize(long j, boolean z);

        private native Status native_setElement(long j, ByteBuffer byteBuffer);

        private native void native_setObserver(long j, ComponentObserver componentObserver);

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

        @Override // com.google.android.libraries.elements.interfaces.Component
        public void setObserver(ComponentObserver componentObserver) {
            native_setObserver(this.nativeRef, componentObserver);
        }

        @Override // com.google.android.libraries.elements.interfaces.Component
        public Status setElement(ByteBuffer byteBuffer) {
            return native_setElement(this.nativeRef, byteBuffer);
        }

        @Override // com.google.android.libraries.elements.interfaces.Component
        public String getTemplateUri() {
            return native_getTemplateUri(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.Component
        public void markDirtyForHotReload() {
            native_markDirtyForHotReload(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.Component
        public boolean isDirty() {
            return native_isDirty(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.Component
        public int getMaterializationCount() {
            return native_getMaterializationCount(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.Component
        public int getCompletedMaterializationCount() {
            return native_getCompletedMaterializationCount(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.Component
        public StatusOr materialize(boolean z) {
            return native_materialize(this.nativeRef, z);
        }

        @Override // com.google.android.libraries.elements.interfaces.Component
        public byte[] latestModel() {
            return native_latestModel(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.Component
        public byte[] latestEntitiesConfig() {
            return native_latestEntitiesConfig(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.Component
        public Status debugSetModel(byte[] bArr) {
            return native_debugSetModel(this.nativeRef, bArr);
        }

        @Override // com.google.android.libraries.elements.interfaces.Component
        public Status dispose() {
            return native_dispose(this.nativeRef);
        }
    }
}
