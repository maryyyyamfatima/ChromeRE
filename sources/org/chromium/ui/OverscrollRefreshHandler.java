package org.chromium.ui;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public interface OverscrollRefreshHandler {
    void pull(float f, float f2);

    void release(boolean z);

    void reset();

    boolean start(int i, float f, float f2, boolean z);
}
