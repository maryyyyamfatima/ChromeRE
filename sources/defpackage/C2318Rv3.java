package defpackage;

import J.N;
import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.d;
import com.android.chrome.R;
import java.util.List;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tabmodel.TabModel;
import org.chromium.chrome.browser.tasks.tab_management.c;
import org.chromium.content_public.browser.LoadUrlParams;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.modelutil.PropertyModel;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Rv3 */
/* loaded from: classes.dex */
public final class C2318Rv3 implements InterfaceC0679Ff3 {
    public final Context a;
    public final PropertyModel g;
    public final InterfaceC10590uz3 h;
    public final C1798Nv3 i;
    public final C1668Mv3 j;
    public final InterfaceC10912vv3 k;
    public final C0759Fv3 l;
    public final YC3 m;
    public final C5860hC3 n;
    public final InterfaceC0079Ap3 p;
    public final RunnableC0889Gv3 q;
    public final String r;
    public C10242ty3 s;
    public InterfaceC12028zA3 t;
    public C1279Jv3 u;
    public boolean w;
    public String x;
    public C1019Hv3 y;
    public int v = -1;
    public final C2188Qv3 o = new C2188Qv3(this);

    /* JADX WARN: Type inference failed for: r2v1, types: [Gv3] */
    public C2318Rv3(Context context, C0759Fv3 c0759Fv3, PropertyModel propertyModel, InterfaceC10590uz3 interfaceC10590uz3, InterfaceC10912vv3 interfaceC10912vv3, YC3 yc3, C5860hC3 c5860hC3, InterfaceC0079Ap3 interfaceC0079Ap3, ViewOnClickListenerC1069If3 viewOnClickListenerC1069If3, String str) {
        this.a = context;
        this.g = propertyModel;
        this.h = interfaceC10590uz3;
        this.k = interfaceC10912vv3;
        this.l = c0759Fv3;
        this.m = yc3;
        this.n = c5860hC3;
        this.p = interfaceC0079Ap3;
        this.r = str;
        this.j = new C1668Mv3(this, viewOnClickListenerC1069If3);
        C1798Nv3 c1798Nv3 = new C1798Nv3(this, context);
        this.i = c1798Nv3;
        AbstractC11276wz3 abstractC11276wz3 = (AbstractC11276wz3) interfaceC10590uz3;
        abstractC11276wz3.c(c1798Nv3);
        h(context, abstractC11276wz3.o());
        this.q = new Runnable() { // from class: Gv3
            @Override // java.lang.Runnable
            public final void run() {
                C2318Rv3 c2318Rv3 = C2318Rv3.this;
                c2318Rv3.getClass();
                if (!AbstractC5177fD3.c()) {
                    LD2 ld2 = AbstractC9204qw3.w;
                    PropertyModel propertyModel2 = c2318Rv3.g;
                    propertyModel2.k(ld2, false);
                    propertyModel2.k(AbstractC9204qw3.v, false);
                }
                c2318Rv3.e(true);
                FI2.a("TabGridDialog.Exit");
            }
        };
        propertyModel.k(AbstractC9204qw3.h, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5, types: [xv1, Jv3] */
    /* JADX WARN: Type inference failed for: r9v4, types: [Hv3] */
    public final void f(GA3 ga3, C10242ty3 c10242ty3) {
        this.t = ga3;
        this.s = c10242ty3;
        ((AbstractC11276wz3) this.h).c.b(this.j);
        this.y = new Callback() { // from class: Hv3
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                Integer num = (Integer) obj;
                C2318Rv3 c2318Rv3 = C2318Rv3.this;
                c2318Rv3.getClass();
                int intValue = num.intValue();
                LD2 ld2 = AbstractC9204qw3.v;
                int i = 0;
                PropertyModel propertyModel = c2318Rv3.g;
                if (intValue == R.id.ungroup_tab) {
                    if (!AbstractC5177fD3.c()) {
                        propertyModel.k(AbstractC9204qw3.w, false);
                    }
                    propertyModel.k(ld2, false);
                    List c = c2318Rv3.c(c2318Rv3.v);
                    InterfaceC12028zA3 interfaceC12028zA3 = c2318Rv3.t;
                    if (interfaceC12028zA3 != null) {
                        ((GA3) interfaceC12028zA3).c(0, c);
                    }
                } else if (num.intValue() == R.id.share_tab_group) {
                    WindowAndroid m = ((AbstractC11276wz3) c2318Rv3.h).m(c2318Rv3.v).m();
                    String str = (String) propertyModel.i(AbstractC9204qw3.c);
                    StringBuilder sb = new StringBuilder();
                    List c2 = c2318Rv3.c(c2318Rv3.v);
                    while (i < c2.size()) {
                        int i2 = i + 1;
                        sb.append(i2);
                        sb.append(". ");
                        sb.append(((Tab) c2.get(i)).getUrl().i());
                        sb.append("\n");
                        i = i2;
                    }
                    String sb2 = sb.toString();
                    C1928Ov3 c1928Ov3 = new C1928Ov3();
                    String str2 = "";
                    if (!TextUtils.isEmpty("") && !TextUtils.isEmpty("")) {
                        str2 = ((GURL) N.M1WDPiaY("")).i();
                    }
                    ((J63) c2318Rv3.p.get()).c(new C6862k73(m, str, sb2, null, str2, null, null, null, null, null, c1928Ov3, null, null, null), new EP(true, false, false, null, null, true, false, false, null, 0), 6);
                }
                if (AbstractC5177fD3.c() && num.intValue() == R.id.edit_group_name) {
                    propertyModel.k(ld2, true);
                }
            }
        };
        PD2 pd2 = AbstractC9204qw3.a;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: Lv3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C2318Rv3 c2318Rv3 = C2318Rv3.this;
                c2318Rv3.getClass();
                if (!AbstractC5177fD3.c()) {
                    c2318Rv3.g.k(AbstractC9204qw3.w, false);
                }
                c2318Rv3.e(true);
                FI2.a("TabGridDialog.Exit");
            }
        };
        PropertyModel propertyModel = this.g;
        propertyModel.o(pd2, onClickListener);
        propertyModel.o(AbstractC9204qw3.b, new View.OnClickListener() { // from class: Iv3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C2318Rv3 c2318Rv3 = C2318Rv3.this;
                int i = c2318Rv3.v;
                AbstractC11276wz3 abstractC11276wz3 = (AbstractC11276wz3) c2318Rv3.h;
                Tab m = abstractC11276wz3.m(i);
                c2318Rv3.e(false);
                InterfaceC10912vv3 interfaceC10912vv3 = c2318Rv3.k;
                if (m == null) {
                    interfaceC10912vv3.b(abstractC11276wz3.o()).e();
                    return;
                }
                interfaceC10912vv3.b(m.isIncognito()).b(13, (Tab) c2318Rv3.c(m.getId()).get(r1.size() - 1), new LoadUrlParams("chrome-native://newtab/", 0));
                FI2.a("MobileNewTabOpened." + c2318Rv3.r);
                if (m.isIncognito()) {
                    return;
                }
                AbstractC5241fQ2.g("Chrome.StartSurface.OpenNewTabPageCount");
            }
        });
        Context context = this.a;
        if (AbstractC5177fD3.d(context)) {
            ?? r10 = new InterfaceC11596xv1() { // from class: Jv3
                @Override // defpackage.InterfaceC11596xv1
                public final void g(boolean z) {
                    LD2 ld2 = AbstractC9204qw3.u;
                    C2318Rv3 c2318Rv3 = C2318Rv3.this;
                    PropertyModel propertyModel2 = c2318Rv3.g;
                    propertyModel2.k(ld2, z);
                    boolean c = AbstractC5177fD3.c();
                    LD2 ld22 = AbstractC9204qw3.v;
                    if (!c) {
                        propertyModel2.k(ld22, z);
                        propertyModel2.k(AbstractC9204qw3.w, z);
                    } else if (AbstractC5177fD3.c() && !z) {
                        propertyModel2.k(ld22, false);
                    }
                    if (z) {
                        return;
                    }
                    c2318Rv3.g();
                }
            };
            this.u = r10;
            C11939yv1.g.a(r10);
            propertyModel.o(AbstractC9204qw3.s, new C2058Pv3(this));
            propertyModel.o(AbstractC9204qw3.t, new View.OnFocusChangeListener() { // from class: Kv3
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    C2318Rv3 c2318Rv3 = C2318Rv3.this;
                    c2318Rv3.w = z;
                    if (AbstractC5177fD3.c()) {
                        LD2 ld2 = AbstractC9204qw3.w;
                        PropertyModel propertyModel2 = c2318Rv3.g;
                        propertyModel2.k(ld2, z);
                        propertyModel2.k(AbstractC9204qw3.v, z);
                    }
                }
            });
            C10656vA3 c10656vA3 = new C10656vA3(this.t, 2);
            String string = context.getString(R.string.0_resource_name_obfuscated_res_0x7f140b10);
            ((GA3) this.t).a(string, Integer.valueOf(R.plurals.0_resource_name_obfuscated_res_0x7f12000a), c10656vA3, 1, null);
            PD2 pd22 = AbstractC9204qw3.r;
            final C1019Hv3 c1019Hv3 = this.y;
            propertyModel.o(pd22, new View.OnClickListener() { // from class: Sv3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    T8 t8 = new C3228Yv3(view.getContext(), view, Callback.this).d;
                    if (t8 == null) {
                        return;
                    }
                    t8.e();
                }
            });
        }
    }

    public final void e(boolean z) {
        int i;
        LD2 ld2 = AbstractC9204qw3.h;
        PropertyModel propertyModel = this.g;
        if (propertyModel.j(ld2)) {
            PD2 pd2 = AbstractC9204qw3.j;
            if (!z) {
                propertyModel.o(pd2, null);
            } else {
                C5860hC3 c5860hC3 = this.n;
                if (c5860hC3 != null && (i = this.v) != -1) {
                    c cVar = c5860hC3.a.j;
                    d G = cVar.g.G(cVar.a.e.G(i));
                    propertyModel.o(pd2, G == null ? null : G.a);
                }
            }
            InterfaceC12028zA3 interfaceC12028zA3 = this.t;
            if (interfaceC12028zA3 != null) {
                ((GA3) interfaceC12028zA3).b();
            }
            g();
            if (AbstractC5177fD3.c()) {
                propertyModel.k(AbstractC9204qw3.v, false);
            }
            this.l.d(null);
        }
    }

    public final void h(Context context, boolean z) {
        int c;
        if (z) {
            c = context.getColor(R.color.0_resource_name_obfuscated_res_0x7f0705a1);
        } else {
            c = AbstractC9685sM1.c(R.attr.0_resource_name_obfuscated_res_0x7f050152, context, "TabUiThemeProvider");
        }
        Context context2 = this.a;
        ColorStateList b = z ? Y50.b(context2, R.color.0_resource_name_obfuscated_res_0x7f070122) : Y50.b(context2, R.color.0_resource_name_obfuscated_res_0x7f07012b);
        int d = AbstractC5521gD3.d(context, z, false);
        int d2 = AbstractC5521gD3.d(context, z, true);
        int e = AbstractC5521gD3.e(context, z, false);
        int e2 = AbstractC5521gD3.e(context, z, true);
        ND2 nd2 = AbstractC9204qw3.f;
        PropertyModel propertyModel = this.g;
        propertyModel.m(nd2, c);
        propertyModel.o(AbstractC9204qw3.g, b);
        propertyModel.m(AbstractC9204qw3.l, d);
        propertyModel.m(AbstractC9204qw3.m, d2);
        propertyModel.m(AbstractC9204qw3.n, e);
        propertyModel.m(AbstractC9204qw3.o, e2);
    }

    public final void i() {
        List c = c(this.v);
        int size = c.size();
        if (size == 0) {
            e(true);
            return;
        }
        C10242ty3 c10242ty3 = this.s;
        PD2 pd2 = AbstractC9204qw3.x;
        PD2 pd22 = AbstractC9204qw3.c;
        Context context = this.a;
        PropertyModel propertyModel = this.g;
        if (c10242ty3 != null) {
            Tab m = ((AbstractC11276wz3) this.h).m(this.v);
            C10242ty3 c10242ty32 = this.s;
            int d = d(m);
            c10242ty32.getClass();
            String a = AbstractC1414Kw3.a(d);
            if (a != null && c.size() > 1) {
                if (AbstractC5177fD3.c()) {
                    propertyModel.o(pd2, context.getResources().getQuantityString(R.plurals.0_resource_name_obfuscated_res_0x7f120001, c.size(), a, Integer.valueOf(c.size())));
                }
                propertyModel.o(pd22, a);
                return;
            }
        }
        if (AbstractC5177fD3.c()) {
            propertyModel.o(pd2, context.getResources().getQuantityString(R.plurals.0_resource_name_obfuscated_res_0x7f120000, c.size(), Integer.valueOf(c.size())));
        }
        propertyModel.o(pd22, context.getResources().getQuantityString(R.plurals.0_resource_name_obfuscated_res_0x7f12000e, size, Integer.valueOf(size)));
    }

    public static int d(Tab tab) {
        return C1695Nb0.m(tab).r;
    }

    public final List c(int i) {
        return ((AbstractC11276wz3) this.h).c.d().G(i);
    }

    public final void g() {
        if (c(this.v).size() < 2) {
            this.x = null;
        }
        if (this.x == null) {
            return;
        }
        Tab m = ((AbstractC11276wz3) this.h).m(this.v);
        int length = this.x.length();
        PD2 pd2 = AbstractC9204qw3.x;
        PD2 pd22 = AbstractC9204qw3.c;
        Context context = this.a;
        PropertyModel propertyModel = this.g;
        if (length == 0) {
            C10242ty3 c10242ty3 = this.s;
            int d = d(m);
            c10242ty3.getClass();
            C10242ty3.a(d);
            int size = c(this.v).size();
            String quantityString = context.getResources().getQuantityString(R.plurals.0_resource_name_obfuscated_res_0x7f12000e, size, Integer.valueOf(size));
            if (AbstractC5177fD3.c()) {
                propertyModel.o(pd2, context.getResources().getQuantityString(R.plurals.0_resource_name_obfuscated_res_0x7f120000, size, Integer.valueOf(size)));
            }
            propertyModel.o(pd22, quantityString);
            this.s.b(m, quantityString);
            return;
        }
        C10242ty3 c10242ty32 = this.s;
        int d2 = d(m);
        String str = this.x;
        c10242ty32.getClass();
        AbstractC1414Kw3.b(d2, str);
        this.s.b(m, this.x);
        if (AbstractC5177fD3.c()) {
            int size2 = c(this.v).size();
            propertyModel.o(pd2, context.getResources().getQuantityString(R.plurals.0_resource_name_obfuscated_res_0x7f120001, size2, this.x, Integer.valueOf(size2)));
        }
        propertyModel.o(pd22, this.x);
        FI2.a("TabGridDialog.TabGroupNamedInDialog");
        this.x = null;
    }

    @Override // defpackage.InterfaceC0679Ff3
    public final void b(Object obj) {
        int intValue = ((Integer) obj).intValue();
        TabModel k = ((AbstractC11276wz3) this.h).k(intValue);
        if (k != null) {
            k.m(intValue);
        }
    }

    @Override // defpackage.InterfaceC0679Ff3
    public final void a(Object obj) {
        int intValue = ((Integer) obj).intValue();
        TabModel k = ((AbstractC11276wz3) this.h).k(intValue);
        if (k != null) {
            k.C(intValue);
        }
    }
}
