package defpackage;

import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tU */
/* loaded from: classes.dex */
public final class C10066tU implements InterfaceC9298rD2 {
    public static final C6492j31 c = C6492j31.k("com/google/android/libraries/search/rendering/xuikit/elements/logging/ClientLoggingPropertiesConverter");
    public final C9596s52 a;
    public final Tr4 b;

    @Override // defpackage.InterfaceC11013wD2
    public final /* synthetic */ void c(InterfaceC8177nx0 interfaceC8177nx0) {
        throw null;
    }

    @Override // defpackage.InterfaceC11013wD2
    public final void e(C7849n00 c7849n00, U80 u80, String str, Object obj, InterfaceC8177nx0 interfaceC8177nx0, C8367oX c8367oX) {
        final C10409uU c10409uU = (C10409uU) obj;
        C3998bo c3998bo = ((C3184Yn) u80).v;
        Object obj2 = c3998bo != null ? c3998bo.f : null;
        if (obj2 instanceof C5745gs4) {
            C5745gs4 c5745gs4 = (C5745gs4) obj2;
            final InterfaceC6525j84 interfaceC6525j84 = c5745gs4.a;
            if (c10409uU.o) {
                interfaceC8177nx0.b(new InterfaceC7145kx0() { // from class: nU
                    @Override // defpackage.InterfaceC7145kx0
                    public final void a(View view, C1629Mo c1629Mo) {
                        C10066tU c10066tU = C10066tU.this;
                        c10066tU.getClass();
                        final InterfaceC6525j84 interfaceC6525j842 = interfaceC6525j84;
                        final C10409uU c10409uU2 = c10409uU;
                        Runnable runnable = new Runnable() { // from class: qU
                            @Override // java.lang.Runnable
                            public final void run() {
                                C2801Vo1 c2801Vo1 = (C2801Vo1) InterfaceC6525j84.this;
                                c2801Vo1.getClass();
                                C10409uU c10409uU3 = c10409uU2;
                                VT vt = c10409uU3.l;
                                if (vt == null) {
                                    vt = VT.v;
                                }
                                ((InterfaceC5462g31) C2801Vo1.c.b().g("com/google/chrome/elements/ve/InteractionLogger", 52, "logTap", "InteractionLogger.java")).d(vt.n, "Logging TAP for VE type %s");
                                Ef4 ef4 = (Ef4) Ff4.y.j();
                                if (ef4.h) {
                                    ef4.l();
                                    ef4.h = false;
                                }
                                Ff4 ff4 = (Ff4) ef4.g;
                                ff4.k |= 16;
                                ff4.p = 4;
                                if (ef4.h) {
                                    ef4.l();
                                    ef4.h = false;
                                }
                                Ff4 ff42 = (Ff4) ef4.g;
                                ff42.getClass();
                                ff42.l = vt;
                                ff42.k |= 1;
                                c2801Vo1.a(c10409uU3, ef4, null);
                            }
                        };
                        c10066tU.a.getClass();
                        runnable.run();
                    }
                });
            }
            if (c10409uU.p) {
                interfaceC8177nx0.e(new InterfaceC6801jx0() { // from class: oU
                    @Override // defpackage.InterfaceC6801jx0
                    public final boolean a(View view, C1629Mo c1629Mo) {
                        C10066tU c10066tU = C10066tU.this;
                        c10066tU.getClass();
                        final InterfaceC6525j84 interfaceC6525j842 = interfaceC6525j84;
                        final C10409uU c10409uU2 = c10409uU;
                        Runnable runnable = new Runnable() { // from class: rU
                            @Override // java.lang.Runnable
                            public final void run() {
                                C2801Vo1 c2801Vo1 = (C2801Vo1) InterfaceC6525j84.this;
                                c2801Vo1.getClass();
                                C10409uU c10409uU3 = c10409uU2;
                                VT vt = c10409uU3.l;
                                if (vt == null) {
                                    vt = VT.v;
                                }
                                ((InterfaceC5462g31) C2801Vo1.c.b().g("com/google/chrome/elements/ve/InteractionLogger", 76, "logLongPress", "InteractionLogger.java")).d(vt.n, "Logging LONG_PRESS for VE type %s");
                                Ef4 ef4 = (Ef4) Ff4.y.j();
                                if (ef4.h) {
                                    ef4.l();
                                    ef4.h = false;
                                }
                                Ff4 ff4 = (Ff4) ef4.g;
                                ff4.k |= 16;
                                ff4.p = 31;
                                if (ef4.h) {
                                    ef4.l();
                                    ef4.h = false;
                                }
                                Ff4 ff42 = (Ff4) ef4.g;
                                ff42.getClass();
                                ff42.l = vt;
                                ff42.k |= 1;
                                c2801Vo1.a(c10409uU3, ef4, null);
                            }
                        };
                        c10066tU.a.getClass();
                        runnable.run();
                        return true;
                    }
                });
            }
            int a = Gf4.a(c10409uU.m);
            if (a == 0) {
                a = 1;
            }
            if (a == 2) {
                interfaceC8177nx0.h(new InterfaceC7833mx0() { // from class: pU
                    public final void a(View view) {
                        C10066tU c10066tU = C10066tU.this;
                        c10066tU.getClass();
                        c10066tU.a.getClass();
                        ((C2801Vo1) interfaceC6525j84).b(2, c10409uU);
                    }

                    @Override // defpackage.InterfaceC7833mx0
                    public final void b(View view, View view2) {
                        a(view);
                    }
                });
            }
            if (c10409uU.q) {
                C9723sU c9723sU = new C9723sU(this, c5745gs4.b.a, c10409uU, u80);
                interfaceC8177nx0.c(c9723sU);
                interfaceC8177nx0.d(c9723sU);
            }
        }
    }

    public C10066tU(C9596s52 c9596s52, Tr4 tr4) {
        this.a = c9596s52;
        this.b = tr4;
    }

    @Override // defpackage.InterfaceC9298rD2
    public final OX0 a() {
        return C10409uU.x;
    }
}
