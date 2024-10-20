package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.widget.ImageView;
import com.airbnb.lottie.b;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import java.io.ByteArrayInputStream;
import java.util.HashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Vb */
/* loaded from: classes.dex */
public final class C2734Vb extends WZ {
    public static final /* synthetic */ int L = 0;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    InterfaceC9738sX D;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    U80 E;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    C8367oX F;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    String G;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    AbstractC9896sy0 H;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    QP0 I;

    /* renamed from: J */
    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    QP0 f11475J;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    C7706mc K;

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
    public final boolean s() {
        return true;
    }

    @Override // defpackage.AbstractC10593v00
    public final Object B(Context context) {
        return new b(context);
    }

    public C2734Vb() {
        super("AnimatedType");
    }

    @Override // defpackage.AbstractC10593v00
    public final void f(C7849n00 c7849n00) {
        Float valueOf = Float.valueOf(-1.0f);
        Integer num = -1;
        ((C2474Tb) this.z).a = valueOf.floatValue();
        ((C2474Tb) this.z).c = num.intValue();
        ((C2474Tb) this.z).b = null;
    }

    @Override // defpackage.WZ
    public final AbstractC6726jk3 X() {
        return new C2474Tb();
    }

    @Override // defpackage.WZ
    public final InterfaceC2671Uo1 W() {
        return new C2344Sb();
    }

    @Override // defpackage.WZ, defpackage.SC0
    /* renamed from: f0 */
    public final boolean a(WZ wz) {
        if (this == wz) {
            return true;
        }
        if (wz == null || C2734Vb.class != wz.getClass()) {
            return false;
        }
        C2734Vb c2734Vb = (C2734Vb) wz;
        InterfaceC9738sX interfaceC9738sX = this.D;
        if (interfaceC9738sX == null ? c2734Vb.D != null : !interfaceC9738sX.equals(c2734Vb.D)) {
            return false;
        }
        U80 u80 = this.E;
        if (u80 == null ? c2734Vb.E != null : !u80.equals(c2734Vb.E)) {
            return false;
        }
        C8367oX c8367oX = this.F;
        if (c8367oX == null ? c2734Vb.F != null : !c8367oX.equals(c2734Vb.F)) {
            return false;
        }
        String str = this.G;
        if (str == null ? c2734Vb.G != null : !str.equals(c2734Vb.G)) {
            return false;
        }
        AbstractC9896sy0 abstractC9896sy0 = this.H;
        if (abstractC9896sy0 == null ? c2734Vb.H != null : !abstractC9896sy0.equals(c2734Vb.H)) {
            return false;
        }
        QP0 qp0 = this.I;
        if (qp0 == null ? c2734Vb.I != null : !qp0.equals(c2734Vb.I)) {
            return false;
        }
        QP0 qp02 = this.f11475J;
        if (qp02 == null ? c2734Vb.f11475J != null : !qp02.equals(c2734Vb.f11475J)) {
            return false;
        }
        C7706mc c7706mc = this.K;
        C7706mc c7706mc2 = c2734Vb.K;
        return c7706mc == null ? c7706mc2 == null : c7706mc.equals(c7706mc2);
    }

    @Override // defpackage.WZ
    public final void V(InterfaceC2671Uo1 interfaceC2671Uo1, InterfaceC2671Uo1 interfaceC2671Uo12) {
        ((C2344Sb) interfaceC2671Uo1).a = ((C2344Sb) interfaceC2671Uo12).a;
    }

    @Override // defpackage.WZ
    public final WZ k0() {
        C2734Vb c2734Vb = (C2734Vb) super.k0();
        c2734Vb.z = new C2474Tb();
        c2734Vb.A = new C2344Sb();
        return c2734Vb;
    }

