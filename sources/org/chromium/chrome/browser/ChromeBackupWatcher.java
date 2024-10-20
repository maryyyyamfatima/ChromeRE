package org.chromium.chrome.browser;

import android.app.backup.BackupManager;
import android.content.Context;
import defpackage.C1202Jg1;
import defpackage.C7432ln3;
import defpackage.JM;
import defpackage.O83;
import defpackage.P83;
import defpackage.Q83;
import defpackage.V60;
import org.chromium.chrome.browser.ChromeBackupWatcher;
import org.chromium.chrome.browser.profiles.Profile;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ChromeBackupWatcher {
    public final BackupManager a;

    public static ChromeBackupWatcher createChromeBackupWatcher() {
        return new ChromeBackupWatcher();
    }

    public ChromeBackupWatcher() {
        Context context = V60.a;
        if (context == null) {
            return;
        }
        BackupManager backupManager = new BackupManager(context);
        this.a = backupManager;
        Q83 q83 = O83.a;
        if (!q83.e("first_backup_done", false)) {
            C7432ln3 c = C7432ln3.c();
            try {
                backupManager.dataChanged();
                c.close();
                q83.p("first_backup_done", true);
            } catch (Throwable th) {
                try {
                    c.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        }
        q83.a(new P83() { // from class: IM
            @Override // defpackage.P83
            public final void a(String str) {
                ChromeBackupWatcher chromeBackupWatcher = ChromeBackupWatcher.this;
                chromeBackupWatcher.getClass();
                String[] strArr = HM.b;
                for (int i = 0; i < 5; i++) {
                    if (str.equals(strArr[i])) {
                        chromeBackupWatcher.onBackupPrefsChanged();
                        return;
                    }
                }
            }
        });
        C1202Jg1 a = C1202Jg1.a();
        Profile d = Profile.d();
        a.getClass();
        C1202Jg1.b(d).a(new JM(this));
    }

    public final void onBackupPrefsChanged() {
        C7432ln3 c = C7432ln3.c();
        try {
            this.a.dataChanged();
            c.close();
        } catch (Throwable th) {
            try {
                c.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }
}
