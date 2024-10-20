package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import com.android.chrome.R;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.customtabs.features.toolbar.CustomTabToolbar;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TrustedCdn;
import org.chromium.ui.base.Clipboard;
import org.chromium.ui.base.DeviceFormFactor;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: we0 */
/* loaded from: classes.dex */
public final class ViewOnLongClickListenerC11150we0 implements SF1, InterfaceC3403a34, ZF1, View.OnLongClickListener {
    public InterfaceC3472aG1 g;
    public InterfaceC0079Ap3 h;
    public InterfaceC0079Ap3 i;
    public C5809h34 j;
    public TextView k;
    public TextView l;
    public View m;
    public View n;
    public ImageButton o;
    public C0021Ae0 p;
    public boolean s;
    public boolean t;
    public final /* synthetic */ CustomTabToolbar v;
    public int a = 0;
    public final RunnableC10807ve0 q = new RunnableC10807ve0(this);
    public final Runnable[] r = new Runnable[3];
    public C4496dF u = new C4496dF();

    @Override // defpackage.SF1
    public final /* synthetic */ Vf4 b() {
        return null;
    }

    @Override // defpackage.ZF1
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.ZF1
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.SF1
    public final void h() {
    }

    @Override // defpackage.ZF1
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.SF1
    public final InterfaceC5991hc2 j() {
        return null;
    }

    @Override // defpackage.SF1
    public final /* synthetic */ void k() {
    }

    @Override // defpackage.SF1
    public final void m() {
    }

    @Override // defpackage.InterfaceC3403a34
    public final void o(boolean z) {
    }

    @Override // defpackage.SF1
    public final /* synthetic */ void r() {
    }

    @Override // defpackage.SF1
    public final void s() {
    }

    @Override // defpackage.InterfaceC3403a34
    public final void y() {
    }

    public final void w() {
        CustomTabToolbar customTabToolbar = this.v;
        customTabToolbar.f0(customTabToolbar.x);
        int childCount = customTabToolbar.w.getChildCount();
        for (int i = 0; i < childCount; i++) {
            customTabToolbar.f0((ImageButton) customTabToolbar.w.getChildAt(i));
        }
        customTabToolbar.f0(customTabToolbar.F.o);
        C5809h34 c5809h34 = this.j;
        int i2 = customTabToolbar.A;
        C7183l34 c7183l34 = c5809h34.g;
        ND2 nd2 = AbstractC8215o34.l;
        PropertyModel propertyModel = c7183l34.a;
        int h = propertyModel.h(nd2);
        propertyModel.m(nd2, i2);
        if (h != i2) {
            B();
        }
        this.l.setTextColor(AbstractC5647gc2.c(customTabToolbar.getContext(), customTabToolbar.A));
    }

    public ViewOnLongClickListenerC11150we0(CustomTabToolbar customTabToolbar) {
        this.v = customTabToolbar;
    }

