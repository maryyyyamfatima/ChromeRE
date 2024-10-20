package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yt1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11927yt1 implements Jq4 {
    public final Context a;
    public final InterfaceC11011wD0 b;
    public final C0460Do c;

    public C11927yt1(Context context, InterfaceC11011wD0 interfaceC11011wD0, C0460Do c0460Do) {
        this.a = context;
        this.b = interfaceC11011wD0;
        this.c = c0460Do;
    }

    public final void a(C2149Qo c2149Qo, int i, boolean z) {
        Long l;
        boolean z2;
        Context context = this.a;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(c2149Qo.a.getBytes(Charset.forName("UTF-8")));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        EnumC7223lA2 enumC7223lA2 = c2149Qo.c;
        adler32.update(allocate.putInt(AbstractC7911nA2.a(enumC7223lA2)).array());
        byte[] bArr = c2149Qo.b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i2 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i2 >= i) {
                        z2 = true;
                    }
                }
            }
            z2 = false;
            if (z2) {
                AbstractC6574jI1.a(c2149Qo, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
                return;
            }
        }
        SQLiteDatabase b = ((C5600gT2) this.b).b();
        String str = c2149Qo.a;
        Cursor rawQuery = b.rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, String.valueOf(AbstractC7911nA2.a(enumC7223lA2))});
        try {
            if (rawQuery.moveToNext()) {
                l = Long.valueOf(rawQuery.getLong(0));
            } else {
                l = 0L;
            }
            rawQuery.close();
            long longValue = l.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            C0460Do c0460Do = this.c;
            builder.setMinimumLatency(c0460Do.a(enumC7223lA2, longValue, i));
            Set set = ((C0590Eo) c0460Do.b.get(enumC7223lA2)).c;
            if (set.contains(EnumC12137zW2.NETWORK_UNMETERED)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(EnumC12137zW2.DEVICE_CHARGING)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(EnumC12137zW2.DEVICE_IDLE)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt("priority", AbstractC7911nA2.a(enumC7223lA2));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {c2149Qo, Integer.valueOf(value), Long.valueOf(c0460Do.a(enumC7223lA2, longValue, i)), Long.valueOf(longValue), Integer.valueOf(i)};
            AbstractC6574jI1.b("JobInfoScheduler");
            String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr);
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }
}
