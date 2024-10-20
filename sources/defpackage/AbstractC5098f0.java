package defpackage;

import java.util.Map;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5098f0 implements InterfaceC8195o02 {
    public transient Set a;
    public transient Map g;

    @Override // defpackage.InterfaceC8195o02
    public abstract Map a();

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a().toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InterfaceC8195o02) {
            return a().equals(((InterfaceC8195o02) obj).a());
        }
        return false;
    }
}
