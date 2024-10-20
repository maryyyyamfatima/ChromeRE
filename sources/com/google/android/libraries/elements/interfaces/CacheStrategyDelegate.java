package com.google.android.libraries.elements.interfaces;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class CacheStrategyDelegate {
    public abstract void onCacheFull(long j, long j2);

    public abstract void onCacheInvalid(String str);

    public abstract void onCachePurged(CachePurgeReason cachePurgeReason);

    public abstract void onErrorReadingResource(String str);
}
