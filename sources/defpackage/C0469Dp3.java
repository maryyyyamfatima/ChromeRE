package defpackage;

import java.util.Objects;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Dp3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0469Dp3 implements InterfaceC0209Bp3 {
    public volatile InterfaceC0209Bp3 a;
    public volatile boolean g;
    public Object h;

    public C0469Dp3(InterfaceC0209Bp3 interfaceC0209Bp3) {
        this.a = interfaceC0209Bp3;
    }

    @Override // defpackage.InterfaceC0209Bp3
    public final Object get() {
        if (!this.g) {
            synchronized (this) {
                if (!this.g) {
                    InterfaceC0209Bp3 interfaceC0209Bp3 = this.a;
                    Objects.requireNonNull(interfaceC0209Bp3);
                    Object obj = interfaceC0209Bp3.get();
                    this.h = obj;
                    this.g = true;
                    this.a = null;
                    return obj;
                }
            }
        }
        return this.h;
    }

    public final String toString() {
        Object obj = this.a;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (obj == null) {
            obj = "<supplier that returned " + this.h + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
