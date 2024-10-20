package defpackage;

import android.graphics.drawable.ColorDrawable;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class AI3 extends AbstractC6726jk3 {

    @SY(type = 13)
    Integer a;

    @SY(type = 13)
    AtomicReference b;

    @SY(type = 13)
    AtomicReference c;

    @Override // defpackage.AbstractC6726jk3
    public final void a(C6383ik3 c6383ik3) {
        Object[] objArr = c6383ik3.b;
        if (c6383ik3.a != 0) {
            return;
        }
        Integer num = this.a;
        ColorDrawable colorDrawable = NI3.a;
        this.a = Integer.valueOf(num.intValue() + 1);
    }
}
