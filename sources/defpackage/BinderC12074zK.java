package defpackage;

import J.N;
import android.content.pm.ApplicationInfo;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import android.text.TextUtils;
import java.util.List;
import org.chromium.base.ThreadUtils;
import org.chromium.base.library_loader.a;
import org.chromium.base.library_loader.b;
import org.chromium.base.process_launcher.FileDescriptorInfo;
import org.chromium.content.app.ContentChildProcessServiceDelegate;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zK, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC12074zK extends AbstractBinderC2341Sa1 {
    public final /* synthetic */ BK g;

    @Override // defpackage.InterfaceC2471Ta1
    public final ApplicationInfo b0() {
        return this.g.c.getApplicationInfo();
    }

    @Override // defpackage.InterfaceC2471Ta1
    public final void n(Bundle bundle) {
        ((ContentChildProcessServiceDelegate) this.g.a).getClass();
        b.n.i.f(bundle);
    }

    public BinderC12074zK(BK bk) {
        this.g = bk;
    }

    @Override // defpackage.InterfaceC2471Ta1
    public final boolean y0(String str) {
        synchronized (this.g.d) {
            int callingPid = Binder.getCallingPid();
            BK bk = this.g;
            int i = bk.g;
            if (i == 0 && bk.h == null) {
                bk.g = callingPid;
                bk.h = str;
            } else {
                if (i != callingPid) {
                    AbstractC4851eH1.a("ChildProcessService", "Service is already bound by pid %d, cannot bind for pid %d", Integer.valueOf(i), Integer.valueOf(callingPid));
                    return false;
                }
                if (!TextUtils.equals(bk.h, str)) {
                    AbstractC4851eH1.f("ChildProcessService", "Service is already bound by %s, cannot bind for %s", this.g.h, str);
                    return false;
                }
            }
            return true;
        }
    }

    @Override // defpackage.InterfaceC2471Ta1
    public final void r0(Bundle bundle, InterfaceC0542Ee1 interfaceC0542Ee1, List list) {
        boolean z;
        long j;
        Bundle bundle2;
        int i;
        synchronized (this.g.d) {
            BK bk = this.g;
            if (bk.f && bk.g == 0) {
                AbstractC4851eH1.a("ChildProcessService", "Service has not been bound with bindToCaller()", new Object[0]);
                interfaceC0542Ee1.h0(-1, 0, 0L, null);
                return;
            }
            int myPid = Process.myPid();
            b bVar = b.n;
            synchronized (bVar.j) {
                z = bVar.l;
            }
            if (z) {
                int i2 = BK.q;
                long j2 = BK.r;
                a aVar = bVar.i;
                aVar.c();
                Bundle bundle3 = new Bundle();
                aVar.e(bundle3);
                bundle2 = bundle3;
                j = j2;
                i = i2;
            } else {
                j = -1;
                bundle2 = null;
                i = 0;
            }
            interfaceC0542Ee1.h0(myPid, i, j, bundle2);
            BK bk2 = this.g;
            bk2.n = interfaceC0542Ee1;
            bundle.setClassLoader(bk2.c.getClassLoader());
            synchronized (bk2.i) {
                if (bk2.j == null) {
                    bk2.j = bundle.getStringArray("org.chromium.base.process_launcher.extra.command_line");
                    bk2.i.notifyAll();
                }
                Parcelable[] parcelableArray = bundle.getParcelableArray("org.chromium.base.process_launcher.extra.extraFiles");
                if (parcelableArray != null) {
                    FileDescriptorInfo[] fileDescriptorInfoArr = new FileDescriptorInfo[parcelableArray.length];
                    bk2.k = fileDescriptorInfoArr;
                    System.arraycopy(parcelableArray, 0, fileDescriptorInfoArr, 0, parcelableArray.length);
                }
                ((ContentChildProcessServiceDelegate) bk2.a).b(bundle, list);
                bk2.i.notifyAll();
            }
        }
    }

    @Override // defpackage.InterfaceC2471Ta1
    public final void X0() {
        Process.killProcess(Process.myPid());
    }

    @Override // defpackage.InterfaceC2471Ta1
    public final void W0(final int i) {
        ThreadUtils.d(new Runnable() { // from class: yK
            @Override // java.lang.Runnable
            public final void run() {
                C10058tS1 c10058tS1 = C10058tS1.h;
                c10058tS1.getClass();
                Object obj = ThreadUtils.a;
                int i2 = c10058tS1.a;
                int i3 = i;
                if (i3 >= i2) {
                    c10058tS1.a(i3);
                }
            }
        });
    }

    @Override // defpackage.InterfaceC2471Ta1
    public final void q0() {
        synchronized (this.g.e) {
            if (!this.g.l) {
                AbstractC4851eH1.a("ChildProcessService", "Cannot dump process stack before native is loaded", new Object[0]);
            } else {
                N.M6Y7Jzgj();
            }
        }
    }
}
