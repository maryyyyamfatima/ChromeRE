package defpackage;

import java.io.IOException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final /* synthetic */ class VF implements InterfaceC0618Et2 {
    @Override // defpackage.InterfaceC0618Et2
    public final Object a(byte[] bArr) {
        C9409rZ3 c9409rZ3 = C9409rZ3.k;
        int length = bArr.length;
        XF0 c = XF0.c();
        C9409rZ3 c9409rZ32 = C9409rZ3.k;
        C9409rZ3 c9409rZ33 = new C9409rZ3();
        try {
            C7931nE2 c7931nE2 = C7931nE2.c;
            c7931nE2.getClass();
            QW2 b = c7931nE2.b(c9409rZ33.getClass());
            b.f(c9409rZ33, bArr, 0, length + 0, new C2254Rj(c));
            b.b(c9409rZ33);
            if (c9409rZ33.a != 0) {
                throw new RuntimeException();
            }
            QX0.i(c9409rZ33);
            return c9409rZ33;
        } catch (C1127Ir1 e) {
            if (e.g) {
                throw new C1127Ir1(e);
            }
            throw e;
        } catch (IOException e2) {
            if (e2.getCause() instanceof C1127Ir1) {
                throw ((C1127Ir1) e2.getCause());
            }
            throw new C1127Ir1(e2);
        } catch (IndexOutOfBoundsException unused) {
            throw C1127Ir1.h();
        } catch (C6827k14 e3) {
            throw e3.a();
        }
    }
}
