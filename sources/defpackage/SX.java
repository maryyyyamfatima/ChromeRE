package defpackage;

import android.view.View;
import com.google.android.libraries.elements.abstractdataimpl.fbs.DimensionEdgesProxyImplFbs;
import com.google.android.libraries.elements.interfaces.DimensionProxy;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class SX implements InterfaceC9641sD2 {
    public static final WeakHashMap d = new WeakHashMap();
    public final InterfaceC9738sX a;
    public final RP0 b;
    public final boolean c = Boolean.FALSE.booleanValue();

    @Override // defpackage.InterfaceC9641sD2
    public final int b() {
        return 168774585;
    }

    @Override // defpackage.InterfaceC11013wD2
    public final /* synthetic */ void c(InterfaceC8177nx0 interfaceC8177nx0) {
    }

    @Override // defpackage.InterfaceC9641sD2
    public final AbstractC11362xE3 d(ByteBuffer byteBuffer) {
        GX gx = new GX();
        gx.c(byteBuffer.position() + TW1.a(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
        return gx;
    }

    @Override // defpackage.InterfaceC11013wD2
    public final void e(C7849n00 c7849n00, U80 u80, String str, Object obj, final InterfaceC8177nx0 interfaceC8177nx0, C8367oX c8367oX) {
        GX gx = (GX) obj;
        gx.getClass();
        TF0 tf0 = new TF0();
        int b = gx.b(4);
        TF0 tf02 = null;
        if (b != 0) {
            tf0.c(gx.a(b + gx.a), gx.b);
        } else {
            tf0 = null;
        }
        RP0 rp0 = this.b;
        QP0 o = rp0.o(tf0, u80);
        if (o != null) {
            interfaceC8177nx0.b(new JX(this, o, interfaceC8177nx0, c8367oX, u80));
            interfaceC8177nx0.l().j(true);
        }
        TF0 tf03 = new TF0();
        int b2 = gx.b(22);
        if (b2 != 0) {
            tf03.c(gx.a(b2 + gx.a), gx.b);
        } else {
            tf03 = null;
        }
        QP0 o2 = rp0.o(tf03, u80);
        if (o2 != null) {
            interfaceC8177nx0.i(new KX(this, o2, interfaceC8177nx0, c8367oX, u80));
            interfaceC8177nx0.l().j(true);
        }
        TF0 tf04 = new TF0();
        int b3 = gx.b(10);
        if (b3 != 0) {
            tf04.c(gx.a(b3 + gx.a), gx.b);
        } else {
            tf04 = null;
        }
        QP0 o3 = rp0.o(tf04, u80);
        if (o3 != null) {
            interfaceC8177nx0.e(new LX(this, o3, interfaceC8177nx0, c8367oX, u80));
            interfaceC8177nx0.l().j(true);
        }
        TF0 tf05 = new TF0();
        int b4 = gx.b(14);
        if (b4 != 0) {
            tf05.c(gx.a(b4 + gx.a), gx.b);
        } else {
            tf05 = null;
        }
        QP0 o4 = rp0.o(tf05, u80);
        if (o4 != null) {
            interfaceC8177nx0.h(new MX(this, gx, o4, interfaceC8177nx0, c8367oX, u80));
        }
        TF0 tf06 = new TF0();
        int b5 = gx.b(12);
        if (b5 != 0) {
            tf06.c(gx.a(b5 + gx.a), gx.b);
        } else {
            tf06 = null;
        }
        QP0 o5 = rp0.o(tf06, u80);
        if (o5 != null) {
            interfaceC8177nx0.c(new NX(this, o5, interfaceC8177nx0, c8367oX, u80));
        }
        TF0 tf07 = new TF0();
        int b6 = gx.b(16);
        if (b6 != 0) {
            tf07.c(gx.a(b6 + gx.a), gx.b);
        } else {
            tf07 = null;
        }
        QP0 o6 = rp0.o(tf07, u80);
        if (o6 != null) {
            interfaceC8177nx0.d(new OX(this, o6, interfaceC8177nx0, c8367oX, u80));
        }
        C1106In0 c1106In0 = new C1106In0();
        int b7 = gx.b(18);
        if (b7 != 0) {
            c1106In0.c(gx.a(b7 + gx.a), gx.b);
        } else {
            c1106In0 = null;
        }
        if (c1106In0 != null) {
            C1106In0 c1106In02 = new C1106In0();
            int b8 = gx.b(18);
            if (b8 != 0) {
                c1106In02.c(gx.a(b8 + gx.a), gx.b);
            } else {
                c1106In02 = null;
            }
            AbstractC1625Mn0.b(new DimensionEdgesProxyImplFbs(c1106In02), new InterfaceC1496Ln0() { // from class: HX
                @Override // defpackage.InterfaceC1496Ln0
                public final void a(EnumC10209ts4 enumC10209ts4, DimensionProxy dimensionProxy) {
                    InterfaceC8177nx0.this.l().s(enumC10209ts4, dimensionProxy.value());
                }
            });
        }
        TF0 tf08 = new TF0();
        int b9 = gx.b(8);
        if (b9 != 0) {
            tf08.c(gx.a(b9 + gx.a), gx.b);
        } else {
            tf08 = null;
        }
        QP0 o7 = rp0.o(tf08, u80);
        if (o7 != null) {
            interfaceC8177nx0.a(new PX(this, o7, interfaceC8177nx0, c8367oX, u80));
        }
        TF0 tf09 = new TF0();
        int b10 = gx.b(6);
        if (b10 != 0) {
            tf09.c(gx.a(b10 + gx.a), gx.b);
        } else {
            tf09 = null;
        }
        QP0 o8 = rp0.o(tf09, u80);
        if (o8 != null) {
            interfaceC8177nx0.p(new QX(this, o8, interfaceC8177nx0, c8367oX, u80));
        }
        TF0 tf010 = new TF0();
        int b11 = gx.b(34);
        if (b11 != 0) {
            tf010.c(gx.a(b11 + gx.a), gx.b);
        } else {
            tf010 = null;
        }
        QP0 o9 = rp0.o(tf010, u80);
        if (o9 != null) {
            interfaceC8177nx0.k(new RX(this, o9, interfaceC8177nx0, c8367oX, u80));
        }
        TF0 tf011 = new TF0();
        int b12 = gx.b(20);
        if (b12 != 0) {
            tf011.c(gx.a(b12 + gx.a), gx.b);
            tf02 = tf011;
        }
        QP0 o10 = rp0.o(tf02, u80);
        if (o10 != null) {
            interfaceC8177nx0.t(new IX(this, o10, interfaceC8177nx0, c8367oX, u80));
        }
    }

    public SX(InterfaceC9738sX interfaceC9738sX, RP0 rp0) {
        this.a = interfaceC9738sX;
        this.b = rp0;
    }

    public static C2924Wn h(View view, C1629Mo c1629Mo, InterfaceC8177nx0 interfaceC8177nx0, InterfaceC8710pX interfaceC8710pX, U80 u80) {
        return i(view, null, c1629Mo, null, interfaceC8177nx0, interfaceC8710pX, u80);
    }

    public static C2924Wn i(View view, View view2, C1629Mo c1629Mo, SenderStateOuterClass$SenderState senderStateOuterClass$SenderState, InterfaceC8177nx0 interfaceC8177nx0, InterfaceC8710pX interfaceC8710pX, U80 u80) {
        C2794Vn a = AbstractC9053qX.a();
        if (view != null) {
            a.a = view;
        }
        if (view2 != null) {
            a.b = view2;
        }
        if (c1629Mo != null) {
            a.c = c1629Mo;
        }
        a.b(u80);
        a.h = ((C3184Yn) u80).v;
        if (interfaceC8710pX != null) {
            a = interfaceC8710pX.a(a);
        }
        if (senderStateOuterClass$SenderState != null) {
            SenderStateOuterClass$SenderState senderStateOuterClass$SenderState2 = a.e;
            if (senderStateOuterClass$SenderState2 != null) {
                JX0 jx0 = (JX0) senderStateOuterClass$SenderState2.l(PX0.NEW_BUILDER);
                jx0.m(senderStateOuterClass$SenderState2);
                K33 k33 = (K33) jx0;
                k33.m(senderStateOuterClass$SenderState);
                a.e = (SenderStateOuterClass$SenderState) k33.j();
            } else {
                a.e = senderStateOuterClass$SenderState;
            }
        }
        a.f = interfaceC8177nx0;
        return a.a();
    }

    public static void f(SX sx, C5847hA0 c5847hA0, U80 u80) {
        InterfaceC7103kq0 interfaceC7103kq0;
        if (!sx.c || (interfaceC7103kq0 = ((C3184Yn) u80).f) == null) {
            return;
        }
        interfaceC7103kq0.a(c5847hA0);
    }

    public static SenderStateOuterClass$SenderState g(C1629Mo c1629Mo) {
        VX vx = (VX) WX.l.j();
        TX tx = (TX) UX.l.j();
        C2842Vw2 c2842Vw2 = (C2842Vw2) C2972Ww2.m.j();
        if (c2842Vw2.h) {
            c2842Vw2.l();
            c2842Vw2.h = false;
        }
        C2972Ww2 c2972Ww2 = (C2972Ww2) c2842Vw2.g;
        c2972Ww2.j |= 1;
        c2972Ww2.k = c1629Mo.a;
        if (c2842Vw2.h) {
            c2842Vw2.l();
            c2842Vw2.h = false;
        }
        C2972Ww2 c2972Ww22 = (C2972Ww2) c2842Vw2.g;
        c2972Ww22.j |= 2;
        c2972Ww22.l = c1629Mo.b;
        if (tx.h) {
            tx.l();
            tx.h = false;
        }
        UX ux = (UX) tx.g;
        C2972Ww2 c2972Ww23 = (C2972Ww2) c2842Vw2.j();
        ux.getClass();
        c2972Ww23.getClass();
        ux.k = c2972Ww23;
        ux.j |= 1;
        if (vx.h) {
            vx.l();
            vx.h = false;
        }
        WX wx = (WX) vx.g;
        UX ux2 = (UX) tx.j();
        wx.getClass();
        ux2.getClass();
        wx.k = ux2;
        wx.j |= 1;
        WX wx2 = (WX) vx.j();
        K33 k33 = (K33) SenderStateOuterClass$SenderState.l.j();
        k33.p(WX.n, wx2);
        return (SenderStateOuterClass$SenderState) k33.j();
    }
}
