package defpackage;

import J.N;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import com.android.chrome.R;
import org.chromium.chrome.browser.browserservices.ui.trustedwebactivity.DisclosureAcceptanceBroadcastReceiver;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Oo0 */
/* loaded from: classes.dex */
public final class C1890Oo0 implements VD2, InterfaceC6377ij3 {
    public final Context a;
    public final Resources g;
    public final C6314iY3 h;
    public final InterfaceC7205l72 i;
    public String j;

    @Override // defpackage.VD2
    public final void d(WD2 wd2, Object obj) {
        FD2 fd2 = (FD2) obj;
        ND2 nd2 = C6314iY3.c;
        if (fd2 != nd2) {
            return;
        }
        int h = this.h.h(nd2);
        if (h != 0) {
            if (h != 1) {
                return;
            }
            a();
        } else {
            String str = this.j;
            C7549m72 c7549m72 = (C7549m72) this.i;
            c7549m72.a(13, str);
            c7549m72.a(14, this.j);
            this.j = null;
        }
    }

    public C1890Oo0(Context context, Resources resources, InterfaceC7205l72 interfaceC7205l72, C6314iY3 c6314iY3, I5 i5) {
        this.a = context;
        this.g = resources;
        this.i = interfaceC7205l72;
        this.h = c6314iY3;
        c6314iY3.a(this);
        i5.b(this);
    }

    public final void a() {
        int i;
        String str;
        int i2;
        int i3;
        PD2 pd2 = C6314iY3.d;
        C6314iY3 c6314iY3 = this.h;
        this.j = (String) c6314iY3.i(pd2);
        boolean j = c6314iY3.j(C6314iY3.e);
        String str2 = (String) c6314iY3.i(C6314iY3.g);
        String str3 = this.j;
        if (j) {
            i = 2;
            str = "twa_disclosure_initial";
            i2 = 13;
            i3 = 23;
        } else {
            i = -2;
            str = "twa_disclosure_subsequent";
            i2 = 14;
            i3 = 24;
        }
        C7893n72 c7893n72 = new C7893n72(i3, str3, i2);
        Resources resources = this.g;
        String string = resources.getString(R.string.0_resource_name_obfuscated_res_0x7f140b6b);
        String string2 = resources.getString(R.string.0_resource_name_obfuscated_res_0x7f140b6d, N.MeroQv$e(str3));
        int i4 = DisclosureAcceptanceBroadcastReceiver.c;
        Intent intent = new Intent();
        Context context = this.a;
        intent.setClass(context, DisclosureAcceptanceBroadcastReceiver.class);
        intent.putExtra("TWADisclosureResp.tag_extra", str3);
        intent.putExtra("TWADisclosureResp.id_extra", i2);
        intent.putExtra("TWADisclosureResp.package_extra", str2);
        C4705dr2 b = C4705dr2.b(context, 0, intent, 134217728, false);
        PO a = X72.a(str, c7893n72);
        a.l(R.drawable.0_resource_name_obfuscated_res_0x7f0901d9);
        K62 k62 = a.a;
        k62.f(string);
        k62.e(string2);
        a.f(b);
        a.a(0, resources.getString(R.string.0_resource_name_obfuscated_res_0x7f1404e0), b, 15);
        k62.l = false;
        k62.d(false);
        k62.j(null);
        J62 j62 = new J62();
        j62.d = K62.c(string2);
        k62.k(j62);
        a.k(!j);
        k62.k = i;
        W72 d = a.d();
        ((C7549m72) this.i).f(d);
        U72.a.b(j ? 23 : 24, d.a);
        ((AbstractC1501Lo0) c6314iY3.i(C6314iY3.f)).d();
    }

    @Override // defpackage.InterfaceC6377ij3
    public final void g() {
        String str = this.j;
        C7549m72 c7549m72 = (C7549m72) this.i;
        c7549m72.a(13, str);
        c7549m72.a(14, this.j);
        this.j = null;
    }

    @Override // defpackage.InterfaceC6377ij3
    public final void f() {
        if (this.h.h(C6314iY3.c) == 1) {
            a();
        }
    }
}
