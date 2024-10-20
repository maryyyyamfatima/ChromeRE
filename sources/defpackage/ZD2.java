package defpackage;

import java.io.Serializable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class ZD2 implements InterfaceC5754gu1, Serializable {
    public transient YD2 a;
    public final Object g;
    public final Class h = AbstractC6711ji0.class;
    public final String i = "classSimpleName";
    public final String j = "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;";
    public final boolean k = true;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ZD2) {
            ZD2 zd2 = (ZD2) obj;
            return a().equals(zd2.a()) && this.i.equals(zd2.i) && this.j.equals(zd2.j) && AbstractC0087Ar1.a(this.g, zd2.g);
        }
        if (!(obj instanceof InterfaceC5754gu1)) {
            return false;
        }
        YD2 yd2 = this.a;
        if (yd2 == null) {
            yd2 = (YD2) this;
            AbstractC3842bL2.a.getClass();
            this.a = yd2;
        }
        return obj.equals(yd2);
    }

    public final int hashCode() {
        return this.j.hashCode() + ((this.i.hashCode() + (a().hashCode() * 31)) * 31);
    }

    public ZD2(Object obj) {
        this.g = obj;
    }

    public final String toString() {
        YD2 yd2 = this.a;
        if (yd2 == null) {
            yd2 = (YD2) this;
            AbstractC3842bL2.a.getClass();
            this.a = yd2;
        }
        if (yd2 != this) {
            return yd2.toString();
        }
        return Y5.a(new StringBuilder("property "), this.i, " (Kotlin reflection is not available)");
    }

    public final JS a() {
        JS ks;
        Class cls = this.h;
        if (cls == null) {
            return null;
        }
        if (this.k) {
            AbstractC3842bL2.a.getClass();
            ks = new C4296cg2(cls);
        } else {
            AbstractC3842bL2.a.getClass();
            ks = new KS(cls);
        }
        return ks;
    }
}
