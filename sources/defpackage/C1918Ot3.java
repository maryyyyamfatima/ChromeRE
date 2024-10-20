package defpackage;

import androidx.preference.Preference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ot3 */
/* loaded from: classes.dex */
public final /* synthetic */ class C1918Ot3 implements InterfaceC9555ry2 {
    public final /* synthetic */ AbstractC0123Ay2 a;
    public final /* synthetic */ Runnable g;

    public /* synthetic */ C1918Ot3(AbstractC0123Ay2 abstractC0123Ay2, Runnable runnable) {
        this.a = abstractC0123Ay2;
        this.g = runnable;
    }

    @Override // defpackage.InterfaceC9555ry2
    public final boolean p(Preference preference) {
        if (!this.a.a0()) {
            return false;
        }
        this.g.run();
        return false;
    }
}
