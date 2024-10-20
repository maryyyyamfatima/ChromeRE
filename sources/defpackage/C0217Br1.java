package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Br1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0217Br1 extends MP2 {
    public int g;
    public final /* synthetic */ AV0 h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0217Br1(Object obj, InterfaceC8927q80 interfaceC8927q80, AV0 av0) {
        super(interfaceC8927q80);
        this.h = av0;
        this.i = obj;
        AbstractC0087Ar1.c(interfaceC8927q80, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    @Override // defpackage.AbstractC11245wu
    public final Object g(Object obj) {
        int i = this.g;
        if (i != 0) {
            if (i == 1) {
                this.g = 2;
                SP2.b(obj);
                return obj;
            }
            throw new IllegalStateException("This coroutine had already completed".toString());
        }
        this.g = 1;
        SP2.b(obj);
        AV0 av0 = this.h;
        AbstractC0087Ar1.c(av0, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda-1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda-1>, kotlin.Any?>");
        AbstractC7693mZ3.a(av0);
        return av0.c(this.i, this);
    }
}
