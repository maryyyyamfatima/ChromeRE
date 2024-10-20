package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: np1 */
/* loaded from: classes2.dex */
public abstract class AbstractC8130np1 {
    public static boolean a(InterfaceC7559m90 interfaceC7559m90, AbstractC6754jp1 abstractC6754jp1, C10620v43 c10620v43, DV1 dv1) {
        C1730Ni0 a = AbstractC7902n9.a(c10620v43.b());
        try {
            a.c(AR2.b);
            C12112zR2 b = C12112zR2.b(a);
            a.a();
            ER2 er2 = new ER2();
            DR2 dr2 = new DR2();
            er2.b = dr2;
            if (b.a == 0) {
                C10685vG2 c10685vG2 = new C10685vG2();
                dr2.a = 0;
                dr2.b = c10685vG2;
                abstractC6754jp1.f();
                c10685vG2.b = 0;
            } else {
                er2.b = null;
            }
            return dv1.A(er2.c(interfaceC7559m90, new C5953hV1(-1, 2, c10620v43.d.d)));
        } catch (Throwable th) {
            a.a();
            throw th;
        }
    }
}
