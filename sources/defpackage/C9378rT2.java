package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rT2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9378rT2 {
    public final String a;
    public final String b;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:            if (r0.endsWith("." + r3) != false) goto L15;     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(defpackage.C9378rT2 r6, java.net.URI r7) {
        /*
            r6.getClass()
            java.lang.String r0 = r7.getHost()
            java.lang.String r7 = r7.getPath()
            r1 = 0
            if (r0 != 0) goto L11
            if (r7 != 0) goto L11
            goto L51
        L11:
            r2 = 1
            if (r0 == 0) goto L39
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L1b
            goto L39
        L1b:
            java.lang.String r3 = r6.a
            boolean r4 = r0.equals(r3)
            if (r4 != 0) goto L37
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "."
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            boolean r0 = r0.endsWith(r3)
            if (r0 == 0) goto L39
        L37:
            r0 = r2
            goto L3a
        L39:
            r0 = r1
        L3a:
            if (r0 == 0) goto L51
            if (r7 != 0) goto L40
            r6 = r1
            goto L4e
        L40:
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L48
            java.lang.String r7 = "/"
        L48:
            java.lang.String r6 = r6.b
            boolean r6 = r7.startsWith(r6)
        L4e:
            if (r6 == 0) goto L51
            r1 = r2
        L51:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9378rT2.a(rT2, java.net.URI):boolean");
    }

    public C9378rT2(String str) {
        int indexOf = str.indexOf("/");
        if (indexOf == -1) {
            this.a = str;
            this.b = "";
        } else {
            this.a = str.substring(0, indexOf);
            this.b = str.substring(indexOf);
        }
    }
}
