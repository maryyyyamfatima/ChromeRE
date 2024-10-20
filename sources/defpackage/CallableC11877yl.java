package defpackage;

import android.os.Binder;
import java.util.concurrent.Callable;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC11877yl implements Callable {
    public final /* synthetic */ AbstractC0185Bl a;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        AbstractC0185Bl abstractC0185Bl = this.a;
        abstractC0185Bl.d.set(true);
        Object obj = null;
        try {
            obj = abstractC0185Bl.b();
            Binder.flushPendingCommands();
            return obj;
        } finally {
        }
    }

    public CallableC11877yl(AbstractC0185Bl abstractC0185Bl) {
        this.a = abstractC0185Bl;
    }
}
