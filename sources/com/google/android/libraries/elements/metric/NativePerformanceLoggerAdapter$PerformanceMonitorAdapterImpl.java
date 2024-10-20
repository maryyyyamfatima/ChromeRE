package com.google.android.libraries.elements.metric;

import android.os.Looper;
import com.google.android.libraries.elements.interfaces.PerformanceMonitorAdapter;
import com.google.android.libraries.elements.interfaces.PerformanceSpan;
import com.google.android.libraries.elements.interfaces.PerformanceSpanBlocklist;
import defpackage.AbstractC9572s12;
import defpackage.C10020tK3;
import java.util.Collections;
import java.util.EnumSet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
class NativePerformanceLoggerAdapter$PerformanceMonitorAdapterImpl extends PerformanceMonitorAdapter {
    private final AbstractC9572s12 adapter;
    private final boolean isMetricEnabled;

    @Override // com.google.android.libraries.elements.interfaces.PerformanceMonitorAdapter
    public final long getCurrentThread() {
        return new C10020tK3(Thread.currentThread().getId(), Looper.getMainLooper().getThread() == Thread.currentThread()).b;
    }

    @Override // com.google.android.libraries.elements.interfaces.PerformanceMonitorAdapter
    public final boolean isMainThread() {
        return new C10020tK3(Thread.currentThread().getId(), Looper.getMainLooper().getThread() == Thread.currentThread()).a;
    }

    public NativePerformanceLoggerAdapter$PerformanceMonitorAdapterImpl(boolean z, AbstractC9572s12 abstractC9572s12) {
        this.isMetricEnabled = z;
    }

    @Override // com.google.android.libraries.elements.interfaces.PerformanceMonitorAdapter
    public final boolean shouldRecordLogs() {
        return this.isMetricEnabled;
    }

    @Override // com.google.android.libraries.elements.interfaces.PerformanceMonitorAdapter
    public final EnumSet getPerformanceSpanBlocklist() {
        return EnumSet.noneOf(PerformanceSpanBlocklist.class);
    }

    @Override // com.google.android.libraries.elements.interfaces.PerformanceMonitorAdapter
    public boolean flushPerformanceSpan(PerformanceSpan performanceSpan) {
        Collections.singletonList(performanceSpan);
        throw null;
    }
}
