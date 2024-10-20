package com.google.android.libraries.elements.interfaces;

import com.youtube.android.libraries.elements.StatusOr;
import io.grpc.Status;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class DataSourceDelegate {
    public abstract void dispose();

    public abstract StatusOr elementAtIndex(int i);

    public abstract ArrayList identifiers();

    public abstract Status loadMore();

    public abstract Status moveItem(int i, int i2);

    public abstract Status removeItem(int i);

    public abstract int size();

    public static StatusOr getDelegate(byte[] bArr, DataSourceListener dataSourceListener, ByteStore byteStore, String str) {
        return CppProxy.getDelegate(bArr, dataSourceListener, byteStore, str);
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    final class CppProxy extends DataSourceDelegate {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        public static native StatusOr getDelegate(byte[] bArr, DataSourceListener dataSourceListener, ByteStore byteStore, String str);

        private native void nativeDestroy(long j);

        private native void native_dispose(long j);

        private native StatusOr native_elementAtIndex(long j, int i);

        private native ArrayList native_identifiers(long j);

        private native Status native_loadMore(long j);

        private native Status native_moveItem(long j, int i, int i2);

        private native Status native_removeItem(long j, int i);

        private native int native_size(long j);

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

        @Override // com.google.android.libraries.elements.interfaces.DataSourceDelegate
        public Status loadMore() {
            return native_loadMore(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.DataSourceDelegate
        public ArrayList identifiers() {
            return native_identifiers(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.DataSourceDelegate
        public int size() {
            return native_size(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.DataSourceDelegate
        public StatusOr elementAtIndex(int i) {
            return native_elementAtIndex(this.nativeRef, i);
        }

        @Override // com.google.android.libraries.elements.interfaces.DataSourceDelegate
        public Status moveItem(int i, int i2) {
            return native_moveItem(this.nativeRef, i, i2);
        }

        @Override // com.google.android.libraries.elements.interfaces.DataSourceDelegate
        public Status removeItem(int i) {
            return native_removeItem(this.nativeRef, i);
        }

        @Override // com.google.android.libraries.elements.interfaces.DataSourceDelegate, defpackage.InterfaceC6416iq0
        public void dispose() {
            native_dispose(this.nativeRef);
        }
    }
}
