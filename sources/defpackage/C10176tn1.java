package defpackage;

import android.content.SharedPreferences;
import java.util.Collections;
import java.util.HashSet;
import org.chromium.base.task.PostTask;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tn1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10176tn1 {
    public final SharedPreferences a;

    public C10176tn1() {
        C7432ln3 c = C7432ln3.c();
        try {
            this.a = V60.a.getSharedPreferences("trusted_web_activity_client_apps", 0);
            c.close();
            PostTask.c(QF3.g, new Runnable() { // from class: sn1
                @Override // java.lang.Runnable
                public final void run() {
                    C10176tn1.this.e();
                }
            });
        } catch (Throwable th) {
            try {
                c.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public final void f(int i, String str, String str2, String str3, C1193Je2 c1193Je2) {
        HashSet e = e();
        e.add(String.valueOf(i));
        SharedPreferences sharedPreferences = this.a;
        sharedPreferences.edit().putStringSet("trusted_web_activity_uids", e).apply();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString(a(i), str);
        edit.putString(d(i), str2);
        String b = b(i);
        HashSet hashSet = new HashSet(sharedPreferences.getStringSet(b, Collections.emptySet()));
        hashSet.add(str3);
        edit.putStringSet(b, hashSet);
        String c = c(i);
        String c1193Je22 = c1193Je2.toString();
        HashSet hashSet2 = new HashSet(sharedPreferences.getStringSet(c, Collections.emptySet()));
        hashSet2.add(c1193Je22);
        edit.putStringSet(c, hashSet2);
        edit.apply();
    }

    public final HashSet e() {
        C7432ln3 c = C7432ln3.c();
        try {
            HashSet hashSet = new HashSet(this.a.getStringSet("trusted_web_activity_uids", Collections.emptySet()));
            c.close();
            return hashSet;
        } catch (Throwable th) {
            try {
                c.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public static String a(int i) {
        return i + ".appName";
    }

    public static String d(int i) {
        return i + ".packageName";
    }

    public static String b(int i) {
        return i + ".domain";
    }

    public static String c(int i) {
        return i + ".origin";
    }
}
