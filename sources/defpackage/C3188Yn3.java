package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.SystemClock;
import com.android.chrome.R;
import java.util.ArrayList;
import org.chromium.chrome.browser.compositor.CompositorViewHolder;
import org.chromium.chrome.browser.compositor.LayerTitleCache;
import org.chromium.chrome.browser.flags.CachedFeatureFlags;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.ui.base.LocalizationUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Yn3 */
/* loaded from: classes.dex */
public final class C3188Yn3 implements InterfaceC3897bW2, InterfaceC3657ao2 {
    public final I5 A;
    public final String B;
    public final InterfaceC0079Ap3 C;
    public InterfaceC10590uz3 g;
    public final InterfaceC2201Qy1 h;
    public final C1734Nj i;
    public boolean j;
    public final C1758Nn3 k;
    public final C1758Nn3 l;
    public float m;
    public final float n;
    public int o;
    public final C5799h20 p;
    public Context q;
    public final C6064ho3 r;
    public boolean s;
    public ValueAnimator t;
    public RA3 u;
    public final C3058Xn3 v;
    public C2538Tn3 w;
    public C2668Un3 x;
    public C2148Qn3 z;
    public final RectF a = new RectF();
    public final C1888On3 y = new C1888On3(this);

    @Override // defpackage.InterfaceC3897bW2
    public final boolean K() {
        return false;
    }

    @Override // defpackage.InterfaceC3657ao2
    public final void e() {
    }

    @Override // defpackage.InterfaceC7458ls
    public final /* synthetic */ void h() {
    }

    @Override // defpackage.InterfaceC3897bW2
    public final boolean onBackPressed() {
        return false;
    }

    @Override // defpackage.InterfaceC3897bW2
    public final boolean p0() {
        return true;
    }

    @Override // defpackage.InterfaceC3897bW2
    public final boolean s() {
        return false;
    }

    @Override // defpackage.InterfaceC7458ls
    public final InterfaceC7697ma2 r() {
        return new C8385oa2();
    }

    public C3188Yn3(Context context, InterfaceC2201Qy1 interfaceC2201Qy1, CompositorViewHolder compositorViewHolder, C6807jy1 c6807jy1, I5 i5) {
        this.h = interfaceC2201Qy1;
        this.C = c6807jy1;
        this.u = new RA3(context);
        C2798Vn3 c2798Vn3 = new C2798Vn3(this);
        this.v = new C3058Xn3(this);
        this.A = i5;
        i5.b(this);
        this.B = context.getString(R.string.0_resource_name_obfuscated_res_0x7f140b14);
        this.i = new C1734Nj(context, c2798Vn3);
        C5799h20 c5799h20 = new C5799h20(context, 24.0f, 24.0f, new C2018Pn3(this));
        this.p = c5799h20;
        c5799h20.l = false;
        c5799h20.k = false;
        c5799h20.e();
        RectF rectF = c5799h20.a;
        rectF.bottom = rectF.height() + 10.0f;
        rectF.top = 10.0f;
        c5799h20.i = 12.0f;
        Resources resources = context.getResources();
        float dimension = resources.getDimension(R.dimen.0_resource_name_obfuscated_res_0x7f0807b5) / resources.getDisplayMetrics().density;
        this.n = dimension;
        String string = resources.getString(R.string.0_resource_name_obfuscated_res_0x7f14017c);
        String string2 = resources.getString(R.string.0_resource_name_obfuscated_res_0x7f14017b);
        c5799h20.n = string;
        c5799h20.o = string2;
        C6064ho3 c6064ho3 = new C6064ho3(context, this.m, dimension);
        this.r = c6064ho3;
        c6064ho3.f = false;
        this.s = false;
        C1758Nn3 c1758Nn3 = new C1758Nn3(context, interfaceC2201Qy1, compositorViewHolder, false, c5799h20);
        this.k = c1758Nn3;
        C1758Nn3 c1758Nn32 = new C1758Nn3(context, interfaceC2201Qy1, compositorViewHolder, true, c5799h20);
        this.l = c1758Nn32;
        this.q = context;
        c1758Nn3.w = new C0304Ci3(context);
        c1758Nn3.T = context;
        c1758Nn32.w = new C0304Ci3(context);
        c1758Nn32.T = context;
    }

