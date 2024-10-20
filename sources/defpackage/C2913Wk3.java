package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.view.Window;
import androidx.appcompat.app.a;
import com.android.chrome.R;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Wk3 */
/* loaded from: classes2.dex */
public final class C2913Wk3 implements InterfaceC0186Bl0, BS3, InterfaceC6389il3 {
    public static final int C = Color.argb(1, 0, 0, 0);
    public int B;
    public final Window a;
    public final boolean g;
    public InterfaceC10240ty1 h;
    public final InterfaceC2783Vk3 i;
    public final C2393Sk3 j;
    public final QS3 l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public InterfaceC10590uz3 q;
    public AN0 s;
    public Tab t;
    public boolean u;
    public boolean v;
    public int w;
    public float x;
    public float y;
    public boolean z;
    public C4496dF r = new C4496dF();
    public int A = 0;
    public final C2523Tk3 k = new C2523Tk3(this);

    @Override // defpackage.InterfaceC6389il3
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.InterfaceC6389il3
    public final /* synthetic */ void b(int i) {
    }

    public C2913Wk3(Window window, boolean z, a aVar, InterfaceC2783Vk3 interfaceC2783Vk3, C8385oa2 c8385oa2, I5 i5, C6166i6 c6166i6, QS3 qs3) {
        this.a = window;
        this.g = z;
        this.i = interfaceC2783Vk3;
        this.m = AbstractC11746yN.b(aVar, false);
        this.n = AbstractC11746yN.b(aVar, true);
        this.o = AbstractC11746yN.a(aVar, false);
        this.p = AbstractC11746yN.a(aVar, true);
        this.j = new C2393Sk3(this, c6166i6);
        c8385oa2.m(this.r.b(new Callback() { // from class: Rk3
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                InterfaceC10240ty1 interfaceC10240ty1 = (InterfaceC10240ty1) obj;
                C2913Wk3 c2913Wk3 = C2913Wk3.this;
                c2913Wk3.h = interfaceC10240ty1;
                AN0 an0 = new AN0(new C2653Uk3(c2913Wk3));
                c2913Wk3.s = an0;
                ((C9897sy1) interfaceC10240ty1).e(an0);
            }
        }));
        i5.b(this);
        this.l = qs3;
    }

    @Override // defpackage.InterfaceC0186Bl0
    public final void onDestroy() {
        this.j.destroy();
        InterfaceC10240ty1 interfaceC10240ty1 = this.h;
        if (interfaceC10240ty1 != null) {
            ((C9897sy1) interfaceC10240ty1).L(this.s);
        }
        InterfaceC10590uz3 interfaceC10590uz3 = this.q;
        if (interfaceC10590uz3 != null) {
            ((AbstractC11276wz3) interfaceC10590uz3).s(this.k);
        }
        C4496dF c4496dF = this.r;
        if (c4496dF != null) {
            c4496dF.a();
            this.r = null;
        }
    }

    @Override // defpackage.InterfaceC6389il3
    public final void d(int i) {
        this.A = i;
        j();
    }

    public final void j() {
        C10613v32 c10613v32;
        int K = this.i.K(this.t);
        int i = this.p;
        int i2 = this.o;
        int i3 = C;
        Window window = this.a;
        if (K == i3) {
            if (!this.v) {
                K = i2;
            }
            K = i;
        } else if (K == 0) {
            if (this.g) {
                K = -16777216;
            } else if (this.u) {
                if (this.v) {
                    Context context = window.getContext();
                    if (C1096Il0.a(context) || AbstractC5177fD3.b(context) || AbstractC5241fQ2.d(context)) {
                        K = this.n;
                    }
                }
                K = this.m;
            } else {
                boolean z = h() && (c10613v32 = (C10613v32) this.t.x()) != null && c10613v32.v();
                QS3 qs3 = this.l;
                if (z) {
                    Tab tab = this.t;
                    qs3.getClass();
                    K = AbstractC3899bX.a(QS3.f(tab), qs3.a, this.y, false);
                } else {
                    Tab tab2 = this.t;
                    if (!this.v) {
                        i = i2;
                    }
                    if (tab2 != null) {
                        if (!qs3.q) {
                            K = qs3.a;
                        }
                    } else {
                        qs3.getClass();
                    }
                    K = i;
                }
            }
        }
        this.B = K;
        int i4 = this.A;
        if (i4 != 0) {
            K = i4;
        }
        if (this.w == 0) {
            this.w = window.getDecorView().getRootView().getContext().getColor(R.color.0_resource_name_obfuscated_res_0x7f070131);
        }
        int a = AbstractC3899bX.a(K, this.w & (-16777216), this.x * ((r1 >>> 24) / 255.0f), false);
        if (AbstractC8540p04.g()) {
            return;
        }
        AbstractC9771sd.h(window.getDecorView().getRootView(), !AbstractC3899bX.g(a));
        AbstractC9771sd.g(window, a);
    }

    public final boolean h() {
        Tab tab = this.t;
        return tab != null && (tab.x() instanceof C10613v32);
    }
}
