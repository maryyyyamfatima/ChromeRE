package org.chromium.chrome.browser.paint_preview.services;

import J.N;
import defpackage.C10021tL;
import defpackage.C6600jN2;
import defpackage.C7569mB;
import defpackage.InterfaceC9229r12;
import defpackage.RunnableC6370ii2;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.content.browser.webcontents.WebContentsImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class PaintPreviewTabService implements InterfaceC9229r12 {
    public static final C7569mB d = new C7569mB("PaintPreviewShowOnStartup", "allow_srp", true);
    public RunnableC6370ii2 a;
    public long b;
    public long c;

    public PaintPreviewTabService(long j, long j2) {
        this.c = j;
        this.b = j2;
    }

    public final void onNativeDestroyed() {
        this.c = 0L;
        this.b = 0L;
    }

    @Override // defpackage.InterfaceC9229r12
    public final long a() {
        return this.b;
    }

    public final void b(Callback callback, Tab tab) {
        if (this.c == 0) {
            callback.onResult(Boolean.FALSE);
            return;
        }
        boolean c = C10021tL.f().c();
        C6600jN2 c6600jN2 = ((WebContentsImpl) tab.b()).m;
        N.MV$XyJvN(this.c, tab.getId(), tab.b(), c, c6600jN2.g, (int) Math.floor(c6600jN2.a(c6600jN2.a)), c6600jN2.c(), callback);
    }
}
