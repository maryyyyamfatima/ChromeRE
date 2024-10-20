package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: aU3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3544aU3 implements InterfaceC2909Wk {
    public final /* synthetic */ LT3 a;
    public final /* synthetic */ InterfaceC2909Wk b;

    public C3544aU3(LT3 lt3, InterfaceC2909Wk interfaceC2909Wk) {
        this.a = lt3;
        this.b = interfaceC2909Wk;
    }

    @Override // defpackage.InterfaceC2909Wk
    public final RD1 call() {
        LT3 h = AbstractC6294iU3.h(this.a);
        try {
            return this.b.call();
        } finally {
            AbstractC6294iU3.h(h);
        }
    }

    public final String toString() {
        return AbstractC4199cO1.a("propagating=[", String.valueOf(this.b), "]");
    }
}
