package defpackage;

import J.N;
import android.content.Context;
import android.graphics.RectF;
import android.os.Handler;
import java.util.Arrays;
import java.util.LinkedList;
import org.chromium.chrome.browser.compositor.CompositorViewHolder;
import org.chromium.chrome.browser.compositor.layouts.content.TabContentManager;
import org.chromium.chrome.browser.layouts.scene_layer.SceneLayer;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.ui.base.DeviceFormFactor;
import org.chromium.ui.modelutil.PropertyModel;
import org.chromium.ui.resources.ResourceManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ak3 */
/* loaded from: classes.dex */
public final class C0054Ak3 extends AbstractC2976Wx1 {
    public C1613Mk3 A;
    public final RunnableC12218zk3 B;
    public final Handler C;
    public boolean D;
    public InterfaceC10590uz3 E;
    public C11532xk3 F;
    public C11875yk3 G;
    public final JC H;
    public final TabContentManager I;

    /* renamed from: J */
    public final V10 f11435J;
    public final InterfaceC0079Ap3 K;
    public boolean L;
    public final float M;
    public final boolean v;
    public final Context w;
    public final InterfaceC7839my1 x;
    public final PropertyModel y;
    public C7173l20 z;

    @Override // defpackage.AbstractC2976Wx1
    public final void A() {
    }

    @Override // defpackage.AbstractC2976Wx1
    public final void C() {
    }

    @Override // defpackage.AbstractC2976Wx1
    public final void H(InterfaceC10590uz3 interfaceC10590uz3, TabContentManager tabContentManager) {
    }

    @Override // defpackage.AbstractC2976Wx1
    public final AbstractC5518gD0 k() {
        return null;
    }

    @Override // defpackage.AbstractC2976Wx1
    public final int m() {
        return 1;
    }

    @Override // defpackage.AbstractC2976Wx1
    public final int p() {
        return 2;
    }

    @Override // defpackage.AbstractC2976Wx1
    public final void y(int i, int i2, boolean z, boolean z2, float f, float f2) {
    }

    public C0054Ak3(Context context, C9897sy1 c9897sy1, CompositorViewHolder compositorViewHolder, InterfaceC7839my1 interfaceC7839my1, C6829k20 c6829k20, InterfaceC10590uz3 interfaceC10590uz3, TabContentManager tabContentManager, CC cc, InterfaceC0079Ap3 interfaceC0079Ap3) {
        super(context, c9897sy1, compositorViewHolder);
        this.w = context;
        this.v = DeviceFormFactor.a(context);
        this.x = interfaceC7839my1;
        this.I = tabContentManager;
        this.E = interfaceC10590uz3;
        this.F = new C11532xk3(this, interfaceC10590uz3);
        this.G = new C11875yk3(this, interfaceC10590uz3);
        BD2 bd2 = new BD2(C1551Ly1.R);
        bd2.c(C1551Ly1.e, -1);
        bd2.f(C1551Ly1.g, 1.0f);
        bd2.f(C1551Ly1.h, 0.0f);
        bd2.f(C1551Ly1.i, 0.0f);
        bd2.f(C1551Ly1.j, 0.0f);
        bd2.f(C1551Ly1.k, 0.0f);
        bd2.f(C1551Ly1.q, 1.0f);
        bd2.f(C1551Ly1.x, 0.0f);
        bd2.f(C1551Ly1.y, 1.0f);
        PropertyModel a = bd2.a();
        this.y = a;
        this.f11435J = c9897sy1.H;
        this.K = interfaceC0079Ap3;
        this.C = new Handler();
        this.B = new RunnableC12218zk3(this);
        this.D = false;
        this.M = 1.0f / context.getResources().getDisplayMetrics().density;
        this.H = cc;
        a.l(C1551Ly1.Q, cc.t);
        cc.d(new C11189wk3(this));
        C1613Mk3 c1613Mk3 = new C1613Mk3();
        this.A = c1613Mk3;
        N.M9WjiX4q(c1613Mk3.g, c1613Mk3, tabContentManager);
        this.z = new C7173l20(a, this.A, new TD2() { // from class: vk3
            @Override // defpackage.TD2
            public final void d(WD2 wd2, Object obj, Object obj2) {
                PropertyModel propertyModel = (PropertyModel) wd2;
                C1613Mk3 c1613Mk32 = (C1613Mk3) obj;
                c1613Mk32.getClass();
                if (propertyModel == null) {
                    return;
                }
                N.MatWNfnY(c1613Mk32.g, c1613Mk32, propertyModel.h(C1551Ly1.e), propertyModel.j(C1551Ly1.B), propertyModel.h(C1551Ly1.M), propertyModel.g(C1551Ly1.j) * C1551Ly1.c, (propertyModel.g(C1551Ly1.k) * C1551Ly1.c) + propertyModel.g(C1551Ly1.Q), propertyModel.g(C1551Ly1.x), propertyModel.g(C1551Ly1.q), propertyModel.g(C1551Ly1.y));
            }
        }, c6829k20);
    }

    @Override // defpackage.AbstractC2976Wx1
    public final void I(long j, boolean z) {
        super.I(j, z);
        this.L = true;
        Tab h = ((AbstractC11276wz3) this.E).h();
        if (h == null) {
            return;
        }
        Q(h);
    }

