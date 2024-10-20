package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class V60 {
    public static Context a;

    public static Activity a(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public static void c(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            context.registerReceiver(broadcastReceiver, intentFilter, str, null, 2);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter, str, null);
        }
    }

    public static Intent d(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        Intent registerReceiver;
        if (Build.VERSION.SDK_INT >= 26) {
            registerReceiver = context.registerReceiver(broadcastReceiver, intentFilter, null, null, 4);
            return registerReceiver;
        }
        return context.registerReceiver(broadcastReceiver, intentFilter, null, null);
    }

    public static String b() {
        String processName;
        if (Build.VERSION.SDK_INT >= 28) {
            processName = Application.getProcessName();
            return processName;
        }
        try {
            return (String) Class.forName("android.app.ActivityThread").getMethod("currentProcessName", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
