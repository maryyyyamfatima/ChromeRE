package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Rc2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2222Rc2 extends RuntimeException {
    public C2222Rc2(Throwable th) {
        super("The exception was not handled due to missing onError handler in the subscribe() method call. Further reading: https://github.com/ReactiveX/RxJava/wiki/Error-Handling | ".concat(String.valueOf(th)), th == null ? new NullPointerException() : th);
    }
}
