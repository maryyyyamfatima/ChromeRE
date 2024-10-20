package org.chromium.chrome.browser.crash;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Intent;
import android.os.PersistableBundle;
import defpackage.AbstractC0819Gh3;
import defpackage.AbstractC2663Um3;
import defpackage.AbstractC4199cO1;
import defpackage.AbstractC4851eH1;
import defpackage.AbstractC5103f04;
import defpackage.AbstractJobServiceC9397rX1;
import defpackage.C0781Ga0;
import defpackage.C1431La0;
import defpackage.C9626sA2;
import defpackage.CallableC8025nX1;
import defpackage.RunnableC9740sX1;
import defpackage.V60;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.base.task.PostTask;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class MinidumpUploadServiceImpl extends AbstractC0819Gh3 {
    public static final AtomicBoolean b = new AtomicBoolean();
    public static final AtomicBoolean c = new AtomicBoolean();
    public static final String[] d = {"Browser", "Renderer", "GPU", "Other"};

    @Override // defpackage.AbstractC0819Gh3
    public final void b() {
        this.a.setIntentRedelivery(true);
    }

    public static void f() {
        C9626sA2 g = C9626sA2.g();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putBoolean("isClientInMetricsSample", g.f());
        persistableBundle.putBoolean("isUploadEnabledForTests", g.e());
        JobInfo.Builder extras = new JobInfo.Builder(43, new ComponentName(V60.a, (Class<?>) ChromeMinidumpUploadJobService.class)).setExtras(persistableBundle);
        int i = AbstractJobServiceC9397rX1.h;
        AbstractC4851eH1.d("MinidumpJobService", "Scheduling upload of all pending minidumps.", new Object[0]);
        ((JobScheduler) V60.a.getSystemService("jobscheduler")).schedule(extras.setRequiredNetworkType(2).setBackoffCriteria(1800000L, 1).build());
    }

    public static boolean browserCrashMetricsInitialized() {
        return b.get();
    }

    public static boolean didBrowserCrashRecently() {
        return c.get();
    }

    @Override // defpackage.AbstractC0819Gh3
    public final void a(Intent intent) {
        if (intent == null) {
            return;
        }
        if (!"com.google.android.apps.chrome.crash.ACTION_UPLOAD".equals(intent.getAction())) {
            AbstractC4851eH1.f("MinidmpUploadService", "Got unknown action from intent: " + intent.getAction(), new Object[0]);
            return;
        }
        String stringExtra = intent.getStringExtra("minidump_file");
        if (stringExtra == null || stringExtra.isEmpty()) {
            AbstractC4851eH1.f("MinidmpUploadService", "Cannot upload crash data since minidump is absent.", new Object[0]);
            return;
        }
        File file = new File(stringExtra);
        if (!file.isFile()) {
            AbstractC4851eH1.f("MinidmpUploadService", AbstractC4199cO1.a("Cannot upload crash data since specified minidump ", stringExtra, " is not present."), new Object[0]);
            return;
        }
        int h = C0781Ga0.h(stringExtra);
        if (h < 0) {
            h = 0;
        }
        if (h >= 3 || h < 0) {
            AbstractC4851eH1.a("MinidmpUploadService", AbstractC4199cO1.a("Giving up on trying to upload ", stringExtra, " after failing to read a valid attempt number."), new Object[0]);
            return;
        }
        int intValue = new CallableC8025nX1(file, new File(intent.getStringExtra("upload_log")), C9626sA2.g()).call().intValue();
        if (intValue == 0) {
            e(stringExtra);
            return;
        }
        if (intValue == 1) {
            int i = h + 1;
            if (i == 3) {
                d(stringExtra);
            }
            if (C0781Ga0.j(file) == null) {
                AbstractC4851eH1.f("MinidmpUploadService", "Failed to rename minidump ".concat(stringExtra), new Object[0]);
            } else if (i < 3) {
                PostTask.c(AbstractC5103f04.a, new RunnableC9740sX1(V60.a, C9626sA2.g()));
            }
        }
    }

    public static void e(String str) {
        String c2 = c(str.replace("dmp", "up").replace("forced", "up"));
        if ("Browser".equals(c2)) {
            c.set(true);
        }
        C1431La0 c1431La0 = C1431La0.b;
        c1431La0.getClass();
        c1431La0.a.d(C1431La0.b(c2));
    }

    public static String c(String str) {
        BufferedReader bufferedReader;
        IOException e;
        String readLine;
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(str));
        } catch (IOException e2) {
            bufferedReader = null;
            e = e2;
        } catch (Throwable th) {
            th = th;
            AbstractC2663Um3.a(bufferedReader2);
            throw th;
        }
        do {
            try {
                try {
                    readLine = bufferedReader.readLine();
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader2 = bufferedReader;
                    AbstractC2663Um3.a(bufferedReader2);
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
                AbstractC4851eH1.f("MinidmpUploadService", "Error while reading crash file %s: %s", str, e.toString());
                AbstractC2663Um3.a(bufferedReader);
                return "Other";
            }
            if (readLine == null) {
                AbstractC2663Um3.a(bufferedReader);
                return "Other";
            }
        } while (!readLine.equals("Content-Disposition: form-data; name=\"ptype\""));
        bufferedReader.readLine();
        String readLine2 = bufferedReader.readLine();
        if (readLine2 == null) {
            AbstractC2663Um3.a(bufferedReader);
            return "Other";
        }
        if (readLine2.equals("browser")) {
            AbstractC2663Um3.a(bufferedReader);
            return "Browser";
        }
        if (readLine2.equals("renderer")) {
            AbstractC2663Um3.a(bufferedReader);
            return "Renderer";
        }
        if (readLine2.equals("gpu-process")) {
            AbstractC2663Um3.a(bufferedReader);
            return "GPU";
        }
        AbstractC2663Um3.a(bufferedReader);
        return "Other";
    }

    public static void d(String str) {
        String c2 = c(str);
        if ("Browser".equals(c2)) {
            c.set(true);
        }
        C1431La0 c1431La0 = C1431La0.b;
        c1431La0.getClass();
        c1431La0.a.d(C1431La0.a(c2));
    }

    public static void g(File file) {
        C0781Ga0 c0781Ga0 = new C0781Ga0(V60.a.getCacheDir());
        Intent intent = new Intent(V60.a, (Class<?>) MinidumpUploadService.class);
        intent.setAction("com.google.android.apps.chrome.crash.ACTION_UPLOAD");
        intent.putExtra("minidump_file", file.getAbsolutePath());
        intent.putExtra("upload_log", new File(c0781Ga0.d(), "uploads.log").getAbsolutePath());
        V60.a.startService(intent);
    }

    public static void tryUploadCrashDumpWithLocalId(String str) {
        File file;
        if (str == null || str.isEmpty()) {
            AbstractC4851eH1.f("MinidmpUploadService", "Cannot force crash upload since local crash id is absent.", new Object[0]);
            return;
        }
        File file2 = null;
        File[] g = new C0781Ga0(V60.a.getCacheDir()).g(null);
        int length = g.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                file = null;
                break;
            }
            file = g[i];
            if ((file.getName().contains(".dmp") || file.getName().contains(".skipped") || file.getName().contains(".forced")) && file.getName().split("\\.")[0].endsWith(str)) {
                break;
            } else {
                i++;
            }
        }
        if (file != null) {
            if (file.getName().contains(".up")) {
                AbstractC4851eH1.f("CrashFileManager", "Refusing to reset upload attempt state for a file that has already been successfully uploaded: " + file.getName(), new Object[0]);
            } else {
                String path = file.getPath();
                int h = C0781Ga0.h(path);
                if (h < 0) {
                    h = 0;
                }
                if (h > 0) {
                    path = path.replace(".try" + h, ".try0");
                }
                File file3 = new File(path.replace(".skipped", ".forced").replace(".dmp", ".forced"));
                if (file.renameTo(file3)) {
                    file2 = file3;
                }
            }
            if (file2 == null) {
                AbstractC4851eH1.f("MinidmpUploadService", "Could not rename the file " + file.getName() + " for re-upload", new Object[0]);
                return;
            }
            f();
            return;
        }
        AbstractC4851eH1.f("MinidmpUploadService", "Could not find a crash dump with local ID ".concat(str), new Object[0]);
    }
}
