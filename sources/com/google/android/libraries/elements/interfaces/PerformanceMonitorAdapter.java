package com.google.android.libraries.elements.interfaces;

import java.util.EnumSet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class PerformanceMonitorAdapter {
    public abstract boolean flushPerformanceSpan(PerformanceSpan performanceSpan);

    public abstract long getCurrentThread();

    public abstract EnumSet getPerformanceSpanBlocklist();

    public abstract boolean isMainThread();

    public abstract boolean shouldRecordLogs();
}
