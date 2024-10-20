package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.SparseArray;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.base.task.PostTask;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pO2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8668pO2 {
    public static final AtomicBoolean g = new AtomicBoolean();
    public static SparseArray h;
    public long a = -1;
    public long b = 100;
    public final SharedPreferences c;
    public final int d;
    public float e;
    public long f;

    public final void c(String str) {
        this.b = 100L;
        this.a = -1L;
        this.e = Math.min(10.0f, this.e + (TextUtils.equals(null, str) ? 2 : 1));
        SharedPreferences.Editor edit = this.c.edit();
        float f = this.e;
        int i = this.d;
        if (f <= 0.0f) {
            this.e = 10.0f;
            this.f = System.currentTimeMillis() + 604800000;
            edit.putLong(AbstractC9076qb1.a("banned_until_", i), this.f);
        }
        edit.putFloat(AbstractC9076qb1.a("score_", i), this.e);
        edit.apply();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.C8668pO2 a(int r11) {
        /*
            android.util.SparseArray r0 = defpackage.C8668pO2.h
            if (r0 != 0) goto L98
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            defpackage.C8668pO2.h = r0
            android.content.Context r0 = defpackage.V60.a
            java.lang.String r1 = "customtabs_client_bans"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            android.content.SharedPreferences$Editor r1 = r0.edit()
            long r2 = java.lang.System.currentTimeMillis()
            java.util.Map r0 = r0.getAll()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L28:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L95
            java.lang.Object r4 = r0.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            if (r4 != 0) goto L37
            goto L28
        L37:
            java.lang.Object r5 = r4.getKey()
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L28
            java.lang.String r6 = "last_request_"
            boolean r7 = r5.startsWith(r6)
            if (r7 != 0) goto L48
            goto L28
        L48:
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.NumberFormatException -> L28
            java.lang.Long r4 = (java.lang.Long) r4     // Catch: java.lang.NumberFormatException -> L28
            long r7 = r4.longValue()     // Catch: java.lang.NumberFormatException -> L28
            long r7 = r2 - r7
            r9 = 1209600000(0x48190800, double:5.97621805E-315)
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 < 0) goto L28
            r4 = 13
            java.lang.String r4 = r5.substring(r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "score_"
            r5.<init>(r7)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            android.content.SharedPreferences$Editor r5 = r1.remove(r5)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r6)
            r7.append(r4)
            java.lang.String r6 = r7.toString()
            android.content.SharedPreferences$Editor r5 = r5.remove(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "banned_until_"
            r6.<init>(r7)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r5.remove(r4)
            goto L28
        L95:
            r1.apply()
        L98:
            android.util.SparseArray r0 = defpackage.C8668pO2.h
            java.lang.Object r0 = r0.get(r11)
            pO2 r0 = (defpackage.C8668pO2) r0
            if (r0 != 0) goto Lac
            pO2 r0 = new pO2
            r0.<init>(r11)
            android.util.SparseArray r1 = defpackage.C8668pO2.h
            r1.put(r11, r0)
        Lac:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8668pO2.a(int):pO2");
    }

    public C8668pO2(int i) {
        SharedPreferences sharedPreferences = V60.a.getSharedPreferences("customtabs_client_bans", 0);
        this.c = sharedPreferences;
        this.d = i;
        this.e = sharedPreferences.getFloat("score_" + i, 10.0f);
        sharedPreferences.getLong("last_request_" + i, 0L);
        this.f = sharedPreferences.getLong("banned_until_" + i, 0L);
    }

    public static void b() {
        if (!g.compareAndSet(false, true)) {
            return;
        }
        PostTask.c(QF3.h, new Runnable() { // from class: oO2
            @Override // java.lang.Runnable
            public final void run() {
                V60.a.getSharedPreferences("customtabs_client_bans", 0).edit();
            }
        });
    }
}
