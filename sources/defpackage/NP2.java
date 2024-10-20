package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class NP2 extends MP2 implements LV0 {
    public final int g;

    @Override // defpackage.LV0
    public final int a() {
        return this.g;
    }

    public NP2(InterfaceC8927q80 interfaceC8927q80) {
        super(interfaceC8927q80);
        this.g = 2;
    }

    @Override // defpackage.AbstractC11245wu
    public final String toString() {
        if (this.a == null) {
            AbstractC3842bL2.a.getClass();
            String a = C4185cL2.a(this);
            AbstractC0087Ar1.d(a, "renderLambdaToString(this)");
            return a;
        }
        return super.toString();
    }
}
