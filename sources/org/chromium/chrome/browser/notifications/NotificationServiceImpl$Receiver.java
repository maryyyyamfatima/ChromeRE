package org.chromium.chrome.browser.notifications;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;
import android.os.SystemClock;
import android.util.Log;
import defpackage.C7089kn4;
import defpackage.J72;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class NotificationServiceImpl$Receiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("org.chromium.chrome.browser.notifications.CLICK_NOTIFICATION".equals(intent.getAction())) {
            boolean z = intent.getIntExtra("notification_info_action_index", -1) != -1;
            C7089kn4 a = C7089kn4.a();
            a.a.getClass();
            a.c = SystemClock.elapsedRealtime();
            a.d = z;
            a.e = false;
            a.f = false;
            a.g = false;
            a.b("Click");
        }
        int i = J72.b;
        Log.i("J72", "Received a notification intent in the NotificationService's receiver.");
        if (Build.VERSION.SDK_INT >= 24) {
            JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("notification_id", intent.getStringExtra("notification_id"));
            persistableBundle.putInt("notification_type", intent.getIntExtra("notification_type", 0));
            persistableBundle.putString("notification_info_origin", intent.getStringExtra("notification_info_origin"));
            persistableBundle.putString("notification_info_scope", intent.getStringExtra("notification_info_scope"));
            persistableBundle.putString("notification_info_profile_id", intent.getStringExtra("notification_info_profile_id"));
            persistableBundle.putBoolean("notification_info_profile_incognito", intent.getBooleanExtra("notification_info_profile_incognito", false));
            persistableBundle.putInt("notification_info_action_index", intent.getIntExtra("notification_info_action_index", -1));
            persistableBundle.putString("notification_info_webapk_package", intent.getStringExtra("notification_info_webapk_package"));
            persistableBundle.putString("notification_action", intent.getAction());
            persistableBundle.putString("notification_reply", NotificationPlatformBridge.b(intent));
            persistableBundle.putLong("notification_job_scheduled_time_ms", SystemClock.elapsedRealtime());
            jobScheduler.schedule(new JobInfo.Builder(21, new ComponentName(context, (Class<?>) NotificationJobService.class)).setExtras(persistableBundle).setOverrideDeadline(0L).build());
            return;
        }
        intent.setClass(context, NotificationService.class);
        context.startService(intent);
    }
}
