package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class A82 {
    public final long a;
    public final String b;

    public A82(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public static A82 a(String str) {
        int indexOf = str.indexOf(",");
        return new A82(Long.parseLong(str.substring(0, indexOf)), str.substring(indexOf + 1));
    }
}
