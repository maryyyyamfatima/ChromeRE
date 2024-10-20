package defpackage;

import java.nio.ByteBuffer;
import org.chromium.base.task.PostTask;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class MM0 extends AbstractC0185Bl {
    public final /* synthetic */ NM0 h;

    public MM0(NM0 nm0) {
        this.h = nm0;
    }

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        final ByteBuffer byteBuffer = (ByteBuffer) obj;
        PostTask.d(AbstractC5103f04.a, new Runnable() { // from class: LM0
            @Override // java.lang.Runnable
            public final void run() {
                MM0.this.h.d.onResult(byteBuffer);
            }
        });
        this.h.e.k();
    }

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        return this.h.c();
    }
}
