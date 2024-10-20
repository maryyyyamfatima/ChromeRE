package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class KL3 implements KN2, GN2 {
    public final KN2 a;
    public final Object b;
    public volatile GN2 c;
    public volatile GN2 d;
    public int e = 3;
    public int f = 3;
    public boolean g;

    public KL3(Object obj, KN2 kn2) {
        this.b = obj;
        this.a = kn2;
    }

    @Override // defpackage.KN2
    public final boolean h(GN2 gn2) {
        boolean z;
        boolean z2;
        synchronized (this.b) {
            KN2 kn2 = this.a;
            z = false;
            if (kn2 != null && !kn2.h(this)) {
                z2 = false;
                if (z2 && (gn2.equals(this.c) || this.e != 4)) {
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
        synchronized (this.b) {
            KN2 kn2 = this.a;
            z = false;
            if (kn2 != null && !kn2.g(this)) {
                z2 = false;
                if (z2 && gn2.equals(this.c) && !a()) {
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
        synchronized (this.b) {
            KN2 kn2 = this.a;
            z = false;
            if (kn2 != null && !kn2.f(this)) {
                z2 = false;
                if (z2 && gn2.equals(this.c) && this.e != 2) {
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

    @Override // defpackage.KN2, defpackage.GN2
    public final boolean a() {
        boolean z;
        synchronized (this.b) {
            z = this.d.a() || this.c.a();
        }
        return z;
    }

    @Override // defpackage.KN2
    public final void e(GN2 gn2) {
        synchronized (this.b) {
            if (gn2.equals(this.d)) {
                this.f = 4;
                return;
            }
            this.e = 4;
            KN2 kn2 = this.a;
            if (kn2 != null) {
                kn2.e(this);
            }
            if (!JN2.a(this.f)) {
                this.d.clear();
            }
        }
    }

    @Override // defpackage.KN2
    public final void d(GN2 gn2) {
        synchronized (this.b) {
            if (!gn2.equals(this.c)) {
                this.f = 5;
                return;
            }
            this.e = 5;
            KN2 kn2 = this.a;
            if (kn2 != null) {
                kn2.d(this);
            }
        }
    }

    @Override // defpackage.KN2
    public final KN2 getRoot() {
        KN2 root;
        synchronized (this.b) {
            KN2 kn2 = this.a;
            root = kn2 != null ? kn2.getRoot() : this;
        }
        return root;
    }

    @Override // defpackage.GN2
    public final void c() {
        synchronized (this.b) {
            this.g = true;
            try {
                if (this.e != 4 && this.f != 1) {
                    this.f = 1;
                    this.d.c();
                }
                if (this.g && this.e != 1) {
                    this.e = 1;
                    this.c.c();
                }
            } finally {
                this.g = false;
            }
        }
    }

    @Override // defpackage.GN2
    public final void clear() {
        synchronized (this.b) {
            this.g = false;
            this.e = 3;
            this.f = 3;
            this.d.clear();
            this.c.clear();
        }
    }

    @Override // defpackage.GN2
    public final void pause() {
        synchronized (this.b) {
            if (!JN2.a(this.f)) {
                this.f = 2;
                this.d.pause();
            }
            if (!JN2.a(this.e)) {
                this.e = 2;
                this.c.pause();
            }
        }
    }

    @Override // defpackage.GN2
    public final boolean isRunning() {
        boolean z;
        synchronized (this.b) {
            z = true;
            if (this.e != 1) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.GN2
    public final boolean j() {
        boolean z;
        synchronized (this.b) {
            z = this.e == 4;
        }
        return z;
    }

    @Override // defpackage.GN2
    public final boolean i() {
        boolean z;
        synchronized (this.b) {
            z = this.e == 3;
        }
        return z;
    }

    @Override // defpackage.GN2
    public final boolean b(GN2 gn2) {
        if (!(gn2 instanceof KL3)) {
            return false;
        }
        KL3 kl3 = (KL3) gn2;
        if (this.c == null) {
            if (kl3.c != null) {
                return false;
            }
        } else if (!this.c.b(kl3.c)) {
            return false;
        }
        if (this.d == null) {
            if (kl3.d != null) {
                return false;
            }
        } else if (!this.d.b(kl3.d)) {
            return false;
        }
        return true;
    }
}
