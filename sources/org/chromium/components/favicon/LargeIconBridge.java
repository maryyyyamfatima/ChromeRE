package org.chromium.components.favicon;

import J.N;
import android.graphics.Bitmap;
import defpackage.C10235tx1;
import defpackage.C10578ux1;
import defpackage.C9892sx1;
import org.chromium.content_public.browser.BrowserContextHandle;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class LargeIconBridge {
    public final BrowserContextHandle a;
    public long b = N.MwrhffLX();
    public C9892sx1 c;

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes2.dex */
    public interface LargeIconCallback {
        void onLargeIconAvailable(Bitmap bitmap, int i, boolean z, int i2);
    }

    public LargeIconBridge(BrowserContextHandle browserContextHandle) {
        this.a = browserContextHandle;
    }

    public final void a() {
        long j = this.b;
        if (j != 0) {
            N.MthPKzcb(j);
            this.b = 0L;
        }
    }

    public final boolean b(GURL gurl, int i, LargeIconCallback largeIconCallback) {
        C9892sx1 c9892sx1 = this.c;
        if (c9892sx1 != null) {
            C10578ux1 c10578ux1 = (C10578ux1) c9892sx1.get(gurl);
            if (c10578ux1 != null) {
                largeIconCallback.onLargeIconAvailable(c10578ux1.a, c10578ux1.b, c10578ux1.c, c10578ux1.d);
                return true;
            }
            return N.M1pABITV(this.b, this.a, gurl, i, new C10235tx1(this, gurl, largeIconCallback));
        }
        return N.M1pABITV(this.b, this.a, gurl, i, largeIconCallback);
    }
}
