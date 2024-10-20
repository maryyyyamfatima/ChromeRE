package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import j$.util.Optional;
import j$.util.function.Consumer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sa4 */
/* loaded from: classes.dex */
public final class C9758sa4 {
    public final String a;
    public final String b;
    public final int c;
    public final Eb4 d;
    public final C6442iu3 e;
    public final int f;
    public final boolean g;
    public final Consumer h;
    public boolean i;
    public long j;
    public Kb4 k;
    public Nb4 l;
    public Mb4 m;

    public C9758sa4(C6442iu3 c6442iu3, C2317Rv2 c2317Rv2, Consumer consumer) {
        C7017kb4 c7017kb4;
        String str;
        int i;
        C6331ib4 c6331ib4;
        C6331ib4 c6331ib42;
        C6673jb4 c6673jb4;
        C5052es c5052es;
        int i2 = c2317Rv2.j;
        if (!(i2 == 2)) {
            c7017kb4 = i2 == 1 ? (C7017kb4) c2317Rv2.k : C7017kb4.r;
        } else {
            if (i2 == 2) {
                c5052es = (C5052es) c2317Rv2.k;
            } else {
                c5052es = C5052es.l;
            }
            c7017kb4 = c5052es.k;
            if (c7017kb4 == null) {
                c7017kb4 = C7017kb4.r;
            }
        }
        int i3 = c7017kb4.k;
        Eb4 eb4 = null;
        if (i3 == 1) {
            if (i3 == 1) {
                c6673jb4 = (C6673jb4) c7017kb4.l;
            } else {
                c6673jb4 = C6673jb4.l;
            }
            str = c6673jb4.k;
        } else {
            str = null;
        }
        this.a = str;
        this.b = i3 == 1 ? null : c7017kb4.o;
        this.h = consumer;
        this.e = c6442iu3;
        int i4 = c7017kb4.k;
        if (i4 == 2) {
            if (i4 != 2) {
                c6331ib42 = C6331ib4.o;
            } else {
                c6331ib42 = (C6331ib4) c7017kb4.l;
            }
            i = SE2.a(c6331ib42.n);
            if (i == 0) {
                i = 1;
            }
        } else {
            i = 0;
        }
        this.c = i;
        int i5 = c7017kb4.k;
        int i6 = 4;
        int b = AbstractC2373Sg3.b(i5 != 0 ? i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 11 ? 0 : 4 : 3 : 2 : 1 : 5);
        if (b == 0) {
            i6 = 2;
        } else if (b == 1) {
            i6 = 3;
        } else if (b != 2) {
            i6 = 1;
        }
        this.f = i6;
        if (c7017kb4.k != 2) {
            c6331ib4 = C6331ib4.o;
        } else {
            c6331ib4 = (C6331ib4) c7017kb4.l;
        }
        this.g = c6331ib4.l.size() > 0;
        int a = AbstractC4612db4.a(c7017kb4.p);
        if (!AbstractC2373Sg3.a(a == 0 ? 1 : a, 1)) {
            Db4 db4 = (Db4) Eb4.m.j();
            int a2 = AbstractC4612db4.a(c7017kb4.p);
            a2 = a2 == 0 ? 1 : a2;
            if (db4.h) {
                db4.l();
                db4.h = false;
            }
            Eb4 eb42 = (Eb4) db4.g;
            eb42.getClass();
            eb42.k = AbstractC2373Sg3.b(a2);
            eb42.j |= 1;
            String str2 = c7017kb4.q;
            if (db4.h) {
                db4.l();
                db4.h = false;
            }
            Eb4 eb43 = (Eb4) db4.g;
            eb43.getClass();
            str2.getClass();
            eb43.j |= 2;
            eb43.l = str2;
            eb4 = (Eb4) db4.j();
        }
        this.d = eb4;
    }

