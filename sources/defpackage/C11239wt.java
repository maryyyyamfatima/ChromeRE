package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import java.util.HashSet;
import java.util.Iterator;
import org.chromium.base.ThreadUtils;
import org.chromium.components.background_task_scheduler.TaskInfo;
import org.chromium.components.background_task_scheduler.internal.BackgroundTaskJobService;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wt */
/* loaded from: classes2.dex */
public final class C11239wt implements InterfaceC7120kt {
    static {
        new C3339Zs();
    }

    public static KF3 c(JobParameters jobParameters) {
        JF3 jf3 = new JF3(jobParameters.getJobId());
        PersistableBundle persistableBundle = jobParameters.getExtras().getPersistableBundle("_background_task_extras");
        Bundle bundle = new Bundle();
        bundle.putAll(persistableBundle);
        jf3.b = bundle;
        return new KF3(jf3);
    }

    @Override // defpackage.InterfaceC7120kt
    public final boolean b(Context context, TaskInfo taskInfo) {
        boolean z;
        Object obj = ThreadUtils.a;
        PersistableBundle persistableBundle = new PersistableBundle();
        Bundle bundle = taskInfo.b;
        PersistableBundle persistableBundle2 = new PersistableBundle();
        HashSet hashSet = new HashSet();
        for (String str : bundle.keySet()) {
            Object obj2 = bundle.get(str);
            if (obj2 == null) {
                persistableBundle2.putString(str, null);
            } else if (obj2 instanceof Boolean) {
                persistableBundle2.putBoolean(str, ((Boolean) obj2).booleanValue());
            } else if (obj2 instanceof boolean[]) {
                persistableBundle2.putBooleanArray(str, (boolean[]) obj2);
            } else if (obj2 instanceof Double) {
                persistableBundle2.putDouble(str, ((Double) obj2).doubleValue());
            } else if (obj2 instanceof double[]) {
                persistableBundle2.putDoubleArray(str, (double[]) obj2);
            } else if (obj2 instanceof Integer) {
                persistableBundle2.putInt(str, ((Integer) obj2).intValue());
            } else if (obj2 instanceof int[]) {
                persistableBundle2.putIntArray(str, (int[]) obj2);
            } else if (obj2 instanceof Long) {
                persistableBundle2.putLong(str, ((Long) obj2).longValue());
            } else if (obj2 instanceof long[]) {
                persistableBundle2.putLongArray(str, (long[]) obj2);
            } else if (obj2 instanceof String) {
                persistableBundle2.putString(str, (String) obj2);
            } else if (obj2 instanceof String[]) {
                persistableBundle2.putStringArray(str, (String[]) obj2);
            } else {
                hashSet.add(str);
            }
        }
        if (hashSet.size() > 0) {
            StringBuilder sb = new StringBuilder("Failed converting extras to PersistableBundle: ");
            StringBuilder sb2 = new StringBuilder("{");
            Iterator it = hashSet.iterator();
            boolean z2 = true;
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (!z2) {
                    sb2.append(", ");
                }
                sb2.append(str2);
                z2 = false;
            }
            sb2.append("}");
            sb.append(sb2.toString());
            AbstractC4851eH1.f("BkgrdTaskSchedulerJS", sb.toString(), new Object[0]);
        }
        persistableBundle.putPersistableBundle("_background_task_extras", persistableBundle2);
        JobInfo.Builder requiredNetworkType = new JobInfo.Builder(taskInfo.a, new ComponentName(context, (Class<?>) BackgroundTaskJobService.class)).setPersisted(taskInfo.e).setRequiresCharging(taskInfo.d).setRequiredNetworkType(taskInfo.c);
        taskInfo.g.a(new C10896vt(requiredNetworkType, persistableBundle));
        JobInfo build = requiredNetworkType.build();
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (!taskInfo.f) {
            Iterator<JobInfo> it2 = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z = false;
                    break;
                }
                if (it2.next().getId() == taskInfo.a) {
                    z = true;
                    break;
                }
            }
            if (z) {
                return true;
            }
        }
        try {
            return jobScheduler.schedule(build) == 1;
        } catch (Exception e) {
            AbstractC4851eH1.a("BkgrdTaskSchedulerJS", "Unable to schedule with Android.", e);
            return false;
        }
    }

    @Override // defpackage.InterfaceC7120kt
    public final void a(Context context, int i) {
        Object obj = ThreadUtils.a;
        try {
            ((JobScheduler) context.getSystemService("jobscheduler")).cancel(i);
        } catch (NullPointerException unused) {
            AbstractC4851eH1.a("BkgrdTaskSchedulerJS", AbstractC9076qb1.a("Failed to cancel task: ", i), new Object[0]);
        }
    }
}
