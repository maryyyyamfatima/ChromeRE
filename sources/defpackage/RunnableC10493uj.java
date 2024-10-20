package defpackage;

import org.chromium.base.ApplicationStatus;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: uj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC10493uj implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        if (ApplicationStatus.d != null) {
            return;
        }
        C10150tj c10150tj = new C10150tj();
        ApplicationStatus.d = c10150tj;
        ApplicationStatus.d(c10150tj);
    }
}
