package defpackage;

import java.util.concurrent.TimeoutException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qN3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9007qN3 extends TimeoutException {
    public C9007qN3(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
