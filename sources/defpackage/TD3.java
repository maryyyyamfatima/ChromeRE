package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.ViewGroup;
import android.view.Window;
import com.android.chrome.R;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.vr.VrModuleProvider;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class TD3 implements Li4 {
    public final Window a;
    public final ViewGroup g;
    public final Context h;
    public final ZU0 i;
    public final int j;
    public final boolean k;
    public final InterfaceC10590uz3 l;
    public final QD3 m;
    public final RD3 n;
    public InterfaceC10240ty1 o;
    public AN0 p;
    public C4496dF q = new C4496dF();
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public float v;

    @Override // defpackage.Li4
    public final void b() {
    }

    public TD3(Window window, InterfaceC10590uz3 interfaceC10590uz3, C8385oa2 c8385oa2, ZU0 zu0) {
        this.a = window;
        ViewGroup viewGroup = (ViewGroup) window.getDecorView().getRootView();
        this.g = viewGroup;
        Context context = viewGroup.getContext();
        this.h = context;
        this.j = context.getColor(R.color.f17930_resource_name_obfuscated_res_0x7f070131);
        this.i = zu0;
        this.k = context.getResources().getBoolean(R.bool.f15620_resource_name_obfuscated_res_0x7f06001a);
        this.l = interfaceC10590uz3;
        QD3 qd3 = new QD3(this);
        this.m = qd3;
        ((AbstractC11276wz3) interfaceC10590uz3).c(qd3);
        RD3 rd3 = new RD3(this);
        this.n = rd3;
        ((XU0) zu0).a(rd3);
        c8385oa2.m(this.q.b(new Callback() { // from class: PD3
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                InterfaceC10240ty1 interfaceC10240ty1 = (InterfaceC10240ty1) obj;
                TD3 td3 = TD3.this;
                InterfaceC10240ty1 interfaceC10240ty12 = td3.o;
                if (interfaceC10240ty12 != null) {
                    ((C9897sy1) interfaceC10240ty12).L(td3.p);
                }
                td3.o = interfaceC10240ty1;
                AN0 an0 = new AN0(new SD3(td3));
                td3.p = an0;
                ((C9897sy1) interfaceC10240ty1).e(an0);
                td3.c();
            }
        }));
        c();
        VrModuleProvider.f(this);
    }

    @Override // defpackage.Li4
    public final void a() {
        AbstractC8540p04.j(this.g, !this.s && this.k);
    }

    public final void c() {
        boolean o;
        int a;
        int f;
        ViewGroup viewGroup = this.g;
        boolean a2 = C1096Il0.a(viewGroup.getContext());
        InterfaceC10590uz3 interfaceC10590uz3 = this.l;
        boolean z = false;
        if (a2 || AbstractC5177fD3.b(viewGroup.getContext())) {
            o = ((AbstractC11276wz3) interfaceC10590uz3).o();
        } else {
            InterfaceC10240ty1 interfaceC10240ty1 = this.o;
            o = ((AbstractC11276wz3) interfaceC10590uz3).o() && !(interfaceC10240ty1 != null && ((C9897sy1) interfaceC10240ty1).G(2) && !this.t);
        }
        boolean z2 = (o & (!AbstractC8540p04.g())) | this.u;
        this.s = z2;
        Context context = this.h;
        Window window = this.a;
        if (!z2) {
            a = AbstractC10957w33.a(window.getContext());
        } else {
            a = context.getColor(R.color.f26840_resource_name_obfuscated_res_0x7f0708ab);
        }
        if (a == this.r) {
            return;
        }
        this.r = a;
        window.setNavigationBarColor(a);
        if (Build.VERSION.SDK_INT >= 28) {
            if (!this.s) {
                f = AbstractC10957w33.f(window.getContext());
            } else {
                f = context.getColor(R.color.f16820_resource_name_obfuscated_res_0x7f070084);
            }
            window.setNavigationBarDividerColor(f);
        }
        if (!this.s && this.k) {
            z = true;
        }
        AbstractC8540p04.j(viewGroup, z);
    }
}
