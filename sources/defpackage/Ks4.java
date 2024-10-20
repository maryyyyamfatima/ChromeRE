package defpackage;

import android.app.Activity;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import j$.util.Optional;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Ks4 implements InterfaceC4365cs, TV3 {
    public final Activity a;
    public final Ss4 b;
    public final C2669Uo c;
    public final ViewGroup d;
    public final HashSet e = new HashSet();
    public final HashSet f = new HashSet();
    public final HashSet g = new HashSet();
    public EnumC10787va4 h = EnumC10787va4.DEFAULT;
    public EnumC10444ua4 i;
    public C6325ia4 j;

    public Ks4(Ss4 ss4, Activity activity, C6673jb4 c6673jb4, boolean z, C3697av0 c3697av0, ViewGroup viewGroup) {
        this.a = activity;
        this.b = ss4;
        this.c = new C2669Uo(c6673jb4.k, c3697av0, z);
        this.d = viewGroup;
    }

    public final void g() {
        Hs4 hs4;
        c(EnumC10444ua4.INIT_START);
        Ss4 ss4 = this.b;
        Rs4 rs4 = ss4.c;
        ViewGroup viewGroup = this.d;
        if (rs4 == null) {
            ss4.c = new Rs4(viewGroup.getContext());
        }
        Activity activity = this.a;
        C2669Uo c2669Uo = this.c;
        ss4.i.put(viewGroup, new Ps4(activity, c2669Uo, this, this));
        ss4.d.add(this);
        ViewGroup viewGroup2 = ss4.n;
        if (viewGroup2 == null || viewGroup2 == viewGroup) {
            if ((ss4.k != 3) && ss4.m == null) {
                ss4.g(viewGroup);
                ss4.e();
                C2669Uo c2669Uo2 = ss4.c(viewGroup).b;
                if (!c2669Uo2.a.isEmpty() && (hs4 = ss4.j) != null) {
                    Ss4.i(hs4, c2669Uo2);
                }
            }
        }
        if (c2669Uo.c) {
            viewGroup.setAlpha(0.0f);
            viewGroup.setBackgroundColor(-16777216);
        }
        d(EnumC10444ua4.INIT_END);
    }

    @Override // defpackage.InterfaceC4365cs
    public final void f() {
        h();
    }

    public final void h() {
        d(EnumC10444ua4.LOAD_START);
        final Ss4 ss4 = this.b;
        ss4.m = null;
        if (ss4.k != 3) {
            ViewGroup viewGroup = this.d;
            final C2669Uo c2669Uo = ss4.c(viewGroup).b;
            if (c2669Uo.a.isEmpty()) {
                return;
            }
            ss4.g(viewGroup);
            Rs4 rs4 = ss4.c;
            boolean z = c2669Uo.c;
            rs4.a = z;
            ((TK0) ss4.g).e(3, z);
            Ps4 c = ss4.c(viewGroup);
            c.f = false;
            c.g = false;
            ss4.m = new Runnable() { // from class: Ms4
                @Override // java.lang.Runnable
                public final void run() {
                    Hs4 hs4 = Ss4.this.j;
                    C2669Uo c2669Uo2 = c2669Uo;
                    Ss4.i(hs4, c2669Uo2);
                    Qt4 qt4 = Tt4.a;
                    boolean z2 = c2669Uo2.c;
                    C6781jt4 c6781jt4 = hs4.b0;
                    if (z2) {
                        Xt4 xt4 = c6781jt4.g;
                        xt4.j = qt4;
                        xt4.i = new Et4(xt4);
                        xt4.e();
                        return;
                    }
                    Xt4 xt42 = c6781jt4.g;
                    xt42.j = qt4;
                    xt42.i = new Gt4(xt42);
                    xt42.e();
                }
            };
            if (AbstractC2373Sg3.a(ss4.k, 5)) {
                ss4.m.run();
                ss4.m = null;
            } else {
                ss4.e();
            }
        }
    }

    @Override // defpackage.InterfaceC4365cs
    public final void stop() {
        c(EnumC10444ua4.PLAYBACK_NOT_VISIBLE);
        Ss4 ss4 = this.b;
        ViewGroup viewGroup = ss4.n;
        ViewGroup viewGroup2 = this.d;
        if (viewGroup != viewGroup2) {
            return;
        }
        C2669Uo c2669Uo = ss4.c(viewGroup2).b;
        if (c2669Uo.c && ss4.c(viewGroup2).f) {
            ((TK0) ss4.g).e(0, c2669Uo.c);
        }
        ss4.m = null;
        Hs4 hs4 = ss4.j;
        if (hs4 != null) {
            Xt4 xt4 = hs4.b0.g;
            xt4.getClass();
            It4 it4 = new It4(xt4);
            xt4.j = it4;
            if (xt4.f != null) {
                try {
                    it4.a();
                    xt4.j = Tt4.a;
                } catch (RemoteException unused) {
                    Pu4.a("Problem communicating with YouTube service.", new Object[0]);
                }
            }
        }
        if (ss4.c(viewGroup2).b.c) {
            ss4.g(null);
        }
    }

    public final void k(EnumC10787va4 enumC10787va4) {
        if (enumC10787va4.equals(this.h)) {
            return;
        }
        boolean z = this.c.c;
        EnumC10787va4 enumC10787va42 = EnumC10787va4.PLAYING;
        if (z) {
            boolean equals = enumC10787va4.equals(enumC10787va42);
            ViewGroup viewGroup = this.d;
            if (equals || enumC10787va4.equals(EnumC10787va4.SUSPENDED)) {
                viewGroup.setAlpha(1.0f);
            } else if (viewGroup.getAlpha() == 1.0f) {
                viewGroup.setAlpha(0.5f);
                viewGroup.animate().alpha(0.0f).setDuration(100L);
            }
        }
        EnumC10787va4 enumC10787va43 = this.h;
        this.h = enumC10787va4;
        int ordinal = enumC10787va4.ordinal();
        EnumC10444ua4 enumC10444ua4 = EnumC10444ua4.PLAYBACK_PAUSE;
        if (ordinal != 0) {
            EnumC10444ua4 enumC10444ua42 = EnumC10444ua4.LOAD_END;
            EnumC10444ua4 enumC10444ua43 = EnumC10444ua4.LOAD_START;
            if (ordinal == 2) {
                if (enumC10444ua43.equals(this.i)) {
                    c(enumC10444ua42);
                }
                c(EnumC10444ua4.PLAY);
            } else if (ordinal == 3) {
                if (enumC10444ua43.equals(this.i)) {
                    c(enumC10444ua42);
                } else {
                    c(enumC10444ua4);
                }
            }
        } else if (enumC10787va43.equals(enumC10787va42)) {
            c(enumC10444ua4);
        }
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((InterfaceC11130wa4) it.next()).a(enumC10787va4);
        }
    }

    public final void i() {
        Ss4 ss4 = this.b;
        ViewGroup viewGroup = ss4.n;
        ViewGroup viewGroup2 = this.d;
        if (viewGroup == viewGroup2) {
            ss4.m = null;
            Hs4 hs4 = ss4.j;
            if (hs4 != null) {
                Xt4 xt4 = hs4.b0.g;
                Qt4 qt4 = Tt4.a;
                xt4.i = qt4;
                xt4.j = qt4;
                xt4.l = qt4;
                Aw4 aw4 = xt4.f;
                if (aw4 != null) {
                    try {
                        ww4 ww4Var = (ww4) aw4;
                        ww4Var.h(7, ww4Var.a());
                    } catch (RemoteException unused) {
                        Pu4.a("Problem communicating with YouTube service.", new Object[0]);
                    }
                }
            }
            if (ss4.k == 4) {
                ss4.j = null;
                ss4.k = 1;
            }
            if (ss4.c(viewGroup2).b.c) {
                ss4.g(null);
            }
        }
        if (ss4.n == viewGroup2) {
            ss4.g(null);
        }
        Cv4 cv4 = ss4.l;
        if (cv4 != null) {
            synchronized (cv4) {
                cv4.g.remove(ss4);
            }
            ss4.l = null;
        }
        Ks4 ks4 = ss4.c(viewGroup2).c;
        if (ks4 != null) {
            ss4.d.remove(ks4);
        }
        ss4.i.remove(viewGroup2);
        viewGroup2.setBackgroundColor(0);
        this.g.clear();
        k(EnumC10787va4.DEFAULT);
        viewGroup2.animate().cancel();
        viewGroup2.setAlpha(1.0f);
    }

    public final void c(EnumC10444ua4 enumC10444ua4) {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            Ha4 ha4 = (Ha4) ((Ga4) it.next());
            ha4.getClass();
            int ordinal = enumC10444ua4.ordinal();
            boolean z = ha4.b;
            C9758sa4 c9758sa4 = ha4.a;
            switch (ordinal) {
                case 0:
                    if (!z) {
                        c9758sa4.d(1);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (!z) {
                        c9758sa4.d(2);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (!z) {
                        c9758sa4.d(4);
                        break;
                    } else {
                        c9758sa4.d(7);
                        break;
                    }
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                    if (!z) {
                        c9758sa4.d(5);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (!z) {
                        break;
                    } else {
                        c9758sa4.d(8);
                        c9758sa4.a(e(), 4);
                        break;
                    }
                case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                    if (!z) {
                        c9758sa4.d(6);
                        c9758sa4.a(e(), 2);
                        break;
                    } else {
                        c9758sa4.d(8);
                        c9758sa4.a(e(), 3);
                        break;
                    }
                case 6:
                    c9758sa4.b(4, Optional.empty());
                    break;
                case 7:
                    c9758sa4.b(3, Optional.empty());
                    break;
                case 8:
                    c9758sa4.b(6, Optional.empty());
                    break;
                case 9:
                    c9758sa4.b(13, Optional.empty());
                    break;
                case 10:
                    if (!z) {
                        c9758sa4.b(8, Optional.empty());
                        break;
                    } else {
                        c9758sa4.b(5, Optional.empty());
                        break;
                    }
            }
        }
        this.i = enumC10444ua4;
    }

    public final void b(Ib4 ib4) {
        Nb4 nb4;
        Iterator it = this.f.iterator();
        while (true) {
            Lb4 lb4 = null;
            if (!it.hasNext()) {
                this.i = null;
                return;
            }
            C9758sa4 c9758sa4 = ((Ha4) ((Ga4) it.next())).a;
            int a = Gb4.a(ib4.k);
            if (a == 0) {
                a = 1;
            }
            boolean z = ib4.l;
            c9758sa4.getClass();
            Fb4 fb4 = (Fb4) Ib4.m.j();
            if (fb4.h) {
                fb4.l();
                fb4.h = false;
            }
            Ib4 ib42 = (Ib4) fb4.g;
            ib42.getClass();
            ib42.k = AbstractC2373Sg3.b(a);
            ib42.j |= 1;
            if (fb4.h) {
                fb4.l();
                fb4.h = false;
            }
            Ib4 ib43 = (Ib4) fb4.g;
            ib43.j |= 2;
            ib43.l = z;
            Ib4 ib44 = (Ib4) fb4.j();
            Nb4 nb42 = c9758sa4.l;
            if (nb42 != null) {
                long j = ((Qb4) nb42.g).l;
                if (nb42.h) {
                    nb42.l();
                    nb42.h = false;
                }
                Qb4 qb4 = (Qb4) nb42.g;
                qb4.getClass();
                qb4.k = 12;
                qb4.j |= 2;
                c9758sa4.e.getClass();
                long currentTimeMillis = (System.currentTimeMillis() - c9758sa4.j) + j;
                if (nb42.h) {
                    nb42.l();
                    nb42.h = false;
                }
                Qb4 qb42 = (Qb4) nb42.g;
                qb42.j |= 8;
                qb42.m = currentTimeMillis;
                Mb4 mb4 = c9758sa4.m;
                if (mb4 != null && (nb4 = c9758sa4.l) != null) {
                    mb4.o(nb4);
                }
            }
            Mb4 mb42 = c9758sa4.m;
            Sb4 sb4 = mb42 == null ? null : (Sb4) mb42.j();
            Kb4 kb4 = c9758sa4.k;
            if (kb4 != null) {
                lb4 = (Lb4) kb4.j();
            }
            c9758sa4.c(lb4, sb4, ib44, true);
        }
    }

    @Override // defpackage.TV3
    public final C1759No a() {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            Ha4 ha4 = (Ha4) ((Ga4) it.next());
            ha4.getClass();
            ha4.a.b(9, Optional.empty());
        }
        this.i = null;
        return new C1759No(Optional.of(e()));
    }

    public final void d(EnumC10444ua4 enumC10444ua4) {
        boolean a = AbstractC2373Sg3.a(this.b.k, 5);
        HashSet hashSet = this.g;
        if (a) {
            c(enumC10444ua4);
            hashSet.remove(enumC10444ua4);
        } else {
            hashSet.add(enumC10444ua4);
        }
    }

    public final C3697av0 e() {
        Ss4 ss4 = this.b;
        if (this.d != ss4.n) {
            return C3697av0.b;
        }
        return ss4.d();
    }

    public final void j(boolean z) {
        Hs4 hs4;
        Ss4 ss4 = this.b;
        ViewGroup viewGroup = ss4.n;
        ViewGroup viewGroup2 = this.d;
        if (viewGroup == viewGroup2) {
            EnumC10787va4 enumC10787va4 = ss4.o;
            if (enumC10787va4 == null) {
                enumC10787va4 = EnumC10787va4.DEFAULT;
            }
            int ordinal = enumC10787va4.ordinal();
            boolean z2 = true;
            if (ordinal != 1 && ordinal != 2 && ordinal != 3 && ordinal != 4) {
                z2 = false;
            }
            if (z2 && (hs4 = ss4.j) != null) {
                Xt4 xt4 = hs4.b0.g;
                xt4.getClass();
                Nt4 nt4 = new Nt4(xt4, z);
                xt4.l = nt4;
                if (xt4.f != null) {
                    try {
                        nt4.a();
                        xt4.l = Tt4.a;
                        return;
                    } catch (RemoteException unused) {
                        Pu4.a("Problem communicating with YouTube service.", new Object[0]);
                        return;
                    }
                }
                return;
            }
        }
        ss4.c(viewGroup2).e = z ? 2 : 3;
    }
}
