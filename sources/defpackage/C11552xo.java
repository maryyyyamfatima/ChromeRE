package defpackage;

import android.content.Context;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11552xo {
    public final Context a;
    public final InterfaceC0209Bp3 b;

    public C11552xo(Context context, InterfaceC0209Bp3 interfaceC0209Bp3) {
        this.a = context;
        this.b = interfaceC0209Bp3;
    }

    public final String toString() {
        return KR0.a("FlagsContext{context=", String.valueOf(this.a), ", hermeticFileOverrides=", String.valueOf(this.b), "}");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11552xo)) {
            return false;
        }
        C11552xo c11552xo = (C11552xo) obj;
        if (this.a.equals(c11552xo.a)) {
            InterfaceC0209Bp3 interfaceC0209Bp3 = c11552xo.b;
            InterfaceC0209Bp3 interfaceC0209Bp32 = this.b;
            if (interfaceC0209Bp32 == null) {
                if (interfaceC0209Bp3 == null) {
                    return true;
                }
            } else if (interfaceC0209Bp32.equals(interfaceC0209Bp3)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        InterfaceC0209Bp3 interfaceC0209Bp3 = this.b;
        return hashCode ^ (interfaceC0209Bp3 == null ? 0 : interfaceC0209Bp3.hashCode());
    }
}
