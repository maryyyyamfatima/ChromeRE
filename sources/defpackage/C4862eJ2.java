package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: eJ2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4862eJ2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ KJ2 d;

    public C4862eJ2(KJ2 kj2, int i, int i2, int i3) {
        this.d = kj2;
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean a(int i) {
        KJ2 kj2 = this.d;
        int i2 = this.a;
        int i3 = this.b;
        int i4 = this.c;
        synchronized (kj2) {
            if (i4 != kj2.a.size()) {
                return false;
            }
            O00 o00 = (O00) kj2.a.get(i);
            if (!o00.f().g()) {
                int O = kj2.O(o00);
                int N = kj2.N(o00);
                if ((i >= i2 || o00.f().p()) && i <= i3) {
                    if (!o00.h(O, N)) {
                        o00.b(kj2.f, O, N, null);
                    }
                } else if (LK3.b()) {
                    KJ2.Y(o00, kj2.p);
                } else {
                    kj2.h.post(new RunnableC5550gJ2(kj2, o00));
                }
            }
            return true;
        }
    }
}
