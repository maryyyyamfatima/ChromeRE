package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class XT3 implements Runnable {
    public final /* synthetic */ LT3 a;
    public final /* synthetic */ Runnable g;

    public XT3(LT3 lt3, Runnable runnable) {
        this.a = lt3;
        this.g = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LT3 h = AbstractC6294iU3.h(this.a);
        try {
            this.g.run();
        } finally {
        }
    }

    public final String toString() {
        return AbstractC4199cO1.a("propagating=[", String.valueOf(this.g), "]");
    }
}
