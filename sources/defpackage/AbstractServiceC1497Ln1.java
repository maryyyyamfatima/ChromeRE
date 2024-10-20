package defpackage;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.io.File;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ln1 */
/* loaded from: classes.dex */
public abstract class AbstractServiceC1497Ln1 extends Service {
    public static void a(Context context, C10858vm3 c10858vm3) {
        synchronized (c10858vm3) {
            c10858vm3.d.clear();
            C8504ou1 c8504ou1 = c10858vm3.c;
            Context context2 = c10858vm3.b;
            c8504ou1.getClass();
            Object obj = Y50.a;
            File noBackupFilesDir = context2.getNoBackupFilesDir();
            if (noBackupFilesDir == null || !noBackupFilesDir.isDirectory()) {
                Log.w("InstanceID", "noBackupFilesDir doesn't exist, using regular files directory instead");
                noBackupFilesDir = context2.getFilesDir();
            }
            for (File file : noBackupFilesDir.listFiles()) {
                if (file.getName().startsWith("com.google.InstanceId")) {
                    file.delete();
                }
            }
            c10858vm3.a.edit().clear().commit();
        }
        Intent intent = new Intent("com.google.android.gms.iid.InstanceID");
        intent.putExtra("CMD", "RST");
        intent.setClassName(context, "com.google.android.gms.gcm.GcmReceiver");
        context.sendBroadcast(intent);
    }
}
