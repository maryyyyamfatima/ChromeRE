package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class YT3 implements InterfaceC4582dW0 {
    public final /* synthetic */ LT3 a;
    public final /* synthetic */ InterfaceC4582dW0 b;

    public YT3(LT3 lt3, LZ lz) {
        this.a = lt3;
        this.b = lz;
    }

    @Override // defpackage.InterfaceC4582dW0
    public final void a(Object obj) {
        LT3 h = AbstractC6294iU3.h(this.a);
        try {
            this.b.a(obj);
        } finally {
            AbstractC6294iU3.h(h);
        }
    }

    @Override // defpackage.InterfaceC4582dW0
    public final void b(Throwable th) {
        LT3 h = AbstractC6294iU3.h(this.a);
        try {
            this.b.b(th);
        } finally {
            AbstractC6294iU3.h(h);
        }
    }
}
