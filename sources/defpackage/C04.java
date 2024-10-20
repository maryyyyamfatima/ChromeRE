package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class C04 extends L90 {
    public static final /* synthetic */ int h = 0;

    static {
        new C04();
    }

    @Override // defpackage.L90
    public final String toString() {
        return "Dispatchers.Unconfined";
    }

    @Override // defpackage.L90
    public final void y(E90 e90, Runnable runnable) {
        B04.a(e90.b(AbstractC7807ms4.g));
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }
}
