package defpackage;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import org.chromium.chrome.browser.compositor.CompositorViewHolder;
import org.chromium.chrome.browser.compositor.layouts.content.TabContentManager;
import org.chromium.chrome.browser.layouts.scene_layer.SceneLayer;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tabmodel.TabModel;
import org.chromium.ui.resources.ResourceManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Kb3 */
/* loaded from: classes.dex */
public final class C1309Kb3 extends AbstractC2976Wx1 {
    public final C2073Py3 A;
    public final C0770Fy B;
    public C4424d20 v;
    public AnimatorSet w;
    public AnimatorSet x;
    public C1551Ly1 y;
    public C1551Ly1 z;

    @Override // defpackage.AbstractC2976Wx1
    public final int m() {
        return 8;
    }

    @Override // defpackage.AbstractC2976Wx1
    public final int p() {
        return 3;
    }

    @Override // defpackage.AbstractC2976Wx1
    public final boolean q() {
        return true;
    }

    @Override // defpackage.AbstractC2976Wx1
    public final boolean r() {
        return true;
    }

    public C1309Kb3(Context context, C9897sy1 c9897sy1, CompositorViewHolder compositorViewHolder) {
        super(context, c9897sy1, compositorViewHolder);
        this.B = new C0770Fy(context);
        this.A = new C2073Py3();
    }

    @Override // defpackage.AbstractC2976Wx1
    public final void I(long j, boolean z) {
        Tab h;
        super.I(j, z);
        InterfaceC10590uz3 interfaceC10590uz3 = this.l;
        if (interfaceC10590uz3 != null && this.m != null && (h = ((AbstractC11276wz3) interfaceC10590uz3).h()) != null && h.isNativePage()) {
            this.m.a(h);
        }
        this.p = null;
        this.z = null;
        this.y = null;
    }

    @Override // defpackage.AbstractC2976Wx1
    public final void M() {
        C1551Ly1[] c1551Ly1Arr = this.p;
        if (c1551Ly1Arr == null) {
            return;
        }
        boolean z = false;
        for (int length = c1551Ly1Arr.length - 1; length >= 0; length--) {
            z = P(this.p[length]) || z;
        }
        if (z) {
            F();
        }
    }

    public final void Q(int i) {
        TabModel k;
        C1551Ly1[] c1551Ly1Arr = this.p;
        if ((c1551Ly1Arr != null && c1551Ly1Arr.length == 1 && c1551Ly1Arr[0].p() == i) || (k = ((AbstractC11276wz3) this.l).k(i)) == null) {
            return;
        }
        C1551Ly1 c = c(i, k.isIncognito());
        c.l(C1551Ly1.r, 0.0f);
        this.p = new C1551Ly1[]{c};
        L(new LinkedList(Arrays.asList(Integer.valueOf(i))));
    }

