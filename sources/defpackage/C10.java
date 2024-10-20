package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class C10 implements Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        synchronized (D10.a) {
            if (D10.b.containsKey(activity)) {
                throw new IllegalStateException("The MountContentPools has a reference to an activity that has just been created");
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        boolean z;
        synchronized (D10.a) {
            HashMap hashMap = D10.b;
            hashMap.remove(activity);
            Iterator it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                Context context = (Context) ((Map.Entry) it.next()).getKey();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        z = false;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                    if (context == activity) {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    it.remove();
                }
            }
            D10.c.put(W60.a(activity), Boolean.TRUE);
        }
    }
}
