package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zB0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12030zB0 implements JO2 {
    public final boolean a;
    public final boolean g;
    public final JO2 h;
    public final InterfaceC11687yB0 i;
    public final InterfaceC6098hu1 j;
    public int k;
    public boolean l;

    public C12030zB0(JO2 jo2, boolean z, boolean z2, InterfaceC6098hu1 interfaceC6098hu1, InterfaceC11687yB0 interfaceC11687yB0) {
        AbstractC6464iy2.b(jo2);
        this.h = jo2;
        this.a = z;
        this.g = z2;
        this.j = interfaceC6098hu1;
        AbstractC6464iy2.b(interfaceC11687yB0);
        this.i = interfaceC11687yB0;
    }

    @Override // defpackage.JO2
    public final Class e() {
        return this.h.e();
    }

    @Override // defpackage.JO2
    public final Object get() {
        return this.h.get();
    }

    @Override // defpackage.JO2
    public final int d() {
        return this.h.d();
    }

    @Override // defpackage.JO2
    public final synchronized void b() {
        if (this.k > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.l) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.l = true;
        if (this.g) {
            this.h.b();
        }
    }

    public final synchronized void a() {
        if (this.l) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.k++;
    }

    public final void c() {
        boolean z;
        synchronized (this) {
            int i = this.k;
            if (i <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z = true;
            int i2 = i - 1;
            this.k = i2;
            if (i2 != 0) {
                z = false;
            }
        }
        if (z) {
            ((C6538jB0) this.i).c(this.j, this);
        }
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.a + ", listener=" + String.valueOf(this.i) + ", key=" + String.valueOf(this.j) + ", acquired=" + this.k + ", isRecycled=" + this.l + ", resource=" + String.valueOf(this.h) + "}";
    }
}
