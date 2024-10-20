package defpackage;

import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Xu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3089Xu {
    public static final C2959Wu c = new C2959Wu("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    public final C2699Uu a;
    public final Character b;

    static {
        new C2959Wu("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
        new C3089Xu("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
        new C3089Xu("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
        new C2829Vu(new C2699Uu("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public C3089Xu(String str, String str2, Character ch) {
        this(new C2699Uu(str, str2.toCharArray()), ch);
    }

    public C3089Xu(C2699Uu c2699Uu, Character ch) {
        this.a = c2699Uu;
        if (ch != null) {
            char charValue = ch.charValue();
            byte[] bArr = c2699Uu.f;
            if (charValue >= bArr.length || bArr[charValue] == -1) {
            }
        }
        this.b = ch;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        C2699Uu c2699Uu = this.a;
        sb.append(c2699Uu.a);
        if (8 % c2699Uu.c != 0) {
            Character ch = this.b;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3089Xu)) {
            return false;
        }
        C3089Xu c3089Xu = (C3089Xu) obj;
        return this.a.equals(c3089Xu.a) && V82.a(this.b, c3089Xu.b);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ Arrays.hashCode(new Object[]{this.b});
    }
}
