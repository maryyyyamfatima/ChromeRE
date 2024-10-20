package com.google.android.libraries.elements.interfaces;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class StylePropertiesProxy {
    public abstract long backgroundColor();

    public abstract long borderColor();

    public abstract float borderRadius();

    public abstract RectCornersProxy borderRadiusCorners();

    public abstract float borderWidth();

    public abstract boolean clipBounds();

    public abstract boolean hasBackgroundColor();

    public abstract boolean hasBorderColor();

    public abstract boolean hasBorderRadius();

    public abstract boolean hasBorderWidth();

    public abstract boolean hasClipBounds();

    public abstract boolean hasOpacity();

    public abstract boolean hasOpaque();

    public abstract boolean hasRotation();

    public abstract boolean hasScale();

    public abstract float opacity();

    public abstract boolean opaque();

    public abstract float rotation();

    public abstract float scale();

    public abstract PointProxy translation();

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    final class CppProxy extends StylePropertiesProxy {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        private native void nativeDestroy(long j);

        private native long native_backgroundColor(long j);

        private native long native_borderColor(long j);

        private native float native_borderRadius(long j);

        private native RectCornersProxy native_borderRadiusCorners(long j);

        private native float native_borderWidth(long j);

        private native boolean native_clipBounds(long j);

        private native boolean native_hasBackgroundColor(long j);

        private native boolean native_hasBorderColor(long j);

        private native boolean native_hasBorderRadius(long j);

        private native boolean native_hasBorderWidth(long j);

        private native boolean native_hasClipBounds(long j);

        private native boolean native_hasOpacity(long j);

        private native boolean native_hasOpaque(long j);

        private native boolean native_hasRotation(long j);

        private native boolean native_hasScale(long j);

        private native float native_opacity(long j);

        private native boolean native_opaque(long j);

        private native float native_rotation(long j);

        private native float native_scale(long j);

        private native PointProxy native_translation(long j);

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

        @Override // com.google.android.libraries.elements.interfaces.StylePropertiesProxy
        public long backgroundColor() {
            return native_backgroundColor(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.StylePropertiesProxy
        public boolean hasBackgroundColor() {
            return native_hasBackgroundColor(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.StylePropertiesProxy
        public float opacity() {
            return native_opacity(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.StylePropertiesProxy
        public boolean hasOpacity() {
            return native_hasOpacity(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.StylePropertiesProxy
        public long borderColor() {
            return native_borderColor(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.StylePropertiesProxy
        public boolean hasBorderColor() {
            return native_hasBorderColor(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.StylePropertiesProxy
        public float borderWidth() {
            return native_borderWidth(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.StylePropertiesProxy
        public boolean hasBorderWidth() {
            return native_hasBorderWidth(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.StylePropertiesProxy
        public float borderRadius() {
            return native_borderRadius(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.StylePropertiesProxy
        public boolean hasBorderRadius() {
            return native_hasBorderRadius(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.StylePropertiesProxy
        public RectCornersProxy borderRadiusCorners() {
            return native_borderRadiusCorners(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.StylePropertiesProxy
        public boolean clipBounds() {
            return native_clipBounds(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.StylePropertiesProxy
        public boolean hasClipBounds() {
            return native_hasClipBounds(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.StylePropertiesProxy
        public boolean opaque() {
            return native_opaque(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.StylePropertiesProxy
        public boolean hasOpaque() {
            return native_hasOpaque(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.StylePropertiesProxy
        public float scale() {
            return native_scale(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.StylePropertiesProxy
        public boolean hasScale() {
            return native_hasScale(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.StylePropertiesProxy
        public float rotation() {
            return native_rotation(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.StylePropertiesProxy
        public boolean hasRotation() {
            return native_hasRotation(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.StylePropertiesProxy
        public PointProxy translation() {
            return native_translation(this.nativeRef);
        }
    }
}
