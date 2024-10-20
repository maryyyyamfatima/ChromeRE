package com.google.android.libraries.elements.interfaces;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class TransactionRecord {
    public abstract Snapshot beginState();

    public abstract Snapshot endState();

    public abstract HashSet keys();

    public abstract ArrayList keysOrdered();

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    final class CppProxy extends TransactionRecord {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        private native void nativeDestroy(long j);

        private native Snapshot native_beginState(long j);

        private native Snapshot native_endState(long j);

        private native HashSet native_keys(long j);

        private native ArrayList native_keysOrdered(long j);

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

        @Override // com.google.android.libraries.elements.interfaces.TransactionRecord
        public Snapshot beginState() {
            return native_beginState(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.TransactionRecord
        public Snapshot endState() {
            return native_endState(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.TransactionRecord
        public HashSet keys() {
            return native_keys(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.TransactionRecord
        public ArrayList keysOrdered() {
            return native_keysOrdered(this.nativeRef);
        }
    }
}
