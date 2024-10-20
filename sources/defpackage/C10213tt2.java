package defpackage;

import java.io.IOException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tt2 */
/* loaded from: classes.dex */
public final class C10213tt2 implements InterfaceC9099qf0 {
    public final C0488Dt2 a;

    public C10213tt2(C0748Ft2 c0748Ft2) {
        C6881kB c6881kB = C6881kB.k;
        InterfaceC0618Et2 interfaceC0618Et2 = new InterfaceC0618Et2() { // from class: rt2
            @Override // defpackage.InterfaceC0618Et2
            public final Object a(byte[] bArr) {
                C6881kB c6881kB2 = C6881kB.k;
                int length = bArr.length;
                XF0 c = XF0.c();
                C6881kB c6881kB3 = C6881kB.k;
                C6881kB c6881kB4 = new C6881kB();
                try {
                    C7931nE2 c7931nE2 = C7931nE2.c;
                    c7931nE2.getClass();
                    QW2 b = c7931nE2.b(c6881kB4.getClass());
                    b.f(c6881kB4, bArr, 0, length + 0, new C2254Rj(c));
                    b.b(c6881kB4);
                    if (c6881kB4.a != 0) {
                        throw new RuntimeException();
                    }
                    QX0.i(c6881kB4);
                    return c6881kB4;
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
        };
        c0748Ft2.getClass();
        this.a = AbstractC0878Gt2.a(interfaceC0618Et2, c0748Ft2, c6881kB, "chrome_bookmarks", false);
    }

    @Override // defpackage.InterfaceC9099qf0
    public final InterfaceC0048Aj2 a() {
        C0488Dt2 c0488Dt2 = this.a;
        if (((C6881kB) c0488Dt2.c()).j.size() == 0) {
            return null;
        }
        return new C9870st2((C6881kB) c0488Dt2.c());
    }
}
