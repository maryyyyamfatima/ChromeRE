package defpackage;

import org.chromium.base.Callback;
import org.chromium.components.feature_engagement.TriggerDetails;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public interface KU3 {
    void a(String str);

    String b();

    void c(Runnable runnable, String str);

    void d(Callback callback);

    void dismissed(String str);

    void dismissedWithSnooze(String str, int i);

    TriggerDetails e(String str);

    void f(String str);

    int getTriggerState(String str);

    boolean isInitialized();

    void notifyEvent(String str);

    boolean shouldTriggerHelpUI(String str);

    boolean wouldTriggerHelpUI(String str);
}
