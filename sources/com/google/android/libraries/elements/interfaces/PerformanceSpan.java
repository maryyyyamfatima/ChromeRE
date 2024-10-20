package com.google.android.libraries.elements.interfaces;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class PerformanceSpan {
    final Long begin;
    final int beginThreadIdentifier;
    final Long end;
    final int endThreadIdentifier;
    final PerformanceEventInfo info;
    final boolean isMainThread;
    final int nonce;
    final Integer parentNonce;
    final PerformanceSpanType type;

    public PerformanceSpan(PerformanceSpanType performanceSpanType, int i, PerformanceEventInfo performanceEventInfo, Long l, Long l2, int i2, int i3, boolean z, Integer num) {
        this.type = performanceSpanType;
        this.nonce = i;
        this.info = performanceEventInfo;
        this.begin = l;
        this.end = l2;
        this.beginThreadIdentifier = i2;
        this.endThreadIdentifier = i3;
        this.isMainThread = z;
        this.parentNonce = num;
    }

    public PerformanceSpanType getType() {
        return this.type;
    }

    public int getNonce() {
        return this.nonce;
    }

    public PerformanceEventInfo getInfo() {
        return this.info;
    }

    public Long getBegin() {
        return this.begin;
    }

    public Long getEnd() {
        return this.end;
    }

    public int getBeginThreadIdentifier() {
        return this.beginThreadIdentifier;
    }

    public int getEndThreadIdentifier() {
        return this.endThreadIdentifier;
    }

    public boolean getIsMainThread() {
        return this.isMainThread;
    }

    public Integer getParentNonce() {
        return this.parentNonce;
    }

    public String toString() {
        return "PerformanceSpan{type=" + String.valueOf(this.type) + ",nonce=" + this.nonce + ",info=" + String.valueOf(this.info) + ",begin=" + this.begin + ",end=" + this.end + ",beginThreadIdentifier=" + this.beginThreadIdentifier + ",endThreadIdentifier=" + this.endThreadIdentifier + ",isMainThread=" + this.isMainThread + ",parentNonce=" + this.parentNonce + "}";
    }
}
