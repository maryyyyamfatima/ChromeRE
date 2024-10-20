package defpackage;

import java.io.Serializable;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: my2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7840my2 implements InterfaceC6808jy2, Serializable {
    public final List a;

    public C7840my2(List list) {
        this.a = list;
    }

    @Override // defpackage.InterfaceC6808jy2
    public final boolean apply(Object obj) {
        int i = 0;
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                return true;
            }
            if (!((InterfaceC6808jy2) list.get(i)).apply(obj)) {
                return false;
            }
            i++;
        }
    }

    public final int hashCode() {
        return this.a.hashCode() + 306654252;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7840my2) {
            return this.a.equals(((C7840my2) obj).a);
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z = true;
        for (Object obj : this.a) {
            if (!z) {
                sb.append(',');
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