    public final void u(boolean z) {
        int i = this.a;
        if (i == 0) {
            return;
        }
        CustomTabToolbar customTabToolbar = this.v;
        if (z && i == 2) {
            this.a = 1;
            this.p.d = false;
            this.k.setVisibility(8);
            this.l.setVisibility(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.l.getLayoutParams();
            layoutParams.bottomMargin = 0;
            this.l.setLayoutParams(layoutParams);
            this.l.setTextSize(0, customTabToolbar.getResources().getDimension(R.dimen.0_resource_name_obfuscated_res_0x7f0803c9));
            return;
        }
        if (z || i != 1) {
            return;
        }
        this.a = 2;
        this.l.setVisibility(0);
        this.k.setTextSize(0, customTabToolbar.getResources().getDimension(R.dimen.0_resource_name_obfuscated_res_0x7f08016d));
        this.k.setVisibility(0);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.l.getLayoutParams();
        layoutParams2.bottomMargin = customTabToolbar.getResources().getDimensionPixelSize(R.dimen.0_resource_name_obfuscated_res_0x7f08016c);
        this.l.setLayoutParams(layoutParams2);
        this.l.setTextSize(0, customTabToolbar.getResources().getDimension(R.dimen.0_resource_name_obfuscated_res_0x7f080169));
        customTabToolbar.G.y();
        customTabToolbar.G.w();
    }

    @Override // defpackage.InterfaceC3403a34
    public final View f() {
        Object obj = CustomTabToolbar.f11522J;
        Tab a = this.v.j.a();
        if (a == null) {
            return null;
        }
        return a.a();
    }

    @Override // defpackage.InterfaceC3403a34
    public final boolean g() {
        Object obj = CustomTabToolbar.f11522J;
        return !this.v.o();
    }

    @Override // defpackage.ZF1
    public final void v() {
        w();
        z();
        x();
    }

    @Override // defpackage.ZF1
    public final void a() {
        z();
    }

    @Override // defpackage.ZF1
    public final void n() {
        A();
    }

    @Override // defpackage.ZF1
    public final void t() {
        B();
    }

    @Override // defpackage.SF1
    public final void q() {
        CustomTabToolbar customTabToolbar = this.v;
        CustomTabToolbar.c0(customTabToolbar, customTabToolbar.getBackground().getColor());
        z();
        x();
        B();
    }

    public final void x() {
        Object obj = CustomTabToolbar.f11522J;
        CustomTabToolbar customTabToolbar = this.v;
        QQ3 qq3 = customTabToolbar.l;
        if (qq3 == null) {
            return;
        }
        Context context = customTabToolbar.getContext();
        int color = customTabToolbar.getBackground().getColor();
        if (AbstractC3494aK3.e(color, context, false)) {
            qq3.setBackgroundColor(context.getColor(R.color.0_resource_name_obfuscated_res_0x7f070827));
            qq3.f(AbstractC10957w33.b(context));
        } else {
            qq3.g(color, false);
        }
    }

    public final void z() {
        if (this.a == 1) {
            return;
        }
        if (this.s) {
            this.r[2] = new Runnable() { // from class: oe0
                @Override // java.lang.Runnable
                public final void run() {
                    ViewOnLongClickListenerC11150we0.this.z();
                }
            };
            return;
        }
        InterfaceC3472aG1 interfaceC3472aG1 = this.g;
        CustomTabToolbar customTabToolbar = this.v;
        int f = interfaceC3472aG1.f(DeviceFormFactor.a(customTabToolbar.getContext()));
        if (f != 0) {
            this.o.setImageTintList(Y50.b(customTabToolbar.getContext(), this.g.m()));
        }
        this.p.a(f);
        this.o.setContentDescription(customTabToolbar.getContext().getString(this.g.n()));
    }

    public final void A() {
        if (this.s) {
            this.r[0] = new Runnable() { // from class: qe0
                @Override // java.lang.Runnable
                public final void run() {
                    ViewOnLongClickListenerC11150we0.this.A();
                }
            };
            return;
        }
        String title = this.g.getTitle();
        if (!this.g.o() || TextUtils.isEmpty(title)) {
            this.l.setText("");
            return;
        }
        int i = this.a;
        if ((i == 2 || i == 1) && !title.equals(this.g.h()) && !title.equals("about:blank")) {
            PostTask.b(AbstractC5103f04.a, this.q, this.t ? 0L : 800L);
        }
        this.l.setText(title);
    }

    public final void B() {
        int length;
        int i;
        CharSequence charSequence;
        if (this.s) {
            this.r[1] = new Runnable() { // from class: pe0
                @Override // java.lang.Runnable
                public final void run() {
                    ViewOnLongClickListenerC11150we0.this.B();
                }
            };
            return;
        }
        Object obj = CustomTabToolbar.f11522J;
        CustomTabToolbar customTabToolbar = this.v;
        Tab a = customTabToolbar.j.a();
        if (a == null) {
            this.j.f(C6153i34.h, 0, 0);
            return;
        }
        String e = TrustedCdn.e(a);
        String trim = e != null ? e : a.getUrl().i().trim();
        if (this.a == 1 && !TextUtils.isEmpty(this.g.getTitle())) {
            A();
        }
        if ((AbstractC5107f12.b(trim, null, customTabToolbar.j.a().isIncognito()) != 0) || "about:blank".equals(trim)) {
            this.j.f(C6153i34.h, 0, 0);
            return;
        }
        if (e != null) {
            String string = customTabToolbar.getContext().getString(R.string.0_resource_name_obfuscated_res_0x7f1403de, T34.a(e));
            Object obj2 = CustomTabToolbar.f11522J;
            SpannableString a2 = AbstractC9108qg3.a(string, new C8765pg3(obj2, "<pub>", "</pub>"), new C8765pg3(new ForegroundColorSpan(customTabToolbar.B.getDefaultColor()), "<bg>", "</bg>"));
            i = a2.getSpanStart(obj2);
            length = a2.getSpanEnd(obj2);
            a2.removeSpan(obj2);
            charSequence = a2;
        } else {
            C6153i34 s = this.g.s();
            CharSequence subSequence = s.b.subSequence(s.d, s.e);
            length = subSequence.length();
            i = 0;
            charSequence = subSequence;
        }
        this.j.f(C6153i34.a(trim, charSequence, i, length, trim), 1, 0);
    }

    @Override // defpackage.SF1
    public final void l(boolean z) {
        if (z) {
            this.a = 2;
            C0021Ae0 c0021Ae0 = this.p;
            TextView textView = this.k;
            c0021Ae0.c = this.l;
            c0021Ae0.b = textView;
            textView.setPivotX(0.0f);
            c0021Ae0.b.setPivotY(0.0f);
            c0021Ae0.d = true;
        } else {
            this.a = 0;
            this.l.setVisibility(8);
        }
        this.v.G.x();
    }

    @Override // defpackage.SF1
    public final View d() {
        return this.v;
    }

    @Override // defpackage.SF1
    public final View p() {
        return this.o;
    }

    @Override // defpackage.SF1
    public final void destroy() {
        C4496dF c4496dF = this.u;
        if (c4496dF != null) {
            c4496dF.a();
            this.u = null;
        }
        InterfaceC3472aG1 interfaceC3472aG1 = this.g;
        if (interfaceC3472aG1 != null) {
            interfaceC3472aG1.r(this);
            this.g = null;
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (view != this.n) {
            return false;
        }
        Object obj = CustomTabToolbar.f11522J;
        Tab a = this.v.j.a();
        if (a == null) {
            return false;
        }
        Clipboard.getInstance().b(a.z());
        return true;
    }
}
