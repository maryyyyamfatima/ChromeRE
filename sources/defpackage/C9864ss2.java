package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ss2 */
/* loaded from: classes.dex */
public final class C9864ss2 extends AbstractC4712ds3 implements AV0 {
    public int j;
    public final /* synthetic */ C10893vs2 k;
    public final /* synthetic */ String l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9864ss2(C10893vs2 c10893vs2, String str, InterfaceC8927q80 interfaceC8927q80) {
        super(interfaceC8927q80);
        this.k = c10893vs2;
        this.l = str;
    }

    @Override // defpackage.AV0
    public final Object c(Object obj, Object obj2) {
        return ((C9864ss2) e((P90) obj, (InterfaceC8927q80) obj2)).g(C8546p14.a);
    }

    @Override // defpackage.AbstractC11245wu
    public final InterfaceC8927q80 e(Object obj, InterfaceC8927q80 interfaceC8927q80) {
        return new C9864ss2(this.k, this.l, interfaceC8927q80);
    }

    @Override // defpackage.AbstractC11245wu
    public final Object g(Object obj) {
        Q90 q90 = Q90.COROUTINE_SUSPENDED;
        int i = this.j;
        if (i == 0) {
            SP2.b(obj);
            this.j = 1;
            if (C10893vs2.c(this.k, this.l, this) == q90) {
                return q90;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SP2.b(obj);
        }
        return C8546p14.a;
    }
}
