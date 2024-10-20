package org.chromium.chrome.browser.customtabs.features;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class TabInteractionRecorder {
    public final long a;

    public TabInteractionRecorder(long j) {
        this.a = j;
    }

    public static TabInteractionRecorder create(long j) {
        if (j == 0) {
            return null;
        }
        return new TabInteractionRecorder(j);
    }
}
