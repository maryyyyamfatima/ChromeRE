package defpackage;

import J.N;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.List;
import org.chromium.base.TraceEvent;
import org.chromium.base.library_loader.a;
import org.chromium.base.library_loader.b;
import org.chromium.base.process_launcher.FileDescriptorInfo;
import org.chromium.content.browser.ChildProcessLauncherHelperImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hK, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5896hK {
    public final Handler a;
    public final AbstractC5552gK b;
    public final String[] c;
    public final FileDescriptorInfo[] d;
    public final AbstractC11726yJ e;
    public final List f;
    public VJ g;

    public C5896hK(Handler handler, C8645pK c8645pK, String[] strArr, FileDescriptorInfo[] fileDescriptorInfoArr, AbstractC11726yJ abstractC11726yJ, List list) {
        this.a = handler;
        handler.getLooper();
        Looper.myLooper();
        this.c = strArr;
        this.e = abstractC11726yJ;
        this.b = c8645pK;
        this.d = fileDescriptorInfoArr;
        this.f = list;
    }

    public final boolean a(final UJ uj, final boolean z, final boolean z2) {
        Runnable runnable;
        Bundle bundle = new Bundle();
        ((C8645pK) this.b).getClass();
        boolean z3 = ChildProcessLauncherHelperImpl.m;
        bundle.putBoolean("org.chromium.base.process_launcher.extra.bind_to_caller", false);
        a aVar = b.n.i;
        aVar.b();
        aVar.d(bundle);
        Context context = V60.a;
        AbstractC11726yJ abstractC11726yJ = this.e;
        abstractC11726yJ.getClass();
        VJ c = abstractC11726yJ.c(context, bundle, new C10011tJ(abstractC11726yJ, uj));
        this.g = c;
        if (c != null) {
            if (!z) {
                return true;
            }
            b();
            return true;
        }
        if (!z2) {
            return false;
        }
        Runnable runnable2 = new Runnable() { // from class: bK
            @Override // java.lang.Runnable
            public final void run() {
                C5896hK.this.a(uj, z, z2);
            }
        };
        ArrayDeque arrayDeque = abstractC11726yJ.b;
        boolean isEmpty = arrayDeque.isEmpty();
        arrayDeque.add(runnable2);
        if (isEmpty && (runnable = abstractC11726yJ.a) != null) {
            runnable.run();
        }
        return false;
    }

    public final void b() {
        C4864eK c4864eK = new C4864eK(this);
        C5208fK c5208fK = new C5208fK(this);
        Bundle bundle = new Bundle();
        bundle.putStringArray("org.chromium.base.process_launcher.extra.command_line", this.c);
        bundle.putParcelableArray("org.chromium.base.process_launcher.extra.extraFiles", this.d);
        ((C8645pK) this.b).getClass();
        bundle.putInt("com.google.android.apps.chrome.extra.cpu_count", N.MOiBJ1qS());
        bundle.putLong("com.google.android.apps.chrome.extra.cpu_features", N.ML0T8q1U());
        if (ChildProcessLauncherHelperImpl.x != null) {
            bundle.putAll(ChildProcessLauncherHelperImpl.x);
        } else {
            b.n.i.e(bundle);
        }
        VJ vj = this.g;
        List list = this.f;
        if (vj.n) {
            AbstractC4851eH1.f("ChildProcessConn", "Tried to setup a connection that already disconnected.", new Object[0]);
            c5208fK.a();
            return;
        }
        TraceEvent i = TraceEvent.i("ChildProcessConnection.setupConnection", null);
        try {
            vj.i = c5208fK;
            vj.j = c4864eK;
            vj.h = new TJ(bundle, list);
            if (vj.m) {
                vj.d();
            }
            if (i != null) {
                i.close();
            }
        } catch (Throwable th) {
            if (i != null) {
                try {
                    i.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }

    public final void c(boolean z, boolean z2) {
        try {
            TraceEvent.b("ChildProcessLauncher.start", null);
            C4521dK c4521dK = new C4521dK(this, z, z2);
            VJ a = this.b.a(this.e, c4521dK);
            this.g = a;
            if (a != null) {
                b();
            } else if (a(c4521dK, z, z2) || z2) {
            }
        } finally {
            TraceEvent.c("ChildProcessLauncher.start");
        }
    }
}
