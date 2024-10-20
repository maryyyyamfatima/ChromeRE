package defpackage;

import java.io.Serializable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class W62 implements Serializable {
    public final Throwable a;

    public W62(Throwable th) {
        this.a = th;
    }

    public final String toString() {
        return AbstractC4199cO1.a("NotificationLite.Error[", String.valueOf(this.a), "]");
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof W62)) {
            return false;
        }
        Object obj2 = ((W62) obj).a;
        Throwable th = this.a;
        return th == obj2 || (th != null && th.equals(obj2));
    }
}
