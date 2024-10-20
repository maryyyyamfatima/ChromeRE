package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Po, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2019Po {
    public String a;
    public byte[] b;
    public EnumC7223lA2 c;

    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.a = str;
    }

    public final void c(EnumC7223lA2 enumC7223lA2) {
        if (enumC7223lA2 == null) {
            throw new NullPointerException("Null priority");
        }
        this.c = enumC7223lA2;
    }

    public final C2149Qo a() {
        EnumC7223lA2 enumC7223lA2;
        String str = this.a;
        if (str == null || (enumC7223lA2 = this.c) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" backendName");
            }
            if (this.c == null) {
                sb.append(" priority");
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(sb)));
        }
        return new C2149Qo(str, this.b, enumC7223lA2);
    }
}
