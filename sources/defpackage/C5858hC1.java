package defpackage;

import J.N;
import android.text.TextUtils;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;
import org.chromium.content_public.browser.RenderFrameHost;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hC1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5858hC1 extends BA0 {
    public QO a;
    public Tab g;
    public EP h;
    public long i;
    public String j;
    public InterfaceC3828bI3 k;
    public String l;
    public C6862k73 m;
    public C6862k73 n;
    public int o;

    public C5858hC1(Tab tab, QO qo, EP ep, long j, String str, String str2) {
        this.g = tab;
        this.a = qo;
        this.h = ep;
        this.i = j;
        this.j = str;
        this.l = str2;
        tab.v(this);
        this.o = 0;
    }

    public final void X0(String str) {
        String str2;
        C6862k73 c6862k73;
        C6862k73 c6862k732;
        if (str.isEmpty()) {
            c6862k73 = null;
        } else {
            WindowAndroid m = this.g.m();
            String title = this.g.getTitle();
            String b = AbstractC8264oC1.b(this.j, str);
            String str3 = this.l;
            if (str3.length() <= 35) {
                str2 = this.l;
            } else {
                str2 = this.l.substring(0, 32) + "...";
            }
            String str4 = str2;
            Boolean bool = Boolean.TRUE;
            if (!TextUtils.isEmpty(b) && !TextUtils.isEmpty(b)) {
                b = ((GURL) N.M1WDPiaY(b)).i();
            }
            c6862k73 = new C6862k73(m, title, str3, "\"%s\"\n", b, null, null, null, null, null, null, bool, str4, "\"%s\"\n");
        }
        this.m = c6862k73;
        WindowAndroid m2 = this.g.m();
        String title2 = this.g.getTitle();
        String str5 = this.l;
        Boolean valueOf = Boolean.valueOf(!str.isEmpty());
        String str6 = "";
        if (!TextUtils.isEmpty("") && !TextUtils.isEmpty("")) {
            str6 = ((GURL) N.M1WDPiaY("")).i();
        }
        this.n = new C6862k73(m2, title2, str5, null, str6, null, null, null, null, null, null, valueOf, null, null);
        QO qo = this.a;
        if (str.isEmpty() || (c6862k732 = this.m) == null) {
            c6862k732 = this.n;
        }
        ((O73) qo).m(c6862k732, this.h, this.i);
    }

    @Override // defpackage.BA0
    public final void A0(int i, Tab tab) {
        if (this.h.g) {
            W0(2);
        } else {
            V0(6);
        }
    }

    @Override // defpackage.BA0
    public final void R0(GURL gurl) {
        if (this.h.g) {
            W0(3);
        } else {
            V0(7);
        }
    }

    @Override // defpackage.BA0
    public final void q0(TabImpl tabImpl) {
        if (this.h.g) {
            W0(4);
        } else {
            V0(8);
        }
    }

    public final void Y0() {
        RenderFrameHost renderFrameHost = this.h.i;
        C4171cI3 c4171cI3 = AbstractC11382xI3.a;
        if (renderFrameHost != null && renderFrameHost.a()) {
            this.k = (InterfaceC3828bI3) this.h.i.e(c4171cI3);
        } else {
            if (this.g.b() == null || this.g.b().O() == null) {
                return;
            }
            this.k = (InterfaceC3828bI3) this.g.b().O().e(c4171cI3);
        }
    }

    public final void V0(int i) {
        InterfaceC3828bI3 interfaceC3828bI3;
        N.MsDwTpRd(this.g.b(), i);
        if (i != 6 && i != 7 && i != 8) {
            X0("");
        }
        if (this.o == 1) {
            this.o = 3;
            if (!this.h.g && (interfaceC3828bI3 = this.k) != null) {
                C5202fI3 c5202fI3 = new C5202fI3(0);
                C6068hp1 c6068hp1 = ((C4515dI3) interfaceC3828bI3).a;
                c6068hp1.g.A(c5202fI3.c(c6068hp1.a, new C5953hV1(0)));
            }
        }
        D30 d30 = this.k;
        if (d30 != null) {
            ((AbstractC6411ip1) d30).close();
        }
        this.g.w(this);
    }

    public final void W0(int i) {
        InterfaceC3828bI3 interfaceC3828bI3;
        N.MwdUorUl(i);
        if (i != 2 && i != 3 && i != 4) {
            X0("");
        }
        if (this.o == 1) {
            this.o = 3;
            if (!this.h.g && (interfaceC3828bI3 = this.k) != null) {
                C5202fI3 c5202fI3 = new C5202fI3(0);
                C6068hp1 c6068hp1 = ((C4515dI3) interfaceC3828bI3).a;
                c6068hp1.g.A(c5202fI3.c(c6068hp1.a, new C5953hV1(0)));
            }
        }
        D30 d30 = this.k;
        if (d30 != null) {
            ((AbstractC6411ip1) d30).close();
        }
        this.g.w(this);
    }
}