    @Override // defpackage.AbstractC10593v00
    public final void K(C7849n00 c7849n00) {
        OJ1 oj1;
        C7706mc c7706mc = this.K;
        if (c7706mc.h() != null) {
            if (c7706mc.h().h() != null) {
                String h = c7706mc.h().h();
                String h2 = c7706mc.h().h();
                HashMap hashMap = AbstractC11728yJ1.a;
                XH2 xh2 = new XH2(AbstractC2477Tb2.a(new ByteArrayInputStream(h.getBytes())));
                String[] strArr = AbstractC3086Xt1.j;
                oj1 = AbstractC11728yJ1.d(new C3346Zt1(xh2), h2, true);
                ((C2344Sb) this.A).a = oj1;
            }
            c7706mc.h().i();
        }
        oj1 = null;
        ((C2344Sb) this.A).a = oj1;
    }

    @Override // defpackage.AbstractC10593v00
    public final void H(C7849n00 c7849n00, Object obj) {
        int i;
        int i2;
        Object obj2;
        final b bVar = (b) obj;
        OJ1 oj1 = ((C2344Sb) this.A).a;
        final InterfaceC9738sX interfaceC9738sX = this.D;
        final U80 u80 = this.E;
        final AbstractC9896sy0 abstractC9896sy0 = this.H;
        C8367oX c8367oX = this.F;
        C7706mc c7706mc = this.K;
        final QP0 qp0 = this.I;
        final QP0 qp02 = this.f11475J;
        C2474Tb c2474Tb = (C2474Tb) this.z;
        float f = c2474Tb.a;
        int i3 = c2474Tb.c;
        C8737pc c8737pc = c2474Tb.b;
        if (c7706mc.h() != null) {
            if (c7706mc.h().i() == null && c7706mc.h().h() == null) {
                return;
            }
            bVar.k = new MJ1() { // from class: Xb
                @Override // defpackage.MJ1
                public final void onResult(Object obj3) {
                    EnumC11438xU enumC11438xU = EnumC11438xU.H;
                    AbstractC9896sy0.this.d(enumC11438xU, "Unable to parse Lottie animation", u80, (Throwable) obj3);
                }
            };
            if (oj1 != null && (obj2 = oj1.a) != null) {
                bVar.j((C8985qJ1) obj2);
            } else {
                if (c7706mc.h().i() != null) {
                    return;
                }
                if (c7706mc.h().h() != null) {
                    String h = c7706mc.h().h();
                    String h2 = c7706mc.h().h();
                    bVar.k(AbstractC11728yJ1.a(h2, new CallableC11042wJ1(new ByteArrayInputStream(h.getBytes()), h2)));
                }
            }
            int b = c7706mc.b(26);
            int i4 = b != 0 ? c7706mc.b.getInt(b + c7706mc.a) : 0;
            ImageView.ScaleType scaleType = i4 != 1 ? i4 != 3 ? i4 != 4 ? ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_XY;
            bVar.setScaleType(scaleType);
            boolean equals = ImageView.ScaleType.FIT_XY.equals(scaleType);
            JJ1 jj1 = bVar.m;
            if (equals) {
                jj1.s = false;
            }
            int b2 = c7706mc.b(12);
            jj1.h.h = b2 != 0 ? c7706mc.b.getFloat(b2 + c7706mc.a) : 1.0f;
            int b3 = c7706mc.b(6);
            jj1.h.setRepeatCount(b3 != 0 && c7706mc.b.get(b3 + c7706mc.a) != 0 ? -1 : 0);
            boolean l = RP0.l(c7706mc.h(), c8737pc);
            if (l && f > 0.0f && c7706mc.j() != null) {
                jj1.k(f);
                bVar.g();
            } else if (!l || i3 <= 0 || c7706mc.i() == null) {
                int b4 = c7706mc.b(10);
                jj1.k(b4 != 0 ? c7706mc.b.getFloat(b4 + c7706mc.a) : 0.0f);
            } else {
                jj1.h(i3);
                bVar.g();
            }
            if (c7849n00.f == null) {
                i = 1;
                i2 = 0;
            } else {
                i = 1;
                i2 = 0;
                c7849n00.n(new C6383ik3(Integer.MIN_VALUE, Float.valueOf(0.0f)));
            }
            if (c7849n00.f != null) {
                Object[] objArr = new Object[i];
                objArr[i2] = Integer.valueOf(i2);
                c7849n00.n(new C6383ik3(-2147483646, objArr));
            }
            if (c7706mc.i() != null) {
                C7018kc i5 = c7706mc.i();
                if (i5.i() <= i5.h()) {
                    jj1.i(i5.i(), i5.h());
                    if (qp0 != null && i5.i() != i5.h()) {
                        jj1.h.addListener(new C9953t74(new Runnable() { // from class: Yb
                            @Override // java.lang.Runnable
                            public final void run() {
                                CommandOuterClass$Command a = qp0.a();
                                C2794Vn a2 = AbstractC9053qX.a();
                                a2.e = AbstractC10639v74.a(null, AbstractC10639v74.b(bVar));
                                a2.h = ((C3184Yn) u80).v;
                                ((C10081tX) InterfaceC9738sX.this).a(a, a2.a(), 2).c();
                            }
                        }));
                    }
                }
            } else if (c7706mc.j() != null) {
                C7362lc j = c7706mc.j();
                if (j.i() <= j.h()) {
                    jj1.j(j.i(), j.h());
                    if (qp02 != null && j.i() != j.h()) {
                        jj1.h.addListener(new C9953t74(new Runnable() { // from class: Zb
                            @Override // java.lang.Runnable
                            public final void run() {
                                CommandOuterClass$Command a = qp02.a();
                                C2794Vn a2 = AbstractC9053qX.a();
                                a2.e = AbstractC10639v74.a(null, AbstractC10639v74.b(bVar));
                                a2.h = ((C3184Yn) u80).v;
                                ((C10081tX) InterfaceC9738sX.this).a(a, a2.a(), 2).c();
                            }
                        }));
                    }
                }
            }
            int b5 = c7706mc.b(16);
            if ((b5 != 0 ? c7706mc.b.getInt(b5 + c7706mc.a) : i2) == 1) {
                bVar.f();
            } else {
                bVar.d();
            }
            int b6 = c7706mc.b(28);
            if (((b6 == 0 || c7706mc.b.get(b6 + c7706mc.a) == 0) ? i2 : 1) != 0) {
                if ((c7849n00.a.getResources().getConfiguration().getLayoutDirection() == 1 ? 1 : i2) != 0) {
                    final PointF pointF = new PointF();
                    C3926bc c3926bc = new C3926bc(pointF);
                    if (bVar.A != null) {
                        pointF.x = r4.i.width();
                    }
                    bVar.x.add(c3926bc);
                    C8847pu1 c8847pu1 = C8847pu1.c;
                    jj1.b(c8847pu1, NJ1.e, new C8642pJ1(new InterfaceC2738Vb3() { // from class: cc
                        @Override // defpackage.InterfaceC2738Vb3
                        public final Object getValue() {
                            return pointF;
                        }
                    }));
                    jj1.b(c8847pu1, NJ1.m, new C8642pJ1(new InterfaceC2738Vb3() { // from class: dc
                        @Override // defpackage.InterfaceC2738Vb3
                        public final Object getValue() {
                            return AbstractC4956ec.a;
                        }
                    }));
                }
            }
            if (c8367oX != null) {
                c8367oX.b.put(bVar, new InterfaceC8710pX() { // from class: ac
                    @Override // defpackage.InterfaceC8710pX
                    public final C2794Vn a(C2794Vn c2794Vn) {
                        C8394oc b7 = AbstractC10639v74.b(b.this);
                        C2924Wn a = c2794Vn.a();
                        C2794Vn c2794Vn2 = new C2794Vn(a);
                        c2794Vn2.e = AbstractC10639v74.a(a.e, b7);
                        return c2794Vn2;
                    }
                });
            }
        }
    }

