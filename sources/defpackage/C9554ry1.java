package defpackage;

import android.os.SystemClock;
import java.util.List;
import org.chromium.chrome.browser.compositor.CompositorViewHolder;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.ui.base.LocalizationUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ry1 */
/* loaded from: classes.dex */
public class C9554ry1 implements InterfaceC8876pz3 {
    public final /* synthetic */ C9897sy1 a;

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void A(List list) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void B() {
    }

    @Override // defpackage.InterfaceC8876pz3
    public /* synthetic */ void D(Tab tab, boolean z) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void L() {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void O(List list, boolean z) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void Y(int i, int i2, Tab tab) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void o(Tab tab) {
    }

    @Override // defpackage.InterfaceC8876pz3
    public final /* synthetic */ void u(boolean z) {
    }

    public C9554ry1(C9897sy1 c9897sy1) {
        this.a = c9897sy1;
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void R(int i, int i2, Tab tab) {
        C9897sy1 c9897sy1 = this.a;
        if (i == 4) {
            c9897sy1.Z(i2, tab);
            return;
        }
        if (tab.getId() != i2) {
            tab.getId();
            tab.isIncognito();
            AbstractC2976Wx1 abstractC2976Wx1 = c9897sy1.r;
            if (abstractC2976Wx1 != null) {
                SystemClock.uptimeMillis();
                abstractC2976Wx1.C();
            }
        }
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void a0(int i, int i2, Tab tab) {
        float f;
        float f2;
        int id = tab.getId();
        C9897sy1 c9897sy1 = this.a;
        if (i == 3) {
            c9897sy1.r.B(SystemClock.uptimeMillis());
            return;
        }
        boolean isIncognito = tab.isIncognito();
        boolean z = !(i == 5 || i == 14 || i == 17) || (!((AbstractC11276wz3) c9897sy1.l).o() && isIncognito);
        float width = LocalizationUtils.isLayoutRtl() ? c9897sy1.g.getWidth() * c9897sy1.a : 0.0f;
        if (i != 2) {
            CompositorViewHolder compositorViewHolder = (CompositorViewHolder) c9897sy1.g;
            int height = compositorViewHolder.getHeight();
            CC cc = compositorViewHolder.t;
            float f3 = height - (compositorViewHolder.f() + (cc != null ? cc.m : 0));
            float f4 = c9897sy1.a;
            f2 = (f4 * c9897sy1.i) - (f3 * f4);
            f = c9897sy1.h * f4;
        } else {
            f = width;
            f2 = 0.0f;
        }
        c9897sy1.b0(id, ((AbstractC11276wz3) c9897sy1.l).i(), i, isIncognito, z, f, f2);
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void V(boolean z) {
        this.a.H(z);
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void y(Tab tab) {
        C9897sy1.d(this.a, tab.getId(), tab.isIncognito(), false);
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void I(Tab tab) {
        C9897sy1.d(this.a, tab.getId(), tab.isIncognito(), false);
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void Z(Tab tab) {
        tab.getId();
        tab.isIncognito();
        AbstractC2976Wx1 abstractC2976Wx1 = this.a.r;
        if (abstractC2976Wx1 != null) {
            SystemClock.uptimeMillis();
            abstractC2976Wx1.x();
        }
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void J(Tab tab) {
        C9897sy1.d(this.a, tab.getId(), tab.isIncognito(), true);
    }

    @Override // defpackage.InterfaceC8876pz3
    public final void X(int i, Tab tab) {
        if (i == 3 || i == 6 || i == 1 || i == 7 || i == 11 || i == 15) {
            return;
        }
        C9897sy1 c9897sy1 = this.a;
        int i2 = ((AbstractC11276wz3) c9897sy1.l).i();
        tab.isIncognito();
        c9897sy1.e0(i2);
    }
}
