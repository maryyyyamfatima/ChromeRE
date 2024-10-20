package defpackage;

import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class AD1 implements Runnable {
    public final /* synthetic */ BD1 a;

    public AD1(BD1 bd1) {
        this.a = bd1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BD1 bd1 = this.a;
        C5753gu0 c5753gu0 = bd1.h;
        if (c5753gu0 != null) {
            WeakHashMap weakHashMap = Ec4.a;
            if (!c5753gu0.isAttachedToWindow() || bd1.h.getCount() <= bd1.h.getChildCount() || bd1.h.getChildCount() > bd1.r) {
                return;
            }
            bd1.E.setInputMethodMode(2);
            bd1.b();
        }
    }
}
