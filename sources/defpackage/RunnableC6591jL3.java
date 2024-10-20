package defpackage;

import android.os.Handler;
import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jL3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC6591jL3 implements Runnable {
    public final /* synthetic */ View a;
    public final /* synthetic */ C6935kL3 g;
    public final /* synthetic */ int h;
    public final /* synthetic */ C7623mL3 i;

    public RunnableC6591jL3(C7623mL3 c7623mL3, View view, C6935kL3 c6935kL3, int i) {
        this.i = c7623mL3;
        this.a = view;
        this.g = c6935kL3;
        this.h = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7623mL3 c7623mL3 = this.i;
        if (c7623mL3.a.e(c7623mL3.b)) {
            return;
        }
        C6935kL3 c6935kL3 = this.g;
        int i = this.h;
        if (i > 0) {
            int i2 = i - 1;
            View view = this.a;
            Handler handler = view.getHandler();
            if (handler == null) {
                return;
            }
            handler.post(new RunnableC6591jL3(c7623mL3, view, c6935kL3, i2));
            return;
        }
        c6935kL3.getClass();
        AbstractC9118qi1.a();
        if (c6935kL3.a) {
            return;
        }
        AbstractC4851eH1.f("Ime", "onRegisterProxyViewFailure", new Object[0]);
    }
}
