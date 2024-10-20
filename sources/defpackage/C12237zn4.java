package defpackage;

import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import java.io.File;
import org.chromium.base.task.PostTask;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zn4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C12237zn4 {
    public final String a;
    public final SharedPreferences b;

    public final void c(PC pc) {
        boolean z;
        long j;
        if (pc == null) {
            return;
        }
        Kn4 c = Kn4.c(pc);
        SharedPreferences sharedPreferences = this.b;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        boolean z2 = true;
        if (sharedPreferences.getString("url", "").equals("")) {
            edit.putString("url", c.s());
            z = true;
        } else {
            z = false;
        }
        if (sharedPreferences.getString("scope", "").equals("")) {
            edit.putString("scope", c.o());
            z = true;
        }
        if (sharedPreferences.getInt("version", 0) != 3) {
            edit.putInt("version", 3);
            if (c.j()) {
                edit.putString("webapk_package_name", c.t());
                edit.putString("webapk_manifest_url", c.m());
                edit.putInt("webapk_version_code", c.e().n);
                try {
                    j = V60.a.getPackageManager().getPackageInfo(c.t(), 0).firstInstallTime;
                } catch (PackageManager.NameNotFoundException unused) {
                    j = 0;
                }
                edit.putLong("webapk_install_timestamp", j);
            } else {
                edit.putString("name", c.n());
                edit.putString("short_name", c.p());
                edit.putString("icon", c.g().b());
                edit.putInt("display_mode", c.d());
                edit.putInt("orientation", c.f().h);
                edit.putLong("theme_color", c.r());
                edit.putLong("background_color", c.b());
                edit.putBoolean("is_icon_generated", c.l());
                edit.putBoolean("is_icon_adaptive", c.k());
                edit.putInt("source", c.f().i);
            }
        } else {
            z2 = z;
        }
        if (z2) {
            edit.apply();
        }
    }

    public final void b(boolean z) {
        SharedPreferences sharedPreferences = this.b;
        String string = sharedPreferences.getString("webapk_package_name", null);
        if ((string == null || string.startsWith("org.chromium.webapk")) ? false : true) {
            return;
        }
        sharedPreferences.edit().putBoolean("should_force_update", z).apply();
    }

    public final void a() {
        SharedPreferences sharedPreferences = this.b;
        final String string = sharedPreferences.getString("pending_update_file_path", null);
        if (string == null) {
            return;
        }
        sharedPreferences.edit().remove("pending_update_file_path").apply();
        PostTask.c(QF3.h, new Runnable() { // from class: xn4
            @Override // java.lang.Runnable
            public final void run() {
                new File(string).delete();
            }
        });
    }

    public C12237zn4(String str) {
        this.a = str;
        this.b = V60.a.getSharedPreferences("webapp_" + str, 0);
    }
}