    public final void d(int i) {
        if (this.k == null && (i == 6 || i == 5 || i == 2 || i == 8)) {
            return;
        }
        this.e.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        if (this.k == null) {
            this.k = (Kb4) Lb4.s.j();
        }
        if (i == 0) {
            throw null;
        }
        switch (i - 1) {
            case 0:
                Kb4 kb4 = this.k;
                if (kb4.h) {
                    kb4.l();
                    kb4.h = false;
                }
                Lb4 lb4 = (Lb4) kb4.g;
                lb4.j |= 1;
                lb4.k = currentTimeMillis;
                return;
            case 1:
                Kb4 kb42 = this.k;
                if (kb42.h) {
                    kb42.l();
                    kb42.h = false;
                }
                Lb4 lb42 = (Lb4) kb42.g;
                lb42.j |= 2;
                lb42.l = currentTimeMillis;
                return;
            case 2:
                Kb4 kb43 = this.k;
                if ((((Lb4) kb43.g).j & 16) != 0) {
                    return;
                }
                if (kb43.h) {
                    kb43.l();
                    kb43.h = false;
                }
                Lb4 lb43 = (Lb4) kb43.g;
                lb43.j |= 16;
                lb43.o = currentTimeMillis;
                return;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                Kb4 kb44 = this.k;
                if (kb44.h) {
                    kb44.l();
                    kb44.h = false;
                }
                Lb4 lb44 = (Lb4) kb44.g;
                lb44.j |= 4;
                lb44.m = currentTimeMillis;
                return;
            case 4:
                Kb4 kb45 = this.k;
                if (kb45.h) {
                    kb45.l();
                    kb45.h = false;
                }
                Lb4 lb45 = (Lb4) kb45.g;
                lb45.j |= 8;
                lb45.n = currentTimeMillis;
                return;
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                Kb4 kb46 = this.k;
                if (kb46.h) {
                    kb46.l();
                    kb46.h = false;
                }
                Lb4 lb46 = (Lb4) kb46.g;
                lb46.j |= 32;
                lb46.p = currentTimeMillis;
                c((Lb4) this.k.j(), null, null, true);
                return;
            case 6:
                Kb4 kb47 = this.k;
                if (kb47.h) {
                    kb47.l();
                    kb47.h = false;
                }
                Lb4 lb47 = (Lb4) kb47.g;
                lb47.j |= 64;
                lb47.q = currentTimeMillis;
                return;
            case 7:
                Kb4 kb48 = this.k;
                if (kb48.h) {
                    kb48.l();
                    kb48.h = false;
                }
                Lb4 lb48 = (Lb4) kb48.g;
                lb48.j |= 128;
                lb48.r = currentTimeMillis;
                c((Lb4) this.k.j(), null, null, true);
                return;
            default:
                return;
        }
    }

    public final void a(C3697av0 c3697av0, int i) {
        if (this.l != null) {
            return;
        }
        if (this.m == null) {
            Mb4 mb4 = (Mb4) Sb4.m.j();
            if (mb4.h) {
                mb4.l();
                mb4.h = false;
            }
            Sb4 sb4 = (Sb4) mb4.g;
            sb4.getClass();
            if (i == 0) {
                throw null;
            }
            sb4.k = i - 1;
            sb4.j |= 1;
            this.m = mb4;
        }
        Nb4 nb4 = (Nb4) Qb4.o.j();
        if (nb4.h) {
            nb4.l();
            nb4.h = false;
        }
        Qb4 qb4 = (Qb4) nb4.g;
        qb4.j |= 4;
        qb4.l = c3697av0.a;
        this.l = nb4;
        this.e.getClass();
        this.j = System.currentTimeMillis();
    }

