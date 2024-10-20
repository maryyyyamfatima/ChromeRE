package defpackage;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pW1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8707pW1 {
    public static C8707pW1 e;
    public final Context a;
    public final ScheduledExecutorService b;
    public ServiceConnectionC5958hW1 c = new ServiceConnectionC5958hW1(this);
    public int d = 1;

    public C8707pW1(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.b = scheduledExecutorService;
        this.a = context.getApplicationContext();
    }
}
