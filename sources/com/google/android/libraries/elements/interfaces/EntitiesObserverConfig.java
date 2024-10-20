package com.google.android.libraries.elements.interfaces;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class EntitiesObserverConfig {
    final Integer observerPriority;
    final boolean suppressNotificationIfEntityValueUnchanged;

    public EntitiesObserverConfig(boolean z, Integer num) {
        this.suppressNotificationIfEntityValueUnchanged = z;
        this.observerPriority = num;
    }

    public boolean getSuppressNotificationIfEntityValueUnchanged() {
        return this.suppressNotificationIfEntityValueUnchanged;
    }

    public Integer getObserverPriority() {
        return this.observerPriority;
    }

    public String toString() {
        return "EntitiesObserverConfig{suppressNotificationIfEntityValueUnchanged=" + this.suppressNotificationIfEntityValueUnchanged + ",observerPriority=" + this.observerPriority + "}";
    }
}
