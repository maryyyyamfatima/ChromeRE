package defpackage;

import android.content.Intent;
import android.content.SharedPreferences;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gk4 */
/* loaded from: classes2.dex */
public final class C5697gk4 implements Vn4 {
    public final /* synthetic */ C6041hk4 a;

    public C5697gk4(C6041hk4 c6041hk4) {
        this.a = c6041hk4;
    }

    @Override // defpackage.Vn4
    public final void a(C12237zn4 c12237zn4) {
        Intent intent = new Intent();
        C6041hk4 c6041hk4 = this.a;
        c12237zn4.c(AbstractC7071kk4.b(intent, c6041hk4.a, null, c6041hk4.g, false, false, null, null));
        SharedPreferences sharedPreferences = c12237zn4.b;
        sharedPreferences.edit().putInt("source", c6041hk4.g).apply();
        sharedPreferences.edit().putLong("last_check_web_manifest_update_time", System.currentTimeMillis()).apply();
    }
}
