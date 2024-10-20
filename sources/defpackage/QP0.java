package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class QP0 {
    public final FutureTask a;

    public QP0(final TF0 tf0, final AbstractC9896sy0 abstractC9896sy0, final U80 u80) {
        this.a = new FutureTask(new Callable() { // from class: PP0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                EnumC11438xU enumC11438xU = EnumC11438xU.y;
                TF0 tf02 = TF0.this;
                int k = tf02.k();
                AbstractC9896sy0 abstractC9896sy02 = abstractC9896sy0;
                if (k != 2) {
                    abstractC9896sy02.d(EnumC11438xU.A, AbstractC4809e90.a("Command extension: invalid format: ", RP0.a(tf02)), u80, null);
                    return CommandOuterClass$Command.l;
                }
                if (tf02.j() == 0) {
                    abstractC9896sy02.a(EnumC11438xU.v, "Command extension: invalid identifier: " + RP0.a(tf02));
                    return CommandOuterClass$Command.l;
                }
                int i = tf02.i();
                byte[] bArr = new byte[i];
                if (tf02.i() > 0) {
                    tf02.f(6).get(bArr);
                }
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    boolean z = KV.b;
                    JV jv = new JV(4096, byteArrayOutputStream);
                    jv.O(tf02.j(), 2);
                    jv.z(bArr, i);
                    jv.Z();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    XF0 d = XF0.d();
                    CommandOuterClass$Command commandOuterClass$Command = CommandOuterClass$Command.l;
                    int length = byteArray.length;
                    CommandOuterClass$Command commandOuterClass$Command2 = CommandOuterClass$Command.l;
                    CommandOuterClass$Command commandOuterClass$Command3 = new CommandOuterClass$Command();
                    try {
                        C7931nE2 c7931nE2 = C7931nE2.c;
                        c7931nE2.getClass();
                        QW2 b = c7931nE2.b(commandOuterClass$Command3.getClass());
                        b.f(commandOuterClass$Command3, byteArray, 0, length + 0, new C2254Rj(d));
                        b.b(commandOuterClass$Command3);
                        if (commandOuterClass$Command3.a != 0) {
                            throw new RuntimeException();
                        }
                        QX0.i(commandOuterClass$Command3);
                        return commandOuterClass$Command3;
                    } catch (C1127Ir1 e) {
                        if (e.g) {
                            throw new C1127Ir1(e);
                        }
                        throw e;
                    } catch (IOException e2) {
                        if (e2.getCause() instanceof C1127Ir1) {
                            throw ((C1127Ir1) e2.getCause());
                        }
                        throw new C1127Ir1(e2);
                    } catch (IndexOutOfBoundsException unused) {
                        throw C1127Ir1.h();
                    } catch (C6827k14 e3) {
                        throw e3.a();
                    }
                } catch (C1127Ir1 unused2) {
                    abstractC9896sy02.a(enumC11438xU, "Command extension: invalid data: " + RP0.a(tf02));
                    return CommandOuterClass$Command.l;
                } catch (IOException unused3) {
                    abstractC9896sy02.a(enumC11438xU, "Error wrapping Command extension: " + RP0.a(tf02));
                    return CommandOuterClass$Command.l;
                }
            }
        });
    }

    public final CommandOuterClass$Command a() {
        FutureTask futureTask = this.a;
        futureTask.run();
        try {
            return (CommandOuterClass$Command) futureTask.get();
        } catch (InterruptedException e) {
            throw new C10239ty0("CommandFuture interrupted", e);
        } catch (ExecutionException e2) {
            throw new C10239ty0("CommandFuture failed", e2);
        }
    }
}