    @Override // defpackage.AbstractC2976Wx1
    public final void y(int i, int i2, boolean z, boolean z2, float f, float f2) {
        C1551Ly1[] c1551Ly1Arr;
        float f3;
        float f4;
        Q(i2);
        MD2 md2 = C1551Ly1.i;
        MD2 md22 = C1551Ly1.h;
        MD2 md23 = C1551Ly1.p;
        MD2 md24 = C1551Ly1.g;
        MD2 md25 = C1551Ly1.r;
        if (!z2 || (c1551Ly1Arr = this.p) == null || c1551Ly1Arr.length <= 0) {
            C1551Ly1 c = c(i, z);
            C1551Ly1[] c1551Ly1Arr2 = this.p;
            if (c1551Ly1Arr2 == null || c1551Ly1Arr2.length == 0) {
                this.p = new C1551Ly1[]{c};
            } else {
                this.p = new C1551Ly1[]{c1551Ly1Arr2[0], c};
            }
            L(new LinkedList(Arrays.asList(Integer.valueOf(i), Integer.valueOf(i2))));
            c.l(md25, 0.0f);
            c.l(C1551Ly1.x, 1.0f);
            h();
            V10 j = j();
            C4424d20 e = C4424d20.e(j, c, md24, 0.0f, 1.0f, 300L);
            C4424d20 e2 = C4424d20.e(j, c, md23, 0.0f, 1.0f, 300L);
            C4424d20 e3 = C4424d20.e(j, c, md22, f, 0.0f, 300L);
            C4424d20 e4 = C4424d20.e(j, c, md2, f2, 0.0f, 300L);
            AnimatorSet animatorSet = new AnimatorSet();
            this.w = animatorSet;
            animatorSet.setInterpolator(InterpolatorC0485Dt.c);
            this.w.playTogether(e, e2, e3, e4);
            this.w.start();
            ((C0129Az3) this.l).t(z);
            J(i, false);
            return;
        }
        C1551Ly1 c2 = c(i, z);
        C1551Ly1 c1551Ly1 = this.p[0];
        this.p = new C1551Ly1[]{c1551Ly1, c2};
        L(new LinkedList(Arrays.asList(Integer.valueOf(i), Integer.valueOf(i2))));
        h();
        c2.l(md25, 0.0f);
        float min = (Math.min(this.a, this.g) * 0.100000024f) / 2.0f;
        V10 j2 = j();
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(C4424d20.e(j2, c1551Ly1, md24, 1.0f, 0.9f, 300L));
        arrayList.add(C4424d20.e(j2, c1551Ly1, md22, 0.0f, min, 300L));
        arrayList.add(C4424d20.e(j2, c1551Ly1, md2, 0.0f, min, 300L));
        MD2 md26 = C1551Ly1.s;
        arrayList.add(C4424d20.e(j2, c1551Ly1, md26, 1.1111112f, 1.0f, 300L));
        arrayList.add(C4424d20.e(j2, c1551Ly1, md25, 0.0f, 1.0f, 300L));
        AnimatorSet animatorSet2 = new AnimatorSet();
        InterpolatorC0485Dt interpolatorC0485Dt = InterpolatorC0485Dt.c;
        animatorSet2.setInterpolator(interpolatorC0485Dt);
        animatorSet2.playTogether(arrayList);
        if (this.k != 1) {
            f3 = this.a * 0.5f;
            f4 = min;
        } else {
            f4 = this.g * 0.5f;
            f3 = min;
        }
        ArrayList arrayList2 = new ArrayList(4);
        arrayList2.add(C4424d20.e(j2, c2, md23, 0.0f, 1.0f, 150L));
        arrayList2.add(C4424d20.e(j2, c2, md24, 0.0f, 0.9f, 300L));
        arrayList2.add(C4424d20.e(j2, c2, md22, f, f3, 300L));
        arrayList2.add(C4424d20.e(j2, c2, md2, f2, f4, 300L));
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.setInterpolator(InterpolatorC0485Dt.e);
        animatorSet3.playTogether(arrayList2);
        AnimatorSet animatorSet4 = new AnimatorSet();
        animatorSet4.playTogether(animatorSet3, animatorSet2);
        ArrayList arrayList3 = new ArrayList(7);
        arrayList3.add(C4424d20.f(j2, c1551Ly1, md24, 0.9f, 1.0f, 300L, interpolatorC0485Dt));
        arrayList3.add(C4424d20.f(j2, c1551Ly1, md22, min, 0.0f, 300L, interpolatorC0485Dt));
        arrayList3.add(C4424d20.f(j2, c1551Ly1, md2, min, 0.0f, 300L, interpolatorC0485Dt));
        arrayList3.add(C4424d20.f(j2, c1551Ly1, md26, 1.0f, 1.1111112f, 300L, interpolatorC0485Dt));
        arrayList3.add(C4424d20.f(j2, c1551Ly1, md25, 1.0f, 0.0f, 300L, interpolatorC0485Dt));
        arrayList3.add(C4424d20.e(j2, c2, md23, 1.0f, 0.0f, 300L));
        if (this.k == 1) {
            arrayList3.add(C4424d20.f(j2, c2, md2, f4, this.g, 300L, InterpolatorC0485Dt.d));
        } else {
            arrayList3.add(C4424d20.f(j2, c2, md22, f3, this.a, 300L, InterpolatorC0485Dt.d));
        }
        AnimatorSet animatorSet5 = new AnimatorSet();
        animatorSet5.setStartDelay(150L);
        animatorSet5.addListener(new C1179Jb3(this, i2));
        animatorSet5.playTogether(arrayList3);
        AnimatorSet animatorSet6 = new AnimatorSet();
        this.x = animatorSet6;
        animatorSet6.playSequentially(animatorSet4, animatorSet5);
        this.x.start();
        ((C0129Az3) this.l).t(z);
    }

