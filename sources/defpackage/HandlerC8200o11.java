package defpackage;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: o11 */
/* loaded from: classes.dex */
public final class HandlerC8200o11 extends HandlerC10413uU3 {
    public final Context a;
    public final /* synthetic */ C8543p11 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC8200o11(C8543p11 c8543p11, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.b = c8543p11;
        this.a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        boolean z = true;
        if (i == 1) {
            C8543p11 c8543p11 = this.b;
            Context context = this.a;
            int g = c8543p11.g(context);
            boolean z2 = X31.a;
            if (g != 1 && g != 2 && g != 3 && g != 9) {
                z = false;
            }
            if (z) {
                c8543p11.k(context, g);
                return;
            }
            return;
        }
        Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i);
    }
}
