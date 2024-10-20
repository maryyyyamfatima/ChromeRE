package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class VI2 extends WZ {
    public static final /* synthetic */ int d0 = 0;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    InterfaceC2194Qx D;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    int E;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    boolean F;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    boolean G;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    CharSequence H;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.DIMEN_SIZE)
    int I;

    /* renamed from: J */
    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    boolean f11474J;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    boolean K;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    AbstractC2348Sb3 L;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    AbstractC10705vK2 M;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    int N;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    boolean O;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    CK2 P;

    @SY(type = JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    List Q;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    int R;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    boolean S;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    YJ2 T;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    int U;

    @SY(type = 11)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    C6206iD0 V;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.COLOR)
    Integer W;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.COLOR)
    int X;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    int Y;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    int Z;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    AbstractC2368Sf3 a0;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    int b0;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    boolean c0;

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
    public final boolean q() {
        return true;
    }

    @Override // defpackage.AbstractC10593v00
    public final boolean s() {
        return true;
    }

    public VI2() {
        super("Recycler");
        this.E = 0;
        this.F = true;
        this.G = true;
        this.f11474J = true;
        this.L = AbstractC5899hK2.a;
        this.N = 0;
        this.O = true;
        this.Q = Collections.emptyList();
        this.R = 0;
        this.S = true;
        this.U = -1;
        this.X = -16777216;
        this.Y = 0;
        this.Z = 0;
        this.b0 = 0;
    }

    @Override // defpackage.WZ
    public final AbstractC6726jk3 X() {
        return new UI2();
    }

    @Override // defpackage.WZ, defpackage.SC0
    /* renamed from: f0 */
    public final boolean a(WZ wz) {
        if (this == wz) {
            return true;
        }
        if (wz == null || VI2.class != wz.getClass()) {
            return false;
        }
        VI2 vi2 = (VI2) wz;
        InterfaceC2194Qx interfaceC2194Qx = this.D;
        if (interfaceC2194Qx == null ? vi2.D != null : !interfaceC2194Qx.equals(vi2.D)) {
            return false;
        }
        if (this.E != vi2.E || this.F != vi2.F || this.G != vi2.G) {
            return false;
        }
        CharSequence charSequence = this.H;
        if (charSequence == null ? vi2.H != null : !charSequence.equals(vi2.H)) {
            return false;
        }
        if (this.I != vi2.I || this.f11474J != vi2.f11474J || this.K != vi2.K) {
            return false;
        }
        AbstractC2348Sb3 abstractC2348Sb3 = this.L;
        if (abstractC2348Sb3 == null ? vi2.L != null : !abstractC2348Sb3.equals(vi2.L)) {
            return false;
        }
        AbstractC10705vK2 abstractC10705vK2 = this.M;
        if (abstractC10705vK2 == null ? vi2.M != null : !abstractC10705vK2.equals(vi2.M)) {
            return false;
        }
        if (this.N != vi2.N || this.O != vi2.O) {
            return false;
        }
        CK2 ck2 = this.P;
        if (ck2 == null ? vi2.P != null : !ck2.equals(vi2.P)) {
            return false;
        }
        List list = this.Q;
        if (list == null ? vi2.Q != null : !list.equals(vi2.Q)) {
            return false;
        }
        if (this.R != vi2.R || this.S != vi2.S) {
            return false;
        }
        YJ2 yj2 = this.T;
        if (yj2 == null ? vi2.T != null : !yj2.equals(vi2.T)) {
            return false;
        }
        if (this.U != vi2.U) {
            return false;
        }
        C6206iD0 c6206iD0 = this.V;
        if (c6206iD0 == null ? vi2.V != null : !c6206iD0.a(vi2.V)) {
            return false;
        }
        Integer num = this.W;
        if (num == null ? vi2.W != null : !num.equals(vi2.W)) {
            return false;
        }
        if (this.X != vi2.X || this.Y != vi2.Y || this.Z != vi2.Z) {
            return false;
        }
        AbstractC2368Sf3 abstractC2368Sf3 = this.a0;
        if (abstractC2368Sf3 == null ? vi2.a0 == null : abstractC2368Sf3.equals(vi2.a0)) {
            return this.b0 == vi2.b0 && this.c0 == vi2.c0;
        }
        return false;
    }

    @Override // defpackage.WZ
    public final WZ k0() {
        VI2 vi2 = (VI2) super.k0();
        vi2.z = new UI2();
        return vi2;
    }

    @Override // defpackage.AbstractC10593v00
    public final void G(C7849n00 c7849n00, InterfaceC3331Zq1 interfaceC3331Zq1, int i, int i2, C8753pe3 c8753pe3) {
        InterfaceC2194Qx interfaceC2194Qx = this.D;
        C5555gK2 c5555gK2 = AbstractC5899hK2.a;
        interfaceC2194Qx.h(c8753pe3, i, i2, (interfaceC2194Qx.j() || interfaceC2194Qx.e()) ? AbstractC10593v00.u(VI2.class, "Recycler", c7849n00, 946341036, new Object[]{c7849n00}) : null);
    }

    @Override // defpackage.AbstractC10593v00
    public final void y(C7849n00 c7849n00, InterfaceC3331Zq1 interfaceC3331Zq1) {
        InterfaceC2194Qx interfaceC2194Qx = this.D;
        C5555gK2 c5555gK2 = AbstractC5899hK2.a;
        interfaceC2194Qx.b(interfaceC3331Zq1.getWidth(), interfaceC3331Zq1.getHeight());
    }

    @Override // defpackage.AbstractC10593v00
    public final Object B(Context context) {
        C5555gK2 c5555gK2 = AbstractC5899hK2.a;
        return new G13(context, new C8617pE1(context));
    }

    @Override // defpackage.AbstractC10593v00
    public final void H(C7849n00 c7849n00, Object obj) {
        G13 g13 = (G13) obj;
        InterfaceC2194Qx interfaceC2194Qx = this.D;
        boolean z = this.f11474J;
        boolean z2 = this.G;
        int i = this.N;
        int i2 = this.Y;
        int i3 = this.b0;
        int i4 = this.E;
        Integer num = this.W;
        int i5 = this.X;
        boolean z3 = this.F;
        boolean z4 = this.O;
        int i6 = this.Z;
        AbstractC10705vK2 abstractC10705vK2 = this.M;
        boolean z5 = this.K;
        boolean z6 = this.c0;
        int i7 = this.I;
        int i8 = this.U;
        int i9 = this.R;
        CharSequence charSequence = this.H;
        AbstractC2348Sb3 abstractC2348Sb3 = this.L;
        C5555gK2 c5555gK2 = AbstractC5899hK2.a;
        RecyclerView recyclerView = g13.P;
        if (recyclerView == null) {
            throw new IllegalStateException("RecyclerView not found, it should not be removed from SwipeRefreshLayout");
        }
        recyclerView.setContentDescription(charSequence);
        recyclerView.z = z;
        recyclerView.setClipToPadding(z2);
        g13.setClipToPadding(z2);
        WeakHashMap weakHashMap = Ec4.a;
        recyclerView.setPaddingRelative(i, i3, i2, i4);
        recyclerView.setClipChildren(z3);
        g13.setClipChildren(z3);
        recyclerView.setNestedScrollingEnabled(z4);
        g13.setNestedScrollingEnabled(z4);
        recyclerView.setScrollBarStyle(i6);
        recyclerView.setHorizontalFadingEdgeEnabled(z5);
        recyclerView.setVerticalFadingEdgeEnabled(z6);
        recyclerView.setFadingEdgeLength(i7);
        recyclerView.setId(i8);
        recyclerView.setOverScrollMode(i9);
        if (num != null) {
            g13.y.setBackgroundColor(num.intValue());
        }
        g13.k();
        C6280iS c6280iS = g13.D;
        C5936hS c5936hS = c6280iS.a;
        c5936hS.i = new int[]{i5};
        c5936hS.a(0);
        c5936hS.a(0);
        c6280iS.invalidateSelf();
        if (abstractC10705vK2 != null) {
            recyclerView.g(abstractC10705vK2);
        }
        if (abstractC2348Sb3 == AbstractC5899hK2.a) {
            abstractC2348Sb3 = new C5555gK2();
        }
        RecyclerView recyclerView2 = g13.P;
        g13.S = recyclerView2.S;
        recyclerView2.p0(abstractC2348Sb3);
        interfaceC2194Qx.f(recyclerView);
    }

    @Override // defpackage.AbstractC10593v00
    public final void x(C7849n00 c7849n00, Object obj) {
        G13 g13 = (G13) obj;
        InterfaceC2194Qx interfaceC2194Qx = this.D;
        YJ2 yj2 = this.T;
        List list = this.Q;
        AbstractC2368Sf3 abstractC2368Sf3 = this.a0;
        boolean z = this.S;
        CK2 ck2 = this.P;
        C6206iD0 c6206iD0 = this.V;
        C5555gK2 c5555gK2 = AbstractC5899hK2.a;
        g13.setContentDescription(null);
        g13.setEnabled(z && c6206iD0 != null);
        g13.g = c6206iD0 != null ? new C5211fK2(c6206iD0) : null;
        C8617pE1 c8617pE1 = (C8617pE1) g13.P;
        if (c8617pE1 == null) {
            throw new IllegalStateException("RecyclerView not found, it should not be removed from SwipeRefreshLayout before unmounting");
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c8617pE1.i((DK2) it.next());
            }
        }
        if (ck2 != null) {
            c8617pE1.w.add(ck2);
        }
        if (abstractC2368Sf3 != null && c8617pE1.e0 == null) {
            abstractC2368Sf3.a(c8617pE1);
        }
        interfaceC2194Qx.t(c8617pE1);
        if (yj2 != null) {
            yj2.a = g13;
        }
        if (g13.R) {
            c8617pE1.requestLayout();
            g13.R = false;
        }
    }

    @Override // defpackage.AbstractC10593v00
    public final void L(Object obj) {
        G13 g13 = (G13) obj;
        InterfaceC2194Qx interfaceC2194Qx = this.D;
        YJ2 yj2 = this.T;
        CK2 ck2 = this.P;
        List list = this.Q;
        C5555gK2 c5555gK2 = AbstractC5899hK2.a;
        C8617pE1 c8617pE1 = (C8617pE1) g13.P;
        if (c8617pE1 == null) {
            throw new IllegalStateException("RecyclerView not found, it should not be removed from SwipeRefreshLayout before unmounting");
        }
        interfaceC2194Qx.u(c8617pE1);
        if (yj2 != null) {
            yj2.a = null;
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c8617pE1.h0((DK2) it.next());
            }
        }
        if (ck2 != null) {
            c8617pE1.g0(ck2);
        }
        if (ck2 != null) {
            c8617pE1.g0(ck2);
        }
        g13.g = null;
    }

    @Override // defpackage.AbstractC10593v00
    public final void M(C7849n00 c7849n00, Object obj) {
        G13 g13 = (G13) obj;
        InterfaceC2194Qx interfaceC2194Qx = this.D;
        AbstractC10705vK2 abstractC10705vK2 = this.M;
        Integer num = this.W;
        AbstractC2368Sf3 abstractC2368Sf3 = this.a0;
        C5555gK2 c5555gK2 = AbstractC5899hK2.a;
        RecyclerView recyclerView = g13.P;
        if (recyclerView == null) {
            throw new IllegalStateException("RecyclerView not found, it should not be removed from SwipeRefreshLayout before unmounting");
        }
        recyclerView.setId(-1);
        if (num != null) {
            g13.y.setBackgroundColor(-328966);
        }
        if (abstractC10705vK2 != null) {
            recyclerView.f0(abstractC10705vK2);
        }
        interfaceC2194Qx.v(recyclerView);
        if (abstractC2368Sf3 != null) {
            abstractC2368Sf3.a(null);
        }
        g13.P.p0(g13.S);
        g13.S = null;
    }

    @Override // defpackage.AbstractC10593v00
    public final boolean S(WZ wz, WZ wz2) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer valueOf;
        Integer num4;
        Boolean valueOf2;
        Boolean bool;
        Integer valueOf3;
        Integer num5;
        AbstractC10705vK2 abstractC10705vK2;
        AbstractC10705vK2 abstractC10705vK22;
        Boolean valueOf4;
        Boolean bool2;
        Boolean valueOf5;
        Boolean bool3;
        Integer valueOf6;
        Integer num6;
        AbstractC2348Sb3 abstractC2348Sb3;
        boolean equals;
        VI2 vi2 = (VI2) wz;
        VI2 vi22 = (VI2) wz2;
        InterfaceC2194Qx interfaceC2194Qx = vi2 == null ? null : vi2.D;
        InterfaceC2194Qx interfaceC2194Qx2 = vi22.D;
        Boolean valueOf7 = vi2 == null ? null : Boolean.valueOf(vi2.f11474J);
        Boolean valueOf8 = Boolean.valueOf(vi22.f11474J);
        Boolean valueOf9 = vi2 == null ? null : Boolean.valueOf(vi2.G);
        Boolean valueOf10 = Boolean.valueOf(vi22.G);
        Integer valueOf11 = vi2 == null ? null : Integer.valueOf(vi2.N);
        Integer valueOf12 = Integer.valueOf(vi22.N);
        Integer valueOf13 = vi2 == null ? null : Integer.valueOf(vi2.Y);
        Integer valueOf14 = Integer.valueOf(vi22.Y);
        Integer valueOf15 = vi2 == null ? null : Integer.valueOf(vi2.b0);
        Integer valueOf16 = Integer.valueOf(vi22.b0);
        Integer valueOf17 = vi2 == null ? null : Integer.valueOf(vi2.E);
        Integer valueOf18 = Integer.valueOf(vi22.E);
        if (vi2 == null) {
            num = valueOf18;
            num2 = null;
        } else {
            num = valueOf18;
            num2 = vi2.W;
        }
        Integer num7 = num2;
        Integer num8 = vi22.W;
        if (vi2 == null) {
            num3 = num8;
            valueOf = null;
        } else {
            num3 = num8;
            valueOf = Integer.valueOf(vi2.X);
        }
        Integer num9 = valueOf;
        Integer valueOf19 = Integer.valueOf(vi22.X);
        if (vi2 == null) {
            num4 = valueOf19;
            valueOf2 = null;
        } else {
            num4 = valueOf19;
            valueOf2 = Boolean.valueOf(vi2.F);
        }
        Boolean bool4 = valueOf2;
        Boolean valueOf20 = Boolean.valueOf(vi22.F);
        if (vi2 == null) {
            bool = valueOf20;
            valueOf3 = null;
        } else {
            bool = valueOf20;
            valueOf3 = Integer.valueOf(vi2.Z);
        }
        Integer num10 = valueOf3;
        Integer valueOf21 = Integer.valueOf(vi22.Z);
        if (vi2 == null) {
            num5 = valueOf21;
            abstractC10705vK2 = null;
        } else {
            num5 = valueOf21;
            abstractC10705vK2 = vi2.M;
        }
        AbstractC10705vK2 abstractC10705vK23 = abstractC10705vK2;
        AbstractC10705vK2 abstractC10705vK24 = vi22.M;
        if (vi2 == null) {
            abstractC10705vK22 = abstractC10705vK24;
            valueOf4 = null;
        } else {
            abstractC10705vK22 = abstractC10705vK24;
            valueOf4 = Boolean.valueOf(vi2.K);
        }
        Boolean bool5 = valueOf4;
        Boolean valueOf22 = Boolean.valueOf(vi22.K);
        if (vi2 == null) {
            bool2 = valueOf22;
            valueOf5 = null;
        } else {
            bool2 = valueOf22;
            valueOf5 = Boolean.valueOf(vi2.c0);
        }
        Boolean bool6 = valueOf5;
        Boolean valueOf23 = Boolean.valueOf(vi22.c0);
        if (vi2 == null) {
            bool3 = valueOf23;
            valueOf6 = null;
        } else {
            bool3 = valueOf23;
            valueOf6 = Integer.valueOf(vi2.I);
        }
        Integer num11 = valueOf6;
        Integer valueOf24 = Integer.valueOf(vi22.I);
        if (vi2 == null) {
            num6 = valueOf24;
            abstractC2348Sb3 = null;
        } else {
            num6 = valueOf24;
            abstractC2348Sb3 = vi2.L;
        }
        AbstractC2348Sb3 abstractC2348Sb32 = abstractC2348Sb3;
        AbstractC2348Sb3 abstractC2348Sb33 = vi22.L;
        Integer valueOf25 = vi2 == null ? null : Integer.valueOf(((UI2) vi2.z).a);
        Integer valueOf26 = Integer.valueOf(((UI2) vi22.z).a);
        C5555gK2 c5555gK2 = AbstractC5899hK2.a;
        if (valueOf25.intValue() != valueOf26.intValue() || interfaceC2194Qx != interfaceC2194Qx2 || !valueOf7.equals(valueOf8) || !valueOf9.equals(valueOf10) || !valueOf11.equals(valueOf12) || !valueOf13.equals(valueOf14) || !valueOf15.equals(valueOf16) || !valueOf17.equals(num) || !bool4.equals(bool) || !num10.equals(num5) || !bool5.equals(bool2) || !bool6.equals(bool3) || !num11.equals(num6)) {
            return true;
        }
        if (num7 == null) {
            if (num3 != null) {
                return true;
            }
        } else if (!num7.equals(num3)) {
            return true;
        }
        if (!num9.equals(num4)) {
            return true;
        }
        if (abstractC2348Sb32 == null) {
            if (abstractC2348Sb33 != null) {
                return true;
            }
        } else if (!abstractC2348Sb32.getClass().equals(abstractC2348Sb33.getClass())) {
            return true;
        }
        if (abstractC10705vK23 == null) {
            equals = abstractC10705vK22 == null;
        } else {
            equals = abstractC10705vK23.equals(abstractC10705vK22);
        }
        return !equals;
    }

    @Override // defpackage.AbstractC10593v00
    public final void f(C7849n00 c7849n00) {
        C5555gK2 c5555gK2 = AbstractC5899hK2.a;
        Integer num = 0;
        ((UI2) this.z).a = num.intValue();
    }

    @Override // defpackage.AbstractC10593v00
    public final boolean Q() {
        InterfaceC2194Qx interfaceC2194Qx = this.D;
        C5555gK2 c5555gK2 = AbstractC5899hK2.a;
        return interfaceC2194Qx.e();
    }

    @Override // defpackage.AbstractC10593v00
    public final Object i(C6206iD0 c6206iD0, Object obj) {
        int i = c6206iD0.g;
        Object[] objArr = c6206iD0.h;
        if (i == -1048037474) {
            A10.b((C7849n00) objArr[0], (UC0) obj);
            return null;
        }
        if (i != 946341036) {
            return null;
        }
        InterfaceC4449d61 interfaceC4449d61 = c6206iD0.a;
        C7849n00 c7849n00 = (C7849n00) objArr[0];
        int i2 = ((UI2) ((VI2) interfaceC4449d61).z).a;
        C5555gK2 c5555gK2 = AbstractC5899hK2.a;
        int i3 = i2 + 1;
        if (c7849n00.f != null) {
            c7849n00.m(new C6383ik3(0, Integer.valueOf(i3)), "updateState:Recycler.onUpdateMeasure");
        }
        return null;
    }

    @Override // defpackage.AbstractC10593v00
    public final void T(AbstractC6726jk3 abstractC6726jk3, AbstractC6726jk3 abstractC6726jk32) {
        ((UI2) abstractC6726jk32).a = ((UI2) abstractC6726jk3).a;
    }
}
