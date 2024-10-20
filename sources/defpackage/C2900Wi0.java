package defpackage;

import J.N;
import android.os.IBinder;
import org.chromium.base.PathUtils;
import org.chromium.base.library_loader.b;
import org.chromium.base.task.PostTask;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Wi0 */
/* loaded from: classes.dex */
public class C2900Wi0 extends AbstractC1598Mh3 {
    public final BinderC1981Pg1 b = new BinderC1981Pg1();

    @Override // defpackage.AbstractC1598Mh3
    public final void b() {
        AbstractC4851eH1.d("DecoderService", "Decoder service process started", new Object[0]);
        if (!(AX.a.get() != null)) {
            AX.h(null);
        }
        PostTask.f(AbstractC5103f04.a, new Runnable() { // from class: Vi0
            @Override // java.lang.Runnable
            public final void run() {
                PathUtils.c();
            }
        });
        b.n.a();
        BinderC1981Pg1 binderC1981Pg1 = this.b;
        binderC1981Pg1.getClass();
        N.Mw4AD5hY();
        binderC1981Pg1.a = true;
        AbstractC4851eH1.d("DecoderService", "Decoder service process initialized", new Object[0]);
    }

    @Override // defpackage.AbstractC1598Mh3
    public final IBinder a() {
        AbstractC4851eH1.d("DecoderService", "Decoder process binding", new Object[0]);
        return this.b;
    }
}
