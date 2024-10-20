package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.TimeUnit;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Dn1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0457Dn1 {
    public static final C4317ck c = new C4317ck();
    public static final long d = TimeUnit.DAYS.toMillis(7);
    public static C10858vm3 e;
    public static C11083wR2 f;
    public static String g;
    public final Context a;
    public final String b;

    public C0457Dn1(Context context, String str) {
        this.b = "";
        this.a = context.getApplicationContext();
        this.b = str;
    }

    public static int c(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e2) {
            Log.w("InstanceID", "Never happens: can't find own package ".concat(String.valueOf(e2)));
            return 0;
        }
    }

    public static synchronized C0457Dn1 e(Context context, Bundle bundle) {
        C0457Dn1 c0457Dn1;
        synchronized (C0457Dn1.class) {
            String string = bundle.getString("subtype");
            if (string == null) {
                string = "";
            }
            Context applicationContext = context.getApplicationContext();
            if (e == null) {
                Log.w("InstanceID", "Instance ID SDK is deprecated, " + applicationContext.getPackageName() + " should update to use Firebase Instance ID");
                e = new C10858vm3(applicationContext);
                f = new C11083wR2(applicationContext);
            }
            g = Integer.toString(c(applicationContext));
            C4317ck c4317ck = c;
            c0457Dn1 = (C0457Dn1) c4317ck.get(string);
            if (c0457Dn1 == null) {
                c0457Dn1 = new C0457Dn1(applicationContext, string);
                c4317ck.put(string, c0457Dn1);
            }
        }
        return c0457Dn1;
    }

    public static String d(KeyPair keyPair) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(keyPair.getPublic().getEncoded());
            digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("InstanceID", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    public final void a() {
        b("*", "*");
        C10858vm3 c10858vm3 = e;
        String str = this.b;
        synchronized (c10858vm3) {
            c10858vm3.d.remove(str);
        }
        C8504ou1 c8504ou1 = c10858vm3.c;
        Context context = c10858vm3.b;
        c8504ou1.getClass();
        File b = C8504ou1.b(context, str);
        if (b.exists()) {
            b.delete();
        }
        String a = AbstractC7848n0.a(str, "|");
        synchronized (c10858vm3) {
            SharedPreferences.Editor edit = c10858vm3.a.edit();
            for (String str2 : c10858vm3.a.getAll().keySet()) {
                if (str2.startsWith(a)) {
                    edit.remove(str2);
                }
            }
            edit.commit();
        }
    }

    public final void b(String str, String str2) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IOException("MAIN_THREAD");
        }
        C10858vm3 c10858vm3 = e;
        String str3 = this.b;
        synchronized (c10858vm3) {
            SharedPreferences.Editor edit = c10858vm3.a.edit();
            edit.remove(C10858vm3.c(str3, str, str2));
            edit.remove(C10858vm3.d(str3, str, str2));
            edit.commit();
        }
        Bundle bundle = new Bundle();
        bundle.putString("sender", str);
        if (str2 != null) {
            bundle.putString("scope", str2);
        }
        bundle.putString("subscription", str);
        bundle.putString("delete", "1");
        bundle.putString("X-delete", "1");
        bundle.putString("subtype", "".equals(this.b) ? str : this.b);
        if (!"".equals(this.b)) {
            str = this.b;
        }
        bundle.putString("X-subtype", str);
        Bundle d2 = f.d(bundle, e.a(this.b).a);
        f.getClass();
        C11083wR2.b(d2);
    }
}
