package defpackage;

import android.os.Handler;
import android.os.Message;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cQ1 */
/* loaded from: classes.dex */
public final class HandlerC4209cQ1 extends Handler {
    public final /* synthetic */ AbstractC5584gQ1 a;

    public HandlerC4209cQ1(AbstractC5584gQ1 abstractC5584gQ1) {
        this.a = abstractC5584gQ1;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        AbstractC5584gQ1 abstractC5584gQ1 = this.a;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            abstractC5584gQ1.k = false;
            abstractC5584gQ1.f(abstractC5584gQ1.j);
            return;
        }
        abstractC5584gQ1.m = false;
        C10734vQ1 c10734vQ1 = abstractC5584gQ1.i;
        if (c10734vQ1 != null) {
            C5928hQ1 c5928hQ1 = abstractC5584gQ1.l;
            C11420xQ1 c11420xQ1 = c10734vQ1.a;
            CQ1 d = c11420xQ1.d(abstractC5584gQ1);
            if (d != null) {
                c11420xQ1.o(d, c5928hQ1);
            }
        }
    }
}
