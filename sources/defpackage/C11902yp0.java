package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yp0 */
/* loaded from: classes.dex */
public final class C11902yp0 implements InterfaceC9395rX {
    @Override // defpackage.InterfaceC9395rX
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.InterfaceC9395rX
    public final VY c(Object obj, AbstractC9053qX abstractC9053qX) {
        if (((C12245zp0) obj) == null) {
            return new C6315iZ(new IllegalArgumentException("Invalid command parameter to DismissDialogCommandHandler.onCommand"));
        }
        if (abstractC9053qX != null) {
            ((C6241iK0) L44.c(abstractC9053qX)).b.b();
            return C5971hZ.a;
        }
        return new C6315iZ(new IllegalArgumentException("Invalid eventData parameter to DismissDialogCommandHandler.onCommand"));
    }

    @Override // defpackage.InterfaceC9395rX
    public final VF0 a() {
        return C12245zp0.l;
    }
}
