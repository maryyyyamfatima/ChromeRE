package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;
import j$.util.function.Supplier;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: uR0 */
/* loaded from: classes.dex */
public final class C10395uR0 implements InterfaceC9395rX {
    public final C11918yr4 a;

    @Override // defpackage.InterfaceC9395rX
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.InterfaceC9395rX
    public final VY c(Object obj, AbstractC9053qX abstractC9053qX) {
        final C11081wR0 c11081wR0 = ((C10738vR0) obj).k;
        if (c11081wR0 == null) {
            c11081wR0 = C11081wR0.p;
        }
        return A24.a(this.a.a(), abstractC9053qX, true, c11081wR0.k, c11081wR0.l, AbstractC0153Be2.a((c11081wR0.j & 4) != 0, new Supplier() { // from class: sR0
            @Override // j$.util.function.Supplier
            public final Object get() {
                CommandOuterClass$Command commandOuterClass$Command = C11081wR0.this.m;
                return commandOuterClass$Command == null ? CommandOuterClass$Command.l : commandOuterClass$Command;
            }
        }), AbstractC0153Be2.a((c11081wR0.j & 8) != 0, new Supplier() { // from class: tR0
            @Override // j$.util.function.Supplier
            public final Object get() {
                CommandOuterClass$Command commandOuterClass$Command = C11081wR0.this.n;
                return commandOuterClass$Command == null ? CommandOuterClass$Command.l : commandOuterClass$Command;
            }
        }));
    }

    public C10395uR0(C11918yr4 c11918yr4) {
        this.a = c11918yr4;
    }

    @Override // defpackage.InterfaceC9395rX
    public final VF0 a() {
        return C10738vR0.o;
    }
}
