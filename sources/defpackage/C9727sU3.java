package defpackage;

import J.N;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import org.chromium.base.Callback;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.tracing.settings.TracingSettings;
import org.chromium.content.browser.TracingControllerAndroidImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sU3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9727sU3 {
    public static C9727sU3 f;
    public TracingControllerAndroidImpl a;
    public final C12157za2 b = new C12157za2();
    public int c = 0;
    public HashSet d;
    public File e;

    public C9727sU3() {
        PostTask.c(QF3.h, new Runnable() { // from class: jU3
            @Override // java.lang.Runnable
            public final void run() {
                File[] listFiles = new File(V60.a.getCacheDir() + "/traces").listFiles();
                if (listFiles != null) {
                    long currentTimeMillis = System.currentTimeMillis() - 3600000;
                    for (File file : listFiles) {
                        if (file.lastModified() <= currentTimeMillis) {
                            file.delete();
                        }
                    }
                }
            }
        });
    }

    public static C9727sU3 a() {
        if (f == null) {
            final C9727sU3 c9727sU3 = new C9727sU3();
            f = c9727sU3;
            TracingControllerAndroidImpl tracingControllerAndroidImpl = new TracingControllerAndroidImpl(V60.a);
            c9727sU3.a = tracingControllerAndroidImpl;
            Callback callback = new Callback() { // from class: kU3
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    C9727sU3 c9727sU32 = C9727sU3.this;
                    c9727sU32.getClass();
                    c9727sU32.d = new HashSet(Arrays.asList((String[]) obj));
                    c9727sU32.b(1);
                }
            };
            if (tracingControllerAndroidImpl.i == 0) {
                tracingControllerAndroidImpl.i = N.MWlLnA$6(tracingControllerAndroidImpl);
            }
            N.MdRNuqnW(tracingControllerAndroidImpl.i, tracingControllerAndroidImpl, callback);
        }
        return f;
    }

    public final void b(int i) {
        this.c = i;
        if (i == 1) {
            new C6861k72(V60.a).b(100, "tracing_status");
            AbstractC10756vU3.a = null;
            File file = this.e;
            if (file != null) {
                PostTask.c(QF3.h, new RunnableC9384rU3(file));
                this.e = null;
            }
            TracingControllerAndroidImpl tracingControllerAndroidImpl = this.a;
            long j = tracingControllerAndroidImpl.i;
            if (j != 0) {
                N.MLYQdwUF(j, tracingControllerAndroidImpl);
                tracingControllerAndroidImpl.i = 0L;
            }
            this.a = null;
        }
        Iterator it = this.b.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((TracingSettings) ((InterfaceC9042qU3) c11814ya2.next())).U0();
            }
        }
    }
}
