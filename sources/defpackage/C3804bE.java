package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bE, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3804bE implements Serializable, Comparable {
    public static final C3804bE i = new C3804bE(new byte[0]);
    public final byte[] a;
    public transient int g;
    public transient String h;

    public C3804bE(byte[] bArr) {
        AbstractC0087Ar1.e(bArr, "data");
        this.a = bArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032 A[ORIG_RETURN, RETURN] */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int compareTo(java.lang.Object r8) {
        /*
            r7 = this;
            bE r8 = (defpackage.C3804bE) r8
            java.lang.String r0 = "other"
            defpackage.AbstractC0087Ar1.e(r8, r0)
            int r0 = r7.b()
            int r1 = r8.b()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L15:
            if (r4 >= r2) goto L2b
            byte r5 = r7.e(r4)
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r6 = r8.e(r4)
            r6 = r6 & 255(0xff, float:3.57E-43)
            if (r5 != r6) goto L28
            int r4 = r4 + 1
            goto L15
        L28:
            if (r5 >= r6) goto L32
            goto L30
        L2b:
            if (r0 != r1) goto L2e
            goto L33
        L2e:
            if (r0 >= r1) goto L32
        L30:
            r3 = -1
            goto L33
        L32:
            r3 = 1
        L33:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3804bE.compareTo(java.lang.Object):int");
    }

    public int hashCode() {
        int i2 = this.g;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = Arrays.hashCode(this.a);
        this.g = hashCode;
        return hashCode;
    }

    public byte[] d() {
        return this.a;
    }

    public static final C3804bE a(String str) {
        byte[] bytes = str.getBytes(AbstractC3829bJ.a);
        AbstractC0087Ar1.d(bytes, "this as java.lang.String).getBytes(charset)");
        C3804bE c3804bE = new C3804bE(bytes);
        c3804bE.h = str;
        return c3804bE;
    }

    public String c() {
        byte[] bArr = this.a;
        char[] cArr = new char[bArr.length * 2];
        int i2 = 0;
        for (byte b : bArr) {
            int i3 = i2 + 1;
            char[] cArr2 = Vs4.a;
            cArr[i2] = cArr2[(b >> 4) & 15];
            i2 = i3 + 1;
            cArr[i3] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public byte e(int i2) {
        return this.a[i2];
    }

    public int b() {
        return this.a.length;
    }

    public boolean g(C3804bE c3804bE, int i2) {
        return c3804bE.f(0, 0, i2, this.a);
    }

    public boolean f(int i2, int i3, int i4, byte[] bArr) {
        AbstractC0087Ar1.e(bArr, "other");
        if (i2 >= 0) {
            byte[] bArr2 = this.a;
            if (i2 <= bArr2.length - i4 && i3 >= 0 && i3 <= bArr.length - i4 && Xs4.a(i2, i3, i4, bArr2, bArr)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3804bE) {
            C3804bE c3804bE = (C3804bE) obj;
            int b = c3804bE.b();
            byte[] bArr = this.a;
            if (b == bArr.length && c3804bE.f(0, 0, bArr.length, bArr)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x01dc, code lost:            if (r3 == 64) goto L248;     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01d5, code lost:            if (r3 == 64) goto L248;     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01c8, code lost:            if (r3 == 64) goto L248;     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01b2, code lost:            if (r3 == 64) goto L248;     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01a3, code lost:            if (r3 == 64) goto L248;     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0192, code lost:            if (r3 == 64) goto L248;     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0181, code lost:            if (r3 == 64) goto L248;     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x021b, code lost:            if (r3 == 64) goto L248;     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0139, code lost:            if (r3 == 64) goto L248;     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x012c, code lost:            if (r3 == 64) goto L248;     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x011a, code lost:            if (r3 == 64) goto L248;     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x010b, code lost:            if (r3 == 64) goto L248;     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x00fa, code lost:            if (r3 == 64) goto L248;     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x00b2, code lost:            if (r3 == 64) goto L248;     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x00a7, code lost:            if (r3 == 64) goto L248;     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0098, code lost:            if (r3 == 64) goto L248;     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x021e, code lost:            r4 = -1;     */
    /* JADX WARN: Removed duplicated region for block: B:163:0x021e A[EDGE_INSN: B:163:0x021e->B:62:0x021e BREAK  A[LOOP:0: B:8:0x0012->B:105:0x0012], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x021e A[EDGE_INSN: B:213:0x021e->B:62:0x021e BREAK  A[LOOP:0: B:8:0x0012->B:105:0x0012], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x021e A[EDGE_INSN: B:249:0x021e->B:62:0x021e BREAK  A[LOOP:0: B:8:0x0012->B:105:0x0012], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x021e A[EDGE_INSN: B:275:0x021e->B:62:0x021e BREAK  A[LOOP:0: B:8:0x0012->B:105:0x0012, LOOP_LABEL: LOOP:0: B:8:0x0012->B:105:0x0012], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x021e A[EDGE_INSN: B:61:0x021e->B:62:0x021e BREAK  A[LOOP:0: B:8:0x0012->B:105:0x0012], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 756
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3804bE.toString():java.lang.String");
    }
}
