package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.preference.PreferenceScreen;
import androidx.preference.e;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wy2 */
/* loaded from: classes.dex */
public final class HandlerC11270wy2 extends Handler {
    public final /* synthetic */ AbstractC0123Ay2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC11270wy2(AbstractC0123Ay2 abstractC0123Ay2, Looper looper) {
        super(looper);
        this.a = abstractC0123Ay2;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        AbstractC0123Ay2 abstractC0123Ay2;
        PreferenceScreen N0;
        if (message.what == 1 && (N0 = (abstractC0123Ay2 = this.a).N0()) != null) {
            abstractC0123Ay2.d0.n0(new e(N0));
            N0.s();
        }
    }
}
