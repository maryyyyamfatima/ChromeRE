package defpackage;

import android.app.Activity;
import android.app.usage.UsageStatsManager;
import java.lang.reflect.InvocationTargetException;
import org.chromium.base.Callback;
import org.chromium.base.TraceEvent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Kh2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1338Kh2 implements Callback {
    public final /* synthetic */ C1597Mh2 a;
    public final /* synthetic */ String g;

    public /* synthetic */ C1338Kh2(C1597Mh2 c1597Mh2, String str) {
        this.a = c1597Mh2;
        this.g = str;
    }

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        String str = this.g;
        String str2 = (String) obj;
        Activity activity = this.a.a;
        if (str2 == null) {
            return;
        }
        try {
            TraceEvent i = TraceEvent.i("PageViewObserver.reportToPlatformIfDomainIsTracked", null);
            try {
                UsageStatsManager.class.getDeclaredMethod(str, Activity.class, String.class).invoke((UsageStatsManager) activity.getSystemService("usagestats"), activity, str2);
                if (i != null) {
                    i.close();
                }
            } catch (Throwable th) {
                if (i != null) {
                    try {
                        i.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th;
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            AbstractC4851eH1.a("PageViewObserver", "Failed to report to platform API", e);
        }
    }
}
