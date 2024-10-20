package com.google.android.libraries.elements.interfaces;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class TypeProxy {
    public abstract CellTypeProxy cellType();

    public abstract ContainerTypeProxy containerType();

    public abstract boolean hasCellType();

    public abstract boolean hasContainerType();

    public abstract boolean hasImageType();

    public abstract boolean hasScrollableContainerType();

    public abstract boolean hasTextType();

    public abstract ImageTypeProxy imageType();

    public abstract ScrollableContainerTypeProxy scrollableContainerType();

    public abstract TextTypeProxy textType();

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    final class CppProxy extends TypeProxy {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        private native void nativeDestroy(long j);

        private native CellTypeProxy native_cellType(long j);

        private native ContainerTypeProxy native_containerType(long j);

        private native boolean native_hasCellType(long j);

        private native boolean native_hasContainerType(long j);

        private native boolean native_hasImageType(long j);

        private native boolean native_hasScrollableContainerType(long j);

        private native boolean native_hasTextType(long j);

        private native ImageTypeProxy native_imageType(long j);

        private native ScrollableContainerTypeProxy native_scrollableContainerType(long j);

        private native TextTypeProxy native_textType(long j);

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

        @Override // com.google.android.libraries.elements.interfaces.TypeProxy
        public CellTypeProxy cellType() {
            return native_cellType(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.TypeProxy
        public boolean hasCellType() {
            return native_hasCellType(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.TypeProxy
        public ContainerTypeProxy containerType() {
            return native_containerType(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.TypeProxy
        public boolean hasContainerType() {
            return native_hasContainerType(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.TypeProxy
        public ImageTypeProxy imageType() {
            return native_imageType(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.TypeProxy
        public boolean hasImageType() {
            return native_hasImageType(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.TypeProxy
        public TextTypeProxy textType() {
            return native_textType(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.TypeProxy
        public boolean hasTextType() {
            return native_hasTextType(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.TypeProxy
        public ScrollableContainerTypeProxy scrollableContainerType() {
            return native_scrollableContainerType(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.TypeProxy
        public boolean hasScrollableContainerType() {
            return native_hasScrollableContainerType(this.nativeRef);
        }
    }
}
