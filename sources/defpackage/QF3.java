package defpackage;

import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class QF3 {
    public static final QF3 g;
    public static final QF3 h;
    public static final QF3 i;
    public static final QF3 j;
    public static final QF3 k;
    public static final QF3 l;
    public static final QF3 m;
    public int a;
    public boolean b;
    public boolean c;
    public byte d;
    public byte[] e;
    public boolean f;

    public final QF3 b(C5447g04 c5447g04, C5791h04 c5791h04) {
        byte[] bArr = new byte[8];
        bArr[2] = 1;
        bArr[1] = (byte) c5791h04.a;
        QF3 qf3 = new QF3(this);
        qf3.d = (byte) 1;
        qf3.e = bArr;
        return qf3;
    }

    static {
        QF3 a = new QF3().a(0);
        g = a;
        QF3 qf3 = new QF3(a);
        qf3.b = true;
        h = qf3;
        QF3 a2 = new QF3().a(1);
        i = a2;
        QF3 qf32 = new QF3(a2);
        qf32.b = true;
        j = qf32;
        QF3 a3 = new QF3().a(2);
        k = a3;
        QF3 qf33 = new QF3(a3);
        qf33.b = true;
        l = qf33;
        QF3 qf34 = new QF3();
        m = qf34;
        qf34.f = true;
        QF3 qf35 = new QF3(new QF3());
        qf35.c = true;
        QF3 a4 = qf35.a(2);
        a4.a(2);
        a4.a(1);
        a4.a(0);
    }

    public QF3() {
        this.a = 2;
    }

    public QF3(QF3 qf3) {
        this.a = qf3.a;
        this.b = qf3.b;
        this.c = qf3.c;
        this.d = qf3.d;
        this.e = qf3.e;
    }

    public final QF3 a(int i2) {
        QF3 qf3 = new QF3(this);
        qf3.a = i2;
        return qf3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof QF3)) {
            return false;
        }
        QF3 qf3 = (QF3) obj;
        return this.a == qf3.a && this.b == qf3.b && this.c == qf3.c && this.d == qf3.d && Arrays.equals(this.e, qf3.e) && this.f == qf3.f;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.e) + ((((((((1147 + this.a) * 37) + (!this.b ? 1 : 0)) * 37) + (!this.c ? 1 : 0)) * 37) + this.d) * 37)) * 37) + (!this.f ? 1 : 0);
    }
}
