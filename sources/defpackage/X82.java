package defpackage;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class X82 implements InterfaceC7353la2 {
    public abstract void i(InterfaceC11128wa2 interfaceC11128wa2);

    public static C4811e92 f(ArrayList arrayList, DV0 dv0) {
        int i = BQ0.a;
        Q82.b(i, "bufferSize");
        return new C4811e92(arrayList, dv0, i << 1);
    }

    public static L92 h(long j, long j2, TimeUnit timeUnit, AbstractC10422uW2 abstractC10422uW2) {
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        }
        if (abstractC10422uW2 == null) {
            throw new NullPointerException("scheduler is null");
        }
        return new L92(Math.max(0L, j), Math.max(0L, j2), timeUnit, abstractC10422uW2);
    }

    public final C8935q92 g(Object obj) {
        if (obj == null) {
            throw new NullPointerException("defaultItem is null");
        }
        return new C8935q92(this, obj);
    }

    @Override // defpackage.InterfaceC7353la2
    public final void a(InterfaceC11128wa2 interfaceC11128wa2) {
        if (interfaceC11128wa2 == null) {
            throw new NullPointerException("observer is null");
        }
        try {
            i(interfaceC11128wa2);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            AbstractC4148cE0.a(th);
            MR2.b(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }
}
