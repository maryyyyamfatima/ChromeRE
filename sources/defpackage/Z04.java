package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;
import j$.util.function.Supplier;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Z04 implements InterfaceC9395rX {
    public final C11918yr4 a;

    @Override // defpackage.InterfaceC9395rX
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.InterfaceC9395rX
    public final VY c(Object obj, AbstractC9053qX abstractC9053qX) {
        final C3735b14 c3735b14 = ((C3391a14) obj).k;
        if (c3735b14 == null) {
            c3735b14 = C3735b14.p;
        }
        return A24.a(this.a.a(), abstractC9053qX, false, c3735b14.k, c3735b14.l, AbstractC0153Be2.a((c3735b14.j & 4) != 0, new Supplier() { // from class: X04
            @Override // j$.util.function.Supplier
            public final Object get() {
                CommandOuterClass$Command commandOuterClass$Command = C3735b14.this.m;
                return commandOuterClass$Command == null ? CommandOuterClass$Command.l : commandOuterClass$Command;
            }
        }), AbstractC0153Be2.a((c3735b14.j & 8) != 0, new Supplier() { // from class: Y04
            @Override // j$.util.function.Supplier
            public final Object get() {
                CommandOuterClass$Command commandOuterClass$Command = C3735b14.this.n;
                return commandOuterClass$Command == null ? CommandOuterClass$Command.l : commandOuterClass$Command;
            }
        }));
    }

    public Z04(C11918yr4 c11918yr4) {
        this.a = c11918yr4;
    }

    @Override // defpackage.InterfaceC9395rX
    public final VF0 a() {
        return C3391a14.o;
    }
}
