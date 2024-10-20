package defpackage;

import org.chromium.base.Callback;
import org.chromium.base.task.PostTask;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class G83 implements Callback {
    public int a;
    public Callback g;

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        final Integer num = (Integer) obj;
        if (this.g == null) {
            return;
        }
        if (num.intValue() == 0) {
            int i = this.a - 1;
            this.a = i;
            if (i > 0) {
                return;
            }
        }
        final Callback callback = this.g;
        this.g = null;
        PostTask.c(AbstractC5103f04.a, new Runnable() { // from class: F83
            @Override // java.lang.Runnable
            public final void run() {
                Callback.this.onResult(Boolean.valueOf(num.intValue() == 0));
            }
        });
    }

    public G83(C8238o73 c8238o73, int i) {
        this.a = i;
        this.g = c8238o73;
    }

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }
}
