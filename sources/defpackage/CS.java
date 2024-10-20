package defpackage;

import j$.util.Optional;
import j$.util.function.Function;
import j$.util.function.Predicate;
import java.io.IOException;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class CS {
    public static final C6492j31 c = C6492j31.k("com/google/chrome/elements/loggingsignals/ClankLoggingParameters");
    public final C2404Sn a;
    public final Optional b;

    public static CS a(Map map) {
        Object obj;
        if (map != null && (obj = map.get("LoggingParameters")) != null) {
            return new CS(Optional.of((C7954nJ0) obj));
        }
        return new CS(Optional.empty());
    }

    public CS(Optional optional) {
        this.b = optional;
        if (optional.isPresent()) {
            C7954nJ0 c7954nJ0 = (C7954nJ0) optional.get();
            this.a = new C2404Sn(c7954nJ0.b, c7954nJ0.a, c7954nJ0.c, c7954nJ0.d, Optional.ofNullable(c7954nJ0.e).filter(new Predicate() { // from class: AS
                @Override // j$.util.function.Predicate
                public final /* synthetic */ Predicate and(Predicate predicate) {
                    return Predicate.CC.$default$and(this, predicate);
                }

                @Override // j$.util.function.Predicate
                public final /* synthetic */ Predicate negate() {
                    return Predicate.CC.$default$negate(this);
                }

                @Override // j$.util.function.Predicate
                public final /* synthetic */ Predicate or(Predicate predicate) {
                    return Predicate.CC.$default$or(this, predicate);
                }

                @Override // j$.util.function.Predicate
                public final boolean test(Object obj) {
                    return ((byte[]) obj).length > 0;
                }
            }).flatMap(new Function() { // from class: BS
                @Override // j$.util.function.Function
                public final /* synthetic */ Function andThen(Function function) {
                    return Function.CC.$default$andThen(this, function);
                }

                @Override // j$.util.function.Function
                public final /* synthetic */ Function compose(Function function) {
                    return Function.CC.$default$compose(this, function);
                }

                @Override // j$.util.function.Function
                public final Object apply(Object obj) {
                    byte[] bArr = (byte[]) obj;
                    try {
                        XF0 d = XF0.d();
                        VD0 vd0 = VD0.o;
                        int length = bArr.length;
                        VD0 vd02 = new VD0();
                        try {
                            C7931nE2 c7931nE2 = C7931nE2.c;
                            c7931nE2.getClass();
                            QW2 b = c7931nE2.b(vd02.getClass());
                            b.f(vd02, bArr, 0, length + 0, new C2254Rj(d));
                            b.b(vd02);
                            if (vd02.a != 0) {
                                throw new RuntimeException();
                            }
                            QX0.i(vd02);
                            return Optional.of(vd02);
                        } catch (C1127Ir1 e) {
                            if (e.g) {
                                throw new C1127Ir1(e);
                            }
                            throw e;
                        } catch (IOException e2) {
                            if (e2.getCause() instanceof C1127Ir1) {
                                throw ((C1127Ir1) e2.getCause());
                            }
                            throw new C1127Ir1(e2);
                        } catch (IndexOutOfBoundsException unused) {
                            throw C1127Ir1.h();
                        } catch (C6827k14 e3) {
                            throw e3.a();
                        }
                    } catch (C1127Ir1 | C6827k14 e4) {
                        ((InterfaceC5462g31) ((InterfaceC5462g31) CS.c.d().f(e4)).g("com/google/chrome/elements/loggingsignals/ClankLoggingParameters", 142, "lambda$nullableBytesToMessage$1", "ClankLoggingParameters.java")).h("Failed to parse logging parameters");
                        return Optional.empty();
                    }
                }
            }));
            return;
        }
        this.a = new C2404Sn("", "", false, false, Optional.empty());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CS)) {
            return false;
        }
        return this.a.equals(((CS) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
