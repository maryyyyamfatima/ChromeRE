package defpackage;

import android.util.TypedValue;
import android.view.View;
import com.google.android.libraries.elements.interfaces.PointProxy;
import com.google.android.libraries.elements.interfaces.ScrollableContainerTypeProxy;
import com.google.android.libraries.elements.interfaces.SizeProxy;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import java.util.BitSet;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xY2 */
/* loaded from: classes.dex */
public final class C11461xY2 extends WZ {
    public static final /* synthetic */ int Q = 0;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    EnumC8151ns4 D;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    EnumC8151ns4 E;

    @SY(type = 6)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    List F;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    InterfaceC9738sX G;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    U80 H;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    String I;

    /* renamed from: J */
    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    int f11550J;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    EnumC10552us4 K;

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
    ScrollableContainerTypeProxy O;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    Bs4 P;

    public C11461xY2() {
        super("ScrollableContainerComponent");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [zY2] */
    /* JADX WARN: Type inference failed for: r1v7, types: [BY2] */
    @Override // defpackage.AbstractC10593v00
    public final WZ z(C7849n00 c7849n00) {
        boolean z;
        TZ tz;
        ScrollableContainerTypeProxy scrollableContainerTypeProxy = this.O;
        QP0 qp0 = this.M;
        final QP0 qp02 = this.L;
        final QP0 qp03 = this.N;
        final InterfaceC9738sX interfaceC9738sX = this.G;
        final U80 u80 = this.H;
        int i = this.f11550J;
        EnumC8151ns4 enumC8151ns4 = this.E;
        Bs4 bs4 = this.P;
        EnumC10552us4 enumC10552us4 = this.K;
        EnumC8151ns4 enumC8151ns42 = this.D;
        String str = this.I;
        List list = this.F;
        C3998bo c3998bo = ((C3184Yn) u80).v;
        u80.b();
        T40 p0 = U40.p0(c7849n00);
        U40 u40 = p0.i;
        u40.E = enumC8151ns4;
        u40.Q = bs4;
        u40.f11472J = enumC10552us4;
        u40.D = enumC8151ns42;
        u40.H = i;
        BitSet bitSet = p0.k;
        bitSet.set(1);
        p0.i.F = list;
        int i2 = 0;
        bitSet.set(0);
        SizeProxy contentSize = scrollableContainerTypeProxy.contentSize();
        if (contentSize != null && contentSize.width() > 0.5d && contentSize.height() > 0.5d) {
            ((BY) p0.h.b0()).F0(p0.a.a(contentSize.width()));
            ((BY) p0.h.b0()).d(p0.a.a(contentSize.height()));
        }
        final float f = c7849n00.f().getDisplayMetrics().density;
        if (CY2.a[scrollableContainerTypeProxy.direction().ordinal()] != 1) {
            C91 c91 = new C91();
            F91 f91 = new F91();
            c91.m(c7849n00, 0, 0, f91);
            c91.i = f91;
            c91.k.clear();
            c91.C(scrollableContainerTypeProxy.showHorizontalIndicator());
            c91.x();
            int i3 = CY2.b[scrollableContainerTypeProxy.overscrollMode().ordinal()];
            if (i3 == 1) {
                i2 = 2;
            } else if (i3 != 2) {
                i2 = 1;
            }
            c91.A(i2);
            PointProxy contentOffset = scrollableContainerTypeProxy.contentOffset();
            if (contentOffset != null) {
                c91.y(FH0.a(TypedValue.applyDimension(1, contentOffset.x(), c7849n00.f().getDisplayMetrics())));
            }
            if (qp0 != null) {
                c91.z(new AY2(interfaceC9738sX, qp0, u80, f));
            }
            if (qp02 != null || qp03 != null) {
                c91.B(new InterfaceC7687mY2() { // from class: BY2
                    @Override // defpackage.InterfaceC7687mY2
                    public final void a(View view, int i4) {
                        QP0 qp04;
                        InterfaceC9738sX interfaceC9738sX2 = interfaceC9738sX;
                        U80 u802 = u80;
                        float f2 = f;
                        if (i4 == 0) {
                            QP0 qp05 = QP0.this;
                            if (qp05 != null) {
                                CommandOuterClass$Command a = qp05.a();
                                C3184Yn c3184Yn = (C3184Yn) u802;
                                C3998bo c3998bo2 = c3184Yn.v;
                                AbstractC5771gx0 abstractC5771gx0 = c3184Yn.r;
                                C2842Vw2 c2842Vw2 = (C2842Vw2) C2972Ww2.m.j();
                                float scrollX = view.getScrollX() / f2;
                                if (c2842Vw2.h) {
                                    c2842Vw2.l();
                                    c2842Vw2.h = false;
                                }
                                C2972Ww2 c2972Ww2 = (C2972Ww2) c2842Vw2.g;
                                c2972Ww2.j = 1 | c2972Ww2.j;
                                c2972Ww2.k = scrollX;
                                float scrollY = view.getScrollY() / f2;
                                if (c2842Vw2.h) {
                                    c2842Vw2.l();
                                    c2842Vw2.h = false;
                                }
                                C2972Ww2 c2972Ww22 = (C2972Ww2) c2842Vw2.g;
                                c2972Ww22.j |= 2;
                                c2972Ww22.l = scrollY;
                                DY2.a(view, interfaceC9738sX2, a, c3998bo2, abstractC5771gx0, (C2972Ww2) c2842Vw2.j());
                                return;
                            }
                            return;
                        }
                        if (i4 != 1 || (qp04 = qp03) == null) {
                            return;
                        }
                        CommandOuterClass$Command a2 = qp04.a();
                        C3184Yn c3184Yn2 = (C3184Yn) u802;
                        C3998bo c3998bo3 = c3184Yn2.v;
                        AbstractC5771gx0 abstractC5771gx02 = c3184Yn2.r;
                        C2842Vw2 c2842Vw22 = (C2842Vw2) C2972Ww2.m.j();
                        float scrollX2 = view.getScrollX() / f2;
                        if (c2842Vw22.h) {
                            c2842Vw22.l();
                            c2842Vw22.h = false;
                        }
                        C2972Ww2 c2972Ww23 = (C2972Ww2) c2842Vw22.g;
                        c2972Ww23.j = 1 | c2972Ww23.j;
                        c2972Ww23.k = scrollX2;
                        float scrollY2 = view.getScrollY() / f2;
                        if (c2842Vw22.h) {
                            c2842Vw22.l();
                            c2842Vw22.h = false;
                        }
                        C2972Ww2 c2972Ww24 = (C2972Ww2) c2842Vw22.g;
                        c2972Ww24.j |= 2;
                        c2972Ww24.l = scrollY2;
                        DY2.a(view, interfaceC9738sX2, a2, c3998bo3, abstractC5771gx02, (C2972Ww2) c2842Vw22.j());
                    }
                });
            }
            c91.w(p0);
            tz = c91;
        } else {
            L84 l84 = new L84();
            O84 o84 = new O84();
            l84.m(c7849n00, 0, 0, o84);
            l84.i = o84;
            l84.k.clear();
            l84.F(scrollableContainerTypeProxy.showVerticalIndicator());
            l84.B(c3998bo == null || c3998bo.g);
            C3184Yn c3184Yn = (C3184Yn) u80;
            C3998bo c3998bo2 = c3184Yn.v;
            if (c3998bo2 != null) {
                z = c3998bo2.e;
            } else {
                z = c3184Yn.i;
            }
            l84.z(z);
            l84.y();
            l84.x();
            int i4 = CY2.b[scrollableContainerTypeProxy.overscrollMode().ordinal()];
            if (i4 == 1) {
                i2 = 2;
            } else if (i4 != 2) {
                i2 = 1;
            }
            l84.D(i2);
            PointProxy contentOffset2 = scrollableContainerTypeProxy.contentOffset();
            if (contentOffset2 != null) {
                l84.A(FH0.a(TypedValue.applyDimension(1, contentOffset2.y(), c7849n00.f().getDisplayMetrics())));
            }
            if (qp0 != null) {
                l84.C(new C11804yY2(interfaceC9738sX, qp0, u80, f));
            }
            if (qp02 != null || qp03 != null) {
                l84.E(new InterfaceC7687mY2() { // from class: zY2
                    @Override // defpackage.InterfaceC7687mY2
                    public final void a(View view, int i5) {
                        QP0 qp04;
                        InterfaceC9738sX interfaceC9738sX2 = interfaceC9738sX;
                        U80 u802 = u80;
                        float f2 = f;
                        if (i5 == 0) {
                            QP0 qp05 = QP0.this;
                            if (qp05 != null) {
                                CommandOuterClass$Command a = qp05.a();
                                C3184Yn c3184Yn2 = (C3184Yn) u802;
                                C3998bo c3998bo3 = c3184Yn2.v;
                                AbstractC5771gx0 abstractC5771gx0 = c3184Yn2.r;
                                C2842Vw2 c2842Vw2 = (C2842Vw2) C2972Ww2.m.j();
                                float scrollX = view.getScrollX() / f2;
                                if (c2842Vw2.h) {
                                    c2842Vw2.l();
                                    c2842Vw2.h = false;
                                }
                                C2972Ww2 c2972Ww2 = (C2972Ww2) c2842Vw2.g;
                                c2972Ww2.j = 1 | c2972Ww2.j;
                                c2972Ww2.k = scrollX;
                                float scrollY = view.getScrollY() / f2;
                                if (c2842Vw2.h) {
                                    c2842Vw2.l();
                                    c2842Vw2.h = false;
                                }
                                C2972Ww2 c2972Ww22 = (C2972Ww2) c2842Vw2.g;
                                c2972Ww22.j |= 2;
                                c2972Ww22.l = scrollY;
                                DY2.a(view, interfaceC9738sX2, a, c3998bo3, abstractC5771gx0, (C2972Ww2) c2842Vw2.j());
                                return;
                            }
                            return;
                        }
                        if (i5 != 1 || (qp04 = qp03) == null) {
                            return;
                        }
                        CommandOuterClass$Command a2 = qp04.a();
                        C3184Yn c3184Yn3 = (C3184Yn) u802;
                        C3998bo c3998bo4 = c3184Yn3.v;
                        AbstractC5771gx0 abstractC5771gx02 = c3184Yn3.r;
                        C2842Vw2 c2842Vw22 = (C2842Vw2) C2972Ww2.m.j();
                        float scrollX2 = view.getScrollX() / f2;
                        if (c2842Vw22.h) {
                            c2842Vw22.l();
                            c2842Vw22.h = false;
                        }
                        C2972Ww2 c2972Ww23 = (C2972Ww2) c2842Vw22.g;
                        c2972Ww23.j = 1 | c2972Ww23.j;
                        c2972Ww23.k = scrollX2;
                        float scrollY2 = view.getScrollY() / f2;
                        if (c2842Vw22.h) {
                            c2842Vw22.l();
                            c2842Vw22.h = false;
                        }
                        C2972Ww2 c2972Ww24 = (C2972Ww2) c2842Vw22.g;
                        c2972Ww24.j |= 2;
                        c2972Ww24.l = scrollY2;
                        DY2.a(view, interfaceC9738sX2, a2, c3998bo4, abstractC5771gx02, (C2972Ww2) c2842Vw22.j());
                    }
                });
            }
            l84.w(p0);
            tz = l84;
        }
        if (str != null) {
            tz.u(str);
        }
        return tz.d();
    }
}
