package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cx2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4398cx2 extends AbstractC6117hx2 {
    public Bundle c;

    @Override // defpackage.AbstractC6117hx2
    public final void c() {
        Map<String, ?> all;
        Bundle bundle = this.c;
        if (bundle != null) {
            b(bundle);
            return;
        }
        Bundle bundle2 = new Bundle();
        SharedPreferences b = C4055bx2.a().b();
        if (b == null) {
            all = null;
        } else {
            C7432ln3 c = C7432ln3.c();
            try {
                all = b.getAll();
                c.close();
            } catch (Throwable th) {
                try {
                    c.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        }
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Integer) {
                bundle2.putInt(key, ((Integer) value).intValue());
            } else if (value instanceof Boolean) {
                bundle2.putBoolean(key, ((Boolean) value).booleanValue());
            } else if (value instanceof String) {
                bundle2.putString(key, (String) value);
            }
        }
        this.c = bundle2;
        b(bundle2);
    }
}
