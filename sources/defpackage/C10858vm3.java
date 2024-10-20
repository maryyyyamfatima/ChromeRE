package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.File;
import java.io.IOException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vm3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10858vm3 {
    public final SharedPreferences a;
    public final Context b;
    public final C8504ou1 c;
    public final C4317ck d;

    public static String b(String str, String str2) {
        return AbstractC8192o0.a(str, "|S|", str2);
    }

    public C10858vm3(Context context) {
        C8504ou1 c8504ou1 = new C8504ou1();
        this.d = new C4317ck();
        this.b = context;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.a = sharedPreferences;
        this.c = c8504ou1;
        Object obj = Y50.a;
        File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || sharedPreferences.getAll().isEmpty()) {
                return;
            }
            Log.i("InstanceID/Store", "App restored, clearing state");
            AbstractServiceC1497Ln1.a(context, this);
        } catch (IOException e) {
            if (Log.isLoggable("InstanceID/Store", 3)) {
                e.getMessage();
            }
        }
    }

    public static String c(String str, String str2, String str3) {
        return str + "|T|" + str2 + "|" + str3;
    }

    public static String d(String str, String str2, String str3) {
        return str + "|T-timestamp|" + str2 + "|" + str3;
    }

    public final synchronized C7816mu1 a(String str) {
        C7816mu1 a;
        C7816mu1 c7816mu1 = (C7816mu1) this.d.get(str);
        if (c7816mu1 != null) {
            return c7816mu1;
        }
        try {
            C8504ou1 c8504ou1 = this.c;
            Context context = this.b;
            c8504ou1.getClass();
            a = C8504ou1.e(context, str);
            if (a == null) {
                a = C8504ou1.a(context, str);
            }
        } catch (C8160nu1 unused) {
            Log.w("InstanceID/Store", "Stored data is corrupt, generating new identity");
            AbstractServiceC1497Ln1.a(this.b, this);
            C8504ou1 c8504ou12 = this.c;
            Context context2 = this.b;
            c8504ou12.getClass();
            a = C8504ou1.a(context2, str);
        }
        this.d.put(str, a);
        return a;
    }
}
