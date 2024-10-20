package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;
import java.util.concurrent.TimeUnit;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fj3 */
/* loaded from: classes.dex */
public final class C5346fj3 implements InterfaceC9395rX {
    public final C5893hJ1 a;

    @Override // defpackage.InterfaceC9395rX
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.InterfaceC9395rX
    public final VY c(Object obj, final AbstractC9053qX abstractC9053qX) {
        final C4659dj3 c4659dj3 = (C4659dj3) obj;
        return new C6657jZ(new H4() { // from class: ej3
            @Override // defpackage.H4
            public final void run() {
                C5346fj3 c5346fj3 = C5346fj3.this;
                C4659dj3 c4659dj32 = c4659dj3;
                final AbstractC9053qX abstractC9053qX2 = abstractC9053qX;
                final C5893hJ1 c5893hJ1 = c5346fj3.a;
                String str = c4659dj32.k;
                synchronized (c5893hJ1.e) {
                    final C5549gJ1 c5549gJ1 = (C5549gJ1) c5893hJ1.a.get(str);
                    if (c5549gJ1 == null) {
                        throw new C10239ty0("Cannot start a loop that has not been registered yet");
                    }
                    C5422fw1 c5422fw1 = c5549gJ1.b;
                    if (c5422fw1 == null || c5422fw1.a()) {
                        long j = c5549gJ1.a.l * 1000.0f;
                        L92 h = X82.h(j, j, TimeUnit.MILLISECONDS, c5893hJ1.c);
                        C5422fw1 c5422fw12 = new C5422fw1(new InterfaceC11303x40() { // from class: eJ1
                            @Override // defpackage.InterfaceC11303x40
                            public final void accept(Object obj2) {
                                C5893hJ1 c5893hJ12 = C5893hJ1.this;
                                InterfaceC9738sX interfaceC9738sX = (InterfaceC9738sX) c5893hJ12.b.get();
                                CommandOuterClass$Command commandOuterClass$Command = c5549gJ1.a.m;
                                if (commandOuterClass$Command == null) {
                                    commandOuterClass$Command = CommandOuterClass$Command.l;
                                }
                                ((C10081tX) interfaceC9738sX).a(commandOuterClass$Command, abstractC9053qX2, 2).e(c5893hJ12.d).c();
                            }
                        });
                        h.a(c5422fw12);
                        c5549gJ1.b = c5422fw12;
                    }
                }
            }
        });
    }

    public C5346fj3(C5893hJ1 c5893hJ1) {
        this.a = c5893hJ1;
    }

    @Override // defpackage.InterfaceC9395rX
    public final VF0 a() {
        return C4659dj3.n;
    }
}
