package org.chromium.content.browser.accessibility.captioning;

import J.N;
import defpackage.XF;
import defpackage.YF;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class CaptioningController {
    public final XF a;
    public long b;

    public CaptioningController(WebContents webContents) {
        if (XF.c == null) {
            XF.c = new XF();
        }
        this.a = XF.c;
        this.b = N.MX95jWaj(this, webContents);
    }

    public final void onDestroy() {
        this.b = 0L;
    }

    public final void onRenderProcessChange() {
        XF xf = this.a;
        YF yf = xf.a;
        if (!(!yf.i.isEmpty())) {
            xf.b();
        }
        yf.b(this);
    }
}
