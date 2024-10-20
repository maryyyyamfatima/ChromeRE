package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tg3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10136tg3 {
    public static final C10136tg3 c = new C10136tg3(3, null, true);
    public static final C10136tg3 d = new C10136tg3(2, null, true);
    public final int a;
    public final Object b;

    public static C10136tg3 a(int i) {
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (i2 == 1) {
            return d;
        }
        if (i2 == 2) {
            return c;
        }
        throw new IllegalArgumentException();
    }

    public C10136tg3(int i, Object obj, boolean z) {
        this.a = i;
        this.b = obj;
    }
}
