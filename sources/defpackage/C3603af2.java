package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: af2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3603af2 {
    public final Object[] a;
    public short b;

    public static String f(int i) {
        if (i == 0) {
            return "CONTENT";
        }
        if (i == 1) {
            return "BACKGROUND";
        }
        if (i == 2) {
            return "FOREGROUND";
        }
        if (i == 3) {
            return "HOST";
        }
        if (i != 4) {
            return null;
        }
        return "BORDER";
    }

    public C3603af2() {
        this.a = new Object[5];
        this.b = (short) 0;
    }

    public C3603af2(C3603af2 c3603af2) {
        this.a = new Object[5];
        this.b = (short) 0;
        for (int i = 0; i < 5; i++) {
            this.a[i] = c3603af2.a[i];
        }
        this.b = c3603af2.b;
    }

    public final void a(int i, Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("value should not be null");
        }
        Object[] objArr = this.a;
        if (objArr[i] != null) {
            throw new RuntimeException(AbstractC4809e90.a("Already contains unit for type ", f(i)));
        }
        if (objArr[3] != null || (i == 3 && this.b > 0)) {
            throw new RuntimeException("OutputUnitType.HOST unit should be the only member of an OutputUnitsAffinityGroup");
        }
        objArr[i] = obj;
        this.b = (short) (this.b + 1);
    }

    public final void d(int i, Object obj) {
        Object[] objArr = this.a;
        if (obj != null && objArr[i] != null) {
            objArr[i] = obj;
            return;
        }
        if (obj != null && objArr[i] == null) {
            a(i, obj);
        } else {
            if (obj != null || objArr[i] == null) {
                return;
            }
            objArr[i] = null;
            this.b = (short) (this.b - 1);
        }
    }

    public final int e(int i) {
        if (i < 0 || i >= this.b) {
            throw new IndexOutOfBoundsException(AbstractC0800Ge.a("index=", i, ", size=", this.b));
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 <= i) {
            if (this.a[i3] != null) {
                i2++;
            }
            i3++;
        }
        return i3 - 1;
    }

    public final Object b(int i) {
        return this.a[e(i)];
    }

    public final Object c() {
        Object[] objArr = this.a;
        Object obj = objArr[3];
        if (obj != null) {
            return obj;
        }
        Object obj2 = objArr[0];
        if (obj2 != null) {
            return obj2;
        }
        Object obj3 = objArr[1];
        if (obj3 != null) {
            return obj3;
        }
        Object obj4 = objArr[2];
        return obj4 != null ? obj4 : objArr[4];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3603af2.class != obj.getClass()) {
            return false;
        }
        C3603af2 c3603af2 = (C3603af2) obj;
        if (this.b != c3603af2.b) {
            return false;
        }
        int i = 0;
        while (true) {
            Object[] objArr = this.a;
            if (i >= objArr.length) {
                return true;
            }
            if (objArr[i] != c3603af2.a[i]) {
                return false;
            }
            i++;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        for (int i = 0; i < this.b; i++) {
            int e = e(i);
            Object b = b(i);
            sb.append("\n\t");
            sb.append(f(e));
            sb.append(": ");
            sb.append(b.toString());
        }
        return sb.toString();
    }
}
