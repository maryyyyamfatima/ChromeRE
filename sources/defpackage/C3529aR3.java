package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import com.android.chrome.R;
import java.util.ArrayList;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.compositor.CompositorViewHolder;
import org.chromium.chrome.browser.compositor.layouts.content.TabContentManager;
import org.chromium.chrome.browser.layouts.scene_layer.SceneLayer;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tabmodel.TabModel;
import org.chromium.ui.base.DeviceFormFactor;
import org.chromium.ui.resources.ResourceManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: aR3 */
/* loaded from: classes.dex */
public final class C3529aR3 extends AbstractC2976Wx1 {
    public final GS3 A;
    public final C8385oa2 B;
    public final C8385oa2 C;
    public final boolean D;
    public float E;
    public float F;
    public float G;
    public final float H;
    public final float I;

    /* renamed from: J */
    public final C0770Fy f11480J;
    public C3873bR3 K;
    public final JC L;
    public boolean M;
    public int N;
    public int O;
    public C1551Ly1 v;
    public C1551Ly1 w;
    public C1551Ly1 x;
    public C1551Ly1 y;
    public final GS3 z;

    @Override // defpackage.AbstractC2976Wx1
    public final int m() {
        return 4;
    }

    public C3529aR3(Context context, C9897sy1 c9897sy1, CompositorViewHolder compositorViewHolder, CC cc, C9897sy1 c9897sy12, QS3 qs3) {
        super(context, c9897sy1, compositorViewHolder);
        this.f11480J = new C0770Fy(context);
        this.L = cc;
        Resources resources = context.getResources();
        float f = 1.0f / resources.getDisplayMetrics().density;
        this.I = resources.getDimension(R.dimen.0_resource_name_obfuscated_res_0x7f08080d) * f;
        this.H = resources.getDimension(R.dimen.0_resource_name_obfuscated_res_0x7f08080e) * f;
        boolean z = !DeviceFormFactor.a(context);
        this.D = z;
        C8385oa2 c8385oa2 = new C8385oa2();
        this.B = c8385oa2;
        C8385oa2 c8385oa22 = new C8385oa2();
        this.C = c8385oa22;
        if (z) {
            GS3 gs3 = new GS3(this.j, c9897sy12, new Callback() { // from class: WQ3
                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                }

                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }
            }, c8385oa2, cc, new InterfaceC0079Ap3() { // from class: XQ3
                @Override // defpackage.InterfaceC0079Ap3
                public final /* synthetic */ boolean i() {
                    return AbstractC12248zp3.a(this);
                }

                @Override // defpackage.InterfaceC0079Ap3
                public final Object get() {
                    return ((CompositorViewHolder) C3529aR3.this.o).l.n;
                }
            }, qs3, 4, true);
            this.z = gs3;
            gs3.a(true);
            c9897sy12.f(gs3);
            GS3 gs32 = new GS3(this.j, c9897sy12, new Callback() { // from class: WQ3
                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                }

                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }
            }, c8385oa22, cc, new InterfaceC0079Ap3() { // from class: YQ3
                @Override // defpackage.InterfaceC0079Ap3
                public final /* synthetic */ boolean i() {
                    return AbstractC12248zp3.a(this);
                }

                @Override // defpackage.InterfaceC0079Ap3
                public final Object get() {
                    return ((CompositorViewHolder) C3529aR3.this.o).l.n;
                }
            }, qs3, 4, true);
            this.A = gs32;
            gs32.a(true);
            c9897sy12.f(gs32);
        }
    }

    @Override // defpackage.AbstractC2976Wx1
    public final void G(TabContentManager tabContentManager) {
        super.G(tabContentManager);
        this.K = new C3873bR3(this.j, tabContentManager);
    }

    @Override // defpackage.AbstractC2976Wx1
    public final int p() {
        return !this.D ? 1 : 0;
    }

    @Override // defpackage.AbstractC2976Wx1
    public final boolean i() {
        return this.D;
    }

    @Override // defpackage.AbstractC2976Wx1
    public final void I(long j, boolean z) {
        int i;
        super.I(j, z);
        this.p = null;
        this.x = null;
        this.v = null;
        this.w = null;
        this.y = null;
        this.E = 0.0f;
        this.F = 0.0f;
        this.G = 0.0f;
        InterfaceC10590uz3 interfaceC10590uz3 = this.l;
        if (interfaceC10590uz3 == null) {
            return;
        }
        Tab h = ((AbstractC11276wz3) interfaceC10590uz3).h();
        if (h != null && h.isNativePage()) {
            this.m.a(h);
        }
        TabModel g = ((AbstractC11276wz3) this.l).g();
        if (g == null || (i = ((AbstractC11276wz3) this.l).i()) == -1) {
            return;
        }
        C1551Ly1 c = c(i, g.isIncognito());
        this.x = c;
        R(c, false);
        if (this.M) {
            int i2 = this.N;
            int d = AbstractC1558Lz3.d(((AbstractC11276wz3) this.l).g(), this.O);
            int d2 = AbstractC1558Lz3.d(((AbstractC11276wz3) this.l).g(), i2);
            S(d < d2 ? 1 : 2, d, d2);
            this.y = d < d2 ? this.w : this.v;
            float f = d < d2 ? -this.a : this.a;
            J(i2, false);
            Q(0.0f, f, 350L);
            Tab m = ((AbstractC11276wz3) this.l).m(this.O);
            if (T34.k(m.getUrl()) && !m.h() && !m.j()) {
                ((AbstractC11276wz3) this.l).j(m.isIncognito()).d(m, h, false, false);
            }
            this.M = false;
            this.N = -1;
            this.O = -1;
        }
    }

    public final void S(int i, int i2, int i3) {
        int i4;
        int i5;
        C1551Ly1 c1551Ly1;
        boolean z = i == 2;
        int i6 = z ? i3 : i2;
        if (z) {
            i3 = i2;
        }
        C8385oa2 c8385oa2 = this.B;
        c8385oa2.p(null);
        C8385oa2 c8385oa22 = this.C;
        c8385oa22.p(null);
        TabModel g = ((AbstractC11276wz3) this.l).g();
        if (i6 < 0 || i6 >= g.getCount()) {
            i4 = -1;
        } else {
            i4 = g.getTabAt(i6).getId();
            C1551Ly1 c = c(i4, g.isIncognito());
            this.v = c;
            R(c, i6 != i2);
            c8385oa2.p(g.getTabAt(i6));
        }
        if (i3 < 0 || i3 >= g.getCount()) {
            i5 = -1;
        } else {
            i5 = g.getTabAt(i3).getId();
            C1551Ly1 c2 = c(i5, g.isIncognito());
            this.w = c2;
            R(c2, i3 != i2);
            c8385oa22.p(g.getTabAt(i3));
        }
        int i7 = z ? i5 : i4;
        if (!z) {
            i4 = i5;
        }
        ArrayList arrayList = new ArrayList();
        if (i4 != -1) {
            arrayList.add(Integer.valueOf(i4));
        }
        if (i7 != -1) {
            arrayList.add(Integer.valueOf(i7));
        }
        L(arrayList);
        this.y = null;
        this.E = z ? 0.0f : this.a;
        this.F = 0.0f;
        this.G = 0.0f;
        C1551Ly1 c1551Ly12 = this.v;
        if (c1551Ly12 != null && (c1551Ly1 = this.w) != null) {
            this.p = new C1551Ly1[]{c1551Ly12, c1551Ly1};
        } else if (c1551Ly12 != null) {
            this.p = new C1551Ly1[]{c1551Ly12};
        } else {
            C1551Ly1 c1551Ly13 = this.w;
            if (c1551Ly13 != null) {
                this.p = new C1551Ly1[]{c1551Ly13};
            } else {
                this.p = null;
            }
        }
        F();
    }

    public final void Q(float f, float f2, long j) {
        if (j <= 0) {
            return;
        }
        C4424d20 c = C4424d20.c(j(), f, f2, j, null);
        c.a(new InterfaceC4080c20() { // from class: ZQ3
            @Override // defpackage.InterfaceC4080c20
            public final void a(C4424d20 c4424d20) {
                C3529aR3 c3529aR3 = C3529aR3.this;
                c3529aR3.getClass();
                float b = c4424d20.b();
                c3529aR3.F = b;
                c3529aR3.G = b;
            }
        });
        c.start();
    }

    @Override // defpackage.AbstractC2976Wx1
    public final void M() {
        float max;
        float min;
        C1551Ly1 c1551Ly1 = this.x;
        if (c1551Ly1 == null) {
            return;
        }
        if (this.v == null && this.w == null) {
            this.w = c1551Ly1;
        }
        float f = this.F;
        float f2 = this.G;
        float b = JM1.b(f, f2 - 30.0f, 30.0f + f2);
        float a = AbstractC2277Rn2.a(f2, b, 0.8f, b);
        this.F = a;
        boolean z = true;
        boolean z2 = Math.abs(a - this.G) >= 0.1f;
        if ((this.v != null) ^ (this.w != null)) {
            float f3 = this.F / this.a;
            min = Math.signum(f3) * AbstractC8142nr1.a.getInterpolation(Math.abs(f3)) * (this.a / 5.0f);
            max = min;
        } else {
            float b2 = JM1.b((this.F / this.a) + (this.E == 0.0f ? 0.0f : 1.0f), 0.0f, 1.0f);
            float f4 = this.a;
            float f5 = this.H;
            float f6 = (((f4 + f5) - 0.0f) * b2) + 0.0f;
            float min2 = (f6 - f5) - Math.min(f4, this.v.r());
            float f7 = this.a / 2.0f;
            C1551Ly1 c1551Ly12 = this.w;
            MD2 md2 = C1551Ly1.n;
            float g = c1551Ly12.g(md2);
            float r = c1551Ly12.r();
            MD2 md22 = C1551Ly1.g;
            max = Math.max(f7 - (Math.min(g, c1551Ly12.g(md22) * r) / 2.0f), f6);
            C1551Ly1 c1551Ly13 = this.v;
            min = Math.min(f7 - (Math.min(c1551Ly13.g(md2), c1551Ly13.g(md22) * c1551Ly13.r()) / 2.0f), min2);
        }
        float f8 = this.j.getResources().getDisplayMetrics().density;
        C1551Ly1 c1551Ly14 = this.v;
        MD2 md23 = MS3.i;
        LD2 ld2 = MS3.a;
        MD2 md24 = C1551Ly1.i;
        MD2 md25 = C1551Ly1.h;
        JC jc = this.L;
        GS3 gs3 = this.z;
        if (c1551Ly14 != null) {
            if (gs3 != null) {
                gs3.a(true);
                boolean z3 = this.v != this.x;
                LS3 ls3 = gs3.h;
                ls3.i.k(ld2, z3);
                ls3.i.l(md23, min * f8);
            }
            this.v.l(md25, min);
            this.v.l(md24, ((CC) jc).t / f8);
            z2 = P(this.v) || z2;
        } else if (gs3 != null) {
            gs3.a(false);
        }
        C1551Ly1 c1551Ly15 = this.w;
        GS3 gs32 = this.A;
        if (c1551Ly15 != null) {
            if (gs32 != null) {
                gs32.a(true);
                boolean z4 = this.w != this.x;
                LS3 ls32 = gs32.h;
                ls32.i.k(ld2, z4);
                ls32.i.l(md23, max * f8);
            }
            this.w.l(md25, max);
            this.w.l(md24, ((CC) jc).t / f8);
            if (!P(this.w) && !z2) {
                z = false;
            }
            z2 = z;
        } else if (gs32 != null) {
            gs32.a(false);
        }
        if (z2) {
            F();
        }
    }

    @Override // defpackage.AbstractC2976Wx1
    public final AbstractC5518gD0 k() {
        return this.f11480J;
    }

    @Override // defpackage.AbstractC2976Wx1
    public final SceneLayer n() {
        return this.K;
    }

    @Override // defpackage.AbstractC2976Wx1
    public final void N(RectF rectF, TabContentManager tabContentManager, ResourceManager resourceManager, CC cc) {
        int a;
        if (this.K != null) {
            InterfaceC10590uz3 interfaceC10590uz3 = this.l;
            if (interfaceC10590uz3 != null && ((AbstractC11276wz3) interfaceC10590uz3).o()) {
                a = this.j.getColor(R.color.0_resource_name_obfuscated_res_0x7f0700e8);
            } else {
                a = AbstractC10957w33.a(this.j);
            }
            this.K.b(this.v, true, a);
            this.K.b(this.w, false, a);
        }
    }

    public final void R(C1551Ly1 c1551Ly1, boolean z) {
        if (c1551Ly1.j(C1551Ly1.A)) {
            c1551Ly1.l(C1551Ly1.q, 0.0f);
        }
        float q = c1551Ly1.q();
        c1551Ly1.l(C1551Ly1.n, c1551Ly1.r());
        c1551Ly1.l(C1551Ly1.o, q);
        c1551Ly1.l(C1551Ly1.g, 1.0f);
        c1551Ly1.l(C1551Ly1.s, 1.0f);
        c1551Ly1.u();
        c1551Ly1.l(C1551Ly1.i, 0.0f);
        c1551Ly1.k(C1551Ly1.C, this.D);
        c1551Ly1.k(C1551Ly1.D, z);
    }
}
