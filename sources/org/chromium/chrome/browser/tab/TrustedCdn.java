package org.chromium.chrome.browser.tab;

import J.N;
import defpackage.AbstractC6832k23;
import defpackage.AbstractC8027nX3;
import defpackage.C0931He0;
import defpackage.C7928nE;
import defpackage.CD3;
import defpackage.InterfaceC8371oX3;
import defpackage.UN;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class TrustedCdn extends CD3 {
    public final Tab g;
    public final long h;
    public String i;

    public static String e(Tab tab) {
        Tab tab2;
        WebContents b;
        WindowAndroid Q0;
        TrustedCdn trustedCdn = tab != null ? (TrustedCdn) tab.F().b(TrustedCdn.class) : null;
        if (trustedCdn == null || (b = (tab2 = trustedCdn.g).b()) == null || (Q0 = b.Q0()) == null) {
            return null;
        }
        int i = AbstractC8027nX3.a;
        InterfaceC8371oX3 interfaceC8371oX3 = (InterfaceC8371oX3) InterfaceC8371oX3.e.e(Q0.t);
        if (interfaceC8371oX3 == null) {
            return null;
        }
        C0931He0 c0931He0 = (C0931He0) interfaceC8371oX3;
        C7928nE c7928nE = UN.a;
        if ((!N.M09VlOh_("ShowTrustedPublisherURL") ? false : c0931He0.g.a()) && AbstractC6832k23.a(tab2.b()) != 5) {
            return trustedCdn.i;
        }
        return null;
    }

    public TrustedCdn(Tab tab) {
        super(tab);
        this.g = tab;
        this.h = N.M1Q9lmqc(this);
    }

    public final void setPublisherUrl(String str) {
        this.i = str;
    }

    @Override // defpackage.CD3
    public final void b() {
        N.MM2LHRfv(this.h, this);
    }

    @Override // defpackage.CD3
    public final void c(WebContents webContents) {
        N.MyyZwXPU(this.h, this, webContents);
    }

    @Override // defpackage.CD3
    public final void a(WebContents webContents) {
        N.M003oy2o(this.h, this);
        this.i = null;
    }
}