    @Override // defpackage.AbstractC2976Wx1
    public final void v(int i) {
        if (this.y != null) {
            TabModel k = ((AbstractC11276wz3) this.l).k(i);
            if (k != null) {
                C1551Ly1 c = c(i, k.isIncognito());
                c.l(C1551Ly1.K, 0.0f);
                this.p = new C1551Ly1[]{c, this.y};
                L(new LinkedList(Arrays.asList(Integer.valueOf(i), Integer.valueOf(this.y.p()))));
            } else {
                this.p = new C1551Ly1[]{this.y};
            }
            h();
            this.z = this.y;
            C4424d20 c2 = C4424d20.c(j(), 0.0f, 0.7f * Math.min(this.a, this.g), 250L, new InterfaceC4080c20() { // from class: Ib3
                @Override // defpackage.InterfaceC4080c20
                public final void a(C4424d20 c4424d20) {
                    C1309Kb3 c1309Kb3 = C1309Kb3.this;
                    c1309Kb3.getClass();
                    float b = c4424d20.b();
                    if (c1309Kb3.z != null) {
                        float min = Math.min(c1309Kb3.a, c1309Kb3.g) * 0.7f;
                        float abs = Math.abs(b) < 1.0f ? 1.0f : (Math.abs(b / min) * (-0.3f)) + 1.0f;
                        float r = c1309Kb3.z.r();
                        float q = c1309Kb3.z.q() / 2.0f;
                        float f = 1.0f - abs;
                        c1309Kb3.z.l(C1551Ly1.h, r * f);
                        c1309Kb3.z.l(C1551Ly1.i, q * f);
                        c1309Kb3.z.l(C1551Ly1.g, abs);
                        c1309Kb3.z.l(C1551Ly1.s, abs);
                        c1309Kb3.z.l(C1551Ly1.p, Math.abs(b) >= 1.0f ? 1.0f - Math.abs(JM1.b(b / min, -1.0f, 1.0f)) : 1.0f);
                    }
                }
            });
            this.v = c2;
            c2.j = InterpolatorC0485Dt.d;
            c2.start();
            this.y = null;
            if (k != null) {
                ((C0129Az3) this.l).t(k.isIncognito());
            }
        }
        J(i, false);
    }

    @Override // defpackage.AbstractC2976Wx1
    public final void h() {
        C4424d20 c4424d20 = this.v;
        if (c4424d20 != null) {
            c4424d20.end();
        }
        AnimatorSet animatorSet = this.w;
        if (animatorSet != null) {
            animatorSet.end();
        }
        AnimatorSet animatorSet2 = this.x;
        if (animatorSet2 != null) {
            animatorSet2.end();
        }
    }

    @Override // defpackage.AbstractC2976Wx1
    public final void w(int i) {
        this.p = null;
        this.z = null;
        this.y = null;
        h();
        TabModel k = ((AbstractC11276wz3) this.l).k(i);
        if (k != null) {
            C1551Ly1 c = c(i, k.isIncognito());
            this.y = c;
            c.l(C1551Ly1.r, 0.0f);
            this.p = new C1551Ly1[]{this.y};
            L(new LinkedList(Arrays.asList(Integer.valueOf(i))));
            return;
        }
        this.p = null;
        this.y = null;
    }

    @Override // defpackage.AbstractC2976Wx1
    public final void z(int i) {
        this.p = null;
        this.z = null;
        this.y = null;
        h();
        Q(i);
    }

    @Override // defpackage.AbstractC2976Wx1
    public final AbstractC5518gD0 k() {
        return this.B;
    }

    @Override // defpackage.AbstractC2976Wx1
    public final SceneLayer n() {
        return this.A;
    }

    @Override // defpackage.AbstractC2976Wx1
    public final void N(RectF rectF, TabContentManager tabContentManager, ResourceManager resourceManager, CC cc) {
        this.A.b(this.j, rectF, this, tabContentManager, resourceManager, cc, -1, 0.0f, 0);
    }
}