    @Override // defpackage.AbstractC10593v00
    public final void M(C7849n00 c7849n00, Object obj) {
        float f;
        float f2;
        b bVar = (b) obj;
        C2474Tb c2474Tb = (C2474Tb) this.z;
        float f3 = c2474Tb.a;
        int i = c2474Tb.c;
        C8367oX c8367oX = this.F;
        C7706mc c7706mc = this.K;
        int b = c7706mc.b(6);
        if (!((b == 0 || c7706mc.b.get(b + c7706mc.a) == 0) ? false : true)) {
            if (f3 >= 0.0f && c7706mc.j() != null) {
                SJ1 sj1 = bVar.m.h;
                C8985qJ1 c8985qJ1 = sj1.o;
                if (c8985qJ1 == null) {
                    f = 0.0f;
                } else {
                    float f4 = sj1.k;
                    float f5 = c8985qJ1.j;
                    f = (f4 - f5) / (c8985qJ1.k - f5);
                }
                if (Float.compare(f, c7706mc.j().h()) < 0) {
                    SJ1 sj12 = bVar.m.h;
                    C8985qJ1 c8985qJ12 = sj12.o;
                    if (c8985qJ12 == null) {
                        f2 = 0.0f;
                    } else {
                        float f6 = sj12.k;
                        float f7 = c8985qJ12.j;
                        f2 = (f6 - f7) / (c8985qJ12.k - f7);
                    }
                    if (c7849n00.f != null) {
                        c7849n00.m(new C6383ik3(0, Float.valueOf(f2)), "updateState:AnimatedType.updateSavedAnimationProgress");
                    }
                }
            }
            if (i >= 0 && c7706mc.i() != null) {
                int h = c7706mc.i().h();
                float f8 = bVar.m.h.k;
                if (h > ((int) f8)) {
                    int i2 = (int) f8;
                    if (c7849n00.f != null) {
                        c7849n00.m(new C6383ik3(1, Integer.valueOf(i2)), "updateState:AnimatedType.updateSavedFrameProgress");
                    }
                }
            }
        }
        bVar.clearAnimation();
        JJ1 jj1 = bVar.m;
        jj1.k(0.0f);
        bVar.d();
        jj1.h.removeAllListeners();
        if (c8367oX != null) {
            c8367oX.b.remove(bVar);
        }
        C8737pc h2 = c7706mc.h();
        if (c7849n00.f == null) {
            return;
        }
        c7849n00.m(new C6383ik3(2, h2), "updateState:AnimatedType.updateSavedAnimationSource");
    }

