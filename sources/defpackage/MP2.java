package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class MP2 extends AbstractC11245wu {
    public MP2(InterfaceC8927q80 interfaceC8927q80) {
        super(interfaceC8927q80);
        if (interfaceC8927q80 != null) {
            if (!(interfaceC8927q80.getContext() == C7221lA0.a)) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    @Override // defpackage.InterfaceC8927q80
    public final E90 getContext() {
        return C7221lA0.a;
    }
}
