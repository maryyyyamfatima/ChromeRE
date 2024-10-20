package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cU3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4231cU3 implements InterfaceC3299Zk {
    public final /* synthetic */ LT3 a;
    public final /* synthetic */ InterfaceC3299Zk b;

    public C4231cU3(LT3 lt3, InterfaceC3299Zk interfaceC3299Zk) {
        this.a = lt3;
        this.b = interfaceC3299Zk;
    }

    @Override // defpackage.InterfaceC3299Zk
    public final RD1 apply(Object obj) {
        LT3 h = AbstractC6294iU3.h(this.a);
        try {
            return this.b.apply(obj);
        } finally {
        }
    }

    public final String toString() {
        return AbstractC4199cO1.a("propagating=[", String.valueOf(this.b), "]");
    }
}
