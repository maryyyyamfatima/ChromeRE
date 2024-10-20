package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class Fk4 implements ServiceConnection {
    public final Hk4 a;
    public final ArrayList g = new ArrayList();
    public IBinder h;

    public Fk4(Hk4 hk4) {
        this.a = hk4;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.h = null;
        String packageName = componentName.getPackageName();
        Hk4 hk4 = this.a;
        HashMap hashMap = hk4.f;
        hashMap.remove(packageName);
        if (hashMap.isEmpty() && hk4.e == 0 && hk4.d != null) {
            hk4.d = null;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.h = iBinder;
        String.format("Got IBinder Service: %s", iBinder);
        ArrayList arrayList = this.g;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Gk4) it.next()).a(this.h);
        }
        arrayList.clear();
    }
}
