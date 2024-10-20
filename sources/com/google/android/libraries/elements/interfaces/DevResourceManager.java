package com.google.android.libraries.elements.interfaces;

import com.youtube.android.libraries.elements.StatusOr;
import io.grpc.Status;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class DevResourceManager {
    public abstract StatusOr getTemplateDetails(String str);

    public abstract StatusOr getTemplateFixture(String str, String str2);

    public abstract Status loadResource(String str);

    public abstract void logError(String str);

    public abstract String resolveIdentifier(String str);

    public abstract DevResourceSubscription subscribe(String str, DevResourceObserver devResourceObserver);

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    final class CppProxy extends DevResourceManager {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        private native void nativeDestroy(long j);

        private native StatusOr native_getTemplateDetails(long j, String str);

        private native StatusOr native_getTemplateFixture(long j, String str, String str2);

        private native Status native_loadResource(long j, String str);

        private native void native_logError(long j, String str);

        private native String native_resolveIdentifier(long j, String str);

        private native DevResourceSubscription native_subscribe(long j, String str, DevResourceObserver devResourceObserver);

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

        @Override // com.google.android.libraries.elements.interfaces.DevResourceManager
        public Status loadResource(String str) {
            return native_loadResource(this.nativeRef, str);
        }

        @Override // com.google.android.libraries.elements.interfaces.DevResourceManager
        public StatusOr getTemplateDetails(String str) {
            return native_getTemplateDetails(this.nativeRef, str);
        }

        @Override // com.google.android.libraries.elements.interfaces.DevResourceManager
        public StatusOr getTemplateFixture(String str, String str2) {
            return native_getTemplateFixture(this.nativeRef, str, str2);
        }

        @Override // com.google.android.libraries.elements.interfaces.DevResourceManager
        public DevResourceSubscription subscribe(String str, DevResourceObserver devResourceObserver) {
            return native_subscribe(this.nativeRef, str, devResourceObserver);
        }

        @Override // com.google.android.libraries.elements.interfaces.DevResourceManager
        public String resolveIdentifier(String str) {
            return native_resolveIdentifier(this.nativeRef, str);
        }

        @Override // com.google.android.libraries.elements.interfaces.DevResourceManager
        public void logError(String str) {
            native_logError(this.nativeRef, str);
        }
    }
}
