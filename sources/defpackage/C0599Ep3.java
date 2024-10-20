package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ep3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0599Ep3 implements InterfaceC0209Bp3, Serializable {
    public final Object a;

    public C0599Ep3(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.InterfaceC0209Bp3
    public final Object get() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0599Ep3) {
            return V82.a(this.a, ((C0599Ep3) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.a + ")";
    }
}
