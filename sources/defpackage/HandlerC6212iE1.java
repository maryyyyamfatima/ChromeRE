package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iE1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerC6212iE1 extends Handler implements InterfaceC6554jE1 {
    @Override // defpackage.InterfaceC6554jE1
    public final void a() {
    }

    public HandlerC6212iE1(Looper looper) {
        super(looper);
    }

    @Override // defpackage.InterfaceC6554jE1
    public final void b(Runnable runnable, String str) {
        post(runnable);
    }

    @Override // defpackage.InterfaceC6554jE1
    public final void c(Runnable runnable) {
        removeCallbacks(runnable);
    }
}
