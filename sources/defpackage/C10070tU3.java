package defpackage;

import J.N;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import org.chromium.content.browser.TracingControllerAndroidImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tU3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10070tU3 extends BroadcastReceiver {
    public final /* synthetic */ TracingControllerAndroidImpl a;

    public C10070tU3(TracingControllerAndroidImpl tracingControllerAndroidImpl) {
        this.a = tracingControllerAndroidImpl;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String replaceFirst;
        boolean endsWith = intent.getAction().endsWith("GPU_PROFILER_START");
        TracingControllerAndroidImpl tracingControllerAndroidImpl = this.a;
        if (endsWith) {
            String stringExtra = intent.getStringExtra("categories");
            if (!TextUtils.isEmpty(stringExtra)) {
                replaceFirst = stringExtra.replaceFirst("_DEFAULT_CHROME_CATEGORIES", N.My9pNx9O(tracingControllerAndroidImpl));
            } else {
                replaceFirst = N.My9pNx9O(tracingControllerAndroidImpl);
            }
            String str = replaceFirst;
            String str2 = intent.getStringExtra("continuous") == null ? "record-until-full" : "record-continuously";
            String stringExtra2 = intent.getStringExtra("file");
            if (stringExtra2 == null) {
                this.a.a(null, true, str, str2, false, false);
                return;
            } else {
                this.a.a(stringExtra2, true, str, str2, false, false);
                return;
            }
        }
        if (intent.getAction().endsWith("GPU_PROFILER_STOP")) {
            if (tracingControllerAndroidImpl.d) {
                N.M$HKWu8q(tracingControllerAndroidImpl.i, tracingControllerAndroidImpl, tracingControllerAndroidImpl.f, tracingControllerAndroidImpl.g, tracingControllerAndroidImpl.h, null);
            }
        } else {
            if (!intent.getAction().endsWith("GPU_PROFILER_LIST_CATEGORIES")) {
                AbstractC4851eH1.a("TracingController", "Unexpected intent: %s", intent);
                return;
            }
            if (tracingControllerAndroidImpl.i == 0) {
                tracingControllerAndroidImpl.i = N.MWlLnA$6(tracingControllerAndroidImpl);
            }
            if (N.MdRNuqnW(tracingControllerAndroidImpl.i, tracingControllerAndroidImpl, null)) {
                return;
            }
            AbstractC4851eH1.a("TracingController", "Unable to fetch tracing category list.", new Object[0]);
        }
    }
}
