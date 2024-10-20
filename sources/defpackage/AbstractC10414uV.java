package defpackage;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessage;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: uV, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10414uV extends BroadcastReceiver {
    public final ExecutorService a;

    public AbstractC10414uV() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new K02("firebase-iid-executor"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.a = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        if (intent == null) {
            return;
        }
        final boolean isOrderedBroadcast = isOrderedBroadcast();
        final BroadcastReceiver.PendingResult goAsync = goAsync();
        this.a.execute(new Runnable() { // from class: tV
            @Override // java.lang.Runnable
            public final void run() {
                int a;
                Intent intent2 = intent;
                BroadcastReceiver.PendingResult pendingResult = goAsync;
                AbstractC10414uV.this.getClass();
                try {
                    Parcelable parcelableExtra = intent2.getParcelableExtra("wrapped_intent");
                    Intent intent3 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
                    Context context2 = context;
                    if (intent3 != null) {
                        a = AbstractC10414uV.b(intent3);
                    } else {
                        a = AbstractC10414uV.a(context2, intent2);
                    }
                    if (isOrderedBroadcast) {
                        pendingResult.setResultCode(a);
                    }
                } finally {
                    pendingResult.finish();
                }
            }
        });
    }

    public static int b(Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        if ("com.google.firebase.messaging.NOTIFICATION_DISMISS".equals(intent.getAction())) {
            Intent putExtras = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(extras);
            if (!UV1.a(putExtras)) {
                return -1;
            }
            putExtras.getExtras();
            try {
                AbstractC6261iO0.a();
                throw null;
            } catch (IllegalStateException unused2) {
                Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
                return -1;
            }
        }
        Log.e("CloudMessagingReceiver", "Unknown notification action");
        return 500;
    }

    public static int a(Context context, Intent intent) {
        C8707pW1 c8707pW1;
        int i;
        AF3 af3;
        int i2 = 500;
        if (intent.getExtras() == null) {
            return 500;
        }
        String stringExtra = intent.getStringExtra("google.message_id");
        if (TextUtils.isEmpty(stringExtra)) {
            af3 = new AF3();
            af3.n(null);
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("google.message_id", stringExtra);
            synchronized (C8707pW1.class) {
                if (C8707pW1.e == null) {
                    C8707pW1.e = new C8707pW1(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new K02("MessengerIpcClient"))));
                }
                c8707pW1 = C8707pW1.e;
            }
            synchronized (c8707pW1) {
                i = c8707pW1.d;
                c8707pW1.d = i + 1;
            }
            C6988kW1 c6988kW1 = new C6988kW1(i, bundle);
            synchronized (c8707pW1) {
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    String.valueOf(c6988kW1);
                }
                if (!c8707pW1.c.a(c6988kW1)) {
                    ServiceConnectionC5958hW1 serviceConnectionC5958hW1 = new ServiceConnectionC5958hW1(c8707pW1);
                    c8707pW1.c = serviceConnectionC5958hW1;
                    serviceConnectionC5958hW1.a(c6988kW1);
                }
                af3 = c6988kW1.b.a;
            }
        }
        try {
            i2 = ((Integer) UF3.a(new C6917kI0(context).b(new CloudMessage(intent).a))).intValue();
        } catch (InterruptedException | ExecutionException e) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e);
        }
        try {
            UF3.b(af3, TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(String.valueOf(e2)));
        }
        return i2;
    }
}
