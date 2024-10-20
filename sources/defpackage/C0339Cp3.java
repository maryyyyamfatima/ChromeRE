package defpackage;

import java.io.Serializable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Cp3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0339Cp3 implements InterfaceC0209Bp3, Serializable {
    public final InterfaceC0209Bp3 a;
    public volatile transient boolean g;
    public transient Object h;

    public C0339Cp3(InterfaceC0209Bp3 interfaceC0209Bp3) {
        this.a = interfaceC0209Bp3;
    }

    @Override // defpackage.InterfaceC0209Bp3
    public final Object get() {
        if (!this.g) {
            synchronized (this) {
                if (!this.g) {
                    Object obj = this.a.get();
                    this.h = obj;
                    this.g = true;
                    return obj;
                }
            }
        }
        return this.h;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (this.g) {
            obj = "<supplier that returned " + this.h + ">";
        } else {
            obj = this.a;
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
