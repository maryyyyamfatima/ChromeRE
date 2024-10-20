package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fz2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5439fz2 {
    public float a = 0.2f;
    public float b = 0.9f;
    public int c = 1000;
    public int d = 1000;
    public float e = 1.0f;
    public float f = 0.0f;
    public final Context g;
    public SharedPreferences h;

    public C5439fz2(Activity activity) {
        this.g = activity;
        new Thread(new RunnableC5095ez2(this)).start();
    }

    public final float a(float f) {
        if (f < this.e) {
            this.e = f;
        }
        if (f > this.f) {
            this.f = f;
        }
        int i = this.d - 1;
        this.d = i;
        if (i == 0) {
            this.a = (this.a * 0.9f) + (this.e * 0.1f);
            this.b = (this.b * 0.9f) + (this.f * 0.1f);
            this.e = 1.0f;
            this.f = 0.0f;
            int i2 = this.c;
            if (i2 < 1000) {
                int i3 = (int) (i2 * 1.5f);
                this.c = i3;
                if (i3 > 1000) {
                    this.c = 1000;
                }
            }
            this.d = this.c;
            SharedPreferences sharedPreferences = this.h;
            if (sharedPreferences != null) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putBoolean("first_run", false);
                edit.putFloat("pressure_min", this.a);
                edit.putFloat("pressure_max", this.b);
                edit.apply();
            }
        }
        float f2 = this.a;
        return (f - f2) / (this.b - f2);
    }

    static {
        new Paint(1).setColor(-65536);
    }
}
