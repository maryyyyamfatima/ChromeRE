package defpackage;

import android.os.MessageQueue;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.base.ThreadUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class RT3 implements MessageQueue.IdleHandler {
    public final Class a;
    public final Method b;
    public final Method c;
    public final Method d;
    public final Method e;
    public final Method f;
    public final Class g;
    public final Method h;
    public final AtomicBoolean i = new AtomicBoolean();
    public final AtomicBoolean j = new AtomicBoolean();
    public final AtomicBoolean k = new AtomicBoolean();
    public final long l;
    public boolean m;
    public boolean n;

    public RT3(long j) {
        try {
            Class<?> cls = Class.forName("android.os.Trace");
            this.a = cls;
            Class<?> cls2 = Long.TYPE;
            this.b = cls.getMethod("isTagEnabled", cls2);
            this.c = cls.getMethod("traceBegin", cls2, String.class);
            this.d = cls.getMethod("traceEnd", cls2);
            Class<?> cls3 = Integer.TYPE;
            this.e = cls.getMethod("asyncTraceBegin", cls2, String.class, cls3);
            this.f = cls.getMethod("asyncTraceEnd", cls2, String.class, cls3);
            Class<?> cls4 = Class.forName("android.os.SystemProperties");
            this.g = cls4;
            this.h = cls4.getMethod("get", String.class);
        } catch (Exception e) {
            AbstractC4851eH1.f("ATrace", "Reflection error", e);
            this.b = null;
        }
        this.l = j;
        b();
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.RT3.b():void");
    }

    public final void a() {
        this.i.set(true);
        this.k.set(false);
        if (this.j.get()) {
            ThreadUtils.d(new Runnable() { // from class: QT3
                @Override // java.lang.Runnable
                public final void run() {
                    RT3.this.b();
                }
            });
        }
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        b();
        return true;
    }
}
