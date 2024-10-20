package defpackage;

import android.content.SharedPreferences;
import org.chromium.base.task.PostTask;
import org.chromium.components.variations.firstrun.VariationsSeedBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC5698gl implements Runnable {
    public final String a;
    public final String g = Integer.toString(105);
    public final String h = "stable";
    public final /* synthetic */ AbstractC6042hl i;

    public RunnableC5698gl(AbstractC6042hl abstractC6042hl, String str) {
        this.i = abstractC6042hl;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3777b84 c3777b84;
        Object obj = C3777b84.b;
        synchronized (obj) {
            if (C3777b84.c == null) {
                C3777b84.c = new C3777b84();
            }
            c3777b84 = C3777b84.c;
        }
        String str = this.a;
        String str2 = this.g;
        String str3 = this.h;
        c3777b84.getClass();
        synchronized (obj) {
            SharedPreferences sharedPreferences = T60.a;
            if (!sharedPreferences.getBoolean("variations_initialized", false) && !VariationsSeedBridge.hasNativePref()) {
                C3433a84 c3433a84 = c3777b84.a(str, str2, str3).b;
                if (c3433a84 != null) {
                    VariationsSeedBridge.setVariationsFirstRunSeed(c3433a84.e, c3433a84.a, c3433a84.b, c3433a84.c, c3433a84.d);
                }
                sharedPreferences.edit().putBoolean("variations_initialized", true).apply();
            }
        }
        PostTask.c(AbstractC5103f04.e, new RunnableC5354fl(this));
    }
}