    @Override // defpackage.InterfaceC3657ao2
    public final void c() {
        Tab h = ((AbstractC11276wz3) this.g).h();
        if (h == null) {
            return;
        }
        C1758Nn3 d = d(h.isIncognito());
        d.a(SystemClock.uptimeMillis(), true);
        ((C9897sy1) d.a).N(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00ce  */
    @Override // defpackage.InterfaceC3897bW2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.AbstractC4240cW2 j(android.graphics.RectF r34, org.chromium.ui.resources.ResourceManager r35, float r36) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3188Yn3.j(android.graphics.RectF, org.chromium.ui.resources.ResourceManager, float):cW2");
    }

    @Override // defpackage.InterfaceC3897bW2
    public final AbstractC5518gD0 l() {
        return this.i;
    }

    @Override // defpackage.InterfaceC3897bW2
    public final void c0(float f, float f2, float f3, int i) {
        boolean z;
        this.m = f;
        if (this.o != i) {
            this.o = i;
            z = true;
        } else {
            z = false;
        }
        boolean isLayoutRtl = LocalizationUtils.isLayoutRtl();
        C5799h20 c5799h20 = this.p;
        if (!isLayoutRtl) {
            c5799h20.f((this.m - 24.0f) - 12.0f);
        } else {
            c5799h20.f(12.0f);
        }
        u();
        boolean z2 = z;
        this.k.p(this.m, this.n, z2, SystemClock.uptimeMillis());
        this.l.p(this.m, this.n, z2, SystemClock.uptimeMillis());
        RectF rectF = this.a;
        rectF.set(0.0f, 0.0f, this.m, Math.min(this.n, f3));
        this.i.p.set(rectF);
    }

    public final void u() {
        float f;
        if (n()) {
            C5799h20 c5799h20 = this.p;
            if (c5799h20.k) {
                f = this.m - 48.0f;
            } else {
                f = this.m;
            }
            C6064ho3 c6064ho3 = this.r;
            c6064ho3.c = f;
            c6064ho3.b = (LocalizationUtils.isLayoutRtl() && c5799h20.k) ? 48.0f : 0.0f;
        }
    }

    @Override // defpackage.InterfaceC3897bW2
    public final void F(ArrayList arrayList) {
        if (this.s) {
            return;
        }
        if (!this.r.f) {
            C1758Nn3 b = b();
            int i = 0;
            while (true) {
                C5720go3[] c5720go3Arr = b.i;
                if (i >= c5720go3Arr.length) {
                    break;
                }
                C5720go3 c5720go3 = c5720go3Arr[i];
                c5720go3.getClass();
                arrayList.add(c5720go3);
                if (c5720go3.x) {
                    arrayList.add(c5720go3.g);
                }
                i++;
            }
            KN3 kn3 = b.o;
            if (kn3.k) {
                arrayList.add(kn3);
            }
        }
        C5799h20 c5799h20 = this.p;
        if (c5799h20.k) {
            arrayList.add(c5799h20);
        }
    }

    public static void a(C3188Yn3 c3188Yn3, Tab tab) {
        InterfaceC0079Ap3 interfaceC0079Ap3 = c3188Yn3.C;
        if (interfaceC0079Ap3.get() == null) {
            return;
        }
        String b = ((LayerTitleCache) interfaceC0079Ap3.get()).b(tab, c3188Yn3.B);
        C1758Nn3 d = c3188Yn3.d(tab.isIncognito());
        int id = tab.getId();
        Tab n = d.n(id);
        if (n != null) {
            d.s(d.g(id), b, n.isHidden());
        }
        ((C9897sy1) c3188Yn3.h).N(null);
    }

    public final void o(boolean z) {
        if (z == this.j) {
            return;
        }
        this.j = z;
        C1758Nn3 c1758Nn3 = this.l;
        if (z) {
            c1758Nn3.a(0L, false);
        } else {
            c1758Nn3.v.dismiss();
        }
        boolean z2 = !this.j;
        C1758Nn3 c1758Nn32 = this.k;
        if (z2) {
            c1758Nn32.a(0L, false);
        } else {
            c1758Nn32.v.dismiss();
        }
        t();
        ((C9897sy1) this.h).N(null);
    }

    public final void t() {
        C5799h20 c5799h20 = this.p;
        c5799h20.l = this.j;
        InterfaceC10590uz3 interfaceC10590uz3 = this.g;
        if (interfaceC10590uz3 != null) {
            boolean z = ((AbstractC11276wz3) interfaceC10590uz3).j(true).getCount() != 0;
            c5799h20.k = z;
            float f = z ? 48.0f : 0.0f;
            C1758Nn3 c1758Nn3 = this.k;
            c1758Nn3.getClass();
            boolean isLayoutRtl = LocalizationUtils.isLayoutRtl();
            float f2 = c1758Nn3.r;
            if (isLayoutRtl) {
                c1758Nn3.M = f2 + f + 24.0f;
            } else {
                c1758Nn3.N = f2 + f + 24.0f;
            }
            C1758Nn3 c1758Nn32 = this.l;
            c1758Nn32.getClass();
            boolean isLayoutRtl2 = LocalizationUtils.isLayoutRtl();
            float f3 = c1758Nn32.r;
            if (isLayoutRtl2) {
                c1758Nn32.M = f + f3 + 24.0f;
            } else {
                c1758Nn32.N = f + f3 + 24.0f;
            }
            u();
        }
    }

    public static boolean n() {
        return UN.A.a() && !CachedFeatureFlags.b(AbstractC6265iP.d.b("GridTabSwitcherForTablets:enable_launch_polish"), false);
    }

    public final C1758Nn3 d(boolean z) {
        return z ? this.l : this.k;
    }

    public final C1758Nn3 b() {
        return d(this.j);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x011e  */
    @Override // defpackage.InterfaceC3897bW2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean p(long r20) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3188Yn3.p(long):boolean");
    }
}
