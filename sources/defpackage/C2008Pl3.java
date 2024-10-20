package defpackage;

import io.grpc.Status;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Pl3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2008Pl3 extends RuntimeException {
    public final Status a;
    public final boolean g;

    public C2008Pl3(Status status) {
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
