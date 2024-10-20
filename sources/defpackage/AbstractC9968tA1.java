package defpackage;

import J.N;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.base.TraceEvent;
import org.chromium.base.task.PostTask;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tA1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9968tA1 {
    public static final AtomicBoolean a = new AtomicBoolean();

    public static void a() {
        N.MOXOasS5();
        final boolean compareAndSet = a.compareAndSet(false, true);
        if (compareAndSet && AX.e().g("log-native-library-residency")) {
            new Thread(new Runnable() { // from class: rA1
                @Override // java.lang.Runnable
                public final void run() {
                    N.MLXZo1U6();
                }
            }).start();
        } else {
            PostTask.c(QF3.k, new Runnable() { // from class: sA1
                @Override // java.lang.Runnable
                public final void run() {
                    int MdFgVRJJ = N.MdFgVRJJ();
                    TraceEvent i = TraceEvent.i("LibraryPrefetcher.asyncPrefetchLibrariesToMemory", Integer.toString(MdFgVRJJ));
                    boolean z = compareAndSet;
                    if (z && MdFgVRJJ < 90) {
                        try {
                            N.MUjpxN8d();
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
                    if (MdFgVRJJ != -1) {
                        EI2.l(MdFgVRJJ, "LibraryLoader.PercentageOfResidentCodeBeforePrefetch".concat(z ? ".ColdStartup" : ".WarmStartup"));
                    }
                    if (i != null) {
                        i.close();
                    }
                    T60.a.edit().remove("dont_prefetch_libraries").apply();
                }
            });
        }
    }
}
