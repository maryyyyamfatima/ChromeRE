package defpackage;

import java.util.concurrent.Callable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xJ1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC11385xJ1 implements Callable {
    public final /* synthetic */ C8985qJ1 a;

    public CallableC11385xJ1(C8985qJ1 c8985qJ1) {
        this.a = c8985qJ1;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return new OJ1(this.a);
    }
}
