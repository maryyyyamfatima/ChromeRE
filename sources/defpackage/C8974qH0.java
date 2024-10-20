package defpackage;

import android.util.Log;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qH0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8974qH0 implements InterfaceC9208qx2 {
    public final InterfaceC8631pH0 a;
    public final InterfaceC9659sH0 b;
    public final InterfaceC9208qx2 c;

    public C8974qH0(C9893sx2 c9893sx2, InterfaceC8631pH0 interfaceC8631pH0, InterfaceC9659sH0 interfaceC9659sH0) {
        this.c = c9893sx2;
        this.a = interfaceC8631pH0;
        this.b = interfaceC9659sH0;
    }

    @Override // defpackage.InterfaceC9208qx2
    public final Object b() {
        Object b = this.c.b();
        if (b == null) {
            b = this.a.a();
            if (Log.isLoggable("FactoryPools", 2)) {
                String.valueOf(b.getClass());
            }
        }
        if (b instanceof InterfaceC9316rH0) {
            ((InterfaceC9316rH0) b).c().a = false;
        }
        return b;
    }

    @Override // defpackage.InterfaceC9208qx2
    public final boolean a(Object obj) {
        if (obj instanceof InterfaceC9316rH0) {
            ((InterfaceC9316rH0) obj).c().a = true;
        }
        this.b.a(obj);
        return this.c.a(obj);
    }
}
