package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kj2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7063kj2 extends RuntimeException {
    public static C7063kj2 c(int i, String str, int i2, String str2) {
        return new C7063kj2(b(i, str, i2, str2));
    }

    public static C7063kj2 a(int i, String str, String str2) {
        return new C7063kj2(b(i, str, i + 1, str2));
    }

    public static C7063kj2 d(int i, String str, String str2) {
        return new C7063kj2(b(i, str, -1, str2));
    }

    public C7063kj2(String str) {
        super(str);
    }

    public static String b(int i, String str, int i2, String str2) {
        if (i2 < 0) {
            i2 = str2.length();
        }
        StringBuilder sb = new StringBuilder(str);
        sb.append(": ");
        if (i > 8) {
            sb.append("...");
            sb.append((CharSequence) str2, i - 5, i);
        } else {
            sb.append((CharSequence) str2, 0, i);
        }
        sb.append('[');
        sb.append(str2.substring(i, i2));
        sb.append(']');
        if (str2.length() - i2 > 8) {
            sb.append((CharSequence) str2, i2, i2 + 5);
            sb.append("...");
        } else {
            sb.append((CharSequence) str2, i2, str2.length());
        }
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this;
    }
}
