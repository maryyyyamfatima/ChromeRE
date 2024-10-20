package org.chromium.content.browser;

import J.N;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Environment;
import android.util.Pair;
import com.android.chrome.R;
import defpackage.AbstractC4851eH1;
import defpackage.C10070tU3;
import defpackage.C7432ln3;
import defpackage.V60;
import defpackage.ZN3;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class TracingControllerAndroidImpl {
    public final Context a;
    public final TracingIntentFilter c;
    public boolean d;
    public String f;
    public boolean g;
    public boolean h;
    public long i;
    public boolean e = true;
    public final C10070tU3 b = new C10070tU3(this);

    public TracingControllerAndroidImpl(Context context) {
        this.a = context;
        this.c = new TracingIntentFilter(context);
    }

    public void onTracingStopped(Object obj) {
        if (!this.d) {
            AbstractC4851eH1.a("TracingController", "Received onTracingStopped, but we aren't tracing", new Object[0]);
            return;
        }
        AbstractC4851eH1.d("TracingController", String.format("Profiler finished. Results are in %s.", this.f), new Object[0]);
        Object[] objArr = {this.f};
        Context context = this.a;
        String string = context.getString(R.string.f83790_resource_name_obfuscated_res_0x7f14090c, objArr);
        if (this.e) {
            ZN3.c(context, string, 0).d();
        }
        this.d = false;
        this.f = null;
        this.g = false;
        if (obj != null) {
            ((Callback) obj).onResult(null);
        }
    }

    /* JADX WARN: Finally extract failed */
    public static String generateTracingFilePath(String str) {
        C7432ln3 e = C7432ln3.e();
        try {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                if (str.isEmpty()) {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HHmmss", Locale.US);
                    simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                    str = "chrome-profile-results-" + simpleDateFormat.format(new Date());
                }
                String path = new File(V60.a.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS), str).getPath();
                e.close();
                return path;
            }
            e.close();
            return null;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public final boolean a(String str, boolean z, String str2, String str3, boolean z2, boolean z3) {
        String str4;
        this.e = z;
        Context context = this.a;
        if (str == null) {
            String generateTracingFilePath = generateTracingFilePath("");
            if (generateTracingFilePath == null) {
                String string = context.getString(R.string.f83770_resource_name_obfuscated_res_0x7f14090a);
                AbstractC4851eH1.a("TracingController", string, new Object[0]);
                if (this.e) {
                    ZN3.c(context, string, 0).d();
                }
                return false;
            }
            str4 = generateTracingFilePath;
        } else {
            str4 = str;
        }
        if (this.d) {
            AbstractC4851eH1.a("TracingController", "Received startTracing, but we're already tracing", new Object[0]);
            return false;
        }
        if (this.i == 0) {
            this.i = N.MWlLnA$6(this);
        }
        if (!N.MZYMIGWv(this.i, this, str2, str3, z3)) {
            String string2 = context.getString(R.string.f83760_resource_name_obfuscated_res_0x7f140909);
            AbstractC4851eH1.a("TracingController", string2, new Object[0]);
            if (this.e) {
                ZN3.c(context, string2, 0).d();
            }
            return false;
        }
        AbstractC4851eH1.d("TracingController", String.format("Profiler started: %s", str2), new Object[0]);
        String str5 = context.getString(R.string.f83780_resource_name_obfuscated_res_0x7f14090b) + ": " + str2;
        if (this.e) {
            ZN3.c(context, str5, 0).d();
        }
        this.f = str4;
        this.g = z2;
        this.h = z3;
        this.d = true;
        return true;
    }

    public void onKnownCategoriesReceived(String[] strArr, Object obj) {
        if (obj != null) {
            ((Callback) obj).onResult(strArr);
        }
    }

    public void onTraceBufferUsageReceived(float f, long j, Object obj) {
        ((Callback) obj).onResult(new Pair(Float.valueOf(f), Long.valueOf(j)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes2.dex */
    public class TracingIntentFilter extends IntentFilter {
        public TracingIntentFilter(Context context) {
            addAction(context.getPackageName() + ".GPU_PROFILER_START");
            addAction(context.getPackageName() + ".GPU_PROFILER_STOP");
            addAction(context.getPackageName() + ".GPU_PROFILER_LIST_CATEGORIES");
        }
    }
}
