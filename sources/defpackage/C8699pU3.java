package defpackage;

import J.N;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.chromium.chrome.browser.tracing.settings.TracingSettings;
import org.chromium.content.browser.TracingControllerAndroidImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pU3 */
/* loaded from: classes2.dex */
public final class C8699pU3 extends AbstractC0185Bl {
    public final /* synthetic */ C9727sU3 h;

    public C8699pU3(C9727sU3 c9727sU3) {
        this.h = c9727sU3;
    }

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        File file = (File) obj;
        C9727sU3 c9727sU3 = this.h;
        if (file == null) {
            c9727sU3.getClass();
            ZN3.c(V60.a, "Error occurred while recording Chrome trace, see log for details.", 0).d();
            c9727sU3.b(1);
            return;
        }
        c9727sU3.e = file;
        if (!c9727sU3.a.a(c9727sU3.e.getPath(), false, TextUtils.join(",", TracingSettings.S0()), TracingSettings.T0(), true, true)) {
            AbstractC4851eH1.a("TracingController", "Native error while trying to start tracing", new Object[0]);
            ZN3.c(V60.a, "Error occurred while recording Chrome trace, see log for details.", 0).d();
            c9727sU3.b(1);
            return;
        }
        c9727sU3.b(3);
        if (c9727sU3.c != 3) {
            return;
        }
        TracingControllerAndroidImpl tracingControllerAndroidImpl = c9727sU3.a;
        C8012nU3 c8012nU3 = new C8012nU3(c9727sU3);
        if (tracingControllerAndroidImpl.i == 0) {
            tracingControllerAndroidImpl.i = N.MWlLnA$6(tracingControllerAndroidImpl);
        }
        N.MkLMghix(tracingControllerAndroidImpl.i, tracingControllerAndroidImpl, c8012nU3);
    }

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        File file = new File(V60.a.getCacheDir() + "/traces");
        file.mkdir();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HHmmss", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        try {
            File file2 = new File(file, "chrome-trace-" + simpleDateFormat.format(new Date()) + ".pftrace.gz");
            file2.createNewFile();
            return file2;
        } catch (IOException e) {
            AbstractC4851eH1.a("TracingController", "Couldn't create chrome-trace temp file: %s", e.getMessage());
            return null;
        }
    }
}
