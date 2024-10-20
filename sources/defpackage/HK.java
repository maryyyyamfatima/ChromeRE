package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class HK extends FK {
    public static HK b;
    public boolean a;

    @Override // defpackage.FK
    public final void a() {
        C10431uY1 c10431uY1 = JK.a;
        if (c10431uY1.g() && UN.W.a()) {
            ((KK) c10431uY1.b()).getClass();
        }
    }

    @Override // defpackage.FK
    public final void b() {
        if (!UN.W.a() || this.a) {
            return;
        }
        C10431uY1 c10431uY1 = JK.a;
        if (!c10431uY1.g()) {
            c10431uY1.d(new InterfaceC2401Sm1() { // from class: GK
                @Override // defpackage.InterfaceC2401Sm1
                public final void a(boolean z) {
                    HK hk = HK.this;
                    if (!z) {
                        hk.getClass();
                    } else {
                        hk.a = true;
                        ((KK) JK.a.b()).getClass();
                    }
                }
            });
        } else {
            this.a = true;
            ((KK) c10431uY1.b()).getClass();
        }
    }
}
