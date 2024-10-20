package defpackage;

import java.util.HashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ap1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0077Ap1 implements InterfaceC8817pp1 {
    public final HashMap a = new HashMap();

    public final void c(AbstractC6754jp1 abstractC6754jp1, InterfaceC8474op1 interfaceC8474op1) {
        this.a.put(abstractC6754jp1.e(), new C12246zp1(abstractC6754jp1, interfaceC8474op1));
    }

    public static C0077Ap1 e(C11445xV1 c11445xV1) {
        C0077Ap1 c0077Ap1 = new C0077Ap1();
        C9026qR2 c9026qR2 = new C9026qR2(c11445xV1);
        c9026qR2.a.j = c0077Ap1;
        c9026qR2.g = new C10188tp1(c11445xV1.g, c0077Ap1);
        c9026qR2.b();
        return c0077Ap1;
    }

    @Override // defpackage.InterfaceC8817pp1
    public final void U(String str, InterfaceC11102wV1 interfaceC11102wV1) {
        C12246zp1 c12246zp1 = (C12246zp1) this.a.get(str);
        if (c12246zp1 == null) {
            return;
        }
        InterfaceC7786mp1 a = c12246zp1.b.a();
        if (a == null) {
            interfaceC11102wV1.close();
        } else {
            c12246zp1.a.b(a, interfaceC11102wV1);
        }
    }

    @Override // defpackage.InterfaceC7786mp1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.clear();
    }

    @Override // defpackage.D30
    public final void b(HY1 hy1) {
        close();
    }
}
