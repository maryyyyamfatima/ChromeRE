package defpackage;

import J.N;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.ViewGroup;
import com.android.chrome.R;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.chromium.chrome.browser.app.ChromeActivity;
import org.chromium.chrome.browser.compositor.CompositorViewHolder;
import org.chromium.chrome.browser.compositor.LayerTitleCache;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tabmodel.TabModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ly1 */
/* loaded from: classes.dex */
public final class C7495ly1 extends AbstractC5777gy1 {
    public final InterfaceC6092ht1 Z;
    public final OX2 a0;
    public final Callable b0;
    public C3188Yn3 c0;
    public QS3 d0;
    public C7151ky1 e0;
    public LayerTitleCache f0;
    public final InterfaceC0079Ap3 g0;
    public final InterfaceC0079Ap3 h0;

    /* JADX WARN: Type inference failed for: r5v1, types: [jy1] */
    public C7495ly1(CompositorViewHolder compositorViewHolder, ViewGroup viewGroup, C0538Ed2 c0538Ed2, C0538Ed2 c0538Ed22, C8385oa2 c8385oa2, SQ sq, C6434it1 c6434it1, ViewGroup viewGroup2, OX2 ox2, I5 i5, CallableC7305lR callableC7305lR) {
        super(compositorViewHolder, viewGroup, c0538Ed2, c0538Ed22, c8385oa2, sq, c6434it1, viewGroup2, ox2);
        this.g0 = c0538Ed2;
        this.h0 = c0538Ed22;
        Context context = compositorViewHolder.getContext();
        CompositorViewHolder compositorViewHolder2 = (CompositorViewHolder) this.g;
        compositorViewHolder2.getClass();
        C3188Yn3 c3188Yn3 = new C3188Yn3(context, this, compositorViewHolder2, new InterfaceC0079Ap3() { // from class: jy1
            @Override // defpackage.InterfaceC0079Ap3
            public final /* synthetic */ boolean i() {
                return AbstractC12248zp3.a(this);
            }

            @Override // defpackage.InterfaceC0079Ap3
            public final Object get() {
                return C7495ly1.this.f0;
            }
        }, i5);
        this.c0 = c3188Yn3;
        this.Z = c6434it1;
        this.a0 = ox2;
        this.b0 = callableC7305lR;
        f(c3188Yn3);
        e(this.c0.v);
        O(null, true);
    }

    @Override // defpackage.AbstractC5777gy1, defpackage.C9897sy1
    public final void i() {
        C7151ky1 c7151ky1;
        super.i();
        LayerTitleCache layerTitleCache = this.f0;
        if (layerTitleCache != null) {
            long j = layerTitleCache.e;
            if (j != 0) {
                N.M4YKMV3h(j);
                layerTitleCache.e = 0L;
            }
            this.f0 = null;
        }
        C3188Yn3 c3188Yn3 = this.c0;
        if (c3188Yn3 != null) {
            L(c3188Yn3.v);
            C3188Yn3 c3188Yn32 = this.c0;
            ValueAnimator valueAnimator = c3188Yn32.t;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            c3188Yn32.u.c();
            c3188Yn32.u = null;
            c3188Yn32.l.l.removeCallbacksAndMessages(null);
            c3188Yn32.k.l.removeCallbacksAndMessages(null);
            c3188Yn32.A.c(c3188Yn32);
            InterfaceC10590uz3 interfaceC10590uz3 = c3188Yn32.g;
            if (interfaceC10590uz3 != null) {
                ((AbstractC11276wz3) interfaceC10590uz3).c.f(c3188Yn32.z);
                ((AbstractC11276wz3) c3188Yn32.g).s(c3188Yn32.y);
                c3188Yn32.w.a();
                c3188Yn32.x.destroy();
            }
            this.c0 = null;
        }
        QS3 qs3 = this.d0;
        if (qs3 == null || (c7151ky1 = this.e0) == null) {
            return;
        }
        qs3.i.d(c7151ky1);
        this.d0 = null;
        this.e0 = null;
    }

    @Override // defpackage.C9897sy1
    public final void f0(boolean z) {
        super.f0(z);
        ((C0129Az3) this.l).f();
    }

