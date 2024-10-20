package defpackage;

import J.N;
import java.util.Iterator;
import org.chromium.net.NetworkChangeNotifier;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class F22 implements T22 {
    public final /* synthetic */ NetworkChangeNotifier a;

    public F22(NetworkChangeNotifier networkChangeNotifier) {
        this.a = networkChangeNotifier;
    }

    @Override // defpackage.T22
    public final void a(int i) {
        this.a.c(i);
    }

    @Override // defpackage.T22
    public final void e(int i) {
        this.a.d(i);
    }

    @Override // defpackage.T22
    public final void d(int i, long j) {
        this.a.f(i, j);
    }

    @Override // defpackage.T22
    public final void b(int i) {
        NetworkChangeNotifier networkChangeNotifier = this.a;
        networkChangeNotifier.d = i;
        networkChangeNotifier.e(i, networkChangeNotifier.getCurrentDefaultNetId());
    }

    @Override // defpackage.T22
    public final void c(long j) {
        NetworkChangeNotifier networkChangeNotifier = this.a;
        Iterator it = networkChangeNotifier.a.iterator();
        while (it.hasNext()) {
            N.MiJIMrTb(((Long) it.next()).longValue(), networkChangeNotifier, j);
        }
    }

    @Override // defpackage.T22
    public final void g(long j) {
        NetworkChangeNotifier networkChangeNotifier = this.a;
        Iterator it = networkChangeNotifier.a.iterator();
        while (it.hasNext()) {
            N.MDpuHJTB(((Long) it.next()).longValue(), networkChangeNotifier, j);
        }
    }

    @Override // defpackage.T22
    public final void f(long[] jArr) {
        NetworkChangeNotifier networkChangeNotifier = this.a;
        Iterator it = networkChangeNotifier.a.iterator();
        while (it.hasNext()) {
            N.MpF$179U(((Long) it.next()).longValue(), networkChangeNotifier, jArr);
        }
    }
}
