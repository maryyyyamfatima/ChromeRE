package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import org.chromium.base.ThreadUtils;
import org.chromium.components.background_task_scheduler.TaskInfo;
import org.chromium.components.background_task_scheduler.internal.BackgroundTaskBroadcastReceiver;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jt */
/* loaded from: classes2.dex */
public final class C6776jt implements InterfaceC7120kt {
    @Override // defpackage.InterfaceC7120kt
    public final boolean b(Context context, TaskInfo taskInfo) {
        Object obj = ThreadUtils.a;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i = taskInfo.a;
        taskInfo.g.a(new C6090ht(alarmManager, PendingIntent.getBroadcast(context, i, new Intent(context, (Class<?>) BackgroundTaskBroadcastReceiver.class).putExtra("_background_task_id", i), AbstractC2281Ro1.d(false) | 268435456)));
        return true;
    }

    @Override // defpackage.InterfaceC7120kt
    public final void a(Context context, int i) {
        Object obj = ThreadUtils.a;
        ((AlarmManager) context.getSystemService("alarm")).cancel(PendingIntent.getBroadcast(context, i, new Intent(context, (Class<?>) BackgroundTaskBroadcastReceiver.class).putExtra("_background_task_id", i), AbstractC2281Ro1.d(false) | 268435456));
    }
}
