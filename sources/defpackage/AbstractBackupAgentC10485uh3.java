package defpackage;

import J.N;
import android.app.backup.BackupAgent;
import android.app.backup.BackupDataInput;
import android.app.backup.BackupDataOutput;
import android.app.backup.BackupManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.base.BundleUtils;
import org.chromium.base.PathUtils;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.signin.AccountManagerFacadeProvider;
import org.chromium.components.signin.base.CoreAccountInfo;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: uh3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBackupAgentC10485uh3 extends BackupAgent {
    public final String a = "HM";
    public AbstractC10142th3 b;

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Context b = AbstractApplicationC9799sh3.b(context);
        AbstractC10142th3 abstractC10142th3 = (AbstractC10142th3) BundleUtils.e(b, this.a);
        this.b = abstractC10142th3;
        abstractC10142th3.a = this;
        super.attachBaseContext(b);
    }

    @Override // android.app.backup.BackupAgent
    public final void onBackup(ParcelFileDescriptor parcelFileDescriptor, BackupDataOutput backupDataOutput, ParcelFileDescriptor parcelFileDescriptor2) {
        final HM hm = (HM) this.b;
        hm.getClass();
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        final AtomicReference atomicReference = new AtomicReference();
        Boolean bool = (Boolean) PostTask.e(AbstractC5103f04.a, new Callable() { // from class: DM
            @Override // java.util.concurrent.Callable
            public final Object call() {
                boolean z;
                HM hm2 = HM.this;
                hm2.getClass();
                if (!F50.a) {
                    C7629mN.a().d(false);
                    z = true;
                } else {
                    AbstractC4851eH1.a("ChromeBackupAgent", "Backup agent started from child process", new Object[0]);
                    z = false;
                }
                if (!z) {
                    return Boolean.FALSE;
                }
                C1202Jg1 a = C1202Jg1.a();
                Profile d = Profile.d();
                a.getClass();
                atomicReference.set(C1202Jg1.b(d).b(1));
                String[] MI5MFtcU = N.MI5MFtcU(hm2);
                boolean[] MQnAywBr = N.MQnAywBr(hm2);
                for (String str : MI5MFtcU) {
                    arrayList.add(AbstractC4809e90.a("native.", str));
                }
                for (boolean z2 : MQnAywBr) {
                    arrayList2.add(z2 ? new byte[]{1} : new byte[]{0});
                }
                return Boolean.TRUE;
            }
        });
        SharedPreferences sharedPreferences = T60.a;
        if (!bool.booleanValue()) {
            int i = sharedPreferences.getInt("android_backup_failure_count", 0) + 1;
            if (i >= 5) {
                return;
            }
            sharedPreferences.edit().putInt("android_backup_failure_count", i).apply();
            if (parcelFileDescriptor != null) {
                try {
                    new GM(parcelFileDescriptor).a(parcelFileDescriptor2);
                } catch (Exception unused) {
                }
            }
            new BackupManager(hm.a).dataChanged();
            return;
        }
        sharedPreferences.edit().remove("android_backup_failure_count").apply();
        String[] strArr = HM.b;
        int i2 = 0;
        for (int i3 = 5; i2 < i3; i3 = 5) {
            String str = strArr[i2];
            if (sharedPreferences.contains(str)) {
                arrayList.add("AndroidDefault." + str);
                arrayList2.add(sharedPreferences.getBoolean(str, false) ? new byte[]{1} : new byte[]{0});
            }
            i2++;
        }
        arrayList.add("AndroidDefault.google.services.username");
        arrayList2.add(AbstractC9771sd.b(atomicReference.get() == null ? "" : ((CoreAccountInfo) atomicReference.get()).getEmail()));
        GM gm = new GM(arrayList, arrayList2);
        try {
            if (gm.equals(new GM(parcelFileDescriptor))) {
                AbstractC4851eH1.d("ChromeBackupAgent", "Nothing has changed since the last backup. Backup skipped.", new Object[0]);
                gm.a(parcelFileDescriptor2);
                return;
            }
        } catch (IOException unused2) {
            AbstractC4851eH1.d("ChromeBackupAgent", "Can't read backup status file", new Object[0]);
        }
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            backupDataOutput.writeEntityHeader((String) arrayList.get(i4), ((byte[]) arrayList2.get(i4)).length);
            backupDataOutput.writeEntityData((byte[]) arrayList2.get(i4), ((byte[]) arrayList2.get(i4)).length);
        }
        gm.a(parcelFileDescriptor2);
        AbstractC4851eH1.d("ChromeBackupAgent", "Backup complete", new Object[0]);
    }

    @Override // android.app.backup.BackupAgent
    public final void onRestore(BackupDataInput backupDataInput, int i, ParcelFileDescriptor parcelFileDescriptor) {
        final HM hm = (HM) this.b;
        hm.getClass();
        SharedPreferences sharedPreferences = T60.a;
        if (AbstractC10385uP0.a() || O83.a.e("lightweight_first_run_flow", false)) {
            HM.a(2);
            AbstractC4851eH1.f("ChromeBackupAgent", "Restore attempted after first run", new Object[0]);
            return;
        }
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        final String str = null;
        while (backupDataInput.readNextHeader()) {
            String key = backupDataInput.getKey();
            int dataSize = backupDataInput.getDataSize();
            byte[] bArr = new byte[dataSize];
            backupDataInput.readEntityData(bArr, 0, dataSize);
            if (key.equals("AndroidDefault.google.services.username")) {
                str = new String(bArr);
            } else {
                arrayList.add(key);
                arrayList2.add(bArr);
            }
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        PostTask.f(AbstractC5103f04.a, new Runnable() { // from class: AM
            @Override // java.lang.Runnable
            public final void run() {
                HM.this.getClass();
                PathUtils.c();
                new FM(countDownLatch).c(false, true);
            }
        });
        try {
            countDownLatch.await(20L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
        }
        QF3 qf3 = AbstractC5103f04.a;
        if (!((Boolean) PostTask.e(qf3, new Callable() { // from class: BM
            @Override // java.util.concurrent.Callable
            public final Object call() {
                HM.this.getClass();
                boolean z = false;
                if (!F50.a) {
                    C7629mN.a().d(false);
                    z = true;
                } else {
                    AbstractC4851eH1.a("ChromeBackupAgent", "Backup agent started from child process", new Object[0]);
                }
                return Boolean.valueOf(z);
            }
        })).booleanValue()) {
            HM.a(3);
            return;
        }
        if (!((Boolean) PostTask.e(qf3, new Callable() { // from class: EM
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List e = B4.e(AccountManagerFacadeProvider.getInstance().a());
                String str2 = str;
                return Boolean.valueOf((str2 == null || B4.d(str2, e) == null) ? false : true);
            }
        })).booleanValue()) {
            HM.a(4);
            AbstractC4851eH1.d("ChromeBackupAgent", "Chrome was not signed in with a known account name, not restoring", new Object[0]);
            return;
        }
        PostTask.f(qf3, new Runnable() { // from class: CM
            @Override // java.lang.Runnable
            public final void run() {
                HM hm2 = HM.this;
                hm2.getClass();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = arrayList;
                boolean[] zArr = new boolean[arrayList4.size()];
                int i2 = 0;
                for (int i3 = 0; i3 < arrayList4.size(); i3++) {
                    String str2 = (String) arrayList4.get(i3);
                    if (str2.startsWith("native.")) {
                        arrayList3.add(str2.substring(7));
                        zArr[i2] = ((byte[]) arrayList2.get(i3))[0] != 0;
                        i2++;
                    }
                }
                N.MR$KRfKy(hm2, (String[]) arrayList3.toArray(new String[i2]), Arrays.copyOf(zArr, i2));
            }
        });
        SharedPreferences.Editor edit = sharedPreferences.edit();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            String str2 = (String) arrayList.get(i2);
            if (str2.startsWith("AndroidDefault.") && Arrays.asList(HM.b).contains(str2.substring(15))) {
                edit.putBoolean(str2.substring(15), ((byte[]) arrayList2.get(i2))[0] != 0);
            }
        }
        edit.putString("first_run_signin_account_name", str);
        edit.apply();
        HM.a(1);
        AbstractC4851eH1.d("ChromeBackupAgent", "Restore complete", new Object[0]);
    }
}
