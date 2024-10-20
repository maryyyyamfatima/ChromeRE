package defpackage;

import J.N;
import android.app.Activity;
import android.view.View;
import com.android.chrome.R;
import org.chromium.chrome.browser.history.BrowsingHistoryBridge;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.page_info.PageInfoController;
import org.chromium.components.page_info.PageInfoRowView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rh2 */
/* loaded from: classes.dex */
public final class C9455rh2 implements InterfaceC0558Eh2, N81 {
    public static final int p = View.generateViewId();
    public static final KH q = new KH();
    public final InterfaceC10141th2 a;
    public final PageInfoRowView g;
    public final AbstractC2242Rg2 h;
    public final InterfaceC0079Ap3 i;
    public final String j;
    public final String k;
    public boolean l;
    public BrowsingHistoryBridge m;
    public O81 n;
    public long o;

    @Override // defpackage.InterfaceC0558Eh2
    public final void a() {
    }

    @Override // defpackage.N81
    public final void c(boolean z) {
    }

    @Override // defpackage.N81
    public final void e() {
    }

    @Override // defpackage.N81
    public final void j() {
    }

    @Override // defpackage.N81
    public final void m() {
    }

    public C9455rh2(InterfaceC10141th2 interfaceC10141th2, PageInfoRowView pageInfoRowView, WO wo, UO uo) {
        this.a = interfaceC10141th2;
        this.g = pageInfoRowView;
        this.h = wo;
        this.j = pageInfoRowView.getContext().getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f14075e);
        String d = ((PageInfoController) interfaceC10141th2).n.d();
        this.k = d;
        this.i = uo;
        BrowsingHistoryBridge browsingHistoryBridge = new BrowsingHistoryBridge(Profile.d());
        this.m = browsingHistoryBridge;
        N.MN48Z3Io(browsingHistoryBridge.b, browsingHistoryBridge, d, new C8427oh2(this));
    }

    @Override // defpackage.InterfaceC0558Eh2
    public final String b() {
        return this.j;
    }

    @Override // defpackage.InterfaceC0558Eh2
    public final View d(C0813Gg2 c0813Gg2) {
        Activity activity = (Activity) ((PageInfoController) this.a).g.k().get();
        String str = this.k;
        O81 o81 = new O81(activity, this, false, false, true, false, str, null, this.i, new C8385oa2(), new BV0() { // from class: ph2
            @Override // defpackage.BV0
            public final Object apply(Object obj) {
                int i = C9455rh2.p;
                return null;
            }
        }, new BrowsingHistoryBridge(Profile.d()));
        this.n = o81;
        C4117c81 c4117c81 = o81.n;
        c4117c81.F = str;
        c4117c81.a0();
        return this.n.o;
    }

    @Override // defpackage.InterfaceC0558Eh2
    public final void g() {
        O81 o81 = this.n;
        if (o81 != null) {
            o81.e();
            this.n = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h() {
        /*
            r11 = this;
            zh2 r0 = new zh2
            r0.<init>()
            long r1 = r11.o
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 0
            org.chromium.components.page_info.PageInfoRowView r5 = r11.g
            r6 = 1
            if (r1 != 0) goto L12
            goto L42
        L12:
            KH r1 = defpackage.C9455rh2.q
            r1.getClass()
            long r7 = java.lang.System.currentTimeMillis()
            java.util.Calendar r1 = defpackage.WE.a(r7)
            java.util.Date r1 = r1.getTime()
            long r7 = r1.getTime()
            long r9 = r11.o
            java.util.Calendar r1 = defpackage.WE.a(r9)
            java.util.Date r1 = r1.getTime()
            long r9 = r1.getTime()
            long r7 = r7 - r9
            android.content.Context r1 = r5.getContext()
            android.content.res.Resources r1 = r1.getResources()
            int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r3 >= 0) goto L44
        L42:
            r1 = 0
            goto L8e
        L44:
            if (r3 != 0) goto L4e
            r3 = 2132019036(0x7f14075c, float:1.9676396E38)
            java.lang.String r1 = r1.getString(r3)
            goto L8e
        L4e:
            r3 = 86400000(0x5265c00, double:4.2687272E-316)
            int r9 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r9 != 0) goto L5d
            r3 = 2132019037(0x7f14075d, float:1.9676398E38)
            java.lang.String r1 = r1.getString(r3)
            goto L8e
        L5d:
            if (r9 <= 0) goto L78
            r9 = 604800000(0x240c8400, double:2.988109026E-315)
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r9 > 0) goto L78
            java.lang.Object[] r9 = new java.lang.Object[r6]
            long r7 = r7 / r3
            int r3 = (int) r7
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r9[r2] = r3
            r3 = 2132019035(0x7f14075b, float:1.9676394E38)
            java.lang.String r1 = r1.getString(r3, r9)
            goto L8e
        L78:
            java.lang.Object[] r3 = new java.lang.Object[r6]
            java.util.Date r4 = new java.util.Date
            long r7 = r11.o
            r4.<init>(r7)
            java.lang.StringBuilder r4 = defpackage.AbstractC11550xn3.a(r4)
            r3[r2] = r4
            r4 = 2132019034(0x7f14075a, float:1.9676391E38)
            java.lang.String r1 = r1.getString(r4, r3)
        L8e:
            r0.d = r1
            if (r1 == 0) goto La3
            Rg2 r1 = r11.h
            boolean r3 = r1.c
            if (r3 == 0) goto La3
            WO r1 = (defpackage.WO) r1
            org.chromium.chrome.browser.profiles.Profile r1 = r1.k
            boolean r1 = r1.i()
            if (r1 != 0) goto La3
            r2 = r6
        La3:
            r0.a = r2
            r1 = 2131296828(0x7f09023c, float:1.8211584E38)
            r0.b = r1
            r0.g = r6
            qh2 r1 = new qh2
            r1.<init>()
            r0.f = r1
            r5.a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9455rh2.h():void");
    }

    @Override // defpackage.InterfaceC0558Eh2
    public final void f() {
        if (this.l) {
            BrowsingHistoryBridge browsingHistoryBridge = new BrowsingHistoryBridge(Profile.d());
            this.m = browsingHistoryBridge;
            N.MN48Z3Io(browsingHistoryBridge.b, browsingHistoryBridge, this.k, new C8427oh2(this));
        }
        this.l = false;
    }

    @Override // defpackage.N81
    public final void n(Q81 q81) {
        ((PageInfoController) this.a).g(21);
    }

    @Override // defpackage.N81
    public final void k(Q81 q81) {
        PageInfoController pageInfoController = (PageInfoController) this.a;
        pageInfoController.g(20);
        this.l = true;
        if (this.n.n.i == 0) {
            this.o = 0L;
            h();
            pageInfoController.d();
        }
    }
}
