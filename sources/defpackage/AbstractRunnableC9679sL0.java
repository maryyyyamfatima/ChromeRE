package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.feedback.ScreenshotTask;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.signin.base.CoreAccountInfo;
import org.chromium.components.signin.identitymanager.IdentityManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sL0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC9679sL0 implements Runnable {
    public final long a = SystemClock.elapsedRealtime();
    public final String g;
    public final String h;
    public String i;
    public List j;
    public List k;
    public FX2 l;
    public Callback m;

    public abstract ArrayList a(Object obj);

    public abstract ArrayList b(Activity activity, Object obj);

    public AbstractRunnableC9679sL0(String str, String str2, Callback callback) {
        this.g = str;
        this.h = str2;
        this.m = callback;
    }

    public final void e(Activity activity, ScreenshotTask screenshotTask, Object obj, Profile profile) {
        this.j = b(activity, obj);
        this.k = a(obj);
        C1202Jg1.a().getClass();
        IdentityManager b = C1202Jg1.b(profile);
        if (b != null) {
            this.i = CoreAccountInfo.b(b.b(0));
        }
        for (InterfaceC12080zL0 interfaceC12080zL0 : this.j) {
        }
        this.l = screenshotTask;
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ((InterfaceC3039Xk) it.next()).b(this);
        }
        FX2 fx2 = this.l;
        if (fx2 != null) {
            fx2.c(this);
        }
        ThreadUtils.b().postDelayed(this, 500L);
        c();
    }

    public final Bundle d() {
        Object obj = ThreadUtils.a;
        this.m = null;
        final Bundle bundle = new Bundle();
        Callback callback = new Callback() { // from class: rL0
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj2) {
                return new ZE(this, obj2);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj2) {
                Map d = ((InterfaceC12080zL0) obj2).d();
                if (d == null) {
                    return;
                }
                for (Map.Entry entry : d.entrySet()) {
                    bundle.putString((String) entry.getKey(), (String) entry.getValue());
                }
            }
        };
        AbstractC9048qW.a(this.j, callback);
        AbstractC9048qW.a(this.k, callback);
        return bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c();
    }

    public final void c() {
        if (this.m == null) {
            return;
        }
        FX2 fx2 = this.l;
        if (fx2 == null || fx2.a()) {
            int size = this.k.size();
            long j = this.a;
            if (size > 0 && SystemClock.elapsedRealtime() - j < 500) {
                Iterator it = this.k.iterator();
                while (it.hasNext()) {
                    if (!((InterfaceC3039Xk) it.next()).a()) {
                        return;
                    }
                }
            }
            EI2.k(SystemClock.elapsedRealtime() - j, "Feedback.Duration.FetchSystemInformation");
            Callback callback = this.m;
            this.m = null;
            PostTask.c(AbstractC5103f04.a, callback.e0(this));
        }
    }
}
