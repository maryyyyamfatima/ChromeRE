package defpackage;

import android.view.View;
import com.google.android.libraries.elements.abstractdataimpl.fbs.DimensionEdgesProxyImplFbs;
import com.google.android.libraries.elements.interfaces.DimensionProxy;
import java.util.BitSet;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class SE0 extends WZ {
    public static final /* synthetic */ int M = 0;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    QP0 D;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    InterfaceC9738sX E;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    U80 F;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    InterfaceC1915Ot0 G;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    XE0 H;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    QP0 I;

    /* renamed from: J */
    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    AbstractC9896sy0 f11467J;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    Map K;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    HZ3 L;

    @Override // defpackage.AbstractC10593v00
    public final boolean e() {
        return true;
    }

    @Override // defpackage.AbstractC10593v00
    public final boolean q() {
        return true;
    }

    @Override // defpackage.AbstractC10593v00
    public final void f(C7849n00 c7849n00) {
        ((RE0) this.z).a = Boolean.FALSE;
    }

    public SE0() {
        super("ExpandableTextComponent");
    }

    @Override // defpackage.WZ
    public final AbstractC6726jk3 X() {
        return new RE0();
    }

    @Override // defpackage.WZ
    public final WZ k0() {
        SE0 se0 = (SE0) super.k0();
        se0.z = new RE0();
        return se0;
    }

    @Override // defpackage.AbstractC10593v00
    public final C4929eX A(C7849n00 c7849n00, int i) {
        C4586dX c4586dX;
        C5704gm c5704gm;
        QP0 qp0;
        QP0 qp02;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        C4586dX c4586dX2;
        C1106In0 c1106In0;
        boolean z4;
        QP0 qp03 = this.I;
        QP0 qp04 = this.D;
        XE0 xe0 = this.H;
        InterfaceC9738sX interfaceC9738sX = this.E;
        HZ3 hz3 = this.L;
        U80 u80 = this.F;
        AbstractC9896sy0 abstractC9896sy0 = this.f11467J;
        Map map = this.K;
        InterfaceC1915Ot0 interfaceC1915Ot0 = this.G;
        Boolean bool = ((RE0) this.z).a;
        C5197fH3 p0 = C5885hH3.p0(c7849n00);
        p0.i.E = interfaceC9738sX;
        BitSet bitSet = p0.k;
        bitSet.set(0);
        p0.i.T = hz3;
        bitSet.set(6);
        p0.i.G = interfaceC1915Ot0;
        bitSet.set(2);
        p0.i.L = abstractC9896sy0;
        bitSet.set(3);
        p0.i.F = u80;
        bitSet.set(1);
        p0.i.S = VE0.a(xe0, bool);
        bitSet.set(5);
        p0.i.R = map;
        bitSet.set(4);
        TZ.e(7, bitSet, p0.j);
        C5885hH3 c5885hH3 = p0.i;
        Sq4 p02 = Tq4.p0(c7849n00);
        p02.x(c5885hH3);
        ((BY) p02.h.b0()).s1(1.0f);
        Tq4 d = p02.d();
        C4586dX w0 = C4929eX.w0(c7849n00);
        w0.C(d);
        if (bool.booleanValue()) {
            c5704gm = new C5704gm();
            int b = xe0.b(16);
            c4586dX = w0;
            if (b != 0) {
                c5704gm.c(xe0.a(b + xe0.a), xe0.b);
            }
            c5704gm = null;
        } else {
            c4586dX = w0;
            c5704gm = new C5704gm();
            int b2 = xe0.b(14);
            if (b2 != 0) {
                c5704gm.c(xe0.a(b2 + xe0.a), xe0.b);
            }
            c5704gm = null;
        }
        String n = c5704gm == null ? null : c5704gm.n();
        int b3 = xe0.b(22);
        if (b3 != 0) {
            qp02 = qp04;
            qp0 = qp03;
            i2 = xe0.b.getInt(b3 + xe0.a);
        } else {
            qp0 = qp03;
            qp02 = qp04;
            i2 = 0;
        }
        if (i2 == 2) {
            boolean z5 = !bool.booleanValue();
            if (bool.booleanValue() || n == null) {
                z = z5;
                z2 = false;
            } else {
                z = z5;
                z2 = true;
            }
        } else if (i2 != 3) {
            z2 = n != null;
            z = true;
        } else {
            z2 = n != null;
            z = false;
        }
        if (bool.booleanValue() || !z2) {
            z3 = z2;
        } else {
            C5197fH3 p03 = C5885hH3.p0(c7849n00);
            p03.i.E = interfaceC9738sX;
            BitSet bitSet2 = p03.k;
            bitSet2.set(0);
            p03.i.G = interfaceC1915Ot0;
            bitSet2.set(2);
            p03.i.T = hz3;
            bitSet2.set(6);
            p03.i.L = abstractC9896sy0;
            bitSet2.set(3);
            p03.i.F = u80;
            bitSet2.set(1);
            z3 = z2;
            p03.i.S = VE0.a(xe0, Boolean.TRUE);
            bitSet2.set(5);
            p03.i.R = map;
            bitSet2.set(4);
            TZ.e(7, bitSet2, p03.j);
            C5885hH3 c5885hH32 = p03.i;
            C8753pe3 c8753pe3 = new C8753pe3();
            c5885hH32.m0(c7849n00, i, View.MeasureSpec.makeMeasureSpec(0, 0), c8753pe3);
            C8753pe3 c8753pe32 = new C8753pe3();
            c5885hH3.m0(c7849n00, i, View.MeasureSpec.makeMeasureSpec(0, 0), c8753pe32);
            if (c8753pe3.a == c8753pe32.a && c8753pe3.b == c8753pe32.b) {
                z = false;
                z3 = false;
            }
        }
        if (z3) {
            UP0 up0 = new UP0(0);
            up0.k(BJ3.h(up0, RP0.c(up0, c5704gm), 0L, 0, 0));
            BJ3 i3 = BJ3.i(up0.h());
            final C5197fH3 p04 = C5885hH3.p0(c7849n00);
            p04.i.E = interfaceC9738sX;
            BitSet bitSet3 = p04.k;
            bitSet3.set(0);
            p04.i.G = interfaceC1915Ot0;
            bitSet3.set(2);
            p04.i.T = hz3;
            bitSet3.set(6);
            p04.i.L = abstractC9896sy0;
            bitSet3.set(3);
            p04.i.F = u80;
            bitSet3.set(1);
            p04.i.S = i3;
            bitSet3.set(5);
            p04.i.R = map;
            bitSet3.set(4);
            ((BY) p04.h.b0()).s1(0.0f);
            C1106In0 c1106In02 = new C1106In0();
            int b4 = xe0.b(24);
            if (b4 != 0) {
                c1106In02.c(xe0.a(b4 + xe0.a), xe0.b);
            } else {
                c1106In02 = null;
            }
            C1106In0 c1106In03 = new C1106In0();
            int b5 = xe0.b(26);
            if (b5 != 0) {
                c1106In03.c(xe0.a(b5 + xe0.a), xe0.b);
                c1106In0 = c1106In03;
            } else {
                c1106In0 = null;
            }
            C9711sR2 w02 = C10054tR2.w0(c7849n00);
            w02.B(p04.d());
            if (c1106In02 != null) {
                AbstractC1625Mn0.b(new DimensionEdgesProxyImplFbs(c1106In02), new InterfaceC1496Ln0() { // from class: TE0
                    @Override // defpackage.InterfaceC1496Ln0
                    public final void a(EnumC10209ts4 enumC10209ts4, DimensionProxy dimensionProxy) {
                        C5197fH3.this.s(enumC10209ts4, dimensionProxy.value());
                    }
                });
            }
            if (c1106In0 != null) {
                AbstractC1625Mn0.b(new DimensionEdgesProxyImplFbs(c1106In0), new InterfaceC1496Ln0() { // from class: UE0
                    @Override // defpackage.InterfaceC1496Ln0
                    public final void a(EnumC10209ts4 enumC10209ts4, DimensionProxy dimensionProxy) {
                        float value = dimensionProxy.value();
                        C5197fH3 c5197fH3 = C5197fH3.this;
                        ((BY) c5197fH3.h.b0()).a1(enumC10209ts4, c5197fH3.a.a(value));
                    }
                });
            }
            int b6 = xe0.b(18);
            if (((b6 == 0 || xe0.b.get(b6 + xe0.a) == 0) ? false : true) && z) {
                p04.f(AbstractC10593v00.u(SE0.class, "ExpandableTextComponent", c7849n00, 2076732558, new Object[]{c7849n00, qp0, qp02}));
                c4586dX2 = c4586dX;
                z4 = false;
            } else {
                z4 = z;
                c4586dX2 = c4586dX;
            }
            c4586dX2.B(w02);
            z = z4;
        } else {
            c4586dX2 = c4586dX;
        }
        if (z) {
            c4586dX2.f(AbstractC10593v00.u(SE0.class, "ExpandableTextComponent", c7849n00, 2076732558, new Object[]{c7849n00, qp0, qp02}));
        }
        return c4586dX2.i;
    }

    @Override // defpackage.AbstractC10593v00
    public final Object i(C6206iD0 c6206iD0, Object obj) {
        int i = c6206iD0.g;
        Object[] objArr = c6206iD0.h;
        if (i == -1048037474) {
            A10.b((C7849n00) objArr[0], (UC0) obj);
            return null;
        }
        if (i != 2076732558) {
            return null;
        }
        InterfaceC4449d61 interfaceC4449d61 = c6206iD0.a;
        C7849n00 c7849n00 = (C7849n00) objArr[0];
        QP0 qp0 = (QP0) objArr[1];
        QP0 qp02 = (QP0) objArr[2];
        SE0 se0 = (SE0) interfaceC4449d61;
        InterfaceC9738sX interfaceC9738sX = se0.E;
        U80 u80 = se0.F;
        boolean booleanValue = ((RE0) se0.z).a.booleanValue();
        if (c7849n00.f != null) {
            c7849n00.m(new C6383ik3(0, new Object[0]), "updateState:ExpandableTextComponent.updateExpand");
        }
        C2794Vn a = AbstractC9053qX.a();
        C3184Yn c3184Yn = (C3184Yn) u80;
        a.h = c3184Yn.v;
        AbstractC5771gx0 abstractC5771gx0 = c3184Yn.r;
        if (abstractC5771gx0 != null) {
            a.f = abstractC5771gx0;
        }
        if (!booleanValue && qp0 != null) {
            ((C10081tX) interfaceC9738sX).a(qp0.a(), a.a(), 2).c();
        }
        if (booleanValue && qp02 != null) {
            ((C10081tX) interfaceC9738sX).a(qp02.a(), a.a(), 2).c();
        }
        return null;
    }

    @Override // defpackage.AbstractC10593v00
    public final void T(AbstractC6726jk3 abstractC6726jk3, AbstractC6726jk3 abstractC6726jk32) {
        ((RE0) abstractC6726jk32).a = ((RE0) abstractC6726jk3).a;
    }
}
