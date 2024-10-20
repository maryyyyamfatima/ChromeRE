package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class QH1 extends Exception {
    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }

    public QH1(Throwable th, EnumC0434Di3 enumC0434Di3, StackTraceElement[] stackTraceElementArr) {
        super(enumC0434Di3.toString(), th);
        setStackTrace(stackTraceElementArr);
    }
}
