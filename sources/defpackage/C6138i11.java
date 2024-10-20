package defpackage;

import J.N;
import android.app.PendingIntent;
import com.google.android.gms.auth.folsom.SharedKey;
import com.google.android.gms.common.Feature;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.sync.TrustedVaultClient;
import org.chromium.components.signin.base.CoreAccountInfo;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: i11 */
/* loaded from: classes.dex */
public final class C6138i11 implements EX3 {
    public final C2421Sq1 a;

    public C6138i11(C2421Sq1 c2421Sq1) {
        this.a = c2421Sq1;
    }

    @Override // defpackage.EX3
    public final MC2 b(CoreAccountInfo coreAccountInfo) {
        final MC2 mc2 = new MC2();
        AF3 f = this.a.f(coreAccountInfo.getEmail());
        f.e(new InterfaceC7371ld2() { // from class: a11
            @Override // defpackage.InterfaceC7371ld2
            public final void a(Object obj) {
                final List list = (List) obj;
                QF3 qf3 = AbstractC5103f04.a;
                final MC2 mc22 = MC2.this;
                PostTask.d(qf3, new Runnable() { // from class: Y01
                    @Override // java.lang.Runnable
                    public final void run() {
                        ArrayList arrayList = new ArrayList();
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((SharedKey) it.next()).g);
                        }
                        mc22.b(arrayList);
                    }
                });
            }
        });
        f.c(new InterfaceC2872Wc2() { // from class: b11
            @Override // defpackage.InterfaceC2872Wc2
            public final void c(final Exception exc) {
                QF3 qf3 = AbstractC5103f04.a;
                final MC2 mc22 = MC2.this;
                PostTask.d(qf3, new Runnable() { // from class: P01
                    @Override // java.lang.Runnable
                    public final void run() {
                        MC2.this.e(exc);
                    }
                });
            }
        });
        return mc2;
    }

    @Override // defpackage.EX3
    public final MC2 a(CoreAccountInfo coreAccountInfo) {
        final MC2 mc2 = new MC2();
        AF3 f = this.a.f(coreAccountInfo.getEmail());
        f.e(new InterfaceC7371ld2() { // from class: e11
            @Override // defpackage.InterfaceC7371ld2
            public final void a(Object obj) {
                QF3 qf3 = AbstractC5103f04.a;
                final MC2 mc22 = MC2.this;
                PostTask.d(qf3, new Runnable() { // from class: T01
                    @Override // java.lang.Runnable
                    public final void run() {
                        long j = TrustedVaultClient.a().b;
                        if (j != 0) {
                            N.MlSGBpm_(j);
                        }
                        MC2.this.e(null);
                    }
                });
            }
        });
        f.c(new InterfaceC2872Wc2() { // from class: f11
            @Override // defpackage.InterfaceC2872Wc2
            public final void c(final Exception exc) {
                boolean z = exc instanceof AO2;
                final MC2 mc22 = MC2.this;
                if (!z) {
                    AbstractC4851eH1.a("GmsTrustedVault", "Error while creating key retrieval intent: ", exc);
                    PostTask.d(AbstractC5103f04.a, new Runnable() { // from class: R01
                        @Override // java.lang.Runnable
                        public final void run() {
                            MC2.this.e(exc);
                        }
                    });
                } else {
                    final PendingIntent pendingIntent = ((AO2) exc).a.i;
                    PostTask.d(AbstractC5103f04.a, new Runnable() { // from class: Q01
                        @Override // java.lang.Runnable
                        public final void run() {
                            MC2.this.b(pendingIntent);
                        }
                    });
                }
            }
        });
        return mc2;
    }

    @Override // defpackage.EX3
    public final MC2 c(CoreAccountInfo coreAccountInfo) {
        final MC2 mc2 = new MC2();
        String email = coreAccountInfo.getEmail();
        C2421Sq1 c2421Sq1 = this.a;
        c2421Sq1.getClass();
        C5531gF3 c5531gF3 = new C5531gF3();
        c5531gF3.a = new C2291Rq1(email);
        c5531gF3.c = new Feature[]{EI0.a};
        c5531gF3.d = 1582;
        AF3 b = c2421Sq1.b(0, c5531gF3.a());
        b.e(new InterfaceC7371ld2() { // from class: J01
            @Override // defpackage.InterfaceC7371ld2
            public final void a(Object obj) {
                QF3 qf3 = AbstractC5103f04.a;
                final MC2 mc22 = MC2.this;
                PostTask.d(qf3, new Runnable() { // from class: W01
                    @Override // java.lang.Runnable
                    public final void run() {
                        MC2.this.b(Boolean.TRUE);
                    }
                });
            }
        });
        b.c(new InterfaceC2872Wc2() { // from class: U01
            @Override // defpackage.InterfaceC2872Wc2
            public final void c(final Exception exc) {
                AbstractC4851eH1.a("GmsTrustedVault", "Error while marking keys as stale: ", exc);
                QF3 qf3 = AbstractC5103f04.a;
                final MC2 mc22 = MC2.this;
                PostTask.d(qf3, new Runnable() { // from class: M01
                    @Override // java.lang.Runnable
                    public final void run() {
                        MC2.this.e(exc);
                    }
                });
            }
        });
        return mc2;
    }

    @Override // defpackage.EX3
    public final MC2 d(CoreAccountInfo coreAccountInfo) {
        final MC2 mc2 = new MC2();
        String email = coreAccountInfo.getEmail();
        C2421Sq1 c2421Sq1 = this.a;
        c2421Sq1.getClass();
        C5531gF3 c5531gF3 = new C5531gF3();
        c5531gF3.a = new C1252Jq1(email);
        c5531gF3.c = new Feature[]{EI0.b};
        c5531gF3.d = 1643;
        AF3 b = c2421Sq1.b(0, c5531gF3.a());
        b.e(new InterfaceC7371ld2() { // from class: g11
            @Override // defpackage.InterfaceC7371ld2
            public final void a(Object obj) {
                final byte[] bArr = (byte[]) obj;
                QF3 qf3 = AbstractC5103f04.a;
                final MC2 mc22 = MC2.this;
                PostTask.d(qf3, new Runnable() { // from class: V01
                    @Override // java.lang.Runnable
                    public final void run() {
                        MC2 mc23 = MC2.this;
                        try {
                            mc23.b(Boolean.valueOf(C6138i11.h(bArr)));
                        } catch (C1127Ir1 e) {
                            AbstractC4851eH1.a("GmsTrustedVault", "Error while parsing product details: ", e);
                            mc23.e(e);
                        }
                    }
                });
            }
        });
        b.c(new InterfaceC2872Wc2() { // from class: h11
            @Override // defpackage.InterfaceC2872Wc2
            public final void c(final Exception exc) {
                AbstractC4851eH1.a("GmsTrustedVault", "Error while getting product details: ", exc);
                QF3 qf3 = AbstractC5103f04.a;
                final MC2 mc22 = MC2.this;
                PostTask.d(qf3, new Runnable() { // from class: O01
                    @Override // java.lang.Runnable
                    public final void run() {
                        MC2.this.e(exc);
                    }
                });
            }
        });
        return mc2;
    }

    @Override // defpackage.EX3
    public final MC2 f(CoreAccountInfo coreAccountInfo, byte[] bArr, int i) {
        final MC2 mc2 = new MC2();
        String email = coreAccountInfo.getEmail();
        C2421Sq1 c2421Sq1 = this.a;
        c2421Sq1.getClass();
        C5531gF3 c5531gF3 = new C5531gF3();
        c5531gF3.a = new C1512Lq1(email, bArr, i);
        c5531gF3.c = new Feature[]{EI0.c};
        c5531gF3.d = 1646;
        AF3 b = c2421Sq1.b(0, c5531gF3.a());
        b.e(new InterfaceC7371ld2() { // from class: K01
            @Override // defpackage.InterfaceC7371ld2
            public final void a(Object obj) {
                QF3 qf3 = AbstractC5103f04.a;
                final MC2 mc22 = MC2.this;
                PostTask.d(qf3, new Runnable() { // from class: X01
                    @Override // java.lang.Runnable
                    public final void run() {
                        MC2.this.b(null);
                    }
                });
            }
        });
        b.c(new InterfaceC2872Wc2() { // from class: L01
            @Override // defpackage.InterfaceC2872Wc2
            public final void c(final Exception exc) {
                QF3 qf3 = AbstractC5103f04.a;
                final MC2 mc22 = MC2.this;
                PostTask.d(qf3, new Runnable() { // from class: S01
                    @Override // java.lang.Runnable
                    public final void run() {
                        MC2.this.e(exc);
                    }
                });
            }
        });
        return mc2;
    }

    @Override // defpackage.EX3
    public final MC2 g(CoreAccountInfo coreAccountInfo) {
        return i(2, coreAccountInfo);
    }

    @Override // defpackage.EX3
    public final MC2 e(CoreAccountInfo coreAccountInfo) {
        return i(4, coreAccountInfo);
    }

    public final MC2 i(final int i, CoreAccountInfo coreAccountInfo) {
        final MC2 mc2 = new MC2();
        String email = coreAccountInfo.getEmail();
        C2421Sq1 c2421Sq1 = this.a;
        c2421Sq1.getClass();
        C5531gF3 c5531gF3 = new C5531gF3();
        c5531gF3.a = new C1771Nq1(email, i);
        c5531gF3.c = new Feature[]{EI0.c};
        c5531gF3.d = 1647;
        AF3 b = c2421Sq1.b(0, c5531gF3.a());
        b.e(new InterfaceC7371ld2() { // from class: c11
            @Override // defpackage.InterfaceC7371ld2
            public final void a(Object obj) {
                final PendingIntent pendingIntent = (PendingIntent) obj;
                QF3 qf3 = AbstractC5103f04.a;
                final MC2 mc22 = MC2.this;
                PostTask.d(qf3, new Runnable() { // from class: Z01
                    @Override // java.lang.Runnable
                    public final void run() {
                        MC2.this.b(pendingIntent);
                    }
                });
            }
        });
        b.c(new InterfaceC2872Wc2() { // from class: d11
            @Override // defpackage.InterfaceC2872Wc2
            public final void c(final Exception exc) {
                AbstractC4851eH1.a("GmsTrustedVault", "Error while creating pending intent for UX flow ", Integer.valueOf(i), ": ", exc);
                QF3 qf3 = AbstractC5103f04.a;
                final MC2 mc22 = mc2;
                PostTask.d(qf3, new Runnable() { // from class: N01
                    @Override // java.lang.Runnable
                    public final void run() {
                        MC2.this.e(exc);
                    }
                });
            }
        });
        return mc2;
    }

    public static boolean h(byte[] bArr) {
        C6488j23 c6488j23 = C6488j23.k;
        int length = bArr.length;
        XF0 c = XF0.c();
        C6488j23 c6488j232 = new C6488j23();
        try {
            C7931nE2 c7931nE2 = C7931nE2.c;
            c7931nE2.getClass();
            QW2 b = c7931nE2.b(c6488j232.getClass());
            b.f(c6488j232, bArr, 0, length + 0, new C2254Rj(c));
            b.b(c6488j232);
            if (c6488j232.a != 0) {
                throw new RuntimeException();
            }
            QX0.i(c6488j232);
            C6146i23 c6146i23 = c6488j232.j;
            if (c6146i23 == null) {
                c6146i23 = C6146i23.k;
            }
            return c6146i23.j;
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
