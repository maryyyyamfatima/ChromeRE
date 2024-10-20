package defpackage;

import android.os.SystemClock;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Locale;
import org.chromium.base.Callback;
import org.chromium.base.task.PostTask;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class SM0 implements InterfaceC7805ms2 {
    public static final DM0 d = new DM0();
    public boolean b;
    public final LinkedList c = new LinkedList();
    public final N33 a = PostTask.a(QF3.l);

    @Override // defpackage.InterfaceC7805ms2
    public final void e(String str, ArrayList arrayList) {
    }

    @Override // defpackage.InterfaceC7805ms2
    public void f(int i, String str, C4025bs2 c4025bs2) {
        g(i, str, c4025bs2, d);
    }

    @Override // defpackage.InterfaceC7805ms2
    public void g(int i, String str, C4025bs2 c4025bs2, Callback callback) {
        QM0 qm0 = new QM0(this, i, str, c4025bs2, callback);
        LinkedList linkedList = this.c;
        linkedList.remove(qm0);
        linkedList.add(qm0);
        k();
    }

    @Override // defpackage.InterfaceC7805ms2
    public void b(int i, String str, C2687Ur2 c2687Ur2) {
        h(new NM0(this, i, str, c2687Ur2));
    }

    @Override // defpackage.InterfaceC7805ms2
    public void d(int i, String str, C3809bF c3809bF) {
        C1436Lb0 c1436Lb0 = C1695Nb0.B;
        h(new KM0(this, i, str, c3809bF));
    }

    @Override // defpackage.InterfaceC7805ms2
    public final void a(int i, String str) {
        h(new HM0(this, i, str));
    }

    public final void h(RM0 rm0) {
        this.c.add(rm0);
        k();
    }

    public static File i(int i, String str) {
        return new File(EM0.a, String.format(Locale.ENGLISH, "%d%s", Integer.valueOf(i), str));
    }

    @Override // defpackage.InterfaceC7805ms2
    public InterfaceC7461ls2 c(int i, String str) {
        C1436Lb0 c1436Lb0 = C1695Nb0.B;
        i(i, str);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ByteBuffer c = new NM0(this, i, str, null).c();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        C6844k43 a = C1436Lb0.a(c);
        long elapsedRealtime3 = SystemClock.elapsedRealtime();
        if (c != null && c.limit() > 0) {
            EI2.n(elapsedRealtime3 - elapsedRealtime, "Tabs.PersistedTabData.Storage.LoadAndMapTime.File");
            EI2.n(elapsedRealtime3 - elapsedRealtime2, "Tabs.PersistedTabData.Storage.MapTime.File");
        }
        return a;
    }

    public final void k() {
        LinkedList linkedList = this.c;
        if (linkedList.isEmpty()) {
            return;
        }
        RM0 rm0 = (RM0) linkedList.poll();
        if (!this.b) {
            EI2.h(rm0.b(), 3, "Tabs.PersistedTabData.Storage.Save.File.FirstStorageRequestType");
            this.b = true;
        }
        rm0.a().d(this.a);
    }

    public static Boolean j(int i) {
        C7432ln3 c = C7432ln3.c();
        try {
            if (i(i, EnumC6773js2.a(C1695Nb0.class, false).a).exists()) {
                Boolean bool = Boolean.FALSE;
                c.close();
                return bool;
            }
            if (!i(i, EnumC6773js2.a(C1695Nb0.class, true).a).exists()) {
                c.close();
                return null;
            }
            Boolean bool2 = Boolean.TRUE;
            c.close();
            return bool2;
        } catch (Throwable th) {
            try {
                c.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }
}
