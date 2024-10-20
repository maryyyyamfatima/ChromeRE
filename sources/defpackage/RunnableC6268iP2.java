package defpackage;

import com.google.android.libraries.elements.interfaces.ResourceLoader;
import com.google.android.libraries.elements.interfaces.ResourcePreloader;
import io.grpc.Status;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iP2 */
/* loaded from: classes.dex */
public final class RunnableC6268iP2 implements Runnable {
    public final /* synthetic */ C7298lP2 a;

    public RunnableC6268iP2(C7298lP2 c7298lP2) {
        this.a = c7298lP2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ResourcePreloader preloader = ((ResourceLoader) this.a.a.get()).getPreloader();
        AbstractC0087Ar1.b(preloader);
        Status loadAll = preloader.loadAll();
        Status.Code code = loadAll.getCode();
        if ((code == null ? -1 : AbstractC5924hP2.a[code.ordinal()]) != 1) {
            AbstractC6690je3.b(C7298lP2.d.f(), "com/google/android/libraries/search/rendering/xuikit/elements/ResourceLoaderEmlParcelProcessor$process$1$1", "run", 80, "").o(loadAll, "loadAll() failed: %s");
        } else {
            AbstractC6690je3.a(C7298lP2.d.b(), "loadAll() succeeded", "com/google/android/libraries/search/rendering/xuikit/elements/ResourceLoaderEmlParcelProcessor$process$1$1", "run", 79, "");
        }
    }
}
