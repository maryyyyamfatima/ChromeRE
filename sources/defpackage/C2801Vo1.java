package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Vo1 */
/* loaded from: classes.dex */
public final class C2801Vo1 implements InterfaceC6525j84 {
    public static final C6492j31 c = C6492j31.k("com/google/chrome/elements/ve/InteractionLogger");
    public final BT a;
    public final CS b;

    public C2801Vo1(BT bt, CS cs) {
        this.a = bt;
        this.b = cs;
    }

    public final void a(C10409uU c10409uU, Ef4 ef4, C10275u41 c10275u41) {
        Object a;
        CS cs = this.b;
        if (cs.a.c) {
            if ((c10409uU.j & 256) != 0) {
                int i = c10409uU.s;
                if (ef4.h) {
                    ef4.l();
                    ef4.h = false;
                }
                Ff4 ff4 = (Ff4) ef4.g;
                ff4.k |= 128;
                ff4.q = i;
            }
            OX0 ox0 = C9614s82.l;
            KU ku = c10409uU.t;
            if (ku == null) {
                ku = KU.l;
            }
            OX0 ox02 = C2930Wo0.o;
            ku.getClass();
            ox02.getClass();
            ku.v(ox02);
            C5563gM0 c5563gM0 = ku.j;
            NX0 nx0 = ox02.d;
            Object c2 = c5563gM0.c(nx0);
            if (c2 == null) {
                a = ox02.b;
            } else {
                nx0.getClass();
                a = ox02.a(c2);
            }
            C5493g82 c5493g82 = ((C2930Wo0) a).k;
            if (c5493g82 == null) {
                c5493g82 = C5493g82.n;
            }
            JX0 jx0 = (JX0) c5493g82.l(PX0.NEW_BUILDER);
            jx0.m(c5493g82);
            C5149f82 c5149f82 = (C5149f82) jx0;
            if (c5149f82.h) {
                c5149f82.l();
                c5149f82.h = false;
            }
            C5493g82 c5493g822 = (C5493g82) c5149f82.g;
            c5493g822.getClass();
            c5493g822.l = 7;
            c5493g822.k |= 4;
            ef4.p(ox0, (C5493g82) c5149f82.j());
            LU lu = (LU) MU.s.j();
            AtomicInteger atomicInteger = AbstractC5602gU.a;
            TD0 td0 = TD0.n;
            SD0 sd0 = (SD0) td0.j();
            long andIncrement = AbstractC5602gU.a.getAndIncrement();
            if (sd0.h) {
                sd0.l();
                sd0.h = false;
            }
            TD0 td02 = (TD0) sd0.g;
            td02.j |= 2;
            td02.l = andIncrement;
            if (sd0.h) {
                sd0.l();
                sd0.h = false;
            }
            TD0 td03 = (TD0) sd0.g;
            td03.getClass();
            VD0 vd0 = AbstractC5602gU.b;
            vd0.getClass();
            td03.k = vd0;
            td03.j |= 1;
            TD0 td04 = (TD0) sd0.j();
            if (lu.h) {
                lu.l();
                lu.h = false;
            }
            MU mu = (MU) lu.g;
            mu.getClass();
            td04.getClass();
            mu.k = td04;
            mu.j = 1 | mu.j;
            VT vt = c10409uU.l;
            if (vt == null) {
                vt = VT.v;
            }
            TD0 td05 = vt.s;
            if (td05 != null) {
                td0 = td05;
            }
            if (lu.h) {
                lu.l();
                lu.h = false;
            }
            MU mu2 = (MU) lu.g;
            mu2.getClass();
            mu2.l = td0;
            mu2.j |= 2;
            Ff4 ff42 = (Ff4) ef4.j();
            if (lu.h) {
                lu.l();
                lu.h = false;
            }
            MU mu3 = (MU) lu.g;
            mu3.getClass();
            ff42.getClass();
            mu3.o = ff42;
            mu3.j |= 16;
            if (c10275u41 != null) {
                if (lu.h) {
                    lu.l();
                    lu.h = false;
                }
                MU mu4 = (MU) lu.g;
                mu4.getClass();
                mu4.p = c10275u41;
                mu4.j |= 64;
            }
            MU mu5 = (MU) lu.j();
            BT bt = this.a;
            bt.getClass();
            if (cs.a.c) {
                bt.c.execute(new RunnableC11776yT(bt, cs, 2, null, mu5, 2));
            } else {
                ((InterfaceC5462g31) BT.e.b().g("com/google/chrome/elements/ve/ClearcutLogSender", 82, "send", "ClearcutLogSender.java")).d(2, "Dropping interaction {eventCode=%d}");
            }
        }
    }

    public final void b(int i, C10409uU c10409uU) {
        VT vt = c10409uU.l;
        if (vt == null) {
            vt = VT.v;
        }
        InterfaceC5462g31 interfaceC5462g31 = (InterfaceC5462g31) c.b().g("com/google/chrome/elements/ve/InteractionLogger", 124, "logVeGraft", "InteractionLogger.java");
        VT vt2 = c10409uU.l;
        if (vt2 == null) {
            vt2 = VT.v;
        }
        interfaceC5462g31.j(vt2.n, AbstractC8904q41.a(i));
        Ef4 ef4 = (Ef4) Ff4.y.j();
        C9932t41 c9932t41 = (C9932t41) C10275u41.l.j();
        C8561p41 c8561p41 = (C8561p41) C9589s41.n.j();
        if (c8561p41.h) {
            c8561p41.l();
            c8561p41.h = false;
        }
        C9589s41 c9589s41 = (C9589s41) c8561p41.g;
        c9589s41.getClass();
        if (i == 0) {
            throw null;
        }
        c9589s41.l = i - 1;
        c9589s41.j |= 2;
        C10618v41 c10618v41 = (C10618v41) C10961w41.o.j();
        if (c10618v41.h) {
            c10618v41.l();
            c10618v41.h = false;
        }
        C10961w41 c10961w41 = (C10961w41) c10618v41.g;
        c10961w41.getClass();
        c10961w41.m = vt;
        c10961w41.l = 2;
        TD0 td0 = vt.s;
        if (td0 == null) {
            td0 = TD0.n;
        }
        if (c10618v41.h) {
            c10618v41.l();
            c10618v41.h = false;
        }
        C10961w41 c10961w412 = (C10961w41) c10618v41.g;
        c10961w412.getClass();
        c10961w412.k = td0;
        c10961w412.j = 3;
        if (c8561p41.h) {
            c8561p41.l();
            c8561p41.h = false;
        }
        C9589s41 c9589s412 = (C9589s41) c8561p41.g;
        C10961w41 c10961w413 = (C10961w41) c10618v41.j();
        c9589s412.getClass();
        c10961w413.getClass();
        c9589s412.k = c10961w413;
        c9589s412.j |= 1;
        if (c9932t41.h) {
            c9932t41.l();
            c9932t41.h = false;
        }
        C10275u41 c10275u41 = (C10275u41) c9932t41.g;
        C9589s41 c9589s413 = (C9589s41) c8561p41.j();
        c10275u41.getClass();
        c9589s413.getClass();
        InterfaceC1377Kp1 interfaceC1377Kp1 = c10275u41.j;
        if (!((AbstractC7504m0) interfaceC1377Kp1).a) {
            c10275u41.j = QX0.r(interfaceC1377Kp1);
        }
        c10275u41.j.add(c9589s413);
        a(c10409uU, ef4, (C10275u41) c9932t41.j());
    }
}
