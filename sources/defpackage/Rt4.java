package defpackage;

import android.content.Context;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Rt4 implements InterfaceC11942yv4 {
    public final Context a;
    public final C3701av4 b;
    public final Yt4 c;
    public final Executor d;

    public Rt4(Context context, ThreadPoolExecutor threadPoolExecutor, Yt4 yt4, C3701av4 c3701av4) {
        this.a = context;
        this.b = c3701av4;
        this.c = yt4;
        this.d = threadPoolExecutor;
    }

    public final void a(List list, InterfaceC7481lv4 interfaceC7481lv4) {
        if (!(C8771ph3.d.get() != null)) {
            throw new IllegalStateException("Ingestion should only be called in SplitCompat mode.");
        }
        this.d.execute(new Ot4(this, list, interfaceC7481lv4));
    }
}
