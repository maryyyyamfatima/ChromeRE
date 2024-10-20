package defpackage;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Cj2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0308Cj2 {
    public final SharedPreferences a;
    public Map b;
    public HashMap c;

    public C0308Cj2() {
        SharedPreferences sharedPreferences = V60.a.getSharedPreferences("partner_bookmarks_favicon_throttle", 0);
        this.a = sharedPreferences;
        this.b = sharedPreferences.getAll();
        this.c = new HashMap();
    }

    public final void a() {
        if (this.b.equals(this.c)) {
            return;
        }
        SharedPreferences.Editor edit = this.a.edit();
        edit.clear();
        for (Map.Entry entry : this.c.entrySet()) {
            edit.putLong((String) entry.getKey(), ((Long) entry.getValue()).longValue());
        }
        edit.apply();
    }

    public final void b(int i, String str) {
        boolean z = true;
        if (i == 1) {
            this.c.put(str, Long.valueOf(System.currentTimeMillis() + 2592000000L));
            return;
        }
        if (i != 5 && i != 6) {
            z = false;
        }
        if (z || c(str) || System.currentTimeMillis() >= ((Long) this.b.get(str)).longValue()) {
            return;
        }
        this.c.put(str, (Long) this.b.get(str));
    }

    public final boolean c(String str) {
        Long l = this.b.containsKey(str) ? (Long) this.b.get(str) : null;
        return l == null || System.currentTimeMillis() >= l.longValue();
    }
}
