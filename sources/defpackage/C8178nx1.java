package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nx1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8178nx1 {
    public static C8178nx1 f;
    public InterfaceC7834mx1 b;
    public int d;
    public boolean e;
    public final C6802jx1 a = new InterfaceC2768Vh3() { // from class: jx1
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r2v6 */
        /* JADX WARN: Type inference failed for: r2v7 */
        @Override // defpackage.InterfaceC10160tk3
        public final void a(Object obj) {
            Zs4 zs4 = (Zs4) obj;
            C8178nx1 c8178nx1 = C8178nx1.this;
            c8178nx1.getClass();
            if (zs4.a != c8178nx1.d) {
                return;
            }
            int i = 3;
            int i2 = zs4.b;
            if (i2 == 5 || i2 == 6 || i2 == 7 || i2 == 3) {
                if (i2 != 3) {
                    if (i2 != 5) {
                        i = i2 != 6 ? i2 != 7 ? 5 : 2 : 4;
                    } else {
                        i = c8178nx1.e;
                    }
                }
                EI2.h(i, 6, "LanguageSettings.SplitInstallFinalStatus");
                c8178nx1.b.a(i2 == 5);
                c8178nx1.c.c(c8178nx1.a);
                c8178nx1.b = null;
                c8178nx1.d = 0;
                c8178nx1.e = false;
            }
        }
    };
    public final InterfaceC2248Rh3 c = AbstractC2378Sh3.a(V60.a);
}
