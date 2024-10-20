package defpackage;

import J.N;
import android.content.res.Resources;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.chrome.R;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.page_info.AboutThisSiteView;
import org.chromium.chrome.browser.tab.TabImpl;
import org.chromium.components.page_info.PageInfoController;
import org.chromium.components.page_info.PageInfoRowView;
import org.chromium.content_public.browser.LoadUrlParams;
import org.chromium.content_public.browser.WebContents;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tg2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10135tg2 implements InterfaceC0558Eh2 {
    public static final int k = View.generateViewId();
    public final InterfaceC10141th2 a;
    public final InterfaceC0079Ap3 g;
    public final PageInfoRowView h;
    public final WebContents i;
    public C4410d j;

    @Override // defpackage.InterfaceC0558Eh2
    public final void f() {
    }

    @Override // defpackage.InterfaceC0558Eh2
    public final void g() {
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C10135tg2(defpackage.InterfaceC10141th2 r8, defpackage.InterfaceC0079Ap3 r9, org.chromium.components.page_info.PageInfoRowView r10, defpackage.WO r11, org.chromium.content_public.browser.WebContents r12) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10135tg2.<init>(th2, Ap3, org.chromium.components.page_info.PageInfoRowView, WO, org.chromium.content_public.browser.WebContents):void");
    }

    @Override // defpackage.InterfaceC0558Eh2
    public final String b() {
        return this.h.getContext().getResources().getString(R.string.f79340_resource_name_obfuscated_res_0x7f140744);
    }

    @Override // defpackage.InterfaceC0558Eh2
    public final View d(C0813Gg2 c0813Gg2) {
        LayoutInflater from = LayoutInflater.from(c0813Gg2.getContext());
        C7432ln3 c = C7432ln3.c();
        try {
            View inflate = from.inflate(R.layout.f59270_resource_name_obfuscated_res_0x7f0e01d3, (ViewGroup) c0813Gg2, false);
            c.close();
            final AboutThisSiteView aboutThisSiteView = (AboutThisSiteView) inflate;
            C4410d c4410d = this.j;
            aboutThisSiteView.h = new Runnable() { // from class: sg2
                @Override // java.lang.Runnable
                public final void run() {
                    C10135tg2 c10135tg2 = C10135tg2.this;
                    C4066c c4066c = c10135tg2.j.k;
                    if (c4066c == null) {
                        c4066c = C4066c.p;
                    }
                    C3379a c3379a = c4066c.n;
                    if (c3379a == null) {
                        c3379a = C3379a.m;
                    }
                    c10135tg2.e(29, c3379a.l);
                }
            };
            C4066c c4066c = c4410d.k;
            if (c4066c == null) {
                c4066c = C4066c.p;
            }
            aboutThisSiteView.a.setText(c4066c.m);
            StringBuilder sb = new StringBuilder("<link>");
            C3379a c3379a = c4066c.n;
            if (c3379a == null) {
                c3379a = C3379a.m;
            }
            aboutThisSiteView.g.setText(AbstractC9108qg3.a(aboutThisSiteView.getContext().getResources().getString(R.string.f79330_resource_name_obfuscated_res_0x7f140743, Y5.a(sb, c3379a.k, "</link>")), new C8765pg3(new C11997z52(aboutThisSiteView.getContext(), new Callback() { // from class: e
                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    AboutThisSiteView.this.onClick((View) obj);
                }

                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }
            }), "<link>", "</link>")));
            return aboutThisSiteView;
        } catch (Throwable th) {
            try {
                c.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public final void e(int i, String str) {
        PageInfoController pageInfoController = (PageInfoController) this.a;
        pageInfoController.g(i);
        InterfaceC0079Ap3 interfaceC0079Ap3 = this.g;
        if (interfaceC0079Ap3 != null && interfaceC0079Ap3.get() != null) {
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            C4410d c4410d = this.j;
            if ((c4410d.j & 4) != 0) {
                C3723b c3723b = c4410d.l;
                if (c3723b == null) {
                    c3723b = C3723b.l;
                }
                if (str.equals(c3723b.k)) {
                    buildUpon.appendQueryParameter("ilrm", "minimal");
                }
            }
            ((GC0) interfaceC0079Ap3.get()).a(new GURL(buildUpon.toString()), new GURL(str), c(), false);
            C7739mh2 c7739mh2 = pageInfoController.m;
            if (c7739mh2 != null) {
                c7739mh2.b(true);
                return;
            }
            return;
        }
        new C11598xv3(false).b(2, (TabImpl) N.MMqeq$AW(this.i), new LoadUrlParams(str, 0));
    }

    public final String c() {
        Resources resources = this.h.getContext().getResources();
        C7928nE c7928nE = UN.a;
        return resources.getString(N.M09VlOh_("PageInfoAboutThisSiteMoreInfo") ? R.string.f79320_resource_name_obfuscated_res_0x7f140742 : R.string.f79340_resource_name_obfuscated_res_0x7f140744);
    }

    @Override // defpackage.InterfaceC0558Eh2
    public final void a() {
        boolean z = this.j != null;
        PageInfoController pageInfoController = (PageInfoController) this.a;
        long j = pageInfoController.j;
        if (j != 0) {
            N.M_us4Ps5(j, pageInfoController, z);
        }
    }
}
