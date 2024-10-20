package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Vv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2834Vv implements Cloneable {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean E;
    public int a;
    public Drawable j;
    public int k;
    public Drawable l;
    public int m;
    public boolean r;
    public Drawable t;
    public int u;
    public boolean y;
    public Resources.Theme z;
    public float g = 1.0f;
    public AbstractC6410ip0 h = AbstractC6410ip0.c;
    public EnumC7567mA2 i = EnumC7567mA2.NORMAL;
    public boolean n = true;
    public int o = -1;
    public int p = -1;
    public InterfaceC6098hu1 q = C10653vA0.b;
    public boolean s = true;
    public C0543Ee2 v = new C0543Ee2();
    public C8958qE w = new C8958qE();
    public Class x = Object.class;
    public boolean D = true;

    public static boolean j(int i, int i2) {
        return (i & i2) != 0;
    }

    public AbstractC2834Vv C() {
        if (this.A) {
            return clone().C();
        }
        this.E = true;
        this.a |= 1048576;
        u();
        return this;
    }

    public AbstractC2834Vv e(AbstractC6410ip0 abstractC6410ip0) {
        if (this.A) {
            return clone().e(abstractC6410ip0);
        }
        this.h = abstractC6410ip0;
        this.a |= 4;
        u();
        return this;
    }

    public AbstractC2834Vv s() {
        EnumC7567mA2 enumC7567mA2 = EnumC7567mA2.LOW;
        if (this.A) {
            return clone().s();
        }
        this.i = enumC7567mA2;
        this.a |= 8;
        u();
        return this;
    }

    public AbstractC2834Vv r(BitmapDrawable bitmapDrawable) {
        if (this.A) {
            return clone().r(bitmapDrawable);
        }
        this.l = bitmapDrawable;
        int i = this.a | 64;
        this.m = 0;
        this.a = i & (-129);
        u();
        return this;
    }

    public AbstractC2834Vv q(int i) {
        if (this.A) {
            return clone().q(i);
        }
        this.m = i;
        int i2 = this.a | 128;
        this.l = null;
        this.a = i2 & (-65);
        u();
        return this;
    }

    public AbstractC2834Vv h(BitmapDrawable bitmapDrawable) {
        if (this.A) {
            return clone().h(bitmapDrawable);
        }
        this.j = bitmapDrawable;
        int i = this.a | 16;
        this.k = 0;
        this.a = i & (-33);
        u();
        return this;
    }

    public AbstractC2834Vv g(int i) {
        if (this.A) {
            return clone().g(i);
        }
        this.k = i;
        int i2 = this.a | 32;
        this.j = null;
        this.a = i2 & (-17);
        u();
        return this;
    }

    public AbstractC2834Vv x(boolean z) {
        if (this.A) {
            return clone().x(true);
        }
        this.n = !z;
        this.a |= 256;
        u();
        return this;
    }

    public AbstractC2834Vv p(int i, int i2) {
        if (this.A) {
            return clone().p(i, i2);
        }
        this.p = i;
        this.o = i2;
        this.a |= 512;
        u();
        return this;
    }

    public AbstractC2834Vv w(InterfaceC6098hu1 interfaceC6098hu1) {
        if (this.A) {
            return clone().w(interfaceC6098hu1);
        }
        this.q = interfaceC6098hu1;
        this.a |= 1024;
        u();
        return this;
    }

    @Override // 
    /* renamed from: c */
    public AbstractC2834Vv clone() {
        try {
            AbstractC2834Vv abstractC2834Vv = (AbstractC2834Vv) super.clone();
            C0543Ee2 c0543Ee2 = new C0543Ee2();
            abstractC2834Vv.v = c0543Ee2;
            c0543Ee2.b.g(this.v.b);
            C8958qE c8958qE = new C8958qE();
            abstractC2834Vv.w = c8958qE;
            c8958qE.putAll(this.w);
            abstractC2834Vv.y = false;
            abstractC2834Vv.A = false;
            return abstractC2834Vv;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public AbstractC2834Vv v(C8752pe2 c8752pe2, Object obj) {
        if (this.A) {
            return clone().v(c8752pe2, obj);
        }
        AbstractC6464iy2.b(c8752pe2);
        this.v.b.put(c8752pe2, obj);
        u();
        return this;
    }

    public AbstractC2834Vv d(Class cls) {
        if (this.A) {
            return clone().d(cls);
        }
        this.x = cls;
        this.a |= 4096;
        u();
        return this;
    }

    public AbstractC2834Vv f(AbstractC7809mt0 abstractC7809mt0) {
        return v(AbstractC7809mt0.f, abstractC7809mt0);
    }

    public AbstractC2834Vv l() {
        return o(AbstractC7809mt0.c, new C9663sI());
    }

    public AbstractC2834Vv n() {
        return t(AbstractC7809mt0.a, new C11071wP0(), false);
    }

    public AbstractC2834Vv i() {
        return t(AbstractC7809mt0.a, new C11071wP0(), true);
    }

    public AbstractC2834Vv m() {
        return t(AbstractC7809mt0.b, new C10006tI(), false);
    }

    public final AbstractC2834Vv o(AbstractC7809mt0 abstractC7809mt0, AbstractC0380Cy abstractC0380Cy) {
        if (this.A) {
            return clone().o(abstractC7809mt0, abstractC0380Cy);
        }
        f(abstractC7809mt0);
        return A(abstractC0380Cy, false);
    }

    public final AbstractC2834Vv z(AbstractC7809mt0 abstractC7809mt0, AbstractC0380Cy abstractC0380Cy) {
        if (this.A) {
            return clone().z(abstractC7809mt0, abstractC0380Cy);
        }
        f(abstractC7809mt0);
        return y(abstractC0380Cy);
    }

    public final AbstractC2834Vv t(AbstractC7809mt0 abstractC7809mt0, AbstractC0380Cy abstractC0380Cy, boolean z) {
        AbstractC2834Vv o;
        if (z) {
            o = z(abstractC7809mt0, abstractC0380Cy);
        } else {
            o = o(abstractC7809mt0, abstractC0380Cy);
        }
        o.D = true;
        return o;
    }

    public AbstractC2834Vv y(AbstractC0380Cy abstractC0380Cy) {
        return A(abstractC0380Cy, true);
    }

    public final AbstractC2834Vv A(InterfaceC9389rV3 interfaceC9389rV3, boolean z) {
        if (this.A) {
            return clone().A(interfaceC9389rV3, z);
        }
        C2565Tt0 c2565Tt0 = new C2565Tt0(interfaceC9389rV3, z);
        B(Bitmap.class, interfaceC9389rV3, z);
        B(Drawable.class, c2565Tt0, z);
        B(BitmapDrawable.class, c2565Tt0, z);
        B(C5284fZ0.class, new C6658jZ0(interfaceC9389rV3), z);
        u();
        return this;
    }

    public final AbstractC2834Vv B(Class cls, InterfaceC9389rV3 interfaceC9389rV3, boolean z) {
        if (this.A) {
            return clone().B(cls, interfaceC9389rV3, z);
        }
        AbstractC6464iy2.b(interfaceC9389rV3);
        this.w.put(cls, interfaceC9389rV3);
        int i = this.a | 2048;
        this.s = true;
        int i2 = i | 65536;
        this.a = i2;
        this.D = false;
        if (z) {
            this.a = i2 | 131072;
            this.r = true;
        }
        u();
        return this;
    }

    public AbstractC2834Vv a(AbstractC2834Vv abstractC2834Vv) {
        if (this.A) {
            return clone().a(abstractC2834Vv);
        }
        if (j(abstractC2834Vv.a, 2)) {
            this.g = abstractC2834Vv.g;
        }
        if (j(abstractC2834Vv.a, 262144)) {
            this.B = abstractC2834Vv.B;
        }
        if (j(abstractC2834Vv.a, 1048576)) {
            this.E = abstractC2834Vv.E;
        }
        if (j(abstractC2834Vv.a, 4)) {
            this.h = abstractC2834Vv.h;
        }
        if (j(abstractC2834Vv.a, 8)) {
            this.i = abstractC2834Vv.i;
        }
        if (j(abstractC2834Vv.a, 16)) {
            this.j = abstractC2834Vv.j;
            this.k = 0;
            this.a &= -33;
        }
        if (j(abstractC2834Vv.a, 32)) {
            this.k = abstractC2834Vv.k;
            this.j = null;
            this.a &= -17;
        }
        if (j(abstractC2834Vv.a, 64)) {
            this.l = abstractC2834Vv.l;
            this.m = 0;
            this.a &= -129;
        }
        if (j(abstractC2834Vv.a, 128)) {
            this.m = abstractC2834Vv.m;
            this.l = null;
            this.a &= -65;
        }
        if (j(abstractC2834Vv.a, 256)) {
            this.n = abstractC2834Vv.n;
        }
        if (j(abstractC2834Vv.a, 512)) {
            this.p = abstractC2834Vv.p;
            this.o = abstractC2834Vv.o;
        }
        if (j(abstractC2834Vv.a, 1024)) {
            this.q = abstractC2834Vv.q;
        }
        if (j(abstractC2834Vv.a, 4096)) {
            this.x = abstractC2834Vv.x;
        }
        if (j(abstractC2834Vv.a, 8192)) {
            this.t = abstractC2834Vv.t;
            this.u = 0;
            this.a &= -16385;
        }
        if (j(abstractC2834Vv.a, 16384)) {
            this.u = abstractC2834Vv.u;
            this.t = null;
            this.a &= -8193;
        }
        if (j(abstractC2834Vv.a, 32768)) {
            this.z = abstractC2834Vv.z;
        }
        if (j(abstractC2834Vv.a, 65536)) {
            this.s = abstractC2834Vv.s;
        }
        if (j(abstractC2834Vv.a, 131072)) {
            this.r = abstractC2834Vv.r;
        }
        if (j(abstractC2834Vv.a, 2048)) {
            this.w.putAll(abstractC2834Vv.w);
            this.D = abstractC2834Vv.D;
        }
        if (j(abstractC2834Vv.a, 524288)) {
            this.C = abstractC2834Vv.C;
        }
        if (!this.s) {
            this.w.clear();
            int i = this.a & (-2049);
            this.r = false;
            this.a = i & (-131073);
            this.D = true;
        }
        this.a |= abstractC2834Vv.a;
        this.v.b.g(abstractC2834Vv.v.b);
        u();
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AbstractC2834Vv) {
            AbstractC2834Vv abstractC2834Vv = (AbstractC2834Vv) obj;
            if (Float.compare(abstractC2834Vv.g, this.g) == 0 && this.k == abstractC2834Vv.k && AbstractC10296u74.b(this.j, abstractC2834Vv.j) && this.m == abstractC2834Vv.m && AbstractC10296u74.b(this.l, abstractC2834Vv.l) && this.u == abstractC2834Vv.u && AbstractC10296u74.b(this.t, abstractC2834Vv.t) && this.n == abstractC2834Vv.n && this.o == abstractC2834Vv.o && this.p == abstractC2834Vv.p && this.r == abstractC2834Vv.r && this.s == abstractC2834Vv.s && this.B == abstractC2834Vv.B && this.C == abstractC2834Vv.C && this.h.equals(abstractC2834Vv.h) && this.i == abstractC2834Vv.i && this.v.equals(abstractC2834Vv.v) && this.w.equals(abstractC2834Vv.w) && this.x.equals(abstractC2834Vv.x) && AbstractC10296u74.b(this.q, abstractC2834Vv.q) && AbstractC10296u74.b(this.z, abstractC2834Vv.z)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        float f = this.g;
        char[] cArr = AbstractC10296u74.a;
        return AbstractC10296u74.f(AbstractC10296u74.f(AbstractC10296u74.f(AbstractC10296u74.f(AbstractC10296u74.f(AbstractC10296u74.f(AbstractC10296u74.f((((((((((((((AbstractC10296u74.f((AbstractC10296u74.f((AbstractC10296u74.f(((Float.floatToIntBits(f) + 527) * 31) + this.k, this.j) * 31) + this.m, this.l) * 31) + this.u, this.t) * 31) + (this.n ? 1 : 0)) * 31) + this.o) * 31) + this.p) * 31) + (this.r ? 1 : 0)) * 31) + (this.s ? 1 : 0)) * 31) + (this.B ? 1 : 0)) * 31) + (this.C ? 1 : 0), this.h), this.i), this.v), this.w), this.x), this.q), this.z);
    }

    public AbstractC2834Vv k() {
        this.y = true;
        return this;
    }

    public AbstractC2834Vv b() {
        if (this.y && !this.A) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.A = true;
        return k();
    }

    public final void u() {
        if (this.y) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }
}
