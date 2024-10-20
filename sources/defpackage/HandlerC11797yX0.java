package defpackage;

import android.app.AppOpsManager;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yX0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerC11797yX0 extends HandlerC10413uU3 {
    public final /* synthetic */ AX0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC11797yX0(AX0 ax0, Looper looper) {
        super(looper);
        this.a = ax0;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        boolean z;
        Messenger messenger;
        AppOpsManager appOpsManager;
        int i = message.sendingUid;
        AX0 ax0 = this.a;
        C3147Yf2 a = C4021br4.a(ax0);
        a.getClass();
        try {
            appOpsManager = (AppOpsManager) a.a.getSystemService("appops");
        } catch (SecurityException unused) {
            z = false;
        }
        if (appOpsManager == null) {
            throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
        }
        appOpsManager.checkPackage(i, "com.google.android.gms");
        z = true;
        if (!z) {
            Log.e("GcmTaskService", "unable to verify presence of Google Play Services");
            return;
        }
        int i2 = message.what;
        if (i2 != 1) {
            if (i2 == 2) {
                if (Log.isLoggable("GcmTaskService", 3)) {
                    String.valueOf(message);
                    return;
                }
                return;
            } else if (i2 == 4) {
                ax0.b();
                return;
            } else {
                Log.e("GcmTaskService", "Unrecognized message received: ".concat(String.valueOf(message)));
                return;
            }
        }
        Bundle data = message.getData();
        if (data.isEmpty() || (messenger = message.replyTo) == null) {
            return;
        }
        String string = data.getString("tag");
        ArrayList parcelableArrayList = data.getParcelableArrayList("triggered_uris");
        long j = data.getLong("max_exec_duration", 180L);
        if (ax0.a(string)) {
            return;
        }
        Bundle bundle = data.getBundle("extras");
        AX0 ax02 = this.a;
        RunnableC12140zX0 runnableC12140zX0 = new RunnableC12140zX0(ax02, string, messenger, bundle, j, parcelableArrayList);
        ax02.getClass();
        try {
            ax02.h.execute(runnableC12140zX0);
        } catch (RejectedExecutionException e) {
            Log.e("GcmTaskService", "Executor is shutdown. onDestroy was called but main looper had an unprocessed start task message. The task will be retried with backoff delay.", e);
            runnableC12140zX0.b(1);
        }
    }
}
