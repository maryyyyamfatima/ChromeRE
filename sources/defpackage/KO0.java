package defpackage;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class KO0 implements InterfaceC11096wU0, ComponentCallbacks2 {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());
    public boolean g;
    public boolean h;

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // defpackage.InterfaceC11096wU0
    public final void a(Activity activity) {
        if (this.a.add(activity)) {
            AbstractC10296u74.a();
            if (!this.h) {
                activity.getApplication().registerComponentCallbacks(this);
                this.h = true;
            }
            activity.getWindow().getDecorView().getViewTreeObserver().addOnDrawListener(new JO0(this, O51.a()));
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i >= 20) {
            this.g = false;
            O51 a = O51.a();
            a.getClass();
            AbstractC10296u74.a();
            a.f.set(false);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        onTrimMemory(20);
    }
}
