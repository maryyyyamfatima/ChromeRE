package org.chromium.webapk.lib.runtime_library;

import android.app.ActivityManager;
import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import defpackage.C4410d;
import defpackage.C4753e;
import java.lang.reflect.InvocationTargetException;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.page_info.AboutThisSiteView;
import org.chromium.webapk.lib.runtime_library.IWebApkApi;

/* compiled from: chromium-webapk8.dex */
/* loaded from: assets/webapk8.dex */
public class WebApkServiceImpl extends IWebApkApi.Stub {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String KEY_HOST_BROWSER_UID = "host_browser_uid";
    public static final String KEY_SMALL_ICON_ID = "small_icon_id";
    private static final String TAG = "WebApkServiceImpl";
    private final Context mContext;
    private final int mHostUid;
    private final int mSmallIconId;

    public WebApkServiceImpl(Context context, Bundle bundle) {
        this.mContext = context;
        this.mSmallIconId = bundle.getInt(KEY_SMALL_ICON_ID);
        this.mHostUid = bundle.getInt(KEY_HOST_BROWSER_UID);
    }

    @Override // org.chromium.webapk.lib.runtime_library.IWebApkApi.Stub, android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int callingUid = Binder.getCallingUid();
        if (this.mHostUid != callingUid) {
            throw new RemoteException("Unauthorized caller " + callingUid + " does not match expected host=" + this.mHostUid);
        }
        return super.onTransact(i, parcel, parcel2, i2);
    }

    @Override // org.chromium.webapk.lib.runtime_library.IWebApkApi
    public int getSmallIconId() {
        return this.mSmallIconId;
    }

    @Override // org.chromium.webapk.lib.runtime_library.IWebApkApi
    public void notifyNotification(String str, int i, Notification notification) {
        Log.w(TAG, "Should NOT reach WebApkServiceImpl#notifyNotification(String, int, Notification).");
    }

    @Override // org.chromium.webapk.lib.runtime_library.IWebApkApi
    public void cancelNotification(String str, int i) {
        getNotificationManager().cancel(str, i);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [e] */
    @Override // org.chromium.webapk.lib.runtime_library.IWebApkApi
    public boolean notificationPermissionEnabled() {
        Log.w(TAG, "Should NOT reach WebApkServiceImpl#notificationPermissionEnabled() because it is deprecated.");
        Context context = this.mContext;
        ?? c4753e = new Callback(context) { // from class: e
            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                AboutThisSiteView.this.onClick((View) obj);
            }

            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }
        };
        if (Build.VERSION.SDK_INT >= 24) {
            return C4410d.a(((C4753e) c4753e).a);
        }
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String packageName = context.getApplicationContext().getPackageName();
        int i = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            if (((Integer) cls.getMethod("checkOpNoThrow", cls2, cls2, String.class).invoke(appOpsManager, Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i), packageName)).intValue() != 0) {
                return $assertionsDisabled;
            }
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
        }
        return true;
    }

    @Override // org.chromium.webapk.lib.runtime_library.IWebApkApi
    public boolean finishAndRemoveTaskSdk23() {
        ActivityManager activityManager = (ActivityManager) this.mContext.getSystemService("activity");
        String packageName = this.mContext.getPackageName();
        for (ActivityManager.AppTask appTask : activityManager.getAppTasks()) {
            if (TextUtils.equals(getTaskBaseActivityPackageName(appTask), packageName)) {
                appTask.finishAndRemoveTask();
                return true;
            }
        }
        return $assertionsDisabled;
    }

    @Override // org.chromium.webapk.lib.runtime_library.IWebApkApi
    public int checkNotificationPermission() {
        Log.w(TAG, "Should NOT reach WebApkServiceImpl#checkNotificationPermission().");
        return -1;
    }

    @Override // org.chromium.webapk.lib.runtime_library.IWebApkApi
    public PendingIntent requestNotificationPermission(String str, String str2) {
        Log.w(TAG, "Should NOT reach WebApkServiceImpl#requestNotificationPermission(String, String).");
        return null;
    }

    private static String getTaskBaseActivityPackageName(ActivityManager.AppTask appTask) {
        ComponentName componentName;
        try {
            ActivityManager.RecentTaskInfo taskInfo = appTask.getTaskInfo();
            if (taskInfo == null || (componentName = taskInfo.baseActivity) == null) {
                return null;
            }
            return componentName.getPackageName();
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // org.chromium.webapk.lib.runtime_library.IWebApkApi
    public void notifyNotificationWithChannel(String str, int i, Notification notification, String str2) {
        NotificationManager notificationManager = getNotificationManager();
        if (Build.VERSION.SDK_INT >= 26 && notification.getChannelId() != null) {
            notificationManager.createNotificationChannel(new NotificationChannel(notification.getChannelId(), str2, 3));
        }
        notificationManager.notify(str, i, notification);
    }

    private NotificationManager getNotificationManager() {
        return (NotificationManager) this.mContext.getSystemService("notification");
    }
}
