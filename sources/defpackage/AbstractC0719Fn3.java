package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Fn3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0719Fn3 extends AbstractC0589En3 {
    public static String c(String str, String str2, String str3) {
        int a = a(str, str2, 0, false);
        if (a < 0) {
            return str;
        }
        int length = str2.length();
        int i = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i2 = 0;
        do {
            sb.append((CharSequence) str, i2, a);
            sb.append(str3);
            i2 = a + length;
            if (a >= str.length()) {
                break;
            }
            a = a(str, str2, a + i, false);
        } while (a > 0);
        sb.append((CharSequence) str, i2, str.length());
        String sb2 = sb.toString();
        AbstractC0087Ar1.d(sb2, "stringBuilder.append(this, i, length).toString()");
        return sb2;
    }

    public static String e(String str) {
        AbstractC0087Ar1.e(str, "<this>");
        AbstractC0087Ar1.e(str, "missingDelimiterValue");
        int lastIndexOf = str.lastIndexOf(46, str.length() - 1);
        if (lastIndexOf == -1) {
            return str;
        }
        String substring = str.substring(lastIndexOf + 1, str.length());
        AbstractC0087Ar1.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static boolean d(String str, String str2) {
        AbstractC0087Ar1.e(str, "<this>");
        AbstractC0087Ar1.e(str2, "prefix");
        return str.startsWith(str2);
    }

    public static int b(String str, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return str.indexOf(c, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:            return r12;     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008b A[EDGE_INSN: B:53:0x008b->B:27:0x008b BREAK  A[LOOP:1: B:35:0x0058->B:51:0x008f], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int a(java.lang.CharSequence r10, java.lang.String r11, int r12, boolean r13) {
        /*
            if (r13 != 0) goto Lf
            boolean r0 = r10 instanceof java.lang.String
            if (r0 != 0) goto L7
            goto Lf
        L7:
            java.lang.String r10 = (java.lang.String) r10
            int r10 = r10.indexOf(r11, r12)
            goto L92
        Lf:
            int r0 = r10.length()
            Go1 r1 = new Go1
            r2 = 0
            if (r12 >= 0) goto L19
            r12 = r2
        L19:
            int r3 = r10.length()
            if (r0 <= r3) goto L20
            r0 = r3
        L20:
            r1.<init>(r12, r0)
            boolean r0 = r10 instanceof java.lang.String
            int r3 = r1.h
            int r1 = r1.g
            if (r0 == 0) goto L50
            if (r3 <= 0) goto L2f
            if (r12 <= r1) goto L33
        L2f:
            if (r3 >= 0) goto L91
            if (r1 > r12) goto L91
        L33:
            r7 = r10
            java.lang.String r7 = (java.lang.String) r7
            int r9 = r11.length()
            if (r13 != 0) goto L41
            boolean r0 = r11.regionMatches(r2, r7, r12, r9)
            goto L49
        L41:
            r6 = 0
            r4 = r11
            r5 = r13
            r8 = r12
            boolean r0 = r4.regionMatches(r5, r6, r7, r8, r9)
        L49:
            if (r0 == 0) goto L4c
            goto L8b
        L4c:
            if (r12 == r1) goto L91
            int r12 = r12 + r3
            goto L33
        L50:
            if (r3 <= 0) goto L54
            if (r12 <= r1) goto L58
        L54:
            if (r3 >= 0) goto L91
            if (r1 > r12) goto L91
        L58:
            int r0 = r11.length()
            if (r12 < 0) goto L88
            int r4 = r11.length()
            int r4 = r4 - r0
            if (r4 < 0) goto L88
            int r4 = r10.length()
            int r4 = r4 - r0
            if (r12 <= r4) goto L6d
            goto L88
        L6d:
            r4 = r2
        L6e:
            if (r4 >= r0) goto L86
            int r5 = r2 + r4
            char r5 = r11.charAt(r5)
            int r6 = r12 + r4
            char r6 = r10.charAt(r6)
            boolean r5 = defpackage.AbstractC3485aJ.a(r5, r6, r13)
            if (r5 != 0) goto L83
            goto L88
        L83:
            int r4 = r4 + 1
            goto L6e
        L86:
            r0 = 1
            goto L89
        L88:
            r0 = r2
        L89:
            if (r0 == 0) goto L8d
        L8b:
            r10 = r12
            goto L92
        L8d:
            if (r12 == r1) goto L91
            int r12 = r12 + r3
            goto L58
        L91:
            r10 = -1
        L92:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC0719Fn3.a(java.lang.CharSequence, java.lang.String, int, boolean):int");
    }
}
