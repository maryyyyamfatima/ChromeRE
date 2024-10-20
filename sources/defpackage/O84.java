package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.chrome.R;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.widget.LithoScrollView;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class O84 extends WZ {

    @SY(type = 10)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    WZ D;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    boolean E;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    boolean F;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    boolean G;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    int H;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    boolean I;

    /* renamed from: J */
    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    InterfaceC7863n22 f11460J;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    int K;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    InterfaceC7687mY2 L;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    boolean M;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    boolean N;

    @Override // defpackage.AbstractC10593v00
    public final int N() {
        return 3;
    }

    @Override // defpackage.AbstractC10593v00
    public final boolean e() {
        return true;
    }

    @Override // defpackage.AbstractC10593v00
    public final int m() {
        return 3;
    }

    @Override // defpackage.AbstractC10593v00
    public final boolean p() {
        return true;
    }

    @Override // defpackage.AbstractC10593v00
    public final boolean q() {
        return true;
    }

    @Override // defpackage.AbstractC10593v00
    public final boolean s() {
        return true;
    }

    @Override // defpackage.AbstractC10593v00
    public final Object B(Context context) {
        return (LithoScrollView) LayoutInflater.from(context).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e016e, (ViewGroup) null, false);
    }

    public O84() {
        super("VerticalScroll");
        this.K = 1;
        this.N = true;
    }

    @Override // defpackage.WZ
    public final AbstractC6726jk3 X() {
        return new N84();
    }

    @Override // defpackage.WZ
    public final InterfaceC2671Uo1 W() {
        return new M84();
    }

    @Override // defpackage.WZ, defpackage.SC0
    /* renamed from: f0 */
    public final boolean a(WZ wz) {
        if (this == wz) {
            return true;
        }
        if (wz == null || O84.class != wz.getClass()) {
            return false;
        }
        O84 o84 = (O84) wz;
        WZ wz2 = this.D;
        if (wz2 == null ? o84.D != null : !wz2.a(o84.D)) {
            return false;
        }
        if (this.E != o84.E || this.F != o84.F || this.G != o84.G || this.H != o84.H || this.I != o84.I) {
            return false;
        }
        InterfaceC7863n22 interfaceC7863n22 = this.f11460J;
        if (interfaceC7863n22 == null ? o84.f11460J != null : !interfaceC7863n22.equals(o84.f11460J)) {
            return false;
        }
        if (this.K != o84.K) {
            return false;
        }
        InterfaceC7687mY2 interfaceC7687mY2 = this.L;
        if (interfaceC7687mY2 == null ? o84.L == null : interfaceC7687mY2.equals(o84.L)) {
            return this.M == o84.M && this.N == o84.N;
        }
        return false;
    }

    @Override // defpackage.WZ
    public final void V(InterfaceC2671Uo1 interfaceC2671Uo1, InterfaceC2671Uo1 interfaceC2671Uo12) {
        M84 m84 = (M84) interfaceC2671Uo1;
        M84 m842 = (M84) interfaceC2671Uo12;
        m84.a = m842.a;
        m84.b = m842.b;
    }

    @Override // defpackage.WZ
    public final WZ k0() {
        O84 o84 = (O84) super.k0();
        WZ wz = o84.D;
        o84.D = wz != null ? wz.k0() : null;
        o84.z = new N84();
        o84.A = new M84();
        return o84;
    }

    @Override // defpackage.AbstractC10593v00
    public final void f(C7849n00 c7849n00) {
        WZ wz = this.D;
        int i = this.H;
        boolean z = this.G;
        P84 p84 = new P84();
        p84.a = i;
        F00 f = ComponentTree.f(wz, C7849n00.i(c7849n00));
        f.e = z;
        ComponentTree a = f.a();
        N84 n84 = (N84) this.z;
        n84.b = p84;
        n84.a = a;
    }

    @Override // defpackage.AbstractC10593v00
    public final void G(C7849n00 c7849n00, InterfaceC3331Zq1 interfaceC3331Zq1, int i, int i2, C8753pe3 c8753pe3) {
        Q84.a(c7849n00, i, i2, c8753pe3, ((N84) this.z).a, this.D, this.F, this.E);
        Integer valueOf = Integer.valueOf(c8753pe3.a);
        Integer valueOf2 = Integer.valueOf(c8753pe3.b);
        M84 m84 = (M84) this.A;
        m84.b = valueOf;
        m84.a = valueOf2;
    }

    @Override // defpackage.AbstractC10593v00
    public final void y(C7849n00 c7849n00, InterfaceC3331Zq1 interfaceC3331Zq1) {
        WZ wz = this.D;
        boolean z = this.F;
        boolean z2 = this.E;
        ComponentTree componentTree = ((N84) this.z).a;
        M84 m84 = (M84) this.A;
        Integer num = m84.b;
        Integer num2 = m84.a;
        int width = (interfaceC3331Zq1.getWidth() - interfaceC3331Zq1.N1()) - interfaceC3331Zq1.N0();
        int height = (interfaceC3331Zq1.getHeight() - interfaceC3331Zq1.L1()) - interfaceC3331Zq1.j();
        if (num != null && num.intValue() == width) {
            if (!z) {
                return;
            }
            if (num2 != null && num2.intValue() == height) {
                return;
            }
        }
        Q84.a(c7849n00, View.MeasureSpec.makeMeasureSpec(interfaceC3331Zq1.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(interfaceC3331Zq1.getHeight(), 1073741824), new C8753pe3(), componentTree, wz, z, z2);
    }

    @Override // defpackage.AbstractC10593v00
    public final void H(C7849n00 c7849n00, Object obj) {
        LithoScrollView lithoScrollView = (LithoScrollView) obj;
        boolean z = this.M;
        boolean z2 = this.N;
        boolean z3 = this.I;
        boolean z4 = this.G;
        InterfaceC7863n22 interfaceC7863n22 = this.f11460J;
        InterfaceC7687mY2 interfaceC7687mY2 = this.L;
        int i = this.K;
        N84 n84 = (N84) this.z;
        ComponentTree componentTree = n84.a;
        P84 p84 = n84.b;
        lithoScrollView.f11495J.H(componentTree);
        lithoScrollView.O = z4;
        lithoScrollView.K = p84;
        ViewTreeObserverOnPreDrawListenerC9988tE1 viewTreeObserverOnPreDrawListenerC9988tE1 = new ViewTreeObserverOnPreDrawListenerC9988tE1(lithoScrollView, p84);
        lithoScrollView.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC9988tE1);
        lithoScrollView.L = viewTreeObserverOnPreDrawListenerC9988tE1;
        if (interfaceC7687mY2 != null) {
            C9471rk0 c9471rk0 = new C9471rk0();
            lithoScrollView.N = c9471rk0;
            c9471rk0.a = interfaceC7687mY2;
        }
        lithoScrollView.setScrollbarFadingEnabled(z2);
        lithoScrollView.setNestedScrollingEnabled(z3);
        lithoScrollView.setVerticalFadingEdgeEnabled(false);
        lithoScrollView.setFadingEdgeLength(0);
        lithoScrollView.setVerticalScrollBarEnabled(z);
        lithoScrollView.F = interfaceC7863n22;
        lithoScrollView.setOverScrollMode(i);
    }

    @Override // defpackage.AbstractC10593v00
    public final void M(C7849n00 c7849n00, Object obj) {
        LithoScrollView lithoScrollView = (LithoScrollView) obj;
        lithoScrollView.F = null;
        lithoScrollView.f11495J.H(null);
        lithoScrollView.K = null;
        lithoScrollView.getViewTreeObserver().removeOnPreDrawListener(lithoScrollView.L);
        lithoScrollView.L = null;
        C9471rk0 c9471rk0 = lithoScrollView.N;
        if (c9471rk0 != null) {
            c9471rk0.a = null;
            lithoScrollView.N = null;
        }
    }

    @Override // defpackage.AbstractC10593v00
    public final boolean S(WZ wz, WZ wz2) {
        O84 o84 = (O84) wz;
        O84 o842 = (O84) wz2;
        return ((o84 == null ? null : o84.D).a(o842.D) && (o84 == null ? null : Boolean.valueOf(o84.M)).equals(Boolean.valueOf(o842.M)) && (o84 == null ? null : Boolean.valueOf(o84.N)).equals(Boolean.valueOf(o842.N)) && (o84 == null ? null : Boolean.valueOf(o84.F)).equals(Boolean.valueOf(o842.F)) && (o84 == null ? null : Boolean.valueOf(o84.I)).equals(Boolean.valueOf(o842.I)) && (o84 != null ? Boolean.valueOf(o84.G) : null).equals(Boolean.valueOf(o842.G))) ? false : true;
    }

    @Override // defpackage.AbstractC10593v00
    public final void T(AbstractC6726jk3 abstractC6726jk3, AbstractC6726jk3 abstractC6726jk32) {
        N84 n84 = (N84) abstractC6726jk3;
        N84 n842 = (N84) abstractC6726jk32;
        n842.a = n84.a;
        n842.b = n84.b;
    }
}
