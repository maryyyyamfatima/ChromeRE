package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xd4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11491xd4 {
    public final C11834yd4 a;
    public final InterfaceC10805vd4 b;
    public final AbstractC2080Qa0 c;

    public C11491xd4(C11834yd4 c11834yd4, InterfaceC10805vd4 interfaceC10805vd4, AbstractC2080Qa0 abstractC2080Qa0) {
        AbstractC0087Ar1.e(c11834yd4, "store");
        AbstractC0087Ar1.e(abstractC2080Qa0, "defaultCreationExtras");
        this.a = c11834yd4;
        this.b = interfaceC10805vd4;
        this.c = abstractC2080Qa0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C11491xd4(C11834yd4 c11834yd4, InterfaceC10805vd4 interfaceC10805vd4) {
        this(c11834yd4, interfaceC10805vd4, C1950Pa0.b);
        AbstractC0087Ar1.e(c11834yd4, "store");
    }

    public final AbstractC9776sd4 a(Class cls) {
        AbstractC9776sd4 a;
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        String concat = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName);
        InterfaceC10805vd4 interfaceC10805vd4 = this.b;
        AbstractC0087Ar1.e(concat, "key");
        C11834yd4 c11834yd4 = this.a;
        AbstractC9776sd4 abstractC9776sd4 = (AbstractC9776sd4) c11834yd4.a.get(concat);
        if (cls.isInstance(abstractC9776sd4)) {
            AbstractC0087Ar1.c(abstractC9776sd4, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
        } else {
            E02 e02 = new E02(this.c);
            e02.a.put(C11148wd4.a, concat);
            try {
                a = interfaceC10805vd4.b(cls, e02);
            } catch (AbstractMethodError unused) {
                a = interfaceC10805vd4.a(cls);
            }
            abstractC9776sd4 = a;
            AbstractC9776sd4 abstractC9776sd42 = (AbstractC9776sd4) c11834yd4.a.put(concat, abstractC9776sd4);
            if (abstractC9776sd42 != null) {
                abstractC9776sd42.a();
            }
        }
        return abstractC9776sd4;
    }
}
