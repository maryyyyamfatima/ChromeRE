package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Dt4 extends AbstractRunnableC9872st4 {
    public final /* synthetic */ IBinder g;
    public final /* synthetic */ Ht4 h;

    public Dt4(Ht4 ht4, IBinder iBinder) {
        this.h = ht4;
        this.g = iBinder;
    }

    @Override // defpackage.AbstractRunnableC9872st4
    public final void a() {
        Gu4 du4;
        Ht4 ht4 = this.h;
        Jt4 jt4 = ht4.a;
        ((C6437it4) jt4.g).getClass();
        int i = Fu4.a;
        IBinder iBinder = this.g;
        if (iBinder == null) {
            du4 = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
            du4 = queryLocalInterface instanceof Gu4 ? (Gu4) queryLocalInterface : new Du4(iBinder);
        }
        jt4.k = du4;
        Jt4 jt42 = ht4.a;
        jt42.b.b(4, "linkToDeath", new Object[0]);
        try {
            jt42.k.asBinder().linkToDeath(jt42.i, 0);
        } catch (RemoteException e) {
            jt42.b.a("linkToDeath failed", e, new Object[0]);
        }
        jt42.e = false;
        Iterator it = jt42.d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        jt42.d.clear();
    }
}
