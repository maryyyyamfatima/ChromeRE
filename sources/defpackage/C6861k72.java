package defpackage;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: k72, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6861k72 {
    public static String d;
    public static ServiceConnectionC6175i72 g;
    public final Context a;
    public final NotificationManager b;
    public static final Object c = new Object();
    public static HashSet e = new HashSet();
    public static final Object f = new Object();

    public C6861k72(Context context) {
        this.a = context;
        this.b = (NotificationManager) context.getSystemService("notification");
    }

    public final void b(int i, String str) {
        this.b.cancel(str, i);
    }

    public final boolean a() {
        boolean areNotificationsEnabled;
        if (Build.VERSION.SDK_INT >= 24) {
            areNotificationsEnabled = this.b.areNotificationsEnabled();
            return areNotificationsEnabled;
        }
        Context context = this.a;
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String packageName = context.getApplicationContext().getPackageName();
        int i = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            return ((Integer) cls.getMethod("checkOpNoThrow", cls2, cls2, String.class).invoke(appOpsManager, Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i), packageName)).intValue() == 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }

    public final void c(String str, int i, Notification notification) {
        Bundle bundle = notification.extras;
        boolean z = bundle != null && bundle.getBoolean("android.support.useSideChannel");
        NotificationManager notificationManager = this.b;
        if (z) {
            C5143f72 c5143f72 = new C5143f72(i, notification, this.a.getPackageName(), str);
            synchronized (f) {
                if (g == null) {
                    g = new ServiceConnectionC6175i72(this.a.getApplicationContext());
                }
                g.g.obtainMessage(0, c5143f72).sendToTarget();
            }
            notificationManager.cancel(str, i);
            return;
        }
        notificationManager.notify(str, i, notification);
    }
}
