package defpackage;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.Locale;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Kx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1415Kx {
    public static final String d;
    public static final String e;
    public static final C1415Kx f;
    public static final C1415Kx g;
    public final boolean a;
    public final int b;
    public final DH3 c;

    static {
        EH3 eh3 = GH3.c;
        d = Character.toString((char) 8206);
        e = Character.toString((char) 8207);
        f = new C1415Kx(false, 2, eh3);
        g = new C1415Kx(true, 2, eh3);
    }

    public static C1415Kx c() {
        Locale locale = Locale.getDefault();
        int i = CJ3.a;
        return TextUtils.getLayoutDirectionFromLocale(locale) == 1 ? g : f;
    }

    public C1415Kx(boolean z, int i, EH3 eh3) {
        this.a = z;
        this.b = i;
        this.c = eh3;
    }

    public final String d(String str) {
        String str2;
        if (str == null) {
            return null;
        }
        boolean b = this.c.b(str, str.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean z = (this.b & 2) != 0;
        String str3 = e;
        String str4 = d;
        boolean z2 = this.a;
        if (z) {
            boolean b2 = (b ? GH3.b : GH3.a).b(str, str.length());
            if (z2 || !(b2 || a(str) == 1)) {
                str2 = (!z2 || (b2 && a(str) != -1)) ? "" : str3;
            } else {
                str2 = str4;
            }
            spannableStringBuilder.append((CharSequence) str2);
        }
        if (b != z2) {
            spannableStringBuilder.append(b ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append((CharSequence) str);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append((CharSequence) str);
        }
        boolean b3 = (b ? GH3.b : GH3.a).b(str, str.length());
        if (!z2 && (b3 || b(str) == 1)) {
            str3 = str4;
        } else if (!z2 || (b3 && b(str) != -1)) {
            str3 = "";
        }
        spannableStringBuilder.append((CharSequence) str3);
        return spannableStringBuilder.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0041, code lost:            return 1;     */
    /* JADX WARN: Failed to find 'out' block for switch in B:34:0x0020. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int b(java.lang.CharSequence r6) {
        /*
            Jx r0 = new Jx
            r0.<init>(r6)
            int r6 = r0.b
            r0.c = r6
            r6 = 0
            r1 = r6
        Lb:
            r2 = r1
        Lc:
            int r3 = r0.c
            if (r3 <= 0) goto L41
            byte r3 = r0.a()
            if (r3 == 0) goto L39
            r4 = 1
            if (r3 == r4) goto L32
            r5 = 2
            if (r3 == r5) goto L32
            r5 = 9
            if (r3 == r5) goto Lc
            switch(r3) {
                case 14: goto L2c;
                case 15: goto L2c;
                case 16: goto L29;
                case 17: goto L29;
                case 18: goto L26;
                default: goto L23;
            }
        L23:
            if (r1 != 0) goto Lc
            goto L3f
        L26:
            int r2 = r2 + 1
            goto Lc
        L29:
            if (r1 != r2) goto L2f
            goto L34
        L2c:
            if (r1 != r2) goto L2f
            goto L3b
        L2f:
            int r2 = r2 + (-1)
            goto Lc
        L32:
            if (r2 != 0) goto L36
        L34:
            r6 = r4
            goto L41
        L36:
            if (r1 != 0) goto Lc
            goto L3f
        L39:
            if (r2 != 0) goto L3d
        L3b:
            r6 = -1
            goto L41
        L3d:
            if (r1 != 0) goto Lc
        L3f:
            r1 = r2
            goto Lb
        L41:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1415Kx.b(java.lang.CharSequence):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:            return 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x006e, code lost:            if (r3 != 0) goto L31;     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0071, code lost:            if (r4 == 0) goto L33;     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008f, code lost:            return r4;     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0077, code lost:            if (r0.c <= 0) goto L63;     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x007d, code lost:            switch(r0.a()) {            case 14: goto L66;            case 15: goto L66;            case 16: goto L65;            case 17: goto L65;            case 18: goto L64;            default: goto L70;        };     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0081, code lost:            r5 = r5 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0084, code lost:            if (r3 != r5) goto L43;     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x008c, code lost:            r5 = r5 - 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0088, code lost:            if (r3 != r5) goto L43;     */
    /* JADX WARN: Code restructure failed: missing block: B:69:?, code lost:            return 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:70:?, code lost:            return 0;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int a(java.lang.CharSequence r9) {
        /*
            Jx r0 = new Jx
            r0.<init>(r9)
            r9 = 0
            r0.c = r9
            r1 = -1
            r2 = 1
            r3 = r9
            r4 = r3
            r5 = r4
        Ld:
            int r6 = r0.c
            int r7 = r0.b
            if (r6 >= r7) goto L6e
            if (r3 != 0) goto L6e
            java.lang.CharSequence r7 = r0.a
            char r6 = r7.charAt(r6)
            r0.d = r6
            boolean r6 = java.lang.Character.isHighSurrogate(r6)
            if (r6 == 0) goto L37
            int r6 = r0.c
            int r6 = java.lang.Character.codePointAt(r7, r6)
            int r7 = r0.c
            int r8 = java.lang.Character.charCount(r6)
            int r8 = r8 + r7
            r0.c = r8
            byte r6 = java.lang.Character.getDirectionality(r6)
            goto L4b
        L37:
            int r6 = r0.c
            int r6 = r6 + r2
            r0.c = r6
            char r6 = r0.d
            r7 = 1792(0x700, float:2.511E-42)
            if (r6 >= r7) goto L47
            byte[] r7 = defpackage.C1285Jx.e
            r6 = r7[r6]
            goto L4b
        L47:
            byte r6 = java.lang.Character.getDirectionality(r6)
        L4b:
            if (r6 == 0) goto L69
            if (r6 == r2) goto L66
            r7 = 2
            if (r6 == r7) goto L66
            r7 = 9
            if (r6 == r7) goto Ld
            switch(r6) {
                case 14: goto L62;
                case 15: goto L62;
                case 16: goto L5e;
                case 17: goto L5e;
                case 18: goto L5a;
                default: goto L59;
            }
        L59:
            goto L6c
        L5a:
            int r5 = r5 + (-1)
            r4 = r9
            goto Ld
        L5e:
            int r5 = r5 + 1
            r4 = r2
            goto Ld
        L62:
            int r5 = r5 + 1
            r4 = r1
            goto Ld
        L66:
            if (r5 != 0) goto L6c
            goto L86
        L69:
            if (r5 != 0) goto L6c
            goto L8a
        L6c:
            r3 = r5
            goto Ld
        L6e:
            if (r3 != 0) goto L71
            goto L8f
        L71:
            if (r4 == 0) goto L75
            r9 = r4
            goto L8f
        L75:
            int r4 = r0.c
            if (r4 <= 0) goto L8f
            byte r4 = r0.a()
            switch(r4) {
                case 14: goto L88;
                case 15: goto L88;
                case 16: goto L84;
                case 17: goto L84;
                case 18: goto L81;
                default: goto L80;
            }
        L80:
            goto L75
        L81:
            int r5 = r5 + 1
            goto L75
        L84:
            if (r3 != r5) goto L8c
        L86:
            r9 = r2
            goto L8f
        L88:
            if (r3 != r5) goto L8c
        L8a:
            r9 = r1
            goto L8f
        L8c:
            int r5 = r5 + (-1)
            goto L75
        L8f:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1415Kx.a(java.lang.CharSequence):int");
    }
}
