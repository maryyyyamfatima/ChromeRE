package defpackage;

import java.util.UUID;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class B0 implements LT3 {
    public final LT3 a;
    public final String g;

    public B0(String str, UUID uuid) {
        this.g = str;
        this.a = null;
    }

    public B0(String str, LT3 lt3) {
        this.g = str;
        this.a = lt3;
        ((B0) lt3).getClass();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AbstractC6294iU3.c(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0228, code lost:            if ((r11 * r5) < r6) goto L649;     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a5, code lost:            if (r4.c.d.containsKey(java.lang.Integer.valueOf(r11)) != false) goto L683;     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a7, code lost:            r4.c.d.put(java.lang.Integer.valueOf(r11), new defpackage.C4008bp3(r7, 1073741824));     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b7, code lost:            if (r12 == null) goto L686;     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00b9, code lost:            r12.c = r4.c;     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c6, code lost:            if (r12 == null) goto L603;     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c8, code lost:            r12.c = r4.c;     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00cc, code lost:            r4.d = r7;        r4.e += r5;        r4.d();     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01bc, code lost:            if (r4.c(r14, r15, r13, (r13 + r15) - r14) != false) goto L630;     */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01dc A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 682
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.B0.toString():java.lang.String");
    }
}