    @Override // defpackage.AbstractC10593v00
    public final boolean S(WZ wz, WZ wz2) {
        C2734Vb c2734Vb = (C2734Vb) wz;
        C2734Vb c2734Vb2 = (C2734Vb) wz2;
        C7706mc c7706mc = c2734Vb == null ? null : c2734Vb.K;
        C7706mc c7706mc2 = c2734Vb2.K;
        String str = c2734Vb != null ? c2734Vb.G : null;
        String str2 = c2734Vb2.G;
        if (c2734Vb != null) {
            float f = ((C2474Tb) c2734Vb.z).a;
        }
        AbstractC6726jk3 abstractC6726jk3 = c2734Vb2.z;
        float f2 = ((C2474Tb) abstractC6726jk3).a;
        if (c2734Vb != null) {
            int i = ((C2474Tb) c2734Vb.z).c;
        }
        int i2 = ((C2474Tb) abstractC6726jk3).c;
        return (RP0.l(c7706mc, c7706mc2) && ((str != null || str2 != null) ? (str == null || str2 == null) ? false : str.equals(str2) : true)) ? false : true;
    }

    @Override // defpackage.AbstractC10593v00
    public final void T(AbstractC6726jk3 abstractC6726jk3, AbstractC6726jk3 abstractC6726jk32) {
        C2474Tb c2474Tb = (C2474Tb) abstractC6726jk3;
        C2474Tb c2474Tb2 = (C2474Tb) abstractC6726jk32;
        c2474Tb2.a = c2474Tb.a;
        c2474Tb2.b = c2474Tb.b;
        c2474Tb2.c = c2474Tb.c;
    }
}
