package defpackage;

import android.os.Looper;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import java.util.concurrent.TimeUnit;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gl0 */
/* loaded from: classes.dex */
public final class C5699gl0 implements InterfaceC9395rX {
    public final InterfaceC3241Yy1 a;
    public final AbstractC10422uW2 b;

    @Override // defpackage.InterfaceC9395rX
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.InterfaceC9395rX
    public final VY c(Object obj, AbstractC9053qX abstractC9053qX) {
        VY vy;
        C6043hl0 c6043hl0 = (C6043hl0) obj;
        if ((c6043hl0.j & 2) != 0) {
            InterfaceC9738sX interfaceC9738sX = (InterfaceC9738sX) this.a.get();
            CommandOuterClass$Command commandOuterClass$Command = c6043hl0.l;
            if (commandOuterClass$Command == null) {
                commandOuterClass$Command = CommandOuterClass$Command.l;
            }
            vy = ((C10081tX) interfaceC9738sX).a(commandOuterClass$Command, abstractC9053qX, 1);
        } else {
            vy = C5971hZ.a;
        }
        float f = c6043hl0.k;
        if (f <= 0.0f) {
            return vy;
        }
        long j = (long) (f * 1000000.0d);
        TimeUnit timeUnit = TimeUnit.MICROSECONDS;
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        }
        AbstractC10422uW2 abstractC10422uW2 = this.b;
        if (abstractC10422uW2 == null) {
            throw new NullPointerException("scheduler is null");
        }
        EZ ez = new EZ(j, timeUnit, abstractC10422uW2);
        if (vy == null) {
            throw new NullPointerException("next is null");
        }
        YY yy = new YY(ez, vy);
        return Looper.myLooper() == Looper.getMainLooper() ? new C10091tZ(yy, AbstractC2209Ra.a()) : yy;
    }

    public C5699gl0(InterfaceC3241Yy1 interfaceC3241Yy1, AbstractC10422uW2 abstractC10422uW2) {
        this.a = interfaceC3241Yy1;
        this.b = abstractC10422uW2;
    }

    @Override // defpackage.InterfaceC9395rX
    public final VF0 a() {
        return C6043hl0.p;
    }
}
