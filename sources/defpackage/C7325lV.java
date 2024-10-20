package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lV */
/* loaded from: classes.dex */
public final class C7325lV implements InterfaceC9395rX {
    @Override // defpackage.InterfaceC9395rX
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.InterfaceC9395rX
    public final VY c(Object obj, AbstractC9053qX abstractC9053qX) {
        if (((C7669mV) obj) == null) {
            return new C6315iZ(new IllegalArgumentException("Invalid command parameter to CloseMenuCommandHandler.onCommand"));
        }
        if (abstractC9053qX != null) {
            ((C6241iK0) L44.c(abstractC9053qX)).b.b();
            return C5971hZ.a;
        }
        return new C6315iZ(new IllegalArgumentException("Invalid eventData parameter to CloseMenuCommandHandler.onCommand"));
    }

    @Override // defpackage.InterfaceC9395rX
    public final VF0 a() {
        return C7669mV.l;
    }
}
