package defpackage;

import android.content.Context;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oW1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8364oW1 {
    public final Context a;
    public final ScheduledExecutorService b;
    public ServiceConnectionC5614gW1 c;
    public int d;

    public C8364oW1(Context context) {
        ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new K02("MessengerIpcClient")));
        this.c = new ServiceConnectionC5614gW1(this);
        this.d = 1;
        this.a = context.getApplicationContext();
        this.b = unconfigurableScheduledExecutorService;
    }
}
