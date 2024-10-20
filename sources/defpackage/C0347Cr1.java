package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Cr1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0347Cr1 extends AbstractC9612s80 {
    public int i;
    public final /* synthetic */ AV0 j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0347Cr1(InterfaceC8927q80 interfaceC8927q80, E90 e90, AV0 av0, Object obj) {
        super(interfaceC8927q80, e90);
        this.j = av0;
        this.k = obj;
        AbstractC0087Ar1.c(interfaceC8927q80, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    @Override // defpackage.AbstractC11245wu
    public final Object g(Object obj) {
        int i = this.i;
        if (i != 0) {
            if (i == 1) {
                this.i = 2;
                SP2.b(obj);
                return obj;
            }
            throw new IllegalStateException("This coroutine had already completed".toString());
        }
        this.i = 1;
        SP2.b(obj);
        AV0 av0 = this.j;
        AbstractC0087Ar1.c(av0, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda-1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda-1>, kotlin.Any?>");
        AbstractC7693mZ3.a(av0);
        return av0.c(this.k, this);
    }
}
