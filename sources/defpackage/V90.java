package defpackage;

import java.util.Arrays;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class V90 extends AbstractC4592dY0 {
    public V90(String str, InterfaceC9989tE2 interfaceC9989tE2, C4188cM0... c4188cM0Arr) {
        super(str, interfaceC9989tE2, c4188cM0Arr);
    }

    public final void c(Object... objArr) {
        C4188cM0[] c4188cM0Arr = this.d;
        int length = c4188cM0Arr.length;
        if (this.e) {
            for (int i = 0; i < objArr.length; i++) {
                Object obj = objArr[i];
                String str = this.c;
                if (obj == null) {
                    throw new NullPointerException(IR0.a("Streamz ", str, " has null parameter: ", Arrays.toString(objArr)));
                }
                if (!c4188cM0Arr[i].b.isInstance(obj)) {
                    String valueOf = String.valueOf(obj);
                    String valueOf2 = String.valueOf(obj.getClass());
                    C4188cM0 c4188cM0 = c4188cM0Arr[i];
                    String str2 = c4188cM0.a;
                    String valueOf3 = String.valueOf(c4188cM0.b);
                    StringBuilder sb = new StringBuilder("Streamz ");
                    sb.append(str);
                    sb.append(" has parameter {index: ");
                    sb.append(i);
                    sb.append(", value: ");
                    AbstractC9972tB0.a(sb, valueOf, ", type: ", valueOf2, "}, but expected: {name: ");
                    sb.append(str2);
                    sb.append(", type: ");
                    sb.append(valueOf3);
                    sb.append("}");
                    throw new IllegalArgumentException(sb.toString());
                }
            }
        }
        Long l = 1L;
        C6230iI c6230iI = new C6230iI(objArr);
        synchronized (this.b) {
            Object obj2 = (InterfaceC9320rI) this.f.get(c6230iI);
            if (obj2 == null) {
                obj2 = new W90();
                this.f.put(c6230iI, obj2);
            }
            W90 w90 = (W90) obj2;
            w90.a = l.longValue() + w90.a;
            this.g++;
        }
        InterfaceC2131Qk1 interfaceC2131Qk1 = (InterfaceC2131Qk1) this.a.get();
        if (interfaceC2131Qk1 != null) {
            C6401in3 c6401in3 = (C6401in3) interfaceC2131Qk1;
            if (c6401in3.k) {
                if (c6401in3.i > 0 && c6401in3.l.incrementAndGet() >= c6401in3.i) {
                    synchronized (c6401in3.n) {
                        if (c6401in3.l.get() >= c6401in3.i) {
                            c6401in3.a();
                            return;
                        }
                    }
                }
                synchronized (c6401in3.n) {
                    ScheduledFuture scheduledFuture = c6401in3.m;
                    if (scheduledFuture == null || scheduledFuture.isDone() || c6401in3.m.isCancelled()) {
                        c6401in3.m = c6401in3.a.schedule(new RunnableC6058hn3(c6401in3), c6401in3.j, TimeUnit.MILLISECONDS);
                    }
                }
            }
        }
    }
}
