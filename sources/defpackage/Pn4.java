package defpackage;

import android.app.Activity;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class Pn4 extends AbstractC0247Bx1 {
    public final Kn4 l;

    public Pn4(Activity activity, Kn4 kn4) {
        super(activity);
        this.l = kn4;
    }

    @Override // defpackage.AbstractC0247Bx1
    public final int a() {
        Kn4 kn4 = this.l;
        if (kn4 == null) {
            return 0;
        }
        int i = kn4.f().i;
        return i != 5 && i != 9 && i != 14 && i != 13 && i != 15 ? (!kn4.j() || kn4.e().i == 0) ? 14 : 15 : kn4.f().i == 9 ? 12 : 0;
    }
}
