package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kw0 */
/* loaded from: classes.dex */
public final class C7139kw0 extends WZ {
    public static final /* synthetic */ int Q = 0;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    InterfaceC9738sX D;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    U80 E;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    C8858pw0 F;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    boolean G;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    boolean H;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    AbstractC9896sy0 I;

    /* renamed from: J */
    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    QP0 f11515J;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    QP0 K;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    QP0 L;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    QP0 M;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    QP0 N;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    Map O;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    HZ3 P;

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
    public final boolean r() {
        return true;
    }

    @Override // defpackage.AbstractC10593v00
    public final boolean s() {
        return true;
    }

    @Override // defpackage.AbstractC10593v00
    public final Object B(Context context) {
        return new ViewOnFocusChangeListenerC0401Dc0(context, false);
    }

    @Override // defpackage.AbstractC10593v00
    public final void y(C7849n00 c7849n00, InterfaceC3331Zq1 interfaceC3331Zq1) {
        Integer valueOf = Integer.valueOf(interfaceC3331Zq1.getWidth());
        Integer valueOf2 = Integer.valueOf(interfaceC3331Zq1.getHeight());
        C6795jw0 c6795jw0 = (C6795jw0) this.A;
        c6795jw0.b = valueOf;
        c6795jw0.a = valueOf2;
    }

    public C7139kw0() {
        super("EditableTextMount");
    }

    @Override // defpackage.WZ
    public final InterfaceC2671Uo1 W() {
        return new C6795jw0();
    }

    @Override // defpackage.WZ, defpackage.SC0
    /* renamed from: f0 */
    public final boolean a(WZ wz) {
        if (this == wz) {
            return true;
        }
        if (wz == null || C7139kw0.class != wz.getClass()) {
            return false;
        }
        C7139kw0 c7139kw0 = (C7139kw0) wz;
        InterfaceC9738sX interfaceC9738sX = this.D;
        if (interfaceC9738sX == null ? c7139kw0.D != null : !interfaceC9738sX.equals(c7139kw0.D)) {
            return false;
        }
        U80 u80 = this.E;
        if (u80 == null ? c7139kw0.E != null : !u80.equals(c7139kw0.E)) {
            return false;
        }
        C8858pw0 c8858pw0 = this.F;
        if (c8858pw0 == null ? c7139kw0.F != null : !c8858pw0.equals(c7139kw0.F)) {
            return false;
        }
        if (this.G != c7139kw0.G || this.H != c7139kw0.H) {
            return false;
        }
        AbstractC9896sy0 abstractC9896sy0 = this.I;
        if (abstractC9896sy0 == null ? c7139kw0.I != null : !abstractC9896sy0.equals(c7139kw0.I)) {
            return false;
        }
        QP0 qp0 = this.f11515J;
        if (qp0 == null ? c7139kw0.f11515J != null : !qp0.equals(c7139kw0.f11515J)) {
            return false;
        }
        QP0 qp02 = this.K;
        if (qp02 == null ? c7139kw0.K != null : !qp02.equals(c7139kw0.K)) {
            return false;
        }
        QP0 qp03 = this.L;
        if (qp03 == null ? c7139kw0.L != null : !qp03.equals(c7139kw0.L)) {
            return false;
        }
        QP0 qp04 = this.M;
        if (qp04 == null ? c7139kw0.M != null : !qp04.equals(c7139kw0.M)) {
            return false;
        }
        QP0 qp05 = this.N;
        if (qp05 == null ? c7139kw0.N != null : !qp05.equals(c7139kw0.N)) {
            return false;
        }
        Map map = this.O;
        if (map == null ? c7139kw0.O != null : !map.equals(c7139kw0.O)) {
            return false;
        }
        HZ3 hz3 = this.P;
        HZ3 hz32 = c7139kw0.P;
        return hz3 == null ? hz32 == null : hz3.equals(hz32);
    }

    @Override // defpackage.WZ
    public final void V(InterfaceC2671Uo1 interfaceC2671Uo1, InterfaceC2671Uo1 interfaceC2671Uo12) {
        C6795jw0 c6795jw0 = (C6795jw0) interfaceC2671Uo1;
        C6795jw0 c6795jw02 = (C6795jw0) interfaceC2671Uo12;
        c6795jw0.a = c6795jw02.a;
        c6795jw0.b = c6795jw02.b;
    }

    @Override // defpackage.WZ
    public final WZ k0() {
        C7139kw0 c7139kw0 = (C7139kw0) super.k0();
        c7139kw0.A = new C6795jw0();
        return c7139kw0;
    }

