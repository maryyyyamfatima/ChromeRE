package defpackage;

import J.N;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import org.chromium.base.Callback;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.settings.SettingsActivity;
import org.chromium.chrome.browser.tracing.TracingNotificationService;
import org.chromium.chrome.browser.tracing.settings.TracingSettings;
import org.chromium.content.browser.TracingControllerAndroidImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xU3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C11442xU3 extends AbstractC0819Gh3 {
    @Override // defpackage.AbstractC0819Gh3
    public final void a(final Intent intent) {
        PostTask.f(AbstractC5103f04.a, new Runnable() { // from class: wU3
            @Override // java.lang.Runnable
            public final void run() {
                if (!((C9727sU3.f == null || C9727sU3.a().c == 0) ? false : true)) {
                    new C6861k72(V60.a).b(100, "tracing_status");
                    AbstractC10756vU3.a = null;
                    return;
                }
                Intent intent2 = intent;
                if ("org.chromium.chrome.browser.tracing.STOP_RECORDING".equals(intent2.getAction())) {
                    final C9727sU3 a = C9727sU3.a();
                    a.b(4);
                    PO a2 = AbstractC10756vU3.a();
                    a2.a.f("Chrome trace is stopping");
                    a2.a.e("Trace data is being collected and compressed.");
                    a2.k(true);
                    AbstractC10756vU3.b(a2.c());
                    TracingControllerAndroidImpl tracingControllerAndroidImpl = a.a;
                    Callback callback = new Callback() { // from class: lU3
                        @Override // org.chromium.base.Callback
                        public final ZE e0(Object obj) {
                            return new ZE(this, obj);
                        }

                        @Override // org.chromium.base.Callback
                        public final void onResult(Object obj) {
                            C9727sU3.this.b(5);
                            Context context = V60.a;
                            PO a3 = AbstractC10756vU3.a();
                            a3.a.f("Chrome trace is complete");
                            K62 k62 = a3.a;
                            k62.e("The trace is ready. Open tracing settings to share.");
                            a3.k(false);
                            String name = TracingSettings.class.getName();
                            Intent a4 = AbstractC7459ls0.a(context, SettingsActivity.class);
                            if (!(context instanceof Activity)) {
                                a4.addFlags(268435456);
                                a4.addFlags(67108864);
                            }
                            a4.putExtra("show_fragment", name);
                            a3.b(0, "Open tracing settings", PendingIntent.getActivity(context, 0, a4, AbstractC2281Ro1.d(false) | 134217728));
                            Intent intent3 = new Intent(context, (Class<?>) TracingNotificationService.class);
                            intent3.setAction("org.chromium.chrome.browser.tracing.DISCARD_TRACE");
                            k62.E.deleteIntent = PendingIntent.getService(context, 0, intent3, AbstractC2281Ro1.d(false) | 134217728);
                            AbstractC10756vU3.b(a3.c());
                        }
                    };
                    if (tracingControllerAndroidImpl.d) {
                        N.M$HKWu8q(tracingControllerAndroidImpl.i, tracingControllerAndroidImpl, tracingControllerAndroidImpl.f, tracingControllerAndroidImpl.g, tracingControllerAndroidImpl.h, callback);
                        return;
                    }
                    return;
                }
                if ("org.chromium.chrome.browser.tracing.DISCARD_TRACE".equals(intent2.getAction())) {
                    C9727sU3.a().b(1);
                }
            }
        });
    }
}