    public final void b(int i, Optional optional) {
        Mb4 mb4 = this.m;
        if (mb4 == null) {
            return;
        }
        boolean z = (i == 3 || i == 4) ? false : true;
        Nb4 nb4 = this.l;
        if (nb4 == null && z) {
            int size = ((Sb4) mb4.g).l.size();
            if (size > 0) {
                int i2 = size - 1;
                Qb4 qb4 = (Qb4) ((Sb4) mb4.g).l.get(i2);
                JX0 jx0 = (JX0) qb4.l(PX0.NEW_BUILDER);
                jx0.m(qb4);
                Nb4 nb42 = (Nb4) jx0;
                if (nb42.h) {
                    nb42.l();
                    nb42.h = false;
                }
                Qb4 qb42 = (Qb4) nb42.g;
                qb42.getClass();
                if (i == 0) {
                    throw null;
                }
                qb42.k = i - 1;
                qb42.j |= 2;
                Qb4 qb43 = (Qb4) nb42.j();
                if (mb4.h) {
                    mb4.l();
                    mb4.h = false;
                }
                Sb4 sb4 = (Sb4) mb4.g;
                sb4.getClass();
                qb43.getClass();
                sb4.v();
                sb4.l.set(i2, qb43);
            }
            c(null, (Sb4) mb4.j(), null, true);
            this.m = null;
            return;
        }
        if (nb4 == null) {
            return;
        }
        long j = ((Qb4) nb4.g).l;
        this.e.getClass();
        long currentTimeMillis = (System.currentTimeMillis() - this.j) + j;
        if (nb4.h) {
            nb4.l();
            nb4.h = false;
        }
        Qb4 qb44 = (Qb4) nb4.g;
        qb44.getClass();
        if (i == 0) {
            throw null;
        }
        qb44.k = i - 1;
        qb44.j |= 2;
        if (nb4.h) {
            nb4.l();
            nb4.h = false;
        }
        Qb4 qb45 = (Qb4) nb4.g;
        qb45.j |= 8;
        qb45.m = currentTimeMillis;
        if (optional.isPresent()) {
            long longValue = ((Long) optional.get()).longValue();
            if (nb4.h) {
                nb4.l();
                nb4.h = false;
            }
            Qb4 qb46 = (Qb4) nb4.g;
            qb46.j |= 16;
            qb46.n = longValue;
        }
        mb4.o(nb4);
        this.l = null;
        if (z) {
            c(null, (Sb4) mb4.j(), null, true);
            this.m = null;
        }
    }

    public final void c(Lb4 lb4, Sb4 sb4, Ib4 ib4, boolean z) {
        Tb4 tb4 = (Tb4) Vb4.u.j();
        if (tb4.h) {
            tb4.l();
            tb4.h = false;
        }
        Vb4 vb4 = (Vb4) tb4.g;
        vb4.getClass();
        vb4.n = AbstractC2373Sg3.b(this.f);
        vb4.j |= 64;
        String str = this.a;
        if (!AbstractC2442Su2.a(str)) {
            if (tb4.h) {
                tb4.l();
                tb4.h = false;
            }
            Vb4 vb42 = (Vb4) tb4.g;
            vb42.getClass();
            str.getClass();
            vb42.j |= 128;
            vb42.o = str;
        }
        String str2 = this.b;
        if (!AbstractC2442Su2.a(str2)) {
            if (tb4.h) {
                tb4.l();
                tb4.h = false;
            }
            Vb4 vb43 = (Vb4) tb4.g;
            vb43.getClass();
            str2.getClass();
            vb43.j |= 256;
            vb43.p = str2;
        }
        int i = this.c;
        if (i != 0) {
            if (tb4.h) {
                tb4.l();
                tb4.h = false;
            }
            Vb4 vb44 = (Vb4) tb4.g;
            vb44.getClass();
            vb44.q = AbstractC2373Sg3.b(i);
            vb44.j |= 512;
        }
        if (lb4 != null) {
            if (tb4.h) {
                tb4.l();
                tb4.h = false;
            }
            Vb4 vb45 = (Vb4) tb4.g;
            vb45.getClass();
            vb45.k = lb4;
            vb45.j |= 1;
        }
        if (sb4 != null) {
            if (tb4.h) {
                tb4.l();
                tb4.h = false;
            }
            Vb4 vb46 = (Vb4) tb4.g;
            vb46.getClass();
            vb46.l = sb4;
            vb46.j |= 2;
        }
        if (ib4 != null) {
            if (tb4.h) {
                tb4.l();
                tb4.h = false;
            }
            Vb4 vb47 = (Vb4) tb4.g;
            vb47.getClass();
            vb47.m = ib4;
            vb47.j |= 4;
        }
        Eb4 eb4 = this.d;
        if (eb4 != null) {
            if (tb4.h) {
                tb4.l();
                tb4.h = false;
            }
            Vb4 vb48 = (Vb4) tb4.g;
            vb48.getClass();
            vb48.r = eb4;
            vb48.j |= 1024;
        }
        if (tb4.h) {
            tb4.l();
            tb4.h = false;
        }
        Vb4 vb49 = (Vb4) tb4.g;
        vb49.j |= 2048;
        vb49.s = this.g;
        this.h.accept((Vb4) tb4.j());
        if (z) {
            this.k = null;
            this.l = null;
        }
    }
}
