package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vS1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10744vS1 {
    public static final int e;
    public final Context a;
    public final ActivityManager b;
    public final C11087wS1 c;
    public final float d;

    static {
        e = Build.VERSION.SDK_INT < 26 ? 4 : 1;
    }

    public C10744vS1(Context context) {
        this.d = e;
        this.a = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.b = activityManager;
        this.c = new C11087wS1(context.getResources().getDisplayMetrics());
        if (Build.VERSION.SDK_INT < 26 || !activityManager.isLowRamDevice()) {
            return;
        }
        this.d = 0.0f;
    }
}
