package org.chromium.chrome.browser.autofill;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class VirtualCardEnrollmentDelegate {
    public long a;

    public VirtualCardEnrollmentDelegate(long j) {
        this.a = j;
    }

    public static VirtualCardEnrollmentDelegate create(long j) {
        return new VirtualCardEnrollmentDelegate(j);
    }

    public final void onNativeDestroyed() {
        this.a = 0L;
    }
}
