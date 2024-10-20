package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class H30 implements ServiceConnection {
    public final Runnable a;
    public final G30 g;
    public int h;
    public C7688mY3 i;
    public final ArrayList j;
    public Exception k;

    public H30(RunnableC8032nY3 runnableC8032nY3) {
        G30 g30 = new G30();
        this.h = 0;
        this.j = new ArrayList();
        this.a = runnableC8032nY3;
        this.g = g30;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC1457Lf1 c1067If1;
        this.g.getClass();
        int i = AbstractBinderC1197Jf1.a;
        if (iBinder == null) {
            c1067If1 = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.trusted.ITrustedWebActivityService");
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC1457Lf1)) {
                c1067If1 = (InterfaceC1457Lf1) queryLocalInterface;
            } else {
                c1067If1 = new C1067If1(iBinder);
            }
        }
        this.i = new C7688mY3(c1067If1, componentName);
        ArrayList arrayList = this.j;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C6215iF) it.next()).a(this.i);
        }
        arrayList.clear();
        this.h = 1;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.i = null;
        this.a.run();
        this.h = 2;
    }
}
