package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import java.util.HashMap;
import java.util.concurrent.Callable;
import org.chromium.base.Callback;
import org.chromium.base.task.PostTask;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class Hk4 {
    public final String a;
    public final String b;
    public final QF3 c;
    public N33 d;
    public int e;
    public final HashMap f = new HashMap();

    public Hk4(QF3 qf3, String str, String str2) {
        this.c = qf3;
        this.a = str;
        this.b = str2;
    }

    public final void a(final Context context, final String str, Gk4 gk4) {
        HashMap hashMap = this.f;
        Fk4 fk4 = (Fk4) hashMap.get(str);
        if (fk4 != null) {
            IBinder iBinder = fk4.h;
            if (iBinder == null) {
                fk4.g.add(gk4);
                return;
            } else {
                gk4.a(iBinder);
                return;
            }
        }
        final Fk4 fk42 = new Fk4(this);
        hashMap.put(str, fk42);
        fk42.g.add(gk4);
        c(new Callable() { // from class: zk4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Context context2 = context;
                Fk4 fk43 = fk42;
                Hk4 hk4 = Hk4.this;
                hk4.getClass();
                Intent intent = new Intent();
                String str2 = hk4.a;
                if (str2 != null) {
                    intent.addCategory(str2);
                }
                String str3 = hk4.b;
                if (str3 != null) {
                    intent.setAction(str3);
                }
                intent.setPackage(str);
                try {
                } catch (SecurityException e) {
                    Log.w("WebApkService", "Security exception binding.", e);
                }
                if (context2.bindService(intent, fk43, 1)) {
                    return Boolean.TRUE;
                }
                context2.unbindService(fk43);
                return Boolean.FALSE;
            }
        }, new Callback() { // from class: Ak4
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    return;
                }
                Fk4.this.onServiceConnected(null, null);
            }
        });
    }

    public final void b(final Context context) {
        HashMap hashMap = this.f;
        if (hashMap.isEmpty()) {
            return;
        }
        final Fk4[] fk4Arr = (Fk4[]) hashMap.values().toArray(new Fk4[hashMap.size()]);
        hashMap.clear();
        for (Fk4 fk4 : fk4Arr) {
            fk4.onServiceConnected(null, null);
        }
        c(new Callable() { // from class: Dk4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                for (Fk4 fk42 : fk4Arr) {
                    context.unbindService(fk42);
                }
                return Boolean.TRUE;
            }
        }, new Callback() { // from class: Ek4
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                Hk4 hk4 = Hk4.this;
                if (hk4.f.isEmpty() && hk4.e == 0 && hk4.d != null) {
                    hk4.d = null;
                }
            }
        });
    }

    public final void c(final Callable callable, final Callback callback) {
        this.e++;
        if (this.d == null) {
            this.d = PostTask.a(QF3.h);
        }
        this.d.b(new Runnable() { // from class: Bk4
            @Override // java.lang.Runnable
            public final void run() {
                Callable callable2 = callable;
                final Hk4 hk4 = Hk4.this;
                hk4.getClass();
                final Boolean bool = Boolean.FALSE;
                try {
                    bool = (Boolean) callable2.call();
                } catch (Exception unused) {
                }
                final Callback callback2 = callback;
                PostTask.c(hk4.c, new Runnable() { // from class: Ck4
                    @Override // java.lang.Runnable
                    public final void run() {
                        Hk4 hk42 = Hk4.this;
                        hk42.e--;
                        callback2.onResult(bool);
                    }
                });
            }
        });
    }
}
