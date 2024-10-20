package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bU3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3888bU3 implements CV0 {
    public final /* synthetic */ LT3 a;
    public final /* synthetic */ CV0 b;

    public C3888bU3(LT3 lt3, AE ae) {
        this.a = lt3;
        this.b = ae;
    }

    @Override // defpackage.CV0
    public final Object apply(Object obj) {
        LT3 h = AbstractC6294iU3.h(this.a);
        try {
            return this.b.apply(obj);
        } finally {
            AbstractC6294iU3.h(h);
        }
    }

    public final String toString() {
        return AbstractC4199cO1.a("propagating=[", String.valueOf(this.b), "]");
    }
}
