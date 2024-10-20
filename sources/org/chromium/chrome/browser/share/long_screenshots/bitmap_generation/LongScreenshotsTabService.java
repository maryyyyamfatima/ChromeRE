package org.chromium.chrome.browser.share.long_screenshots.bitmap_generation;

import J.N;
import defpackage.C8867py;
import defpackage.InterfaceC9229r12;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class LongScreenshotsTabService implements InterfaceC9229r12 {
    public C8867py a;
    public long b;

    public LongScreenshotsTabService(long j) {
        this.b = j;
    }

    public void onNativeDestroyed() {
        this.b = 0L;
    }

    public void processCaptureTabStatus(int i) {
        C8867py c8867py = this.a;
        if (c8867py != null) {
            c8867py.a(i, 0L);
        }
    }

    public void processPaintPreviewResponse(long j) {
        C8867py c8867py = this.a;
        if (c8867py != null) {
            c8867py.a(1, j);
        } else {
            if (j == 0) {
                return;
            }
            N.Mj0DaLs7(j);
        }
    }

    @Override // defpackage.InterfaceC9229r12
    public final long a() {
        return this.b;
    }
}
