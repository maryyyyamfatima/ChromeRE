package defpackage;

import android.os.SystemClock;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.chromium.chrome.browser.app.ChromeActivity;
import org.chromium.chrome.browser.compositor.CompositorViewHolder;
import org.chromium.chrome.browser.compositor.layouts.content.TabContentManager;
import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iy1 */
/* loaded from: classes.dex */
public final class C6463iy1 extends AbstractC5777gy1 {
    public C1309Kb3 Z;

    public C6463iy1(CompositorViewHolder compositorViewHolder, ViewGroup viewGroup, C0538Ed2 c0538Ed2, C0538Ed2 c0538Ed22, C8385oa2 c8385oa2, SQ sq, C6434it1 c6434it1) {
        super(compositorViewHolder, viewGroup, c0538Ed2, c0538Ed22, c8385oa2, sq, c6434it1, null, null);
    }

    @Override // defpackage.AbstractC5777gy1, defpackage.C9897sy1
    public final void B(InterfaceC10590uz3 interfaceC10590uz3, ChromeActivity chromeActivity, B80 b80, C9537rv0 c9537rv0, QS3 qs3) {
        InterfaceC7839my1 interfaceC7839my1 = this.g;
        this.Z = new C1309Kb3(interfaceC7839my1.getContext(), this, (CompositorViewHolder) interfaceC7839my1);
        super.B(interfaceC10590uz3, chromeActivity, b80, c9537rv0, qs3);
        this.Z.H(interfaceC10590uz3, (TabContentManager) ((C8385oa2) this.X).g);
    }

    @Override // defpackage.AbstractC5777gy1, defpackage.C9897sy1
    public final AbstractC2976Wx1 u(int i) {
        if (i == 8) {
            return this.Z;
        }
        return super.u(i);
    }

    @Override // defpackage.C9897sy1
    public final C9554ry1 g() {
        return new C6121hy1(this);
    }

    @Override // defpackage.C9897sy1
    public final void a0(int i, int i2, boolean z, boolean z2) {
        boolean z3 = i2 == -1;
        if (o() != 2 && z3) {
            if (o() == 8) {
                O(u(2), true);
            } else {
                d0(2, true);
            }
        }
        AbstractC2976Wx1 abstractC2976Wx1 = this.r;
        SystemClock.uptimeMillis();
        abstractC2976Wx1.v(i2);
        InterfaceC10590uz3 interfaceC10590uz3 = this.l;
        Tab m = interfaceC10590uz3 == null ? null : ((AbstractC11276wz3) interfaceC10590uz3).m(i2);
        if (m != null && m.a() != null) {
            m.a().requestFocus();
        }
        boolean z4 = !z2 && this.U;
        if (o() == 2 || !z3 || z4) {
            return;
        }
        d0(2, false);
    }

    @Override // defpackage.AbstractC5777gy1, defpackage.C9897sy1
    public final void b0(int i, int i2, int i3, boolean z, boolean z2, float f, float f2) {
        Tab c;
        super.b0(i, i2, i3, z, z2, f, f2);
        if (!z2 || (c = AbstractC1558Lz3.c(((AbstractC11276wz3) this.l).j(z), i)) == null || c.a() == null) {
            return;
        }
        c.a().requestFocus();
    }

    @Override // defpackage.AbstractC5777gy1, defpackage.C9897sy1
    public final void H(boolean z) {
        AbstractC2976Wx1 abstractC2976Wx1;
        if (this.r == this.j && !z) {
            if (C1096Il0.a(this.g.getContext())) {
                abstractC2976Wx1 = this.Q;
            } else {
                abstractC2976Wx1 = this.S;
            }
            Y(abstractC2976Wx1, false);
        }
        super.H(z);
    }

    @Override // defpackage.C9897sy1
    public final void e0(int i) {
        boolean z;
        AbstractC2976Wx1 abstractC2976Wx1 = this.r;
        if (abstractC2976Wx1 != null && !abstractC2976Wx1.q) {
            C1551Ly1[] c1551Ly1Arr = abstractC2976Wx1.p;
            if (c1551Ly1Arr != null && c1551Ly1Arr.length == 1) {
                int i2 = 0;
                while (true) {
                    ArrayList arrayList = this.M;
                    if (i2 >= arrayList.size()) {
                        break;
                    }
                    if (((InterfaceC3897bW2) arrayList.get(i2)).p0() && ((InterfaceC3897bW2) arrayList.get(i2)).K()) {
                        X(abstractC2976Wx1.p[0].p(), false);
                        b();
                        z = true;
                        break;
                    }
                    i2++;
                }
            }
            z = false;
            if (z && this.r.r()) {
                this.r.z(i);
                return;
            }
        }
        if (this.U) {
            if (!G(2)) {
                AbstractC2976Wx1 abstractC2976Wx12 = this.r;
                if (abstractC2976Wx12 == null || !abstractC2976Wx12.q) {
                    Y(this.Z, false);
                } else {
                    O(this.Z, true);
                    this.r.f();
                }
            }
            AbstractC2976Wx1 abstractC2976Wx13 = this.r;
            if (abstractC2976Wx13 != null) {
                abstractC2976Wx13.z(i);
            }
        }
    }
}
