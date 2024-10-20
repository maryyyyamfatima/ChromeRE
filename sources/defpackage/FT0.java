package defpackage;

import android.os.Handler;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class FT0 implements CA1 {
    public final /* synthetic */ Handler a;
    public final /* synthetic */ Runnable b;

    public FT0(Handler handler, ET0 et0) {
        this.a = handler;
        this.b = et0;
    }

    @Override // defpackage.CA1
    public final void c(JA1 ja1, EnumC11340xA1 enumC11340xA1) {
        if (enumC11340xA1 == EnumC11340xA1.ON_DESTROY) {
            this.a.removeCallbacks(this.b);
            ja1.Z().b(this);
        }
    }
}
