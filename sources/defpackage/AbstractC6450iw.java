package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iw, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6450iw {
    public QH a;
    public final HE b;
    public C1560Ma0 c;
    public final ArrayList e = new ArrayList();
    public final C6108hw d = new C6108hw(this);

    public abstract void a(QH qh);

    public AbstractC6450iw(HE he) {
        this.b = he;
    }

    public final KM2 e() {
        if (g()) {
            return this.a.h;
        }
        return null;
    }

    public static void c() {
        VH.a().c.b(true);
        VH.a().d(null);
    }

    public final ArrayList d() {
        ArrayList arrayList = new ArrayList();
        QH qh = this.a;
        if (qh != null && qh.b()) {
            CastDevice castDevice = this.a.i;
            if (castDevice.u1(8)) {
                arrayList.add("audio_in");
            }
            if (castDevice.u1(4)) {
                arrayList.add("audio_out");
            }
            if (castDevice.u1(2)) {
                arrayList.add("video_in");
            }
            if (castDevice.u1(1)) {
                arrayList.add("video_out");
            }
        }
        return arrayList;
    }

    public final boolean g() {
        QH qh = this.a;
        return qh != null && qh.b();
    }

    public void b() {
        C6108hw c6108hw;
        QH qh = this.a;
        if (qh == null) {
            return;
        }
        KM2 km2 = qh.h;
        if (km2 != null && (c6108hw = this.d) != null) {
            km2.i.remove(c6108hw);
        }
        this.a = null;
    }

    public final String f() {
        InterfaceC9785sf1 interfaceC9785sf1;
        if (g() && (interfaceC9785sf1 = this.a.a) != null) {
            try {
                C9100qf1 c9100qf1 = (C9100qf1) interfaceC9785sf1;
                Parcel e = c9100qf1.e(3, c9100qf1.a());
                String readString = e.readString();
                e.recycle();
                return readString;
            } catch (RemoteException unused) {
                E43.b.b("Unable to call %s on %s.", "getSessionId", InterfaceC9785sf1.class.getSimpleName());
            }
        }
        return null;
    }

    public void h() {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((InterfaceC5764gw) it.next()).S();
        }
    }

    public void i() {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((InterfaceC5764gw) it.next()).p();
        }
    }

    public void j() {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((InterfaceC5764gw) it.next()).G();
        }
    }
}
