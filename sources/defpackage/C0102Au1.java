package defpackage;

import java.util.Arrays;
import java.util.HashSet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Au1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0102Au1 {
    public static final HashSet c = new HashSet(Arrays.asList(Boolean.class, Byte.class, Short.class, Integer.class, Long.class, Float.class, Double.class));
    public final StringBuilder a;
    public boolean b = false;

    public C0102Au1(StringBuilder sb) {
        this.a = sb;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0077, code lost:            r5.append((java.lang.CharSequence) r9, r0, r4);        r0 = r4 + 1;        r4 = r9.charAt(r4);     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0082, code lost:            if (r4 == '\t') goto L48;     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0084, code lost:            if (r4 == '\n') goto L49;     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0088, code lost:            if (r4 == '\r') goto L50;     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008a, code lost:            if (r4 == '\"') goto L51;     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008c, code lost:            if (r4 == '\\') goto L52;     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009d, code lost:            r5.append("\\");        r5.append(r4);     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008e, code lost:            r5.append((char) 65533);     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0095, code lost:            r4 = 'r';     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0098, code lost:            r4 = 'n';     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009b, code lost:            r4 = 't';     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.Object r9, java.lang.String r10) {
        /*
            r8 = this;
            boolean r0 = r8.b
            r1 = 10
            r2 = -1
            r3 = 32
            r4 = 1
            java.lang.StringBuilder r5 = r8.a
            if (r0 == 0) goto L10
            r5.append(r3)
            goto L34
        L10:
            int r0 = r5.length()
            if (r0 <= 0) goto L2d
            int r0 = r5.length()
            r6 = 1000(0x3e8, float:1.401E-42)
            if (r0 > r6) goto L29
            java.lang.String r0 = "\n"
            int r0 = r5.indexOf(r0)
            if (r0 == r2) goto L27
            goto L29
        L27:
            r0 = r3
            goto L2a
        L29:
            r0 = r1
        L2a:
            r5.append(r0)
        L2d:
            java.lang.String r0 = "[CONTEXT "
            r5.append(r0)
            r8.b = r4
        L34:
            r5.append(r10)
            r10 = 61
            r5.append(r10)
            if (r9 != 0) goto L43
            r5.append(r4)
            goto Lb0
        L43:
            java.util.HashSet r10 = defpackage.C0102Au1.c
            java.lang.Class r0 = r9.getClass()
            boolean r10 = r10.contains(r0)
            if (r10 == 0) goto L53
            r5.append(r9)
            goto Lb0
        L53:
            r10 = 34
            r5.append(r10)
            java.lang.String r9 = r9.toString()
            r0 = 0
        L5d:
            r4 = r0
        L5e:
            int r6 = r9.length()
            r7 = 92
            if (r4 >= r6) goto L74
            char r6 = r9.charAt(r4)
            if (r6 < r3) goto L75
            if (r6 == r10) goto L75
            if (r6 != r7) goto L71
            goto L75
        L71:
            int r4 = r4 + 1
            goto L5e
        L74:
            r4 = r2
        L75:
            if (r4 == r2) goto La6
            r5.append(r9, r0, r4)
            int r0 = r4 + 1
            char r4 = r9.charAt(r4)
            r6 = 9
            if (r4 == r6) goto L9b
            if (r4 == r1) goto L98
            r6 = 13
            if (r4 == r6) goto L95
            if (r4 == r10) goto L9d
            if (r4 == r7) goto L9d
            r4 = 65533(0xfffd, float:9.1831E-41)
            r5.append(r4)
            goto L5d
        L95:
            r4 = 114(0x72, float:1.6E-43)
            goto L9d
        L98:
            r4 = 110(0x6e, float:1.54E-43)
            goto L9d
        L9b:
            r4 = 116(0x74, float:1.63E-43)
        L9d:
            java.lang.String r6 = "\\"
            r5.append(r6)
            r5.append(r4)
            goto L5d
        La6:
            int r1 = r9.length()
            r5.append(r9, r0, r1)
            r5.append(r10)
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0102Au1.a(java.lang.Object, java.lang.String):void");
    }
}
