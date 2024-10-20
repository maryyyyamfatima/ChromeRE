package com.google.android.libraries.elements.interfaces;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class DebuggerClient {
    public abstract boolean sendLog(byte[] bArr);

    public abstract boolean sendStoreSnapshot(byte[] bArr);

    public abstract boolean sendTimelineEvent(byte[] bArr);

    public abstract boolean traverseViewHierarchyResponse(byte[] bArr);

    public static DebuggerClient create(String str, String str2, String str3, DebuggerCallback debuggerCallback) {
        return CppProxy.create(str, str2, str3, debuggerCallback);
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    final class CppProxy extends DebuggerClient {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        public static native DebuggerClient create(String str, String str2, String str3, DebuggerCallback debuggerCallback);

        private native void nativeDestroy(long j);

        private native boolean native_sendLog(long j, byte[] bArr);

        private native boolean native_sendStoreSnapshot(long j, byte[] bArr);

        private native boolean native_sendTimelineEvent(long j, byte[] bArr);

        private native boolean native_traverseViewHierarchyResponse(long j, byte[] bArr);

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

        @Override // com.google.android.libraries.elements.interfaces.DebuggerClient
        public boolean traverseViewHierarchyResponse(byte[] bArr) {
            return native_traverseViewHierarchyResponse(this.nativeRef, bArr);
        }

        @Override // com.google.android.libraries.elements.interfaces.DebuggerClient
        public boolean sendLog(byte[] bArr) {
            return native_sendLog(this.nativeRef, bArr);
        }

        @Override // com.google.android.libraries.elements.interfaces.DebuggerClient
        public boolean sendStoreSnapshot(byte[] bArr) {
            return native_sendStoreSnapshot(this.nativeRef, bArr);
        }

        @Override // com.google.android.libraries.elements.interfaces.DebuggerClient
        public boolean sendTimelineEvent(byte[] bArr) {
            return native_sendTimelineEvent(this.nativeRef, bArr);
        }
    }
}
