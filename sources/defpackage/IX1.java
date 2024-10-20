package defpackage;

import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final /* synthetic */ class IX1 implements InterfaceC3299Zk {
    public final /* synthetic */ C3954bg3 a;

    public /* synthetic */ IX1(C3954bg3 c3954bg3) {
        this.a = c3954bg3;
    }

    @Override // defpackage.InterfaceC3299Zk
    public final RD1 apply(Object obj) {
        final C4641dg3 c4641dg3 = (C4641dg3) obj;
        final C3954bg3 c3954bg3 = this.a;
        c3954bg3.getClass();
        Callable callable = new Callable() { // from class: Zf3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C4641dg3 c4641dg32 = c4641dg3;
                C3954bg3 c3954bg32 = C3954bg3.this;
                c3954bg32.getClass();
                C4381cu3 c4381cu3 = new C4381cu3();
                try {
                    C3694au3 c3694au3 = (C3694au3) c3954bg32.a.e.get();
                    Uri uri = c3954bg32.b;
                    C4364cr4 c4364cr4 = new C4364cr4(c4641dg32);
                    c4364cr4.b = new C4381cu3[]{c4381cu3};
                    c4364cr4.a(c3694au3.a(uri));
                    return null;
                } catch (IOException | RuntimeException e) {
                    Log.w("SnapshotHandler", "Failed to update snapshot for " + c3954bg32.c + " flags may be stale.", e);
                    return null;
                }
            }
        };
        Executor a = c3954bg3.a.a();
        RunnableFutureC9399rX3 runnableFutureC9399rX3 = new RunnableFutureC9399rX3(callable);
        ((QY1) a).execute(runnableFutureC9399rX3);
        return runnableFutureC9399rX3;
    }
}
