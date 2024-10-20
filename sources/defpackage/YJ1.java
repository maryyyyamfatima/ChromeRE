package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class YJ1 implements InterfaceC8179nx2 {
    public final ZJ1 a;
    public int b;
    public Class c;

    public YJ1(ZJ1 zj1) {
        this.a = zj1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof YJ1)) {
            return false;
        }
        YJ1 yj1 = (YJ1) obj;
        return this.b == yj1.b && this.c == yj1.c;
    }

    public final String toString() {
        return "Key{size=" + this.b + "array=" + String.valueOf(this.c) + "}";
    }

    @Override // defpackage.InterfaceC8179nx2
    public final void a() {
        this.a.c(this);
    }

    public final int hashCode() {
        int i = this.b * 31;
        Class cls = this.c;
        return i + (cls != null ? cls.hashCode() : 0);
    }
}