    @Override // defpackage.AbstractC10593v00
    public final void K(C7849n00 c7849n00) {
        boolean z = this.G;
        boolean z2 = this.H;
        if (z && z2) {
            AbstractC8530oz0.a(c7849n00.a);
        }
    }

    @Override // defpackage.AbstractC10593v00
    public final void G(C7849n00 c7849n00, InterfaceC3331Zq1 interfaceC3331Zq1, int i, int i2, C8753pe3 c8753pe3) {
        C8858pw0 c8858pw0 = this.F;
        U80 u80 = this.E;
        HZ3 hz3 = this.P;
        AbstractC9896sy0 abstractC9896sy0 = this.I;
        boolean z = this.G;
        InterfaceC9738sX interfaceC9738sX = this.D;
        Map map = this.O;
        String n = c8858pw0.m() != null ? c8858pw0.m().n() : null;
        ViewOnFocusChangeListenerC0401Dc0 viewOnFocusChangeListenerC0401Dc0 = new ViewOnFocusChangeListenerC0401Dc0(c7849n00.a, true);
        viewOnFocusChangeListenerC0401Dc0.c(c8858pw0, new C3314Zn(null, null, null, null, null, hz3, abstractC9896sy0, z, interfaceC9738sX, AbstractC0952Hi1.b(map), u80));
        if (n != null) {
            viewOnFocusChangeListenerC0401Dc0.setText(n);
        }
        viewOnFocusChangeListenerC0401Dc0.measure(PM1.a(i), PM1.a(i2));
        c8753pe3.b = viewOnFocusChangeListenerC0401Dc0.getMeasuredHeight();
        if (View.MeasureSpec.getMode(i) == 0) {
            c8753pe3.a = 0;
        } else {
            c8753pe3.a = Math.min(View.MeasureSpec.getSize(i), viewOnFocusChangeListenerC0401Dc0.getMeasuredWidth());
        }
    }

    @Override // defpackage.AbstractC10593v00
    public final void H(C7849n00 c7849n00, Object obj) {
        ViewOnFocusChangeListenerC0401Dc0 viewOnFocusChangeListenerC0401Dc0 = (ViewOnFocusChangeListenerC0401Dc0) obj;
        C8858pw0 c8858pw0 = this.F;
        QP0 qp0 = this.K;
        QP0 qp02 = this.L;
        QP0 qp03 = this.M;
        QP0 qp04 = this.f11515J;
        QP0 qp05 = this.N;
        HZ3 hz3 = this.P;
        AbstractC9896sy0 abstractC9896sy0 = this.I;
        boolean z = this.G;
        InterfaceC9738sX interfaceC9738sX = this.D;
        U80 u80 = this.E;
        Map map = this.O;
        int intValue = ((C6795jw0) this.A).b.intValue();
        int intValue2 = ((C6795jw0) this.A).a.intValue();
        viewOnFocusChangeListenerC0401Dc0.setWidth(intValue);
        viewOnFocusChangeListenerC0401Dc0.setHeight(intValue2);
        viewOnFocusChangeListenerC0401Dc0.c(c8858pw0, new C3314Zn(qp0, qp02, qp03, qp04, qp05, hz3, abstractC9896sy0, z, interfaceC9738sX, AbstractC0952Hi1.b(map), u80));
    }

    @Override // defpackage.AbstractC10593v00
    public final void x(C7849n00 c7849n00, Object obj) {
        ViewOnFocusChangeListenerC0401Dc0 viewOnFocusChangeListenerC0401Dc0 = (ViewOnFocusChangeListenerC0401Dc0) obj;
        C0271Cc0 c0271Cc0 = viewOnFocusChangeListenerC0401Dc0.i;
        if (c0271Cc0 != null) {
            viewOnFocusChangeListenerC0401Dc0.addTextChangedListener(c0271Cc0);
        }
    }

    @Override // defpackage.AbstractC10593v00
    public final void L(Object obj) {
        ViewOnFocusChangeListenerC0401Dc0 viewOnFocusChangeListenerC0401Dc0 = (ViewOnFocusChangeListenerC0401Dc0) obj;
        C0271Cc0 c0271Cc0 = viewOnFocusChangeListenerC0401Dc0.i;
        if (c0271Cc0 != null) {
            viewOnFocusChangeListenerC0401Dc0.removeTextChangedListener(c0271Cc0);
        }
    }

    @Override // defpackage.AbstractC10593v00
    public final boolean S(WZ wz, WZ wz2) {
        return true;
    }
}
