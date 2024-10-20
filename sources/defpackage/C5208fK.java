package defpackage;

import J.N;
import java.io.IOException;
import java.util.ArrayList;
import org.chromium.base.process_launcher.FileDescriptorInfo;
import org.chromium.content.browser.ChildProcessLauncherHelperImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fK */
/* loaded from: classes.dex */
public final class C5208fK {
    public final /* synthetic */ C5896hK a;

    public C5208fK(C5896hK c5896hK) {
        this.a = c5896hK;
    }

    public final void a() {
        C5896hK c5896hK = this.a;
        VJ vj = c5896hK.g;
        int i = vj.o;
        C8645pK c8645pK = (C8645pK) c5896hK.b;
        c8645pK.getClass();
        int i2 = vj.o;
        ChildProcessLauncherHelperImpl childProcessLauncherHelperImpl = c8645pK.a;
        if (i2 > 0) {
            ChildProcessLauncherHelperImpl.r.put(Integer.valueOf(i2), childProcessLauncherHelperImpl);
            C11045wK c11045wK = childProcessLauncherHelperImpl.a;
            if (c11045wK != null) {
                ArrayList arrayList = c11045wK.h;
                int i3 = c11045wK.g;
                if (i3 != -1 && arrayList.size() >= i3) {
                    throw new RuntimeException("mRankings.size:" + arrayList.size() + " mMaxSize:" + i3);
                }
                arrayList.add(new C10016tK(vj));
                c11045wK.d(arrayList.size() - 1);
                ComponentCallbacks2C2974Wx componentCallbacks2C2974Wx = childProcessLauncherHelperImpl.b;
                if (componentCallbacks2C2974Wx != null) {
                    componentCallbacks2C2974Wx.b();
                }
            }
            if (childProcessLauncherHelperImpl.c) {
                C3490aK.a().c.add(vj);
            }
        }
        long j = childProcessLauncherHelperImpl.g;
        if (j != 0) {
            N.MXR$KaDS(j, vj.o);
        }
        childProcessLauncherHelperImpl.g = 0L;
        try {
            for (FileDescriptorInfo fileDescriptorInfo : c5896hK.d) {
                fileDescriptorInfo.g.close();
            }
        } catch (IOException e) {
            AbstractC4851eH1.f("ChildProcLauncher", "Failed to close FD.", e);
        }
    }
}
