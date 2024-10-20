package defpackage;

import J.N;
import android.util.Pair;
import android.view.accessibility.AccessibilityManager;
import org.chromium.base.Callback;
import org.chromium.base.task.PostTask;
import org.chromium.content.browser.TracingControllerAndroidImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nU3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C8012nU3 implements Callback {
    public final /* synthetic */ C9727sU3 a;

    public /* synthetic */ C8012nU3(C9727sU3 c9727sU3) {
        this.a = c9727sU3;
    }

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        int round;
        Pair pair = (Pair) obj;
        final C9727sU3 c9727sU3 = this.a;
        if (c9727sU3.c != 3) {
            return;
        }
        float floatValue = ((Float) pair.first).floatValue();
        AccessibilityManager accessibilityManager = (AccessibilityManager) V60.a.getSystemService("accessibility");
        if ((!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) && AbstractC10756vU3.b != (round = Math.round(floatValue * 100.0f))) {
            AbstractC10756vU3.b = round;
            AbstractC10756vU3.a.g(String.format("Trace buffer usage: %s%%", Integer.valueOf(round)));
            AbstractC10756vU3.b(AbstractC10756vU3.a.c());
        }
        PostTask.b(AbstractC5103f04.a, new Runnable() { // from class: oU3
            @Override // java.lang.Runnable
            public final void run() {
                C9727sU3 c9727sU32 = C9727sU3.this;
                if (c9727sU32.c != 3) {
                    return;
                }
                TracingControllerAndroidImpl tracingControllerAndroidImpl = c9727sU32.a;
                C8012nU3 c8012nU3 = new C8012nU3(c9727sU32);
                if (tracingControllerAndroidImpl.i == 0) {
                    tracingControllerAndroidImpl.i = N.MWlLnA$6(tracingControllerAndroidImpl);
                }
                N.MkLMghix(tracingControllerAndroidImpl.i, tracingControllerAndroidImpl, c8012nU3);
            }
        }, 1000L);
    }
}
