package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Process;
import org.chromium.base.TraceEvent;
import org.chromium.base.library_loader.a;
import org.chromium.base.library_loader.b;
import org.chromium.content.app.ContentChildProcessServiceDelegate;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: e50 */
/* loaded from: classes2.dex */
public abstract class AbstractServiceC4785e50 extends Service {
    public BK a;

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        BK bk = new BK(new ContentChildProcessServiceDelegate(), this, getApplicationContext());
        this.a = bk;
        AbstractC4851eH1.d("ChildProcessService", "Creating new ChildProcessService pid=%d", Integer.valueOf(Process.myPid()));
        if (BK.p) {
            throw new RuntimeException("Illegal child process reuse.");
        }
        BK.p = true;
        V60.a = bk.c;
        ((ContentChildProcessServiceDelegate) bk.a).getClass();
        F50.a = true;
        Thread thread = new Thread(null, new AK(bk), "ChildProcessMain", Process.is64Bit() ? 8388608L : 4194304L);
        bk.i = thread;
        thread.start();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.a.getClass();
        AbstractC4851eH1.d("ChildProcessService", "Destroying ChildProcessService pid=%d", Integer.valueOf(Process.myPid()));
        System.exit(0);
        this.a = null;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        BK bk = this.a;
        if (!bk.m) {
            bk.b.stopSelf();
            bk.f = intent.getBooleanExtra("org.chromium.base.process_launcher.extra.bind_to_caller", false);
            bk.m = true;
            ((ContentChildProcessServiceDelegate) bk.a).getClass();
            b bVar = b.n;
            a aVar = bVar.i;
            Bundle extras = intent.getExtras();
            aVar.getClass();
            aVar.a = extras.getLong("org.chromium.base.android.linker.base_load_address", 0L);
            bVar.k(intent.getExtras().getInt("org.chromium.content.common.child_service_params.library_process_type", 2));
            String stringExtra = intent.getStringExtra("org.chromium.base.process_launcher.extra.browser_package_name");
            if (stringExtra == null) {
                stringExtra = bk.c.getApplicationInfo().packageName;
            }
            new Handler(Looper.getMainLooper()).post(new Runnable(stringExtra) { // from class: xK
                @Override // java.lang.Runnable
                public final void run() {
                    ((ContentChildProcessServiceDelegate) BK.this.a).getClass();
                    b bVar2 = b.n;
                    synchronized (bVar2.j) {
                        if (!bVar2.f) {
                            bVar2.d = true;
                            bVar2.e = false;
                            bVar2.f = true;
                        }
                        if (bVar2.l()) {
                            return;
                        }
                        TraceEvent i = TraceEvent.i("LibraryLoader.preloadAlreadyLocked", null);
                        if (i != null) {
                            i.close();
                        }
                    }
                }
            });
        }
        return bk.o;
    }
}
