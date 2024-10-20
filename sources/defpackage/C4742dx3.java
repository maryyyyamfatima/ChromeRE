package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.List;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.flags.CachedFeatureFlags;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tabmodel.TabModel;
import org.chromium.content_public.browser.LoadUrlParams;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dx3 */
/* loaded from: classes.dex */
public final class C4742dx3 implements InterfaceC0679Ff3, InterfaceC7458ls {
    public final C2193Qw3 A;
    public boolean B;
    public boolean C;
    public boolean D;
    public final Context a;
    public final PropertyModel g;
    public final C2973Ww3 h;
    public final InterfaceC4399cx3 i;
    public final InterfaceC10590uz3 j;
    public final InterfaceC10912vv3 k;
    public final IB l;
    public final C10501uk1 m;
    public final C0759Fv3 n;
    public final C2323Rw3 o;
    public final C3363Zw3 p;
    public final I5 q;
    public final ViewOnClickListenerC1069If3 r;
    public final C12188zf3 s;
    public final InterfaceC7697ma2 t;
    public C4496dF u = new C4496dF();
    public final AN0 v;
    public InterfaceC1422Ky1 w;
    public final C3712ax3 x;
    public final C4056bx3 y;
    public AbstractC1429Kz3 z;

    @Override // defpackage.InterfaceC0679Ff3
    public final /* synthetic */ void a(Object obj) {
    }

    @Override // defpackage.InterfaceC0679Ff3
    public final void b(Object obj) {
        O83.a.q(1, "Chrome.ConditionalTabStrip.FeatureStatus");
        e(((AbstractC11276wz3) this.j).i());
        FI2.a("TabStrip.UndoDismiss");
    }

    public static void c(C4742dx3 c4742dx3, int i) {
        c4742dx3.getClass();
        if (R20.a() == 2 && AbstractC5177fD3.a()) {
            O83.a.q(1, "Chrome.ConditionalTabStrip.FeatureStatus");
            c4742dx3.D = true;
            EI2.h(i, 3, "TabStrip.ReasonToShow");
        }
    }