    @Override // defpackage.AbstractC2976Wx1
    public final void M() {
        P(this.y);
    }

    @Override // defpackage.AbstractC2976Wx1
    public final void f() {
        super.f();
        this.L = false;
    }

    public final void Q(Tab tab) {
        PropertyModel propertyModel = this.y;
        ND2 nd2 = C1551Ly1.e;
        int h = propertyModel.h(nd2);
        int id = tab.getId();
        LD2 ld2 = C1551Ly1.A;
        MD2 md2 = C1551Ly1.q;
        MD2 md22 = C1551Ly1.x;
        RunnableC12218zk3 runnableC12218zk3 = this.B;
        Handler handler = this.C;
        if (h == id && !propertyModel.j(ld2)) {
            handler.removeCallbacks(runnableC12218zk3);
            propertyModel.l(md22, 0.0f);
            propertyModel.l(md2, 1.0f);
            this.D = false;
            return;
        }
        TabContentManager tabContentManager = this.I;
        if (tabContentManager != null) {
            tabContentManager.i(tab.getId(), new LinkedList(Arrays.asList(Integer.valueOf(tab.getId()))));
        }
        propertyModel.m(nd2, tab.getId());
        propertyModel.k(C1551Ly1.f, tab.isIncognito());
        MD2 md23 = C1551Ly1.t;
        float width = this.x.getWidth();
        float f = this.M;
        propertyModel.l(md23, width * f);
        propertyModel.l(C1551Ly1.u, r4.getHeight() * f);
        propertyModel.l(C1551Ly1.v, r4.getWidth() * f);
        propertyModel.l(C1551Ly1.w, r4.getHeight() * f);
        R(tab);
        if (propertyModel.j(ld2)) {
            handler.removeCallbacks(runnableC12218zk3);
            propertyModel.l(md22, 1.0f);
            propertyModel.l(md2, 0.0f);
            this.D = true;
            handler.postDelayed(runnableC12218zk3, 2000L);
            return;
        }
        handler.removeCallbacks(runnableC12218zk3);
        propertyModel.l(md22, 0.0f);
        propertyModel.l(md2, 1.0f);
        this.D = false;
    }

    public final void R(Tab tab) {
        PropertyModel propertyModel = this.y;
        if (propertyModel.h(C1551Ly1.e) != tab.getId()) {
            return;
        }
        InterfaceC0079Ap3 interfaceC0079Ap3 = this.K;
        QS3 qs3 = (QS3) interfaceC0079Ap3.get();
        ND2 nd2 = C1551Ly1.M;
        qs3.getClass();
        propertyModel.m(nd2, QS3.f(tab));
        propertyModel.m(C1551Ly1.N, qs3.g(tab));
        propertyModel.l(C1551Ly1.P, ((QS3) interfaceC0079Ap3.get()).h(tab));
        propertyModel.k(C1551Ly1.A, (tab.l() || tab.g()) && !AbstractC5107f12.a(tab.getUrl(), tab.isIncognito()));
        propertyModel.m(C1551Ly1.O, AbstractC3494aK3.a(this.w, tab, ((QS3) interfaceC0079Ap3.get()).d(tab.k(), tab)));
        propertyModel.k(C1551Ly1.B, (tab.b() == null || C8693pT2.W0(tab) || (tab.isNativePage() || tab.getUrl().h().equals("chrome-native"))) ? false : true);
    }

    @Override // defpackage.AbstractC2976Wx1
    public final void K() {
        if (this.y.j(C1551Ly1.A) && this.D) {
            Handler handler = this.C;
            RunnableC12218zk3 runnableC12218zk3 = this.B;
            handler.removeCallbacks(runnableC12218zk3);
            runnableC12218zk3.run();
        }
    }

    @Override // defpackage.AbstractC2976Wx1
    public final boolean r() {
        super.r();
        return this.v;
    }

    @Override // defpackage.AbstractC2976Wx1
    public final boolean q() {
        return this.v;
    }

    @Override // defpackage.AbstractC2976Wx1
    public final SceneLayer n() {
        return this.A;
    }

    @Override // defpackage.AbstractC2976Wx1
    public final void N(RectF rectF, TabContentManager tabContentManager, ResourceManager resourceManager, CC cc) {
        if (tabContentManager != null) {
            int h = this.y.h(C1551Ly1.e);
            long j = tabContentManager.f;
            if (!(j == 0 ? false : N.M6RdXfrR(j, tabContentManager, h)) || AbstractC8604pB3.a <= 0 || AbstractC8604pB3.d) {
                return;
            }
            AbstractC8604pB3.a(true);
            AbstractC8604pB3.d = true;
        }
    }

    @Override // defpackage.AbstractC2976Wx1
    public final void d() {
        C1613Mk3 c1613Mk3 = this.A;
        if (c1613Mk3 != null) {
            c1613Mk3.b();
            this.A = null;
        }
        C7173l20 c7173l20 = this.z;
        if (c7173l20 != null) {
            c7173l20.b.d(c7173l20.e);
            c7173l20.d.n(c7173l20.f);
            this.z = null;
        }
        if (this.E != null) {
            this.F.a();
            this.G.destroy();
        }
    }
}
