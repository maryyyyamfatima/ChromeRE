package defpackage;

import android.os.Messenger;
import android.util.Log;
import com.google.android.gms.wallet.callback.CallbackInput;
import com.google.android.gms.wallet.callback.CallbackOutput;
import java.util.Locale;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ku, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC7126ku implements Runnable {
    public final CallbackInput a;
    public final String g;
    public final C6782ju h;
    public final /* synthetic */ AbstractServiceC1924Ov i;

    public RunnableC7126ku(AbstractServiceC1924Ov abstractServiceC1924Ov, CallbackInput callbackInput, Messenger messenger, String str, int i) {
        this.i = abstractServiceC1924Ov;
        this.a = callbackInput;
        this.g = str;
        this.h = new C6782ju(messenger, i);
    }

    @Override // java.lang.Runnable
    public final void run() {
        CallbackInput callbackInput = this.a;
        C6782ju c6782ju = this.h;
        if (Log.isLoggable("BaseCallbackTaskService", 4)) {
            Log.i("BaseCallbackTaskService", String.format(Locale.US, "Running Callback Task w/ tag %s", this.g));
        }
        try {
            this.i.getClass();
            AbstractServiceC1924Ov.c(callbackInput, c6782ju);
        } catch (Throwable th) {
            C5527gF r1 = CallbackOutput.r1();
            int i = callbackInput.a;
            CallbackOutput callbackOutput = r1.a;
            callbackOutput.a = i;
            callbackOutput.g = 5;
            callbackOutput.i = th.getMessage();
            c6782ju.a(callbackOutput);
            throw th;
        }
    }
}
