package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import android.os.UserHandle;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Px, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2064Px {
    public static Method a;

    public static boolean c() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static boolean b(Context context, Intent intent, ServiceConnection serviceConnection, int i, Handler handler, Executor executor, String str) {
        boolean bindIsolatedService;
        if (!c() || str == null) {
            if (Build.VERSION.SDK_INT > 24) {
                try {
                    return a(context, intent, serviceConnection, i, handler);
                } catch (ReflectiveOperationException e) {
                    try {
                        return context.bindService(intent, serviceConnection, i);
                    } catch (RuntimeException e2) {
                        throw new RuntimeException(e2.getMessage(), e);
                    }
                }
            }
            return context.bindService(intent, serviceConnection, i);
        }
        bindIsolatedService = context.bindIsolatedService(intent, i, str, executor, serviceConnection);
        return bindIsolatedService;
    }

    public static boolean a(Context context, Intent intent, ServiceConnection serviceConnection, int i, Handler handler) {
        if (a == null) {
            a = Context.class.getDeclaredMethod("bindServiceAsUser", Intent.class, ServiceConnection.class, Integer.TYPE, Handler.class, UserHandle.class);
        }
        while (context instanceof ContextWrapper) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return ((Boolean) a.invoke(context, intent, serviceConnection, Integer.valueOf(i), handler, Process.myUserHandle())).booleanValue();
    }
}
