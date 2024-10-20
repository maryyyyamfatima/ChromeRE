package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class NH1 extends OH1 {
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public int f = 0;

    public NH1(String str, String str2, int i, String str3) {
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
    }

    @Override // defpackage.OH1
    public final String a() {
        return this.b.replace('/', '.');
    }

    @Override // defpackage.OH1
    public final String d() {
        return this.c;
    }

    @Override // defpackage.OH1
    public final int c() {
        return this.d & 65535;
    }

    @Override // defpackage.OH1
    public final String b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof NH1)) {
            return false;
        }
        NH1 nh1 = (NH1) obj;
        return this.b.equals(nh1.b) && this.c.equals(nh1.c) && this.d == nh1.d;
    }

    public final int hashCode() {
        if (this.f == 0) {
            this.f = ((this.c.hashCode() + ((this.b.hashCode() + 4867) * 31)) * 31) + this.d;
        }
        return this.f;
    }
}
