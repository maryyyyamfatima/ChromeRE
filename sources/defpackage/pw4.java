package defpackage;

import android.content.Context;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class pw4 implements Runnable {
    public final /* synthetic */ Context a;

    public pw4(Context context) {
        this.a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bw4 bw4;
        Context context = this.a;
        synchronized (Bw4.class) {
            if (Bw4.j == null) {
                EnumC7143kw4 enumC7143kw4 = EnumC7143kw4.a;
                Bw4.j = new Bw4(context);
            }
            bw4 = Bw4.j;
        }
        synchronized (bw4) {
            bw4.f = true;
            bw4.b();
        }
    }
}
