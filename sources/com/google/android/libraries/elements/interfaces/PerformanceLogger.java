package com.google.android.libraries.elements.interfaces;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class PerformanceLogger {
    public abstract void beginPerformanceSpan(PerformanceSpanType performanceSpanType, PerformanceEventInfo performanceEventInfo);

    public abstract void endPerformanceSpan(PerformanceSpanType performanceSpanType, PerformanceEventInfo performanceEventInfo);

    public abstract ArrayList flushPerformanceSpans();

    public abstract long getCurrentThread();

    public abstract boolean isMainThread();

    public abstract void logPerformanceSpan(PerformanceSpan performanceSpan);

    public static PerformanceLogger create(PerformanceMonitorAdapter performanceMonitorAdapter, boolean z) {
        return CppProxy.create(performanceMonitorAdapter, z);
    }

    public static String nameForPerformanceSpanType(PerformanceSpanType performanceSpanType) {
        return CppProxy.nameForPerformanceSpanType(performanceSpanType);
    }

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    final class CppProxy extends PerformanceLogger {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        public static native PerformanceLogger create(PerformanceMonitorAdapter performanceMonitorAdapter, boolean z);

        public static native String nameForPerformanceSpanType(PerformanceSpanType performanceSpanType);

        private native void nativeDestroy(long j);

        private native void native_beginPerformanceSpan(long j, PerformanceSpanType performanceSpanType, PerformanceEventInfo performanceEventInfo);

        private native void native_endPerformanceSpan(long j, PerformanceSpanType performanceSpanType, PerformanceEventInfo performanceEventInfo);

        private native ArrayList native_flushPerformanceSpans(long j);

        private native long native_getCurrentThread(long j);

        private native boolean native_isMainThread(long j);

        private native void native_logPerformanceSpan(long j, PerformanceSpan performanceSpan);

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

        @Override // com.google.android.libraries.elements.interfaces.PerformanceLogger
        public long getCurrentThread() {
            return native_getCurrentThread(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.PerformanceLogger
        public boolean isMainThread() {
            return native_isMainThread(this.nativeRef);
        }

        @Override // com.google.android.libraries.elements.interfaces.PerformanceLogger
        public void logPerformanceSpan(PerformanceSpan performanceSpan) {
            native_logPerformanceSpan(this.nativeRef, performanceSpan);
        }

        @Override // com.google.android.libraries.elements.interfaces.PerformanceLogger
        public void beginPerformanceSpan(PerformanceSpanType performanceSpanType, PerformanceEventInfo performanceEventInfo) {
            native_beginPerformanceSpan(this.nativeRef, performanceSpanType, performanceEventInfo);
        }

        @Override // com.google.android.libraries.elements.interfaces.PerformanceLogger
        public void endPerformanceSpan(PerformanceSpanType performanceSpanType, PerformanceEventInfo performanceEventInfo) {
            native_endPerformanceSpan(this.nativeRef, performanceSpanType, performanceEventInfo);
        }

        @Override // com.google.android.libraries.elements.interfaces.PerformanceLogger
        public ArrayList flushPerformanceSpans() {
            return native_flushPerformanceSpans(this.nativeRef);
        }
    }
}
