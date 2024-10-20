package io.grpc;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class StatusException extends Exception {
    public final Status a;
    public final boolean g;

    public StatusException(Status status) {
        super(Status.a(status), status.c);
        this.a = status;
        this.g = true;
        fillInStackTrace();
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this.g ? super.fillInStackTrace() : this;
    }
}
