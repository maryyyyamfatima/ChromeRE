package defpackage;

import java.util.concurrent.ExecutorService;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Mn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1624Mn {
    public final int a;
    public final ExecutorService b;
    public final AbstractC9095qe2 c;

    public C1624Mn(int i, ExecutorService executorService, AbstractC9095qe2 abstractC9095qe2) {
        this.a = i;
        this.b = executorService;
        this.c = abstractC9095qe2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder("AppFlowLoggerConfiguration{maxEventsInMemory=");
        sb.append(this.a);
        sb.append(", loggingExecutorService=");
        sb.append(valueOf);
        sb.append(", backgroundExecutorService=");
        return Y5.a(sb, valueOf2, "}");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1624Mn)) {
            return false;
        }
        C1624Mn c1624Mn = (C1624Mn) obj;
        return this.a == c1624Mn.a && this.b.equals(c1624Mn.b) && this.c.equals(c1624Mn.c);
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public static C1624Mn a() {
        C5785h c5785h = C5785h.a;
        PY1 py1 = new PY1();
        byte b = (byte) 1;
        if (b != 1) {
            StringBuilder sb = new StringBuilder();
            if ((b & 1) == 0) {
                sb.append(" maxEventsInMemory");
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(sb)));
        }
        return new C1624Mn(300, py1, c5785h);
    }
}
