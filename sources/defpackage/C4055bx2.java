package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bx2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4055bx2 {
    public static C4055bx2 d;
    public SharedPreferences b;
    public boolean a = true;
    public final IK3 c = new IK3();

    public final SharedPreferences b() {
        this.c.getClass();
        if (this.b == null) {
            Context context = V60.a;
            if (context == null) {
                return null;
            }
            C7432ln3 c = C7432ln3.c();
            try {
                this.b = context.getSharedPreferences("Components.Policy", 0);
                c.close();
            } catch (Throwable th) {
                try {
                    c.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        }
        return this.b;
    }

    public static C4055bx2 a() {
        if (d == null) {
            d = new C4055bx2();
        }
        return d;
    }
}
