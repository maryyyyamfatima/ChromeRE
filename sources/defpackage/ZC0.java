package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class ZC0 implements KN2, GN2 {
    public final Object a;
    public final KN2 b;
    public volatile GN2 c;
    public volatile GN2 d;
    public int e = 3;
    public int f = 3;

    public ZC0(Object obj, KN2 kn2) {
        this.a = obj;
        this.b = kn2;
    }

    @Override // defpackage.GN2
    public final void c() {
        synchronized (this.a) {
            if (this.e != 1) {
                this.e = 1;
                this.c.c();
            }
        }
    }

    @Override // defpackage.GN2
    public final void clear() {
        synchronized (this.a) {
            this.e = 3;
            this.c.clear();
            if (this.f != 3) {
                this.f = 3;
                this.d.clear();
            }
        }
    }

    @Override // defpackage.GN2
    public final void pause() {
        synchronized (this.a) {
            if (this.e == 1) {
                this.e = 2;
                this.c.pause();
            }
            if (this.f == 1) {
                this.f = 2;
                this.d.pause();
            }
        }
    }

    @Override // defpackage.GN2
    public final boolean isRunning() {
        boolean z;
        synchronized (this.a) {
            z = true;
            if (this.e != 1 && this.f != 1) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.GN2
    public final boolean j() {
        boolean z;
        synchronized (this.a) {
            z = this.e == 4 || this.f == 4;
        }
        return z;
    }

    @Override // defpackage.GN2
    public final boolean i() {
        boolean z;
        synchronized (this.a) {
            z = this.e == 3 && this.f == 3;
        }
        return z;
    }

    @Override // defpackage.GN2
    public final boolean b(GN2 gn2) {
        if (!(gn2 instanceof ZC0)) {
            return false;
        }
        ZC0 zc0 = (ZC0) gn2;
        return this.c.b(zc0.c) && this.d.b(zc0.d);
    }

    @Override // defpackage.KN2
    public final boolean h(GN2 gn2) {
        boolean z;
        boolean z2;
        synchronized (this.a) {
            KN2 kn2 = this.b;
            z = false;
            if (kn2 != null && !kn2.h(this)) {
                z2 = false;
                if (z2 && k(gn2)) {
                    z = true;
                }
            }
            z2 = true;
            if (z2) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.KN2
    public final boolean g(GN2 gn2) {
        boolean z;
        boolean z2;
        synchronized (this.a) {
            KN2 kn2 = this.b;
            z = false;
            if (kn2 != null && !kn2.g(this)) {
                z2 = false;
                if (z2 && k(gn2)) {
                    z = true;
                }
            }
            z2 = true;
            if (z2) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.KN2
    public final boolean f(GN2 gn2) {
        boolean z;
        boolean z2;
        synchronized (this.a) {
            KN2 kn2 = this.b;
            z = false;
            if (kn2 != null && !kn2.f(this)) {
                z2 = false;
                if (z2 && k(gn2)) {
                    z = true;
                }
            }
            z2 = true;
            if (z2) {
                z = true;
            }
        }
        return z;
    }

    public final boolean k(GN2 gn2) {
        return gn2.equals(this.c) || (this.e == 5 && gn2.equals(this.d));
    }

    @Override // defpackage.KN2, defpackage.GN2
    public final boolean a() {
        boolean z;
        synchronized (this.a) {
            z = this.c.a() || this.d.a();
        }
        return z;
    }

    @Override // defpackage.KN2
    public final void e(GN2 gn2) {
        synchronized (this.a) {
            if (gn2.equals(this.c)) {
                this.e = 4;
            } else if (gn2.equals(this.d)) {
                this.f = 4;
            }
            KN2 kn2 = this.b;
            if (kn2 != null) {
                kn2.e(this);
            }
        }
    }

    @Override // defpackage.KN2
    public final void d(GN2 gn2) {
        synchronized (this.a) {
            if (!gn2.equals(this.d)) {
                this.e = 5;
                if (this.f != 1) {
                    this.f = 1;
                    this.d.c();
                }
                return;
            }
            this.f = 5;
            KN2 kn2 = this.b;
            if (kn2 != null) {
                kn2.d(this);
            }
        }
    }

    @Override // defpackage.KN2
    public final KN2 getRoot() {
        KN2 root;
        synchronized (this.a) {
            KN2 kn2 = this.b;
            root = kn2 != null ? kn2.getRoot() : this;
        }
        return root;
    }
}