    @Override // defpackage.AbstractC5777gy1, defpackage.C9897sy1
    public final void B(InterfaceC10590uz3 interfaceC10590uz3, ChromeActivity chromeActivity, B80 b80, C9537rv0 c9537rv0, QS3 qs3) {
        super.B(interfaceC10590uz3, chromeActivity, b80, c9537rv0, qs3);
        if (C1096Il0.c().a) {
            InterfaceC7839my1 interfaceC7839my1 = this.g;
            LayerTitleCache layerTitleCache = new LayerTitleCache(interfaceC7839my1.getContext(), ((CompositorViewHolder) interfaceC7839my1).l.n);
            this.f0 = layerTitleCache;
            layerTitleCache.b = interfaceC10590uz3;
        }
        C3188Yn3 c3188Yn3 = this.c0;
        if (c3188Yn3 == null || c3188Yn3.g == interfaceC10590uz3) {
            return;
        }
        C2148Qn3 c2148Qn3 = new C2148Qn3(c3188Yn3);
        c3188Yn3.z = c2148Qn3;
        ((AbstractC11276wz3) interfaceC10590uz3).c.b(c2148Qn3);
        c3188Yn3.g = interfaceC10590uz3;
        LayerTitleCache layerTitleCache2 = (LayerTitleCache) c3188Yn3.C.get();
        InterfaceC10590uz3 interfaceC10590uz32 = c3188Yn3.g;
        if (interfaceC10590uz32 != null && layerTitleCache2 != null) {
            ArrayList arrayList = ((AbstractC11276wz3) interfaceC10590uz32).a;
            for (int i = 0; i < arrayList.size(); i++) {
                TabModel tabModel = (TabModel) arrayList.get(i);
                for (int i2 = 0; i2 < tabModel.getCount(); i2++) {
                    Tab tabAt = tabModel.getTabAt(i2);
                    if (tabAt != null) {
                        layerTitleCache2.b(tabAt, tabAt.getContext().getString(R.string.0_resource_name_obfuscated_res_0x7f140b14));
                    }
                }
            }
        }
        AbstractC11276wz3 abstractC11276wz3 = (AbstractC11276wz3) c3188Yn3.g;
        if (abstractC11276wz3.i) {
            c3188Yn3.t();
        } else {
            abstractC11276wz3.c(new C2408Sn3(c3188Yn3));
        }
        TabModel j = ((AbstractC11276wz3) c3188Yn3.g).j(false);
        AbstractC10569uv3 b = chromeActivity.b(false);
        C1758Nn3 c1758Nn3 = c3188Yn3.k;
        if (c1758Nn3.c != j) {
            c1758Nn3.c = j;
            c1758Nn3.e = b;
            c1758Nn3.u(c1758Nn3.Q);
            c1758Nn3.d(false);
        }
        TabModel j2 = ((AbstractC11276wz3) c3188Yn3.g).j(true);
        AbstractC10569uv3 b2 = chromeActivity.b(true);
        C1758Nn3 c1758Nn32 = c3188Yn3.l;
        if (c1758Nn32.c != j2) {
            c1758Nn32.c = j2;
            c1758Nn32.e = b2;
            c1758Nn32.u(c1758Nn32.Q);
            c1758Nn32.d(false);
        }
        if (AbstractC5177fD3.j(c3188Yn3.q)) {
            C7502lz3 c7502lz3 = ((AbstractC11276wz3) c3188Yn3.g).c;
            c1758Nn3.d = (C1024Hw3) c7502lz3.e(false);
            c1758Nn32.d = (C1024Hw3) c7502lz3.e(true);
        }
        c3188Yn3.o(((AbstractC11276wz3) c3188Yn3.g).o());
        c3188Yn3.w = new C2538Tn3(c3188Yn3, interfaceC10590uz3);
        c3188Yn3.x = new C2668Un3(c3188Yn3, interfaceC10590uz3);
        ((AbstractC11276wz3) c3188Yn3.g).c(c3188Yn3.y);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [ky1] */
    @Override // defpackage.C9897sy1, defpackage.InterfaceC10240ty1
    public final void d0(int i, boolean z) {
        InterfaceC0079Ap3 interfaceC0079Ap3 = this.g0;
        if (i == 2 && this.S == null) {
            InterfaceC7839my1 interfaceC7839my1 = this.g;
            if (AbstractC5177fD3.h(interfaceC7839my1.getContext())) {
                try {
                    if (!interfaceC0079Ap3.i()) {
                        final ViewGroup viewGroup = (ViewGroup) this.b0.call();
                        g0((InterfaceC7408lj3) interfaceC0079Ap3.get(), (InterfaceC10318uB3) this.h0.get(), this.Z, this.a0, viewGroup);
                        if (AbstractC5177fD3.i(interfaceC7839my1.getContext())) {
                            this.e0 = new PJ3() { // from class: ky1
                                @Override // defpackage.PJ3
                                public final void b(int i2, boolean z2) {
                                    viewGroup.setBackgroundColor(i2);
                                }
                            };
                            QS3 qs3 = (QS3) this.O.get();
                            this.d0 = qs3;
                            qs3.i.a(this.e0);
                        }
                    }
                } catch (Exception e) {
                    throw new RuntimeException("Failed to initialize start surface.", e);
                }
            }
        }
        super.d0(i, z);
    }

    @Override // defpackage.C9897sy1
    public final void n(int i) {
        super.n(i);
        LayerTitleCache layerTitleCache = this.f0;
        if (layerTitleCache != null) {
            layerTitleCache.a(i);
        }
    }

    @Override // defpackage.C9897sy1, defpackage.InterfaceC2201Qy1
    public final void a(int i) {
        LayerTitleCache layerTitleCache = this.f0;
        if (layerTitleCache != null) {
            layerTitleCache.c(i);
        }
        super.a(i);
    }

    @Override // defpackage.C9897sy1, defpackage.InterfaceC2201Qy1
    public final void c(int i) {
        this.f0.c(i);
    }

    @Override // defpackage.AbstractC5777gy1, defpackage.C9897sy1
    public final void b0(int i, int i2, int i3, boolean z, boolean z2, float f, float f2) {
        InterfaceC7839my1 interfaceC7839my1 = this.g;
        if ((interfaceC7839my1 != null ? ((CompositorViewHolder) interfaceC7839my1).t : null) != null) {
            (interfaceC7839my1 != null ? ((CompositorViewHolder) interfaceC7839my1).t : null).g.y();
        }
        super.b0(i, i2, i3, z, z2, f, f2);
    }
}
