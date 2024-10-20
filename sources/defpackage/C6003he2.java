package defpackage;

import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: he2 */
/* loaded from: classes.dex */
public final class C6003he2 implements InterfaceC9395rX {
    public final InterfaceC3241Yy1 a;
    public final AbstractC10422uW2 b;

    @Override // defpackage.InterfaceC9395rX
    public final /* synthetic */ void b() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [ge2] */
    @Override // defpackage.InterfaceC9395rX
    public final VY c(Object obj, final AbstractC9053qX abstractC9053qX) {
        X82 hz;
        final C6347ie2 c6347ie2 = (C6347ie2) obj;
        InterfaceC9738sX interfaceC9738sX = (InterfaceC9738sX) this.a.get();
        if ((c6347ie2.j & 1) != 0) {
            CommandOuterClass$Command commandOuterClass$Command = c6347ie2.k;
            if (commandOuterClass$Command == null) {
                commandOuterClass$Command = CommandOuterClass$Command.l;
            }
            ((C10081tX) interfaceC9738sX).a(commandOuterClass$Command, abstractC9053qX, 2).c();
        }
        if (!((c6347ie2.j & 2) != 0)) {
            return C5971hZ.a;
        }
        CommandOuterClass$Command commandOuterClass$Command2 = c6347ie2.l;
        if (commandOuterClass$Command2 == null) {
            commandOuterClass$Command2 = CommandOuterClass$Command.l;
        }
        final C10081tX c10081tX = (C10081tX) interfaceC9738sX;
        CZ e = c10081tX.a(commandOuterClass$Command2, abstractC9053qX, 1).e(this.b);
        if (e instanceof UV0) {
            hz = ((UV0) e).a();
        } else {
            hz = new HZ(e);
        }
        hz.getClass();
        return new B92(new Q92(hz), new DV0() { // from class: ge2
            @Override // defpackage.DV0
            public final Object apply(Object obj2) {
                boolean z = ((C5137f62) obj2).a == null;
                C5971hZ c5971hZ = C5971hZ.a;
                C6347ie2 c6347ie22 = C6347ie2.this;
                InterfaceC9738sX interfaceC9738sX2 = c10081tX;
                AbstractC9053qX abstractC9053qX2 = abstractC9053qX;
                if (z) {
                    if (!((c6347ie22.j & 4) != 0)) {
                        return c5971hZ;
                    }
                    CommandOuterClass$Command commandOuterClass$Command3 = c6347ie22.m;
                    if (commandOuterClass$Command3 == null) {
                        commandOuterClass$Command3 = CommandOuterClass$Command.l;
                    }
                    return ((C10081tX) interfaceC9738sX2).a(commandOuterClass$Command3, abstractC9053qX2, 1);
                }
                if (!((c6347ie22.j & 8) != 0)) {
                    return c5971hZ;
                }
                CommandOuterClass$Command commandOuterClass$Command4 = c6347ie22.n;
                if (commandOuterClass$Command4 == null) {
                    commandOuterClass$Command4 = CommandOuterClass$Command.l;
                }
                return ((C10081tX) interfaceC9738sX2).a(commandOuterClass$Command4, abstractC9053qX2, 1);
            }
        });
    }

    public C6003he2(InterfaceC3241Yy1 interfaceC3241Yy1, AbstractC10422uW2 abstractC10422uW2) {
        this.a = interfaceC3241Yy1;
        this.b = abstractC10422uW2;
    }

    @Override // defpackage.InterfaceC9395rX
    public final VF0 a() {
        return C6347ie2.r;
    }
}
