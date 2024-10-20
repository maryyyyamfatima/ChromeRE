package defpackage;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import org.chromium.base.BundleUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Nh3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractServiceC1728Nh3 extends Service {
    public final String a;
    public AbstractC1598Mh3 g;

    public AbstractServiceC1728Nh3(String str) {
        this.a = str;
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Context b = AbstractApplicationC9799sh3.b(context);
        AbstractC1598Mh3 abstractC1598Mh3 = (AbstractC1598Mh3) BundleUtils.e(b, this.a);
        this.g = abstractC1598Mh3;
        abstractC1598Mh3.a = this;
        super.attachBaseContext(b);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.g.b();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        return this.g.e(intent, i, i2);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.g.c();
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
        super.onTaskRemoved(intent);
        this.g.f();
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public final void onLowMemory() {
        super.onLowMemory();
        this.g.d();
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        return this.g.g(intent);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.g.a();
    }

    public static int a(AbstractServiceC1728Nh3 abstractServiceC1728Nh3, Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }

    public static boolean b(AbstractServiceC1728Nh3 abstractServiceC1728Nh3, Intent intent) {
        return super.onUnbind(intent);
    }
}
