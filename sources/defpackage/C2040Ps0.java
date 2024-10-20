package defpackage;

import android.app.Activity;
import java.lang.ref.WeakReference;
import org.chromium.base.ApplicationStatus;
import org.chromium.chrome.browser.app.ChromeActivity;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ps0 */
/* loaded from: classes.dex */
public final class C2040Ps0 {
    public WeakReference a = new WeakReference(null);

    public C2040Ps0() {
        a();
    }

    public final boolean a() {
        Activity activity = ApplicationStatus.c;
        if (!((activity instanceof ChromeActivity) && activity != this.a.get())) {
            return false;
        }
        this.a = new WeakReference((ChromeActivity) activity);
        return true;
    }
}
