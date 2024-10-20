package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: em0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5017em0 extends RuntimeException {
    public final E90 a;

    public C5017em0(E90 e90) {
        this.a = e90;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.a.toString();
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
