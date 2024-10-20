package defpackage;

import java.util.concurrent.Callable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class ZT3 implements Callable {
    public final /* synthetic */ LT3 a;
    public final /* synthetic */ Callable g;

    public ZT3(LT3 lt3, Callable callable) {
        this.a = lt3;
        this.g = callable;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        LT3 h = AbstractC6294iU3.h(this.a);
        try {
            return this.g.call();
        } finally {
        }
    }

    public final String toString() {
        return AbstractC4199cO1.a("propagating=[", String.valueOf(this.g), "]");
    }
}