    public C4742dx3(Activity activity, IB ib, C1933Ow3 c1933Ow3, PropertyModel propertyModel, InterfaceC10590uz3 interfaceC10590uz3, InterfaceC10912vv3 interfaceC10912vv3, InterfaceC0408Dd2 interfaceC0408Dd2, C10501uk1 c10501uk1, C0759Fv3 c0759Fv3, I5 i5, ViewOnClickListenerC1069If3 viewOnClickListenerC1069If3, InterfaceC7697ma2 interfaceC7697ma2) {
        View.OnClickListener onClickListener;
        String string;
        String string2;
        this.a = activity;
        this.i = c1933Ow3;
        this.g = propertyModel;
        this.j = interfaceC10590uz3;
        this.k = interfaceC10912vv3;
        this.l = ib;
        this.m = c10501uk1;
        this.n = c0759Fv3;
        this.q = i5;
        this.r = viewOnClickListenerC1069If3;
        this.t = interfaceC7697ma2;
        C12188zf3 a = C12188zf3.a(activity.getString(R.string.0_resource_name_obfuscated_res_0x7f140b76), this, 0, 35);
        a.d = activity.getString(R.string.0_resource_name_obfuscated_res_0x7f140b6e);
        a.e = null;
        a.j = 5000;
        this.s = a;
        if (interfaceC0408Dd2.get() != null && ((C9897sy1) ((InterfaceC1422Ky1) interfaceC0408Dd2.get())).G(2)) {
            this.C = true;
        }
        C2973Ww3 c2973Ww3 = new C2973Ww3(this);
        this.h = c2973Ww3;
        this.v = new AN0(new C3103Xw3(this));
        this.z = new C3233Yw3(this, interfaceC10590uz3);
        C3363Zw3 c3363Zw3 = new C3363Zw3(this);
        this.p = c3363Zw3;
        if (AbstractC5177fD3.e(activity)) {
            C3712ax3 c3712ax3 = new C3712ax3(this);
            this.x = c3712ax3;
            AbstractC11276wz3 abstractC11276wz3 = (AbstractC11276wz3) interfaceC10590uz3;
            ((C1024Hw3) abstractC11276wz3.c.e(false)).Q(c3712ax3);
            ((C1024Hw3) abstractC11276wz3.c.e(true)).Q(c3712ax3);
        }
        if (AbstractC5177fD3.a()) {
            C4056bx3 c4056bx3 = new C4056bx3(this);
            this.y = c4056bx3;
            i5.b(c4056bx3);
        }
        if (CachedFeatureFlags.b(AbstractC6265iP.d.b("TabGroupsContinuationAndroid:enable_launch_bug_fix"), false)) {
            C2193Qw3 c2193Qw3 = new Callback() { // from class: Qw3
                public /* synthetic */ C2193Qw3() {
                }

                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    int i;
                    Boolean bool = (Boolean) obj;
                    C4742dx3 c4742dx3 = C4742dx3.this;
                    if (bool != null) {
                        c4742dx3.getClass();
                        if (bool.booleanValue()) {
                            i = -1;
                            c4742dx3.e(i);
                        }
                    }
                    i = ((AbstractC11276wz3) c4742dx3.j).i();
                    c4742dx3.e(i);
                }
            };
            this.A = c2193Qw3;
            ((C8385oa2) interfaceC7697ma2).m(c2193Qw3);
        }
        C2323Rw3 c2323Rw3 = new InterfaceC10158tk1() { // from class: Rw3
            public /* synthetic */ C2323Rw3() {
            }

            @Override // defpackage.InterfaceC10158tk1
            public final void b(boolean z) {
                C4742dx3.this.g.k(AbstractC5086ex3.d, z);
            }
        };
        this.o = c2323Rw3;
        AbstractC11276wz3 abstractC11276wz32 = (AbstractC11276wz3) interfaceC10590uz3;
        abstractC11276wz32.c.b(c2973Ww3);
        abstractC11276wz32.c(c3363Zw3);
        interfaceC0408Dd2.j(this.u.b(new Callback() { // from class: Sw3
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                InterfaceC1422Ky1 interfaceC1422Ky1 = (InterfaceC1422Ky1) obj;
                C4742dx3 c4742dx3 = C4742dx3.this;
                c4742dx3.w = interfaceC1422Ky1;
                ((C9897sy1) interfaceC1422Ky1).e(c4742dx3.v);
            }
        }));
        c10501uk1.a(c2323Rw3);
        if (AbstractC5177fD3.e(activity)) {
            onClickListener = new View.OnClickListener() { // from class: Tw3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C4742dx3 c4742dx3 = C4742dx3.this;
                    Tab h = ((AbstractC11276wz3) c4742dx3.j).h();
                    if (h == null) {
                        return;
                    }
                    List d = c4742dx3.d(h.getId());
                    C0759Fv3 c0759Fv32 = ((C1933Ow3) c4742dx3.i).z;
                    if (c0759Fv32 != null) {
                        c0759Fv32.d(d);
                    }
                    FI2.a("TabGroup.ExpandedFromStrip.TabGridDialog");
                }
            };
        } else {
            onClickListener = new View.OnClickListener() { // from class: Uw3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C4742dx3 c4742dx3 = C4742dx3.this;
                    c4742dx3.e(-1);
                    Q83 q83 = O83.a;
                    q83.q(0, "Chrome.ConditionalTabStrip.FeatureStatus");
                    FI2.a("TabStrip.UserDismissed");
                    int f = q83.f(0, "Chrome.ConditionalTabStrip.ContinuousDismissCounter");
                    if (f == -1 || (f + 1) % R20.c.c() != 0) {
                        c4742dx3.r.c(c4742dx3.s);
                    }
                }
            };
            propertyModel.m(AbstractC5086ex3.e, R.drawable.0_resource_name_obfuscated_res_0x7f0900c5);
        }
        propertyModel.o(AbstractC5086ex3.a, onClickListener);
        propertyModel.o(AbstractC5086ex3.b, new View.OnClickListener() { // from class: Vw3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Tab tab;
                C4742dx3 c4742dx3 = C4742dx3.this;
                Tab h = ((AbstractC11276wz3) c4742dx3.j).h();
                if (AbstractC5177fD3.e(c4742dx3.a)) {
                    tab = (Tab) c4742dx3.d(h.getId()).get(r1.size() - 1);
                } else {
                    tab = null;
                }
                c4742dx3.k.b(h.isIncognito()).b(13, tab, new LoadUrlParams("chrome-native://newtab/", 0));
                FI2.a("MobileNewTabOpened.TabStrip");
                if (h.isIncognito()) {
                    return;
                }
                AbstractC5241fQ2.g("Chrome.StartSurface.OpenNewTabPageCount");
            }
        });
        if (AbstractC5177fD3.a()) {
            string = activity.getString(R.string.0_resource_name_obfuscated_res_0x7f14011c);
            string2 = activity.getString(R.string.0_resource_name_obfuscated_res_0x7f140192);
        } else {
            string = activity.getString(R.string.0_resource_name_obfuscated_res_0x7f14011d);
            string2 = activity.getString(R.string.0_resource_name_obfuscated_res_0x7f1402b9);
        }
        propertyModel.o(AbstractC5086ex3.g, string);
        propertyModel.o(AbstractC5086ex3.h, string2);
        propertyModel.k(AbstractC5086ex3.c, true);
        Tab h = abstractC11276wz32.h();
        if (h != null) {
            e(h.getId());
        }
    }

    public final void e(int i) {
        if (this.C || (AbstractC5177fD3.a() && R20.a() != 1)) {
            i = -1;
        }
        final List d = d(i);
        int size = d.size();
        InterfaceC4399cx3 interfaceC4399cx3 = this.i;
        if (size < 2) {
            ((C1933Ow3) interfaceC4399cx3).d(null);
            this.B = false;
        } else {
            ((C1933Ow3) interfaceC4399cx3).d(d);
            this.B = true;
            if (this.D) {
                this.D = false;
                FI2.a("TabStrip.ShownOnTabUse");
                O83.a.s(System.currentTimeMillis(), "Chrome.ConditionalTabStrip.LastShownTimeStamp");
            }
        }
        if (this.B) {
            new Handler().post(new Runnable() { // from class: Pw3
                @Override // java.lang.Runnable
                public final void run() {
                    PD2 pd2 = AbstractC5086ex3.f;
                    C4742dx3 c4742dx3 = C4742dx3.this;
                    c4742dx3.g.o(pd2, Integer.valueOf(d.indexOf(((AbstractC11276wz3) c4742dx3.j).h())));
                }
            });
        }
        boolean z = this.B;
        LB lb = this.l.a;
        lb.l = z;
        lb.l();
        lb.j();
    }

    public final List d(int i) {
        boolean a = AbstractC5177fD3.a();
        InterfaceC10590uz3 interfaceC10590uz3 = this.j;
        if (a) {
            ArrayList arrayList = new ArrayList();
            if (i == -1) {
                return arrayList;
            }
            TabModel j = ((AbstractC11276wz3) interfaceC10590uz3).j(((AbstractC11276wz3) interfaceC10590uz3).m(i).isIncognito());
            for (int i2 = 0; i2 < j.getCount(); i2++) {
                arrayList.add(j.getTabAt(i2));
            }
            return arrayList;
        }
        return ((AbstractC11276wz3) interfaceC10590uz3).c.d().G(i);
    }

    @Override // defpackage.InterfaceC7458ls
    public final void h() {
        C0759Fv3 c0759Fv3 = this.n;
        if (c0759Fv3 != null) {
            c0759Fv3.h();
        }
    }

    @Override // defpackage.InterfaceC7458ls
    public final InterfaceC7697ma2 r() {
        C0759Fv3 c0759Fv3 = this.n;
        if (c0759Fv3 == null) {
            return new C8385oa2();
        }
        return c0759Fv3.j;
    }
}
