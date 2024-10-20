package defpackage;

import java.util.concurrent.Executor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pB0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8601pB0 {
    public final QO2 a;
    public final Executor b;

    public C8601pB0(QO2 qo2, Executor executor) {
        this.a = qo2;
        this.b = executor;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C8601pB0) {
            return this.a.equals(((C8601pB0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
