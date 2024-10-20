package defpackage;

import android.os.Environment;
import android.os.StatFs;
import java.io.File;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Yk */
/* loaded from: classes.dex */
public final class C3169Yk extends AbstractC0185Bl {
    public final Runnable h;
    public final /* synthetic */ C8849pu3 i;

    public C3169Yk(C8849pu3 c8849pu3, AbstractRunnableC9679sL0 abstractRunnableC9679sL0) {
        this.i = c8849pu3;
        this.h = abstractRunnableC9679sL0;
    }

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        this.i.getClass();
        File dataDirectory = Environment.getDataDirectory();
        if (dataDirectory.exists()) {
            return new StatFs(dataDirectory.getPath());
        }
        return null;
    }

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        this.h.run();
    }
}
