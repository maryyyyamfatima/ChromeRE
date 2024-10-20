package defpackage;

import android.content.res.Resources;
import android.view.View;
import com.android.chrome.R;
import org.chromium.chrome.browser.omnibox.status.StatusView;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Zk3 */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC3303Zk3 implements View.OnClickListener, ZF1 {
    public final StatusView a;
    public final C1359Kl3 g;
    public final boolean h;
    public final InterfaceC3173Yk3 i;
    public InterfaceC3472aG1 j;
    public boolean k;

    @Override // defpackage.ZF1
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.ZF1
    public final /* synthetic */ void n() {
    }

    @Override // defpackage.ZF1
    public final /* synthetic */ void t() {
    }

    @Override // defpackage.ZF1
    public final /* synthetic */ void v() {
    }

    public ViewOnClickListenerC3303Zk3(boolean z, StatusView statusView, InterfaceC3472aG1 interfaceC3472aG1, C0538Ed2 c0538Ed2, QZ2 qz2, InterfaceC0079Ap3 interfaceC0079Ap3, C10285u6 c10285u6, InterfaceC3173Yk3 interfaceC3173Yk3, C8385oa2 c8385oa2, C3799bD c3799bD) {
        this.h = z;
        this.a = statusView;
        this.j = interfaceC3472aG1;
        this.i = interfaceC3173Yk3;
        PropertyModel propertyModel = new PropertyModel(AbstractC1878Ol3.o);
        UD2.a(propertyModel, statusView, new C3308Zl3());
        C1359Kl3 c1359Kl3 = new C1359Kl3(propertyModel, statusView.getResources(), statusView.getContext(), z, interfaceC3472aG1, AbstractC0738Fr2.a, qz2, c0538Ed2, interfaceC0079Ap3, new C9798sh2(V60.a(statusView.getContext()), statusView.i), c10285u6, c8385oa2);
        this.g = c1359Kl3;
        Resources resources = statusView.getResources();
        c1359Kl3.r = (resources.getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0803c0) * 2) + resources.getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0803bf) + resources.getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0803c1);
        c1359Kl3.s = resources.getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0803c5) + resources.getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0803c6);
        c1359Kl3.t = resources.getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f0803c2);
        b();
        d();
        this.j.l(this);
        statusView.z = c3799bD;
    }

    @Override // defpackage.ZF1
    public final void e() {
        this.g.e();
    }

    @Override // defpackage.ZF1
    public final void a() {
        b();
        d();
    }

    public final void b() {
        int f = this.j.f(this.h);
        C1359Kl3 c1359Kl3 = this.g;
        c1359Kl3.w = f;
        c1359Kl3.d(0);
        c1359Kl3.x = this.j.m();
        c1359Kl3.d(0);
        c1359Kl3.y = this.j.n();
        c1359Kl3.d(0);
    }

    public final void d() {
        int q = this.j.q();
        C1359Kl3 c1359Kl3 = this.g;
        if (c1359Kl3.u != q) {
            c1359Kl3.u = q;
            c1359Kl3.f();
            c1359Kl3.d(0);
        }
        boolean t = this.j.t();
        if (c1359Kl3.n != t) {
            c1359Kl3.n = t;
            c1359Kl3.f();
            c1359Kl3.c();
        }
        boolean k = this.j.k();
        if (c1359Kl3.m != k) {
            c1359Kl3.m = k;
            c1359Kl3.f();
            c1359Kl3.c();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        XO a;
        if (this.k || !this.j.o() || this.j.a().b() == null || this.j.g()) {
            return;
        }
        Tab a2 = this.j.a();
        C1359Kl3 c1359Kl3 = this.g;
        int i = c1359Kl3.G;
        if (i != -1) {
            a = new XO(i, false);
        } else if (c1359Kl3.L) {
            a = new XO(-1, true);
        } else {
            a = XO.a();
        }
        this.i.a(a2, a);
        int i2 = c1359Kl3.G;
        C8083nh2 c8083nh2 = c1359Kl3.I;
        if (i2 != -1) {
            c8083nh2.a(1);
        } else if (c1359Kl3.L) {
            c8083nh2.a(5);
        }
        c1359Kl3.a();
        c1359Kl3.d(0);
    }

    @Override // defpackage.ZF1
    public final void i() {
        C1359Kl3 c1359Kl3 = this.g;
        boolean z = c1359Kl3.C.isIncognito() && !c1359Kl3.p;
        LD2 ld2 = AbstractC1878Ol3.b;
        PropertyModel propertyModel = c1359Kl3.a;
        propertyModel.k(ld2, z);
        propertyModel.o(AbstractC1878Ol3.j, null);
        propertyModel.l(AbstractC1878Ol3.h, 1.0f);
        propertyModel.k(AbstractC1878Ol3.d, false);
    }
}
