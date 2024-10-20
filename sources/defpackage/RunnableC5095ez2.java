package defpackage;

import android.content.SharedPreferences;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ez2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC5095ez2 implements Runnable {
    public final /* synthetic */ C5439fz2 a;

    public RunnableC5095ez2(C5439fz2 c5439fz2) {
        this.a = c5439fz2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5439fz2 c5439fz2 = this.a;
        SharedPreferences sharedPreferences = c5439fz2.g.getSharedPreferences("com.google.research.ink", 0);
        c5439fz2.h = sharedPreferences;
        c5439fz2.a = sharedPreferences.getFloat("pressure_min", 0.2f);
        c5439fz2.b = c5439fz2.h.getFloat("pressure_max", 0.9f);
        if (c5439fz2.h.getBoolean("first_run", true)) {
            c5439fz2.c = 100;
            c5439fz2.d = 100;
        }
    }
}
