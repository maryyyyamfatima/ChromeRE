package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import com.facebook.litho.ComponentTree;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class F91 extends WZ {

    @SY(type = 10)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    WZ D;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    boolean E;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    int F;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    AY2 G;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    int H;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    InterfaceC7687mY2 I;

    /* renamed from: J */
    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.BOOL)
    boolean f11441J;

    @Override // defpackage.AbstractC10593v00
    public final int N() {
        return 3;
    }

    @Override // defpackage.AbstractC10593v00
    public final int m() {
        return 3;
    }

    @Override // defpackage.AbstractC10593v00
    public final boolean q() {
        return true;
    }

    @Override // defpackage.AbstractC10593v00
    public final void F(C7849n00 c7849n00) {
        TypedArray k = c7849n00.k(JG2.Z);
        int indexCount = k.getIndexCount();
        Boolean bool = null;
        for (int i = 0; i < indexCount; i++) {
            int index = k.getIndex(i);
            if (index == 0) {
                bool = Boolean.valueOf(k.getInt(index, 0) != 0);
            }
        }
        k.recycle();
        if (bool != null) {
            this.f11441J = bool.booleanValue();
        }
    }

    public F91() {
        super("HorizontalScroll");
        this.F = -1;
        this.H = 1;
        this.f11441J = true;
    }

    @Override // defpackage.WZ
    public final AbstractC6726jk3 X() {
        return new E91();
    }

    @Override // defpackage.WZ
    public final InterfaceC2671Uo1 W() {
        return new D91();
    }

    @Override // defpackage.WZ, defpackage.SC0
    /* renamed from: f0 */
    public final boolean a(WZ wz) {
        if (this == wz) {
            return true;
        }
        if (wz == null || F91.class != wz.getClass()) {
            return false;
        }
        F91 f91 = (F91) wz;
        WZ wz2 = this.D;
        if (wz2 == null ? f91.D != null : !wz2.a(f91.D)) {
            return false;
        }
        if (this.E != f91.E || this.F != f91.F) {
            return false;
        }
        AY2 ay2 = this.G;
        if (ay2 == null ? f91.G != null : !ay2.equals(f91.G)) {
            return false;
        }
        if (this.H != f91.H) {
            return false;
        }
        InterfaceC7687mY2 interfaceC7687mY2 = this.I;
        if (interfaceC7687mY2 == null ? f91.I == null : interfaceC7687mY2.equals(f91.I)) {
            return this.f11441J == f91.f11441J;
        }
        return false;
    }

    @Override // defpackage.AbstractC10593v00
    public final Object B(Context context) {
        return new H91(context);
    }

    @Override // defpackage.WZ
    public final void V(InterfaceC2671Uo1 interfaceC2671Uo1, InterfaceC2671Uo1 interfaceC2671Uo12) {
        D91 d91 = (D91) interfaceC2671Uo1;
        D91 d912 = (D91) interfaceC2671Uo12;
        d91.a = d912.a;
        d91.b = d912.b;
        d91.c = d912.c;
        d91.d = d912.d;
        d91.e = d912.e;
    }

    @Override // defpackage.WZ
    public final WZ k0() {
        F91 f91 = (F91) super.k0();
        WZ wz = f91.D;
        f91.D = wz != null ? wz.k0() : null;
        f91.z = new E91();
        f91.A = new D91();
        return f91;
    }

    @Override // defpackage.AbstractC10593v00
    public final void G(C7849n00 c7849n00, InterfaceC3331Zq1 interfaceC3331Zq1, int i, int i2, C8753pe3 c8753pe3) {
        WZ wz = this.D;
        ComponentTree componentTree = ((E91) this.z).a;
        C8753pe3 c8753pe32 = new C8753pe3();
        componentTree.t(wz, View.MeasureSpec.makeMeasureSpec(0, 0), i2, c8753pe32);
        int i3 = c8753pe32.a;
        int i4 = c8753pe32.b;
        Integer valueOf = Integer.valueOf(i3);
        Integer valueOf2 = Integer.valueOf(i4);
        if (View.MeasureSpec.getMode(i) != 0) {
            i3 = View.MeasureSpec.getSize(i);
        }
        c8753pe3.a = i3;
        c8753pe3.b = i4;
        D91 d91 = (D91) this.A;
        d91.e = valueOf;
        d91.d = valueOf2;
    }

    @Override // defpackage.AbstractC10593v00
    public final void y(C7849n00 c7849n00, InterfaceC3331Zq1 interfaceC3331Zq1) {
        Integer valueOf;
        WZ wz = this.D;
        boolean z = this.E;
        ComponentTree componentTree = ((E91) this.z).a;
        D91 d91 = (D91) this.A;
        Integer num = d91.e;
        Integer num2 = d91.d;
        int width = (interfaceC3331Zq1.getWidth() - interfaceC3331Zq1.N1()) - interfaceC3331Zq1.N0();
        if (num != null && num2 != null) {
            int intValue = num.intValue();
            if (!z) {
                width = 0;
            }
            valueOf = Integer.valueOf(Math.max(intValue, width));
        } else {
            C8753pe3 c8753pe3 = new C8753pe3();
            componentTree.t(wz, View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(interfaceC3331Zq1.getHeight(), 1073741824), c8753pe3);
            int i = c8753pe3.a;
            if (!z) {
                width = 0;
            }
            int max = Math.max(i, width);
            int i2 = c8753pe3.b;
            valueOf = Integer.valueOf(max);
            num2 = Integer.valueOf(i2);
        }
        EnumC9866ss4 T1 = interfaceC3331Zq1.T1();
        D91 d912 = (D91) this.A;
        d912.b = valueOf;
        d912.a = num2;
        d912.c = T1;
    }

    @Override // defpackage.AbstractC10593v00
    public final void H(C7849n00 c7849n00, Object obj) {
        H91 h91 = (H91) obj;
        boolean z = this.f11441J;
        AY2 ay2 = this.G;
        InterfaceC7687mY2 interfaceC7687mY2 = this.I;
        int i = this.H;
        E91 e91 = (E91) this.z;
        I91 i91 = e91.b;
        ComponentTree componentTree = e91.a;
        int intValue = ((D91) this.A).b.intValue();
        int intValue2 = ((D91) this.A).a.intValue();
        EnumC9866ss4 enumC9866ss4 = ((D91) this.A).c;
        h91.setHorizontalScrollBarEnabled(z);
        h91.setOverScrollMode(i);
        h91.a.H(componentTree);
        h91.i = i91;
        h91.j = ay2;
        h91.g = intValue;
        h91.h = intValue2;
        if (interfaceC7687mY2 != null) {
            C9471rk0 c9471rk0 = new C9471rk0();
            h91.k = c9471rk0;
            c9471rk0.a = interfaceC7687mY2;
        }
        h91.getViewTreeObserver().addOnPreDrawListener(new G91(h91, i91, enumC9866ss4));
    }

    @Override // defpackage.AbstractC10593v00
    public final void M(C7849n00 c7849n00, Object obj) {
        H91 h91 = (H91) obj;
        h91.a.H(null);
        h91.g = 0;
        h91.h = 0;
        h91.i = null;
        h91.j = null;
        h91.setScrollX(0);
        C9471rk0 c9471rk0 = h91.k;
        if (c9471rk0 != null) {
            c9471rk0.a = null;
            h91.k = null;
        }
        h91.setScrollX(0);
    }

    @Override // defpackage.AbstractC10593v00
    public final void f(C7849n00 c7849n00) {
        WZ wz = this.D;
        I91 i91 = new I91(this.F);
        F00 f = ComponentTree.f(wz, C7849n00.i(c7849n00));
        f.e = false;
        ComponentTree a = f.a();
        E91 e91 = (E91) this.z;
        e91.b = i91;
        e91.a = a;
    }

    @Override // defpackage.AbstractC10593v00
    public final void T(AbstractC6726jk3 abstractC6726jk3, AbstractC6726jk3 abstractC6726jk32) {
        E91 e91 = (E91) abstractC6726jk3;
        E91 e912 = (E91) abstractC6726jk32;
        e912.a = e91.a;
        e912.b = e91.b;
    }
}
