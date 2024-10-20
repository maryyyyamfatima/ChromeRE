package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class P5 implements Application.ActivityLifecycleCallbacks {
    public Object a;
    public Activity g;
    public final int h;
    public boolean i = false;
    public boolean j = false;
    public boolean k = false;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    public P5(Activity activity) {
        this.g = activity;
        this.h = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.g == activity) {
            this.i = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.j || this.k || this.i) {
            return;
        }
        Object obj = this.a;
        boolean z = false;
        try {
            Object obj2 = Q5.c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.h) {
                Q5.g.postAtFrontOfQueue(new O5(Q5.b.get(activity), obj2));
                z = true;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
        }
        if (z) {
            this.k = true;
            this.a = null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.g == activity) {
            this.g = null;
            this.j = true;
        }
    }
}
