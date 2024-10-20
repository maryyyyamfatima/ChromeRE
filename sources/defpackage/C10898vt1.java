package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vt1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10898vt1 extends CancellationException {
    public final InterfaceC10555ut1 a;

    public C10898vt1(String str, Throwable th, InterfaceC10555ut1 interfaceC10555ut1) {
        super(str);
        this.a = interfaceC10555ut1;
        if (th != null) {
            initCause(th);
        }
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.a;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C10898vt1) {
                C10898vt1 c10898vt1 = (C10898vt1) obj;
                if (!AbstractC0087Ar1.a(c10898vt1.getMessage(), getMessage()) || !AbstractC0087Ar1.a(c10898vt1.a, this.a) || !AbstractC0087Ar1.a(c10898vt1.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String message = getMessage();
        AbstractC0087Ar1.b(message);
        int hashCode = (this.a.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return hashCode + (cause == null ? 0 : cause.hashCode());
    }
}
