package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iA2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6193iA2 extends AbstractC8702pV1 {
    public static final String a;

    /* JADX WARN: Code restructure failed: missing block: B:3:0x000c, code lost:            if (r0.matches("\\n|\\r(?:\\n)?") != false) goto L6;     */
    static {
        /*
            java.lang.String r0 = "line.separator"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.SecurityException -> Lf
            java.lang.String r1 = "\\n|\\r(?:\\n)?"
            boolean r1 = r0.matches(r1)     // Catch: java.lang.SecurityException -> Lf
            if (r1 == 0) goto Lf
            goto L11
        Lf:
            java.lang.String r0 = "\n"
        L11:
            defpackage.AbstractC6193iA2.a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC6193iA2.<clinit>():void");
    }

    public static int b(int i, String str) {
        while (i < str.length()) {
            int i2 = i + 1;
            if (str.charAt(i) != '%') {
                i = i2;
            } else if (i2 < str.length()) {
                char charAt = str.charAt(i2);
                if (charAt != '%' && charAt != 'n') {
                    return i2 - 1;
                }
                i = i2 + 1;
            } else {
                throw C7063kj2.d(i2 - 1, "trailing unquoted '%' character", str);
            }
        }
        return -1;
    }

    @Override // defpackage.AbstractC8702pV1
    public final void a(int i, int i2, String str, StringBuilder sb) {
        int i3 = i;
        while (i < i2) {
            int i4 = i + 1;
            if (str.charAt(i) == '%') {
                if (i4 == i2) {
                    break;
                }
                char charAt = str.charAt(i4);
                if (charAt == '%') {
                    sb.append((CharSequence) str, i3, i4);
                } else if (charAt == 'n') {
                    sb.append((CharSequence) str, i3, i4 - 1);
                    sb.append(a);
                }
                i3 = i4 + 1;
                i = i3;
            }
            i = i4;
        }
        if (i3 < i2) {
            sb.append((CharSequence) str, i3, i2);
        }
    }
}
