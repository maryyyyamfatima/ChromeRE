package defpackage;

import java.util.concurrent.ThreadFactory;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Z32 extends AbstractC10422uW2 {
    public static final OR2 c = new OR2("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())), false);
    public final ThreadFactory b = c;

    @Override // defpackage.AbstractC10422uW2
    public final AbstractC10079tW2 b() {
        return new C3407a42(this.b);
    }
}
