package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Jt4 {
    public static final HashMap l = new HashMap();
    public final Context a;
    public final C9187qt4 b;
    public final String c;
    public final ArrayList d;
    public boolean e;
    public final Intent f;
    public final At4 g;
    public final WeakReference h;
    public final C10558ut4 i;
    public Ht4 j;
    public IInterface k;

    /* JADX WARN: Type inference failed for: r1v1, types: [ut4] */
    public Jt4(Context context, C9187qt4 c9187qt4, Intent intent) {
        C6437it4 c6437it4 = C6437it4.a;
        this.d = new ArrayList();
        this.i = new IBinder.DeathRecipient(this) { // from class: ut4
            public final Jt4 a;

            {
                this.a = this;
            }

            @Override // android.os.IBinder.DeathRecipient
            public final void binderDied() {
                Jt4 jt4 = this.a;
                C9187qt4 c9187qt42 = jt4.b;
                c9187qt42.b(4, "reportBinderDeath", new Object[0]);
                X5.a(jt4.h.get());
                String str = jt4.c;
                c9187qt42.b(4, "%s : Binder has died.", new Object[]{str});
                ArrayList arrayList = jt4.d;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    AbstractRunnableC9872st4 abstractRunnableC9872st4 = (AbstractRunnableC9872st4) it.next();
                    RemoteException remoteException = new RemoteException(String.valueOf(str).concat(" : Binder has died."));
                    Vv4 vv4 = abstractRunnableC9872st4.a;
                    if (vv4 != null) {
                        vv4.a(remoteException);
                    }
                }
                arrayList.clear();
            }
        };
        this.a = context;
        this.b = c9187qt4;
        this.c = "SplitInstallService";
        this.f = intent;
        this.g = c6437it4;
        this.h = new WeakReference(null);
    }

    public final void a() {
        b(new C11587xt4(this));
    }

    public final void b(AbstractRunnableC9872st4 abstractRunnableC9872st4) {
        Handler handler;
        HashMap hashMap = l;
        synchronized (hashMap) {
            if (!hashMap.containsKey(this.c)) {
                HandlerThread handlerThread = new HandlerThread(this.c, 10);
                handlerThread.start();
                hashMap.put(this.c, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) hashMap.get(this.c);
        }
        handler.post(abstractRunnableC9872st4);
    }
}
