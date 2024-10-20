package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: At, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0095At {
    public final String a;
    public final int b;
    public int c;

    public static C0095At a(String str) {
        if (str == null) {
            return null;
        }
        String[] split = str.split(":");
        if (split.length == 3 && !split[0].isEmpty() && !split[1].isEmpty() && !split[2].isEmpty()) {
            try {
                return new C0095At(Integer.parseInt(split[1]), Integer.parseInt(split[2]), split[0]);
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public C0095At(int i, int i2, String str) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final String toString() {
        return this.a + ":" + this.b + ":" + this.c;
    }
}
